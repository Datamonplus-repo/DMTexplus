package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpdetallepiezas_impl extends GXWebComponent
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
            Gx_mode = httpContext.GetPar( "Mode") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
            AV41EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41EmprCod", AV41EmprCod);
            AV32DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DisCod), 8, 0));
            AV9AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRecCod), 8, 0));
            setjustcreated();
            componentprepare(new Object[] {sCompPrefix,sSFPrefix,Gx_mode,AV41EmprCod,Integer.valueOf(AV32DisCod),Integer.valueOf(AV9AlbRecCod)});
            componentstart();
            httpContext.ajax_rspStartCmp(sPrefix);
            componentdraw();
            httpContext.ajax_rspEndCmp();
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxload_12( A396EmprCod, A361DisCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxload_11( A396EmprCod, A44AlbRecCod) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_detallepiezas") == 0 )
         {
            gxnrgridlevel_detallepiezas_newrow_invoke( ) ;
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Nw DPDetalle Piezas", ""), (short)(0)) ;
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
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void gxnrgridlevel_detallepiezas_newrow_invoke( )
   {
      nRC_GXsfl_23 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_23"))) ;
      nGXsfl_23_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_23_idx"))) ;
      sGXsfl_23_idx = httpContext.GetPar( "sGXsfl_23_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_detallepiezas_newrow( ) ;
      /* End function gxnrGridlevel_detallepiezas_newrow_invoke */
   }

   public nwdpdetallepiezas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpdetallepiezas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpdetallepiezas_impl.class ));
   }

   public nwdpdetallepiezas_impl( int remoteHandle ,
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
         renderHtmlCloseForm1P735( ) ;
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
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.nwdpdetallepiezas");
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      }
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransaction", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
      ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
      ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
      ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
      ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
      ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
      ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
      ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
      ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
      ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, sPrefix+"DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_detallepiezas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_detallepiezas( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPDetallePiezas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPDetallePiezas.htm");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", edtDisCod_Visible, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPDetallePiezas.htm");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbRecCod_Visible, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPDetallePiezas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_detallepiezas( )
   {
      /*  Grid Control  */
      startgridcontrol23( ) ;
      nGXsfl_23_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount36 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_36 = (short)(1) ;
            scanStart1P736( ) ;
            while ( RcdFound36 != 0 )
            {
               init_level_properties36( ) ;
               getByPrimaryKey1P736( ) ;
               addRow1P736( ) ;
               scanNext1P736( ) ;
            }
            scanEnd1P736( ) ;
            nBlankRcdCount36 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1P736( ) ;
         standaloneModal1P736( ) ;
         sMode36 = Gx_mode ;
         while ( nGXsfl_23_idx < nRC_GXsfl_23 )
         {
            bGXsfl_23_Refreshing = true ;
            readRow1P736( ) ;
            edtDisPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIECOD_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieCod_Enabled), 5, 0), !bGXsfl_23_Refreshing);
            edtDisPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEKIL_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieKil_Enabled), 5, 0), !bGXsfl_23_Refreshing);
            edtDisPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEMET_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMet_Enabled), 5, 0), !bGXsfl_23_Refreshing);
            edtDisPieLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIELOC_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieLoc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
            edtDisPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEANC_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieAnc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
            edtDisPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEEST_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieEst_Enabled), 5, 0), !bGXsfl_23_Refreshing);
            if ( ( nRcdExists_36 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               standaloneModal1P736( ) ;
            }
            sendRow1P736( ) ;
            bGXsfl_23_Refreshing = false ;
         }
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount36 = (short)(5) ;
         nRcdExists_36 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1P736( ) ;
            while ( RcdFound36 != 0 )
            {
               sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2336( ) ;
               init_level_properties36( ) ;
               standaloneNotModal1P736( ) ;
               getByPrimaryKey1P736( ) ;
               standaloneModal1P736( ) ;
               addRow1P736( ) ;
               scanNext1P736( ) ;
            }
            scanEnd1P736( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode36 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_2336( ) ;
         initAll1P736( ) ;
         init_level_properties36( ) ;
         nRcdExists_36 = (short)(0) ;
         nIsMod_36 = (short)(0) ;
         nRcdDeleted_36 = (short)(0) ;
         nBlankRcdCount36 = (short)(nBlankRcdUsr36+nBlankRcdCount36) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount36 > 0 )
         {
            standaloneNotModal1P736( ) ;
            standaloneModal1P736( ) ;
            addRow1P736( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDisPieCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount36 = (short)(nBlankRcdCount36-1) ;
         }
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+sPrefix+"Gridlevel_detallepiezasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridlevel_detallepiezas", Gridlevel_detallepiezasContainer, subGridlevel_detallepiezas_Internalname);
      if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridlevel_detallepiezasContainerData", Gridlevel_detallepiezasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridlevel_detallepiezasContainerData"+"V", Gridlevel_detallepiezasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridlevel_detallepiezasContainerData"+"V"+"\" value='"+Gridlevel_detallepiezasContainer.GridValuesHidden()+"'/>") ;
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
      e111P72 ();
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
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            wcpOGx_mode = httpContext.cgiGet( sPrefix+"wcpOGx_mode") ;
            wcpOAV41EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV41EmprCod") ;
            wcpOAV32DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            wcpOAV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( sPrefix+"Mode") ;
            nRC_GXsfl_23 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_23"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
            AV32DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEATTRIBUTES_Visible")) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A361DisCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            else
            {
               A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NwDPDetallePiezas");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( sPrefix+"hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("nwdpdetallepiezas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode35 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode35 ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound35 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P70( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
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
                              e111P72 ();
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
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
                              /* Execute user event: After Trn */
                              e121P72 ();
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
                              if ( ! isDsp( ) )
                              {
                                 btn_enter( ) ;
                              }
                           }
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
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
         /* Execute user event: After Trn */
         e121P72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P735( ) ;
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
      if ( isDsp( ) || isDlt( ) )
      {
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1P735( ) ;
      }
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
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

   public void confirm_1P70( )
   {
      beforeValidate1P735( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P735( ) ;
         }
         else
         {
            checkExtendedTable1P735( ) ;
            closeExtendedTableCursors1P735( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode35 = Gx_mode ;
         confirm_1P736( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode35 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1P736( )
   {
      nGXsfl_23_idx = 0 ;
      while ( nGXsfl_23_idx < nRC_GXsfl_23 )
      {
         readRow1P736( ) ;
         if ( ( nRcdExists_36 != 0 ) || ( nIsMod_36 != 0 ) )
         {
            getKey1P736( ) ;
            if ( ( nRcdExists_36 == 0 ) && ( nRcdDeleted_36 == 0 ) )
            {
               if ( RcdFound36 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                  beforeValidate1P736( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P736( ) ;
                     closeExtendedTableCursors1P736( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "DISPIECOD_" + sGXsfl_23_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisPieCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound36 != 0 )
               {
                  if ( nRcdDeleted_36 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1P736( ) ;
                     load1P736( ) ;
                     beforeValidate1P736( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P736( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_36 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        beforeValidate1P736( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P736( ) ;
                           closeExtendedTableCursors1P736( ) ;
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
                  if ( nRcdDeleted_36 == 0 )
                  {
                     GXCCtl = "DISPIECOD_" + sGXsfl_23_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( sPrefix+edtDisPieCod_Internalname, GXutil.rtrim( A380DisPieCod)) ;
         httpContext.changePostValue( sPrefix+edtDisPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A382DisPieKil, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtDisPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A384DisPieMet, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtDisPieLoc_Internalname, GXutil.rtrim( A2184DisPieLoc)) ;
         httpContext.changePostValue( sPrefix+edtDisPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A2185DisPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtDisPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A5099DisPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z380DisPieCod_"+sGXsfl_23_idx, GXutil.rtrim( Z380DisPieCod)) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z382DisPieKil_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z382DisPieKil, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z384DisPieMet_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z384DisPieMet, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z2184DisPieLoc_"+sGXsfl_23_idx, GXutil.rtrim( Z2184DisPieLoc)) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z2185DisPieAnc_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z2185DisPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z5099DisPieEst_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z5099DisPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdDeleted_36_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdExists_36_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nIsMod_36_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_36 != 0 )
         {
            httpContext.changePostValue( sPrefix+"DISPIECOD_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEKIL_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEMET_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIELOC_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEANC_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEEST_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1P70( )
   {
   }

   public void e111P72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV123Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpdetallepiezas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV123Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV123Station", AV123Station);
      GXv_char2[0] = AV41EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV134UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV123Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpdetallepiezas_impl.this.AV41EmprCod = GXv_char2[0] ;
      nwdpdetallepiezas_impl.this.AV42EmprNom = GXv_char3[0] ;
      nwdpdetallepiezas_impl.this.AV134UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41EmprCod", AV41EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42EmprNom", AV42EmprNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134UsurCod", AV134UsurCod);
      GXv_SdtWWPContext5[0] = AV138WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV138WWPContext = GXv_SdtWWPContext5[0] ;
      AV133TrnContext.fromxml(AV137WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtDisCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), true);
      edtAlbRecCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), true);
      bttBtntrn_enter_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
   }

   public void e121P72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1P735( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -10 )
      {
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z361DisCod = A361DisCod ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         A396EmprCod = AV41EmprCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV32DisCod) )
      {
         A361DisCod = AV32DisCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV32DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV32DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         A44AlbRecCod = AV9AlbRecCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9AlbRecCod) )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
   }

   public void load1P735( )
   {
      /* Using cursor T01P78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound35 = (short)(1) ;
         zm1P735( -10) ;
      }
      pr_default.close(6);
      onLoadActions1P735( ) ;
   }

   public void onLoadActions1P735( )
   {
   }

   public void checkExtendedTable1P735( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01P77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01P76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1P735( )
   {
      pr_default.close(5);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01P79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_11( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01P710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void getKey1P735( )
   {
      /* Using cursor T01P711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01P75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1P735( 10) ;
         RcdFound35 = (short)(1) ;
         A396EmprCod = T01P75_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = T01P75_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A361DisCod = T01P75_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         load1P735( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey1P735( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1P735( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1P735( ) ;
      if ( RcdFound35 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01P712 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01P712_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01P712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P712_A361DisCod[0] < A361DisCod ) || ( T01P712_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P712_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01P712_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01P712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P712_A361DisCod[0] > A361DisCod ) || ( T01P712_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P712_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P712_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            A396EmprCod = T01P712_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01P712_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A44AlbRecCod = T01P712_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T01P713 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01P713_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01P713_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P713_A361DisCod[0] > A361DisCod ) || ( T01P713_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P713_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P713_A44AlbRecCod[0] > A44AlbRecCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01P713_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01P713_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P713_A361DisCod[0] < A361DisCod ) || ( T01P713_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P713_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P713_A44AlbRecCod[0] < A44AlbRecCod ) ) )
         {
            A396EmprCod = T01P713_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01P713_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A44AlbRecCod = T01P713_A44AlbRecCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P735( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         insert1P735( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound35 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A44AlbRecCod = Z44AlbRecCod ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1P735( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               insert1P735( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  insert1P735( ) ;
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
      if ( isUpd( ) || isDlt( ) )
      {
         if ( ( AnyError == 0 ) && ( GXutil.len( sPrefix) == 0 ) )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = Z44AlbRecCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1P735( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P735( )
   {
      beforeValidate1P735( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P735( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P735( 0) ;
         checkOptimisticConcurrency1P735( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P735( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P735( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P714 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1P735( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1P70( ) ;
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
            load1P735( ) ;
         }
         endLevel1P735( ) ;
      }
      closeExtendedTableCursors1P735( ) ;
   }

   public void update1P735( )
   {
      beforeValidate1P735( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P735( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P735( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P735( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P735( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISALB */
                  deferredUpdate1P735( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P735( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isUpd( ) || isDlt( ) )
                           {
                              if ( ( AnyError == 0 ) && ( GXutil.len( sPrefix) == 0 ) )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         }
         endLevel1P735( ) ;
      }
      closeExtendedTableCursors1P735( ) ;
   }

   public void deferredUpdate1P735( )
   {
   }

   public void delete( )
   {
      beforeValidate1P735( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P735( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P735( ) ;
         afterConfirm1P735( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P735( ) ;
            if ( AnyError == 0 )
            {
               scanStart1P736( ) ;
               while ( RcdFound36 != 0 )
               {
                  getByPrimaryKey1P736( ) ;
                  delete1P736( ) ;
                  scanNext1P736( ) ;
               }
               scanEnd1P736( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P715 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( ( AnyError == 0 ) && ( GXutil.len( sPrefix) == 0 ) )
                           {
                              httpContext.nUserReturn = (byte)(1) ;
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
         }
      }
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      endLevel1P735( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P735( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01P716 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIOUT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void processNestedLevel1P736( )
   {
      nGXsfl_23_idx = 0 ;
      while ( nGXsfl_23_idx < nRC_GXsfl_23 )
      {
         readRow1P736( ) ;
         if ( ( nRcdExists_36 != 0 ) || ( nIsMod_36 != 0 ) )
         {
            standaloneNotModal1P736( ) ;
            getKey1P736( ) ;
            if ( ( nRcdExists_36 == 0 ) && ( nRcdDeleted_36 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               insert1P736( ) ;
            }
            else
            {
               if ( RcdFound36 != 0 )
               {
                  if ( ( nRcdDeleted_36 != 0 ) && ( nRcdExists_36 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                     delete1P736( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_36 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        update1P736( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_36 == 0 )
                  {
                     GXCCtl = "DISPIECOD_" + sGXsfl_23_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisPieCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( sPrefix+edtDisPieCod_Internalname, GXutil.rtrim( A380DisPieCod)) ;
         httpContext.changePostValue( sPrefix+edtDisPieKil_Internalname, GXutil.ltrim( localUtil.ntoc( A382DisPieKil, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtDisPieMet_Internalname, GXutil.ltrim( localUtil.ntoc( A384DisPieMet, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtDisPieLoc_Internalname, GXutil.rtrim( A2184DisPieLoc)) ;
         httpContext.changePostValue( sPrefix+edtDisPieAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A2185DisPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtDisPieEst_Internalname, GXutil.ltrim( localUtil.ntoc( A5099DisPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z380DisPieCod_"+sGXsfl_23_idx, GXutil.rtrim( Z380DisPieCod)) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z382DisPieKil_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z382DisPieKil, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z384DisPieMet_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z384DisPieMet, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z2184DisPieLoc_"+sGXsfl_23_idx, GXutil.rtrim( Z2184DisPieLoc)) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z2185DisPieAnc_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z2185DisPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z5099DisPieEst_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( Z5099DisPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdDeleted_36_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdExists_36_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nIsMod_36_"+sGXsfl_23_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_36 != 0 )
         {
            httpContext.changePostValue( sPrefix+"DISPIECOD_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEKIL_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEMET_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIELOC_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieLoc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEANC_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"DISPIEEST_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1P736( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_36 = (short)(0) ;
      nIsMod_36 = (short)(0) ;
      nRcdDeleted_36 = (short)(0) ;
   }

   public void processLevel1P735( )
   {
      /* Save parent mode. */
      sMode35 = Gx_mode ;
      processNestedLevel1P736( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1P735( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1P735( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "nwdpdetallepiezas");
         if ( AnyError == 0 )
         {
            confirmValues1P70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "nwdpdetallepiezas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P735( )
   {
      /* Scan By routine */
      /* Using cursor T01P717 */
      pr_default.execute(15);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A396EmprCod = T01P717_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P717_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = T01P717_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P735( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A396EmprCod = T01P717_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P717_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A44AlbRecCod = T01P717_A44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
   }

   public void scanEnd1P735( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1P735( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P735( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P735( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P735( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P735( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P735( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P735( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
   }

   public void zm1P736( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z382DisPieKil = T01P73_A382DisPieKil[0] ;
            Z384DisPieMet = T01P73_A384DisPieMet[0] ;
            Z2184DisPieLoc = T01P73_A2184DisPieLoc[0] ;
            Z2185DisPieAnc = T01P73_A2185DisPieAnc[0] ;
            Z5099DisPieEst = T01P73_A5099DisPieEst[0] ;
         }
         else
         {
            Z382DisPieKil = A382DisPieKil ;
            Z384DisPieMet = A384DisPieMet ;
            Z2184DisPieLoc = A2184DisPieLoc ;
            Z2185DisPieAnc = A2185DisPieAnc ;
            Z5099DisPieEst = A5099DisPieEst ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z380DisPieCod = A380DisPieCod ;
         Z382DisPieKil = A382DisPieKil ;
         Z384DisPieMet = A384DisPieMet ;
         Z2184DisPieLoc = A2184DisPieLoc ;
         Z2185DisPieAnc = A2185DisPieAnc ;
         Z5099DisPieEst = A5099DisPieEst ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1P736( )
   {
   }

   public void standaloneModal1P736( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisPieCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieCod_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      }
      else
      {
         edtDisPieCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieCod_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      }
   }

   public void load1P736( )
   {
      /* Using cursor T01P718 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A382DisPieKil = T01P718_A382DisPieKil[0] ;
         A384DisPieMet = T01P718_A384DisPieMet[0] ;
         A2184DisPieLoc = T01P718_A2184DisPieLoc[0] ;
         A2185DisPieAnc = T01P718_A2185DisPieAnc[0] ;
         A5099DisPieEst = T01P718_A5099DisPieEst[0] ;
         zm1P736( -13) ;
      }
      pr_default.close(16);
      onLoadActions1P736( ) ;
   }

   public void onLoadActions1P736( )
   {
   }

   public void checkExtendedTable1P736( )
   {
      nIsDirty_36 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1P736( ) ;
   }

   public void closeExtendedTableCursors1P736( )
   {
   }

   public void enableDisable1P736( )
   {
   }

   public void getKey1P736( )
   {
      /* Using cursor T01P719 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound36 = (short)(1) ;
      }
      else
      {
         RcdFound36 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey1P736( )
   {
      /* Using cursor T01P73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1P736( 13) ;
         RcdFound36 = (short)(1) ;
         initializeNonKey1P736( ) ;
         A380DisPieCod = T01P73_A380DisPieCod[0] ;
         A382DisPieKil = T01P73_A382DisPieKil[0] ;
         A384DisPieMet = T01P73_A384DisPieMet[0] ;
         A2184DisPieLoc = T01P73_A2184DisPieLoc[0] ;
         A2185DisPieAnc = T01P73_A2185DisPieAnc[0] ;
         A5099DisPieEst = T01P73_A5099DisPieEst[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z380DisPieCod = A380DisPieCod ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         load1P736( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound36 = (short)(0) ;
         initializeNonKey1P736( ) ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal1P736( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P736( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1P736( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z382DisPieKil, T01P72_A382DisPieKil[0]) != 0 ) || ( DecimalUtil.compareTo(Z384DisPieMet, T01P72_A384DisPieMet[0]) != 0 ) || ( GXutil.strcmp(Z2184DisPieLoc, T01P72_A2184DisPieLoc[0]) != 0 ) || ( Z2185DisPieAnc != T01P72_A2185DisPieAnc[0] ) || ( Z5099DisPieEst != T01P72_A5099DisPieEst[0] ) )
         {
            if ( DecimalUtil.compareTo(Z382DisPieKil, T01P72_A382DisPieKil[0]) != 0 )
            {
               GXutil.writeLogln("nwdpdetallepiezas:[seudo value changed for attri]"+"DisPieKil");
               GXutil.writeLogRaw("Old: ",Z382DisPieKil);
               GXutil.writeLogRaw("Current: ",T01P72_A382DisPieKil[0]);
            }
            if ( DecimalUtil.compareTo(Z384DisPieMet, T01P72_A384DisPieMet[0]) != 0 )
            {
               GXutil.writeLogln("nwdpdetallepiezas:[seudo value changed for attri]"+"DisPieMet");
               GXutil.writeLogRaw("Old: ",Z384DisPieMet);
               GXutil.writeLogRaw("Current: ",T01P72_A384DisPieMet[0]);
            }
            if ( GXutil.strcmp(Z2184DisPieLoc, T01P72_A2184DisPieLoc[0]) != 0 )
            {
               GXutil.writeLogln("nwdpdetallepiezas:[seudo value changed for attri]"+"DisPieLoc");
               GXutil.writeLogRaw("Old: ",Z2184DisPieLoc);
               GXutil.writeLogRaw("Current: ",T01P72_A2184DisPieLoc[0]);
            }
            if ( Z2185DisPieAnc != T01P72_A2185DisPieAnc[0] )
            {
               GXutil.writeLogln("nwdpdetallepiezas:[seudo value changed for attri]"+"DisPieAnc");
               GXutil.writeLogRaw("Old: ",Z2185DisPieAnc);
               GXutil.writeLogRaw("Current: ",T01P72_A2185DisPieAnc[0]);
            }
            if ( Z5099DisPieEst != T01P72_A5099DisPieEst[0] )
            {
               GXutil.writeLogln("nwdpdetallepiezas:[seudo value changed for attri]"+"DisPieEst");
               GXutil.writeLogRaw("Old: ",Z5099DisPieEst);
               GXutil.writeLogRaw("Current: ",T01P72_A5099DisPieEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P736( )
   {
      beforeValidate1P736( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P736( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P736( 0) ;
         checkOptimisticConcurrency1P736( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P736( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P736( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P720 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod, A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
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
            load1P736( ) ;
         }
         endLevel1P736( ) ;
      }
      closeExtendedTableCursors1P736( ) ;
   }

   public void update1P736( )
   {
      beforeValidate1P736( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P736( ) ;
      }
      if ( ( nIsMod_36 != 0 ) || ( nIsDirty_36 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1P736( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1P736( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1P736( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01P721 */
                     pr_default.execute(19, new Object[] {A382DisPieKil, A384DisPieMet, A2184DisPieLoc, Short.valueOf(A2185DisPieAnc), Byte.valueOf(A5099DisPieEst), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1P736( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1P736( ) ;
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
            endLevel1P736( ) ;
         }
      }
      closeExtendedTableCursors1P736( ) ;
   }

   public void deferredUpdate1P736( )
   {
   }

   public void delete1P736( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      beforeValidate1P736( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P736( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P736( ) ;
         afterConfirm1P736( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P736( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01P722 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod), A380DisPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALD");
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
      sMode36 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      endLevel1P736( ) ;
      Gx_mode = sMode36 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P736( )
   {
      standaloneModal1P736( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1P736( )
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

   public void scanStart1P736( )
   {
      /* Scan By routine */
      /* Using cursor T01P723 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A380DisPieCod = T01P723_A380DisPieCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P736( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A380DisPieCod = T01P723_A380DisPieCod[0] ;
      }
   }

   public void scanEnd1P736( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1P736( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P736( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P736( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P736( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P736( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P736( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P736( )
   {
      edtDisPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieCod_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtDisPieKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieKil_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtDisPieMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieMet_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtDisPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieLoc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtDisPieAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieAnc_Enabled), 5, 0), !bGXsfl_23_Refreshing);
      edtDisPieEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieEst_Enabled), 5, 0), !bGXsfl_23_Refreshing);
   }

   public void send_integrity_lvl_hashes1P736( )
   {
   }

   public void send_integrity_lvl_hashes1P735( )
   {
   }

   public void subsflControlProps_2336( )
   {
      edtDisPieCod_Internalname = sPrefix+"DISPIECOD_"+sGXsfl_23_idx ;
      edtDisPieKil_Internalname = sPrefix+"DISPIEKIL_"+sGXsfl_23_idx ;
      edtDisPieMet_Internalname = sPrefix+"DISPIEMET_"+sGXsfl_23_idx ;
      edtDisPieLoc_Internalname = sPrefix+"DISPIELOC_"+sGXsfl_23_idx ;
      edtDisPieAnc_Internalname = sPrefix+"DISPIEANC_"+sGXsfl_23_idx ;
      edtDisPieEst_Internalname = sPrefix+"DISPIEEST_"+sGXsfl_23_idx ;
   }

   public void subsflControlProps_fel_2336( )
   {
      edtDisPieCod_Internalname = sPrefix+"DISPIECOD_"+sGXsfl_23_fel_idx ;
      edtDisPieKil_Internalname = sPrefix+"DISPIEKIL_"+sGXsfl_23_fel_idx ;
      edtDisPieMet_Internalname = sPrefix+"DISPIEMET_"+sGXsfl_23_fel_idx ;
      edtDisPieLoc_Internalname = sPrefix+"DISPIELOC_"+sGXsfl_23_fel_idx ;
      edtDisPieAnc_Internalname = sPrefix+"DISPIEANC_"+sGXsfl_23_fel_idx ;
      edtDisPieEst_Internalname = sPrefix+"DISPIEEST_"+sGXsfl_23_fel_idx ;
   }

   public void addRow1P736( )
   {
      nGXsfl_23_idx = (int)(nGXsfl_23_idx+1) ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2336( ) ;
      sendRow1P736( ) ;
   }

   public void sendRow1P736( )
   {
      Gridlevel_detallepiezasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_detallepiezas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_detallepiezas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_detallepiezas_Class, "") != 0 )
         {
            subGridlevel_detallepiezas_Linesclass = subGridlevel_detallepiezas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_detallepiezas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_detallepiezas_Backstyle = (byte)(0) ;
         subGridlevel_detallepiezas_Backcolor = subGridlevel_detallepiezas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_detallepiezas_Class, "") != 0 )
         {
            subGridlevel_detallepiezas_Linesclass = subGridlevel_detallepiezas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_detallepiezas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_detallepiezas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_detallepiezas_Class, "") != 0 )
         {
            subGridlevel_detallepiezas_Linesclass = subGridlevel_detallepiezas_Class+"Odd" ;
         }
         subGridlevel_detallepiezas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_detallepiezas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_detallepiezas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_23_idx) % (2))) == 0 )
         {
            subGridlevel_detallepiezas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_detallepiezas_Class, "") != 0 )
            {
               subGridlevel_detallepiezas_Linesclass = subGridlevel_detallepiezas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_detallepiezas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_detallepiezas_Class, "") != 0 )
            {
               subGridlevel_detallepiezas_Linesclass = subGridlevel_detallepiezas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_23_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 24,'" + sPrefix + "',false,'" + sGXsfl_23_idx + "',23)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_detallepiezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieCod_Internalname,GXutil.rtrim( A380DisPieCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,24);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisPieCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_23_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 25,'" + sPrefix + "',false,'" + sGXsfl_23_idx + "',23)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_detallepiezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A382DisPieKil, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisPieKil_Enabled!=0) ? localUtil.format( A382DisPieKil, "ZZZ9.99") : localUtil.format( A382DisPieKil, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,25);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisPieKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_23_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 26,'" + sPrefix + "',false,'" + sGXsfl_23_idx + "',23)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_detallepiezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A384DisPieMet, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisPieMet_Enabled!=0) ? localUtil.format( A384DisPieMet, "ZZZ9.99") : localUtil.format( A384DisPieMet, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,26);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisPieMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_23_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'" + sGXsfl_23_idx + "',23)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_detallepiezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieLoc_Internalname,GXutil.rtrim( A2184DisPieLoc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisPieLoc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_23_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_23_idx + "',23)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_detallepiezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A2185DisPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisPieAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2185DisPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2185DisPieAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisPieAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_36_" + sGXsfl_23_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'" + sGXsfl_23_idx + "',23)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_detallepiezasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A5099DisPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDisPieEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5099DisPieEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A5099DisPieEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDisPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisPieEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(23),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_detallepiezasRow);
      send_integrity_lvl_hashes1P736( ) ;
      GXCCtl = "Z380DisPieCod_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Z380DisPieCod));
      GXCCtl = "Z382DisPieKil_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z382DisPieKil, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z384DisPieMet_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z384DisPieMet, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2184DisPieLoc_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Z2184DisPieLoc));
      GXCCtl = "Z2185DisPieAnc_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2185DisPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5099DisPieEst_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5099DisPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_36_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_36_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_36_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_36, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( AV41EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBRECCOD_" + sGXsfl_23_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( AV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISPIECOD_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISPIEKIL_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISPIEMET_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISPIELOC_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISPIEANC_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DISPIEEST_"+sGXsfl_23_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_detallepiezasContainer.AddRow(Gridlevel_detallepiezasRow);
   }

   public void readRow1P736( )
   {
      nGXsfl_23_idx = (int)(nGXsfl_23_idx+1) ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2336( ) ;
      edtDisPieCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIECOD_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisPieKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEKIL_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisPieMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEMET_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisPieLoc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIELOC_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisPieAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEANC_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisPieEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"DISPIEEST_"+sGXsfl_23_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A380DisPieCod = httpContext.cgiGet( edtDisPieCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPieKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPieKil_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "DISPIEKIL_" + sGXsfl_23_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisPieKil_Internalname ;
         wbErr = true ;
         A382DisPieKil = DecimalUtil.ZERO ;
      }
      else
      {
         A382DisPieKil = localUtil.ctond( httpContext.cgiGet( edtDisPieKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPieMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPieMet_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
      {
         GXCCtl = "DISPIEMET_" + sGXsfl_23_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisPieMet_Internalname ;
         wbErr = true ;
         A384DisPieMet = DecimalUtil.ZERO ;
      }
      else
      {
         A384DisPieMet = localUtil.ctond( httpContext.cgiGet( edtDisPieMet_Internalname)) ;
      }
      A2184DisPieLoc = httpContext.cgiGet( edtDisPieLoc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "DISPIEANC_" + sGXsfl_23_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisPieAnc_Internalname ;
         wbErr = true ;
         A2185DisPieAnc = (short)(0) ;
      }
      else
      {
         A2185DisPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtDisPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "DISPIEEST_" + sGXsfl_23_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisPieEst_Internalname ;
         wbErr = true ;
         A5099DisPieEst = (byte)(0) ;
      }
      else
      {
         A5099DisPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z380DisPieCod_" + sGXsfl_23_idx ;
      Z380DisPieCod = httpContext.cgiGet( sPrefix+GXCCtl) ;
      GXCCtl = "Z382DisPieKil_" + sGXsfl_23_idx ;
      Z382DisPieKil = localUtil.ctond( httpContext.cgiGet( sPrefix+GXCCtl)) ;
      GXCCtl = "Z384DisPieMet_" + sGXsfl_23_idx ;
      Z384DisPieMet = localUtil.ctond( httpContext.cgiGet( sPrefix+GXCCtl)) ;
      GXCCtl = "Z2184DisPieLoc_" + sGXsfl_23_idx ;
      Z2184DisPieLoc = httpContext.cgiGet( sPrefix+GXCCtl) ;
      GXCCtl = "Z2185DisPieAnc_" + sGXsfl_23_idx ;
      Z2185DisPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5099DisPieEst_" + sGXsfl_23_idx ;
      Z5099DisPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_36_" + sGXsfl_23_idx ;
      nRcdDeleted_36 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_36_" + sGXsfl_23_idx ;
      nRcdExists_36 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_36_" + sGXsfl_23_idx ;
      nIsMod_36 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisPieCod_Enabled = edtDisPieCod_Enabled ;
   }

   public void confirmValues1P70( )
   {
      nGXsfl_23_idx = 0 ;
      sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2336( ) ;
      while ( nGXsfl_23_idx < nRC_GXsfl_23 )
      {
         nGXsfl_23_idx = (int)(nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2336( ) ;
         httpContext.changePostValue( sPrefix+"Z380DisPieCod_"+sGXsfl_23_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z380DisPieCod_"+sGXsfl_23_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z380DisPieCod_"+sGXsfl_23_idx) ;
         httpContext.changePostValue( sPrefix+"Z382DisPieKil_"+sGXsfl_23_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z382DisPieKil_"+sGXsfl_23_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z382DisPieKil_"+sGXsfl_23_idx) ;
         httpContext.changePostValue( sPrefix+"Z384DisPieMet_"+sGXsfl_23_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z384DisPieMet_"+sGXsfl_23_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z384DisPieMet_"+sGXsfl_23_idx) ;
         httpContext.changePostValue( sPrefix+"Z2184DisPieLoc_"+sGXsfl_23_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z2184DisPieLoc_"+sGXsfl_23_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z2184DisPieLoc_"+sGXsfl_23_idx) ;
         httpContext.changePostValue( sPrefix+"Z2185DisPieAnc_"+sGXsfl_23_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z2185DisPieAnc_"+sGXsfl_23_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z2185DisPieAnc_"+sGXsfl_23_idx) ;
         httpContext.changePostValue( sPrefix+"Z5099DisPieEst_"+sGXsfl_23_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z5099DisPieEst_"+sGXsfl_23_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z5099DisPieEst_"+sGXsfl_23_idx) ;
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
         httpContext.writeValue( httpContext.getMessage( "Nw DPDetalle Piezas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpdetallepiezas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRecCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod","AlbRecCod"}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NwDPDetallePiezas");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("nwdpdetallepiezas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOGx_mode", GXutil.rtrim( wcpOGx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41EmprCod", GXutil.rtrim( wcpOAV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32DisCod", GXutil.ltrim( localUtil.ntoc( wcpOAV32DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9AlbRecCod", GXutil.ltrim( localUtil.ntoc( wcpOAV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_23", GXutil.ltrim( localUtil.ntoc( nGXsfl_23_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISCOD", GXutil.ltrim( localUtil.ntoc( AV32DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
   }

   public void renderHtmlCloseForm1P735( )
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
      return "NwDPDetallePiezas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nw DPDetalle Piezas", "") ;
   }

   public void initializeNonKey1P735( )
   {
   }

   public void initAll1P735( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      initializeNonKey1P735( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1P736( )
   {
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      A2185DisPieAnc = (short)(0) ;
      A5099DisPieEst = (byte)(0) ;
      Z382DisPieKil = DecimalUtil.ZERO ;
      Z384DisPieMet = DecimalUtil.ZERO ;
      Z2184DisPieLoc = "" ;
      Z2185DisPieAnc = (short)(0) ;
      Z5099DisPieEst = (byte)(0) ;
   }

   public void initAll1P736( )
   {
      A380DisPieCod = "" ;
      initializeNonKey1P736( ) ;
   }

   public void standaloneModalInsert1P736( )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlGx_mode = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV41EmprCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV32DisCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV9AlbRecCod = (String)getParm(obj,3,TypeConstants.STRING) ;
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
      httpContext.AddComponentObject(sPrefix, "nwdpdetallepiezas", GetJustCreated( ));
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
         Gx_mode = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         AV41EmprCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41EmprCod", AV41EmprCod);
         AV32DisCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DisCod), 8, 0));
         AV9AlbRecCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRecCod), 8, 0));
      }
      wcpOGx_mode = httpContext.cgiGet( sPrefix+"wcpOGx_mode") ;
      wcpOAV41EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV41EmprCod") ;
      wcpOAV32DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(Gx_mode, wcpOGx_mode) != 0 ) || ( GXutil.strcmp(AV41EmprCod, wcpOAV41EmprCod) != 0 ) || ( AV32DisCod != wcpOAV32DisCod ) || ( AV9AlbRecCod != wcpOAV9AlbRecCod ) ) )
      {
         setjustcreated();
      }
      wcpOGx_mode = Gx_mode ;
      wcpOAV41EmprCod = AV41EmprCod ;
      wcpOAV32DisCod = AV32DisCod ;
      wcpOAV9AlbRecCod = AV9AlbRecCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlGx_mode = httpContext.cgiGet( sPrefix+"Gx_mode_CTRL") ;
      if ( GXutil.len( sCtrlGx_mode) > 0 )
      {
         Gx_mode = httpContext.cgiGet( sCtrlGx_mode) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = httpContext.cgiGet( sPrefix+"Gx_mode_PARM") ;
      }
      sCtrlAV41EmprCod = httpContext.cgiGet( sPrefix+"AV41EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV41EmprCod) > 0 )
      {
         AV41EmprCod = httpContext.cgiGet( sCtrlAV41EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41EmprCod", AV41EmprCod);
      }
      else
      {
         AV41EmprCod = httpContext.cgiGet( sPrefix+"AV41EmprCod_PARM") ;
      }
      sCtrlAV32DisCod = httpContext.cgiGet( sPrefix+"AV32DisCod_CTRL") ;
      if ( GXutil.len( sCtrlAV32DisCod) > 0 )
      {
         AV32DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32DisCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DisCod), 8, 0));
      }
      else
      {
         AV32DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32DisCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9AlbRecCod = httpContext.cgiGet( sPrefix+"AV9AlbRecCod_CTRL") ;
      if ( GXutil.len( sCtrlAV9AlbRecCod) > 0 )
      {
         AV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9AlbRecCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRecCod), 8, 0));
      }
      else
      {
         AV9AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9AlbRecCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gx_mode_PARM", GXutil.rtrim( Gx_mode));
      if ( GXutil.len( GXutil.rtrim( sCtrlGx_mode)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gx_mode_CTRL", GXutil.rtrim( sCtrlGx_mode));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41EmprCod_PARM", GXutil.rtrim( AV41EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41EmprCod_CTRL", GXutil.rtrim( sCtrlAV41EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32DisCod_PARM", GXutil.ltrim( localUtil.ntoc( AV32DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32DisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32DisCod_CTRL", GXutil.rtrim( sCtrlAV32DisCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AlbRecCod_PARM", GXutil.ltrim( localUtil.ntoc( AV9AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9AlbRecCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AlbRecCod_CTRL", GXutil.rtrim( sCtrlAV9AlbRecCod));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211557418", true, true);
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
      httpContext.AddJavascriptSource("nwdpdetallepiezas.js", "?20268211557418", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties36( )
   {
      edtDisPieCod_Enabled = defedtDisPieCod_Enabled ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPieCod_Enabled), 5, 0), !bGXsfl_23_Refreshing);
   }

   public void startgridcontrol23( )
   {
      Gridlevel_detallepiezasContainer.AddObjectProperty("GridName", "Gridlevel_detallepiezas");
      Gridlevel_detallepiezasContainer.AddObjectProperty("Header", subGridlevel_detallepiezas_Header);
      Gridlevel_detallepiezasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_detallepiezasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridlevel_detallepiezasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_detallepiezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_detallepiezasColumn.AddObjectProperty("Value", GXutil.rtrim( A380DisPieCod));
      Gridlevel_detallepiezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddColumnProperties(Gridlevel_detallepiezasColumn);
      Gridlevel_detallepiezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_detallepiezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A382DisPieKil, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_detallepiezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddColumnProperties(Gridlevel_detallepiezasColumn);
      Gridlevel_detallepiezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_detallepiezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A384DisPieMet, (byte)(7), (byte)(2), ".", "")));
      Gridlevel_detallepiezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddColumnProperties(Gridlevel_detallepiezasColumn);
      Gridlevel_detallepiezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_detallepiezasColumn.AddObjectProperty("Value", GXutil.rtrim( A2184DisPieLoc));
      Gridlevel_detallepiezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieLoc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddColumnProperties(Gridlevel_detallepiezasColumn);
      Gridlevel_detallepiezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_detallepiezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2185DisPieAnc, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_detallepiezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddColumnProperties(Gridlevel_detallepiezasColumn);
      Gridlevel_detallepiezasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_detallepiezasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5099DisPieEst, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_detallepiezasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisPieEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddColumnProperties(Gridlevel_detallepiezasColumn);
      Gridlevel_detallepiezasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_detallepiezasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_detallepiezas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      divTableattributes_Internalname = sPrefix+"TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = sPrefix+"DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtDisPieCod_Internalname = sPrefix+"DISPIECOD" ;
      edtDisPieKil_Internalname = sPrefix+"DISPIEKIL" ;
      edtDisPieMet_Internalname = sPrefix+"DISPIEMET" ;
      edtDisPieLoc_Internalname = sPrefix+"DISPIELOC" ;
      edtDisPieAnc_Internalname = sPrefix+"DISPIEANC" ;
      edtDisPieEst_Internalname = sPrefix+"DISPIEEST" ;
      divTableleaflevel_detallepiezas_Internalname = sPrefix+"TABLELEAFLEVEL_DETALLEPIEZAS" ;
      bttBtntrn_enter_Internalname = sPrefix+"BTNTRN_ENTER" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridlevel_detallepiezas_Internalname = sPrefix+"GRIDLEVEL_DETALLEPIEZAS" ;
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
      subGridlevel_detallepiezas_Allowcollapsing = (byte)(0) ;
      subGridlevel_detallepiezas_Allowselection = (byte)(0) ;
      subGridlevel_detallepiezas_Header = "" ;
      edtDisPieEst_Jsonclick = "" ;
      edtDisPieAnc_Jsonclick = "" ;
      edtDisPieLoc_Jsonclick = "" ;
      edtDisPieMet_Jsonclick = "" ;
      edtDisPieKil_Jsonclick = "" ;
      edtDisPieCod_Jsonclick = "" ;
      subGridlevel_detallepiezas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_detallepiezas_Backcolorstyle = (byte)(0) ;
      edtDisPieEst_Enabled = 1 ;
      edtDisPieAnc_Enabled = 1 ;
      edtDisPieLoc_Enabled = 1 ;
      edtDisPieMet_Enabled = 1 ;
      edtDisPieKil_Enabled = 1 ;
      edtDisPieCod_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      edtAlbRecCod_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
      edtDisCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "Piezas", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
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

   public void gxnrgridlevel_detallepiezas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      subsflControlProps_2336( ) ;
      while ( nGXsfl_23_idx <= nRC_GXsfl_23 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1P736( ) ;
         standaloneModal1P736( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1P736( ) ;
         nGXsfl_23_idx = (int)(nGXsfl_23_idx+1) ;
         sGXsfl_23_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_23_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2336( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_detallepiezasContainer)) ;
      /* End function gxnrGridlevel_detallepiezas_newrow */
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
      /* Using cursor T01P724 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Albreccod( )
   {
      /* Using cursor T01P725 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'componentprocess',iparms:[{postForm:true},{sPrefix:true},{sSFPrefix:true},{sCompEvt:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV9AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121P72',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_DISPIECOD","{handler:'valid_Dispiecod',iparms:[]");
      setEventMetadata("VALID_DISPIECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dispieest',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV41EmprCod = "" ;
      Z396EmprCod = "" ;
      Z380DisPieCod = "" ;
      Z382DisPieKil = DecimalUtil.ZERO ;
      Z384DisPieMet = DecimalUtil.ZERO ;
      Z2184DisPieLoc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV41EmprCod = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sXEvt = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      Gridlevel_detallepiezasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode36 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode35 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A380DisPieCod = "" ;
      A382DisPieKil = DecimalUtil.ZERO ;
      A384DisPieMet = DecimalUtil.ZERO ;
      A2184DisPieLoc = "" ;
      AV123Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV42EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV134UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV138WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV133TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV137WebSession = httpContext.getWebSession();
      T01P78_A396EmprCod = new String[] {""} ;
      T01P78_A44AlbRecCod = new int[1] ;
      T01P78_A361DisCod = new int[1] ;
      T01P77_A396EmprCod = new String[] {""} ;
      T01P76_A396EmprCod = new String[] {""} ;
      T01P79_A396EmprCod = new String[] {""} ;
      T01P710_A396EmprCod = new String[] {""} ;
      T01P711_A396EmprCod = new String[] {""} ;
      T01P711_A361DisCod = new int[1] ;
      T01P711_A44AlbRecCod = new int[1] ;
      T01P75_A396EmprCod = new String[] {""} ;
      T01P75_A44AlbRecCod = new int[1] ;
      T01P75_A361DisCod = new int[1] ;
      T01P712_A396EmprCod = new String[] {""} ;
      T01P712_A361DisCod = new int[1] ;
      T01P712_A44AlbRecCod = new int[1] ;
      T01P713_A396EmprCod = new String[] {""} ;
      T01P713_A361DisCod = new int[1] ;
      T01P713_A44AlbRecCod = new int[1] ;
      T01P74_A396EmprCod = new String[] {""} ;
      T01P74_A44AlbRecCod = new int[1] ;
      T01P74_A361DisCod = new int[1] ;
      T01P716_A396EmprCod = new String[] {""} ;
      T01P716_A361DisCod = new int[1] ;
      T01P716_A44AlbRecCod = new int[1] ;
      T01P716_A9756Dis_CUb = new String[] {""} ;
      T01P717_A396EmprCod = new String[] {""} ;
      T01P717_A361DisCod = new int[1] ;
      T01P717_A44AlbRecCod = new int[1] ;
      T01P718_A361DisCod = new int[1] ;
      T01P718_A44AlbRecCod = new int[1] ;
      T01P718_A380DisPieCod = new String[] {""} ;
      T01P718_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P718_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P718_A2184DisPieLoc = new String[] {""} ;
      T01P718_A2185DisPieAnc = new short[1] ;
      T01P718_A5099DisPieEst = new byte[1] ;
      T01P718_A396EmprCod = new String[] {""} ;
      T01P719_A396EmprCod = new String[] {""} ;
      T01P719_A361DisCod = new int[1] ;
      T01P719_A44AlbRecCod = new int[1] ;
      T01P719_A380DisPieCod = new String[] {""} ;
      T01P73_A361DisCod = new int[1] ;
      T01P73_A44AlbRecCod = new int[1] ;
      T01P73_A380DisPieCod = new String[] {""} ;
      T01P73_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P73_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P73_A2184DisPieLoc = new String[] {""} ;
      T01P73_A2185DisPieAnc = new short[1] ;
      T01P73_A5099DisPieEst = new byte[1] ;
      T01P73_A396EmprCod = new String[] {""} ;
      T01P72_A361DisCod = new int[1] ;
      T01P72_A44AlbRecCod = new int[1] ;
      T01P72_A380DisPieCod = new String[] {""} ;
      T01P72_A382DisPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P72_A384DisPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P72_A2184DisPieLoc = new String[] {""} ;
      T01P72_A2185DisPieAnc = new short[1] ;
      T01P72_A5099DisPieEst = new byte[1] ;
      T01P72_A396EmprCod = new String[] {""} ;
      T01P723_A396EmprCod = new String[] {""} ;
      T01P723_A361DisCod = new int[1] ;
      T01P723_A44AlbRecCod = new int[1] ;
      T01P723_A380DisPieCod = new String[] {""} ;
      Gridlevel_detallepiezasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_detallepiezas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      sCtrlGx_mode = "" ;
      sCtrlAV41EmprCod = "" ;
      sCtrlAV32DisCod = "" ;
      sCtrlAV9AlbRecCod = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gridlevel_detallepiezasColumn = new com.genexus.webpanels.GXWebColumn();
      T01P724_A396EmprCod = new String[] {""} ;
      T01P725_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.nwdpdetallepiezas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.nwdpdetallepiezas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.nwdpdetallepiezas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.nwdpdetallepiezas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpdetallepiezas__default(),
         new Object[] {
             new Object[] {
            T01P72_A361DisCod, T01P72_A44AlbRecCod, T01P72_A380DisPieCod, T01P72_A382DisPieKil, T01P72_A384DisPieMet, T01P72_A2184DisPieLoc, T01P72_A2185DisPieAnc, T01P72_A5099DisPieEst, T01P72_A396EmprCod
            }
            , new Object[] {
            T01P73_A361DisCod, T01P73_A44AlbRecCod, T01P73_A380DisPieCod, T01P73_A382DisPieKil, T01P73_A384DisPieMet, T01P73_A2184DisPieLoc, T01P73_A2185DisPieAnc, T01P73_A5099DisPieEst, T01P73_A396EmprCod
            }
            , new Object[] {
            T01P74_A396EmprCod, T01P74_A44AlbRecCod, T01P74_A361DisCod
            }
            , new Object[] {
            T01P75_A396EmprCod, T01P75_A44AlbRecCod, T01P75_A361DisCod
            }
            , new Object[] {
            T01P76_A396EmprCod
            }
            , new Object[] {
            T01P77_A396EmprCod
            }
            , new Object[] {
            T01P78_A396EmprCod, T01P78_A44AlbRecCod, T01P78_A361DisCod
            }
            , new Object[] {
            T01P79_A396EmprCod
            }
            , new Object[] {
            T01P710_A396EmprCod
            }
            , new Object[] {
            T01P711_A396EmprCod, T01P711_A361DisCod, T01P711_A44AlbRecCod
            }
            , new Object[] {
            T01P712_A396EmprCod, T01P712_A361DisCod, T01P712_A44AlbRecCod
            }
            , new Object[] {
            T01P713_A396EmprCod, T01P713_A361DisCod, T01P713_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P716_A396EmprCod, T01P716_A361DisCod, T01P716_A44AlbRecCod, T01P716_A9756Dis_CUb
            }
            , new Object[] {
            T01P717_A396EmprCod, T01P717_A361DisCod, T01P717_A44AlbRecCod
            }
            , new Object[] {
            T01P718_A361DisCod, T01P718_A44AlbRecCod, T01P718_A380DisPieCod, T01P718_A382DisPieKil, T01P718_A384DisPieMet, T01P718_A2184DisPieLoc, T01P718_A2185DisPieAnc, T01P718_A5099DisPieEst, T01P718_A396EmprCod
            }
            , new Object[] {
            T01P719_A396EmprCod, T01P719_A361DisCod, T01P719_A44AlbRecCod, T01P719_A380DisPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P723_A396EmprCod, T01P723_A361DisCod, T01P723_A44AlbRecCod, T01P723_A380DisPieCod
            }
            , new Object[] {
            T01P724_A396EmprCod
            }
            , new Object[] {
            T01P725_A396EmprCod
            }
         }
      );
   }

   private byte Z5099DisPieEst ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nKeyPressed ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A5099DisPieEst ;
   private byte Gx_BScreen ;
   private byte subGridlevel_detallepiezas_Backcolorstyle ;
   private byte subGridlevel_detallepiezas_Backstyle ;
   private byte subGridlevel_detallepiezas_Allowselection ;
   private byte subGridlevel_detallepiezas_Allowhovering ;
   private byte subGridlevel_detallepiezas_Allowcollapsing ;
   private byte subGridlevel_detallepiezas_Collapsed ;
   private short Z2185DisPieAnc ;
   private short nRcdDeleted_36 ;
   private short nRcdExists_36 ;
   private short nIsMod_36 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount36 ;
   private short RcdFound36 ;
   private short nBlankRcdUsr36 ;
   private short RcdFound35 ;
   private short A2185DisPieAnc ;
   private short nIsDirty_35 ;
   private short nIsDirty_36 ;
   private int wcpOAV32DisCod ;
   private int wcpOAV9AlbRecCod ;
   private int Z361DisCod ;
   private int Z44AlbRecCod ;
   private int nRC_GXsfl_23 ;
   private int nGXsfl_23_idx=1 ;
   private int AV32DisCod ;
   private int AV9AlbRecCod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int trnEnded ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Visible ;
   private int edtDisCod_Enabled ;
   private int edtAlbRecCod_Visible ;
   private int edtAlbRecCod_Enabled ;
   private int edtDisPieCod_Enabled ;
   private int edtDisPieKil_Enabled ;
   private int edtDisPieMet_Enabled ;
   private int edtDisPieLoc_Enabled ;
   private int edtDisPieAnc_Enabled ;
   private int edtDisPieEst_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridlevel_detallepiezas_Backcolor ;
   private int subGridlevel_detallepiezas_Allbackcolor ;
   private int defedtDisPieCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_detallepiezas_Selectedindex ;
   private int subGridlevel_detallepiezas_Selectioncolor ;
   private int subGridlevel_detallepiezas_Hoveringcolor ;
   private long GRIDLEVEL_DETALLEPIEZAS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z382DisPieKil ;
   private java.math.BigDecimal Z384DisPieMet ;
   private java.math.BigDecimal A382DisPieKil ;
   private java.math.BigDecimal A384DisPieMet ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV41EmprCod ;
   private String Z396EmprCod ;
   private String Z380DisPieCod ;
   private String Z2184DisPieLoc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String Gx_mode ;
   private String AV41EmprCod ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sXEvt ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_23_idx="0001" ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divTableleaflevel_detallepiezas_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String sMode36 ;
   private String edtDisPieCod_Internalname ;
   private String edtDisPieKil_Internalname ;
   private String edtDisPieMet_Internalname ;
   private String edtDisPieLoc_Internalname ;
   private String edtDisPieAnc_Internalname ;
   private String edtDisPieEst_Internalname ;
   private String sStyleString ;
   private String subGridlevel_detallepiezas_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode35 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A380DisPieCod ;
   private String A2184DisPieLoc ;
   private String AV123Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV42EmprNom ;
   private String GXv_char3[] ;
   private String AV134UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_23_fel_idx="0001" ;
   private String subGridlevel_detallepiezas_Class ;
   private String subGridlevel_detallepiezas_Linesclass ;
   private String ROClassString ;
   private String edtDisPieCod_Jsonclick ;
   private String edtDisPieKil_Jsonclick ;
   private String edtDisPieMet_Jsonclick ;
   private String edtDisPieLoc_Jsonclick ;
   private String edtDisPieAnc_Jsonclick ;
   private String edtDisPieEst_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String sCtrlGx_mode ;
   private String sCtrlAV41EmprCod ;
   private String sCtrlAV32DisCod ;
   private String sCtrlAV9AlbRecCod ;
   private String subGridlevel_detallepiezas_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_23_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_detallepiezasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_detallepiezasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_detallepiezasColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV137WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01P78_A396EmprCod ;
   private int[] T01P78_A44AlbRecCod ;
   private int[] T01P78_A361DisCod ;
   private String[] T01P77_A396EmprCod ;
   private String[] T01P76_A396EmprCod ;
   private String[] T01P79_A396EmprCod ;
   private String[] T01P710_A396EmprCod ;
   private String[] T01P711_A396EmprCod ;
   private int[] T01P711_A361DisCod ;
   private int[] T01P711_A44AlbRecCod ;
   private String[] T01P75_A396EmprCod ;
   private int[] T01P75_A44AlbRecCod ;
   private int[] T01P75_A361DisCod ;
   private String[] T01P712_A396EmprCod ;
   private int[] T01P712_A361DisCod ;
   private int[] T01P712_A44AlbRecCod ;
   private String[] T01P713_A396EmprCod ;
   private int[] T01P713_A361DisCod ;
   private int[] T01P713_A44AlbRecCod ;
   private String[] T01P74_A396EmprCod ;
   private int[] T01P74_A44AlbRecCod ;
   private int[] T01P74_A361DisCod ;
   private String[] T01P716_A396EmprCod ;
   private int[] T01P716_A361DisCod ;
   private int[] T01P716_A44AlbRecCod ;
   private String[] T01P716_A9756Dis_CUb ;
   private String[] T01P717_A396EmprCod ;
   private int[] T01P717_A361DisCod ;
   private int[] T01P717_A44AlbRecCod ;
   private int[] T01P718_A361DisCod ;
   private int[] T01P718_A44AlbRecCod ;
   private String[] T01P718_A380DisPieCod ;
   private java.math.BigDecimal[] T01P718_A382DisPieKil ;
   private java.math.BigDecimal[] T01P718_A384DisPieMet ;
   private String[] T01P718_A2184DisPieLoc ;
   private short[] T01P718_A2185DisPieAnc ;
   private byte[] T01P718_A5099DisPieEst ;
   private String[] T01P718_A396EmprCod ;
   private String[] T01P719_A396EmprCod ;
   private int[] T01P719_A361DisCod ;
   private int[] T01P719_A44AlbRecCod ;
   private String[] T01P719_A380DisPieCod ;
   private int[] T01P73_A361DisCod ;
   private int[] T01P73_A44AlbRecCod ;
   private String[] T01P73_A380DisPieCod ;
   private java.math.BigDecimal[] T01P73_A382DisPieKil ;
   private java.math.BigDecimal[] T01P73_A384DisPieMet ;
   private String[] T01P73_A2184DisPieLoc ;
   private short[] T01P73_A2185DisPieAnc ;
   private byte[] T01P73_A5099DisPieEst ;
   private String[] T01P73_A396EmprCod ;
   private int[] T01P72_A361DisCod ;
   private int[] T01P72_A44AlbRecCod ;
   private String[] T01P72_A380DisPieCod ;
   private java.math.BigDecimal[] T01P72_A382DisPieKil ;
   private java.math.BigDecimal[] T01P72_A384DisPieMet ;
   private String[] T01P72_A2184DisPieLoc ;
   private short[] T01P72_A2185DisPieAnc ;
   private byte[] T01P72_A5099DisPieEst ;
   private String[] T01P72_A396EmprCod ;
   private String[] T01P723_A396EmprCod ;
   private int[] T01P723_A361DisCod ;
   private int[] T01P723_A44AlbRecCod ;
   private String[] T01P723_A380DisPieCod ;
   private String[] T01P724_A396EmprCod ;
   private String[] T01P725_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV133TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV138WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class nwdpdetallepiezas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpdetallepiezas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpdetallepiezas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpdetallepiezas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpdetallepiezas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01P72", "SELECT DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, EmprCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?  FOR UPDATE OF DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P73", "SELECT DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, EmprCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P74", "SELECT EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P75", "SELECT EmprCod, AlbRecCod, DisCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P76", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P77", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P78", "SELECT /*+ FIRST_ROWS(100) */ TM1.EmprCod, TM1.AlbRecCod, TM1.DisCod FROM TXPDISALB TM1 WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.AlbRecCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P79", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P710", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P711", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P712", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ? or DisCod = ? and EmprCod = ? and AlbRecCod > ?) ORDER BY EmprCod, DisCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P713", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ? or DisCod = ? and EmprCod = ? and AlbRecCod < ?) ORDER BY EmprCod DESC, DisCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P714", "INSERT INTO TXPDISALB(EmprCod, AlbRecCod, DisCod, Piezas, Kilos, Metros, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01P715", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("T01P716", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P717", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, AlbRecCod FROM TXPDISALB ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P718", "SELECT DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, EmprCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? and DisPieCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P719", "SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P720", "INSERT INTO TXPDISALD(DisCod, AlbRecCod, DisPieCod, DisPieKil, DisPieMet, DisPieLoc, DisPieAnc, DisPieEst, EmprCod, DisPieIdPz, DisPieCodB, DisPieAncc, DisPiePda) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0)", GX_NOMASK, "TXPDISALD")
         ,new UpdateCursor("T01P721", "UPDATE TXPDISALD SET DisPieKil=?, DisPieMet=?, DisPieLoc=?, DisPieAnc=?, DisPieEst=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK, "TXPDISALD")
         ,new UpdateCursor("T01P722", "DELETE FROM TXPDISALD  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? AND DisPieCod = ?", GX_NOMASK, "TXPDISALD")
         ,new ForEachCursor("T01P723", "SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? and DisCod = ? and AlbRecCod = ? ORDER BY EmprCod, DisCod, AlbRecCod, DisPieCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P724", "SELECT EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P725", "SELECT EmprCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 23 :
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
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               return;
            case 19 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

