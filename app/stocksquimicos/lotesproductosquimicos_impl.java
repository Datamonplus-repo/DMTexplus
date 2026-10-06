package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lotesproductosquimicos_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lotes Productos Quimicos", ""), (short)(0)) ;
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

   public lotesproductosquimicos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lotesproductosquimicos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lotesproductosquimicos_impl.class ));
   }

   public lotesproductosquimicos_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Lotes Productos Quimicos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteFec_Internalname, httpContext.getMessage( "Fecha Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtLoteFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteFec_Internalname, localUtil.format(A11665LoteFec, "99/99/99"), localUtil.format( A11665LoteFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtLoteFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtLoteFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteID_Internalname, httpContext.getMessage( "Lote ID", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteID_Internalname, GXutil.rtrim( A11664LoteID), GXutil.rtrim( localUtil.format( A11664LoteID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteID_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteID_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLotePed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLotePed_Internalname, httpContext.getMessage( "Pedido de compra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLotePed_Internalname, GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLotePed_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLotePed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLotePed_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtf_Internalname, httpContext.getMessage( "Cerficado S/N", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtf_Internalname, GXutil.rtrim( A11667LoteCtf), GXutil.rtrim( localUtil.format( A11667LoteCtf, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtf_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteCtf_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCon_Internalname, httpContext.getMessage( "Consumido S/N", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCon_Internalname, GXutil.rtrim( A11668LoteCon), GXutil.rtrim( localUtil.format( A11668LoteCon, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteCon_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtfNm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtfNm_Internalname, httpContext.getMessage( "Nombre del certificado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtfNm_Internalname, GXutil.rtrim( A11711LoteCtfNm), GXutil.rtrim( localUtil.format( A11711LoteCtfNm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtfNm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteCtfNm_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteCtfNF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteCtfNF_Internalname, httpContext.getMessage( "Nombre del Certificado Porovvedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteCtfNF_Internalname, GXutil.rtrim( A12352LoteCtfNF), GXutil.rtrim( localUtil.format( A12352LoteCtfNF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteCtfNF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteCtfNF_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLoteNEmb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLoteNEmb_Internalname, httpContext.getMessage( "Embalages", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLoteNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLoteNEmb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLoteNEmb_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtLoteNEmb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\LotesProductosQuimicos.htm");
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
         Z11664LoteID = httpContext.cgiGet( "Z11664LoteID") ;
         Z11665LoteFec = localUtil.ctod( httpContext.cgiGet( "Z11665LoteFec"), 0) ;
         Z11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( "Z11666LotePed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11667LoteCtf = httpContext.cgiGet( "Z11667LoteCtf") ;
         Z11668LoteCon = httpContext.cgiGet( "Z11668LoteCon") ;
         Z11711LoteCtfNm = httpContext.cgiGet( "Z11711LoteCtfNm") ;
         Z12352LoteCtfNF = httpContext.cgiGet( "Z12352LoteCtfNF") ;
         Z14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( "Z14017LoteNEmb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         if ( localUtil.vcdate( httpContext.cgiGet( edtLoteFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "LOTEFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLoteFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11665LoteFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         }
         else
         {
            A11665LoteFec = localUtil.ctod( httpContext.cgiGet( edtLoteFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         }
         A11664LoteID = httpContext.cgiGet( edtLoteID_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOTEPED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLotePed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11666LotePed = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         }
         else
         {
            A11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         }
         A11667LoteCtf = GXutil.upper( httpContext.cgiGet( edtLoteCtf_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = GXutil.upper( httpContext.cgiGet( edtLoteCon_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = httpContext.cgiGet( edtLoteCtfNm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = httpContext.cgiGet( edtLoteCtfNF_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "LOTENEMB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtLoteNEmb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14017LoteNEmb = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
         }
         else
         {
            A14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
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
            A11664LoteID = httpContext.GetPar( "LoteID") ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = localUtil.parseDateParm( httpContext.GetPar( "LoteFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
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
            initAll1SA1632( ) ;
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
      disableAttributes1SA1632( ) ;
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

   public void resetCaption1SA0( )
   {
   }

   public void zm1SA1632( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11666LotePed = T01SA3_A11666LotePed[0] ;
            Z11667LoteCtf = T01SA3_A11667LoteCtf[0] ;
            Z11668LoteCon = T01SA3_A11668LoteCon[0] ;
            Z11711LoteCtfNm = T01SA3_A11711LoteCtfNm[0] ;
            Z12352LoteCtfNF = T01SA3_A12352LoteCtfNF[0] ;
            Z14017LoteNEmb = T01SA3_A14017LoteNEmb[0] ;
         }
         else
         {
            Z11666LotePed = A11666LotePed ;
            Z11667LoteCtf = A11667LoteCtf ;
            Z11668LoteCon = A11668LoteCon ;
            Z11711LoteCtfNm = A11711LoteCtfNm ;
            Z12352LoteCtfNF = A12352LoteCtfNF ;
            Z14017LoteNEmb = A14017LoteNEmb ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         Z11666LotePed = A11666LotePed ;
         Z11667LoteCtf = A11667LoteCtf ;
         Z11668LoteCon = A11668LoteCon ;
         Z11711LoteCtfNm = A11711LoteCtfNm ;
         Z12352LoteCtfNF = A12352LoteCtfNF ;
         Z14017LoteNEmb = A14017LoteNEmb ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z407EmprNom = A407EmprNom ;
         Z718PrdNom = A718PrdNom ;
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

   public void load1SA1632( )
   {
      /* Using cursor T01SA6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A407EmprNom = T01SA6_A407EmprNom[0] ;
         n407EmprNom = T01SA6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T01SA6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A11666LotePed = T01SA6_A11666LotePed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         A11667LoteCtf = T01SA6_A11667LoteCtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = T01SA6_A11668LoteCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = T01SA6_A11711LoteCtfNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = T01SA6_A12352LoteCtfNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         A14017LoteNEmb = T01SA6_A14017LoteNEmb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
         zm1SA1632( -1) ;
      }
      pr_default.close(4);
      onLoadActions1SA1632( ) ;
   }

   public void onLoadActions1SA1632( )
   {
   }

   public void checkExtendedTable1SA1632( )
   {
      nIsDirty_1632 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SA4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SA4_A407EmprNom[0] ;
      n407EmprNom = T01SA4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01SA5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SA5_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1SA1632( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T01SA7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SA7_A407EmprNom[0] ;
      n407EmprNom = T01SA7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
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
                         String A719PrdNum )
   {
      /* Using cursor T01SA8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SA8_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1SA1632( )
   {
      /* Using cursor T01SA9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1632 = (short)(1) ;
      }
      else
      {
         RcdFound1632 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SA3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SA1632( 1) ;
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01SA3_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01SA3_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
         A11666LotePed = T01SA3_A11666LotePed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
         A11667LoteCtf = T01SA3_A11667LoteCtf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
         A11668LoteCon = T01SA3_A11668LoteCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
         A11711LoteCtfNm = T01SA3_A11711LoteCtfNm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
         A12352LoteCtfNF = T01SA3_A12352LoteCtfNF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
         A14017LoteNEmb = T01SA3_A14017LoteNEmb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
         A396EmprCod = T01SA3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SA3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1SA1632( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1632 = (short)(0) ;
            initializeNonKey1SA1632( ) ;
         }
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1632 = (short)(0) ;
         initializeNonKey1SA1632( ) ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SA1632( ) ;
      if ( RcdFound1632 == 0 )
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
      RcdFound1632 = (short)(0) ;
      /* Using cursor T01SA10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A11664LoteID, A11664LoteID, A719PrdNum, A396EmprCod, A11665LoteFec});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA10_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SA10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA10_A11664LoteID[0], A11664LoteID) < 0 ) || ( GXutil.strcmp(T01SA10_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01SA10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01SA10_A11665LoteFec[0]).before( GXutil.resetTime( A11665LoteFec )) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA10_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SA10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA10_A11664LoteID[0], A11664LoteID) > 0 ) || ( GXutil.strcmp(T01SA10_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01SA10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA10_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01SA10_A11665LoteFec[0]).after( GXutil.resetTime( A11665LoteFec )) ) )
         {
            A396EmprCod = T01SA10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01SA10_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11664LoteID = T01SA10_A11664LoteID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = T01SA10_A11665LoteFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            RcdFound1632 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1632 = (short)(0) ;
      /* Using cursor T01SA11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A11664LoteID, A11664LoteID, A719PrdNum, A396EmprCod, A11665LoteFec});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA11_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SA11_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA11_A11664LoteID[0], A11664LoteID) > 0 ) || ( GXutil.strcmp(T01SA11_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01SA11_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01SA11_A11665LoteFec[0]).after( GXutil.resetTime( A11665LoteFec )) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA11_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SA11_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SA11_A11664LoteID[0], A11664LoteID) < 0 ) || ( GXutil.strcmp(T01SA11_A11664LoteID[0], A11664LoteID) == 0 ) && ( GXutil.strcmp(T01SA11_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SA11_A396EmprCod[0], A396EmprCod) == 0 ) && GXutil.resetTime(T01SA11_A11665LoteFec[0]).before( GXutil.resetTime( A11665LoteFec )) ) )
         {
            A396EmprCod = T01SA11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01SA11_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A11664LoteID = T01SA11_A11664LoteID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
            A11665LoteFec = T01SA11_A11665LoteFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
            RcdFound1632 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SA1632( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SA1632( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1632 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A11664LoteID = Z11664LoteID ;
               httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
               A11665LoteFec = Z11665LoteFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
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
               update1SA1632( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SA1632( ) ;
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
                  insert1SA1632( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A11664LoteID, Z11664LoteID) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A11665LoteFec), GXutil.resetTime(Z11665LoteFec)) ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11664LoteID = Z11664LoteID ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = Z11665LoteFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
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
      if ( RcdFound1632 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtLotePed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SA1632( ) ;
      if ( RcdFound1632 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLotePed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SA1632( ) ;
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
      if ( RcdFound1632 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLotePed_Internalname ;
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
      if ( RcdFound1632 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLotePed_Internalname ;
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
      scanStart1SA1632( ) ;
      if ( RcdFound1632 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1632 != 0 )
         {
            scanNext1SA1632( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtLotePed_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SA1632( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1SA1632( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SA2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z11666LotePed != T01SA2_A11666LotePed[0] ) || ( GXutil.strcmp(Z11667LoteCtf, T01SA2_A11667LoteCtf[0]) != 0 ) || ( GXutil.strcmp(Z11668LoteCon, T01SA2_A11668LoteCon[0]) != 0 ) || ( GXutil.strcmp(Z11711LoteCtfNm, T01SA2_A11711LoteCtfNm[0]) != 0 ) || ( GXutil.strcmp(Z12352LoteCtfNF, T01SA2_A12352LoteCtfNF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14017LoteNEmb != T01SA2_A14017LoteNEmb[0] ) )
         {
            if ( Z11666LotePed != T01SA2_A11666LotePed[0] )
            {
               GXutil.writeLogln("stocksquimicos.lotesproductosquimicos:[seudo value changed for attri]"+"LotePed");
               GXutil.writeLogRaw("Old: ",Z11666LotePed);
               GXutil.writeLogRaw("Current: ",T01SA2_A11666LotePed[0]);
            }
            if ( GXutil.strcmp(Z11667LoteCtf, T01SA2_A11667LoteCtf[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotesproductosquimicos:[seudo value changed for attri]"+"LoteCtf");
               GXutil.writeLogRaw("Old: ",Z11667LoteCtf);
               GXutil.writeLogRaw("Current: ",T01SA2_A11667LoteCtf[0]);
            }
            if ( GXutil.strcmp(Z11668LoteCon, T01SA2_A11668LoteCon[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotesproductosquimicos:[seudo value changed for attri]"+"LoteCon");
               GXutil.writeLogRaw("Old: ",Z11668LoteCon);
               GXutil.writeLogRaw("Current: ",T01SA2_A11668LoteCon[0]);
            }
            if ( GXutil.strcmp(Z11711LoteCtfNm, T01SA2_A11711LoteCtfNm[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotesproductosquimicos:[seudo value changed for attri]"+"LoteCtfNm");
               GXutil.writeLogRaw("Old: ",Z11711LoteCtfNm);
               GXutil.writeLogRaw("Current: ",T01SA2_A11711LoteCtfNm[0]);
            }
            if ( GXutil.strcmp(Z12352LoteCtfNF, T01SA2_A12352LoteCtfNF[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.lotesproductosquimicos:[seudo value changed for attri]"+"LoteCtfNF");
               GXutil.writeLogRaw("Old: ",Z12352LoteCtfNF);
               GXutil.writeLogRaw("Current: ",T01SA2_A12352LoteCtfNF[0]);
            }
            if ( Z14017LoteNEmb != T01SA2_A14017LoteNEmb[0] )
            {
               GXutil.writeLogln("stocksquimicos.lotesproductosquimicos:[seudo value changed for attri]"+"LoteNEmb");
               GXutil.writeLogRaw("Old: ",Z14017LoteNEmb);
               GXutil.writeLogRaw("Current: ",T01SA2_A14017LoteNEmb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLOTPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SA1632( )
   {
      beforeValidate1SA1632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SA1632( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SA1632( 0) ;
         checkOptimisticConcurrency1SA1632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SA1632( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SA1632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SA12 */
                  pr_default.execute(10, new Object[] {A11664LoteID, A11665LoteFec, Integer.valueOf(A11666LotePed), A11667LoteCtf, A11668LoteCon, A11711LoteCtfNm, A12352LoteCtfNF, Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
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
                        resetCaption1SA0( ) ;
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
            load1SA1632( ) ;
         }
         endLevel1SA1632( ) ;
      }
      closeExtendedTableCursors1SA1632( ) ;
   }

   public void update1SA1632( )
   {
      beforeValidate1SA1632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SA1632( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SA1632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SA1632( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SA1632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SA13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A11666LotePed), A11667LoteCtf, A11668LoteCon, A11711LoteCtfNm, A12352LoteCtfNF, Short.valueOf(A14017LoteNEmb), A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SA1632( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1SA0( ) ;
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
         endLevel1SA1632( ) ;
      }
      closeExtendedTableCursors1SA1632( ) ;
   }

   public void deferredUpdate1SA1632( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SA1632( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SA1632( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SA1632( ) ;
         afterConfirm1SA1632( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SA1632( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SA14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A719PrdNum, A11664LoteID, A11665LoteFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound1632 == 0 )
                     {
                        initAll1SA1632( ) ;
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
                     resetCaption1SA0( ) ;
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
      sMode1632 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SA1632( ) ;
      Gx_mode = sMode1632 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SA1632( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SA15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01SA15_A407EmprNom[0] ;
         n407EmprNom = T01SA15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T01SA16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01SA16_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         pr_default.close(14);
      }
   }

   public void endLevel1SA1632( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SA1632( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.lotesproductosquimicos");
         if ( AnyError == 0 )
         {
            confirmValues1SA0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.lotesproductosquimicos");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SA1632( )
   {
      /* Using cursor T01SA17 */
      pr_default.execute(15);
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A396EmprCod = T01SA17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SA17_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11664LoteID = T01SA17_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01SA17_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SA1632( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A396EmprCod = T01SA17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SA17_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A11664LoteID = T01SA17_A11664LoteID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
         A11665LoteFec = T01SA17_A11665LoteFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      }
   }

   public void scanEnd1SA1632( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1SA1632( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SA1632( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SA1632( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SA1632( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SA1632( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SA1632( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SA1632( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtLoteFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), true);
      edtLoteID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), true);
      edtLotePed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), true);
      edtLoteCtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtf_Enabled), 5, 0), true);
      edtLoteCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCon_Enabled), 5, 0), true);
      edtLoteCtfNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNm_Enabled), 5, 0), true);
      edtLoteCtfNF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNF_Enabled), 5, 0), true);
      edtLoteNEmb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteNEmb_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SA1632( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SA0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.lotesproductosquimicos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z11664LoteID", GXutil.rtrim( Z11664LoteID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11665LoteFec", localUtil.dtoc( Z11665LoteFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11666LotePed", GXutil.ltrim( localUtil.ntoc( Z11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11667LoteCtf", GXutil.rtrim( Z11667LoteCtf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11668LoteCon", GXutil.rtrim( Z11668LoteCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11711LoteCtfNm", GXutil.rtrim( Z11711LoteCtfNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12352LoteCtfNF", GXutil.rtrim( Z12352LoteCtfNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14017LoteNEmb", GXutil.ltrim( localUtil.ntoc( Z14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.stocksquimicos.lotesproductosquimicos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.LotesProductosQuimicos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lotes Productos Quimicos", "") ;
   }

   public void initializeNonKey1SA1632( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A11666LotePed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11666LotePed), 8, 0));
      A11667LoteCtf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", A11667LoteCtf);
      A11668LoteCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", A11668LoteCon);
      A11711LoteCtfNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", A11711LoteCtfNm);
      A12352LoteCtfNF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", A12352LoteCtfNF);
      A14017LoteNEmb = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14017LoteNEmb), 4, 0));
      Z11666LotePed = 0 ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
      Z14017LoteNEmb = (short)(0) ;
   }

   public void initAll1SA1632( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A11664LoteID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11664LoteID", A11664LoteID);
      A11665LoteFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11665LoteFec", localUtil.format(A11665LoteFec, "99/99/99"));
      initializeNonKey1SA1632( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415113847", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/lotesproductosquimicos.js", "?202682415113847", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtLoteFec_Internalname = "LOTEFEC" ;
      edtLoteID_Internalname = "LOTEID" ;
      edtLotePed_Internalname = "LOTEPED" ;
      edtLoteCtf_Internalname = "LOTECTF" ;
      edtLoteCon_Internalname = "LOTECON" ;
      edtLoteCtfNm_Internalname = "LOTECTFNM" ;
      edtLoteCtfNF_Internalname = "LOTECTFNF" ;
      edtLoteNEmb_Internalname = "LOTENEMB" ;
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
      Form.setCaption( httpContext.getMessage( "Lotes Productos Quimicos", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtLoteNEmb_Jsonclick = "" ;
      edtLoteNEmb_Enabled = 1 ;
      edtLoteCtfNF_Jsonclick = "" ;
      edtLoteCtfNF_Enabled = 1 ;
      edtLoteCtfNm_Jsonclick = "" ;
      edtLoteCtfNm_Enabled = 1 ;
      edtLoteCon_Jsonclick = "" ;
      edtLoteCon_Enabled = 1 ;
      edtLoteCtf_Jsonclick = "" ;
      edtLoteCtf_Enabled = 1 ;
      edtLotePed_Jsonclick = "" ;
      edtLotePed_Enabled = 1 ;
      edtLoteID_Jsonclick = "" ;
      edtLoteID_Enabled = 1 ;
      edtLoteFec_Jsonclick = "" ;
      edtLoteFec_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
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
      /* Using cursor T01SA15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SA15_A407EmprNom[0] ;
      n407EmprNom = T01SA15_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(13);
      /* Using cursor T01SA16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SA16_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(14);
      GX_FocusControl = edtLotePed_Internalname ;
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
      /* Using cursor T01SA15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SA15_A407EmprNom[0] ;
      n407EmprNom = T01SA15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01SA16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01SA16_A718PrdNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Loteid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11666LotePed", GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11667LoteCtf", GXutil.rtrim( A11667LoteCtf));
      httpContext.ajax_rsp_assign_attri("", false, "A11668LoteCon", GXutil.rtrim( A11668LoteCon));
      httpContext.ajax_rsp_assign_attri("", false, "A11711LoteCtfNm", GXutil.rtrim( A11711LoteCtfNm));
      httpContext.ajax_rsp_assign_attri("", false, "A12352LoteCtfNF", GXutil.rtrim( A12352LoteCtfNF));
      httpContext.ajax_rsp_assign_attri("", false, "A14017LoteNEmb", GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11664LoteID", GXutil.rtrim( Z11664LoteID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11665LoteFec", localUtil.format(Z11665LoteFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11666LotePed", GXutil.ltrim( localUtil.ntoc( Z11666LotePed, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11667LoteCtf", GXutil.rtrim( Z11667LoteCtf));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11668LoteCon", GXutil.rtrim( Z11668LoteCon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11711LoteCtfNm", GXutil.rtrim( Z11711LoteCtfNm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12352LoteCtfNF", GXutil.rtrim( Z12352LoteCtfNF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14017LoteNEmb", GXutil.ltrim( localUtil.ntoc( Z14017LoteNEmb, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_LOTEFEC","{handler:'valid_Lotefec',iparms:[]");
      setEventMetadata("VALID_LOTEFEC",",oparms:[]}");
      setEventMetadata("VALID_LOTEID","{handler:'valid_Loteid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A11664LoteID',fld:'LOTEID',pic:''},{av:'A11665LoteFec',fld:'LOTEFEC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_LOTEID",",oparms:[{av:'A11666LotePed',fld:'LOTEPED',pic:'ZZZZZZZ9'},{av:'A11667LoteCtf',fld:'LOTECTF',pic:'@!'},{av:'A11668LoteCon',fld:'LOTECON',pic:'@!'},{av:'A11711LoteCtfNm',fld:'LOTECTFNM',pic:''},{av:'A12352LoteCtfNF',fld:'LOTECTFNF',pic:''},{av:'A14017LoteNEmb',fld:'LOTENEMB',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z11664LoteID'},{av:'Z11665LoteFec'},{av:'Z11666LotePed'},{av:'Z11667LoteCtf'},{av:'Z11668LoteCon'},{av:'Z11711LoteCtfNm'},{av:'Z12352LoteCtfNF'},{av:'Z14017LoteNEmb'},{av:'Z407EmprNom'},{av:'Z718PrdNom'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z11664LoteID = "" ;
      Z11665LoteFec = GXutil.nullDate() ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
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
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      A11664LoteID = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
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
      Z718PrdNom = "" ;
      T01SA6_A11664LoteID = new String[] {""} ;
      T01SA6_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SA6_A407EmprNom = new String[] {""} ;
      T01SA6_n407EmprNom = new boolean[] {false} ;
      T01SA6_A718PrdNom = new String[] {""} ;
      T01SA6_A11666LotePed = new int[1] ;
      T01SA6_A11667LoteCtf = new String[] {""} ;
      T01SA6_A11668LoteCon = new String[] {""} ;
      T01SA6_A11711LoteCtfNm = new String[] {""} ;
      T01SA6_A12352LoteCtfNF = new String[] {""} ;
      T01SA6_A14017LoteNEmb = new short[1] ;
      T01SA6_A396EmprCod = new String[] {""} ;
      T01SA6_A719PrdNum = new String[] {""} ;
      T01SA4_A407EmprNom = new String[] {""} ;
      T01SA4_n407EmprNom = new boolean[] {false} ;
      T01SA5_A718PrdNom = new String[] {""} ;
      T01SA7_A407EmprNom = new String[] {""} ;
      T01SA7_n407EmprNom = new boolean[] {false} ;
      T01SA8_A718PrdNom = new String[] {""} ;
      T01SA9_A396EmprCod = new String[] {""} ;
      T01SA9_A719PrdNum = new String[] {""} ;
      T01SA9_A11664LoteID = new String[] {""} ;
      T01SA9_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SA3_A11664LoteID = new String[] {""} ;
      T01SA3_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SA3_A11666LotePed = new int[1] ;
      T01SA3_A11667LoteCtf = new String[] {""} ;
      T01SA3_A11668LoteCon = new String[] {""} ;
      T01SA3_A11711LoteCtfNm = new String[] {""} ;
      T01SA3_A12352LoteCtfNF = new String[] {""} ;
      T01SA3_A14017LoteNEmb = new short[1] ;
      T01SA3_A396EmprCod = new String[] {""} ;
      T01SA3_A719PrdNum = new String[] {""} ;
      sMode1632 = "" ;
      T01SA10_A396EmprCod = new String[] {""} ;
      T01SA10_A719PrdNum = new String[] {""} ;
      T01SA10_A11664LoteID = new String[] {""} ;
      T01SA10_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SA11_A396EmprCod = new String[] {""} ;
      T01SA11_A719PrdNum = new String[] {""} ;
      T01SA11_A11664LoteID = new String[] {""} ;
      T01SA11_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SA2_A11664LoteID = new String[] {""} ;
      T01SA2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SA2_A11666LotePed = new int[1] ;
      T01SA2_A11667LoteCtf = new String[] {""} ;
      T01SA2_A11668LoteCon = new String[] {""} ;
      T01SA2_A11711LoteCtfNm = new String[] {""} ;
      T01SA2_A12352LoteCtfNF = new String[] {""} ;
      T01SA2_A14017LoteNEmb = new short[1] ;
      T01SA2_A396EmprCod = new String[] {""} ;
      T01SA2_A719PrdNum = new String[] {""} ;
      T01SA15_A407EmprNom = new String[] {""} ;
      T01SA15_n407EmprNom = new boolean[] {false} ;
      T01SA16_A718PrdNom = new String[] {""} ;
      T01SA17_A396EmprCod = new String[] {""} ;
      T01SA17_A719PrdNum = new String[] {""} ;
      T01SA17_A11664LoteID = new String[] {""} ;
      T01SA17_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ11664LoteID = "" ;
      ZZ11665LoteFec = GXutil.nullDate() ;
      ZZ11667LoteCtf = "" ;
      ZZ11668LoteCon = "" ;
      ZZ11711LoteCtfNm = "" ;
      ZZ12352LoteCtfNF = "" ;
      ZZ407EmprNom = "" ;
      ZZ718PrdNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotesproductosquimicos__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotesproductosquimicos__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotesproductosquimicos__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotesproductosquimicos__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.lotesproductosquimicos__default(),
         new Object[] {
             new Object[] {
            T01SA2_A11664LoteID, T01SA2_A11665LoteFec, T01SA2_A11666LotePed, T01SA2_A11667LoteCtf, T01SA2_A11668LoteCon, T01SA2_A11711LoteCtfNm, T01SA2_A12352LoteCtfNF, T01SA2_A14017LoteNEmb, T01SA2_A396EmprCod, T01SA2_A719PrdNum
            }
            , new Object[] {
            T01SA3_A11664LoteID, T01SA3_A11665LoteFec, T01SA3_A11666LotePed, T01SA3_A11667LoteCtf, T01SA3_A11668LoteCon, T01SA3_A11711LoteCtfNm, T01SA3_A12352LoteCtfNF, T01SA3_A14017LoteNEmb, T01SA3_A396EmprCod, T01SA3_A719PrdNum
            }
            , new Object[] {
            T01SA4_A407EmprNom, T01SA4_n407EmprNom
            }
            , new Object[] {
            T01SA5_A718PrdNom
            }
            , new Object[] {
            T01SA6_A11664LoteID, T01SA6_A11665LoteFec, T01SA6_A407EmprNom, T01SA6_n407EmprNom, T01SA6_A718PrdNom, T01SA6_A11666LotePed, T01SA6_A11667LoteCtf, T01SA6_A11668LoteCon, T01SA6_A11711LoteCtfNm, T01SA6_A12352LoteCtfNF,
            T01SA6_A14017LoteNEmb, T01SA6_A396EmprCod, T01SA6_A719PrdNum
            }
            , new Object[] {
            T01SA7_A407EmprNom, T01SA7_n407EmprNom
            }
            , new Object[] {
            T01SA8_A718PrdNom
            }
            , new Object[] {
            T01SA9_A396EmprCod, T01SA9_A719PrdNum, T01SA9_A11664LoteID, T01SA9_A11665LoteFec
            }
            , new Object[] {
            T01SA10_A396EmprCod, T01SA10_A719PrdNum, T01SA10_A11664LoteID, T01SA10_A11665LoteFec
            }
            , new Object[] {
            T01SA11_A396EmprCod, T01SA11_A719PrdNum, T01SA11_A11664LoteID, T01SA11_A11665LoteFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SA15_A407EmprNom, T01SA15_n407EmprNom
            }
            , new Object[] {
            T01SA16_A718PrdNom
            }
            , new Object[] {
            T01SA17_A396EmprCod, T01SA17_A719PrdNum, T01SA17_A11664LoteID, T01SA17_A11665LoteFec
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z14017LoteNEmb ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14017LoteNEmb ;
   private short RcdFound1632 ;
   private short nIsDirty_1632 ;
   private short ZZ14017LoteNEmb ;
   private int Z11666LotePed ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtLoteFec_Enabled ;
   private int edtLoteID_Enabled ;
   private int A11666LotePed ;
   private int edtLotePed_Enabled ;
   private int edtLoteCtf_Enabled ;
   private int edtLoteCon_Enabled ;
   private int edtLoteCtfNm_Enabled ;
   private int edtLoteCtfNF_Enabled ;
   private int edtLoteNEmb_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ11666LotePed ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z11664LoteID ;
   private String Z11667LoteCtf ;
   private String Z11668LoteCon ;
   private String Z11711LoteCtfNm ;
   private String Z12352LoteCtfNF ;
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
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtLoteFec_Internalname ;
   private String edtLoteFec_Jsonclick ;
   private String edtLoteID_Internalname ;
   private String A11664LoteID ;
   private String edtLoteID_Jsonclick ;
   private String edtLotePed_Internalname ;
   private String edtLotePed_Jsonclick ;
   private String edtLoteCtf_Internalname ;
   private String A11667LoteCtf ;
   private String edtLoteCtf_Jsonclick ;
   private String edtLoteCon_Internalname ;
   private String A11668LoteCon ;
   private String edtLoteCon_Jsonclick ;
   private String edtLoteCtfNm_Internalname ;
   private String A11711LoteCtfNm ;
   private String edtLoteCtfNm_Jsonclick ;
   private String edtLoteCtfNF_Internalname ;
   private String A12352LoteCtfNF ;
   private String edtLoteCtfNF_Jsonclick ;
   private String edtLoteNEmb_Internalname ;
   private String edtLoteNEmb_Jsonclick ;
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
   private String Z718PrdNom ;
   private String sMode1632 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ11664LoteID ;
   private String ZZ11667LoteCtf ;
   private String ZZ11668LoteCon ;
   private String ZZ11711LoteCtfNm ;
   private String ZZ12352LoteCtfNF ;
   private String ZZ407EmprNom ;
   private String ZZ718PrdNom ;
   private java.util.Date Z11665LoteFec ;
   private java.util.Date A11665LoteFec ;
   private java.util.Date ZZ11665LoteFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private String[] T01SA6_A11664LoteID ;
   private java.util.Date[] T01SA6_A11665LoteFec ;
   private String[] T01SA6_A407EmprNom ;
   private boolean[] T01SA6_n407EmprNom ;
   private String[] T01SA6_A718PrdNom ;
   private int[] T01SA6_A11666LotePed ;
   private String[] T01SA6_A11667LoteCtf ;
   private String[] T01SA6_A11668LoteCon ;
   private String[] T01SA6_A11711LoteCtfNm ;
   private String[] T01SA6_A12352LoteCtfNF ;
   private short[] T01SA6_A14017LoteNEmb ;
   private String[] T01SA6_A396EmprCod ;
   private String[] T01SA6_A719PrdNum ;
   private String[] T01SA4_A407EmprNom ;
   private boolean[] T01SA4_n407EmprNom ;
   private String[] T01SA5_A718PrdNom ;
   private String[] T01SA7_A407EmprNom ;
   private boolean[] T01SA7_n407EmprNom ;
   private String[] T01SA8_A718PrdNom ;
   private String[] T01SA9_A396EmprCod ;
   private String[] T01SA9_A719PrdNum ;
   private String[] T01SA9_A11664LoteID ;
   private java.util.Date[] T01SA9_A11665LoteFec ;
   private String[] T01SA3_A11664LoteID ;
   private java.util.Date[] T01SA3_A11665LoteFec ;
   private int[] T01SA3_A11666LotePed ;
   private String[] T01SA3_A11667LoteCtf ;
   private String[] T01SA3_A11668LoteCon ;
   private String[] T01SA3_A11711LoteCtfNm ;
   private String[] T01SA3_A12352LoteCtfNF ;
   private short[] T01SA3_A14017LoteNEmb ;
   private String[] T01SA3_A396EmprCod ;
   private String[] T01SA3_A719PrdNum ;
   private String[] T01SA10_A396EmprCod ;
   private String[] T01SA10_A719PrdNum ;
   private String[] T01SA10_A11664LoteID ;
   private java.util.Date[] T01SA10_A11665LoteFec ;
   private String[] T01SA11_A396EmprCod ;
   private String[] T01SA11_A719PrdNum ;
   private String[] T01SA11_A11664LoteID ;
   private java.util.Date[] T01SA11_A11665LoteFec ;
   private String[] T01SA2_A11664LoteID ;
   private java.util.Date[] T01SA2_A11665LoteFec ;
   private int[] T01SA2_A11666LotePed ;
   private String[] T01SA2_A11667LoteCtf ;
   private String[] T01SA2_A11668LoteCon ;
   private String[] T01SA2_A11711LoteCtfNm ;
   private String[] T01SA2_A12352LoteCtfNF ;
   private short[] T01SA2_A14017LoteNEmb ;
   private String[] T01SA2_A396EmprCod ;
   private String[] T01SA2_A719PrdNum ;
   private String[] T01SA15_A407EmprNom ;
   private boolean[] T01SA15_n407EmprNom ;
   private String[] T01SA16_A718PrdNom ;
   private String[] T01SA17_A396EmprCod ;
   private String[] T01SA17_A719PrdNum ;
   private String[] T01SA17_A11664LoteID ;
   private java.util.Date[] T01SA17_A11665LoteFec ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lotesproductosquimicos__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotesproductosquimicos__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotesproductosquimicos__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotesproductosquimicos__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lotesproductosquimicos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SA2", "SELECT LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb, EmprCod, PrdNum FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?  FOR UPDATE OF LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA3", "SELECT LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb, EmprCod, PrdNum FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA5", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA6", "SELECT /*+ FIRST_ROWS(100) */ TM1.LoteID, TM1.LoteFec, T2.EmprNom, T3.PrdNom, TM1.LotePed, TM1.LoteCtf, TM1.LoteCon, TM1.LoteCtfNm, TM1.LoteCtfNF, TM1.LoteNEmb, TM1.EmprCod, TM1.PrdNum FROM ((TXPLOTPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.LoteID = ? and TM1.LoteFec = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.LoteID, TM1.LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA8", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and LoteID > ? or LoteID = ? and PrdNum = ? and EmprCod = ? and LoteFec > ?) ORDER BY EmprCod, PrdNum, LoteID, LoteFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SA11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and LoteID < ? or LoteID = ? and PrdNum = ? and EmprCod = ? and LoteFec < ?) ORDER BY EmprCod DESC, PrdNum DESC, LoteID DESC, LoteFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SA12", "INSERT INTO TXPLOTPRD(LoteID, LoteFec, LotePed, LoteCtf, LoteCon, LoteCtfNm, LoteCtfNF, LoteNEmb, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01SA13", "UPDATE TXPLOTPRD SET LotePed=?, LoteCtf=?, LoteCon=?, LoteCtfNm=?, LoteCtfNF=?, LoteNEmb=?  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01SA14", "DELETE FROM TXPLOTPRD  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new ForEachCursor("T01SA15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA16", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SA17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD ORDER BY EmprCod, PrdNum, LoteID, LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 50);
               ((String[]) buf[6])[0] = rslt.getString(7, 50);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 50);
               ((String[]) buf[9])[0] = rslt.getString(9, 50);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 26);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 26);
               stmt.setString(7, (String)parms[6], 26);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 50);
               stmt.setString(7, (String)parms[6], 50);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 50);
               stmt.setString(5, (String)parms[4], 50);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setString(9, (String)parms[8], 26);
               stmt.setDate(10, (java.util.Date)parms[9]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setDate(4, (java.util.Date)parms[3]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

