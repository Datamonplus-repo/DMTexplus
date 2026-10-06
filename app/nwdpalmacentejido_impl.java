package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpalmacentejido_impl extends GXWebComponent
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
            AV45EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45EmprCod", AV45EmprCod);
            AV36DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36DisCod), 8, 0));
            setjustcreated();
            componentprepare(new Object[] {sCompPrefix,sSFPrefix,Gx_mode,AV45EmprCod,Integer.valueOf(AV36DisCod)});
            componentstart();
            httpContext.ajax_rspStartCmp(sPrefix);
            componentdraw();
            httpContext.ajax_rspEndCmp();
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
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
            gxload_19( A396EmprCod, A361DisCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
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
            gxload_20( A396EmprCod, A361DisCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxload_22( A396EmprCod, A44AlbRecCod) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_almacentejido") == 0 )
         {
            gxnrgridlevel_almacentejido_newrow_invoke( ) ;
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Nw DPAlmacen Tejido", ""), (short)(0)) ;
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

   public void gxnrgridlevel_almacentejido_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_almacentejido_newrow( ) ;
      /* End function gxnrGridlevel_almacentejido_newrow_invoke */
   }

   public nwdpalmacentejido_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpalmacentejido_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpalmacentejido_impl.class ));
   }

   public nwdpalmacentejido_impl( int remoteHandle ,
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
      chkDisDes = UIFactory.getCheckbox(this);
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
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
         renderHtmlCloseForm1P634( ) ;
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
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.nwdpalmacentejido");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6", "left", "top", "", "", "div");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmprCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmprCod_Internalname, httpContext.getMessage( "Código Empresa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Codigo Disposicion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisDes.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkDisDes.getInternalname(), httpContext.getMessage( "Desglose", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", httpContext.getMessage( "Desglose", ""), 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(32, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,32);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisArtCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisArtCod_Internalname, httpContext.getMessage( "Código Artículo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisTotRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisTotRec_Internalname, httpContext.getMessage( "Recepciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisTotRec_Internalname, GXutil.ltrim( localUtil.ntoc( A13733DisTotRec, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisTotRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13733DisTotRec), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13733DisTotRec), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisTotRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisTotRec_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisUniMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisUniMed_Internalname, httpContext.getMessage( "Unidades Medida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,52);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisLoc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisLoc_Internalname, httpContext.getMessage( "Localizacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisLoc_Internalname, GXutil.rtrim( A1430DisLoc), GXutil.rtrim( localUtil.format( A1430DisLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisLoc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCliNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCliNum_Internalname, httpContext.getMessage( "Codigo Disposicion Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCliNum_Internalname, GXutil.rtrim( A360DisCliNum), GXutil.rtrim( localUtil.format( A360DisCliNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCliNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCliNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCanRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCanRec_Internalname, httpContext.getMessage( "Reclamaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCanRec_Internalname, GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCanRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13732DisCanRec), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13732DisCanRec), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCanRec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCanRec_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_almacentejido_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_almacentejido( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'" + sPrefix + "',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPAlmacenTejido.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_almacentejido( )
   {
      /*  Grid Control  */
      startgridcontrol73( ) ;
      nGXsfl_73_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount35 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_35 = (short)(1) ;
            scanStart1P635( ) ;
            while ( RcdFound35 != 0 )
            {
               init_level_properties35( ) ;
               getByPrimaryKey1P635( ) ;
               addRow1P635( ) ;
               scanNext1P635( ) ;
            }
            scanEnd1P635( ) ;
            nBlankRcdCount35 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13733DisTotRec = A13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         standaloneNotModal1P635( ) ;
         standaloneModal1P635( ) ;
         sMode35 = Gx_mode ;
         while ( nGXsfl_73_idx < nRC_GXsfl_73 )
         {
            bGXsfl_73_Refreshing = true ;
            readRow1P635( ) ;
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRECCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"KILOS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"METROS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtPiezas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"PIEZAS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRPIEDIS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNIDIS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNIENT_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNIUTI_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRPIEENT_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRPIEUTI_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            cmbAlbRUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNI_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), !bGXsfl_73_Refreshing);
            cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBREST_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_73_Refreshing);
            cmbAlbRReo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRREO_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBREF_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRGrm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRGRM2_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            edtAlbRAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRANC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
            if ( ( nRcdExists_35 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               standaloneModal1P635( ) ;
            }
            sendRow1P635( ) ;
            bGXsfl_73_Refreshing = false ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         A13733DisTotRec = B13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount35 = (short)(5) ;
         nRcdExists_35 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1P635( ) ;
            while ( RcdFound35 != 0 )
            {
               sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_7335( ) ;
               init_level_properties35( ) ;
               standaloneNotModal1P635( ) ;
               getByPrimaryKey1P635( ) ;
               standaloneModal1P635( ) ;
               addRow1P635( ) ;
               scanNext1P635( ) ;
            }
            scanEnd1P635( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode35 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_7335( ) ;
         initAll1P635( ) ;
         init_level_properties35( ) ;
         B13733DisTotRec = A13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         nRcdExists_35 = (short)(0) ;
         nIsMod_35 = (short)(0) ;
         nRcdDeleted_35 = (short)(0) ;
         nBlankRcdCount35 = (short)(nBlankRcdUsr35+nBlankRcdCount35) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount35 > 0 )
         {
            standaloneNotModal1P635( ) ;
            standaloneModal1P635( ) ;
            addRow1P635( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount35 = (short)(nBlankRcdCount35-1) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         A13733DisTotRec = B13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      if ( subGridlevel_almacentejido_Visible != 0 )
      {
         sStyleString = "" ;
      }
      else
      {
         sStyleString = " style=\"display:none;\"" ;
      }
      httpContext.writeText( "<div id=\""+sPrefix+"Gridlevel_almacentejidoContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridlevel_almacentejido", Gridlevel_almacentejidoContainer, subGridlevel_almacentejido_Internalname);
      if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridlevel_almacentejidoContainerData", Gridlevel_almacentejidoContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridlevel_almacentejidoContainerData"+"V", Gridlevel_almacentejidoContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridlevel_almacentejidoContainerData"+"V"+"\" value='"+Gridlevel_almacentejidoContainer.GridValuesHidden()+"'/>") ;
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
      e111P62 ();
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
            Z365DisDes = httpContext.cgiGet( sPrefix+"Z365DisDes") ;
            Z335DisArtCod = httpContext.cgiGet( sPrefix+"Z335DisArtCod") ;
            Z392DisUniMed = httpContext.cgiGet( sPrefix+"Z392DisUniMed") ;
            Z1430DisLoc = httpContext.cgiGet( sPrefix+"Z1430DisLoc") ;
            Z360DisCliNum = httpContext.cgiGet( sPrefix+"Z360DisCliNum") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            wcpOGx_mode = httpContext.cgiGet( sPrefix+"wcpOGx_mode") ;
            wcpOAV45EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV45EmprCod") ;
            wcpOAV36DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O13733DisTotRec = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"O13733DisTotRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( sPrefix+"Mode") ;
            nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV129ProcesoRealizado = GXutil.strtobool( httpContext.cgiGet( sPrefix+"vPROCESOREALIZADO")) ;
            AV45EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
            AV36DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV67Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV154Pgmname = httpContext.cgiGet( sPrefix+"vPGMNAME") ;
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
            A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
            A13733DisTotRec = (int)(localUtil.ctol( httpContext.cgiGet( edtDisTotRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
            A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
            A1430DisLoc = httpContext.cgiGet( edtDisLoc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
            A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
            A13732DisCanRec = (short)(localUtil.ctol( httpContext.cgiGet( edtDisCanRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13732DisCanRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NwDPAlmacenTejido");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( sPrefix+"hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("nwdpalmacentejido:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode34 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode34 ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound34 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P60( ) ;
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
                              e111P62 ();
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
                              e121P62 ();
                           }
                        }
                     }
                     else if ( GXutil.strcmp(sEvt, "VCONSULTA.CLICK") == 0 )
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
                              e131P62 ();
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
         e121P62 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P634( ) ;
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
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1P634( ) ;
      }
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisTotRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTotRec_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisLoc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCliNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCanRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCanRec_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
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

   public void confirm_1P60( )
   {
      beforeValidate1P634( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P634( ) ;
         }
         else
         {
            checkExtendedTable1P634( ) ;
            closeExtendedTableCursors1P634( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1P635( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1P635( )
   {
      s13733DisTotRec = O13733DisTotRec ;
      n13733DisTotRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1P635( ) ;
         if ( ( nRcdExists_35 != 0 ) || ( nIsMod_35 != 0 ) )
         {
            getKey1P635( ) ;
            if ( ( nRcdExists_35 == 0 ) && ( nRcdDeleted_35 == 0 ) )
            {
               if ( RcdFound35 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                  beforeValidate1P635( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P635( ) ;
                     closeExtendedTableCursors1P635( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13733DisTotRec = A13733DisTotRec ;
                     n13733DisTotRec = false ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRECCOD_" + sGXsfl_73_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound35 != 0 )
               {
                  if ( nRcdDeleted_35 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1P635( ) ;
                     load1P635( ) ;
                     beforeValidate1P635( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P635( ) ;
                        O13733DisTotRec = A13733DisTotRec ;
                        n13733DisTotRec = false ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_35 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        beforeValidate1P635( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P635( ) ;
                           closeExtendedTableCursors1P635( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13733DisTotRec = A13733DisTotRec ;
                           n13733DisTotRec = false ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_35 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( sPrefix+edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni)) ;
         httpContext.changePostValue( sPrefix+cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( sPrefix+cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo)) ;
         httpContext.changePostValue( sPrefix+edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( sPrefix+edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z44AlbRecCod_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z595Kilos_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z631Metros_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z673Piezas_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdDeleted_35_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdExists_35_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nIsMod_35_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_35 != 0 )
         {
            httpContext.changePostValue( sPrefix+"ALBRECCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"KILOS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"METROS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"PIEZAS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRPIEDIS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNIDIS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNIENT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNIUTI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRPIEENT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRPIEUTI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBREST_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRREO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBREF_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRGRM2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRGrm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRANC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13733DisTotRec = s13733DisTotRec ;
      n13733DisTotRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      /* Start of After( level) rules */
      /* Using cursor T01P66 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13732DisCanRec = T01P66_A13732DisCanRec[0] ;
         n13732DisCanRec = T01P66_n13732DisCanRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      else
      {
         A13732DisCanRec = (short)(0) ;
         n13732DisCanRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1P60( )
   {
   }

   public void e111P62( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV153OK = "0" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV153OK", AV153OK);
      GXt_char1 = AV134Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpalmacentejido_impl.this.GXt_char1 = GXv_char2[0] ;
      AV134Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV134Station", AV134Station);
      GXv_char2[0] = AV45EmprCod ;
      GXv_char3[0] = AV46EmprNom ;
      GXv_char4[0] = AV146UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV134Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpalmacentejido_impl.this.AV45EmprCod = GXv_char2[0] ;
      nwdpalmacentejido_impl.this.AV46EmprNom = GXv_char3[0] ;
      nwdpalmacentejido_impl.this.AV146UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45EmprCod", AV45EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46EmprNom", AV46EmprNom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV146UsurCod", AV146UsurCod);
      GXv_SdtWWPContext5[0] = AV152WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV152WWPContext = GXv_SdtWWPContext5[0] ;
      AV144TrnContext.fromxml(AV150WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV144TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV154Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV155GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155GXV1), 8, 0));
         while ( AV155GXV1 <= AV144TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV145TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV144TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV155GXV1));
            if ( GXutil.strcmp(AV145TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV67Insert_CliCod = (int)(GXutil.lval( AV145TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67Insert_CliCod), 6, 0));
            }
            AV155GXV1 = (int)(AV155GXV1+1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV155GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155GXV1), 8, 0));
         }
      }
      if ( GXutil.strcmp(A365DisDes, "S") == 0 )
      {
         GXt_int6 = AV9AlbRecCod ;
         GXv_int7[0] = GXt_int6 ;
         new app.determinarprimerarecepcion(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_int7) ;
         nwdpalmacentejido_impl.this.GXt_int6 = GXv_int7[0] ;
         AV9AlbRecCod = GXt_int6 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRecCod), 8, 0));
         if ( ! (0==AV9AlbRecCod) )
         {
         }
         else
         {
         }
      }
      else
      {
      }
      GXt_char1 = AV113Msg3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG088_", ""), (byte)(99), GXv_char4) ;
      nwdpalmacentejido_impl.this.GXt_char1 = GXv_char4[0] ;
      AV113Msg3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113Msg3", AV113Msg3);
      AV124Piezas = "<i class=\"fas fa-edit\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV124Piezas", AV124Piezas);
      AV29Consulta = "<i class=\"fas fa-store\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Consulta", AV29Consulta);
   }

   public void e121P62( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( 0 > 1 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV144TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.nwdpalmacentejidoww", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e131P62( )
   {
      /* Consulta_Click Routine */
      returnInSub = false ;
      AV10AlbRef = A335DisArtCod ;
      AV25Clicod = A252CliCod ;
      /* Window Datatype Object Property */
      AV151Window.setUrl( formatLink("app.webwcnsalmtela", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV10AlbRef)),GXutil.URLEncode(GXutil.rtrim("0"))}, new String[] {"InOutEmprCod","InOutAlbRecCod","CliCod","AlbRef","OK"})  );
      AV151Window.setReturnParms(new Object[] {"A396EmprCod","A44AlbRecCod",});
      httpContext.newWindow(AV151Window);
      /*  Sending Event outputs  */
   }

   public void zm1P634( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z365DisDes = T01P68_A365DisDes[0] ;
            Z335DisArtCod = T01P68_A335DisArtCod[0] ;
            Z392DisUniMed = T01P68_A392DisUniMed[0] ;
            Z1430DisLoc = T01P68_A1430DisLoc[0] ;
            Z360DisCliNum = T01P68_A360DisCliNum[0] ;
            Z252CliCod = T01P68_A252CliCod[0] ;
         }
         else
         {
            Z365DisDes = A365DisDes ;
            Z335DisArtCod = A335DisArtCod ;
            Z392DisUniMed = A392DisUniMed ;
            Z1430DisLoc = A1430DisLoc ;
            Z360DisCliNum = A360DisCliNum ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z361DisCod = A361DisCod ;
         Z365DisDes = A365DisDes ;
         Z335DisArtCod = A335DisArtCod ;
         Z392DisUniMed = A392DisUniMed ;
         Z1430DisLoc = A1430DisLoc ;
         Z360DisCliNum = A360DisCliNum ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z13733DisTotRec = A13733DisTotRec ;
         Z13732DisCanRec = A13732DisCanRec ;
      }
   }

   public void standaloneNotModal( )
   {
      AV154Pgmname = "NwDPAlmacenTejido" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV154Pgmname", AV154Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV45EmprCod)==0) )
      {
         A396EmprCod = AV45EmprCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV45EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV45EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV36DisCod) )
      {
         A361DisCod = AV36DisCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV36DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV36DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV67Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV67Insert_CliCod) )
      {
         A252CliCod = AV67Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01P610 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A13733DisTotRec = T01P610_A13733DisTotRec[0] ;
            n13733DisTotRec = T01P610_n13733DisTotRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         else
         {
            A13733DisTotRec = 0 ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         O13733DisTotRec = A13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         pr_default.close(6);
         subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
         /* Using cursor T01P66 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A13732DisCanRec = T01P66_A13732DisCanRec[0] ;
            n13732DisCanRec = T01P66_n13732DisCanRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
         }
         else
         {
            A13732DisCanRec = (short)(0) ;
            n13732DisCanRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
         }
         pr_default.close(3);
      }
   }

   public void load1P634( )
   {
      /* Using cursor T01P613 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A365DisDes = T01P613_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
         A335DisArtCod = T01P613_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
         A392DisUniMed = T01P613_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
         A1430DisLoc = T01P613_A1430DisLoc[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
         A360DisCliNum = T01P613_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
         A252CliCod = T01P613_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A13733DisTotRec = T01P613_A13733DisTotRec[0] ;
         n13733DisTotRec = T01P613_n13733DisTotRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         A13732DisCanRec = T01P613_A13732DisCanRec[0] ;
         n13732DisCanRec = T01P613_n13732DisCanRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
         zm1P634( -18) ;
      }
      pr_default.close(7);
      onLoadActions1P634( ) ;
   }

   public void onLoadActions1P634( )
   {
      O13733DisTotRec = A13733DisTotRec ;
      n13733DisTotRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
   }

   public void checkExtendedTable1P634( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01P610 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13733DisTotRec = T01P610_A13733DisTotRec[0] ;
         n13733DisTotRec = T01P610_n13733DisTotRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A13733DisTotRec = 0 ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      pr_default.close(6);
      subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
      /* Using cursor T01P66 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13732DisCanRec = T01P66_A13732DisCanRec[0] ;
         n13732DisCanRec = T01P66_n13732DisCanRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A13732DisCanRec = (short)(0) ;
         n13732DisCanRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      pr_default.close(3);
      if ( ! ( ( GXutil.strcmp(A365DisDes, "S") == 0 ) || ( GXutil.strcmp(A365DisDes, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Desglose", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "DISDES");
         AnyError = (short)(1) ;
         GX_FocusControl = chkDisDes.getInternalname() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1P634( )
   {
      pr_default.close(6);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01P615 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13733DisTotRec = T01P615_A13733DisTotRec[0] ;
         n13733DisTotRec = T01P615_n13733DisTotRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      else
      {
         A13733DisTotRec = 0 ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13733DisTotRec, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_20( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01P617 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A13732DisCanRec = T01P617_A13732DisCanRec[0] ;
         n13732DisCanRec = T01P617_n13732DisCanRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      else
      {
         A13732DisCanRec = (short)(0) ;
         n13732DisCanRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1P634( )
   {
      /* Using cursor T01P618 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01P68 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm1P634( 18) ;
         RcdFound34 = (short)(1) ;
         A361DisCod = T01P68_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A365DisDes = T01P68_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
         A335DisArtCod = T01P68_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
         A392DisUniMed = T01P68_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
         A1430DisLoc = T01P68_A1430DisLoc[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
         A360DisCliNum = T01P68_A360DisCliNum[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
         A396EmprCod = T01P68_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01P68_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         load1P634( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1P634( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1P634( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1P634( ) ;
      if ( RcdFound34 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01P619 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01P619_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01P619_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P619_A361DisCod[0] < A361DisCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01P619_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01P619_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P619_A361DisCod[0] > A361DisCod ) ) )
         {
            A396EmprCod = T01P619_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01P619_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01P620 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01P620_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01P620_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P620_A361DisCod[0] > A361DisCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01P620_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01P620_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P620_A361DisCod[0] < A361DisCod ) ) )
         {
            A396EmprCod = T01P620_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01P620_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P634( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13733DisTotRec = O13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         insert1P634( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13733DisTotRec = O13733DisTotRec ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A13733DisTotRec = O13733DisTotRec ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
               update1P634( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               /* Insert record */
               A13733DisTotRec = O13733DisTotRec ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               insert1P634( ) ;
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
                  A13733DisTotRec = O13733DisTotRec ;
                  n13733DisTotRec = false ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  insert1P634( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13733DisTotRec = O13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1P634( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P67 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z365DisDes, T01P67_A365DisDes[0]) != 0 ) || ( GXutil.strcmp(Z335DisArtCod, T01P67_A335DisArtCod[0]) != 0 ) || ( GXutil.strcmp(Z392DisUniMed, T01P67_A392DisUniMed[0]) != 0 ) || ( GXutil.strcmp(Z1430DisLoc, T01P67_A1430DisLoc[0]) != 0 ) || ( GXutil.strcmp(Z360DisCliNum, T01P67_A360DisCliNum[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z252CliCod != T01P67_A252CliCod[0] ) )
         {
            if ( GXutil.strcmp(Z365DisDes, T01P67_A365DisDes[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"DisDes");
               GXutil.writeLogRaw("Old: ",Z365DisDes);
               GXutil.writeLogRaw("Current: ",T01P67_A365DisDes[0]);
            }
            if ( GXutil.strcmp(Z335DisArtCod, T01P67_A335DisArtCod[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"DisArtCod");
               GXutil.writeLogRaw("Old: ",Z335DisArtCod);
               GXutil.writeLogRaw("Current: ",T01P67_A335DisArtCod[0]);
            }
            if ( GXutil.strcmp(Z392DisUniMed, T01P67_A392DisUniMed[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"DisUniMed");
               GXutil.writeLogRaw("Old: ",Z392DisUniMed);
               GXutil.writeLogRaw("Current: ",T01P67_A392DisUniMed[0]);
            }
            if ( GXutil.strcmp(Z1430DisLoc, T01P67_A1430DisLoc[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"DisLoc");
               GXutil.writeLogRaw("Old: ",Z1430DisLoc);
               GXutil.writeLogRaw("Current: ",T01P67_A1430DisLoc[0]);
            }
            if ( GXutil.strcmp(Z360DisCliNum, T01P67_A360DisCliNum[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"DisCliNum");
               GXutil.writeLogRaw("Old: ",Z360DisCliNum);
               GXutil.writeLogRaw("Current: ",T01P67_A360DisCliNum[0]);
            }
            if ( Z252CliCod != T01P67_A252CliCod[0] )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01P67_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P634( )
   {
      beforeValidate1P634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P634( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P634( 0) ;
         checkOptimisticConcurrency1P634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P634( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P621 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A361DisCod), A365DisDes, A335DisArtCod, A392DisUniMed, A1430DisLoc, A360DisCliNum, A396EmprCod, Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel1P634( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1P60( ) ;
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
            load1P634( ) ;
         }
         endLevel1P634( ) ;
      }
      closeExtendedTableCursors1P634( ) ;
   }

   public void update1P634( )
   {
      beforeValidate1P634( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P634( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P634( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P634( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P634( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P622 */
                  pr_default.execute(14, new Object[] {A365DisDes, A335DisArtCod, A392DisUniMed, A1430DisLoc, A360DisCliNum, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1P634( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int7[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int7) ;
                     nwdpalmacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
                     nwdpalmacentejido_impl.this.A361DisCod = GXv_int7[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P634( ) ;
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
         endLevel1P634( ) ;
      }
      closeExtendedTableCursors1P634( ) ;
   }

   public void deferredUpdate1P634( )
   {
   }

   public void delete( )
   {
      beforeValidate1P634( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P634( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P634( ) ;
         afterConfirm1P634( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P634( ) ;
            if ( AnyError == 0 )
            {
               A13733DisTotRec = O13733DisTotRec ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
               scanStart1P635( ) ;
               while ( RcdFound35 != 0 )
               {
                  getByPrimaryKey1P635( ) ;
                  delete1P635( ) ;
                  scanNext1P635( ) ;
                  O13733DisTotRec = A13733DisTotRec ;
                  n13733DisTotRec = false ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
               }
               scanEnd1P635( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P623 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      endLevel1P634( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P634( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01P625 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            A13733DisTotRec = T01P625_A13733DisTotRec[0] ;
            n13733DisTotRec = T01P625_n13733DisTotRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         else
         {
            A13733DisTotRec = 0 ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         pr_default.close(16);
         subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
         /* Using cursor T01P627 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            A13732DisCanRec = T01P627_A13732DisCanRec[0] ;
            n13732DisCanRec = T01P627_n13732DisCanRec[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
         }
         else
         {
            A13732DisCanRec = (short)(0) ;
            n13732DisCanRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
         }
         pr_default.close(17);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P628 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01P629 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01P630 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01P631 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01P632 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01P633 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01P634 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01P635 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01P636 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01P637 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01P638 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01P639 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
      }
   }

   public void processNestedLevel1P635( )
   {
      s13733DisTotRec = O13733DisTotRec ;
      n13733DisTotRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      nGXsfl_73_idx = 0 ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         readRow1P635( ) ;
         if ( ( nRcdExists_35 != 0 ) || ( nIsMod_35 != 0 ) )
         {
            standaloneNotModal1P635( ) ;
            getKey1P635( ) ;
            if ( ( nRcdExists_35 == 0 ) && ( nRcdDeleted_35 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
               insert1P635( ) ;
            }
            else
            {
               if ( RcdFound35 != 0 )
               {
                  if ( ( nRcdDeleted_35 != 0 ) && ( nRcdExists_35 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                     delete1P635( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_35 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
                        update1P635( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_35 == 0 )
                  {
                     GXCCtl = "ALBRECCOD_" + sGXsfl_73_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13733DisTotRec = A13733DisTotRec ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         httpContext.changePostValue( sPrefix+edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtKilos_Internalname, GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtMetros_Internalname, GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtPiezas_Internalname, GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni)) ;
         httpContext.changePostValue( sPrefix+cmbAlbREst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( sPrefix+cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo)) ;
         httpContext.changePostValue( sPrefix+edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef)) ;
         httpContext.changePostValue( sPrefix+edtAlbRGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+edtAlbRAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z44AlbRecCod_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z595Kilos_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z631Metros_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"ZT_"+"Z673Piezas_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdDeleted_35_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nRcdExists_35_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( sPrefix+"nIsMod_35_"+sGXsfl_73_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_35 != 0 )
         {
            httpContext.changePostValue( sPrefix+"ALBRECCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"KILOS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKilos_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"METROS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetros_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"PIEZAS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRPIEDIS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNIDIS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNIENT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNIUTI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRPIEENT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRPIEUTI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRUNI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBREST_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRREO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBREF_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRGRM2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRGrm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( sPrefix+"ALBRANC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01P627 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A13732DisCanRec = T01P627_A13732DisCanRec[0] ;
         n13732DisCanRec = T01P627_n13732DisCanRec[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      else
      {
         A13732DisCanRec = (short)(0) ;
         n13732DisCanRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      }
      /* End of After( level) rules */
      initAll1P635( ) ;
      if ( AnyError != 0 )
      {
         O13733DisTotRec = s13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      nRcdExists_35 = (short)(0) ;
      nIsMod_35 = (short)(0) ;
      nRcdDeleted_35 = (short)(0) ;
   }

   public void processLevel1P634( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1P635( ) ;
      if ( AnyError != 0 )
      {
         O13733DisTotRec = s13733DisTotRec ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1P634( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1P634( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "nwdpalmacentejido");
         if ( AnyError == 0 )
         {
            confirmValues1P60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "nwdpalmacentejido");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P634( )
   {
      /* Scan By routine */
      /* Using cursor T01P640 */
      pr_default.execute(30);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01P640_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P640_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P634( )
   {
      /* Scan next routine */
      pr_default.readNext(30);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01P640_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P640_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void scanEnd1P634( )
   {
      pr_default.close(30);
   }

   public void afterConfirm1P634( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P634( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P634( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P634( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P634( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P634( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P634( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtDisTotRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisTotRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTotRec_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtDisLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisLoc_Enabled), 5, 0), true);
      edtDisCliNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCliNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Enabled), 5, 0), true);
      edtDisCanRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDisCanRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCanRec_Enabled), 5, 0), true);
   }

   public void zm1P635( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z595Kilos = T01P63_A595Kilos[0] ;
            Z631Metros = T01P63_A631Metros[0] ;
            Z673Piezas = T01P63_A673Piezas[0] ;
         }
         else
         {
            Z595Kilos = A595Kilos ;
            Z631Metros = A631Metros ;
            Z673Piezas = A673Piezas ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z361DisCod = A361DisCod ;
         Z595Kilos = A595Kilos ;
         Z631Metros = A631Metros ;
         Z673Piezas = A673Piezas ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z56AlbRUni = A56AlbRUni ;
         Z47AlbREst = A47AlbREst ;
         Z55AlbRReo = A55AlbRReo ;
         Z45AlbRef = A45AlbRef ;
         Z4920AlbRGrm2 = A4920AlbRGrm2 ;
         Z4921AlbRAnc = A4921AlbRAnc ;
      }
   }

   public void standaloneNotModal1P635( )
   {
   }

   public void standaloneModal1P635( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
      else
      {
         edtAlbRecCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      }
   }

   public void load1P635( )
   {
      /* Using cursor T01P641 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A595Kilos = T01P641_A595Kilos[0] ;
         A631Metros = T01P641_A631Metros[0] ;
         A673Piezas = T01P641_A673Piezas[0] ;
         A58AlbRUniEnt = T01P641_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = T01P641_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = T01P641_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = T01P641_A54AlbRPieUti[0] ;
         A56AlbRUni = T01P641_A56AlbRUni[0] ;
         A47AlbREst = T01P641_A47AlbREst[0] ;
         A55AlbRReo = T01P641_A55AlbRReo[0] ;
         A45AlbRef = T01P641_A45AlbRef[0] ;
         A4920AlbRGrm2 = T01P641_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = T01P641_A4921AlbRAnc[0] ;
         zm1P635( -21) ;
      }
      pr_default.close(31);
      onLoadActions1P635( ) ;
   }

   public void onLoadActions1P635( )
   {
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( isIns( )  )
      {
         A13733DisTotRec = (int)(O13733DisTotRec+1) ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A13733DisTotRec = O13733DisTotRec ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A13733DisTotRec = (int)(O13733DisTotRec-1) ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
            }
         }
      }
      subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
   }

   public void checkExtendedTable1P635( )
   {
      nIsDirty_35 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1P635( ) ;
      /* Using cursor T01P64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      A58AlbRUniEnt = T01P64_A58AlbRUniEnt[0] ;
      A60AlbRUniUti = T01P64_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = T01P64_A52AlbRPieEnt[0] ;
      A54AlbRPieUti = T01P64_A54AlbRPieUti[0] ;
      A56AlbRUni = T01P64_A56AlbRUni[0] ;
      A47AlbREst = T01P64_A47AlbREst[0] ;
      A55AlbRReo = T01P64_A55AlbRReo[0] ;
      A45AlbRef = T01P64_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01P64_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01P64_A4921AlbRAnc[0] ;
      pr_default.close(2);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_35 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            nIsDirty_35 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      nIsDirty_35 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( isIns( )  )
      {
         nIsDirty_35 = (short)(1) ;
         A13733DisTotRec = (int)(O13733DisTotRec+1) ;
         n13733DisTotRec = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_35 = (short)(1) ;
            A13733DisTotRec = O13733DisTotRec ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_35 = (short)(1) ;
               A13733DisTotRec = (int)(O13733DisTotRec-1) ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
            }
         }
      }
      subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
   }

   public void closeExtendedTableCursors1P635( )
   {
      pr_default.close(2);
   }

   public void enableDisable1P635( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01P642 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
      }
      A58AlbRUniEnt = T01P642_A58AlbRUniEnt[0] ;
      A60AlbRUniUti = T01P642_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = T01P642_A52AlbRPieEnt[0] ;
      A54AlbRPieUti = T01P642_A54AlbRPieUti[0] ;
      A56AlbRUni = T01P642_A56AlbRUni[0] ;
      A47AlbREst = T01P642_A47AlbREst[0] ;
      A55AlbRReo = T01P642_A55AlbRReo[0] ;
      A45AlbRef = T01P642_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01P642_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01P642_A4921AlbRAnc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A55AlbRReo))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(32) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(32);
   }

   public void getKey1P635( )
   {
      /* Using cursor T01P643 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(33);
   }

   public void getByPrimaryKey1P635( )
   {
      /* Using cursor T01P63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1P635( 21) ;
         RcdFound35 = (short)(1) ;
         initializeNonKey1P635( ) ;
         A595Kilos = T01P63_A595Kilos[0] ;
         A631Metros = T01P63_A631Metros[0] ;
         A673Piezas = T01P63_A673Piezas[0] ;
         A44AlbRecCod = T01P63_A44AlbRecCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         load1P635( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1P635( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
         standaloneModal1P635( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P635( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1P635( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z595Kilos, T01P62_A595Kilos[0]) != 0 ) || ( DecimalUtil.compareTo(Z631Metros, T01P62_A631Metros[0]) != 0 ) || ( Z673Piezas != T01P62_A673Piezas[0] ) )
         {
            if ( DecimalUtil.compareTo(Z595Kilos, T01P62_A595Kilos[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"Kilos");
               GXutil.writeLogRaw("Old: ",Z595Kilos);
               GXutil.writeLogRaw("Current: ",T01P62_A595Kilos[0]);
            }
            if ( DecimalUtil.compareTo(Z631Metros, T01P62_A631Metros[0]) != 0 )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"Metros");
               GXutil.writeLogRaw("Old: ",Z631Metros);
               GXutil.writeLogRaw("Current: ",T01P62_A631Metros[0]);
            }
            if ( Z673Piezas != T01P62_A673Piezas[0] )
            {
               GXutil.writeLogln("nwdpalmacentejido:[seudo value changed for attri]"+"Piezas");
               GXutil.writeLogRaw("Old: ",Z673Piezas);
               GXutil.writeLogRaw("Current: ",T01P62_A673Piezas[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P635( )
   {
      beforeValidate1P635( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P635( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P635( 0) ;
         checkOptimisticConcurrency1P635( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P635( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P635( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P644 */
                  pr_default.execute(34, new Object[] {Integer.valueOf(A361DisCod), A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                  if ( (pr_default.getStatus(34) == 1) )
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
            load1P635( ) ;
         }
         endLevel1P635( ) ;
      }
      closeExtendedTableCursors1P635( ) ;
   }

   public void update1P635( )
   {
      beforeValidate1P635( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P635( ) ;
      }
      if ( ( nIsMod_35 != 0 ) || ( nIsDirty_35 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1P635( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1P635( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1P635( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01P645 */
                     pr_default.execute(35, new Object[] {A595Kilos, A631Metros, Integer.valueOf(A673Piezas), A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
                     if ( (pr_default.getStatus(35) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISALB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1P635( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int7[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int7) ;
                        nwdpalmacentejido_impl.this.A396EmprCod = GXv_char4[0] ;
                        nwdpalmacentejido_impl.this.A361DisCod = GXv_int7[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1P635( ) ;
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
            endLevel1P635( ) ;
         }
      }
      closeExtendedTableCursors1P635( ) ;
   }

   public void deferredUpdate1P635( )
   {
   }

   public void delete1P635( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      beforeValidate1P635( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P635( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P635( ) ;
         afterConfirm1P635( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P635( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01P646 */
               pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISALB");
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      endLevel1P635( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P635( )
   {
      standaloneModal1P635( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01P647 */
         pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         A58AlbRUniEnt = T01P647_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = T01P647_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = T01P647_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = T01P647_A54AlbRPieUti[0] ;
         A56AlbRUni = T01P647_A56AlbRUni[0] ;
         A47AlbREst = T01P647_A47AlbREst[0] ;
         A55AlbRReo = T01P647_A55AlbRReo[0] ;
         A45AlbRef = T01P647_A45AlbRef[0] ;
         A4920AlbRGrm2 = T01P647_A4920AlbRGrm2[0] ;
         A4921AlbRAnc = T01P647_A4921AlbRAnc[0] ;
         pr_default.close(37);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         if ( isIns( )  )
         {
            A13733DisTotRec = (int)(O13733DisTotRec+1) ;
            n13733DisTotRec = false ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A13733DisTotRec = O13733DisTotRec ;
               n13733DisTotRec = false ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A13733DisTotRec = (int)(O13733DisTotRec-1) ;
                  n13733DisTotRec = false ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
               }
            }
         }
         subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P648 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIOUT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01P649 */
         pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
      }
   }

   public void endLevel1P635( )
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

   public void scanStart1P635( )
   {
      /* Scan By routine */
      /* Using cursor T01P650 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A44AlbRecCod = T01P650_A44AlbRecCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P635( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A44AlbRecCod = T01P650_A44AlbRecCod[0] ;
      }
   }

   public void scanEnd1P635( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1P635( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P635( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P635( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P635( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P635( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P635( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P635( )
   {
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtKilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtKilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKilos_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetros_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtPiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPiezas_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), !bGXsfl_73_Refreshing);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), !bGXsfl_73_Refreshing);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRGrm2_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtAlbRAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRAnc_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void send_integrity_lvl_hashes1P635( )
   {
   }

   public void send_integrity_lvl_hashes1P634( )
   {
   }

   public void subsflControlProps_7335( )
   {
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_73_idx ;
      edtKilos_Internalname = sPrefix+"KILOS_"+sGXsfl_73_idx ;
      edtMetros_Internalname = sPrefix+"METROS_"+sGXsfl_73_idx ;
      edtPiezas_Internalname = sPrefix+"PIEZAS_"+sGXsfl_73_idx ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS_"+sGXsfl_73_idx ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS_"+sGXsfl_73_idx ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT_"+sGXsfl_73_idx ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI_"+sGXsfl_73_idx ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT_"+sGXsfl_73_idx ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI_"+sGXsfl_73_idx ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI_"+sGXsfl_73_idx );
      cmbAlbREst.setInternalname( sPrefix+"ALBREST_"+sGXsfl_73_idx );
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO_"+sGXsfl_73_idx );
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_73_idx ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2_"+sGXsfl_73_idx ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_7335( )
   {
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_73_fel_idx ;
      edtKilos_Internalname = sPrefix+"KILOS_"+sGXsfl_73_fel_idx ;
      edtMetros_Internalname = sPrefix+"METROS_"+sGXsfl_73_fel_idx ;
      edtPiezas_Internalname = sPrefix+"PIEZAS_"+sGXsfl_73_fel_idx ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS_"+sGXsfl_73_fel_idx ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS_"+sGXsfl_73_fel_idx ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT_"+sGXsfl_73_fel_idx ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI_"+sGXsfl_73_fel_idx ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT_"+sGXsfl_73_fel_idx ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI_"+sGXsfl_73_fel_idx ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI_"+sGXsfl_73_fel_idx );
      cmbAlbREst.setInternalname( sPrefix+"ALBREST_"+sGXsfl_73_fel_idx );
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO_"+sGXsfl_73_fel_idx );
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_73_fel_idx ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2_"+sGXsfl_73_fel_idx ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC_"+sGXsfl_73_fel_idx ;
   }

   public void addRow1P635( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7335( ) ;
      sendRow1P635( ) ;
   }

   public void sendRow1P635( )
   {
      Gridlevel_almacentejidoRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_almacentejido_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
         {
            subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_almacentejido_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(0) ;
         subGridlevel_almacentejido_Backcolor = subGridlevel_almacentejido_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
         {
            subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_almacentejido_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
         {
            subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Odd" ;
         }
         subGridlevel_almacentejido_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_almacentejido_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_almacentejido_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
         {
            subGridlevel_almacentejido_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
            {
               subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_almacentejido_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_almacentejido_Class, "") != 0 )
            {
               subGridlevel_almacentejido_Linesclass = subGridlevel_almacentejido_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 75,'" + sPrefix + "',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilos_Internalname,GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtKilos_Enabled!=0) ? localUtil.format( A595Kilos, "ZZZZZ9.99") : localUtil.format( A595Kilos, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtKilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 76,'" + sPrefix + "',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMetros_Enabled!=0) ? localUtil.format( A631Metros, "ZZZZZ9.99") : localUtil.format( A631Metros, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_35_" + sGXsfl_73_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'" + sGXsfl_73_idx + "',73)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPiezas_Internalname,GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPiezas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPiezas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPiezas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieDis_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniDis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniEnt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRUniUti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieEnt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRPieUti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "ALBRUNI_" + sGXsfl_73_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      /* ComboBox */
      Gridlevel_almacentejidoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbRUni.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_73_Refreshing);
      /* Subfile cell */
      GXCCtl = "ALBREST_" + sGXsfl_73_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
      }
      /* ComboBox */
      Gridlevel_almacentejidoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbAlbREst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_73_Refreshing);
      /* Subfile cell */
      GXCCtl = "ALBRREO_" + sGXsfl_73_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
      }
      /* ComboBox */
      Gridlevel_almacentejidoRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbAlbRReo.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_73_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRef_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRGrm2_Internalname,GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4920AlbRGrm2), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRGrm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRGrm2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_almacentejidoRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4921AlbRAnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbRAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_almacentejidoRow);
      send_integrity_lvl_hashes1P635( ) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z595Kilos_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z631Metros_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z673Piezas_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( Z673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_35_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_35_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_35_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_35, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_73_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+GXCCtl, AV144TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+GXCCtl, AV144TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.rtrim( AV45EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_73_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( AV36DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRECCOD_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"KILOS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"METROS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PIEZAS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRPIEDIS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRUNIDIS_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRUNIENT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRUNIUTI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRPIEENT_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRPIEUTI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRUNI_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBREST_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRREO_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBREF_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRGRM2_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRGrm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBRANC_"+sGXsfl_73_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDLEVEL_ALMACENTEJIDO_"+sGXsfl_73_idx+"Visible", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Visible, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_almacentejidoContainer.AddRow(Gridlevel_almacentejidoRow);
   }

   public void readRow1P635( )
   {
      nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7335( ) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRECCOD_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtKilos_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"KILOS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMetros_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"METROS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPiezas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"PIEZAS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRPIEDIS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniDis_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNIDIS_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNIENT_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRUniUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNIUTI_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRPIEENT_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRPieUti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRPIEUTI_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbRUni.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRUNI_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbAlbREst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBREST_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbAlbRReo.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRREO_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtAlbRef_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBREF_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRGrm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRGRM2_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"ALBRANC_"+sGXsfl_73_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         wbErr = true ;
         A44AlbRecCod = 0 ;
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "KILOS_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtKilos_Internalname ;
         wbErr = true ;
         A595Kilos = DecimalUtil.ZERO ;
      }
      else
      {
         A595Kilos = localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "METROS_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMetros_Internalname ;
         wbErr = true ;
         A631Metros = DecimalUtil.ZERO ;
      }
      else
      {
         A631Metros = localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PIEZAS_" + sGXsfl_73_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPiezas_Internalname ;
         wbErr = true ;
         A673Piezas = 0 ;
      }
      else
      {
         A673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
      A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
      A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
      A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
      cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
      A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
      cmbAlbREst.setName( cmbAlbREst.getInternalname() );
      cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
      A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
      cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
      cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
      A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
      A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
      A4920AlbRGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A4921AlbRAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_73_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z595Kilos_" + sGXsfl_73_idx ;
      Z595Kilos = localUtil.ctond( httpContext.cgiGet( sPrefix+GXCCtl)) ;
      GXCCtl = "Z631Metros_" + sGXsfl_73_idx ;
      Z631Metros = localUtil.ctond( httpContext.cgiGet( sPrefix+GXCCtl)) ;
      GXCCtl = "Z673Piezas_" + sGXsfl_73_idx ;
      Z673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_35_" + sGXsfl_73_idx ;
      nRcdDeleted_35 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_35_" + sGXsfl_73_idx ;
      nRcdExists_35 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_35_" + sGXsfl_73_idx ;
      nIsMod_35 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRecCod_Enabled = edtAlbRecCod_Enabled ;
   }

   public void confirmValues1P60( )
   {
      nGXsfl_73_idx = 0 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_7335( ) ;
      while ( nGXsfl_73_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7335( ) ;
         httpContext.changePostValue( sPrefix+"Z44AlbRecCod_"+sGXsfl_73_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z44AlbRecCod_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z44AlbRecCod_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( sPrefix+"Z595Kilos_"+sGXsfl_73_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z595Kilos_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z595Kilos_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( sPrefix+"Z631Metros_"+sGXsfl_73_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z631Metros_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z631Metros_"+sGXsfl_73_idx) ;
         httpContext.changePostValue( sPrefix+"Z673Piezas_"+sGXsfl_73_idx, httpContext.cgiGet( sPrefix+"ZT_"+"Z673Piezas_"+sGXsfl_73_idx)) ;
         httpContext.deletePostValue( sPrefix+"ZT_"+"Z673Piezas_"+sGXsfl_73_idx) ;
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
         httpContext.writeValue( httpContext.getMessage( "Nw DPAlmacen Tejido", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpalmacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV45EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"NwDPAlmacenTejido");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("nwdpalmacentejido:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z335DisArtCod", GXutil.rtrim( Z335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z1430DisLoc", GXutil.rtrim( Z1430DisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z360DisCliNum", GXutil.rtrim( Z360DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOGx_mode", GXutil.rtrim( wcpOGx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45EmprCod", GXutil.rtrim( wcpOAV45EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36DisCod", GXutil.ltrim( localUtil.ntoc( wcpOAV36DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"O13733DisTotRec", GXutil.ltrim( localUtil.ntoc( O13733DisTotRec, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nGXsfl_73_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODE", GXutil.rtrim( Gx_mode));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTRNCONTEXT", AV144TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTRNCONTEXT", AV144TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTRNCONTEXT", getSecureSignedToken( sPrefix, AV144TrnContext));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vPROCESOREALIZADO", AV129ProcesoRealizado);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV45EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDISCOD", GXutil.ltrim( localUtil.ntoc( AV36DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV67Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV154Pgmname));
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

   public void renderHtmlCloseForm1P634( )
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
      return "NwDPAlmacenTejido" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nw DPAlmacen Tejido", "") ;
   }

   public void initializeNonKey1P634( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A365DisDes", A365DisDes);
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A335DisArtCod", A335DisArtCod);
      A13733DisTotRec = 0 ;
      n13733DisTotRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A392DisUniMed", A392DisUniMed);
      A1430DisLoc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1430DisLoc", A1430DisLoc);
      A360DisCliNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A360DisCliNum", A360DisCliNum);
      A13732DisCanRec = (short)(0) ;
      n13732DisCanRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13732DisCanRec), 4, 0));
      O13733DisTotRec = A13733DisTotRec ;
      n13733DisTotRec = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13733DisTotRec), 8, 0));
      Z365DisDes = "" ;
      Z335DisArtCod = "" ;
      Z392DisUniMed = "" ;
      Z1430DisLoc = "" ;
      Z360DisCliNum = "" ;
      Z252CliCod = 0 ;
   }

   public void initAll1P634( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      initializeNonKey1P634( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1P635( )
   {
      A51AlbRPieDis = 0 ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A673Piezas = 0 ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A52AlbRPieEnt = 0 ;
      A54AlbRPieUti = 0 ;
      A56AlbRUni = "" ;
      A47AlbREst = (byte)(0) ;
      A55AlbRReo = "" ;
      A45AlbRef = "" ;
      A4920AlbRGrm2 = (short)(0) ;
      A4921AlbRAnc = (short)(0) ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      Z673Piezas = 0 ;
   }

   public void initAll1P635( )
   {
      A44AlbRecCod = 0 ;
      initializeNonKey1P635( ) ;
   }

   public void standaloneModalInsert1P635( )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlGx_mode = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV45EmprCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV36DisCod = (String)getParm(obj,2,TypeConstants.STRING) ;
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
      httpContext.AddComponentObject(sPrefix, "nwdpalmacentejido", GetJustCreated( ));
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
         AV45EmprCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45EmprCod", AV45EmprCod);
         AV36DisCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36DisCod), 8, 0));
      }
      wcpOGx_mode = httpContext.cgiGet( sPrefix+"wcpOGx_mode") ;
      wcpOAV45EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV45EmprCod") ;
      wcpOAV36DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(Gx_mode, wcpOGx_mode) != 0 ) || ( GXutil.strcmp(AV45EmprCod, wcpOAV45EmprCod) != 0 ) || ( AV36DisCod != wcpOAV36DisCod ) ) )
      {
         setjustcreated();
      }
      wcpOGx_mode = Gx_mode ;
      wcpOAV45EmprCod = AV45EmprCod ;
      wcpOAV36DisCod = AV36DisCod ;
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
      sCtrlAV45EmprCod = httpContext.cgiGet( sPrefix+"AV45EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV45EmprCod) > 0 )
      {
         AV45EmprCod = httpContext.cgiGet( sCtrlAV45EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45EmprCod", AV45EmprCod);
      }
      else
      {
         AV45EmprCod = httpContext.cgiGet( sPrefix+"AV45EmprCod_PARM") ;
      }
      sCtrlAV36DisCod = httpContext.cgiGet( sPrefix+"AV36DisCod_CTRL") ;
      if ( GXutil.len( sCtrlAV36DisCod) > 0 )
      {
         AV36DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36DisCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36DisCod), 8, 0));
      }
      else
      {
         AV36DisCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36DisCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45EmprCod_PARM", GXutil.rtrim( AV45EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45EmprCod_CTRL", GXutil.rtrim( sCtrlAV45EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36DisCod_PARM", GXutil.ltrim( localUtil.ntoc( AV36DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36DisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36DisCod_CTRL", GXutil.rtrim( sCtrlAV36DisCod));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115571362", true, true);
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
      httpContext.AddJavascriptSource("nwdpalmacentejido.js", "?202682115571362", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties35( )
   {
      edtAlbRecCod_Enabled = defedtAlbRecCod_Enabled ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void startgridcontrol73( )
   {
      Gridlevel_almacentejidoContainer.AddObjectProperty("GridName", "Gridlevel_almacentejido");
      Gridlevel_almacentejidoContainer.AddObjectProperty("Header", subGridlevel_almacentejido_Header);
      Gridlevel_almacentejidoContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_almacentejidoContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Visible, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridlevel_almacentejidoContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtKilos_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMetros_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPiezas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniDis_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbREst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRGrm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_almacentejidoColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddColumnProperties(Gridlevel_almacentejidoColumn);
      Gridlevel_almacentejidoContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_almacentejidoContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_almacentejido_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtDisCod_Internalname = sPrefix+"DISCOD" ;
      chkDisDes.setInternalname( sPrefix+"DISDES" );
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtDisArtCod_Internalname = sPrefix+"DISARTCOD" ;
      edtDisTotRec_Internalname = sPrefix+"DISTOTREC" ;
      edtDisUniMed_Internalname = sPrefix+"DISUNIMED" ;
      edtDisLoc_Internalname = sPrefix+"DISLOC" ;
      edtDisCliNum_Internalname = sPrefix+"DISCLINUM" ;
      edtDisCanRec_Internalname = sPrefix+"DISCANREC" ;
      divTableattributes_Internalname = sPrefix+"TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = sPrefix+"DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      edtKilos_Internalname = sPrefix+"KILOS" ;
      edtMetros_Internalname = sPrefix+"METROS" ;
      edtPiezas_Internalname = sPrefix+"PIEZAS" ;
      edtAlbRPieDis_Internalname = sPrefix+"ALBRPIEDIS" ;
      edtAlbRUniDis_Internalname = sPrefix+"ALBRUNIDIS" ;
      edtAlbRUniEnt_Internalname = sPrefix+"ALBRUNIENT" ;
      edtAlbRUniUti_Internalname = sPrefix+"ALBRUNIUTI" ;
      edtAlbRPieEnt_Internalname = sPrefix+"ALBRPIEENT" ;
      edtAlbRPieUti_Internalname = sPrefix+"ALBRPIEUTI" ;
      cmbAlbRUni.setInternalname( sPrefix+"ALBRUNI" );
      cmbAlbREst.setInternalname( sPrefix+"ALBREST" );
      cmbAlbRReo.setInternalname( sPrefix+"ALBRREO" );
      edtAlbRef_Internalname = sPrefix+"ALBREF" ;
      edtAlbRGrm2_Internalname = sPrefix+"ALBRGRM2" ;
      edtAlbRAnc_Internalname = sPrefix+"ALBRANC" ;
      divTableleaflevel_almacentejido_Internalname = sPrefix+"TABLELEAFLEVEL_ALMACENTEJIDO" ;
      bttBtntrn_enter_Internalname = sPrefix+"BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = sPrefix+"BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = sPrefix+"BTNTRN_DELETE" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridlevel_almacentejido_Internalname = sPrefix+"GRIDLEVEL_ALMACENTEJIDO" ;
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
      subGridlevel_almacentejido_Allowcollapsing = (byte)(0) ;
      subGridlevel_almacentejido_Allowselection = (byte)(0) ;
      subGridlevel_almacentejido_Header = "" ;
      edtAlbRAnc_Jsonclick = "" ;
      edtAlbRGrm2_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbREst.setJsonclick( "" );
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtPiezas_Jsonclick = "" ;
      edtMetros_Jsonclick = "" ;
      edtKilos_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      subGridlevel_almacentejido_Class = "GridNoBorder WorkWith" ;
      subGridlevel_almacentejido_Backcolorstyle = (byte)(0) ;
      subGridlevel_almacentejido_Visible = 1 ;
      edtAlbRAnc_Enabled = 0 ;
      edtAlbRGrm2_Enabled = 0 ;
      edtAlbRef_Enabled = 0 ;
      cmbAlbRReo.setEnabled( 0 );
      cmbAlbREst.setEnabled( 0 );
      cmbAlbRUni.setEnabled( 0 );
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Enabled = 0 ;
      edtPiezas_Enabled = 1 ;
      edtMetros_Enabled = 1 ;
      edtKilos_Enabled = 1 ;
      edtAlbRecCod_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDisCanRec_Jsonclick = "" ;
      edtDisCanRec_Enabled = 0 ;
      edtDisCliNum_Jsonclick = "" ;
      edtDisCliNum_Enabled = 1 ;
      edtDisLoc_Jsonclick = "" ;
      edtDisLoc_Enabled = 1 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Enabled = 1 ;
      edtDisTotRec_Jsonclick = "" ;
      edtDisTotRec_Enabled = 0 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      chkDisDes.setEnabled( 1 );
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
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

   public void gxnrgridlevel_almacentejido_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "Gx_mode", Gx_mode);
      subsflControlProps_7335( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1P635( ) ;
         standaloneModal1P635( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1P635( ) ;
         nGXsfl_73_idx = (int)(nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_7335( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_almacentejidoContainer)) ;
      /* End function gxnrGridlevel_almacentejido_newrow */
   }

   public void init_web_controls( )
   {
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      GXCCtl = "ALBRUNI_" + sGXsfl_73_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBREST_" + sGXsfl_73_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
      }
      GXCCtl = "ALBRREO_" + sGXsfl_73_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
      }
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
      n13733DisTotRec = false ;
      n13732DisCanRec = false ;
      /* Using cursor T01P625 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A13733DisTotRec = T01P625_A13733DisTotRec[0] ;
         n13733DisTotRec = T01P625_n13733DisTotRec[0] ;
      }
      else
      {
         A13733DisTotRec = 0 ;
         n13733DisTotRec = false ;
      }
      pr_default.close(16);
      subGridlevel_almacentejido_Visible = (((A13733DisTotRec>0)) ? 1 : 0) ;
      /* Using cursor T01P627 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A13732DisCanRec = T01P627_A13732DisCanRec[0] ;
         n13732DisCanRec = T01P627_n13732DisCanRec[0] ;
      }
      else
      {
         A13732DisCanRec = (short)(0) ;
         n13732DisCanRec = false ;
      }
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13733DisTotRec", GXutil.ltrim( localUtil.ntoc( A13733DisTotRec, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"Gridlevel_almacentejidoContainerDiv", "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridlevel_almacentejido_Visible), 5, 0), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13732DisCanRec", GXutil.ltrim( localUtil.ntoc( A13732DisCanRec, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Albreccod( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      /* Using cursor T01P647 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Recepcion Inexistente", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A58AlbRUniEnt = T01P647_A58AlbRUniEnt[0] ;
      A60AlbRUniUti = T01P647_A60AlbRUniUti[0] ;
      A52AlbRPieEnt = T01P647_A52AlbRPieEnt[0] ;
      A54AlbRPieUti = T01P647_A54AlbRPieUti[0] ;
      A56AlbRUni = T01P647_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A47AlbREst = T01P647_A47AlbREst[0] ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      A55AlbRReo = T01P647_A55AlbRReo[0] ;
      cmbAlbRReo.setValue( A55AlbRReo );
      A45AlbRef = T01P647_A45AlbRef[0] ;
      A4920AlbRGrm2 = T01P647_A4920AlbRGrm2[0] ;
      A4921AlbRAnc = T01P647_A4921AlbRAnc[0] ;
      pr_default.close(37);
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4920AlbRGrm2", GXutil.ltrim( localUtil.ntoc( A4920AlbRGrm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4921AlbRAnc", GXutil.ltrim( localUtil.ntoc( A4921AlbRAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'componentprocess',iparms:[{postForm:true},{sPrefix:true},{sSFPrefix:true},{sCompEvt:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV45EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV144TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e121P62',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV144TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VCONSULTA.CLICK","{handler:'e131P62',iparms:[{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VCONSULTA.CLICK",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A13733DisTotRec',fld:'DISTOTREC',pic:'ZZZZZZZ9'},{av:'A13732DisCanRec',fld:'DISCANREC',pic:'ZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A13733DisTotRec',fld:'DISTOTREC',pic:'ZZZZZZZ9'},{av:'subGridlevel_almacentejido_Visible',ctrl:'GRIDLEVEL_ALMACENTEJIDO',prop:'Visible'},{av:'A13732DisCanRec',fld:'DISCANREC',pic:'ZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISDES",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISTOTREC","{handler:'valid_Distotrec',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISTOTREC",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A4920AlbRGrm2',fld:'ALBRGRM2',pic:'ZZZ9'},{av:'A4921AlbRAnc',fld:'ALBRANC',pic:'ZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_KILOS","{handler:'valid_Kilos',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_KILOS",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Albranc',iparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("NULL",",oparms:[{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
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
      pr_default.close(37);
      pr_default.close(16);
      pr_default.close(17);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV45EmprCod = "" ;
      Z396EmprCod = "" ;
      Z365DisDes = "" ;
      Z335DisArtCod = "" ;
      Z392DisUniMed = "" ;
      Z1430DisLoc = "" ;
      Z360DisCliNum = "" ;
      Z595Kilos = DecimalUtil.ZERO ;
      Z631Metros = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV45EmprCod = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sXEvt = "" ;
      GX_FocusControl = "" ;
      A365DisDes = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A335DisArtCod = "" ;
      A392DisUniMed = "" ;
      A1430DisLoc = "" ;
      A360DisCliNum = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_almacentejidoContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode35 = "" ;
      sStyleString = "" ;
      AV154Pgmname = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode34 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A55AlbRReo = "" ;
      A45AlbRef = "" ;
      T01P66_A13732DisCanRec = new short[1] ;
      T01P66_n13732DisCanRec = new boolean[] {false} ;
      AV153OK = "" ;
      AV134Station = "" ;
      GXv_char2 = new String[1] ;
      AV46EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV146UsurCod = "" ;
      AV152WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV144TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV150WebSession = httpContext.getWebSession();
      AV145TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV113Msg3 = "" ;
      GXt_char1 = "" ;
      AV124Piezas = "" ;
      AV29Consulta = "" ;
      AV10AlbRef = "" ;
      AV151Window = new com.genexus.webpanels.GXWindow();
      T01P610_A13733DisTotRec = new int[1] ;
      T01P610_n13733DisTotRec = new boolean[] {false} ;
      T01P613_A361DisCod = new int[1] ;
      T01P613_A365DisDes = new String[] {""} ;
      T01P613_A335DisArtCod = new String[] {""} ;
      T01P613_A392DisUniMed = new String[] {""} ;
      T01P613_A1430DisLoc = new String[] {""} ;
      T01P613_A360DisCliNum = new String[] {""} ;
      T01P613_A396EmprCod = new String[] {""} ;
      T01P613_A252CliCod = new int[1] ;
      T01P613_A13733DisTotRec = new int[1] ;
      T01P613_n13733DisTotRec = new boolean[] {false} ;
      T01P613_A13732DisCanRec = new short[1] ;
      T01P613_n13732DisCanRec = new boolean[] {false} ;
      T01P615_A13733DisTotRec = new int[1] ;
      T01P615_n13733DisTotRec = new boolean[] {false} ;
      T01P617_A13732DisCanRec = new short[1] ;
      T01P617_n13732DisCanRec = new boolean[] {false} ;
      T01P618_A396EmprCod = new String[] {""} ;
      T01P618_A361DisCod = new int[1] ;
      T01P68_A361DisCod = new int[1] ;
      T01P68_A365DisDes = new String[] {""} ;
      T01P68_A335DisArtCod = new String[] {""} ;
      T01P68_A392DisUniMed = new String[] {""} ;
      T01P68_A1430DisLoc = new String[] {""} ;
      T01P68_A360DisCliNum = new String[] {""} ;
      T01P68_A396EmprCod = new String[] {""} ;
      T01P68_A252CliCod = new int[1] ;
      T01P619_A396EmprCod = new String[] {""} ;
      T01P619_A361DisCod = new int[1] ;
      T01P620_A396EmprCod = new String[] {""} ;
      T01P620_A361DisCod = new int[1] ;
      T01P67_A361DisCod = new int[1] ;
      T01P67_A365DisDes = new String[] {""} ;
      T01P67_A335DisArtCod = new String[] {""} ;
      T01P67_A392DisUniMed = new String[] {""} ;
      T01P67_A1430DisLoc = new String[] {""} ;
      T01P67_A360DisCliNum = new String[] {""} ;
      T01P67_A396EmprCod = new String[] {""} ;
      T01P67_A252CliCod = new int[1] ;
      T01P625_A13733DisTotRec = new int[1] ;
      T01P625_n13733DisTotRec = new boolean[] {false} ;
      T01P627_A13732DisCanRec = new short[1] ;
      T01P627_n13732DisCanRec = new boolean[] {false} ;
      T01P628_A396EmprCod = new String[] {""} ;
      T01P628_A361DisCod = new int[1] ;
      T01P628_A13376DisTraID = new String[] {""} ;
      T01P629_A396EmprCod = new String[] {""} ;
      T01P629_A361DisCod = new int[1] ;
      T01P629_A13213DisNormID = new String[] {""} ;
      T01P630_A396EmprCod = new String[] {""} ;
      T01P630_A361DisCod = new int[1] ;
      T01P630_A13081DisDGLin = new byte[1] ;
      T01P630_A13082DisDGDibCl = new String[] {""} ;
      T01P630_A13083DisDGDibIn = new int[1] ;
      T01P630_A13084DisDGComb = new String[] {""} ;
      T01P630_A13085DisDGFondo = new String[] {""} ;
      T01P631_A396EmprCod = new String[] {""} ;
      T01P631_A361DisCod = new int[1] ;
      T01P631_A7068DisNotLin = new byte[1] ;
      T01P632_A396EmprCod = new String[] {""} ;
      T01P632_A361DisCod = new int[1] ;
      T01P632_A10197ProEspCod = new String[] {""} ;
      T01P633_A396EmprCod = new String[] {""} ;
      T01P633_A361DisCod = new int[1] ;
      T01P633_A4594AccCod = new short[1] ;
      T01P634_A396EmprCod = new String[] {""} ;
      T01P634_A361DisCod = new int[1] ;
      T01P634_A2524DisComLin = new byte[1] ;
      T01P634_A1056DisComCod = new String[] {""} ;
      T01P634_A1032FonCod = new String[] {""} ;
      T01P635_A396EmprCod = new String[] {""} ;
      T01P635_A361DisCod = new int[1] ;
      T01P635_A3398DisRefBarC = new int[1] ;
      T01P635_A3399DisRefBCRe = new byte[1] ;
      T01P635_A3400DisRefBCPa = new String[] {""} ;
      T01P635_A3607DisRefBPie = new String[] {""} ;
      T01P636_A396EmprCod = new String[] {""} ;
      T01P636_A361DisCod = new int[1] ;
      T01P636_A376DisObsLin = new byte[1] ;
      T01P637_A396EmprCod = new String[] {""} ;
      T01P637_A361DisCod = new int[1] ;
      T01P637_A758ProCod = new String[] {""} ;
      T01P638_A396EmprCod = new String[] {""} ;
      T01P638_A361DisCod = new int[1] ;
      T01P638_A833TipDefCod = new short[1] ;
      T01P639_A396EmprCod = new String[] {""} ;
      T01P639_A361DisCod = new int[1] ;
      T01P639_A44AlbRecCod = new int[1] ;
      T01P639_A380DisPieCod = new String[] {""} ;
      T01P640_A396EmprCod = new String[] {""} ;
      T01P640_A361DisCod = new int[1] ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z55AlbRReo = "" ;
      Z45AlbRef = "" ;
      T01P641_A361DisCod = new int[1] ;
      T01P641_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P641_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P641_A673Piezas = new int[1] ;
      T01P641_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P641_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P641_A52AlbRPieEnt = new int[1] ;
      T01P641_A54AlbRPieUti = new int[1] ;
      T01P641_A56AlbRUni = new String[] {""} ;
      T01P641_A47AlbREst = new byte[1] ;
      T01P641_A55AlbRReo = new String[] {""} ;
      T01P641_A45AlbRef = new String[] {""} ;
      T01P641_A4920AlbRGrm2 = new short[1] ;
      T01P641_A4921AlbRAnc = new short[1] ;
      T01P641_A396EmprCod = new String[] {""} ;
      T01P641_A44AlbRecCod = new int[1] ;
      T01P64_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P64_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P64_A52AlbRPieEnt = new int[1] ;
      T01P64_A54AlbRPieUti = new int[1] ;
      T01P64_A56AlbRUni = new String[] {""} ;
      T01P64_A47AlbREst = new byte[1] ;
      T01P64_A55AlbRReo = new String[] {""} ;
      T01P64_A45AlbRef = new String[] {""} ;
      T01P64_A4920AlbRGrm2 = new short[1] ;
      T01P64_A4921AlbRAnc = new short[1] ;
      T01P642_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P642_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P642_A52AlbRPieEnt = new int[1] ;
      T01P642_A54AlbRPieUti = new int[1] ;
      T01P642_A56AlbRUni = new String[] {""} ;
      T01P642_A47AlbREst = new byte[1] ;
      T01P642_A55AlbRReo = new String[] {""} ;
      T01P642_A45AlbRef = new String[] {""} ;
      T01P642_A4920AlbRGrm2 = new short[1] ;
      T01P642_A4921AlbRAnc = new short[1] ;
      T01P643_A396EmprCod = new String[] {""} ;
      T01P643_A361DisCod = new int[1] ;
      T01P643_A44AlbRecCod = new int[1] ;
      T01P63_A361DisCod = new int[1] ;
      T01P63_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P63_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P63_A673Piezas = new int[1] ;
      T01P63_A396EmprCod = new String[] {""} ;
      T01P63_A44AlbRecCod = new int[1] ;
      T01P62_A361DisCod = new int[1] ;
      T01P62_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P62_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P62_A673Piezas = new int[1] ;
      T01P62_A396EmprCod = new String[] {""} ;
      T01P62_A44AlbRecCod = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      T01P647_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P647_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P647_A52AlbRPieEnt = new int[1] ;
      T01P647_A54AlbRPieUti = new int[1] ;
      T01P647_A56AlbRUni = new String[] {""} ;
      T01P647_A47AlbREst = new byte[1] ;
      T01P647_A55AlbRReo = new String[] {""} ;
      T01P647_A45AlbRef = new String[] {""} ;
      T01P647_A4920AlbRGrm2 = new short[1] ;
      T01P647_A4921AlbRAnc = new short[1] ;
      T01P648_A396EmprCod = new String[] {""} ;
      T01P648_A361DisCod = new int[1] ;
      T01P648_A44AlbRecCod = new int[1] ;
      T01P648_A9756Dis_CUb = new String[] {""} ;
      T01P649_A396EmprCod = new String[] {""} ;
      T01P649_A361DisCod = new int[1] ;
      T01P649_A44AlbRecCod = new int[1] ;
      T01P649_A380DisPieCod = new String[] {""} ;
      T01P650_A396EmprCod = new String[] {""} ;
      T01P650_A361DisCod = new int[1] ;
      T01P650_A44AlbRecCod = new int[1] ;
      Gridlevel_almacentejidoRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_almacentejido_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      sCtrlGx_mode = "" ;
      sCtrlAV45EmprCod = "" ;
      sCtrlAV36DisCod = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gridlevel_almacentejidoColumn = new com.genexus.webpanels.GXWebColumn();
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejido__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejido__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejido__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejido__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpalmacentejido__default(),
         new Object[] {
             new Object[] {
            T01P62_A361DisCod, T01P62_A595Kilos, T01P62_A631Metros, T01P62_A673Piezas, T01P62_A396EmprCod, T01P62_A44AlbRecCod
            }
            , new Object[] {
            T01P63_A361DisCod, T01P63_A595Kilos, T01P63_A631Metros, T01P63_A673Piezas, T01P63_A396EmprCod, T01P63_A44AlbRecCod
            }
            , new Object[] {
            T01P64_A58AlbRUniEnt, T01P64_A60AlbRUniUti, T01P64_A52AlbRPieEnt, T01P64_A54AlbRPieUti, T01P64_A56AlbRUni, T01P64_A47AlbREst, T01P64_A55AlbRReo, T01P64_A45AlbRef, T01P64_A4920AlbRGrm2, T01P64_A4921AlbRAnc
            }
            , new Object[] {
            T01P66_A13732DisCanRec, T01P66_n13732DisCanRec
            }
            , new Object[] {
            T01P67_A361DisCod, T01P67_A365DisDes, T01P67_A335DisArtCod, T01P67_A392DisUniMed, T01P67_A1430DisLoc, T01P67_A360DisCliNum, T01P67_A396EmprCod, T01P67_A252CliCod
            }
            , new Object[] {
            T01P68_A361DisCod, T01P68_A365DisDes, T01P68_A335DisArtCod, T01P68_A392DisUniMed, T01P68_A1430DisLoc, T01P68_A360DisCliNum, T01P68_A396EmprCod, T01P68_A252CliCod
            }
            , new Object[] {
            T01P610_A13733DisTotRec, T01P610_n13733DisTotRec
            }
            , new Object[] {
            T01P613_A361DisCod, T01P613_A365DisDes, T01P613_A335DisArtCod, T01P613_A392DisUniMed, T01P613_A1430DisLoc, T01P613_A360DisCliNum, T01P613_A396EmprCod, T01P613_A252CliCod, T01P613_A13733DisTotRec, T01P613_n13733DisTotRec,
            T01P613_A13732DisCanRec, T01P613_n13732DisCanRec
            }
            , new Object[] {
            T01P615_A13733DisTotRec, T01P615_n13733DisTotRec
            }
            , new Object[] {
            T01P617_A13732DisCanRec, T01P617_n13732DisCanRec
            }
            , new Object[] {
            T01P618_A396EmprCod, T01P618_A361DisCod
            }
            , new Object[] {
            T01P619_A396EmprCod, T01P619_A361DisCod
            }
            , new Object[] {
            T01P620_A396EmprCod, T01P620_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P625_A13733DisTotRec, T01P625_n13733DisTotRec
            }
            , new Object[] {
            T01P627_A13732DisCanRec, T01P627_n13732DisCanRec
            }
            , new Object[] {
            T01P628_A396EmprCod, T01P628_A361DisCod, T01P628_A13376DisTraID
            }
            , new Object[] {
            T01P629_A396EmprCod, T01P629_A361DisCod, T01P629_A13213DisNormID
            }
            , new Object[] {
            T01P630_A396EmprCod, T01P630_A361DisCod, T01P630_A13081DisDGLin, T01P630_A13082DisDGDibCl, T01P630_A13083DisDGDibIn, T01P630_A13084DisDGComb, T01P630_A13085DisDGFondo
            }
            , new Object[] {
            T01P631_A396EmprCod, T01P631_A361DisCod, T01P631_A7068DisNotLin
            }
            , new Object[] {
            T01P632_A396EmprCod, T01P632_A361DisCod, T01P632_A10197ProEspCod
            }
            , new Object[] {
            T01P633_A396EmprCod, T01P633_A361DisCod, T01P633_A4594AccCod
            }
            , new Object[] {
            T01P634_A396EmprCod, T01P634_A361DisCod, T01P634_A2524DisComLin, T01P634_A1056DisComCod, T01P634_A1032FonCod
            }
            , new Object[] {
            T01P635_A396EmprCod, T01P635_A361DisCod, T01P635_A3398DisRefBarC, T01P635_A3399DisRefBCRe, T01P635_A3400DisRefBCPa, T01P635_A3607DisRefBPie
            }
            , new Object[] {
            T01P636_A396EmprCod, T01P636_A361DisCod, T01P636_A376DisObsLin
            }
            , new Object[] {
            T01P637_A396EmprCod, T01P637_A361DisCod, T01P637_A758ProCod
            }
            , new Object[] {
            T01P638_A396EmprCod, T01P638_A361DisCod, T01P638_A833TipDefCod
            }
            , new Object[] {
            T01P639_A396EmprCod, T01P639_A361DisCod, T01P639_A44AlbRecCod, T01P639_A380DisPieCod
            }
            , new Object[] {
            T01P640_A396EmprCod, T01P640_A361DisCod
            }
            , new Object[] {
            T01P641_A361DisCod, T01P641_A595Kilos, T01P641_A631Metros, T01P641_A673Piezas, T01P641_A58AlbRUniEnt, T01P641_A60AlbRUniUti, T01P641_A52AlbRPieEnt, T01P641_A54AlbRPieUti, T01P641_A56AlbRUni, T01P641_A47AlbREst,
            T01P641_A55AlbRReo, T01P641_A45AlbRef, T01P641_A4920AlbRGrm2, T01P641_A4921AlbRAnc, T01P641_A396EmprCod, T01P641_A44AlbRecCod
            }
            , new Object[] {
            T01P642_A58AlbRUniEnt, T01P642_A60AlbRUniUti, T01P642_A52AlbRPieEnt, T01P642_A54AlbRPieUti, T01P642_A56AlbRUni, T01P642_A47AlbREst, T01P642_A55AlbRReo, T01P642_A45AlbRef, T01P642_A4920AlbRGrm2, T01P642_A4921AlbRAnc
            }
            , new Object[] {
            T01P643_A396EmprCod, T01P643_A361DisCod, T01P643_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P647_A58AlbRUniEnt, T01P647_A60AlbRUniUti, T01P647_A52AlbRPieEnt, T01P647_A54AlbRPieUti, T01P647_A56AlbRUni, T01P647_A47AlbREst, T01P647_A55AlbRReo, T01P647_A45AlbRef, T01P647_A4920AlbRGrm2, T01P647_A4921AlbRAnc
            }
            , new Object[] {
            T01P648_A396EmprCod, T01P648_A361DisCod, T01P648_A44AlbRecCod, T01P648_A9756Dis_CUb
            }
            , new Object[] {
            T01P649_A396EmprCod, T01P649_A361DisCod, T01P649_A44AlbRecCod, T01P649_A380DisPieCod
            }
            , new Object[] {
            T01P650_A396EmprCod, T01P650_A361DisCod, T01P650_A44AlbRecCod
            }
         }
      );
      AV154Pgmname = "NwDPAlmacenTejido" ;
   }

   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nKeyPressed ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A47AlbREst ;
   private byte Gx_BScreen ;
   private byte Z47AlbREst ;
   private byte subGridlevel_almacentejido_Backcolorstyle ;
   private byte subGridlevel_almacentejido_Backstyle ;
   private byte subGridlevel_almacentejido_Allowselection ;
   private byte subGridlevel_almacentejido_Allowhovering ;
   private byte subGridlevel_almacentejido_Allowcollapsing ;
   private byte subGridlevel_almacentejido_Collapsed ;
   private short nRcdDeleted_35 ;
   private short nRcdExists_35 ;
   private short nIsMod_35 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13732DisCanRec ;
   private short nBlankRcdCount35 ;
   private short RcdFound35 ;
   private short nBlankRcdUsr35 ;
   private short RcdFound34 ;
   private short A4920AlbRGrm2 ;
   private short A4921AlbRAnc ;
   private short Z13732DisCanRec ;
   private short nIsDirty_34 ;
   private short Z4920AlbRGrm2 ;
   private short Z4921AlbRAnc ;
   private short nIsDirty_35 ;
   private int wcpOAV36DisCod ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int O13733DisTotRec ;
   private int nRC_GXsfl_73 ;
   private int nGXsfl_73_idx=1 ;
   private int N252CliCod ;
   private int Z44AlbRecCod ;
   private int Z673Piezas ;
   private int AV36DisCod ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int A13733DisTotRec ;
   private int edtDisTotRec_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtDisLoc_Enabled ;
   private int edtDisCliNum_Enabled ;
   private int edtDisCanRec_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int B13733DisTotRec ;
   private int edtAlbRecCod_Enabled ;
   private int edtKilos_Enabled ;
   private int edtMetros_Enabled ;
   private int edtPiezas_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRPieUti_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtAlbRGrm2_Enabled ;
   private int edtAlbRAnc_Enabled ;
   private int fRowAdded ;
   private int subGridlevel_almacentejido_Visible ;
   private int AV67Insert_CliCod ;
   private int s13733DisTotRec ;
   private int A673Piezas ;
   private int A51AlbRPieDis ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV155GXV1 ;
   private int AV9AlbRecCod ;
   private int GXt_int6 ;
   private int AV25Clicod ;
   private int GX_JID ;
   private int Z13733DisTotRec ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int GXv_int7[] ;
   private int subGridlevel_almacentejido_Backcolor ;
   private int subGridlevel_almacentejido_Allbackcolor ;
   private int defedtAlbRecCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_almacentejido_Selectedindex ;
   private int subGridlevel_almacentejido_Selectioncolor ;
   private int subGridlevel_almacentejido_Hoveringcolor ;
   private int Z51AlbRPieDis ;
   private long GRIDLEVEL_ALMACENTEJIDO_nFirstRecordOnPage ;
   private java.math.BigDecimal Z595Kilos ;
   private java.math.BigDecimal Z631Metros ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV45EmprCod ;
   private String Z396EmprCod ;
   private String Z365DisDes ;
   private String Z335DisArtCod ;
   private String Z392DisUniMed ;
   private String Z1430DisLoc ;
   private String Z360DisCliNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String Gx_mode ;
   private String AV45EmprCod ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sXEvt ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_73_idx="0001" ;
   private String A365DisDes ;
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
   private String TempTags ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtDisArtCod_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisTotRec_Internalname ;
   private String edtDisTotRec_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String edtDisLoc_Internalname ;
   private String A1430DisLoc ;
   private String edtDisLoc_Jsonclick ;
   private String edtDisCliNum_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Jsonclick ;
   private String edtDisCanRec_Internalname ;
   private String edtDisCanRec_Jsonclick ;
   private String divTableleaflevel_almacentejido_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode35 ;
   private String edtAlbRecCod_Internalname ;
   private String edtKilos_Internalname ;
   private String edtMetros_Internalname ;
   private String edtPiezas_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRef_Internalname ;
   private String edtAlbRGrm2_Internalname ;
   private String edtAlbRAnc_Internalname ;
   private String sStyleString ;
   private String subGridlevel_almacentejido_Internalname ;
   private String AV154Pgmname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A56AlbRUni ;
   private String A55AlbRReo ;
   private String A45AlbRef ;
   private String AV153OK ;
   private String AV134Station ;
   private String GXv_char2[] ;
   private String AV46EmprNom ;
   private String GXv_char3[] ;
   private String AV146UsurCod ;
   private String AV113Msg3 ;
   private String GXt_char1 ;
   private String AV10AlbRef ;
   private String Z56AlbRUni ;
   private String Z55AlbRReo ;
   private String Z45AlbRef ;
   private String GXv_char4[] ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridlevel_almacentejido_Class ;
   private String subGridlevel_almacentejido_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtKilos_Jsonclick ;
   private String edtMetros_Jsonclick ;
   private String edtPiezas_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRGrm2_Jsonclick ;
   private String edtAlbRAnc_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String sCtrlGx_mode ;
   private String sCtrlAV45EmprCod ;
   private String sCtrlAV36DisCod ;
   private String subGridlevel_almacentejido_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n13733DisTotRec ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean AV129ProcesoRealizado ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n13732DisCanRec ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV124Piezas ;
   private String AV29Consulta ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_almacentejidoContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_almacentejidoRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_almacentejidoColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV151Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV150WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkDisDes ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private short[] T01P66_A13732DisCanRec ;
   private boolean[] T01P66_n13732DisCanRec ;
   private int[] T01P610_A13733DisTotRec ;
   private boolean[] T01P610_n13733DisTotRec ;
   private int[] T01P613_A361DisCod ;
   private String[] T01P613_A365DisDes ;
   private String[] T01P613_A335DisArtCod ;
   private String[] T01P613_A392DisUniMed ;
   private String[] T01P613_A1430DisLoc ;
   private String[] T01P613_A360DisCliNum ;
   private String[] T01P613_A396EmprCod ;
   private int[] T01P613_A252CliCod ;
   private int[] T01P613_A13733DisTotRec ;
   private boolean[] T01P613_n13733DisTotRec ;
   private short[] T01P613_A13732DisCanRec ;
   private boolean[] T01P613_n13732DisCanRec ;
   private int[] T01P615_A13733DisTotRec ;
   private boolean[] T01P615_n13733DisTotRec ;
   private short[] T01P617_A13732DisCanRec ;
   private boolean[] T01P617_n13732DisCanRec ;
   private String[] T01P618_A396EmprCod ;
   private int[] T01P618_A361DisCod ;
   private int[] T01P68_A361DisCod ;
   private String[] T01P68_A365DisDes ;
   private String[] T01P68_A335DisArtCod ;
   private String[] T01P68_A392DisUniMed ;
   private String[] T01P68_A1430DisLoc ;
   private String[] T01P68_A360DisCliNum ;
   private String[] T01P68_A396EmprCod ;
   private int[] T01P68_A252CliCod ;
   private String[] T01P619_A396EmprCod ;
   private int[] T01P619_A361DisCod ;
   private String[] T01P620_A396EmprCod ;
   private int[] T01P620_A361DisCod ;
   private int[] T01P67_A361DisCod ;
   private String[] T01P67_A365DisDes ;
   private String[] T01P67_A335DisArtCod ;
   private String[] T01P67_A392DisUniMed ;
   private String[] T01P67_A1430DisLoc ;
   private String[] T01P67_A360DisCliNum ;
   private String[] T01P67_A396EmprCod ;
   private int[] T01P67_A252CliCod ;
   private int[] T01P625_A13733DisTotRec ;
   private boolean[] T01P625_n13733DisTotRec ;
   private short[] T01P627_A13732DisCanRec ;
   private boolean[] T01P627_n13732DisCanRec ;
   private String[] T01P628_A396EmprCod ;
   private int[] T01P628_A361DisCod ;
   private String[] T01P628_A13376DisTraID ;
   private String[] T01P629_A396EmprCod ;
   private int[] T01P629_A361DisCod ;
   private String[] T01P629_A13213DisNormID ;
   private String[] T01P630_A396EmprCod ;
   private int[] T01P630_A361DisCod ;
   private byte[] T01P630_A13081DisDGLin ;
   private String[] T01P630_A13082DisDGDibCl ;
   private int[] T01P630_A13083DisDGDibIn ;
   private String[] T01P630_A13084DisDGComb ;
   private String[] T01P630_A13085DisDGFondo ;
   private String[] T01P631_A396EmprCod ;
   private int[] T01P631_A361DisCod ;
   private byte[] T01P631_A7068DisNotLin ;
   private String[] T01P632_A396EmprCod ;
   private int[] T01P632_A361DisCod ;
   private String[] T01P632_A10197ProEspCod ;
   private String[] T01P633_A396EmprCod ;
   private int[] T01P633_A361DisCod ;
   private short[] T01P633_A4594AccCod ;
   private String[] T01P634_A396EmprCod ;
   private int[] T01P634_A361DisCod ;
   private byte[] T01P634_A2524DisComLin ;
   private String[] T01P634_A1056DisComCod ;
   private String[] T01P634_A1032FonCod ;
   private String[] T01P635_A396EmprCod ;
   private int[] T01P635_A361DisCod ;
   private int[] T01P635_A3398DisRefBarC ;
   private byte[] T01P635_A3399DisRefBCRe ;
   private String[] T01P635_A3400DisRefBCPa ;
   private String[] T01P635_A3607DisRefBPie ;
   private String[] T01P636_A396EmprCod ;
   private int[] T01P636_A361DisCod ;
   private byte[] T01P636_A376DisObsLin ;
   private String[] T01P637_A396EmprCod ;
   private int[] T01P637_A361DisCod ;
   private String[] T01P637_A758ProCod ;
   private String[] T01P638_A396EmprCod ;
   private int[] T01P638_A361DisCod ;
   private short[] T01P638_A833TipDefCod ;
   private String[] T01P639_A396EmprCod ;
   private int[] T01P639_A361DisCod ;
   private int[] T01P639_A44AlbRecCod ;
   private String[] T01P639_A380DisPieCod ;
   private String[] T01P640_A396EmprCod ;
   private int[] T01P640_A361DisCod ;
   private int[] T01P641_A361DisCod ;
   private java.math.BigDecimal[] T01P641_A595Kilos ;
   private java.math.BigDecimal[] T01P641_A631Metros ;
   private int[] T01P641_A673Piezas ;
   private java.math.BigDecimal[] T01P641_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P641_A60AlbRUniUti ;
   private int[] T01P641_A52AlbRPieEnt ;
   private int[] T01P641_A54AlbRPieUti ;
   private String[] T01P641_A56AlbRUni ;
   private byte[] T01P641_A47AlbREst ;
   private String[] T01P641_A55AlbRReo ;
   private String[] T01P641_A45AlbRef ;
   private short[] T01P641_A4920AlbRGrm2 ;
   private short[] T01P641_A4921AlbRAnc ;
   private String[] T01P641_A396EmprCod ;
   private int[] T01P641_A44AlbRecCod ;
   private java.math.BigDecimal[] T01P64_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P64_A60AlbRUniUti ;
   private int[] T01P64_A52AlbRPieEnt ;
   private int[] T01P64_A54AlbRPieUti ;
   private String[] T01P64_A56AlbRUni ;
   private byte[] T01P64_A47AlbREst ;
   private String[] T01P64_A55AlbRReo ;
   private String[] T01P64_A45AlbRef ;
   private short[] T01P64_A4920AlbRGrm2 ;
   private short[] T01P64_A4921AlbRAnc ;
   private java.math.BigDecimal[] T01P642_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P642_A60AlbRUniUti ;
   private int[] T01P642_A52AlbRPieEnt ;
   private int[] T01P642_A54AlbRPieUti ;
   private String[] T01P642_A56AlbRUni ;
   private byte[] T01P642_A47AlbREst ;
   private String[] T01P642_A55AlbRReo ;
   private String[] T01P642_A45AlbRef ;
   private short[] T01P642_A4920AlbRGrm2 ;
   private short[] T01P642_A4921AlbRAnc ;
   private String[] T01P643_A396EmprCod ;
   private int[] T01P643_A361DisCod ;
   private int[] T01P643_A44AlbRecCod ;
   private int[] T01P63_A361DisCod ;
   private java.math.BigDecimal[] T01P63_A595Kilos ;
   private java.math.BigDecimal[] T01P63_A631Metros ;
   private int[] T01P63_A673Piezas ;
   private String[] T01P63_A396EmprCod ;
   private int[] T01P63_A44AlbRecCod ;
   private int[] T01P62_A361DisCod ;
   private java.math.BigDecimal[] T01P62_A595Kilos ;
   private java.math.BigDecimal[] T01P62_A631Metros ;
   private int[] T01P62_A673Piezas ;
   private String[] T01P62_A396EmprCod ;
   private int[] T01P62_A44AlbRecCod ;
   private java.math.BigDecimal[] T01P647_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01P647_A60AlbRUniUti ;
   private int[] T01P647_A52AlbRPieEnt ;
   private int[] T01P647_A54AlbRPieUti ;
   private String[] T01P647_A56AlbRUni ;
   private byte[] T01P647_A47AlbREst ;
   private String[] T01P647_A55AlbRReo ;
   private String[] T01P647_A45AlbRef ;
   private short[] T01P647_A4920AlbRGrm2 ;
   private short[] T01P647_A4921AlbRAnc ;
   private String[] T01P648_A396EmprCod ;
   private int[] T01P648_A361DisCod ;
   private int[] T01P648_A44AlbRecCod ;
   private String[] T01P648_A9756Dis_CUb ;
   private String[] T01P649_A396EmprCod ;
   private int[] T01P649_A361DisCod ;
   private int[] T01P649_A44AlbRecCod ;
   private String[] T01P649_A380DisPieCod ;
   private String[] T01P650_A396EmprCod ;
   private int[] T01P650_A361DisCod ;
   private int[] T01P650_A44AlbRecCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV144TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV145TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV152WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class nwdpalmacentejido__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpalmacentejido__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpalmacentejido__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpalmacentejido__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpalmacentejido__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01P62", "SELECT DisCod, Kilos, Metros, Piezas, EmprCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?  FOR UPDATE OF Kilos, Metros, Piezas NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P63", "SELECT DisCod, Kilos, Metros, Piezas, EmprCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P64", "SELECT AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P66", "SELECT COALESCE( T1.DisTotRec, 0) AS DisCanRec FROM (SELECT COUNT(*) AS DisTotRec, T2.EmprCod, T2.DisCod FROM (TXPDISALB T2 INNER JOIN TXPALBREC T3 ON T3.EmprCod = T2.EmprCod AND T3.AlbRecCod = T2.AlbRecCod) WHERE T3.AlbRReo = 'SI' GROUP BY T2.EmprCod, T2.DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P67", "SELECT DisCod, DisDes, DisArtCod, DisUniMed, DisLoc, DisCliNum, EmprCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisDes, DisArtCod, DisUniMed, DisLoc, DisCliNum, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P68", "SELECT DisCod, DisDes, DisArtCod, DisUniMed, DisLoc, DisCliNum, EmprCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P610", "SELECT COALESCE( T1.DisTotRec, 0) AS DisTotRec FROM (SELECT COUNT(*) AS DisTotRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P613", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.DisDes, TM1.DisArtCod, TM1.DisUniMed, TM1.DisLoc, TM1.DisCliNum, TM1.EmprCod, TM1.CliCod, COALESCE( T2.DisTotRec, 0) AS DisTotRec, COALESCE( T3.DisTotRec, 0) AS DisCanRec FROM ((TXPDISPOS TM1 LEFT JOIN (SELECT COUNT(*) AS DisTotRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) LEFT JOIN (SELECT COUNT(*) AS DisTotRec, T4.EmprCod, T4.DisCod FROM (TXPDISALB T4 INNER JOIN TXPALBREC T5 ON T5.EmprCod = T4.EmprCod AND T5.AlbRecCod = T4.AlbRecCod) WHERE T5.AlbRReo = 'SI' GROUP BY T4.EmprCod, T4.DisCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P615", "SELECT COALESCE( T1.DisTotRec, 0) AS DisTotRec FROM (SELECT COUNT(*) AS DisTotRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P617", "SELECT COALESCE( T1.DisTotRec, 0) AS DisCanRec FROM (SELECT COUNT(*) AS DisTotRec, T2.EmprCod, T2.DisCod FROM (TXPDISALB T2 INNER JOIN TXPALBREC T3 ON T3.EmprCod = T2.EmprCod AND T3.AlbRecCod = T2.AlbRecCod) WHERE T3.AlbRReo = 'SI' GROUP BY T2.EmprCod, T2.DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P618", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P619", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ?) ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P620", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ?) ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P621", "INSERT INTO TXPDISPOS(DisCod, DisDes, DisArtCod, DisUniMed, DisLoc, DisCliNum, EmprCod, CliCod, DisNumPie, DisNumUni, DisArtPes, PriCod, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01P622", "UPDATE TXPDISPOS SET DisDes=?, DisArtCod=?, DisUniMed=?, DisLoc=?, DisCliNum=?, CliCod=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01P623", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01P625", "SELECT COALESCE( T1.DisTotRec, 0) AS DisTotRec FROM (SELECT COUNT(*) AS DisTotRec, EmprCod, DisCod FROM TXPDISALB GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P627", "SELECT COALESCE( T1.DisTotRec, 0) AS DisCanRec FROM (SELECT COUNT(*) AS DisTotRec, T2.EmprCod, T2.DisCod FROM (TXPDISALB T2 INNER JOIN TXPALBREC T3 ON T3.EmprCod = T2.EmprCod AND T3.AlbRecCod = T2.AlbRecCod) WHERE T3.AlbRReo = 'SI' GROUP BY T2.EmprCod, T2.DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P628", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P629", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P630", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P631", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P632", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P633", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P634", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P635", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P636", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P637", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P638", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P639", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P640", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P641", "SELECT T1.DisCod, T1.Kilos, T1.Metros, T1.Piezas, T2.AlbRUniEnt, T2.AlbRUniUti, T2.AlbRPieEnt, T2.AlbRPieUti, T2.AlbRUni, T2.AlbREst, T2.AlbRReo, T2.AlbRef, T2.AlbRGrm2, T2.AlbRAnc, T1.EmprCod, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.AlbRecCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P642", "SELECT AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P643", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P644", "INSERT INTO TXPDISALB(DisCod, Kilos, Metros, Piezas, EmprCod, AlbRecCod, KilosUti, MetrosUti, PiezasUti) VALUES(?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01P645", "UPDATE TXPDISALB SET Kilos=?, Metros=?, Piezas=?  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new UpdateCursor("T01P646", "DELETE FROM TXPDISALB  WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPDISALB")
         ,new ForEachCursor("T01P647", "SELECT AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbRUni, AlbREst, AlbRReo, AlbRef, AlbRGrm2, AlbRAnc FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P648", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, Dis_CUb FROM TXPUBIOUT WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P649", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod, DisPieCod FROM TXPDISALD WHERE EmprCod = ? AND DisCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P650", "SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, AlbRecCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
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
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               return;
            case 32 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 37 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 8);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 34 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 35 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

