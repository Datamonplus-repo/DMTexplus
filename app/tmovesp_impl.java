package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmovesp_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A647NumCon = (int)(GXutil.lval( httpContext.GetPar( "NumCon"))) ;
         n647NumCon = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A719PrdNum, A647NumCon) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtmovesp_level1item") == 0 )
      {
         gxnrgridtmovesp_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MOVIMIENTOS ESPECIALES", ""), (short)(0)) ;
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

   public void gxnrgridtmovesp_level1item_newrow_invoke( )
   {
      nRC_GXsfl_123 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_123"))) ;
      nGXsfl_123_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_123_idx"))) ;
      sGXsfl_123_idx = httpContext.GetPar( "sGXsfl_123_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtmovesp_level1item_newrow( ) ;
      /* End function gxnrGridtmovesp_level1item_newrow_invoke */
   }

   public tmovesp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmovesp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmovesp_impl.class ));
   }

   public tmovesp_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MOVIMIENTOS ESPECIALES", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMOVESP.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TMOVESP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOVESP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNom_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOVESP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMovEspULin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMovEspULin_Internalname, httpContext.getMessage( "Ultima Linea Mov. Espaciales", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMovEspULin_Internalname, GXutil.ltrim( localUtil.ntoc( A644MovEspULin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMovEspULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A644MovEspULin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A644MovEspULin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMovEspULin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMovEspULin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiCC_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltDCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltDCC_Internalname, httpContext.getMessage( "Ultima Diferencia en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltDCC_Internalname, GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltDCC_Enabled!=0) ? localUtil.format( A739PrdUltDCC, "ZZZZ9.99") : localUtil.format( A739PrdUltDCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltDCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUltDCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDetPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDetPar_Internalname, httpContext.getMessage( "Detalle Partidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDetPar_Internalname, GXutil.rtrim( A698PrdDetPar), GXutil.rtrim( localUtil.format( A698PrdDetPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDetPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDetPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRotRea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdRotRea_Internalname, httpContext.getMessage( "Rotacion Real", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRotRea_Internalname, GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdRotRea_Enabled!=0) ? localUtil.format( A729PrdRotRea, "ZZZZZ9.999") : localUtil.format( A729PrdRotRea, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRotRea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRotRea_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltECC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltECC_Internalname, httpContext.getMessage( "Ultima Cantidad Entregada a CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltECC_Internalname, GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltECC_Enabled!=0) ? localUtil.format( A740PrdUltECC, "ZZZZ9.99") : localUtil.format( A740PrdUltECC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltECC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUltECC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltCCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltCCC_Internalname, httpContext.getMessage( "Ultimo No.Contenedores Ent.CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltCCC_Internalname, GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltCCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltCCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUltCCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCCP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiCCP_Internalname, httpContext.getMessage( "Probabilidad existencia en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCCP_Internalname, GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCCP_Enabled!=0) ? localUtil.format( A706PrdExiCCP, "ZZZZ9.99") : localUtil.format( A706PrdExiCCP, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCCP_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCCP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDifCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDifCC_Internalname, httpContext.getMessage( "Diferencia Acumulada en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDifCC_Internalname, GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDifCC_Enabled!=0) ? localUtil.format( A700PrdDifCC, "ZZZZ9.99") : localUtil.format( A700PrdDifCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDifCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDifCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFacCon_Internalname, httpContext.getMessage( "Factor de Conversion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOVESP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtmovesp_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOVESP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtmovesp_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol123( ) ;
      nGXsfl_123_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount73 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_73 = (short)(1) ;
            scanStart1N73( ) ;
            while ( RcdFound73 != 0 )
            {
               init_level_properties73( ) ;
               getByPrimaryKey1N73( ) ;
               addRow1N73( ) ;
               scanNext1N73( ) ;
            }
            scanEnd1N73( ) ;
            nBlankRcdCount73 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1N73( ) ;
         standaloneModal1N73( ) ;
         sMode73 = Gx_mode ;
         while ( nGXsfl_123_idx < nRC_GXsfl_123 )
         {
            bGXsfl_123_Refreshing = true ;
            readRow1N73( ) ;
            edtMovEspLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPLIN_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtMovEspOri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPORI_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspOri_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtMovEspUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPUNI_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspUni_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtNumCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCON_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtNumCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCon_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtDetUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DETUNI_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDetUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDetUni_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtMovEspFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPFEC_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspFec_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtMovEspCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPCLA_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspCla_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtMovEspMot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPMOT_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspMot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspMot_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            edtMovEspCom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPCOM_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMovEspCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspCom_Enabled), 5, 0), !bGXsfl_123_Refreshing);
            if ( ( nRcdExists_73 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1N73( ) ;
            }
            sendRow1N73( ) ;
            bGXsfl_123_Refreshing = false ;
         }
         Gx_mode = sMode73 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount73 = (short)(5) ;
         nRcdExists_73 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1N73( ) ;
            while ( RcdFound73 != 0 )
            {
               sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_12373( ) ;
               init_level_properties73( ) ;
               standaloneNotModal1N73( ) ;
               getByPrimaryKey1N73( ) ;
               standaloneModal1N73( ) ;
               addRow1N73( ) ;
               scanNext1N73( ) ;
            }
            scanEnd1N73( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode73 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_12373( ) ;
      initAll1N73( ) ;
      init_level_properties73( ) ;
      nRcdExists_73 = (short)(0) ;
      nIsMod_73 = (short)(0) ;
      nRcdDeleted_73 = (short)(0) ;
      nBlankRcdCount73 = (short)(nBlankRcdUsr73+nBlankRcdCount73) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount73 > 0 )
      {
         standaloneNotModal1N73( ) ;
         standaloneModal1N73( ) ;
         addRow1N73( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMovEspLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount73 = (short)(nBlankRcdCount73-1) ;
      }
      Gx_mode = sMode73 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtmovesp_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtmovesp_level1item", Gridtmovesp_level1itemContainer, subGridtmovesp_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtmovesp_level1itemContainerData", Gridtmovesp_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtmovesp_level1itemContainerData"+"V", Gridtmovesp_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtmovesp_level1itemContainerData"+"V"+"\" value='"+Gridtmovesp_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
         Z644MovEspULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z644MovEspULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "Z704PrdExiAlm")) ;
         Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
         Z739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( "Z739PrdUltDCC")) ;
         Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
         Z729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
         Z740PrdUltECC = localUtil.ctond( httpContext.cgiGet( "Z740PrdUltECC")) ;
         Z738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z738PrdUltCCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( "Z706PrdExiCCP")) ;
         Z700PrdDifCC = localUtil.ctond( httpContext.cgiGet( "Z700PrdDifCC")) ;
         Z707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "Z707PrdFacCon")) ;
         Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_123 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_123"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrvNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A795PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMovEspULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMovEspULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MOVESPULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMovEspULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A644MovEspULin = (short)(0) ;
            n644MovEspULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A644MovEspULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A644MovEspULin), 3, 0));
         }
         else
         {
            A644MovEspULin = (short)(localUtil.ctol( httpContext.cgiGet( edtMovEspULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n644MovEspULin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A644MovEspULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A644MovEspULin), 3, 0));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXIALM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiAlm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A704PrdExiAlm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         else
         {
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A705PrdExiCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         else
         {
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTDCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltDCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A739PrdUltDCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         }
         else
         {
            A739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         }
         A698PrdDetPar = httpContext.cgiGet( edtPrdDetPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDROTREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdRotRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A729PrdRotRea = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         }
         else
         {
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTECC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltECC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A740PrdUltECC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         }
         else
         {
            A740PrdUltECC = localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTCCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltCCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A738PrdUltCCC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         }
         else
         {
            A738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICCP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCCP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A706PrdExiCCP = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         }
         else
         {
            A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDIFCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDifCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A700PrdDifCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         }
         else
         {
            A700PrdDifCC = localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDFACCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFacCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A707PrdFacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         }
         else
         {
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         }
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
            initAll1N29( ) ;
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
      disableAttributes1N29( ) ;
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

   public void confirm_1N73( )
   {
      nGXsfl_123_idx = 0 ;
      while ( nGXsfl_123_idx < nRC_GXsfl_123 )
      {
         readRow1N73( ) ;
         if ( ( nRcdExists_73 != 0 ) || ( nIsMod_73 != 0 ) )
         {
            getKey1N73( ) ;
            if ( ( nRcdExists_73 == 0 ) && ( nRcdDeleted_73 == 0 ) )
            {
               if ( RcdFound73 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1N73( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1N73( ) ;
                     closeExtendedTableCursors1N73( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MOVESPLIN_" + sGXsfl_123_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMovEspLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound73 != 0 )
               {
                  if ( nRcdDeleted_73 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1N73( ) ;
                     load1N73( ) ;
                     beforeValidate1N73( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1N73( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_73 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1N73( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1N73( ) ;
                           closeExtendedTableCursors1N73( ) ;
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
                  if ( nRcdDeleted_73 == 0 )
                  {
                     GXCCtl = "MOVESPLIN_" + sGXsfl_123_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMovEspLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMovEspLin_Internalname, GXutil.ltrim( localUtil.ntoc( A641MovEspLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMovEspOri_Internalname, GXutil.rtrim( A643MovEspOri)) ;
         httpContext.changePostValue( edtMovEspUni_Internalname, GXutil.ltrim( localUtil.ntoc( A645MovEspUni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCon_Internalname, GXutil.ltrim( localUtil.ntoc( A647NumCon, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDetUni_Internalname, GXutil.ltrim( localUtil.ntoc( A322DetUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMovEspFec_Internalname, localUtil.format(A640MovEspFec, "99/99/99")) ;
         httpContext.changePostValue( edtMovEspCla_Internalname, GXutil.rtrim( A638MovEspCla)) ;
         httpContext.changePostValue( edtMovEspMot_Internalname, GXutil.rtrim( A642MovEspMot)) ;
         httpContext.changePostValue( edtMovEspCom_Internalname, GXutil.rtrim( A639MovEspCom)) ;
         httpContext.changePostValue( "ZT_"+"Z641MovEspLin_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z641MovEspLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z643MovEspOri_"+sGXsfl_123_idx, GXutil.rtrim( Z643MovEspOri)) ;
         httpContext.changePostValue( "ZT_"+"Z645MovEspUni_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z645MovEspUni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z640MovEspFec_"+sGXsfl_123_idx, localUtil.dtoc( Z640MovEspFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z638MovEspCla_"+sGXsfl_123_idx, GXutil.rtrim( Z638MovEspCla)) ;
         httpContext.changePostValue( "ZT_"+"Z642MovEspMot_"+sGXsfl_123_idx, GXutil.rtrim( Z642MovEspMot)) ;
         httpContext.changePostValue( "ZT_"+"Z639MovEspCom_"+sGXsfl_123_idx, GXutil.rtrim( Z639MovEspCom)) ;
         httpContext.changePostValue( "ZT_"+"Z647NumCon_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z647NumCon, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_73_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_73_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_73_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_73 != 0 )
         {
            httpContext.changePostValue( "MOVESPLIN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPORI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspOri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPUNI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCON_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DETUNI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDetUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPFEC_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPCLA_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPMOT_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspMot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPCOM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1N0( )
   {
   }

   public void zm1N29( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T001N6_A718PrdNom[0] ;
            Z644MovEspULin = T001N6_A644MovEspULin[0] ;
            Z704PrdExiAlm = T001N6_A704PrdExiAlm[0] ;
            Z705PrdExiCC = T001N6_A705PrdExiCC[0] ;
            Z739PrdUltDCC = T001N6_A739PrdUltDCC[0] ;
            Z698PrdDetPar = T001N6_A698PrdDetPar[0] ;
            Z729PrdRotRea = T001N6_A729PrdRotRea[0] ;
            Z740PrdUltECC = T001N6_A740PrdUltECC[0] ;
            Z738PrdUltCCC = T001N6_A738PrdUltCCC[0] ;
            Z706PrdExiCCP = T001N6_A706PrdExiCCP[0] ;
            Z700PrdDifCC = T001N6_A700PrdDifCC[0] ;
            Z707PrdFacCon = T001N6_A707PrdFacCon[0] ;
            Z795PrvNum = T001N6_A795PrvNum[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
            Z644MovEspULin = A644MovEspULin ;
            Z704PrdExiAlm = A704PrdExiAlm ;
            Z705PrdExiCC = A705PrdExiCC ;
            Z739PrdUltDCC = A739PrdUltDCC ;
            Z698PrdDetPar = A698PrdDetPar ;
            Z729PrdRotRea = A729PrdRotRea ;
            Z740PrdUltECC = A740PrdUltECC ;
            Z738PrdUltCCC = A738PrdUltCCC ;
            Z706PrdExiCCP = A706PrdExiCCP ;
            Z700PrdDifCC = A700PrdDifCC ;
            Z707PrdFacCon = A707PrdFacCon ;
            Z795PrvNum = A795PrvNum ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z644MovEspULin = A644MovEspULin ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z739PrdUltDCC = A739PrdUltDCC ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z740PrdUltECC = A740PrdUltECC ;
         Z738PrdUltCCC = A738PrdUltCCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z700PrdDifCC = A700PrdDifCC ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z407EmprNom = A407EmprNom ;
         Z794PrvNom = A794PrvNom ;
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

   public void load1N29( )
   {
      /* Using cursor T001N9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A718PrdNom = T001N9_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A794PrvNom = T001N9_A794PrvNom[0] ;
         n794PrvNom = T001N9_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A407EmprNom = T001N9_A407EmprNom[0] ;
         n407EmprNom = T001N9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A644MovEspULin = T001N9_A644MovEspULin[0] ;
         n644MovEspULin = T001N9_n644MovEspULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644MovEspULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A644MovEspULin), 3, 0));
         A704PrdExiAlm = T001N9_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T001N9_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A739PrdUltDCC = T001N9_A739PrdUltDCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A698PrdDetPar = T001N9_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A729PrdRotRea = T001N9_A729PrdRotRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A740PrdUltECC = T001N9_A740PrdUltECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = T001N9_A738PrdUltCCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A706PrdExiCCP = T001N9_A706PrdExiCCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A700PrdDifCC = T001N9_A700PrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A707PrdFacCon = T001N9_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A795PrvNum = T001N9_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         zm1N29( -5) ;
      }
      pr_default.close(7);
      onLoadActions1N29( ) ;
   }

   public void onLoadActions1N29( )
   {
   }

   public void checkExtendedTable1N29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T001N7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001N7_A407EmprNom[0] ;
      n407EmprNom = T001N7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T001N8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T001N8_A794PrvNom[0] ;
      n794PrvNom = T001N8_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(6);
      if ( ! ( ( GXutil.strcmp(A698PrdDetPar, "S") == 0 ) || ( GXutil.strcmp(A698PrdDetPar, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Detalle Partidas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDDETPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDetPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1N29( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod )
   {
      /* Using cursor T001N10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001N10_A407EmprNom[0] ;
      n407EmprNom = T001N10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_7( String A396EmprCod ,
                         int A795PrvNum )
   {
      /* Using cursor T001N11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T001N11_A794PrvNom[0] ;
      n794PrvNom = T001N11_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1N29( )
   {
      /* Using cursor T001N12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001N6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1N29( 5) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T001N6_A719PrdNum[0] ;
         n719PrdNum = T001N6_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T001N6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A644MovEspULin = T001N6_A644MovEspULin[0] ;
         n644MovEspULin = T001N6_n644MovEspULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644MovEspULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A644MovEspULin), 3, 0));
         A704PrdExiAlm = T001N6_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T001N6_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A739PrdUltDCC = T001N6_A739PrdUltDCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A698PrdDetPar = T001N6_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A729PrdRotRea = T001N6_A729PrdRotRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A740PrdUltECC = T001N6_A740PrdUltECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = T001N6_A738PrdUltCCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A706PrdExiCCP = T001N6_A706PrdExiCCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A700PrdDifCC = T001N6_A700PrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A707PrdFacCon = T001N6_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A396EmprCod = T001N6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = T001N6_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1N29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1N29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1N29( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T001N13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T001N13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001N13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001N13_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T001N13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001N13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001N13_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T001N13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T001N13_A719PrdNum[0] ;
            n719PrdNum = T001N13_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T001N14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T001N14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T001N14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001N14_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T001N14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T001N14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T001N14_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T001N14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T001N14_A719PrdNum[0] ;
            n719PrdNum = T001N14_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1N29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
               update1N29( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1N29( ) ;
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
                  insert1N29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1N29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N29( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      scanStart1N29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext1N29( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N29( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001N5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z718PrdNom, T001N5_A718PrdNom[0]) != 0 ) || ( Z644MovEspULin != T001N5_A644MovEspULin[0] ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, T001N5_A704PrdExiAlm[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T001N5_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z739PrdUltDCC, T001N5_A739PrdUltDCC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z698PrdDetPar, T001N5_A698PrdDetPar[0]) != 0 ) || ( DecimalUtil.compareTo(Z729PrdRotRea, T001N5_A729PrdRotRea[0]) != 0 ) || ( DecimalUtil.compareTo(Z740PrdUltECC, T001N5_A740PrdUltECC[0]) != 0 ) || ( Z738PrdUltCCC != T001N5_A738PrdUltCCC[0] ) || ( DecimalUtil.compareTo(Z706PrdExiCCP, T001N5_A706PrdExiCCP[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z700PrdDifCC, T001N5_A700PrdDifCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z707PrdFacCon, T001N5_A707PrdFacCon[0]) != 0 ) || ( Z795PrvNum != T001N5_A795PrvNum[0] ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T001N5_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T001N5_A718PrdNom[0]);
            }
            if ( Z644MovEspULin != T001N5_A644MovEspULin[0] )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspULin");
               GXutil.writeLogRaw("Old: ",Z644MovEspULin);
               GXutil.writeLogRaw("Current: ",T001N5_A644MovEspULin[0]);
            }
            if ( DecimalUtil.compareTo(Z704PrdExiAlm, T001N5_A704PrdExiAlm[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdExiAlm");
               GXutil.writeLogRaw("Old: ",Z704PrdExiAlm);
               GXutil.writeLogRaw("Current: ",T001N5_A704PrdExiAlm[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T001N5_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T001N5_A705PrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z739PrdUltDCC, T001N5_A739PrdUltDCC[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdUltDCC");
               GXutil.writeLogRaw("Old: ",Z739PrdUltDCC);
               GXutil.writeLogRaw("Current: ",T001N5_A739PrdUltDCC[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T001N5_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T001N5_A698PrdDetPar[0]);
            }
            if ( DecimalUtil.compareTo(Z729PrdRotRea, T001N5_A729PrdRotRea[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdRotRea");
               GXutil.writeLogRaw("Old: ",Z729PrdRotRea);
               GXutil.writeLogRaw("Current: ",T001N5_A729PrdRotRea[0]);
            }
            if ( DecimalUtil.compareTo(Z740PrdUltECC, T001N5_A740PrdUltECC[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdUltECC");
               GXutil.writeLogRaw("Old: ",Z740PrdUltECC);
               GXutil.writeLogRaw("Current: ",T001N5_A740PrdUltECC[0]);
            }
            if ( Z738PrdUltCCC != T001N5_A738PrdUltCCC[0] )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdUltCCC");
               GXutil.writeLogRaw("Old: ",Z738PrdUltCCC);
               GXutil.writeLogRaw("Current: ",T001N5_A738PrdUltCCC[0]);
            }
            if ( DecimalUtil.compareTo(Z706PrdExiCCP, T001N5_A706PrdExiCCP[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdExiCCP");
               GXutil.writeLogRaw("Old: ",Z706PrdExiCCP);
               GXutil.writeLogRaw("Current: ",T001N5_A706PrdExiCCP[0]);
            }
            if ( DecimalUtil.compareTo(Z700PrdDifCC, T001N5_A700PrdDifCC[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdDifCC");
               GXutil.writeLogRaw("Old: ",Z700PrdDifCC);
               GXutil.writeLogRaw("Current: ",T001N5_A700PrdDifCC[0]);
            }
            if ( DecimalUtil.compareTo(Z707PrdFacCon, T001N5_A707PrdFacCon[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrdFacCon");
               GXutil.writeLogRaw("Old: ",Z707PrdFacCon);
               GXutil.writeLogRaw("Current: ",T001N5_A707PrdFacCon[0]);
            }
            if ( Z795PrvNum != T001N5_A795PrvNum[0] )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T001N5_A795PrvNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N29( )
   {
      beforeValidate1N29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N29( 0) ;
         checkOptimisticConcurrency1N29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001N15 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, Boolean.valueOf(n644MovEspULin), Short.valueOf(A644MovEspULin), A704PrdExiAlm, A705PrdExiCC, A739PrdUltDCC, A698PrdDetPar, A729PrdRotRea, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A706PrdExiCCP, A700PrdDifCC, A707PrdFacCon, A396EmprCod, Integer.valueOf(A795PrvNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel1N29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1N0( ) ;
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
            load1N29( ) ;
         }
         endLevel1N29( ) ;
      }
      closeExtendedTableCursors1N29( ) ;
   }

   public void update1N29( )
   {
      beforeValidate1N29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001N16 */
                  pr_default.execute(14, new Object[] {A718PrdNom, Boolean.valueOf(n644MovEspULin), Short.valueOf(A644MovEspULin), A704PrdExiAlm, A705PrdExiCC, A739PrdUltDCC, A698PrdDetPar, A729PrdRotRea, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A706PrdExiCCP, A700PrdDifCC, A707PrdFacCon, Integer.valueOf(A795PrvNum), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1N29( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1N0( ) ;
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
         endLevel1N29( ) ;
      }
      closeExtendedTableCursors1N29( ) ;
   }

   public void deferredUpdate1N29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N29( ) ;
         afterConfirm1N29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001N17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound29 == 0 )
                     {
                        initAll1N29( ) ;
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
                     resetCaption1N0( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001N18 */
         pr_default.execute(16, new Object[] {A396EmprCod});
         A407EmprNom = T001N18_A407EmprNom[0] ;
         n407EmprNom = T001N18_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(16);
         /* Using cursor T001N19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T001N19_A794PrvNom[0] ;
         n794PrvNom = T001N19_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001N20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T001N21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T001N22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T001N23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T001N24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T001N25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T001N26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T001N27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T001N28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T001N29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T001N30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T001N31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T001N32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T001N33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T001N34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T001N35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T001N36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T001N37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T001N38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T001N39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T001N40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T001N41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T001N42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T001N43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T001N44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T001N45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T001N46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T001N47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T001N48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T001N49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T001N50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T001N51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T001N52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T001N53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T001N54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T001N55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T001N56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T001N57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T001N58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T001N59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T001N60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T001N61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T001N62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T001N63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T001N64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T001N65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T001N66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T001N67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T001N68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T001N69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T001N70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T001N71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T001N72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T001N73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T001N74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T001N75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T001N76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T001N77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T001N78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T001N79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T001N80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T001N81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T001N82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T001N83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T001N84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T001N85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T001N86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T001N87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T001N88 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T001N89 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T001N90 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T001N91 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T001N92 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
      }
   }

   public void processNestedLevel1N73( )
   {
      nGXsfl_123_idx = 0 ;
      while ( nGXsfl_123_idx < nRC_GXsfl_123 )
      {
         readRow1N73( ) ;
         if ( ( nRcdExists_73 != 0 ) || ( nIsMod_73 != 0 ) )
         {
            standaloneNotModal1N73( ) ;
            getKey1N73( ) ;
            if ( ( nRcdExists_73 == 0 ) && ( nRcdDeleted_73 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1N73( ) ;
            }
            else
            {
               if ( RcdFound73 != 0 )
               {
                  if ( ( nRcdDeleted_73 != 0 ) && ( nRcdExists_73 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1N73( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_73 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1N73( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_73 == 0 )
                  {
                     GXCCtl = "MOVESPLIN_" + sGXsfl_123_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMovEspLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMovEspLin_Internalname, GXutil.ltrim( localUtil.ntoc( A641MovEspLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMovEspOri_Internalname, GXutil.rtrim( A643MovEspOri)) ;
         httpContext.changePostValue( edtMovEspUni_Internalname, GXutil.ltrim( localUtil.ntoc( A645MovEspUni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtNumCon_Internalname, GXutil.ltrim( localUtil.ntoc( A647NumCon, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDetUni_Internalname, GXutil.ltrim( localUtil.ntoc( A322DetUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMovEspFec_Internalname, localUtil.format(A640MovEspFec, "99/99/99")) ;
         httpContext.changePostValue( edtMovEspCla_Internalname, GXutil.rtrim( A638MovEspCla)) ;
         httpContext.changePostValue( edtMovEspMot_Internalname, GXutil.rtrim( A642MovEspMot)) ;
         httpContext.changePostValue( edtMovEspCom_Internalname, GXutil.rtrim( A639MovEspCom)) ;
         httpContext.changePostValue( "ZT_"+"Z641MovEspLin_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z641MovEspLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z643MovEspOri_"+sGXsfl_123_idx, GXutil.rtrim( Z643MovEspOri)) ;
         httpContext.changePostValue( "ZT_"+"Z645MovEspUni_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z645MovEspUni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z640MovEspFec_"+sGXsfl_123_idx, localUtil.dtoc( Z640MovEspFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z638MovEspCla_"+sGXsfl_123_idx, GXutil.rtrim( Z638MovEspCla)) ;
         httpContext.changePostValue( "ZT_"+"Z642MovEspMot_"+sGXsfl_123_idx, GXutil.rtrim( Z642MovEspMot)) ;
         httpContext.changePostValue( "ZT_"+"Z639MovEspCom_"+sGXsfl_123_idx, GXutil.rtrim( Z639MovEspCom)) ;
         httpContext.changePostValue( "ZT_"+"Z647NumCon_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( Z647NumCon, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_73_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_73_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_73_"+sGXsfl_123_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_73 != 0 )
         {
            httpContext.changePostValue( "MOVESPLIN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPORI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspOri_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPUNI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "NUMCON_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DETUNI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDetUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPFEC_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPCLA_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPMOT_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspMot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOVESPCOM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1N73( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_73 = (short)(0) ;
      nIsMod_73 = (short)(0) ;
      nRcdDeleted_73 = (short)(0) ;
   }

   public void processLevel1N29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1N73( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1N29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1N29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmovesp");
         if ( AnyError == 0 )
         {
            confirmValues1N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmovesp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N29( )
   {
      /* Using cursor T001N93 */
      pr_default.execute(91);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T001N93_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T001N93_A719PrdNum[0] ;
         n719PrdNum = T001N93_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N29( )
   {
      /* Scan next routine */
      pr_default.readNext(91);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(91) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T001N93_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T001N93_A719PrdNum[0] ;
         n719PrdNum = T001N93_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1N29( )
   {
      pr_default.close(91);
   }

   public void afterConfirm1N29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N29( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtMovEspULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspULin_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtPrdUltDCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltDCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltDCC_Enabled), 5, 0), true);
      edtPrdDetPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDetPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDetPar_Enabled), 5, 0), true);
      edtPrdRotRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRotRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRotRea_Enabled), 5, 0), true);
      edtPrdUltECC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltECC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltECC_Enabled), 5, 0), true);
      edtPrdUltCCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltCCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltCCC_Enabled), 5, 0), true);
      edtPrdExiCCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCCP_Enabled), 5, 0), true);
      edtPrdDifCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDifCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDifCC_Enabled), 5, 0), true);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), true);
   }

   public void zm1N73( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z643MovEspOri = T001N3_A643MovEspOri[0] ;
            Z645MovEspUni = T001N3_A645MovEspUni[0] ;
            Z640MovEspFec = T001N3_A640MovEspFec[0] ;
            Z638MovEspCla = T001N3_A638MovEspCla[0] ;
            Z642MovEspMot = T001N3_A642MovEspMot[0] ;
            Z639MovEspCom = T001N3_A639MovEspCom[0] ;
            Z647NumCon = T001N3_A647NumCon[0] ;
         }
         else
         {
            Z643MovEspOri = A643MovEspOri ;
            Z645MovEspUni = A645MovEspUni ;
            Z640MovEspFec = A640MovEspFec ;
            Z638MovEspCla = A638MovEspCla ;
            Z642MovEspMot = A642MovEspMot ;
            Z639MovEspCom = A639MovEspCom ;
            Z647NumCon = A647NumCon ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z641MovEspLin = A641MovEspLin ;
         Z643MovEspOri = A643MovEspOri ;
         Z645MovEspUni = A645MovEspUni ;
         Z640MovEspFec = A640MovEspFec ;
         Z638MovEspCla = A638MovEspCla ;
         Z642MovEspMot = A642MovEspMot ;
         Z639MovEspCom = A639MovEspCom ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z647NumCon = A647NumCon ;
         Z322DetUni = A322DetUni ;
      }
   }

   public void standaloneNotModal1N73( )
   {
   }

   public void standaloneModal1N73( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMovEspLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMovEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      }
      else
      {
         edtMovEspLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMovEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      }
   }

   public void load1N73( )
   {
      /* Using cursor T001N94 */
      pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A641MovEspLin)});
      if ( (pr_default.getStatus(92) != 101) )
      {
         RcdFound73 = (short)(1) ;
         A643MovEspOri = T001N94_A643MovEspOri[0] ;
         n643MovEspOri = T001N94_n643MovEspOri[0] ;
         A645MovEspUni = T001N94_A645MovEspUni[0] ;
         n645MovEspUni = T001N94_n645MovEspUni[0] ;
         A322DetUni = T001N94_A322DetUni[0] ;
         n322DetUni = T001N94_n322DetUni[0] ;
         A640MovEspFec = T001N94_A640MovEspFec[0] ;
         n640MovEspFec = T001N94_n640MovEspFec[0] ;
         A638MovEspCla = T001N94_A638MovEspCla[0] ;
         n638MovEspCla = T001N94_n638MovEspCla[0] ;
         A642MovEspMot = T001N94_A642MovEspMot[0] ;
         n642MovEspMot = T001N94_n642MovEspMot[0] ;
         A639MovEspCom = T001N94_A639MovEspCom[0] ;
         n639MovEspCom = T001N94_n639MovEspCom[0] ;
         A647NumCon = T001N94_A647NumCon[0] ;
         n647NumCon = T001N94_n647NumCon[0] ;
         zm1N73( -8) ;
      }
      pr_default.close(92);
      onLoadActions1N73( ) ;
   }

   public void onLoadActions1N73( )
   {
   }

   public void checkExtendedTable1N73( )
   {
      nIsDirty_73 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1N73( ) ;
      /* Using cursor T001N4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n647NumCon), Integer.valueOf(A647NumCon)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "NUMCON_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DETCON", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A322DetUni = T001N4_A322DetUni[0] ;
      n322DetUni = T001N4_n322DetUni[0] ;
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A643MovEspOri, "A") == 0 ) || ( GXutil.strcmp(A643MovEspOri, "C") == 0 ) ) )
      {
         GXCCtl = "MOVESPORI_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Origen", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMovEspOri_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A638MovEspCla, "D") == 0 ) || ( GXutil.strcmp(A638MovEspCla, "R") == 0 ) || ( GXutil.strcmp(A638MovEspCla, "S") == 0 ) ) )
      {
         GXCCtl = "MOVESPCLA_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo de Movimiento", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMovEspCla_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A639MovEspCom, "S") == 0 ) || ( GXutil.strcmp(A639MovEspCom, "N") == 0 ) ) )
      {
         GXCCtl = "MOVESPCOM_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Completo", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMovEspCom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1N73( )
   {
      pr_default.close(2);
   }

   public void enableDisable1N73( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         String A719PrdNum ,
                         int A647NumCon )
   {
      /* Using cursor T001N95 */
      pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n647NumCon), Integer.valueOf(A647NumCon)});
      if ( (pr_default.getStatus(93) == 101) )
      {
         GXCCtl = "NUMCON_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DETCON", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCon_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A322DetUni = T001N95_A322DetUni[0] ;
      n322DetUni = T001N95_n322DetUni[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A322DetUni, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(93) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(93);
   }

   public void getKey1N73( )
   {
      /* Using cursor T001N96 */
      pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A641MovEspLin)});
      if ( (pr_default.getStatus(94) != 101) )
      {
         RcdFound73 = (short)(1) ;
      }
      else
      {
         RcdFound73 = (short)(0) ;
      }
      pr_default.close(94);
   }

   public void getByPrimaryKey1N73( )
   {
      /* Using cursor T001N3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A641MovEspLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1N73( 8) ;
         RcdFound73 = (short)(1) ;
         initializeNonKey1N73( ) ;
         A641MovEspLin = T001N3_A641MovEspLin[0] ;
         A643MovEspOri = T001N3_A643MovEspOri[0] ;
         n643MovEspOri = T001N3_n643MovEspOri[0] ;
         A645MovEspUni = T001N3_A645MovEspUni[0] ;
         n645MovEspUni = T001N3_n645MovEspUni[0] ;
         A640MovEspFec = T001N3_A640MovEspFec[0] ;
         n640MovEspFec = T001N3_n640MovEspFec[0] ;
         A638MovEspCla = T001N3_A638MovEspCla[0] ;
         n638MovEspCla = T001N3_n638MovEspCla[0] ;
         A642MovEspMot = T001N3_A642MovEspMot[0] ;
         n642MovEspMot = T001N3_n642MovEspMot[0] ;
         A639MovEspCom = T001N3_A639MovEspCom[0] ;
         n639MovEspCom = T001N3_n639MovEspCom[0] ;
         A647NumCon = T001N3_A647NumCon[0] ;
         n647NumCon = T001N3_n647NumCon[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z641MovEspLin = A641MovEspLin ;
         sMode73 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N73( ) ;
         load1N73( ) ;
         Gx_mode = sMode73 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound73 = (short)(0) ;
         initializeNonKey1N73( ) ;
         sMode73 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1N73( ) ;
         Gx_mode = sMode73 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1N73( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1N73( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001N2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A641MovEspLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOVESP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z643MovEspOri, T001N2_A643MovEspOri[0]) != 0 ) || ( DecimalUtil.compareTo(Z645MovEspUni, T001N2_A645MovEspUni[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z640MovEspFec), GXutil.resetTime(T001N2_A640MovEspFec[0])) ) || ( GXutil.strcmp(Z638MovEspCla, T001N2_A638MovEspCla[0]) != 0 ) || ( GXutil.strcmp(Z642MovEspMot, T001N2_A642MovEspMot[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z639MovEspCom, T001N2_A639MovEspCom[0]) != 0 ) || ( Z647NumCon != T001N2_A647NumCon[0] ) )
         {
            if ( GXutil.strcmp(Z643MovEspOri, T001N2_A643MovEspOri[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspOri");
               GXutil.writeLogRaw("Old: ",Z643MovEspOri);
               GXutil.writeLogRaw("Current: ",T001N2_A643MovEspOri[0]);
            }
            if ( DecimalUtil.compareTo(Z645MovEspUni, T001N2_A645MovEspUni[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspUni");
               GXutil.writeLogRaw("Old: ",Z645MovEspUni);
               GXutil.writeLogRaw("Current: ",T001N2_A645MovEspUni[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z640MovEspFec), GXutil.resetTime(T001N2_A640MovEspFec[0])) ) )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspFec");
               GXutil.writeLogRaw("Old: ",Z640MovEspFec);
               GXutil.writeLogRaw("Current: ",T001N2_A640MovEspFec[0]);
            }
            if ( GXutil.strcmp(Z638MovEspCla, T001N2_A638MovEspCla[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspCla");
               GXutil.writeLogRaw("Old: ",Z638MovEspCla);
               GXutil.writeLogRaw("Current: ",T001N2_A638MovEspCla[0]);
            }
            if ( GXutil.strcmp(Z642MovEspMot, T001N2_A642MovEspMot[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspMot");
               GXutil.writeLogRaw("Old: ",Z642MovEspMot);
               GXutil.writeLogRaw("Current: ",T001N2_A642MovEspMot[0]);
            }
            if ( GXutil.strcmp(Z639MovEspCom, T001N2_A639MovEspCom[0]) != 0 )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"MovEspCom");
               GXutil.writeLogRaw("Old: ",Z639MovEspCom);
               GXutil.writeLogRaw("Current: ",T001N2_A639MovEspCom[0]);
            }
            if ( Z647NumCon != T001N2_A647NumCon[0] )
            {
               GXutil.writeLogln("tmovesp:[seudo value changed for attri]"+"NumCon");
               GXutil.writeLogRaw("Old: ",Z647NumCon);
               GXutil.writeLogRaw("Current: ",T001N2_A647NumCon[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMOVESP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N73( )
   {
      beforeValidate1N73( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N73( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N73( 0) ;
         checkOptimisticConcurrency1N73( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N73( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N73( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001N97 */
                  pr_default.execute(95, new Object[] {Short.valueOf(A641MovEspLin), Boolean.valueOf(n643MovEspOri), A643MovEspOri, Boolean.valueOf(n645MovEspUni), A645MovEspUni, Boolean.valueOf(n640MovEspFec), A640MovEspFec, Boolean.valueOf(n638MovEspCla), A638MovEspCla, Boolean.valueOf(n642MovEspMot), A642MovEspMot, Boolean.valueOf(n639MovEspCom), A639MovEspCom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n647NumCon), Integer.valueOf(A647NumCon)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOVESP");
                  if ( (pr_default.getStatus(95) == 1) )
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
            load1N73( ) ;
         }
         endLevel1N73( ) ;
      }
      closeExtendedTableCursors1N73( ) ;
   }

   public void update1N73( )
   {
      beforeValidate1N73( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N73( ) ;
      }
      if ( ( nIsMod_73 != 0 ) || ( nIsDirty_73 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1N73( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1N73( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1N73( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T001N98 */
                     pr_default.execute(96, new Object[] {Boolean.valueOf(n643MovEspOri), A643MovEspOri, Boolean.valueOf(n645MovEspUni), A645MovEspUni, Boolean.valueOf(n640MovEspFec), A640MovEspFec, Boolean.valueOf(n638MovEspCla), A638MovEspCla, Boolean.valueOf(n642MovEspMot), A642MovEspMot, Boolean.valueOf(n639MovEspCom), A639MovEspCom, Boolean.valueOf(n647NumCon), Integer.valueOf(A647NumCon), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A641MovEspLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOVESP");
                     if ( (pr_default.getStatus(96) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMOVESP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1N73( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1N73( ) ;
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
            endLevel1N73( ) ;
         }
      }
      closeExtendedTableCursors1N73( ) ;
   }

   public void deferredUpdate1N73( )
   {
   }

   public void delete1N73( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N73( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N73( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N73( ) ;
         afterConfirm1N73( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N73( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001N99 */
               pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A641MovEspLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMOVESP");
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
      sMode73 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N73( ) ;
      Gx_mode = sMode73 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N73( )
   {
      standaloneModal1N73( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001N100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n647NumCon), Integer.valueOf(A647NumCon)});
         A322DetUni = T001N100_A322DetUni[0] ;
         n322DetUni = T001N100_n322DetUni[0] ;
         pr_default.close(98);
      }
   }

   public void endLevel1N73( )
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

   public void scanStart1N73( )
   {
      /* Scan By routine */
      /* Using cursor T001N101 */
      pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound73 = (short)(0) ;
      if ( (pr_default.getStatus(99) != 101) )
      {
         RcdFound73 = (short)(1) ;
         A641MovEspLin = T001N101_A641MovEspLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N73( )
   {
      /* Scan next routine */
      pr_default.readNext(99);
      RcdFound73 = (short)(0) ;
      if ( (pr_default.getStatus(99) != 101) )
      {
         RcdFound73 = (short)(1) ;
         A641MovEspLin = T001N101_A641MovEspLin[0] ;
      }
   }

   public void scanEnd1N73( )
   {
      pr_default.close(99);
   }

   public void afterConfirm1N73( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N73( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N73( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N73( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N73( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N73( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N73( )
   {
      edtMovEspLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtMovEspOri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspOri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspOri_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtMovEspUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspUni_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtNumCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtNumCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtNumCon_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtDetUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDetUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDetUni_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtMovEspFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspFec_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtMovEspCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspCla_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtMovEspMot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspMot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspMot_Enabled), 5, 0), !bGXsfl_123_Refreshing);
      edtMovEspCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspCom_Enabled), 5, 0), !bGXsfl_123_Refreshing);
   }

   public void send_integrity_lvl_hashes1N73( )
   {
   }

   public void send_integrity_lvl_hashes1N29( )
   {
   }

   public void subsflControlProps_12373( )
   {
      edtMovEspLin_Internalname = "MOVESPLIN_"+sGXsfl_123_idx ;
      edtMovEspOri_Internalname = "MOVESPORI_"+sGXsfl_123_idx ;
      edtMovEspUni_Internalname = "MOVESPUNI_"+sGXsfl_123_idx ;
      edtNumCon_Internalname = "NUMCON_"+sGXsfl_123_idx ;
      edtDetUni_Internalname = "DETUNI_"+sGXsfl_123_idx ;
      edtMovEspFec_Internalname = "MOVESPFEC_"+sGXsfl_123_idx ;
      edtMovEspCla_Internalname = "MOVESPCLA_"+sGXsfl_123_idx ;
      edtMovEspMot_Internalname = "MOVESPMOT_"+sGXsfl_123_idx ;
      edtMovEspCom_Internalname = "MOVESPCOM_"+sGXsfl_123_idx ;
   }

   public void subsflControlProps_fel_12373( )
   {
      edtMovEspLin_Internalname = "MOVESPLIN_"+sGXsfl_123_fel_idx ;
      edtMovEspOri_Internalname = "MOVESPORI_"+sGXsfl_123_fel_idx ;
      edtMovEspUni_Internalname = "MOVESPUNI_"+sGXsfl_123_fel_idx ;
      edtNumCon_Internalname = "NUMCON_"+sGXsfl_123_fel_idx ;
      edtDetUni_Internalname = "DETUNI_"+sGXsfl_123_fel_idx ;
      edtMovEspFec_Internalname = "MOVESPFEC_"+sGXsfl_123_fel_idx ;
      edtMovEspCla_Internalname = "MOVESPCLA_"+sGXsfl_123_fel_idx ;
      edtMovEspMot_Internalname = "MOVESPMOT_"+sGXsfl_123_fel_idx ;
      edtMovEspCom_Internalname = "MOVESPCOM_"+sGXsfl_123_fel_idx ;
   }

   public void addRow1N73( )
   {
      nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12373( ) ;
      sendRow1N73( ) ;
   }

   public void sendRow1N73( )
   {
      Gridtmovesp_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtmovesp_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtmovesp_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtmovesp_level1item_Class, "") != 0 )
         {
            subGridtmovesp_level1item_Linesclass = subGridtmovesp_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtmovesp_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtmovesp_level1item_Backstyle = (byte)(0) ;
         subGridtmovesp_level1item_Backcolor = subGridtmovesp_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtmovesp_level1item_Class, "") != 0 )
         {
            subGridtmovesp_level1item_Linesclass = subGridtmovesp_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtmovesp_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtmovesp_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtmovesp_level1item_Class, "") != 0 )
         {
            subGridtmovesp_level1item_Linesclass = subGridtmovesp_level1item_Class+"Odd" ;
         }
         subGridtmovesp_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtmovesp_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtmovesp_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_123_idx) % (2))) == 0 )
         {
            subGridtmovesp_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtmovesp_level1item_Class, "") != 0 )
            {
               subGridtmovesp_level1item_Linesclass = subGridtmovesp_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtmovesp_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtmovesp_level1item_Class, "") != 0 )
            {
               subGridtmovesp_level1item_Linesclass = subGridtmovesp_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspLin_Internalname,GXutil.ltrim( localUtil.ntoc( A641MovEspLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A641MovEspLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspOri_Internalname,GXutil.rtrim( A643MovEspOri),GXutil.rtrim( localUtil.format( A643MovEspOri, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,125);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspOri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspOri_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 126,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspUni_Internalname,GXutil.ltrim( localUtil.ntoc( A645MovEspUni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMovEspUni_Enabled!=0) ? localUtil.format( A645MovEspUni, "ZZZZZZ9.99") : localUtil.format( A645MovEspUni, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtNumCon_Internalname,GXutil.ltrim( localUtil.ntoc( A647NumCon, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtNumCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A647NumCon), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A647NumCon), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,127);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtNumCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtNumCon_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDetUni_Internalname,GXutil.ltrim( localUtil.ntoc( A322DetUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDetUni_Enabled!=0) ? localUtil.format( A322DetUni, "ZZZZZ9.99") : localUtil.format( A322DetUni, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDetUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDetUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspFec_Internalname,localUtil.format(A640MovEspFec, "99/99/99"),localUtil.format( A640MovEspFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,129);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspCla_Internalname,GXutil.rtrim( A638MovEspCla),GXutil.rtrim( localUtil.format( A638MovEspCla, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,130);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspCla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspMot_Internalname,GXutil.rtrim( A642MovEspMot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspMot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspMot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(24),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_73_" + sGXsfl_123_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_123_idx + "',123)\"" ;
      ROClassString = "Attribute" ;
      Gridtmovesp_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMovEspCom_Internalname,GXutil.rtrim( A639MovEspCom),GXutil.rtrim( localUtil.format( A639MovEspCom, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMovEspCom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMovEspCom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(123),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtmovesp_level1itemRow);
      send_integrity_lvl_hashes1N73( ) ;
      GXCCtl = "Z641MovEspLin_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z641MovEspLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z643MovEspOri_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z643MovEspOri));
      GXCCtl = "Z645MovEspUni_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z645MovEspUni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z640MovEspFec_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z640MovEspFec, 0, "/"));
      GXCCtl = "Z638MovEspCla_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z638MovEspCla));
      GXCCtl = "Z642MovEspMot_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z642MovEspMot));
      GXCCtl = "Z639MovEspCom_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z639MovEspCom));
      GXCCtl = "Z647NumCon_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z647NumCon, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_73_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_73_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_73_" + sGXsfl_123_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_73, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPLIN_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPORI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspOri_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPUNI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "NUMCON_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DETUNI_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDetUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPFEC_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPCLA_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPMOT_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspMot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOVESPCOM_"+sGXsfl_123_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCom_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtmovesp_level1itemContainer.AddRow(Gridtmovesp_level1itemRow);
   }

   public void readRow1N73( )
   {
      nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12373( ) ;
      edtMovEspLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPLIN_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMovEspOri_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPORI_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMovEspUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPUNI_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtNumCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "NUMCON_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDetUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DETUNI_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMovEspFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPFEC_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMovEspCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPCLA_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMovEspMot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPMOT_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMovEspCom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOVESPCOM_"+sGXsfl_123_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMovEspLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMovEspLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "MOVESPLIN_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMovEspLin_Internalname ;
         wbErr = true ;
         A641MovEspLin = (short)(0) ;
      }
      else
      {
         A641MovEspLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMovEspLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A643MovEspOri = GXutil.upper( httpContext.cgiGet( edtMovEspOri_Internalname)) ;
      n643MovEspOri = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMovEspUni_Internalname)), DecimalUtil.stringToDec("-999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMovEspUni_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "MOVESPUNI_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMovEspUni_Internalname ;
         wbErr = true ;
         A645MovEspUni = DecimalUtil.ZERO ;
         n645MovEspUni = false ;
      }
      else
      {
         A645MovEspUni = localUtil.ctond( httpContext.cgiGet( edtMovEspUni_Internalname)) ;
         n645MovEspUni = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtNumCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtNumCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "NUMCON_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCon_Internalname ;
         wbErr = true ;
         A647NumCon = 0 ;
         n647NumCon = false ;
      }
      else
      {
         A647NumCon = (int)(localUtil.ctol( httpContext.cgiGet( edtNumCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n647NumCon = false ;
      }
      A322DetUni = localUtil.ctond( httpContext.cgiGet( edtDetUni_Internalname)) ;
      n322DetUni = false ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtMovEspFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "MOVESPFEC_" + sGXsfl_123_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMovEspFec_Internalname ;
         wbErr = true ;
         A640MovEspFec = GXutil.nullDate() ;
         n640MovEspFec = false ;
      }
      else
      {
         A640MovEspFec = localUtil.ctod( httpContext.cgiGet( edtMovEspFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n640MovEspFec = false ;
      }
      A638MovEspCla = GXutil.upper( httpContext.cgiGet( edtMovEspCla_Internalname)) ;
      n638MovEspCla = false ;
      A642MovEspMot = httpContext.cgiGet( edtMovEspMot_Internalname) ;
      n642MovEspMot = false ;
      A639MovEspCom = GXutil.upper( httpContext.cgiGet( edtMovEspCom_Internalname)) ;
      n639MovEspCom = false ;
      GXCCtl = "Z641MovEspLin_" + sGXsfl_123_idx ;
      Z641MovEspLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z643MovEspOri_" + sGXsfl_123_idx ;
      Z643MovEspOri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z645MovEspUni_" + sGXsfl_123_idx ;
      Z645MovEspUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z640MovEspFec_" + sGXsfl_123_idx ;
      Z640MovEspFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z638MovEspCla_" + sGXsfl_123_idx ;
      Z638MovEspCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z642MovEspMot_" + sGXsfl_123_idx ;
      Z642MovEspMot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z639MovEspCom_" + sGXsfl_123_idx ;
      Z639MovEspCom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z647NumCon_" + sGXsfl_123_idx ;
      Z647NumCon = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_73_" + sGXsfl_123_idx ;
      nRcdDeleted_73 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_73_" + sGXsfl_123_idx ;
      nRcdExists_73 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_73_" + sGXsfl_123_idx ;
      nIsMod_73 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMovEspLin_Enabled = edtMovEspLin_Enabled ;
   }

   public void confirmValues1N0( )
   {
      nGXsfl_123_idx = 0 ;
      sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_12373( ) ;
      while ( nGXsfl_123_idx < nRC_GXsfl_123 )
      {
         nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
         sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12373( ) ;
         httpContext.changePostValue( "Z641MovEspLin_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z641MovEspLin_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z641MovEspLin_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z643MovEspOri_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z643MovEspOri_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z643MovEspOri_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z645MovEspUni_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z645MovEspUni_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z645MovEspUni_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z640MovEspFec_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z640MovEspFec_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z640MovEspFec_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z638MovEspCla_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z638MovEspCla_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z638MovEspCla_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z642MovEspMot_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z642MovEspMot_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z642MovEspMot_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z639MovEspCom_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z639MovEspCom_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z639MovEspCom_"+sGXsfl_123_idx) ;
         httpContext.changePostValue( "Z647NumCon_"+sGXsfl_123_idx, httpContext.cgiGet( "ZT_"+"Z647NumCon_"+sGXsfl_123_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z647NumCon_"+sGXsfl_123_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmovesp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z644MovEspULin", GXutil.ltrim( localUtil.ntoc( Z644MovEspULin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( Z739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z740PrdUltECC", GXutil.ltrim( localUtil.ntoc( Z740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( Z738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z700PrdDifCC", GXutil.ltrim( localUtil.ntoc( Z700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_123", GXutil.ltrim( localUtil.ntoc( nGXsfl_123_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tmovesp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMOVESP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MOVIMIENTOS ESPECIALES", "") ;
   }

   public void initializeNonKey1N29( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A644MovEspULin = (short)(0) ;
      n644MovEspULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A644MovEspULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A644MovEspULin), 3, 0));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A739PrdUltDCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
      A698PrdDetPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A729PrdRotRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
      A740PrdUltECC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
      A738PrdUltCCC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
      A706PrdExiCCP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
      A700PrdDifCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      Z718PrdNom = "" ;
      Z644MovEspULin = (short)(0) ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z738PrdUltCCC = (short)(0) ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z795PrvNum = 0 ;
   }

   public void initAll1N29( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1N29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1N73( )
   {
      A643MovEspOri = "" ;
      n643MovEspOri = false ;
      A645MovEspUni = DecimalUtil.ZERO ;
      n645MovEspUni = false ;
      A647NumCon = 0 ;
      n647NumCon = false ;
      A322DetUni = DecimalUtil.ZERO ;
      n322DetUni = false ;
      A640MovEspFec = GXutil.nullDate() ;
      n640MovEspFec = false ;
      A638MovEspCla = "" ;
      n638MovEspCla = false ;
      A642MovEspMot = "" ;
      n642MovEspMot = false ;
      A639MovEspCom = "" ;
      n639MovEspCom = false ;
      Z643MovEspOri = "" ;
      Z645MovEspUni = DecimalUtil.ZERO ;
      Z640MovEspFec = GXutil.nullDate() ;
      Z638MovEspCla = "" ;
      Z642MovEspMot = "" ;
      Z639MovEspCom = "" ;
      Z647NumCon = 0 ;
   }

   public void initAll1N73( )
   {
      A641MovEspLin = (short)(0) ;
      initializeNonKey1N73( ) ;
   }

   public void standaloneModalInsert1N73( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241502371", true, true);
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
      httpContext.AddJavascriptSource("tmovesp.js", "?20268241502371", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties73( )
   {
      edtMovEspLin_Enabled = defedtMovEspLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMovEspLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMovEspLin_Enabled), 5, 0), !bGXsfl_123_Refreshing);
   }

   public void startgridcontrol123( )
   {
      Gridtmovesp_level1itemContainer.AddObjectProperty("GridName", "Gridtmovesp_level1item");
      Gridtmovesp_level1itemContainer.AddObjectProperty("Header", subGridtmovesp_level1item_Header);
      Gridtmovesp_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtmovesp_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtmovesp_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A641MovEspLin, (byte)(3), (byte)(0), ".", "")));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A643MovEspOri));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspOri_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A645MovEspUni, (byte)(10), (byte)(2), ".", "")));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A647NumCon, (byte)(8), (byte)(0), ".", "")));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtNumCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A322DetUni, (byte)(9), (byte)(2), ".", "")));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDetUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", localUtil.format(A640MovEspFec, "99/99/99"));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A638MovEspCla));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A642MovEspMot));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspMot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtmovesp_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A639MovEspCom));
      Gridtmovesp_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMovEspCom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddColumnProperties(Gridtmovesp_level1itemColumn);
      Gridtmovesp_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtmovesp_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtmovesp_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtMovEspULin_Internalname = "MOVESPULIN" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtPrdUltDCC_Internalname = "PRDULTDCC" ;
      edtPrdDetPar_Internalname = "PRDDETPAR" ;
      edtPrdRotRea_Internalname = "PRDROTREA" ;
      edtPrdUltECC_Internalname = "PRDULTECC" ;
      edtPrdUltCCC_Internalname = "PRDULTCCC" ;
      edtPrdExiCCP_Internalname = "PRDEXICCP" ;
      edtPrdDifCC_Internalname = "PRDDIFCC" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtMovEspLin_Internalname = "MOVESPLIN" ;
      edtMovEspOri_Internalname = "MOVESPORI" ;
      edtMovEspUni_Internalname = "MOVESPUNI" ;
      edtNumCon_Internalname = "NUMCON" ;
      edtDetUni_Internalname = "DETUNI" ;
      edtMovEspFec_Internalname = "MOVESPFEC" ;
      edtMovEspCla_Internalname = "MOVESPCLA" ;
      edtMovEspMot_Internalname = "MOVESPMOT" ;
      edtMovEspCom_Internalname = "MOVESPCOM" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtmovesp_level1item_Internalname = "GRIDTMOVESP_LEVEL1ITEM" ;
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
      subGridtmovesp_level1item_Allowcollapsing = (byte)(0) ;
      subGridtmovesp_level1item_Allowselection = (byte)(0) ;
      subGridtmovesp_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MOVIMIENTOS ESPECIALES", "") );
      edtMovEspCom_Jsonclick = "" ;
      edtMovEspMot_Jsonclick = "" ;
      edtMovEspCla_Jsonclick = "" ;
      edtMovEspFec_Jsonclick = "" ;
      edtDetUni_Jsonclick = "" ;
      edtNumCon_Jsonclick = "" ;
      edtMovEspUni_Jsonclick = "" ;
      edtMovEspOri_Jsonclick = "" ;
      edtMovEspLin_Jsonclick = "" ;
      subGridtmovesp_level1item_Class = "Grid" ;
      subGridtmovesp_level1item_Backcolorstyle = (byte)(0) ;
      edtMovEspCom_Enabled = 1 ;
      edtMovEspMot_Enabled = 1 ;
      edtMovEspCla_Enabled = 1 ;
      edtMovEspFec_Enabled = 1 ;
      edtDetUni_Enabled = 0 ;
      edtNumCon_Enabled = 1 ;
      edtMovEspUni_Enabled = 1 ;
      edtMovEspOri_Enabled = 1 ;
      edtMovEspLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 1 ;
      edtPrdDifCC_Jsonclick = "" ;
      edtPrdDifCC_Enabled = 1 ;
      edtPrdExiCCP_Jsonclick = "" ;
      edtPrdExiCCP_Enabled = 1 ;
      edtPrdUltCCC_Jsonclick = "" ;
      edtPrdUltCCC_Enabled = 1 ;
      edtPrdUltECC_Jsonclick = "" ;
      edtPrdUltECC_Enabled = 1 ;
      edtPrdRotRea_Jsonclick = "" ;
      edtPrdRotRea_Enabled = 1 ;
      edtPrdDetPar_Jsonclick = "" ;
      edtPrdDetPar_Enabled = 1 ;
      edtPrdUltDCC_Jsonclick = "" ;
      edtPrdUltDCC_Enabled = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 1 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 1 ;
      edtMovEspULin_Jsonclick = "" ;
      edtMovEspULin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 1 ;
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

   public void gxnrgridtmovesp_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_12373( ) ;
      while ( nGXsfl_123_idx <= nRC_GXsfl_123 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1N73( ) ;
         standaloneModal1N73( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1N73( ) ;
         nGXsfl_123_idx = (int)(nGXsfl_123_idx+1) ;
         sGXsfl_123_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_123_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_12373( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtmovesp_level1itemContainer)) ;
      /* End function gxnrGridtmovesp_level1item_newrow */
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
      /* Using cursor T001N18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T001N18_A407EmprNom[0] ;
      n407EmprNom = T001N18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(16);
      GX_FocusControl = edtPrdNom_Internalname ;
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
      /* Using cursor T001N18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T001N18_A407EmprNom[0] ;
      n407EmprNom = T001N18_n407EmprNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A644MovEspULin", GXutil.ltrim( localUtil.ntoc( A644MovEspULin, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", GXutil.rtrim( A698PrdDetPar));
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z644MovEspULin", GXutil.ltrim( localUtil.ntoc( Z644MovEspULin, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( Z739PrdUltDCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z740PrdUltECC", GXutil.ltrim( localUtil.ntoc( Z740PrdUltECC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( Z738PrdUltCCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z700PrdDifCC", GXutil.ltrim( localUtil.ntoc( Z700PrdDifCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prvnum( )
   {
      n794PrvNom = false ;
      /* Using cursor T001N19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A794PrvNom = T001N19_A794PrvNom[0] ;
      n794PrvNom = T001N19_n794PrvNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Numcon( )
   {
      n719PrdNum = false ;
      n647NumCon = false ;
      n322DetUni = false ;
      /* Using cursor T001N100 */
      pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n647NumCon), Integer.valueOf(A647NumCon)});
      if ( (pr_default.getStatus(98) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DETCON", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "NUMCON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtNumCon_Internalname ;
      }
      A322DetUni = T001N100_A322DetUni[0] ;
      n322DetUni = T001N100_n322DetUni[0] ;
      pr_default.close(98);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A322DetUni", GXutil.ltrim( localUtil.ntoc( A322DetUni, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A644MovEspULin',fld:'MOVESPULIN',pic:'ZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A739PrdUltDCC',fld:'PRDULTDCC',pic:'ZZZZ9.99'},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A729PrdRotRea',fld:'PRDROTREA',pic:'ZZZZZ9.999'},{av:'A740PrdUltECC',fld:'PRDULTECC',pic:'ZZZZ9.99'},{av:'A738PrdUltCCC',fld:'PRDULTCCC',pic:'ZZZ9'},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A700PrdDifCC',fld:'PRDDIFCC',pic:'ZZZZ9.99'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z718PrdNom'},{av:'Z795PrvNum'},{av:'Z644MovEspULin'},{av:'Z704PrdExiAlm'},{av:'Z705PrdExiCC'},{av:'Z739PrdUltDCC'},{av:'Z698PrdDetPar'},{av:'Z729PrdRotRea'},{av:'Z740PrdUltECC'},{av:'Z738PrdUltCCC'},{av:'Z706PrdExiCCP'},{av:'Z700PrdDifCC'},{av:'Z707PrdFacCon'},{av:'Z407EmprNom'},{av:'Z794PrvNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''}]}");
      setEventMetadata("VALID_PRDDETPAR","{handler:'valid_Prddetpar',iparms:[]");
      setEventMetadata("VALID_PRDDETPAR",",oparms:[]}");
      setEventMetadata("VALID_MOVESPLIN","{handler:'valid_Movesplin',iparms:[]");
      setEventMetadata("VALID_MOVESPLIN",",oparms:[]}");
      setEventMetadata("VALID_MOVESPORI","{handler:'valid_Movespori',iparms:[]");
      setEventMetadata("VALID_MOVESPORI",",oparms:[]}");
      setEventMetadata("VALID_NUMCON","{handler:'valid_Numcon',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A647NumCon',fld:'NUMCON',pic:'ZZZZZZZ9'},{av:'A322DetUni',fld:'DETUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_NUMCON",",oparms:[{av:'A322DetUni',fld:'DETUNI',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_MOVESPCLA","{handler:'valid_Movespcla',iparms:[]");
      setEventMetadata("VALID_MOVESPCLA",",oparms:[]}");
      setEventMetadata("VALID_MOVESPCOM","{handler:'valid_Movespcom',iparms:[]");
      setEventMetadata("VALID_MOVESPCOM",",oparms:[]}");
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
      pr_default.close(98);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z643MovEspOri = "" ;
      Z645MovEspUni = DecimalUtil.ZERO ;
      Z640MovEspFec = GXutil.nullDate() ;
      Z638MovEspCla = "" ;
      Z642MovEspMot = "" ;
      Z639MovEspCom = "" ;
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
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A407EmprNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      A698PrdDetPar = "" ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtmovesp_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode73 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A643MovEspOri = "" ;
      A645MovEspUni = DecimalUtil.ZERO ;
      A322DetUni = DecimalUtil.ZERO ;
      A640MovEspFec = GXutil.nullDate() ;
      A638MovEspCla = "" ;
      A642MovEspMot = "" ;
      A639MovEspCom = "" ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      T001N9_A719PrdNum = new String[] {""} ;
      T001N9_n719PrdNum = new boolean[] {false} ;
      T001N9_A718PrdNom = new String[] {""} ;
      T001N9_A794PrvNom = new String[] {""} ;
      T001N9_n794PrvNom = new boolean[] {false} ;
      T001N9_A407EmprNom = new String[] {""} ;
      T001N9_n407EmprNom = new boolean[] {false} ;
      T001N9_A644MovEspULin = new short[1] ;
      T001N9_n644MovEspULin = new boolean[] {false} ;
      T001N9_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A698PrdDetPar = new String[] {""} ;
      T001N9_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A738PrdUltCCC = new short[1] ;
      T001N9_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N9_A396EmprCod = new String[] {""} ;
      T001N9_A795PrvNum = new int[1] ;
      T001N7_A407EmprNom = new String[] {""} ;
      T001N7_n407EmprNom = new boolean[] {false} ;
      T001N8_A794PrvNom = new String[] {""} ;
      T001N8_n794PrvNom = new boolean[] {false} ;
      T001N10_A407EmprNom = new String[] {""} ;
      T001N10_n407EmprNom = new boolean[] {false} ;
      T001N11_A794PrvNom = new String[] {""} ;
      T001N11_n794PrvNom = new boolean[] {false} ;
      T001N12_A396EmprCod = new String[] {""} ;
      T001N12_A719PrdNum = new String[] {""} ;
      T001N12_n719PrdNum = new boolean[] {false} ;
      T001N6_A719PrdNum = new String[] {""} ;
      T001N6_n719PrdNum = new boolean[] {false} ;
      T001N6_A718PrdNom = new String[] {""} ;
      T001N6_A644MovEspULin = new short[1] ;
      T001N6_n644MovEspULin = new boolean[] {false} ;
      T001N6_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A698PrdDetPar = new String[] {""} ;
      T001N6_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A738PrdUltCCC = new short[1] ;
      T001N6_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N6_A396EmprCod = new String[] {""} ;
      T001N6_A795PrvNum = new int[1] ;
      sMode29 = "" ;
      T001N13_A396EmprCod = new String[] {""} ;
      T001N13_A719PrdNum = new String[] {""} ;
      T001N13_n719PrdNum = new boolean[] {false} ;
      T001N14_A396EmprCod = new String[] {""} ;
      T001N14_A719PrdNum = new String[] {""} ;
      T001N14_n719PrdNum = new boolean[] {false} ;
      T001N5_A719PrdNum = new String[] {""} ;
      T001N5_n719PrdNum = new boolean[] {false} ;
      T001N5_A718PrdNom = new String[] {""} ;
      T001N5_A644MovEspULin = new short[1] ;
      T001N5_n644MovEspULin = new boolean[] {false} ;
      T001N5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A698PrdDetPar = new String[] {""} ;
      T001N5_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A738PrdUltCCC = new short[1] ;
      T001N5_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N5_A396EmprCod = new String[] {""} ;
      T001N5_A795PrvNum = new int[1] ;
      T001N18_A407EmprNom = new String[] {""} ;
      T001N18_n407EmprNom = new boolean[] {false} ;
      T001N19_A794PrvNom = new String[] {""} ;
      T001N19_n794PrvNom = new boolean[] {false} ;
      T001N20_A396EmprCod = new String[] {""} ;
      T001N20_A719PrdNum = new String[] {""} ;
      T001N20_n719PrdNum = new boolean[] {false} ;
      T001N20_A13217NormaID = new String[] {""} ;
      T001N21_A396EmprCod = new String[] {""} ;
      T001N21_A719PrdNum = new String[] {""} ;
      T001N21_n719PrdNum = new boolean[] {false} ;
      T001N21_A13586TheList = new String[] {""} ;
      T001N22_A396EmprCod = new String[] {""} ;
      T001N22_A5532Lb_numero = new int[1] ;
      T001N22_A5555Lb_opcion = new String[] {""} ;
      T001N22_A13460Lb_linCP = new short[1] ;
      T001N22_A13458Lb_TipCP = new String[] {""} ;
      T001N23_A396EmprCod = new String[] {""} ;
      T001N23_A13418AlbProID = new int[1] ;
      T001N23_A13442AlbProLine = new short[1] ;
      T001N24_A396EmprCod = new String[] {""} ;
      T001N24_A13324LDESID = new int[1] ;
      T001N24_A13333LDESNPeque = new String[] {""} ;
      T001N24_A13337LDESComb = new String[] {""} ;
      T001N24_A13339LDESFondo = new String[] {""} ;
      T001N24_A13342LDESLinea = new short[1] ;
      T001N25_A396EmprCod = new String[] {""} ;
      T001N25_A13312Lb_NLab = new int[1] ;
      T001N25_A13305Lb_IDVeces = new short[1] ;
      T001N25_A13306Lb_LinID = new short[1] ;
      T001N26_A396EmprCod = new String[] {""} ;
      T001N26_A12673LavMqId = new int[1] ;
      T001N26_A12692LavMqLnPq = new short[1] ;
      T001N26_A12681LavMqLn = new short[1] ;
      T001N27_A396EmprCod = new String[] {""} ;
      T001N27_A719PrdNum = new String[] {""} ;
      T001N27_n719PrdNum = new boolean[] {false} ;
      T001N27_A9713Tb1_Cod = new short[1] ;
      T001N28_A396EmprCod = new String[] {""} ;
      T001N28_A12236PrdNumD = new String[] {""} ;
      T001N28_A719PrdNum = new String[] {""} ;
      T001N28_n719PrdNum = new boolean[] {false} ;
      T001N29_A396EmprCod = new String[] {""} ;
      T001N29_A12225DocDisID = new long[1] ;
      T001N29_A12226LinDisID = new short[1] ;
      T001N30_A396EmprCod = new String[] {""} ;
      T001N30_A12225DocDisID = new long[1] ;
      T001N31_A396EmprCod = new String[] {""} ;
      T001N31_A12205OrdenCID = new long[1] ;
      T001N31_A12206OrdenCLnId = new short[1] ;
      T001N32_A396EmprCod = new String[] {""} ;
      T001N32_A719PrdNum = new String[] {""} ;
      T001N32_n719PrdNum = new boolean[] {false} ;
      T001N32_A11664LoteID = new String[] {""} ;
      T001N32_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001N33_A396EmprCod = new String[] {""} ;
      T001N33_A4850DevComCod = new int[1] ;
      T001N33_A719PrdNum = new String[] {""} ;
      T001N33_n719PrdNum = new boolean[] {false} ;
      T001N34_A396EmprCod = new String[] {""} ;
      T001N34_A252CliCod = new int[1] ;
      T001N34_A494ForSer = new String[] {""} ;
      T001N34_A482ForColNom = new String[] {""} ;
      T001N34_A483ForColNum = new int[1] ;
      T001N34_A831TipColCod = new byte[1] ;
      T001N34_A3571EnsCod = new String[] {""} ;
      T001N34_A3582EnsLin = new short[1] ;
      T001N35_A396EmprCod = new String[] {""} ;
      T001N35_A129BarCod = new int[1] ;
      T001N35_A132BarCodReo = new byte[1] ;
      T001N35_A130BarCodPar = new String[] {""} ;
      T001N35_A4075recestncol = new byte[1] ;
      T001N35_A4076recestnpro = new byte[1] ;
      T001N35_A4108recestlin = new short[1] ;
      T001N36_A396EmprCod = new String[] {""} ;
      T001N36_A4052EstNumFor = new int[1] ;
      T001N36_A4053EstNumCol = new byte[1] ;
      T001N36_A4090EstEspLin = new byte[1] ;
      T001N37_A396EmprCod = new String[] {""} ;
      T001N37_A4052EstNumFor = new int[1] ;
      T001N37_A4053EstNumCol = new byte[1] ;
      T001N37_A4084EstProLin = new byte[1] ;
      T001N38_A396EmprCod = new String[] {""} ;
      T001N38_A11644TransferId = new long[1] ;
      T001N38_A11653TransferLn = new int[1] ;
      T001N39_A396EmprCod = new String[] {""} ;
      T001N39_A11634TaesId = new String[] {""} ;
      T001N39_A11637TaesLn = new short[1] ;
      T001N39_A11641TaesLnP = new short[1] ;
      T001N40_A396EmprCod = new String[] {""} ;
      T001N40_A719PrdNum = new String[] {""} ;
      T001N40_n719PrdNum = new boolean[] {false} ;
      T001N40_A11329H_stklin = new long[1] ;
      T001N41_A396EmprCod = new String[] {""} ;
      T001N41_A11270Pot_num = new int[1] ;
      T001N41_A11271Pot_lin = new short[1] ;
      T001N42_A396EmprCod = new String[] {""} ;
      T001N42_A719PrdNum = new String[] {""} ;
      T001N42_n719PrdNum = new boolean[] {false} ;
      T001N42_A11199PrdNcasC = new String[] {""} ;
      T001N43_A396EmprCod = new String[] {""} ;
      T001N43_A719PrdNum = new String[] {""} ;
      T001N43_n719PrdNum = new boolean[] {false} ;
      T001N43_A11197CFraseR = new String[] {""} ;
      T001N44_A396EmprCod = new String[] {""} ;
      T001N44_A10243Jt_codigo = new short[1] ;
      T001N44_A10246Jt_ord = new short[1] ;
      T001N45_A396EmprCod = new String[] {""} ;
      T001N45_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T001N45_A10238Bny_lin = new short[1] ;
      T001N46_A396EmprCod = new String[] {""} ;
      T001N46_A129BarCod = new int[1] ;
      T001N46_A132BarCodReo = new byte[1] ;
      T001N46_A130BarCodPar = new String[] {""} ;
      T001N46_A758ProCod = new String[] {""} ;
      T001N46_A194BarOrdLin = new short[1] ;
      T001N46_A719PrdNum = new String[] {""} ;
      T001N46_n719PrdNum = new boolean[] {false} ;
      T001N47_A396EmprCod = new String[] {""} ;
      T001N47_A719PrdNum = new String[] {""} ;
      T001N47_n719PrdNum = new boolean[] {false} ;
      T001N47_A9735Cod_Rgo = new String[] {""} ;
      T001N48_A396EmprCod = new String[] {""} ;
      T001N48_A719PrdNum = new String[] {""} ;
      T001N48_n719PrdNum = new boolean[] {false} ;
      T001N48_A9711Ct_codigo = new short[1] ;
      T001N49_A396EmprCod = new String[] {""} ;
      T001N49_A9652OeNum = new long[1] ;
      T001N49_A9653OeHdr = new int[1] ;
      T001N49_A9654OeHdrr = new byte[1] ;
      T001N49_A9655OeHdrp = new String[] {""} ;
      T001N49_A9656OeLinC = new byte[1] ;
      T001N49_A9657OeComb = new String[] {""} ;
      T001N49_A9658Oefondo = new String[] {""} ;
      T001N49_A9659OeMolCil = new byte[1] ;
      T001N49_A9686OePasLin = new short[1] ;
      T001N49_A9694OePasPLi = new short[1] ;
      T001N50_A396EmprCod = new String[] {""} ;
      T001N50_A9652OeNum = new long[1] ;
      T001N50_A9653OeHdr = new int[1] ;
      T001N50_A9654OeHdrr = new byte[1] ;
      T001N50_A9655OeHdrp = new String[] {""} ;
      T001N50_A9656OeLinC = new byte[1] ;
      T001N50_A9657OeComb = new String[] {""} ;
      T001N50_A9658Oefondo = new String[] {""} ;
      T001N50_A9659OeMolCil = new byte[1] ;
      T001N50_A9677OeMolLin = new byte[1] ;
      T001N51_A396EmprCod = new String[] {""} ;
      T001N51_A9578Pas_Num = new int[1] ;
      T001N51_A719PrdNum = new String[] {""} ;
      T001N51_n719PrdNum = new boolean[] {false} ;
      T001N52_A396EmprCod = new String[] {""} ;
      T001N52_A719PrdNum = new String[] {""} ;
      T001N52_n719PrdNum = new boolean[] {false} ;
      T001N52_A8908CC_AlmCod = new byte[1] ;
      T001N53_A396EmprCod = new String[] {""} ;
      T001N53_A719PrdNum = new String[] {""} ;
      T001N53_n719PrdNum = new boolean[] {false} ;
      T001N53_A8661Almc_Ln = new int[1] ;
      T001N54_A396EmprCod = new String[] {""} ;
      T001N54_A719PrdNum = new String[] {""} ;
      T001N54_n719PrdNum = new boolean[] {false} ;
      T001N54_A8648Mat_PrdN = new String[] {""} ;
      T001N55_A396EmprCod = new String[] {""} ;
      T001N55_A8585Pet_cod = new long[1] ;
      T001N55_A719PrdNum = new String[] {""} ;
      T001N55_n719PrdNum = new boolean[] {false} ;
      T001N56_A396EmprCod = new String[] {""} ;
      T001N56_A719PrdNum = new String[] {""} ;
      T001N56_n719PrdNum = new boolean[] {false} ;
      T001N56_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T001N57_A396EmprCod = new String[] {""} ;
      T001N57_A719PrdNum = new String[] {""} ;
      T001N57_n719PrdNum = new boolean[] {false} ;
      T001N57_A8366PrdAnyo = new short[1] ;
      T001N57_A8360PrdProv = new int[1] ;
      T001N58_A396EmprCod = new String[] {""} ;
      T001N58_A252CliCod = new int[1] ;
      T001N58_A494ForSer = new String[] {""} ;
      T001N58_A482ForColNom = new String[] {""} ;
      T001N58_A483ForColNum = new int[1] ;
      T001N58_A831TipColCod = new byte[1] ;
      T001N58_A7797Sim_lin = new short[1] ;
      T001N59_A396EmprCod = new String[] {""} ;
      T001N59_A7163Vir_Codigo = new int[1] ;
      T001N59_A719PrdNum = new String[] {""} ;
      T001N59_n719PrdNum = new boolean[] {false} ;
      T001N60_A396EmprCod = new String[] {""} ;
      T001N60_A6310Lb_TaAuxC = new String[] {""} ;
      T001N60_A6313lb_TaAuxL = new short[1] ;
      T001N60_A6378Lb_TauxLP = new short[1] ;
      T001N61_A396EmprCod = new String[] {""} ;
      T001N61_A6290PreCoNum = new int[1] ;
      T001N61_A719PrdNum = new String[] {""} ;
      T001N61_n719PrdNum = new boolean[] {false} ;
      T001N62_A396EmprCod = new String[] {""} ;
      T001N62_A719PrdNum = new String[] {""} ;
      T001N62_n719PrdNum = new boolean[] {false} ;
      T001N62_A6158PrdPrv = new int[1] ;
      T001N63_A396EmprCod = new String[] {""} ;
      T001N63_A719PrdNum = new String[] {""} ;
      T001N63_n719PrdNum = new boolean[] {false} ;
      T001N63_A5973PrdSusNum = new String[] {""} ;
      T001N64_A396EmprCod = new String[] {""} ;
      T001N64_A5612Lb_CodGru = new String[] {""} ;
      T001N64_A5615Lb_LinGru = new short[1] ;
      T001N65_A396EmprCod = new String[] {""} ;
      T001N65_A5532Lb_numero = new int[1] ;
      T001N65_A5555Lb_opcion = new String[] {""} ;
      T001N65_A5560Lb_LineaPr = new short[1] ;
      T001N66_A396EmprCod = new String[] {""} ;
      T001N66_A5532Lb_numero = new int[1] ;
      T001N66_A5555Lb_opcion = new String[] {""} ;
      T001N66_A5557Lb_LineaC = new short[1] ;
      T001N67_A396EmprCod = new String[] {""} ;
      T001N67_A5145SobCod = new int[1] ;
      T001N67_A719PrdNum = new String[] {""} ;
      T001N67_n719PrdNum = new boolean[] {false} ;
      T001N68_A396EmprCod = new String[] {""} ;
      T001N68_A4744RecPreCod = new int[1] ;
      T001N68_A4762RecPreLin = new short[1] ;
      T001N68_A4763RecPreNli = new short[1] ;
      T001N69_A396EmprCod = new String[] {""} ;
      T001N69_A4492HreBarCod = new int[1] ;
      T001N69_A4493HreBarReo = new byte[1] ;
      T001N69_A4494HreBarPar = new String[] {""} ;
      T001N69_A4495HreNumCie = new byte[1] ;
      T001N69_A4545HreLinMaq = new short[1] ;
      T001N69_A4550HreLinPro = new byte[1] ;
      T001N69_A4557HreRecLin = new short[1] ;
      T001N70_A396EmprCod = new String[] {""} ;
      T001N70_A4492HreBarCod = new int[1] ;
      T001N70_A4493HreBarReo = new byte[1] ;
      T001N70_A4494HreBarPar = new String[] {""} ;
      T001N70_A4495HreNumCie = new byte[1] ;
      T001N70_A4508HreLinMAL = new short[1] ;
      T001N70_A4509HreNumAny = new byte[1] ;
      T001N70_A719PrdNum = new String[] {""} ;
      T001N70_n719PrdNum = new boolean[] {false} ;
      T001N71_A396EmprCod = new String[] {""} ;
      T001N71_A252CliCod = new int[1] ;
      T001N71_A4415EstCol = new String[] {""} ;
      T001N71_A4416EstColLin = new short[1] ;
      T001N72_A396EmprCod = new String[] {""} ;
      T001N72_A129BarCod = new int[1] ;
      T001N72_A132BarCodReo = new byte[1] ;
      T001N72_A130BarCodPar = new String[] {""} ;
      T001N72_A2524DisComLin = new byte[1] ;
      T001N72_A1056DisComCod = new String[] {""} ;
      T001N72_A1032FonCod = new String[] {""} ;
      T001N72_A2124RecMolCod = new byte[1] ;
      T001N72_A2672RecPasLin = new short[1] ;
      T001N72_A2675RecPasPLi = new short[1] ;
      T001N73_A396EmprCod = new String[] {""} ;
      T001N73_A129BarCod = new int[1] ;
      T001N73_A132BarCodReo = new byte[1] ;
      T001N73_A130BarCodPar = new String[] {""} ;
      T001N73_A2524DisComLin = new byte[1] ;
      T001N73_A1056DisComCod = new String[] {""} ;
      T001N73_A1032FonCod = new String[] {""} ;
      T001N73_A2124RecMolCod = new byte[1] ;
      T001N73_A2126RecMolLin = new byte[1] ;
      T001N74_A396EmprCod = new String[] {""} ;
      T001N74_A2107PasCod = new String[] {""} ;
      T001N74_A719PrdNum = new String[] {""} ;
      T001N74_n719PrdNum = new boolean[] {false} ;
      T001N75_A396EmprCod = new String[] {""} ;
      T001N75_A2637HisEstHRu = new int[1] ;
      T001N75_A2636HisEstHRe = new byte[1] ;
      T001N75_A2635HisEstHPa = new String[] {""} ;
      T001N75_A2638HisEstLCo = new byte[1] ;
      T001N75_A2630HisEstCom = new String[] {""} ;
      T001N75_A2634HisEstFon = new String[] {""} ;
      T001N75_A719PrdNum = new String[] {""} ;
      T001N75_n719PrdNum = new boolean[] {false} ;
      T001N76_A396EmprCod = new String[] {""} ;
      T001N76_A252CliCod = new int[1] ;
      T001N76_A2141SerEst = new String[] {""} ;
      T001N76_A1013DibCli = new String[] {""} ;
      T001N76_A1014DibInt = new int[1] ;
      T001N76_A2074ColCom = new String[] {""} ;
      T001N76_A2078ColFon = new String[] {""} ;
      T001N76_A2098MolCod = new byte[1] ;
      T001N76_A2535ForPrdLin = new short[1] ;
      T001N77_A396EmprCod = new String[] {""} ;
      T001N77_A719PrdNum = new String[] {""} ;
      T001N77_n719PrdNum = new boolean[] {false} ;
      T001N77_A3342CCStkLin = new long[1] ;
      T001N78_A396EmprCod = new String[] {""} ;
      T001N78_A252CliCod = new int[1] ;
      T001N78_A2891HMaForSer = new String[] {""} ;
      T001N78_A2892HMaForCNom = new String[] {""} ;
      T001N78_A2893HMaForCNum = new int[1] ;
      T001N78_A2894HMaTipCCod = new byte[1] ;
      T001N78_A2895HMaForNumC = new int[1] ;
      T001N78_A2897HMaColLin = new short[1] ;
      T001N78_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001N78_A2907HmaLin = new short[1] ;
      T001N79_A396EmprCod = new String[] {""} ;
      T001N79_A129BarCod = new int[1] ;
      T001N79_A132BarCodReo = new byte[1] ;
      T001N79_A130BarCodPar = new String[] {""} ;
      T001N79_A2808RecLinMAL = new short[1] ;
      T001N79_A1377RecNumAny = new byte[1] ;
      T001N79_A719PrdNum = new String[] {""} ;
      T001N79_n719PrdNum = new boolean[] {false} ;
      T001N80_A396EmprCod = new String[] {""} ;
      T001N80_A129BarCod = new int[1] ;
      T001N80_A132BarCodReo = new byte[1] ;
      T001N80_A130BarCodPar = new String[] {""} ;
      T001N80_A2804RecLinMaq = new short[1] ;
      T001N80_A1273RecLinPro = new byte[1] ;
      T001N80_A811RecLin = new short[1] ;
      T001N81_A396EmprCod = new String[] {""} ;
      T001N81_A129BarCod = new int[1] ;
      T001N81_A132BarCodReo = new byte[1] ;
      T001N81_A130BarCodPar = new String[] {""} ;
      T001N81_A2494BarDosPro = new String[] {""} ;
      T001N81_A719PrdNum = new String[] {""} ;
      T001N81_n719PrdNum = new boolean[] {false} ;
      T001N82_A396EmprCod = new String[] {""} ;
      T001N82_A1314EnsLabCod = new int[1] ;
      T001N82_A1317EnsLabLin = new short[1] ;
      T001N83_A396EmprCod = new String[] {""} ;
      T001N83_A910Workstat = new String[] {""} ;
      T001N83_A887EscMLin = new int[1] ;
      T001N84_A396EmprCod = new String[] {""} ;
      T001N84_A859CumCodCont = new int[1] ;
      T001N84_A719PrdNum = new String[] {""} ;
      T001N84_n719PrdNum = new boolean[] {false} ;
      T001N85_A396EmprCod = new String[] {""} ;
      T001N85_A719PrdNum = new String[] {""} ;
      T001N85_n719PrdNum = new boolean[] {false} ;
      T001N85_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001N86_A396EmprCod = new String[] {""} ;
      T001N86_A486ForNumCol = new int[1] ;
      T001N86_A715PrdLin = new short[1] ;
      T001N87_A396EmprCod = new String[] {""} ;
      T001N87_A719PrdNum = new String[] {""} ;
      T001N87_n719PrdNum = new boolean[] {false} ;
      T001N87_A681PrdAny = new short[1] ;
      T001N88_A396EmprCod = new String[] {""} ;
      T001N88_A719PrdNum = new String[] {""} ;
      T001N88_n719PrdNum = new boolean[] {false} ;
      T001N88_A688PrdComCod = new String[] {""} ;
      T001N89_A396EmprCod = new String[] {""} ;
      T001N89_A719PrdNum = new String[] {""} ;
      T001N89_n719PrdNum = new boolean[] {false} ;
      T001N89_A680PrdAltNum = new String[] {""} ;
      T001N90_A396EmprCod = new String[] {""} ;
      T001N90_A658PedCod = new int[1] ;
      T001N90_A719PrdNum = new String[] {""} ;
      T001N90_n719PrdNum = new boolean[] {false} ;
      T001N91_A396EmprCod = new String[] {""} ;
      T001N91_A486ForNumCol = new int[1] ;
      T001N91_A309ColLin = new short[1] ;
      T001N92_A396EmprCod = new String[] {""} ;
      T001N92_A719PrdNum = new String[] {""} ;
      T001N92_n719PrdNum = new boolean[] {false} ;
      T001N92_A647NumCon = new int[1] ;
      T001N92_n647NumCon = new boolean[] {false} ;
      T001N93_A396EmprCod = new String[] {""} ;
      T001N93_A719PrdNum = new String[] {""} ;
      T001N93_n719PrdNum = new boolean[] {false} ;
      Z322DetUni = DecimalUtil.ZERO ;
      T001N94_A641MovEspLin = new short[1] ;
      T001N94_A643MovEspOri = new String[] {""} ;
      T001N94_n643MovEspOri = new boolean[] {false} ;
      T001N94_A645MovEspUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N94_n645MovEspUni = new boolean[] {false} ;
      T001N94_A322DetUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N94_n322DetUni = new boolean[] {false} ;
      T001N94_A640MovEspFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001N94_n640MovEspFec = new boolean[] {false} ;
      T001N94_A638MovEspCla = new String[] {""} ;
      T001N94_n638MovEspCla = new boolean[] {false} ;
      T001N94_A642MovEspMot = new String[] {""} ;
      T001N94_n642MovEspMot = new boolean[] {false} ;
      T001N94_A639MovEspCom = new String[] {""} ;
      T001N94_n639MovEspCom = new boolean[] {false} ;
      T001N94_A396EmprCod = new String[] {""} ;
      T001N94_A719PrdNum = new String[] {""} ;
      T001N94_n719PrdNum = new boolean[] {false} ;
      T001N94_A647NumCon = new int[1] ;
      T001N94_n647NumCon = new boolean[] {false} ;
      T001N4_A322DetUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N4_n322DetUni = new boolean[] {false} ;
      T001N95_A322DetUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N95_n322DetUni = new boolean[] {false} ;
      T001N96_A396EmprCod = new String[] {""} ;
      T001N96_A719PrdNum = new String[] {""} ;
      T001N96_n719PrdNum = new boolean[] {false} ;
      T001N96_A641MovEspLin = new short[1] ;
      T001N3_A641MovEspLin = new short[1] ;
      T001N3_A643MovEspOri = new String[] {""} ;
      T001N3_n643MovEspOri = new boolean[] {false} ;
      T001N3_A645MovEspUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N3_n645MovEspUni = new boolean[] {false} ;
      T001N3_A640MovEspFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001N3_n640MovEspFec = new boolean[] {false} ;
      T001N3_A638MovEspCla = new String[] {""} ;
      T001N3_n638MovEspCla = new boolean[] {false} ;
      T001N3_A642MovEspMot = new String[] {""} ;
      T001N3_n642MovEspMot = new boolean[] {false} ;
      T001N3_A639MovEspCom = new String[] {""} ;
      T001N3_n639MovEspCom = new boolean[] {false} ;
      T001N3_A396EmprCod = new String[] {""} ;
      T001N3_A719PrdNum = new String[] {""} ;
      T001N3_n719PrdNum = new boolean[] {false} ;
      T001N3_A647NumCon = new int[1] ;
      T001N3_n647NumCon = new boolean[] {false} ;
      T001N2_A641MovEspLin = new short[1] ;
      T001N2_A643MovEspOri = new String[] {""} ;
      T001N2_n643MovEspOri = new boolean[] {false} ;
      T001N2_A645MovEspUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N2_n645MovEspUni = new boolean[] {false} ;
      T001N2_A640MovEspFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001N2_n640MovEspFec = new boolean[] {false} ;
      T001N2_A638MovEspCla = new String[] {""} ;
      T001N2_n638MovEspCla = new boolean[] {false} ;
      T001N2_A642MovEspMot = new String[] {""} ;
      T001N2_n642MovEspMot = new boolean[] {false} ;
      T001N2_A639MovEspCom = new String[] {""} ;
      T001N2_n639MovEspCom = new boolean[] {false} ;
      T001N2_A396EmprCod = new String[] {""} ;
      T001N2_A719PrdNum = new String[] {""} ;
      T001N2_n719PrdNum = new boolean[] {false} ;
      T001N2_A647NumCon = new int[1] ;
      T001N2_n647NumCon = new boolean[] {false} ;
      T001N100_A322DetUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T001N100_n322DetUni = new boolean[] {false} ;
      T001N101_A396EmprCod = new String[] {""} ;
      T001N101_A719PrdNum = new String[] {""} ;
      T001N101_n719PrdNum = new boolean[] {false} ;
      T001N101_A641MovEspLin = new short[1] ;
      Gridtmovesp_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtmovesp_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtmovesp_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ718PrdNom = "" ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ739PrdUltDCC = DecimalUtil.ZERO ;
      ZZ698PrdDetPar = "" ;
      ZZ729PrdRotRea = DecimalUtil.ZERO ;
      ZZ740PrdUltECC = DecimalUtil.ZERO ;
      ZZ706PrdExiCCP = DecimalUtil.ZERO ;
      ZZ700PrdDifCC = DecimalUtil.ZERO ;
      ZZ707PrdFacCon = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ794PrvNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmovesp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmovesp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmovesp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmovesp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmovesp__default(),
         new Object[] {
             new Object[] {
            T001N2_A641MovEspLin, T001N2_A643MovEspOri, T001N2_n643MovEspOri, T001N2_A645MovEspUni, T001N2_n645MovEspUni, T001N2_A640MovEspFec, T001N2_n640MovEspFec, T001N2_A638MovEspCla, T001N2_n638MovEspCla, T001N2_A642MovEspMot,
            T001N2_n642MovEspMot, T001N2_A639MovEspCom, T001N2_n639MovEspCom, T001N2_A396EmprCod, T001N2_A719PrdNum, T001N2_A647NumCon, T001N2_n647NumCon
            }
            , new Object[] {
            T001N3_A641MovEspLin, T001N3_A643MovEspOri, T001N3_n643MovEspOri, T001N3_A645MovEspUni, T001N3_n645MovEspUni, T001N3_A640MovEspFec, T001N3_n640MovEspFec, T001N3_A638MovEspCla, T001N3_n638MovEspCla, T001N3_A642MovEspMot,
            T001N3_n642MovEspMot, T001N3_A639MovEspCom, T001N3_n639MovEspCom, T001N3_A396EmprCod, T001N3_A719PrdNum, T001N3_A647NumCon, T001N3_n647NumCon
            }
            , new Object[] {
            T001N4_A322DetUni, T001N4_n322DetUni
            }
            , new Object[] {
            T001N5_A719PrdNum, T001N5_A718PrdNom, T001N5_A644MovEspULin, T001N5_n644MovEspULin, T001N5_A704PrdExiAlm, T001N5_A705PrdExiCC, T001N5_A739PrdUltDCC, T001N5_A698PrdDetPar, T001N5_A729PrdRotRea, T001N5_A740PrdUltECC,
            T001N5_A738PrdUltCCC, T001N5_A706PrdExiCCP, T001N5_A700PrdDifCC, T001N5_A707PrdFacCon, T001N5_A396EmprCod, T001N5_A795PrvNum
            }
            , new Object[] {
            T001N6_A719PrdNum, T001N6_A718PrdNom, T001N6_A644MovEspULin, T001N6_n644MovEspULin, T001N6_A704PrdExiAlm, T001N6_A705PrdExiCC, T001N6_A739PrdUltDCC, T001N6_A698PrdDetPar, T001N6_A729PrdRotRea, T001N6_A740PrdUltECC,
            T001N6_A738PrdUltCCC, T001N6_A706PrdExiCCP, T001N6_A700PrdDifCC, T001N6_A707PrdFacCon, T001N6_A396EmprCod, T001N6_A795PrvNum
            }
            , new Object[] {
            T001N7_A407EmprNom, T001N7_n407EmprNom
            }
            , new Object[] {
            T001N8_A794PrvNom, T001N8_n794PrvNom
            }
            , new Object[] {
            T001N9_A719PrdNum, T001N9_A718PrdNom, T001N9_A794PrvNom, T001N9_n794PrvNom, T001N9_A407EmprNom, T001N9_n407EmprNom, T001N9_A644MovEspULin, T001N9_n644MovEspULin, T001N9_A704PrdExiAlm, T001N9_A705PrdExiCC,
            T001N9_A739PrdUltDCC, T001N9_A698PrdDetPar, T001N9_A729PrdRotRea, T001N9_A740PrdUltECC, T001N9_A738PrdUltCCC, T001N9_A706PrdExiCCP, T001N9_A700PrdDifCC, T001N9_A707PrdFacCon, T001N9_A396EmprCod, T001N9_A795PrvNum
            }
            , new Object[] {
            T001N10_A407EmprNom, T001N10_n407EmprNom
            }
            , new Object[] {
            T001N11_A794PrvNom, T001N11_n794PrvNom
            }
            , new Object[] {
            T001N12_A396EmprCod, T001N12_A719PrdNum
            }
            , new Object[] {
            T001N13_A396EmprCod, T001N13_A719PrdNum
            }
            , new Object[] {
            T001N14_A396EmprCod, T001N14_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001N18_A407EmprNom, T001N18_n407EmprNom
            }
            , new Object[] {
            T001N19_A794PrvNom, T001N19_n794PrvNom
            }
            , new Object[] {
            T001N20_A396EmprCod, T001N20_A719PrdNum, T001N20_A13217NormaID
            }
            , new Object[] {
            T001N21_A396EmprCod, T001N21_A719PrdNum, T001N21_A13586TheList
            }
            , new Object[] {
            T001N22_A396EmprCod, T001N22_A5532Lb_numero, T001N22_A5555Lb_opcion, T001N22_A13460Lb_linCP, T001N22_A13458Lb_TipCP
            }
            , new Object[] {
            T001N23_A396EmprCod, T001N23_A13418AlbProID, T001N23_A13442AlbProLine
            }
            , new Object[] {
            T001N24_A396EmprCod, T001N24_A13324LDESID, T001N24_A13333LDESNPeque, T001N24_A13337LDESComb, T001N24_A13339LDESFondo, T001N24_A13342LDESLinea
            }
            , new Object[] {
            T001N25_A396EmprCod, T001N25_A13312Lb_NLab, T001N25_A13305Lb_IDVeces, T001N25_A13306Lb_LinID
            }
            , new Object[] {
            T001N26_A396EmprCod, T001N26_A12673LavMqId, T001N26_A12692LavMqLnPq, T001N26_A12681LavMqLn
            }
            , new Object[] {
            T001N27_A396EmprCod, T001N27_A719PrdNum, T001N27_A9713Tb1_Cod
            }
            , new Object[] {
            T001N28_A396EmprCod, T001N28_A12236PrdNumD, T001N28_A719PrdNum
            }
            , new Object[] {
            T001N29_A396EmprCod, T001N29_A12225DocDisID, T001N29_A12226LinDisID
            }
            , new Object[] {
            T001N30_A396EmprCod, T001N30_A12225DocDisID
            }
            , new Object[] {
            T001N31_A396EmprCod, T001N31_A12205OrdenCID, T001N31_A12206OrdenCLnId
            }
            , new Object[] {
            T001N32_A396EmprCod, T001N32_A719PrdNum, T001N32_A11664LoteID, T001N32_A11665LoteFec
            }
            , new Object[] {
            T001N33_A396EmprCod, T001N33_A4850DevComCod, T001N33_A719PrdNum
            }
            , new Object[] {
            T001N34_A396EmprCod, T001N34_A252CliCod, T001N34_A494ForSer, T001N34_A482ForColNom, T001N34_A483ForColNum, T001N34_A831TipColCod, T001N34_A3571EnsCod, T001N34_A3582EnsLin
            }
            , new Object[] {
            T001N35_A396EmprCod, T001N35_A129BarCod, T001N35_A132BarCodReo, T001N35_A130BarCodPar, T001N35_A4075recestncol, T001N35_A4076recestnpro, T001N35_A4108recestlin
            }
            , new Object[] {
            T001N36_A396EmprCod, T001N36_A4052EstNumFor, T001N36_A4053EstNumCol, T001N36_A4090EstEspLin
            }
            , new Object[] {
            T001N37_A396EmprCod, T001N37_A4052EstNumFor, T001N37_A4053EstNumCol, T001N37_A4084EstProLin
            }
            , new Object[] {
            T001N38_A396EmprCod, T001N38_A11644TransferId, T001N38_A11653TransferLn
            }
            , new Object[] {
            T001N39_A396EmprCod, T001N39_A11634TaesId, T001N39_A11637TaesLn, T001N39_A11641TaesLnP
            }
            , new Object[] {
            T001N40_A396EmprCod, T001N40_A719PrdNum, T001N40_A11329H_stklin
            }
            , new Object[] {
            T001N41_A396EmprCod, T001N41_A11270Pot_num, T001N41_A11271Pot_lin
            }
            , new Object[] {
            T001N42_A396EmprCod, T001N42_A719PrdNum, T001N42_A11199PrdNcasC
            }
            , new Object[] {
            T001N43_A396EmprCod, T001N43_A719PrdNum, T001N43_A11197CFraseR
            }
            , new Object[] {
            T001N44_A396EmprCod, T001N44_A10243Jt_codigo, T001N44_A10246Jt_ord
            }
            , new Object[] {
            T001N45_A396EmprCod, T001N45_A10236Bny_dia, T001N45_A10238Bny_lin
            }
            , new Object[] {
            T001N46_A396EmprCod, T001N46_A129BarCod, T001N46_A132BarCodReo, T001N46_A130BarCodPar, T001N46_A758ProCod, T001N46_A194BarOrdLin, T001N46_A719PrdNum
            }
            , new Object[] {
            T001N47_A396EmprCod, T001N47_A719PrdNum, T001N47_A9735Cod_Rgo
            }
            , new Object[] {
            T001N48_A396EmprCod, T001N48_A719PrdNum, T001N48_A9711Ct_codigo
            }
            , new Object[] {
            T001N49_A396EmprCod, T001N49_A9652OeNum, T001N49_A9653OeHdr, T001N49_A9654OeHdrr, T001N49_A9655OeHdrp, T001N49_A9656OeLinC, T001N49_A9657OeComb, T001N49_A9658Oefondo, T001N49_A9659OeMolCil, T001N49_A9686OePasLin,
            T001N49_A9694OePasPLi
            }
            , new Object[] {
            T001N50_A396EmprCod, T001N50_A9652OeNum, T001N50_A9653OeHdr, T001N50_A9654OeHdrr, T001N50_A9655OeHdrp, T001N50_A9656OeLinC, T001N50_A9657OeComb, T001N50_A9658Oefondo, T001N50_A9659OeMolCil, T001N50_A9677OeMolLin
            }
            , new Object[] {
            T001N51_A396EmprCod, T001N51_A9578Pas_Num, T001N51_A719PrdNum
            }
            , new Object[] {
            T001N52_A396EmprCod, T001N52_A719PrdNum, T001N52_A8908CC_AlmCod
            }
            , new Object[] {
            T001N53_A396EmprCod, T001N53_A719PrdNum, T001N53_A8661Almc_Ln
            }
            , new Object[] {
            T001N54_A396EmprCod, T001N54_A719PrdNum, T001N54_A8648Mat_PrdN
            }
            , new Object[] {
            T001N55_A396EmprCod, T001N55_A8585Pet_cod, T001N55_A719PrdNum
            }
            , new Object[] {
            T001N56_A396EmprCod, T001N56_A719PrdNum, T001N56_A8577RecFecHr
            }
            , new Object[] {
            T001N57_A396EmprCod, T001N57_A719PrdNum, T001N57_A8366PrdAnyo, T001N57_A8360PrdProv
            }
            , new Object[] {
            T001N58_A396EmprCod, T001N58_A252CliCod, T001N58_A494ForSer, T001N58_A482ForColNom, T001N58_A483ForColNum, T001N58_A831TipColCod, T001N58_A7797Sim_lin
            }
            , new Object[] {
            T001N59_A396EmprCod, T001N59_A7163Vir_Codigo, T001N59_A719PrdNum
            }
            , new Object[] {
            T001N60_A396EmprCod, T001N60_A6310Lb_TaAuxC, T001N60_A6313lb_TaAuxL, T001N60_A6378Lb_TauxLP
            }
            , new Object[] {
            T001N61_A396EmprCod, T001N61_A6290PreCoNum, T001N61_A719PrdNum
            }
            , new Object[] {
            T001N62_A396EmprCod, T001N62_A719PrdNum, T001N62_A6158PrdPrv
            }
            , new Object[] {
            T001N63_A396EmprCod, T001N63_A719PrdNum, T001N63_A5973PrdSusNum
            }
            , new Object[] {
            T001N64_A396EmprCod, T001N64_A5612Lb_CodGru, T001N64_A5615Lb_LinGru
            }
            , new Object[] {
            T001N65_A396EmprCod, T001N65_A5532Lb_numero, T001N65_A5555Lb_opcion, T001N65_A5560Lb_LineaPr
            }
            , new Object[] {
            T001N66_A396EmprCod, T001N66_A5532Lb_numero, T001N66_A5555Lb_opcion, T001N66_A5557Lb_LineaC
            }
            , new Object[] {
            T001N67_A396EmprCod, T001N67_A5145SobCod, T001N67_A719PrdNum
            }
            , new Object[] {
            T001N68_A396EmprCod, T001N68_A4744RecPreCod, T001N68_A4762RecPreLin, T001N68_A4763RecPreNli
            }
            , new Object[] {
            T001N69_A396EmprCod, T001N69_A4492HreBarCod, T001N69_A4493HreBarReo, T001N69_A4494HreBarPar, T001N69_A4495HreNumCie, T001N69_A4545HreLinMaq, T001N69_A4550HreLinPro, T001N69_A4557HreRecLin
            }
            , new Object[] {
            T001N70_A396EmprCod, T001N70_A4492HreBarCod, T001N70_A4493HreBarReo, T001N70_A4494HreBarPar, T001N70_A4495HreNumCie, T001N70_A4508HreLinMAL, T001N70_A4509HreNumAny, T001N70_A719PrdNum
            }
            , new Object[] {
            T001N71_A396EmprCod, T001N71_A252CliCod, T001N71_A4415EstCol, T001N71_A4416EstColLin
            }
            , new Object[] {
            T001N72_A396EmprCod, T001N72_A129BarCod, T001N72_A132BarCodReo, T001N72_A130BarCodPar, T001N72_A2524DisComLin, T001N72_A1056DisComCod, T001N72_A1032FonCod, T001N72_A2124RecMolCod, T001N72_A2672RecPasLin, T001N72_A2675RecPasPLi
            }
            , new Object[] {
            T001N73_A396EmprCod, T001N73_A129BarCod, T001N73_A132BarCodReo, T001N73_A130BarCodPar, T001N73_A2524DisComLin, T001N73_A1056DisComCod, T001N73_A1032FonCod, T001N73_A2124RecMolCod, T001N73_A2126RecMolLin
            }
            , new Object[] {
            T001N74_A396EmprCod, T001N74_A2107PasCod, T001N74_A719PrdNum
            }
            , new Object[] {
            T001N75_A396EmprCod, T001N75_A2637HisEstHRu, T001N75_A2636HisEstHRe, T001N75_A2635HisEstHPa, T001N75_A2638HisEstLCo, T001N75_A2630HisEstCom, T001N75_A2634HisEstFon, T001N75_A719PrdNum
            }
            , new Object[] {
            T001N76_A396EmprCod, T001N76_A252CliCod, T001N76_A2141SerEst, T001N76_A1013DibCli, T001N76_A1014DibInt, T001N76_A2074ColCom, T001N76_A2078ColFon, T001N76_A2098MolCod, T001N76_A2535ForPrdLin
            }
            , new Object[] {
            T001N77_A396EmprCod, T001N77_A719PrdNum, T001N77_A3342CCStkLin
            }
            , new Object[] {
            T001N78_A396EmprCod, T001N78_A252CliCod, T001N78_A2891HMaForSer, T001N78_A2892HMaForCNom, T001N78_A2893HMaForCNum, T001N78_A2894HMaTipCCod, T001N78_A2895HMaForNumC, T001N78_A2897HMaColLin, T001N78_A2896HMaFec, T001N78_A2907HmaLin
            }
            , new Object[] {
            T001N79_A396EmprCod, T001N79_A129BarCod, T001N79_A132BarCodReo, T001N79_A130BarCodPar, T001N79_A2808RecLinMAL, T001N79_A1377RecNumAny, T001N79_A719PrdNum
            }
            , new Object[] {
            T001N80_A396EmprCod, T001N80_A129BarCod, T001N80_A132BarCodReo, T001N80_A130BarCodPar, T001N80_A2804RecLinMaq, T001N80_A1273RecLinPro, T001N80_A811RecLin
            }
            , new Object[] {
            T001N81_A396EmprCod, T001N81_A129BarCod, T001N81_A132BarCodReo, T001N81_A130BarCodPar, T001N81_A2494BarDosPro, T001N81_A719PrdNum
            }
            , new Object[] {
            T001N82_A396EmprCod, T001N82_A1314EnsLabCod, T001N82_A1317EnsLabLin
            }
            , new Object[] {
            T001N83_A396EmprCod, T001N83_A910Workstat, T001N83_A887EscMLin
            }
            , new Object[] {
            T001N84_A396EmprCod, T001N84_A859CumCodCont, T001N84_A719PrdNum
            }
            , new Object[] {
            T001N85_A396EmprCod, T001N85_A719PrdNum, T001N85_A810RecFec
            }
            , new Object[] {
            T001N86_A396EmprCod, T001N86_A486ForNumCol, T001N86_A715PrdLin
            }
            , new Object[] {
            T001N87_A396EmprCod, T001N87_A719PrdNum, T001N87_A681PrdAny
            }
            , new Object[] {
            T001N88_A396EmprCod, T001N88_A719PrdNum, T001N88_A688PrdComCod
            }
            , new Object[] {
            T001N89_A396EmprCod, T001N89_A719PrdNum, T001N89_A680PrdAltNum
            }
            , new Object[] {
            T001N90_A396EmprCod, T001N90_A658PedCod, T001N90_A719PrdNum
            }
            , new Object[] {
            T001N91_A396EmprCod, T001N91_A486ForNumCol, T001N91_A309ColLin
            }
            , new Object[] {
            T001N92_A396EmprCod, T001N92_A719PrdNum, T001N92_A647NumCon
            }
            , new Object[] {
            T001N93_A396EmprCod, T001N93_A719PrdNum
            }
            , new Object[] {
            T001N94_A641MovEspLin, T001N94_A643MovEspOri, T001N94_n643MovEspOri, T001N94_A645MovEspUni, T001N94_n645MovEspUni, T001N94_A322DetUni, T001N94_n322DetUni, T001N94_A640MovEspFec, T001N94_n640MovEspFec, T001N94_A638MovEspCla,
            T001N94_n638MovEspCla, T001N94_A642MovEspMot, T001N94_n642MovEspMot, T001N94_A639MovEspCom, T001N94_n639MovEspCom, T001N94_A396EmprCod, T001N94_A719PrdNum, T001N94_A647NumCon, T001N94_n647NumCon
            }
            , new Object[] {
            T001N95_A322DetUni, T001N95_n322DetUni
            }
            , new Object[] {
            T001N96_A396EmprCod, T001N96_A719PrdNum, T001N96_A641MovEspLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001N100_A322DetUni, T001N100_n322DetUni
            }
            , new Object[] {
            T001N101_A396EmprCod, T001N101_A719PrdNum, T001N101_A641MovEspLin
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridtmovesp_level1item_Backcolorstyle ;
   private byte subGridtmovesp_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtmovesp_level1item_Allowselection ;
   private byte subGridtmovesp_level1item_Allowhovering ;
   private byte subGridtmovesp_level1item_Allowcollapsing ;
   private byte subGridtmovesp_level1item_Collapsed ;
   private short Z644MovEspULin ;
   private short Z738PrdUltCCC ;
   private short Z641MovEspLin ;
   private short nRcdDeleted_73 ;
   private short nRcdExists_73 ;
   private short nIsMod_73 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A644MovEspULin ;
   private short A738PrdUltCCC ;
   private short nBlankRcdCount73 ;
   private short RcdFound73 ;
   private short nBlankRcdUsr73 ;
   private short A641MovEspLin ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_73 ;
   private short ZZ644MovEspULin ;
   private short ZZ738PrdUltCCC ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_123 ;
   private int nGXsfl_123_idx=1 ;
   private int Z647NumCon ;
   private int A795PrvNum ;
   private int A647NumCon ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtMovEspULin_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdUltDCC_Enabled ;
   private int edtPrdDetPar_Enabled ;
   private int edtPrdRotRea_Enabled ;
   private int edtPrdUltECC_Enabled ;
   private int edtPrdUltCCC_Enabled ;
   private int edtPrdExiCCP_Enabled ;
   private int edtPrdDifCC_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMovEspLin_Enabled ;
   private int edtMovEspOri_Enabled ;
   private int edtMovEspUni_Enabled ;
   private int edtNumCon_Enabled ;
   private int edtDetUni_Enabled ;
   private int edtMovEspFec_Enabled ;
   private int edtMovEspCla_Enabled ;
   private int edtMovEspMot_Enabled ;
   private int edtMovEspCom_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridtmovesp_level1item_Backcolor ;
   private int subGridtmovesp_level1item_Allbackcolor ;
   private int defedtMovEspLin_Enabled ;
   private int idxLst ;
   private int subGridtmovesp_level1item_Selectedindex ;
   private int subGridtmovesp_level1item_Selectioncolor ;
   private int subGridtmovesp_level1item_Hoveringcolor ;
   private int ZZ795PrvNum ;
   private long GRIDTMOVESP_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z739PrdUltDCC ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal Z740PrdUltECC ;
   private java.math.BigDecimal Z706PrdExiCCP ;
   private java.math.BigDecimal Z700PrdDifCC ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z645MovEspUni ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A739PrdUltDCC ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A740PrdUltECC ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A700PrdDifCC ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A645MovEspUni ;
   private java.math.BigDecimal A322DetUni ;
   private java.math.BigDecimal Z322DetUni ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ739PrdUltDCC ;
   private java.math.BigDecimal ZZ729PrdRotRea ;
   private java.math.BigDecimal ZZ740PrdUltECC ;
   private java.math.BigDecimal ZZ706PrdExiCCP ;
   private java.math.BigDecimal ZZ700PrdDifCC ;
   private java.math.BigDecimal ZZ707PrdFacCon ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z698PrdDetPar ;
   private String Z643MovEspOri ;
   private String Z638MovEspCla ;
   private String Z642MovEspMot ;
   private String Z639MovEspCom ;
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
   private String sGXsfl_123_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtMovEspULin_Internalname ;
   private String edtMovEspULin_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdUltDCC_Internalname ;
   private String edtPrdUltDCC_Jsonclick ;
   private String edtPrdDetPar_Internalname ;
   private String A698PrdDetPar ;
   private String edtPrdDetPar_Jsonclick ;
   private String edtPrdRotRea_Internalname ;
   private String edtPrdRotRea_Jsonclick ;
   private String edtPrdUltECC_Internalname ;
   private String edtPrdUltECC_Jsonclick ;
   private String edtPrdUltCCC_Internalname ;
   private String edtPrdUltCCC_Jsonclick ;
   private String edtPrdExiCCP_Internalname ;
   private String edtPrdExiCCP_Jsonclick ;
   private String edtPrdDifCC_Internalname ;
   private String edtPrdDifCC_Jsonclick ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode73 ;
   private String edtMovEspLin_Internalname ;
   private String edtMovEspOri_Internalname ;
   private String edtMovEspUni_Internalname ;
   private String edtNumCon_Internalname ;
   private String edtDetUni_Internalname ;
   private String edtMovEspFec_Internalname ;
   private String edtMovEspCla_Internalname ;
   private String edtMovEspMot_Internalname ;
   private String edtMovEspCom_Internalname ;
   private String sStyleString ;
   private String subGridtmovesp_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A643MovEspOri ;
   private String A638MovEspCla ;
   private String A642MovEspMot ;
   private String A639MovEspCom ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String sMode29 ;
   private String sGXsfl_123_fel_idx="0001" ;
   private String subGridtmovesp_level1item_Class ;
   private String subGridtmovesp_level1item_Linesclass ;
   private String ROClassString ;
   private String edtMovEspLin_Jsonclick ;
   private String edtMovEspOri_Jsonclick ;
   private String edtMovEspUni_Jsonclick ;
   private String edtNumCon_Jsonclick ;
   private String edtDetUni_Jsonclick ;
   private String edtMovEspFec_Jsonclick ;
   private String edtMovEspCla_Jsonclick ;
   private String edtMovEspMot_Jsonclick ;
   private String edtMovEspCom_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtmovesp_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ718PrdNom ;
   private String ZZ698PrdDetPar ;
   private String ZZ407EmprNom ;
   private String ZZ794PrvNom ;
   private java.util.Date Z640MovEspFec ;
   private java.util.Date A640MovEspFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n647NumCon ;
   private boolean wbErr ;
   private boolean bGXsfl_123_Refreshing=false ;
   private boolean n794PrvNom ;
   private boolean n407EmprNom ;
   private boolean n644MovEspULin ;
   private boolean Gx_longc ;
   private boolean n643MovEspOri ;
   private boolean n645MovEspUni ;
   private boolean n322DetUni ;
   private boolean n640MovEspFec ;
   private boolean n638MovEspCla ;
   private boolean n642MovEspMot ;
   private boolean n639MovEspCom ;
   private com.genexus.webpanels.GXWebGrid Gridtmovesp_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtmovesp_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtmovesp_level1itemColumn ;
   private IDataStoreProvider pr_default ;
   private String[] T001N9_A719PrdNum ;
   private boolean[] T001N9_n719PrdNum ;
   private String[] T001N9_A718PrdNom ;
   private String[] T001N9_A794PrvNom ;
   private boolean[] T001N9_n794PrvNom ;
   private String[] T001N9_A407EmprNom ;
   private boolean[] T001N9_n407EmprNom ;
   private short[] T001N9_A644MovEspULin ;
   private boolean[] T001N9_n644MovEspULin ;
   private java.math.BigDecimal[] T001N9_A704PrdExiAlm ;
   private java.math.BigDecimal[] T001N9_A705PrdExiCC ;
   private java.math.BigDecimal[] T001N9_A739PrdUltDCC ;
   private String[] T001N9_A698PrdDetPar ;
   private java.math.BigDecimal[] T001N9_A729PrdRotRea ;
   private java.math.BigDecimal[] T001N9_A740PrdUltECC ;
   private short[] T001N9_A738PrdUltCCC ;
   private java.math.BigDecimal[] T001N9_A706PrdExiCCP ;
   private java.math.BigDecimal[] T001N9_A700PrdDifCC ;
   private java.math.BigDecimal[] T001N9_A707PrdFacCon ;
   private String[] T001N9_A396EmprCod ;
   private int[] T001N9_A795PrvNum ;
   private String[] T001N7_A407EmprNom ;
   private boolean[] T001N7_n407EmprNom ;
   private String[] T001N8_A794PrvNom ;
   private boolean[] T001N8_n794PrvNom ;
   private String[] T001N10_A407EmprNom ;
   private boolean[] T001N10_n407EmprNom ;
   private String[] T001N11_A794PrvNom ;
   private boolean[] T001N11_n794PrvNom ;
   private String[] T001N12_A396EmprCod ;
   private String[] T001N12_A719PrdNum ;
   private boolean[] T001N12_n719PrdNum ;
   private String[] T001N6_A719PrdNum ;
   private boolean[] T001N6_n719PrdNum ;
   private String[] T001N6_A718PrdNom ;
   private short[] T001N6_A644MovEspULin ;
   private boolean[] T001N6_n644MovEspULin ;
   private java.math.BigDecimal[] T001N6_A704PrdExiAlm ;
   private java.math.BigDecimal[] T001N6_A705PrdExiCC ;
   private java.math.BigDecimal[] T001N6_A739PrdUltDCC ;
   private String[] T001N6_A698PrdDetPar ;
   private java.math.BigDecimal[] T001N6_A729PrdRotRea ;
   private java.math.BigDecimal[] T001N6_A740PrdUltECC ;
   private short[] T001N6_A738PrdUltCCC ;
   private java.math.BigDecimal[] T001N6_A706PrdExiCCP ;
   private java.math.BigDecimal[] T001N6_A700PrdDifCC ;
   private java.math.BigDecimal[] T001N6_A707PrdFacCon ;
   private String[] T001N6_A396EmprCod ;
   private int[] T001N6_A795PrvNum ;
   private String[] T001N13_A396EmprCod ;
   private String[] T001N13_A719PrdNum ;
   private boolean[] T001N13_n719PrdNum ;
   private String[] T001N14_A396EmprCod ;
   private String[] T001N14_A719PrdNum ;
   private boolean[] T001N14_n719PrdNum ;
   private String[] T001N5_A719PrdNum ;
   private boolean[] T001N5_n719PrdNum ;
   private String[] T001N5_A718PrdNom ;
   private short[] T001N5_A644MovEspULin ;
   private boolean[] T001N5_n644MovEspULin ;
   private java.math.BigDecimal[] T001N5_A704PrdExiAlm ;
   private java.math.BigDecimal[] T001N5_A705PrdExiCC ;
   private java.math.BigDecimal[] T001N5_A739PrdUltDCC ;
   private String[] T001N5_A698PrdDetPar ;
   private java.math.BigDecimal[] T001N5_A729PrdRotRea ;
   private java.math.BigDecimal[] T001N5_A740PrdUltECC ;
   private short[] T001N5_A738PrdUltCCC ;
   private java.math.BigDecimal[] T001N5_A706PrdExiCCP ;
   private java.math.BigDecimal[] T001N5_A700PrdDifCC ;
   private java.math.BigDecimal[] T001N5_A707PrdFacCon ;
   private String[] T001N5_A396EmprCod ;
   private int[] T001N5_A795PrvNum ;
   private String[] T001N18_A407EmprNom ;
   private boolean[] T001N18_n407EmprNom ;
   private String[] T001N19_A794PrvNom ;
   private boolean[] T001N19_n794PrvNom ;
   private String[] T001N20_A396EmprCod ;
   private String[] T001N20_A719PrdNum ;
   private boolean[] T001N20_n719PrdNum ;
   private String[] T001N20_A13217NormaID ;
   private String[] T001N21_A396EmprCod ;
   private String[] T001N21_A719PrdNum ;
   private boolean[] T001N21_n719PrdNum ;
   private String[] T001N21_A13586TheList ;
   private String[] T001N22_A396EmprCod ;
   private int[] T001N22_A5532Lb_numero ;
   private String[] T001N22_A5555Lb_opcion ;
   private short[] T001N22_A13460Lb_linCP ;
   private String[] T001N22_A13458Lb_TipCP ;
   private String[] T001N23_A396EmprCod ;
   private int[] T001N23_A13418AlbProID ;
   private short[] T001N23_A13442AlbProLine ;
   private String[] T001N24_A396EmprCod ;
   private int[] T001N24_A13324LDESID ;
   private String[] T001N24_A13333LDESNPeque ;
   private String[] T001N24_A13337LDESComb ;
   private String[] T001N24_A13339LDESFondo ;
   private short[] T001N24_A13342LDESLinea ;
   private String[] T001N25_A396EmprCod ;
   private int[] T001N25_A13312Lb_NLab ;
   private short[] T001N25_A13305Lb_IDVeces ;
   private short[] T001N25_A13306Lb_LinID ;
   private String[] T001N26_A396EmprCod ;
   private int[] T001N26_A12673LavMqId ;
   private short[] T001N26_A12692LavMqLnPq ;
   private short[] T001N26_A12681LavMqLn ;
   private String[] T001N27_A396EmprCod ;
   private String[] T001N27_A719PrdNum ;
   private boolean[] T001N27_n719PrdNum ;
   private short[] T001N27_A9713Tb1_Cod ;
   private String[] T001N28_A396EmprCod ;
   private String[] T001N28_A12236PrdNumD ;
   private String[] T001N28_A719PrdNum ;
   private boolean[] T001N28_n719PrdNum ;
   private String[] T001N29_A396EmprCod ;
   private long[] T001N29_A12225DocDisID ;
   private short[] T001N29_A12226LinDisID ;
   private String[] T001N30_A396EmprCod ;
   private long[] T001N30_A12225DocDisID ;
   private String[] T001N31_A396EmprCod ;
   private long[] T001N31_A12205OrdenCID ;
   private short[] T001N31_A12206OrdenCLnId ;
   private String[] T001N32_A396EmprCod ;
   private String[] T001N32_A719PrdNum ;
   private boolean[] T001N32_n719PrdNum ;
   private String[] T001N32_A11664LoteID ;
   private java.util.Date[] T001N32_A11665LoteFec ;
   private String[] T001N33_A396EmprCod ;
   private int[] T001N33_A4850DevComCod ;
   private String[] T001N33_A719PrdNum ;
   private boolean[] T001N33_n719PrdNum ;
   private String[] T001N34_A396EmprCod ;
   private int[] T001N34_A252CliCod ;
   private String[] T001N34_A494ForSer ;
   private String[] T001N34_A482ForColNom ;
   private int[] T001N34_A483ForColNum ;
   private byte[] T001N34_A831TipColCod ;
   private String[] T001N34_A3571EnsCod ;
   private short[] T001N34_A3582EnsLin ;
   private String[] T001N35_A396EmprCod ;
   private int[] T001N35_A129BarCod ;
   private byte[] T001N35_A132BarCodReo ;
   private String[] T001N35_A130BarCodPar ;
   private byte[] T001N35_A4075recestncol ;
   private byte[] T001N35_A4076recestnpro ;
   private short[] T001N35_A4108recestlin ;
   private String[] T001N36_A396EmprCod ;
   private int[] T001N36_A4052EstNumFor ;
   private byte[] T001N36_A4053EstNumCol ;
   private byte[] T001N36_A4090EstEspLin ;
   private String[] T001N37_A396EmprCod ;
   private int[] T001N37_A4052EstNumFor ;
   private byte[] T001N37_A4053EstNumCol ;
   private byte[] T001N37_A4084EstProLin ;
   private String[] T001N38_A396EmprCod ;
   private long[] T001N38_A11644TransferId ;
   private int[] T001N38_A11653TransferLn ;
   private String[] T001N39_A396EmprCod ;
   private String[] T001N39_A11634TaesId ;
   private short[] T001N39_A11637TaesLn ;
   private short[] T001N39_A11641TaesLnP ;
   private String[] T001N40_A396EmprCod ;
   private String[] T001N40_A719PrdNum ;
   private boolean[] T001N40_n719PrdNum ;
   private long[] T001N40_A11329H_stklin ;
   private String[] T001N41_A396EmprCod ;
   private int[] T001N41_A11270Pot_num ;
   private short[] T001N41_A11271Pot_lin ;
   private String[] T001N42_A396EmprCod ;
   private String[] T001N42_A719PrdNum ;
   private boolean[] T001N42_n719PrdNum ;
   private String[] T001N42_A11199PrdNcasC ;
   private String[] T001N43_A396EmprCod ;
   private String[] T001N43_A719PrdNum ;
   private boolean[] T001N43_n719PrdNum ;
   private String[] T001N43_A11197CFraseR ;
   private String[] T001N44_A396EmprCod ;
   private short[] T001N44_A10243Jt_codigo ;
   private short[] T001N44_A10246Jt_ord ;
   private String[] T001N45_A396EmprCod ;
   private java.util.Date[] T001N45_A10236Bny_dia ;
   private short[] T001N45_A10238Bny_lin ;
   private String[] T001N46_A396EmprCod ;
   private int[] T001N46_A129BarCod ;
   private byte[] T001N46_A132BarCodReo ;
   private String[] T001N46_A130BarCodPar ;
   private String[] T001N46_A758ProCod ;
   private short[] T001N46_A194BarOrdLin ;
   private String[] T001N46_A719PrdNum ;
   private boolean[] T001N46_n719PrdNum ;
   private String[] T001N47_A396EmprCod ;
   private String[] T001N47_A719PrdNum ;
   private boolean[] T001N47_n719PrdNum ;
   private String[] T001N47_A9735Cod_Rgo ;
   private String[] T001N48_A396EmprCod ;
   private String[] T001N48_A719PrdNum ;
   private boolean[] T001N48_n719PrdNum ;
   private short[] T001N48_A9711Ct_codigo ;
   private String[] T001N49_A396EmprCod ;
   private long[] T001N49_A9652OeNum ;
   private int[] T001N49_A9653OeHdr ;
   private byte[] T001N49_A9654OeHdrr ;
   private String[] T001N49_A9655OeHdrp ;
   private byte[] T001N49_A9656OeLinC ;
   private String[] T001N49_A9657OeComb ;
   private String[] T001N49_A9658Oefondo ;
   private byte[] T001N49_A9659OeMolCil ;
   private short[] T001N49_A9686OePasLin ;
   private short[] T001N49_A9694OePasPLi ;
   private String[] T001N50_A396EmprCod ;
   private long[] T001N50_A9652OeNum ;
   private int[] T001N50_A9653OeHdr ;
   private byte[] T001N50_A9654OeHdrr ;
   private String[] T001N50_A9655OeHdrp ;
   private byte[] T001N50_A9656OeLinC ;
   private String[] T001N50_A9657OeComb ;
   private String[] T001N50_A9658Oefondo ;
   private byte[] T001N50_A9659OeMolCil ;
   private byte[] T001N50_A9677OeMolLin ;
   private String[] T001N51_A396EmprCod ;
   private int[] T001N51_A9578Pas_Num ;
   private String[] T001N51_A719PrdNum ;
   private boolean[] T001N51_n719PrdNum ;
   private String[] T001N52_A396EmprCod ;
   private String[] T001N52_A719PrdNum ;
   private boolean[] T001N52_n719PrdNum ;
   private byte[] T001N52_A8908CC_AlmCod ;
   private String[] T001N53_A396EmprCod ;
   private String[] T001N53_A719PrdNum ;
   private boolean[] T001N53_n719PrdNum ;
   private int[] T001N53_A8661Almc_Ln ;
   private String[] T001N54_A396EmprCod ;
   private String[] T001N54_A719PrdNum ;
   private boolean[] T001N54_n719PrdNum ;
   private String[] T001N54_A8648Mat_PrdN ;
   private String[] T001N55_A396EmprCod ;
   private long[] T001N55_A8585Pet_cod ;
   private String[] T001N55_A719PrdNum ;
   private boolean[] T001N55_n719PrdNum ;
   private String[] T001N56_A396EmprCod ;
   private String[] T001N56_A719PrdNum ;
   private boolean[] T001N56_n719PrdNum ;
   private java.util.Date[] T001N56_A8577RecFecHr ;
   private String[] T001N57_A396EmprCod ;
   private String[] T001N57_A719PrdNum ;
   private boolean[] T001N57_n719PrdNum ;
   private short[] T001N57_A8366PrdAnyo ;
   private int[] T001N57_A8360PrdProv ;
   private String[] T001N58_A396EmprCod ;
   private int[] T001N58_A252CliCod ;
   private String[] T001N58_A494ForSer ;
   private String[] T001N58_A482ForColNom ;
   private int[] T001N58_A483ForColNum ;
   private byte[] T001N58_A831TipColCod ;
   private short[] T001N58_A7797Sim_lin ;
   private String[] T001N59_A396EmprCod ;
   private int[] T001N59_A7163Vir_Codigo ;
   private String[] T001N59_A719PrdNum ;
   private boolean[] T001N59_n719PrdNum ;
   private String[] T001N60_A396EmprCod ;
   private String[] T001N60_A6310Lb_TaAuxC ;
   private short[] T001N60_A6313lb_TaAuxL ;
   private short[] T001N60_A6378Lb_TauxLP ;
   private String[] T001N61_A396EmprCod ;
   private int[] T001N61_A6290PreCoNum ;
   private String[] T001N61_A719PrdNum ;
   private boolean[] T001N61_n719PrdNum ;
   private String[] T001N62_A396EmprCod ;
   private String[] T001N62_A719PrdNum ;
   private boolean[] T001N62_n719PrdNum ;
   private int[] T001N62_A6158PrdPrv ;
   private String[] T001N63_A396EmprCod ;
   private String[] T001N63_A719PrdNum ;
   private boolean[] T001N63_n719PrdNum ;
   private String[] T001N63_A5973PrdSusNum ;
   private String[] T001N64_A396EmprCod ;
   private String[] T001N64_A5612Lb_CodGru ;
   private short[] T001N64_A5615Lb_LinGru ;
   private String[] T001N65_A396EmprCod ;
   private int[] T001N65_A5532Lb_numero ;
   private String[] T001N65_A5555Lb_opcion ;
   private short[] T001N65_A5560Lb_LineaPr ;
   private String[] T001N66_A396EmprCod ;
   private int[] T001N66_A5532Lb_numero ;
   private String[] T001N66_A5555Lb_opcion ;
   private short[] T001N66_A5557Lb_LineaC ;
   private String[] T001N67_A396EmprCod ;
   private int[] T001N67_A5145SobCod ;
   private String[] T001N67_A719PrdNum ;
   private boolean[] T001N67_n719PrdNum ;
   private String[] T001N68_A396EmprCod ;
   private int[] T001N68_A4744RecPreCod ;
   private short[] T001N68_A4762RecPreLin ;
   private short[] T001N68_A4763RecPreNli ;
   private String[] T001N69_A396EmprCod ;
   private int[] T001N69_A4492HreBarCod ;
   private byte[] T001N69_A4493HreBarReo ;
   private String[] T001N69_A4494HreBarPar ;
   private byte[] T001N69_A4495HreNumCie ;
   private short[] T001N69_A4545HreLinMaq ;
   private byte[] T001N69_A4550HreLinPro ;
   private short[] T001N69_A4557HreRecLin ;
   private String[] T001N70_A396EmprCod ;
   private int[] T001N70_A4492HreBarCod ;
   private byte[] T001N70_A4493HreBarReo ;
   private String[] T001N70_A4494HreBarPar ;
   private byte[] T001N70_A4495HreNumCie ;
   private short[] T001N70_A4508HreLinMAL ;
   private byte[] T001N70_A4509HreNumAny ;
   private String[] T001N70_A719PrdNum ;
   private boolean[] T001N70_n719PrdNum ;
   private String[] T001N71_A396EmprCod ;
   private int[] T001N71_A252CliCod ;
   private String[] T001N71_A4415EstCol ;
   private short[] T001N71_A4416EstColLin ;
   private String[] T001N72_A396EmprCod ;
   private int[] T001N72_A129BarCod ;
   private byte[] T001N72_A132BarCodReo ;
   private String[] T001N72_A130BarCodPar ;
   private byte[] T001N72_A2524DisComLin ;
   private String[] T001N72_A1056DisComCod ;
   private String[] T001N72_A1032FonCod ;
   private byte[] T001N72_A2124RecMolCod ;
   private short[] T001N72_A2672RecPasLin ;
   private short[] T001N72_A2675RecPasPLi ;
   private String[] T001N73_A396EmprCod ;
   private int[] T001N73_A129BarCod ;
   private byte[] T001N73_A132BarCodReo ;
   private String[] T001N73_A130BarCodPar ;
   private byte[] T001N73_A2524DisComLin ;
   private String[] T001N73_A1056DisComCod ;
   private String[] T001N73_A1032FonCod ;
   private byte[] T001N73_A2124RecMolCod ;
   private byte[] T001N73_A2126RecMolLin ;
   private String[] T001N74_A396EmprCod ;
   private String[] T001N74_A2107PasCod ;
   private String[] T001N74_A719PrdNum ;
   private boolean[] T001N74_n719PrdNum ;
   private String[] T001N75_A396EmprCod ;
   private int[] T001N75_A2637HisEstHRu ;
   private byte[] T001N75_A2636HisEstHRe ;
   private String[] T001N75_A2635HisEstHPa ;
   private byte[] T001N75_A2638HisEstLCo ;
   private String[] T001N75_A2630HisEstCom ;
   private String[] T001N75_A2634HisEstFon ;
   private String[] T001N75_A719PrdNum ;
   private boolean[] T001N75_n719PrdNum ;
   private String[] T001N76_A396EmprCod ;
   private int[] T001N76_A252CliCod ;
   private String[] T001N76_A2141SerEst ;
   private String[] T001N76_A1013DibCli ;
   private int[] T001N76_A1014DibInt ;
   private String[] T001N76_A2074ColCom ;
   private String[] T001N76_A2078ColFon ;
   private byte[] T001N76_A2098MolCod ;
   private short[] T001N76_A2535ForPrdLin ;
   private String[] T001N77_A396EmprCod ;
   private String[] T001N77_A719PrdNum ;
   private boolean[] T001N77_n719PrdNum ;
   private long[] T001N77_A3342CCStkLin ;
   private String[] T001N78_A396EmprCod ;
   private int[] T001N78_A252CliCod ;
   private String[] T001N78_A2891HMaForSer ;
   private String[] T001N78_A2892HMaForCNom ;
   private int[] T001N78_A2893HMaForCNum ;
   private byte[] T001N78_A2894HMaTipCCod ;
   private int[] T001N78_A2895HMaForNumC ;
   private short[] T001N78_A2897HMaColLin ;
   private java.util.Date[] T001N78_A2896HMaFec ;
   private short[] T001N78_A2907HmaLin ;
   private String[] T001N79_A396EmprCod ;
   private int[] T001N79_A129BarCod ;
   private byte[] T001N79_A132BarCodReo ;
   private String[] T001N79_A130BarCodPar ;
   private short[] T001N79_A2808RecLinMAL ;
   private byte[] T001N79_A1377RecNumAny ;
   private String[] T001N79_A719PrdNum ;
   private boolean[] T001N79_n719PrdNum ;
   private String[] T001N80_A396EmprCod ;
   private int[] T001N80_A129BarCod ;
   private byte[] T001N80_A132BarCodReo ;
   private String[] T001N80_A130BarCodPar ;
   private short[] T001N80_A2804RecLinMaq ;
   private byte[] T001N80_A1273RecLinPro ;
   private short[] T001N80_A811RecLin ;
   private String[] T001N81_A396EmprCod ;
   private int[] T001N81_A129BarCod ;
   private byte[] T001N81_A132BarCodReo ;
   private String[] T001N81_A130BarCodPar ;
   private String[] T001N81_A2494BarDosPro ;
   private String[] T001N81_A719PrdNum ;
   private boolean[] T001N81_n719PrdNum ;
   private String[] T001N82_A396EmprCod ;
   private int[] T001N82_A1314EnsLabCod ;
   private short[] T001N82_A1317EnsLabLin ;
   private String[] T001N83_A396EmprCod ;
   private String[] T001N83_A910Workstat ;
   private int[] T001N83_A887EscMLin ;
   private String[] T001N84_A396EmprCod ;
   private int[] T001N84_A859CumCodCont ;
   private String[] T001N84_A719PrdNum ;
   private boolean[] T001N84_n719PrdNum ;
   private String[] T001N85_A396EmprCod ;
   private String[] T001N85_A719PrdNum ;
   private boolean[] T001N85_n719PrdNum ;
   private java.util.Date[] T001N85_A810RecFec ;
   private String[] T001N86_A396EmprCod ;
   private int[] T001N86_A486ForNumCol ;
   private short[] T001N86_A715PrdLin ;
   private String[] T001N87_A396EmprCod ;
   private String[] T001N87_A719PrdNum ;
   private boolean[] T001N87_n719PrdNum ;
   private short[] T001N87_A681PrdAny ;
   private String[] T001N88_A396EmprCod ;
   private String[] T001N88_A719PrdNum ;
   private boolean[] T001N88_n719PrdNum ;
   private String[] T001N88_A688PrdComCod ;
   private String[] T001N89_A396EmprCod ;
   private String[] T001N89_A719PrdNum ;
   private boolean[] T001N89_n719PrdNum ;
   private String[] T001N89_A680PrdAltNum ;
   private String[] T001N90_A396EmprCod ;
   private int[] T001N90_A658PedCod ;
   private String[] T001N90_A719PrdNum ;
   private boolean[] T001N90_n719PrdNum ;
   private String[] T001N91_A396EmprCod ;
   private int[] T001N91_A486ForNumCol ;
   private short[] T001N91_A309ColLin ;
   private String[] T001N92_A396EmprCod ;
   private String[] T001N92_A719PrdNum ;
   private boolean[] T001N92_n719PrdNum ;
   private int[] T001N92_A647NumCon ;
   private boolean[] T001N92_n647NumCon ;
   private String[] T001N93_A396EmprCod ;
   private String[] T001N93_A719PrdNum ;
   private boolean[] T001N93_n719PrdNum ;
   private short[] T001N94_A641MovEspLin ;
   private String[] T001N94_A643MovEspOri ;
   private boolean[] T001N94_n643MovEspOri ;
   private java.math.BigDecimal[] T001N94_A645MovEspUni ;
   private boolean[] T001N94_n645MovEspUni ;
   private java.math.BigDecimal[] T001N94_A322DetUni ;
   private boolean[] T001N94_n322DetUni ;
   private java.util.Date[] T001N94_A640MovEspFec ;
   private boolean[] T001N94_n640MovEspFec ;
   private String[] T001N94_A638MovEspCla ;
   private boolean[] T001N94_n638MovEspCla ;
   private String[] T001N94_A642MovEspMot ;
   private boolean[] T001N94_n642MovEspMot ;
   private String[] T001N94_A639MovEspCom ;
   private boolean[] T001N94_n639MovEspCom ;
   private String[] T001N94_A396EmprCod ;
   private String[] T001N94_A719PrdNum ;
   private boolean[] T001N94_n719PrdNum ;
   private int[] T001N94_A647NumCon ;
   private boolean[] T001N94_n647NumCon ;
   private java.math.BigDecimal[] T001N4_A322DetUni ;
   private boolean[] T001N4_n322DetUni ;
   private java.math.BigDecimal[] T001N95_A322DetUni ;
   private boolean[] T001N95_n322DetUni ;
   private String[] T001N96_A396EmprCod ;
   private String[] T001N96_A719PrdNum ;
   private boolean[] T001N96_n719PrdNum ;
   private short[] T001N96_A641MovEspLin ;
   private short[] T001N3_A641MovEspLin ;
   private String[] T001N3_A643MovEspOri ;
   private boolean[] T001N3_n643MovEspOri ;
   private java.math.BigDecimal[] T001N3_A645MovEspUni ;
   private boolean[] T001N3_n645MovEspUni ;
   private java.util.Date[] T001N3_A640MovEspFec ;
   private boolean[] T001N3_n640MovEspFec ;
   private String[] T001N3_A638MovEspCla ;
   private boolean[] T001N3_n638MovEspCla ;
   private String[] T001N3_A642MovEspMot ;
   private boolean[] T001N3_n642MovEspMot ;
   private String[] T001N3_A639MovEspCom ;
   private boolean[] T001N3_n639MovEspCom ;
   private String[] T001N3_A396EmprCod ;
   private String[] T001N3_A719PrdNum ;
   private boolean[] T001N3_n719PrdNum ;
   private int[] T001N3_A647NumCon ;
   private boolean[] T001N3_n647NumCon ;
   private short[] T001N2_A641MovEspLin ;
   private String[] T001N2_A643MovEspOri ;
   private boolean[] T001N2_n643MovEspOri ;
   private java.math.BigDecimal[] T001N2_A645MovEspUni ;
   private boolean[] T001N2_n645MovEspUni ;
   private java.util.Date[] T001N2_A640MovEspFec ;
   private boolean[] T001N2_n640MovEspFec ;
   private String[] T001N2_A638MovEspCla ;
   private boolean[] T001N2_n638MovEspCla ;
   private String[] T001N2_A642MovEspMot ;
   private boolean[] T001N2_n642MovEspMot ;
   private String[] T001N2_A639MovEspCom ;
   private boolean[] T001N2_n639MovEspCom ;
   private String[] T001N2_A396EmprCod ;
   private String[] T001N2_A719PrdNum ;
   private boolean[] T001N2_n719PrdNum ;
   private int[] T001N2_A647NumCon ;
   private boolean[] T001N2_n647NumCon ;
   private java.math.BigDecimal[] T001N100_A322DetUni ;
   private boolean[] T001N100_n322DetUni ;
   private String[] T001N101_A396EmprCod ;
   private String[] T001N101_A719PrdNum ;
   private boolean[] T001N101_n719PrdNum ;
   private short[] T001N101_A641MovEspLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmovesp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmovesp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmovesp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmovesp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmovesp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001N2", "SELECT MovEspLin, MovEspOri, MovEspUni, MovEspFec, MovEspCla, MovEspMot, MovEspCom, EmprCod, PrdNum, NumCon FROM TXPMOVESP WHERE EmprCod = ? AND PrdNum = ? AND MovEspLin = ?  FOR UPDATE OF MovEspOri, MovEspUni, MovEspFec, MovEspCla, MovEspMot, MovEspCom, NumCon NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N3", "SELECT MovEspLin, MovEspOri, MovEspUni, MovEspFec, MovEspCla, MovEspMot, MovEspCom, EmprCod, PrdNum, NumCon FROM TXPMOVESP WHERE EmprCod = ? AND PrdNum = ? AND MovEspLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N4", "SELECT DetUni FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ? AND NumCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N5", "SELECT PrdNum, PrdNom, MovEspULin, PrdExiAlm, PrdExiCC, PrdUltDCC, PrdDetPar, PrdRotRea, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, EmprCod, PrvNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom, MovEspULin, PrdExiAlm, PrdExiCC, PrdUltDCC, PrdDetPar, PrdRotRea, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrvNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N6", "SELECT PrdNum, PrdNom, MovEspULin, PrdExiAlm, PrdExiCC, PrdUltDCC, PrdDetPar, PrdRotRea, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, EmprCod, PrvNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N8", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N9", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, TM1.PrdNom, T3.PrvNom, T2.EmprNom, TM1.MovEspULin, TM1.PrdExiAlm, TM1.PrdExiCC, TM1.PrdUltDCC, TM1.PrdDetPar, TM1.PrdRotRea, TM1.PrdUltECC, TM1.PrdUltCCC, TM1.PrdExiCCP, TM1.PrdDifCC, TM1.PrdFacCon, TM1.EmprCod, TM1.PrvNum FROM ((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRVGEN T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrvNum = TM1.PrvNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N11", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001N15", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, MovEspULin, PrdExiAlm, PrdExiCC, PrdUltDCC, PrdDetPar, PrdRotRea, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, EmprCod, PrvNum, PrdPreAct, ValCod, PrdFulEnt, PrdCanPen, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T001N16", "UPDATE TXPPRODUC SET PrdNom=?, MovEspULin=?, PrdExiAlm=?, PrdExiCC=?, PrdUltDCC=?, PrdDetPar=?, PrdRotRea=?, PrdUltECC=?, PrdUltCCC=?, PrdExiCCP=?, PrdDifCC=?, PrdFacCon=?, PrvNum=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T001N17", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T001N18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N19", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N20", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N21", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N22", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N23", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N24", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N25", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N26", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N27", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N28", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N29", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N30", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N31", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N32", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N33", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N34", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N35", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N36", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N37", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N38", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N39", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N40", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N41", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N42", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N43", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N44", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N45", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N46", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N47", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N48", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N49", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N50", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N51", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N52", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N53", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N54", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N55", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N56", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N57", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N58", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N59", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N60", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N61", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N62", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N63", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N64", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N65", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N66", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N67", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N68", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N69", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N70", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N71", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N72", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N74", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N75", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N76", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N77", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N78", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N79", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N80", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N81", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N82", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N83", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N84", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N85", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N86", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N87", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N88", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N89", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N90", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N91", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N92", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001N93", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N94", "SELECT T1.MovEspLin, T1.MovEspOri, T1.MovEspUni, T2.DetUni, T1.MovEspFec, T1.MovEspCla, T1.MovEspMot, T1.MovEspCom, T1.EmprCod, T1.PrdNum, T1.NumCon FROM (TXPMOVESP T1 LEFT JOIN TXPDETCON T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum AND T2.NumCon = T1.NumCon) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.MovEspLin = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.MovEspLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N95", "SELECT DetUni FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ? AND NumCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N96", "SELECT EmprCod, PrdNum, MovEspLin FROM TXPMOVESP WHERE EmprCod = ? AND PrdNum = ? AND MovEspLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T001N97", "INSERT INTO TXPMOVESP(MovEspLin, MovEspOri, MovEspUni, MovEspFec, MovEspCla, MovEspMot, MovEspCom, EmprCod, PrdNum, NumCon) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMOVESP")
         ,new UpdateCursor("T001N98", "UPDATE TXPMOVESP SET MovEspOri=?, MovEspUni=?, MovEspFec=?, MovEspCla=?, MovEspMot=?, MovEspCom=?, NumCon=?  WHERE EmprCod = ? AND PrdNum = ? AND MovEspLin = ?", GX_NOMASK, "TXPMOVESP")
         ,new UpdateCursor("T001N99", "DELETE FROM TXPMOVESP  WHERE EmprCod = ? AND PrdNum = ? AND MovEspLin = ?", GX_NOMASK, "TXPMOVESP")
         ,new ForEachCursor("T001N100", "SELECT DetUni FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ? AND NumCon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001N101", "SELECT EmprCod, PrdNum, MovEspLin FROM TXPMOVESP WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, MovEspLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 24);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 24);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((String[]) buf[14])[0] = rslt.getString(9, 6);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((String[]) buf[14])[0] = rslt.getString(14, 3);
               ((int[]) buf[15])[0] = rslt.getInt(15);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,4);
               ((String[]) buf[18])[0] = rslt.getString(16, 3);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 92 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 24);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 3);
               ((String[]) buf[16])[0] = rslt.getString(10, 6);
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 93 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 98 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 4);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(7, (String)parms[8], 1);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[10], 2);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[14], 4);
               stmt.setString(14, (String)parms[15], 3);
               stmt.setInt(15, ((Number) parms[16]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 26);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 5);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 4);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setString(14, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[16], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 94 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 95 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 24);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 1);
               }
               stmt.setString(8, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 6);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               return;
            case 96 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 24);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 6);
               }
               stmt.setShort(10, ((Number) parms[17]).shortValue());
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 99 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

