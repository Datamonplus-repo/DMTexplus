package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lconti_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1939BarArtTin = (short)(GXutil.lval( httpContext.GetPar( "BarArtTin"))) ;
         n1939BarArtTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1939BarArtTin), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A1939BarArtTin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3651BarTipDef = (short)(GXutil.lval( httpContext.GetPar( "BarTipDef"))) ;
         n3651BarTipDef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3651BarTipDef), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A3651BarTipDef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3652BarIntens = (byte)(GXutil.lval( httpContext.GetPar( "BarIntens"))) ;
         n3652BarIntens = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3652BarIntens), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A3652BarIntens) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6431BarCausa = (short)(GXutil.lval( httpContext.GetPar( "BarCausa"))) ;
         n6431BarCausa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6431BarCausa), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A6431BarCausa) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1936BarSerTin = httpContext.GetPar( "BarSerTin") ;
         n1936BarSerTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1936BarSerTin", A1936BarSerTin);
         A1940BarColNoT = httpContext.GetPar( "BarColNoT") ;
         n1940BarColNoT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1940BarColNoT", A1940BarColNoT);
         A1941BarColNuT = (int)(GXutil.lval( httpContext.GetPar( "BarColNuT"))) ;
         n1941BarColNuT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1941BarColNuT), 6, 0));
         A1942BarTipCoT = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCoT"))) ;
         n1942BarTipCoT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1942BarTipCoT), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A252CliCod, A1936BarSerTin, A1940BarColNoT, A1941BarColNuT, A1942BarTipCoT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = (short)(GXutil.lval( httpContext.GetPar( "EstTinAny"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = (byte)(GXutil.lval( httpContext.GetPar( "EstTinMes"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = (byte)(GXutil.lval( httpContext.GetPar( "EstTinDia"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A3646EstTinAny, A3647EstTinMes, A3648EstTinDia) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LCONTI", ""), (short)(0)) ;
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

   public lconti_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lconti_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lconti_impl.class ));
   }

   public lconti_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "LCONTI", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LCONTI.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LCONTI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinAny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinAny_Internalname, httpContext.getMessage( "Año", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinAny_Internalname, GXutil.ltrim( localUtil.ntoc( A3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3646EstTinAny), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3646EstTinAny), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinAny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinAny_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinMes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinMes_Internalname, httpContext.getMessage( "Mes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinMes_Internalname, GXutil.ltrim( localUtil.ntoc( A3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinMes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3647EstTinMes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3647EstTinMes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinMes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinMes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinDia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinDia_Internalname, httpContext.getMessage( "Dia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinDia_Internalname, GXutil.ltrim( localUtil.ntoc( A3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinDia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3648EstTinDia), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3648EstTinDia), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinDia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinDia_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstTinNr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstTinNr_Internalname, httpContext.getMessage( "Numero Linea,Secuencial", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTinNr_Internalname, GXutil.ltrim( localUtil.ntoc( A1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTinNr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1929EstTinNr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTinNr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstTinNr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarnhdr_lc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarnhdr_lc_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarnhdr_lc_Internalname, GXutil.rtrim( A13841Barnhdr_lc), GXutil.rtrim( localUtil.format( A13841Barnhdr_lc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarnhdr_lc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarnhdr_lc_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodTin_Internalname, httpContext.getMessage( "Codigo Hoja Ruta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1933BarCodTin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1933BarCodTin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodTin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarReoTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarReoTin_Internalname, httpContext.getMessage( "Codigo Reoperado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarReoTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarReoTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1934BarReoTin), "9") : localUtil.format( DecimalUtil.doubleToDec(A1934BarReoTin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarReoTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarReoTin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarParTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarParTin_Internalname, httpContext.getMessage( "Codigo Particion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarParTin_Internalname, GXutil.rtrim( A1935BarParTin), GXutil.rtrim( localUtil.format( A1935BarParTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarParTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarParTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSerTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSerTin_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerTin_Internalname, GXutil.rtrim( A1936BarSerTin), GXutil.rtrim( localUtil.format( A1936BarSerTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSerTin_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarDscTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarDscTin_Internalname, httpContext.getMessage( "Descripcion Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDscTin_Internalname, GXutil.rtrim( A1937BarDscTin), GXutil.rtrim( localUtil.format( A1937BarDscTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDscTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarDscTin_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarArtTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarArtTin_Internalname, httpContext.getMessage( "Codigo Tipo ARticulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarArtTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarArtTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1939BarArtTin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1939BarArtTin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarArtTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarArtTin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarArtTinD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarArtTinD_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarArtTinD_Internalname, GXutil.rtrim( A13962BarArtTinD), GXutil.rtrim( localUtil.format( A13962BarArtTinD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarArtTinD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarArtTinD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNoT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNoT_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNoT_Internalname, GXutil.rtrim( A1940BarColNoT), GXutil.rtrim( localUtil.format( A1940BarColNoT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNoT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNoT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNuT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNuT_Internalname, httpContext.getMessage( "Numero Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNuT_Internalname, GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNuT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1941BarColNuT), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1941BarColNuT), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNuT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNuT_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCoT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCoT_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCoT_Internalname, GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCoT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1942BarTipCoT), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1942BarTipCoT), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCoT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipCoT_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCoTD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCoTD_Internalname, httpContext.getMessage( "Tipo colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCoTD_Internalname, GXutil.rtrim( A13963BarTipCoTD), GXutil.rtrim( localUtil.format( A13963BarTipCoTD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCoTD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipCoTD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNomClT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNomClT_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomClT_Internalname, GXutil.rtrim( A1943BarNomClT), GXutil.rtrim( localUtil.format( A1943BarNomClT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomClT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNomClT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumClT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumClT_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumClT_Internalname, GXutil.ltrim( localUtil.ntoc( A1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumClT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1944BarNumClT), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1944BarNumClT), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumClT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumClT_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMaqTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMaqTin_Internalname, httpContext.getMessage( "Codigo Maquina Tinte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqTin_Internalname, GXutil.rtrim( A1945BarMaqTin), GXutil.rtrim( localUtil.format( A1945BarMaqTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMaqTin_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarVolTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarVolTin_Internalname, httpContext.getMessage( "Volumen Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarVolTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarVolTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1946BarVolTin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1946BarVolTin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarVolTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarVolTin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgmTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKgmTin_Internalname, httpContext.getMessage( "KIlos Tintados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgmTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgmTin_Enabled!=0) ? localUtil.format( A1947BarKgmTin, "ZZZZZ9.99") : localUtil.format( A1947BarKgmTin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgmTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarKgmTin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMtrTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMtrTin_Internalname, httpContext.getMessage( "Metros Tintados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtrTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtrTin_Enabled!=0) ? localUtil.format( A1948BarMtrTin, "ZZZZZ9.99") : localUtil.format( A1948BarMtrTin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtrTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMtrTin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPieTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPieTin_Internalname, httpContext.getMessage( "Piezas Tintadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieTin_Internalname, GXutil.ltrim( localUtil.ntoc( A1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1949BarPieTin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1949BarPieTin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPieTin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEstTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarEstTin_Internalname, httpContext.getMessage( "0=Normal,1=RI,2=RE", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEstTin_Internalname, GXutil.ltrim( localUtil.ntoc( A2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarEstTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2304BarEstTin), "9") : localUtil.format( DecimalUtil.doubleToDec(A2304BarEstTin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEstTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarEstTin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrLot_Internalname, httpContext.getMessage( "Hdr mas pequeña,Agrupaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrLot_Internalname, GXutil.rtrim( A2316BarAgrLot), GXutil.rtrim( localUtil.format( A2316BarAgrLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrLot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAgrLot_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumAna_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumAna_Internalname, httpContext.getMessage( "Numero añadidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumAna_Internalname, GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumAna_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3650BarNumAna), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3650BarNumAna), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumAna_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumAna_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipDef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipDef_Internalname, httpContext.getMessage( "Tipo Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDef_Internalname, GXutil.ltrim( localUtil.ntoc( A3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipDef_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3651BarTipDef), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3651BarTipDef), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipDef_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipDefD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipDefD_Internalname, httpContext.getMessage( "Tipo Defecto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDefD_Internalname, GXutil.rtrim( A13964BarTipDefD), GXutil.rtrim( localUtil.format( A13964BarTipDefD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDefD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipDefD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarIntens_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarIntens_Internalname, httpContext.getMessage( "Intensidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarIntens_Internalname, GXutil.ltrim( localUtil.ntoc( A3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarIntens_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3652BarIntens), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3652BarIntens), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarIntens_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarIntens_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarIntDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarIntDsc_Internalname, httpContext.getMessage( "Intendidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarIntDsc_Internalname, GXutil.rtrim( A13965BarIntDsc), GXutil.rtrim( localUtil.format( A13965BarIntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarIntDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPriCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPriCod_Internalname, httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPriCod_Internalname, GXutil.rtrim( A3653BarPriCod), GXutil.rtrim( localUtil.format( A3653BarPriCod, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPriCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPriCod_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosPD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosPD_Internalname, httpContext.getMessage( "Coste Prod. Drogas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosPD_Internalname, GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosPD_Enabled!=0) ? localUtil.format( A3654BarCosPD, "ZZZZZZ9.99") : localUtil.format( A3654BarCosPD, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosPD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosPD_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosPA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosPA_Internalname, httpContext.getMessage( "Coste Prod. Aux.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosPA_Internalname, GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosPA_Enabled!=0) ? localUtil.format( A3658BarCosPA, "ZZZZZZ9.99") : localUtil.format( A3658BarCosPA, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosPA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosPA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosAD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosAD_Internalname, httpContext.getMessage( "Coste  Anyad.Drogas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosAD_Internalname, GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosAD_Enabled!=0) ? localUtil.format( A3656BarCosAD, "ZZZZZZ9.99") : localUtil.format( A3656BarCosAD, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosAD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosAD_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosAA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosAA_Internalname, httpContext.getMessage( "Coste Anyad Aux.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosAA_Internalname, GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosAA_Enabled!=0) ? localUtil.format( A3657BarCosAA, "ZZZZZZ9.99") : localUtil.format( A3657BarCosAA, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosAA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosAA_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosCol_Internalname, httpContext.getMessage( "Coste Colorantes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosCol_Enabled!=0) ? localUtil.format( A3705BarCosCol, "ZZZZZZ9.99") : localUtil.format( A3705BarCosCol, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosCol_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosAnc_Internalname, httpContext.getMessage( "Coste Añadidas Colorantes", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosAnc_Enabled!=0) ? localUtil.format( A3706BarCosAnc, "ZZZZZZ9.99") : localUtil.format( A3706BarCosAnc, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosAnc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumActx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumActx_Internalname, httpContext.getMessage( "Numero Linea Receta,RecLinMaq", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumActx_Internalname, GXutil.ltrim( localUtil.ntoc( A4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumActx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4923BarNumActx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4923BarNumActx), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumActx_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumActx_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumPda_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumPda_Internalname, httpContext.getMessage( "Numero Partida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumPda_Internalname, GXutil.ltrim( localUtil.ntoc( A4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumPda_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4924BarNumPda), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4924BarNumPda), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumPda_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumPda_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarFaseCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarFaseCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFaseCod_Internalname, GXutil.rtrim( A4925BarFaseCod), GXutil.rtrim( localUtil.format( A4925BarFaseCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFaseCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarFaseCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarFaseOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarFaseOrd_Internalname, httpContext.getMessage( "Orden Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFaseOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarFaseOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4926BarFaseOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4926BarFaseOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFaseOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarFaseOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarReoNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarReoNum_Internalname, httpContext.getMessage( "Numero Veces cerrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarReoNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarReoNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4977BarReoNum), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4977BarReoNum), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarReoNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarReoNum_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipDTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipDTin_Internalname, httpContext.getMessage( "Tipo de Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDTin_Internalname, GXutil.rtrim( A5169BarTipDTin), GXutil.rtrim( localUtil.format( A5169BarTipDTin, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipDTin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCTin_Internalname, httpContext.getMessage( "Color Nuevo o Repeticion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCTin_Internalname, GXutil.rtrim( A5170BarTipCTin), GXutil.rtrim( localUtil.format( A5170BarTipCTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipCTin_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipNTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipNTin_Internalname, httpContext.getMessage( "Tipo de No conformidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipNTin_Internalname, GXutil.rtrim( A5171BarTipNTin), GXutil.rtrim( localUtil.format( A5171BarTipNTin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipNTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipNTin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCosttTi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCosttTi_Internalname, httpContext.getMessage( "Coste Teorico Tinte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCosttTi_Internalname, GXutil.ltrim( localUtil.ntoc( A5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCosttTi_Enabled!=0) ? localUtil.format( A5899BarCosttTi, "ZZZZ9.99999") : localUtil.format( A5899BarCosttTi, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCosttTi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCosttTi_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarRbTeo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarRbTeo_Internalname, httpContext.getMessage( "Relacion Baño Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarRbTeo_Internalname, GXutil.ltrim( localUtil.ntoc( A5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarRbTeo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5900BarRbTeo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5900BarRbTeo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRbTeo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarRbTeo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumTin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumTin_Internalname, httpContext.getMessage( "Numero de tintada interna", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumTin_Internalname, GXutil.ltrim( localUtil.ntoc( A6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumTin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6177BarNumTin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6177BarNumTin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumTin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumTin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCausa_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCausa_Internalname, httpContext.getMessage( "Causa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCausa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6431BarCausa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6431BarCausa), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCausa_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCausa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCauDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCauDsc_Internalname, httpContext.getMessage( "Causa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCauDsc_Internalname, GXutil.rtrim( A13966BarCauDsc), GXutil.rtrim( localUtil.format( A13966BarCauDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCauDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCauDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarRecAcb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarRecAcb_Internalname, httpContext.getMessage( "Receta Acabado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarRecAcb_Internalname, GXutil.rtrim( A6634BarRecAcb), GXutil.rtrim( localUtil.format( A6634BarRecAcb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarRecAcb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarRecAcb_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgsTt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKgsTt_Internalname, httpContext.getMessage( "Total Kgs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgsTt_Internalname, GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgsTt_Enabled!=0) ? localUtil.format( A8563BarKgsTt, "ZZZZZZ9.99") : localUtil.format( A8563BarKgsTt, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgsTt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarKgsTt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFamCodT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFamCodT_Internalname, httpContext.getMessage( "Familia Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFamCodT_Internalname, GXutil.ltrim( localUtil.ntoc( A8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFamCodT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8584FamCodT), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8584FamCodT), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFamCodT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFamCodT_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarForNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarForNum_Internalname, httpContext.getMessage( "Nº Interno Formula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarForNum_Internalname, GXutil.ltrim( localUtil.ntoc( A8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarForNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8609BarForNum), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8609BarForNum), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarForNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarForNum_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNTint_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNTint_Internalname, httpContext.getMessage( "Numero de Tinta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNTint_Internalname, GXutil.ltrim( localUtil.ntoc( A9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNTint_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9754BarNTint), "9") : localUtil.format( DecimalUtil.doubleToDec(A9754BarNTint), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,319);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNTint_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNTint_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAcs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAcs_Internalname, httpContext.getMessage( "Acs", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcs_Internalname, GXutil.rtrim( A10539BarAcs), GXutil.rtrim( localUtil.format( A10539BarAcs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,324);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAcs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNprg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNprg_Internalname, httpContext.getMessage( "NPrograma", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNprg_Internalname, GXutil.rtrim( A10540BarNprg), GXutil.rtrim( localUtil.format( A10540BarNprg, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,329);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNprg_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNprg_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarLts_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarLts_Internalname, httpContext.getMessage( "Lts H2O Totales", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarLts_Internalname, GXutil.ltrim( localUtil.ntoc( A10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarLts_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10541BarLts), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10541BarLts), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,334);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarLts_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarLts_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarLtsV_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarLtsV_Internalname, httpContext.getMessage( "Valor H2O", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 339,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarLtsV_Internalname, GXutil.ltrim( localUtil.ntoc( A10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarLtsV_Enabled!=0) ? localUtil.format( A10546BarLtsV, "ZZZZZZ9.99") : localUtil.format( A10546BarLtsV, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,339);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarLtsV_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarLtsV_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarFecIt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarFecIt_Internalname, httpContext.getMessage( "Inicio Tinte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecIt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecIt_Internalname, localUtil.ttoc( A11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11177BarFecIt, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,344);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecIt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarFecIt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecIt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecIt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LCONTI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarFecFt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarFecFt_Internalname, httpContext.getMessage( "Fin Tinte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBarFecFt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecFt_Internalname, localUtil.ttoc( A11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11178BarFecFt, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,349);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecFt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarFecFt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecFt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecFt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LCONTI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNm_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNm_Internalname, GXutil.rtrim( A11179BarColNm), GXutil.rtrim( localUtil.format( A11179BarColNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,354);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNm_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarDispCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarDispCli_Internalname, httpContext.getMessage( "Disp Cli", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDispCli_Internalname, GXutil.rtrim( A11762BarDispCli), GXutil.rtrim( localUtil.format( A11762BarDispCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDispCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarDispCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMtsTt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMtsTt_Internalname, httpContext.getMessage( "Total Mts", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMtsTt_Internalname, GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMtsTt_Enabled!=0) ? localUtil.format( A12993BarMtsTt, "ZZZZZZ9.99") : localUtil.format( A12993BarMtsTt, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,364);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMtsTt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMtsTt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstFecCier_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstFecCier_Internalname, httpContext.getMessage( "Cierre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 369,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEstFecCier_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstFecCier_Internalname, localUtil.format(A13759EstFecCier, "99/99/99"), localUtil.format( A13759EstFecCier, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,369);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstFecCier_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstFecCier_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEstFecCier_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEstFecCier_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LCONTI.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstCdn1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstCdn1_Internalname, "1", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 374,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCdn1_Internalname, GXutil.ltrim( localUtil.ntoc( A13760EstCdn1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCdn1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13760EstCdn1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13760EstCdn1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,374);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCdn1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstCdn1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstCdn2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstCdn2_Internalname, "2", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 379,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCdn2_Internalname, GXutil.rtrim( A13761EstCdn2), GXutil.rtrim( localUtil.format( A13761EstCdn2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,379);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCdn2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstCdn2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstCtw_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstCtw_Internalname, httpContext.getMessage( "to wear", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 384,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCtw_Internalname, GXutil.rtrim( A13762EstCtw), GXutil.rtrim( localUtil.format( A13762EstCtw, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,384);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCtw_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstCtw_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumEny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumEny_Internalname, httpContext.getMessage( "Ensayo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumEny_Internalname, GXutil.ltrim( localUtil.ntoc( A13967BarNumEny, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumEny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13967BarNumEny), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13967BarNumEny), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumEny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumEny_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumtint_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumtint_Internalname, httpContext.getMessage( "Tintada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumtint_Internalname, GXutil.ltrim( localUtil.ntoc( A13975BarNumtint, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumtint_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13975BarNumtint), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13975BarNumtint), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumtint_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumtint_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCosteInici_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCosteInici_Internalname, httpContext.getMessage( "Inicial", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCosteInici_Internalname, GXutil.ltrim( localUtil.ntoc( A14199CosteInici, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCosteInici_Enabled!=0) ? localUtil.format( A14199CosteInici, "ZZZZZZ9.99") : localUtil.format( A14199CosteInici, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosteInici_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCosteInici_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols2( ) ;
   }

   public void drawcontrols2( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCosteAnyad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCosteAnyad_Internalname, httpContext.getMessage( "Anyadidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCosteAnyad_Internalname, GXutil.ltrim( localUtil.ntoc( A14200CosteAnyad, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCosteAnyad_Enabled!=0) ? localUtil.format( A14200CosteAnyad, "ZZZZZZ9.99") : localUtil.format( A14200CosteAnyad, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCosteAnyad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCosteAnyad_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LCONTI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 409,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 411,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 413,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LCONTI.htm");
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
         Z3646EstTinAny = (short)(localUtil.ctol( httpContext.cgiGet( "Z3646EstTinAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3647EstTinMes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3647EstTinMes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3648EstTinDia = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3648EstTinDia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( "Z1929EstTinNr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1933BarCodTin = (int)(localUtil.ctol( httpContext.cgiGet( "Z1933BarCodTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1934BarReoTin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1934BarReoTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1935BarParTin = httpContext.cgiGet( "Z1935BarParTin") ;
         Z1936BarSerTin = httpContext.cgiGet( "Z1936BarSerTin") ;
         Z1937BarDscTin = httpContext.cgiGet( "Z1937BarDscTin") ;
         Z1939BarArtTin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1939BarArtTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1940BarColNoT = httpContext.cgiGet( "Z1940BarColNoT") ;
         Z1941BarColNuT = (int)(localUtil.ctol( httpContext.cgiGet( "Z1941BarColNuT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1942BarTipCoT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1942BarTipCoT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1943BarNomClT = httpContext.cgiGet( "Z1943BarNomClT") ;
         Z1944BarNumClT = (int)(localUtil.ctol( httpContext.cgiGet( "Z1944BarNumClT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1945BarMaqTin = httpContext.cgiGet( "Z1945BarMaqTin") ;
         Z1946BarVolTin = (int)(localUtil.ctol( httpContext.cgiGet( "Z1946BarVolTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1947BarKgmTin = localUtil.ctond( httpContext.cgiGet( "Z1947BarKgmTin")) ;
         Z1948BarMtrTin = localUtil.ctond( httpContext.cgiGet( "Z1948BarMtrTin")) ;
         Z1949BarPieTin = (int)(localUtil.ctol( httpContext.cgiGet( "Z1949BarPieTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2304BarEstTin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2304BarEstTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2316BarAgrLot = httpContext.cgiGet( "Z2316BarAgrLot") ;
         Z3650BarNumAna = (short)(localUtil.ctol( httpContext.cgiGet( "Z3650BarNumAna"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3651BarTipDef = (short)(localUtil.ctol( httpContext.cgiGet( "Z3651BarTipDef"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3652BarIntens = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3652BarIntens"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3653BarPriCod = httpContext.cgiGet( "Z3653BarPriCod") ;
         Z3654BarCosPD = localUtil.ctond( httpContext.cgiGet( "Z3654BarCosPD")) ;
         Z3658BarCosPA = localUtil.ctond( httpContext.cgiGet( "Z3658BarCosPA")) ;
         Z3656BarCosAD = localUtil.ctond( httpContext.cgiGet( "Z3656BarCosAD")) ;
         Z3657BarCosAA = localUtil.ctond( httpContext.cgiGet( "Z3657BarCosAA")) ;
         Z3705BarCosCol = localUtil.ctond( httpContext.cgiGet( "Z3705BarCosCol")) ;
         Z3706BarCosAnc = localUtil.ctond( httpContext.cgiGet( "Z3706BarCosAnc")) ;
         Z4923BarNumActx = (short)(localUtil.ctol( httpContext.cgiGet( "Z4923BarNumActx"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4924BarNumPda = (int)(localUtil.ctol( httpContext.cgiGet( "Z4924BarNumPda"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4925BarFaseCod = httpContext.cgiGet( "Z4925BarFaseCod") ;
         Z4926BarFaseOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z4926BarFaseOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4977BarReoNum = (short)(localUtil.ctol( httpContext.cgiGet( "Z4977BarReoNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5169BarTipDTin = httpContext.cgiGet( "Z5169BarTipDTin") ;
         Z5170BarTipCTin = httpContext.cgiGet( "Z5170BarTipCTin") ;
         Z5171BarTipNTin = httpContext.cgiGet( "Z5171BarTipNTin") ;
         Z5899BarCosttTi = localUtil.ctond( httpContext.cgiGet( "Z5899BarCosttTi")) ;
         Z5900BarRbTeo = (short)(localUtil.ctol( httpContext.cgiGet( "Z5900BarRbTeo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6177BarNumTin = (int)(localUtil.ctol( httpContext.cgiGet( "Z6177BarNumTin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6431BarCausa = (short)(localUtil.ctol( httpContext.cgiGet( "Z6431BarCausa"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6634BarRecAcb = httpContext.cgiGet( "Z6634BarRecAcb") ;
         Z8563BarKgsTt = localUtil.ctond( httpContext.cgiGet( "Z8563BarKgsTt")) ;
         Z8584FamCodT = (short)(localUtil.ctol( httpContext.cgiGet( "Z8584FamCodT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8609BarForNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z8609BarForNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9754BarNTint = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9754BarNTint"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10539BarAcs = httpContext.cgiGet( "Z10539BarAcs") ;
         Z10540BarNprg = httpContext.cgiGet( "Z10540BarNprg") ;
         Z10541BarLts = (int)(localUtil.ctol( httpContext.cgiGet( "Z10541BarLts"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10546BarLtsV = localUtil.ctond( httpContext.cgiGet( "Z10546BarLtsV")) ;
         Z11177BarFecIt = localUtil.ctot( httpContext.cgiGet( "Z11177BarFecIt"), 0) ;
         Z11178BarFecFt = localUtil.ctot( httpContext.cgiGet( "Z11178BarFecFt"), 0) ;
         Z11179BarColNm = httpContext.cgiGet( "Z11179BarColNm") ;
         Z11762BarDispCli = httpContext.cgiGet( "Z11762BarDispCli") ;
         Z12993BarMtsTt = localUtil.ctond( httpContext.cgiGet( "Z12993BarMtsTt")) ;
         Z13759EstFecCier = localUtil.ctod( httpContext.cgiGet( "Z13759EstFecCier"), 0) ;
         Z13760EstCdn1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z13760EstCdn1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13761EstCdn2 = httpContext.cgiGet( "Z13761EstCdn2") ;
         Z13762EstCtw = httpContext.cgiGet( "Z13762EstCtw") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "TIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINANY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3646EstTinAny = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         }
         else
         {
            A3646EstTinAny = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINMES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinMes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3647EstTinMes = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         }
         else
         {
            A3647EstTinMes = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstTinMes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINDIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinDia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3648EstTinDia = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         }
         else
         {
            A3648EstTinDia = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstTinDia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTINNR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTinNr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1929EstTinNr = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         }
         else
         {
            A1929EstTinNr = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTinNr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A252CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         else
         {
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         }
         A13841Barnhdr_lc = httpContext.cgiGet( edtBarnhdr_lc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1933BarCodTin = 0 ;
            n1933BarCodTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1933BarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1933BarCodTin), 8, 0));
         }
         else
         {
            A1933BarCodTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1933BarCodTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1933BarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1933BarCodTin), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARREOTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarReoTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1934BarReoTin = (byte)(0) ;
            n1934BarReoTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1934BarReoTin", GXutil.str( A1934BarReoTin, 1, 0));
         }
         else
         {
            A1934BarReoTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarReoTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1934BarReoTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1934BarReoTin", GXutil.str( A1934BarReoTin, 1, 0));
         }
         A1935BarParTin = httpContext.cgiGet( edtBarParTin_Internalname) ;
         n1935BarParTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1935BarParTin", A1935BarParTin);
         A1936BarSerTin = httpContext.cgiGet( edtBarSerTin_Internalname) ;
         n1936BarSerTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1936BarSerTin", A1936BarSerTin);
         A1937BarDscTin = httpContext.cgiGet( edtBarDscTin_Internalname) ;
         n1937BarDscTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1937BarDscTin", A1937BarDscTin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARARTTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarArtTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1939BarArtTin = (short)(0) ;
            n1939BarArtTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1939BarArtTin), 4, 0));
         }
         else
         {
            A1939BarArtTin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarArtTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1939BarArtTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1939BarArtTin), 4, 0));
         }
         A13962BarArtTinD = httpContext.cgiGet( edtBarArtTinD_Internalname) ;
         n13962BarArtTinD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
         A1940BarColNoT = httpContext.cgiGet( edtBarColNoT_Internalname) ;
         n1940BarColNoT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1940BarColNoT", A1940BarColNoT);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOLNUT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarColNuT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1941BarColNuT = 0 ;
            n1941BarColNuT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1941BarColNuT), 6, 0));
         }
         else
         {
            A1941BarColNuT = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNuT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1941BarColNuT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1941BarColNuT), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIPCOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTipCoT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1942BarTipCoT = (byte)(0) ;
            n1942BarTipCoT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1942BarTipCoT), 2, 0));
         }
         else
         {
            A1942BarTipCoT = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCoT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1942BarTipCoT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1942BarTipCoT), 2, 0));
         }
         A13963BarTipCoTD = httpContext.cgiGet( edtBarTipCoTD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13963BarTipCoTD", A13963BarTipCoTD);
         A1943BarNomClT = httpContext.cgiGet( edtBarNomClT_Internalname) ;
         n1943BarNomClT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1943BarNomClT", A1943BarNomClT);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumClT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumClT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMCLT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNumClT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1944BarNumClT = 0 ;
            n1944BarNumClT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1944BarNumClT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1944BarNumClT), 6, 0));
         }
         else
         {
            A1944BarNumClT = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumClT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1944BarNumClT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1944BarNumClT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1944BarNumClT), 6, 0));
         }
         A1945BarMaqTin = httpContext.cgiGet( edtBarMaqTin_Internalname) ;
         n1945BarMaqTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1945BarMaqTin", A1945BarMaqTin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARVOLTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarVolTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1946BarVolTin = 0 ;
            n1946BarVolTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1946BarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1946BarVolTin), 5, 0));
         }
         else
         {
            A1946BarVolTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1946BarVolTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1946BarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1946BarVolTin), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKGMTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKgmTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1947BarKgmTin = DecimalUtil.ZERO ;
            n1947BarKgmTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1947BarKgmTin", GXutil.ltrimstr( A1947BarKgmTin, 9, 2));
         }
         else
         {
            A1947BarKgmTin = localUtil.ctond( httpContext.cgiGet( edtBarKgmTin_Internalname)) ;
            n1947BarKgmTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1947BarKgmTin", GXutil.ltrimstr( A1947BarKgmTin, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMTRTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarMtrTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1948BarMtrTin = DecimalUtil.ZERO ;
            n1948BarMtrTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1948BarMtrTin", GXutil.ltrimstr( A1948BarMtrTin, 9, 2));
         }
         else
         {
            A1948BarMtrTin = localUtil.ctond( httpContext.cgiGet( edtBarMtrTin_Internalname)) ;
            n1948BarMtrTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1948BarMtrTin", GXutil.ltrimstr( A1948BarMtrTin, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIETIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPieTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1949BarPieTin = 0 ;
            n1949BarPieTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1949BarPieTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1949BarPieTin), 6, 0));
         }
         else
         {
            A1949BarPieTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPieTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1949BarPieTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1949BarPieTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1949BarPieTin), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarEstTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarEstTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARESTTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarEstTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2304BarEstTin = (byte)(0) ;
            n2304BarEstTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2304BarEstTin", GXutil.str( A2304BarEstTin, 1, 0));
         }
         else
         {
            A2304BarEstTin = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarEstTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2304BarEstTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2304BarEstTin", GXutil.str( A2304BarEstTin, 1, 0));
         }
         A2316BarAgrLot = httpContext.cgiGet( edtBarAgrLot_Internalname) ;
         n2316BarAgrLot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2316BarAgrLot", A2316BarAgrLot);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMANA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNumAna_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3650BarNumAna = (short)(0) ;
            n3650BarNumAna = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3650BarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3650BarNumAna), 3, 0));
         }
         else
         {
            A3650BarNumAna = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumAna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3650BarNumAna = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3650BarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3650BarNumAna), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarTipDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARTIPDEF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarTipDef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3651BarTipDef = (short)(0) ;
            n3651BarTipDef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3651BarTipDef), 4, 0));
         }
         else
         {
            A3651BarTipDef = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipDef_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3651BarTipDef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3651BarTipDef), 4, 0));
         }
         A13964BarTipDefD = httpContext.cgiGet( edtBarTipDefD_Internalname) ;
         n13964BarTipDefD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarIntens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarIntens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARINTENS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarIntens_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3652BarIntens = (byte)(0) ;
            n3652BarIntens = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3652BarIntens), 2, 0));
         }
         else
         {
            A3652BarIntens = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarIntens_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3652BarIntens = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3652BarIntens), 2, 0));
         }
         A13965BarIntDsc = httpContext.cgiGet( edtBarIntDsc_Internalname) ;
         n13965BarIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
         A3653BarPriCod = httpContext.cgiGet( edtBarPriCod_Internalname) ;
         n3653BarPriCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3653BarPriCod", A3653BarPriCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosPD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosPD_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSPD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosPD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3654BarCosPD = DecimalUtil.ZERO ;
            n3654BarCosPD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3654BarCosPD", GXutil.ltrimstr( A3654BarCosPD, 10, 2));
         }
         else
         {
            A3654BarCosPD = localUtil.ctond( httpContext.cgiGet( edtBarCosPD_Internalname)) ;
            n3654BarCosPD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3654BarCosPD", GXutil.ltrimstr( A3654BarCosPD, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosPA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosPA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSPA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosPA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3658BarCosPA = DecimalUtil.ZERO ;
            n3658BarCosPA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3658BarCosPA", GXutil.ltrimstr( A3658BarCosPA, 10, 2));
         }
         else
         {
            A3658BarCosPA = localUtil.ctond( httpContext.cgiGet( edtBarCosPA_Internalname)) ;
            n3658BarCosPA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3658BarCosPA", GXutil.ltrimstr( A3658BarCosPA, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosAD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosAD_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosAD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3656BarCosAD = DecimalUtil.ZERO ;
            n3656BarCosAD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3656BarCosAD", GXutil.ltrimstr( A3656BarCosAD, 10, 2));
         }
         else
         {
            A3656BarCosAD = localUtil.ctond( httpContext.cgiGet( edtBarCosAD_Internalname)) ;
            n3656BarCosAD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3656BarCosAD", GXutil.ltrimstr( A3656BarCosAD, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosAA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosAA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSAA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosAA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3657BarCosAA = DecimalUtil.ZERO ;
            n3657BarCosAA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3657BarCosAA", GXutil.ltrimstr( A3657BarCosAA, 10, 2));
         }
         else
         {
            A3657BarCosAA = localUtil.ctond( httpContext.cgiGet( edtBarCosAA_Internalname)) ;
            n3657BarCosAA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3657BarCosAA", GXutil.ltrimstr( A3657BarCosAA, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosCol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosCol_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3705BarCosCol = DecimalUtil.ZERO ;
            n3705BarCosCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3705BarCosCol", GXutil.ltrimstr( A3705BarCosCol, 10, 2));
         }
         else
         {
            A3705BarCosCol = localUtil.ctond( httpContext.cgiGet( edtBarCosCol_Internalname)) ;
            n3705BarCosCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3705BarCosCol", GXutil.ltrimstr( A3705BarCosCol, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosAnc_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3706BarCosAnc = DecimalUtil.ZERO ;
            n3706BarCosAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3706BarCosAnc", GXutil.ltrimstr( A3706BarCosAnc, 10, 2));
         }
         else
         {
            A3706BarCosAnc = localUtil.ctond( httpContext.cgiGet( edtBarCosAnc_Internalname)) ;
            n3706BarCosAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3706BarCosAnc", GXutil.ltrimstr( A3706BarCosAnc, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumActx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumActx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMACTX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNumActx_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4923BarNumActx = (short)(0) ;
            n4923BarNumActx = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4923BarNumActx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4923BarNumActx), 4, 0));
         }
         else
         {
            A4923BarNumActx = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumActx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4923BarNumActx = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4923BarNumActx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4923BarNumActx), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMPDA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNumPda_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4924BarNumPda = 0 ;
            n4924BarNumPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4924BarNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4924BarNumPda), 6, 0));
         }
         else
         {
            A4924BarNumPda = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4924BarNumPda = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4924BarNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4924BarNumPda), 6, 0));
         }
         A4925BarFaseCod = httpContext.cgiGet( edtBarFaseCod_Internalname) ;
         n4925BarFaseCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4925BarFaseCod", A4925BarFaseCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarFaseOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarFaseOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFASEORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFaseOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4926BarFaseOrd = (short)(0) ;
            n4926BarFaseOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4926BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4926BarFaseOrd), 4, 0));
         }
         else
         {
            A4926BarFaseOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtBarFaseOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4926BarFaseOrd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4926BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4926BarFaseOrd), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarReoNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARREONUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarReoNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4977BarReoNum = (short)(0) ;
            n4977BarReoNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4977BarReoNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4977BarReoNum), 4, 0));
         }
         else
         {
            A4977BarReoNum = (short)(localUtil.ctol( httpContext.cgiGet( edtBarReoNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4977BarReoNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4977BarReoNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4977BarReoNum), 4, 0));
         }
         A5169BarTipDTin = GXutil.upper( httpContext.cgiGet( edtBarTipDTin_Internalname)) ;
         n5169BarTipDTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5169BarTipDTin", A5169BarTipDTin);
         A5170BarTipCTin = httpContext.cgiGet( edtBarTipCTin_Internalname) ;
         n5170BarTipCTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5170BarTipCTin", A5170BarTipCTin);
         A5171BarTipNTin = httpContext.cgiGet( edtBarTipNTin_Internalname) ;
         n5171BarTipNTin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5171BarTipNTin", A5171BarTipNTin);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarCosttTi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarCosttTi_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOSTTTI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCosttTi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5899BarCosttTi = DecimalUtil.ZERO ;
            n5899BarCosttTi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5899BarCosttTi", GXutil.ltrimstr( A5899BarCosttTi, 11, 5));
         }
         else
         {
            A5899BarCosttTi = localUtil.ctond( httpContext.cgiGet( edtBarCosttTi_Internalname)) ;
            n5899BarCosttTi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5899BarCosttTi", GXutil.ltrimstr( A5899BarCosttTi, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarRbTeo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarRbTeo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARRBTEO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarRbTeo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5900BarRbTeo = (short)(0) ;
            n5900BarRbTeo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5900BarRbTeo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5900BarRbTeo), 4, 0));
         }
         else
         {
            A5900BarRbTeo = (short)(localUtil.ctol( httpContext.cgiGet( edtBarRbTeo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5900BarRbTeo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5900BarRbTeo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5900BarRbTeo), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNumTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNUMTIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNumTin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6177BarNumTin = 0 ;
            n6177BarNumTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6177BarNumTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6177BarNumTin), 8, 0));
         }
         else
         {
            A6177BarNumTin = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumTin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6177BarNumTin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6177BarNumTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6177BarNumTin), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCAUSA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCausa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6431BarCausa = (short)(0) ;
            n6431BarCausa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6431BarCausa), 4, 0));
         }
         else
         {
            A6431BarCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtBarCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6431BarCausa = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6431BarCausa), 4, 0));
         }
         A13966BarCauDsc = httpContext.cgiGet( edtBarCauDsc_Internalname) ;
         n13966BarCauDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
         A6634BarRecAcb = httpContext.cgiGet( edtBarRecAcb_Internalname) ;
         n6634BarRecAcb = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6634BarRecAcb", A6634BarRecAcb);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARKGSTT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarKgsTt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8563BarKgsTt = DecimalUtil.ZERO ;
            n8563BarKgsTt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8563BarKgsTt", GXutil.ltrimstr( A8563BarKgsTt, 10, 2));
         }
         else
         {
            A8563BarKgsTt = localUtil.ctond( httpContext.cgiGet( edtBarKgsTt_Internalname)) ;
            n8563BarKgsTt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8563BarKgsTt", GXutil.ltrimstr( A8563BarKgsTt, 10, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FAMCODT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFamCodT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8584FamCodT = (short)(0) ;
            n8584FamCodT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8584FamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8584FamCodT), 4, 0));
         }
         else
         {
            A8584FamCodT = (short)(localUtil.ctol( httpContext.cgiGet( edtFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8584FamCodT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8584FamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8584FamCodT), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARFORNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarForNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8609BarForNum = 0 ;
            n8609BarForNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8609BarForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8609BarForNum), 8, 0));
         }
         else
         {
            A8609BarForNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarForNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8609BarForNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8609BarForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8609BarForNum), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarNTint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarNTint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARNTINT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarNTint_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9754BarNTint = (byte)(0) ;
            n9754BarNTint = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9754BarNTint", GXutil.str( A9754BarNTint, 1, 0));
         }
         else
         {
            A9754BarNTint = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarNTint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9754BarNTint = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9754BarNTint", GXutil.str( A9754BarNTint, 1, 0));
         }
         A10539BarAcs = httpContext.cgiGet( edtBarAcs_Internalname) ;
         n10539BarAcs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10539BarAcs", A10539BarAcs);
         A10540BarNprg = httpContext.cgiGet( edtBarNprg_Internalname) ;
         n10540BarNprg = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10540BarNprg", A10540BarNprg);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarLts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarLts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARLTS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarLts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10541BarLts = 0 ;
            n10541BarLts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10541BarLts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10541BarLts), 5, 0));
         }
         else
         {
            A10541BarLts = (int)(localUtil.ctol( httpContext.cgiGet( edtBarLts_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10541BarLts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10541BarLts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10541BarLts), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarLtsV_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarLtsV_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARLTSV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarLtsV_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10546BarLtsV = DecimalUtil.ZERO ;
            n10546BarLtsV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10546BarLtsV", GXutil.ltrimstr( A10546BarLtsV, 10, 2));
         }
         else
         {
            A10546BarLtsV = localUtil.ctond( httpContext.cgiGet( edtBarLtsV_Internalname)) ;
            n10546BarLtsV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10546BarLtsV", GXutil.ltrimstr( A10546BarLtsV, 10, 2));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFecIt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BARFECIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecIt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
            n11177BarFecIt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11177BarFecIt", localUtil.ttoc( A11177BarFecIt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11177BarFecIt = localUtil.ctot( httpContext.cgiGet( edtBarFecIt_Internalname)) ;
            n11177BarFecIt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11177BarFecIt", localUtil.ttoc( A11177BarFecIt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtBarFecFt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "BARFECFT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarFecFt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
            n11178BarFecFt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11178BarFecFt", localUtil.ttoc( A11178BarFecFt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A11178BarFecFt = localUtil.ctot( httpContext.cgiGet( edtBarFecFt_Internalname)) ;
            n11178BarFecFt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11178BarFecFt", localUtil.ttoc( A11178BarFecFt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A11179BarColNm = httpContext.cgiGet( edtBarColNm_Internalname) ;
         n11179BarColNm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11179BarColNm", A11179BarColNm);
         A11762BarDispCli = httpContext.cgiGet( edtBarDispCli_Internalname) ;
         n11762BarDispCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11762BarDispCli", A11762BarDispCli);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARMTSTT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarMtsTt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12993BarMtsTt = DecimalUtil.ZERO ;
            n12993BarMtsTt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12993BarMtsTt", GXutil.ltrimstr( A12993BarMtsTt, 10, 2));
         }
         else
         {
            A12993BarMtsTt = localUtil.ctond( httpContext.cgiGet( edtBarMtsTt_Internalname)) ;
            n12993BarMtsTt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12993BarMtsTt", GXutil.ltrimstr( A12993BarMtsTt, 10, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtEstFecCier_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ESTFECCIER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstFecCier_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13759EstFecCier = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
         }
         else
         {
            A13759EstFecCier = localUtil.ctod( httpContext.cgiGet( edtEstFecCier_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCdn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCdn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCDN1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstCdn1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13760EstCdn1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13760EstCdn1), 4, 0));
         }
         else
         {
            A13760EstCdn1 = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCdn1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13760EstCdn1), 4, 0));
         }
         A13761EstCdn2 = httpContext.cgiGet( edtEstCdn2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13761EstCdn2", A13761EstCdn2);
         A13762EstCtw = httpContext.cgiGet( edtEstCtw_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13762EstCtw", A13762EstCtw);
         A13967BarNumEny = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumEny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13967BarNumEny = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
         A13975BarNumtint = (short)(localUtil.ctol( httpContext.cgiGet( edtBarNumtint_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
         A14199CosteInici = localUtil.ctond( httpContext.cgiGet( edtCosteInici_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14199CosteInici", GXutil.ltrimstr( A14199CosteInici, 10, 2));
         A14200CosteAnyad = localUtil.ctond( httpContext.cgiGet( edtCosteAnyad_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14200CosteAnyad", GXutil.ltrimstr( A14200CosteAnyad, 10, 2));
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
            A3646EstTinAny = (short)(GXutil.lval( httpContext.GetPar( "EstTinAny"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = (byte)(GXutil.lval( httpContext.GetPar( "EstTinMes"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = (byte)(GXutil.lval( httpContext.GetPar( "EstTinDia"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            A1929EstTinNr = (short)(GXutil.lval( httpContext.GetPar( "EstTinNr"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
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
            initAll1PK510( ) ;
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
      disableAttributes1PK510( ) ;
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

   public void resetCaption1PK0( )
   {
   }

   public void zm1PK510( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1933BarCodTin = T01PK3_A1933BarCodTin[0] ;
            Z1934BarReoTin = T01PK3_A1934BarReoTin[0] ;
            Z1935BarParTin = T01PK3_A1935BarParTin[0] ;
            Z1936BarSerTin = T01PK3_A1936BarSerTin[0] ;
            Z1937BarDscTin = T01PK3_A1937BarDscTin[0] ;
            Z1939BarArtTin = T01PK3_A1939BarArtTin[0] ;
            Z1940BarColNoT = T01PK3_A1940BarColNoT[0] ;
            Z1941BarColNuT = T01PK3_A1941BarColNuT[0] ;
            Z1942BarTipCoT = T01PK3_A1942BarTipCoT[0] ;
            Z1943BarNomClT = T01PK3_A1943BarNomClT[0] ;
            Z1944BarNumClT = T01PK3_A1944BarNumClT[0] ;
            Z1945BarMaqTin = T01PK3_A1945BarMaqTin[0] ;
            Z1946BarVolTin = T01PK3_A1946BarVolTin[0] ;
            Z1947BarKgmTin = T01PK3_A1947BarKgmTin[0] ;
            Z1948BarMtrTin = T01PK3_A1948BarMtrTin[0] ;
            Z1949BarPieTin = T01PK3_A1949BarPieTin[0] ;
            Z2304BarEstTin = T01PK3_A2304BarEstTin[0] ;
            Z2316BarAgrLot = T01PK3_A2316BarAgrLot[0] ;
            Z3650BarNumAna = T01PK3_A3650BarNumAna[0] ;
            Z3651BarTipDef = T01PK3_A3651BarTipDef[0] ;
            Z3652BarIntens = T01PK3_A3652BarIntens[0] ;
            Z3653BarPriCod = T01PK3_A3653BarPriCod[0] ;
            Z3654BarCosPD = T01PK3_A3654BarCosPD[0] ;
            Z3658BarCosPA = T01PK3_A3658BarCosPA[0] ;
            Z3656BarCosAD = T01PK3_A3656BarCosAD[0] ;
            Z3657BarCosAA = T01PK3_A3657BarCosAA[0] ;
            Z3705BarCosCol = T01PK3_A3705BarCosCol[0] ;
            Z3706BarCosAnc = T01PK3_A3706BarCosAnc[0] ;
            Z4923BarNumActx = T01PK3_A4923BarNumActx[0] ;
            Z4924BarNumPda = T01PK3_A4924BarNumPda[0] ;
            Z4925BarFaseCod = T01PK3_A4925BarFaseCod[0] ;
            Z4926BarFaseOrd = T01PK3_A4926BarFaseOrd[0] ;
            Z4977BarReoNum = T01PK3_A4977BarReoNum[0] ;
            Z5169BarTipDTin = T01PK3_A5169BarTipDTin[0] ;
            Z5170BarTipCTin = T01PK3_A5170BarTipCTin[0] ;
            Z5171BarTipNTin = T01PK3_A5171BarTipNTin[0] ;
            Z5899BarCosttTi = T01PK3_A5899BarCosttTi[0] ;
            Z5900BarRbTeo = T01PK3_A5900BarRbTeo[0] ;
            Z6177BarNumTin = T01PK3_A6177BarNumTin[0] ;
            Z6431BarCausa = T01PK3_A6431BarCausa[0] ;
            Z6634BarRecAcb = T01PK3_A6634BarRecAcb[0] ;
            Z8563BarKgsTt = T01PK3_A8563BarKgsTt[0] ;
            Z8584FamCodT = T01PK3_A8584FamCodT[0] ;
            Z8609BarForNum = T01PK3_A8609BarForNum[0] ;
            Z9754BarNTint = T01PK3_A9754BarNTint[0] ;
            Z10539BarAcs = T01PK3_A10539BarAcs[0] ;
            Z10540BarNprg = T01PK3_A10540BarNprg[0] ;
            Z10541BarLts = T01PK3_A10541BarLts[0] ;
            Z10546BarLtsV = T01PK3_A10546BarLtsV[0] ;
            Z11177BarFecIt = T01PK3_A11177BarFecIt[0] ;
            Z11178BarFecFt = T01PK3_A11178BarFecFt[0] ;
            Z11179BarColNm = T01PK3_A11179BarColNm[0] ;
            Z11762BarDispCli = T01PK3_A11762BarDispCli[0] ;
            Z12993BarMtsTt = T01PK3_A12993BarMtsTt[0] ;
            Z13759EstFecCier = T01PK3_A13759EstFecCier[0] ;
            Z13760EstCdn1 = T01PK3_A13760EstCdn1[0] ;
            Z13761EstCdn2 = T01PK3_A13761EstCdn2[0] ;
            Z13762EstCtw = T01PK3_A13762EstCtw[0] ;
            Z252CliCod = T01PK3_A252CliCod[0] ;
         }
         else
         {
            Z1933BarCodTin = A1933BarCodTin ;
            Z1934BarReoTin = A1934BarReoTin ;
            Z1935BarParTin = A1935BarParTin ;
            Z1936BarSerTin = A1936BarSerTin ;
            Z1937BarDscTin = A1937BarDscTin ;
            Z1939BarArtTin = A1939BarArtTin ;
            Z1940BarColNoT = A1940BarColNoT ;
            Z1941BarColNuT = A1941BarColNuT ;
            Z1942BarTipCoT = A1942BarTipCoT ;
            Z1943BarNomClT = A1943BarNomClT ;
            Z1944BarNumClT = A1944BarNumClT ;
            Z1945BarMaqTin = A1945BarMaqTin ;
            Z1946BarVolTin = A1946BarVolTin ;
            Z1947BarKgmTin = A1947BarKgmTin ;
            Z1948BarMtrTin = A1948BarMtrTin ;
            Z1949BarPieTin = A1949BarPieTin ;
            Z2304BarEstTin = A2304BarEstTin ;
            Z2316BarAgrLot = A2316BarAgrLot ;
            Z3650BarNumAna = A3650BarNumAna ;
            Z3651BarTipDef = A3651BarTipDef ;
            Z3652BarIntens = A3652BarIntens ;
            Z3653BarPriCod = A3653BarPriCod ;
            Z3654BarCosPD = A3654BarCosPD ;
            Z3658BarCosPA = A3658BarCosPA ;
            Z3656BarCosAD = A3656BarCosAD ;
            Z3657BarCosAA = A3657BarCosAA ;
            Z3705BarCosCol = A3705BarCosCol ;
            Z3706BarCosAnc = A3706BarCosAnc ;
            Z4923BarNumActx = A4923BarNumActx ;
            Z4924BarNumPda = A4924BarNumPda ;
            Z4925BarFaseCod = A4925BarFaseCod ;
            Z4926BarFaseOrd = A4926BarFaseOrd ;
            Z4977BarReoNum = A4977BarReoNum ;
            Z5169BarTipDTin = A5169BarTipDTin ;
            Z5170BarTipCTin = A5170BarTipCTin ;
            Z5171BarTipNTin = A5171BarTipNTin ;
            Z5899BarCosttTi = A5899BarCosttTi ;
            Z5900BarRbTeo = A5900BarRbTeo ;
            Z6177BarNumTin = A6177BarNumTin ;
            Z6431BarCausa = A6431BarCausa ;
            Z6634BarRecAcb = A6634BarRecAcb ;
            Z8563BarKgsTt = A8563BarKgsTt ;
            Z8584FamCodT = A8584FamCodT ;
            Z8609BarForNum = A8609BarForNum ;
            Z9754BarNTint = A9754BarNTint ;
            Z10539BarAcs = A10539BarAcs ;
            Z10540BarNprg = A10540BarNprg ;
            Z10541BarLts = A10541BarLts ;
            Z10546BarLtsV = A10546BarLtsV ;
            Z11177BarFecIt = A11177BarFecIt ;
            Z11178BarFecFt = A11178BarFecFt ;
            Z11179BarColNm = A11179BarColNm ;
            Z11762BarDispCli = A11762BarDispCli ;
            Z12993BarMtsTt = A12993BarMtsTt ;
            Z13759EstFecCier = A13759EstFecCier ;
            Z13760EstCdn1 = A13760EstCdn1 ;
            Z13761EstCdn2 = A13761EstCdn2 ;
            Z13762EstCtw = A13762EstCtw ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z1929EstTinNr = A1929EstTinNr ;
         Z1933BarCodTin = A1933BarCodTin ;
         Z1934BarReoTin = A1934BarReoTin ;
         Z1935BarParTin = A1935BarParTin ;
         Z1936BarSerTin = A1936BarSerTin ;
         Z1937BarDscTin = A1937BarDscTin ;
         Z1939BarArtTin = A1939BarArtTin ;
         Z1940BarColNoT = A1940BarColNoT ;
         Z1941BarColNuT = A1941BarColNuT ;
         Z1942BarTipCoT = A1942BarTipCoT ;
         Z1943BarNomClT = A1943BarNomClT ;
         Z1944BarNumClT = A1944BarNumClT ;
         Z1945BarMaqTin = A1945BarMaqTin ;
         Z1946BarVolTin = A1946BarVolTin ;
         Z1947BarKgmTin = A1947BarKgmTin ;
         Z1948BarMtrTin = A1948BarMtrTin ;
         Z1949BarPieTin = A1949BarPieTin ;
         Z2304BarEstTin = A2304BarEstTin ;
         Z2316BarAgrLot = A2316BarAgrLot ;
         Z3650BarNumAna = A3650BarNumAna ;
         Z3651BarTipDef = A3651BarTipDef ;
         Z3652BarIntens = A3652BarIntens ;
         Z3653BarPriCod = A3653BarPriCod ;
         Z3654BarCosPD = A3654BarCosPD ;
         Z3658BarCosPA = A3658BarCosPA ;
         Z3656BarCosAD = A3656BarCosAD ;
         Z3657BarCosAA = A3657BarCosAA ;
         Z3705BarCosCol = A3705BarCosCol ;
         Z3706BarCosAnc = A3706BarCosAnc ;
         Z4923BarNumActx = A4923BarNumActx ;
         Z4924BarNumPda = A4924BarNumPda ;
         Z4925BarFaseCod = A4925BarFaseCod ;
         Z4926BarFaseOrd = A4926BarFaseOrd ;
         Z4977BarReoNum = A4977BarReoNum ;
         Z5169BarTipDTin = A5169BarTipDTin ;
         Z5170BarTipCTin = A5170BarTipCTin ;
         Z5171BarTipNTin = A5171BarTipNTin ;
         Z5899BarCosttTi = A5899BarCosttTi ;
         Z5900BarRbTeo = A5900BarRbTeo ;
         Z6177BarNumTin = A6177BarNumTin ;
         Z6431BarCausa = A6431BarCausa ;
         Z6634BarRecAcb = A6634BarRecAcb ;
         Z8563BarKgsTt = A8563BarKgsTt ;
         Z8584FamCodT = A8584FamCodT ;
         Z8609BarForNum = A8609BarForNum ;
         Z9754BarNTint = A9754BarNTint ;
         Z10539BarAcs = A10539BarAcs ;
         Z10540BarNprg = A10540BarNprg ;
         Z10541BarLts = A10541BarLts ;
         Z10546BarLtsV = A10546BarLtsV ;
         Z11177BarFecIt = A11177BarFecIt ;
         Z11178BarFecFt = A11178BarFecFt ;
         Z11179BarColNm = A11179BarColNm ;
         Z11762BarDispCli = A11762BarDispCli ;
         Z12993BarMtsTt = A12993BarMtsTt ;
         Z13759EstFecCier = A13759EstFecCier ;
         Z13760EstCdn1 = A13760EstCdn1 ;
         Z13761EstCdn2 = A13761EstCdn2 ;
         Z13762EstCtw = A13762EstCtw ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z407EmprNom = A407EmprNom ;
         Z13962BarArtTinD = A13962BarArtTinD ;
         Z13967BarNumEny = A13967BarNumEny ;
         Z13964BarTipDefD = A13964BarTipDefD ;
         Z13965BarIntDsc = A13965BarIntDsc ;
         Z13966BarCauDsc = A13966BarCauDsc ;
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

   public void load1PK510( )
   {
      /* Using cursor T01PK12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound510 = (short)(1) ;
         A407EmprNom = T01PK12_A407EmprNom[0] ;
         n407EmprNom = T01PK12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1933BarCodTin = T01PK12_A1933BarCodTin[0] ;
         n1933BarCodTin = T01PK12_n1933BarCodTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1933BarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1933BarCodTin), 8, 0));
         A1934BarReoTin = T01PK12_A1934BarReoTin[0] ;
         n1934BarReoTin = T01PK12_n1934BarReoTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1934BarReoTin", GXutil.str( A1934BarReoTin, 1, 0));
         A1935BarParTin = T01PK12_A1935BarParTin[0] ;
         n1935BarParTin = T01PK12_n1935BarParTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1935BarParTin", A1935BarParTin);
         A1936BarSerTin = T01PK12_A1936BarSerTin[0] ;
         n1936BarSerTin = T01PK12_n1936BarSerTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1936BarSerTin", A1936BarSerTin);
         A1937BarDscTin = T01PK12_A1937BarDscTin[0] ;
         n1937BarDscTin = T01PK12_n1937BarDscTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1937BarDscTin", A1937BarDscTin);
         A1939BarArtTin = T01PK12_A1939BarArtTin[0] ;
         n1939BarArtTin = T01PK12_n1939BarArtTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1939BarArtTin), 4, 0));
         A1940BarColNoT = T01PK12_A1940BarColNoT[0] ;
         n1940BarColNoT = T01PK12_n1940BarColNoT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1940BarColNoT", A1940BarColNoT);
         A1941BarColNuT = T01PK12_A1941BarColNuT[0] ;
         n1941BarColNuT = T01PK12_n1941BarColNuT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1941BarColNuT), 6, 0));
         A1942BarTipCoT = T01PK12_A1942BarTipCoT[0] ;
         n1942BarTipCoT = T01PK12_n1942BarTipCoT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1942BarTipCoT), 2, 0));
         A1943BarNomClT = T01PK12_A1943BarNomClT[0] ;
         n1943BarNomClT = T01PK12_n1943BarNomClT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1943BarNomClT", A1943BarNomClT);
         A1944BarNumClT = T01PK12_A1944BarNumClT[0] ;
         n1944BarNumClT = T01PK12_n1944BarNumClT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1944BarNumClT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1944BarNumClT), 6, 0));
         A1945BarMaqTin = T01PK12_A1945BarMaqTin[0] ;
         n1945BarMaqTin = T01PK12_n1945BarMaqTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1945BarMaqTin", A1945BarMaqTin);
         A1946BarVolTin = T01PK12_A1946BarVolTin[0] ;
         n1946BarVolTin = T01PK12_n1946BarVolTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1946BarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1946BarVolTin), 5, 0));
         A1947BarKgmTin = T01PK12_A1947BarKgmTin[0] ;
         n1947BarKgmTin = T01PK12_n1947BarKgmTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1947BarKgmTin", GXutil.ltrimstr( A1947BarKgmTin, 9, 2));
         A1948BarMtrTin = T01PK12_A1948BarMtrTin[0] ;
         n1948BarMtrTin = T01PK12_n1948BarMtrTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1948BarMtrTin", GXutil.ltrimstr( A1948BarMtrTin, 9, 2));
         A1949BarPieTin = T01PK12_A1949BarPieTin[0] ;
         n1949BarPieTin = T01PK12_n1949BarPieTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1949BarPieTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1949BarPieTin), 6, 0));
         A2304BarEstTin = T01PK12_A2304BarEstTin[0] ;
         n2304BarEstTin = T01PK12_n2304BarEstTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2304BarEstTin", GXutil.str( A2304BarEstTin, 1, 0));
         A2316BarAgrLot = T01PK12_A2316BarAgrLot[0] ;
         n2316BarAgrLot = T01PK12_n2316BarAgrLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2316BarAgrLot", A2316BarAgrLot);
         A3650BarNumAna = T01PK12_A3650BarNumAna[0] ;
         n3650BarNumAna = T01PK12_n3650BarNumAna[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3650BarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3650BarNumAna), 3, 0));
         A3651BarTipDef = T01PK12_A3651BarTipDef[0] ;
         n3651BarTipDef = T01PK12_n3651BarTipDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3651BarTipDef), 4, 0));
         A3652BarIntens = T01PK12_A3652BarIntens[0] ;
         n3652BarIntens = T01PK12_n3652BarIntens[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3652BarIntens), 2, 0));
         A3653BarPriCod = T01PK12_A3653BarPriCod[0] ;
         n3653BarPriCod = T01PK12_n3653BarPriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3653BarPriCod", A3653BarPriCod);
         A3654BarCosPD = T01PK12_A3654BarCosPD[0] ;
         n3654BarCosPD = T01PK12_n3654BarCosPD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3654BarCosPD", GXutil.ltrimstr( A3654BarCosPD, 10, 2));
         A3658BarCosPA = T01PK12_A3658BarCosPA[0] ;
         n3658BarCosPA = T01PK12_n3658BarCosPA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3658BarCosPA", GXutil.ltrimstr( A3658BarCosPA, 10, 2));
         A3656BarCosAD = T01PK12_A3656BarCosAD[0] ;
         n3656BarCosAD = T01PK12_n3656BarCosAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3656BarCosAD", GXutil.ltrimstr( A3656BarCosAD, 10, 2));
         A3657BarCosAA = T01PK12_A3657BarCosAA[0] ;
         n3657BarCosAA = T01PK12_n3657BarCosAA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3657BarCosAA", GXutil.ltrimstr( A3657BarCosAA, 10, 2));
         A3705BarCosCol = T01PK12_A3705BarCosCol[0] ;
         n3705BarCosCol = T01PK12_n3705BarCosCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3705BarCosCol", GXutil.ltrimstr( A3705BarCosCol, 10, 2));
         A3706BarCosAnc = T01PK12_A3706BarCosAnc[0] ;
         n3706BarCosAnc = T01PK12_n3706BarCosAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3706BarCosAnc", GXutil.ltrimstr( A3706BarCosAnc, 10, 2));
         A4923BarNumActx = T01PK12_A4923BarNumActx[0] ;
         n4923BarNumActx = T01PK12_n4923BarNumActx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4923BarNumActx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4923BarNumActx), 4, 0));
         A4924BarNumPda = T01PK12_A4924BarNumPda[0] ;
         n4924BarNumPda = T01PK12_n4924BarNumPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4924BarNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4924BarNumPda), 6, 0));
         A4925BarFaseCod = T01PK12_A4925BarFaseCod[0] ;
         n4925BarFaseCod = T01PK12_n4925BarFaseCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4925BarFaseCod", A4925BarFaseCod);
         A4926BarFaseOrd = T01PK12_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = T01PK12_n4926BarFaseOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4926BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4926BarFaseOrd), 4, 0));
         A4977BarReoNum = T01PK12_A4977BarReoNum[0] ;
         n4977BarReoNum = T01PK12_n4977BarReoNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4977BarReoNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4977BarReoNum), 4, 0));
         A5169BarTipDTin = T01PK12_A5169BarTipDTin[0] ;
         n5169BarTipDTin = T01PK12_n5169BarTipDTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5169BarTipDTin", A5169BarTipDTin);
         A5170BarTipCTin = T01PK12_A5170BarTipCTin[0] ;
         n5170BarTipCTin = T01PK12_n5170BarTipCTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5170BarTipCTin", A5170BarTipCTin);
         A5171BarTipNTin = T01PK12_A5171BarTipNTin[0] ;
         n5171BarTipNTin = T01PK12_n5171BarTipNTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5171BarTipNTin", A5171BarTipNTin);
         A5899BarCosttTi = T01PK12_A5899BarCosttTi[0] ;
         n5899BarCosttTi = T01PK12_n5899BarCosttTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5899BarCosttTi", GXutil.ltrimstr( A5899BarCosttTi, 11, 5));
         A5900BarRbTeo = T01PK12_A5900BarRbTeo[0] ;
         n5900BarRbTeo = T01PK12_n5900BarRbTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5900BarRbTeo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5900BarRbTeo), 4, 0));
         A6177BarNumTin = T01PK12_A6177BarNumTin[0] ;
         n6177BarNumTin = T01PK12_n6177BarNumTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6177BarNumTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6177BarNumTin), 8, 0));
         A6431BarCausa = T01PK12_A6431BarCausa[0] ;
         n6431BarCausa = T01PK12_n6431BarCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6431BarCausa), 4, 0));
         A6634BarRecAcb = T01PK12_A6634BarRecAcb[0] ;
         n6634BarRecAcb = T01PK12_n6634BarRecAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6634BarRecAcb", A6634BarRecAcb);
         A8563BarKgsTt = T01PK12_A8563BarKgsTt[0] ;
         n8563BarKgsTt = T01PK12_n8563BarKgsTt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8563BarKgsTt", GXutil.ltrimstr( A8563BarKgsTt, 10, 2));
         A8584FamCodT = T01PK12_A8584FamCodT[0] ;
         n8584FamCodT = T01PK12_n8584FamCodT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8584FamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8584FamCodT), 4, 0));
         A8609BarForNum = T01PK12_A8609BarForNum[0] ;
         n8609BarForNum = T01PK12_n8609BarForNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8609BarForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8609BarForNum), 8, 0));
         A9754BarNTint = T01PK12_A9754BarNTint[0] ;
         n9754BarNTint = T01PK12_n9754BarNTint[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9754BarNTint", GXutil.str( A9754BarNTint, 1, 0));
         A10539BarAcs = T01PK12_A10539BarAcs[0] ;
         n10539BarAcs = T01PK12_n10539BarAcs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10539BarAcs", A10539BarAcs);
         A10540BarNprg = T01PK12_A10540BarNprg[0] ;
         n10540BarNprg = T01PK12_n10540BarNprg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10540BarNprg", A10540BarNprg);
         A10541BarLts = T01PK12_A10541BarLts[0] ;
         n10541BarLts = T01PK12_n10541BarLts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10541BarLts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10541BarLts), 5, 0));
         A10546BarLtsV = T01PK12_A10546BarLtsV[0] ;
         n10546BarLtsV = T01PK12_n10546BarLtsV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10546BarLtsV", GXutil.ltrimstr( A10546BarLtsV, 10, 2));
         A11177BarFecIt = T01PK12_A11177BarFecIt[0] ;
         n11177BarFecIt = T01PK12_n11177BarFecIt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11177BarFecIt", localUtil.ttoc( A11177BarFecIt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11178BarFecFt = T01PK12_A11178BarFecFt[0] ;
         n11178BarFecFt = T01PK12_n11178BarFecFt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11178BarFecFt", localUtil.ttoc( A11178BarFecFt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11179BarColNm = T01PK12_A11179BarColNm[0] ;
         n11179BarColNm = T01PK12_n11179BarColNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11179BarColNm", A11179BarColNm);
         A11762BarDispCli = T01PK12_A11762BarDispCli[0] ;
         n11762BarDispCli = T01PK12_n11762BarDispCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11762BarDispCli", A11762BarDispCli);
         A12993BarMtsTt = T01PK12_A12993BarMtsTt[0] ;
         n12993BarMtsTt = T01PK12_n12993BarMtsTt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12993BarMtsTt", GXutil.ltrimstr( A12993BarMtsTt, 10, 2));
         A13759EstFecCier = T01PK12_A13759EstFecCier[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
         A13760EstCdn1 = T01PK12_A13760EstCdn1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13760EstCdn1), 4, 0));
         A13761EstCdn2 = T01PK12_A13761EstCdn2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13761EstCdn2", A13761EstCdn2);
         A13762EstCtw = T01PK12_A13762EstCtw[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13762EstCtw", A13762EstCtw);
         A252CliCod = T01PK12_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A13962BarArtTinD = T01PK12_A13962BarArtTinD[0] ;
         n13962BarArtTinD = T01PK12_n13962BarArtTinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
         A13964BarTipDefD = T01PK12_A13964BarTipDefD[0] ;
         n13964BarTipDefD = T01PK12_n13964BarTipDefD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
         A13965BarIntDsc = T01PK12_A13965BarIntDsc[0] ;
         n13965BarIntDsc = T01PK12_n13965BarIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
         A13966BarCauDsc = T01PK12_A13966BarCauDsc[0] ;
         n13966BarCauDsc = T01PK12_n13966BarCauDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
         A13967BarNumEny = T01PK12_A13967BarNumEny[0] ;
         n13967BarNumEny = T01PK12_n13967BarNumEny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
         zm1PK510( -7) ;
      }
      pr_default.close(10);
      onLoadActions1PK510( ) ;
   }

   public void onLoadActions1PK510( )
   {
      if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
      {
         A13975BarNumtint = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
      }
      else
      {
         if ( true )
         {
            A13975BarNumtint = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
         }
         else
         {
            A13975BarNumtint = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
         }
      }
      A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
      A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14199CosteInici", GXutil.ltrimstr( A14199CosteInici, 10, 2));
      A14200CosteAnyad = A3656BarCosAD.add(A3657BarCosAA).add(A3706BarCosAnc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14200CosteAnyad", GXutil.ltrimstr( A14200CosteAnyad, 10, 2));
   }

   public void checkExtendedTable1PK510( )
   {
      nIsDirty_510 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PK4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01PK4_A407EmprNom[0] ;
      n407EmprNom = T01PK4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01PK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01PK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13962BarArtTinD = T01PK7_A13962BarArtTinD[0] ;
         n13962BarArtTinD = T01PK7_n13962BarArtTinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
      }
      else
      {
         nIsDirty_510 = (short)(1) ;
         A13962BarArtTinD = " " ;
         n13962BarArtTinD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
      }
      pr_default.close(5);
      /* Using cursor T01PK8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13964BarTipDefD = T01PK8_A13964BarTipDefD[0] ;
         n13964BarTipDefD = T01PK8_n13964BarTipDefD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
      }
      else
      {
         nIsDirty_510 = (short)(1) ;
         A13964BarTipDefD = " " ;
         n13964BarTipDefD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
      }
      pr_default.close(6);
      /* Using cursor T01PK9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A13965BarIntDsc = T01PK9_A13965BarIntDsc[0] ;
         n13965BarIntDsc = T01PK9_n13965BarIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
      }
      else
      {
         nIsDirty_510 = (short)(1) ;
         A13965BarIntDsc = " " ;
         n13965BarIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
      }
      pr_default.close(7);
      /* Using cursor T01PK10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13966BarCauDsc = T01PK10_A13966BarCauDsc[0] ;
         n13966BarCauDsc = T01PK10_n13966BarCauDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
      }
      else
      {
         nIsDirty_510 = (short)(1) ;
         A13966BarCauDsc = " " ;
         n13966BarCauDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
      }
      pr_default.close(8);
      /* Using cursor T01PK11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A13967BarNumEny = T01PK11_A13967BarNumEny[0] ;
         n13967BarNumEny = T01PK11_n13967BarNumEny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
      }
      else
      {
         nIsDirty_510 = (short)(1) ;
         A13967BarNumEny = 0 ;
         n13967BarNumEny = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
      }
      pr_default.close(9);
      /* Using cursor T01PK6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CONTIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINDIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
      {
         nIsDirty_510 = (short)(1) ;
         A13975BarNumtint = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
      }
      else
      {
         if ( true )
         {
            nIsDirty_510 = (short)(1) ;
            A13975BarNumtint = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
         }
         else
         {
            nIsDirty_510 = (short)(1) ;
            A13975BarNumtint = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
         }
      }
      nIsDirty_510 = (short)(1) ;
      A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
      if ( ! ( ( GXutil.strcmp(A3653BarPriCod, "0") == 0 ) || ( GXutil.strcmp(A3653BarPriCod, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "BARPRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_510 = (short)(1) ;
      A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14199CosteInici", GXutil.ltrimstr( A14199CosteInici, 10, 2));
      nIsDirty_510 = (short)(1) ;
      A14200CosteAnyad = A3656BarCosAD.add(A3657BarCosAA).add(A3706BarCosAnc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14200CosteAnyad", GXutil.ltrimstr( A14200CosteAnyad, 10, 2));
   }

   public void closeExtendedTableCursors1PK510( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod )
   {
      /* Using cursor T01PK13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01PK13_A407EmprNom[0] ;
      n407EmprNom = T01PK13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_9( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T01PK14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_11( String A396EmprCod ,
                          short A1939BarArtTin )
   {
      /* Using cursor T01PK15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A13962BarArtTinD = T01PK15_A13962BarArtTinD[0] ;
         n13962BarArtTinD = T01PK15_n13962BarArtTinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
      }
      else
      {
         A13962BarArtTinD = " " ;
         n13962BarArtTinD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13962BarArtTinD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_12( String A396EmprCod ,
                          short A3651BarTipDef )
   {
      /* Using cursor T01PK16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A13964BarTipDefD = T01PK16_A13964BarTipDefD[0] ;
         n13964BarTipDefD = T01PK16_n13964BarTipDefD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
      }
      else
      {
         A13964BarTipDefD = " " ;
         n13964BarTipDefD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13964BarTipDefD))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_13( String A396EmprCod ,
                          byte A3652BarIntens )
   {
      /* Using cursor T01PK17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13965BarIntDsc = T01PK17_A13965BarIntDsc[0] ;
         n13965BarIntDsc = T01PK17_n13965BarIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
      }
      else
      {
         A13965BarIntDsc = " " ;
         n13965BarIntDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13965BarIntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_14( String A396EmprCod ,
                          short A6431BarCausa )
   {
      /* Using cursor T01PK18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A13966BarCauDsc = T01PK18_A13966BarCauDsc[0] ;
         n13966BarCauDsc = T01PK18_n13966BarCauDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
      }
      else
      {
         A13966BarCauDsc = " " ;
         n13966BarCauDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13966BarCauDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_15( String A396EmprCod ,
                          int A252CliCod ,
                          String A1936BarSerTin ,
                          String A1940BarColNoT ,
                          int A1941BarColNuT ,
                          byte A1942BarTipCoT )
   {
      /* Using cursor T01PK19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A13967BarNumEny = T01PK19_A13967BarNumEny[0] ;
         n13967BarNumEny = T01PK19_n13967BarNumEny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
      }
      else
      {
         A13967BarNumEny = 0 ;
         n13967BarNumEny = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13967BarNumEny, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_10( String A396EmprCod ,
                          short A3646EstTinAny ,
                          byte A3647EstTinMes ,
                          byte A3648EstTinDia )
   {
      /* Using cursor T01PK20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CONTIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINDIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1PK510( )
   {
      /* Using cursor T01PK21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound510 = (short)(1) ;
      }
      else
      {
         RcdFound510 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1PK510( 7) ;
         RcdFound510 = (short)(1) ;
         A1929EstTinNr = T01PK3_A1929EstTinNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
         A1933BarCodTin = T01PK3_A1933BarCodTin[0] ;
         n1933BarCodTin = T01PK3_n1933BarCodTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1933BarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1933BarCodTin), 8, 0));
         A1934BarReoTin = T01PK3_A1934BarReoTin[0] ;
         n1934BarReoTin = T01PK3_n1934BarReoTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1934BarReoTin", GXutil.str( A1934BarReoTin, 1, 0));
         A1935BarParTin = T01PK3_A1935BarParTin[0] ;
         n1935BarParTin = T01PK3_n1935BarParTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1935BarParTin", A1935BarParTin);
         A1936BarSerTin = T01PK3_A1936BarSerTin[0] ;
         n1936BarSerTin = T01PK3_n1936BarSerTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1936BarSerTin", A1936BarSerTin);
         A1937BarDscTin = T01PK3_A1937BarDscTin[0] ;
         n1937BarDscTin = T01PK3_n1937BarDscTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1937BarDscTin", A1937BarDscTin);
         A1939BarArtTin = T01PK3_A1939BarArtTin[0] ;
         n1939BarArtTin = T01PK3_n1939BarArtTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1939BarArtTin), 4, 0));
         A1940BarColNoT = T01PK3_A1940BarColNoT[0] ;
         n1940BarColNoT = T01PK3_n1940BarColNoT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1940BarColNoT", A1940BarColNoT);
         A1941BarColNuT = T01PK3_A1941BarColNuT[0] ;
         n1941BarColNuT = T01PK3_n1941BarColNuT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1941BarColNuT), 6, 0));
         A1942BarTipCoT = T01PK3_A1942BarTipCoT[0] ;
         n1942BarTipCoT = T01PK3_n1942BarTipCoT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1942BarTipCoT), 2, 0));
         A1943BarNomClT = T01PK3_A1943BarNomClT[0] ;
         n1943BarNomClT = T01PK3_n1943BarNomClT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1943BarNomClT", A1943BarNomClT);
         A1944BarNumClT = T01PK3_A1944BarNumClT[0] ;
         n1944BarNumClT = T01PK3_n1944BarNumClT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1944BarNumClT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1944BarNumClT), 6, 0));
         A1945BarMaqTin = T01PK3_A1945BarMaqTin[0] ;
         n1945BarMaqTin = T01PK3_n1945BarMaqTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1945BarMaqTin", A1945BarMaqTin);
         A1946BarVolTin = T01PK3_A1946BarVolTin[0] ;
         n1946BarVolTin = T01PK3_n1946BarVolTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1946BarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1946BarVolTin), 5, 0));
         A1947BarKgmTin = T01PK3_A1947BarKgmTin[0] ;
         n1947BarKgmTin = T01PK3_n1947BarKgmTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1947BarKgmTin", GXutil.ltrimstr( A1947BarKgmTin, 9, 2));
         A1948BarMtrTin = T01PK3_A1948BarMtrTin[0] ;
         n1948BarMtrTin = T01PK3_n1948BarMtrTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1948BarMtrTin", GXutil.ltrimstr( A1948BarMtrTin, 9, 2));
         A1949BarPieTin = T01PK3_A1949BarPieTin[0] ;
         n1949BarPieTin = T01PK3_n1949BarPieTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1949BarPieTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1949BarPieTin), 6, 0));
         A2304BarEstTin = T01PK3_A2304BarEstTin[0] ;
         n2304BarEstTin = T01PK3_n2304BarEstTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2304BarEstTin", GXutil.str( A2304BarEstTin, 1, 0));
         A2316BarAgrLot = T01PK3_A2316BarAgrLot[0] ;
         n2316BarAgrLot = T01PK3_n2316BarAgrLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2316BarAgrLot", A2316BarAgrLot);
         A3650BarNumAna = T01PK3_A3650BarNumAna[0] ;
         n3650BarNumAna = T01PK3_n3650BarNumAna[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3650BarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3650BarNumAna), 3, 0));
         A3651BarTipDef = T01PK3_A3651BarTipDef[0] ;
         n3651BarTipDef = T01PK3_n3651BarTipDef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3651BarTipDef), 4, 0));
         A3652BarIntens = T01PK3_A3652BarIntens[0] ;
         n3652BarIntens = T01PK3_n3652BarIntens[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3652BarIntens), 2, 0));
         A3653BarPriCod = T01PK3_A3653BarPriCod[0] ;
         n3653BarPriCod = T01PK3_n3653BarPriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3653BarPriCod", A3653BarPriCod);
         A3654BarCosPD = T01PK3_A3654BarCosPD[0] ;
         n3654BarCosPD = T01PK3_n3654BarCosPD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3654BarCosPD", GXutil.ltrimstr( A3654BarCosPD, 10, 2));
         A3658BarCosPA = T01PK3_A3658BarCosPA[0] ;
         n3658BarCosPA = T01PK3_n3658BarCosPA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3658BarCosPA", GXutil.ltrimstr( A3658BarCosPA, 10, 2));
         A3656BarCosAD = T01PK3_A3656BarCosAD[0] ;
         n3656BarCosAD = T01PK3_n3656BarCosAD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3656BarCosAD", GXutil.ltrimstr( A3656BarCosAD, 10, 2));
         A3657BarCosAA = T01PK3_A3657BarCosAA[0] ;
         n3657BarCosAA = T01PK3_n3657BarCosAA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3657BarCosAA", GXutil.ltrimstr( A3657BarCosAA, 10, 2));
         A3705BarCosCol = T01PK3_A3705BarCosCol[0] ;
         n3705BarCosCol = T01PK3_n3705BarCosCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3705BarCosCol", GXutil.ltrimstr( A3705BarCosCol, 10, 2));
         A3706BarCosAnc = T01PK3_A3706BarCosAnc[0] ;
         n3706BarCosAnc = T01PK3_n3706BarCosAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3706BarCosAnc", GXutil.ltrimstr( A3706BarCosAnc, 10, 2));
         A4923BarNumActx = T01PK3_A4923BarNumActx[0] ;
         n4923BarNumActx = T01PK3_n4923BarNumActx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4923BarNumActx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4923BarNumActx), 4, 0));
         A4924BarNumPda = T01PK3_A4924BarNumPda[0] ;
         n4924BarNumPda = T01PK3_n4924BarNumPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4924BarNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4924BarNumPda), 6, 0));
         A4925BarFaseCod = T01PK3_A4925BarFaseCod[0] ;
         n4925BarFaseCod = T01PK3_n4925BarFaseCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4925BarFaseCod", A4925BarFaseCod);
         A4926BarFaseOrd = T01PK3_A4926BarFaseOrd[0] ;
         n4926BarFaseOrd = T01PK3_n4926BarFaseOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4926BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4926BarFaseOrd), 4, 0));
         A4977BarReoNum = T01PK3_A4977BarReoNum[0] ;
         n4977BarReoNum = T01PK3_n4977BarReoNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4977BarReoNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4977BarReoNum), 4, 0));
         A5169BarTipDTin = T01PK3_A5169BarTipDTin[0] ;
         n5169BarTipDTin = T01PK3_n5169BarTipDTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5169BarTipDTin", A5169BarTipDTin);
         A5170BarTipCTin = T01PK3_A5170BarTipCTin[0] ;
         n5170BarTipCTin = T01PK3_n5170BarTipCTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5170BarTipCTin", A5170BarTipCTin);
         A5171BarTipNTin = T01PK3_A5171BarTipNTin[0] ;
         n5171BarTipNTin = T01PK3_n5171BarTipNTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5171BarTipNTin", A5171BarTipNTin);
         A5899BarCosttTi = T01PK3_A5899BarCosttTi[0] ;
         n5899BarCosttTi = T01PK3_n5899BarCosttTi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5899BarCosttTi", GXutil.ltrimstr( A5899BarCosttTi, 11, 5));
         A5900BarRbTeo = T01PK3_A5900BarRbTeo[0] ;
         n5900BarRbTeo = T01PK3_n5900BarRbTeo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5900BarRbTeo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5900BarRbTeo), 4, 0));
         A6177BarNumTin = T01PK3_A6177BarNumTin[0] ;
         n6177BarNumTin = T01PK3_n6177BarNumTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6177BarNumTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6177BarNumTin), 8, 0));
         A6431BarCausa = T01PK3_A6431BarCausa[0] ;
         n6431BarCausa = T01PK3_n6431BarCausa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6431BarCausa), 4, 0));
         A6634BarRecAcb = T01PK3_A6634BarRecAcb[0] ;
         n6634BarRecAcb = T01PK3_n6634BarRecAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6634BarRecAcb", A6634BarRecAcb);
         A8563BarKgsTt = T01PK3_A8563BarKgsTt[0] ;
         n8563BarKgsTt = T01PK3_n8563BarKgsTt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8563BarKgsTt", GXutil.ltrimstr( A8563BarKgsTt, 10, 2));
         A8584FamCodT = T01PK3_A8584FamCodT[0] ;
         n8584FamCodT = T01PK3_n8584FamCodT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8584FamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8584FamCodT), 4, 0));
         A8609BarForNum = T01PK3_A8609BarForNum[0] ;
         n8609BarForNum = T01PK3_n8609BarForNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8609BarForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8609BarForNum), 8, 0));
         A9754BarNTint = T01PK3_A9754BarNTint[0] ;
         n9754BarNTint = T01PK3_n9754BarNTint[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9754BarNTint", GXutil.str( A9754BarNTint, 1, 0));
         A10539BarAcs = T01PK3_A10539BarAcs[0] ;
         n10539BarAcs = T01PK3_n10539BarAcs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10539BarAcs", A10539BarAcs);
         A10540BarNprg = T01PK3_A10540BarNprg[0] ;
         n10540BarNprg = T01PK3_n10540BarNprg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10540BarNprg", A10540BarNprg);
         A10541BarLts = T01PK3_A10541BarLts[0] ;
         n10541BarLts = T01PK3_n10541BarLts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10541BarLts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10541BarLts), 5, 0));
         A10546BarLtsV = T01PK3_A10546BarLtsV[0] ;
         n10546BarLtsV = T01PK3_n10546BarLtsV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10546BarLtsV", GXutil.ltrimstr( A10546BarLtsV, 10, 2));
         A11177BarFecIt = T01PK3_A11177BarFecIt[0] ;
         n11177BarFecIt = T01PK3_n11177BarFecIt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11177BarFecIt", localUtil.ttoc( A11177BarFecIt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11178BarFecFt = T01PK3_A11178BarFecFt[0] ;
         n11178BarFecFt = T01PK3_n11178BarFecFt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11178BarFecFt", localUtil.ttoc( A11178BarFecFt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11179BarColNm = T01PK3_A11179BarColNm[0] ;
         n11179BarColNm = T01PK3_n11179BarColNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11179BarColNm", A11179BarColNm);
         A11762BarDispCli = T01PK3_A11762BarDispCli[0] ;
         n11762BarDispCli = T01PK3_n11762BarDispCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11762BarDispCli", A11762BarDispCli);
         A12993BarMtsTt = T01PK3_A12993BarMtsTt[0] ;
         n12993BarMtsTt = T01PK3_n12993BarMtsTt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12993BarMtsTt", GXutil.ltrimstr( A12993BarMtsTt, 10, 2));
         A13759EstFecCier = T01PK3_A13759EstFecCier[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
         A13760EstCdn1 = T01PK3_A13760EstCdn1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13760EstCdn1), 4, 0));
         A13761EstCdn2 = T01PK3_A13761EstCdn2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13761EstCdn2", A13761EstCdn2);
         A13762EstCtw = T01PK3_A13762EstCtw[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13762EstCtw", A13762EstCtw);
         A396EmprCod = T01PK3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01PK3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A3646EstTinAny = T01PK3_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T01PK3_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T01PK3_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z3646EstTinAny = A3646EstTinAny ;
         Z3647EstTinMes = A3647EstTinMes ;
         Z3648EstTinDia = A3648EstTinDia ;
         Z1929EstTinNr = A1929EstTinNr ;
         sMode510 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1PK510( ) ;
         if ( AnyError == 1 )
         {
            RcdFound510 = (short)(0) ;
            initializeNonKey1PK510( ) ;
         }
         Gx_mode = sMode510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound510 = (short)(0) ;
         initializeNonKey1PK510( ) ;
         sMode510 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode510 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1PK510( ) ;
      if ( RcdFound510 == 0 )
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
      RcdFound510 = (short)(0) ;
      /* Using cursor T01PK22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A3646EstTinAny), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A3646EstTinAny[0] < A3646EstTinAny ) || ( T01PK22_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A3647EstTinMes[0] < A3647EstTinMes ) || ( T01PK22_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK22_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A3648EstTinDia[0] < A3648EstTinDia ) || ( T01PK22_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01PK22_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK22_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A1929EstTinNr[0] < A1929EstTinNr ) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A3646EstTinAny[0] > A3646EstTinAny ) || ( T01PK22_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A3647EstTinMes[0] > A3647EstTinMes ) || ( T01PK22_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK22_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A3648EstTinDia[0] > A3648EstTinDia ) || ( T01PK22_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01PK22_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK22_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK22_A1929EstTinNr[0] > A1929EstTinNr ) ) )
         {
            A396EmprCod = T01PK22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = T01PK22_A3646EstTinAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = T01PK22_A3647EstTinMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = T01PK22_A3648EstTinDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            A1929EstTinNr = T01PK22_A1929EstTinNr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
            RcdFound510 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound510 = (short)(0) ;
      /* Using cursor T01PK23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A3646EstTinAny), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3648EstTinDia), Byte.valueOf(A3647EstTinMes), Short.valueOf(A3646EstTinAny), A396EmprCod, Short.valueOf(A1929EstTinNr)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A3646EstTinAny[0] > A3646EstTinAny ) || ( T01PK23_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A3647EstTinMes[0] > A3647EstTinMes ) || ( T01PK23_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK23_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A3648EstTinDia[0] > A3648EstTinDia ) || ( T01PK23_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01PK23_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK23_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A1929EstTinNr[0] > A1929EstTinNr ) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A3646EstTinAny[0] < A3646EstTinAny ) || ( T01PK23_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A3647EstTinMes[0] < A3647EstTinMes ) || ( T01PK23_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK23_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A3648EstTinDia[0] < A3648EstTinDia ) || ( T01PK23_A3648EstTinDia[0] == A3648EstTinDia ) && ( T01PK23_A3647EstTinMes[0] == A3647EstTinMes ) && ( T01PK23_A3646EstTinAny[0] == A3646EstTinAny ) && ( GXutil.strcmp(T01PK23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PK23_A1929EstTinNr[0] < A1929EstTinNr ) ) )
         {
            A396EmprCod = T01PK23_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A3646EstTinAny = T01PK23_A3646EstTinAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
            A3647EstTinMes = T01PK23_A3647EstTinMes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
            A3648EstTinDia = T01PK23_A3648EstTinDia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
            A1929EstTinNr = T01PK23_A1929EstTinNr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
            RcdFound510 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PK510( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PK510( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound510 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) || ( A1929EstTinNr != Z1929EstTinNr ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A3646EstTinAny = Z3646EstTinAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
               A3647EstTinMes = Z3647EstTinMes ;
               httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
               A3648EstTinDia = Z3648EstTinDia ;
               httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
               A1929EstTinNr = Z1929EstTinNr ;
               httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
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
               update1PK510( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) || ( A1929EstTinNr != Z1929EstTinNr ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PK510( ) ;
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
                  insert1PK510( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A3646EstTinAny != Z3646EstTinAny ) || ( A3647EstTinMes != Z3647EstTinMes ) || ( A3648EstTinDia != Z3648EstTinDia ) || ( A1929EstTinNr != Z1929EstTinNr ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = Z3646EstTinAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = Z3647EstTinMes ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = Z3648EstTinDia ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = Z1929EstTinNr ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
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
      if ( RcdFound510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1PK510( ) ;
      if ( RcdFound510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PK510( ) ;
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
      if ( RcdFound510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      if ( RcdFound510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
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
      scanStart1PK510( ) ;
      if ( RcdFound510 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound510 != 0 )
         {
            scanNext1PK510( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCliCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1PK510( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1PK510( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCONTI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1933BarCodTin != T01PK2_A1933BarCodTin[0] ) || ( Z1934BarReoTin != T01PK2_A1934BarReoTin[0] ) || ( GXutil.strcmp(Z1935BarParTin, T01PK2_A1935BarParTin[0]) != 0 ) || ( GXutil.strcmp(Z1936BarSerTin, T01PK2_A1936BarSerTin[0]) != 0 ) || ( GXutil.strcmp(Z1937BarDscTin, T01PK2_A1937BarDscTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1939BarArtTin != T01PK2_A1939BarArtTin[0] ) || ( GXutil.strcmp(Z1940BarColNoT, T01PK2_A1940BarColNoT[0]) != 0 ) || ( Z1941BarColNuT != T01PK2_A1941BarColNuT[0] ) || ( Z1942BarTipCoT != T01PK2_A1942BarTipCoT[0] ) || ( GXutil.strcmp(Z1943BarNomClT, T01PK2_A1943BarNomClT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1944BarNumClT != T01PK2_A1944BarNumClT[0] ) || ( GXutil.strcmp(Z1945BarMaqTin, T01PK2_A1945BarMaqTin[0]) != 0 ) || ( Z1946BarVolTin != T01PK2_A1946BarVolTin[0] ) || ( DecimalUtil.compareTo(Z1947BarKgmTin, T01PK2_A1947BarKgmTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z1948BarMtrTin, T01PK2_A1948BarMtrTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1949BarPieTin != T01PK2_A1949BarPieTin[0] ) || ( Z2304BarEstTin != T01PK2_A2304BarEstTin[0] ) || ( GXutil.strcmp(Z2316BarAgrLot, T01PK2_A2316BarAgrLot[0]) != 0 ) || ( Z3650BarNumAna != T01PK2_A3650BarNumAna[0] ) || ( Z3651BarTipDef != T01PK2_A3651BarTipDef[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3652BarIntens != T01PK2_A3652BarIntens[0] ) || ( GXutil.strcmp(Z3653BarPriCod, T01PK2_A3653BarPriCod[0]) != 0 ) || ( DecimalUtil.compareTo(Z3654BarCosPD, T01PK2_A3654BarCosPD[0]) != 0 ) || ( DecimalUtil.compareTo(Z3658BarCosPA, T01PK2_A3658BarCosPA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3656BarCosAD, T01PK2_A3656BarCosAD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3657BarCosAA, T01PK2_A3657BarCosAA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3705BarCosCol, T01PK2_A3705BarCosCol[0]) != 0 ) || ( DecimalUtil.compareTo(Z3706BarCosAnc, T01PK2_A3706BarCosAnc[0]) != 0 ) || ( Z4923BarNumActx != T01PK2_A4923BarNumActx[0] ) || ( Z4924BarNumPda != T01PK2_A4924BarNumPda[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4925BarFaseCod, T01PK2_A4925BarFaseCod[0]) != 0 ) || ( Z4926BarFaseOrd != T01PK2_A4926BarFaseOrd[0] ) || ( Z4977BarReoNum != T01PK2_A4977BarReoNum[0] ) || ( GXutil.strcmp(Z5169BarTipDTin, T01PK2_A5169BarTipDTin[0]) != 0 ) || ( GXutil.strcmp(Z5170BarTipCTin, T01PK2_A5170BarTipCTin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5171BarTipNTin, T01PK2_A5171BarTipNTin[0]) != 0 ) || ( DecimalUtil.compareTo(Z5899BarCosttTi, T01PK2_A5899BarCosttTi[0]) != 0 ) || ( Z5900BarRbTeo != T01PK2_A5900BarRbTeo[0] ) || ( Z6177BarNumTin != T01PK2_A6177BarNumTin[0] ) || ( Z6431BarCausa != T01PK2_A6431BarCausa[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z6634BarRecAcb, T01PK2_A6634BarRecAcb[0]) != 0 ) || ( DecimalUtil.compareTo(Z8563BarKgsTt, T01PK2_A8563BarKgsTt[0]) != 0 ) || ( Z8584FamCodT != T01PK2_A8584FamCodT[0] ) || ( Z8609BarForNum != T01PK2_A8609BarForNum[0] ) || ( Z9754BarNTint != T01PK2_A9754BarNTint[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10539BarAcs, T01PK2_A10539BarAcs[0]) != 0 ) || ( GXutil.strcmp(Z10540BarNprg, T01PK2_A10540BarNprg[0]) != 0 ) || ( Z10541BarLts != T01PK2_A10541BarLts[0] ) || ( DecimalUtil.compareTo(Z10546BarLtsV, T01PK2_A10546BarLtsV[0]) != 0 ) || !( GXutil.dateCompare(Z11177BarFecIt, T01PK2_A11177BarFecIt[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z11178BarFecFt, T01PK2_A11178BarFecFt[0]) ) || ( GXutil.strcmp(Z11179BarColNm, T01PK2_A11179BarColNm[0]) != 0 ) || ( GXutil.strcmp(Z11762BarDispCli, T01PK2_A11762BarDispCli[0]) != 0 ) || ( DecimalUtil.compareTo(Z12993BarMtsTt, T01PK2_A12993BarMtsTt[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13759EstFecCier), GXutil.resetTime(T01PK2_A13759EstFecCier[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z13760EstCdn1 != T01PK2_A13760EstCdn1[0] ) || ( GXutil.strcmp(Z13761EstCdn2, T01PK2_A13761EstCdn2[0]) != 0 ) || ( GXutil.strcmp(Z13762EstCtw, T01PK2_A13762EstCtw[0]) != 0 ) || ( Z252CliCod != T01PK2_A252CliCod[0] ) )
         {
            if ( Z1933BarCodTin != T01PK2_A1933BarCodTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCodTin");
               GXutil.writeLogRaw("Old: ",Z1933BarCodTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1933BarCodTin[0]);
            }
            if ( Z1934BarReoTin != T01PK2_A1934BarReoTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarReoTin");
               GXutil.writeLogRaw("Old: ",Z1934BarReoTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1934BarReoTin[0]);
            }
            if ( GXutil.strcmp(Z1935BarParTin, T01PK2_A1935BarParTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarParTin");
               GXutil.writeLogRaw("Old: ",Z1935BarParTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1935BarParTin[0]);
            }
            if ( GXutil.strcmp(Z1936BarSerTin, T01PK2_A1936BarSerTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarSerTin");
               GXutil.writeLogRaw("Old: ",Z1936BarSerTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1936BarSerTin[0]);
            }
            if ( GXutil.strcmp(Z1937BarDscTin, T01PK2_A1937BarDscTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarDscTin");
               GXutil.writeLogRaw("Old: ",Z1937BarDscTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1937BarDscTin[0]);
            }
            if ( Z1939BarArtTin != T01PK2_A1939BarArtTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarArtTin");
               GXutil.writeLogRaw("Old: ",Z1939BarArtTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1939BarArtTin[0]);
            }
            if ( GXutil.strcmp(Z1940BarColNoT, T01PK2_A1940BarColNoT[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarColNoT");
               GXutil.writeLogRaw("Old: ",Z1940BarColNoT);
               GXutil.writeLogRaw("Current: ",T01PK2_A1940BarColNoT[0]);
            }
            if ( Z1941BarColNuT != T01PK2_A1941BarColNuT[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarColNuT");
               GXutil.writeLogRaw("Old: ",Z1941BarColNuT);
               GXutil.writeLogRaw("Current: ",T01PK2_A1941BarColNuT[0]);
            }
            if ( Z1942BarTipCoT != T01PK2_A1942BarTipCoT[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarTipCoT");
               GXutil.writeLogRaw("Old: ",Z1942BarTipCoT);
               GXutil.writeLogRaw("Current: ",T01PK2_A1942BarTipCoT[0]);
            }
            if ( GXutil.strcmp(Z1943BarNomClT, T01PK2_A1943BarNomClT[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNomClT");
               GXutil.writeLogRaw("Old: ",Z1943BarNomClT);
               GXutil.writeLogRaw("Current: ",T01PK2_A1943BarNomClT[0]);
            }
            if ( Z1944BarNumClT != T01PK2_A1944BarNumClT[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNumClT");
               GXutil.writeLogRaw("Old: ",Z1944BarNumClT);
               GXutil.writeLogRaw("Current: ",T01PK2_A1944BarNumClT[0]);
            }
            if ( GXutil.strcmp(Z1945BarMaqTin, T01PK2_A1945BarMaqTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarMaqTin");
               GXutil.writeLogRaw("Old: ",Z1945BarMaqTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1945BarMaqTin[0]);
            }
            if ( Z1946BarVolTin != T01PK2_A1946BarVolTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarVolTin");
               GXutil.writeLogRaw("Old: ",Z1946BarVolTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1946BarVolTin[0]);
            }
            if ( DecimalUtil.compareTo(Z1947BarKgmTin, T01PK2_A1947BarKgmTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarKgmTin");
               GXutil.writeLogRaw("Old: ",Z1947BarKgmTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1947BarKgmTin[0]);
            }
            if ( DecimalUtil.compareTo(Z1948BarMtrTin, T01PK2_A1948BarMtrTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarMtrTin");
               GXutil.writeLogRaw("Old: ",Z1948BarMtrTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1948BarMtrTin[0]);
            }
            if ( Z1949BarPieTin != T01PK2_A1949BarPieTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarPieTin");
               GXutil.writeLogRaw("Old: ",Z1949BarPieTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A1949BarPieTin[0]);
            }
            if ( Z2304BarEstTin != T01PK2_A2304BarEstTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarEstTin");
               GXutil.writeLogRaw("Old: ",Z2304BarEstTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A2304BarEstTin[0]);
            }
            if ( GXutil.strcmp(Z2316BarAgrLot, T01PK2_A2316BarAgrLot[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarAgrLot");
               GXutil.writeLogRaw("Old: ",Z2316BarAgrLot);
               GXutil.writeLogRaw("Current: ",T01PK2_A2316BarAgrLot[0]);
            }
            if ( Z3650BarNumAna != T01PK2_A3650BarNumAna[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNumAna");
               GXutil.writeLogRaw("Old: ",Z3650BarNumAna);
               GXutil.writeLogRaw("Current: ",T01PK2_A3650BarNumAna[0]);
            }
            if ( Z3651BarTipDef != T01PK2_A3651BarTipDef[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarTipDef");
               GXutil.writeLogRaw("Old: ",Z3651BarTipDef);
               GXutil.writeLogRaw("Current: ",T01PK2_A3651BarTipDef[0]);
            }
            if ( Z3652BarIntens != T01PK2_A3652BarIntens[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarIntens");
               GXutil.writeLogRaw("Old: ",Z3652BarIntens);
               GXutil.writeLogRaw("Current: ",T01PK2_A3652BarIntens[0]);
            }
            if ( GXutil.strcmp(Z3653BarPriCod, T01PK2_A3653BarPriCod[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarPriCod");
               GXutil.writeLogRaw("Old: ",Z3653BarPriCod);
               GXutil.writeLogRaw("Current: ",T01PK2_A3653BarPriCod[0]);
            }
            if ( DecimalUtil.compareTo(Z3654BarCosPD, T01PK2_A3654BarCosPD[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosPD");
               GXutil.writeLogRaw("Old: ",Z3654BarCosPD);
               GXutil.writeLogRaw("Current: ",T01PK2_A3654BarCosPD[0]);
            }
            if ( DecimalUtil.compareTo(Z3658BarCosPA, T01PK2_A3658BarCosPA[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosPA");
               GXutil.writeLogRaw("Old: ",Z3658BarCosPA);
               GXutil.writeLogRaw("Current: ",T01PK2_A3658BarCosPA[0]);
            }
            if ( DecimalUtil.compareTo(Z3656BarCosAD, T01PK2_A3656BarCosAD[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosAD");
               GXutil.writeLogRaw("Old: ",Z3656BarCosAD);
               GXutil.writeLogRaw("Current: ",T01PK2_A3656BarCosAD[0]);
            }
            if ( DecimalUtil.compareTo(Z3657BarCosAA, T01PK2_A3657BarCosAA[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosAA");
               GXutil.writeLogRaw("Old: ",Z3657BarCosAA);
               GXutil.writeLogRaw("Current: ",T01PK2_A3657BarCosAA[0]);
            }
            if ( DecimalUtil.compareTo(Z3705BarCosCol, T01PK2_A3705BarCosCol[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosCol");
               GXutil.writeLogRaw("Old: ",Z3705BarCosCol);
               GXutil.writeLogRaw("Current: ",T01PK2_A3705BarCosCol[0]);
            }
            if ( DecimalUtil.compareTo(Z3706BarCosAnc, T01PK2_A3706BarCosAnc[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosAnc");
               GXutil.writeLogRaw("Old: ",Z3706BarCosAnc);
               GXutil.writeLogRaw("Current: ",T01PK2_A3706BarCosAnc[0]);
            }
            if ( Z4923BarNumActx != T01PK2_A4923BarNumActx[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNumActx");
               GXutil.writeLogRaw("Old: ",Z4923BarNumActx);
               GXutil.writeLogRaw("Current: ",T01PK2_A4923BarNumActx[0]);
            }
            if ( Z4924BarNumPda != T01PK2_A4924BarNumPda[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNumPda");
               GXutil.writeLogRaw("Old: ",Z4924BarNumPda);
               GXutil.writeLogRaw("Current: ",T01PK2_A4924BarNumPda[0]);
            }
            if ( GXutil.strcmp(Z4925BarFaseCod, T01PK2_A4925BarFaseCod[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarFaseCod");
               GXutil.writeLogRaw("Old: ",Z4925BarFaseCod);
               GXutil.writeLogRaw("Current: ",T01PK2_A4925BarFaseCod[0]);
            }
            if ( Z4926BarFaseOrd != T01PK2_A4926BarFaseOrd[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarFaseOrd");
               GXutil.writeLogRaw("Old: ",Z4926BarFaseOrd);
               GXutil.writeLogRaw("Current: ",T01PK2_A4926BarFaseOrd[0]);
            }
            if ( Z4977BarReoNum != T01PK2_A4977BarReoNum[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarReoNum");
               GXutil.writeLogRaw("Old: ",Z4977BarReoNum);
               GXutil.writeLogRaw("Current: ",T01PK2_A4977BarReoNum[0]);
            }
            if ( GXutil.strcmp(Z5169BarTipDTin, T01PK2_A5169BarTipDTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarTipDTin");
               GXutil.writeLogRaw("Old: ",Z5169BarTipDTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A5169BarTipDTin[0]);
            }
            if ( GXutil.strcmp(Z5170BarTipCTin, T01PK2_A5170BarTipCTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarTipCTin");
               GXutil.writeLogRaw("Old: ",Z5170BarTipCTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A5170BarTipCTin[0]);
            }
            if ( GXutil.strcmp(Z5171BarTipNTin, T01PK2_A5171BarTipNTin[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarTipNTin");
               GXutil.writeLogRaw("Old: ",Z5171BarTipNTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A5171BarTipNTin[0]);
            }
            if ( DecimalUtil.compareTo(Z5899BarCosttTi, T01PK2_A5899BarCosttTi[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCosttTi");
               GXutil.writeLogRaw("Old: ",Z5899BarCosttTi);
               GXutil.writeLogRaw("Current: ",T01PK2_A5899BarCosttTi[0]);
            }
            if ( Z5900BarRbTeo != T01PK2_A5900BarRbTeo[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarRbTeo");
               GXutil.writeLogRaw("Old: ",Z5900BarRbTeo);
               GXutil.writeLogRaw("Current: ",T01PK2_A5900BarRbTeo[0]);
            }
            if ( Z6177BarNumTin != T01PK2_A6177BarNumTin[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNumTin");
               GXutil.writeLogRaw("Old: ",Z6177BarNumTin);
               GXutil.writeLogRaw("Current: ",T01PK2_A6177BarNumTin[0]);
            }
            if ( Z6431BarCausa != T01PK2_A6431BarCausa[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarCausa");
               GXutil.writeLogRaw("Old: ",Z6431BarCausa);
               GXutil.writeLogRaw("Current: ",T01PK2_A6431BarCausa[0]);
            }
            if ( GXutil.strcmp(Z6634BarRecAcb, T01PK2_A6634BarRecAcb[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarRecAcb");
               GXutil.writeLogRaw("Old: ",Z6634BarRecAcb);
               GXutil.writeLogRaw("Current: ",T01PK2_A6634BarRecAcb[0]);
            }
            if ( DecimalUtil.compareTo(Z8563BarKgsTt, T01PK2_A8563BarKgsTt[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarKgsTt");
               GXutil.writeLogRaw("Old: ",Z8563BarKgsTt);
               GXutil.writeLogRaw("Current: ",T01PK2_A8563BarKgsTt[0]);
            }
            if ( Z8584FamCodT != T01PK2_A8584FamCodT[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"FamCodT");
               GXutil.writeLogRaw("Old: ",Z8584FamCodT);
               GXutil.writeLogRaw("Current: ",T01PK2_A8584FamCodT[0]);
            }
            if ( Z8609BarForNum != T01PK2_A8609BarForNum[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarForNum");
               GXutil.writeLogRaw("Old: ",Z8609BarForNum);
               GXutil.writeLogRaw("Current: ",T01PK2_A8609BarForNum[0]);
            }
            if ( Z9754BarNTint != T01PK2_A9754BarNTint[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNTint");
               GXutil.writeLogRaw("Old: ",Z9754BarNTint);
               GXutil.writeLogRaw("Current: ",T01PK2_A9754BarNTint[0]);
            }
            if ( GXutil.strcmp(Z10539BarAcs, T01PK2_A10539BarAcs[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarAcs");
               GXutil.writeLogRaw("Old: ",Z10539BarAcs);
               GXutil.writeLogRaw("Current: ",T01PK2_A10539BarAcs[0]);
            }
            if ( GXutil.strcmp(Z10540BarNprg, T01PK2_A10540BarNprg[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarNprg");
               GXutil.writeLogRaw("Old: ",Z10540BarNprg);
               GXutil.writeLogRaw("Current: ",T01PK2_A10540BarNprg[0]);
            }
            if ( Z10541BarLts != T01PK2_A10541BarLts[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarLts");
               GXutil.writeLogRaw("Old: ",Z10541BarLts);
               GXutil.writeLogRaw("Current: ",T01PK2_A10541BarLts[0]);
            }
            if ( DecimalUtil.compareTo(Z10546BarLtsV, T01PK2_A10546BarLtsV[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarLtsV");
               GXutil.writeLogRaw("Old: ",Z10546BarLtsV);
               GXutil.writeLogRaw("Current: ",T01PK2_A10546BarLtsV[0]);
            }
            if ( !( GXutil.dateCompare(Z11177BarFecIt, T01PK2_A11177BarFecIt[0]) ) )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarFecIt");
               GXutil.writeLogRaw("Old: ",Z11177BarFecIt);
               GXutil.writeLogRaw("Current: ",T01PK2_A11177BarFecIt[0]);
            }
            if ( !( GXutil.dateCompare(Z11178BarFecFt, T01PK2_A11178BarFecFt[0]) ) )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarFecFt");
               GXutil.writeLogRaw("Old: ",Z11178BarFecFt);
               GXutil.writeLogRaw("Current: ",T01PK2_A11178BarFecFt[0]);
            }
            if ( GXutil.strcmp(Z11179BarColNm, T01PK2_A11179BarColNm[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarColNm");
               GXutil.writeLogRaw("Old: ",Z11179BarColNm);
               GXutil.writeLogRaw("Current: ",T01PK2_A11179BarColNm[0]);
            }
            if ( GXutil.strcmp(Z11762BarDispCli, T01PK2_A11762BarDispCli[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarDispCli");
               GXutil.writeLogRaw("Old: ",Z11762BarDispCli);
               GXutil.writeLogRaw("Current: ",T01PK2_A11762BarDispCli[0]);
            }
            if ( DecimalUtil.compareTo(Z12993BarMtsTt, T01PK2_A12993BarMtsTt[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"BarMtsTt");
               GXutil.writeLogRaw("Old: ",Z12993BarMtsTt);
               GXutil.writeLogRaw("Current: ",T01PK2_A12993BarMtsTt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13759EstFecCier), GXutil.resetTime(T01PK2_A13759EstFecCier[0])) ) )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"EstFecCier");
               GXutil.writeLogRaw("Old: ",Z13759EstFecCier);
               GXutil.writeLogRaw("Current: ",T01PK2_A13759EstFecCier[0]);
            }
            if ( Z13760EstCdn1 != T01PK2_A13760EstCdn1[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"EstCdn1");
               GXutil.writeLogRaw("Old: ",Z13760EstCdn1);
               GXutil.writeLogRaw("Current: ",T01PK2_A13760EstCdn1[0]);
            }
            if ( GXutil.strcmp(Z13761EstCdn2, T01PK2_A13761EstCdn2[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"EstCdn2");
               GXutil.writeLogRaw("Old: ",Z13761EstCdn2);
               GXutil.writeLogRaw("Current: ",T01PK2_A13761EstCdn2[0]);
            }
            if ( GXutil.strcmp(Z13762EstCtw, T01PK2_A13762EstCtw[0]) != 0 )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"EstCtw");
               GXutil.writeLogRaw("Old: ",Z13762EstCtw);
               GXutil.writeLogRaw("Current: ",T01PK2_A13762EstCtw[0]);
            }
            if ( Z252CliCod != T01PK2_A252CliCod[0] )
            {
               GXutil.writeLogln("lconti:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01PK2_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCONTI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PK510( )
   {
      beforeValidate1PK510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PK510( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PK510( 0) ;
         checkOptimisticConcurrency1PK510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PK510( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PK510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PK24 */
                  pr_default.execute(22, new Object[] {Short.valueOf(A1929EstTinNr), Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4924BarNumPda), Integer.valueOf(A4924BarNumPda), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5171BarTipNTin), A5171BarTipNTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n8609BarForNum), Integer.valueOf(A8609BarForNum), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11177BarFecIt), A11177BarFecIt, Boolean.valueOf(n11178BarFecFt), A11178BarFecFt, Boolean.valueOf(n11179BarColNm), A11179BarColNm, Boolean.valueOf(n11762BarDispCli), A11762BarDispCli, Boolean.valueOf(n12993BarMtsTt), A12993BarMtsTt, A13759EstFecCier, Short.valueOf(A13760EstCdn1), A13761EstCdn2, A13762EstCtw, A396EmprCod, Integer.valueOf(A252CliCod), Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
                  if ( (pr_default.getStatus(22) == 1) )
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
                        resetCaption1PK0( ) ;
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
            load1PK510( ) ;
         }
         endLevel1PK510( ) ;
      }
      closeExtendedTableCursors1PK510( ) ;
   }

   public void update1PK510( )
   {
      beforeValidate1PK510( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PK510( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PK510( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PK510( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PK510( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PK25 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n1933BarCodTin), Integer.valueOf(A1933BarCodTin), Boolean.valueOf(n1934BarReoTin), Byte.valueOf(A1934BarReoTin), Boolean.valueOf(n1935BarParTin), A1935BarParTin, Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1937BarDscTin), A1937BarDscTin, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin), Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT), Boolean.valueOf(n1943BarNomClT), A1943BarNomClT, Boolean.valueOf(n1944BarNumClT), Integer.valueOf(A1944BarNumClT), Boolean.valueOf(n1945BarMaqTin), A1945BarMaqTin, Boolean.valueOf(n1946BarVolTin), Integer.valueOf(A1946BarVolTin), Boolean.valueOf(n1947BarKgmTin), A1947BarKgmTin, Boolean.valueOf(n1948BarMtrTin), A1948BarMtrTin, Boolean.valueOf(n1949BarPieTin), Integer.valueOf(A1949BarPieTin), Boolean.valueOf(n2304BarEstTin), Byte.valueOf(A2304BarEstTin), Boolean.valueOf(n2316BarAgrLot), A2316BarAgrLot, Boolean.valueOf(n3650BarNumAna), Short.valueOf(A3650BarNumAna), Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef), Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens), Boolean.valueOf(n3653BarPriCod), A3653BarPriCod, Boolean.valueOf(n3654BarCosPD), A3654BarCosPD, Boolean.valueOf(n3658BarCosPA), A3658BarCosPA, Boolean.valueOf(n3656BarCosAD), A3656BarCosAD, Boolean.valueOf(n3657BarCosAA), A3657BarCosAA, Boolean.valueOf(n3705BarCosCol), A3705BarCosCol, Boolean.valueOf(n3706BarCosAnc), A3706BarCosAnc, Boolean.valueOf(n4923BarNumActx), Short.valueOf(A4923BarNumActx), Boolean.valueOf(n4924BarNumPda), Integer.valueOf(A4924BarNumPda), Boolean.valueOf(n4925BarFaseCod), A4925BarFaseCod, Boolean.valueOf(n4926BarFaseOrd), Short.valueOf(A4926BarFaseOrd), Boolean.valueOf(n4977BarReoNum), Short.valueOf(A4977BarReoNum), Boolean.valueOf(n5169BarTipDTin), A5169BarTipDTin, Boolean.valueOf(n5170BarTipCTin), A5170BarTipCTin, Boolean.valueOf(n5171BarTipNTin), A5171BarTipNTin, Boolean.valueOf(n5899BarCosttTi), A5899BarCosttTi, Boolean.valueOf(n5900BarRbTeo), Short.valueOf(A5900BarRbTeo), Boolean.valueOf(n6177BarNumTin), Integer.valueOf(A6177BarNumTin), Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa), Boolean.valueOf(n6634BarRecAcb), A6634BarRecAcb, Boolean.valueOf(n8563BarKgsTt), A8563BarKgsTt, Boolean.valueOf(n8584FamCodT), Short.valueOf(A8584FamCodT), Boolean.valueOf(n8609BarForNum), Integer.valueOf(A8609BarForNum), Boolean.valueOf(n9754BarNTint), Byte.valueOf(A9754BarNTint), Boolean.valueOf(n10539BarAcs), A10539BarAcs, Boolean.valueOf(n10540BarNprg), A10540BarNprg, Boolean.valueOf(n10541BarLts), Integer.valueOf(A10541BarLts), Boolean.valueOf(n10546BarLtsV), A10546BarLtsV, Boolean.valueOf(n11177BarFecIt), A11177BarFecIt, Boolean.valueOf(n11178BarFecFt), A11178BarFecFt, Boolean.valueOf(n11179BarColNm), A11179BarColNm, Boolean.valueOf(n11762BarDispCli), A11762BarDispCli, Boolean.valueOf(n12993BarMtsTt), A12993BarMtsTt, A13759EstFecCier, Short.valueOf(A13760EstCdn1), A13761EstCdn2, A13762EstCtw, Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCONTI"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1PK510( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1PK0( ) ;
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
         endLevel1PK510( ) ;
      }
      closeExtendedTableCursors1PK510( ) ;
   }

   public void deferredUpdate1PK510( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PK510( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PK510( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PK510( ) ;
         afterConfirm1PK510( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PK510( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PK26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCONTI");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound510 == 0 )
                     {
                        initAll1PK510( ) ;
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
                     resetCaption1PK0( ) ;
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
      sMode510 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PK510( ) ;
      Gx_mode = sMode510 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PK510( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PK27 */
         pr_default.execute(25, new Object[] {A396EmprCod});
         A407EmprNom = T01PK27_A407EmprNom[0] ;
         n407EmprNom = T01PK27_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(25);
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
         httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
         /* Using cursor T01PK28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A13962BarArtTinD = T01PK28_A13962BarArtTinD[0] ;
            n13962BarArtTinD = T01PK28_n13962BarArtTinD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
         }
         else
         {
            A13962BarArtTinD = " " ;
            n13962BarArtTinD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
         }
         pr_default.close(26);
         /* Using cursor T01PK29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A13967BarNumEny = T01PK29_A13967BarNumEny[0] ;
            n13967BarNumEny = T01PK29_n13967BarNumEny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
         }
         else
         {
            A13967BarNumEny = 0 ;
            n13967BarNumEny = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
         }
         pr_default.close(27);
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
            }
         }
         /* Using cursor T01PK30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A13964BarTipDefD = T01PK30_A13964BarTipDefD[0] ;
            n13964BarTipDefD = T01PK30_n13964BarTipDefD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
         }
         else
         {
            A13964BarTipDefD = " " ;
            n13964BarTipDefD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
         }
         pr_default.close(28);
         /* Using cursor T01PK31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A13965BarIntDsc = T01PK31_A13965BarIntDsc[0] ;
            n13965BarIntDsc = T01PK31_n13965BarIntDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
         }
         else
         {
            A13965BarIntDsc = " " ;
            n13965BarIntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
         }
         pr_default.close(29);
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14199CosteInici", GXutil.ltrimstr( A14199CosteInici, 10, 2));
         A14200CosteAnyad = A3656BarCosAD.add(A3657BarCosAA).add(A3706BarCosAnc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14200CosteAnyad", GXutil.ltrimstr( A14200CosteAnyad, 10, 2));
         /* Using cursor T01PK32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            A13966BarCauDsc = T01PK32_A13966BarCauDsc[0] ;
            n13966BarCauDsc = T01PK32_n13966BarCauDsc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
         }
         else
         {
            A13966BarCauDsc = " " ;
            n13966BarCauDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
         }
         pr_default.close(30);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PK33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia), Short.valueOf(A1929EstTinNr)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void endLevel1PK510( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PK510( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lconti");
         if ( AnyError == 0 )
         {
            confirmValues1PK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lconti");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PK510( )
   {
      /* Using cursor T01PK34 */
      pr_default.execute(32);
      RcdFound510 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound510 = (short)(1) ;
         A396EmprCod = T01PK34_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T01PK34_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T01PK34_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T01PK34_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = T01PK34_A1929EstTinNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PK510( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound510 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound510 = (short)(1) ;
         A396EmprCod = T01PK34_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3646EstTinAny = T01PK34_A3646EstTinAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
         A3647EstTinMes = T01PK34_A3647EstTinMes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
         A3648EstTinDia = T01PK34_A3648EstTinDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
         A1929EstTinNr = T01PK34_A1929EstTinNr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
      }
   }

   public void scanEnd1PK510( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1PK510( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PK510( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PK510( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PK510( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PK510( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PK510( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PK510( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEstTinAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinAny_Enabled), 5, 0), true);
      edtEstTinMes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinMes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinMes_Enabled), 5, 0), true);
      edtEstTinDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinDia_Enabled), 5, 0), true);
      edtEstTinNr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTinNr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTinNr_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarnhdr_lc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarnhdr_lc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarnhdr_lc_Enabled), 5, 0), true);
      edtBarCodTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodTin_Enabled), 5, 0), true);
      edtBarReoTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarReoTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoTin_Enabled), 5, 0), true);
      edtBarParTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarParTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarParTin_Enabled), 5, 0), true);
      edtBarSerTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerTin_Enabled), 5, 0), true);
      edtBarDscTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDscTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDscTin_Enabled), 5, 0), true);
      edtBarArtTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarArtTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarArtTin_Enabled), 5, 0), true);
      edtBarArtTinD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarArtTinD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarArtTinD_Enabled), 5, 0), true);
      edtBarColNoT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNoT_Enabled), 5, 0), true);
      edtBarColNuT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNuT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNuT_Enabled), 5, 0), true);
      edtBarTipCoT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCoT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCoT_Enabled), 5, 0), true);
      edtBarTipCoTD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCoTD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCoTD_Enabled), 5, 0), true);
      edtBarNomClT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomClT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomClT_Enabled), 5, 0), true);
      edtBarNumClT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumClT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumClT_Enabled), 5, 0), true);
      edtBarMaqTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqTin_Enabled), 5, 0), true);
      edtBarVolTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolTin_Enabled), 5, 0), true);
      edtBarKgmTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgmTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgmTin_Enabled), 5, 0), true);
      edtBarMtrTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtrTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtrTin_Enabled), 5, 0), true);
      edtBarPieTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieTin_Enabled), 5, 0), true);
      edtBarEstTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTin_Enabled), 5, 0), true);
      edtBarAgrLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrLot_Enabled), 5, 0), true);
      edtBarNumAna_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumAna_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumAna_Enabled), 5, 0), true);
      edtBarTipDef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDef_Enabled), 5, 0), true);
      edtBarTipDefD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDefD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDefD_Enabled), 5, 0), true);
      edtBarIntens_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarIntens_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarIntens_Enabled), 5, 0), true);
      edtBarIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarIntDsc_Enabled), 5, 0), true);
      edtBarPriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPriCod_Enabled), 5, 0), true);
      edtBarCosPD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPD_Enabled), 5, 0), true);
      edtBarCosPA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosPA_Enabled), 5, 0), true);
      edtBarCosAD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAD_Enabled), 5, 0), true);
      edtBarCosAA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAA_Enabled), 5, 0), true);
      edtBarCosCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosCol_Enabled), 5, 0), true);
      edtBarCosAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosAnc_Enabled), 5, 0), true);
      edtBarNumActx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumActx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumActx_Enabled), 5, 0), true);
      edtBarNumPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumPda_Enabled), 5, 0), true);
      edtBarFaseCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFaseCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFaseCod_Enabled), 5, 0), true);
      edtBarFaseOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFaseOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFaseOrd_Enabled), 5, 0), true);
      edtBarReoNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarReoNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarReoNum_Enabled), 5, 0), true);
      edtBarTipDTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDTin_Enabled), 5, 0), true);
      edtBarTipCTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCTin_Enabled), 5, 0), true);
      edtBarTipNTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipNTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipNTin_Enabled), 5, 0), true);
      edtBarCosttTi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCosttTi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCosttTi_Enabled), 5, 0), true);
      edtBarRbTeo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRbTeo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRbTeo_Enabled), 5, 0), true);
      edtBarNumTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumTin_Enabled), 5, 0), true);
      edtBarCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCausa_Enabled), 5, 0), true);
      edtBarCauDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCauDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCauDsc_Enabled), 5, 0), true);
      edtBarRecAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarRecAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarRecAcb_Enabled), 5, 0), true);
      edtBarKgsTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKgsTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgsTt_Enabled), 5, 0), true);
      edtFamCodT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFamCodT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFamCodT_Enabled), 5, 0), true);
      edtBarForNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarForNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarForNum_Enabled), 5, 0), true);
      edtBarNTint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNTint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNTint_Enabled), 5, 0), true);
      edtBarAcs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcs_Enabled), 5, 0), true);
      edtBarNprg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNprg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNprg_Enabled), 5, 0), true);
      edtBarLts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLts_Enabled), 5, 0), true);
      edtBarLtsV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarLtsV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarLtsV_Enabled), 5, 0), true);
      edtBarFecIt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecIt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecIt_Enabled), 5, 0), true);
      edtBarFecFt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecFt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecFt_Enabled), 5, 0), true);
      edtBarColNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNm_Enabled), 5, 0), true);
      edtBarDispCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDispCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDispCli_Enabled), 5, 0), true);
      edtBarMtsTt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMtsTt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtsTt_Enabled), 5, 0), true);
      edtEstFecCier_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstFecCier_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstFecCier_Enabled), 5, 0), true);
      edtEstCdn1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCdn1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCdn1_Enabled), 5, 0), true);
      edtEstCdn2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCdn2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCdn2_Enabled), 5, 0), true);
      edtEstCtw_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCtw_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCtw_Enabled), 5, 0), true);
      edtBarNumEny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumEny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumEny_Enabled), 5, 0), true);
      edtBarNumtint_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumtint_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumtint_Enabled), 5, 0), true);
      edtCosteInici_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosteInici_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosteInici_Enabled), 5, 0), true);
      edtCosteAnyad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCosteAnyad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCosteAnyad_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1PK510( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1PK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lconti", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z3646EstTinAny", GXutil.ltrim( localUtil.ntoc( Z3646EstTinAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3647EstTinMes", GXutil.ltrim( localUtil.ntoc( Z3647EstTinMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3648EstTinDia", GXutil.ltrim( localUtil.ntoc( Z3648EstTinDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1929EstTinNr", GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1933BarCodTin", GXutil.ltrim( localUtil.ntoc( Z1933BarCodTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1934BarReoTin", GXutil.ltrim( localUtil.ntoc( Z1934BarReoTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1935BarParTin", GXutil.rtrim( Z1935BarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1936BarSerTin", GXutil.rtrim( Z1936BarSerTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1937BarDscTin", GXutil.rtrim( Z1937BarDscTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1939BarArtTin", GXutil.ltrim( localUtil.ntoc( Z1939BarArtTin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1940BarColNoT", GXutil.rtrim( Z1940BarColNoT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1941BarColNuT", GXutil.ltrim( localUtil.ntoc( Z1941BarColNuT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1942BarTipCoT", GXutil.ltrim( localUtil.ntoc( Z1942BarTipCoT, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1943BarNomClT", GXutil.rtrim( Z1943BarNomClT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1944BarNumClT", GXutil.ltrim( localUtil.ntoc( Z1944BarNumClT, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1945BarMaqTin", GXutil.rtrim( Z1945BarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1946BarVolTin", GXutil.ltrim( localUtil.ntoc( Z1946BarVolTin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1947BarKgmTin", GXutil.ltrim( localUtil.ntoc( Z1947BarKgmTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1948BarMtrTin", GXutil.ltrim( localUtil.ntoc( Z1948BarMtrTin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1949BarPieTin", GXutil.ltrim( localUtil.ntoc( Z1949BarPieTin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2304BarEstTin", GXutil.ltrim( localUtil.ntoc( Z2304BarEstTin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2316BarAgrLot", GXutil.rtrim( Z2316BarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3650BarNumAna", GXutil.ltrim( localUtil.ntoc( Z3650BarNumAna, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3651BarTipDef", GXutil.ltrim( localUtil.ntoc( Z3651BarTipDef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3652BarIntens", GXutil.ltrim( localUtil.ntoc( Z3652BarIntens, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3653BarPriCod", GXutil.rtrim( Z3653BarPriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3654BarCosPD", GXutil.ltrim( localUtil.ntoc( Z3654BarCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3658BarCosPA", GXutil.ltrim( localUtil.ntoc( Z3658BarCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3656BarCosAD", GXutil.ltrim( localUtil.ntoc( Z3656BarCosAD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3657BarCosAA", GXutil.ltrim( localUtil.ntoc( Z3657BarCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3705BarCosCol", GXutil.ltrim( localUtil.ntoc( Z3705BarCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3706BarCosAnc", GXutil.ltrim( localUtil.ntoc( Z3706BarCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4923BarNumActx", GXutil.ltrim( localUtil.ntoc( Z4923BarNumActx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4924BarNumPda", GXutil.ltrim( localUtil.ntoc( Z4924BarNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4925BarFaseCod", GXutil.rtrim( Z4925BarFaseCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4926BarFaseOrd", GXutil.ltrim( localUtil.ntoc( Z4926BarFaseOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4977BarReoNum", GXutil.ltrim( localUtil.ntoc( Z4977BarReoNum, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5169BarTipDTin", GXutil.rtrim( Z5169BarTipDTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5170BarTipCTin", GXutil.rtrim( Z5170BarTipCTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5171BarTipNTin", GXutil.rtrim( Z5171BarTipNTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5899BarCosttTi", GXutil.ltrim( localUtil.ntoc( Z5899BarCosttTi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5900BarRbTeo", GXutil.ltrim( localUtil.ntoc( Z5900BarRbTeo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6177BarNumTin", GXutil.ltrim( localUtil.ntoc( Z6177BarNumTin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6431BarCausa", GXutil.ltrim( localUtil.ntoc( Z6431BarCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6634BarRecAcb", GXutil.rtrim( Z6634BarRecAcb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8563BarKgsTt", GXutil.ltrim( localUtil.ntoc( Z8563BarKgsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8584FamCodT", GXutil.ltrim( localUtil.ntoc( Z8584FamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8609BarForNum", GXutil.ltrim( localUtil.ntoc( Z8609BarForNum, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9754BarNTint", GXutil.ltrim( localUtil.ntoc( Z9754BarNTint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10539BarAcs", GXutil.rtrim( Z10539BarAcs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10540BarNprg", GXutil.rtrim( Z10540BarNprg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10541BarLts", GXutil.ltrim( localUtil.ntoc( Z10541BarLts, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10546BarLtsV", GXutil.ltrim( localUtil.ntoc( Z10546BarLtsV, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11177BarFecIt", localUtil.ttoc( Z11177BarFecIt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11178BarFecFt", localUtil.ttoc( Z11178BarFecFt, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11179BarColNm", GXutil.rtrim( Z11179BarColNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11762BarDispCli", GXutil.rtrim( Z11762BarDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12993BarMtsTt", GXutil.ltrim( localUtil.ntoc( Z12993BarMtsTt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13759EstFecCier", localUtil.dtoc( Z13759EstFecCier, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13760EstCdn1", GXutil.ltrim( localUtil.ntoc( Z13760EstCdn1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13761EstCdn2", GXutil.rtrim( Z13761EstCdn2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13762EstCtw", GXutil.rtrim( Z13762EstCtw));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.lconti", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LCONTI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LCONTI", "") ;
   }

   public void initializeNonKey1PK510( )
   {
      A14200CosteAnyad = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14200CosteAnyad", GXutil.ltrimstr( A14200CosteAnyad, 10, 2));
      A14199CosteInici = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14199CosteInici", GXutil.ltrimstr( A14199CosteInici, 10, 2));
      A13841Barnhdr_lc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", A13841Barnhdr_lc);
      A13975BarNumtint = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13975BarNumtint), 4, 0));
      A13962BarArtTinD = "" ;
      n13962BarArtTinD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", A13962BarArtTinD);
      A13963BarTipCoTD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13963BarTipCoTD", A13963BarTipCoTD);
      A13964BarTipDefD = "" ;
      n13964BarTipDefD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", A13964BarTipDefD);
      A13965BarIntDsc = "" ;
      n13965BarIntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", A13965BarIntDsc);
      A13966BarCauDsc = "" ;
      n13966BarCauDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", A13966BarCauDsc);
      A13967BarNumEny = 0 ;
      n13967BarNumEny = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13967BarNumEny), 8, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1933BarCodTin = 0 ;
      n1933BarCodTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1933BarCodTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1933BarCodTin), 8, 0));
      A1934BarReoTin = (byte)(0) ;
      n1934BarReoTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1934BarReoTin", GXutil.str( A1934BarReoTin, 1, 0));
      A1935BarParTin = "" ;
      n1935BarParTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1935BarParTin", A1935BarParTin);
      A1936BarSerTin = "" ;
      n1936BarSerTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1936BarSerTin", A1936BarSerTin);
      A1937BarDscTin = "" ;
      n1937BarDscTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1937BarDscTin", A1937BarDscTin);
      A1939BarArtTin = (short)(0) ;
      n1939BarArtTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1939BarArtTin), 4, 0));
      A1940BarColNoT = "" ;
      n1940BarColNoT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1940BarColNoT", A1940BarColNoT);
      A1941BarColNuT = 0 ;
      n1941BarColNuT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1941BarColNuT), 6, 0));
      A1942BarTipCoT = (byte)(0) ;
      n1942BarTipCoT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1942BarTipCoT), 2, 0));
      A1943BarNomClT = "" ;
      n1943BarNomClT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1943BarNomClT", A1943BarNomClT);
      A1944BarNumClT = 0 ;
      n1944BarNumClT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1944BarNumClT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1944BarNumClT), 6, 0));
      A1945BarMaqTin = "" ;
      n1945BarMaqTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1945BarMaqTin", A1945BarMaqTin);
      A1946BarVolTin = 0 ;
      n1946BarVolTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1946BarVolTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1946BarVolTin), 5, 0));
      A1947BarKgmTin = DecimalUtil.ZERO ;
      n1947BarKgmTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1947BarKgmTin", GXutil.ltrimstr( A1947BarKgmTin, 9, 2));
      A1948BarMtrTin = DecimalUtil.ZERO ;
      n1948BarMtrTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1948BarMtrTin", GXutil.ltrimstr( A1948BarMtrTin, 9, 2));
      A1949BarPieTin = 0 ;
      n1949BarPieTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1949BarPieTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1949BarPieTin), 6, 0));
      A2304BarEstTin = (byte)(0) ;
      n2304BarEstTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2304BarEstTin", GXutil.str( A2304BarEstTin, 1, 0));
      A2316BarAgrLot = "" ;
      n2316BarAgrLot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2316BarAgrLot", A2316BarAgrLot);
      A3650BarNumAna = (short)(0) ;
      n3650BarNumAna = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3650BarNumAna", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3650BarNumAna), 3, 0));
      A3651BarTipDef = (short)(0) ;
      n3651BarTipDef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3651BarTipDef), 4, 0));
      A3652BarIntens = (byte)(0) ;
      n3652BarIntens = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3652BarIntens), 2, 0));
      A3653BarPriCod = "" ;
      n3653BarPriCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3653BarPriCod", A3653BarPriCod);
      A3654BarCosPD = DecimalUtil.ZERO ;
      n3654BarCosPD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3654BarCosPD", GXutil.ltrimstr( A3654BarCosPD, 10, 2));
      A3658BarCosPA = DecimalUtil.ZERO ;
      n3658BarCosPA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3658BarCosPA", GXutil.ltrimstr( A3658BarCosPA, 10, 2));
      A3656BarCosAD = DecimalUtil.ZERO ;
      n3656BarCosAD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3656BarCosAD", GXutil.ltrimstr( A3656BarCosAD, 10, 2));
      A3657BarCosAA = DecimalUtil.ZERO ;
      n3657BarCosAA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3657BarCosAA", GXutil.ltrimstr( A3657BarCosAA, 10, 2));
      A3705BarCosCol = DecimalUtil.ZERO ;
      n3705BarCosCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3705BarCosCol", GXutil.ltrimstr( A3705BarCosCol, 10, 2));
      A3706BarCosAnc = DecimalUtil.ZERO ;
      n3706BarCosAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3706BarCosAnc", GXutil.ltrimstr( A3706BarCosAnc, 10, 2));
      A4923BarNumActx = (short)(0) ;
      n4923BarNumActx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4923BarNumActx", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4923BarNumActx), 4, 0));
      A4924BarNumPda = 0 ;
      n4924BarNumPda = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4924BarNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4924BarNumPda), 6, 0));
      A4925BarFaseCod = "" ;
      n4925BarFaseCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4925BarFaseCod", A4925BarFaseCod);
      A4926BarFaseOrd = (short)(0) ;
      n4926BarFaseOrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4926BarFaseOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4926BarFaseOrd), 4, 0));
      A4977BarReoNum = (short)(0) ;
      n4977BarReoNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4977BarReoNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4977BarReoNum), 4, 0));
      A5169BarTipDTin = "" ;
      n5169BarTipDTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5169BarTipDTin", A5169BarTipDTin);
      A5170BarTipCTin = "" ;
      n5170BarTipCTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5170BarTipCTin", A5170BarTipCTin);
      A5171BarTipNTin = "" ;
      n5171BarTipNTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5171BarTipNTin", A5171BarTipNTin);
      A5899BarCosttTi = DecimalUtil.ZERO ;
      n5899BarCosttTi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5899BarCosttTi", GXutil.ltrimstr( A5899BarCosttTi, 11, 5));
      A5900BarRbTeo = (short)(0) ;
      n5900BarRbTeo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5900BarRbTeo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5900BarRbTeo), 4, 0));
      A6177BarNumTin = 0 ;
      n6177BarNumTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6177BarNumTin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6177BarNumTin), 8, 0));
      A6431BarCausa = (short)(0) ;
      n6431BarCausa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6431BarCausa), 4, 0));
      A6634BarRecAcb = "" ;
      n6634BarRecAcb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6634BarRecAcb", A6634BarRecAcb);
      A8563BarKgsTt = DecimalUtil.ZERO ;
      n8563BarKgsTt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8563BarKgsTt", GXutil.ltrimstr( A8563BarKgsTt, 10, 2));
      A8584FamCodT = (short)(0) ;
      n8584FamCodT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8584FamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8584FamCodT), 4, 0));
      A8609BarForNum = 0 ;
      n8609BarForNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8609BarForNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8609BarForNum), 8, 0));
      A9754BarNTint = (byte)(0) ;
      n9754BarNTint = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9754BarNTint", GXutil.str( A9754BarNTint, 1, 0));
      A10539BarAcs = "" ;
      n10539BarAcs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10539BarAcs", A10539BarAcs);
      A10540BarNprg = "" ;
      n10540BarNprg = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10540BarNprg", A10540BarNprg);
      A10541BarLts = 0 ;
      n10541BarLts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10541BarLts", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10541BarLts), 5, 0));
      A10546BarLtsV = DecimalUtil.ZERO ;
      n10546BarLtsV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10546BarLtsV", GXutil.ltrimstr( A10546BarLtsV, 10, 2));
      A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      n11177BarFecIt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11177BarFecIt", localUtil.ttoc( A11177BarFecIt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      n11178BarFecFt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11178BarFecFt", localUtil.ttoc( A11178BarFecFt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11179BarColNm = "" ;
      n11179BarColNm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11179BarColNm", A11179BarColNm);
      A11762BarDispCli = "" ;
      n11762BarDispCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11762BarDispCli", A11762BarDispCli);
      A12993BarMtsTt = DecimalUtil.ZERO ;
      n12993BarMtsTt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12993BarMtsTt", GXutil.ltrimstr( A12993BarMtsTt, 10, 2));
      A13759EstFecCier = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
      A13760EstCdn1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13760EstCdn1), 4, 0));
      A13761EstCdn2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13761EstCdn2", A13761EstCdn2);
      A13762EstCtw = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13762EstCtw", A13762EstCtw);
      Z1933BarCodTin = 0 ;
      Z1934BarReoTin = (byte)(0) ;
      Z1935BarParTin = "" ;
      Z1936BarSerTin = "" ;
      Z1937BarDscTin = "" ;
      Z1939BarArtTin = (short)(0) ;
      Z1940BarColNoT = "" ;
      Z1941BarColNuT = 0 ;
      Z1942BarTipCoT = (byte)(0) ;
      Z1943BarNomClT = "" ;
      Z1944BarNumClT = 0 ;
      Z1945BarMaqTin = "" ;
      Z1946BarVolTin = 0 ;
      Z1947BarKgmTin = DecimalUtil.ZERO ;
      Z1948BarMtrTin = DecimalUtil.ZERO ;
      Z1949BarPieTin = 0 ;
      Z2304BarEstTin = (byte)(0) ;
      Z2316BarAgrLot = "" ;
      Z3650BarNumAna = (short)(0) ;
      Z3651BarTipDef = (short)(0) ;
      Z3652BarIntens = (byte)(0) ;
      Z3653BarPriCod = "" ;
      Z3654BarCosPD = DecimalUtil.ZERO ;
      Z3658BarCosPA = DecimalUtil.ZERO ;
      Z3656BarCosAD = DecimalUtil.ZERO ;
      Z3657BarCosAA = DecimalUtil.ZERO ;
      Z3705BarCosCol = DecimalUtil.ZERO ;
      Z3706BarCosAnc = DecimalUtil.ZERO ;
      Z4923BarNumActx = (short)(0) ;
      Z4924BarNumPda = 0 ;
      Z4925BarFaseCod = "" ;
      Z4926BarFaseOrd = (short)(0) ;
      Z4977BarReoNum = (short)(0) ;
      Z5169BarTipDTin = "" ;
      Z5170BarTipCTin = "" ;
      Z5171BarTipNTin = "" ;
      Z5899BarCosttTi = DecimalUtil.ZERO ;
      Z5900BarRbTeo = (short)(0) ;
      Z6177BarNumTin = 0 ;
      Z6431BarCausa = (short)(0) ;
      Z6634BarRecAcb = "" ;
      Z8563BarKgsTt = DecimalUtil.ZERO ;
      Z8584FamCodT = (short)(0) ;
      Z8609BarForNum = 0 ;
      Z9754BarNTint = (byte)(0) ;
      Z10539BarAcs = "" ;
      Z10540BarNprg = "" ;
      Z10541BarLts = 0 ;
      Z10546BarLtsV = DecimalUtil.ZERO ;
      Z11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      Z11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      Z11179BarColNm = "" ;
      Z11762BarDispCli = "" ;
      Z12993BarMtsTt = DecimalUtil.ZERO ;
      Z13759EstFecCier = GXutil.nullDate() ;
      Z13760EstCdn1 = (short)(0) ;
      Z13761EstCdn2 = "" ;
      Z13762EstCtw = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1PK510( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A3646EstTinAny = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3646EstTinAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3646EstTinAny), 4, 0));
      A3647EstTinMes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3647EstTinMes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3647EstTinMes), 2, 0));
      A3648EstTinDia = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3648EstTinDia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3648EstTinDia), 2, 0));
      A1929EstTinNr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1929EstTinNr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1929EstTinNr), 4, 0));
      initializeNonKey1PK510( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241511881", true, true);
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
      httpContext.AddJavascriptSource("lconti.js", "?20268241511881", false, true);
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
      edtEstTinAny_Internalname = "ESTTINANY" ;
      edtEstTinMes_Internalname = "ESTTINMES" ;
      edtEstTinDia_Internalname = "ESTTINDIA" ;
      edtEstTinNr_Internalname = "ESTTINNR" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarnhdr_lc_Internalname = "BARNHDR_LC" ;
      edtBarCodTin_Internalname = "BARCODTIN" ;
      edtBarReoTin_Internalname = "BARREOTIN" ;
      edtBarParTin_Internalname = "BARPARTIN" ;
      edtBarSerTin_Internalname = "BARSERTIN" ;
      edtBarDscTin_Internalname = "BARDSCTIN" ;
      edtBarArtTin_Internalname = "BARARTTIN" ;
      edtBarArtTinD_Internalname = "BARARTTIND" ;
      edtBarColNoT_Internalname = "BARCOLNOT" ;
      edtBarColNuT_Internalname = "BARCOLNUT" ;
      edtBarTipCoT_Internalname = "BARTIPCOT" ;
      edtBarTipCoTD_Internalname = "BARTIPCOTD" ;
      edtBarNomClT_Internalname = "BARNOMCLT" ;
      edtBarNumClT_Internalname = "BARNUMCLT" ;
      edtBarMaqTin_Internalname = "BARMAQTIN" ;
      edtBarVolTin_Internalname = "BARVOLTIN" ;
      edtBarKgmTin_Internalname = "BARKGMTIN" ;
      edtBarMtrTin_Internalname = "BARMTRTIN" ;
      edtBarPieTin_Internalname = "BARPIETIN" ;
      edtBarEstTin_Internalname = "BARESTTIN" ;
      edtBarAgrLot_Internalname = "BARAGRLOT" ;
      edtBarNumAna_Internalname = "BARNUMANA" ;
      edtBarTipDef_Internalname = "BARTIPDEF" ;
      edtBarTipDefD_Internalname = "BARTIPDEFD" ;
      edtBarIntens_Internalname = "BARINTENS" ;
      edtBarIntDsc_Internalname = "BARINTDSC" ;
      edtBarPriCod_Internalname = "BARPRICOD" ;
      edtBarCosPD_Internalname = "BARCOSPD" ;
      edtBarCosPA_Internalname = "BARCOSPA" ;
      edtBarCosAD_Internalname = "BARCOSAD" ;
      edtBarCosAA_Internalname = "BARCOSAA" ;
      edtBarCosCol_Internalname = "BARCOSCOL" ;
      edtBarCosAnc_Internalname = "BARCOSANC" ;
      edtBarNumActx_Internalname = "BARNUMACTX" ;
      edtBarNumPda_Internalname = "BARNUMPDA" ;
      edtBarFaseCod_Internalname = "BARFASECOD" ;
      edtBarFaseOrd_Internalname = "BARFASEORD" ;
      edtBarReoNum_Internalname = "BARREONUM" ;
      edtBarTipDTin_Internalname = "BARTIPDTIN" ;
      edtBarTipCTin_Internalname = "BARTIPCTIN" ;
      edtBarTipNTin_Internalname = "BARTIPNTIN" ;
      edtBarCosttTi_Internalname = "BARCOSTTTI" ;
      edtBarRbTeo_Internalname = "BARRBTEO" ;
      edtBarNumTin_Internalname = "BARNUMTIN" ;
      edtBarCausa_Internalname = "BARCAUSA" ;
      edtBarCauDsc_Internalname = "BARCAUDSC" ;
      edtBarRecAcb_Internalname = "BARRECACB" ;
      edtBarKgsTt_Internalname = "BARKGSTT" ;
      edtFamCodT_Internalname = "FAMCODT" ;
      edtBarForNum_Internalname = "BARFORNUM" ;
      edtBarNTint_Internalname = "BARNTINT" ;
      edtBarAcs_Internalname = "BARACS" ;
      edtBarNprg_Internalname = "BARNPRG" ;
      edtBarLts_Internalname = "BARLTS" ;
      edtBarLtsV_Internalname = "BARLTSV" ;
      edtBarFecIt_Internalname = "BARFECIT" ;
      edtBarFecFt_Internalname = "BARFECFT" ;
      edtBarColNm_Internalname = "BARCOLNM" ;
      edtBarDispCli_Internalname = "BARDISPCLI" ;
      edtBarMtsTt_Internalname = "BARMTSTT" ;
      edtEstFecCier_Internalname = "ESTFECCIER" ;
      edtEstCdn1_Internalname = "ESTCDN1" ;
      edtEstCdn2_Internalname = "ESTCDN2" ;
      edtEstCtw_Internalname = "ESTCTW" ;
      edtBarNumEny_Internalname = "BARNUMENY" ;
      edtBarNumtint_Internalname = "BARNUMTINT" ;
      edtCosteInici_Internalname = "COSTEINICI" ;
      edtCosteAnyad_Internalname = "COSTEANYAD" ;
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
      Form.setCaption( httpContext.getMessage( "LCONTI", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCosteAnyad_Jsonclick = "" ;
      edtCosteAnyad_Enabled = 0 ;
      edtCosteInici_Jsonclick = "" ;
      edtCosteInici_Enabled = 0 ;
      edtBarNumtint_Jsonclick = "" ;
      edtBarNumtint_Enabled = 0 ;
      edtBarNumEny_Jsonclick = "" ;
      edtBarNumEny_Enabled = 0 ;
      edtEstCtw_Jsonclick = "" ;
      edtEstCtw_Enabled = 1 ;
      edtEstCdn2_Jsonclick = "" ;
      edtEstCdn2_Enabled = 1 ;
      edtEstCdn1_Jsonclick = "" ;
      edtEstCdn1_Enabled = 1 ;
      edtEstFecCier_Jsonclick = "" ;
      edtEstFecCier_Enabled = 1 ;
      edtBarMtsTt_Jsonclick = "" ;
      edtBarMtsTt_Enabled = 1 ;
      edtBarDispCli_Jsonclick = "" ;
      edtBarDispCli_Enabled = 1 ;
      edtBarColNm_Jsonclick = "" ;
      edtBarColNm_Enabled = 1 ;
      edtBarFecFt_Jsonclick = "" ;
      edtBarFecFt_Enabled = 1 ;
      edtBarFecIt_Jsonclick = "" ;
      edtBarFecIt_Enabled = 1 ;
      edtBarLtsV_Jsonclick = "" ;
      edtBarLtsV_Enabled = 1 ;
      edtBarLts_Jsonclick = "" ;
      edtBarLts_Enabled = 1 ;
      edtBarNprg_Jsonclick = "" ;
      edtBarNprg_Enabled = 1 ;
      edtBarAcs_Jsonclick = "" ;
      edtBarAcs_Enabled = 1 ;
      edtBarNTint_Jsonclick = "" ;
      edtBarNTint_Enabled = 1 ;
      edtBarForNum_Jsonclick = "" ;
      edtBarForNum_Enabled = 1 ;
      edtFamCodT_Jsonclick = "" ;
      edtFamCodT_Enabled = 1 ;
      edtBarKgsTt_Jsonclick = "" ;
      edtBarKgsTt_Enabled = 1 ;
      edtBarRecAcb_Jsonclick = "" ;
      edtBarRecAcb_Enabled = 1 ;
      edtBarCauDsc_Jsonclick = "" ;
      edtBarCauDsc_Enabled = 0 ;
      edtBarCausa_Jsonclick = "" ;
      edtBarCausa_Enabled = 1 ;
      edtBarNumTin_Jsonclick = "" ;
      edtBarNumTin_Enabled = 1 ;
      edtBarRbTeo_Jsonclick = "" ;
      edtBarRbTeo_Enabled = 1 ;
      edtBarCosttTi_Jsonclick = "" ;
      edtBarCosttTi_Enabled = 1 ;
      edtBarTipNTin_Jsonclick = "" ;
      edtBarTipNTin_Enabled = 1 ;
      edtBarTipCTin_Jsonclick = "" ;
      edtBarTipCTin_Enabled = 1 ;
      edtBarTipDTin_Jsonclick = "" ;
      edtBarTipDTin_Enabled = 1 ;
      edtBarReoNum_Jsonclick = "" ;
      edtBarReoNum_Enabled = 1 ;
      edtBarFaseOrd_Jsonclick = "" ;
      edtBarFaseOrd_Enabled = 1 ;
      edtBarFaseCod_Jsonclick = "" ;
      edtBarFaseCod_Enabled = 1 ;
      edtBarNumPda_Jsonclick = "" ;
      edtBarNumPda_Enabled = 1 ;
      edtBarNumActx_Jsonclick = "" ;
      edtBarNumActx_Enabled = 1 ;
      edtBarCosAnc_Jsonclick = "" ;
      edtBarCosAnc_Enabled = 1 ;
      edtBarCosCol_Jsonclick = "" ;
      edtBarCosCol_Enabled = 1 ;
      edtBarCosAA_Jsonclick = "" ;
      edtBarCosAA_Enabled = 1 ;
      edtBarCosAD_Jsonclick = "" ;
      edtBarCosAD_Enabled = 1 ;
      edtBarCosPA_Jsonclick = "" ;
      edtBarCosPA_Enabled = 1 ;
      edtBarCosPD_Jsonclick = "" ;
      edtBarCosPD_Enabled = 1 ;
      edtBarPriCod_Jsonclick = "" ;
      edtBarPriCod_Enabled = 1 ;
      edtBarIntDsc_Jsonclick = "" ;
      edtBarIntDsc_Enabled = 0 ;
      edtBarIntens_Jsonclick = "" ;
      edtBarIntens_Enabled = 1 ;
      edtBarTipDefD_Jsonclick = "" ;
      edtBarTipDefD_Enabled = 0 ;
      edtBarTipDef_Jsonclick = "" ;
      edtBarTipDef_Enabled = 1 ;
      edtBarNumAna_Jsonclick = "" ;
      edtBarNumAna_Enabled = 1 ;
      edtBarAgrLot_Jsonclick = "" ;
      edtBarAgrLot_Enabled = 1 ;
      edtBarEstTin_Jsonclick = "" ;
      edtBarEstTin_Enabled = 1 ;
      edtBarPieTin_Jsonclick = "" ;
      edtBarPieTin_Enabled = 1 ;
      edtBarMtrTin_Jsonclick = "" ;
      edtBarMtrTin_Enabled = 1 ;
      edtBarKgmTin_Jsonclick = "" ;
      edtBarKgmTin_Enabled = 1 ;
      edtBarVolTin_Jsonclick = "" ;
      edtBarVolTin_Enabled = 1 ;
      edtBarMaqTin_Jsonclick = "" ;
      edtBarMaqTin_Enabled = 1 ;
      edtBarNumClT_Jsonclick = "" ;
      edtBarNumClT_Enabled = 1 ;
      edtBarNomClT_Jsonclick = "" ;
      edtBarNomClT_Enabled = 1 ;
      edtBarTipCoTD_Jsonclick = "" ;
      edtBarTipCoTD_Enabled = 0 ;
      edtBarTipCoT_Jsonclick = "" ;
      edtBarTipCoT_Enabled = 1 ;
      edtBarColNuT_Jsonclick = "" ;
      edtBarColNuT_Enabled = 1 ;
      edtBarColNoT_Jsonclick = "" ;
      edtBarColNoT_Enabled = 1 ;
      edtBarArtTinD_Jsonclick = "" ;
      edtBarArtTinD_Enabled = 0 ;
      edtBarArtTin_Jsonclick = "" ;
      edtBarArtTin_Enabled = 1 ;
      edtBarDscTin_Jsonclick = "" ;
      edtBarDscTin_Enabled = 1 ;
      edtBarSerTin_Jsonclick = "" ;
      edtBarSerTin_Enabled = 1 ;
      edtBarParTin_Jsonclick = "" ;
      edtBarParTin_Enabled = 1 ;
      edtBarReoTin_Jsonclick = "" ;
      edtBarReoTin_Enabled = 1 ;
      edtBarCodTin_Jsonclick = "" ;
      edtBarCodTin_Enabled = 1 ;
      edtBarnhdr_lc_Jsonclick = "" ;
      edtBarnhdr_lc_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEstTinNr_Jsonclick = "" ;
      edtEstTinNr_Enabled = 1 ;
      edtEstTinDia_Jsonclick = "" ;
      edtEstTinDia_Enabled = 1 ;
      edtEstTinMes_Jsonclick = "" ;
      edtEstTinMes_Enabled = 1 ;
      edtEstTinAny_Jsonclick = "" ;
      edtEstTinAny_Enabled = 1 ;
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
      /* Using cursor T01PK27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01PK27_A407EmprNom[0] ;
      n407EmprNom = T01PK27_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01PK35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CONTIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINDIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(33);
      GX_FocusControl = edtCliCod_Internalname ;
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
      /* Using cursor T01PK27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01PK27_A407EmprNom[0] ;
      n407EmprNom = T01PK27_n407EmprNom[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Esttindia( )
   {
      /* Using cursor T01PK35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Short.valueOf(A3646EstTinAny), Byte.valueOf(A3647EstTinMes), Byte.valueOf(A3648EstTinDia)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CONTIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ESTTINDIA");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(33);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Esttinnr( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13963BarTipCoTD", GXutil.rtrim( A13963BarTipCoTD));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1933BarCodTin", GXutil.ltrim( localUtil.ntoc( A1933BarCodTin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1934BarReoTin", GXutil.ltrim( localUtil.ntoc( A1934BarReoTin, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1935BarParTin", GXutil.rtrim( A1935BarParTin));
      httpContext.ajax_rsp_assign_attri("", false, "A1936BarSerTin", GXutil.rtrim( A1936BarSerTin));
      httpContext.ajax_rsp_assign_attri("", false, "A1937BarDscTin", GXutil.rtrim( A1937BarDscTin));
      httpContext.ajax_rsp_assign_attri("", false, "A1939BarArtTin", GXutil.ltrim( localUtil.ntoc( A1939BarArtTin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1940BarColNoT", GXutil.rtrim( A1940BarColNoT));
      httpContext.ajax_rsp_assign_attri("", false, "A1941BarColNuT", GXutil.ltrim( localUtil.ntoc( A1941BarColNuT, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1942BarTipCoT", GXutil.ltrim( localUtil.ntoc( A1942BarTipCoT, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1943BarNomClT", GXutil.rtrim( A1943BarNomClT));
      httpContext.ajax_rsp_assign_attri("", false, "A1944BarNumClT", GXutil.ltrim( localUtil.ntoc( A1944BarNumClT, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1945BarMaqTin", GXutil.rtrim( A1945BarMaqTin));
      httpContext.ajax_rsp_assign_attri("", false, "A1946BarVolTin", GXutil.ltrim( localUtil.ntoc( A1946BarVolTin, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1947BarKgmTin", GXutil.ltrim( localUtil.ntoc( A1947BarKgmTin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1948BarMtrTin", GXutil.ltrim( localUtil.ntoc( A1948BarMtrTin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1949BarPieTin", GXutil.ltrim( localUtil.ntoc( A1949BarPieTin, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2304BarEstTin", GXutil.ltrim( localUtil.ntoc( A2304BarEstTin, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2316BarAgrLot", GXutil.rtrim( A2316BarAgrLot));
      httpContext.ajax_rsp_assign_attri("", false, "A3650BarNumAna", GXutil.ltrim( localUtil.ntoc( A3650BarNumAna, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3651BarTipDef", GXutil.ltrim( localUtil.ntoc( A3651BarTipDef, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3652BarIntens", GXutil.ltrim( localUtil.ntoc( A3652BarIntens, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3653BarPriCod", GXutil.rtrim( A3653BarPriCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3654BarCosPD", GXutil.ltrim( localUtil.ntoc( A3654BarCosPD, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3658BarCosPA", GXutil.ltrim( localUtil.ntoc( A3658BarCosPA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3656BarCosAD", GXutil.ltrim( localUtil.ntoc( A3656BarCosAD, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3657BarCosAA", GXutil.ltrim( localUtil.ntoc( A3657BarCosAA, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3705BarCosCol", GXutil.ltrim( localUtil.ntoc( A3705BarCosCol, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3706BarCosAnc", GXutil.ltrim( localUtil.ntoc( A3706BarCosAnc, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4923BarNumActx", GXutil.ltrim( localUtil.ntoc( A4923BarNumActx, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4924BarNumPda", GXutil.ltrim( localUtil.ntoc( A4924BarNumPda, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4925BarFaseCod", GXutil.rtrim( A4925BarFaseCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4926BarFaseOrd", GXutil.ltrim( localUtil.ntoc( A4926BarFaseOrd, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4977BarReoNum", GXutil.ltrim( localUtil.ntoc( A4977BarReoNum, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5169BarTipDTin", GXutil.rtrim( A5169BarTipDTin));
      httpContext.ajax_rsp_assign_attri("", false, "A5170BarTipCTin", GXutil.rtrim( A5170BarTipCTin));
      httpContext.ajax_rsp_assign_attri("", false, "A5171BarTipNTin", GXutil.rtrim( A5171BarTipNTin));
      httpContext.ajax_rsp_assign_attri("", false, "A5899BarCosttTi", GXutil.ltrim( localUtil.ntoc( A5899BarCosttTi, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5900BarRbTeo", GXutil.ltrim( localUtil.ntoc( A5900BarRbTeo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6177BarNumTin", GXutil.ltrim( localUtil.ntoc( A6177BarNumTin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6431BarCausa", GXutil.ltrim( localUtil.ntoc( A6431BarCausa, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6634BarRecAcb", GXutil.rtrim( A6634BarRecAcb));
      httpContext.ajax_rsp_assign_attri("", false, "A8563BarKgsTt", GXutil.ltrim( localUtil.ntoc( A8563BarKgsTt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8584FamCodT", GXutil.ltrim( localUtil.ntoc( A8584FamCodT, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8609BarForNum", GXutil.ltrim( localUtil.ntoc( A8609BarForNum, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9754BarNTint", GXutil.ltrim( localUtil.ntoc( A9754BarNTint, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10539BarAcs", GXutil.rtrim( A10539BarAcs));
      httpContext.ajax_rsp_assign_attri("", false, "A10540BarNprg", GXutil.rtrim( A10540BarNprg));
      httpContext.ajax_rsp_assign_attri("", false, "A10541BarLts", GXutil.ltrim( localUtil.ntoc( A10541BarLts, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10546BarLtsV", GXutil.ltrim( localUtil.ntoc( A10546BarLtsV, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11177BarFecIt", localUtil.ttoc( A11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11178BarFecFt", localUtil.ttoc( A11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A11179BarColNm", GXutil.rtrim( A11179BarColNm));
      httpContext.ajax_rsp_assign_attri("", false, "A11762BarDispCli", GXutil.rtrim( A11762BarDispCli));
      httpContext.ajax_rsp_assign_attri("", false, "A12993BarMtsTt", GXutil.ltrim( localUtil.ntoc( A12993BarMtsTt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13759EstFecCier", localUtil.format(A13759EstFecCier, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13760EstCdn1", GXutil.ltrim( localUtil.ntoc( A13760EstCdn1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13761EstCdn2", GXutil.rtrim( A13761EstCdn2));
      httpContext.ajax_rsp_assign_attri("", false, "A13762EstCtw", GXutil.rtrim( A13762EstCtw));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", GXutil.rtrim( A13962BarArtTinD));
      httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", GXutil.rtrim( A13964BarTipDefD));
      httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", GXutil.rtrim( A13965BarIntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", GXutil.rtrim( A13966BarCauDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrim( localUtil.ntoc( A13967BarNumEny, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13975BarNumtint", GXutil.ltrim( localUtil.ntoc( A13975BarNumtint, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13841Barnhdr_lc", GXutil.rtrim( A13841Barnhdr_lc));
      httpContext.ajax_rsp_assign_attri("", false, "A14199CosteInici", GXutil.ltrim( localUtil.ntoc( A14199CosteInici, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14200CosteAnyad", GXutil.ltrim( localUtil.ntoc( A14200CosteAnyad, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3646EstTinAny", GXutil.ltrim( localUtil.ntoc( Z3646EstTinAny, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3647EstTinMes", GXutil.ltrim( localUtil.ntoc( Z3647EstTinMes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3648EstTinDia", GXutil.ltrim( localUtil.ntoc( Z3648EstTinDia, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1929EstTinNr", GXutil.ltrim( localUtil.ntoc( Z1929EstTinNr, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13963BarTipCoTD", GXutil.rtrim( Z13963BarTipCoTD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1933BarCodTin", GXutil.ltrim( localUtil.ntoc( Z1933BarCodTin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1934BarReoTin", GXutil.ltrim( localUtil.ntoc( Z1934BarReoTin, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1935BarParTin", GXutil.rtrim( Z1935BarParTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1936BarSerTin", GXutil.rtrim( Z1936BarSerTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1937BarDscTin", GXutil.rtrim( Z1937BarDscTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1939BarArtTin", GXutil.ltrim( localUtil.ntoc( Z1939BarArtTin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1940BarColNoT", GXutil.rtrim( Z1940BarColNoT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1941BarColNuT", GXutil.ltrim( localUtil.ntoc( Z1941BarColNuT, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1942BarTipCoT", GXutil.ltrim( localUtil.ntoc( Z1942BarTipCoT, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1943BarNomClT", GXutil.rtrim( Z1943BarNomClT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1944BarNumClT", GXutil.ltrim( localUtil.ntoc( Z1944BarNumClT, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1945BarMaqTin", GXutil.rtrim( Z1945BarMaqTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1946BarVolTin", GXutil.ltrim( localUtil.ntoc( Z1946BarVolTin, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1947BarKgmTin", GXutil.ltrim( localUtil.ntoc( Z1947BarKgmTin, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1948BarMtrTin", GXutil.ltrim( localUtil.ntoc( Z1948BarMtrTin, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1949BarPieTin", GXutil.ltrim( localUtil.ntoc( Z1949BarPieTin, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2304BarEstTin", GXutil.ltrim( localUtil.ntoc( Z2304BarEstTin, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2316BarAgrLot", GXutil.rtrim( Z2316BarAgrLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3650BarNumAna", GXutil.ltrim( localUtil.ntoc( Z3650BarNumAna, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3651BarTipDef", GXutil.ltrim( localUtil.ntoc( Z3651BarTipDef, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3652BarIntens", GXutil.ltrim( localUtil.ntoc( Z3652BarIntens, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3653BarPriCod", GXutil.rtrim( Z3653BarPriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3654BarCosPD", GXutil.ltrim( localUtil.ntoc( Z3654BarCosPD, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3658BarCosPA", GXutil.ltrim( localUtil.ntoc( Z3658BarCosPA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3656BarCosAD", GXutil.ltrim( localUtil.ntoc( Z3656BarCosAD, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3657BarCosAA", GXutil.ltrim( localUtil.ntoc( Z3657BarCosAA, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3705BarCosCol", GXutil.ltrim( localUtil.ntoc( Z3705BarCosCol, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3706BarCosAnc", GXutil.ltrim( localUtil.ntoc( Z3706BarCosAnc, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4923BarNumActx", GXutil.ltrim( localUtil.ntoc( Z4923BarNumActx, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4924BarNumPda", GXutil.ltrim( localUtil.ntoc( Z4924BarNumPda, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4925BarFaseCod", GXutil.rtrim( Z4925BarFaseCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4926BarFaseOrd", GXutil.ltrim( localUtil.ntoc( Z4926BarFaseOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4977BarReoNum", GXutil.ltrim( localUtil.ntoc( Z4977BarReoNum, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5169BarTipDTin", GXutil.rtrim( Z5169BarTipDTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5170BarTipCTin", GXutil.rtrim( Z5170BarTipCTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5171BarTipNTin", GXutil.rtrim( Z5171BarTipNTin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5899BarCosttTi", GXutil.ltrim( localUtil.ntoc( Z5899BarCosttTi, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5900BarRbTeo", GXutil.ltrim( localUtil.ntoc( Z5900BarRbTeo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6177BarNumTin", GXutil.ltrim( localUtil.ntoc( Z6177BarNumTin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6431BarCausa", GXutil.ltrim( localUtil.ntoc( Z6431BarCausa, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6634BarRecAcb", GXutil.rtrim( Z6634BarRecAcb));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8563BarKgsTt", GXutil.ltrim( localUtil.ntoc( Z8563BarKgsTt, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8584FamCodT", GXutil.ltrim( localUtil.ntoc( Z8584FamCodT, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8609BarForNum", GXutil.ltrim( localUtil.ntoc( Z8609BarForNum, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9754BarNTint", GXutil.ltrim( localUtil.ntoc( Z9754BarNTint, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10539BarAcs", GXutil.rtrim( Z10539BarAcs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10540BarNprg", GXutil.rtrim( Z10540BarNprg));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10541BarLts", GXutil.ltrim( localUtil.ntoc( Z10541BarLts, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10546BarLtsV", GXutil.ltrim( localUtil.ntoc( Z10546BarLtsV, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11177BarFecIt", localUtil.ttoc( Z11177BarFecIt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11178BarFecFt", localUtil.ttoc( Z11178BarFecFt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11179BarColNm", GXutil.rtrim( Z11179BarColNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11762BarDispCli", GXutil.rtrim( Z11762BarDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12993BarMtsTt", GXutil.ltrim( localUtil.ntoc( Z12993BarMtsTt, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13759EstFecCier", localUtil.format(Z13759EstFecCier, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13760EstCdn1", GXutil.ltrim( localUtil.ntoc( Z13760EstCdn1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13761EstCdn2", GXutil.rtrim( Z13761EstCdn2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13762EstCtw", GXutil.rtrim( Z13762EstCtw));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13962BarArtTinD", GXutil.rtrim( Z13962BarArtTinD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13964BarTipDefD", GXutil.rtrim( Z13964BarTipDefD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13965BarIntDsc", GXutil.rtrim( Z13965BarIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13966BarCauDsc", GXutil.rtrim( Z13966BarCauDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13967BarNumEny", GXutil.ltrim( localUtil.ntoc( Z13967BarNumEny, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13975BarNumtint", GXutil.ltrim( localUtil.ntoc( Z13975BarNumtint, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13841Barnhdr_lc", GXutil.rtrim( Z13841Barnhdr_lc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14199CosteInici", GXutil.ltrim( localUtil.ntoc( Z14199CosteInici, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14200CosteAnyad", GXutil.ltrim( localUtil.ntoc( Z14200CosteAnyad, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01PK36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Bararttin( )
   {
      n1939BarArtTin = false ;
      n13962BarArtTinD = false ;
      /* Using cursor T01PK28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n1939BarArtTin), Short.valueOf(A1939BarArtTin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A13962BarArtTinD = T01PK28_A13962BarArtTinD[0] ;
         n13962BarArtTinD = T01PK28_n13962BarArtTinD[0] ;
      }
      else
      {
         A13962BarArtTinD = " " ;
         n13962BarArtTinD = false ;
      }
      pr_default.close(26);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13962BarArtTinD", GXutil.rtrim( A13962BarArtTinD));
   }

   public void valid_Bartipcot( )
   {
      n1936BarSerTin = false ;
      n1940BarColNoT = false ;
      n1941BarColNuT = false ;
      n1942BarTipCoT = false ;
      n13967BarNumEny = false ;
      /* Using cursor T01PK29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1936BarSerTin), A1936BarSerTin, Boolean.valueOf(n1940BarColNoT), A1940BarColNoT, Boolean.valueOf(n1941BarColNuT), Integer.valueOf(A1941BarColNuT), Boolean.valueOf(n1942BarTipCoT), Byte.valueOf(A1942BarTipCoT)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A13967BarNumEny = T01PK29_A13967BarNumEny[0] ;
         n13967BarNumEny = T01PK29_n13967BarNumEny[0] ;
      }
      else
      {
         A13967BarNumEny = 0 ;
         n13967BarNumEny = false ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13967BarNumEny", GXutil.ltrim( localUtil.ntoc( A13967BarNumEny, (byte)(8), (byte)(0), ".", "")));
   }

   public void valid_Bartipdef( )
   {
      n3651BarTipDef = false ;
      n13964BarTipDefD = false ;
      /* Using cursor T01PK30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n3651BarTipDef), Short.valueOf(A3651BarTipDef)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A13964BarTipDefD = T01PK30_A13964BarTipDefD[0] ;
         n13964BarTipDefD = T01PK30_n13964BarTipDefD[0] ;
      }
      else
      {
         A13964BarTipDefD = " " ;
         n13964BarTipDefD = false ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13964BarTipDefD", GXutil.rtrim( A13964BarTipDefD));
   }

   public void valid_Barintens( )
   {
      n3652BarIntens = false ;
      n13965BarIntDsc = false ;
      /* Using cursor T01PK31 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n3652BarIntens), Byte.valueOf(A3652BarIntens)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A13965BarIntDsc = T01PK31_A13965BarIntDsc[0] ;
         n13965BarIntDsc = T01PK31_n13965BarIntDsc[0] ;
      }
      else
      {
         A13965BarIntDsc = " " ;
         n13965BarIntDsc = false ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13965BarIntDsc", GXutil.rtrim( A13965BarIntDsc));
   }

   public void valid_Barcausa( )
   {
      n6431BarCausa = false ;
      n13966BarCauDsc = false ;
      /* Using cursor T01PK32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n6431BarCausa), Short.valueOf(A6431BarCausa)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         A13966BarCauDsc = T01PK32_A13966BarCauDsc[0] ;
         n13966BarCauDsc = T01PK32_n13966BarCauDsc[0] ;
      }
      else
      {
         A13966BarCauDsc = " " ;
         n13966BarCauDsc = false ;
      }
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13966BarCauDsc", GXutil.rtrim( A13966BarCauDsc));
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
      setEventMetadata("VALID_ESTTINANY","{handler:'valid_Esttinany',iparms:[]");
      setEventMetadata("VALID_ESTTINANY",",oparms:[]}");
      setEventMetadata("VALID_ESTTINMES","{handler:'valid_Esttinmes',iparms:[]");
      setEventMetadata("VALID_ESTTINMES",",oparms:[]}");
      setEventMetadata("VALID_ESTTINDIA","{handler:'valid_Esttindia',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'}]");
      setEventMetadata("VALID_ESTTINDIA",",oparms:[]}");
      setEventMetadata("VALID_ESTTINNR","{handler:'valid_Esttinnr',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3646EstTinAny',fld:'ESTTINANY',pic:'ZZZ9'},{av:'A3647EstTinMes',fld:'ESTTINMES',pic:'Z9'},{av:'A3648EstTinDia',fld:'ESTTINDIA',pic:'Z9'},{av:'A1929EstTinNr',fld:'ESTTINNR',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTTINNR",",oparms:[{av:'A13963BarTipCoTD',fld:'BARTIPCOTD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1933BarCodTin',fld:'BARCODTIN',pic:'ZZZZZZZ9'},{av:'A1934BarReoTin',fld:'BARREOTIN',pic:'9'},{av:'A1935BarParTin',fld:'BARPARTIN',pic:''},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1937BarDscTin',fld:'BARDSCTIN',pic:''},{av:'A1939BarArtTin',fld:'BARARTTIN',pic:'ZZZ9'},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A1942BarTipCoT',fld:'BARTIPCOT',pic:'Z9'},{av:'A1943BarNomClT',fld:'BARNOMCLT',pic:''},{av:'A1944BarNumClT',fld:'BARNUMCLT',pic:'ZZZZZ9'},{av:'A1945BarMaqTin',fld:'BARMAQTIN',pic:''},{av:'A1946BarVolTin',fld:'BARVOLTIN',pic:'ZZZZ9'},{av:'A1947BarKgmTin',fld:'BARKGMTIN',pic:'ZZZZZ9.99'},{av:'A1948BarMtrTin',fld:'BARMTRTIN',pic:'ZZZZZ9.99'},{av:'A1949BarPieTin',fld:'BARPIETIN',pic:'ZZZ9'},{av:'A2304BarEstTin',fld:'BARESTTIN',pic:'9'},{av:'A2316BarAgrLot',fld:'BARAGRLOT',pic:''},{av:'A3650BarNumAna',fld:'BARNUMANA',pic:'ZZ9'},{av:'A3651BarTipDef',fld:'BARTIPDEF',pic:'ZZZ9'},{av:'A3652BarIntens',fld:'BARINTENS',pic:'Z9'},{av:'A3653BarPriCod',fld:'BARPRICOD',pic:'9'},{av:'A3654BarCosPD',fld:'BARCOSPD',pic:'ZZZZZZ9.99'},{av:'A3658BarCosPA',fld:'BARCOSPA',pic:'ZZZZZZ9.99'},{av:'A3656BarCosAD',fld:'BARCOSAD',pic:'ZZZZZZ9.99'},{av:'A3657BarCosAA',fld:'BARCOSAA',pic:'ZZZZZZ9.99'},{av:'A3705BarCosCol',fld:'BARCOSCOL',pic:'ZZZZZZ9.99'},{av:'A3706BarCosAnc',fld:'BARCOSANC',pic:'ZZZZZZ9.99'},{av:'A4923BarNumActx',fld:'BARNUMACTX',pic:'ZZZ9'},{av:'A4924BarNumPda',fld:'BARNUMPDA',pic:'ZZZZZ9'},{av:'A4925BarFaseCod',fld:'BARFASECOD',pic:''},{av:'A4926BarFaseOrd',fld:'BARFASEORD',pic:'ZZZ9'},{av:'A4977BarReoNum',fld:'BARREONUM',pic:'ZZZ9'},{av:'A5169BarTipDTin',fld:'BARTIPDTIN',pic:'@!'},{av:'A5170BarTipCTin',fld:'BARTIPCTIN',pic:''},{av:'A5171BarTipNTin',fld:'BARTIPNTIN',pic:''},{av:'A5899BarCosttTi',fld:'BARCOSTTTI',pic:'ZZZZ9.99999'},{av:'A5900BarRbTeo',fld:'BARRBTEO',pic:'ZZZ9'},{av:'A6177BarNumTin',fld:'BARNUMTIN',pic:'ZZZZZZZ9'},{av:'A6431BarCausa',fld:'BARCAUSA',pic:'ZZZ9'},{av:'A6634BarRecAcb',fld:'BARRECACB',pic:''},{av:'A8563BarKgsTt',fld:'BARKGSTT',pic:'ZZZZZZ9.99'},{av:'A8584FamCodT',fld:'FAMCODT',pic:'ZZZ9'},{av:'A8609BarForNum',fld:'BARFORNUM',pic:'ZZZZZZZ9'},{av:'A9754BarNTint',fld:'BARNTINT',pic:'9'},{av:'A10539BarAcs',fld:'BARACS',pic:''},{av:'A10540BarNprg',fld:'BARNPRG',pic:''},{av:'A10541BarLts',fld:'BARLTS',pic:'ZZZZ9'},{av:'A10546BarLtsV',fld:'BARLTSV',pic:'ZZZZZZ9.99'},{av:'A11177BarFecIt',fld:'BARFECIT',pic:'99/99/99 99:99'},{av:'A11178BarFecFt',fld:'BARFECFT',pic:'99/99/99 99:99'},{av:'A11179BarColNm',fld:'BARCOLNM',pic:''},{av:'A11762BarDispCli',fld:'BARDISPCLI',pic:''},{av:'A12993BarMtsTt',fld:'BARMTSTT',pic:'ZZZZZZ9.99'},{av:'A13759EstFecCier',fld:'ESTFECCIER',pic:''},{av:'A13760EstCdn1',fld:'ESTCDN1',pic:'ZZZ9'},{av:'A13761EstCdn2',fld:'ESTCDN2',pic:''},{av:'A13762EstCtw',fld:'ESTCTW',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13962BarArtTinD',fld:'BARARTTIND',pic:''},{av:'A13964BarTipDefD',fld:'BARTIPDEFD',pic:''},{av:'A13965BarIntDsc',fld:'BARINTDSC',pic:''},{av:'A13966BarCauDsc',fld:'BARCAUDSC',pic:''},{av:'A13967BarNumEny',fld:'BARNUMENY',pic:'ZZZZZZZ9'},{av:'A13975BarNumtint',fld:'BARNUMTINT',pic:'ZZZ9'},{av:'A13841Barnhdr_lc',fld:'BARNHDR_LC',pic:''},{av:'A14199CosteInici',fld:'COSTEINICI',pic:'ZZZZZZ9.99'},{av:'A14200CosteAnyad',fld:'COSTEANYAD',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z3646EstTinAny'},{av:'Z3647EstTinMes'},{av:'Z3648EstTinDia'},{av:'Z1929EstTinNr'},{av:'Z13963BarTipCoTD'},{av:'Z252CliCod'},{av:'Z1933BarCodTin'},{av:'Z1934BarReoTin'},{av:'Z1935BarParTin'},{av:'Z1936BarSerTin'},{av:'Z1937BarDscTin'},{av:'Z1939BarArtTin'},{av:'Z1940BarColNoT'},{av:'Z1941BarColNuT'},{av:'Z1942BarTipCoT'},{av:'Z1943BarNomClT'},{av:'Z1944BarNumClT'},{av:'Z1945BarMaqTin'},{av:'Z1946BarVolTin'},{av:'Z1947BarKgmTin'},{av:'Z1948BarMtrTin'},{av:'Z1949BarPieTin'},{av:'Z2304BarEstTin'},{av:'Z2316BarAgrLot'},{av:'Z3650BarNumAna'},{av:'Z3651BarTipDef'},{av:'Z3652BarIntens'},{av:'Z3653BarPriCod'},{av:'Z3654BarCosPD'},{av:'Z3658BarCosPA'},{av:'Z3656BarCosAD'},{av:'Z3657BarCosAA'},{av:'Z3705BarCosCol'},{av:'Z3706BarCosAnc'},{av:'Z4923BarNumActx'},{av:'Z4924BarNumPda'},{av:'Z4925BarFaseCod'},{av:'Z4926BarFaseOrd'},{av:'Z4977BarReoNum'},{av:'Z5169BarTipDTin'},{av:'Z5170BarTipCTin'},{av:'Z5171BarTipNTin'},{av:'Z5899BarCosttTi'},{av:'Z5900BarRbTeo'},{av:'Z6177BarNumTin'},{av:'Z6431BarCausa'},{av:'Z6634BarRecAcb'},{av:'Z8563BarKgsTt'},{av:'Z8584FamCodT'},{av:'Z8609BarForNum'},{av:'Z9754BarNTint'},{av:'Z10539BarAcs'},{av:'Z10540BarNprg'},{av:'Z10541BarLts'},{av:'Z10546BarLtsV'},{av:'Z11177BarFecIt'},{av:'Z11178BarFecFt'},{av:'Z11179BarColNm'},{av:'Z11762BarDispCli'},{av:'Z12993BarMtsTt'},{av:'Z13759EstFecCier'},{av:'Z13760EstCdn1'},{av:'Z13761EstCdn2'},{av:'Z13762EstCtw'},{av:'Z407EmprNom'},{av:'Z13962BarArtTinD'},{av:'Z13964BarTipDefD'},{av:'Z13965BarIntDsc'},{av:'Z13966BarCauDsc'},{av:'Z13967BarNumEny'},{av:'Z13975BarNumtint'},{av:'Z13841Barnhdr_lc'},{av:'Z14199CosteInici'},{av:'Z14200CosteAnyad'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODTIN","{handler:'valid_Barcodtin',iparms:[]");
      setEventMetadata("VALID_BARCODTIN",",oparms:[]}");
      setEventMetadata("VALID_BARREOTIN","{handler:'valid_Barreotin',iparms:[]");
      setEventMetadata("VALID_BARREOTIN",",oparms:[]}");
      setEventMetadata("VALID_BARPARTIN","{handler:'valid_Barpartin',iparms:[]");
      setEventMetadata("VALID_BARPARTIN",",oparms:[]}");
      setEventMetadata("VALID_BARSERTIN","{handler:'valid_Barsertin',iparms:[]");
      setEventMetadata("VALID_BARSERTIN",",oparms:[]}");
      setEventMetadata("VALID_BARARTTIN","{handler:'valid_Bararttin',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1939BarArtTin',fld:'BARARTTIN',pic:'ZZZ9'},{av:'A13962BarArtTinD',fld:'BARARTTIND',pic:''}]");
      setEventMetadata("VALID_BARARTTIN",",oparms:[{av:'A13962BarArtTinD',fld:'BARARTTIND',pic:''}]}");
      setEventMetadata("VALID_BARCOLNOT","{handler:'valid_Barcolnot',iparms:[]");
      setEventMetadata("VALID_BARCOLNOT",",oparms:[]}");
      setEventMetadata("VALID_BARCOLNUT","{handler:'valid_Barcolnut',iparms:[]");
      setEventMetadata("VALID_BARCOLNUT",",oparms:[]}");
      setEventMetadata("VALID_BARTIPCOT","{handler:'valid_Bartipcot',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1936BarSerTin',fld:'BARSERTIN',pic:''},{av:'A1940BarColNoT',fld:'BARCOLNOT',pic:''},{av:'A1941BarColNuT',fld:'BARCOLNUT',pic:'ZZZZZ9'},{av:'A1942BarTipCoT',fld:'BARTIPCOT',pic:'Z9'},{av:'A13967BarNumEny',fld:'BARNUMENY',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_BARTIPCOT",",oparms:[{av:'A13967BarNumEny',fld:'BARNUMENY',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_BARAGRLOT","{handler:'valid_Baragrlot',iparms:[]");
      setEventMetadata("VALID_BARAGRLOT",",oparms:[]}");
      setEventMetadata("VALID_BARTIPDEF","{handler:'valid_Bartipdef',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3651BarTipDef',fld:'BARTIPDEF',pic:'ZZZ9'},{av:'A13964BarTipDefD',fld:'BARTIPDEFD',pic:''}]");
      setEventMetadata("VALID_BARTIPDEF",",oparms:[{av:'A13964BarTipDefD',fld:'BARTIPDEFD',pic:''}]}");
      setEventMetadata("VALID_BARINTENS","{handler:'valid_Barintens',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3652BarIntens',fld:'BARINTENS',pic:'Z9'},{av:'A13965BarIntDsc',fld:'BARINTDSC',pic:''}]");
      setEventMetadata("VALID_BARINTENS",",oparms:[{av:'A13965BarIntDsc',fld:'BARINTDSC',pic:''}]}");
      setEventMetadata("VALID_BARPRICOD","{handler:'valid_Barpricod',iparms:[]");
      setEventMetadata("VALID_BARPRICOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOSPD","{handler:'valid_Barcospd',iparms:[]");
      setEventMetadata("VALID_BARCOSPD",",oparms:[]}");
      setEventMetadata("VALID_BARCOSPA","{handler:'valid_Barcospa',iparms:[]");
      setEventMetadata("VALID_BARCOSPA",",oparms:[]}");
      setEventMetadata("VALID_BARCOSAD","{handler:'valid_Barcosad',iparms:[]");
      setEventMetadata("VALID_BARCOSAD",",oparms:[]}");
      setEventMetadata("VALID_BARCOSAA","{handler:'valid_Barcosaa',iparms:[]");
      setEventMetadata("VALID_BARCOSAA",",oparms:[]}");
      setEventMetadata("VALID_BARCOSCOL","{handler:'valid_Barcoscol',iparms:[]");
      setEventMetadata("VALID_BARCOSCOL",",oparms:[]}");
      setEventMetadata("VALID_BARCOSANC","{handler:'valid_Barcosanc',iparms:[]");
      setEventMetadata("VALID_BARCOSANC",",oparms:[]}");
      setEventMetadata("VALID_BARCAUSA","{handler:'valid_Barcausa',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6431BarCausa',fld:'BARCAUSA',pic:'ZZZ9'},{av:'A13966BarCauDsc',fld:'BARCAUDSC',pic:''}]");
      setEventMetadata("VALID_BARCAUSA",",oparms:[{av:'A13966BarCauDsc',fld:'BARCAUDSC',pic:''}]}");
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
      pr_default.close(34);
      pr_default.close(25);
      pr_default.close(33);
      pr_default.close(26);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z1935BarParTin = "" ;
      Z1936BarSerTin = "" ;
      Z1937BarDscTin = "" ;
      Z1940BarColNoT = "" ;
      Z1943BarNomClT = "" ;
      Z1945BarMaqTin = "" ;
      Z1947BarKgmTin = DecimalUtil.ZERO ;
      Z1948BarMtrTin = DecimalUtil.ZERO ;
      Z2316BarAgrLot = "" ;
      Z3653BarPriCod = "" ;
      Z3654BarCosPD = DecimalUtil.ZERO ;
      Z3658BarCosPA = DecimalUtil.ZERO ;
      Z3656BarCosAD = DecimalUtil.ZERO ;
      Z3657BarCosAA = DecimalUtil.ZERO ;
      Z3705BarCosCol = DecimalUtil.ZERO ;
      Z3706BarCosAnc = DecimalUtil.ZERO ;
      Z4925BarFaseCod = "" ;
      Z5169BarTipDTin = "" ;
      Z5170BarTipCTin = "" ;
      Z5171BarTipNTin = "" ;
      Z5899BarCosttTi = DecimalUtil.ZERO ;
      Z6634BarRecAcb = "" ;
      Z8563BarKgsTt = DecimalUtil.ZERO ;
      Z10539BarAcs = "" ;
      Z10540BarNprg = "" ;
      Z10546BarLtsV = DecimalUtil.ZERO ;
      Z11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      Z11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      Z11179BarColNm = "" ;
      Z11762BarDispCli = "" ;
      Z12993BarMtsTt = DecimalUtil.ZERO ;
      Z13759EstFecCier = GXutil.nullDate() ;
      Z13761EstCdn2 = "" ;
      Z13762EstCtw = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1936BarSerTin = "" ;
      A1940BarColNoT = "" ;
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
      A13841Barnhdr_lc = "" ;
      A1935BarParTin = "" ;
      A1937BarDscTin = "" ;
      A13962BarArtTinD = "" ;
      A13963BarTipCoTD = "" ;
      A1943BarNomClT = "" ;
      A1945BarMaqTin = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A2316BarAgrLot = "" ;
      A13964BarTipDefD = "" ;
      A13965BarIntDsc = "" ;
      A3653BarPriCod = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      A4925BarFaseCod = "" ;
      A5169BarTipDTin = "" ;
      A5170BarTipCTin = "" ;
      A5171BarTipNTin = "" ;
      A5899BarCosttTi = DecimalUtil.ZERO ;
      A13966BarCauDsc = "" ;
      A6634BarRecAcb = "" ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A10539BarAcs = "" ;
      A10540BarNprg = "" ;
      A10546BarLtsV = DecimalUtil.ZERO ;
      A11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      A11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      A11179BarColNm = "" ;
      A11762BarDispCli = "" ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A13759EstFecCier = GXutil.nullDate() ;
      A13761EstCdn2 = "" ;
      A13762EstCtw = "" ;
      A14199CosteInici = DecimalUtil.ZERO ;
      A14200CosteAnyad = DecimalUtil.ZERO ;
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
      Z13962BarArtTinD = "" ;
      Z13964BarTipDefD = "" ;
      Z13965BarIntDsc = "" ;
      Z13966BarCauDsc = "" ;
      T01PK12_A5085CodCausa = new short[1] ;
      T01PK12_A583IntCod = new byte[1] ;
      T01PK12_A833TipDefCod = new short[1] ;
      T01PK12_A494ForSer = new String[] {""} ;
      T01PK12_A482ForColNom = new String[] {""} ;
      T01PK12_A483ForColNum = new int[1] ;
      T01PK12_A831TipColCod = new byte[1] ;
      T01PK12_A829TipArtCod = new short[1] ;
      T01PK12_A1929EstTinNr = new short[1] ;
      T01PK12_A407EmprNom = new String[] {""} ;
      T01PK12_n407EmprNom = new boolean[] {false} ;
      T01PK12_A1933BarCodTin = new int[1] ;
      T01PK12_n1933BarCodTin = new boolean[] {false} ;
      T01PK12_A1934BarReoTin = new byte[1] ;
      T01PK12_n1934BarReoTin = new boolean[] {false} ;
      T01PK12_A1935BarParTin = new String[] {""} ;
      T01PK12_n1935BarParTin = new boolean[] {false} ;
      T01PK12_A1936BarSerTin = new String[] {""} ;
      T01PK12_n1936BarSerTin = new boolean[] {false} ;
      T01PK12_A1937BarDscTin = new String[] {""} ;
      T01PK12_n1937BarDscTin = new boolean[] {false} ;
      T01PK12_A1939BarArtTin = new short[1] ;
      T01PK12_n1939BarArtTin = new boolean[] {false} ;
      T01PK12_A1940BarColNoT = new String[] {""} ;
      T01PK12_n1940BarColNoT = new boolean[] {false} ;
      T01PK12_A1941BarColNuT = new int[1] ;
      T01PK12_n1941BarColNuT = new boolean[] {false} ;
      T01PK12_A1942BarTipCoT = new byte[1] ;
      T01PK12_n1942BarTipCoT = new boolean[] {false} ;
      T01PK12_A1943BarNomClT = new String[] {""} ;
      T01PK12_n1943BarNomClT = new boolean[] {false} ;
      T01PK12_A1944BarNumClT = new int[1] ;
      T01PK12_n1944BarNumClT = new boolean[] {false} ;
      T01PK12_A1945BarMaqTin = new String[] {""} ;
      T01PK12_n1945BarMaqTin = new boolean[] {false} ;
      T01PK12_A1946BarVolTin = new int[1] ;
      T01PK12_n1946BarVolTin = new boolean[] {false} ;
      T01PK12_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n1947BarKgmTin = new boolean[] {false} ;
      T01PK12_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n1948BarMtrTin = new boolean[] {false} ;
      T01PK12_A1949BarPieTin = new int[1] ;
      T01PK12_n1949BarPieTin = new boolean[] {false} ;
      T01PK12_A2304BarEstTin = new byte[1] ;
      T01PK12_n2304BarEstTin = new boolean[] {false} ;
      T01PK12_A2316BarAgrLot = new String[] {""} ;
      T01PK12_n2316BarAgrLot = new boolean[] {false} ;
      T01PK12_A3650BarNumAna = new short[1] ;
      T01PK12_n3650BarNumAna = new boolean[] {false} ;
      T01PK12_A3651BarTipDef = new short[1] ;
      T01PK12_n3651BarTipDef = new boolean[] {false} ;
      T01PK12_A3652BarIntens = new byte[1] ;
      T01PK12_n3652BarIntens = new boolean[] {false} ;
      T01PK12_A3653BarPriCod = new String[] {""} ;
      T01PK12_n3653BarPriCod = new boolean[] {false} ;
      T01PK12_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n3654BarCosPD = new boolean[] {false} ;
      T01PK12_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n3658BarCosPA = new boolean[] {false} ;
      T01PK12_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n3656BarCosAD = new boolean[] {false} ;
      T01PK12_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n3657BarCosAA = new boolean[] {false} ;
      T01PK12_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n3705BarCosCol = new boolean[] {false} ;
      T01PK12_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n3706BarCosAnc = new boolean[] {false} ;
      T01PK12_A4923BarNumActx = new short[1] ;
      T01PK12_n4923BarNumActx = new boolean[] {false} ;
      T01PK12_A4924BarNumPda = new int[1] ;
      T01PK12_n4924BarNumPda = new boolean[] {false} ;
      T01PK12_A4925BarFaseCod = new String[] {""} ;
      T01PK12_n4925BarFaseCod = new boolean[] {false} ;
      T01PK12_A4926BarFaseOrd = new short[1] ;
      T01PK12_n4926BarFaseOrd = new boolean[] {false} ;
      T01PK12_A4977BarReoNum = new short[1] ;
      T01PK12_n4977BarReoNum = new boolean[] {false} ;
      T01PK12_A5169BarTipDTin = new String[] {""} ;
      T01PK12_n5169BarTipDTin = new boolean[] {false} ;
      T01PK12_A5170BarTipCTin = new String[] {""} ;
      T01PK12_n5170BarTipCTin = new boolean[] {false} ;
      T01PK12_A5171BarTipNTin = new String[] {""} ;
      T01PK12_n5171BarTipNTin = new boolean[] {false} ;
      T01PK12_A5899BarCosttTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n5899BarCosttTi = new boolean[] {false} ;
      T01PK12_A5900BarRbTeo = new short[1] ;
      T01PK12_n5900BarRbTeo = new boolean[] {false} ;
      T01PK12_A6177BarNumTin = new int[1] ;
      T01PK12_n6177BarNumTin = new boolean[] {false} ;
      T01PK12_A6431BarCausa = new short[1] ;
      T01PK12_n6431BarCausa = new boolean[] {false} ;
      T01PK12_A6634BarRecAcb = new String[] {""} ;
      T01PK12_n6634BarRecAcb = new boolean[] {false} ;
      T01PK12_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n8563BarKgsTt = new boolean[] {false} ;
      T01PK12_A8584FamCodT = new short[1] ;
      T01PK12_n8584FamCodT = new boolean[] {false} ;
      T01PK12_A8609BarForNum = new int[1] ;
      T01PK12_n8609BarForNum = new boolean[] {false} ;
      T01PK12_A9754BarNTint = new byte[1] ;
      T01PK12_n9754BarNTint = new boolean[] {false} ;
      T01PK12_A10539BarAcs = new String[] {""} ;
      T01PK12_n10539BarAcs = new boolean[] {false} ;
      T01PK12_A10540BarNprg = new String[] {""} ;
      T01PK12_n10540BarNprg = new boolean[] {false} ;
      T01PK12_A10541BarLts = new int[1] ;
      T01PK12_n10541BarLts = new boolean[] {false} ;
      T01PK12_A10546BarLtsV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n10546BarLtsV = new boolean[] {false} ;
      T01PK12_A11177BarFecIt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK12_n11177BarFecIt = new boolean[] {false} ;
      T01PK12_A11178BarFecFt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK12_n11178BarFecFt = new boolean[] {false} ;
      T01PK12_A11179BarColNm = new String[] {""} ;
      T01PK12_n11179BarColNm = new boolean[] {false} ;
      T01PK12_A11762BarDispCli = new String[] {""} ;
      T01PK12_n11762BarDispCli = new boolean[] {false} ;
      T01PK12_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK12_n12993BarMtsTt = new boolean[] {false} ;
      T01PK12_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK12_A13760EstCdn1 = new short[1] ;
      T01PK12_A13761EstCdn2 = new String[] {""} ;
      T01PK12_A13762EstCtw = new String[] {""} ;
      T01PK12_A396EmprCod = new String[] {""} ;
      T01PK12_A252CliCod = new int[1] ;
      T01PK12_A3646EstTinAny = new short[1] ;
      T01PK12_A3647EstTinMes = new byte[1] ;
      T01PK12_A3648EstTinDia = new byte[1] ;
      T01PK12_A13962BarArtTinD = new String[] {""} ;
      T01PK12_n13962BarArtTinD = new boolean[] {false} ;
      T01PK12_A13964BarTipDefD = new String[] {""} ;
      T01PK12_n13964BarTipDefD = new boolean[] {false} ;
      T01PK12_A13965BarIntDsc = new String[] {""} ;
      T01PK12_n13965BarIntDsc = new boolean[] {false} ;
      T01PK12_A13966BarCauDsc = new String[] {""} ;
      T01PK12_n13966BarCauDsc = new boolean[] {false} ;
      T01PK12_A13967BarNumEny = new int[1] ;
      T01PK12_n13967BarNumEny = new boolean[] {false} ;
      T01PK4_A407EmprNom = new String[] {""} ;
      T01PK4_n407EmprNom = new boolean[] {false} ;
      T01PK5_A396EmprCod = new String[] {""} ;
      T01PK7_A13962BarArtTinD = new String[] {""} ;
      T01PK7_n13962BarArtTinD = new boolean[] {false} ;
      T01PK8_A13964BarTipDefD = new String[] {""} ;
      T01PK8_n13964BarTipDefD = new boolean[] {false} ;
      T01PK9_A13965BarIntDsc = new String[] {""} ;
      T01PK9_n13965BarIntDsc = new boolean[] {false} ;
      T01PK10_A13966BarCauDsc = new String[] {""} ;
      T01PK10_n13966BarCauDsc = new boolean[] {false} ;
      T01PK11_A13967BarNumEny = new int[1] ;
      T01PK11_n13967BarNumEny = new boolean[] {false} ;
      T01PK6_A396EmprCod = new String[] {""} ;
      T01PK13_A407EmprNom = new String[] {""} ;
      T01PK13_n407EmprNom = new boolean[] {false} ;
      T01PK14_A396EmprCod = new String[] {""} ;
      T01PK15_A13962BarArtTinD = new String[] {""} ;
      T01PK15_n13962BarArtTinD = new boolean[] {false} ;
      T01PK16_A13964BarTipDefD = new String[] {""} ;
      T01PK16_n13964BarTipDefD = new boolean[] {false} ;
      T01PK17_A13965BarIntDsc = new String[] {""} ;
      T01PK17_n13965BarIntDsc = new boolean[] {false} ;
      T01PK18_A13966BarCauDsc = new String[] {""} ;
      T01PK18_n13966BarCauDsc = new boolean[] {false} ;
      T01PK19_A13967BarNumEny = new int[1] ;
      T01PK19_n13967BarNumEny = new boolean[] {false} ;
      T01PK20_A396EmprCod = new String[] {""} ;
      T01PK21_A396EmprCod = new String[] {""} ;
      T01PK21_A3646EstTinAny = new short[1] ;
      T01PK21_A3647EstTinMes = new byte[1] ;
      T01PK21_A3648EstTinDia = new byte[1] ;
      T01PK21_A1929EstTinNr = new short[1] ;
      T01PK3_A1929EstTinNr = new short[1] ;
      T01PK3_A1933BarCodTin = new int[1] ;
      T01PK3_n1933BarCodTin = new boolean[] {false} ;
      T01PK3_A1934BarReoTin = new byte[1] ;
      T01PK3_n1934BarReoTin = new boolean[] {false} ;
      T01PK3_A1935BarParTin = new String[] {""} ;
      T01PK3_n1935BarParTin = new boolean[] {false} ;
      T01PK3_A1936BarSerTin = new String[] {""} ;
      T01PK3_n1936BarSerTin = new boolean[] {false} ;
      T01PK3_A1937BarDscTin = new String[] {""} ;
      T01PK3_n1937BarDscTin = new boolean[] {false} ;
      T01PK3_A1939BarArtTin = new short[1] ;
      T01PK3_n1939BarArtTin = new boolean[] {false} ;
      T01PK3_A1940BarColNoT = new String[] {""} ;
      T01PK3_n1940BarColNoT = new boolean[] {false} ;
      T01PK3_A1941BarColNuT = new int[1] ;
      T01PK3_n1941BarColNuT = new boolean[] {false} ;
      T01PK3_A1942BarTipCoT = new byte[1] ;
      T01PK3_n1942BarTipCoT = new boolean[] {false} ;
      T01PK3_A1943BarNomClT = new String[] {""} ;
      T01PK3_n1943BarNomClT = new boolean[] {false} ;
      T01PK3_A1944BarNumClT = new int[1] ;
      T01PK3_n1944BarNumClT = new boolean[] {false} ;
      T01PK3_A1945BarMaqTin = new String[] {""} ;
      T01PK3_n1945BarMaqTin = new boolean[] {false} ;
      T01PK3_A1946BarVolTin = new int[1] ;
      T01PK3_n1946BarVolTin = new boolean[] {false} ;
      T01PK3_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n1947BarKgmTin = new boolean[] {false} ;
      T01PK3_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n1948BarMtrTin = new boolean[] {false} ;
      T01PK3_A1949BarPieTin = new int[1] ;
      T01PK3_n1949BarPieTin = new boolean[] {false} ;
      T01PK3_A2304BarEstTin = new byte[1] ;
      T01PK3_n2304BarEstTin = new boolean[] {false} ;
      T01PK3_A2316BarAgrLot = new String[] {""} ;
      T01PK3_n2316BarAgrLot = new boolean[] {false} ;
      T01PK3_A3650BarNumAna = new short[1] ;
      T01PK3_n3650BarNumAna = new boolean[] {false} ;
      T01PK3_A3651BarTipDef = new short[1] ;
      T01PK3_n3651BarTipDef = new boolean[] {false} ;
      T01PK3_A3652BarIntens = new byte[1] ;
      T01PK3_n3652BarIntens = new boolean[] {false} ;
      T01PK3_A3653BarPriCod = new String[] {""} ;
      T01PK3_n3653BarPriCod = new boolean[] {false} ;
      T01PK3_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n3654BarCosPD = new boolean[] {false} ;
      T01PK3_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n3658BarCosPA = new boolean[] {false} ;
      T01PK3_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n3656BarCosAD = new boolean[] {false} ;
      T01PK3_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n3657BarCosAA = new boolean[] {false} ;
      T01PK3_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n3705BarCosCol = new boolean[] {false} ;
      T01PK3_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n3706BarCosAnc = new boolean[] {false} ;
      T01PK3_A4923BarNumActx = new short[1] ;
      T01PK3_n4923BarNumActx = new boolean[] {false} ;
      T01PK3_A4924BarNumPda = new int[1] ;
      T01PK3_n4924BarNumPda = new boolean[] {false} ;
      T01PK3_A4925BarFaseCod = new String[] {""} ;
      T01PK3_n4925BarFaseCod = new boolean[] {false} ;
      T01PK3_A4926BarFaseOrd = new short[1] ;
      T01PK3_n4926BarFaseOrd = new boolean[] {false} ;
      T01PK3_A4977BarReoNum = new short[1] ;
      T01PK3_n4977BarReoNum = new boolean[] {false} ;
      T01PK3_A5169BarTipDTin = new String[] {""} ;
      T01PK3_n5169BarTipDTin = new boolean[] {false} ;
      T01PK3_A5170BarTipCTin = new String[] {""} ;
      T01PK3_n5170BarTipCTin = new boolean[] {false} ;
      T01PK3_A5171BarTipNTin = new String[] {""} ;
      T01PK3_n5171BarTipNTin = new boolean[] {false} ;
      T01PK3_A5899BarCosttTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n5899BarCosttTi = new boolean[] {false} ;
      T01PK3_A5900BarRbTeo = new short[1] ;
      T01PK3_n5900BarRbTeo = new boolean[] {false} ;
      T01PK3_A6177BarNumTin = new int[1] ;
      T01PK3_n6177BarNumTin = new boolean[] {false} ;
      T01PK3_A6431BarCausa = new short[1] ;
      T01PK3_n6431BarCausa = new boolean[] {false} ;
      T01PK3_A6634BarRecAcb = new String[] {""} ;
      T01PK3_n6634BarRecAcb = new boolean[] {false} ;
      T01PK3_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n8563BarKgsTt = new boolean[] {false} ;
      T01PK3_A8584FamCodT = new short[1] ;
      T01PK3_n8584FamCodT = new boolean[] {false} ;
      T01PK3_A8609BarForNum = new int[1] ;
      T01PK3_n8609BarForNum = new boolean[] {false} ;
      T01PK3_A9754BarNTint = new byte[1] ;
      T01PK3_n9754BarNTint = new boolean[] {false} ;
      T01PK3_A10539BarAcs = new String[] {""} ;
      T01PK3_n10539BarAcs = new boolean[] {false} ;
      T01PK3_A10540BarNprg = new String[] {""} ;
      T01PK3_n10540BarNprg = new boolean[] {false} ;
      T01PK3_A10541BarLts = new int[1] ;
      T01PK3_n10541BarLts = new boolean[] {false} ;
      T01PK3_A10546BarLtsV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n10546BarLtsV = new boolean[] {false} ;
      T01PK3_A11177BarFecIt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK3_n11177BarFecIt = new boolean[] {false} ;
      T01PK3_A11178BarFecFt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK3_n11178BarFecFt = new boolean[] {false} ;
      T01PK3_A11179BarColNm = new String[] {""} ;
      T01PK3_n11179BarColNm = new boolean[] {false} ;
      T01PK3_A11762BarDispCli = new String[] {""} ;
      T01PK3_n11762BarDispCli = new boolean[] {false} ;
      T01PK3_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK3_n12993BarMtsTt = new boolean[] {false} ;
      T01PK3_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK3_A13760EstCdn1 = new short[1] ;
      T01PK3_A13761EstCdn2 = new String[] {""} ;
      T01PK3_A13762EstCtw = new String[] {""} ;
      T01PK3_A396EmprCod = new String[] {""} ;
      T01PK3_A252CliCod = new int[1] ;
      T01PK3_A3646EstTinAny = new short[1] ;
      T01PK3_A3647EstTinMes = new byte[1] ;
      T01PK3_A3648EstTinDia = new byte[1] ;
      sMode510 = "" ;
      T01PK22_A396EmprCod = new String[] {""} ;
      T01PK22_A3646EstTinAny = new short[1] ;
      T01PK22_A3647EstTinMes = new byte[1] ;
      T01PK22_A3648EstTinDia = new byte[1] ;
      T01PK22_A1929EstTinNr = new short[1] ;
      T01PK23_A396EmprCod = new String[] {""} ;
      T01PK23_A3646EstTinAny = new short[1] ;
      T01PK23_A3647EstTinMes = new byte[1] ;
      T01PK23_A3648EstTinDia = new byte[1] ;
      T01PK23_A1929EstTinNr = new short[1] ;
      T01PK2_A1929EstTinNr = new short[1] ;
      T01PK2_A1933BarCodTin = new int[1] ;
      T01PK2_n1933BarCodTin = new boolean[] {false} ;
      T01PK2_A1934BarReoTin = new byte[1] ;
      T01PK2_n1934BarReoTin = new boolean[] {false} ;
      T01PK2_A1935BarParTin = new String[] {""} ;
      T01PK2_n1935BarParTin = new boolean[] {false} ;
      T01PK2_A1936BarSerTin = new String[] {""} ;
      T01PK2_n1936BarSerTin = new boolean[] {false} ;
      T01PK2_A1937BarDscTin = new String[] {""} ;
      T01PK2_n1937BarDscTin = new boolean[] {false} ;
      T01PK2_A1939BarArtTin = new short[1] ;
      T01PK2_n1939BarArtTin = new boolean[] {false} ;
      T01PK2_A1940BarColNoT = new String[] {""} ;
      T01PK2_n1940BarColNoT = new boolean[] {false} ;
      T01PK2_A1941BarColNuT = new int[1] ;
      T01PK2_n1941BarColNuT = new boolean[] {false} ;
      T01PK2_A1942BarTipCoT = new byte[1] ;
      T01PK2_n1942BarTipCoT = new boolean[] {false} ;
      T01PK2_A1943BarNomClT = new String[] {""} ;
      T01PK2_n1943BarNomClT = new boolean[] {false} ;
      T01PK2_A1944BarNumClT = new int[1] ;
      T01PK2_n1944BarNumClT = new boolean[] {false} ;
      T01PK2_A1945BarMaqTin = new String[] {""} ;
      T01PK2_n1945BarMaqTin = new boolean[] {false} ;
      T01PK2_A1946BarVolTin = new int[1] ;
      T01PK2_n1946BarVolTin = new boolean[] {false} ;
      T01PK2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n1947BarKgmTin = new boolean[] {false} ;
      T01PK2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n1948BarMtrTin = new boolean[] {false} ;
      T01PK2_A1949BarPieTin = new int[1] ;
      T01PK2_n1949BarPieTin = new boolean[] {false} ;
      T01PK2_A2304BarEstTin = new byte[1] ;
      T01PK2_n2304BarEstTin = new boolean[] {false} ;
      T01PK2_A2316BarAgrLot = new String[] {""} ;
      T01PK2_n2316BarAgrLot = new boolean[] {false} ;
      T01PK2_A3650BarNumAna = new short[1] ;
      T01PK2_n3650BarNumAna = new boolean[] {false} ;
      T01PK2_A3651BarTipDef = new short[1] ;
      T01PK2_n3651BarTipDef = new boolean[] {false} ;
      T01PK2_A3652BarIntens = new byte[1] ;
      T01PK2_n3652BarIntens = new boolean[] {false} ;
      T01PK2_A3653BarPriCod = new String[] {""} ;
      T01PK2_n3653BarPriCod = new boolean[] {false} ;
      T01PK2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n3654BarCosPD = new boolean[] {false} ;
      T01PK2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n3658BarCosPA = new boolean[] {false} ;
      T01PK2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n3656BarCosAD = new boolean[] {false} ;
      T01PK2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n3657BarCosAA = new boolean[] {false} ;
      T01PK2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n3705BarCosCol = new boolean[] {false} ;
      T01PK2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n3706BarCosAnc = new boolean[] {false} ;
      T01PK2_A4923BarNumActx = new short[1] ;
      T01PK2_n4923BarNumActx = new boolean[] {false} ;
      T01PK2_A4924BarNumPda = new int[1] ;
      T01PK2_n4924BarNumPda = new boolean[] {false} ;
      T01PK2_A4925BarFaseCod = new String[] {""} ;
      T01PK2_n4925BarFaseCod = new boolean[] {false} ;
      T01PK2_A4926BarFaseOrd = new short[1] ;
      T01PK2_n4926BarFaseOrd = new boolean[] {false} ;
      T01PK2_A4977BarReoNum = new short[1] ;
      T01PK2_n4977BarReoNum = new boolean[] {false} ;
      T01PK2_A5169BarTipDTin = new String[] {""} ;
      T01PK2_n5169BarTipDTin = new boolean[] {false} ;
      T01PK2_A5170BarTipCTin = new String[] {""} ;
      T01PK2_n5170BarTipCTin = new boolean[] {false} ;
      T01PK2_A5171BarTipNTin = new String[] {""} ;
      T01PK2_n5171BarTipNTin = new boolean[] {false} ;
      T01PK2_A5899BarCosttTi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n5899BarCosttTi = new boolean[] {false} ;
      T01PK2_A5900BarRbTeo = new short[1] ;
      T01PK2_n5900BarRbTeo = new boolean[] {false} ;
      T01PK2_A6177BarNumTin = new int[1] ;
      T01PK2_n6177BarNumTin = new boolean[] {false} ;
      T01PK2_A6431BarCausa = new short[1] ;
      T01PK2_n6431BarCausa = new boolean[] {false} ;
      T01PK2_A6634BarRecAcb = new String[] {""} ;
      T01PK2_n6634BarRecAcb = new boolean[] {false} ;
      T01PK2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n8563BarKgsTt = new boolean[] {false} ;
      T01PK2_A8584FamCodT = new short[1] ;
      T01PK2_n8584FamCodT = new boolean[] {false} ;
      T01PK2_A8609BarForNum = new int[1] ;
      T01PK2_n8609BarForNum = new boolean[] {false} ;
      T01PK2_A9754BarNTint = new byte[1] ;
      T01PK2_n9754BarNTint = new boolean[] {false} ;
      T01PK2_A10539BarAcs = new String[] {""} ;
      T01PK2_n10539BarAcs = new boolean[] {false} ;
      T01PK2_A10540BarNprg = new String[] {""} ;
      T01PK2_n10540BarNprg = new boolean[] {false} ;
      T01PK2_A10541BarLts = new int[1] ;
      T01PK2_n10541BarLts = new boolean[] {false} ;
      T01PK2_A10546BarLtsV = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n10546BarLtsV = new boolean[] {false} ;
      T01PK2_A11177BarFecIt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK2_n11177BarFecIt = new boolean[] {false} ;
      T01PK2_A11178BarFecFt = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK2_n11178BarFecFt = new boolean[] {false} ;
      T01PK2_A11179BarColNm = new String[] {""} ;
      T01PK2_n11179BarColNm = new boolean[] {false} ;
      T01PK2_A11762BarDispCli = new String[] {""} ;
      T01PK2_n11762BarDispCli = new boolean[] {false} ;
      T01PK2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PK2_n12993BarMtsTt = new boolean[] {false} ;
      T01PK2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      T01PK2_A13760EstCdn1 = new short[1] ;
      T01PK2_A13761EstCdn2 = new String[] {""} ;
      T01PK2_A13762EstCtw = new String[] {""} ;
      T01PK2_A396EmprCod = new String[] {""} ;
      T01PK2_A252CliCod = new int[1] ;
      T01PK2_A3646EstTinAny = new short[1] ;
      T01PK2_A3647EstTinMes = new byte[1] ;
      T01PK2_A3648EstTinDia = new byte[1] ;
      T01PK27_A407EmprNom = new String[] {""} ;
      T01PK27_n407EmprNom = new boolean[] {false} ;
      T01PK28_A13962BarArtTinD = new String[] {""} ;
      T01PK28_n13962BarArtTinD = new boolean[] {false} ;
      T01PK29_A13967BarNumEny = new int[1] ;
      T01PK29_n13967BarNumEny = new boolean[] {false} ;
      T01PK30_A13964BarTipDefD = new String[] {""} ;
      T01PK30_n13964BarTipDefD = new boolean[] {false} ;
      T01PK31_A13965BarIntDsc = new String[] {""} ;
      T01PK31_n13965BarIntDsc = new boolean[] {false} ;
      T01PK32_A13966BarCauDsc = new String[] {""} ;
      T01PK32_n13966BarCauDsc = new boolean[] {false} ;
      T01PK33_A396EmprCod = new String[] {""} ;
      T01PK33_A3646EstTinAny = new short[1] ;
      T01PK33_A3647EstTinMes = new byte[1] ;
      T01PK33_A3648EstTinDia = new byte[1] ;
      T01PK33_A1929EstTinNr = new short[1] ;
      T01PK33_A13944EstNormaId = new String[] {""} ;
      T01PK34_A396EmprCod = new String[] {""} ;
      T01PK34_A3646EstTinAny = new short[1] ;
      T01PK34_A3647EstTinMes = new byte[1] ;
      T01PK34_A3648EstTinDia = new byte[1] ;
      T01PK34_A1929EstTinNr = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01PK35_A396EmprCod = new String[] {""} ;
      Z13963BarTipCoTD = "" ;
      Z13841Barnhdr_lc = "" ;
      Z14199CosteInici = DecimalUtil.ZERO ;
      Z14200CosteAnyad = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ13963BarTipCoTD = "" ;
      ZZ1935BarParTin = "" ;
      ZZ1936BarSerTin = "" ;
      ZZ1937BarDscTin = "" ;
      ZZ1940BarColNoT = "" ;
      ZZ1943BarNomClT = "" ;
      ZZ1945BarMaqTin = "" ;
      ZZ1947BarKgmTin = DecimalUtil.ZERO ;
      ZZ1948BarMtrTin = DecimalUtil.ZERO ;
      ZZ2316BarAgrLot = "" ;
      ZZ3653BarPriCod = "" ;
      ZZ3654BarCosPD = DecimalUtil.ZERO ;
      ZZ3658BarCosPA = DecimalUtil.ZERO ;
      ZZ3656BarCosAD = DecimalUtil.ZERO ;
      ZZ3657BarCosAA = DecimalUtil.ZERO ;
      ZZ3705BarCosCol = DecimalUtil.ZERO ;
      ZZ3706BarCosAnc = DecimalUtil.ZERO ;
      ZZ4925BarFaseCod = "" ;
      ZZ5169BarTipDTin = "" ;
      ZZ5170BarTipCTin = "" ;
      ZZ5171BarTipNTin = "" ;
      ZZ5899BarCosttTi = DecimalUtil.ZERO ;
      ZZ6634BarRecAcb = "" ;
      ZZ8563BarKgsTt = DecimalUtil.ZERO ;
      ZZ10539BarAcs = "" ;
      ZZ10540BarNprg = "" ;
      ZZ10546BarLtsV = DecimalUtil.ZERO ;
      ZZ11177BarFecIt = GXutil.resetTime( GXutil.nullDate() );
      ZZ11178BarFecFt = GXutil.resetTime( GXutil.nullDate() );
      ZZ11179BarColNm = "" ;
      ZZ11762BarDispCli = "" ;
      ZZ12993BarMtsTt = DecimalUtil.ZERO ;
      ZZ13759EstFecCier = GXutil.nullDate() ;
      ZZ13761EstCdn2 = "" ;
      ZZ13762EstCtw = "" ;
      ZZ407EmprNom = "" ;
      ZZ13962BarArtTinD = "" ;
      ZZ13964BarTipDefD = "" ;
      ZZ13965BarIntDsc = "" ;
      ZZ13966BarCauDsc = "" ;
      ZZ13841Barnhdr_lc = "" ;
      ZZ14199CosteInici = DecimalUtil.ZERO ;
      ZZ14200CosteAnyad = DecimalUtil.ZERO ;
      T01PK36_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.lconti__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lconti__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lconti__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lconti__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lconti__default(),
         new Object[] {
             new Object[] {
            T01PK2_A1929EstTinNr, T01PK2_A1933BarCodTin, T01PK2_n1933BarCodTin, T01PK2_A1934BarReoTin, T01PK2_n1934BarReoTin, T01PK2_A1935BarParTin, T01PK2_n1935BarParTin, T01PK2_A1936BarSerTin, T01PK2_n1936BarSerTin, T01PK2_A1937BarDscTin,
            T01PK2_n1937BarDscTin, T01PK2_A1939BarArtTin, T01PK2_n1939BarArtTin, T01PK2_A1940BarColNoT, T01PK2_n1940BarColNoT, T01PK2_A1941BarColNuT, T01PK2_n1941BarColNuT, T01PK2_A1942BarTipCoT, T01PK2_n1942BarTipCoT, T01PK2_A1943BarNomClT,
            T01PK2_n1943BarNomClT, T01PK2_A1944BarNumClT, T01PK2_n1944BarNumClT, T01PK2_A1945BarMaqTin, T01PK2_n1945BarMaqTin, T01PK2_A1946BarVolTin, T01PK2_n1946BarVolTin, T01PK2_A1947BarKgmTin, T01PK2_n1947BarKgmTin, T01PK2_A1948BarMtrTin,
            T01PK2_n1948BarMtrTin, T01PK2_A1949BarPieTin, T01PK2_n1949BarPieTin, T01PK2_A2304BarEstTin, T01PK2_n2304BarEstTin, T01PK2_A2316BarAgrLot, T01PK2_n2316BarAgrLot, T01PK2_A3650BarNumAna, T01PK2_n3650BarNumAna, T01PK2_A3651BarTipDef,
            T01PK2_n3651BarTipDef, T01PK2_A3652BarIntens, T01PK2_n3652BarIntens, T01PK2_A3653BarPriCod, T01PK2_n3653BarPriCod, T01PK2_A3654BarCosPD, T01PK2_n3654BarCosPD, T01PK2_A3658BarCosPA, T01PK2_n3658BarCosPA, T01PK2_A3656BarCosAD,
            T01PK2_n3656BarCosAD, T01PK2_A3657BarCosAA, T01PK2_n3657BarCosAA, T01PK2_A3705BarCosCol, T01PK2_n3705BarCosCol, T01PK2_A3706BarCosAnc, T01PK2_n3706BarCosAnc, T01PK2_A4923BarNumActx, T01PK2_n4923BarNumActx, T01PK2_A4924BarNumPda,
            T01PK2_n4924BarNumPda, T01PK2_A4925BarFaseCod, T01PK2_n4925BarFaseCod, T01PK2_A4926BarFaseOrd, T01PK2_n4926BarFaseOrd, T01PK2_A4977BarReoNum, T01PK2_n4977BarReoNum, T01PK2_A5169BarTipDTin, T01PK2_n5169BarTipDTin, T01PK2_A5170BarTipCTin,
            T01PK2_n5170BarTipCTin, T01PK2_A5171BarTipNTin, T01PK2_n5171BarTipNTin, T01PK2_A5899BarCosttTi, T01PK2_n5899BarCosttTi, T01PK2_A5900BarRbTeo, T01PK2_n5900BarRbTeo, T01PK2_A6177BarNumTin, T01PK2_n6177BarNumTin, T01PK2_A6431BarCausa,
            T01PK2_n6431BarCausa, T01PK2_A6634BarRecAcb, T01PK2_n6634BarRecAcb, T01PK2_A8563BarKgsTt, T01PK2_n8563BarKgsTt, T01PK2_A8584FamCodT, T01PK2_n8584FamCodT, T01PK2_A8609BarForNum, T01PK2_n8609BarForNum, T01PK2_A9754BarNTint,
            T01PK2_n9754BarNTint, T01PK2_A10539BarAcs, T01PK2_n10539BarAcs, T01PK2_A10540BarNprg, T01PK2_n10540BarNprg, T01PK2_A10541BarLts, T01PK2_n10541BarLts, T01PK2_A10546BarLtsV, T01PK2_n10546BarLtsV, T01PK2_A11177BarFecIt,
            T01PK2_n11177BarFecIt, T01PK2_A11178BarFecFt, T01PK2_n11178BarFecFt, T01PK2_A11179BarColNm, T01PK2_n11179BarColNm, T01PK2_A11762BarDispCli, T01PK2_n11762BarDispCli, T01PK2_A12993BarMtsTt, T01PK2_n12993BarMtsTt, T01PK2_A13759EstFecCier,
            T01PK2_A13760EstCdn1, T01PK2_A13761EstCdn2, T01PK2_A13762EstCtw, T01PK2_A396EmprCod, T01PK2_A252CliCod, T01PK2_A3646EstTinAny, T01PK2_A3647EstTinMes, T01PK2_A3648EstTinDia
            }
            , new Object[] {
            T01PK3_A1929EstTinNr, T01PK3_A1933BarCodTin, T01PK3_n1933BarCodTin, T01PK3_A1934BarReoTin, T01PK3_n1934BarReoTin, T01PK3_A1935BarParTin, T01PK3_n1935BarParTin, T01PK3_A1936BarSerTin, T01PK3_n1936BarSerTin, T01PK3_A1937BarDscTin,
            T01PK3_n1937BarDscTin, T01PK3_A1939BarArtTin, T01PK3_n1939BarArtTin, T01PK3_A1940BarColNoT, T01PK3_n1940BarColNoT, T01PK3_A1941BarColNuT, T01PK3_n1941BarColNuT, T01PK3_A1942BarTipCoT, T01PK3_n1942BarTipCoT, T01PK3_A1943BarNomClT,
            T01PK3_n1943BarNomClT, T01PK3_A1944BarNumClT, T01PK3_n1944BarNumClT, T01PK3_A1945BarMaqTin, T01PK3_n1945BarMaqTin, T01PK3_A1946BarVolTin, T01PK3_n1946BarVolTin, T01PK3_A1947BarKgmTin, T01PK3_n1947BarKgmTin, T01PK3_A1948BarMtrTin,
            T01PK3_n1948BarMtrTin, T01PK3_A1949BarPieTin, T01PK3_n1949BarPieTin, T01PK3_A2304BarEstTin, T01PK3_n2304BarEstTin, T01PK3_A2316BarAgrLot, T01PK3_n2316BarAgrLot, T01PK3_A3650BarNumAna, T01PK3_n3650BarNumAna, T01PK3_A3651BarTipDef,
            T01PK3_n3651BarTipDef, T01PK3_A3652BarIntens, T01PK3_n3652BarIntens, T01PK3_A3653BarPriCod, T01PK3_n3653BarPriCod, T01PK3_A3654BarCosPD, T01PK3_n3654BarCosPD, T01PK3_A3658BarCosPA, T01PK3_n3658BarCosPA, T01PK3_A3656BarCosAD,
            T01PK3_n3656BarCosAD, T01PK3_A3657BarCosAA, T01PK3_n3657BarCosAA, T01PK3_A3705BarCosCol, T01PK3_n3705BarCosCol, T01PK3_A3706BarCosAnc, T01PK3_n3706BarCosAnc, T01PK3_A4923BarNumActx, T01PK3_n4923BarNumActx, T01PK3_A4924BarNumPda,
            T01PK3_n4924BarNumPda, T01PK3_A4925BarFaseCod, T01PK3_n4925BarFaseCod, T01PK3_A4926BarFaseOrd, T01PK3_n4926BarFaseOrd, T01PK3_A4977BarReoNum, T01PK3_n4977BarReoNum, T01PK3_A5169BarTipDTin, T01PK3_n5169BarTipDTin, T01PK3_A5170BarTipCTin,
            T01PK3_n5170BarTipCTin, T01PK3_A5171BarTipNTin, T01PK3_n5171BarTipNTin, T01PK3_A5899BarCosttTi, T01PK3_n5899BarCosttTi, T01PK3_A5900BarRbTeo, T01PK3_n5900BarRbTeo, T01PK3_A6177BarNumTin, T01PK3_n6177BarNumTin, T01PK3_A6431BarCausa,
            T01PK3_n6431BarCausa, T01PK3_A6634BarRecAcb, T01PK3_n6634BarRecAcb, T01PK3_A8563BarKgsTt, T01PK3_n8563BarKgsTt, T01PK3_A8584FamCodT, T01PK3_n8584FamCodT, T01PK3_A8609BarForNum, T01PK3_n8609BarForNum, T01PK3_A9754BarNTint,
            T01PK3_n9754BarNTint, T01PK3_A10539BarAcs, T01PK3_n10539BarAcs, T01PK3_A10540BarNprg, T01PK3_n10540BarNprg, T01PK3_A10541BarLts, T01PK3_n10541BarLts, T01PK3_A10546BarLtsV, T01PK3_n10546BarLtsV, T01PK3_A11177BarFecIt,
            T01PK3_n11177BarFecIt, T01PK3_A11178BarFecFt, T01PK3_n11178BarFecFt, T01PK3_A11179BarColNm, T01PK3_n11179BarColNm, T01PK3_A11762BarDispCli, T01PK3_n11762BarDispCli, T01PK3_A12993BarMtsTt, T01PK3_n12993BarMtsTt, T01PK3_A13759EstFecCier,
            T01PK3_A13760EstCdn1, T01PK3_A13761EstCdn2, T01PK3_A13762EstCtw, T01PK3_A396EmprCod, T01PK3_A252CliCod, T01PK3_A3646EstTinAny, T01PK3_A3647EstTinMes, T01PK3_A3648EstTinDia
            }
            , new Object[] {
            T01PK4_A407EmprNom, T01PK4_n407EmprNom
            }
            , new Object[] {
            T01PK5_A396EmprCod
            }
            , new Object[] {
            T01PK6_A396EmprCod
            }
            , new Object[] {
            T01PK7_A13962BarArtTinD, T01PK7_n13962BarArtTinD
            }
            , new Object[] {
            T01PK8_A13964BarTipDefD, T01PK8_n13964BarTipDefD
            }
            , new Object[] {
            T01PK9_A13965BarIntDsc, T01PK9_n13965BarIntDsc
            }
            , new Object[] {
            T01PK10_A13966BarCauDsc, T01PK10_n13966BarCauDsc
            }
            , new Object[] {
            T01PK11_A13967BarNumEny, T01PK11_n13967BarNumEny
            }
            , new Object[] {
            T01PK12_A5085CodCausa, T01PK12_A583IntCod, T01PK12_A833TipDefCod, T01PK12_A494ForSer, T01PK12_A482ForColNom, T01PK12_A483ForColNum, T01PK12_A831TipColCod, T01PK12_A829TipArtCod, T01PK12_A1929EstTinNr, T01PK12_A407EmprNom,
            T01PK12_n407EmprNom, T01PK12_A1933BarCodTin, T01PK12_n1933BarCodTin, T01PK12_A1934BarReoTin, T01PK12_n1934BarReoTin, T01PK12_A1935BarParTin, T01PK12_n1935BarParTin, T01PK12_A1936BarSerTin, T01PK12_n1936BarSerTin, T01PK12_A1937BarDscTin,
            T01PK12_n1937BarDscTin, T01PK12_A1939BarArtTin, T01PK12_n1939BarArtTin, T01PK12_A1940BarColNoT, T01PK12_n1940BarColNoT, T01PK12_A1941BarColNuT, T01PK12_n1941BarColNuT, T01PK12_A1942BarTipCoT, T01PK12_n1942BarTipCoT, T01PK12_A1943BarNomClT,
            T01PK12_n1943BarNomClT, T01PK12_A1944BarNumClT, T01PK12_n1944BarNumClT, T01PK12_A1945BarMaqTin, T01PK12_n1945BarMaqTin, T01PK12_A1946BarVolTin, T01PK12_n1946BarVolTin, T01PK12_A1947BarKgmTin, T01PK12_n1947BarKgmTin, T01PK12_A1948BarMtrTin,
            T01PK12_n1948BarMtrTin, T01PK12_A1949BarPieTin, T01PK12_n1949BarPieTin, T01PK12_A2304BarEstTin, T01PK12_n2304BarEstTin, T01PK12_A2316BarAgrLot, T01PK12_n2316BarAgrLot, T01PK12_A3650BarNumAna, T01PK12_n3650BarNumAna, T01PK12_A3651BarTipDef,
            T01PK12_n3651BarTipDef, T01PK12_A3652BarIntens, T01PK12_n3652BarIntens, T01PK12_A3653BarPriCod, T01PK12_n3653BarPriCod, T01PK12_A3654BarCosPD, T01PK12_n3654BarCosPD, T01PK12_A3658BarCosPA, T01PK12_n3658BarCosPA, T01PK12_A3656BarCosAD,
            T01PK12_n3656BarCosAD, T01PK12_A3657BarCosAA, T01PK12_n3657BarCosAA, T01PK12_A3705BarCosCol, T01PK12_n3705BarCosCol, T01PK12_A3706BarCosAnc, T01PK12_n3706BarCosAnc, T01PK12_A4923BarNumActx, T01PK12_n4923BarNumActx, T01PK12_A4924BarNumPda,
            T01PK12_n4924BarNumPda, T01PK12_A4925BarFaseCod, T01PK12_n4925BarFaseCod, T01PK12_A4926BarFaseOrd, T01PK12_n4926BarFaseOrd, T01PK12_A4977BarReoNum, T01PK12_n4977BarReoNum, T01PK12_A5169BarTipDTin, T01PK12_n5169BarTipDTin, T01PK12_A5170BarTipCTin,
            T01PK12_n5170BarTipCTin, T01PK12_A5171BarTipNTin, T01PK12_n5171BarTipNTin, T01PK12_A5899BarCosttTi, T01PK12_n5899BarCosttTi, T01PK12_A5900BarRbTeo, T01PK12_n5900BarRbTeo, T01PK12_A6177BarNumTin, T01PK12_n6177BarNumTin, T01PK12_A6431BarCausa,
            T01PK12_n6431BarCausa, T01PK12_A6634BarRecAcb, T01PK12_n6634BarRecAcb, T01PK12_A8563BarKgsTt, T01PK12_n8563BarKgsTt, T01PK12_A8584FamCodT, T01PK12_n8584FamCodT, T01PK12_A8609BarForNum, T01PK12_n8609BarForNum, T01PK12_A9754BarNTint,
            T01PK12_n9754BarNTint, T01PK12_A10539BarAcs, T01PK12_n10539BarAcs, T01PK12_A10540BarNprg, T01PK12_n10540BarNprg, T01PK12_A10541BarLts, T01PK12_n10541BarLts, T01PK12_A10546BarLtsV, T01PK12_n10546BarLtsV, T01PK12_A11177BarFecIt,
            T01PK12_n11177BarFecIt, T01PK12_A11178BarFecFt, T01PK12_n11178BarFecFt, T01PK12_A11179BarColNm, T01PK12_n11179BarColNm, T01PK12_A11762BarDispCli, T01PK12_n11762BarDispCli, T01PK12_A12993BarMtsTt, T01PK12_n12993BarMtsTt, T01PK12_A13759EstFecCier,
            T01PK12_A13760EstCdn1, T01PK12_A13761EstCdn2, T01PK12_A13762EstCtw, T01PK12_A396EmprCod, T01PK12_A252CliCod, T01PK12_A3646EstTinAny, T01PK12_A3647EstTinMes, T01PK12_A3648EstTinDia, T01PK12_A13962BarArtTinD, T01PK12_n13962BarArtTinD,
            T01PK12_A13964BarTipDefD, T01PK12_n13964BarTipDefD, T01PK12_A13965BarIntDsc, T01PK12_n13965BarIntDsc, T01PK12_A13966BarCauDsc, T01PK12_n13966BarCauDsc, T01PK12_A13967BarNumEny, T01PK12_n13967BarNumEny
            }
            , new Object[] {
            T01PK13_A407EmprNom, T01PK13_n407EmprNom
            }
            , new Object[] {
            T01PK14_A396EmprCod
            }
            , new Object[] {
            T01PK15_A13962BarArtTinD, T01PK15_n13962BarArtTinD
            }
            , new Object[] {
            T01PK16_A13964BarTipDefD, T01PK16_n13964BarTipDefD
            }
            , new Object[] {
            T01PK17_A13965BarIntDsc, T01PK17_n13965BarIntDsc
            }
            , new Object[] {
            T01PK18_A13966BarCauDsc, T01PK18_n13966BarCauDsc
            }
            , new Object[] {
            T01PK19_A13967BarNumEny, T01PK19_n13967BarNumEny
            }
            , new Object[] {
            T01PK20_A396EmprCod
            }
            , new Object[] {
            T01PK21_A396EmprCod, T01PK21_A3646EstTinAny, T01PK21_A3647EstTinMes, T01PK21_A3648EstTinDia, T01PK21_A1929EstTinNr
            }
            , new Object[] {
            T01PK22_A396EmprCod, T01PK22_A3646EstTinAny, T01PK22_A3647EstTinMes, T01PK22_A3648EstTinDia, T01PK22_A1929EstTinNr
            }
            , new Object[] {
            T01PK23_A396EmprCod, T01PK23_A3646EstTinAny, T01PK23_A3647EstTinMes, T01PK23_A3648EstTinDia, T01PK23_A1929EstTinNr
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PK27_A407EmprNom, T01PK27_n407EmprNom
            }
            , new Object[] {
            T01PK28_A13962BarArtTinD, T01PK28_n13962BarArtTinD
            }
            , new Object[] {
            T01PK29_A13967BarNumEny, T01PK29_n13967BarNumEny
            }
            , new Object[] {
            T01PK30_A13964BarTipDefD, T01PK30_n13964BarTipDefD
            }
            , new Object[] {
            T01PK31_A13965BarIntDsc, T01PK31_n13965BarIntDsc
            }
            , new Object[] {
            T01PK32_A13966BarCauDsc, T01PK32_n13966BarCauDsc
            }
            , new Object[] {
            T01PK33_A396EmprCod, T01PK33_A3646EstTinAny, T01PK33_A3647EstTinMes, T01PK33_A3648EstTinDia, T01PK33_A1929EstTinNr, T01PK33_A13944EstNormaId
            }
            , new Object[] {
            T01PK34_A396EmprCod, T01PK34_A3646EstTinAny, T01PK34_A3647EstTinMes, T01PK34_A3648EstTinDia, T01PK34_A1929EstTinNr
            }
            , new Object[] {
            T01PK35_A396EmprCod
            }
            , new Object[] {
            T01PK36_A396EmprCod
            }
         }
      );
   }

   private byte Z3647EstTinMes ;
   private byte Z3648EstTinDia ;
   private byte Z1934BarReoTin ;
   private byte Z1942BarTipCoT ;
   private byte Z2304BarEstTin ;
   private byte Z3652BarIntens ;
   private byte Z9754BarNTint ;
   private byte GxWebError ;
   private byte A3652BarIntens ;
   private byte A1942BarTipCoT ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte nKeyPressed ;
   private byte A1934BarReoTin ;
   private byte A2304BarEstTin ;
   private byte A9754BarNTint ;
   private byte A831TipColCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ3647EstTinMes ;
   private byte ZZ3648EstTinDia ;
   private byte ZZ1934BarReoTin ;
   private byte ZZ1942BarTipCoT ;
   private byte ZZ2304BarEstTin ;
   private byte ZZ3652BarIntens ;
   private byte ZZ9754BarNTint ;
   private short Z3646EstTinAny ;
   private short Z1929EstTinNr ;
   private short Z1939BarArtTin ;
   private short Z3650BarNumAna ;
   private short Z3651BarTipDef ;
   private short Z4923BarNumActx ;
   private short Z4926BarFaseOrd ;
   private short Z4977BarReoNum ;
   private short Z5900BarRbTeo ;
   private short Z6431BarCausa ;
   private short Z8584FamCodT ;
   private short Z13760EstCdn1 ;
   private short A1939BarArtTin ;
   private short A3651BarTipDef ;
   private short A6431BarCausa ;
   private short A3646EstTinAny ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1929EstTinNr ;
   private short A3650BarNumAna ;
   private short A4923BarNumActx ;
   private short A4926BarFaseOrd ;
   private short A4977BarReoNum ;
   private short A5900BarRbTeo ;
   private short A8584FamCodT ;
   private short A13760EstCdn1 ;
   private short A13975BarNumtint ;
   private short RcdFound510 ;
   private short nIsDirty_510 ;
   private short Z13975BarNumtint ;
   private short ZZ3646EstTinAny ;
   private short ZZ1929EstTinNr ;
   private short ZZ1939BarArtTin ;
   private short ZZ3650BarNumAna ;
   private short ZZ3651BarTipDef ;
   private short ZZ4923BarNumActx ;
   private short ZZ4926BarFaseOrd ;
   private short ZZ4977BarReoNum ;
   private short ZZ5900BarRbTeo ;
   private short ZZ6431BarCausa ;
   private short ZZ8584FamCodT ;
   private short ZZ13760EstCdn1 ;
   private short ZZ13975BarNumtint ;
   private int Z1933BarCodTin ;
   private int Z1941BarColNuT ;
   private int Z1944BarNumClT ;
   private int Z1946BarVolTin ;
   private int Z1949BarPieTin ;
   private int Z4924BarNumPda ;
   private int Z6177BarNumTin ;
   private int Z8609BarForNum ;
   private int Z10541BarLts ;
   private int Z252CliCod ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEstTinAny_Enabled ;
   private int edtEstTinMes_Enabled ;
   private int edtEstTinDia_Enabled ;
   private int edtEstTinNr_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtBarnhdr_lc_Enabled ;
   private int A1933BarCodTin ;
   private int edtBarCodTin_Enabled ;
   private int edtBarReoTin_Enabled ;
   private int edtBarParTin_Enabled ;
   private int edtBarSerTin_Enabled ;
   private int edtBarDscTin_Enabled ;
   private int edtBarArtTin_Enabled ;
   private int edtBarArtTinD_Enabled ;
   private int edtBarColNoT_Enabled ;
   private int edtBarColNuT_Enabled ;
   private int edtBarTipCoT_Enabled ;
   private int edtBarTipCoTD_Enabled ;
   private int edtBarNomClT_Enabled ;
   private int A1944BarNumClT ;
   private int edtBarNumClT_Enabled ;
   private int edtBarMaqTin_Enabled ;
   private int A1946BarVolTin ;
   private int edtBarVolTin_Enabled ;
   private int edtBarKgmTin_Enabled ;
   private int edtBarMtrTin_Enabled ;
   private int A1949BarPieTin ;
   private int edtBarPieTin_Enabled ;
   private int edtBarEstTin_Enabled ;
   private int edtBarAgrLot_Enabled ;
   private int edtBarNumAna_Enabled ;
   private int edtBarTipDef_Enabled ;
   private int edtBarTipDefD_Enabled ;
   private int edtBarIntens_Enabled ;
   private int edtBarIntDsc_Enabled ;
   private int edtBarPriCod_Enabled ;
   private int edtBarCosPD_Enabled ;
   private int edtBarCosPA_Enabled ;
   private int edtBarCosAD_Enabled ;
   private int edtBarCosAA_Enabled ;
   private int edtBarCosCol_Enabled ;
   private int edtBarCosAnc_Enabled ;
   private int edtBarNumActx_Enabled ;
   private int A4924BarNumPda ;
   private int edtBarNumPda_Enabled ;
   private int edtBarFaseCod_Enabled ;
   private int edtBarFaseOrd_Enabled ;
   private int edtBarReoNum_Enabled ;
   private int edtBarTipDTin_Enabled ;
   private int edtBarTipCTin_Enabled ;
   private int edtBarTipNTin_Enabled ;
   private int edtBarCosttTi_Enabled ;
   private int edtBarRbTeo_Enabled ;
   private int A6177BarNumTin ;
   private int edtBarNumTin_Enabled ;
   private int edtBarCausa_Enabled ;
   private int edtBarCauDsc_Enabled ;
   private int edtBarRecAcb_Enabled ;
   private int edtBarKgsTt_Enabled ;
   private int edtFamCodT_Enabled ;
   private int A8609BarForNum ;
   private int edtBarForNum_Enabled ;
   private int edtBarNTint_Enabled ;
   private int edtBarAcs_Enabled ;
   private int edtBarNprg_Enabled ;
   private int A10541BarLts ;
   private int edtBarLts_Enabled ;
   private int edtBarLtsV_Enabled ;
   private int edtBarFecIt_Enabled ;
   private int edtBarFecFt_Enabled ;
   private int edtBarColNm_Enabled ;
   private int edtBarDispCli_Enabled ;
   private int edtBarMtsTt_Enabled ;
   private int edtEstFecCier_Enabled ;
   private int edtEstCdn1_Enabled ;
   private int edtEstCdn2_Enabled ;
   private int edtEstCtw_Enabled ;
   private int A13967BarNumEny ;
   private int edtBarNumEny_Enabled ;
   private int edtBarNumtint_Enabled ;
   private int edtCosteInici_Enabled ;
   private int edtCosteAnyad_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z13967BarNumEny ;
   private int idxLst ;
   private int ZZ252CliCod ;
   private int ZZ1933BarCodTin ;
   private int ZZ1941BarColNuT ;
   private int ZZ1944BarNumClT ;
   private int ZZ1946BarVolTin ;
   private int ZZ1949BarPieTin ;
   private int ZZ4924BarNumPda ;
   private int ZZ6177BarNumTin ;
   private int ZZ8609BarForNum ;
   private int ZZ10541BarLts ;
   private int ZZ13967BarNumEny ;
   private java.math.BigDecimal Z1947BarKgmTin ;
   private java.math.BigDecimal Z1948BarMtrTin ;
   private java.math.BigDecimal Z3654BarCosPD ;
   private java.math.BigDecimal Z3658BarCosPA ;
   private java.math.BigDecimal Z3656BarCosAD ;
   private java.math.BigDecimal Z3657BarCosAA ;
   private java.math.BigDecimal Z3705BarCosCol ;
   private java.math.BigDecimal Z3706BarCosAnc ;
   private java.math.BigDecimal Z5899BarCosttTi ;
   private java.math.BigDecimal Z8563BarKgsTt ;
   private java.math.BigDecimal Z10546BarLtsV ;
   private java.math.BigDecimal Z12993BarMtsTt ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal A5899BarCosttTi ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A10546BarLtsV ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A14199CosteInici ;
   private java.math.BigDecimal A14200CosteAnyad ;
   private java.math.BigDecimal Z14199CosteInici ;
   private java.math.BigDecimal Z14200CosteAnyad ;
   private java.math.BigDecimal ZZ1947BarKgmTin ;
   private java.math.BigDecimal ZZ1948BarMtrTin ;
   private java.math.BigDecimal ZZ3654BarCosPD ;
   private java.math.BigDecimal ZZ3658BarCosPA ;
   private java.math.BigDecimal ZZ3656BarCosAD ;
   private java.math.BigDecimal ZZ3657BarCosAA ;
   private java.math.BigDecimal ZZ3705BarCosCol ;
   private java.math.BigDecimal ZZ3706BarCosAnc ;
   private java.math.BigDecimal ZZ5899BarCosttTi ;
   private java.math.BigDecimal ZZ8563BarKgsTt ;
   private java.math.BigDecimal ZZ10546BarLtsV ;
   private java.math.BigDecimal ZZ12993BarMtsTt ;
   private java.math.BigDecimal ZZ14199CosteInici ;
   private java.math.BigDecimal ZZ14200CosteAnyad ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z1935BarParTin ;
   private String Z1936BarSerTin ;
   private String Z1937BarDscTin ;
   private String Z1940BarColNoT ;
   private String Z1943BarNomClT ;
   private String Z1945BarMaqTin ;
   private String Z2316BarAgrLot ;
   private String Z3653BarPriCod ;
   private String Z4925BarFaseCod ;
   private String Z5169BarTipDTin ;
   private String Z5170BarTipCTin ;
   private String Z5171BarTipNTin ;
   private String Z6634BarRecAcb ;
   private String Z10539BarAcs ;
   private String Z10540BarNprg ;
   private String Z11179BarColNm ;
   private String Z11762BarDispCli ;
   private String Z13761EstCdn2 ;
   private String Z13762EstCtw ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1936BarSerTin ;
   private String A1940BarColNoT ;
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
   private String edtEstTinAny_Internalname ;
   private String edtEstTinAny_Jsonclick ;
   private String edtEstTinMes_Internalname ;
   private String edtEstTinMes_Jsonclick ;
   private String edtEstTinDia_Internalname ;
   private String edtEstTinDia_Jsonclick ;
   private String edtEstTinNr_Internalname ;
   private String edtEstTinNr_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarnhdr_lc_Internalname ;
   private String A13841Barnhdr_lc ;
   private String edtBarnhdr_lc_Jsonclick ;
   private String edtBarCodTin_Internalname ;
   private String edtBarCodTin_Jsonclick ;
   private String edtBarReoTin_Internalname ;
   private String edtBarReoTin_Jsonclick ;
   private String edtBarParTin_Internalname ;
   private String A1935BarParTin ;
   private String edtBarParTin_Jsonclick ;
   private String edtBarSerTin_Internalname ;
   private String edtBarSerTin_Jsonclick ;
   private String edtBarDscTin_Internalname ;
   private String A1937BarDscTin ;
   private String edtBarDscTin_Jsonclick ;
   private String edtBarArtTin_Internalname ;
   private String edtBarArtTin_Jsonclick ;
   private String edtBarArtTinD_Internalname ;
   private String A13962BarArtTinD ;
   private String edtBarArtTinD_Jsonclick ;
   private String edtBarColNoT_Internalname ;
   private String edtBarColNoT_Jsonclick ;
   private String edtBarColNuT_Internalname ;
   private String edtBarColNuT_Jsonclick ;
   private String edtBarTipCoT_Internalname ;
   private String edtBarTipCoT_Jsonclick ;
   private String edtBarTipCoTD_Internalname ;
   private String A13963BarTipCoTD ;
   private String edtBarTipCoTD_Jsonclick ;
   private String edtBarNomClT_Internalname ;
   private String A1943BarNomClT ;
   private String edtBarNomClT_Jsonclick ;
   private String edtBarNumClT_Internalname ;
   private String edtBarNumClT_Jsonclick ;
   private String edtBarMaqTin_Internalname ;
   private String A1945BarMaqTin ;
   private String edtBarMaqTin_Jsonclick ;
   private String edtBarVolTin_Internalname ;
   private String edtBarVolTin_Jsonclick ;
   private String edtBarKgmTin_Internalname ;
   private String edtBarKgmTin_Jsonclick ;
   private String edtBarMtrTin_Internalname ;
   private String edtBarMtrTin_Jsonclick ;
   private String edtBarPieTin_Internalname ;
   private String edtBarPieTin_Jsonclick ;
   private String edtBarEstTin_Internalname ;
   private String edtBarEstTin_Jsonclick ;
   private String edtBarAgrLot_Internalname ;
   private String A2316BarAgrLot ;
   private String edtBarAgrLot_Jsonclick ;
   private String edtBarNumAna_Internalname ;
   private String edtBarNumAna_Jsonclick ;
   private String edtBarTipDef_Internalname ;
   private String edtBarTipDef_Jsonclick ;
   private String edtBarTipDefD_Internalname ;
   private String A13964BarTipDefD ;
   private String edtBarTipDefD_Jsonclick ;
   private String edtBarIntens_Internalname ;
   private String edtBarIntens_Jsonclick ;
   private String edtBarIntDsc_Internalname ;
   private String A13965BarIntDsc ;
   private String edtBarIntDsc_Jsonclick ;
   private String edtBarPriCod_Internalname ;
   private String A3653BarPriCod ;
   private String edtBarPriCod_Jsonclick ;
   private String edtBarCosPD_Internalname ;
   private String edtBarCosPD_Jsonclick ;
   private String edtBarCosPA_Internalname ;
   private String edtBarCosPA_Jsonclick ;
   private String edtBarCosAD_Internalname ;
   private String edtBarCosAD_Jsonclick ;
   private String edtBarCosAA_Internalname ;
   private String edtBarCosAA_Jsonclick ;
   private String edtBarCosCol_Internalname ;
   private String edtBarCosCol_Jsonclick ;
   private String edtBarCosAnc_Internalname ;
   private String edtBarCosAnc_Jsonclick ;
   private String edtBarNumActx_Internalname ;
   private String edtBarNumActx_Jsonclick ;
   private String edtBarNumPda_Internalname ;
   private String edtBarNumPda_Jsonclick ;
   private String edtBarFaseCod_Internalname ;
   private String A4925BarFaseCod ;
   private String edtBarFaseCod_Jsonclick ;
   private String edtBarFaseOrd_Internalname ;
   private String edtBarFaseOrd_Jsonclick ;
   private String edtBarReoNum_Internalname ;
   private String edtBarReoNum_Jsonclick ;
   private String edtBarTipDTin_Internalname ;
   private String A5169BarTipDTin ;
   private String edtBarTipDTin_Jsonclick ;
   private String edtBarTipCTin_Internalname ;
   private String A5170BarTipCTin ;
   private String edtBarTipCTin_Jsonclick ;
   private String edtBarTipNTin_Internalname ;
   private String A5171BarTipNTin ;
   private String edtBarTipNTin_Jsonclick ;
   private String edtBarCosttTi_Internalname ;
   private String edtBarCosttTi_Jsonclick ;
   private String edtBarRbTeo_Internalname ;
   private String edtBarRbTeo_Jsonclick ;
   private String edtBarNumTin_Internalname ;
   private String edtBarNumTin_Jsonclick ;
   private String edtBarCausa_Internalname ;
   private String edtBarCausa_Jsonclick ;
   private String edtBarCauDsc_Internalname ;
   private String A13966BarCauDsc ;
   private String edtBarCauDsc_Jsonclick ;
   private String edtBarRecAcb_Internalname ;
   private String A6634BarRecAcb ;
   private String edtBarRecAcb_Jsonclick ;
   private String edtBarKgsTt_Internalname ;
   private String edtBarKgsTt_Jsonclick ;
   private String edtFamCodT_Internalname ;
   private String edtFamCodT_Jsonclick ;
   private String edtBarForNum_Internalname ;
   private String edtBarForNum_Jsonclick ;
   private String edtBarNTint_Internalname ;
   private String edtBarNTint_Jsonclick ;
   private String edtBarAcs_Internalname ;
   private String A10539BarAcs ;
   private String edtBarAcs_Jsonclick ;
   private String edtBarNprg_Internalname ;
   private String A10540BarNprg ;
   private String edtBarNprg_Jsonclick ;
   private String edtBarLts_Internalname ;
   private String edtBarLts_Jsonclick ;
   private String edtBarLtsV_Internalname ;
   private String edtBarLtsV_Jsonclick ;
   private String edtBarFecIt_Internalname ;
   private String edtBarFecIt_Jsonclick ;
   private String edtBarFecFt_Internalname ;
   private String edtBarFecFt_Jsonclick ;
   private String edtBarColNm_Internalname ;
   private String A11179BarColNm ;
   private String edtBarColNm_Jsonclick ;
   private String edtBarDispCli_Internalname ;
   private String A11762BarDispCli ;
   private String edtBarDispCli_Jsonclick ;
   private String edtBarMtsTt_Internalname ;
   private String edtBarMtsTt_Jsonclick ;
   private String edtEstFecCier_Internalname ;
   private String edtEstFecCier_Jsonclick ;
   private String edtEstCdn1_Internalname ;
   private String edtEstCdn1_Jsonclick ;
   private String edtEstCdn2_Internalname ;
   private String A13761EstCdn2 ;
   private String edtEstCdn2_Jsonclick ;
   private String edtEstCtw_Internalname ;
   private String A13762EstCtw ;
   private String edtEstCtw_Jsonclick ;
   private String edtBarNumEny_Internalname ;
   private String edtBarNumEny_Jsonclick ;
   private String edtBarNumtint_Internalname ;
   private String edtBarNumtint_Jsonclick ;
   private String edtCosteInici_Internalname ;
   private String edtCosteInici_Jsonclick ;
   private String edtCosteAnyad_Internalname ;
   private String edtCosteAnyad_Jsonclick ;
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
   private String Z13962BarArtTinD ;
   private String Z13964BarTipDefD ;
   private String Z13965BarIntDsc ;
   private String Z13966BarCauDsc ;
   private String sMode510 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13963BarTipCoTD ;
   private String Z13841Barnhdr_lc ;
   private String ZZ396EmprCod ;
   private String ZZ13963BarTipCoTD ;
   private String ZZ1935BarParTin ;
   private String ZZ1936BarSerTin ;
   private String ZZ1937BarDscTin ;
   private String ZZ1940BarColNoT ;
   private String ZZ1943BarNomClT ;
   private String ZZ1945BarMaqTin ;
   private String ZZ2316BarAgrLot ;
   private String ZZ3653BarPriCod ;
   private String ZZ4925BarFaseCod ;
   private String ZZ5169BarTipDTin ;
   private String ZZ5170BarTipCTin ;
   private String ZZ5171BarTipNTin ;
   private String ZZ6634BarRecAcb ;
   private String ZZ10539BarAcs ;
   private String ZZ10540BarNprg ;
   private String ZZ11179BarColNm ;
   private String ZZ11762BarDispCli ;
   private String ZZ13761EstCdn2 ;
   private String ZZ13762EstCtw ;
   private String ZZ407EmprNom ;
   private String ZZ13962BarArtTinD ;
   private String ZZ13964BarTipDefD ;
   private String ZZ13965BarIntDsc ;
   private String ZZ13966BarCauDsc ;
   private String ZZ13841Barnhdr_lc ;
   private java.util.Date Z11177BarFecIt ;
   private java.util.Date Z11178BarFecFt ;
   private java.util.Date A11177BarFecIt ;
   private java.util.Date A11178BarFecFt ;
   private java.util.Date ZZ11177BarFecIt ;
   private java.util.Date ZZ11178BarFecFt ;
   private java.util.Date Z13759EstFecCier ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date ZZ13759EstFecCier ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1939BarArtTin ;
   private boolean n3651BarTipDef ;
   private boolean n3652BarIntens ;
   private boolean n6431BarCausa ;
   private boolean n1936BarSerTin ;
   private boolean n1940BarColNoT ;
   private boolean n1941BarColNuT ;
   private boolean n1942BarTipCoT ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n1933BarCodTin ;
   private boolean n1934BarReoTin ;
   private boolean n1935BarParTin ;
   private boolean n1937BarDscTin ;
   private boolean n13962BarArtTinD ;
   private boolean n1943BarNomClT ;
   private boolean n1944BarNumClT ;
   private boolean n1945BarMaqTin ;
   private boolean n1946BarVolTin ;
   private boolean n1947BarKgmTin ;
   private boolean n1948BarMtrTin ;
   private boolean n1949BarPieTin ;
   private boolean n2304BarEstTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3650BarNumAna ;
   private boolean n13964BarTipDefD ;
   private boolean n13965BarIntDsc ;
   private boolean n3653BarPriCod ;
   private boolean n3654BarCosPD ;
   private boolean n3658BarCosPA ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3705BarCosCol ;
   private boolean n3706BarCosAnc ;
   private boolean n4923BarNumActx ;
   private boolean n4924BarNumPda ;
   private boolean n4925BarFaseCod ;
   private boolean n4926BarFaseOrd ;
   private boolean n4977BarReoNum ;
   private boolean n5169BarTipDTin ;
   private boolean n5170BarTipCTin ;
   private boolean n5171BarTipNTin ;
   private boolean n5899BarCosttTi ;
   private boolean n5900BarRbTeo ;
   private boolean n6177BarNumTin ;
   private boolean n13966BarCauDsc ;
   private boolean n6634BarRecAcb ;
   private boolean n8563BarKgsTt ;
   private boolean n8584FamCodT ;
   private boolean n8609BarForNum ;
   private boolean n9754BarNTint ;
   private boolean n10539BarAcs ;
   private boolean n10540BarNprg ;
   private boolean n10541BarLts ;
   private boolean n10546BarLtsV ;
   private boolean n11177BarFecIt ;
   private boolean n11178BarFecFt ;
   private boolean n11179BarColNm ;
   private boolean n11762BarDispCli ;
   private boolean n12993BarMtsTt ;
   private boolean n13967BarNumEny ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private short[] T01PK12_A5085CodCausa ;
   private byte[] T01PK12_A583IntCod ;
   private short[] T01PK12_A833TipDefCod ;
   private String[] T01PK12_A494ForSer ;
   private String[] T01PK12_A482ForColNom ;
   private int[] T01PK12_A483ForColNum ;
   private byte[] T01PK12_A831TipColCod ;
   private short[] T01PK12_A829TipArtCod ;
   private short[] T01PK12_A1929EstTinNr ;
   private String[] T01PK12_A407EmprNom ;
   private boolean[] T01PK12_n407EmprNom ;
   private int[] T01PK12_A1933BarCodTin ;
   private boolean[] T01PK12_n1933BarCodTin ;
   private byte[] T01PK12_A1934BarReoTin ;
   private boolean[] T01PK12_n1934BarReoTin ;
   private String[] T01PK12_A1935BarParTin ;
   private boolean[] T01PK12_n1935BarParTin ;
   private String[] T01PK12_A1936BarSerTin ;
   private boolean[] T01PK12_n1936BarSerTin ;
   private String[] T01PK12_A1937BarDscTin ;
   private boolean[] T01PK12_n1937BarDscTin ;
   private short[] T01PK12_A1939BarArtTin ;
   private boolean[] T01PK12_n1939BarArtTin ;
   private String[] T01PK12_A1940BarColNoT ;
   private boolean[] T01PK12_n1940BarColNoT ;
   private int[] T01PK12_A1941BarColNuT ;
   private boolean[] T01PK12_n1941BarColNuT ;
   private byte[] T01PK12_A1942BarTipCoT ;
   private boolean[] T01PK12_n1942BarTipCoT ;
   private String[] T01PK12_A1943BarNomClT ;
   private boolean[] T01PK12_n1943BarNomClT ;
   private int[] T01PK12_A1944BarNumClT ;
   private boolean[] T01PK12_n1944BarNumClT ;
   private String[] T01PK12_A1945BarMaqTin ;
   private boolean[] T01PK12_n1945BarMaqTin ;
   private int[] T01PK12_A1946BarVolTin ;
   private boolean[] T01PK12_n1946BarVolTin ;
   private java.math.BigDecimal[] T01PK12_A1947BarKgmTin ;
   private boolean[] T01PK12_n1947BarKgmTin ;
   private java.math.BigDecimal[] T01PK12_A1948BarMtrTin ;
   private boolean[] T01PK12_n1948BarMtrTin ;
   private int[] T01PK12_A1949BarPieTin ;
   private boolean[] T01PK12_n1949BarPieTin ;
   private byte[] T01PK12_A2304BarEstTin ;
   private boolean[] T01PK12_n2304BarEstTin ;
   private String[] T01PK12_A2316BarAgrLot ;
   private boolean[] T01PK12_n2316BarAgrLot ;
   private short[] T01PK12_A3650BarNumAna ;
   private boolean[] T01PK12_n3650BarNumAna ;
   private short[] T01PK12_A3651BarTipDef ;
   private boolean[] T01PK12_n3651BarTipDef ;
   private byte[] T01PK12_A3652BarIntens ;
   private boolean[] T01PK12_n3652BarIntens ;
   private String[] T01PK12_A3653BarPriCod ;
   private boolean[] T01PK12_n3653BarPriCod ;
   private java.math.BigDecimal[] T01PK12_A3654BarCosPD ;
   private boolean[] T01PK12_n3654BarCosPD ;
   private java.math.BigDecimal[] T01PK12_A3658BarCosPA ;
   private boolean[] T01PK12_n3658BarCosPA ;
   private java.math.BigDecimal[] T01PK12_A3656BarCosAD ;
   private boolean[] T01PK12_n3656BarCosAD ;
   private java.math.BigDecimal[] T01PK12_A3657BarCosAA ;
   private boolean[] T01PK12_n3657BarCosAA ;
   private java.math.BigDecimal[] T01PK12_A3705BarCosCol ;
   private boolean[] T01PK12_n3705BarCosCol ;
   private java.math.BigDecimal[] T01PK12_A3706BarCosAnc ;
   private boolean[] T01PK12_n3706BarCosAnc ;
   private short[] T01PK12_A4923BarNumActx ;
   private boolean[] T01PK12_n4923BarNumActx ;
   private int[] T01PK12_A4924BarNumPda ;
   private boolean[] T01PK12_n4924BarNumPda ;
   private String[] T01PK12_A4925BarFaseCod ;
   private boolean[] T01PK12_n4925BarFaseCod ;
   private short[] T01PK12_A4926BarFaseOrd ;
   private boolean[] T01PK12_n4926BarFaseOrd ;
   private short[] T01PK12_A4977BarReoNum ;
   private boolean[] T01PK12_n4977BarReoNum ;
   private String[] T01PK12_A5169BarTipDTin ;
   private boolean[] T01PK12_n5169BarTipDTin ;
   private String[] T01PK12_A5170BarTipCTin ;
   private boolean[] T01PK12_n5170BarTipCTin ;
   private String[] T01PK12_A5171BarTipNTin ;
   private boolean[] T01PK12_n5171BarTipNTin ;
   private java.math.BigDecimal[] T01PK12_A5899BarCosttTi ;
   private boolean[] T01PK12_n5899BarCosttTi ;
   private short[] T01PK12_A5900BarRbTeo ;
   private boolean[] T01PK12_n5900BarRbTeo ;
   private int[] T01PK12_A6177BarNumTin ;
   private boolean[] T01PK12_n6177BarNumTin ;
   private short[] T01PK12_A6431BarCausa ;
   private boolean[] T01PK12_n6431BarCausa ;
   private String[] T01PK12_A6634BarRecAcb ;
   private boolean[] T01PK12_n6634BarRecAcb ;
   private java.math.BigDecimal[] T01PK12_A8563BarKgsTt ;
   private boolean[] T01PK12_n8563BarKgsTt ;
   private short[] T01PK12_A8584FamCodT ;
   private boolean[] T01PK12_n8584FamCodT ;
   private int[] T01PK12_A8609BarForNum ;
   private boolean[] T01PK12_n8609BarForNum ;
   private byte[] T01PK12_A9754BarNTint ;
   private boolean[] T01PK12_n9754BarNTint ;
   private String[] T01PK12_A10539BarAcs ;
   private boolean[] T01PK12_n10539BarAcs ;
   private String[] T01PK12_A10540BarNprg ;
   private boolean[] T01PK12_n10540BarNprg ;
   private int[] T01PK12_A10541BarLts ;
   private boolean[] T01PK12_n10541BarLts ;
   private java.math.BigDecimal[] T01PK12_A10546BarLtsV ;
   private boolean[] T01PK12_n10546BarLtsV ;
   private java.util.Date[] T01PK12_A11177BarFecIt ;
   private boolean[] T01PK12_n11177BarFecIt ;
   private java.util.Date[] T01PK12_A11178BarFecFt ;
   private boolean[] T01PK12_n11178BarFecFt ;
   private String[] T01PK12_A11179BarColNm ;
   private boolean[] T01PK12_n11179BarColNm ;
   private String[] T01PK12_A11762BarDispCli ;
   private boolean[] T01PK12_n11762BarDispCli ;
   private java.math.BigDecimal[] T01PK12_A12993BarMtsTt ;
   private boolean[] T01PK12_n12993BarMtsTt ;
   private java.util.Date[] T01PK12_A13759EstFecCier ;
   private short[] T01PK12_A13760EstCdn1 ;
   private String[] T01PK12_A13761EstCdn2 ;
   private String[] T01PK12_A13762EstCtw ;
   private String[] T01PK12_A396EmprCod ;
   private int[] T01PK12_A252CliCod ;
   private short[] T01PK12_A3646EstTinAny ;
   private byte[] T01PK12_A3647EstTinMes ;
   private byte[] T01PK12_A3648EstTinDia ;
   private String[] T01PK12_A13962BarArtTinD ;
   private boolean[] T01PK12_n13962BarArtTinD ;
   private String[] T01PK12_A13964BarTipDefD ;
   private boolean[] T01PK12_n13964BarTipDefD ;
   private String[] T01PK12_A13965BarIntDsc ;
   private boolean[] T01PK12_n13965BarIntDsc ;
   private String[] T01PK12_A13966BarCauDsc ;
   private boolean[] T01PK12_n13966BarCauDsc ;
   private int[] T01PK12_A13967BarNumEny ;
   private boolean[] T01PK12_n13967BarNumEny ;
   private String[] T01PK4_A407EmprNom ;
   private boolean[] T01PK4_n407EmprNom ;
   private String[] T01PK5_A396EmprCod ;
   private String[] T01PK7_A13962BarArtTinD ;
   private boolean[] T01PK7_n13962BarArtTinD ;
   private String[] T01PK8_A13964BarTipDefD ;
   private boolean[] T01PK8_n13964BarTipDefD ;
   private String[] T01PK9_A13965BarIntDsc ;
   private boolean[] T01PK9_n13965BarIntDsc ;
   private String[] T01PK10_A13966BarCauDsc ;
   private boolean[] T01PK10_n13966BarCauDsc ;
   private int[] T01PK11_A13967BarNumEny ;
   private boolean[] T01PK11_n13967BarNumEny ;
   private String[] T01PK6_A396EmprCod ;
   private String[] T01PK13_A407EmprNom ;
   private boolean[] T01PK13_n407EmprNom ;
   private String[] T01PK14_A396EmprCod ;
   private String[] T01PK15_A13962BarArtTinD ;
   private boolean[] T01PK15_n13962BarArtTinD ;
   private String[] T01PK16_A13964BarTipDefD ;
   private boolean[] T01PK16_n13964BarTipDefD ;
   private String[] T01PK17_A13965BarIntDsc ;
   private boolean[] T01PK17_n13965BarIntDsc ;
   private String[] T01PK18_A13966BarCauDsc ;
   private boolean[] T01PK18_n13966BarCauDsc ;
   private int[] T01PK19_A13967BarNumEny ;
   private boolean[] T01PK19_n13967BarNumEny ;
   private String[] T01PK20_A396EmprCod ;
   private String[] T01PK21_A396EmprCod ;
   private short[] T01PK21_A3646EstTinAny ;
   private byte[] T01PK21_A3647EstTinMes ;
   private byte[] T01PK21_A3648EstTinDia ;
   private short[] T01PK21_A1929EstTinNr ;
   private short[] T01PK3_A1929EstTinNr ;
   private int[] T01PK3_A1933BarCodTin ;
   private boolean[] T01PK3_n1933BarCodTin ;
   private byte[] T01PK3_A1934BarReoTin ;
   private boolean[] T01PK3_n1934BarReoTin ;
   private String[] T01PK3_A1935BarParTin ;
   private boolean[] T01PK3_n1935BarParTin ;
   private String[] T01PK3_A1936BarSerTin ;
   private boolean[] T01PK3_n1936BarSerTin ;
   private String[] T01PK3_A1937BarDscTin ;
   private boolean[] T01PK3_n1937BarDscTin ;
   private short[] T01PK3_A1939BarArtTin ;
   private boolean[] T01PK3_n1939BarArtTin ;
   private String[] T01PK3_A1940BarColNoT ;
   private boolean[] T01PK3_n1940BarColNoT ;
   private int[] T01PK3_A1941BarColNuT ;
   private boolean[] T01PK3_n1941BarColNuT ;
   private byte[] T01PK3_A1942BarTipCoT ;
   private boolean[] T01PK3_n1942BarTipCoT ;
   private String[] T01PK3_A1943BarNomClT ;
   private boolean[] T01PK3_n1943BarNomClT ;
   private int[] T01PK3_A1944BarNumClT ;
   private boolean[] T01PK3_n1944BarNumClT ;
   private String[] T01PK3_A1945BarMaqTin ;
   private boolean[] T01PK3_n1945BarMaqTin ;
   private int[] T01PK3_A1946BarVolTin ;
   private boolean[] T01PK3_n1946BarVolTin ;
   private java.math.BigDecimal[] T01PK3_A1947BarKgmTin ;
   private boolean[] T01PK3_n1947BarKgmTin ;
   private java.math.BigDecimal[] T01PK3_A1948BarMtrTin ;
   private boolean[] T01PK3_n1948BarMtrTin ;
   private int[] T01PK3_A1949BarPieTin ;
   private boolean[] T01PK3_n1949BarPieTin ;
   private byte[] T01PK3_A2304BarEstTin ;
   private boolean[] T01PK3_n2304BarEstTin ;
   private String[] T01PK3_A2316BarAgrLot ;
   private boolean[] T01PK3_n2316BarAgrLot ;
   private short[] T01PK3_A3650BarNumAna ;
   private boolean[] T01PK3_n3650BarNumAna ;
   private short[] T01PK3_A3651BarTipDef ;
   private boolean[] T01PK3_n3651BarTipDef ;
   private byte[] T01PK3_A3652BarIntens ;
   private boolean[] T01PK3_n3652BarIntens ;
   private String[] T01PK3_A3653BarPriCod ;
   private boolean[] T01PK3_n3653BarPriCod ;
   private java.math.BigDecimal[] T01PK3_A3654BarCosPD ;
   private boolean[] T01PK3_n3654BarCosPD ;
   private java.math.BigDecimal[] T01PK3_A3658BarCosPA ;
   private boolean[] T01PK3_n3658BarCosPA ;
   private java.math.BigDecimal[] T01PK3_A3656BarCosAD ;
   private boolean[] T01PK3_n3656BarCosAD ;
   private java.math.BigDecimal[] T01PK3_A3657BarCosAA ;
   private boolean[] T01PK3_n3657BarCosAA ;
   private java.math.BigDecimal[] T01PK3_A3705BarCosCol ;
   private boolean[] T01PK3_n3705BarCosCol ;
   private java.math.BigDecimal[] T01PK3_A3706BarCosAnc ;
   private boolean[] T01PK3_n3706BarCosAnc ;
   private short[] T01PK3_A4923BarNumActx ;
   private boolean[] T01PK3_n4923BarNumActx ;
   private int[] T01PK3_A4924BarNumPda ;
   private boolean[] T01PK3_n4924BarNumPda ;
   private String[] T01PK3_A4925BarFaseCod ;
   private boolean[] T01PK3_n4925BarFaseCod ;
   private short[] T01PK3_A4926BarFaseOrd ;
   private boolean[] T01PK3_n4926BarFaseOrd ;
   private short[] T01PK3_A4977BarReoNum ;
   private boolean[] T01PK3_n4977BarReoNum ;
   private String[] T01PK3_A5169BarTipDTin ;
   private boolean[] T01PK3_n5169BarTipDTin ;
   private String[] T01PK3_A5170BarTipCTin ;
   private boolean[] T01PK3_n5170BarTipCTin ;
   private String[] T01PK3_A5171BarTipNTin ;
   private boolean[] T01PK3_n5171BarTipNTin ;
   private java.math.BigDecimal[] T01PK3_A5899BarCosttTi ;
   private boolean[] T01PK3_n5899BarCosttTi ;
   private short[] T01PK3_A5900BarRbTeo ;
   private boolean[] T01PK3_n5900BarRbTeo ;
   private int[] T01PK3_A6177BarNumTin ;
   private boolean[] T01PK3_n6177BarNumTin ;
   private short[] T01PK3_A6431BarCausa ;
   private boolean[] T01PK3_n6431BarCausa ;
   private String[] T01PK3_A6634BarRecAcb ;
   private boolean[] T01PK3_n6634BarRecAcb ;
   private java.math.BigDecimal[] T01PK3_A8563BarKgsTt ;
   private boolean[] T01PK3_n8563BarKgsTt ;
   private short[] T01PK3_A8584FamCodT ;
   private boolean[] T01PK3_n8584FamCodT ;
   private int[] T01PK3_A8609BarForNum ;
   private boolean[] T01PK3_n8609BarForNum ;
   private byte[] T01PK3_A9754BarNTint ;
   private boolean[] T01PK3_n9754BarNTint ;
   private String[] T01PK3_A10539BarAcs ;
   private boolean[] T01PK3_n10539BarAcs ;
   private String[] T01PK3_A10540BarNprg ;
   private boolean[] T01PK3_n10540BarNprg ;
   private int[] T01PK3_A10541BarLts ;
   private boolean[] T01PK3_n10541BarLts ;
   private java.math.BigDecimal[] T01PK3_A10546BarLtsV ;
   private boolean[] T01PK3_n10546BarLtsV ;
   private java.util.Date[] T01PK3_A11177BarFecIt ;
   private boolean[] T01PK3_n11177BarFecIt ;
   private java.util.Date[] T01PK3_A11178BarFecFt ;
   private boolean[] T01PK3_n11178BarFecFt ;
   private String[] T01PK3_A11179BarColNm ;
   private boolean[] T01PK3_n11179BarColNm ;
   private String[] T01PK3_A11762BarDispCli ;
   private boolean[] T01PK3_n11762BarDispCli ;
   private java.math.BigDecimal[] T01PK3_A12993BarMtsTt ;
   private boolean[] T01PK3_n12993BarMtsTt ;
   private java.util.Date[] T01PK3_A13759EstFecCier ;
   private short[] T01PK3_A13760EstCdn1 ;
   private String[] T01PK3_A13761EstCdn2 ;
   private String[] T01PK3_A13762EstCtw ;
   private String[] T01PK3_A396EmprCod ;
   private int[] T01PK3_A252CliCod ;
   private short[] T01PK3_A3646EstTinAny ;
   private byte[] T01PK3_A3647EstTinMes ;
   private byte[] T01PK3_A3648EstTinDia ;
   private String[] T01PK22_A396EmprCod ;
   private short[] T01PK22_A3646EstTinAny ;
   private byte[] T01PK22_A3647EstTinMes ;
   private byte[] T01PK22_A3648EstTinDia ;
   private short[] T01PK22_A1929EstTinNr ;
   private String[] T01PK23_A396EmprCod ;
   private short[] T01PK23_A3646EstTinAny ;
   private byte[] T01PK23_A3647EstTinMes ;
   private byte[] T01PK23_A3648EstTinDia ;
   private short[] T01PK23_A1929EstTinNr ;
   private short[] T01PK2_A1929EstTinNr ;
   private int[] T01PK2_A1933BarCodTin ;
   private boolean[] T01PK2_n1933BarCodTin ;
   private byte[] T01PK2_A1934BarReoTin ;
   private boolean[] T01PK2_n1934BarReoTin ;
   private String[] T01PK2_A1935BarParTin ;
   private boolean[] T01PK2_n1935BarParTin ;
   private String[] T01PK2_A1936BarSerTin ;
   private boolean[] T01PK2_n1936BarSerTin ;
   private String[] T01PK2_A1937BarDscTin ;
   private boolean[] T01PK2_n1937BarDscTin ;
   private short[] T01PK2_A1939BarArtTin ;
   private boolean[] T01PK2_n1939BarArtTin ;
   private String[] T01PK2_A1940BarColNoT ;
   private boolean[] T01PK2_n1940BarColNoT ;
   private int[] T01PK2_A1941BarColNuT ;
   private boolean[] T01PK2_n1941BarColNuT ;
   private byte[] T01PK2_A1942BarTipCoT ;
   private boolean[] T01PK2_n1942BarTipCoT ;
   private String[] T01PK2_A1943BarNomClT ;
   private boolean[] T01PK2_n1943BarNomClT ;
   private int[] T01PK2_A1944BarNumClT ;
   private boolean[] T01PK2_n1944BarNumClT ;
   private String[] T01PK2_A1945BarMaqTin ;
   private boolean[] T01PK2_n1945BarMaqTin ;
   private int[] T01PK2_A1946BarVolTin ;
   private boolean[] T01PK2_n1946BarVolTin ;
   private java.math.BigDecimal[] T01PK2_A1947BarKgmTin ;
   private boolean[] T01PK2_n1947BarKgmTin ;
   private java.math.BigDecimal[] T01PK2_A1948BarMtrTin ;
   private boolean[] T01PK2_n1948BarMtrTin ;
   private int[] T01PK2_A1949BarPieTin ;
   private boolean[] T01PK2_n1949BarPieTin ;
   private byte[] T01PK2_A2304BarEstTin ;
   private boolean[] T01PK2_n2304BarEstTin ;
   private String[] T01PK2_A2316BarAgrLot ;
   private boolean[] T01PK2_n2316BarAgrLot ;
   private short[] T01PK2_A3650BarNumAna ;
   private boolean[] T01PK2_n3650BarNumAna ;
   private short[] T01PK2_A3651BarTipDef ;
   private boolean[] T01PK2_n3651BarTipDef ;
   private byte[] T01PK2_A3652BarIntens ;
   private boolean[] T01PK2_n3652BarIntens ;
   private String[] T01PK2_A3653BarPriCod ;
   private boolean[] T01PK2_n3653BarPriCod ;
   private java.math.BigDecimal[] T01PK2_A3654BarCosPD ;
   private boolean[] T01PK2_n3654BarCosPD ;
   private java.math.BigDecimal[] T01PK2_A3658BarCosPA ;
   private boolean[] T01PK2_n3658BarCosPA ;
   private java.math.BigDecimal[] T01PK2_A3656BarCosAD ;
   private boolean[] T01PK2_n3656BarCosAD ;
   private java.math.BigDecimal[] T01PK2_A3657BarCosAA ;
   private boolean[] T01PK2_n3657BarCosAA ;
   private java.math.BigDecimal[] T01PK2_A3705BarCosCol ;
   private boolean[] T01PK2_n3705BarCosCol ;
   private java.math.BigDecimal[] T01PK2_A3706BarCosAnc ;
   private boolean[] T01PK2_n3706BarCosAnc ;
   private short[] T01PK2_A4923BarNumActx ;
   private boolean[] T01PK2_n4923BarNumActx ;
   private int[] T01PK2_A4924BarNumPda ;
   private boolean[] T01PK2_n4924BarNumPda ;
   private String[] T01PK2_A4925BarFaseCod ;
   private boolean[] T01PK2_n4925BarFaseCod ;
   private short[] T01PK2_A4926BarFaseOrd ;
   private boolean[] T01PK2_n4926BarFaseOrd ;
   private short[] T01PK2_A4977BarReoNum ;
   private boolean[] T01PK2_n4977BarReoNum ;
   private String[] T01PK2_A5169BarTipDTin ;
   private boolean[] T01PK2_n5169BarTipDTin ;
   private String[] T01PK2_A5170BarTipCTin ;
   private boolean[] T01PK2_n5170BarTipCTin ;
   private String[] T01PK2_A5171BarTipNTin ;
   private boolean[] T01PK2_n5171BarTipNTin ;
   private java.math.BigDecimal[] T01PK2_A5899BarCosttTi ;
   private boolean[] T01PK2_n5899BarCosttTi ;
   private short[] T01PK2_A5900BarRbTeo ;
   private boolean[] T01PK2_n5900BarRbTeo ;
   private int[] T01PK2_A6177BarNumTin ;
   private boolean[] T01PK2_n6177BarNumTin ;
   private short[] T01PK2_A6431BarCausa ;
   private boolean[] T01PK2_n6431BarCausa ;
   private String[] T01PK2_A6634BarRecAcb ;
   private boolean[] T01PK2_n6634BarRecAcb ;
   private java.math.BigDecimal[] T01PK2_A8563BarKgsTt ;
   private boolean[] T01PK2_n8563BarKgsTt ;
   private short[] T01PK2_A8584FamCodT ;
   private boolean[] T01PK2_n8584FamCodT ;
   private int[] T01PK2_A8609BarForNum ;
   private boolean[] T01PK2_n8609BarForNum ;
   private byte[] T01PK2_A9754BarNTint ;
   private boolean[] T01PK2_n9754BarNTint ;
   private String[] T01PK2_A10539BarAcs ;
   private boolean[] T01PK2_n10539BarAcs ;
   private String[] T01PK2_A10540BarNprg ;
   private boolean[] T01PK2_n10540BarNprg ;
   private int[] T01PK2_A10541BarLts ;
   private boolean[] T01PK2_n10541BarLts ;
   private java.math.BigDecimal[] T01PK2_A10546BarLtsV ;
   private boolean[] T01PK2_n10546BarLtsV ;
   private java.util.Date[] T01PK2_A11177BarFecIt ;
   private boolean[] T01PK2_n11177BarFecIt ;
   private java.util.Date[] T01PK2_A11178BarFecFt ;
   private boolean[] T01PK2_n11178BarFecFt ;
   private String[] T01PK2_A11179BarColNm ;
   private boolean[] T01PK2_n11179BarColNm ;
   private String[] T01PK2_A11762BarDispCli ;
   private boolean[] T01PK2_n11762BarDispCli ;
   private java.math.BigDecimal[] T01PK2_A12993BarMtsTt ;
   private boolean[] T01PK2_n12993BarMtsTt ;
   private java.util.Date[] T01PK2_A13759EstFecCier ;
   private short[] T01PK2_A13760EstCdn1 ;
   private String[] T01PK2_A13761EstCdn2 ;
   private String[] T01PK2_A13762EstCtw ;
   private String[] T01PK2_A396EmprCod ;
   private int[] T01PK2_A252CliCod ;
   private short[] T01PK2_A3646EstTinAny ;
   private byte[] T01PK2_A3647EstTinMes ;
   private byte[] T01PK2_A3648EstTinDia ;
   private String[] T01PK27_A407EmprNom ;
   private boolean[] T01PK27_n407EmprNom ;
   private String[] T01PK28_A13962BarArtTinD ;
   private boolean[] T01PK28_n13962BarArtTinD ;
   private int[] T01PK29_A13967BarNumEny ;
   private boolean[] T01PK29_n13967BarNumEny ;
   private String[] T01PK30_A13964BarTipDefD ;
   private boolean[] T01PK30_n13964BarTipDefD ;
   private String[] T01PK31_A13965BarIntDsc ;
   private boolean[] T01PK31_n13965BarIntDsc ;
   private String[] T01PK32_A13966BarCauDsc ;
   private boolean[] T01PK32_n13966BarCauDsc ;
   private String[] T01PK33_A396EmprCod ;
   private short[] T01PK33_A3646EstTinAny ;
   private byte[] T01PK33_A3647EstTinMes ;
   private byte[] T01PK33_A3648EstTinDia ;
   private short[] T01PK33_A1929EstTinNr ;
   private String[] T01PK33_A13944EstNormaId ;
   private String[] T01PK34_A396EmprCod ;
   private short[] T01PK34_A3646EstTinAny ;
   private byte[] T01PK34_A3647EstTinMes ;
   private byte[] T01PK34_A3648EstTinDia ;
   private short[] T01PK34_A1929EstTinNr ;
   private String[] T01PK35_A396EmprCod ;
   private String[] T01PK36_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lconti__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lconti__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lconti__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lconti__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lconti__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PK2", "SELECT EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod, EstTinAny, EstTinMes, EstTinDia FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?  FOR UPDATE OF BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK3", "SELECT EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod, EstTinAny, EstTinMes, EstTinDia FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK5", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK6", "SELECT EmprCod FROM TXPCONTIN WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK7", "SELECT COALESCE( TipArtDsc, ' ') AS BarArtTinD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK8", "SELECT COALESCE( TipDefDsc, ' ') AS BarTipDefD FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK9", "SELECT COALESCE( IntDsc, ' ') AS BarIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK10", "SELECT COALESCE( DscCausa, ' ') AS BarCauDsc FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK11", "SELECT COALESCE( ForNumArc, 0) AS BarNumEny FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK12", "SELECT /*+ FIRST_ROWS(100) */ T7.CodCausa, T6.IntCod, T5.TipDefCod, T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T3.TipArtCod, TM1.EstTinNr, T2.EmprNom, TM1.BarCodTin, TM1.BarReoTin, TM1.BarParTin, TM1.BarSerTin, TM1.BarDscTin, TM1.BarArtTin, TM1.BarColNoT, TM1.BarColNuT, TM1.BarTipCoT, TM1.BarNomClT, TM1.BarNumClT, TM1.BarMaqTin, TM1.BarVolTin, TM1.BarKgmTin, TM1.BarMtrTin, TM1.BarPieTin, TM1.BarEstTin, TM1.BarAgrLot, TM1.BarNumAna, TM1.BarTipDef, TM1.BarIntens, TM1.BarPriCod, TM1.BarCosPD, TM1.BarCosPA, TM1.BarCosAD, TM1.BarCosAA, TM1.BarCosCol, TM1.BarCosAnc, TM1.BarNumActx, TM1.BarNumPda, TM1.BarFaseCod, TM1.BarFaseOrd, TM1.BarReoNum, TM1.BarTipDTin, TM1.BarTipCTin, TM1.BarTipNTin, TM1.BarCosttTi, TM1.BarRbTeo, TM1.BarNumTin, TM1.BarCausa, TM1.BarRecAcb, TM1.BarKgsTt, TM1.FamCodT, TM1.BarForNum, TM1.BarNTint, TM1.BarAcs, TM1.BarNprg, TM1.BarLts, TM1.BarLtsV, TM1.BarFecIt, TM1.BarFecFt, TM1.BarColNm, TM1.BarDispCli, TM1.BarMtsTt, TM1.EstFecCier, TM1.EstCdn1, TM1.EstCdn2, TM1.EstCtw, TM1.EmprCod, TM1.CliCod, TM1.EstTinAny, TM1.EstTinMes, TM1.EstTinDia, COALESCE( T3.TipArtDsc, ' ') AS BarArtTinD, COALESCE( T5.TipDefDsc, ' ') AS BarTipDefD, COALESCE( T6.IntDsc, ' ') AS BarIntDsc, COALESCE( T7.DscCausa, ' ') AS BarCauDsc, COALESCE( T4.ForNumArc, 0) AS BarNumEny FROM ((((((TXPLCONTI TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = TM1.EmprCod AND T3.TipArtCod = TM1.BarArtTin) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ForSer = TM1.BarSerTin AND T4.ForColNom = TM1.BarColNoT AND T4.ForColNum = TM1.BarColNuT AND T4.TipColCod = TM1.BarTipCoT) LEFT JOIN TXPTIPDEF T5 ON T5.EmprCod = TM1.EmprCod AND T5.TipDefCod = TM1.BarTipDef) LEFT JOIN TXPINTENS T6 ON T6.EmprCod = TM1.EmprCod AND T6.IntCod = TM1.BarIntens) LEFT JOIN TXPTIPCAU T7 ON T7.EmprCod = TM1.EmprCod AND T7.CodCausa = TM1.BarCausa) WHERE TM1.EmprCod = ? and TM1.EstTinAny = ? and TM1.EstTinMes = ? and TM1.EstTinDia = ? and TM1.EstTinNr = ? ORDER BY TM1.EmprCod, TM1.EstTinAny, TM1.EstTinMes, TM1.EstTinDia, TM1.EstTinNr ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK14", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK15", "SELECT COALESCE( TipArtDsc, ' ') AS BarArtTinD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK16", "SELECT COALESCE( TipDefDsc, ' ') AS BarTipDefD FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK17", "SELECT COALESCE( IntDsc, ' ') AS BarIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK18", "SELECT COALESCE( DscCausa, ' ') AS BarCauDsc FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK19", "SELECT COALESCE( ForNumArc, 0) AS BarNumEny FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK20", "SELECT EmprCod FROM TXPCONTIN WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE ( EmprCod > ? or EmprCod = ? and EstTinAny > ? or EstTinAny = ? and EmprCod = ? and EstTinMes > ? or EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinDia > ? or EstTinDia = ? and EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinNr > ?) ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PK23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE ( EmprCod < ? or EmprCod = ? and EstTinAny < ? or EstTinAny = ? and EmprCod = ? and EstTinMes < ? or EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinDia < ? or EstTinDia = ? and EstTinMes = ? and EstTinAny = ? and EmprCod = ? and EstTinNr < ?) ORDER BY EmprCod DESC, EstTinAny DESC, EstTinMes DESC, EstTinDia DESC, EstTinNr DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PK24", "INSERT INTO TXPLCONTI(EstTinNr, BarCodTin, BarReoTin, BarParTin, BarSerTin, BarDscTin, BarArtTin, BarColNoT, BarColNuT, BarTipCoT, BarNomClT, BarNumClT, BarMaqTin, BarVolTin, BarKgmTin, BarMtrTin, BarPieTin, BarEstTin, BarAgrLot, BarNumAna, BarTipDef, BarIntens, BarPriCod, BarCosPD, BarCosPA, BarCosAD, BarCosAA, BarCosCol, BarCosAnc, BarNumActx, BarNumPda, BarFaseCod, BarFaseOrd, BarReoNum, BarTipDTin, BarTipCTin, BarTipNTin, BarCosttTi, BarRbTeo, BarNumTin, BarCausa, BarRecAcb, BarKgsTt, FamCodT, BarForNum, BarNTint, BarAcs, BarNprg, BarLts, BarLtsV, BarFecIt, BarFecFt, BarColNm, BarDispCli, BarMtsTt, EstFecCier, EstCdn1, EstCdn2, EstCtw, EmprCod, CliCod, EstTinAny, EstTinMes, EstTinDia) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLCONTI")
         ,new UpdateCursor("T01PK25", "UPDATE TXPLCONTI SET BarCodTin=?, BarReoTin=?, BarParTin=?, BarSerTin=?, BarDscTin=?, BarArtTin=?, BarColNoT=?, BarColNuT=?, BarTipCoT=?, BarNomClT=?, BarNumClT=?, BarMaqTin=?, BarVolTin=?, BarKgmTin=?, BarMtrTin=?, BarPieTin=?, BarEstTin=?, BarAgrLot=?, BarNumAna=?, BarTipDef=?, BarIntens=?, BarPriCod=?, BarCosPD=?, BarCosPA=?, BarCosAD=?, BarCosAA=?, BarCosCol=?, BarCosAnc=?, BarNumActx=?, BarNumPda=?, BarFaseCod=?, BarFaseOrd=?, BarReoNum=?, BarTipDTin=?, BarTipCTin=?, BarTipNTin=?, BarCosttTi=?, BarRbTeo=?, BarNumTin=?, BarCausa=?, BarRecAcb=?, BarKgsTt=?, FamCodT=?, BarForNum=?, BarNTint=?, BarAcs=?, BarNprg=?, BarLts=?, BarLtsV=?, BarFecIt=?, BarFecFt=?, BarColNm=?, BarDispCli=?, BarMtsTt=?, EstFecCier=?, EstCdn1=?, EstCdn2=?, EstCtw=?, CliCod=?  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?", GX_NOMASK, "TXPLCONTI")
         ,new UpdateCursor("T01PK26", "DELETE FROM TXPLCONTI  WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?", GX_NOMASK, "TXPLCONTI")
         ,new ForEachCursor("T01PK27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK28", "SELECT COALESCE( TipArtDsc, ' ') AS BarArtTinD FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK29", "SELECT COALESCE( ForNumArc, 0) AS BarNumEny FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK30", "SELECT COALESCE( TipDefDsc, ' ') AS BarTipDefD FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK31", "SELECT COALESCE( IntDsc, ' ') AS BarIntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK32", "SELECT COALESCE( DscCausa, ' ') AS BarCauDsc FROM TXPTIPCAU WHERE EmprCod = ? AND CodCausa = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK33", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr, EstNormaId FROM TXPCONTI1 WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? AND EstTinNr = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PK34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI ORDER BY EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK35", "SELECT EmprCod FROM TXPCONTIN WHERE EmprCod = ? AND EstTinAny = ? AND EstTinMes = ? AND EstTinDia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PK36", "SELECT EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((int[]) buf[59])[0] = rslt.getInt(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,5);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(41);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((int[]) buf[87])[0] = rslt.getInt(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((byte[]) buf[89])[0] = rslt.getByte(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 6);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 6);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((int[]) buf[95])[0] = rslt.getInt(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[99])[0] = rslt.getGXDateTime(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[101])[0] = rslt.getGXDateTime(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 30);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 20);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[109])[0] = rslt.getGXDate(56);
               ((short[]) buf[110])[0] = rslt.getShort(57);
               ((String[]) buf[111])[0] = rslt.getString(58, 4);
               ((String[]) buf[112])[0] = rslt.getString(59, 4);
               ((String[]) buf[113])[0] = rslt.getString(60, 3);
               ((int[]) buf[114])[0] = rslt.getInt(61);
               ((short[]) buf[115])[0] = rslt.getShort(62);
               ((byte[]) buf[116])[0] = rslt.getByte(63);
               ((byte[]) buf[117])[0] = rslt.getByte(64);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(14);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((byte[]) buf[33])[0] = rslt.getByte(18);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((short[]) buf[37])[0] = rslt.getShort(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 1);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((int[]) buf[59])[0] = rslt.getInt(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 8);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(34);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(35, 1);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(36, 2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(37, 10);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,5);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(39);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((int[]) buf[77])[0] = rslt.getInt(40);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((short[]) buf[79])[0] = rslt.getShort(41);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 1);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((int[]) buf[87])[0] = rslt.getInt(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((byte[]) buf[89])[0] = rslt.getByte(46);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(47, 6);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 6);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((int[]) buf[95])[0] = rslt.getInt(49);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[97])[0] = rslt.getBigDecimal(50,2);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[99])[0] = rslt.getGXDateTime(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[101])[0] = rslt.getGXDateTime(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(53, 30);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 20);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(55,2);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[109])[0] = rslt.getGXDate(56);
               ((short[]) buf[110])[0] = rslt.getShort(57);
               ((String[]) buf[111])[0] = rslt.getString(58, 4);
               ((String[]) buf[112])[0] = rslt.getString(59, 4);
               ((String[]) buf[113])[0] = rslt.getString(60, 3);
               ((int[]) buf[114])[0] = rslt.getInt(61);
               ((short[]) buf[115])[0] = rslt.getShort(62);
               ((byte[]) buf[116])[0] = rslt.getByte(63);
               ((byte[]) buf[117])[0] = rslt.getByte(64);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(17, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(20, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((int[]) buf[31])[0] = rslt.getInt(21);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(22, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(23);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(26);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((byte[]) buf[43])[0] = rslt.getByte(27);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(29);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((byte[]) buf[51])[0] = rslt.getByte(31);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(39);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((int[]) buf[69])[0] = rslt.getInt(40);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(41, 8);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(42);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(43);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(44, 1);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(45, 2);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(46, 10);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(47,5);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(48);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((int[]) buf[87])[0] = rslt.getInt(49);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((short[]) buf[89])[0] = rslt.getShort(50);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[93])[0] = rslt.getBigDecimal(52,2);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((short[]) buf[95])[0] = rslt.getShort(53);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((int[]) buf[97])[0] = rslt.getInt(54);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(55);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(56, 6);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((String[]) buf[103])[0] = rslt.getString(57, 6);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((int[]) buf[105])[0] = rslt.getInt(58);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[107])[0] = rslt.getBigDecimal(59,2);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[109])[0] = rslt.getGXDateTime(60);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[111])[0] = rslt.getGXDateTime(61);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(62, 30);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((String[]) buf[115])[0] = rslt.getString(63, 20);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[117])[0] = rslt.getBigDecimal(64,2);
               ((boolean[]) buf[118])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[119])[0] = rslt.getGXDate(65);
               ((short[]) buf[120])[0] = rslt.getShort(66);
               ((String[]) buf[121])[0] = rslt.getString(67, 4);
               ((String[]) buf[122])[0] = rslt.getString(68, 4);
               ((String[]) buf[123])[0] = rslt.getString(69, 3);
               ((int[]) buf[124])[0] = rslt.getInt(70);
               ((short[]) buf[125])[0] = rslt.getShort(71);
               ((byte[]) buf[126])[0] = rslt.getByte(72);
               ((byte[]) buf[127])[0] = rslt.getByte(73);
               ((String[]) buf[128])[0] = rslt.getString(74, 30);
               ((boolean[]) buf[129])[0] = rslt.wasNull();
               ((String[]) buf[130])[0] = rslt.getString(75, 30);
               ((boolean[]) buf[131])[0] = rslt.wasNull();
               ((String[]) buf[132])[0] = rslt.getString(76, 30);
               ((boolean[]) buf[133])[0] = rslt.wasNull();
               ((String[]) buf[134])[0] = rslt.getString(77, 30);
               ((boolean[]) buf[135])[0] = rslt.wasNull();
               ((int[]) buf[136])[0] = rslt.getInt(78);
               ((boolean[]) buf[137])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               return;
            case 22 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 16);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 26);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 13);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[32]).intValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[34]).byteValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 10);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[42]).byteValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 1);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[60]).intValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 8);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[68], 1);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[70], 2);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[72], 10);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[74], 5);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(39, ((Number) parms[76]).shortValue());
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[78]).intValue());
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(41, ((Number) parms[80]).shortValue());
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[82], 1);
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[86]).shortValue());
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(45, ((Number) parms[88]).intValue());
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(46, ((Number) parms[90]).byteValue());
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[92], 6);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[94], 6);
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(49, ((Number) parms[96]).intValue());
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(50, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(51, (java.util.Date)parms[100], false);
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(52, (java.util.Date)parms[102], false);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[104], 30);
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[106], 20);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(55, (java.math.BigDecimal)parms[108], 2);
               }
               stmt.setDate(56, (java.util.Date)parms[109]);
               stmt.setShort(57, ((Number) parms[110]).shortValue());
               stmt.setString(58, (String)parms[111], 4);
               stmt.setString(59, (String)parms[112], 4);
               stmt.setString(60, (String)parms[113], 3);
               stmt.setInt(61, ((Number) parms[114]).intValue());
               stmt.setShort(62, ((Number) parms[115]).shortValue());
               stmt.setByte(63, ((Number) parms[116]).byteValue());
               stmt.setByte(64, ((Number) parms[117]).byteValue());
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 26);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 13);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 13);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 10);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[37]).shortValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[39]).shortValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[41]).byteValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[59]).intValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 8);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 10);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 5);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[75]).shortValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(39, ((Number) parms[77]).intValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 1);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[85]).shortValue());
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(44, ((Number) parms[87]).intValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(45, ((Number) parms[89]).byteValue());
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[91], 6);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[93], 6);
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(48, ((Number) parms[95]).intValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(50, (java.util.Date)parms[99], false);
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(51, (java.util.Date)parms[101], false);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[103], 30);
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 20);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(54, (java.math.BigDecimal)parms[107], 2);
               }
               stmt.setDate(55, (java.util.Date)parms[108]);
               stmt.setShort(56, ((Number) parms[109]).shortValue());
               stmt.setString(57, (String)parms[110], 4);
               stmt.setString(58, (String)parms[111], 4);
               stmt.setInt(59, ((Number) parms[112]).intValue());
               stmt.setString(60, (String)parms[113], 3);
               stmt.setShort(61, ((Number) parms[114]).shortValue());
               stmt.setByte(62, ((Number) parms[115]).byteValue());
               stmt.setByte(63, ((Number) parms[116]).byteValue());
               stmt.setShort(64, ((Number) parms[117]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 13);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[9]).byteValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

