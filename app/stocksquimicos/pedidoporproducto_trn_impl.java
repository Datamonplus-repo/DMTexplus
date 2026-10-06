package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class pedidoporproducto_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
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
         gxload_6( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Pedido por Producto", ""), (short)(0)) ;
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

   public pedidoporproducto_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public pedidoporproducto_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pedidoporproducto_trn_impl.class ));
   }

   public pedidoporproducto_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Pedido por Producto", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFec_Internalname, httpContext.getMessage( "Fecha Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPedFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFec_Internalname, localUtil.format(A661PedFec, "99/99/99"), localUtil.format( A661PedFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFecEnt_Internalname, httpContext.getMessage( "Fecha Entrega Prevista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtPedFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFecEnt_Internalname, localUtil.format(A662PedFecEnt, "99/99/99"), localUtil.format( A662PedFecEnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFecEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedSit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedSit_Internalname, httpContext.getMessage( "Situacion  (S=cum. N= no cum.)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedSit_Internalname, GXutil.rtrim( A667PedSit), GXutil.rtrim( localUtil.format( A667PedSit, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedSit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedSit_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedUni_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedUni_Internalname, GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedUni_Enabled!=0) ? localUtil.format( A669PedUni, "ZZZZZ9.99") : localUtil.format( A669PedUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedUni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCanEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCanEnt_Internalname, httpContext.getMessage( "Cantidad Entregada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCanEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedCanEnt_Enabled!=0) ? localUtil.format( A657PedCanEnt, "ZZZZZ9.99") : localUtil.format( A657PedCanEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCanEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedCanEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPre_Internalname, httpContext.getMessage( "Precio Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPre_Internalname, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedPre_Enabled!=0) ? localUtil.format( A665PedPre, "ZZZZZZZ9.999") : localUtil.format( A665PedPre, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedPre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedDto_Internalname, httpContext.getMessage( "Descuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedDto_Internalname, GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedDto_Enabled!=0) ? localUtil.format( A660PedDto, "Z9.99") : localUtil.format( A660PedDto, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedDto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedVal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedVal_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedVal_Internalname, GXutil.ltrim( localUtil.ntoc( A670PedVal, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedVal_Enabled!=0) ? localUtil.format( A670PedVal, "ZZZ,ZZZ,ZZ9.99") : localUtil.format( A670PedVal, "ZZZ,ZZZ,ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedVal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedVal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCum_Internalname, httpContext.getMessage( "Cumplimentado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCum_Internalname, GXutil.rtrim( A659PedCum), GXutil.rtrim( localUtil.format( A659PedCum, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedCum_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFulEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFulEnt_Internalname, httpContext.getMessage( "Fecha Ultima Entrega", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPedFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFulEnt_Internalname, localUtil.format(A663PedFulEnt, "99/99/99"), localUtil.format( A663PedFulEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFulEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanPen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanPen_Internalname, httpContext.getMessage( "Cantidad Pendiente Recibir", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedNumCoP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedNumCoP_Internalname, httpContext.getMessage( "No.Contenedores Pedidos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedNumCoP_Internalname, GXutil.ltrim( localUtil.ntoc( A3372PedNumCoP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedNumCoP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3372PedNumCoP), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3372PedNumCoP), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedNumCoP_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedNumCoP_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedConInP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedConInP_Internalname, httpContext.getMessage( "Contenedor Inicial Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedConInP_Internalname, GXutil.ltrim( localUtil.ntoc( A3373PedConInP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedConInP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3373PedConInP), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3373PedConInP), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedConInP_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedConInP_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedConFiP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedConFiP_Internalname, httpContext.getMessage( "Contenedor Final Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedConFiP_Internalname, GXutil.ltrim( localUtil.ntoc( A3374PedConFiP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedConFiP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3374PedConFiP), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3374PedConFiP), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedConFiP_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedConFiP_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedNumCoE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedNumCoE_Internalname, httpContext.getMessage( "No.Contenedores Entregados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedNumCoE_Internalname, GXutil.ltrim( localUtil.ntoc( A3375PedNumCoE, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedNumCoE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3375PedNumCoE), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3375PedNumCoE), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedNumCoE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedNumCoE_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedConInE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedConInE_Internalname, httpContext.getMessage( "Contenedor Inicial Entregado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedConInE_Internalname, GXutil.ltrim( localUtil.ntoc( A3376PedConInE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedConInE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3376PedConInE), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3376PedConInE), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedConInE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedConInE_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedConFiE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedConFiE_Internalname, httpContext.getMessage( "Contenedor Final Entregado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedConFiE_Internalname, GXutil.ltrim( localUtil.ntoc( A3377PedConFiE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedConFiE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3377PedConFiE), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3377PedConFiE), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedConFiE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedConFiE_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedEtiPrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedEtiPrd_Internalname, httpContext.getMessage( "Etiqueta Prod. Listada 0No/1Si", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedEtiPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A3378PedEtiPrd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedEtiPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3378PedEtiPrd), "9") : localUtil.format( DecimalUtil.doubleToDec(A3378PedEtiPrd), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedEtiPrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedEtiPrd_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreAct_Internalname, httpContext.getMessage( "Precio Actual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedNumRq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedNumRq_Internalname, httpContext.getMessage( "Nº Requisiçao Interna", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedNumRq_Internalname, GXutil.ltrim( localUtil.ntoc( A6289PedNumRq, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedNumRq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6289PedNumRq), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6289PedNumRq), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedNumRq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedNumRq_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFecPEn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFecPEn_Internalname, httpContext.getMessage( "Fec.Prev.Entrega Linea Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPedFecPEn_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFecPEn_Internalname, localUtil.format(A8158PedFecPEn, "99/99/99"), localUtil.format( A8158PedFecPEn, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFecPEn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedFecPEn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFecPEn_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFecPEn_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedLinObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedLinObs_Internalname, httpContext.getMessage( "Linea Observacion Pedido Compr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedLinObs_Internalname, GXutil.rtrim( A8159PedLinObs), GXutil.rtrim( localUtil.format( A8159PedLinObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedLinObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedLinObs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedValForm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedValForm_Internalname, httpContext.getMessage( "Valor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedValForm_Internalname, GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedValForm_Enabled!=0) ? localUtil.format( A13787PedValForm, "ZZZZZZZZ9.99") : localUtil.format( A13787PedValForm, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedValForm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPedValForm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCantPdte_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCantPdte_Internalname, httpContext.getMessage( "Cant Pdte", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCantPdte_Internalname, GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCantPdte_Enabled!=0) ? localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99") : localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCantPdte_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCantPdte_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\PedidoporProducto_TRN.htm");
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
         Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z669PedUni = localUtil.ctond( httpContext.cgiGet( "Z669PedUni")) ;
         Z657PedCanEnt = localUtil.ctond( httpContext.cgiGet( "Z657PedCanEnt")) ;
         Z665PedPre = localUtil.ctond( httpContext.cgiGet( "Z665PedPre")) ;
         Z660PedDto = localUtil.ctond( httpContext.cgiGet( "Z660PedDto")) ;
         Z670PedVal = localUtil.ctond( httpContext.cgiGet( "Z670PedVal")) ;
         Z659PedCum = httpContext.cgiGet( "Z659PedCum") ;
         Z663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "Z663PedFulEnt"), 0) ;
         Z3372PedNumCoP = (short)(localUtil.ctol( httpContext.cgiGet( "Z3372PedNumCoP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3373PedConInP = (int)(localUtil.ctol( httpContext.cgiGet( "Z3373PedConInP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3374PedConFiP = (int)(localUtil.ctol( httpContext.cgiGet( "Z3374PedConFiP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3375PedNumCoE = (short)(localUtil.ctol( httpContext.cgiGet( "Z3375PedNumCoE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3376PedConInE = (int)(localUtil.ctol( httpContext.cgiGet( "Z3376PedConInE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3377PedConFiE = (int)(localUtil.ctol( httpContext.cgiGet( "Z3377PedConFiE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3378PedEtiPrd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3378PedEtiPrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6289PedNumRq = (int)(localUtil.ctol( httpContext.cgiGet( "Z6289PedNumRq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8158PedFecPEn = localUtil.ctod( httpContext.cgiGet( "Z8158PedFecPEn"), 0) ;
         Z8159PedLinObs = httpContext.cgiGet( "Z8159PedLinObs") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A658PedCod = 0 ;
            n658PedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         }
         else
         {
            A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n658PedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         }
         A661PedFec = localUtil.ctod( httpContext.cgiGet( edtPedFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A662PedFecEnt = localUtil.ctod( httpContext.cgiGet( edtPedFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A667PedSit = GXutil.upper( httpContext.cgiGet( edtPedSit_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDUNI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A669PedUni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         }
         else
         {
            A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCANENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCanEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A657PedCanEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         else
         {
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A665PedPre = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         }
         else
         {
            A665PedPre = localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDDTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedDto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A660PedDto = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         }
         else
         {
            A660PedDto = localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedVal_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedVal_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDVAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedVal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A670PedVal = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A670PedVal", GXutil.ltrimstr( A670PedVal, 12, 2));
         }
         else
         {
            A670PedVal = localUtil.ctond( httpContext.cgiGet( edtPedVal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A670PedVal", GXutil.ltrimstr( A670PedVal, 12, 2));
         }
         A659PedCum = GXutil.upper( httpContext.cgiGet( edtPedCum_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
         if ( localUtil.vcdate( httpContext.cgiGet( edtPedFulEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDFULENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedFulEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A663PedFulEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
         }
         else
         {
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( edtPedFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
         }
         A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedNumCoP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedNumCoP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDNUMCOP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedNumCoP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3372PedNumCoP = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3372PedNumCoP), 3, 0));
         }
         else
         {
            A3372PedNumCoP = (short)(localUtil.ctol( httpContext.cgiGet( edtPedNumCoP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3372PedNumCoP), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedConInP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedConInP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCONINP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedConInP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3373PedConInP = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3373PedConInP), 8, 0));
         }
         else
         {
            A3373PedConInP = (int)(localUtil.ctol( httpContext.cgiGet( edtPedConInP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3373PedConInP), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedConFiP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedConFiP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCONFIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedConFiP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3374PedConFiP = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3374PedConFiP), 8, 0));
         }
         else
         {
            A3374PedConFiP = (int)(localUtil.ctol( httpContext.cgiGet( edtPedConFiP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3374PedConFiP), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedNumCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedNumCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDNUMCOE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedNumCoE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3375PedNumCoE = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3375PedNumCoE), 3, 0));
         }
         else
         {
            A3375PedNumCoE = (short)(localUtil.ctol( httpContext.cgiGet( edtPedNumCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3375PedNumCoE), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedConInE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedConInE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCONINE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedConInE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3376PedConInE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3376PedConInE), 8, 0));
         }
         else
         {
            A3376PedConInE = (int)(localUtil.ctol( httpContext.cgiGet( edtPedConInE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3376PedConInE), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedConFiE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedConFiE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCONFIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedConFiE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3377PedConFiE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3377PedConFiE), 8, 0));
         }
         else
         {
            A3377PedConFiE = (int)(localUtil.ctol( httpContext.cgiGet( edtPedConFiE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3377PedConFiE), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedEtiPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedEtiPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDETIPRD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedEtiPrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3378PedEtiPrd = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.str( A3378PedEtiPrd, 1, 0));
         }
         else
         {
            A3378PedEtiPrd = (byte)(localUtil.ctol( httpContext.cgiGet( edtPedEtiPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.str( A3378PedEtiPrd, 1, 0));
         }
         A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedNumRq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedNumRq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDNUMRQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedNumRq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6289PedNumRq = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6289PedNumRq), 8, 0));
         }
         else
         {
            A6289PedNumRq = (int)(localUtil.ctol( httpContext.cgiGet( edtPedNumRq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6289PedNumRq), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPedFecPEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDFECPEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedFecPEn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8158PedFecPEn = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A8158PedFecPEn", localUtil.format(A8158PedFecPEn, "99/99/99"));
         }
         else
         {
            A8158PedFecPEn = localUtil.ctod( httpContext.cgiGet( edtPedFecPEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8158PedFecPEn", localUtil.format(A8158PedFecPEn, "99/99/99"));
         }
         A8159PedLinObs = httpContext.cgiGet( edtPedLinObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8159PedLinObs", A8159PedLinObs);
         A13787PedValForm = localUtil.ctond( httpContext.cgiGet( edtPedValForm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13787PedValForm", GXutil.ltrimstr( A13787PedValForm, 12, 2));
         A13833CantPdte = localUtil.ctond( httpContext.cgiGet( edtCantPdte_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
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
            A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
            n658PedCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
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
            initAll1SJ77( ) ;
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
      disableAttributes1SJ77( ) ;
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

   public void resetCaption1SJ0( )
   {
   }

   public void zm1SJ77( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z669PedUni = T01SJ3_A669PedUni[0] ;
            Z657PedCanEnt = T01SJ3_A657PedCanEnt[0] ;
            Z665PedPre = T01SJ3_A665PedPre[0] ;
            Z660PedDto = T01SJ3_A660PedDto[0] ;
            Z670PedVal = T01SJ3_A670PedVal[0] ;
            Z659PedCum = T01SJ3_A659PedCum[0] ;
            Z663PedFulEnt = T01SJ3_A663PedFulEnt[0] ;
            Z3372PedNumCoP = T01SJ3_A3372PedNumCoP[0] ;
            Z3373PedConInP = T01SJ3_A3373PedConInP[0] ;
            Z3374PedConFiP = T01SJ3_A3374PedConFiP[0] ;
            Z3375PedNumCoE = T01SJ3_A3375PedNumCoE[0] ;
            Z3376PedConInE = T01SJ3_A3376PedConInE[0] ;
            Z3377PedConFiE = T01SJ3_A3377PedConFiE[0] ;
            Z3378PedEtiPrd = T01SJ3_A3378PedEtiPrd[0] ;
            Z6289PedNumRq = T01SJ3_A6289PedNumRq[0] ;
            Z8158PedFecPEn = T01SJ3_A8158PedFecPEn[0] ;
            Z8159PedLinObs = T01SJ3_A8159PedLinObs[0] ;
         }
         else
         {
            Z669PedUni = A669PedUni ;
            Z657PedCanEnt = A657PedCanEnt ;
            Z665PedPre = A665PedPre ;
            Z660PedDto = A660PedDto ;
            Z670PedVal = A670PedVal ;
            Z659PedCum = A659PedCum ;
            Z663PedFulEnt = A663PedFulEnt ;
            Z3372PedNumCoP = A3372PedNumCoP ;
            Z3373PedConInP = A3373PedConInP ;
            Z3374PedConFiP = A3374PedConFiP ;
            Z3375PedNumCoE = A3375PedNumCoE ;
            Z3376PedConInE = A3376PedConInE ;
            Z3377PedConFiE = A3377PedConFiE ;
            Z3378PedEtiPrd = A3378PedEtiPrd ;
            Z6289PedNumRq = A6289PedNumRq ;
            Z8158PedFecPEn = A8158PedFecPEn ;
            Z8159PedLinObs = A8159PedLinObs ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z669PedUni = A669PedUni ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z665PedPre = A665PedPre ;
         Z660PedDto = A660PedDto ;
         Z670PedVal = A670PedVal ;
         Z659PedCum = A659PedCum ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z3372PedNumCoP = A3372PedNumCoP ;
         Z3373PedConInP = A3373PedConInP ;
         Z3374PedConFiP = A3374PedConFiP ;
         Z3375PedNumCoE = A3375PedNumCoE ;
         Z3376PedConInE = A3376PedConInE ;
         Z3377PedConFiE = A3377PedConFiE ;
         Z3378PedEtiPrd = A3378PedEtiPrd ;
         Z6289PedNumRq = A6289PedNumRq ;
         Z8158PedFecPEn = A8158PedFecPEn ;
         Z8159PedLinObs = A8159PedLinObs ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z658PedCod = A658PedCod ;
         Z661PedFec = A661PedFec ;
         Z662PedFecEnt = A662PedFecEnt ;
         Z667PedSit = A667PedSit ;
         Z718PrdNom = A718PrdNom ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z795PrvNum = A795PrvNum ;
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

   public void load1SJ77( )
   {
      /* Using cursor T01SJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound77 = (short)(1) ;
         A661PedFec = T01SJ6_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A662PedFecEnt = T01SJ6_A662PedFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A667PedSit = T01SJ6_A667PedSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
         A718PrdNom = T01SJ6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A669PedUni = T01SJ6_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A657PedCanEnt = T01SJ6_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A665PedPre = T01SJ6_A665PedPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         A660PedDto = T01SJ6_A660PedDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         A670PedVal = T01SJ6_A670PedVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670PedVal", GXutil.ltrimstr( A670PedVal, 12, 2));
         A659PedCum = T01SJ6_A659PedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
         A663PedFulEnt = T01SJ6_A663PedFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
         A684PrdCanPen = T01SJ6_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A3372PedNumCoP = T01SJ6_A3372PedNumCoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3372PedNumCoP), 3, 0));
         A3373PedConInP = T01SJ6_A3373PedConInP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3373PedConInP), 8, 0));
         A3374PedConFiP = T01SJ6_A3374PedConFiP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3374PedConFiP), 8, 0));
         A3375PedNumCoE = T01SJ6_A3375PedNumCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3375PedNumCoE), 3, 0));
         A3376PedConInE = T01SJ6_A3376PedConInE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3376PedConInE), 8, 0));
         A3377PedConFiE = T01SJ6_A3377PedConFiE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3377PedConFiE), 8, 0));
         A3378PedEtiPrd = T01SJ6_A3378PedEtiPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.str( A3378PedEtiPrd, 1, 0));
         A724PrdPreAct = T01SJ6_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A6289PedNumRq = T01SJ6_A6289PedNumRq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6289PedNumRq), 8, 0));
         A8158PedFecPEn = T01SJ6_A8158PedFecPEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8158PedFecPEn", localUtil.format(A8158PedFecPEn, "99/99/99"));
         A8159PedLinObs = T01SJ6_A8159PedLinObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8159PedLinObs", A8159PedLinObs);
         A795PrvNum = T01SJ6_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         zm1SJ77( -5) ;
      }
      pr_default.close(4);
      onLoadActions1SJ77( ) ;
   }

   public void onLoadActions1SJ77( )
   {
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
      A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13787PedValForm", GXutil.ltrimstr( A13787PedValForm, 12, 2));
   }

   public void checkExtendedTable1SJ77( )
   {
      nIsDirty_77 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A661PedFec = T01SJ5_A661PedFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A662PedFecEnt = T01SJ5_A662PedFecEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      A667PedSit = T01SJ5_A667PedSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      pr_default.close(3);
      /* Using cursor T01SJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SJ4_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A684PrdCanPen = T01SJ4_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A724PrdPreAct = T01SJ4_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A795PrvNum = T01SJ4_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      pr_default.close(2);
      nIsDirty_77 = (short)(1) ;
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
      nIsDirty_77 = (short)(1) ;
      A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13787PedValForm", GXutil.ltrimstr( A13787PedValForm, 12, 2));
      if ( ! ( ( GXutil.strcmp(A659PedCum, "S") == 0 ) || ( GXutil.strcmp(A659PedCum, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cumplimentado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PEDCUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A3378PedEtiPrd == 0 ) || ( A3378PedEtiPrd == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Etiqueta Prod. Listada 0No/1Si", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PEDETIPRD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedEtiPrd_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1SJ77( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         int A658PedCod )
   {
      /* Using cursor T01SJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A661PedFec = T01SJ7_A661PedFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A662PedFecEnt = T01SJ7_A662PedFecEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      A667PedSit = T01SJ7_A667PedSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A661PedFec, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A662PedFecEnt, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A667PedSit))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_6( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01SJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SJ8_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A684PrdCanPen = T01SJ8_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A724PrdPreAct = T01SJ8_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A795PrvNum = T01SJ8_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1SJ77( )
   {
      /* Using cursor T01SJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound77 = (short)(1) ;
      }
      else
      {
         RcdFound77 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SJ77( 5) ;
         RcdFound77 = (short)(1) ;
         A669PedUni = T01SJ3_A669PedUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
         A657PedCanEnt = T01SJ3_A657PedCanEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
         A665PedPre = T01SJ3_A665PedPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
         A660PedDto = T01SJ3_A660PedDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
         A670PedVal = T01SJ3_A670PedVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670PedVal", GXutil.ltrimstr( A670PedVal, 12, 2));
         A659PedCum = T01SJ3_A659PedCum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
         A663PedFulEnt = T01SJ3_A663PedFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
         A3372PedNumCoP = T01SJ3_A3372PedNumCoP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3372PedNumCoP), 3, 0));
         A3373PedConInP = T01SJ3_A3373PedConInP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3373PedConInP), 8, 0));
         A3374PedConFiP = T01SJ3_A3374PedConFiP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3374PedConFiP), 8, 0));
         A3375PedNumCoE = T01SJ3_A3375PedNumCoE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3375PedNumCoE), 3, 0));
         A3376PedConInE = T01SJ3_A3376PedConInE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3376PedConInE), 8, 0));
         A3377PedConFiE = T01SJ3_A3377PedConFiE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3377PedConFiE), 8, 0));
         A3378PedEtiPrd = T01SJ3_A3378PedEtiPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.str( A3378PedEtiPrd, 1, 0));
         A6289PedNumRq = T01SJ3_A6289PedNumRq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6289PedNumRq), 8, 0));
         A8158PedFecPEn = T01SJ3_A8158PedFecPEn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8158PedFecPEn", localUtil.format(A8158PedFecPEn, "99/99/99"));
         A8159PedLinObs = T01SJ3_A8159PedLinObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8159PedLinObs", A8159PedLinObs);
         A396EmprCod = T01SJ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01SJ3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A658PedCod = T01SJ3_A658PedCod[0] ;
         n658PedCod = T01SJ3_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         Z719PrdNum = A719PrdNum ;
         sMode77 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1SJ77( ) ;
         if ( AnyError == 1 )
         {
            RcdFound77 = (short)(0) ;
            initializeNonKey1SJ77( ) ;
         }
         Gx_mode = sMode77 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound77 = (short)(0) ;
         initializeNonKey1SJ77( ) ;
         sMode77 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode77 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SJ77( ) ;
      if ( RcdFound77 == 0 )
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
      RcdFound77 = (short)(0) ;
      /* Using cursor T01SJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SJ10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SJ10_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SJ10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SJ10_A658PedCod[0] < A658PedCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SJ10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SJ10_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SJ10_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SJ10_A658PedCod[0] > A658PedCod ) ) )
         {
            A396EmprCod = T01SJ10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01SJ10_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A658PedCod = T01SJ10_A658PedCod[0] ;
            n658PedCod = T01SJ10_n658PedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            RcdFound77 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound77 = (short)(0) ;
      /* Using cursor T01SJ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01SJ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SJ11_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01SJ11_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SJ11_A658PedCod[0] > A658PedCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01SJ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01SJ11_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01SJ11_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01SJ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SJ11_A658PedCod[0] < A658PedCod ) ) )
         {
            A396EmprCod = T01SJ11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01SJ11_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A658PedCod = T01SJ11_A658PedCod[0] ;
            n658PedCod = T01SJ11_n658PedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            RcdFound77 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SJ77( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SJ77( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound77 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A658PedCod = Z658PedCod ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
               A719PrdNum = Z719PrdNum ;
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
               update1SJ77( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SJ77( ) ;
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
                  insert1SJ77( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = Z658PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = Z719PrdNum ;
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
      if ( RcdFound77 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPedUni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SJ77( ) ;
      if ( RcdFound77 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPedUni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SJ77( ) ;
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
      if ( RcdFound77 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPedUni_Internalname ;
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
      if ( RcdFound77 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPedUni_Internalname ;
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
      scanStart1SJ77( ) ;
      if ( RcdFound77 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound77 != 0 )
         {
            scanNext1SJ77( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPedUni_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SJ77( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1SJ77( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z669PedUni, T01SJ2_A669PedUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z657PedCanEnt, T01SJ2_A657PedCanEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z665PedPre, T01SJ2_A665PedPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z660PedDto, T01SJ2_A660PedDto[0]) != 0 ) || ( DecimalUtil.compareTo(Z670PedVal, T01SJ2_A670PedVal[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z659PedCum, T01SJ2_A659PedCum[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01SJ2_A663PedFulEnt[0])) ) || ( Z3372PedNumCoP != T01SJ2_A3372PedNumCoP[0] ) || ( Z3373PedConInP != T01SJ2_A3373PedConInP[0] ) || ( Z3374PedConFiP != T01SJ2_A3374PedConFiP[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3375PedNumCoE != T01SJ2_A3375PedNumCoE[0] ) || ( Z3376PedConInE != T01SJ2_A3376PedConInE[0] ) || ( Z3377PedConFiE != T01SJ2_A3377PedConFiE[0] ) || ( Z3378PedEtiPrd != T01SJ2_A3378PedEtiPrd[0] ) || ( Z6289PedNumRq != T01SJ2_A6289PedNumRq[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z8158PedFecPEn), GXutil.resetTime(T01SJ2_A8158PedFecPEn[0])) ) || ( GXutil.strcmp(Z8159PedLinObs, T01SJ2_A8159PedLinObs[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z669PedUni, T01SJ2_A669PedUni[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedUni");
               GXutil.writeLogRaw("Old: ",Z669PedUni);
               GXutil.writeLogRaw("Current: ",T01SJ2_A669PedUni[0]);
            }
            if ( DecimalUtil.compareTo(Z657PedCanEnt, T01SJ2_A657PedCanEnt[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedCanEnt");
               GXutil.writeLogRaw("Old: ",Z657PedCanEnt);
               GXutil.writeLogRaw("Current: ",T01SJ2_A657PedCanEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z665PedPre, T01SJ2_A665PedPre[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedPre");
               GXutil.writeLogRaw("Old: ",Z665PedPre);
               GXutil.writeLogRaw("Current: ",T01SJ2_A665PedPre[0]);
            }
            if ( DecimalUtil.compareTo(Z660PedDto, T01SJ2_A660PedDto[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedDto");
               GXutil.writeLogRaw("Old: ",Z660PedDto);
               GXutil.writeLogRaw("Current: ",T01SJ2_A660PedDto[0]);
            }
            if ( DecimalUtil.compareTo(Z670PedVal, T01SJ2_A670PedVal[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedVal");
               GXutil.writeLogRaw("Old: ",Z670PedVal);
               GXutil.writeLogRaw("Current: ",T01SJ2_A670PedVal[0]);
            }
            if ( GXutil.strcmp(Z659PedCum, T01SJ2_A659PedCum[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedCum");
               GXutil.writeLogRaw("Old: ",Z659PedCum);
               GXutil.writeLogRaw("Current: ",T01SJ2_A659PedCum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01SJ2_A663PedFulEnt[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedFulEnt");
               GXutil.writeLogRaw("Old: ",Z663PedFulEnt);
               GXutil.writeLogRaw("Current: ",T01SJ2_A663PedFulEnt[0]);
            }
            if ( Z3372PedNumCoP != T01SJ2_A3372PedNumCoP[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedNumCoP");
               GXutil.writeLogRaw("Old: ",Z3372PedNumCoP);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3372PedNumCoP[0]);
            }
            if ( Z3373PedConInP != T01SJ2_A3373PedConInP[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedConInP");
               GXutil.writeLogRaw("Old: ",Z3373PedConInP);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3373PedConInP[0]);
            }
            if ( Z3374PedConFiP != T01SJ2_A3374PedConFiP[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedConFiP");
               GXutil.writeLogRaw("Old: ",Z3374PedConFiP);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3374PedConFiP[0]);
            }
            if ( Z3375PedNumCoE != T01SJ2_A3375PedNumCoE[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedNumCoE");
               GXutil.writeLogRaw("Old: ",Z3375PedNumCoE);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3375PedNumCoE[0]);
            }
            if ( Z3376PedConInE != T01SJ2_A3376PedConInE[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedConInE");
               GXutil.writeLogRaw("Old: ",Z3376PedConInE);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3376PedConInE[0]);
            }
            if ( Z3377PedConFiE != T01SJ2_A3377PedConFiE[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedConFiE");
               GXutil.writeLogRaw("Old: ",Z3377PedConFiE);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3377PedConFiE[0]);
            }
            if ( Z3378PedEtiPrd != T01SJ2_A3378PedEtiPrd[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedEtiPrd");
               GXutil.writeLogRaw("Old: ",Z3378PedEtiPrd);
               GXutil.writeLogRaw("Current: ",T01SJ2_A3378PedEtiPrd[0]);
            }
            if ( Z6289PedNumRq != T01SJ2_A6289PedNumRq[0] )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedNumRq");
               GXutil.writeLogRaw("Old: ",Z6289PedNumRq);
               GXutil.writeLogRaw("Current: ",T01SJ2_A6289PedNumRq[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8158PedFecPEn), GXutil.resetTime(T01SJ2_A8158PedFecPEn[0])) ) )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedFecPEn");
               GXutil.writeLogRaw("Old: ",Z8158PedFecPEn);
               GXutil.writeLogRaw("Current: ",T01SJ2_A8158PedFecPEn[0]);
            }
            if ( GXutil.strcmp(Z8159PedLinObs, T01SJ2_A8159PedLinObs[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.pedidoporproducto_trn:[seudo value changed for attri]"+"PedLinObs");
               GXutil.writeLogRaw("Old: ",Z8159PedLinObs);
               GXutil.writeLogRaw("Current: ",T01SJ2_A8159PedLinObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SJ77( )
   {
      beforeValidate1SJ77( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SJ77( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SJ77( 0) ;
         checkOptimisticConcurrency1SJ77( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SJ77( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SJ77( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SJ12 */
                  pr_default.execute(10, new Object[] {A669PedUni, A657PedCanEnt, A665PedPre, A660PedDto, A670PedVal, A659PedCum, A663PedFulEnt, Short.valueOf(A3372PedNumCoP), Integer.valueOf(A3373PedConInP), Integer.valueOf(A3374PedConFiP), Short.valueOf(A3375PedNumCoE), Integer.valueOf(A3376PedConInE), Integer.valueOf(A3377PedConFiE), Byte.valueOf(A3378PedEtiPrd), Integer.valueOf(A6289PedNumRq), A8158PedFecPEn, A8159PedLinObs, A396EmprCod, A719PrdNum, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
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
                        resetCaption1SJ0( ) ;
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
            load1SJ77( ) ;
         }
         endLevel1SJ77( ) ;
      }
      closeExtendedTableCursors1SJ77( ) ;
   }

   public void update1SJ77( )
   {
      beforeValidate1SJ77( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SJ77( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SJ77( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SJ77( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SJ77( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SJ13 */
                  pr_default.execute(11, new Object[] {A669PedUni, A657PedCanEnt, A665PedPre, A660PedDto, A670PedVal, A659PedCum, A663PedFulEnt, Short.valueOf(A3372PedNumCoP), Integer.valueOf(A3373PedConInP), Integer.valueOf(A3374PedConFiP), Short.valueOf(A3375PedNumCoE), Integer.valueOf(A3376PedConInE), Integer.valueOf(A3377PedConFiE), Byte.valueOf(A3378PedEtiPrd), Integer.valueOf(A6289PedNumRq), A8158PedFecPEn, A8159PedLinObs, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SJ77( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1SJ0( ) ;
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
         endLevel1SJ77( ) ;
      }
      closeExtendedTableCursors1SJ77( ) ;
   }

   public void deferredUpdate1SJ77( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SJ77( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SJ77( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SJ77( ) ;
         afterConfirm1SJ77( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SJ77( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SJ14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound77 == 0 )
                     {
                        initAll1SJ77( ) ;
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
                     resetCaption1SJ0( ) ;
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
      sMode77 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SJ77( ) ;
      Gx_mode = sMode77 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SJ77( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SJ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         A661PedFec = T01SJ15_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A662PedFecEnt = T01SJ15_A662PedFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A667PedSit = T01SJ15_A667PedSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
         pr_default.close(13);
         /* Using cursor T01SJ16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01SJ16_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A684PrdCanPen = T01SJ16_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A724PrdPreAct = T01SJ16_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A795PrvNum = T01SJ16_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         pr_default.close(14);
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13787PedValForm", GXutil.ltrimstr( A13787PedValForm, 12, 2));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SJ17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01SJ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel1SJ77( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SJ77( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.pedidoporproducto_trn");
         if ( AnyError == 0 )
         {
            confirmValues1SJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.pedidoporproducto_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SJ77( )
   {
      /* Using cursor T01SJ19 */
      pr_default.execute(17);
      RcdFound77 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound77 = (short)(1) ;
         A396EmprCod = T01SJ19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = T01SJ19_A658PedCod[0] ;
         n658PedCod = T01SJ19_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = T01SJ19_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SJ77( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound77 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound77 = (short)(1) ;
         A396EmprCod = T01SJ19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = T01SJ19_A658PedCod[0] ;
         n658PedCod = T01SJ19_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = T01SJ19_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1SJ77( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1SJ77( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SJ77( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SJ77( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SJ77( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SJ77( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SJ77( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SJ77( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      edtPedFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Enabled), 5, 0), true);
      edtPedFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecEnt_Enabled), 5, 0), true);
      edtPedSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedSit_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPedUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedUni_Enabled), 5, 0), true);
      edtPedCanEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), true);
      edtPedPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), true);
      edtPedDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDto_Enabled), 5, 0), true);
      edtPedVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedVal_Enabled), 5, 0), true);
      edtPedCum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCum_Enabled), 5, 0), true);
      edtPedFulEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFulEnt_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
      edtPedNumCoP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedNumCoP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedNumCoP_Enabled), 5, 0), true);
      edtPedConInP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedConInP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedConInP_Enabled), 5, 0), true);
      edtPedConFiP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedConFiP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedConFiP_Enabled), 5, 0), true);
      edtPedNumCoE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedNumCoE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedNumCoE_Enabled), 5, 0), true);
      edtPedConInE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedConInE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedConInE_Enabled), 5, 0), true);
      edtPedConFiE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedConFiE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedConFiE_Enabled), 5, 0), true);
      edtPedEtiPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedEtiPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedEtiPrd_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtPedNumRq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedNumRq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedNumRq_Enabled), 5, 0), true);
      edtPedFecPEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFecPEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecPEn_Enabled), 5, 0), true);
      edtPedLinObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedLinObs_Enabled), 5, 0), true);
      edtPedValForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedValForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedValForm_Enabled), 5, 0), true);
      edtCantPdte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantPdte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantPdte_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SJ77( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SJ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.pedidoporproducto_trn", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z669PedUni", GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z657PedCanEnt", GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z665PedPre", GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z660PedDto", GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z670PedVal", GXutil.ltrim( localUtil.ntoc( Z670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z659PedCum", GXutil.rtrim( Z659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z663PedFulEnt", localUtil.dtoc( Z663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3372PedNumCoP", GXutil.ltrim( localUtil.ntoc( Z3372PedNumCoP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3373PedConInP", GXutil.ltrim( localUtil.ntoc( Z3373PedConInP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3374PedConFiP", GXutil.ltrim( localUtil.ntoc( Z3374PedConFiP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3375PedNumCoE", GXutil.ltrim( localUtil.ntoc( Z3375PedNumCoE, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3376PedConInE", GXutil.ltrim( localUtil.ntoc( Z3376PedConInE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3377PedConFiE", GXutil.ltrim( localUtil.ntoc( Z3377PedConFiE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3378PedEtiPrd", GXutil.ltrim( localUtil.ntoc( Z3378PedEtiPrd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6289PedNumRq", GXutil.ltrim( localUtil.ntoc( Z6289PedNumRq, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8158PedFecPEn", localUtil.dtoc( Z8158PedFecPEn, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8159PedLinObs", GXutil.rtrim( Z8159PedLinObs));
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
      return formatLink("app.stocksquimicos.pedidoporproducto_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.PedidoporProducto_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Pedido por Producto", "") ;
   }

   public void initializeNonKey1SJ77( )
   {
      A13787PedValForm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13787PedValForm", GXutil.ltrimstr( A13787PedValForm, 12, 2));
      A13833CantPdte = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrimstr( A13833CantPdte, 12, 2));
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A662PedFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      A667PedSit = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A669PedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrimstr( A669PedUni, 9, 2));
      A657PedCanEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrimstr( A657PedCanEnt, 9, 2));
      A665PedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrimstr( A665PedPre, 14, 5));
      A660PedDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrimstr( A660PedDto, 5, 2));
      A670PedVal = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A670PedVal", GXutil.ltrimstr( A670PedVal, 12, 2));
      A659PedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", A659PedCum);
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A3372PedNumCoP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3372PedNumCoP), 3, 0));
      A3373PedConInP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3373PedConInP), 8, 0));
      A3374PedConFiP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3374PedConFiP), 8, 0));
      A3375PedNumCoE = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3375PedNumCoE), 3, 0));
      A3376PedConInE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3376PedConInE), 8, 0));
      A3377PedConFiE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3377PedConFiE), 8, 0));
      A3378PedEtiPrd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.str( A3378PedEtiPrd, 1, 0));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A6289PedNumRq = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6289PedNumRq), 8, 0));
      A8158PedFecPEn = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8158PedFecPEn", localUtil.format(A8158PedFecPEn, "99/99/99"));
      A8159PedLinObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8159PedLinObs", A8159PedLinObs);
      Z669PedUni = DecimalUtil.ZERO ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z660PedDto = DecimalUtil.ZERO ;
      Z670PedVal = DecimalUtil.ZERO ;
      Z659PedCum = "" ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z3372PedNumCoP = (short)(0) ;
      Z3373PedConInP = 0 ;
      Z3374PedConFiP = 0 ;
      Z3375PedNumCoE = (short)(0) ;
      Z3376PedConInE = 0 ;
      Z3377PedConFiE = 0 ;
      Z3378PedEtiPrd = (byte)(0) ;
      Z6289PedNumRq = 0 ;
      Z8158PedFecPEn = GXutil.nullDate() ;
      Z8159PedLinObs = "" ;
   }

   public void initAll1SJ77( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1SJ77( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016384346", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/pedidoporproducto_trn.js", "?202661016384346", false, true);
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
      edtPedCod_Internalname = "PEDCOD" ;
      edtPedFec_Internalname = "PEDFEC" ;
      edtPedFecEnt_Internalname = "PEDFECENT" ;
      edtPedSit_Internalname = "PEDSIT" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPedUni_Internalname = "PEDUNI" ;
      edtPedCanEnt_Internalname = "PEDCANENT" ;
      edtPedPre_Internalname = "PEDPRE" ;
      edtPedDto_Internalname = "PEDDTO" ;
      edtPedVal_Internalname = "PEDVAL" ;
      edtPedCum_Internalname = "PEDCUM" ;
      edtPedFulEnt_Internalname = "PEDFULENT" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      edtPedNumCoP_Internalname = "PEDNUMCOP" ;
      edtPedConInP_Internalname = "PEDCONINP" ;
      edtPedConFiP_Internalname = "PEDCONFIP" ;
      edtPedNumCoE_Internalname = "PEDNUMCOE" ;
      edtPedConInE_Internalname = "PEDCONINE" ;
      edtPedConFiE_Internalname = "PEDCONFIE" ;
      edtPedEtiPrd_Internalname = "PEDETIPRD" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPedNumRq_Internalname = "PEDNUMRQ" ;
      edtPedFecPEn_Internalname = "PEDFECPEN" ;
      edtPedLinObs_Internalname = "PEDLINOBS" ;
      edtPedValForm_Internalname = "PEDVALFORM" ;
      edtCantPdte_Internalname = "CANTPDTE" ;
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
      Form.setCaption( httpContext.getMessage( "Pedido por Producto", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtCantPdte_Jsonclick = "" ;
      edtCantPdte_Enabled = 0 ;
      edtPedValForm_Jsonclick = "" ;
      edtPedValForm_Enabled = 0 ;
      edtPedLinObs_Jsonclick = "" ;
      edtPedLinObs_Enabled = 1 ;
      edtPedFecPEn_Jsonclick = "" ;
      edtPedFecPEn_Enabled = 1 ;
      edtPedNumRq_Jsonclick = "" ;
      edtPedNumRq_Enabled = 1 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtPedEtiPrd_Jsonclick = "" ;
      edtPedEtiPrd_Enabled = 1 ;
      edtPedConFiE_Jsonclick = "" ;
      edtPedConFiE_Enabled = 1 ;
      edtPedConInE_Jsonclick = "" ;
      edtPedConInE_Enabled = 1 ;
      edtPedNumCoE_Jsonclick = "" ;
      edtPedNumCoE_Enabled = 1 ;
      edtPedConFiP_Jsonclick = "" ;
      edtPedConFiP_Enabled = 1 ;
      edtPedConInP_Jsonclick = "" ;
      edtPedConInP_Enabled = 1 ;
      edtPedNumCoP_Jsonclick = "" ;
      edtPedNumCoP_Enabled = 1 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Enabled = 0 ;
      edtPedFulEnt_Jsonclick = "" ;
      edtPedFulEnt_Enabled = 1 ;
      edtPedCum_Jsonclick = "" ;
      edtPedCum_Enabled = 1 ;
      edtPedVal_Jsonclick = "" ;
      edtPedVal_Enabled = 1 ;
      edtPedDto_Jsonclick = "" ;
      edtPedDto_Enabled = 1 ;
      edtPedPre_Jsonclick = "" ;
      edtPedPre_Enabled = 1 ;
      edtPedCanEnt_Jsonclick = "" ;
      edtPedCanEnt_Enabled = 1 ;
      edtPedUni_Jsonclick = "" ;
      edtPedUni_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 0 ;
      edtPedSit_Jsonclick = "" ;
      edtPedSit_Enabled = 0 ;
      edtPedFecEnt_Jsonclick = "" ;
      edtPedFecEnt_Enabled = 0 ;
      edtPedFec_Jsonclick = "" ;
      edtPedFec_Enabled = 0 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
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
      /* Using cursor T01SJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A661PedFec = T01SJ15_A661PedFec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A662PedFecEnt = T01SJ15_A662PedFecEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      A667PedSit = T01SJ15_A667PedSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      pr_default.close(13);
      /* Using cursor T01SJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01SJ16_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A684PrdCanPen = T01SJ16_A684PrdCanPen[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A724PrdPreAct = T01SJ16_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A795PrvNum = T01SJ16_A795PrvNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      pr_default.close(14);
      GX_FocusControl = edtPedUni_Internalname ;
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

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      /* Using cursor T01SJ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPEDID", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A661PedFec = T01SJ15_A661PedFec[0] ;
      A662PedFecEnt = T01SJ15_A662PedFecEnt[0] ;
      A667PedSit = T01SJ15_A667PedSit[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
   }

   public void valid_Prdnum( )
   {
      n658PedCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01SJ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01SJ16_A718PrdNom[0] ;
      A684PrdCanPen = T01SJ16_A684PrdCanPen[0] ;
      A724PrdPreAct = T01SJ16_A724PrdPreAct[0] ;
      A795PrvNum = T01SJ16_A795PrvNum[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A669PedUni", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A657PedCanEnt", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A660PedDto", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A670PedVal", GXutil.ltrim( localUtil.ntoc( A670PedVal, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A659PedCum", GXutil.rtrim( A659PedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrim( localUtil.ntoc( A3372PedNumCoP, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrim( localUtil.ntoc( A3373PedConInP, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrim( localUtil.ntoc( A3374PedConFiP, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrim( localUtil.ntoc( A3375PedNumCoE, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrim( localUtil.ntoc( A3376PedConInE, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrim( localUtil.ntoc( A3377PedConFiE, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.ltrim( localUtil.ntoc( A3378PedEtiPrd, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrim( localUtil.ntoc( A6289PedNumRq, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8158PedFecPEn", localUtil.format(A8158PedFecPEn, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A8159PedLinObs", GXutil.rtrim( A8159PedLinObs));
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", GXutil.rtrim( A667PedSit));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13787PedValForm", GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z669PedUni", GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z657PedCanEnt", GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z665PedPre", GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z660PedDto", GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z670PedVal", GXutil.ltrim( localUtil.ntoc( Z670PedVal, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z659PedCum", GXutil.rtrim( Z659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z663PedFulEnt", localUtil.format(Z663PedFulEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3372PedNumCoP", GXutil.ltrim( localUtil.ntoc( Z3372PedNumCoP, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3373PedConInP", GXutil.ltrim( localUtil.ntoc( Z3373PedConInP, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3374PedConFiP", GXutil.ltrim( localUtil.ntoc( Z3374PedConFiP, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3375PedNumCoE", GXutil.ltrim( localUtil.ntoc( Z3375PedNumCoE, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3376PedConInE", GXutil.ltrim( localUtil.ntoc( Z3376PedConInE, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3377PedConFiE", GXutil.ltrim( localUtil.ntoc( Z3377PedConFiE, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3378PedEtiPrd", GXutil.ltrim( localUtil.ntoc( Z3378PedEtiPrd, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6289PedNumRq", GXutil.ltrim( localUtil.ntoc( Z6289PedNumRq, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8158PedFecPEn", localUtil.format(Z8158PedFecPEn, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8159PedLinObs", GXutil.rtrim( Z8159PedLinObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z661PedFec", localUtil.format(Z661PedFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z662PedFecEnt", localUtil.format(Z662PedFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z667PedSit", GXutil.rtrim( Z667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13833CantPdte", GXutil.ltrim( localUtil.ntoc( Z13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13787PedValForm", GXutil.ltrim( localUtil.ntoc( Z13787PedValForm, (byte)(12), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A662PedFecEnt',fld:'PEDFECENT',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A662PedFecEnt',fld:'PEDFECENT',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A660PedDto',fld:'PEDDTO',pic:'Z9.99'},{av:'A670PedVal',fld:'PEDVAL',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'A659PedCum',fld:'PEDCUM',pic:'@!'},{av:'A663PedFulEnt',fld:'PEDFULENT',pic:''},{av:'A3372PedNumCoP',fld:'PEDNUMCOP',pic:'ZZ9'},{av:'A3373PedConInP',fld:'PEDCONINP',pic:'ZZZZZZZ9'},{av:'A3374PedConFiP',fld:'PEDCONFIP',pic:'ZZZZZZZ9'},{av:'A3375PedNumCoE',fld:'PEDNUMCOE',pic:'ZZ9'},{av:'A3376PedConInE',fld:'PEDCONINE',pic:'ZZZZZZZ9'},{av:'A3377PedConFiE',fld:'PEDCONFIE',pic:'ZZZZZZZ9'},{av:'A3378PedEtiPrd',fld:'PEDETIPRD',pic:'9'},{av:'A6289PedNumRq',fld:'PEDNUMRQ',pic:'ZZZZZZZ9'},{av:'A8158PedFecPEn',fld:'PEDFECPEN',pic:''},{av:'A8159PedLinObs',fld:'PEDLINOBS',pic:''},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'A662PedFecEnt',fld:'PEDFECENT',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A13833CantPdte',fld:'CANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'A13787PedValForm',fld:'PEDVALFORM',pic:'ZZZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z658PedCod'},{av:'Z719PrdNum'},{av:'Z669PedUni'},{av:'Z657PedCanEnt'},{av:'Z665PedPre'},{av:'Z660PedDto'},{av:'Z670PedVal'},{av:'Z659PedCum'},{av:'Z663PedFulEnt'},{av:'Z3372PedNumCoP'},{av:'Z3373PedConInP'},{av:'Z3374PedConFiP'},{av:'Z3375PedNumCoE'},{av:'Z3376PedConInE'},{av:'Z3377PedConFiE'},{av:'Z3378PedEtiPrd'},{av:'Z6289PedNumRq'},{av:'Z8158PedFecPEn'},{av:'Z8159PedLinObs'},{av:'Z661PedFec'},{av:'Z662PedFecEnt'},{av:'Z667PedSit'},{av:'Z718PrdNom'},{av:'Z684PrdCanPen'},{av:'Z724PrdPreAct'},{av:'Z795PrvNum'},{av:'Z13833CantPdte'},{av:'Z13787PedValForm'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_PEDUNI","{handler:'valid_Peduni',iparms:[]");
      setEventMetadata("VALID_PEDUNI",",oparms:[]}");
      setEventMetadata("VALID_PEDCANENT","{handler:'valid_Pedcanent',iparms:[]");
      setEventMetadata("VALID_PEDCANENT",",oparms:[]}");
      setEventMetadata("VALID_PEDPRE","{handler:'valid_Pedpre',iparms:[]");
      setEventMetadata("VALID_PEDPRE",",oparms:[]}");
      setEventMetadata("VALID_PEDDTO","{handler:'valid_Peddto',iparms:[]");
      setEventMetadata("VALID_PEDDTO",",oparms:[]}");
      setEventMetadata("VALID_PEDCUM","{handler:'valid_Pedcum',iparms:[]");
      setEventMetadata("VALID_PEDCUM",",oparms:[]}");
      setEventMetadata("VALID_PEDETIPRD","{handler:'valid_Pedetiprd',iparms:[]");
      setEventMetadata("VALID_PEDETIPRD",",oparms:[]}");
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
      Z719PrdNum = "" ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z660PedDto = DecimalUtil.ZERO ;
      Z670PedVal = DecimalUtil.ZERO ;
      Z659PedCum = "" ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z8158PedFecPEn = GXutil.nullDate() ;
      Z8159PedLinObs = "" ;
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
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A667PedSit = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      A670PedVal = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      A663PedFulEnt = GXutil.nullDate() ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A8158PedFecPEn = GXutil.nullDate() ;
      A8159PedLinObs = "" ;
      A13787PedValForm = DecimalUtil.ZERO ;
      A13833CantPdte = DecimalUtil.ZERO ;
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
      Z661PedFec = GXutil.nullDate() ;
      Z662PedFecEnt = GXutil.nullDate() ;
      Z667PedSit = "" ;
      Z718PrdNom = "" ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      T01SJ6_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ6_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ6_A667PedSit = new String[] {""} ;
      T01SJ6_A718PrdNom = new String[] {""} ;
      T01SJ6_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A659PedCum = new String[] {""} ;
      T01SJ6_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ6_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A3372PedNumCoP = new short[1] ;
      T01SJ6_A3373PedConInP = new int[1] ;
      T01SJ6_A3374PedConFiP = new int[1] ;
      T01SJ6_A3375PedNumCoE = new short[1] ;
      T01SJ6_A3376PedConInE = new int[1] ;
      T01SJ6_A3377PedConFiE = new int[1] ;
      T01SJ6_A3378PedEtiPrd = new byte[1] ;
      T01SJ6_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ6_A6289PedNumRq = new int[1] ;
      T01SJ6_A8158PedFecPEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ6_A8159PedLinObs = new String[] {""} ;
      T01SJ6_A396EmprCod = new String[] {""} ;
      T01SJ6_A719PrdNum = new String[] {""} ;
      T01SJ6_A658PedCod = new int[1] ;
      T01SJ6_n658PedCod = new boolean[] {false} ;
      T01SJ6_A795PrvNum = new int[1] ;
      T01SJ5_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ5_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ5_A667PedSit = new String[] {""} ;
      T01SJ4_A718PrdNom = new String[] {""} ;
      T01SJ4_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ4_A795PrvNum = new int[1] ;
      T01SJ7_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ7_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ7_A667PedSit = new String[] {""} ;
      T01SJ8_A718PrdNom = new String[] {""} ;
      T01SJ8_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ8_A795PrvNum = new int[1] ;
      T01SJ9_A396EmprCod = new String[] {""} ;
      T01SJ9_A658PedCod = new int[1] ;
      T01SJ9_n658PedCod = new boolean[] {false} ;
      T01SJ9_A719PrdNum = new String[] {""} ;
      T01SJ3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ3_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ3_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ3_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ3_A659PedCum = new String[] {""} ;
      T01SJ3_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ3_A3372PedNumCoP = new short[1] ;
      T01SJ3_A3373PedConInP = new int[1] ;
      T01SJ3_A3374PedConFiP = new int[1] ;
      T01SJ3_A3375PedNumCoE = new short[1] ;
      T01SJ3_A3376PedConInE = new int[1] ;
      T01SJ3_A3377PedConFiE = new int[1] ;
      T01SJ3_A3378PedEtiPrd = new byte[1] ;
      T01SJ3_A6289PedNumRq = new int[1] ;
      T01SJ3_A8158PedFecPEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ3_A8159PedLinObs = new String[] {""} ;
      T01SJ3_A396EmprCod = new String[] {""} ;
      T01SJ3_A719PrdNum = new String[] {""} ;
      T01SJ3_A658PedCod = new int[1] ;
      T01SJ3_n658PedCod = new boolean[] {false} ;
      sMode77 = "" ;
      T01SJ10_A396EmprCod = new String[] {""} ;
      T01SJ10_A719PrdNum = new String[] {""} ;
      T01SJ10_A658PedCod = new int[1] ;
      T01SJ10_n658PedCod = new boolean[] {false} ;
      T01SJ11_A396EmprCod = new String[] {""} ;
      T01SJ11_A719PrdNum = new String[] {""} ;
      T01SJ11_A658PedCod = new int[1] ;
      T01SJ11_n658PedCod = new boolean[] {false} ;
      T01SJ2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ2_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ2_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ2_A659PedCum = new String[] {""} ;
      T01SJ2_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ2_A3372PedNumCoP = new short[1] ;
      T01SJ2_A3373PedConInP = new int[1] ;
      T01SJ2_A3374PedConFiP = new int[1] ;
      T01SJ2_A3375PedNumCoE = new short[1] ;
      T01SJ2_A3376PedConInE = new int[1] ;
      T01SJ2_A3377PedConFiE = new int[1] ;
      T01SJ2_A3378PedEtiPrd = new byte[1] ;
      T01SJ2_A6289PedNumRq = new int[1] ;
      T01SJ2_A8158PedFecPEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ2_A8159PedLinObs = new String[] {""} ;
      T01SJ2_A396EmprCod = new String[] {""} ;
      T01SJ2_A719PrdNum = new String[] {""} ;
      T01SJ2_A658PedCod = new int[1] ;
      T01SJ2_n658PedCod = new boolean[] {false} ;
      T01SJ15_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ15_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01SJ15_A667PedSit = new String[] {""} ;
      T01SJ16_A718PrdNom = new String[] {""} ;
      T01SJ16_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ16_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SJ16_A795PrvNum = new int[1] ;
      T01SJ17_A396EmprCod = new String[] {""} ;
      T01SJ17_A756PrePrvNum = new int[1] ;
      T01SJ17_A719PrdNum = new String[] {""} ;
      T01SJ18_A396EmprCod = new String[] {""} ;
      T01SJ18_A719PrdNum = new String[] {""} ;
      T01SJ18_A597LinEnt = new short[1] ;
      T01SJ19_A396EmprCod = new String[] {""} ;
      T01SJ19_A658PedCod = new int[1] ;
      T01SJ19_n658PedCod = new boolean[] {false} ;
      T01SJ19_A719PrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z13833CantPdte = DecimalUtil.ZERO ;
      Z13787PedValForm = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ669PedUni = DecimalUtil.ZERO ;
      ZZ657PedCanEnt = DecimalUtil.ZERO ;
      ZZ665PedPre = DecimalUtil.ZERO ;
      ZZ660PedDto = DecimalUtil.ZERO ;
      ZZ670PedVal = DecimalUtil.ZERO ;
      ZZ659PedCum = "" ;
      ZZ663PedFulEnt = GXutil.nullDate() ;
      ZZ8158PedFecPEn = GXutil.nullDate() ;
      ZZ8159PedLinObs = "" ;
      ZZ661PedFec = GXutil.nullDate() ;
      ZZ662PedFecEnt = GXutil.nullDate() ;
      ZZ667PedSit = "" ;
      ZZ718PrdNom = "" ;
      ZZ684PrdCanPen = DecimalUtil.ZERO ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ13833CantPdte = DecimalUtil.ZERO ;
      ZZ13787PedValForm = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pedidoporproducto_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pedidoporproducto_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pedidoporproducto_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.pedidoporproducto_trn__default(),
         new Object[] {
             new Object[] {
            T01SJ2_A669PedUni, T01SJ2_A657PedCanEnt, T01SJ2_A665PedPre, T01SJ2_A660PedDto, T01SJ2_A670PedVal, T01SJ2_A659PedCum, T01SJ2_A663PedFulEnt, T01SJ2_A3372PedNumCoP, T01SJ2_A3373PedConInP, T01SJ2_A3374PedConFiP,
            T01SJ2_A3375PedNumCoE, T01SJ2_A3376PedConInE, T01SJ2_A3377PedConFiE, T01SJ2_A3378PedEtiPrd, T01SJ2_A6289PedNumRq, T01SJ2_A8158PedFecPEn, T01SJ2_A8159PedLinObs, T01SJ2_A396EmprCod, T01SJ2_A719PrdNum, T01SJ2_A658PedCod
            }
            , new Object[] {
            T01SJ3_A669PedUni, T01SJ3_A657PedCanEnt, T01SJ3_A665PedPre, T01SJ3_A660PedDto, T01SJ3_A670PedVal, T01SJ3_A659PedCum, T01SJ3_A663PedFulEnt, T01SJ3_A3372PedNumCoP, T01SJ3_A3373PedConInP, T01SJ3_A3374PedConFiP,
            T01SJ3_A3375PedNumCoE, T01SJ3_A3376PedConInE, T01SJ3_A3377PedConFiE, T01SJ3_A3378PedEtiPrd, T01SJ3_A6289PedNumRq, T01SJ3_A8158PedFecPEn, T01SJ3_A8159PedLinObs, T01SJ3_A396EmprCod, T01SJ3_A719PrdNum, T01SJ3_A658PedCod
            }
            , new Object[] {
            T01SJ4_A718PrdNom, T01SJ4_A684PrdCanPen, T01SJ4_A724PrdPreAct, T01SJ4_A795PrvNum
            }
            , new Object[] {
            T01SJ5_A661PedFec, T01SJ5_A662PedFecEnt, T01SJ5_A667PedSit
            }
            , new Object[] {
            T01SJ6_A661PedFec, T01SJ6_A662PedFecEnt, T01SJ6_A667PedSit, T01SJ6_A718PrdNom, T01SJ6_A669PedUni, T01SJ6_A657PedCanEnt, T01SJ6_A665PedPre, T01SJ6_A660PedDto, T01SJ6_A670PedVal, T01SJ6_A659PedCum,
            T01SJ6_A663PedFulEnt, T01SJ6_A684PrdCanPen, T01SJ6_A3372PedNumCoP, T01SJ6_A3373PedConInP, T01SJ6_A3374PedConFiP, T01SJ6_A3375PedNumCoE, T01SJ6_A3376PedConInE, T01SJ6_A3377PedConFiE, T01SJ6_A3378PedEtiPrd, T01SJ6_A724PrdPreAct,
            T01SJ6_A6289PedNumRq, T01SJ6_A8158PedFecPEn, T01SJ6_A8159PedLinObs, T01SJ6_A396EmprCod, T01SJ6_A719PrdNum, T01SJ6_A658PedCod, T01SJ6_A795PrvNum
            }
            , new Object[] {
            T01SJ7_A661PedFec, T01SJ7_A662PedFecEnt, T01SJ7_A667PedSit
            }
            , new Object[] {
            T01SJ8_A718PrdNom, T01SJ8_A684PrdCanPen, T01SJ8_A724PrdPreAct, T01SJ8_A795PrvNum
            }
            , new Object[] {
            T01SJ9_A396EmprCod, T01SJ9_A658PedCod, T01SJ9_A719PrdNum
            }
            , new Object[] {
            T01SJ10_A396EmprCod, T01SJ10_A719PrdNum, T01SJ10_A658PedCod
            }
            , new Object[] {
            T01SJ11_A396EmprCod, T01SJ11_A719PrdNum, T01SJ11_A658PedCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SJ15_A661PedFec, T01SJ15_A662PedFecEnt, T01SJ15_A667PedSit
            }
            , new Object[] {
            T01SJ16_A718PrdNom, T01SJ16_A684PrdCanPen, T01SJ16_A724PrdPreAct, T01SJ16_A795PrvNum
            }
            , new Object[] {
            T01SJ17_A396EmprCod, T01SJ17_A756PrePrvNum, T01SJ17_A719PrdNum
            }
            , new Object[] {
            T01SJ18_A396EmprCod, T01SJ18_A719PrdNum, T01SJ18_A597LinEnt
            }
            , new Object[] {
            T01SJ19_A396EmprCod, T01SJ19_A658PedCod, T01SJ19_A719PrdNum
            }
         }
      );
   }

   private byte Z3378PedEtiPrd ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A3378PedEtiPrd ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ3378PedEtiPrd ;
   private short Z3372PedNumCoP ;
   private short Z3375PedNumCoE ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3372PedNumCoP ;
   private short A3375PedNumCoE ;
   private short RcdFound77 ;
   private short nIsDirty_77 ;
   private short ZZ3372PedNumCoP ;
   private short ZZ3375PedNumCoE ;
   private int Z658PedCod ;
   private int Z3373PedConInP ;
   private int Z3374PedConFiP ;
   private int Z3376PedConInE ;
   private int Z3377PedConFiE ;
   private int Z6289PedNumRq ;
   private int A658PedCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPedCod_Enabled ;
   private int edtPedFec_Enabled ;
   private int edtPedFecEnt_Enabled ;
   private int edtPedSit_Enabled ;
   private int A795PrvNum ;
   private int edtPrvNum_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPedUni_Enabled ;
   private int edtPedCanEnt_Enabled ;
   private int edtPedPre_Enabled ;
   private int edtPedDto_Enabled ;
   private int edtPedVal_Enabled ;
   private int edtPedCum_Enabled ;
   private int edtPedFulEnt_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int edtPedNumCoP_Enabled ;
   private int A3373PedConInP ;
   private int edtPedConInP_Enabled ;
   private int A3374PedConFiP ;
   private int edtPedConFiP_Enabled ;
   private int edtPedNumCoE_Enabled ;
   private int A3376PedConInE ;
   private int edtPedConInE_Enabled ;
   private int A3377PedConFiE ;
   private int edtPedConFiE_Enabled ;
   private int edtPedEtiPrd_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int A6289PedNumRq ;
   private int edtPedNumRq_Enabled ;
   private int edtPedFecPEn_Enabled ;
   private int edtPedLinObs_Enabled ;
   private int edtPedValForm_Enabled ;
   private int edtCantPdte_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z795PrvNum ;
   private int idxLst ;
   private int ZZ658PedCod ;
   private int ZZ3373PedConInP ;
   private int ZZ3374PedConFiP ;
   private int ZZ3376PedConInE ;
   private int ZZ3377PedConFiE ;
   private int ZZ6289PedNumRq ;
   private int ZZ795PrvNum ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal Z670PedVal ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A670PedVal ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A13787PedValForm ;
   private java.math.BigDecimal A13833CantPdte ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z13833CantPdte ;
   private java.math.BigDecimal Z13787PedValForm ;
   private java.math.BigDecimal ZZ669PedUni ;
   private java.math.BigDecimal ZZ657PedCanEnt ;
   private java.math.BigDecimal ZZ665PedPre ;
   private java.math.BigDecimal ZZ660PedDto ;
   private java.math.BigDecimal ZZ670PedVal ;
   private java.math.BigDecimal ZZ684PrdCanPen ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ13833CantPdte ;
   private java.math.BigDecimal ZZ13787PedValForm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z659PedCum ;
   private String Z8159PedLinObs ;
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
   private String edtPedCod_Internalname ;
   private String edtPedCod_Jsonclick ;
   private String edtPedFec_Internalname ;
   private String edtPedFec_Jsonclick ;
   private String edtPedFecEnt_Internalname ;
   private String edtPedFecEnt_Jsonclick ;
   private String edtPedSit_Internalname ;
   private String A667PedSit ;
   private String edtPedSit_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPedUni_Internalname ;
   private String edtPedUni_Jsonclick ;
   private String edtPedCanEnt_Internalname ;
   private String edtPedCanEnt_Jsonclick ;
   private String edtPedPre_Internalname ;
   private String edtPedPre_Jsonclick ;
   private String edtPedDto_Internalname ;
   private String edtPedDto_Jsonclick ;
   private String edtPedVal_Internalname ;
   private String edtPedVal_Jsonclick ;
   private String edtPedCum_Internalname ;
   private String A659PedCum ;
   private String edtPedCum_Jsonclick ;
   private String edtPedFulEnt_Internalname ;
   private String edtPedFulEnt_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtPedNumCoP_Internalname ;
   private String edtPedNumCoP_Jsonclick ;
   private String edtPedConInP_Internalname ;
   private String edtPedConInP_Jsonclick ;
   private String edtPedConFiP_Internalname ;
   private String edtPedConFiP_Jsonclick ;
   private String edtPedNumCoE_Internalname ;
   private String edtPedNumCoE_Jsonclick ;
   private String edtPedConInE_Internalname ;
   private String edtPedConInE_Jsonclick ;
   private String edtPedConFiE_Internalname ;
   private String edtPedConFiE_Jsonclick ;
   private String edtPedEtiPrd_Internalname ;
   private String edtPedEtiPrd_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPedNumRq_Internalname ;
   private String edtPedNumRq_Jsonclick ;
   private String edtPedFecPEn_Internalname ;
   private String edtPedFecPEn_Jsonclick ;
   private String edtPedLinObs_Internalname ;
   private String A8159PedLinObs ;
   private String edtPedLinObs_Jsonclick ;
   private String edtPedValForm_Internalname ;
   private String edtPedValForm_Jsonclick ;
   private String edtCantPdte_Internalname ;
   private String edtCantPdte_Jsonclick ;
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
   private String Z667PedSit ;
   private String Z718PrdNom ;
   private String sMode77 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ659PedCum ;
   private String ZZ8159PedLinObs ;
   private String ZZ667PedSit ;
   private String ZZ718PrdNom ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date Z8158PedFecPEn ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date A8158PedFecPEn ;
   private java.util.Date Z661PedFec ;
   private java.util.Date Z662PedFecEnt ;
   private java.util.Date ZZ663PedFulEnt ;
   private java.util.Date ZZ8158PedFecPEn ;
   private java.util.Date ZZ661PedFec ;
   private java.util.Date ZZ662PedFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n658PedCod ;
   private boolean wbErr ;
   private boolean Gx_longc ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T01SJ6_A661PedFec ;
   private java.util.Date[] T01SJ6_A662PedFecEnt ;
   private String[] T01SJ6_A667PedSit ;
   private String[] T01SJ6_A718PrdNom ;
   private java.math.BigDecimal[] T01SJ6_A669PedUni ;
   private java.math.BigDecimal[] T01SJ6_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SJ6_A665PedPre ;
   private java.math.BigDecimal[] T01SJ6_A660PedDto ;
   private java.math.BigDecimal[] T01SJ6_A670PedVal ;
   private String[] T01SJ6_A659PedCum ;
   private java.util.Date[] T01SJ6_A663PedFulEnt ;
   private java.math.BigDecimal[] T01SJ6_A684PrdCanPen ;
   private short[] T01SJ6_A3372PedNumCoP ;
   private int[] T01SJ6_A3373PedConInP ;
   private int[] T01SJ6_A3374PedConFiP ;
   private short[] T01SJ6_A3375PedNumCoE ;
   private int[] T01SJ6_A3376PedConInE ;
   private int[] T01SJ6_A3377PedConFiE ;
   private byte[] T01SJ6_A3378PedEtiPrd ;
   private java.math.BigDecimal[] T01SJ6_A724PrdPreAct ;
   private int[] T01SJ6_A6289PedNumRq ;
   private java.util.Date[] T01SJ6_A8158PedFecPEn ;
   private String[] T01SJ6_A8159PedLinObs ;
   private String[] T01SJ6_A396EmprCod ;
   private String[] T01SJ6_A719PrdNum ;
   private int[] T01SJ6_A658PedCod ;
   private boolean[] T01SJ6_n658PedCod ;
   private int[] T01SJ6_A795PrvNum ;
   private java.util.Date[] T01SJ5_A661PedFec ;
   private java.util.Date[] T01SJ5_A662PedFecEnt ;
   private String[] T01SJ5_A667PedSit ;
   private String[] T01SJ4_A718PrdNom ;
   private java.math.BigDecimal[] T01SJ4_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SJ4_A724PrdPreAct ;
   private int[] T01SJ4_A795PrvNum ;
   private java.util.Date[] T01SJ7_A661PedFec ;
   private java.util.Date[] T01SJ7_A662PedFecEnt ;
   private String[] T01SJ7_A667PedSit ;
   private String[] T01SJ8_A718PrdNom ;
   private java.math.BigDecimal[] T01SJ8_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SJ8_A724PrdPreAct ;
   private int[] T01SJ8_A795PrvNum ;
   private String[] T01SJ9_A396EmprCod ;
   private int[] T01SJ9_A658PedCod ;
   private boolean[] T01SJ9_n658PedCod ;
   private String[] T01SJ9_A719PrdNum ;
   private java.math.BigDecimal[] T01SJ3_A669PedUni ;
   private java.math.BigDecimal[] T01SJ3_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SJ3_A665PedPre ;
   private java.math.BigDecimal[] T01SJ3_A660PedDto ;
   private java.math.BigDecimal[] T01SJ3_A670PedVal ;
   private String[] T01SJ3_A659PedCum ;
   private java.util.Date[] T01SJ3_A663PedFulEnt ;
   private short[] T01SJ3_A3372PedNumCoP ;
   private int[] T01SJ3_A3373PedConInP ;
   private int[] T01SJ3_A3374PedConFiP ;
   private short[] T01SJ3_A3375PedNumCoE ;
   private int[] T01SJ3_A3376PedConInE ;
   private int[] T01SJ3_A3377PedConFiE ;
   private byte[] T01SJ3_A3378PedEtiPrd ;
   private int[] T01SJ3_A6289PedNumRq ;
   private java.util.Date[] T01SJ3_A8158PedFecPEn ;
   private String[] T01SJ3_A8159PedLinObs ;
   private String[] T01SJ3_A396EmprCod ;
   private String[] T01SJ3_A719PrdNum ;
   private int[] T01SJ3_A658PedCod ;
   private boolean[] T01SJ3_n658PedCod ;
   private String[] T01SJ10_A396EmprCod ;
   private String[] T01SJ10_A719PrdNum ;
   private int[] T01SJ10_A658PedCod ;
   private boolean[] T01SJ10_n658PedCod ;
   private String[] T01SJ11_A396EmprCod ;
   private String[] T01SJ11_A719PrdNum ;
   private int[] T01SJ11_A658PedCod ;
   private boolean[] T01SJ11_n658PedCod ;
   private java.math.BigDecimal[] T01SJ2_A669PedUni ;
   private java.math.BigDecimal[] T01SJ2_A657PedCanEnt ;
   private java.math.BigDecimal[] T01SJ2_A665PedPre ;
   private java.math.BigDecimal[] T01SJ2_A660PedDto ;
   private java.math.BigDecimal[] T01SJ2_A670PedVal ;
   private String[] T01SJ2_A659PedCum ;
   private java.util.Date[] T01SJ2_A663PedFulEnt ;
   private short[] T01SJ2_A3372PedNumCoP ;
   private int[] T01SJ2_A3373PedConInP ;
   private int[] T01SJ2_A3374PedConFiP ;
   private short[] T01SJ2_A3375PedNumCoE ;
   private int[] T01SJ2_A3376PedConInE ;
   private int[] T01SJ2_A3377PedConFiE ;
   private byte[] T01SJ2_A3378PedEtiPrd ;
   private int[] T01SJ2_A6289PedNumRq ;
   private java.util.Date[] T01SJ2_A8158PedFecPEn ;
   private String[] T01SJ2_A8159PedLinObs ;
   private String[] T01SJ2_A396EmprCod ;
   private String[] T01SJ2_A719PrdNum ;
   private int[] T01SJ2_A658PedCod ;
   private boolean[] T01SJ2_n658PedCod ;
   private java.util.Date[] T01SJ15_A661PedFec ;
   private java.util.Date[] T01SJ15_A662PedFecEnt ;
   private String[] T01SJ15_A667PedSit ;
   private String[] T01SJ16_A718PrdNom ;
   private java.math.BigDecimal[] T01SJ16_A684PrdCanPen ;
   private java.math.BigDecimal[] T01SJ16_A724PrdPreAct ;
   private int[] T01SJ16_A795PrvNum ;
   private String[] T01SJ17_A396EmprCod ;
   private int[] T01SJ17_A756PrePrvNum ;
   private String[] T01SJ17_A719PrdNum ;
   private String[] T01SJ18_A396EmprCod ;
   private String[] T01SJ18_A719PrdNum ;
   private short[] T01SJ18_A597LinEnt ;
   private String[] T01SJ19_A396EmprCod ;
   private int[] T01SJ19_A658PedCod ;
   private boolean[] T01SJ19_n658PedCod ;
   private String[] T01SJ19_A719PrdNum ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class pedidoporproducto_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pedidoporproducto_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pedidoporproducto_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class pedidoporproducto_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SJ2", "SELECT PedUni, PedCanEnt, PedPre, PedDto, PedVal, PedCum, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs, EmprCod, PrdNum, PedCod FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedUni, PedCanEnt, PedPre, PedDto, PedVal, PedCum, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ3", "SELECT PedUni, PedCanEnt, PedPre, PedDto, PedVal, PedCum, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs, EmprCod, PrdNum, PedCod FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ4", "SELECT PrdNom, PrdCanPen, PrdPreAct, PrvNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ5", "SELECT PedFec, PedFecEnt, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ6", "SELECT /*+ FIRST_ROWS(100) */ T2.PedFec, T2.PedFecEnt, T2.PedSit, T3.PrdNom, TM1.PedUni, TM1.PedCanEnt, TM1.PedPre, TM1.PedDto, TM1.PedVal, TM1.PedCum, TM1.PedFulEnt, T3.PrdCanPen, TM1.PedNumCoP, TM1.PedConInP, TM1.PedConFiP, TM1.PedNumCoE, TM1.PedConInE, TM1.PedConFiE, TM1.PedEtiPrd, T3.PrdPreAct, TM1.PedNumRq, TM1.PedFecPEn, TM1.PedLinObs, TM1.EmprCod, TM1.PrdNum, TM1.PedCod, T3.PrvNum FROM ((TXPLPEDID TM1 INNER JOIN TXPCPEDID T2 ON T2.EmprCod = TM1.EmprCod AND T2.PedCod = TM1.PedCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.PedCod = ? ORDER BY TM1.EmprCod, TM1.PedCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ7", "SELECT PedFec, PedFecEnt, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ8", "SELECT PrdNom, PrdCanPen, PrdPreAct, PrvNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PedCod FROM TXPLPEDID WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and PedCod > ?) ORDER BY EmprCod, PedCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SJ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PedCod FROM TXPLPEDID WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and PedCod < ?) ORDER BY EmprCod DESC, PedCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SJ12", "INSERT INTO TXPLPEDID(PedUni, PedCanEnt, PedPre, PedDto, PedVal, PedCum, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs, EmprCod, PrdNum, PedCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPEDID")
         ,new UpdateCursor("T01SJ13", "UPDATE TXPLPEDID SET PedUni=?, PedCanEnt=?, PedPre=?, PedDto=?, PedVal=?, PedCum=?, PedFulEnt=?, PedNumCoP=?, PedConInP=?, PedConFiP=?, PedNumCoE=?, PedConInE=?, PedConFiE=?, PedEtiPrd=?, PedNumRq=?, PedFecPEn=?, PedLinObs=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new UpdateCursor("T01SJ14", "DELETE FROM TXPLPEDID  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new ForEachCursor("T01SJ15", "SELECT PedFec, PedFecEnt, PedSit FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ16", "SELECT PrdNom, PrdCanPen, PrdPreAct, PrvNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SJ17", "SELECT * FROM (SELECT EmprCod, PrePrvNum, PrdNum FROM TXPPREPED WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SJ18", "SELECT * FROM (SELECT EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SJ19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PedCod, PrdNum FROM TXPLPEDID ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 60);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 60);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((String[]) buf[18])[0] = rslt.getString(19, 6);
               ((int[]) buf[19])[0] = rslt.getInt(20);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(20,5);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(22);
               ((String[]) buf[22])[0] = rslt.getString(23, 60);
               ((String[]) buf[23])[0] = rslt.getString(24, 3);
               ((String[]) buf[24])[0] = rslt.getString(25, 6);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((int[]) buf[26])[0] = rslt.getInt(27);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[6]).intValue());
               }
               return;
            case 10 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setString(17, (String)parms[16], 60);
               stmt.setString(18, (String)parms[17], 3);
               stmt.setString(19, (String)parms[18], 6);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[20]).intValue());
               }
               return;
            case 11 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setString(17, (String)parms[16], 60);
               stmt.setString(18, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[19]).intValue());
               }
               stmt.setString(20, (String)parms[20], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

