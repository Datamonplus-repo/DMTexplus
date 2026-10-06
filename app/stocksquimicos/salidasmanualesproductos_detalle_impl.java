package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_detalle_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"ULTFECCCS") == 0 )
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
         gx2asaultfecccs1QZ112( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A859CumCodCont) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Salidas Manuales Productos", ""), (short)(0)) ;
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

   public salidasmanualesproductos_detalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanualesproductos_detalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_detalle_impl.class ));
   }

   public salidasmanualesproductos_detalle_impl( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCumUMed = new HTMLChoice();
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
      if ( cmbCumUMed.getItemCount() > 0 )
      {
         A12700CumUMed = (byte)(GXutil.lval( cmbCumUMed.getValidValue(GXutil.trim( GXutil.str( A12700CumUMed, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCumUMed.setValue( GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Values", cmbCumUMed.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Salidas Manuales Productos", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCodCont_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCodCont_Internalname, httpContext.getMessage( "Codigo Contador", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCodCont_Internalname, GXutil.ltrim( localUtil.ntoc( A859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumCodCont_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A859CumCodCont), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A859CumCodCont), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCodCont_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCumCodCont_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConCant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConCant_Internalname, GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumConCant_Enabled!=0) ? localUtil.format( A860CumConCant, "ZZZZZZ9.9999") : localUtil.format( A860CumConCant, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConCant_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCumConCant_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConCbis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConCbis_Internalname, httpContext.getMessage( "Cantidad2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConCbis_Internalname, GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumConCbis_Enabled!=0) ? localUtil.format( A861CumConCbis, "ZZZZZZ9.9999") : localUtil.format( A861CumConCbis, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConCbis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCumConCbis_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumCosPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumCosPro_Internalname, httpContext.getMessage( "Coste Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumCosPro_Internalname, GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumCosPro_Enabled!=0) ? localUtil.format( A863CumCosPro, "ZZZZZZ9.99") : localUtil.format( A863CumCosPro, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumCosPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCumCosPro_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanRes_Internalname, httpContext.getMessage( "Cantidad Reservada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreMed_Internalname, httpContext.getMessage( "Precio Medio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreMed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreMed_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtUltFecCCs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtUltFecCCs_Internalname, httpContext.getMessage( "Ultimo valor Fecha,Entradas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtUltFecCCs_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtUltFecCCs_Internalname, localUtil.format(A3835UltFecCCs, "99/99/99"), localUtil.format( A3835UltFecCCs, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtUltFecCCs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtUltFecCCs_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtUltFecCCs_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtUltFecCCs_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFacCon_Internalname, httpContext.getMessage( "Factor de Conversion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumConLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumConLot_Internalname, httpContext.getMessage( "Lote Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumConLot_Internalname, GXutil.rtrim( A5862CumConLot), GXutil.rtrim( localUtil.format( A5862CumConLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumConLot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCumConLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdValStk_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdValStk_Internalname, httpContext.getMessage( "Valor Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValStk_Enabled!=0) ? localUtil.format( A750PrdValStk, "ZZZZZZZ9.99") : localUtil.format( A750PrdValStk, "ZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValStk_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdUMe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdUMe_Internalname, httpContext.getMessage( "Unidad Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdUMe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdDsc_Internalname, httpContext.getMessage( "Descripcion Unidades Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCumUnidad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCumUnidad_Internalname, httpContext.getMessage( "Unidad Consumo 1=KgsLts,0=GrCc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCumUnidad_Internalname, GXutil.ltrim( localUtil.ntoc( A8639CumUnidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCumUnidad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8639CumUnidad), "9") : localUtil.format( DecimalUtil.doubleToDec(A8639CumUnidad), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCumUnidad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCumUnidad_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComID_Internalname, httpContext.getMessage( "Producto Compuesto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComID_Internalname, GXutil.rtrim( A12257PrdComID), GXutil.rtrim( localUtil.format( A12257PrdComID, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComID_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote), GXutil.rtrim( localUtil.format( A10881PrdLote, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLote_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCumUMed.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCumUMed.getInternalname(), httpContext.getMessage( "Unidad de consumo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCumUMed, cmbCumUMed.getInternalname(), GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)), 1, cmbCumUMed.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbCumUMed.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "", true, (byte)(0), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      cmbCumUMed.setValue( GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Values", cmbCumUMed.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_Detalle.htm");
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
         Z859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( "Z859CumCodCont"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z860CumConCant = localUtil.ctond( httpContext.cgiGet( "Z860CumConCant")) ;
         Z861CumConCbis = localUtil.ctond( httpContext.cgiGet( "Z861CumConCbis")) ;
         Z5862CumConLot = httpContext.cgiGet( "Z5862CumConLot") ;
         Z8639CumUnidad = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8639CumUnidad"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12257PrdComID = httpContext.cgiGet( "Z12257PrdComID") ;
         Z12700CumUMed = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12700CumUMed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3915EmpNumDec = false ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCODCONT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCumCodCont_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A859CumCodCont = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         }
         else
         {
            A859CumCodCont = (int)(localUtil.ctol( httpContext.cgiGet( edtCumCodCont_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCONCANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCumConCant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A860CumConCant = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         }
         else
         {
            A860CumConCant = localUtil.ctond( httpContext.cgiGet( edtCumConCant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMCONCBIS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCumConCbis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A861CumConCbis = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         }
         else
         {
            A861CumConCbis = localUtil.ctond( httpContext.cgiGet( edtCumConCbis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         }
         A863CumCosPro = localUtil.ctond( httpContext.cgiGet( edtCumCosPro_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A3835UltFecCCs = localUtil.ctod( httpContext.cgiGet( edtUltFecCCs_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A5862CumConLot = httpContext.cgiGet( edtCumConLot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
         A750PrdValStk = localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A490ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         else
         {
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
         n488ForPrdDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCumUnidad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCumUnidad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CUMUNIDAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtCumUnidad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8639CumUnidad = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         }
         else
         {
            A8639CumUnidad = (byte)(localUtil.ctol( httpContext.cgiGet( edtCumUnidad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         }
         A12257PrdComID = httpContext.cgiGet( edtPrdComID_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12257PrdComID", A12257PrdComID);
         A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         cmbCumUMed.setValue( httpContext.cgiGet( cmbCumUMed.getInternalname()) );
         A12700CumUMed = (byte)(GXutil.lval( httpContext.cgiGet( cmbCumUMed.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
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
            A859CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
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
            initAll1QZ112( ) ;
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
      disableAttributes1QZ112( ) ;
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

   public void resetCaption1QZ0( )
   {
   }

   public void zm1QZ112( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z860CumConCant = T01QZ3_A860CumConCant[0] ;
            Z861CumConCbis = T01QZ3_A861CumConCbis[0] ;
            Z5862CumConLot = T01QZ3_A5862CumConLot[0] ;
            Z8639CumUnidad = T01QZ3_A8639CumUnidad[0] ;
            Z12257PrdComID = T01QZ3_A12257PrdComID[0] ;
            Z12700CumUMed = T01QZ3_A12700CumUMed[0] ;
            Z490ForPrdUMe = T01QZ3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z860CumConCant = A860CumConCant ;
            Z861CumConCbis = A861CumConCbis ;
            Z5862CumConLot = A5862CumConLot ;
            Z8639CumUnidad = A8639CumUnidad ;
            Z12257PrdComID = A12257PrdComID ;
            Z12700CumUMed = A12700CumUMed ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z860CumConCant = A860CumConCant ;
         Z861CumConCbis = A861CumConCbis ;
         Z5862CumConLot = A5862CumConLot ;
         Z8639CumUnidad = A8639CumUnidad ;
         Z12257PrdComID = A12257PrdComID ;
         Z12700CumUMed = A12700CumUMed ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z859CumCodCont = A859CumCodCont ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z750PrdValStk = A750PrdValStk ;
         Z10881PrdLote = A10881PrdLote ;
         Z488ForPrdDsc = A488ForPrdDsc ;
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

   public void load1QZ112( )
   {
      /* Using cursor T01QZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A407EmprNom = T01QZ8_A407EmprNom[0] ;
         n407EmprNom = T01QZ8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T01QZ8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A860CumConCant = T01QZ8_A860CumConCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         A861CumConCbis = T01QZ8_A861CumConCbis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         A724PrdPreAct = T01QZ8_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = T01QZ8_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T01QZ8_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = T01QZ8_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A726PrdPreMed = T01QZ8_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A707PrdFacCon = T01QZ8_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A5862CumConLot = T01QZ8_A5862CumConLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
         A750PrdValStk = T01QZ8_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A488ForPrdDsc = T01QZ8_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01QZ8_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A8639CumUnidad = T01QZ8_A8639CumUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         A12257PrdComID = T01QZ8_A12257PrdComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12257PrdComID", A12257PrdComID);
         A10881PrdLote = T01QZ8_A10881PrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A12700CumUMed = T01QZ8_A12700CumUMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
         A3915EmpNumDec = T01QZ8_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01QZ8_n3915EmpNumDec[0] ;
         A490ForPrdUMe = T01QZ8_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         zm1QZ112( -4) ;
      }
      pr_default.close(6);
      onLoadActions1QZ112( ) ;
   }

   public void onLoadActions1QZ112( )
   {
      if ( A3915EmpNumDec == 0 )
      {
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
         else
         {
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
      }
      GXt_date1 = A3835UltFecCCs ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_date4) ;
      salidasmanualesproductos_detalle_impl.this.A396EmprCod = GXv_char2[0] ;
      salidasmanualesproductos_detalle_impl.this.A719PrdNum = GXv_char3[0] ;
      salidasmanualesproductos_detalle_impl.this.GXt_date1 = GXv_date4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
   }

   public void checkExtendedTable1QZ112( )
   {
      nIsDirty_112 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QZ4_A407EmprNom[0] ;
      n407EmprNom = T01QZ4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01QZ4_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01QZ4_n3915EmpNumDec[0] ;
      pr_default.close(2);
      /* Using cursor T01QZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01QZ6_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01QZ6_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(4);
      /* Using cursor T01QZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01QZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01QZ5_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01QZ5_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A704PrdExiAlm = T01QZ5_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = T01QZ5_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = T01QZ5_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A726PrdPreMed = T01QZ5_A726PrdPreMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A707PrdFacCon = T01QZ5_A707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A750PrdValStk = T01QZ5_A750PrdValStk[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A10881PrdLote = T01QZ5_A10881PrdLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      pr_default.close(3);
      if ( A3915EmpNumDec == 0 )
      {
         nIsDirty_112 = (short)(1) ;
         A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
      }
      else
      {
         if ( A3915EmpNumDec == 2 )
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
         else
         {
            nIsDirty_112 = (short)(1) ;
            A863CumCosPro = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
      }
      nIsDirty_112 = (short)(1) ;
      GXt_date1 = A3835UltFecCCs ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
      salidasmanualesproductos_detalle_impl.this.A396EmprCod = GXv_char3[0] ;
      salidasmanualesproductos_detalle_impl.this.A719PrdNum = GXv_char2[0] ;
      salidasmanualesproductos_detalle_impl.this.GXt_date1 = GXv_date4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1QZ112( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod )
   {
      /* Using cursor T01QZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QZ9_A407EmprNom[0] ;
      n407EmprNom = T01QZ9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01QZ9_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01QZ9_n3915EmpNumDec[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_7( String A396EmprCod ,
                         byte A490ForPrdUMe )
   {
      /* Using cursor T01QZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A488ForPrdDsc = T01QZ10_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01QZ10_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_8( String A396EmprCod ,
                         int A859CumCodCont )
   {
      /* Using cursor T01QZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_6( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T01QZ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01QZ12_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01QZ12_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A704PrdExiAlm = T01QZ12_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = T01QZ12_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = T01QZ12_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A726PrdPreMed = T01QZ12_A726PrdPreMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A707PrdFacCon = T01QZ12_A707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A750PrdValStk = T01QZ12_A750PrdValStk[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A10881PrdLote = T01QZ12_A10881PrdLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10881PrdLote))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1QZ112( )
   {
      /* Using cursor T01QZ13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound112 = (short)(1) ;
      }
      else
      {
         RcdFound112 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QZ112( 4) ;
         RcdFound112 = (short)(1) ;
         A860CumConCant = T01QZ3_A860CumConCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
         A861CumConCbis = T01QZ3_A861CumConCbis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
         A5862CumConLot = T01QZ3_A5862CumConLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
         A8639CumUnidad = T01QZ3_A8639CumUnidad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
         A12257PrdComID = T01QZ3_A12257PrdComID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12257PrdComID", A12257PrdComID);
         A12700CumUMed = T01QZ3_A12700CumUMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
         A396EmprCod = T01QZ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01QZ3_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A490ForPrdUMe = T01QZ3_A490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A859CumCodCont = T01QZ3_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z859CumCodCont = A859CumCodCont ;
         Z719PrdNum = A719PrdNum ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QZ112( ) ;
         if ( AnyError == 1 )
         {
            RcdFound112 = (short)(0) ;
            initializeNonKey1QZ112( ) ;
         }
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound112 = (short)(0) ;
         initializeNonKey1QZ112( ) ;
         sMode112 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode112 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QZ112( ) ;
      if ( RcdFound112 == 0 )
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
      RcdFound112 = (short)(0) ;
      /* Using cursor T01QZ14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01QZ14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QZ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QZ14_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01QZ14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QZ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QZ14_A859CumCodCont[0] < A859CumCodCont ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01QZ14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QZ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QZ14_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01QZ14_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QZ14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QZ14_A859CumCodCont[0] > A859CumCodCont ) ) )
         {
            A396EmprCod = T01QZ14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01QZ14_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A859CumCodCont = T01QZ14_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound112 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound112 = (short)(0) ;
      /* Using cursor T01QZ15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01QZ15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QZ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QZ15_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01QZ15_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QZ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QZ15_A859CumCodCont[0] > A859CumCodCont ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01QZ15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QZ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QZ15_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01QZ15_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01QZ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QZ15_A859CumCodCont[0] < A859CumCodCont ) ) )
         {
            A396EmprCod = T01QZ15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T01QZ15_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A859CumCodCont = T01QZ15_A859CumCodCont[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
            RcdFound112 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QZ112( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QZ112( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound112 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A859CumCodCont = Z859CumCodCont ;
               httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
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
               update1QZ112( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QZ112( ) ;
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
                  insert1QZ112( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A859CumCodCont != Z859CumCodCont ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = Z859CumCodCont ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
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
      if ( RcdFound112 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCumConCant_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QZ112( ) ;
      if ( RcdFound112 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCumConCant_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QZ112( ) ;
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
      if ( RcdFound112 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCumConCant_Internalname ;
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
      if ( RcdFound112 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCumConCant_Internalname ;
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
      scanStart1QZ112( ) ;
      if ( RcdFound112 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound112 != 0 )
         {
            scanNext1QZ112( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCumConCant_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QZ112( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QZ112( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z860CumConCant, T01QZ2_A860CumConCant[0]) != 0 ) || ( DecimalUtil.compareTo(Z861CumConCbis, T01QZ2_A861CumConCbis[0]) != 0 ) || ( GXutil.strcmp(Z5862CumConLot, T01QZ2_A5862CumConLot[0]) != 0 ) || ( Z8639CumUnidad != T01QZ2_A8639CumUnidad[0] ) || ( GXutil.strcmp(Z12257PrdComID, T01QZ2_A12257PrdComID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12700CumUMed != T01QZ2_A12700CumUMed[0] ) || ( Z490ForPrdUMe != T01QZ2_A490ForPrdUMe[0] ) )
         {
            if ( DecimalUtil.compareTo(Z860CumConCant, T01QZ2_A860CumConCant[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"CumConCant");
               GXutil.writeLogRaw("Old: ",Z860CumConCant);
               GXutil.writeLogRaw("Current: ",T01QZ2_A860CumConCant[0]);
            }
            if ( DecimalUtil.compareTo(Z861CumConCbis, T01QZ2_A861CumConCbis[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"CumConCbis");
               GXutil.writeLogRaw("Old: ",Z861CumConCbis);
               GXutil.writeLogRaw("Current: ",T01QZ2_A861CumConCbis[0]);
            }
            if ( GXutil.strcmp(Z5862CumConLot, T01QZ2_A5862CumConLot[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"CumConLot");
               GXutil.writeLogRaw("Old: ",Z5862CumConLot);
               GXutil.writeLogRaw("Current: ",T01QZ2_A5862CumConLot[0]);
            }
            if ( Z8639CumUnidad != T01QZ2_A8639CumUnidad[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"CumUnidad");
               GXutil.writeLogRaw("Old: ",Z8639CumUnidad);
               GXutil.writeLogRaw("Current: ",T01QZ2_A8639CumUnidad[0]);
            }
            if ( GXutil.strcmp(Z12257PrdComID, T01QZ2_A12257PrdComID[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"PrdComID");
               GXutil.writeLogRaw("Old: ",Z12257PrdComID);
               GXutil.writeLogRaw("Current: ",T01QZ2_A12257PrdComID[0]);
            }
            if ( Z12700CumUMed != T01QZ2_A12700CumUMed[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"CumUMed");
               GXutil.writeLogRaw("Old: ",Z12700CumUMed);
               GXutil.writeLogRaw("Current: ",T01QZ2_A12700CumUMed[0]);
            }
            if ( Z490ForPrdUMe != T01QZ2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("stocksquimicos.salidasmanualesproductos_detalle:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01QZ2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLCUMCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QZ112( )
   {
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QZ112( 0) ;
         checkOptimisticConcurrency1QZ112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QZ112( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QZ112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QZ16 */
                  pr_default.execute(14, new Object[] {A860CumConCant, A861CumConCbis, A5862CumConLot, Byte.valueOf(A8639CumUnidad), A12257PrdComID, Byte.valueOf(A12700CumUMed), A396EmprCod, A719PrdNum, Byte.valueOf(A490ForPrdUMe), Integer.valueOf(A859CumCodCont)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1QZ0( ) ;
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
            load1QZ112( ) ;
         }
         endLevel1QZ112( ) ;
      }
      closeExtendedTableCursors1QZ112( ) ;
   }

   public void update1QZ112( )
   {
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QZ112( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QZ112( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QZ112( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QZ17 */
                  pr_default.execute(15, new Object[] {A860CumConCant, A861CumConCbis, A5862CumConLot, Byte.valueOf(A8639CumUnidad), A12257PrdComID, Byte.valueOf(A12700CumUMed), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLCUMCO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QZ112( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QZ0( ) ;
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
         endLevel1QZ112( ) ;
      }
      closeExtendedTableCursors1QZ112( ) ;
   }

   public void deferredUpdate1QZ112( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QZ112( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QZ112( ) ;
         afterConfirm1QZ112( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QZ112( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QZ18 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLCUMCO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound112 == 0 )
                     {
                        initAll1QZ112( ) ;
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
                     resetCaption1QZ0( ) ;
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
      sMode112 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QZ112( ) ;
      Gx_mode = sMode112 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QZ112( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QZ19 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T01QZ19_A407EmprNom[0] ;
         n407EmprNom = T01QZ19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A3915EmpNumDec = T01QZ19_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01QZ19_n3915EmpNumDec[0] ;
         pr_default.close(17);
         /* Using cursor T01QZ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01QZ20_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A724PrdPreAct = T01QZ20_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A704PrdExiAlm = T01QZ20_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T01QZ20_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = T01QZ20_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A726PrdPreMed = T01QZ20_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A707PrdFacCon = T01QZ20_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A750PrdValStk = T01QZ20_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A10881PrdLote = T01QZ20_A10881PrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         pr_default.close(18);
         GXt_date1 = A3835UltFecCCs ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char2[0] = A719PrdNum ;
         GXv_date4[0] = GXt_date1 ;
         new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
         salidasmanualesproductos_detalle_impl.this.A396EmprCod = GXv_char3[0] ;
         salidasmanualesproductos_detalle_impl.this.A719PrdNum = GXv_char2[0] ;
         salidasmanualesproductos_detalle_impl.this.GXt_date1 = GXv_date4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A3835UltFecCCs = GXt_date1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
         if ( A3915EmpNumDec == 0 )
         {
            A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
         }
         else
         {
            if ( A3915EmpNumDec == 2 )
            {
               A863CumCosPro = GXutil.roundDecimal( A861CumConCbis.multiply(A724PrdPreAct), 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
            }
            else
            {
               A863CumCosPro = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
            }
         }
         /* Using cursor T01QZ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01QZ21_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01QZ21_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(19);
      }
   }

   public void endLevel1QZ112( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QZ112( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_detalle");
         if ( AnyError == 0 )
         {
            confirmValues1QZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_detalle");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QZ112( )
   {
      /* Using cursor T01QZ22 */
      pr_default.execute(20);
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A396EmprCod = T01QZ22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = T01QZ22_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         A719PrdNum = T01QZ22_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QZ112( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound112 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound112 = (short)(1) ;
         A396EmprCod = T01QZ22_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A859CumCodCont = T01QZ22_A859CumCodCont[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
         A719PrdNum = T01QZ22_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1QZ112( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1QZ112( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QZ112( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QZ112( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QZ112( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QZ112( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QZ112( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QZ112( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCumCodCont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCodCont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCodCont_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtCumConCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCant_Enabled), 5, 0), true);
      edtCumConCbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConCbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConCbis_Enabled), 5, 0), true);
      edtCumCosPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumCosPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumCosPro_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), true);
      edtPrdPreMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), true);
      edtUltFecCCs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUltFecCCs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUltFecCCs_Enabled), 5, 0), true);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), true);
      edtCumConLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumConLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumConLot_Enabled), 5, 0), true);
      edtPrdValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtCumUnidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCumUnidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCumUnidad_Enabled), 5, 0), true);
      edtPrdComID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComID_Enabled), 5, 0), true);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), true);
      cmbCumUMed.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCumUMed.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QZ112( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.salidasmanualesproductos_detalle", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z859CumCodCont", GXutil.ltrim( localUtil.ntoc( Z859CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z860CumConCant", GXutil.ltrim( localUtil.ntoc( Z860CumConCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z861CumConCbis", GXutil.ltrim( localUtil.ntoc( Z861CumConCbis, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5862CumConLot", GXutil.rtrim( Z5862CumConLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8639CumUnidad", GXutil.ltrim( localUtil.ntoc( Z8639CumUnidad, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12257PrdComID", GXutil.rtrim( Z12257PrdComID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12700CumUMed", GXutil.ltrim( localUtil.ntoc( Z12700CumUMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.stocksquimicos.salidasmanualesproductos_detalle", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.SalidasManualesProductos_Detalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salidas Manuales Productos", "") ;
   }

   public void initializeNonKey1QZ112( )
   {
      A863CumCosPro = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrimstr( A863CumCosPro, 10, 2));
      A3835UltFecCCs = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A860CumConCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrimstr( A860CumConCant, 12, 4));
      A861CumConCbis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrimstr( A861CumConCbis, 12, 4));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A5862CumConLot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", A5862CumConLot);
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A490ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A8639CumUnidad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.str( A8639CumUnidad, 1, 0));
      A12257PrdComID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12257PrdComID", A12257PrdComID);
      A10881PrdLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A12700CumUMed = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
      A3915EmpNumDec = (byte)(0) ;
      n3915EmpNumDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      Z860CumConCant = DecimalUtil.ZERO ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z5862CumConLot = "" ;
      Z8639CumUnidad = (byte)(0) ;
      Z12257PrdComID = "" ;
      Z12700CumUMed = (byte)(0) ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1QZ112( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A859CumCodCont = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A859CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(A859CumCodCont), 8, 0));
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1QZ112( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415111455", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/salidasmanualesproductos_detalle.js", "?202682415111455", false, true);
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
      edtCumCodCont_Internalname = "CUMCODCONT" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtCumConCant_Internalname = "CUMCONCANT" ;
      edtCumConCbis_Internalname = "CUMCONCBIS" ;
      edtCumCosPro_Internalname = "CUMCOSPRO" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtPrdPreMed_Internalname = "PRDPREMED" ;
      edtUltFecCCs_Internalname = "ULTFECCCS" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      edtCumConLot_Internalname = "CUMCONLOT" ;
      edtPrdValStk_Internalname = "PRDVALSTK" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtCumUnidad_Internalname = "CUMUNIDAD" ;
      edtPrdComID_Internalname = "PRDCOMID" ;
      edtPrdLote_Internalname = "PRDLOTE" ;
      cmbCumUMed.setInternalname( "CUMUMED" );
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
      Form.setCaption( httpContext.getMessage( "Salidas Manuales Productos", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbCumUMed.setJsonclick( "" );
      cmbCumUMed.setEnabled( 1 );
      edtPrdLote_Jsonclick = "" ;
      edtPrdLote_Enabled = 0 ;
      edtPrdComID_Jsonclick = "" ;
      edtPrdComID_Enabled = 1 ;
      edtCumUnidad_Jsonclick = "" ;
      edtCumUnidad_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtPrdValStk_Jsonclick = "" ;
      edtPrdValStk_Enabled = 0 ;
      edtCumConLot_Jsonclick = "" ;
      edtCumConLot_Enabled = 1 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 0 ;
      edtUltFecCCs_Jsonclick = "" ;
      edtUltFecCCs_Enabled = 0 ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreMed_Enabled = 0 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 0 ;
      edtCumCosPro_Jsonclick = "" ;
      edtCumCosPro_Enabled = 0 ;
      edtCumConCbis_Jsonclick = "" ;
      edtCumConCbis_Enabled = 1 ;
      edtCumConCant_Jsonclick = "" ;
      edtCumConCant_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtCumCodCont_Jsonclick = "" ;
      edtCumCodCont_Enabled = 1 ;
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

   public void gx2asaultfecccs1QZ112( String A396EmprCod ,
                                      String A719PrdNum )
   {
      GXt_date1 = A3835UltFecCCs ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
      salidasmanualesproductos_detalle_impl.this.A396EmprCod = GXv_char3[0] ;
      salidasmanualesproductos_detalle_impl.this.A719PrdNum = GXv_char2[0] ;
      salidasmanualesproductos_detalle_impl.this.GXt_date1 = GXv_date4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A3835UltFecCCs = GXt_date1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A3835UltFecCCs, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      cmbCumUMed.setName( "CUMUMED" );
      cmbCumUMed.setWebtags( "" );
      cmbCumUMed.addItem("0", httpContext.getMessage( "Sin Definir", ""), (short)(0));
      cmbCumUMed.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbCumUMed.addItem("2", httpContext.getMessage( "Gramos", ""), (short)(0));
      cmbCumUMed.addItem("3", httpContext.getMessage( "Litros", ""), (short)(0));
      cmbCumUMed.addItem("4", httpContext.getMessage( "Mililitros", ""), (short)(0));
      if ( cmbCumUMed.getItemCount() > 0 )
      {
         A12700CumUMed = (byte)(GXutil.lval( cmbCumUMed.getValidValue(GXutil.trim( GXutil.str( A12700CumUMed, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.str( A12700CumUMed, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01QZ19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QZ19_A407EmprNom[0] ;
      n407EmprNom = T01QZ19_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3915EmpNumDec = T01QZ19_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01QZ19_n3915EmpNumDec[0] ;
      pr_default.close(17);
      /* Using cursor T01QZ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(21);
      /* Using cursor T01QZ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01QZ20_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A724PrdPreAct = T01QZ20_A724PrdPreAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A704PrdExiAlm = T01QZ20_A704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = T01QZ20_A705PrdExiCC[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = T01QZ20_A685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A726PrdPreMed = T01QZ20_A726PrdPreMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A707PrdFacCon = T01QZ20_A707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A750PrdValStk = T01QZ20_A750PrdValStk[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A10881PrdLote = T01QZ20_A10881PrdLote[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      pr_default.close(18);
      GX_FocusControl = edtCumConCant_Internalname ;
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
      n3915EmpNumDec = false ;
      /* Using cursor T01QZ19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01QZ19_A407EmprNom[0] ;
      n407EmprNom = T01QZ19_n407EmprNom[0] ;
      A3915EmpNumDec = T01QZ19_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01QZ19_n3915EmpNumDec[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Cumcodcont( )
   {
      /* Using cursor T01QZ23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A859CumCodCont)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCUMCO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CUMCODCONT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Prdnum( )
   {
      A12700CumUMed = (byte)(GXutil.lval( cmbCumUMed.getValue())) ;
      cmbCumUMed.setValue( GXutil.str( A12700CumUMed, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01QZ20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A718PrdNom = T01QZ20_A718PrdNom[0] ;
      A724PrdPreAct = T01QZ20_A724PrdPreAct[0] ;
      A704PrdExiAlm = T01QZ20_A704PrdExiAlm[0] ;
      A705PrdExiCC = T01QZ20_A705PrdExiCC[0] ;
      A685PrdCanRes = T01QZ20_A685PrdCanRes[0] ;
      A726PrdPreMed = T01QZ20_A726PrdPreMed[0] ;
      A707PrdFacCon = T01QZ20_A707PrdFacCon[0] ;
      A750PrdValStk = T01QZ20_A750PrdValStk[0] ;
      A10881PrdLote = T01QZ20_A10881PrdLote[0] ;
      pr_default.close(18);
      GXt_date1 = A3835UltFecCCs ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = A719PrdNum ;
      GXv_date4[0] = GXt_date1 ;
      new app.pstm005(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_date4) ;
      salidasmanualesproductos_detalle_impl.this.A396EmprCod = GXv_char3[0] ;
      salidasmanualesproductos_detalle_impl.this.A719PrdNum = GXv_char2[0] ;
      salidasmanualesproductos_detalle_impl.this.GXt_date1 = GXv_date4[0] ;
      A3835UltFecCCs = GXt_date1 ;
      dynload_actions( ) ;
      if ( cmbCumUMed.getItemCount() > 0 )
      {
         A12700CumUMed = (byte)(GXutil.lval( cmbCumUMed.getValidValue(GXutil.trim( GXutil.str( A12700CumUMed, 1, 0))))) ;
         cmbCumUMed.setValue( GXutil.str( A12700CumUMed, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCumUMed.setValue( GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A860CumConCant", GXutil.ltrim( localUtil.ntoc( A860CumConCant, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A861CumConCbis", GXutil.ltrim( localUtil.ntoc( A861CumConCbis, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5862CumConLot", GXutil.rtrim( A5862CumConLot));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8639CumUnidad", GXutil.ltrim( localUtil.ntoc( A8639CumUnidad, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12257PrdComID", GXutil.rtrim( A12257PrdComID));
      httpContext.ajax_rsp_assign_attri("", false, "A12700CumUMed", GXutil.ltrim( localUtil.ntoc( A12700CumUMed, (byte)(1), (byte)(0), ".", "")));
      cmbCumUMed.setValue( GXutil.trim( GXutil.str( A12700CumUMed, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCumUMed.getInternalname(), "Values", cmbCumUMed.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A863CumCosPro", GXutil.ltrim( localUtil.ntoc( A863CumCosPro, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3835UltFecCCs", localUtil.format(A3835UltFecCCs, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z859CumCodCont", GXutil.ltrim( localUtil.ntoc( Z859CumCodCont, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z860CumConCant", GXutil.ltrim( localUtil.ntoc( Z860CumConCant, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z861CumConCbis", GXutil.ltrim( localUtil.ntoc( Z861CumConCbis, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5862CumConLot", GXutil.rtrim( Z5862CumConLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8639CumUnidad", GXutil.ltrim( localUtil.ntoc( Z8639CumUnidad, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12257PrdComID", GXutil.rtrim( Z12257PrdComID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12700CumUMed", GXutil.ltrim( localUtil.ntoc( Z12700CumUMed, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3915EmpNumDec", GXutil.ltrim( localUtil.ntoc( Z3915EmpNumDec, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z488ForPrdDsc", GXutil.rtrim( Z488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10881PrdLote", GXutil.rtrim( Z10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z863CumCosPro", GXutil.ltrim( localUtil.ntoc( Z863CumCosPro, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3835UltFecCCs", localUtil.format(Z3835UltFecCCs, "99/99/99"));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Forprdume( )
   {
      n488ForPrdDsc = false ;
      /* Using cursor T01QZ21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A488ForPrdDsc = T01QZ21_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01QZ21_n488ForPrdDsc[0] ;
      pr_default.close(19);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'}]}");
      setEventMetadata("VALID_CUMCODCONT","{handler:'valid_Cumcodcont',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A859CumCodCont',fld:'CUMCODCONT',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_CUMCODCONT",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'cmbCumUMed'},{av:'A12700CumUMed',fld:'CUMUMED',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A859CumCodCont',fld:'CUMCODCONT',pic:'ZZZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A860CumConCant',fld:'CUMCONCANT',pic:'ZZZZZZ9.9999'},{av:'A861CumConCbis',fld:'CUMCONCBIS',pic:'ZZZZZZ9.9999'},{av:'A5862CumConLot',fld:'CUMCONLOT',pic:''},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A8639CumUnidad',fld:'CUMUNIDAD',pic:'9'},{av:'A12257PrdComID',fld:'PRDCOMID',pic:''},{av:'cmbCumUMed'},{av:'A12700CumUMed',fld:'CUMUMED',pic:'9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A3915EmpNumDec',fld:'EMPNUMDEC',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A863CumCosPro',fld:'CUMCOSPRO',pic:'ZZZZZZ9.99'},{av:'A3835UltFecCCs',fld:'ULTFECCCS',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z859CumCodCont'},{av:'Z719PrdNum'},{av:'Z860CumConCant'},{av:'Z861CumConCbis'},{av:'Z5862CumConLot'},{av:'Z490ForPrdUMe'},{av:'Z8639CumUnidad'},{av:'Z12257PrdComID'},{av:'Z12700CumUMed'},{av:'Z407EmprNom'},{av:'Z3915EmpNumDec'},{av:'Z488ForPrdDsc'},{av:'Z718PrdNom'},{av:'Z724PrdPreAct'},{av:'Z704PrdExiAlm'},{av:'Z705PrdExiCC'},{av:'Z685PrdCanRes'},{av:'Z726PrdPreMed'},{av:'Z707PrdFacCon'},{av:'Z750PrdValStk'},{av:'Z10881PrdLote'},{av:'Z863CumCosPro'},{av:'Z3835UltFecCCs'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_CUMCONCBIS","{handler:'valid_Cumconcbis',iparms:[]");
      setEventMetadata("VALID_CUMCONCBIS",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
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
      pr_default.close(17);
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z860CumConCant = DecimalUtil.ZERO ;
      Z861CumConCbis = DecimalUtil.ZERO ;
      Z5862CumConLot = "" ;
      Z12257PrdComID = "" ;
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
      A860CumConCant = DecimalUtil.ZERO ;
      A861CumConCbis = DecimalUtil.ZERO ;
      A863CumCosPro = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A3835UltFecCCs = GXutil.nullDate() ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A5862CumConLot = "" ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A12257PrdComID = "" ;
      A10881PrdLote = "" ;
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
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z10881PrdLote = "" ;
      Z488ForPrdDsc = "" ;
      T01QZ8_A407EmprNom = new String[] {""} ;
      T01QZ8_n407EmprNom = new boolean[] {false} ;
      T01QZ8_A718PrdNom = new String[] {""} ;
      T01QZ8_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A5862CumConLot = new String[] {""} ;
      T01QZ8_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ8_A488ForPrdDsc = new String[] {""} ;
      T01QZ8_n488ForPrdDsc = new boolean[] {false} ;
      T01QZ8_A8639CumUnidad = new byte[1] ;
      T01QZ8_A12257PrdComID = new String[] {""} ;
      T01QZ8_A10881PrdLote = new String[] {""} ;
      T01QZ8_A12700CumUMed = new byte[1] ;
      T01QZ8_A3915EmpNumDec = new byte[1] ;
      T01QZ8_n3915EmpNumDec = new boolean[] {false} ;
      T01QZ8_A396EmprCod = new String[] {""} ;
      T01QZ8_A719PrdNum = new String[] {""} ;
      T01QZ8_A490ForPrdUMe = new byte[1] ;
      T01QZ8_A859CumCodCont = new int[1] ;
      T01QZ4_A407EmprNom = new String[] {""} ;
      T01QZ4_n407EmprNom = new boolean[] {false} ;
      T01QZ4_A3915EmpNumDec = new byte[1] ;
      T01QZ4_n3915EmpNumDec = new boolean[] {false} ;
      T01QZ6_A488ForPrdDsc = new String[] {""} ;
      T01QZ6_n488ForPrdDsc = new boolean[] {false} ;
      T01QZ7_A396EmprCod = new String[] {""} ;
      T01QZ5_A718PrdNom = new String[] {""} ;
      T01QZ5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ5_A10881PrdLote = new String[] {""} ;
      T01QZ9_A407EmprNom = new String[] {""} ;
      T01QZ9_n407EmprNom = new boolean[] {false} ;
      T01QZ9_A3915EmpNumDec = new byte[1] ;
      T01QZ9_n3915EmpNumDec = new boolean[] {false} ;
      T01QZ10_A488ForPrdDsc = new String[] {""} ;
      T01QZ10_n488ForPrdDsc = new boolean[] {false} ;
      T01QZ11_A396EmprCod = new String[] {""} ;
      T01QZ12_A718PrdNom = new String[] {""} ;
      T01QZ12_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ12_A10881PrdLote = new String[] {""} ;
      T01QZ13_A396EmprCod = new String[] {""} ;
      T01QZ13_A859CumCodCont = new int[1] ;
      T01QZ13_A719PrdNum = new String[] {""} ;
      T01QZ3_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ3_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ3_A5862CumConLot = new String[] {""} ;
      T01QZ3_A8639CumUnidad = new byte[1] ;
      T01QZ3_A12257PrdComID = new String[] {""} ;
      T01QZ3_A12700CumUMed = new byte[1] ;
      T01QZ3_A396EmprCod = new String[] {""} ;
      T01QZ3_A719PrdNum = new String[] {""} ;
      T01QZ3_A490ForPrdUMe = new byte[1] ;
      T01QZ3_A859CumCodCont = new int[1] ;
      sMode112 = "" ;
      T01QZ14_A396EmprCod = new String[] {""} ;
      T01QZ14_A719PrdNum = new String[] {""} ;
      T01QZ14_A859CumCodCont = new int[1] ;
      T01QZ15_A396EmprCod = new String[] {""} ;
      T01QZ15_A719PrdNum = new String[] {""} ;
      T01QZ15_A859CumCodCont = new int[1] ;
      T01QZ2_A860CumConCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ2_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ2_A5862CumConLot = new String[] {""} ;
      T01QZ2_A8639CumUnidad = new byte[1] ;
      T01QZ2_A12257PrdComID = new String[] {""} ;
      T01QZ2_A12700CumUMed = new byte[1] ;
      T01QZ2_A396EmprCod = new String[] {""} ;
      T01QZ2_A719PrdNum = new String[] {""} ;
      T01QZ2_A490ForPrdUMe = new byte[1] ;
      T01QZ2_A859CumCodCont = new int[1] ;
      T01QZ19_A407EmprNom = new String[] {""} ;
      T01QZ19_n407EmprNom = new boolean[] {false} ;
      T01QZ19_A3915EmpNumDec = new byte[1] ;
      T01QZ19_n3915EmpNumDec = new boolean[] {false} ;
      T01QZ20_A718PrdNom = new String[] {""} ;
      T01QZ20_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QZ20_A10881PrdLote = new String[] {""} ;
      T01QZ21_A488ForPrdDsc = new String[] {""} ;
      T01QZ21_n488ForPrdDsc = new boolean[] {false} ;
      T01QZ22_A396EmprCod = new String[] {""} ;
      T01QZ22_A859CumCodCont = new int[1] ;
      T01QZ22_A719PrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QZ23_A396EmprCod = new String[] {""} ;
      Z863CumCosPro = DecimalUtil.ZERO ;
      Z3835UltFecCCs = GXutil.nullDate() ;
      GXt_date1 = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_date4 = new java.util.Date[1] ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ860CumConCant = DecimalUtil.ZERO ;
      ZZ861CumConCbis = DecimalUtil.ZERO ;
      ZZ5862CumConLot = "" ;
      ZZ12257PrdComID = "" ;
      ZZ407EmprNom = "" ;
      ZZ488ForPrdDsc = "" ;
      ZZ718PrdNom = "" ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ685PrdCanRes = DecimalUtil.ZERO ;
      ZZ726PrdPreMed = DecimalUtil.ZERO ;
      ZZ707PrdFacCon = DecimalUtil.ZERO ;
      ZZ750PrdValStk = DecimalUtil.ZERO ;
      ZZ10881PrdLote = "" ;
      ZZ863CumCosPro = DecimalUtil.ZERO ;
      ZZ3835UltFecCCs = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_detalle__default(),
         new Object[] {
             new Object[] {
            T01QZ2_A860CumConCant, T01QZ2_A861CumConCbis, T01QZ2_A5862CumConLot, T01QZ2_A8639CumUnidad, T01QZ2_A12257PrdComID, T01QZ2_A12700CumUMed, T01QZ2_A396EmprCod, T01QZ2_A719PrdNum, T01QZ2_A490ForPrdUMe, T01QZ2_A859CumCodCont
            }
            , new Object[] {
            T01QZ3_A860CumConCant, T01QZ3_A861CumConCbis, T01QZ3_A5862CumConLot, T01QZ3_A8639CumUnidad, T01QZ3_A12257PrdComID, T01QZ3_A12700CumUMed, T01QZ3_A396EmprCod, T01QZ3_A719PrdNum, T01QZ3_A490ForPrdUMe, T01QZ3_A859CumCodCont
            }
            , new Object[] {
            T01QZ4_A407EmprNom, T01QZ4_n407EmprNom, T01QZ4_A3915EmpNumDec, T01QZ4_n3915EmpNumDec
            }
            , new Object[] {
            T01QZ5_A718PrdNom, T01QZ5_A724PrdPreAct, T01QZ5_A704PrdExiAlm, T01QZ5_A705PrdExiCC, T01QZ5_A685PrdCanRes, T01QZ5_A726PrdPreMed, T01QZ5_A707PrdFacCon, T01QZ5_A750PrdValStk, T01QZ5_A10881PrdLote
            }
            , new Object[] {
            T01QZ6_A488ForPrdDsc, T01QZ6_n488ForPrdDsc
            }
            , new Object[] {
            T01QZ7_A396EmprCod
            }
            , new Object[] {
            T01QZ8_A407EmprNom, T01QZ8_n407EmprNom, T01QZ8_A718PrdNom, T01QZ8_A860CumConCant, T01QZ8_A861CumConCbis, T01QZ8_A724PrdPreAct, T01QZ8_A704PrdExiAlm, T01QZ8_A705PrdExiCC, T01QZ8_A685PrdCanRes, T01QZ8_A726PrdPreMed,
            T01QZ8_A707PrdFacCon, T01QZ8_A5862CumConLot, T01QZ8_A750PrdValStk, T01QZ8_A488ForPrdDsc, T01QZ8_n488ForPrdDsc, T01QZ8_A8639CumUnidad, T01QZ8_A12257PrdComID, T01QZ8_A10881PrdLote, T01QZ8_A12700CumUMed, T01QZ8_A3915EmpNumDec,
            T01QZ8_n3915EmpNumDec, T01QZ8_A396EmprCod, T01QZ8_A719PrdNum, T01QZ8_A490ForPrdUMe, T01QZ8_A859CumCodCont
            }
            , new Object[] {
            T01QZ9_A407EmprNom, T01QZ9_n407EmprNom, T01QZ9_A3915EmpNumDec, T01QZ9_n3915EmpNumDec
            }
            , new Object[] {
            T01QZ10_A488ForPrdDsc, T01QZ10_n488ForPrdDsc
            }
            , new Object[] {
            T01QZ11_A396EmprCod
            }
            , new Object[] {
            T01QZ12_A718PrdNom, T01QZ12_A724PrdPreAct, T01QZ12_A704PrdExiAlm, T01QZ12_A705PrdExiCC, T01QZ12_A685PrdCanRes, T01QZ12_A726PrdPreMed, T01QZ12_A707PrdFacCon, T01QZ12_A750PrdValStk, T01QZ12_A10881PrdLote
            }
            , new Object[] {
            T01QZ13_A396EmprCod, T01QZ13_A859CumCodCont, T01QZ13_A719PrdNum
            }
            , new Object[] {
            T01QZ14_A396EmprCod, T01QZ14_A719PrdNum, T01QZ14_A859CumCodCont
            }
            , new Object[] {
            T01QZ15_A396EmprCod, T01QZ15_A719PrdNum, T01QZ15_A859CumCodCont
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QZ19_A407EmprNom, T01QZ19_n407EmprNom, T01QZ19_A3915EmpNumDec, T01QZ19_n3915EmpNumDec
            }
            , new Object[] {
            T01QZ20_A718PrdNom, T01QZ20_A724PrdPreAct, T01QZ20_A704PrdExiAlm, T01QZ20_A705PrdExiCC, T01QZ20_A685PrdCanRes, T01QZ20_A726PrdPreMed, T01QZ20_A707PrdFacCon, T01QZ20_A750PrdValStk, T01QZ20_A10881PrdLote
            }
            , new Object[] {
            T01QZ21_A488ForPrdDsc, T01QZ21_n488ForPrdDsc
            }
            , new Object[] {
            T01QZ22_A396EmprCod, T01QZ22_A859CumCodCont, T01QZ22_A719PrdNum
            }
            , new Object[] {
            T01QZ23_A396EmprCod
            }
         }
      );
   }

   private byte Z8639CumUnidad ;
   private byte Z12700CumUMed ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte nKeyPressed ;
   private byte A12700CumUMed ;
   private byte A8639CumUnidad ;
   private byte A3915EmpNumDec ;
   private byte Z3915EmpNumDec ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ490ForPrdUMe ;
   private byte ZZ8639CumUnidad ;
   private byte ZZ12700CumUMed ;
   private byte ZZ3915EmpNumDec ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound112 ;
   private short nIsDirty_112 ;
   private int Z859CumCodCont ;
   private int A859CumCodCont ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCumCodCont_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtCumConCant_Enabled ;
   private int edtCumConCbis_Enabled ;
   private int edtCumCosPro_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdPreMed_Enabled ;
   private int edtUltFecCCs_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtCumConLot_Enabled ;
   private int edtPrdValStk_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtCumUnidad_Enabled ;
   private int edtPrdComID_Enabled ;
   private int edtPrdLote_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int ZZ859CumCodCont ;
   private java.math.BigDecimal Z860CumConCant ;
   private java.math.BigDecimal Z861CumConCbis ;
   private java.math.BigDecimal A860CumConCant ;
   private java.math.BigDecimal A861CumConCbis ;
   private java.math.BigDecimal A863CumCosPro ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z863CumCosPro ;
   private java.math.BigDecimal ZZ860CumConCant ;
   private java.math.BigDecimal ZZ861CumConCbis ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ685PrdCanRes ;
   private java.math.BigDecimal ZZ726PrdPreMed ;
   private java.math.BigDecimal ZZ707PrdFacCon ;
   private java.math.BigDecimal ZZ750PrdValStk ;
   private java.math.BigDecimal ZZ863CumCosPro ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z5862CumConLot ;
   private String Z12257PrdComID ;
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
   private String edtCumCodCont_Internalname ;
   private String edtCumCodCont_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtCumConCant_Internalname ;
   private String edtCumConCant_Jsonclick ;
   private String edtCumConCbis_Internalname ;
   private String edtCumConCbis_Jsonclick ;
   private String edtCumCosPro_Internalname ;
   private String edtCumCosPro_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdPreMed_Internalname ;
   private String edtPrdPreMed_Jsonclick ;
   private String edtUltFecCCs_Internalname ;
   private String edtUltFecCCs_Jsonclick ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtCumConLot_Internalname ;
   private String A5862CumConLot ;
   private String edtCumConLot_Jsonclick ;
   private String edtPrdValStk_Internalname ;
   private String edtPrdValStk_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtCumUnidad_Internalname ;
   private String edtCumUnidad_Jsonclick ;
   private String edtPrdComID_Internalname ;
   private String A12257PrdComID ;
   private String edtPrdComID_Jsonclick ;
   private String edtPrdLote_Internalname ;
   private String A10881PrdLote ;
   private String edtPrdLote_Jsonclick ;
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
   private String Z10881PrdLote ;
   private String Z488ForPrdDsc ;
   private String sMode112 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ5862CumConLot ;
   private String ZZ12257PrdComID ;
   private String ZZ407EmprNom ;
   private String ZZ488ForPrdDsc ;
   private String ZZ718PrdNom ;
   private String ZZ10881PrdLote ;
   private java.util.Date A3835UltFecCCs ;
   private java.util.Date Z3835UltFecCCs ;
   private java.util.Date GXt_date1 ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date ZZ3835UltFecCCs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n3915EmpNumDec ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private HTMLChoice cmbCumUMed ;
   private IDataStoreProvider pr_default ;
   private String[] T01QZ8_A407EmprNom ;
   private boolean[] T01QZ8_n407EmprNom ;
   private String[] T01QZ8_A718PrdNom ;
   private java.math.BigDecimal[] T01QZ8_A860CumConCant ;
   private java.math.BigDecimal[] T01QZ8_A861CumConCbis ;
   private java.math.BigDecimal[] T01QZ8_A724PrdPreAct ;
   private java.math.BigDecimal[] T01QZ8_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01QZ8_A705PrdExiCC ;
   private java.math.BigDecimal[] T01QZ8_A685PrdCanRes ;
   private java.math.BigDecimal[] T01QZ8_A726PrdPreMed ;
   private java.math.BigDecimal[] T01QZ8_A707PrdFacCon ;
   private String[] T01QZ8_A5862CumConLot ;
   private java.math.BigDecimal[] T01QZ8_A750PrdValStk ;
   private String[] T01QZ8_A488ForPrdDsc ;
   private boolean[] T01QZ8_n488ForPrdDsc ;
   private byte[] T01QZ8_A8639CumUnidad ;
   private String[] T01QZ8_A12257PrdComID ;
   private String[] T01QZ8_A10881PrdLote ;
   private byte[] T01QZ8_A12700CumUMed ;
   private byte[] T01QZ8_A3915EmpNumDec ;
   private boolean[] T01QZ8_n3915EmpNumDec ;
   private String[] T01QZ8_A396EmprCod ;
   private String[] T01QZ8_A719PrdNum ;
   private byte[] T01QZ8_A490ForPrdUMe ;
   private int[] T01QZ8_A859CumCodCont ;
   private String[] T01QZ4_A407EmprNom ;
   private boolean[] T01QZ4_n407EmprNom ;
   private byte[] T01QZ4_A3915EmpNumDec ;
   private boolean[] T01QZ4_n3915EmpNumDec ;
   private String[] T01QZ6_A488ForPrdDsc ;
   private boolean[] T01QZ6_n488ForPrdDsc ;
   private String[] T01QZ7_A396EmprCod ;
   private String[] T01QZ5_A718PrdNom ;
   private java.math.BigDecimal[] T01QZ5_A724PrdPreAct ;
   private java.math.BigDecimal[] T01QZ5_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01QZ5_A705PrdExiCC ;
   private java.math.BigDecimal[] T01QZ5_A685PrdCanRes ;
   private java.math.BigDecimal[] T01QZ5_A726PrdPreMed ;
   private java.math.BigDecimal[] T01QZ5_A707PrdFacCon ;
   private java.math.BigDecimal[] T01QZ5_A750PrdValStk ;
   private String[] T01QZ5_A10881PrdLote ;
   private String[] T01QZ9_A407EmprNom ;
   private boolean[] T01QZ9_n407EmprNom ;
   private byte[] T01QZ9_A3915EmpNumDec ;
   private boolean[] T01QZ9_n3915EmpNumDec ;
   private String[] T01QZ10_A488ForPrdDsc ;
   private boolean[] T01QZ10_n488ForPrdDsc ;
   private String[] T01QZ11_A396EmprCod ;
   private String[] T01QZ12_A718PrdNom ;
   private java.math.BigDecimal[] T01QZ12_A724PrdPreAct ;
   private java.math.BigDecimal[] T01QZ12_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01QZ12_A705PrdExiCC ;
   private java.math.BigDecimal[] T01QZ12_A685PrdCanRes ;
   private java.math.BigDecimal[] T01QZ12_A726PrdPreMed ;
   private java.math.BigDecimal[] T01QZ12_A707PrdFacCon ;
   private java.math.BigDecimal[] T01QZ12_A750PrdValStk ;
   private String[] T01QZ12_A10881PrdLote ;
   private String[] T01QZ13_A396EmprCod ;
   private int[] T01QZ13_A859CumCodCont ;
   private String[] T01QZ13_A719PrdNum ;
   private java.math.BigDecimal[] T01QZ3_A860CumConCant ;
   private java.math.BigDecimal[] T01QZ3_A861CumConCbis ;
   private String[] T01QZ3_A5862CumConLot ;
   private byte[] T01QZ3_A8639CumUnidad ;
   private String[] T01QZ3_A12257PrdComID ;
   private byte[] T01QZ3_A12700CumUMed ;
   private String[] T01QZ3_A396EmprCod ;
   private String[] T01QZ3_A719PrdNum ;
   private byte[] T01QZ3_A490ForPrdUMe ;
   private int[] T01QZ3_A859CumCodCont ;
   private String[] T01QZ14_A396EmprCod ;
   private String[] T01QZ14_A719PrdNum ;
   private int[] T01QZ14_A859CumCodCont ;
   private String[] T01QZ15_A396EmprCod ;
   private String[] T01QZ15_A719PrdNum ;
   private int[] T01QZ15_A859CumCodCont ;
   private java.math.BigDecimal[] T01QZ2_A860CumConCant ;
   private java.math.BigDecimal[] T01QZ2_A861CumConCbis ;
   private String[] T01QZ2_A5862CumConLot ;
   private byte[] T01QZ2_A8639CumUnidad ;
   private String[] T01QZ2_A12257PrdComID ;
   private byte[] T01QZ2_A12700CumUMed ;
   private String[] T01QZ2_A396EmprCod ;
   private String[] T01QZ2_A719PrdNum ;
   private byte[] T01QZ2_A490ForPrdUMe ;
   private int[] T01QZ2_A859CumCodCont ;
   private String[] T01QZ19_A407EmprNom ;
   private boolean[] T01QZ19_n407EmprNom ;
   private byte[] T01QZ19_A3915EmpNumDec ;
   private boolean[] T01QZ19_n3915EmpNumDec ;
   private String[] T01QZ20_A718PrdNom ;
   private java.math.BigDecimal[] T01QZ20_A724PrdPreAct ;
   private java.math.BigDecimal[] T01QZ20_A704PrdExiAlm ;
   private java.math.BigDecimal[] T01QZ20_A705PrdExiCC ;
   private java.math.BigDecimal[] T01QZ20_A685PrdCanRes ;
   private java.math.BigDecimal[] T01QZ20_A726PrdPreMed ;
   private java.math.BigDecimal[] T01QZ20_A707PrdFacCon ;
   private java.math.BigDecimal[] T01QZ20_A750PrdValStk ;
   private String[] T01QZ20_A10881PrdLote ;
   private String[] T01QZ21_A488ForPrdDsc ;
   private boolean[] T01QZ21_n488ForPrdDsc ;
   private String[] T01QZ22_A396EmprCod ;
   private int[] T01QZ22_A859CumCodCont ;
   private String[] T01QZ22_A719PrdNum ;
   private String[] T01QZ23_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class salidasmanualesproductos_detalle__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class salidasmanualesproductos_detalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QZ2", "SELECT CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?  FOR UPDATE OF CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ3", "SELECT CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ4", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ5", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ6", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ7", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ8", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.PrdNom, TM1.CumConCant, TM1.CumConCbis, T3.PrdPreAct, T3.PrdExiAlm, T3.PrdExiCC, T3.PrdCanRes, T3.PrdPreMed, T3.PrdFacCon, TM1.CumConLot, T3.PrdValStk, T4.ForPrdDsc, TM1.CumUnidad, TM1.PrdComID, T3.PrdLote, TM1.CumUMed, T2.EmpNumDec, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.CumCodCont FROM (((TXPLCUMCO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) INNER JOIN TXPUNMEPR T4 ON T4.EmprCod = TM1.EmprCod AND T4.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.CumCodCont = ? ORDER BY TM1.EmprCod, TM1.CumCodCont, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ9", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ10", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ11", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ12", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, CumCodCont FROM TXPLCUMCO WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and CumCodCont > ?) ORDER BY EmprCod, CumCodCont, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QZ15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, CumCodCont FROM TXPLCUMCO WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and CumCodCont < ?) ORDER BY EmprCod DESC, CumCodCont DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QZ16", "INSERT INTO TXPLCUMCO(CumConCant, CumConCbis, CumConLot, CumUnidad, PrdComID, CumUMed, EmprCod, PrdNum, ForPrdUMe, CumCodCont, CumLotAlm) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("T01QZ17", "UPDATE TXPLCUMCO SET CumConCant=?, CumConCbis=?, CumConLot=?, CumUnidad=?, PrdComID=?, CumUMed=?, ForPrdUMe=?  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new UpdateCursor("T01QZ18", "DELETE FROM TXPLCUMCO  WHERE EmprCod = ? AND CumCodCont = ? AND PrdNum = ?", GX_NOMASK, "TXPLCUMCO")
         ,new ForEachCursor("T01QZ19", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ20", "SELECT PrdNom, PrdPreAct, PrdExiAlm, PrdExiCC, PrdCanRes, PrdPreMed, PrdFacCon, PrdValStk, PrdLote FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ21", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO ORDER BY EmprCod, CumCodCont, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QZ23", "SELECT EmprCod FROM TXPCCUMCO WHERE EmprCod = ? AND CumCodCont = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,4);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[13])[0] = rslt.getString(13, 5);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 6);
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 3);
               ((String[]) buf[22])[0] = rslt.getString(20, 6);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((int[]) buf[24])[0] = rslt.getInt(22);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 21 :
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
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 14 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

