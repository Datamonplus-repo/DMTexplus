package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradapedidoclientefases_impl extends GXWebComponent
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
      if ( GXutil.len( sPrefix) == 0 )
      {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            nDynComponent = (byte)(1) ;
            sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
            sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758ProCod", A758ProCod);
            setjustcreated();
            componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A361DisCod),A758ProCod});
            componentstart();
            httpContext.ajax_rspStartCmp(sPrefix);
            componentdraw();
            httpContext.ajax_rspEndCmp();
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridentradapedidoclientefases_fases") == 0 )
         {
            gxnrgridentradapedidoclientefases_fases_newrow_invoke( ) ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_web_controls( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Pedido Cliente Fases", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
         if ( nDynComponent == 0 )
         {
            httpContext.sendError( 404 );
            GXutil.writeLog("send_http_error_code 404");
            GxWebError = (byte)(1) ;
         }
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgridentradapedidoclientefases_fases_newrow_invoke( )
   {
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridentradapedidoclientefases_fases_newrow( ) ;
      /* End function gxnrGridentradapedidoclientefases_fases_newrow_invoke */
   }

   public entradapedidoclientefases_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradapedidoclientefases_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradapedidoclientefases_impl.class ));
   }

   public entradapedidoclientefases_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
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
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
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
         renderHtmlCloseForm1PB38( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         renderHtmlHeaders( ) ;
      }
      renderHtmlOpenForm( ) ;
      if ( GXutil.len( sPrefix) != 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.entradapedidoclientefases");
      }
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Container FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Entrada Pedido Cliente Fases", ""), "", "", lblTitle_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ESELECT."+"'", TempTags, "", 2, "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtDisCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", edtDisCod_Visible, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtProCod_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758ProCod", A758ProCod);
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "Attribute", "", "", "", "", edtProCod_Visible, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlefases_Internalname, httpContext.getMessage( "Fases", ""), "", "", lblTitlefases_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      gxdraw_gridentradapedidoclientefases_fases( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaPedidoClienteFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridentradapedidoclientefases_fases( )
   {
      /*  Grid Control  */
      startgridcontrol39( ) ;
      nGXsfl_39_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount39 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_39 = (short)(1) ;
            scanStart1PB39( ) ;
            while ( RcdFound39 != 0 )
            {
               init_level_properties39( ) ;
               getByPrimaryKey1PB39( ) ;
               addRow1PB39( ) ;
               scanNext1PB39( ) ;
            }
            scanEnd1PB39( ) ;
            nBlankRcdCount39 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1PB39( ) ;
         standaloneModal1PB39( ) ;
         sMode39 = Gx_mode ;
         while ( nGXsfl_39_idx < nRC_GXsfl_39 )
         {
            bGXsfl_39_Refreshing = true ;
            readRow1PB39( ) ;
            edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISFASLIN_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASCOD_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASDSC_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASACAB_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASFORMUL_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASAPR_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASACTTIN_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASCON_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASNUMPAS_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASVELPRO_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASPREPIE_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASPRESAL_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASDEC_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"MAQCOD_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            edtDisFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISFASOBS_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_39_Refreshing);
            if ( ( nRcdExists_39 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               standaloneModal1PB39( ) ;
            }
            sendRow1PB39( ) ;
            bGXsfl_39_Refreshing = false ;
         }
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount39 = (short)(5) ;
         nRcdExists_39 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1PB39( ) ;
            while ( RcdFound39 != 0 )
            {
               sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3939( ) ;
               init_level_properties39( ) ;
               standaloneNotModal1PB39( ) ;
               getByPrimaryKey1PB39( ) ;
               standaloneModal1PB39( ) ;
               addRow1PB39( ) ;
               scanNext1PB39( ) ;
            }
            scanEnd1PB39( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode39 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_3939( ) ;
      initAll1PB39( ) ;
      init_level_properties39( ) ;
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
      nBlankRcdCount39 = (short)(nBlankRcdUsr39+nBlankRcdCount39) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount39 > 0 )
      {
         standaloneNotModal1PB39( ) ;
         standaloneModal1PB39( ) ;
         addRow1PB39( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisFasLin_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount39 = (short)(nBlankRcdCount39-1) ;
      }
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+sPrefix+"Gridentradapedidoclientefases_fasesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridentradapedidoclientefases_fases", Gridentradapedidoclientefases_fasesContainer, subGridentradapedidoclientefases_fases_Internalname);
      if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridentradapedidoclientefases_fasesContainerData", Gridentradapedidoclientefases_fasesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridentradapedidoclientefases_fasesContainerData"+"V", Gridentradapedidoclientefases_fasesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridentradapedidoclientefases_fasesContainerData"+"V"+"\" value='"+Gridentradapedidoclientefases_fasesContainer.GridValuesHidden()+"'/>") ;
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
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            standaloneStartupServer( ) ;
         }
      }
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111PB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      nDoneStart = (byte)(1) ;
      if ( AnyError == 0 )
      {
         sXEvt = httpContext.cgiGet( "_EventName") ;
         if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( sPrefix+"Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z758ProCod = httpContext.cgiGet( sPrefix+"Z758ProCod") ;
            wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
            wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            wcpOA758ProCod = httpContext.cgiGet( sPrefix+"wcpOA758ProCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( sPrefix+"Mode") ;
            nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( sPrefix+"EMPRCOD") ;
            A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7744FasPreObl = false ;
            /* Read variables values. */
            if ( GXutil.len( sPrefix) == 0 )
            {
               A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            if ( GXutil.len( sPrefix) == 0 )
            {
               A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758ProCod", A758ProCod);
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
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758ProCod", A758ProCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
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
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read Transaction buttons. */
         if ( httpContext.wbHandled == 0 )
         {
            if ( GXutil.len( sPrefix) == 0 )
            {
               sEvt = httpContext.cgiGet( "_EventName") ;
               EvtGridId = httpContext.cgiGet( "_EventGridId") ;
               EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            }
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              dynload_actions( ) ;
                              /* Execute user event: Start */
                              e111PB2 ();
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_enter( ) ;
                           }
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_first( ) ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_previous( ) ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_next( ) ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_last( ) ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_select( ) ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              btn_delete( ) ;
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                        {
                           standaloneStartupServer( ) ;
                        }
                        if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              afterkeyloadscreen( ) ;
                           }
                        }
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
            initAll1PB38( ) ;
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
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes1PB38( ) ;
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

   public void confirm_1PB39( )
   {
      nGXsfl_39_idx = 0 ;
      while ( nGXsfl_39_idx < nRC_GXsfl_39 )
      {
         readRow1PB39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            getKey1PB39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                  beforeValidate1PB39( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1PB39( ) ;
                     closeExtendedTableCursors1PB39( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISFASLIN_" + sGXsfl_39_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisFasLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( nRcdDeleted_39 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1PB39( ) ;
                     load1PB39( ) ;
                     beforeValidate1PB39( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1PB39( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        beforeValidate1PB39( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1PB39( ) ;
                           closeExtendedTableCursors1PB39( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_39_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( sPrefix+edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( sPrefix+edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( sPrefix+edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( sPrefix+edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( sPrefix+edtFasApr_Internalname, GXutil.rtrim( A3697FasApr)) ;
         httpContext.changePostValue( sPrefix+edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( sPrefix+edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( sPrefix+edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( sPrefix+edtDisFasObs_Internalname, A9841DisFasObs) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z368DisFasLin_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z3697FasApr_"+sGXsfl_39_idx, GXutil.rtrim( Z3697FasApr)) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z9841DisFasObs_"+sGXsfl_39_idx, Z9841DisFasObs) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z457FasCod_"+sGXsfl_39_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( sPrefix+"nRcdDeleted_39_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdExists_39_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nIsMod_39_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( sPrefix+"DISFASLIN_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASCOD_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASDSC_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASACAB_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASFORMUL_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASAPR_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASACTTIN_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASCON_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASNUMPAS_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASVELPRO_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASPREPIE_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASPRESAL_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASDEC_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"MAQCOD_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISFASOBS_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1PB0( )
   {
   }

   public void e111PB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      A396EmprCod_Visible = 0 ;
      edtDisCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), true);
      edtProCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Visible), 5, 0), true);
   }

   public void zm1PB38( int GX_JID )
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
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01PB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(5);
      /* Using cursor T01PB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load1PB38( )
   {
      /* Using cursor T01PB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound38 = (short)(1) ;
         zm1PB38( -2) ;
      }
      pr_default.close(7);
      onLoadActions1PB38( ) ;
   }

   public void onLoadActions1PB38( )
   {
   }

   public void checkExtendedTable1PB38( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1PB38( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1PB38( )
   {
      /* Using cursor T01PB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01PB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01PB6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PB6_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PB6_A758ProCod[0], A758ProCod) == 0 ) )
      {
         zm1PB38( 2) ;
         RcdFound38 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1PB38( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1PB38( ) ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1PB38( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1PB38( ) ;
      if ( RcdFound38 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T01PB11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01PB11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PB11_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PB11_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01PB11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PB11_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PB11_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T01PB12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01PB12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PB12_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PB12_A758ProCod[0], A758ProCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T01PB12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01PB12_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PB12_A758ProCod[0], A758ProCod) == 0 ) )
         {
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1PB38( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1PB38( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound38 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               /* Update record */
               update1PB38( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               /* Insert record */
               insert1PB38( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DISCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  insert1PB38( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
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
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1PB38( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      scanEnd1PB38( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1PB38( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound38 != 0 )
         {
            scanNext1PB38( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      scanEnd1PB38( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1PB38( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PB5 */
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

   public void insert1PB38( )
   {
      beforeValidate1PB38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PB38( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PB38( 0) ;
         checkOptimisticConcurrency1PB38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PB38( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PB38( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PB13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel1PB38( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1PB0( ) ;
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
            load1PB38( ) ;
         }
         endLevel1PB38( ) ;
      }
      closeExtendedTableCursors1PB38( ) ;
   }

   public void update1PB38( )
   {
      beforeValidate1PB38( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PB38( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PB38( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PB38( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1PB38( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISLIN */
                  deferredUpdate1PB38( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1PB38( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1PB0( ) ;
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
         endLevel1PB38( ) ;
      }
      closeExtendedTableCursors1PB38( ) ;
   }

   public void deferredUpdate1PB38( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      beforeValidate1PB38( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PB38( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PB38( ) ;
         afterConfirm1PB38( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PB38( ) ;
            if ( AnyError == 0 )
            {
               scanStart1PB39( ) ;
               while ( RcdFound39 != 0 )
               {
                  getByPrimaryKey1PB39( ) ;
                  delete1PB39( ) ;
                  scanNext1PB39( ) ;
               }
               scanEnd1PB39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PB14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
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
                           initAll1PB38( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaption1PB0( ) ;
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
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      endLevel1PB38( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PB38( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01PB15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel1PB39( )
   {
      nGXsfl_39_idx = 0 ;
      while ( nGXsfl_39_idx < nRC_GXsfl_39 )
      {
         readRow1PB39( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            standaloneNotModal1PB39( ) ;
            getKey1PB39( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               insert1PB39( ) ;
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( ( nRcdDeleted_39 != 0 ) && ( nRcdExists_39 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                     delete1PB39( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        update1PB39( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_39 == 0 )
                  {
                     GXCCtl = "DISFASLIN_" + sGXsfl_39_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisFasLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( sPrefix+edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( sPrefix+edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( sPrefix+edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( sPrefix+edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( sPrefix+edtFasApr_Internalname, GXutil.rtrim( A3697FasApr)) ;
         httpContext.changePostValue( sPrefix+edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( sPrefix+edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( sPrefix+edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( sPrefix+edtDisFasObs_Internalname, A9841DisFasObs) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z368DisFasLin_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z3697FasApr_"+sGXsfl_39_idx, GXutil.rtrim( Z3697FasApr)) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z9841DisFasObs_"+sGXsfl_39_idx, Z9841DisFasObs) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z457FasCod_"+sGXsfl_39_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( sPrefix+"nRcdDeleted_39_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdExists_39_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nIsMod_39_"+sGXsfl_39_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_39 != 0 )
         {
            httpContext.changePostValue( sPrefix+"DISFASLIN_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASCOD_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASDSC_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASACAB_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASFORMUL_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASAPR_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASACTTIN_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASCON_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASNUMPAS_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASVELPRO_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASPREPIE_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASPRESAL_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"FASDEC_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"MAQCOD_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISFASOBS_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1PB39( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
   }

   public void processLevel1PB38( )
   {
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      processNestedLevel1PB39( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1PB38( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1PB38( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "entradapedidoclientefases");
         if ( AnyError == 0 )
         {
            confirmValues1PB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "entradapedidoclientefases");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1PB38( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A361DisCod = A361DisCod ;
      this.A758ProCod = A758ProCod ;
      /* Scan By routine */
      /* Using cursor T01PB16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PB38( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
   }

   public void scanEnd1PB38( )
   {
      pr_default.close(14);
   }

   public void afterConfirm1PB38( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PB38( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PB38( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PB38( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PB38( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PB38( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PB38( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
   }

   public void zm1PB39( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3697FasApr = T01PB3_A3697FasApr[0] ;
            Z9841DisFasObs = T01PB3_A9841DisFasObs[0] ;
            Z457FasCod = T01PB3_A457FasCod[0] ;
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

   public void standaloneNotModal1PB39( )
   {
   }

   public void standaloneModal1PB39( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisFasLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      }
      else
      {
         edtDisFasLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      }
   }

   public void load1PB39( )
   {
      /* Using cursor T01PB17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A460FasDsc = T01PB17_A460FasDsc[0] ;
         A4903FasAcab = T01PB17_A4903FasAcab[0] ;
         n4903FasAcab = T01PB17_n4903FasAcab[0] ;
         A4286FasForMul = T01PB17_A4286FasForMul[0] ;
         n4286FasForMul = T01PB17_n4286FasForMul[0] ;
         A3697FasApr = T01PB17_A3697FasApr[0] ;
         A456FasActTin = T01PB17_A456FasActTin[0] ;
         n456FasActTin = T01PB17_n456FasActTin[0] ;
         A458FasCon = T01PB17_A458FasCon[0] ;
         n458FasCon = T01PB17_n458FasCon[0] ;
         A464FasNumPas = T01PB17_A464FasNumPas[0] ;
         n464FasNumPas = T01PB17_n464FasNumPas[0] ;
         A472FasVelPro = T01PB17_A472FasVelPro[0] ;
         n472FasVelPro = T01PB17_n472FasVelPro[0] ;
         A468FasPrePie = T01PB17_A468FasPrePie[0] ;
         n468FasPrePie = T01PB17_n468FasPrePie[0] ;
         A469FasPreSal = T01PB17_A469FasPreSal[0] ;
         n469FasPreSal = T01PB17_n469FasPreSal[0] ;
         A459FasDec = T01PB17_A459FasDec[0] ;
         n459FasDec = T01PB17_n459FasDec[0] ;
         A9841DisFasObs = T01PB17_A9841DisFasObs[0] ;
         A7744FasPreObl = T01PB17_A7744FasPreObl[0] ;
         n7744FasPreObl = T01PB17_n7744FasPreObl[0] ;
         A457FasCod = T01PB17_A457FasCod[0] ;
         A602MaqCod = T01PB17_A602MaqCod[0] ;
         n602MaqCod = T01PB17_n602MaqCod[0] ;
         zm1PB39( -5) ;
      }
      pr_default.close(15);
      onLoadActions1PB39( ) ;
   }

   public void onLoadActions1PB39( )
   {
   }

   public void checkExtendedTable1PB39( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1PB39( ) ;
      /* Using cursor T01PB4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_39_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PB4_A460FasDsc[0] ;
      A4903FasAcab = T01PB4_A4903FasAcab[0] ;
      n4903FasAcab = T01PB4_n4903FasAcab[0] ;
      A4286FasForMul = T01PB4_A4286FasForMul[0] ;
      n4286FasForMul = T01PB4_n4286FasForMul[0] ;
      A456FasActTin = T01PB4_A456FasActTin[0] ;
      n456FasActTin = T01PB4_n456FasActTin[0] ;
      A458FasCon = T01PB4_A458FasCon[0] ;
      n458FasCon = T01PB4_n458FasCon[0] ;
      A464FasNumPas = T01PB4_A464FasNumPas[0] ;
      n464FasNumPas = T01PB4_n464FasNumPas[0] ;
      A472FasVelPro = T01PB4_A472FasVelPro[0] ;
      n472FasVelPro = T01PB4_n472FasVelPro[0] ;
      A468FasPrePie = T01PB4_A468FasPrePie[0] ;
      n468FasPrePie = T01PB4_n468FasPrePie[0] ;
      A469FasPreSal = T01PB4_A469FasPreSal[0] ;
      n469FasPreSal = T01PB4_n469FasPreSal[0] ;
      A459FasDec = T01PB4_A459FasDec[0] ;
      n459FasDec = T01PB4_n459FasDec[0] ;
      A7744FasPreObl = T01PB4_A7744FasPreObl[0] ;
      n7744FasPreObl = T01PB4_n7744FasPreObl[0] ;
      A602MaqCod = T01PB4_A602MaqCod[0] ;
      n602MaqCod = T01PB4_n602MaqCod[0] ;
      pr_default.close(2);
      if ( ! ( ( GXutil.strcmp(A3697FasApr, "S") == 0 ) || ( GXutil.strcmp(A3697FasApr, "N") == 0 ) ) )
      {
         GXCCtl = "FASAPR_" + sGXsfl_39_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Aprobacion Parametros Fase", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasApr_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1PB39( )
   {
      pr_default.close(2);
   }

   public void enableDisable1PB39( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01PB18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_39_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01PB18_A460FasDsc[0] ;
      A4903FasAcab = T01PB18_A4903FasAcab[0] ;
      n4903FasAcab = T01PB18_n4903FasAcab[0] ;
      A4286FasForMul = T01PB18_A4286FasForMul[0] ;
      n4286FasForMul = T01PB18_n4286FasForMul[0] ;
      A456FasActTin = T01PB18_A456FasActTin[0] ;
      n456FasActTin = T01PB18_n456FasActTin[0] ;
      A458FasCon = T01PB18_A458FasCon[0] ;
      n458FasCon = T01PB18_n458FasCon[0] ;
      A464FasNumPas = T01PB18_A464FasNumPas[0] ;
      n464FasNumPas = T01PB18_n464FasNumPas[0] ;
      A472FasVelPro = T01PB18_A472FasVelPro[0] ;
      n472FasVelPro = T01PB18_n472FasVelPro[0] ;
      A468FasPrePie = T01PB18_A468FasPrePie[0] ;
      n468FasPrePie = T01PB18_n468FasPrePie[0] ;
      A469FasPreSal = T01PB18_A469FasPreSal[0] ;
      n469FasPreSal = T01PB18_n469FasPreSal[0] ;
      A459FasDec = T01PB18_A459FasDec[0] ;
      n459FasDec = T01PB18_n459FasDec[0] ;
      A7744FasPreObl = T01PB18_A7744FasPreObl[0] ;
      n7744FasPreObl = T01PB18_n7744FasPreObl[0] ;
      A602MaqCod = T01PB18_A602MaqCod[0] ;
      n602MaqCod = T01PB18_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1PB39( )
   {
      /* Using cursor T01PB19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1PB39( )
   {
      /* Using cursor T01PB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(1) != 101) && ( T01PB3_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01PB3_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01PB3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1PB39( 5) ;
         RcdFound39 = (short)(1) ;
         initializeNonKey1PB39( ) ;
         A368DisFasLin = T01PB3_A368DisFasLin[0] ;
         A3697FasApr = T01PB3_A3697FasApr[0] ;
         A9841DisFasObs = T01PB3_A9841DisFasObs[0] ;
         A457FasCod = T01PB3_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal1PB39( ) ;
         load1PB39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1PB39( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal1PB39( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1PB39( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1PB39( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01PB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3697FasApr, T01PB2_A3697FasApr[0]) != 0 ) || ( GXutil.strcmp(Z9841DisFasObs, T01PB2_A9841DisFasObs[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01PB2_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3697FasApr, T01PB2_A3697FasApr[0]) != 0 )
            {
               GXutil.writeLogln("entradapedidoclientefases:[seudo value changed for attri]"+"FasApr");
               GXutil.writeLogRaw("Old: ",Z3697FasApr);
               GXutil.writeLogRaw("Current: ",T01PB2_A3697FasApr[0]);
            }
            if ( GXutil.strcmp(Z9841DisFasObs, T01PB2_A9841DisFasObs[0]) != 0 )
            {
               GXutil.writeLogln("entradapedidoclientefases:[seudo value changed for attri]"+"DisFasObs");
               GXutil.writeLogRaw("Old: ",Z9841DisFasObs);
               GXutil.writeLogRaw("Current: ",T01PB2_A9841DisFasObs[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01PB2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("entradapedidoclientefases:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01PB2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1PB39( )
   {
      beforeValidate1PB39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PB39( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1PB39( 0) ;
         checkOptimisticConcurrency1PB39( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1PB39( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1PB39( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01PB20 */
                  pr_default.execute(18, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A3697FasApr, A9841DisFasObs, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load1PB39( ) ;
         }
         endLevel1PB39( ) ;
      }
      closeExtendedTableCursors1PB39( ) ;
   }

   public void update1PB39( )
   {
      beforeValidate1PB39( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1PB39( ) ;
      }
      if ( ( nIsMod_39 != 0 ) || ( nIsDirty_39 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1PB39( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1PB39( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1PB39( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01PB21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A3697FasApr, A9841DisFasObs, A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1PB39( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1PB39( ) ;
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
            endLevel1PB39( ) ;
         }
      }
      closeExtendedTableCursors1PB39( ) ;
   }

   public void deferredUpdate1PB39( )
   {
   }

   public void delete1PB39( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      beforeValidate1PB39( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1PB39( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1PB39( ) ;
         afterConfirm1PB39( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1PB39( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01PB22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
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
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      endLevel1PB39( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1PB39( )
   {
      standaloneModal1PB39( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01PB23 */
         pr_default.execute(21, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01PB23_A460FasDsc[0] ;
         A4903FasAcab = T01PB23_A4903FasAcab[0] ;
         n4903FasAcab = T01PB23_n4903FasAcab[0] ;
         A4286FasForMul = T01PB23_A4286FasForMul[0] ;
         n4286FasForMul = T01PB23_n4286FasForMul[0] ;
         A456FasActTin = T01PB23_A456FasActTin[0] ;
         n456FasActTin = T01PB23_n456FasActTin[0] ;
         A458FasCon = T01PB23_A458FasCon[0] ;
         n458FasCon = T01PB23_n458FasCon[0] ;
         A464FasNumPas = T01PB23_A464FasNumPas[0] ;
         n464FasNumPas = T01PB23_n464FasNumPas[0] ;
         A472FasVelPro = T01PB23_A472FasVelPro[0] ;
         n472FasVelPro = T01PB23_n472FasVelPro[0] ;
         A468FasPrePie = T01PB23_A468FasPrePie[0] ;
         n468FasPrePie = T01PB23_n468FasPrePie[0] ;
         A469FasPreSal = T01PB23_A469FasPreSal[0] ;
         n469FasPreSal = T01PB23_n469FasPreSal[0] ;
         A459FasDec = T01PB23_A459FasDec[0] ;
         n459FasDec = T01PB23_n459FasDec[0] ;
         A7744FasPreObl = T01PB23_A7744FasPreObl[0] ;
         n7744FasPreObl = T01PB23_n7744FasPreObl[0] ;
         A602MaqCod = T01PB23_A602MaqCod[0] ;
         n602MaqCod = T01PB23_n602MaqCod[0] ;
         pr_default.close(21);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01PB24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01PB25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01PB26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01PB27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01PB28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void endLevel1PB39( )
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

   public void scanStart1PB39( )
   {
      /* Scan By routine */
      /* Using cursor T01PB29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01PB29_A368DisFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1PB39( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01PB29_A368DisFasLin[0] ;
      }
   }

   public void scanEnd1PB39( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1PB39( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1PB39( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1PB39( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1PB39( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1PB39( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1PB39( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1PB39( )
   {
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasApr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasNumPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasVelPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasPrePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasPreSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtDisFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_39_Refreshing);
   }

   public void send_integrity_lvl_hashes1PB39( )
   {
   }

   public void send_integrity_lvl_hashes1PB38( )
   {
   }

   public void subsflControlProps_3939( )
   {
      edtDisFasLin_Internalname = sPrefix+"DISFASLIN_"+sGXsfl_39_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_39_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_39_idx ;
      edtFasAcab_Internalname = sPrefix+"FASACAB_"+sGXsfl_39_idx ;
      edtFasForMul_Internalname = sPrefix+"FASFORMUL_"+sGXsfl_39_idx ;
      edtFasApr_Internalname = sPrefix+"FASAPR_"+sGXsfl_39_idx ;
      edtFasActTin_Internalname = sPrefix+"FASACTTIN_"+sGXsfl_39_idx ;
      edtFasCon_Internalname = sPrefix+"FASCON_"+sGXsfl_39_idx ;
      edtFasNumPas_Internalname = sPrefix+"FASNUMPAS_"+sGXsfl_39_idx ;
      edtFasVelPro_Internalname = sPrefix+"FASVELPRO_"+sGXsfl_39_idx ;
      edtFasPrePie_Internalname = sPrefix+"FASPREPIE_"+sGXsfl_39_idx ;
      edtFasPreSal_Internalname = sPrefix+"FASPRESAL_"+sGXsfl_39_idx ;
      edtFasDec_Internalname = sPrefix+"FASDEC_"+sGXsfl_39_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_39_idx ;
      edtDisFasObs_Internalname = sPrefix+"DISFASOBS_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_3939( )
   {
      edtDisFasLin_Internalname = sPrefix+"DISFASLIN_"+sGXsfl_39_fel_idx ;
      edtFasCod_Internalname = sPrefix+"FASCOD_"+sGXsfl_39_fel_idx ;
      edtFasDsc_Internalname = sPrefix+"FASDSC_"+sGXsfl_39_fel_idx ;
      edtFasAcab_Internalname = sPrefix+"FASACAB_"+sGXsfl_39_fel_idx ;
      edtFasForMul_Internalname = sPrefix+"FASFORMUL_"+sGXsfl_39_fel_idx ;
      edtFasApr_Internalname = sPrefix+"FASAPR_"+sGXsfl_39_fel_idx ;
      edtFasActTin_Internalname = sPrefix+"FASACTTIN_"+sGXsfl_39_fel_idx ;
      edtFasCon_Internalname = sPrefix+"FASCON_"+sGXsfl_39_fel_idx ;
      edtFasNumPas_Internalname = sPrefix+"FASNUMPAS_"+sGXsfl_39_fel_idx ;
      edtFasVelPro_Internalname = sPrefix+"FASVELPRO_"+sGXsfl_39_fel_idx ;
      edtFasPrePie_Internalname = sPrefix+"FASPREPIE_"+sGXsfl_39_fel_idx ;
      edtFasPreSal_Internalname = sPrefix+"FASPRESAL_"+sGXsfl_39_fel_idx ;
      edtFasDec_Internalname = sPrefix+"FASDEC_"+sGXsfl_39_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_39_fel_idx ;
      edtDisFasObs_Internalname = sPrefix+"DISFASOBS_"+sGXsfl_39_fel_idx ;
   }

   public void addRow1PB39( )
   {
      nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3939( ) ;
      sendRow1PB39( ) ;
   }

   public void sendRow1PB39( )
   {
      Gridentradapedidoclientefases_fasesRow = GXWebRow.GetNew(context) ;
      if ( subGridentradapedidoclientefases_fases_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridentradapedidoclientefases_fases_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridentradapedidoclientefases_fases_Class, "") != 0 )
         {
            subGridentradapedidoclientefases_fases_Linesclass = subGridentradapedidoclientefases_fases_Class+"Odd" ;
         }
      }
      else if ( subGridentradapedidoclientefases_fases_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridentradapedidoclientefases_fases_Backstyle = (byte)(0) ;
         subGridentradapedidoclientefases_fases_Backcolor = subGridentradapedidoclientefases_fases_Allbackcolor ;
         if ( GXutil.strcmp(subGridentradapedidoclientefases_fases_Class, "") != 0 )
         {
            subGridentradapedidoclientefases_fases_Linesclass = subGridentradapedidoclientefases_fases_Class+"Uniform" ;
         }
      }
      else if ( subGridentradapedidoclientefases_fases_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridentradapedidoclientefases_fases_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridentradapedidoclientefases_fases_Class, "") != 0 )
         {
            subGridentradapedidoclientefases_fases_Linesclass = subGridentradapedidoclientefases_fases_Class+"Odd" ;
         }
         subGridentradapedidoclientefases_fases_Backcolor = (int)(0x0) ;
      }
      else if ( subGridentradapedidoclientefases_fases_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridentradapedidoclientefases_fases_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
         {
            subGridentradapedidoclientefases_fases_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridentradapedidoclientefases_fases_Class, "") != 0 )
            {
               subGridentradapedidoclientefases_fases_Linesclass = subGridentradapedidoclientefases_fases_Class+"Even" ;
            }
         }
         else
         {
            subGridentradapedidoclientefases_fases_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridentradapedidoclientefases_fases_Class, "") != 0 )
            {
               subGridentradapedidoclientefases_fases_Linesclass = subGridentradapedidoclientefases_fases_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_39_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',39)\"" ;
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_39_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',39)\"" ;
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,41);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasAcab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasForMul_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_39_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',39)\"" ;
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasApr_Internalname,GXutil.rtrim( A3697FasApr),GXutil.rtrim( localUtil.format( A3697FasApr, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,45);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasApr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasApr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasNumPas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasVelPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPrePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasPreSal_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_39_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',39)\"" ;
      ROClassString = "Attribute" ;
      Gridentradapedidoclientefases_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasObs_Internalname,A9841DisFasObs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisFasObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisFasObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridentradapedidoclientefases_fasesRow);
      send_integrity_lvl_hashes1PB39( ) ;
      GXCCtl = "Z368DisFasLin_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3697FasApr_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Z3697FasApr));
      GXCCtl = "Z9841DisFasObs_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, Z9841DisFasObs);
      GXCCtl = "Z457FasCod_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_39_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_39_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_39, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_39_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISFASLIN_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASCOD_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASDSC_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASACAB_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASFORMUL_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASAPR_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASACTTIN_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASCON_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASNUMPAS_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASVELPRO_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASPREPIE_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASPRESAL_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASDEC_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISFASOBS_"+sGXsfl_39_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridentradapedidoclientefases_fasesContainer.AddRow(Gridentradapedidoclientefases_fasesRow);
   }

   public void readRow1PB39( )
   {
      nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3939( ) ;
      edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISFASLIN_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASCOD_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASDSC_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASACAB_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASFORMUL_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASAPR_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASACTTIN_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASCON_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASNUMPAS_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASVELPRO_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASPREPIE_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASPRESAL_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"FASDEC_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"MAQCOD_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISFASOBS_"+sGXsfl_39_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DISFASLIN_" + sGXsfl_39_idx ;
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
      GXCCtl = "Z368DisFasLin_" + sGXsfl_39_idx ;
      Z368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3697FasApr_" + sGXsfl_39_idx ;
      Z3697FasApr = httpContext.cgiGet( sPrefix+GXCCtl) ;
      GXCCtl = "Z9841DisFasObs_" + sGXsfl_39_idx ;
      Z9841DisFasObs = httpContext.cgiGet( sPrefix+GXCCtl) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_39_idx ;
      Z457FasCod = httpContext.cgiGet( sPrefix+GXCCtl) ;
      GXCCtl = "nRcdDeleted_39_" + sGXsfl_39_idx ;
      nRcdDeleted_39 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_39_" + sGXsfl_39_idx ;
      nRcdExists_39 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_39_" + sGXsfl_39_idx ;
      nIsMod_39 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisFasLin_Enabled = edtDisFasLin_Enabled ;
   }

   public void confirmValues1PB0( )
   {
      nGXsfl_39_idx = 0 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3939( ) ;
      while ( nGXsfl_39_idx < nRC_GXsfl_39 )
      {
         nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3939( ) ;
         httpContext.changePostValue( sPrefix+"Z368DisFasLin_"+sGXsfl_39_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z368DisFasLin_"+sGXsfl_39_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z368DisFasLin_"+sGXsfl_39_idx) ;
         httpContext.changePostValue( sPrefix+"Z3697FasApr_"+sGXsfl_39_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z3697FasApr_"+sGXsfl_39_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z3697FasApr_"+sGXsfl_39_idx) ;
         httpContext.changePostValue( sPrefix+"Z9841DisFasObs_"+sGXsfl_39_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z9841DisFasObs_"+sGXsfl_39_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z9841DisFasObs_"+sGXsfl_39_idx) ;
         httpContext.changePostValue( sPrefix+"Z457FasCod_"+sGXsfl_39_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z457FasCod_"+sGXsfl_39_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z457FasCod_"+sGXsfl_39_idx) ;
      }
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada Pedido Cliente Fases", "")) ;
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
      }
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
      if ( GXutil.len( sPrefix) == 0 )
      {
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradapedidoclientefases", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod))}, new String[] {"EmprCod","DisCod","ProCod"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA361DisCod", GXutil.ltrim( localUtil.ntoc( wcpOA361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA758ProCod", GXutil.rtrim( wcpOA758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nGXsfl_39_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
   }

   public void renderHtmlCloseForm1PB38( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "EntradaPedidoClienteFases" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Pedido Cliente Fases", "") ;
   }

   public void initializeNonKey1PB38( )
   {
   }

   public void initAll1PB38( )
   {
      initializeNonKey1PB38( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1PB39( )
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
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7744FasPreObl", GXutil.str( A7744FasPreObl, 1, 0));
      Z3697FasApr = "" ;
      Z9841DisFasObs = "" ;
      Z457FasCod = "" ;
   }

   public void initAll1PB39( )
   {
      A368DisFasLin = (short)(0) ;
      initializeNonKey1PB39( ) ;
   }

   public void standaloneModalInsert1PB39( )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA361DisCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA758ProCod = (String)getParm(obj,2,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      if ( GXutil.len( sPrefix) != 0 )
      {
         initialize_properties( ) ;
      }
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      if ( nDoneStart == 0 )
      {
      }
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "entradapedidoclientefases", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initenv( ) ;
         inittrn( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758ProCod", A758ProCod);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA758ProCod = httpContext.cgiGet( sPrefix+"wcpOA758ProCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A361DisCod != wcpOA361DisCod ) || ( GXutil.strcmp(A758ProCod, wcpOA758ProCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA361DisCod = A361DisCod ;
      wcpOA758ProCod = A758ProCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA361DisCod = httpContext.cgiGet( sPrefix+"A361DisCod_CTRL") ;
      if ( GXutil.len( sCtrlA361DisCod) > 0 )
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA361DisCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      else
      {
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A361DisCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA758ProCod = httpContext.cgiGet( sPrefix+"A758ProCod_CTRL") ;
      if ( GXutil.len( sCtrlA758ProCod) > 0 )
      {
         A758ProCod = httpContext.cgiGet( sCtrlA758ProCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A758ProCod", A758ProCod);
      }
      else
      {
         A758ProCod = httpContext.cgiGet( sPrefix+"A758ProCod_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initenv( ) ;
      inittrn( ) ;
      nDraw = (byte)(0) ;
      sEvt = sCompEvt ;
      if ( isFullAjaxMode( ) )
      {
         userMain( ) ;
      }
      else
      {
         wcparametersget( ) ;
      }
      process( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      userMain( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_PARM", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA361DisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A361DisCod_CTRL", GXutil.rtrim( sCtrlA361DisCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A758ProCod_PARM", GXutil.rtrim( A758ProCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA758ProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A758ProCod_CTRL", GXutil.rtrim( sCtrlA758ProCod));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      draw( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101557167", true, true);
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
      httpContext.AddJavascriptSource("entradapedidoclientefases.js", "?20266101557167", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties39( )
   {
      edtDisFasLin_Enabled = defedtDisFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_39_Refreshing);
   }

   public void startgridcontrol39( )
   {
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("GridName", "Gridentradapedidoclientefases_fases");
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Header", subGridentradapedidoclientefases_fases_Header);
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Class", "Grid");
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("InMasterPage", "false");
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A3697FasApr));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Value", A9841DisFasObs);
      Gridentradapedidoclientefases_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddColumnProperties(Gridentradapedidoclientefases_fasesColumn);
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridentradapedidoclientefases_fasesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridentradapedidoclientefases_fases_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = sPrefix+"TITLE" ;
      bttBtn_first_Internalname = sPrefix+"BTN_FIRST" ;
      bttBtn_previous_Internalname = sPrefix+"BTN_PREVIOUS" ;
      bttBtn_next_Internalname = sPrefix+"BTN_NEXT" ;
      bttBtn_last_Internalname = sPrefix+"BTN_LAST" ;
      bttBtn_select_Internalname = sPrefix+"BTN_SELECT" ;
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtProCod_Internalname = sPrefix+"PROCOD" ;
      lblTitlefases_Internalname = sPrefix+"TITLEFASES" ;
      edtDisFasLin_Internalname = sPrefix+"DISFASLIN" ;
      edtFasCod_Internalname = sPrefix+"FASCOD" ;
      edtFasDsc_Internalname = sPrefix+"FASDSC" ;
      edtFasAcab_Internalname = sPrefix+"FASACAB" ;
      edtFasForMul_Internalname = sPrefix+"FASFORMUL" ;
      edtFasApr_Internalname = sPrefix+"FASAPR" ;
      edtFasActTin_Internalname = sPrefix+"FASACTTIN" ;
      edtFasCon_Internalname = sPrefix+"FASCON" ;
      edtFasNumPas_Internalname = sPrefix+"FASNUMPAS" ;
      edtFasVelPro_Internalname = sPrefix+"FASVELPRO" ;
      edtFasPrePie_Internalname = sPrefix+"FASPREPIE" ;
      edtFasPreSal_Internalname = sPrefix+"FASPRESAL" ;
      edtFasDec_Internalname = sPrefix+"FASDEC" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtDisFasObs_Internalname = sPrefix+"DISFASOBS" ;
      bttBtn_enter_Internalname = sPrefix+"BTN_ENTER" ;
      bttBtn_cancel_Internalname = sPrefix+"BTN_CANCEL" ;
      bttBtn_delete_Internalname = sPrefix+"BTN_DELETE" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridentradapedidoclientefases_fases_Internalname = sPrefix+"GRIDENTRADAPEDIDOCLIENTEFASES_FASES" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGridentradapedidoclientefases_fases_Collapsed = (byte)(1) ;
      subGridentradapedidoclientefases_fases_Allowcollapsing = (byte)(1) ;
      subGridentradapedidoclientefases_fases_Allowselection = (byte)(0) ;
      subGridentradapedidoclientefases_fases_Header = "" ;
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
      subGridentradapedidoclientefases_fases_Class = "Grid" ;
      subGridentradapedidoclientefases_fases_Backcolorstyle = (byte)(0) ;
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
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
      edtProCod_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      edtDisCod_Visible = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridentradapedidoclientefases_fases_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      subsflControlProps_3939( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1PB39( ) ;
         standaloneModal1PB39( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1PB39( ) ;
         nGXsfl_39_idx = (int)(nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3939( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridentradapedidoclientefases_fasesContainer)) ;
      /* End function gxnrGridentradapedidoclientefases_fases_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01PB30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(28);
      /* Using cursor T01PB31 */
      pr_default.execute(29, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(29);
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void valid_Procod( )
   {
      if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
      {
         standaloneStartupServer( ) ;
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         httpContext.wbHandled = (byte)(1) ;
         if ( ! wbErr )
         {
            afterkeyloadscreen( ) ;
         }
      }
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z758ProCod", GXutil.rtrim( Z758ProCod));
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      /* Using cursor T01PB23 */
      pr_default.execute(21, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01PB23_A460FasDsc[0] ;
      A4903FasAcab = T01PB23_A4903FasAcab[0] ;
      n4903FasAcab = T01PB23_n4903FasAcab[0] ;
      A4286FasForMul = T01PB23_A4286FasForMul[0] ;
      n4286FasForMul = T01PB23_n4286FasForMul[0] ;
      A456FasActTin = T01PB23_A456FasActTin[0] ;
      n456FasActTin = T01PB23_n456FasActTin[0] ;
      A458FasCon = T01PB23_A458FasCon[0] ;
      n458FasCon = T01PB23_n458FasCon[0] ;
      A464FasNumPas = T01PB23_A464FasNumPas[0] ;
      n464FasNumPas = T01PB23_n464FasNumPas[0] ;
      A472FasVelPro = T01PB23_A472FasVelPro[0] ;
      n472FasVelPro = T01PB23_n472FasVelPro[0] ;
      A468FasPrePie = T01PB23_A468FasPrePie[0] ;
      n468FasPrePie = T01PB23_n468FasPrePie[0] ;
      A469FasPreSal = T01PB23_A469FasPreSal[0] ;
      n469FasPreSal = T01PB23_n469FasPreSal[0] ;
      A459FasDec = T01PB23_A459FasDec[0] ;
      n459FasDec = T01PB23_n459FasDec[0] ;
      A7744FasPreObl = T01PB23_A7744FasPreObl[0] ;
      n7744FasPreObl = T01PB23_n7744FasPreObl[0] ;
      A602MaqCod = T01PB23_A602MaqCod[0] ;
      n602MaqCod = T01PB23_n602MaqCod[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4903FasAcab", GXutil.rtrim( A4903FasAcab));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A7744FasPreObl", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
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
      setEventMetadata("ENTER","{handler:'componentprocess',iparms:[{postForm:true},{sPrefix:true},{sSFPrefix:true},{sCompEvt:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z361DisCod'},{av:'Z758ProCod'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(21);
      pr_default.close(28);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA758ProCod = "" ;
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
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sXEvt = "" ;
      Gx_mode = "" ;
      lblTitle_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      lblTitlefases_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridentradapedidoclientefases_fasesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode39 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
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
      T01PB7_A396EmprCod = new String[] {""} ;
      T01PB8_A396EmprCod = new String[] {""} ;
      T01PB9_A396EmprCod = new String[] {""} ;
      T01PB9_A361DisCod = new int[1] ;
      T01PB9_A758ProCod = new String[] {""} ;
      T01PB10_A396EmprCod = new String[] {""} ;
      T01PB10_A361DisCod = new int[1] ;
      T01PB10_A758ProCod = new String[] {""} ;
      T01PB6_A396EmprCod = new String[] {""} ;
      T01PB6_A361DisCod = new int[1] ;
      T01PB6_A758ProCod = new String[] {""} ;
      sMode38 = "" ;
      T01PB11_A396EmprCod = new String[] {""} ;
      T01PB11_A361DisCod = new int[1] ;
      T01PB11_A758ProCod = new String[] {""} ;
      T01PB12_A396EmprCod = new String[] {""} ;
      T01PB12_A361DisCod = new int[1] ;
      T01PB12_A758ProCod = new String[] {""} ;
      T01PB5_A396EmprCod = new String[] {""} ;
      T01PB5_A361DisCod = new int[1] ;
      T01PB5_A758ProCod = new String[] {""} ;
      T01PB15_A396EmprCod = new String[] {""} ;
      T01PB15_A361DisCod = new int[1] ;
      T01PB15_A758ProCod = new String[] {""} ;
      T01PB15_A368DisFasLin = new short[1] ;
      T01PB15_A1664ParFasCod = new short[1] ;
      T01PB16_A396EmprCod = new String[] {""} ;
      T01PB16_A361DisCod = new int[1] ;
      T01PB16_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z4903FasAcab = "" ;
      Z4286FasForMul = "" ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      T01PB17_A361DisCod = new int[1] ;
      T01PB17_A758ProCod = new String[] {""} ;
      T01PB17_A368DisFasLin = new short[1] ;
      T01PB17_A460FasDsc = new String[] {""} ;
      T01PB17_A4903FasAcab = new String[] {""} ;
      T01PB17_n4903FasAcab = new boolean[] {false} ;
      T01PB17_A4286FasForMul = new String[] {""} ;
      T01PB17_n4286FasForMul = new boolean[] {false} ;
      T01PB17_A3697FasApr = new String[] {""} ;
      T01PB17_A456FasActTin = new String[] {""} ;
      T01PB17_n456FasActTin = new boolean[] {false} ;
      T01PB17_A458FasCon = new String[] {""} ;
      T01PB17_n458FasCon = new boolean[] {false} ;
      T01PB17_A464FasNumPas = new short[1] ;
      T01PB17_n464FasNumPas = new boolean[] {false} ;
      T01PB17_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB17_n472FasVelPro = new boolean[] {false} ;
      T01PB17_A468FasPrePie = new short[1] ;
      T01PB17_n468FasPrePie = new boolean[] {false} ;
      T01PB17_A469FasPreSal = new short[1] ;
      T01PB17_n469FasPreSal = new boolean[] {false} ;
      T01PB17_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB17_n459FasDec = new boolean[] {false} ;
      T01PB17_A9841DisFasObs = new String[] {""} ;
      T01PB17_A7744FasPreObl = new byte[1] ;
      T01PB17_n7744FasPreObl = new boolean[] {false} ;
      T01PB17_A396EmprCod = new String[] {""} ;
      T01PB17_A457FasCod = new String[] {""} ;
      T01PB17_A602MaqCod = new String[] {""} ;
      T01PB17_n602MaqCod = new boolean[] {false} ;
      T01PB4_A460FasDsc = new String[] {""} ;
      T01PB4_A4903FasAcab = new String[] {""} ;
      T01PB4_n4903FasAcab = new boolean[] {false} ;
      T01PB4_A4286FasForMul = new String[] {""} ;
      T01PB4_n4286FasForMul = new boolean[] {false} ;
      T01PB4_A456FasActTin = new String[] {""} ;
      T01PB4_n456FasActTin = new boolean[] {false} ;
      T01PB4_A458FasCon = new String[] {""} ;
      T01PB4_n458FasCon = new boolean[] {false} ;
      T01PB4_A464FasNumPas = new short[1] ;
      T01PB4_n464FasNumPas = new boolean[] {false} ;
      T01PB4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB4_n472FasVelPro = new boolean[] {false} ;
      T01PB4_A468FasPrePie = new short[1] ;
      T01PB4_n468FasPrePie = new boolean[] {false} ;
      T01PB4_A469FasPreSal = new short[1] ;
      T01PB4_n469FasPreSal = new boolean[] {false} ;
      T01PB4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB4_n459FasDec = new boolean[] {false} ;
      T01PB4_A7744FasPreObl = new byte[1] ;
      T01PB4_n7744FasPreObl = new boolean[] {false} ;
      T01PB4_A602MaqCod = new String[] {""} ;
      T01PB4_n602MaqCod = new boolean[] {false} ;
      T01PB18_A460FasDsc = new String[] {""} ;
      T01PB18_A4903FasAcab = new String[] {""} ;
      T01PB18_n4903FasAcab = new boolean[] {false} ;
      T01PB18_A4286FasForMul = new String[] {""} ;
      T01PB18_n4286FasForMul = new boolean[] {false} ;
      T01PB18_A456FasActTin = new String[] {""} ;
      T01PB18_n456FasActTin = new boolean[] {false} ;
      T01PB18_A458FasCon = new String[] {""} ;
      T01PB18_n458FasCon = new boolean[] {false} ;
      T01PB18_A464FasNumPas = new short[1] ;
      T01PB18_n464FasNumPas = new boolean[] {false} ;
      T01PB18_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB18_n472FasVelPro = new boolean[] {false} ;
      T01PB18_A468FasPrePie = new short[1] ;
      T01PB18_n468FasPrePie = new boolean[] {false} ;
      T01PB18_A469FasPreSal = new short[1] ;
      T01PB18_n469FasPreSal = new boolean[] {false} ;
      T01PB18_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB18_n459FasDec = new boolean[] {false} ;
      T01PB18_A7744FasPreObl = new byte[1] ;
      T01PB18_n7744FasPreObl = new boolean[] {false} ;
      T01PB18_A602MaqCod = new String[] {""} ;
      T01PB18_n602MaqCod = new boolean[] {false} ;
      T01PB19_A396EmprCod = new String[] {""} ;
      T01PB19_A361DisCod = new int[1] ;
      T01PB19_A758ProCod = new String[] {""} ;
      T01PB19_A368DisFasLin = new short[1] ;
      T01PB3_A361DisCod = new int[1] ;
      T01PB3_A758ProCod = new String[] {""} ;
      T01PB3_A368DisFasLin = new short[1] ;
      T01PB3_A3697FasApr = new String[] {""} ;
      T01PB3_A9841DisFasObs = new String[] {""} ;
      T01PB3_A396EmprCod = new String[] {""} ;
      T01PB3_A457FasCod = new String[] {""} ;
      T01PB3_A7744FasPreObl = new byte[1] ;
      T01PB3_n7744FasPreObl = new boolean[] {false} ;
      T01PB2_A361DisCod = new int[1] ;
      T01PB2_A758ProCod = new String[] {""} ;
      T01PB2_A368DisFasLin = new short[1] ;
      T01PB2_A3697FasApr = new String[] {""} ;
      T01PB2_A9841DisFasObs = new String[] {""} ;
      T01PB2_A396EmprCod = new String[] {""} ;
      T01PB2_A457FasCod = new String[] {""} ;
      T01PB2_A7744FasPreObl = new byte[1] ;
      T01PB2_n7744FasPreObl = new boolean[] {false} ;
      T01PB23_A460FasDsc = new String[] {""} ;
      T01PB23_A4903FasAcab = new String[] {""} ;
      T01PB23_n4903FasAcab = new boolean[] {false} ;
      T01PB23_A4286FasForMul = new String[] {""} ;
      T01PB23_n4286FasForMul = new boolean[] {false} ;
      T01PB23_A456FasActTin = new String[] {""} ;
      T01PB23_n456FasActTin = new boolean[] {false} ;
      T01PB23_A458FasCon = new String[] {""} ;
      T01PB23_n458FasCon = new boolean[] {false} ;
      T01PB23_A464FasNumPas = new short[1] ;
      T01PB23_n464FasNumPas = new boolean[] {false} ;
      T01PB23_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB23_n472FasVelPro = new boolean[] {false} ;
      T01PB23_A468FasPrePie = new short[1] ;
      T01PB23_n468FasPrePie = new boolean[] {false} ;
      T01PB23_A469FasPreSal = new short[1] ;
      T01PB23_n469FasPreSal = new boolean[] {false} ;
      T01PB23_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01PB23_n459FasDec = new boolean[] {false} ;
      T01PB23_A7744FasPreObl = new byte[1] ;
      T01PB23_n7744FasPreObl = new boolean[] {false} ;
      T01PB23_A602MaqCod = new String[] {""} ;
      T01PB23_n602MaqCod = new boolean[] {false} ;
      T01PB24_A396EmprCod = new String[] {""} ;
      T01PB24_A361DisCod = new int[1] ;
      T01PB24_A758ProCod = new String[] {""} ;
      T01PB24_A368DisFasLin = new short[1] ;
      T01PB24_A7919Dta_Ordl = new short[1] ;
      T01PB25_A396EmprCod = new String[] {""} ;
      T01PB25_A361DisCod = new int[1] ;
      T01PB25_A758ProCod = new String[] {""} ;
      T01PB25_A368DisFasLin = new short[1] ;
      T01PB25_A7727ArtAdiCod = new short[1] ;
      T01PB26_A396EmprCod = new String[] {""} ;
      T01PB26_A361DisCod = new int[1] ;
      T01PB26_A758ProCod = new String[] {""} ;
      T01PB26_A368DisFasLin = new short[1] ;
      T01PB26_A5377DisQuiLin = new short[1] ;
      T01PB27_A396EmprCod = new String[] {""} ;
      T01PB27_A361DisCod = new int[1] ;
      T01PB27_A758ProCod = new String[] {""} ;
      T01PB27_A368DisFasLin = new short[1] ;
      T01PB27_A5035A_Discod = new int[1] ;
      T01PB27_A5038A_DProcod = new String[] {""} ;
      T01PB27_A5039A_DOrdlin = new short[1] ;
      T01PB28_A396EmprCod = new String[] {""} ;
      T01PB28_A361DisCod = new int[1] ;
      T01PB28_A758ProCod = new String[] {""} ;
      T01PB28_A368DisFasLin = new short[1] ;
      T01PB28_A1664ParFasCod = new short[1] ;
      T01PB29_A396EmprCod = new String[] {""} ;
      T01PB29_A361DisCod = new int[1] ;
      T01PB29_A758ProCod = new String[] {""} ;
      T01PB29_A368DisFasLin = new short[1] ;
      Gridentradapedidoclientefases_fasesRow = new com.genexus.webpanels.GXWebRow();
      subGridentradapedidoclientefases_fases_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      sCtrlA396EmprCod = "" ;
      sCtrlA361DisCod = "" ;
      sCtrlA758ProCod = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gridentradapedidoclientefases_fasesColumn = new com.genexus.webpanels.GXWebColumn();
      T01PB30_A396EmprCod = new String[] {""} ;
      T01PB31_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ758ProCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.entradapedidoclientefases__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.entradapedidoclientefases__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.entradapedidoclientefases__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradapedidoclientefases__default(),
         new Object[] {
             new Object[] {
            T01PB2_A361DisCod, T01PB2_A758ProCod, T01PB2_A368DisFasLin, T01PB2_A3697FasApr, T01PB2_A9841DisFasObs, T01PB2_A396EmprCod, T01PB2_A457FasCod, T01PB2_A7744FasPreObl, T01PB2_n7744FasPreObl
            }
            , new Object[] {
            T01PB3_A361DisCod, T01PB3_A758ProCod, T01PB3_A368DisFasLin, T01PB3_A3697FasApr, T01PB3_A9841DisFasObs, T01PB3_A396EmprCod, T01PB3_A457FasCod, T01PB3_A7744FasPreObl, T01PB3_n7744FasPreObl
            }
            , new Object[] {
            T01PB4_A460FasDsc, T01PB4_A4903FasAcab, T01PB4_n4903FasAcab, T01PB4_A4286FasForMul, T01PB4_n4286FasForMul, T01PB4_A456FasActTin, T01PB4_n456FasActTin, T01PB4_A458FasCon, T01PB4_n458FasCon, T01PB4_A464FasNumPas,
            T01PB4_n464FasNumPas, T01PB4_A472FasVelPro, T01PB4_n472FasVelPro, T01PB4_A468FasPrePie, T01PB4_n468FasPrePie, T01PB4_A469FasPreSal, T01PB4_n469FasPreSal, T01PB4_A459FasDec, T01PB4_n459FasDec, T01PB4_A7744FasPreObl,
            T01PB4_n7744FasPreObl, T01PB4_A602MaqCod, T01PB4_n602MaqCod
            }
            , new Object[] {
            T01PB5_A396EmprCod, T01PB5_A361DisCod, T01PB5_A758ProCod
            }
            , new Object[] {
            T01PB6_A396EmprCod, T01PB6_A361DisCod, T01PB6_A758ProCod
            }
            , new Object[] {
            T01PB7_A396EmprCod
            }
            , new Object[] {
            T01PB8_A396EmprCod
            }
            , new Object[] {
            T01PB9_A396EmprCod, T01PB9_A361DisCod, T01PB9_A758ProCod
            }
            , new Object[] {
            T01PB10_A396EmprCod, T01PB10_A361DisCod, T01PB10_A758ProCod
            }
            , new Object[] {
            T01PB11_A396EmprCod, T01PB11_A361DisCod, T01PB11_A758ProCod
            }
            , new Object[] {
            T01PB12_A396EmprCod, T01PB12_A361DisCod, T01PB12_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PB15_A396EmprCod, T01PB15_A361DisCod, T01PB15_A758ProCod, T01PB15_A368DisFasLin, T01PB15_A1664ParFasCod
            }
            , new Object[] {
            T01PB16_A396EmprCod, T01PB16_A361DisCod, T01PB16_A758ProCod
            }
            , new Object[] {
            T01PB17_A361DisCod, T01PB17_A758ProCod, T01PB17_A368DisFasLin, T01PB17_A460FasDsc, T01PB17_A4903FasAcab, T01PB17_n4903FasAcab, T01PB17_A4286FasForMul, T01PB17_n4286FasForMul, T01PB17_A3697FasApr, T01PB17_A456FasActTin,
            T01PB17_n456FasActTin, T01PB17_A458FasCon, T01PB17_n458FasCon, T01PB17_A464FasNumPas, T01PB17_n464FasNumPas, T01PB17_A472FasVelPro, T01PB17_n472FasVelPro, T01PB17_A468FasPrePie, T01PB17_n468FasPrePie, T01PB17_A469FasPreSal,
            T01PB17_n469FasPreSal, T01PB17_A459FasDec, T01PB17_n459FasDec, T01PB17_A9841DisFasObs, T01PB17_A7744FasPreObl, T01PB17_n7744FasPreObl, T01PB17_A396EmprCod, T01PB17_A457FasCod, T01PB17_A602MaqCod, T01PB17_n602MaqCod
            }
            , new Object[] {
            T01PB18_A460FasDsc, T01PB18_A4903FasAcab, T01PB18_n4903FasAcab, T01PB18_A4286FasForMul, T01PB18_n4286FasForMul, T01PB18_A456FasActTin, T01PB18_n456FasActTin, T01PB18_A458FasCon, T01PB18_n458FasCon, T01PB18_A464FasNumPas,
            T01PB18_n464FasNumPas, T01PB18_A472FasVelPro, T01PB18_n472FasVelPro, T01PB18_A468FasPrePie, T01PB18_n468FasPrePie, T01PB18_A469FasPreSal, T01PB18_n469FasPreSal, T01PB18_A459FasDec, T01PB18_n459FasDec, T01PB18_A7744FasPreObl,
            T01PB18_n7744FasPreObl, T01PB18_A602MaqCod, T01PB18_n602MaqCod
            }
            , new Object[] {
            T01PB19_A396EmprCod, T01PB19_A361DisCod, T01PB19_A758ProCod, T01PB19_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01PB23_A460FasDsc, T01PB23_A4903FasAcab, T01PB23_n4903FasAcab, T01PB23_A4286FasForMul, T01PB23_n4286FasForMul, T01PB23_A456FasActTin, T01PB23_n456FasActTin, T01PB23_A458FasCon, T01PB23_n458FasCon, T01PB23_A464FasNumPas,
            T01PB23_n464FasNumPas, T01PB23_A472FasVelPro, T01PB23_n472FasVelPro, T01PB23_A468FasPrePie, T01PB23_n468FasPrePie, T01PB23_A469FasPreSal, T01PB23_n469FasPreSal, T01PB23_A459FasDec, T01PB23_n459FasDec, T01PB23_A7744FasPreObl,
            T01PB23_n7744FasPreObl, T01PB23_A602MaqCod, T01PB23_n602MaqCod
            }
            , new Object[] {
            T01PB24_A396EmprCod, T01PB24_A361DisCod, T01PB24_A758ProCod, T01PB24_A368DisFasLin, T01PB24_A7919Dta_Ordl
            }
            , new Object[] {
            T01PB25_A396EmprCod, T01PB25_A361DisCod, T01PB25_A758ProCod, T01PB25_A368DisFasLin, T01PB25_A7727ArtAdiCod
            }
            , new Object[] {
            T01PB26_A396EmprCod, T01PB26_A361DisCod, T01PB26_A758ProCod, T01PB26_A368DisFasLin, T01PB26_A5377DisQuiLin
            }
            , new Object[] {
            T01PB27_A396EmprCod, T01PB27_A361DisCod, T01PB27_A758ProCod, T01PB27_A368DisFasLin, T01PB27_A5035A_Discod, T01PB27_A5038A_DProcod, T01PB27_A5039A_DOrdlin
            }
            , new Object[] {
            T01PB28_A396EmprCod, T01PB28_A361DisCod, T01PB28_A758ProCod, T01PB28_A368DisFasLin, T01PB28_A1664ParFasCod
            }
            , new Object[] {
            T01PB29_A396EmprCod, T01PB29_A361DisCod, T01PB29_A758ProCod, T01PB29_A368DisFasLin
            }
            , new Object[] {
            T01PB30_A396EmprCod
            }
            , new Object[] {
            T01PB31_A396EmprCod
            }
         }
      );
      Z758ProCod = "" ;
      A758ProCod = "" ;
      Z361DisCod = 0 ;
      A361DisCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nKeyPressed ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A7744FasPreObl ;
   private byte Gx_BScreen ;
   private byte Z7744FasPreObl ;
   private byte subGridentradapedidoclientefases_fases_Backcolorstyle ;
   private byte subGridentradapedidoclientefases_fases_Backstyle ;
   private byte subGridentradapedidoclientefases_fases_Allowselection ;
   private byte subGridentradapedidoclientefases_fases_Allowhovering ;
   private byte subGridentradapedidoclientefases_fases_Allowcollapsing ;
   private byte subGridentradapedidoclientefases_fases_Collapsed ;
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
   private int wcpOA361DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_39 ;
   private int nGXsfl_39_idx=1 ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDisCod_Visible ;
   private int edtDisCod_Enabled ;
   private int edtProCod_Visible ;
   private int edtProCod_Enabled ;
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
   private int A396EmprCod_Visible ;
   private int GX_JID ;
   private int subGridentradapedidoclientefases_fases_Backcolor ;
   private int subGridentradapedidoclientefases_fases_Allbackcolor ;
   private int defedtDisFasLin_Enabled ;
   private int idxLst ;
   private int subGridentradapedidoclientefases_fases_Selectedindex ;
   private int subGridentradapedidoclientefases_fases_Selectioncolor ;
   private int subGridentradapedidoclientefases_fases_Hoveringcolor ;
   private int ZZ361DisCod ;
   private long GRIDENTRADAPEDIDOCLIENTEFASES_FASES_nFirstRecordOnPage ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA758ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z3697FasApr ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sXEvt ;
   private String sGXsfl_39_idx="0001" ;
   private String Gx_mode ;
   private String divTablemain_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
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
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridentradapedidoclientefases_fases_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A4903FasAcab ;
   private String A4286FasForMul ;
   private String A3697FasApr ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A602MaqCod ;
   private String sMode38 ;
   private String Z460FasDsc ;
   private String Z4903FasAcab ;
   private String Z4286FasForMul ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String subGridentradapedidoclientefases_fases_Class ;
   private String subGridentradapedidoclientefases_fases_Linesclass ;
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
   private String sCtrlA396EmprCod ;
   private String sCtrlA361DisCod ;
   private String sCtrlA758ProCod ;
   private String subGridentradapedidoclientefases_fases_Header ;
   private String ZZ396EmprCod ;
   private String ZZ758ProCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean returnInSub ;
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
   private com.genexus.webpanels.GXWebGrid Gridentradapedidoclientefases_fasesContainer ;
   private com.genexus.webpanels.GXWebRow Gridentradapedidoclientefases_fasesRow ;
   private com.genexus.webpanels.GXWebColumn Gridentradapedidoclientefases_fasesColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private IDataStoreProvider pr_default ;
   private String[] T01PB7_A396EmprCod ;
   private String[] T01PB8_A396EmprCod ;
   private String[] T01PB9_A396EmprCod ;
   private int[] T01PB9_A361DisCod ;
   private String[] T01PB9_A758ProCod ;
   private String[] T01PB10_A396EmprCod ;
   private int[] T01PB10_A361DisCod ;
   private String[] T01PB10_A758ProCod ;
   private String[] T01PB6_A396EmprCod ;
   private int[] T01PB6_A361DisCod ;
   private String[] T01PB6_A758ProCod ;
   private String[] T01PB11_A396EmprCod ;
   private int[] T01PB11_A361DisCod ;
   private String[] T01PB11_A758ProCod ;
   private String[] T01PB12_A396EmprCod ;
   private int[] T01PB12_A361DisCod ;
   private String[] T01PB12_A758ProCod ;
   private String[] T01PB5_A396EmprCod ;
   private int[] T01PB5_A361DisCod ;
   private String[] T01PB5_A758ProCod ;
   private String[] T01PB15_A396EmprCod ;
   private int[] T01PB15_A361DisCod ;
   private String[] T01PB15_A758ProCod ;
   private short[] T01PB15_A368DisFasLin ;
   private short[] T01PB15_A1664ParFasCod ;
   private String[] T01PB16_A396EmprCod ;
   private int[] T01PB16_A361DisCod ;
   private String[] T01PB16_A758ProCod ;
   private int[] T01PB17_A361DisCod ;
   private String[] T01PB17_A758ProCod ;
   private short[] T01PB17_A368DisFasLin ;
   private String[] T01PB17_A460FasDsc ;
   private String[] T01PB17_A4903FasAcab ;
   private boolean[] T01PB17_n4903FasAcab ;
   private String[] T01PB17_A4286FasForMul ;
   private boolean[] T01PB17_n4286FasForMul ;
   private String[] T01PB17_A3697FasApr ;
   private String[] T01PB17_A456FasActTin ;
   private boolean[] T01PB17_n456FasActTin ;
   private String[] T01PB17_A458FasCon ;
   private boolean[] T01PB17_n458FasCon ;
   private short[] T01PB17_A464FasNumPas ;
   private boolean[] T01PB17_n464FasNumPas ;
   private java.math.BigDecimal[] T01PB17_A472FasVelPro ;
   private boolean[] T01PB17_n472FasVelPro ;
   private short[] T01PB17_A468FasPrePie ;
   private boolean[] T01PB17_n468FasPrePie ;
   private short[] T01PB17_A469FasPreSal ;
   private boolean[] T01PB17_n469FasPreSal ;
   private java.math.BigDecimal[] T01PB17_A459FasDec ;
   private boolean[] T01PB17_n459FasDec ;
   private String[] T01PB17_A9841DisFasObs ;
   private byte[] T01PB17_A7744FasPreObl ;
   private boolean[] T01PB17_n7744FasPreObl ;
   private String[] T01PB17_A396EmprCod ;
   private String[] T01PB17_A457FasCod ;
   private String[] T01PB17_A602MaqCod ;
   private boolean[] T01PB17_n602MaqCod ;
   private String[] T01PB4_A460FasDsc ;
   private String[] T01PB4_A4903FasAcab ;
   private boolean[] T01PB4_n4903FasAcab ;
   private String[] T01PB4_A4286FasForMul ;
   private boolean[] T01PB4_n4286FasForMul ;
   private String[] T01PB4_A456FasActTin ;
   private boolean[] T01PB4_n456FasActTin ;
   private String[] T01PB4_A458FasCon ;
   private boolean[] T01PB4_n458FasCon ;
   private short[] T01PB4_A464FasNumPas ;
   private boolean[] T01PB4_n464FasNumPas ;
   private java.math.BigDecimal[] T01PB4_A472FasVelPro ;
   private boolean[] T01PB4_n472FasVelPro ;
   private short[] T01PB4_A468FasPrePie ;
   private boolean[] T01PB4_n468FasPrePie ;
   private short[] T01PB4_A469FasPreSal ;
   private boolean[] T01PB4_n469FasPreSal ;
   private java.math.BigDecimal[] T01PB4_A459FasDec ;
   private boolean[] T01PB4_n459FasDec ;
   private byte[] T01PB4_A7744FasPreObl ;
   private boolean[] T01PB4_n7744FasPreObl ;
   private String[] T01PB4_A602MaqCod ;
   private boolean[] T01PB4_n602MaqCod ;
   private String[] T01PB18_A460FasDsc ;
   private String[] T01PB18_A4903FasAcab ;
   private boolean[] T01PB18_n4903FasAcab ;
   private String[] T01PB18_A4286FasForMul ;
   private boolean[] T01PB18_n4286FasForMul ;
   private String[] T01PB18_A456FasActTin ;
   private boolean[] T01PB18_n456FasActTin ;
   private String[] T01PB18_A458FasCon ;
   private boolean[] T01PB18_n458FasCon ;
   private short[] T01PB18_A464FasNumPas ;
   private boolean[] T01PB18_n464FasNumPas ;
   private java.math.BigDecimal[] T01PB18_A472FasVelPro ;
   private boolean[] T01PB18_n472FasVelPro ;
   private short[] T01PB18_A468FasPrePie ;
   private boolean[] T01PB18_n468FasPrePie ;
   private short[] T01PB18_A469FasPreSal ;
   private boolean[] T01PB18_n469FasPreSal ;
   private java.math.BigDecimal[] T01PB18_A459FasDec ;
   private boolean[] T01PB18_n459FasDec ;
   private byte[] T01PB18_A7744FasPreObl ;
   private boolean[] T01PB18_n7744FasPreObl ;
   private String[] T01PB18_A602MaqCod ;
   private boolean[] T01PB18_n602MaqCod ;
   private String[] T01PB19_A396EmprCod ;
   private int[] T01PB19_A361DisCod ;
   private String[] T01PB19_A758ProCod ;
   private short[] T01PB19_A368DisFasLin ;
   private int[] T01PB3_A361DisCod ;
   private String[] T01PB3_A758ProCod ;
   private short[] T01PB3_A368DisFasLin ;
   private String[] T01PB3_A3697FasApr ;
   private String[] T01PB3_A9841DisFasObs ;
   private String[] T01PB3_A396EmprCod ;
   private String[] T01PB3_A457FasCod ;
   private byte[] T01PB3_A7744FasPreObl ;
   private boolean[] T01PB3_n7744FasPreObl ;
   private int[] T01PB2_A361DisCod ;
   private String[] T01PB2_A758ProCod ;
   private short[] T01PB2_A368DisFasLin ;
   private String[] T01PB2_A3697FasApr ;
   private String[] T01PB2_A9841DisFasObs ;
   private String[] T01PB2_A396EmprCod ;
   private String[] T01PB2_A457FasCod ;
   private byte[] T01PB2_A7744FasPreObl ;
   private boolean[] T01PB2_n7744FasPreObl ;
   private String[] T01PB23_A460FasDsc ;
   private String[] T01PB23_A4903FasAcab ;
   private boolean[] T01PB23_n4903FasAcab ;
   private String[] T01PB23_A4286FasForMul ;
   private boolean[] T01PB23_n4286FasForMul ;
   private String[] T01PB23_A456FasActTin ;
   private boolean[] T01PB23_n456FasActTin ;
   private String[] T01PB23_A458FasCon ;
   private boolean[] T01PB23_n458FasCon ;
   private short[] T01PB23_A464FasNumPas ;
   private boolean[] T01PB23_n464FasNumPas ;
   private java.math.BigDecimal[] T01PB23_A472FasVelPro ;
   private boolean[] T01PB23_n472FasVelPro ;
   private short[] T01PB23_A468FasPrePie ;
   private boolean[] T01PB23_n468FasPrePie ;
   private short[] T01PB23_A469FasPreSal ;
   private boolean[] T01PB23_n469FasPreSal ;
   private java.math.BigDecimal[] T01PB23_A459FasDec ;
   private boolean[] T01PB23_n459FasDec ;
   private byte[] T01PB23_A7744FasPreObl ;
   private boolean[] T01PB23_n7744FasPreObl ;
   private String[] T01PB23_A602MaqCod ;
   private boolean[] T01PB23_n602MaqCod ;
   private String[] T01PB24_A396EmprCod ;
   private int[] T01PB24_A361DisCod ;
   private String[] T01PB24_A758ProCod ;
   private short[] T01PB24_A368DisFasLin ;
   private short[] T01PB24_A7919Dta_Ordl ;
   private String[] T01PB25_A396EmprCod ;
   private int[] T01PB25_A361DisCod ;
   private String[] T01PB25_A758ProCod ;
   private short[] T01PB25_A368DisFasLin ;
   private short[] T01PB25_A7727ArtAdiCod ;
   private String[] T01PB26_A396EmprCod ;
   private int[] T01PB26_A361DisCod ;
   private String[] T01PB26_A758ProCod ;
   private short[] T01PB26_A368DisFasLin ;
   private short[] T01PB26_A5377DisQuiLin ;
   private String[] T01PB27_A396EmprCod ;
   private int[] T01PB27_A361DisCod ;
   private String[] T01PB27_A758ProCod ;
   private short[] T01PB27_A368DisFasLin ;
   private int[] T01PB27_A5035A_Discod ;
   private String[] T01PB27_A5038A_DProcod ;
   private short[] T01PB27_A5039A_DOrdlin ;
   private String[] T01PB28_A396EmprCod ;
   private int[] T01PB28_A361DisCod ;
   private String[] T01PB28_A758ProCod ;
   private short[] T01PB28_A368DisFasLin ;
   private short[] T01PB28_A1664ParFasCod ;
   private String[] T01PB29_A396EmprCod ;
   private int[] T01PB29_A361DisCod ;
   private String[] T01PB29_A758ProCod ;
   private short[] T01PB29_A368DisFasLin ;
   private String[] T01PB30_A396EmprCod ;
   private String[] T01PB31_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
}

final  class entradapedidoclientefases__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradapedidoclientefases__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradapedidoclientefases__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class entradapedidoclientefases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01PB2", "SELECT DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasApr, DisFasObs, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB3", "SELECT DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB4", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB5", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB6", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB7", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB8", "SELECT EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB9", "SELECT /*+ FIRST_ROWS(1) */ TM1.EmprCod, TM1.DisCod, TM1.ProCod FROM TXPDISLIN TM1 WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01PB13", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("T01PB14", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01PB15", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB17", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T2.FasAcab, T2.FasForMul, T1.FasApr, T2.FasActTin, T2.FasCon, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec, T1.DisFasObs, T1.FasPreObl, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB18", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB19", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01PB20", "INSERT INTO TXPDISFAS(FasPreObl, DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01PB21", "UPDATE TXPDISFAS SET FasPreObl=?, FasApr=?, DisFasObs=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01PB22", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01PB23", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB24", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB25", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB26", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB27", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB28", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01PB29", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB30", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01PB31", "SELECT EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
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
            case 16 :
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
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
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
            case 22 :
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 29 :
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
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 18 :
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
            case 19 :
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
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

