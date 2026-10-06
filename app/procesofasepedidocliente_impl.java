package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class procesofasepedidocliente_impl extends GXWebPanel
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
      gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
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
         gxload_4( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A457FasCod) ;
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
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridprocesofasepedidocliente_fases") == 0 )
      {
         gxnrgridprocesofasepedidocliente_fases_newrow_invoke( ) ;
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
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            AV71Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71Discod), 8, 0));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Proceso Fase Pedido Cliente", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridprocesofasepedidocliente_fases_newrow_invoke( )
   {
      nRC_GXsfl_53 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_53"))) ;
      nGXsfl_53_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_53_idx"))) ;
      sGXsfl_53_idx = httpContext.GetPar( "sGXsfl_53_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridprocesofasepedidocliente_fases_newrow( ) ;
      /* End function gxnrGridprocesofasepedidocliente_fases_newrow_invoke */
   }

   public procesofasepedidocliente_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public procesofasepedidocliente_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesofasepedidocliente_impl.class ));
   }

   public procesofasepedidocliente_impl( int remoteHandle ,
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
         validateSpaRequest();
         userMain( ) ;
         if ( ! isFullAjaxMode( ) && ( nDynComponent == 0 ) )
         {
            draw( ) ;
         }
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
      cleanup();
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
         renderHtmlCloseForm1PD38( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      renderHtmlHeaders( ) ;
      renderHtmlOpenForm( ) ;
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Proceso Fase Pedido Cliente", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ProcesoFasePedidoCliente.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ProcesoFasePedidoCliente.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ProcesoFasePedidoCliente.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProcesoFasePedidoCliente.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divFasestable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlefases_Internalname, httpContext.getMessage( "Fases", ""), "", "", lblTitlefases_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridprocesofasepedidocliente_fases( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ProcesoFasePedidoCliente.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridprocesofasepedidocliente_fases( )
   {
      /*  Grid Control  */
      startgridcontrol53( ) ;
      nGXsfl_53_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount39 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_39 = (short)(1) ;
            scanStart1PD39( ) ;
            while ( RcdFound39 != 0 )
            {
               init_level_properties39( ) ;
               getByPrimaryKey1PD39( ) ;
               addRow1PD39( ) ;
               scanNext1PD39( ) ;
            }
            scanEnd1PD39( ) ;
            nBlankRcdCount39 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1PD39( ) ;
         standaloneModal1PD39( ) ;
         sMode39 = Gx_mode ;
         while ( nGXsfl_53_idx < nRC_GXsfl_53 )
         {
            bGXsfl_53_Refreshing = true ;
            readRow1PD39( ) ;
            edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACAB_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASAPR_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtDisFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASOBS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            if ( ( nRcdExists_39 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1PD39( ) ;
            }
            sendRow1PD39( ) ;
            bGXsfl_53_Refreshing = false ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount39 = (short)(5) ;
         nRcdExists_39 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PD39( ) ;
            while ( RcdFound39 != 0 )
            {
               sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5339( ) ;
               init_level_properties39( ) ;
               standaloneNotModal1PD39( ) ;
               getByPrimaryKey1PD39( ) ;
               standaloneModal1PD39( ) ;
               addRow1PD39( ) ;
               scanNext1PD39( ) ;
            }
            scanEnd1PD39( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode39 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_5339( ) ;
         initAll1PD39( ) ;
         init_level_properties39( ) ;
         nRcdExists_39 = (short)(0) ;
         nIsMod_39 = (short)(0) ;
         nRcdDeleted_39 = (short)(0) ;
         nBlankRcdCount39 = (short)(nBlankRcdUsr39+nBlankRcdCount39) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount39 > 0 )
         {
            standaloneNotModal1PD39( ) ;
            standaloneModal1PD39( ) ;
            addRow1PD39( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDisFasLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount39 = (short)(nBlankRcdCount39-1) ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridprocesofasepedidocliente_fasesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridprocesofasepedidocliente_fases", Gridprocesofasepedidocliente_fasesContainer, subGridprocesofasepedidocliente_fases_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridprocesofasepedidocliente_fasesContainerData", Gridprocesofasepedidocliente_fasesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridprocesofasepedidocliente_fasesContainerData"+"V", Gridprocesofasepedidocliente_fasesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridprocesofasepedidocliente_fasesContainerData"+"V"+"\" value='"+Gridprocesofasepedidocliente_fasesContainer.GridValuesHidden()+"'/>") ;
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
         Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_53 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_53"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7744FasPreObl = false ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDisCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A361DisCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         else
         {
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoFasePedidoCliente");
         forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("procesofasepedidocliente:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons( ) ;
            standaloneModal( ) ;
         }
         else
         {
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
            if ( GXutil.strcmp(sEvtType, "E") == 0 )
            {
               sEvtType = GXutil.right( sEvt, 1) ;
               if ( GXutil.strcmp(sEvtType, ".") == 0 )
               {
                  sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     if ( ! isDsp( ) )
                     {
                        btn_enter( ) ;
                     }
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
            initAll1PD38( ) ;
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
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
         }
         disableAttributes1PD38( ) ;
      }
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

   public void confirm_1PD0( )
   {
      beforeValidate1PD38( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1PD38( ) ;
         }
         else
         {
            checkExtendedTable1PD38( ) ;
            closeExtendedTableCursors1PD38( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode38 = Gx_mode ;
         confirm_1PD39( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode38 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1PD39( )
   {
      nGXsfl_53_idx = 0 ;
      while ( nGXsfl_53_idx < nRC_GXsfl_53 )
      {
         readRow1PD39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            getKey1PD39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1PD39( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PD39( ) ;
                     closeExtendedTableCursors1PD39( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISFASLIN_" + sGXsfl_53_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisFasLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( nRcdDeleted_39 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PD39( ) ;
                     load1PD39( ) ;
                     beforeValidate1PD39( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PD39( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1PD39( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PD39( ) ;
                           closeExtendedTableCursors1PD39( ) ;
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
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_53_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasApr_Internalname, GXutil.rtrim( A3697FasApr)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtDisFasObs_Internalname, A9841DisFasObs) ;
         httpContext.changePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3697FasApr_"+sGXsfl_53_idx, GXutil.rtrim( Z3697FasApr)) ;
         httpContext.changePostValue( "ZT_"+"Z9841DisFasObs_"+sGXsfl_53_idx, Z9841DisFasObs) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_53_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_39_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_39_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_39_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACAB_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASAPR_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASOBS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PD0( )
   {
   }

   public void zm1PD38( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
   }

   public void standaloneModal( )
   {
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

   public void load1PD38( )
   {
      /* Using cursor T01PD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A759ProDsc = T01PD9_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         zm1PD38( -2) ;
      }
      pr_default.close(7);
      onLoadActions1PD38( ) ;
   }

   public void onLoadActions1PD38( )
   {
   }

   public void checkExtendedTable1PD38( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01PD7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01PD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01PD8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1PD38( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A361DisCod )
   {
      /* Using cursor T01PD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_4( String A396EmprCod ,
                         String A758ProCod )
   {
      /* Using cursor T01PD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01PD11_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1PD38( )
   {
      /* Using cursor T01PD12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01PD6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PD38( 2) ;
         RcdFound38 = (short)(1) ;
         A361DisCod = T01PD6_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01PD6_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PD38( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1PD38( ) ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1PD38( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1PD38( ) ;
      if ( RcdFound38 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T01PD13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A758ProCod, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01PD13_A361DisCod[0] < A361DisCod ) || ( T01PD13_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PD13_A758ProCod[0], A758ProCod) < 0 ) ) && ( GXutil.strcmp(T01PD13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01PD13_A361DisCod[0] > A361DisCod ) || ( T01PD13_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PD13_A758ProCod[0], A758ProCod) > 0 ) ) && ( GXutil.strcmp(T01PD13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A361DisCod = T01PD13_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = T01PD13_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T01PD14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A758ProCod, A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01PD14_A361DisCod[0] > A361DisCod ) || ( T01PD14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PD14_A758ProCod[0], A758ProCod) > 0 ) ) && ( GXutil.strcmp(T01PD14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01PD14_A361DisCod[0] < A361DisCod ) || ( T01PD14_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PD14_A758ProCod[0], A758ProCod) < 0 ) ) && ( GXutil.strcmp(T01PD14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A361DisCod = T01PD14_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = T01PD14_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PD38( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1PD38( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound38 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1PD38( ) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1PD38( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DISCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1PD38( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
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
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
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
      scanStart1PD38( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
      }
      scanEnd1PD38( ) ;
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
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
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
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
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
      scanStart1PD38( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound38 != 0 )
         {
            scanNext1PD38( ) ;
         }
      }
      scanEnd1PD38( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1PD38( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PD38( )
   {
      beforeValidate1PD38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PD38( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PD38( 0) ;
         checkOptimisticConcurrency1PD38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PD38( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PD38( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PD15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
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
                        processLevel1PD38( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PD0( ) ;
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
            load1PD38( ) ;
         }
         endLevel1PD38( ) ;
      }
      closeExtendedTableCursors1PD38( ) ;
   }

   public void update1PD38( )
   {
      beforeValidate1PD38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PD38( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PD38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PD38( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PD38( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISLIN */
                  deferredUpdate1PD38( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PD38( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1PD0( ) ;
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
         endLevel1PD38( ) ;
      }
      closeExtendedTableCursors1PD38( ) ;
   }

   public void deferredUpdate1PD38( )
   {
   }

   public void delete( )
   {
      beforeValidate1PD38( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PD38( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PD38( ) ;
         afterConfirm1PD38( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PD38( ) ;
            if ( AnyError == 0 )
            {
               scanStart1PD39( ) ;
               while ( RcdFound39 != 0 )
               {
                  getByPrimaryKey1PD39( ) ;
                  delete1PD39( ) ;
                  scanNext1PD39( ) ;
               }
               scanEnd1PD39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PD16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound38 == 0 )
                        {
                           initAll1PD38( ) ;
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaption1PD0( ) ;
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
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PD38( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PD38( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PD17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01PD17_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PD18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void processNestedLevel1PD39( )
   {
      nGXsfl_53_idx = 0 ;
      while ( nGXsfl_53_idx < nRC_GXsfl_53 )
      {
         readRow1PD39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            standaloneNotModal1PD39( ) ;
            getKey1PD39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1PD39( ) ;
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( ( nRcdDeleted_39 != 0 ) && ( nRcdExists_39 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1PD39( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1PD39( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_53_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasApr_Internalname, GXutil.rtrim( A3697FasApr)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtDisFasObs_Internalname, A9841DisFasObs) ;
         httpContext.changePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3697FasApr_"+sGXsfl_53_idx, GXutil.rtrim( Z3697FasApr)) ;
         httpContext.changePostValue( "ZT_"+"Z9841DisFasObs_"+sGXsfl_53_idx, Z9841DisFasObs) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_53_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_39_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_39_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_39_"+sGXsfl_53_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACAB_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASAPR_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASOBS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PD39( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
   }

   public void processLevel1PD38( )
   {
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      processNestedLevel1PD39( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1PD38( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PD38( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "procesofasepedidocliente");
         if ( AnyError == 0 )
         {
            confirmValues1PD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "procesofasepedidocliente");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PD38( )
   {
      /* Scan By routine */
      /* Using cursor T01PD19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A361DisCod = T01PD19_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01PD19_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PD38( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A361DisCod = T01PD19_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01PD19_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEnd1PD38( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1PD38( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PD38( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PD38( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PD38( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PD38( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PD38( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PD38( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
   }

   public void zm1PD39( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3697FasApr = T01PD3_A3697FasApr[0] ;
            Z9841DisFasObs = T01PD3_A9841DisFasObs[0] ;
            Z457FasCod = T01PD3_A457FasCod[0] ;
         }
         else
         {
            Z3697FasApr = A3697FasApr ;
            Z9841DisFasObs = A9841DisFasObs ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         Z3697FasApr = A3697FasApr ;
         Z9841DisFasObs = A9841DisFasObs ;
         Z7744FasPreObl = A7744FasPreObl ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z4903FasAcab = A4903FasAcab ;
         Z4286FasForMul = A4286FasForMul ;
         Z456FasActTin = A456FasActTin ;
         Z458FasCon = A458FasCon ;
         Z464FasNumPas = A464FasNumPas ;
         Z472FasVelPro = A472FasVelPro ;
         Z468FasPrePie = A468FasPrePie ;
         Z469FasPreSal = A469FasPreSal ;
         Z459FasDec = A459FasDec ;
         Z602MaqCod = A602MaqCod ;
      }
   }

   public void standaloneNotModal1PD39( )
   {
   }

   public void standaloneModal1PD39( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      }
      else
      {
         edtDisFasLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      }
   }

   public void load1PD39( )
   {
      /* Using cursor T01PD20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A460FasDsc = T01PD20_A460FasDsc[0] ;
         A4903FasAcab = T01PD20_A4903FasAcab[0] ;
         n4903FasAcab = T01PD20_n4903FasAcab[0] ;
         A4286FasForMul = T01PD20_A4286FasForMul[0] ;
         n4286FasForMul = T01PD20_n4286FasForMul[0] ;
         A3697FasApr = T01PD20_A3697FasApr[0] ;
         A456FasActTin = T01PD20_A456FasActTin[0] ;
         n456FasActTin = T01PD20_n456FasActTin[0] ;
         A458FasCon = T01PD20_A458FasCon[0] ;
         n458FasCon = T01PD20_n458FasCon[0] ;
         A464FasNumPas = T01PD20_A464FasNumPas[0] ;
         n464FasNumPas = T01PD20_n464FasNumPas[0] ;
         A472FasVelPro = T01PD20_A472FasVelPro[0] ;
         n472FasVelPro = T01PD20_n472FasVelPro[0] ;
         A468FasPrePie = T01PD20_A468FasPrePie[0] ;
         n468FasPrePie = T01PD20_n468FasPrePie[0] ;
         A469FasPreSal = T01PD20_A469FasPreSal[0] ;
         n469FasPreSal = T01PD20_n469FasPreSal[0] ;
         A459FasDec = T01PD20_A459FasDec[0] ;
         n459FasDec = T01PD20_n459FasDec[0] ;
         A9841DisFasObs = T01PD20_A9841DisFasObs[0] ;
         A7744FasPreObl = T01PD20_A7744FasPreObl[0] ;
         n7744FasPreObl = T01PD20_n7744FasPreObl[0] ;
         A457FasCod = T01PD20_A457FasCod[0] ;
         A602MaqCod = T01PD20_A602MaqCod[0] ;
         n602MaqCod = T01PD20_n602MaqCod[0] ;
         zm1PD39( -5) ;
      }
      pr_default.close(18);
      onLoadActions1PD39( ) ;
   }

   public void onLoadActions1PD39( )
   {
   }

   public void checkExtendedTable1PD39( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1PD39( ) ;
      /* Using cursor T01PD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PD4_A460FasDsc[0] ;
      A4903FasAcab = T01PD4_A4903FasAcab[0] ;
      n4903FasAcab = T01PD4_n4903FasAcab[0] ;
      A4286FasForMul = T01PD4_A4286FasForMul[0] ;
      n4286FasForMul = T01PD4_n4286FasForMul[0] ;
      A456FasActTin = T01PD4_A456FasActTin[0] ;
      n456FasActTin = T01PD4_n456FasActTin[0] ;
      A458FasCon = T01PD4_A458FasCon[0] ;
      n458FasCon = T01PD4_n458FasCon[0] ;
      A464FasNumPas = T01PD4_A464FasNumPas[0] ;
      n464FasNumPas = T01PD4_n464FasNumPas[0] ;
      A472FasVelPro = T01PD4_A472FasVelPro[0] ;
      n472FasVelPro = T01PD4_n472FasVelPro[0] ;
      A468FasPrePie = T01PD4_A468FasPrePie[0] ;
      n468FasPrePie = T01PD4_n468FasPrePie[0] ;
      A469FasPreSal = T01PD4_A469FasPreSal[0] ;
      n469FasPreSal = T01PD4_n469FasPreSal[0] ;
      A459FasDec = T01PD4_A459FasDec[0] ;
      n459FasDec = T01PD4_n459FasDec[0] ;
      A7744FasPreObl = T01PD4_A7744FasPreObl[0] ;
      n7744FasPreObl = T01PD4_n7744FasPreObl[0] ;
      A602MaqCod = T01PD4_A602MaqCod[0] ;
      n602MaqCod = T01PD4_n602MaqCod[0] ;
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A3697FasApr, "S") == 0 ) || ( GXutil.strcmp(A3697FasApr, "N") == 0 ) ) )
      {
         GXCCtl = "FASAPR_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Aprobacion Parametros Fase", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasApr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PD39( )
   {
      pr_default.close(2);
   }

   public void enableDisable1PD39( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01PD21 */
      pr_default.execute(19, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PD21_A460FasDsc[0] ;
      A4903FasAcab = T01PD21_A4903FasAcab[0] ;
      n4903FasAcab = T01PD21_n4903FasAcab[0] ;
      A4286FasForMul = T01PD21_A4286FasForMul[0] ;
      n4286FasForMul = T01PD21_n4286FasForMul[0] ;
      A456FasActTin = T01PD21_A456FasActTin[0] ;
      n456FasActTin = T01PD21_n456FasActTin[0] ;
      A458FasCon = T01PD21_A458FasCon[0] ;
      n458FasCon = T01PD21_n458FasCon[0] ;
      A464FasNumPas = T01PD21_A464FasNumPas[0] ;
      n464FasNumPas = T01PD21_n464FasNumPas[0] ;
      A472FasVelPro = T01PD21_A472FasVelPro[0] ;
      n472FasVelPro = T01PD21_n472FasVelPro[0] ;
      A468FasPrePie = T01PD21_A468FasPrePie[0] ;
      n468FasPrePie = T01PD21_n468FasPrePie[0] ;
      A469FasPreSal = T01PD21_A469FasPreSal[0] ;
      n469FasPreSal = T01PD21_n469FasPreSal[0] ;
      A459FasDec = T01PD21_A459FasDec[0] ;
      n459FasDec = T01PD21_n459FasDec[0] ;
      A7744FasPreObl = T01PD21_A7744FasPreObl[0] ;
      n7744FasPreObl = T01PD21_n7744FasPreObl[0] ;
      A602MaqCod = T01PD21_A602MaqCod[0] ;
      n602MaqCod = T01PD21_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey1PD39( )
   {
      /* Using cursor T01PD22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey1PD39( )
   {
      /* Using cursor T01PD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01PD3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PD39( 5) ;
         RcdFound39 = (short)(1) ;
         initializeNonKey1PD39( ) ;
         A368DisFasLin = T01PD3_A368DisFasLin[0] ;
         A3697FasApr = T01PD3_A3697FasApr[0] ;
         A9841DisFasObs = T01PD3_A9841DisFasObs[0] ;
         A457FasCod = T01PD3_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1PD39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1PD39( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1PD39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PD39( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PD39( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3697FasApr, T01PD2_A3697FasApr[0]) != 0 ) || ( GXutil.strcmp(Z9841DisFasObs, T01PD2_A9841DisFasObs[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01PD2_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3697FasApr, T01PD2_A3697FasApr[0]) != 0 )
            {
               GXutil.writeLogln("procesofasepedidocliente:[seudo value changed for attri]"+"FasApr");
               GXutil.writeLogRaw("Old: ",Z3697FasApr);
               GXutil.writeLogRaw("Current: ",T01PD2_A3697FasApr[0]);
            }
            if ( GXutil.strcmp(Z9841DisFasObs, T01PD2_A9841DisFasObs[0]) != 0 )
            {
               GXutil.writeLogln("procesofasepedidocliente:[seudo value changed for attri]"+"DisFasObs");
               GXutil.writeLogRaw("Old: ",Z9841DisFasObs);
               GXutil.writeLogRaw("Current: ",T01PD2_A9841DisFasObs[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01PD2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("procesofasepedidocliente:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01PD2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PD39( )
   {
      beforeValidate1PD39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PD39( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PD39( 0) ;
         checkOptimisticConcurrency1PD39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PD39( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PD39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PD23 */
                  pr_default.execute(21, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A3697FasApr, A9841DisFasObs, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load1PD39( ) ;
         }
         endLevel1PD39( ) ;
      }
      closeExtendedTableCursors1PD39( ) ;
   }

   public void update1PD39( )
   {
      beforeValidate1PD39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PD39( ) ;
      }
      if ( ( nIsMod_39 != 0 ) || ( nIsDirty_39 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PD39( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PD39( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PD39( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PD24 */
                     pr_default.execute(22, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A3697FasApr, A9841DisFasObs, A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PD39( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PD39( ) ;
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
            endLevel1PD39( ) ;
         }
      }
      closeExtendedTableCursors1PD39( ) ;
   }

   public void deferredUpdate1PD39( )
   {
   }

   public void delete1PD39( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1PD39( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PD39( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PD39( ) ;
         afterConfirm1PD39( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PD39( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PD25 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1PD39( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PD39( )
   {
      standaloneModal1PD39( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PD26 */
         pr_default.execute(24, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01PD26_A460FasDsc[0] ;
         A4903FasAcab = T01PD26_A4903FasAcab[0] ;
         n4903FasAcab = T01PD26_n4903FasAcab[0] ;
         A4286FasForMul = T01PD26_A4286FasForMul[0] ;
         n4286FasForMul = T01PD26_n4286FasForMul[0] ;
         A456FasActTin = T01PD26_A456FasActTin[0] ;
         n456FasActTin = T01PD26_n456FasActTin[0] ;
         A458FasCon = T01PD26_A458FasCon[0] ;
         n458FasCon = T01PD26_n458FasCon[0] ;
         A464FasNumPas = T01PD26_A464FasNumPas[0] ;
         n464FasNumPas = T01PD26_n464FasNumPas[0] ;
         A472FasVelPro = T01PD26_A472FasVelPro[0] ;
         n472FasVelPro = T01PD26_n472FasVelPro[0] ;
         A468FasPrePie = T01PD26_A468FasPrePie[0] ;
         n468FasPrePie = T01PD26_n468FasPrePie[0] ;
         A469FasPreSal = T01PD26_A469FasPreSal[0] ;
         n469FasPreSal = T01PD26_n469FasPreSal[0] ;
         A459FasDec = T01PD26_A459FasDec[0] ;
         n459FasDec = T01PD26_n459FasDec[0] ;
         A7744FasPreObl = T01PD26_A7744FasPreObl[0] ;
         n7744FasPreObl = T01PD26_n7744FasPreObl[0] ;
         A602MaqCod = T01PD26_A602MaqCod[0] ;
         n602MaqCod = T01PD26_n602MaqCod[0] ;
         pr_default.close(24);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PD27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01PD28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01PD29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01PD30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01PD31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void endLevel1PD39( )
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

   public void scanStart1PD39( )
   {
      /* Scan By routine */
      /* Using cursor T01PD32 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01PD32_A368DisFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PD39( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01PD32_A368DisFasLin[0] ;
      }
   }

   public void scanEnd1PD39( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1PD39( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PD39( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PD39( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PD39( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PD39( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PD39( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PD39( )
   {
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasApr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasNumPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasVelPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasPrePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasPreSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtDisFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_53_Refreshing);
   }

   public void send_integrity_lvl_hashes1PD39( )
   {
   }

   public void send_integrity_lvl_hashes1PD38( )
   {
   }

   public void subsflControlProps_5339( )
   {
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_53_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_53_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_53_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_53_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_53_idx ;
      edtFasApr_Internalname = "FASAPR_"+sGXsfl_53_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_53_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_53_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_53_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_53_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_53_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_53_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_53_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_53_idx ;
      edtDisFasObs_Internalname = "DISFASOBS_"+sGXsfl_53_idx ;
   }

   public void subsflControlProps_fel_5339( )
   {
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_53_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_53_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_53_fel_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_53_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_53_fel_idx ;
      edtFasApr_Internalname = "FASAPR_"+sGXsfl_53_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_53_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_53_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_53_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_53_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_53_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_53_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_53_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_53_fel_idx ;
      edtDisFasObs_Internalname = "DISFASOBS_"+sGXsfl_53_fel_idx ;
   }

   public void addRow1PD39( )
   {
      nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5339( ) ;
      sendRow1PD39( ) ;
   }

   public void sendRow1PD39( )
   {
      Gridprocesofasepedidocliente_fasesRow = GXWebRow.GetNew(context) ;
      if ( subGridprocesofasepedidocliente_fases_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridprocesofasepedidocliente_fases_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridprocesofasepedidocliente_fases_Class, "") != 0 )
         {
            subGridprocesofasepedidocliente_fases_Linesclass = subGridprocesofasepedidocliente_fases_Class+"Odd" ;
         }
      }
      else if ( subGridprocesofasepedidocliente_fases_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridprocesofasepedidocliente_fases_Backstyle = (byte)(0) ;
         subGridprocesofasepedidocliente_fases_Backcolor = subGridprocesofasepedidocliente_fases_Allbackcolor ;
         if ( GXutil.strcmp(subGridprocesofasepedidocliente_fases_Class, "") != 0 )
         {
            subGridprocesofasepedidocliente_fases_Linesclass = subGridprocesofasepedidocliente_fases_Class+"Uniform" ;
         }
      }
      else if ( subGridprocesofasepedidocliente_fases_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridprocesofasepedidocliente_fases_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridprocesofasepedidocliente_fases_Class, "") != 0 )
         {
            subGridprocesofasepedidocliente_fases_Linesclass = subGridprocesofasepedidocliente_fases_Class+"Odd" ;
         }
         subGridprocesofasepedidocliente_fases_Backcolor = (int)(0x0) ;
      }
      else if ( subGridprocesofasepedidocliente_fases_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridprocesofasepedidocliente_fases_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_53_idx) % (2))) == 0 )
         {
            subGridprocesofasepedidocliente_fases_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridprocesofasepedidocliente_fases_Class, "") != 0 )
            {
               subGridprocesofasepedidocliente_fases_Linesclass = subGridprocesofasepedidocliente_fases_Class+"Even" ;
            }
         }
         else
         {
            subGridprocesofasepedidocliente_fases_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridprocesofasepedidocliente_fases_Class, "") != 0 )
            {
               subGridprocesofasepedidocliente_fases_Linesclass = subGridprocesofasepedidocliente_fases_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_53_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_53_idx + "',53)\"" ;
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_53_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_53_idx + "',53)\"" ;
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasAcab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasForMul_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_53_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_53_idx + "',53)\"" ;
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasApr_Internalname,GXutil.rtrim( A3697FasApr),GXutil.rtrim( localUtil.format( A3697FasApr, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasApr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasApr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasNumPas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasVelPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPrePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreSal_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_53_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_53_idx + "',53)\"" ;
      ROClassString = "Attribute" ;
      Gridprocesofasepedidocliente_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasObs_Internalname,A9841DisFasObs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridprocesofasepedidocliente_fasesRow);
      send_integrity_lvl_hashes1PD39( ) ;
      GXCCtl = "Z368DisFasLin_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3697FasApr_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3697FasApr));
      GXCCtl = "Z9841DisFasObs_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z9841DisFasObs);
      GXCCtl = "Z457FasCod_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_39_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_39_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "EMPRCOD_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV71Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASLIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASAPR_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMPAS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASVELPRO_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREPIE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPRESAL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASOBS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridprocesofasepedidocliente_fasesContainer.AddRow(Gridprocesofasepedidocliente_fasesRow);
   }

   public void readRow1PD39( )
   {
      nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5339( ) ;
      edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACAB_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASAPR_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASOBS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISFASLIN_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasLin_Internalname ;
         wbErr = true ;
         A368DisFasLin = (short)(0) ;
      }
      else
      {
         A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
      n4903FasAcab = false ;
      A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
      n4286FasForMul = false ;
      A3697FasApr = GXutil.upper( httpContext.cgiGet( edtFasApr_Internalname)) ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
      n458FasCon = false ;
      A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n464FasNumPas = false ;
      A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
      n472FasVelPro = false ;
      A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n468FasPrePie = false ;
      A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n469FasPreSal = false ;
      A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
      n459FasDec = false ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      n602MaqCod = false ;
      A9841DisFasObs = httpContext.cgiGet( edtDisFasObs_Internalname) ;
      GXCCtl = "Z368DisFasLin_" + sGXsfl_53_idx ;
      Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3697FasApr_" + sGXsfl_53_idx ;
      Z3697FasApr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9841DisFasObs_" + sGXsfl_53_idx ;
      Z9841DisFasObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_53_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_53_idx ;
      nRcdDeleted_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_39_" + sGXsfl_53_idx ;
      nRcdExists_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_39_" + sGXsfl_53_idx ;
      nIsMod_39 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisFasLin_Enabled = edtDisFasLin_Enabled ;
   }

   public void confirmValues1PD0( )
   {
      nGXsfl_53_idx = 0 ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5339( ) ;
      while ( nGXsfl_53_idx < nRC_GXsfl_53 )
      {
         nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5339( ) ;
         httpContext.changePostValue( "Z368DisFasLin_"+sGXsfl_53_idx, httpContext.cgiGet( "ZT_"+"Z368DisFasLin_"+sGXsfl_53_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z368DisFasLin_"+sGXsfl_53_idx) ;
         httpContext.changePostValue( "Z3697FasApr_"+sGXsfl_53_idx, httpContext.cgiGet( "ZT_"+"Z3697FasApr_"+sGXsfl_53_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3697FasApr_"+sGXsfl_53_idx) ;
         httpContext.changePostValue( "Z9841DisFasObs_"+sGXsfl_53_idx, httpContext.cgiGet( "ZT_"+"Z9841DisFasObs_"+sGXsfl_53_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9841DisFasObs_"+sGXsfl_53_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_53_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_53_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_53_idx) ;
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
      httpContext.writeValue( httpContext.getMessage( "Proceso Fase Pedido Cliente", "")) ;
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
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.procesofasepedidocliente", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71Discod,8,0))}, new String[] {"Gx_mode","EmprCod","Discod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ProcesoFasePedidoCliente");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("procesofasepedidocliente:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_53", GXutil.ltrim( localUtil.ntoc( nGXsfl_53_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV71Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseForm1PD38( )
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
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
   }

   public String getPgmname( )
   {
      return "ProcesoFasePedidoCliente" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Proceso Fase Pedido Cliente", "") ;
   }

   public void initializeNonKey1PD38( )
   {
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
   }

   public void initAll1PD38( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKey1PD38( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1PD39( )
   {
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4903FasAcab = "" ;
      n4903FasAcab = false ;
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      A3697FasApr = "" ;
      A456FasActTin = "" ;
      n456FasActTin = false ;
      A458FasCon = "" ;
      n458FasCon = false ;
      A464FasNumPas = (short)(0) ;
      n464FasNumPas = false ;
      A472FasVelPro = DecimalUtil.ZERO ;
      n472FasVelPro = false ;
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      A602MaqCod = "" ;
      n602MaqCod = false ;
      A9841DisFasObs = "" ;
      A7744FasPreObl = (byte)(0) ;
      n7744FasPreObl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      Z3697FasApr = "" ;
      Z9841DisFasObs = "" ;
      Z457FasCod = "" ;
   }

   public void initAll1PD39( )
   {
      A368DisFasLin = (short)(0) ;
      initializeNonKey1PD39( ) ;
   }

   public void standaloneModalInsert1PD39( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016355692", true, true);
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
      httpContext.AddJavascriptSource("procesofasepedidocliente.js", "?202661016355692", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties39( )
   {
      edtDisFasLin_Enabled = defedtDisFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
   }

   public void startgridcontrol53( )
   {
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("GridName", "Gridprocesofasepedidocliente_fases");
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Header", subGridprocesofasepedidocliente_fases_Header);
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Class", "Grid");
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("CmpContext", "");
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("InMasterPage", "false");
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A3697FasApr));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Value", A9841DisFasObs);
      Gridprocesofasepedidocliente_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddColumnProperties(Gridprocesofasepedidocliente_fasesColumn);
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridprocesofasepedidocliente_fasesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridprocesofasepedidocliente_fases_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtDisCod_Internalname = "DISCOD" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      lblTitlefases_Internalname = "TITLEFASES" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasApr_Internalname = "FASAPR" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtDisFasObs_Internalname = "DISFASOBS" ;
      divFasestable_Internalname = "FASESTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridprocesofasepedidocliente_fases_Internalname = "GRIDPROCESOFASEPEDIDOCLIENTE_FASES" ;
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
      subGridprocesofasepedidocliente_fases_Allowcollapsing = (byte)(0) ;
      subGridprocesofasepedidocliente_fases_Allowselection = (byte)(0) ;
      subGridprocesofasepedidocliente_fases_Header = "" ;
      edtDisFasObs_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasApr_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasAcab_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtDisFasLin_Jsonclick = "" ;
      subGridprocesofasepedidocliente_fases_Class = "Grid" ;
      subGridprocesofasepedidocliente_fases_Backcolorstyle = (byte)(0) ;
      edtDisFasObs_Enabled = 1 ;
      edtMaqCod_Enabled = 0 ;
      edtFasDec_Enabled = 0 ;
      edtFasPreSal_Enabled = 0 ;
      edtFasPrePie_Enabled = 0 ;
      edtFasVelPro_Enabled = 0 ;
      edtFasNumPas_Enabled = 0 ;
      edtFasCon_Enabled = 0 ;
      edtFasActTin_Enabled = 0 ;
      edtFasApr_Enabled = 1 ;
      edtFasForMul_Enabled = 0 ;
      edtFasAcab_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtDisFasLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 0 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
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

   public void gxnrgridprocesofasepedidocliente_fases_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5339( ) ;
      while ( nGXsfl_53_idx <= nRC_GXsfl_53 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PD39( ) ;
         standaloneModal1PD39( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PD39( ) ;
         nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5339( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridprocesofasepedidocliente_fasesContainer)) ;
      /* End function gxnrGridprocesofasepedidocliente_fases_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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

   public void valid_Discod( )
   {
      /* Using cursor T01PD33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
      }
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Procod( )
   {
      /* Using cursor T01PD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01PD17_A759ProDsc[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Fascod( )
   {
      n4903FasAcab = false ;
      n4286FasForMul = false ;
      n456FasActTin = false ;
      n458FasCon = false ;
      n464FasNumPas = false ;
      n472FasVelPro = false ;
      n468FasPrePie = false ;
      n469FasPreSal = false ;
      n459FasDec = false ;
      n7744FasPreObl = false ;
      n602MaqCod = false ;
      /* Using cursor T01PD26 */
      pr_default.execute(24, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01PD26_A460FasDsc[0] ;
      A4903FasAcab = T01PD26_A4903FasAcab[0] ;
      n4903FasAcab = T01PD26_n4903FasAcab[0] ;
      A4286FasForMul = T01PD26_A4286FasForMul[0] ;
      n4286FasForMul = T01PD26_n4286FasForMul[0] ;
      A456FasActTin = T01PD26_A456FasActTin[0] ;
      n456FasActTin = T01PD26_n456FasActTin[0] ;
      A458FasCon = T01PD26_A458FasCon[0] ;
      n458FasCon = T01PD26_n458FasCon[0] ;
      A464FasNumPas = T01PD26_A464FasNumPas[0] ;
      n464FasNumPas = T01PD26_n464FasNumPas[0] ;
      A472FasVelPro = T01PD26_A472FasVelPro[0] ;
      n472FasVelPro = T01PD26_n472FasVelPro[0] ;
      A468FasPrePie = T01PD26_A468FasPrePie[0] ;
      n468FasPrePie = T01PD26_n468FasPrePie[0] ;
      A469FasPreSal = T01PD26_A469FasPreSal[0] ;
      n469FasPreSal = T01PD26_n469FasPreSal[0] ;
      A459FasDec = T01PD26_A459FasDec[0] ;
      n459FasDec = T01PD26_n459FasDec[0] ;
      A7744FasPreObl = T01PD26_A7744FasPreObl[0] ;
      n7744FasPreObl = T01PD26_n7744FasPreObl[0] ;
      A602MaqCod = T01PD26_A602MaqCod[0] ;
      n602MaqCod = T01PD26_n602MaqCod[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", GXutil.rtrim( A4903FasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV71Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
      setEventMetadata("VALID_FASAPR","{handler:'valid_Fasapr',iparms:[]");
      setEventMetadata("VALID_FASAPR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Disfasobs',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(31);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOA396EmprCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z3697FasApr = "" ;
      Z9841DisFasObs = "" ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
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
      lblTitlefases_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridprocesofasepedidocliente_fasesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode39 = "" ;
      sStyleString = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode38 = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A4903FasAcab = "" ;
      A4286FasForMul = "" ;
      A3697FasApr = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A459FasDec = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A9841DisFasObs = "" ;
      Z759ProDsc = "" ;
      T01PD9_A759ProDsc = new String[] {""} ;
      T01PD9_A396EmprCod = new String[] {""} ;
      T01PD9_A361DisCod = new int[1] ;
      T01PD9_A758ProCod = new String[] {""} ;
      T01PD7_A396EmprCod = new String[] {""} ;
      T01PD8_A759ProDsc = new String[] {""} ;
      T01PD10_A396EmprCod = new String[] {""} ;
      T01PD11_A759ProDsc = new String[] {""} ;
      T01PD12_A396EmprCod = new String[] {""} ;
      T01PD12_A361DisCod = new int[1] ;
      T01PD12_A758ProCod = new String[] {""} ;
      T01PD6_A396EmprCod = new String[] {""} ;
      T01PD6_A361DisCod = new int[1] ;
      T01PD6_A758ProCod = new String[] {""} ;
      T01PD13_A396EmprCod = new String[] {""} ;
      T01PD13_A361DisCod = new int[1] ;
      T01PD13_A758ProCod = new String[] {""} ;
      T01PD14_A396EmprCod = new String[] {""} ;
      T01PD14_A361DisCod = new int[1] ;
      T01PD14_A758ProCod = new String[] {""} ;
      T01PD5_A396EmprCod = new String[] {""} ;
      T01PD5_A361DisCod = new int[1] ;
      T01PD5_A758ProCod = new String[] {""} ;
      T01PD17_A759ProDsc = new String[] {""} ;
      T01PD18_A396EmprCod = new String[] {""} ;
      T01PD18_A361DisCod = new int[1] ;
      T01PD18_A758ProCod = new String[] {""} ;
      T01PD18_A368DisFasLin = new short[1] ;
      T01PD18_A1664ParFasCod = new short[1] ;
      T01PD19_A396EmprCod = new String[] {""} ;
      T01PD19_A361DisCod = new int[1] ;
      T01PD19_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z4903FasAcab = "" ;
      Z4286FasForMul = "" ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      T01PD20_A361DisCod = new int[1] ;
      T01PD20_A758ProCod = new String[] {""} ;
      T01PD20_A368DisFasLin = new short[1] ;
      T01PD20_A460FasDsc = new String[] {""} ;
      T01PD20_A4903FasAcab = new String[] {""} ;
      T01PD20_n4903FasAcab = new boolean[] {false} ;
      T01PD20_A4286FasForMul = new String[] {""} ;
      T01PD20_n4286FasForMul = new boolean[] {false} ;
      T01PD20_A3697FasApr = new String[] {""} ;
      T01PD20_A456FasActTin = new String[] {""} ;
      T01PD20_n456FasActTin = new boolean[] {false} ;
      T01PD20_A458FasCon = new String[] {""} ;
      T01PD20_n458FasCon = new boolean[] {false} ;
      T01PD20_A464FasNumPas = new short[1] ;
      T01PD20_n464FasNumPas = new boolean[] {false} ;
      T01PD20_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD20_n472FasVelPro = new boolean[] {false} ;
      T01PD20_A468FasPrePie = new short[1] ;
      T01PD20_n468FasPrePie = new boolean[] {false} ;
      T01PD20_A469FasPreSal = new short[1] ;
      T01PD20_n469FasPreSal = new boolean[] {false} ;
      T01PD20_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD20_n459FasDec = new boolean[] {false} ;
      T01PD20_A9841DisFasObs = new String[] {""} ;
      T01PD20_A7744FasPreObl = new byte[1] ;
      T01PD20_n7744FasPreObl = new boolean[] {false} ;
      T01PD20_A396EmprCod = new String[] {""} ;
      T01PD20_A457FasCod = new String[] {""} ;
      T01PD20_A602MaqCod = new String[] {""} ;
      T01PD20_n602MaqCod = new boolean[] {false} ;
      T01PD4_A460FasDsc = new String[] {""} ;
      T01PD4_A4903FasAcab = new String[] {""} ;
      T01PD4_n4903FasAcab = new boolean[] {false} ;
      T01PD4_A4286FasForMul = new String[] {""} ;
      T01PD4_n4286FasForMul = new boolean[] {false} ;
      T01PD4_A456FasActTin = new String[] {""} ;
      T01PD4_n456FasActTin = new boolean[] {false} ;
      T01PD4_A458FasCon = new String[] {""} ;
      T01PD4_n458FasCon = new boolean[] {false} ;
      T01PD4_A464FasNumPas = new short[1] ;
      T01PD4_n464FasNumPas = new boolean[] {false} ;
      T01PD4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD4_n472FasVelPro = new boolean[] {false} ;
      T01PD4_A468FasPrePie = new short[1] ;
      T01PD4_n468FasPrePie = new boolean[] {false} ;
      T01PD4_A469FasPreSal = new short[1] ;
      T01PD4_n469FasPreSal = new boolean[] {false} ;
      T01PD4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD4_n459FasDec = new boolean[] {false} ;
      T01PD4_A7744FasPreObl = new byte[1] ;
      T01PD4_n7744FasPreObl = new boolean[] {false} ;
      T01PD4_A602MaqCod = new String[] {""} ;
      T01PD4_n602MaqCod = new boolean[] {false} ;
      T01PD21_A460FasDsc = new String[] {""} ;
      T01PD21_A4903FasAcab = new String[] {""} ;
      T01PD21_n4903FasAcab = new boolean[] {false} ;
      T01PD21_A4286FasForMul = new String[] {""} ;
      T01PD21_n4286FasForMul = new boolean[] {false} ;
      T01PD21_A456FasActTin = new String[] {""} ;
      T01PD21_n456FasActTin = new boolean[] {false} ;
      T01PD21_A458FasCon = new String[] {""} ;
      T01PD21_n458FasCon = new boolean[] {false} ;
      T01PD21_A464FasNumPas = new short[1] ;
      T01PD21_n464FasNumPas = new boolean[] {false} ;
      T01PD21_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD21_n472FasVelPro = new boolean[] {false} ;
      T01PD21_A468FasPrePie = new short[1] ;
      T01PD21_n468FasPrePie = new boolean[] {false} ;
      T01PD21_A469FasPreSal = new short[1] ;
      T01PD21_n469FasPreSal = new boolean[] {false} ;
      T01PD21_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD21_n459FasDec = new boolean[] {false} ;
      T01PD21_A7744FasPreObl = new byte[1] ;
      T01PD21_n7744FasPreObl = new boolean[] {false} ;
      T01PD21_A602MaqCod = new String[] {""} ;
      T01PD21_n602MaqCod = new boolean[] {false} ;
      T01PD22_A396EmprCod = new String[] {""} ;
      T01PD22_A361DisCod = new int[1] ;
      T01PD22_A758ProCod = new String[] {""} ;
      T01PD22_A368DisFasLin = new short[1] ;
      T01PD3_A361DisCod = new int[1] ;
      T01PD3_A758ProCod = new String[] {""} ;
      T01PD3_A368DisFasLin = new short[1] ;
      T01PD3_A3697FasApr = new String[] {""} ;
      T01PD3_A9841DisFasObs = new String[] {""} ;
      T01PD3_A396EmprCod = new String[] {""} ;
      T01PD3_A457FasCod = new String[] {""} ;
      T01PD3_A7744FasPreObl = new byte[1] ;
      T01PD3_n7744FasPreObl = new boolean[] {false} ;
      T01PD2_A361DisCod = new int[1] ;
      T01PD2_A758ProCod = new String[] {""} ;
      T01PD2_A368DisFasLin = new short[1] ;
      T01PD2_A3697FasApr = new String[] {""} ;
      T01PD2_A9841DisFasObs = new String[] {""} ;
      T01PD2_A396EmprCod = new String[] {""} ;
      T01PD2_A457FasCod = new String[] {""} ;
      T01PD2_A7744FasPreObl = new byte[1] ;
      T01PD2_n7744FasPreObl = new boolean[] {false} ;
      T01PD26_A460FasDsc = new String[] {""} ;
      T01PD26_A4903FasAcab = new String[] {""} ;
      T01PD26_n4903FasAcab = new boolean[] {false} ;
      T01PD26_A4286FasForMul = new String[] {""} ;
      T01PD26_n4286FasForMul = new boolean[] {false} ;
      T01PD26_A456FasActTin = new String[] {""} ;
      T01PD26_n456FasActTin = new boolean[] {false} ;
      T01PD26_A458FasCon = new String[] {""} ;
      T01PD26_n458FasCon = new boolean[] {false} ;
      T01PD26_A464FasNumPas = new short[1] ;
      T01PD26_n464FasNumPas = new boolean[] {false} ;
      T01PD26_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD26_n472FasVelPro = new boolean[] {false} ;
      T01PD26_A468FasPrePie = new short[1] ;
      T01PD26_n468FasPrePie = new boolean[] {false} ;
      T01PD26_A469FasPreSal = new short[1] ;
      T01PD26_n469FasPreSal = new boolean[] {false} ;
      T01PD26_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PD26_n459FasDec = new boolean[] {false} ;
      T01PD26_A7744FasPreObl = new byte[1] ;
      T01PD26_n7744FasPreObl = new boolean[] {false} ;
      T01PD26_A602MaqCod = new String[] {""} ;
      T01PD26_n602MaqCod = new boolean[] {false} ;
      T01PD27_A396EmprCod = new String[] {""} ;
      T01PD27_A361DisCod = new int[1] ;
      T01PD27_A758ProCod = new String[] {""} ;
      T01PD27_A368DisFasLin = new short[1] ;
      T01PD27_A7919Dta_Ordl = new short[1] ;
      T01PD28_A396EmprCod = new String[] {""} ;
      T01PD28_A361DisCod = new int[1] ;
      T01PD28_A758ProCod = new String[] {""} ;
      T01PD28_A368DisFasLin = new short[1] ;
      T01PD28_A7727ArtAdiCod = new short[1] ;
      T01PD29_A396EmprCod = new String[] {""} ;
      T01PD29_A361DisCod = new int[1] ;
      T01PD29_A758ProCod = new String[] {""} ;
      T01PD29_A368DisFasLin = new short[1] ;
      T01PD29_A5377DisQuiLin = new short[1] ;
      T01PD30_A396EmprCod = new String[] {""} ;
      T01PD30_A361DisCod = new int[1] ;
      T01PD30_A758ProCod = new String[] {""} ;
      T01PD30_A368DisFasLin = new short[1] ;
      T01PD30_A5035A_Discod = new int[1] ;
      T01PD30_A5038A_DProcod = new String[] {""} ;
      T01PD30_A5039A_DOrdlin = new short[1] ;
      T01PD31_A396EmprCod = new String[] {""} ;
      T01PD31_A361DisCod = new int[1] ;
      T01PD31_A758ProCod = new String[] {""} ;
      T01PD31_A368DisFasLin = new short[1] ;
      T01PD31_A1664ParFasCod = new short[1] ;
      T01PD32_A396EmprCod = new String[] {""} ;
      T01PD32_A361DisCod = new int[1] ;
      T01PD32_A758ProCod = new String[] {""} ;
      T01PD32_A368DisFasLin = new short[1] ;
      Gridprocesofasepedidocliente_fasesRow = new com.genexus.webpanels.GXWebRow();
      subGridprocesofasepedidocliente_fases_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridprocesofasepedidocliente_fasesColumn = new com.genexus.webpanels.GXWebColumn();
      T01PD33_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.procesofasepedidocliente__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.procesofasepedidocliente__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.procesofasepedidocliente__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.procesofasepedidocliente__default(),
         new Object[] {
             new Object[] {
            T01PD2_A361DisCod, T01PD2_A758ProCod, T01PD2_A368DisFasLin, T01PD2_A3697FasApr, T01PD2_A9841DisFasObs, T01PD2_A396EmprCod, T01PD2_A457FasCod, T01PD2_A7744FasPreObl, T01PD2_n7744FasPreObl
            }
            , new Object[] {
            T01PD3_A361DisCod, T01PD3_A758ProCod, T01PD3_A368DisFasLin, T01PD3_A3697FasApr, T01PD3_A9841DisFasObs, T01PD3_A396EmprCod, T01PD3_A457FasCod, T01PD3_A7744FasPreObl, T01PD3_n7744FasPreObl
            }
            , new Object[] {
            T01PD4_A460FasDsc, T01PD4_A4903FasAcab, T01PD4_n4903FasAcab, T01PD4_A4286FasForMul, T01PD4_n4286FasForMul, T01PD4_A456FasActTin, T01PD4_n456FasActTin, T01PD4_A458FasCon, T01PD4_n458FasCon, T01PD4_A464FasNumPas,
            T01PD4_n464FasNumPas, T01PD4_A472FasVelPro, T01PD4_n472FasVelPro, T01PD4_A468FasPrePie, T01PD4_n468FasPrePie, T01PD4_A469FasPreSal, T01PD4_n469FasPreSal, T01PD4_A459FasDec, T01PD4_n459FasDec, T01PD4_A7744FasPreObl,
            T01PD4_n7744FasPreObl, T01PD4_A602MaqCod, T01PD4_n602MaqCod
            }
            , new Object[] {
            T01PD5_A396EmprCod, T01PD5_A361DisCod, T01PD5_A758ProCod
            }
            , new Object[] {
            T01PD6_A396EmprCod, T01PD6_A361DisCod, T01PD6_A758ProCod
            }
            , new Object[] {
            T01PD7_A396EmprCod
            }
            , new Object[] {
            T01PD8_A759ProDsc
            }
            , new Object[] {
            T01PD9_A759ProDsc, T01PD9_A396EmprCod, T01PD9_A361DisCod, T01PD9_A758ProCod
            }
            , new Object[] {
            T01PD10_A396EmprCod
            }
            , new Object[] {
            T01PD11_A759ProDsc
            }
            , new Object[] {
            T01PD12_A396EmprCod, T01PD12_A361DisCod, T01PD12_A758ProCod
            }
            , new Object[] {
            T01PD13_A396EmprCod, T01PD13_A361DisCod, T01PD13_A758ProCod
            }
            , new Object[] {
            T01PD14_A396EmprCod, T01PD14_A361DisCod, T01PD14_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PD17_A759ProDsc
            }
            , new Object[] {
            T01PD18_A396EmprCod, T01PD18_A361DisCod, T01PD18_A758ProCod, T01PD18_A368DisFasLin, T01PD18_A1664ParFasCod
            }
            , new Object[] {
            T01PD19_A396EmprCod, T01PD19_A361DisCod, T01PD19_A758ProCod
            }
            , new Object[] {
            T01PD20_A361DisCod, T01PD20_A758ProCod, T01PD20_A368DisFasLin, T01PD20_A460FasDsc, T01PD20_A4903FasAcab, T01PD20_n4903FasAcab, T01PD20_A4286FasForMul, T01PD20_n4286FasForMul, T01PD20_A3697FasApr, T01PD20_A456FasActTin,
            T01PD20_n456FasActTin, T01PD20_A458FasCon, T01PD20_n458FasCon, T01PD20_A464FasNumPas, T01PD20_n464FasNumPas, T01PD20_A472FasVelPro, T01PD20_n472FasVelPro, T01PD20_A468FasPrePie, T01PD20_n468FasPrePie, T01PD20_A469FasPreSal,
            T01PD20_n469FasPreSal, T01PD20_A459FasDec, T01PD20_n459FasDec, T01PD20_A9841DisFasObs, T01PD20_A7744FasPreObl, T01PD20_n7744FasPreObl, T01PD20_A396EmprCod, T01PD20_A457FasCod, T01PD20_A602MaqCod, T01PD20_n602MaqCod
            }
            , new Object[] {
            T01PD21_A460FasDsc, T01PD21_A4903FasAcab, T01PD21_n4903FasAcab, T01PD21_A4286FasForMul, T01PD21_n4286FasForMul, T01PD21_A456FasActTin, T01PD21_n456FasActTin, T01PD21_A458FasCon, T01PD21_n458FasCon, T01PD21_A464FasNumPas,
            T01PD21_n464FasNumPas, T01PD21_A472FasVelPro, T01PD21_n472FasVelPro, T01PD21_A468FasPrePie, T01PD21_n468FasPrePie, T01PD21_A469FasPreSal, T01PD21_n469FasPreSal, T01PD21_A459FasDec, T01PD21_n459FasDec, T01PD21_A7744FasPreObl,
            T01PD21_n7744FasPreObl, T01PD21_A602MaqCod, T01PD21_n602MaqCod
            }
            , new Object[] {
            T01PD22_A396EmprCod, T01PD22_A361DisCod, T01PD22_A758ProCod, T01PD22_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PD26_A460FasDsc, T01PD26_A4903FasAcab, T01PD26_n4903FasAcab, T01PD26_A4286FasForMul, T01PD26_n4286FasForMul, T01PD26_A456FasActTin, T01PD26_n456FasActTin, T01PD26_A458FasCon, T01PD26_n458FasCon, T01PD26_A464FasNumPas,
            T01PD26_n464FasNumPas, T01PD26_A472FasVelPro, T01PD26_n472FasVelPro, T01PD26_A468FasPrePie, T01PD26_n468FasPrePie, T01PD26_A469FasPreSal, T01PD26_n469FasPreSal, T01PD26_A459FasDec, T01PD26_n459FasDec, T01PD26_A7744FasPreObl,
            T01PD26_n7744FasPreObl, T01PD26_A602MaqCod, T01PD26_n602MaqCod
            }
            , new Object[] {
            T01PD27_A396EmprCod, T01PD27_A361DisCod, T01PD27_A758ProCod, T01PD27_A368DisFasLin, T01PD27_A7919Dta_Ordl
            }
            , new Object[] {
            T01PD28_A396EmprCod, T01PD28_A361DisCod, T01PD28_A758ProCod, T01PD28_A368DisFasLin, T01PD28_A7727ArtAdiCod
            }
            , new Object[] {
            T01PD29_A396EmprCod, T01PD29_A361DisCod, T01PD29_A758ProCod, T01PD29_A368DisFasLin, T01PD29_A5377DisQuiLin
            }
            , new Object[] {
            T01PD30_A396EmprCod, T01PD30_A361DisCod, T01PD30_A758ProCod, T01PD30_A368DisFasLin, T01PD30_A5035A_Discod, T01PD30_A5038A_DProcod, T01PD30_A5039A_DOrdlin
            }
            , new Object[] {
            T01PD31_A396EmprCod, T01PD31_A361DisCod, T01PD31_A758ProCod, T01PD31_A368DisFasLin, T01PD31_A1664ParFasCod
            }
            , new Object[] {
            T01PD32_A396EmprCod, T01PD32_A361DisCod, T01PD32_A758ProCod, T01PD32_A368DisFasLin
            }
            , new Object[] {
            T01PD33_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte nDynComponent ;
   private byte A7744FasPreObl ;
   private byte Gx_BScreen ;
   private byte Z7744FasPreObl ;
   private byte subGridprocesofasepedidocliente_fases_Backcolorstyle ;
   private byte subGridprocesofasepedidocliente_fases_Backstyle ;
   private byte subGridprocesofasepedidocliente_fases_Allowselection ;
   private byte subGridprocesofasepedidocliente_fases_Allowhovering ;
   private byte subGridprocesofasepedidocliente_fases_Allowcollapsing ;
   private byte subGridprocesofasepedidocliente_fases_Collapsed ;
   private short Z368DisFasLin ;
   private short nRcdDeleted_39 ;
   private short nRcdExists_39 ;
   private short nIsMod_39 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount39 ;
   private short RcdFound39 ;
   private short nBlankRcdUsr39 ;
   private short A368DisFasLin ;
   private short A464FasNumPas ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short RcdFound38 ;
   private short nIsDirty_38 ;
   private short Z464FasNumPas ;
   private short Z468FasPrePie ;
   private short Z469FasPreSal ;
   private short nIsDirty_39 ;
   private int wcpOAV71Discod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_53 ;
   private int nGXsfl_53_idx=1 ;
   private int A361DisCod ;
   private int AV71Discod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDisCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasAcab_Enabled ;
   private int edtFasForMul_Enabled ;
   private int edtFasApr_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtFasCon_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtDisFasObs_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridprocesofasepedidocliente_fases_Backcolor ;
   private int subGridprocesofasepedidocliente_fases_Allbackcolor ;
   private int defedtDisFasLin_Enabled ;
   private int idxLst ;
   private int subGridprocesofasepedidocliente_fases_Selectedindex ;
   private int subGridprocesofasepedidocliente_fases_Selectioncolor ;
   private int subGridprocesofasepedidocliente_fases_Hoveringcolor ;
   private long GRIDPROCESOFASEPEDIDOCLIENTE_FASES_nFirstRecordOnPage ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOA396EmprCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z3697FasApr ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisCod_Internalname ;
   private String sGXsfl_53_idx="0001" ;
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
   private String edtDisCod_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divFasestable_Internalname ;
   private String lblTitlefases_Internalname ;
   private String lblTitlefases_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode39 ;
   private String edtDisFasLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtFasAcab_Internalname ;
   private String edtFasForMul_Internalname ;
   private String edtFasApr_Internalname ;
   private String edtFasActTin_Internalname ;
   private String edtFasCon_Internalname ;
   private String edtFasNumPas_Internalname ;
   private String edtFasVelPro_Internalname ;
   private String edtFasPrePie_Internalname ;
   private String edtFasPreSal_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtDisFasObs_Internalname ;
   private String sStyleString ;
   private String subGridprocesofasepedidocliente_fases_Internalname ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode38 ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A3697FasApr ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A602MaqCod ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z4903FasAcab ;
   private String Z4286FasForMul ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String sGXsfl_53_fel_idx="0001" ;
   private String subGridprocesofasepedidocliente_fases_Class ;
   private String subGridprocesofasepedidocliente_fases_Linesclass ;
   private String ROClassString ;
   private String edtDisFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasAcab_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasApr_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtDisFasObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridprocesofasepedidocliente_fases_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_53_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean n4903FasAcab ;
   private boolean n4286FasForMul ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n459FasDec ;
   private boolean n602MaqCod ;
   private String Z9841DisFasObs ;
   private String A9841DisFasObs ;
   private com.genexus.webpanels.GXWebGrid Gridprocesofasepedidocliente_fasesContainer ;
   private com.genexus.webpanels.GXWebRow Gridprocesofasepedidocliente_fasesRow ;
   private com.genexus.webpanels.GXWebColumn Gridprocesofasepedidocliente_fasesColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01PD9_A759ProDsc ;
   private String[] T01PD9_A396EmprCod ;
   private int[] T01PD9_A361DisCod ;
   private String[] T01PD9_A758ProCod ;
   private String[] T01PD7_A396EmprCod ;
   private String[] T01PD8_A759ProDsc ;
   private String[] T01PD10_A396EmprCod ;
   private String[] T01PD11_A759ProDsc ;
   private String[] T01PD12_A396EmprCod ;
   private int[] T01PD12_A361DisCod ;
   private String[] T01PD12_A758ProCod ;
   private String[] T01PD6_A396EmprCod ;
   private int[] T01PD6_A361DisCod ;
   private String[] T01PD6_A758ProCod ;
   private String[] T01PD13_A396EmprCod ;
   private int[] T01PD13_A361DisCod ;
   private String[] T01PD13_A758ProCod ;
   private String[] T01PD14_A396EmprCod ;
   private int[] T01PD14_A361DisCod ;
   private String[] T01PD14_A758ProCod ;
   private String[] T01PD5_A396EmprCod ;
   private int[] T01PD5_A361DisCod ;
   private String[] T01PD5_A758ProCod ;
   private String[] T01PD17_A759ProDsc ;
   private String[] T01PD18_A396EmprCod ;
   private int[] T01PD18_A361DisCod ;
   private String[] T01PD18_A758ProCod ;
   private short[] T01PD18_A368DisFasLin ;
   private short[] T01PD18_A1664ParFasCod ;
   private String[] T01PD19_A396EmprCod ;
   private int[] T01PD19_A361DisCod ;
   private String[] T01PD19_A758ProCod ;
   private int[] T01PD20_A361DisCod ;
   private String[] T01PD20_A758ProCod ;
   private short[] T01PD20_A368DisFasLin ;
   private String[] T01PD20_A460FasDsc ;
   private String[] T01PD20_A4903FasAcab ;
   private boolean[] T01PD20_n4903FasAcab ;
   private String[] T01PD20_A4286FasForMul ;
   private boolean[] T01PD20_n4286FasForMul ;
   private String[] T01PD20_A3697FasApr ;
   private String[] T01PD20_A456FasActTin ;
   private boolean[] T01PD20_n456FasActTin ;
   private String[] T01PD20_A458FasCon ;
   private boolean[] T01PD20_n458FasCon ;
   private short[] T01PD20_A464FasNumPas ;
   private boolean[] T01PD20_n464FasNumPas ;
   private java.math.BigDecimal[] T01PD20_A472FasVelPro ;
   private boolean[] T01PD20_n472FasVelPro ;
   private short[] T01PD20_A468FasPrePie ;
   private boolean[] T01PD20_n468FasPrePie ;
   private short[] T01PD20_A469FasPreSal ;
   private boolean[] T01PD20_n469FasPreSal ;
   private java.math.BigDecimal[] T01PD20_A459FasDec ;
   private boolean[] T01PD20_n459FasDec ;
   private String[] T01PD20_A9841DisFasObs ;
   private byte[] T01PD20_A7744FasPreObl ;
   private boolean[] T01PD20_n7744FasPreObl ;
   private String[] T01PD20_A396EmprCod ;
   private String[] T01PD20_A457FasCod ;
   private String[] T01PD20_A602MaqCod ;
   private boolean[] T01PD20_n602MaqCod ;
   private String[] T01PD4_A460FasDsc ;
   private String[] T01PD4_A4903FasAcab ;
   private boolean[] T01PD4_n4903FasAcab ;
   private String[] T01PD4_A4286FasForMul ;
   private boolean[] T01PD4_n4286FasForMul ;
   private String[] T01PD4_A456FasActTin ;
   private boolean[] T01PD4_n456FasActTin ;
   private String[] T01PD4_A458FasCon ;
   private boolean[] T01PD4_n458FasCon ;
   private short[] T01PD4_A464FasNumPas ;
   private boolean[] T01PD4_n464FasNumPas ;
   private java.math.BigDecimal[] T01PD4_A472FasVelPro ;
   private boolean[] T01PD4_n472FasVelPro ;
   private short[] T01PD4_A468FasPrePie ;
   private boolean[] T01PD4_n468FasPrePie ;
   private short[] T01PD4_A469FasPreSal ;
   private boolean[] T01PD4_n469FasPreSal ;
   private java.math.BigDecimal[] T01PD4_A459FasDec ;
   private boolean[] T01PD4_n459FasDec ;
   private byte[] T01PD4_A7744FasPreObl ;
   private boolean[] T01PD4_n7744FasPreObl ;
   private String[] T01PD4_A602MaqCod ;
   private boolean[] T01PD4_n602MaqCod ;
   private String[] T01PD21_A460FasDsc ;
   private String[] T01PD21_A4903FasAcab ;
   private boolean[] T01PD21_n4903FasAcab ;
   private String[] T01PD21_A4286FasForMul ;
   private boolean[] T01PD21_n4286FasForMul ;
   private String[] T01PD21_A456FasActTin ;
   private boolean[] T01PD21_n456FasActTin ;
   private String[] T01PD21_A458FasCon ;
   private boolean[] T01PD21_n458FasCon ;
   private short[] T01PD21_A464FasNumPas ;
   private boolean[] T01PD21_n464FasNumPas ;
   private java.math.BigDecimal[] T01PD21_A472FasVelPro ;
   private boolean[] T01PD21_n472FasVelPro ;
   private short[] T01PD21_A468FasPrePie ;
   private boolean[] T01PD21_n468FasPrePie ;
   private short[] T01PD21_A469FasPreSal ;
   private boolean[] T01PD21_n469FasPreSal ;
   private java.math.BigDecimal[] T01PD21_A459FasDec ;
   private boolean[] T01PD21_n459FasDec ;
   private byte[] T01PD21_A7744FasPreObl ;
   private boolean[] T01PD21_n7744FasPreObl ;
   private String[] T01PD21_A602MaqCod ;
   private boolean[] T01PD21_n602MaqCod ;
   private String[] T01PD22_A396EmprCod ;
   private int[] T01PD22_A361DisCod ;
   private String[] T01PD22_A758ProCod ;
   private short[] T01PD22_A368DisFasLin ;
   private int[] T01PD3_A361DisCod ;
   private String[] T01PD3_A758ProCod ;
   private short[] T01PD3_A368DisFasLin ;
   private String[] T01PD3_A3697FasApr ;
   private String[] T01PD3_A9841DisFasObs ;
   private String[] T01PD3_A396EmprCod ;
   private String[] T01PD3_A457FasCod ;
   private byte[] T01PD3_A7744FasPreObl ;
   private boolean[] T01PD3_n7744FasPreObl ;
   private int[] T01PD2_A361DisCod ;
   private String[] T01PD2_A758ProCod ;
   private short[] T01PD2_A368DisFasLin ;
   private String[] T01PD2_A3697FasApr ;
   private String[] T01PD2_A9841DisFasObs ;
   private String[] T01PD2_A396EmprCod ;
   private String[] T01PD2_A457FasCod ;
   private byte[] T01PD2_A7744FasPreObl ;
   private boolean[] T01PD2_n7744FasPreObl ;
   private String[] T01PD26_A460FasDsc ;
   private String[] T01PD26_A4903FasAcab ;
   private boolean[] T01PD26_n4903FasAcab ;
   private String[] T01PD26_A4286FasForMul ;
   private boolean[] T01PD26_n4286FasForMul ;
   private String[] T01PD26_A456FasActTin ;
   private boolean[] T01PD26_n456FasActTin ;
   private String[] T01PD26_A458FasCon ;
   private boolean[] T01PD26_n458FasCon ;
   private short[] T01PD26_A464FasNumPas ;
   private boolean[] T01PD26_n464FasNumPas ;
   private java.math.BigDecimal[] T01PD26_A472FasVelPro ;
   private boolean[] T01PD26_n472FasVelPro ;
   private short[] T01PD26_A468FasPrePie ;
   private boolean[] T01PD26_n468FasPrePie ;
   private short[] T01PD26_A469FasPreSal ;
   private boolean[] T01PD26_n469FasPreSal ;
   private java.math.BigDecimal[] T01PD26_A459FasDec ;
   private boolean[] T01PD26_n459FasDec ;
   private byte[] T01PD26_A7744FasPreObl ;
   private boolean[] T01PD26_n7744FasPreObl ;
   private String[] T01PD26_A602MaqCod ;
   private boolean[] T01PD26_n602MaqCod ;
   private String[] T01PD27_A396EmprCod ;
   private int[] T01PD27_A361DisCod ;
   private String[] T01PD27_A758ProCod ;
   private short[] T01PD27_A368DisFasLin ;
   private short[] T01PD27_A7919Dta_Ordl ;
   private String[] T01PD28_A396EmprCod ;
   private int[] T01PD28_A361DisCod ;
   private String[] T01PD28_A758ProCod ;
   private short[] T01PD28_A368DisFasLin ;
   private short[] T01PD28_A7727ArtAdiCod ;
   private String[] T01PD29_A396EmprCod ;
   private int[] T01PD29_A361DisCod ;
   private String[] T01PD29_A758ProCod ;
   private short[] T01PD29_A368DisFasLin ;
   private short[] T01PD29_A5377DisQuiLin ;
   private String[] T01PD30_A396EmprCod ;
   private int[] T01PD30_A361DisCod ;
   private String[] T01PD30_A758ProCod ;
   private short[] T01PD30_A368DisFasLin ;
   private int[] T01PD30_A5035A_Discod ;
   private String[] T01PD30_A5038A_DProcod ;
   private short[] T01PD30_A5039A_DOrdlin ;
   private String[] T01PD31_A396EmprCod ;
   private int[] T01PD31_A361DisCod ;
   private String[] T01PD31_A758ProCod ;
   private short[] T01PD31_A368DisFasLin ;
   private short[] T01PD31_A1664ParFasCod ;
   private String[] T01PD32_A396EmprCod ;
   private int[] T01PD32_A361DisCod ;
   private String[] T01PD32_A758ProCod ;
   private short[] T01PD32_A368DisFasLin ;
   private String[] T01PD33_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class procesofasepedidocliente__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesofasepedidocliente__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesofasepedidocliente__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class procesofasepedidocliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PD2", "SELECT DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasApr, DisFasObs, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD3", "SELECT DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD4", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD5", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD6", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD7", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD9", "SELECT /*+ FIRST_ROWS(100) */ T2.ProDsc, TM1.EmprCod, TM1.DisCod, TM1.ProCod FROM (TXPDISLIN TM1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = TM1.EmprCod AND T2.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD10", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD11", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE ( DisCod > ? or DisCod = ? and ProCod > ?) and EmprCod = ? ORDER BY EmprCod, DisCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE ( DisCod < ? or DisCod = ? and ProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PD15", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("T01PD16", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01PD17", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD18", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD20", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T2.FasAcab, T2.FasForMul, T1.FasApr, T2.FasActTin, T2.FasCon, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec, T1.DisFasObs, T1.FasPreObl, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD21", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD22", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PD23", "INSERT INTO TXPDISFAS(FasPreObl, DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01PD24", "UPDATE TXPDISFAS SET FasPreObl=?, FasApr=?, DisFasObs=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01PD25", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01PD26", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD27", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD28", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD29", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD30", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD31", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PD32", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PD33", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(14,1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(15);
               ((byte[]) buf[24])[0] = rslt.getByte(16);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(17, 3);
               ((String[]) buf[27])[0] = rslt.getString(18, 8);
               ((String[]) buf[28])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 29 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setVarchar(6, (String)parms[6], 3000, false);
               stmt.setString(7, (String)parms[7], 3);
               stmt.setString(8, (String)parms[8], 8);
               return;
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setVarchar(3, (String)parms[3], 3000, false);
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setString(7, (String)parms[7], 8);
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

