package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfasqui_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
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
         gxload_13( A396EmprCod, A764ProForCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtfasqui_level1item") == 0 )
      {
         gxnrgridtfasqui_level1item_newrow_invoke( ) ;
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
            A457FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtfasqui_level1item_newrow_invoke( )
   {
      nRC_GXsfl_93 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_93"))) ;
      nGXsfl_93_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_93_idx"))) ;
      sGXsfl_93_idx = httpContext.GetPar( "sGXsfl_93_idx") ;
      A5372FasQuiUl = (short)(GXutil.lval( httpContext.GetPar( "FasQuiUl"))) ;
      n5372FasQuiUl = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtfasqui_level1item_newrow( ) ;
      /* End function gxnrGridtfasqui_level1item_newrow_invoke */
   }

   public tfasqui_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfasqui_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfasqui_impl.class ));
   }

   public tfasqui_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarOrdLin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasQuiUl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasQuiUl_Internalname, httpContext.getMessage( "Ultima Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasQuiUl_Internalname, GXutil.ltrim( localUtil.ntoc( A5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasQuiUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5372FasQuiUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5372FasQuiUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasQuiUl_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasQuiUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TFASQUI.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtfasqui_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASQUI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtfasqui_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol93( ) ;
      nGXsfl_93_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount779 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_779 = (short)(1) ;
            scanStartPM779( ) ;
            while ( RcdFound779 != 0 )
            {
               init_level_properties779( ) ;
               getByPrimaryKeyPM779( ) ;
               addRowPM779( ) ;
               scanNextPM779( ) ;
            }
            scanEndPM779( ) ;
            nBlankRcdCount779 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5372FasQuiUl = A5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         standaloneNotModalPM779( ) ;
         standaloneModalPM779( ) ;
         sMode779 = Gx_mode ;
         while ( nGXsfl_93_idx < nRC_GXsfl_93 )
         {
            bGXsfl_93_Refreshing = true ;
            readRowPM779( ) ;
            edtFasQuiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUILIN_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtFasQuiNp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUINP_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasQuiNp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiNp_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtFasQuiTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUITP_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasQuiTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiTp_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            edtFasQuiRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUIRB_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasQuiRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiRb_Enabled), 5, 0), !bGXsfl_93_Refreshing);
            if ( ( nRcdExists_779 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalPM779( ) ;
            }
            sendRowPM779( ) ;
            bGXsfl_93_Refreshing = false ;
         }
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5372FasQuiUl = B5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount779 = (short)(5) ;
         nRcdExists_779 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartPM779( ) ;
            while ( RcdFound779 != 0 )
            {
               sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_93779( ) ;
               init_level_properties779( ) ;
               standaloneNotModalPM779( ) ;
               getByPrimaryKeyPM779( ) ;
               standaloneModalPM779( ) ;
               addRowPM779( ) ;
               scanNextPM779( ) ;
            }
            scanEndPM779( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode779 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_93779( ) ;
      initAllPM779( ) ;
      init_level_properties779( ) ;
      B5372FasQuiUl = A5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      nRcdExists_779 = (short)(0) ;
      nIsMod_779 = (short)(0) ;
      nRcdDeleted_779 = (short)(0) ;
      nBlankRcdCount779 = (short)(nBlankRcdUsr779+nBlankRcdCount779) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount779 > 0 )
      {
         standaloneNotModalPM779( ) ;
         standaloneModalPM779( ) ;
         addRowPM779( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtProForCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount779 = (short)(nBlankRcdCount779-1) ;
      }
      Gx_mode = sMode779 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A5372FasQuiUl = B5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtfasqui_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtfasqui_level1item", Gridtfasqui_level1itemContainer, subGridtfasqui_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtfasqui_level1itemContainerData", Gridtfasqui_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtfasqui_level1itemContainerData"+"V", Gridtfasqui_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtfasqui_level1itemContainerData"+"V"+"\" value='"+Gridtfasqui_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5372FasQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z5372FasQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         O5372FasQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( "O5372FasQuiUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_93 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_93"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A5372FasQuiUl = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
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
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
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
            initAllPM15( ) ;
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
      disableAttributesPM15( ) ;
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

   public void confirm_PM779( )
   {
      s5372FasQuiUl = O5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      nGXsfl_93_idx = 0 ;
      while ( nGXsfl_93_idx < nRC_GXsfl_93 )
      {
         readRowPM779( ) ;
         if ( ( nRcdExists_779 != 0 ) || ( nIsMod_779 != 0 ) )
         {
            getKeyPM779( ) ;
            if ( ( nRcdExists_779 == 0 ) && ( nRcdDeleted_779 == 0 ) )
            {
               if ( RcdFound779 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidatePM779( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTablePM779( ) ;
                     closeExtendedTableCursorsPM779( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5372FasQuiUl = A5372FasQuiUl ;
                     n5372FasQuiUl = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
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
               if ( RcdFound779 != 0 )
               {
                  if ( nRcdDeleted_779 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyPM779( ) ;
                     loadPM779( ) ;
                     beforeValidatePM779( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsPM779( ) ;
                        O5372FasQuiUl = A5372FasQuiUl ;
                        n5372FasQuiUl = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_779 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidatePM779( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTablePM779( ) ;
                           closeExtendedTableCursorsPM779( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5372FasQuiUl = A5372FasQuiUl ;
                           n5372FasQuiUl = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_779 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasQuiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtFasQuiNp_Internalname, GXutil.ltrim( localUtil.ntoc( A5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasQuiTp_Internalname, GXutil.ltrim( localUtil.ntoc( A5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasQuiRb_Internalname, GXutil.ltrim( localUtil.ntoc( A5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_93_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_779_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_779_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_779_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_779 != 0 )
         {
            httpContext.changePostValue( "FASQUILIN_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASQUINP_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiNp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASQUITP_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASQUIRB_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5372FasQuiUl = s5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionPM0( )
   {
   }

   public void zmPM15( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5372FasQuiUl = T00PM6_A5372FasQuiUl[0] ;
         }
         else
         {
            Z5372FasQuiUl = A5372FasQuiUl ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z194BarOrdLin = A194BarOrdLin ;
         Z457FasCod = A457FasCod ;
         Z5372FasQuiUl = A5372FasQuiUl ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z407EmprNom = A407EmprNom ;
         Z460FasDsc = A460FasDsc ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
      /* Using cursor T00PM7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00PM7_A407EmprNom[0] ;
      n407EmprNom = T00PM7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00PM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00PM8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
      /* Using cursor T00PM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T00PM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
      }
      A460FasDsc = T00PM10_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(8);
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

   public void loadPM15( )
   {
      /* Using cursor T00PM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A457FasCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A407EmprNom = T00PM11_A407EmprNom[0] ;
         n407EmprNom = T00PM11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A759ProDsc = T00PM11_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T00PM11_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A5372FasQuiUl = T00PM11_A5372FasQuiUl[0] ;
         n5372FasQuiUl = T00PM11_n5372FasQuiUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         zmPM15( -7) ;
      }
      pr_default.close(9);
      onLoadActionsPM15( ) ;
   }

   public void onLoadActionsPM15( )
   {
   }

   public void checkExtendedTablePM15( )
   {
      nIsDirty_15 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsPM15( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyPM15( )
   {
      /* Using cursor T00PM12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00PM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      if ( (pr_default.getStatus(4) != 101) && ( T00PM6_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00PM6_A457FasCod[0], A457FasCod) == 0 ) && ( GXutil.strcmp(T00PM6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PM6_A129BarCod[0] == A129BarCod ) && ( T00PM6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00PM6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00PM6_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zmPM15( 7) ;
         RcdFound15 = (short)(1) ;
         A5372FasQuiUl = T00PM6_A5372FasQuiUl[0] ;
         n5372FasQuiUl = T00PM6_n5372FasQuiUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         O5372FasQuiUl = A5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadPM15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKeyPM15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKeyPM15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyPM15( ) ;
      if ( RcdFound15 == 0 )
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
      RcdFound15 = (short)(0) ;
      /* Using cursor T00PM13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A457FasCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00PM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PM13_A129BarCod[0] == A129BarCod ) && ( T00PM13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00PM13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00PM13_A758ProCod[0], A758ProCod) == 0 ) && ( T00PM13_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00PM13_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T00PM13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PM13_A129BarCod[0] == A129BarCod ) && ( T00PM13_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00PM13_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00PM13_A758ProCod[0], A758ProCod) == 0 ) && ( T00PM13_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00PM13_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T00PM14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A457FasCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T00PM14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PM14_A129BarCod[0] == A129BarCod ) && ( T00PM14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00PM14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00PM14_A758ProCod[0], A758ProCod) == 0 ) && ( T00PM14_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00PM14_A457FasCod[0], A457FasCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T00PM14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00PM14_A129BarCod[0] == A129BarCod ) && ( T00PM14_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00PM14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( GXutil.strcmp(T00PM14_A758ProCod[0], A758ProCod) == 0 ) && ( T00PM14_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00PM14_A457FasCod[0], A457FasCod) == 0 ) )
         {
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyPM15( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5372FasQuiUl = O5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         insertPM15( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               updatePM15( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               insertPM15( ) ;
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
                  A5372FasQuiUl = O5372FasQuiUl ;
                  n5372FasQuiUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
                  insertPM15( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A194BarOrdLin != Z194BarOrdLin ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5372FasQuiUl = O5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         delete( ) ;
         afterTrn( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartPM15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndPM15( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartPM15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound15 != 0 )
         {
            scanNextPM15( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndPM15( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyPM15( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00PM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z5372FasQuiUl != T00PM5_A5372FasQuiUl[0] ) )
         {
            if ( Z5372FasQuiUl != T00PM5_A5372FasQuiUl[0] )
            {
               GXutil.writeLogln("tfasqui:[seudo value changed for attri]"+"FasQuiUl");
               GXutil.writeLogRaw("Old: ",Z5372FasQuiUl);
               GXutil.writeLogRaw("Current: ",T00PM5_A5372FasQuiUl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertPM15( )
   {
      beforeValidatePM15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePM15( ) ;
      }
      if ( AnyError == 0 )
      {
         zmPM15( 0) ;
         checkOptimisticConcurrencyPM15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmPM15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertPM15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PM15 */
                  pr_default.execute(13, new Object[] {Short.valueOf(A194BarOrdLin), A457FasCod, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevelPM15( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionPM0( ) ;
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
            loadPM15( ) ;
         }
         endLevelPM15( ) ;
      }
      closeExtendedTableCursorsPM15( ) ;
   }

   public void updatePM15( )
   {
      beforeValidatePM15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePM15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyPM15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmPM15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdatePM15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PM16 */
                  pr_default.execute(14, new Object[] {A457FasCod, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdatePM15( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelPM15( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionPM0( ) ;
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
         endLevelPM15( ) ;
      }
      closeExtendedTableCursorsPM15( ) ;
   }

   public void deferredUpdatePM15( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidatePM15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyPM15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsPM15( ) ;
         afterConfirmPM15( ) ;
         if ( AnyError == 0 )
         {
            beforeDeletePM15( ) ;
            if ( AnyError == 0 )
            {
               A5372FasQuiUl = O5372FasQuiUl ;
               n5372FasQuiUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               scanStartPM779( ) ;
               while ( RcdFound779 != 0 )
               {
                  getByPrimaryKeyPM779( ) ;
                  deletePM779( ) ;
                  scanNextPM779( ) ;
                  O5372FasQuiUl = A5372FasQuiUl ;
                  n5372FasQuiUl = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
               }
               scanEndPM779( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PM17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound15 == 0 )
                        {
                           initAllPM15( ) ;
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
                        resetCaptionPM0( ) ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelPM15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsPM15( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00PM18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level8", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00PM19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level7", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00PM20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level6", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00PM21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level5", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00PM22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00PM23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level3", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00PM24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00PM25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00PM26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00PM27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00PM28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACEMp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00PM29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACABp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00PM30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACCAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00PM31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACPEp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00PM32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CACRAp", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00PM33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT005", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00PM34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRHDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00PM35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00PM36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00PM37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void processNestedLevelPM779( )
   {
      s5372FasQuiUl = O5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      nGXsfl_93_idx = 0 ;
      while ( nGXsfl_93_idx < nRC_GXsfl_93 )
      {
         readRowPM779( ) ;
         if ( ( nRcdExists_779 != 0 ) || ( nIsMod_779 != 0 ) )
         {
            standaloneNotModalPM779( ) ;
            getKeyPM779( ) ;
            if ( ( nRcdExists_779 == 0 ) && ( nRcdDeleted_779 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertPM779( ) ;
            }
            else
            {
               if ( RcdFound779 != 0 )
               {
                  if ( ( nRcdDeleted_779 != 0 ) && ( nRcdExists_779 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deletePM779( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_779 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updatePM779( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_779 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O5372FasQuiUl = A5372FasQuiUl ;
            n5372FasQuiUl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
         }
         httpContext.changePostValue( edtFasQuiLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, GXutil.rtrim( A764ProForCod)) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtFasQuiNp_Internalname, GXutil.ltrim( localUtil.ntoc( A5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasQuiTp_Internalname, GXutil.ltrim( localUtil.ntoc( A5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasQuiRb_Internalname, GXutil.ltrim( localUtil.ntoc( A5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( Z5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_93_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "nRcdDeleted_779_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_779_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_779_"+sGXsfl_93_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_779 != 0 )
         {
            httpContext.changePostValue( "FASQUILIN_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASQUINP_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiNp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASQUITP_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASQUIRB_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiRb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllPM779( ) ;
      if ( AnyError != 0 )
      {
         O5372FasQuiUl = s5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      nRcdExists_779 = (short)(0) ;
      nIsMod_779 = (short)(0) ;
      nRcdDeleted_779 = (short)(0) ;
   }

   public void processLevelPM15( )
   {
      /* Save parent mode. */
      sMode15 = Gx_mode ;
      processNestedLevelPM779( ) ;
      if ( AnyError != 0 )
      {
         O5372FasQuiUl = s5372FasQuiUl ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00PM38 */
      pr_default.execute(36, new Object[] {Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
   }

   public void endLevelPM15( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompletePM15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfasqui");
         if ( AnyError == 0 )
         {
            confirmValuesPM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfasqui");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartPM15( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A129BarCod = A129BarCod ;
      this.A132BarCodReo = A132BarCodReo ;
      this.A130BarCodPar = A130BarCodPar ;
      this.A758ProCod = A758ProCod ;
      this.A194BarOrdLin = A194BarOrdLin ;
      this.A457FasCod = A457FasCod ;
      /* Scan By routine */
      /* Using cursor T00PM39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A457FasCod});
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextPM15( )
   {
      /* Scan next routine */
      pr_default.readNext(37);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
   }

   public void scanEndPM15( )
   {
      pr_default.close(37);
   }

   public void afterConfirmPM15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertPM15( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdatePM15( )
   {
      /* Before Update Rules */
   }

   public void beforeDeletePM15( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompletePM15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidatePM15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesPM15( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
   }

   public void zmPM779( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5373FasQuiNp = T00PM3_A5373FasQuiNp[0] ;
            Z5374FasQuiTp = T00PM3_A5374FasQuiTp[0] ;
            Z5375FasQuiRb = T00PM3_A5375FasQuiRb[0] ;
            Z764ProForCod = T00PM3_A764ProForCod[0] ;
         }
         else
         {
            Z5373FasQuiNp = A5373FasQuiNp ;
            Z5374FasQuiTp = A5374FasQuiTp ;
            Z5375FasQuiRb = A5375FasQuiRb ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z5371FasQuiLin = A5371FasQuiLin ;
         Z5373FasQuiNp = A5373FasQuiNp ;
         Z5374FasQuiTp = A5374FasQuiTp ;
         Z5375FasQuiRb = A5375FasQuiRb ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z758ProCod = A758ProCod ;
         Z766ProForDsc = A766ProForDsc ;
      }
   }

   public void standaloneNotModalPM779( )
   {
      edtFasQuiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
      edtFasQuiUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiUl_Enabled), 5, 0), true);
   }

   public void standaloneModalPM779( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A5372FasQuiUl = (short)(O5372FasQuiUl+10) ;
         n5372FasQuiUl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5371FasQuiLin = A5372FasQuiUl ;
      }
   }

   public void loadPM779( )
   {
      /* Using cursor T00PM40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound779 = (short)(1) ;
         A766ProForDsc = T00PM40_A766ProForDsc[0] ;
         A5373FasQuiNp = T00PM40_A5373FasQuiNp[0] ;
         A5374FasQuiTp = T00PM40_A5374FasQuiTp[0] ;
         A5375FasQuiRb = T00PM40_A5375FasQuiRb[0] ;
         A764ProForCod = T00PM40_A764ProForCod[0] ;
         zmPM779( -12) ;
      }
      pr_default.close(38);
      onLoadActionsPM779( ) ;
   }

   public void onLoadActionsPM779( )
   {
   }

   public void checkExtendedTablePM779( )
   {
      nIsDirty_779 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalPM779( ) ;
      /* Using cursor T00PM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00PM4_A766ProForDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsPM779( )
   {
      pr_default.close(2);
   }

   public void enableDisablePM779( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T00PM41 */
      pr_default.execute(39, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(39) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00PM41_A766ProForDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(39) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(39);
   }

   public void getKeyPM779( )
   {
      /* Using cursor T00PM42 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound779 = (short)(1) ;
      }
      else
      {
         RcdFound779 = (short)(0) ;
      }
      pr_default.close(40);
   }

   public void getByPrimaryKeyPM779( )
   {
      /* Using cursor T00PM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T00PM3_A129BarCod[0] == A129BarCod ) && ( T00PM3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T00PM3_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T00PM3_A194BarOrdLin[0] == A194BarOrdLin ) && ( GXutil.strcmp(T00PM3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00PM3_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zmPM779( 12) ;
         RcdFound779 = (short)(1) ;
         initializeNonKeyPM779( ) ;
         A5371FasQuiLin = T00PM3_A5371FasQuiLin[0] ;
         A5373FasQuiNp = T00PM3_A5373FasQuiNp[0] ;
         A5374FasQuiTp = T00PM3_A5374FasQuiTp[0] ;
         A5375FasQuiRb = T00PM3_A5375FasQuiRb[0] ;
         A764ProForCod = T00PM3_A764ProForCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z758ProCod = A758ProCod ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z5371FasQuiLin = A5371FasQuiLin ;
         sMode779 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalPM779( ) ;
         loadPM779( ) ;
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound779 = (short)(0) ;
         initializeNonKeyPM779( ) ;
         sMode779 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalPM779( ) ;
         Gx_mode = sMode779 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesPM779( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyPM779( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00PM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASQUI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z5373FasQuiNp != T00PM2_A5373FasQuiNp[0] ) || ( Z5374FasQuiTp != T00PM2_A5374FasQuiTp[0] ) || ( Z5375FasQuiRb != T00PM2_A5375FasQuiRb[0] ) || ( GXutil.strcmp(Z764ProForCod, T00PM2_A764ProForCod[0]) != 0 ) )
         {
            if ( Z5373FasQuiNp != T00PM2_A5373FasQuiNp[0] )
            {
               GXutil.writeLogln("tfasqui:[seudo value changed for attri]"+"FasQuiNp");
               GXutil.writeLogRaw("Old: ",Z5373FasQuiNp);
               GXutil.writeLogRaw("Current: ",T00PM2_A5373FasQuiNp[0]);
            }
            if ( Z5374FasQuiTp != T00PM2_A5374FasQuiTp[0] )
            {
               GXutil.writeLogln("tfasqui:[seudo value changed for attri]"+"FasQuiTp");
               GXutil.writeLogRaw("Old: ",Z5374FasQuiTp);
               GXutil.writeLogRaw("Current: ",T00PM2_A5374FasQuiTp[0]);
            }
            if ( Z5375FasQuiRb != T00PM2_A5375FasQuiRb[0] )
            {
               GXutil.writeLogln("tfasqui:[seudo value changed for attri]"+"FasQuiRb");
               GXutil.writeLogRaw("Old: ",Z5375FasQuiRb);
               GXutil.writeLogRaw("Current: ",T00PM2_A5375FasQuiRb[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T00PM2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("tfasqui:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T00PM2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASQUI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertPM779( )
   {
      beforeValidatePM779( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePM779( ) ;
      }
      if ( AnyError == 0 )
      {
         zmPM779( 0) ;
         checkOptimisticConcurrencyPM779( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmPM779( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertPM779( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00PM43 */
                  pr_default.execute(41, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A396EmprCod, A764ProForCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                  if ( (pr_default.getStatus(41) == 1) )
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
            loadPM779( ) ;
         }
         endLevelPM779( ) ;
      }
      closeExtendedTableCursorsPM779( ) ;
   }

   public void updatePM779( )
   {
      beforeValidatePM779( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTablePM779( ) ;
      }
      if ( ( nIsMod_779 != 0 ) || ( nIsDirty_779 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyPM779( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmPM779( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdatePM779( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00PM44 */
                     pr_default.execute(42, new Object[] {Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A764ProForCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
                     if ( (pr_default.getStatus(42) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASQUI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdatePM779( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyPM779( ) ;
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
            endLevelPM779( ) ;
         }
      }
      closeExtendedTableCursorsPM779( ) ;
   }

   public void deferredUpdatePM779( )
   {
   }

   public void deletePM779( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidatePM779( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyPM779( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsPM779( ) ;
         afterConfirmPM779( ) ;
         if ( AnyError == 0 )
         {
            beforeDeletePM779( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00PM45 */
               pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
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
      sMode779 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelPM779( ) ;
      Gx_mode = sMode779 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsPM779( )
   {
      standaloneModalPM779( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00PM46 */
         pr_default.execute(44, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T00PM46_A766ProForDsc[0] ;
         pr_default.close(44);
      }
   }

   public void endLevelPM779( )
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

   public void scanStartPM779( )
   {
      /* Scan By routine */
      /* Using cursor T00PM47 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
      RcdFound779 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound779 = (short)(1) ;
         A5371FasQuiLin = T00PM47_A5371FasQuiLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextPM779( )
   {
      /* Scan next routine */
      pr_default.readNext(45);
      RcdFound779 = (short)(0) ;
      if ( (pr_default.getStatus(45) != 101) )
      {
         RcdFound779 = (short)(1) ;
         A5371FasQuiLin = T00PM47_A5371FasQuiLin[0] ;
      }
   }

   public void scanEndPM779( )
   {
      pr_default.close(45);
   }

   public void afterConfirmPM779( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertPM779( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdatePM779( )
   {
      /* Before Update Rules */
   }

   public void beforeDeletePM779( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompletePM779( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidatePM779( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesPM779( )
   {
      edtFasQuiLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtFasQuiNp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiNp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiNp_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtFasQuiTp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiTp_Enabled), 5, 0), !bGXsfl_93_Refreshing);
      edtFasQuiRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiRb_Enabled), 5, 0), !bGXsfl_93_Refreshing);
   }

   public void send_integrity_lvl_hashesPM779( )
   {
   }

   public void send_integrity_lvl_hashesPM15( )
   {
   }

   public void subsflControlProps_93779( )
   {
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_93_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_93_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_93_idx ;
      edtFasQuiNp_Internalname = "FASQUINP_"+sGXsfl_93_idx ;
      edtFasQuiTp_Internalname = "FASQUITP_"+sGXsfl_93_idx ;
      edtFasQuiRb_Internalname = "FASQUIRB_"+sGXsfl_93_idx ;
   }

   public void subsflControlProps_fel_93779( )
   {
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_93_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_93_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_93_fel_idx ;
      edtFasQuiNp_Internalname = "FASQUINP_"+sGXsfl_93_fel_idx ;
      edtFasQuiTp_Internalname = "FASQUITP_"+sGXsfl_93_fel_idx ;
      edtFasQuiRb_Internalname = "FASQUIRB_"+sGXsfl_93_fel_idx ;
   }

   public void addRowPM779( )
   {
      nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_93779( ) ;
      sendRowPM779( ) ;
   }

   public void sendRowPM779( )
   {
      Gridtfasqui_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtfasqui_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtfasqui_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtfasqui_level1item_Class, "") != 0 )
         {
            subGridtfasqui_level1item_Linesclass = subGridtfasqui_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtfasqui_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtfasqui_level1item_Backstyle = (byte)(0) ;
         subGridtfasqui_level1item_Backcolor = subGridtfasqui_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtfasqui_level1item_Class, "") != 0 )
         {
            subGridtfasqui_level1item_Linesclass = subGridtfasqui_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtfasqui_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtfasqui_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtfasqui_level1item_Class, "") != 0 )
         {
            subGridtfasqui_level1item_Linesclass = subGridtfasqui_level1item_Class+"Odd" ;
         }
         subGridtfasqui_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtfasqui_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtfasqui_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_93_idx) % (2))) == 0 )
         {
            subGridtfasqui_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtfasqui_level1item_Class, "") != 0 )
            {
               subGridtfasqui_level1item_Linesclass = subGridtfasqui_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtfasqui_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtfasqui_level1item_Class, "") != 0 )
            {
               subGridtfasqui_level1item_Linesclass = subGridtfasqui_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtfasqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasQuiLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5371FasQuiLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5371FasQuiLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasQuiLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_779_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridtfasqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtfasqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_779_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridtfasqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiNp_Internalname,GXutil.ltrim( localUtil.ntoc( A5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasQuiNp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5373FasQuiNp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5373FasQuiNp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiNp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasQuiNp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_779_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridtfasqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiTp_Internalname,GXutil.ltrim( localUtil.ntoc( A5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasQuiTp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5374FasQuiTp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5374FasQuiTp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiTp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasQuiTp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_779_" + sGXsfl_93_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_93_idx + "',93)\"" ;
      ROClassString = "Attribute" ;
      Gridtfasqui_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiRb_Internalname,GXutil.ltrim( localUtil.ntoc( A5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasQuiRb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5375FasQuiRb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5375FasQuiRb), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasQuiRb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(93),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtfasqui_level1itemRow);
      send_integrity_lvl_hashesPM779( ) ;
      GXCCtl = "Z5371FasQuiLin_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5373FasQuiNp_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5373FasQuiNp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5374FasQuiTp_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5374FasQuiTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5375FasQuiRb_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5375FasQuiRb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "nRcdDeleted_779_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_779_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_779_" + sGXsfl_93_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_779, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUILIN_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUINP_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiNp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUITP_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASQUIRB_"+sGXsfl_93_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtfasqui_level1itemContainer.AddRow(Gridtfasqui_level1itemRow);
   }

   public void readRowPM779( )
   {
      nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_93779( ) ;
      edtFasQuiLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUILIN_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasQuiNp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUINP_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasQuiTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUITP_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasQuiRb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASQUIRB_"+sGXsfl_93_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasQuiNp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasQuiNp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FASQUINP_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasQuiNp_Internalname ;
         wbErr = true ;
         A5373FasQuiNp = (short)(0) ;
      }
      else
      {
         A5373FasQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiNp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasQuiTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasQuiTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FASQUITP_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasQuiTp_Internalname ;
         wbErr = true ;
         A5374FasQuiTp = (short)(0) ;
      }
      else
      {
         A5374FasQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasQuiRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasQuiRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FASQUIRB_" + sGXsfl_93_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasQuiRb_Internalname ;
         wbErr = true ;
         A5375FasQuiRb = (short)(0) ;
      }
      else
      {
         A5375FasQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiRb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z5371FasQuiLin_" + sGXsfl_93_idx ;
      Z5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5373FasQuiNp_" + sGXsfl_93_idx ;
      Z5373FasQuiNp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5374FasQuiTp_" + sGXsfl_93_idx ;
      Z5374FasQuiTp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5375FasQuiRb_" + sGXsfl_93_idx ;
      Z5375FasQuiRb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_93_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_779_" + sGXsfl_93_idx ;
      nRcdDeleted_779 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_779_" + sGXsfl_93_idx ;
      nRcdExists_779 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_779_" + sGXsfl_93_idx ;
      nIsMod_779 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFasQuiLin_Enabled = edtFasQuiLin_Enabled ;
   }

   public void confirmValuesPM0( )
   {
      nGXsfl_93_idx = 0 ;
      sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_93779( ) ;
      while ( nGXsfl_93_idx < nRC_GXsfl_93 )
      {
         nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_93779( ) ;
         httpContext.changePostValue( "Z5371FasQuiLin_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5371FasQuiLin_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z5373FasQuiNp_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5373FasQuiNp_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z5374FasQuiTp_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5374FasQuiTp_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z5375FasQuiRb_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5375FasQuiRb_"+sGXsfl_93_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_93_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_93_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_93_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfasqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","FasCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( Z5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( O5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_93", GXutil.ltrim( localUtil.ntoc( nGXsfl_93_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tfasqui", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "TFASQUI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", "") ;
   }

   public void initializeNonKeyPM15( )
   {
      A5372FasQuiUl = (short)(0) ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      O5372FasQuiUl = A5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
      Z5372FasQuiUl = (short)(0) ;
   }

   public void initAllPM15( )
   {
      initializeNonKeyPM15( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyPM779( )
   {
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A5373FasQuiNp = (short)(0) ;
      A5374FasQuiTp = (short)(0) ;
      A5375FasQuiRb = (short)(0) ;
      Z5373FasQuiNp = (short)(0) ;
      Z5374FasQuiTp = (short)(0) ;
      Z5375FasQuiRb = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAllPM779( )
   {
      A5371FasQuiLin = (short)(0) ;
      initializeNonKeyPM779( ) ;
   }

   public void standaloneModalInsertPM779( )
   {
      A5372FasQuiUl = i5372FasQuiUl ;
      n5372FasQuiUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5372FasQuiUl), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241524493", true, true);
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
      httpContext.AddJavascriptSource("tfasqui.js", "?20268241524493", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties779( )
   {
      edtFasQuiLin_Enabled = defedtFasQuiLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasQuiLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasQuiLin_Enabled), 5, 0), !bGXsfl_93_Refreshing);
   }

   public void startgridcontrol93( )
   {
      Gridtfasqui_level1itemContainer.AddObjectProperty("GridName", "Gridtfasqui_level1item");
      Gridtfasqui_level1itemContainer.AddObjectProperty("Header", subGridtfasqui_level1item_Header);
      Gridtfasqui_level1itemContainer.AddObjectProperty("DeleteMethod", "none");
      Gridtfasqui_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtfasqui_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtfasqui_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtfasqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtfasqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddColumnProperties(Gridtfasqui_level1itemColumn);
      Gridtfasqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtfasqui_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
      Gridtfasqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddColumnProperties(Gridtfasqui_level1itemColumn);
      Gridtfasqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtfasqui_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Gridtfasqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddColumnProperties(Gridtfasqui_level1itemColumn);
      Gridtfasqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtfasqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5373FasQuiNp, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiNp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddColumnProperties(Gridtfasqui_level1itemColumn);
      Gridtfasqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtfasqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5374FasQuiTp, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddColumnProperties(Gridtfasqui_level1itemColumn);
      Gridtfasqui_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtfasqui_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5375FasQuiRb, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasQuiRb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddColumnProperties(Gridtfasqui_level1itemColumn);
      Gridtfasqui_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtfasqui_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtfasqui_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasQuiUl_Internalname = "FASQUIUL" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtFasQuiLin_Internalname = "FASQUILIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtFasQuiNp_Internalname = "FASQUINP" ;
      edtFasQuiTp_Internalname = "FASQUITP" ;
      edtFasQuiRb_Internalname = "FASQUIRB" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtfasqui_level1item_Internalname = "GRIDTFASQUI_LEVEL1ITEM" ;
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
      subGridtfasqui_level1item_Allowcollapsing = (byte)(0) ;
      subGridtfasqui_level1item_Allowselection = (byte)(0) ;
      subGridtfasqui_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROCESOS QUIMICOS P/FASE", "") );
      edtFasQuiRb_Jsonclick = "" ;
      edtFasQuiTp_Jsonclick = "" ;
      edtFasQuiNp_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtFasQuiLin_Jsonclick = "" ;
      subGridtfasqui_level1item_Class = "Grid" ;
      subGridtfasqui_level1item_Backcolorstyle = (byte)(0) ;
      edtFasQuiRb_Enabled = 1 ;
      edtFasQuiTp_Enabled = 1 ;
      edtFasQuiNp_Enabled = 1 ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtFasQuiLin_Enabled = 0 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFasQuiUl_Jsonclick = "" ;
      edtFasQuiUl_Enabled = 0 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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

   public void gxnrgridtfasqui_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_93779( ) ;
      while ( nGXsfl_93_idx <= nRC_GXsfl_93 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalPM779( ) ;
         standaloneModalPM779( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowPM779( ) ;
         nGXsfl_93_idx = (int)(nGXsfl_93_idx+1) ;
         sGXsfl_93_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_93_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_93779( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtfasqui_level1itemContainer)) ;
      /* End function gxnrGridtfasqui_level1item_newrow */
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
      /* Using cursor T00PM48 */
      pr_default.execute(46, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(46) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00PM48_A407EmprNom[0] ;
      n407EmprNom = T00PM48_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(46);
      /* Using cursor T00PM49 */
      pr_default.execute(47, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(47) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      A759ProDsc = T00PM49_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(47);
      /* Using cursor T00PM50 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod});
      if ( (pr_default.getStatus(48) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(48);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
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

   public void valid_Barordlin( )
   {
      n5372FasQuiUl = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( A5372FasQuiUl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( Z5372FasQuiUl, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "O5372FasQuiUl", GXutil.ltrim( localUtil.ntoc( O5372FasQuiUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T00PM46 */
      pr_default.execute(44, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(44) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T00PM46_A766ProForDsc[0] ;
      pr_default.close(44);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A5372FasQuiUl',fld:'FASQUIUL',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A5372FasQuiUl',fld:'FASQUIUL',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z758ProCod'},{av:'Z194BarOrdLin'},{av:'Z407EmprNom'},{av:'Z759ProDsc'},{av:'Z460FasDsc'},{av:'Z5372FasQuiUl'},{av:'Z457FasCod'},{av:'O5372FasQuiUl'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_FASQUIUL","{handler:'valid_Fasquiul',iparms:[]");
      setEventMetadata("VALID_FASQUIUL",",oparms:[]}");
      setEventMetadata("VALID_FASQUILIN","{handler:'valid_Fasquilin',iparms:[]");
      setEventMetadata("VALID_FASQUILIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Fasquirb',iparms:[]");
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
      pr_default.close(44);
      pr_default.close(48);
      pr_default.close(46);
      pr_default.close(47);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      wcpOA758ProCod = "" ;
      wcpOA457FasCod = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z758ProCod = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
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
      A759ProDsc = "" ;
      A460FasDsc = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtfasqui_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode779 = "" ;
      Gx_mode = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A766ProForDsc = "" ;
      Z457FasCod = "" ;
      Z407EmprNom = "" ;
      Z460FasDsc = "" ;
      Z759ProDsc = "" ;
      T00PM7_A407EmprNom = new String[] {""} ;
      T00PM7_n407EmprNom = new boolean[] {false} ;
      T00PM8_A759ProDsc = new String[] {""} ;
      T00PM9_A396EmprCod = new String[] {""} ;
      T00PM10_A460FasDsc = new String[] {""} ;
      T00PM11_A194BarOrdLin = new short[1] ;
      T00PM11_A457FasCod = new String[] {""} ;
      T00PM11_A407EmprNom = new String[] {""} ;
      T00PM11_n407EmprNom = new boolean[] {false} ;
      T00PM11_A759ProDsc = new String[] {""} ;
      T00PM11_A460FasDsc = new String[] {""} ;
      T00PM11_A5372FasQuiUl = new short[1] ;
      T00PM11_n5372FasQuiUl = new boolean[] {false} ;
      T00PM11_A396EmprCod = new String[] {""} ;
      T00PM11_A129BarCod = new int[1] ;
      T00PM11_A132BarCodReo = new byte[1] ;
      T00PM11_A130BarCodPar = new String[] {""} ;
      T00PM11_A758ProCod = new String[] {""} ;
      T00PM12_A396EmprCod = new String[] {""} ;
      T00PM12_A129BarCod = new int[1] ;
      T00PM12_A132BarCodReo = new byte[1] ;
      T00PM12_A130BarCodPar = new String[] {""} ;
      T00PM12_A758ProCod = new String[] {""} ;
      T00PM12_A194BarOrdLin = new short[1] ;
      T00PM6_A194BarOrdLin = new short[1] ;
      T00PM6_A457FasCod = new String[] {""} ;
      T00PM6_A5372FasQuiUl = new short[1] ;
      T00PM6_n5372FasQuiUl = new boolean[] {false} ;
      T00PM6_A396EmprCod = new String[] {""} ;
      T00PM6_A129BarCod = new int[1] ;
      T00PM6_A132BarCodReo = new byte[1] ;
      T00PM6_A130BarCodPar = new String[] {""} ;
      T00PM6_A758ProCod = new String[] {""} ;
      sMode15 = "" ;
      T00PM13_A396EmprCod = new String[] {""} ;
      T00PM13_A129BarCod = new int[1] ;
      T00PM13_A132BarCodReo = new byte[1] ;
      T00PM13_A130BarCodPar = new String[] {""} ;
      T00PM13_A758ProCod = new String[] {""} ;
      T00PM13_A194BarOrdLin = new short[1] ;
      T00PM13_A457FasCod = new String[] {""} ;
      T00PM14_A396EmprCod = new String[] {""} ;
      T00PM14_A129BarCod = new int[1] ;
      T00PM14_A132BarCodReo = new byte[1] ;
      T00PM14_A130BarCodPar = new String[] {""} ;
      T00PM14_A758ProCod = new String[] {""} ;
      T00PM14_A194BarOrdLin = new short[1] ;
      T00PM14_A457FasCod = new String[] {""} ;
      T00PM5_A194BarOrdLin = new short[1] ;
      T00PM5_A457FasCod = new String[] {""} ;
      T00PM5_A5372FasQuiUl = new short[1] ;
      T00PM5_n5372FasQuiUl = new boolean[] {false} ;
      T00PM5_A396EmprCod = new String[] {""} ;
      T00PM5_A129BarCod = new int[1] ;
      T00PM5_A132BarCodReo = new byte[1] ;
      T00PM5_A130BarCodPar = new String[] {""} ;
      T00PM5_A758ProCod = new String[] {""} ;
      T00PM18_A396EmprCod = new String[] {""} ;
      T00PM18_A129BarCod = new int[1] ;
      T00PM18_A132BarCodReo = new byte[1] ;
      T00PM18_A130BarCodPar = new String[] {""} ;
      T00PM18_A758ProCod = new String[] {""} ;
      T00PM18_A194BarOrdLin = new short[1] ;
      T00PM18_A12517SolAfLn = new short[1] ;
      T00PM19_A396EmprCod = new String[] {""} ;
      T00PM19_A129BarCod = new int[1] ;
      T00PM19_A132BarCodReo = new byte[1] ;
      T00PM19_A130BarCodPar = new String[] {""} ;
      T00PM19_A758ProCod = new String[] {""} ;
      T00PM19_A194BarOrdLin = new short[1] ;
      T00PM19_A12516SolLzLn = new short[1] ;
      T00PM20_A396EmprCod = new String[] {""} ;
      T00PM20_A129BarCod = new int[1] ;
      T00PM20_A132BarCodReo = new byte[1] ;
      T00PM20_A130BarCodPar = new String[] {""} ;
      T00PM20_A758ProCod = new String[] {""} ;
      T00PM20_A194BarOrdLin = new short[1] ;
      T00PM20_A12515SolPlLn = new short[1] ;
      T00PM21_A396EmprCod = new String[] {""} ;
      T00PM21_A129BarCod = new int[1] ;
      T00PM21_A132BarCodReo = new byte[1] ;
      T00PM21_A130BarCodPar = new String[] {""} ;
      T00PM21_A758ProCod = new String[] {""} ;
      T00PM21_A194BarOrdLin = new short[1] ;
      T00PM21_A12514SolSAlLn = new short[1] ;
      T00PM22_A396EmprCod = new String[] {""} ;
      T00PM22_A129BarCod = new int[1] ;
      T00PM22_A132BarCodReo = new byte[1] ;
      T00PM22_A130BarCodPar = new String[] {""} ;
      T00PM22_A758ProCod = new String[] {""} ;
      T00PM22_A194BarOrdLin = new short[1] ;
      T00PM22_A12513SolSAcLn = new short[1] ;
      T00PM23_A396EmprCod = new String[] {""} ;
      T00PM23_A129BarCod = new int[1] ;
      T00PM23_A132BarCodReo = new byte[1] ;
      T00PM23_A130BarCodPar = new String[] {""} ;
      T00PM23_A758ProCod = new String[] {""} ;
      T00PM23_A194BarOrdLin = new short[1] ;
      T00PM23_A12512SolFrLn = new short[1] ;
      T00PM24_A396EmprCod = new String[] {""} ;
      T00PM24_A129BarCod = new int[1] ;
      T00PM24_A132BarCodReo = new byte[1] ;
      T00PM24_A130BarCodPar = new String[] {""} ;
      T00PM24_A758ProCod = new String[] {""} ;
      T00PM24_A194BarOrdLin = new short[1] ;
      T00PM24_A12511SolAgLn = new short[1] ;
      T00PM25_A396EmprCod = new String[] {""} ;
      T00PM25_A129BarCod = new int[1] ;
      T00PM25_A132BarCodReo = new byte[1] ;
      T00PM25_A130BarCodPar = new String[] {""} ;
      T00PM25_A758ProCod = new String[] {""} ;
      T00PM25_A194BarOrdLin = new short[1] ;
      T00PM25_A12510SolLvLn = new short[1] ;
      T00PM26_A396EmprCod = new String[] {""} ;
      T00PM26_A129BarCod = new int[1] ;
      T00PM26_A132BarCodReo = new byte[1] ;
      T00PM26_A130BarCodPar = new String[] {""} ;
      T00PM26_A758ProCod = new String[] {""} ;
      T00PM26_A194BarOrdLin = new short[1] ;
      T00PM26_A10781BarFasNb = new int[1] ;
      T00PM27_A396EmprCod = new String[] {""} ;
      T00PM27_A129BarCod = new int[1] ;
      T00PM27_A132BarCodReo = new byte[1] ;
      T00PM27_A130BarCodPar = new String[] {""} ;
      T00PM27_A758ProCod = new String[] {""} ;
      T00PM27_A194BarOrdLin = new short[1] ;
      T00PM27_A719PrdNum = new String[] {""} ;
      T00PM28_A396EmprCod = new String[] {""} ;
      T00PM28_A129BarCod = new int[1] ;
      T00PM28_A132BarCodReo = new byte[1] ;
      T00PM28_A130BarCodPar = new String[] {""} ;
      T00PM28_A758ProCod = new String[] {""} ;
      T00PM28_A194BarOrdLin = new short[1] ;
      T00PM28_A9966Em_cod = new String[] {""} ;
      T00PM29_A396EmprCod = new String[] {""} ;
      T00PM29_A129BarCod = new int[1] ;
      T00PM29_A132BarCodReo = new byte[1] ;
      T00PM29_A130BarCodPar = new String[] {""} ;
      T00PM29_A758ProCod = new String[] {""} ;
      T00PM29_A194BarOrdLin = new short[1] ;
      T00PM29_A9940Ab_cod = new String[] {""} ;
      T00PM30_A396EmprCod = new String[] {""} ;
      T00PM30_A129BarCod = new int[1] ;
      T00PM30_A132BarCodReo = new byte[1] ;
      T00PM30_A130BarCodPar = new String[] {""} ;
      T00PM30_A758ProCod = new String[] {""} ;
      T00PM30_A194BarOrdLin = new short[1] ;
      T00PM30_A9911Ca_cod = new String[] {""} ;
      T00PM31_A396EmprCod = new String[] {""} ;
      T00PM31_A129BarCod = new int[1] ;
      T00PM31_A132BarCodReo = new byte[1] ;
      T00PM31_A130BarCodPar = new String[] {""} ;
      T00PM31_A758ProCod = new String[] {""} ;
      T00PM31_A194BarOrdLin = new short[1] ;
      T00PM31_A9878Pe_cod = new String[] {""} ;
      T00PM32_A396EmprCod = new String[] {""} ;
      T00PM32_A129BarCod = new int[1] ;
      T00PM32_A132BarCodReo = new byte[1] ;
      T00PM32_A130BarCodPar = new String[] {""} ;
      T00PM32_A758ProCod = new String[] {""} ;
      T00PM32_A194BarOrdLin = new short[1] ;
      T00PM32_A9870Rm_cod = new String[] {""} ;
      T00PM33_A396EmprCod = new String[] {""} ;
      T00PM33_A129BarCod = new int[1] ;
      T00PM33_A132BarCodReo = new byte[1] ;
      T00PM33_A130BarCodPar = new String[] {""} ;
      T00PM33_A758ProCod = new String[] {""} ;
      T00PM33_A194BarOrdLin = new short[1] ;
      T00PM33_A7934Dtb_Ordl = new short[1] ;
      T00PM34_A396EmprCod = new String[] {""} ;
      T00PM34_A129BarCod = new int[1] ;
      T00PM34_A132BarCodReo = new byte[1] ;
      T00PM34_A130BarCodPar = new String[] {""} ;
      T00PM34_A758ProCod = new String[] {""} ;
      T00PM34_A194BarOrdLin = new short[1] ;
      T00PM34_A4940A_Barcod = new int[1] ;
      T00PM34_A4941A_BarReo = new byte[1] ;
      T00PM34_A4942A_BarPar = new String[] {""} ;
      T00PM34_A4943A_ProCod = new String[] {""} ;
      T00PM34_A4944A_BarOrd = new short[1] ;
      T00PM35_A396EmprCod = new String[] {""} ;
      T00PM35_A129BarCod = new int[1] ;
      T00PM35_A132BarCodReo = new byte[1] ;
      T00PM35_A130BarCodPar = new String[] {""} ;
      T00PM35_A758ProCod = new String[] {""} ;
      T00PM35_A194BarOrdLin = new short[1] ;
      T00PM35_A4643BarFasLot = new int[1] ;
      T00PM36_A396EmprCod = new String[] {""} ;
      T00PM36_A129BarCod = new int[1] ;
      T00PM36_A132BarCodReo = new byte[1] ;
      T00PM36_A130BarCodPar = new String[] {""} ;
      T00PM36_A758ProCod = new String[] {""} ;
      T00PM36_A194BarOrdLin = new short[1] ;
      T00PM36_A4031CCTCod = new int[1] ;
      T00PM37_A396EmprCod = new String[] {""} ;
      T00PM37_A129BarCod = new int[1] ;
      T00PM37_A132BarCodReo = new byte[1] ;
      T00PM37_A130BarCodPar = new String[] {""} ;
      T00PM37_A758ProCod = new String[] {""} ;
      T00PM37_A194BarOrdLin = new short[1] ;
      T00PM37_A1664ParFasCod = new short[1] ;
      T00PM39_A396EmprCod = new String[] {""} ;
      T00PM39_A129BarCod = new int[1] ;
      T00PM39_A132BarCodReo = new byte[1] ;
      T00PM39_A130BarCodPar = new String[] {""} ;
      T00PM39_A758ProCod = new String[] {""} ;
      T00PM39_A194BarOrdLin = new short[1] ;
      Z766ProForDsc = "" ;
      T00PM40_A129BarCod = new int[1] ;
      T00PM40_A132BarCodReo = new byte[1] ;
      T00PM40_A130BarCodPar = new String[] {""} ;
      T00PM40_A194BarOrdLin = new short[1] ;
      T00PM40_A5371FasQuiLin = new short[1] ;
      T00PM40_A766ProForDsc = new String[] {""} ;
      T00PM40_A5373FasQuiNp = new short[1] ;
      T00PM40_A5374FasQuiTp = new short[1] ;
      T00PM40_A5375FasQuiRb = new short[1] ;
      T00PM40_A396EmprCod = new String[] {""} ;
      T00PM40_A764ProForCod = new String[] {""} ;
      T00PM40_A758ProCod = new String[] {""} ;
      T00PM4_A766ProForDsc = new String[] {""} ;
      GXCCtl = "" ;
      T00PM41_A766ProForDsc = new String[] {""} ;
      T00PM42_A396EmprCod = new String[] {""} ;
      T00PM42_A129BarCod = new int[1] ;
      T00PM42_A132BarCodReo = new byte[1] ;
      T00PM42_A130BarCodPar = new String[] {""} ;
      T00PM42_A758ProCod = new String[] {""} ;
      T00PM42_A194BarOrdLin = new short[1] ;
      T00PM42_A5371FasQuiLin = new short[1] ;
      T00PM3_A129BarCod = new int[1] ;
      T00PM3_A132BarCodReo = new byte[1] ;
      T00PM3_A130BarCodPar = new String[] {""} ;
      T00PM3_A194BarOrdLin = new short[1] ;
      T00PM3_A5371FasQuiLin = new short[1] ;
      T00PM3_A5373FasQuiNp = new short[1] ;
      T00PM3_A5374FasQuiTp = new short[1] ;
      T00PM3_A5375FasQuiRb = new short[1] ;
      T00PM3_A396EmprCod = new String[] {""} ;
      T00PM3_A764ProForCod = new String[] {""} ;
      T00PM3_A758ProCod = new String[] {""} ;
      T00PM2_A129BarCod = new int[1] ;
      T00PM2_A132BarCodReo = new byte[1] ;
      T00PM2_A130BarCodPar = new String[] {""} ;
      T00PM2_A194BarOrdLin = new short[1] ;
      T00PM2_A5371FasQuiLin = new short[1] ;
      T00PM2_A5373FasQuiNp = new short[1] ;
      T00PM2_A5374FasQuiTp = new short[1] ;
      T00PM2_A5375FasQuiRb = new short[1] ;
      T00PM2_A396EmprCod = new String[] {""} ;
      T00PM2_A764ProForCod = new String[] {""} ;
      T00PM2_A758ProCod = new String[] {""} ;
      T00PM46_A766ProForDsc = new String[] {""} ;
      T00PM47_A396EmprCod = new String[] {""} ;
      T00PM47_A129BarCod = new int[1] ;
      T00PM47_A132BarCodReo = new byte[1] ;
      T00PM47_A130BarCodPar = new String[] {""} ;
      T00PM47_A758ProCod = new String[] {""} ;
      T00PM47_A194BarOrdLin = new short[1] ;
      T00PM47_A5371FasQuiLin = new short[1] ;
      Gridtfasqui_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtfasqui_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtfasqui_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T00PM48_A407EmprNom = new String[] {""} ;
      T00PM48_n407EmprNom = new boolean[] {false} ;
      T00PM49_A759ProDsc = new String[] {""} ;
      T00PM50_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ758ProCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ759ProDsc = "" ;
      ZZ460FasDsc = "" ;
      ZZ457FasCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfasqui__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfasqui__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfasqui__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfasqui__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfasqui__default(),
         new Object[] {
             new Object[] {
            T00PM2_A129BarCod, T00PM2_A132BarCodReo, T00PM2_A130BarCodPar, T00PM2_A194BarOrdLin, T00PM2_A5371FasQuiLin, T00PM2_A5373FasQuiNp, T00PM2_A5374FasQuiTp, T00PM2_A5375FasQuiRb, T00PM2_A396EmprCod, T00PM2_A764ProForCod,
            T00PM2_A758ProCod
            }
            , new Object[] {
            T00PM3_A129BarCod, T00PM3_A132BarCodReo, T00PM3_A130BarCodPar, T00PM3_A194BarOrdLin, T00PM3_A5371FasQuiLin, T00PM3_A5373FasQuiNp, T00PM3_A5374FasQuiTp, T00PM3_A5375FasQuiRb, T00PM3_A396EmprCod, T00PM3_A764ProForCod,
            T00PM3_A758ProCod
            }
            , new Object[] {
            T00PM4_A766ProForDsc
            }
            , new Object[] {
            T00PM5_A194BarOrdLin, T00PM5_A457FasCod, T00PM5_A5372FasQuiUl, T00PM5_n5372FasQuiUl, T00PM5_A396EmprCod, T00PM5_A129BarCod, T00PM5_A132BarCodReo, T00PM5_A130BarCodPar, T00PM5_A758ProCod
            }
            , new Object[] {
            T00PM6_A194BarOrdLin, T00PM6_A457FasCod, T00PM6_A5372FasQuiUl, T00PM6_n5372FasQuiUl, T00PM6_A396EmprCod, T00PM6_A129BarCod, T00PM6_A132BarCodReo, T00PM6_A130BarCodPar, T00PM6_A758ProCod
            }
            , new Object[] {
            T00PM7_A407EmprNom, T00PM7_n407EmprNom
            }
            , new Object[] {
            T00PM8_A759ProDsc
            }
            , new Object[] {
            T00PM9_A396EmprCod
            }
            , new Object[] {
            T00PM10_A460FasDsc
            }
            , new Object[] {
            T00PM11_A194BarOrdLin, T00PM11_A457FasCod, T00PM11_A407EmprNom, T00PM11_n407EmprNom, T00PM11_A759ProDsc, T00PM11_A460FasDsc, T00PM11_A5372FasQuiUl, T00PM11_n5372FasQuiUl, T00PM11_A396EmprCod, T00PM11_A129BarCod,
            T00PM11_A132BarCodReo, T00PM11_A130BarCodPar, T00PM11_A758ProCod
            }
            , new Object[] {
            T00PM12_A396EmprCod, T00PM12_A129BarCod, T00PM12_A132BarCodReo, T00PM12_A130BarCodPar, T00PM12_A758ProCod, T00PM12_A194BarOrdLin
            }
            , new Object[] {
            T00PM13_A396EmprCod, T00PM13_A129BarCod, T00PM13_A132BarCodReo, T00PM13_A130BarCodPar, T00PM13_A758ProCod, T00PM13_A194BarOrdLin, T00PM13_A457FasCod
            }
            , new Object[] {
            T00PM14_A396EmprCod, T00PM14_A129BarCod, T00PM14_A132BarCodReo, T00PM14_A130BarCodPar, T00PM14_A758ProCod, T00PM14_A194BarOrdLin, T00PM14_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00PM18_A396EmprCod, T00PM18_A129BarCod, T00PM18_A132BarCodReo, T00PM18_A130BarCodPar, T00PM18_A758ProCod, T00PM18_A194BarOrdLin, T00PM18_A12517SolAfLn
            }
            , new Object[] {
            T00PM19_A396EmprCod, T00PM19_A129BarCod, T00PM19_A132BarCodReo, T00PM19_A130BarCodPar, T00PM19_A758ProCod, T00PM19_A194BarOrdLin, T00PM19_A12516SolLzLn
            }
            , new Object[] {
            T00PM20_A396EmprCod, T00PM20_A129BarCod, T00PM20_A132BarCodReo, T00PM20_A130BarCodPar, T00PM20_A758ProCod, T00PM20_A194BarOrdLin, T00PM20_A12515SolPlLn
            }
            , new Object[] {
            T00PM21_A396EmprCod, T00PM21_A129BarCod, T00PM21_A132BarCodReo, T00PM21_A130BarCodPar, T00PM21_A758ProCod, T00PM21_A194BarOrdLin, T00PM21_A12514SolSAlLn
            }
            , new Object[] {
            T00PM22_A396EmprCod, T00PM22_A129BarCod, T00PM22_A132BarCodReo, T00PM22_A130BarCodPar, T00PM22_A758ProCod, T00PM22_A194BarOrdLin, T00PM22_A12513SolSAcLn
            }
            , new Object[] {
            T00PM23_A396EmprCod, T00PM23_A129BarCod, T00PM23_A132BarCodReo, T00PM23_A130BarCodPar, T00PM23_A758ProCod, T00PM23_A194BarOrdLin, T00PM23_A12512SolFrLn
            }
            , new Object[] {
            T00PM24_A396EmprCod, T00PM24_A129BarCod, T00PM24_A132BarCodReo, T00PM24_A130BarCodPar, T00PM24_A758ProCod, T00PM24_A194BarOrdLin, T00PM24_A12511SolAgLn
            }
            , new Object[] {
            T00PM25_A396EmprCod, T00PM25_A129BarCod, T00PM25_A132BarCodReo, T00PM25_A130BarCodPar, T00PM25_A758ProCod, T00PM25_A194BarOrdLin, T00PM25_A12510SolLvLn
            }
            , new Object[] {
            T00PM26_A396EmprCod, T00PM26_A129BarCod, T00PM26_A132BarCodReo, T00PM26_A130BarCodPar, T00PM26_A758ProCod, T00PM26_A194BarOrdLin, T00PM26_A10781BarFasNb
            }
            , new Object[] {
            T00PM27_A396EmprCod, T00PM27_A129BarCod, T00PM27_A132BarCodReo, T00PM27_A130BarCodPar, T00PM27_A758ProCod, T00PM27_A194BarOrdLin, T00PM27_A719PrdNum
            }
            , new Object[] {
            T00PM28_A396EmprCod, T00PM28_A129BarCod, T00PM28_A132BarCodReo, T00PM28_A130BarCodPar, T00PM28_A758ProCod, T00PM28_A194BarOrdLin, T00PM28_A9966Em_cod
            }
            , new Object[] {
            T00PM29_A396EmprCod, T00PM29_A129BarCod, T00PM29_A132BarCodReo, T00PM29_A130BarCodPar, T00PM29_A758ProCod, T00PM29_A194BarOrdLin, T00PM29_A9940Ab_cod
            }
            , new Object[] {
            T00PM30_A396EmprCod, T00PM30_A129BarCod, T00PM30_A132BarCodReo, T00PM30_A130BarCodPar, T00PM30_A758ProCod, T00PM30_A194BarOrdLin, T00PM30_A9911Ca_cod
            }
            , new Object[] {
            T00PM31_A396EmprCod, T00PM31_A129BarCod, T00PM31_A132BarCodReo, T00PM31_A130BarCodPar, T00PM31_A758ProCod, T00PM31_A194BarOrdLin, T00PM31_A9878Pe_cod
            }
            , new Object[] {
            T00PM32_A396EmprCod, T00PM32_A129BarCod, T00PM32_A132BarCodReo, T00PM32_A130BarCodPar, T00PM32_A758ProCod, T00PM32_A194BarOrdLin, T00PM32_A9870Rm_cod
            }
            , new Object[] {
            T00PM33_A396EmprCod, T00PM33_A129BarCod, T00PM33_A132BarCodReo, T00PM33_A130BarCodPar, T00PM33_A758ProCod, T00PM33_A194BarOrdLin, T00PM33_A7934Dtb_Ordl
            }
            , new Object[] {
            T00PM34_A396EmprCod, T00PM34_A129BarCod, T00PM34_A132BarCodReo, T00PM34_A130BarCodPar, T00PM34_A758ProCod, T00PM34_A194BarOrdLin, T00PM34_A4940A_Barcod, T00PM34_A4941A_BarReo, T00PM34_A4942A_BarPar, T00PM34_A4943A_ProCod,
            T00PM34_A4944A_BarOrd
            }
            , new Object[] {
            T00PM35_A396EmprCod, T00PM35_A129BarCod, T00PM35_A132BarCodReo, T00PM35_A130BarCodPar, T00PM35_A758ProCod, T00PM35_A194BarOrdLin, T00PM35_A4643BarFasLot
            }
            , new Object[] {
            T00PM36_A396EmprCod, T00PM36_A129BarCod, T00PM36_A132BarCodReo, T00PM36_A130BarCodPar, T00PM36_A758ProCod, T00PM36_A194BarOrdLin, T00PM36_A4031CCTCod
            }
            , new Object[] {
            T00PM37_A396EmprCod, T00PM37_A129BarCod, T00PM37_A132BarCodReo, T00PM37_A130BarCodPar, T00PM37_A758ProCod, T00PM37_A194BarOrdLin, T00PM37_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            T00PM39_A396EmprCod, T00PM39_A129BarCod, T00PM39_A132BarCodReo, T00PM39_A130BarCodPar, T00PM39_A758ProCod, T00PM39_A194BarOrdLin
            }
            , new Object[] {
            T00PM40_A129BarCod, T00PM40_A132BarCodReo, T00PM40_A130BarCodPar, T00PM40_A194BarOrdLin, T00PM40_A5371FasQuiLin, T00PM40_A766ProForDsc, T00PM40_A5373FasQuiNp, T00PM40_A5374FasQuiTp, T00PM40_A5375FasQuiRb, T00PM40_A396EmprCod,
            T00PM40_A764ProForCod, T00PM40_A758ProCod
            }
            , new Object[] {
            T00PM41_A766ProForDsc
            }
            , new Object[] {
            T00PM42_A396EmprCod, T00PM42_A129BarCod, T00PM42_A132BarCodReo, T00PM42_A130BarCodPar, T00PM42_A758ProCod, T00PM42_A194BarOrdLin, T00PM42_A5371FasQuiLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00PM46_A766ProForDsc
            }
            , new Object[] {
            T00PM47_A396EmprCod, T00PM47_A129BarCod, T00PM47_A132BarCodReo, T00PM47_A130BarCodPar, T00PM47_A758ProCod, T00PM47_A194BarOrdLin, T00PM47_A5371FasQuiLin
            }
            , new Object[] {
            T00PM48_A407EmprNom, T00PM48_n407EmprNom
            }
            , new Object[] {
            T00PM49_A759ProDsc
            }
            , new Object[] {
            T00PM50_A396EmprCod
            }
         }
      );
      Z457FasCod = "" ;
      A457FasCod = "" ;
      Z194BarOrdLin = (short)(0) ;
      A194BarOrdLin = (short)(0) ;
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z130BarCodPar = "" ;
      A130BarCodPar = "" ;
      Z132BarCodReo = (byte)(0) ;
      A132BarCodReo = (byte)(0) ;
      Z129BarCod = 0 ;
      A129BarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtfasqui_level1item_Backcolorstyle ;
   private byte subGridtfasqui_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtfasqui_level1item_Allowselection ;
   private byte subGridtfasqui_level1item_Allowhovering ;
   private byte subGridtfasqui_level1item_Allowcollapsing ;
   private byte subGridtfasqui_level1item_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short wcpOA194BarOrdLin ;
   private short Z194BarOrdLin ;
   private short Z5372FasQuiUl ;
   private short O5372FasQuiUl ;
   private short Z5371FasQuiLin ;
   private short Z5373FasQuiNp ;
   private short Z5374FasQuiTp ;
   private short Z5375FasQuiRb ;
   private short nRcdDeleted_779 ;
   private short nRcdExists_779 ;
   private short nIsMod_779 ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5372FasQuiUl ;
   private short nBlankRcdCount779 ;
   private short RcdFound779 ;
   private short B5372FasQuiUl ;
   private short nBlankRcdUsr779 ;
   private short s5372FasQuiUl ;
   private short A5371FasQuiLin ;
   private short A5373FasQuiNp ;
   private short A5374FasQuiTp ;
   private short A5375FasQuiRb ;
   private short RcdFound15 ;
   private short nIsDirty_15 ;
   private short nIsDirty_779 ;
   private short i5372FasQuiUl ;
   private short ZZ194BarOrdLin ;
   private short ZZ5372FasQuiUl ;
   private short ZO5372FasQuiUl ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_93 ;
   private int nGXsfl_93_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasQuiUl_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtFasQuiLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtFasQuiNp_Enabled ;
   private int edtFasQuiTp_Enabled ;
   private int edtFasQuiRb_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtfasqui_level1item_Backcolor ;
   private int subGridtfasqui_level1item_Allbackcolor ;
   private int defedtFasQuiLin_Enabled ;
   private int idxLst ;
   private int subGridtfasqui_level1item_Selectedindex ;
   private int subGridtfasqui_level1item_Selectioncolor ;
   private int subGridtfasqui_level1item_Hoveringcolor ;
   private int ZZ129BarCod ;
   private long GRIDTFASQUI_LEVEL1ITEM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA758ProCod ;
   private String wcpOA457FasCod ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z758ProCod ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_93_idx="0001" ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasQuiUl_Internalname ;
   private String edtFasQuiUl_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode779 ;
   private String Gx_mode ;
   private String edtFasQuiLin_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForDsc_Internalname ;
   private String edtFasQuiNp_Internalname ;
   private String edtFasQuiTp_Internalname ;
   private String edtFasQuiRb_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridtfasqui_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A766ProForDsc ;
   private String Z457FasCod ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z759ProDsc ;
   private String sMode15 ;
   private String Z766ProForDsc ;
   private String GXCCtl ;
   private String sGXsfl_93_fel_idx="0001" ;
   private String subGridtfasqui_level1item_Class ;
   private String subGridtfasqui_level1item_Linesclass ;
   private String ROClassString ;
   private String edtFasQuiLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtFasQuiNp_Jsonclick ;
   private String edtFasQuiTp_Jsonclick ;
   private String edtFasQuiRb_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtfasqui_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ758ProCod ;
   private String ZZ407EmprNom ;
   private String ZZ759ProDsc ;
   private String ZZ460FasDsc ;
   private String ZZ457FasCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5372FasQuiUl ;
   private boolean bGXsfl_93_Refreshing=false ;
   private boolean n407EmprNom ;
   private com.genexus.webpanels.GXWebGrid Gridtfasqui_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtfasqui_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtfasqui_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T00PM7_A407EmprNom ;
   private boolean[] T00PM7_n407EmprNom ;
   private String[] T00PM8_A759ProDsc ;
   private String[] T00PM9_A396EmprCod ;
   private String[] T00PM10_A460FasDsc ;
   private short[] T00PM11_A194BarOrdLin ;
   private String[] T00PM11_A457FasCod ;
   private String[] T00PM11_A407EmprNom ;
   private boolean[] T00PM11_n407EmprNom ;
   private String[] T00PM11_A759ProDsc ;
   private String[] T00PM11_A460FasDsc ;
   private short[] T00PM11_A5372FasQuiUl ;
   private boolean[] T00PM11_n5372FasQuiUl ;
   private String[] T00PM11_A396EmprCod ;
   private int[] T00PM11_A129BarCod ;
   private byte[] T00PM11_A132BarCodReo ;
   private String[] T00PM11_A130BarCodPar ;
   private String[] T00PM11_A758ProCod ;
   private String[] T00PM12_A396EmprCod ;
   private int[] T00PM12_A129BarCod ;
   private byte[] T00PM12_A132BarCodReo ;
   private String[] T00PM12_A130BarCodPar ;
   private String[] T00PM12_A758ProCod ;
   private short[] T00PM12_A194BarOrdLin ;
   private short[] T00PM6_A194BarOrdLin ;
   private String[] T00PM6_A457FasCod ;
   private short[] T00PM6_A5372FasQuiUl ;
   private boolean[] T00PM6_n5372FasQuiUl ;
   private String[] T00PM6_A396EmprCod ;
   private int[] T00PM6_A129BarCod ;
   private byte[] T00PM6_A132BarCodReo ;
   private String[] T00PM6_A130BarCodPar ;
   private String[] T00PM6_A758ProCod ;
   private String[] T00PM13_A396EmprCod ;
   private int[] T00PM13_A129BarCod ;
   private byte[] T00PM13_A132BarCodReo ;
   private String[] T00PM13_A130BarCodPar ;
   private String[] T00PM13_A758ProCod ;
   private short[] T00PM13_A194BarOrdLin ;
   private String[] T00PM13_A457FasCod ;
   private String[] T00PM14_A396EmprCod ;
   private int[] T00PM14_A129BarCod ;
   private byte[] T00PM14_A132BarCodReo ;
   private String[] T00PM14_A130BarCodPar ;
   private String[] T00PM14_A758ProCod ;
   private short[] T00PM14_A194BarOrdLin ;
   private String[] T00PM14_A457FasCod ;
   private short[] T00PM5_A194BarOrdLin ;
   private String[] T00PM5_A457FasCod ;
   private short[] T00PM5_A5372FasQuiUl ;
   private boolean[] T00PM5_n5372FasQuiUl ;
   private String[] T00PM5_A396EmprCod ;
   private int[] T00PM5_A129BarCod ;
   private byte[] T00PM5_A132BarCodReo ;
   private String[] T00PM5_A130BarCodPar ;
   private String[] T00PM5_A758ProCod ;
   private String[] T00PM18_A396EmprCod ;
   private int[] T00PM18_A129BarCod ;
   private byte[] T00PM18_A132BarCodReo ;
   private String[] T00PM18_A130BarCodPar ;
   private String[] T00PM18_A758ProCod ;
   private short[] T00PM18_A194BarOrdLin ;
   private short[] T00PM18_A12517SolAfLn ;
   private String[] T00PM19_A396EmprCod ;
   private int[] T00PM19_A129BarCod ;
   private byte[] T00PM19_A132BarCodReo ;
   private String[] T00PM19_A130BarCodPar ;
   private String[] T00PM19_A758ProCod ;
   private short[] T00PM19_A194BarOrdLin ;
   private short[] T00PM19_A12516SolLzLn ;
   private String[] T00PM20_A396EmprCod ;
   private int[] T00PM20_A129BarCod ;
   private byte[] T00PM20_A132BarCodReo ;
   private String[] T00PM20_A130BarCodPar ;
   private String[] T00PM20_A758ProCod ;
   private short[] T00PM20_A194BarOrdLin ;
   private short[] T00PM20_A12515SolPlLn ;
   private String[] T00PM21_A396EmprCod ;
   private int[] T00PM21_A129BarCod ;
   private byte[] T00PM21_A132BarCodReo ;
   private String[] T00PM21_A130BarCodPar ;
   private String[] T00PM21_A758ProCod ;
   private short[] T00PM21_A194BarOrdLin ;
   private short[] T00PM21_A12514SolSAlLn ;
   private String[] T00PM22_A396EmprCod ;
   private int[] T00PM22_A129BarCod ;
   private byte[] T00PM22_A132BarCodReo ;
   private String[] T00PM22_A130BarCodPar ;
   private String[] T00PM22_A758ProCod ;
   private short[] T00PM22_A194BarOrdLin ;
   private short[] T00PM22_A12513SolSAcLn ;
   private String[] T00PM23_A396EmprCod ;
   private int[] T00PM23_A129BarCod ;
   private byte[] T00PM23_A132BarCodReo ;
   private String[] T00PM23_A130BarCodPar ;
   private String[] T00PM23_A758ProCod ;
   private short[] T00PM23_A194BarOrdLin ;
   private short[] T00PM23_A12512SolFrLn ;
   private String[] T00PM24_A396EmprCod ;
   private int[] T00PM24_A129BarCod ;
   private byte[] T00PM24_A132BarCodReo ;
   private String[] T00PM24_A130BarCodPar ;
   private String[] T00PM24_A758ProCod ;
   private short[] T00PM24_A194BarOrdLin ;
   private short[] T00PM24_A12511SolAgLn ;
   private String[] T00PM25_A396EmprCod ;
   private int[] T00PM25_A129BarCod ;
   private byte[] T00PM25_A132BarCodReo ;
   private String[] T00PM25_A130BarCodPar ;
   private String[] T00PM25_A758ProCod ;
   private short[] T00PM25_A194BarOrdLin ;
   private short[] T00PM25_A12510SolLvLn ;
   private String[] T00PM26_A396EmprCod ;
   private int[] T00PM26_A129BarCod ;
   private byte[] T00PM26_A132BarCodReo ;
   private String[] T00PM26_A130BarCodPar ;
   private String[] T00PM26_A758ProCod ;
   private short[] T00PM26_A194BarOrdLin ;
   private int[] T00PM26_A10781BarFasNb ;
   private String[] T00PM27_A396EmprCod ;
   private int[] T00PM27_A129BarCod ;
   private byte[] T00PM27_A132BarCodReo ;
   private String[] T00PM27_A130BarCodPar ;
   private String[] T00PM27_A758ProCod ;
   private short[] T00PM27_A194BarOrdLin ;
   private String[] T00PM27_A719PrdNum ;
   private String[] T00PM28_A396EmprCod ;
   private int[] T00PM28_A129BarCod ;
   private byte[] T00PM28_A132BarCodReo ;
   private String[] T00PM28_A130BarCodPar ;
   private String[] T00PM28_A758ProCod ;
   private short[] T00PM28_A194BarOrdLin ;
   private String[] T00PM28_A9966Em_cod ;
   private String[] T00PM29_A396EmprCod ;
   private int[] T00PM29_A129BarCod ;
   private byte[] T00PM29_A132BarCodReo ;
   private String[] T00PM29_A130BarCodPar ;
   private String[] T00PM29_A758ProCod ;
   private short[] T00PM29_A194BarOrdLin ;
   private String[] T00PM29_A9940Ab_cod ;
   private String[] T00PM30_A396EmprCod ;
   private int[] T00PM30_A129BarCod ;
   private byte[] T00PM30_A132BarCodReo ;
   private String[] T00PM30_A130BarCodPar ;
   private String[] T00PM30_A758ProCod ;
   private short[] T00PM30_A194BarOrdLin ;
   private String[] T00PM30_A9911Ca_cod ;
   private String[] T00PM31_A396EmprCod ;
   private int[] T00PM31_A129BarCod ;
   private byte[] T00PM31_A132BarCodReo ;
   private String[] T00PM31_A130BarCodPar ;
   private String[] T00PM31_A758ProCod ;
   private short[] T00PM31_A194BarOrdLin ;
   private String[] T00PM31_A9878Pe_cod ;
   private String[] T00PM32_A396EmprCod ;
   private int[] T00PM32_A129BarCod ;
   private byte[] T00PM32_A132BarCodReo ;
   private String[] T00PM32_A130BarCodPar ;
   private String[] T00PM32_A758ProCod ;
   private short[] T00PM32_A194BarOrdLin ;
   private String[] T00PM32_A9870Rm_cod ;
   private String[] T00PM33_A396EmprCod ;
   private int[] T00PM33_A129BarCod ;
   private byte[] T00PM33_A132BarCodReo ;
   private String[] T00PM33_A130BarCodPar ;
   private String[] T00PM33_A758ProCod ;
   private short[] T00PM33_A194BarOrdLin ;
   private short[] T00PM33_A7934Dtb_Ordl ;
   private String[] T00PM34_A396EmprCod ;
   private int[] T00PM34_A129BarCod ;
   private byte[] T00PM34_A132BarCodReo ;
   private String[] T00PM34_A130BarCodPar ;
   private String[] T00PM34_A758ProCod ;
   private short[] T00PM34_A194BarOrdLin ;
   private int[] T00PM34_A4940A_Barcod ;
   private byte[] T00PM34_A4941A_BarReo ;
   private String[] T00PM34_A4942A_BarPar ;
   private String[] T00PM34_A4943A_ProCod ;
   private short[] T00PM34_A4944A_BarOrd ;
   private String[] T00PM35_A396EmprCod ;
   private int[] T00PM35_A129BarCod ;
   private byte[] T00PM35_A132BarCodReo ;
   private String[] T00PM35_A130BarCodPar ;
   private String[] T00PM35_A758ProCod ;
   private short[] T00PM35_A194BarOrdLin ;
   private int[] T00PM35_A4643BarFasLot ;
   private String[] T00PM36_A396EmprCod ;
   private int[] T00PM36_A129BarCod ;
   private byte[] T00PM36_A132BarCodReo ;
   private String[] T00PM36_A130BarCodPar ;
   private String[] T00PM36_A758ProCod ;
   private short[] T00PM36_A194BarOrdLin ;
   private int[] T00PM36_A4031CCTCod ;
   private String[] T00PM37_A396EmprCod ;
   private int[] T00PM37_A129BarCod ;
   private byte[] T00PM37_A132BarCodReo ;
   private String[] T00PM37_A130BarCodPar ;
   private String[] T00PM37_A758ProCod ;
   private short[] T00PM37_A194BarOrdLin ;
   private short[] T00PM37_A1664ParFasCod ;
   private String[] T00PM39_A396EmprCod ;
   private int[] T00PM39_A129BarCod ;
   private byte[] T00PM39_A132BarCodReo ;
   private String[] T00PM39_A130BarCodPar ;
   private String[] T00PM39_A758ProCod ;
   private short[] T00PM39_A194BarOrdLin ;
   private int[] T00PM40_A129BarCod ;
   private byte[] T00PM40_A132BarCodReo ;
   private String[] T00PM40_A130BarCodPar ;
   private short[] T00PM40_A194BarOrdLin ;
   private short[] T00PM40_A5371FasQuiLin ;
   private String[] T00PM40_A766ProForDsc ;
   private short[] T00PM40_A5373FasQuiNp ;
   private short[] T00PM40_A5374FasQuiTp ;
   private short[] T00PM40_A5375FasQuiRb ;
   private String[] T00PM40_A396EmprCod ;
   private String[] T00PM40_A764ProForCod ;
   private String[] T00PM40_A758ProCod ;
   private String[] T00PM4_A766ProForDsc ;
   private String[] T00PM41_A766ProForDsc ;
   private String[] T00PM42_A396EmprCod ;
   private int[] T00PM42_A129BarCod ;
   private byte[] T00PM42_A132BarCodReo ;
   private String[] T00PM42_A130BarCodPar ;
   private String[] T00PM42_A758ProCod ;
   private short[] T00PM42_A194BarOrdLin ;
   private short[] T00PM42_A5371FasQuiLin ;
   private int[] T00PM3_A129BarCod ;
   private byte[] T00PM3_A132BarCodReo ;
   private String[] T00PM3_A130BarCodPar ;
   private short[] T00PM3_A194BarOrdLin ;
   private short[] T00PM3_A5371FasQuiLin ;
   private short[] T00PM3_A5373FasQuiNp ;
   private short[] T00PM3_A5374FasQuiTp ;
   private short[] T00PM3_A5375FasQuiRb ;
   private String[] T00PM3_A396EmprCod ;
   private String[] T00PM3_A764ProForCod ;
   private String[] T00PM3_A758ProCod ;
   private int[] T00PM2_A129BarCod ;
   private byte[] T00PM2_A132BarCodReo ;
   private String[] T00PM2_A130BarCodPar ;
   private short[] T00PM2_A194BarOrdLin ;
   private short[] T00PM2_A5371FasQuiLin ;
   private short[] T00PM2_A5373FasQuiNp ;
   private short[] T00PM2_A5374FasQuiTp ;
   private short[] T00PM2_A5375FasQuiRb ;
   private String[] T00PM2_A396EmprCod ;
   private String[] T00PM2_A764ProForCod ;
   private String[] T00PM2_A758ProCod ;
   private String[] T00PM46_A766ProForDsc ;
   private String[] T00PM47_A396EmprCod ;
   private int[] T00PM47_A129BarCod ;
   private byte[] T00PM47_A132BarCodReo ;
   private String[] T00PM47_A130BarCodPar ;
   private String[] T00PM47_A758ProCod ;
   private short[] T00PM47_A194BarOrdLin ;
   private short[] T00PM47_A5371FasQuiLin ;
   private String[] T00PM48_A407EmprNom ;
   private boolean[] T00PM48_n407EmprNom ;
   private String[] T00PM49_A759ProDsc ;
   private String[] T00PM50_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfasqui__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasqui__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasqui__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasqui__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfasqui__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00PM2", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin, FasQuiNp, FasQuiTp, FasQuiRb, EmprCod, ProForCod, ProCod FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?  FOR UPDATE OF FasQuiNp, FasQuiTp, FasQuiRb, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM3", "SELECT BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin, FasQuiNp, FasQuiTp, FasQuiRb, EmprCod, ProForCod, ProCod FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM4", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM5", "SELECT BarOrdLin, FasCod, FasQuiUl, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?  FOR UPDATE OF FasCod, FasQuiUl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM6", "SELECT BarOrdLin, FasCod, FasQuiUl, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM9", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM10", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM11", "SELECT /*+ FIRST_ROWS(1) */ TM1.BarOrdLin, TM1.FasCod, T2.EmprNom, T4.ProDsc, T3.FasDsc, TM1.FasQuiUl, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod FROM (((TXPBARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = TM1.EmprCod AND T4.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.ProCod = ? and TM1.BarOrdLin = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ProCod, TM1.BarOrdLin ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and FasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and FasCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, ProCod DESC, BarOrdLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00PM15", "INSERT INTO TXPBARFAS(BarOrdLin, FasCod, FasQuiUl, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasAcab, BarFasInc, BarFasDTI, BarFasDTF, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasFPl, BarFasUsu, BarFasGral, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasCR, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00PM16", "UPDATE TXPBARFAS SET FasCod=?, FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new UpdateCursor("T00PM17", "DELETE FROM TXPBARFAS  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00PM18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAfLn FROM TXPTsSol7 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM19", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLzLn FROM TXPTsSol6 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolPlLn FROM TXPTsSol5 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM21", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAlLn FROM TXPTsSol4 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolSAcLn FROM TXPTsSol3 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM23", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolFrLn FROM TXPTsSol2 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM24", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolAgLn FROM TXPTsSolL WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM25", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, SolLvLn FROM TXPTsSol1 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasNb FROM TXPFASBOT WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM27", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Em_cod FROM TXPCACEMp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ab_cod FROM TXPCACABp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM30", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Ca_cod FROM TXPCACCAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Pe_cod FROM TXPCACPEp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM32", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Rm_cod FROM TXPCACRAp WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM33", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, Dtb_Ordl FROM TXPDT005 WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM34", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, A_Barcod, A_BarReo, A_BarPar, A_ProCod, A_BarOrd FROM TXPAGRHDF WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasLot FROM TXPFASMAQ WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM37", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00PM38", "UPDATE TXPBARFAS SET FasQuiUl=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK, "TXPBARFAS")
         ,new ForEachCursor("T00PM39", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? and FasCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00PM40", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.FasQuiLin, T2.ProForDsc, T1.FasQuiNp, T1.FasQuiTp, T1.FasQuiRb, T1.EmprCod, T1.ProForCod, T1.ProCod FROM (TXPFASQUI T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? and T1.BarOrdLin = ? and T1.FasQuiLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM41", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM42", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00PM43", "INSERT INTO TXPFASQUI(BarCod, BarCodReo, BarCodPar, BarOrdLin, FasQuiLin, FasQuiNp, FasQuiTp, FasQuiRb, EmprCod, ProForCod, ProCod, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK, "TXPFASQUI")
         ,new UpdateCursor("T00PM44", "UPDATE TXPFASQUI SET FasQuiNp=?, FasQuiTp=?, FasQuiRb=?, ProForCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK, "TXPFASQUI")
         ,new UpdateCursor("T00PM45", "DELETE FROM TXPFASQUI  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND FasQuiLin = ?", GX_NOMASK, "TXPFASQUI")
         ,new ForEachCursor("T00PM46", "SELECT ProForDsc FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM47", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM48", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM49", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00PM50", "SELECT EmprCod FROM TXPBARPRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
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
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((String[]) buf[5])[0] = rslt.getString(5, 28);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((String[]) buf[12])[0] = rslt.getString(11, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 48 :
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 13 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 36 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 8);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               stmt.setString(11, (String)parms[10], 8);
               return;
            case 42 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

