package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class nwdpfases_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A368DisFasLin = (short)(GXutil.lval( httpContext.GetPar( "DisFasLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_21_1P939( Gx_mode, A396EmprCod, A758ProCod, A361DisCod, A368DisFasLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action24") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_24_1P939( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_26") == 0 )
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
         gxload_26( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
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
         gxload_27( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_29") == 0 )
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
         gxload_29( A396EmprCod, A457FasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_fases") == 0 )
      {
         gxnrgridlevel_fases_newrow_invoke( ) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV71DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71DisCod), "ZZZZZZZ9")));
            AV135ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135ProCod", AV135ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV135ProCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Nw DPFases", ""), (short)(0)) ;
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

   public void gxnrgridlevel_fases_newrow_invoke( )
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
      gxnrgridlevel_fases_newrow( ) ;
      /* End function gxnrGridlevel_fases_newrow_invoke */
   }

   public nwdpfases_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public nwdpfases_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( nwdpfases_impl.class ));
   }

   public nwdpfases_impl( int remoteHandle ,
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
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
      ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPFases.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPFases.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_NwDPFases.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisArtCod_Internalname, GXutil.rtrim( A335DisArtCod), GXutil.rtrim( localUtil.format( A335DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisArtCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisArtCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_NwDPFases.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_fases_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_fases( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnfomacab_Internalname, "", httpContext.getMessage( "FormAcb", ""), bttBtnfomacab_Jsonclick, 5, httpContext.getMessage( "FormAcb", ""), "", StyleString, ClassString, bttBtnfomacab_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOFOMACAB\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnnotas_Internalname, "", httpContext.getMessage( "Notas", ""), bttBtnnotas_Jsonclick, 5, httpContext.getMessage( "Notas", ""), "", StyleString, ClassString, bttBtnnotas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DONOTAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPFases.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobsfases_Internalname, "", httpContext.getMessage( "Obs", ""), bttBtnobsfases_Jsonclick, 5, httpContext.getMessage( "Obs", ""), "", StyleString, ClassString, bttBtnobsfases_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOOBSFASES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_NwDPFases.htm");
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

   public void gxdraw_gridlevel_fases( )
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
            scanStart1P939( ) ;
            while ( RcdFound39 != 0 )
            {
               init_level_properties39( ) ;
               getByPrimaryKey1P939( ) ;
               addRow1P939( ) ;
               scanNext1P939( ) ;
            }
            scanEnd1P939( ) ;
            nBlankRcdCount39 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1P939( ) ;
         standaloneModal1P939( ) ;
         sMode39 = Gx_mode ;
         while ( nGXsfl_53_idx < nRC_GXsfl_53 )
         {
            bGXsfl_53_Refreshing = true ;
            readRow1P939( ) ;
            edtavDelete_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vDELETE_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasCod_Backcolor = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Backcolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), !bGXsfl_53_Refreshing);
            edtFasCod_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), !bGXsfl_53_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACAB_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            edtFasApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASAPR_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_53_Refreshing);
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
            edtDisFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASOBS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_53_Refreshing);
            if ( ( nRcdExists_39 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1P939( ) ;
            }
            sendRow1P939( ) ;
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
            scanStart1P939( ) ;
            while ( RcdFound39 != 0 )
            {
               sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5339( ) ;
               init_level_properties39( ) ;
               standaloneNotModal1P939( ) ;
               getByPrimaryKey1P939( ) ;
               standaloneModal1P939( ) ;
               addRow1P939( ) ;
               scanNext1P939( ) ;
            }
            scanEnd1P939( ) ;
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
         initAll1P939( ) ;
         init_level_properties39( ) ;
         nRcdExists_39 = (short)(0) ;
         nIsMod_39 = (short)(0) ;
         nRcdDeleted_39 = (short)(0) ;
         nBlankRcdCount39 = (short)(nBlankRcdUsr39+nBlankRcdCount39) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount39 > 0 )
         {
            standaloneNotModal1P939( ) ;
            standaloneModal1P939( ) ;
            addRow1P939( ) ;
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
      httpContext.writeText( "<div id=\""+"Gridlevel_fasesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_fases", Gridlevel_fasesContainer, subGridlevel_fases_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_fasesContainerData", Gridlevel_fasesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_fasesContainerData"+"V", Gridlevel_fasesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_fasesContainerData"+"V"+"\" value='"+Gridlevel_fasesContainer.GridValuesHidden()+"'/>") ;
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111P92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
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
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV71DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV135ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV37Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV66Disartcod = httpContext.cgiGet( "vDISARTCOD") ;
            A7744FasPreObl = (byte)(localUtil.ctol( httpContext.cgiGet( "FASPREOBL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n7744FasPreObl = false ;
            Dvpanel_tableattributes_Objectcall = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Objectcall") ;
            Dvpanel_tableattributes_Class = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Class") ;
            Dvpanel_tableattributes_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Enabled")) ;
            Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
            Dvpanel_tableattributes_Height = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Height") ;
            Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
            Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
            Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
            Dvpanel_tableattributes_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showheader")) ;
            Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
            Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
            Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
            Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
            Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
            Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
            Dvpanel_tableattributes_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Visible")) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"NwDPFases");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("nwdpfases:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               if ( isDsp( ) )
               {
                  sMode38 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode38 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound38 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1P90( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111P92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121P92 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOFOMACAB'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoFomAcab' */
                        e131P92 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DONOTAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoNotas' */
                        e141P92 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOOBSFASES'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoObsFases' */
                        e151P92 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! isDsp( ) )
                        {
                           btn_enter( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                  }
                  else
                  {
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                     if ( ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VDELETE.CLICK") == 0 ) )
                     {
                        nGXsfl_53_idx = (int)(GXutil.lval( sEvtType)) ;
                        sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
                        subsflControlProps_5339( ) ;
                        AV139Delete = (short)(localUtil.ctol( httpContext.cgiGet( edtavDelete_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                        {
                           GXCCtl = "DISFASLIN_" + sGXsfl_53_idx ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
                           AnyError = (short)(1) ;
                           GX_FocusControl = edtDisFasLin_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           wbErr = true ;
                           A368DisFasLin = (short)(0) ;
                        }
                        else
                        {
                           A368DisFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtDisFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                        }
                        A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                        A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                        A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                        n602MaqCod = false ;
                        A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
                        n456FasActTin = false ;
                        A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
                        n4286FasForMul = false ;
                        A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
                        n4903FasAcab = false ;
                        A3697FasApr = GXutil.upper( httpContext.cgiGet( edtFasApr_Internalname)) ;
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
                        sEvtType = GXutil.right( sEvt, 1) ;
                        if ( GXutil.strcmp(sEvtType, ".") == 0 )
                        {
                           sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                           if ( GXutil.strcmp(sEvt, "VDELETE.CLICK") == 0 )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              dynload_actions( ) ;
                              e161P92 ();
                           }
                        }
                        else
                        {
                        }
                     }
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
         e121P92 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1P938( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) || isDlt( ) )
      {
         bttBtntrn_delete_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
         if ( isDsp( ) )
         {
            bttBtntrn_enter_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes1P938( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_53_Refreshing);
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

   public void confirm_1P90( )
   {
      beforeValidate1P938( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1P938( ) ;
         }
         else
         {
            checkExtendedTable1P938( ) ;
            closeExtendedTableCursors1P938( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode38 = Gx_mode ;
         confirm_1P939( ) ;
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

   public void confirm_1P939( )
   {
      nGXsfl_53_idx = 0 ;
      while ( nGXsfl_53_idx < nRC_GXsfl_53 )
      {
         readRow1P939( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            getKey1P939( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               if ( RcdFound39 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1P939( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1P939( ) ;
                     closeExtendedTableCursors1P939( ) ;
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
                     getByPrimaryKey1P939( ) ;
                     load1P939( ) ;
                     beforeValidate1P939( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1P939( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1P939( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1P939( ) ;
                           closeExtendedTableCursors1P939( ) ;
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
         httpContext.changePostValue( edtavDelete_Internalname, GXutil.ltrim( localUtil.ntoc( AV139Delete, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( edtFasApr_Internalname, GXutil.rtrim( A3697FasApr)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
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
            httpContext.changePostValue( "vDELETE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Backcolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Backcolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACAB_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASAPR_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASOBS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1P90( )
   {
   }

   public void e111P92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      nwdpfases_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      nwdpfases_impl.this.AV32EmprCod = GXv_char2[0] ;
      nwdpfases_impl.this.AV11EmprNom = GXv_char3[0] ;
      nwdpfases_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV136WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV136WWPContext = GXv_SdtWWPContext5[0] ;
      AV137TrnContext.fromxml(AV138WebSession.getValue("TrnContext"), null, null);
      GXt_int6 = AV67Flag_not ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "FASNOT", ""), GXv_int7) ;
      nwdpfases_impl.this.GXt_int6 = GXv_int7[0] ;
      AV67Flag_not = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Flag_not", GXutil.str( AV67Flag_not, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG_NOT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67Flag_not), "9")));
   }

   public void e121P92( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV137TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.nwdpfasesww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e131P92( )
   {
      /* 'DoFomAcab' Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ! (0==A368DisFasLin) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A361DisCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_int9[0] = A368DisFasLin ;
         new app.pdisfqp(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int9) ;
         nwdpfases_impl.this.A396EmprCod = GXv_char4[0] ;
         nwdpfases_impl.this.A361DisCod = GXv_int8[0] ;
         nwdpfases_impl.this.A758ProCod = GXv_char3[0] ;
         nwdpfases_impl.this.A368DisFasLin = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.popup(formatLink("app.tdisfpq", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"}) , new Object[] {"A396EmprCod","A361DisCod","A758ProCod","A368DisFasLin"});
      }
      /*  Sending Event outputs  */
   }

   public void e141P92( )
   {
      /* 'DoNotas' Routine */
      returnInSub = false ;
      if ( AV67Flag_not == 1 )
      {
         if ( ! (0==A368DisFasLin) )
         {
            httpContext.popup(formatLink("app.ttrn08", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"}) , new Object[] {"A396EmprCod","A361DisCod","A758ProCod","A368DisFasLin"});
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Botón no habilitado", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e151P92( )
   {
      /* 'DoObsFases' Routine */
      returnInSub = false ;
      if ( ! (0==A368DisFasLin) )
      {
         httpContext.popup(formatLink("app.tdisfso", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A368DisFasLin,4,0))}, new String[] {"EmprCod","DisCod","ProCod","DisFasLin"}) , new Object[] {"A396EmprCod","A361DisCod","A758ProCod","A368DisFasLin"});
      }
      /*  Sending Event outputs  */
   }

   public void e161P92( )
   {
      /* Delete_Click Routine */
      returnInSub = false ;
      if ( ! (0==A368DisFasLin) )
      {
         GXv_char4[0] = A457FasCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A335DisArtCod ;
         GXv_char2[0] = httpContext.getMessage( "DL2", "") ;
         new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         nwdpfases_impl.this.A457FasCod = GXv_char4[0] ;
         nwdpfases_impl.this.A252CliCod = GXv_int8[0] ;
         nwdpfases_impl.this.A335DisArtCod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      }
      /*  Sending Event outputs  */
   }

   public void zm1P938( int GX_JID )
   {
      if ( ( GX_JID == 25 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -25 )
      {
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z335DisArtCod = A335DisArtCod ;
         Z252CliCod = A252CliCod ;
         Z759ProDsc = A759ProDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtavDelete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDelete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDelete_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV71DisCod) )
      {
         A361DisCod = AV71DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV71DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV71DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV135ProCod)==0) )
      {
         A758ProCod = AV135ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV135ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV135ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtntrn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01P97 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A335DisArtCod = T01P97_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A252CliCod = T01P97_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(5);
         AV66Disartcod = A335DisArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
         AV37Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
         /* Using cursor T01P98 */
         pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01P98_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(6);
      }
   }

   public void load1P938( )
   {
      /* Using cursor T01P99 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A335DisArtCod = T01P99_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A759ProDsc = T01P99_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A252CliCod = T01P99_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zm1P938( -25) ;
      }
      pr_default.close(7);
      onLoadActions1P938( ) ;
   }

   public void onLoadActions1P938( )
   {
      AV66Disartcod = A335DisArtCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
      AV37Clicod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
   }

   public void checkExtendedTable1P938( )
   {
      nIsDirty_38 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01P97 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A335DisArtCod = T01P97_A335DisArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A252CliCod = T01P97_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(5);
      AV66Disartcod = A335DisArtCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
      AV37Clicod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
      /* Using cursor T01P98 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01P98_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1P938( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_26( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01P910 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A335DisArtCod = T01P910_A335DisArtCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A252CliCod = T01P910_A252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A335DisArtCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_27( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01P911 */
      pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01P911_A759ProDsc[0] ;
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

   public void getKey1P938( )
   {
      /* Using cursor T01P912 */
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
      /* Using cursor T01P96 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1P938( 25) ;
         RcdFound38 = (short)(1) ;
         A396EmprCod = T01P96_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P96_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01P96_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P938( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1P938( ) ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1P938( ) ;
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
      getKey1P938( ) ;
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
      /* Using cursor T01P913 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01P913_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01P913_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P913_A361DisCod[0] < A361DisCod ) || ( T01P913_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P913_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01P913_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01P913_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01P913_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P913_A361DisCod[0] > A361DisCod ) || ( T01P913_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P913_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01P913_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            A396EmprCod = T01P913_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01P913_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = T01P913_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T01P914 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A361DisCod), A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01P914_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01P914_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P914_A361DisCod[0] > A361DisCod ) || ( T01P914_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P914_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01P914_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01P914_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01P914_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01P914_A361DisCod[0] < A361DisCod ) || ( T01P914_A361DisCod[0] == A361DisCod ) && ( GXutil.strcmp(T01P914_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01P914_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            A396EmprCod = T01P914_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01P914_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A758ProCod = T01P914_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1P938( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1P938( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
               /* Update record */
               update1P938( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1P938( ) ;
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
                  /* Insert record */
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1P938( ) ;
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
      if ( isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
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
      }
   }

   public void checkOptimisticConcurrency1P938( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P95 */
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

   public void insert1P938( )
   {
      beforeValidate1P938( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P938( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P938( 0) ;
         checkOptimisticConcurrency1P938( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P938( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P938( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P915 */
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
                        processLevel1P938( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1P90( ) ;
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
            load1P938( ) ;
         }
         endLevel1P938( ) ;
      }
      closeExtendedTableCursors1P938( ) ;
   }

   public void update1P938( )
   {
      beforeValidate1P938( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P938( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P938( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P938( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1P938( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISLIN */
                  deferredUpdate1P938( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1P938( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
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
         endLevel1P938( ) ;
      }
      closeExtendedTableCursors1P938( ) ;
   }

   public void deferredUpdate1P938( )
   {
   }

   public void delete( )
   {
      beforeValidate1P938( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P938( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P938( ) ;
         afterConfirm1P938( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P938( ) ;
            if ( AnyError == 0 )
            {
               scanStart1P939( ) ;
               while ( RcdFound39 != 0 )
               {
                  getByPrimaryKey1P939( ) ;
                  delete1P939( ) ;
                  scanNext1P939( ) ;
               }
               scanEnd1P939( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P916 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISLIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isUpd( ) || isDlt( ) )
                        {
                           if ( AnyError == 0 )
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
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1P938( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P938( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01P917 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A335DisArtCod = T01P917_A335DisArtCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
         A252CliCod = T01P917_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(15);
         AV66Disartcod = A335DisArtCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
         AV37Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
         /* Using cursor T01P918 */
         pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01P918_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P919 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel1P939( )
   {
      nGXsfl_53_idx = 0 ;
      while ( nGXsfl_53_idx < nRC_GXsfl_53 )
      {
         readRow1P939( ) ;
         if ( ( nRcdExists_39 != 0 ) || ( nIsMod_39 != 0 ) )
         {
            standaloneNotModal1P939( ) ;
            getKey1P939( ) ;
            if ( ( nRcdExists_39 == 0 ) && ( nRcdDeleted_39 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1P939( ) ;
            }
            else
            {
               if ( RcdFound39 != 0 )
               {
                  if ( ( nRcdDeleted_39 != 0 ) && ( nRcdExists_39 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1P939( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_39 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1P939( ) ;
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
         httpContext.changePostValue( edtavDelete_Internalname, GXutil.ltrim( localUtil.ntoc( AV139Delete, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( edtFasApr_Internalname, GXutil.rtrim( A3697FasApr)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
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
            httpContext.changePostValue( "vDELETE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASLIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Backcolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Backcolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Forecolor, (byte)(9), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACAB_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASAPR_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISFASOBS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1P939( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_39 = (short)(0) ;
      nIsMod_39 = (short)(0) ;
      nRcdDeleted_39 = (short)(0) ;
   }

   public void processLevel1P938( )
   {
      /* Save parent mode. */
      sMode38 = Gx_mode ;
      processNestedLevel1P939( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1P938( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1P938( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "nwdpfases");
         if ( AnyError == 0 )
         {
            confirmValues1P90( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "nwdpfases");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1P938( )
   {
      /* Scan By routine */
      /* Using cursor T01P920 */
      pr_default.execute(18);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A396EmprCod = T01P920_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P920_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01P920_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P938( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A396EmprCod = T01P920_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01P920_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A758ProCod = T01P920_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEnd1P938( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1P938( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1P938( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P938( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P938( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P938( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P938( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P938( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtDisArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Enabled), 5, 0), true);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
   }

   public void zm1P939( int GX_JID )
   {
      if ( ( GX_JID == 28 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3697FasApr = T01P93_A3697FasApr[0] ;
            Z9841DisFasObs = T01P93_A9841DisFasObs[0] ;
            Z457FasCod = T01P93_A457FasCod[0] ;
         }
         else
         {
            Z3697FasApr = A3697FasApr ;
            Z9841DisFasObs = A9841DisFasObs ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -28 )
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

   public void standaloneNotModal1P939( )
   {
      edtFasApr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_53_Refreshing);
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
      edtDisFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_53_Refreshing);
   }

   public void standaloneModal1P939( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion NO Permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void load1P939( )
   {
      /* Using cursor T01P921 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A460FasDsc = T01P921_A460FasDsc[0] ;
         A4903FasAcab = T01P921_A4903FasAcab[0] ;
         n4903FasAcab = T01P921_n4903FasAcab[0] ;
         A4286FasForMul = T01P921_A4286FasForMul[0] ;
         n4286FasForMul = T01P921_n4286FasForMul[0] ;
         A3697FasApr = T01P921_A3697FasApr[0] ;
         A456FasActTin = T01P921_A456FasActTin[0] ;
         n456FasActTin = T01P921_n456FasActTin[0] ;
         A458FasCon = T01P921_A458FasCon[0] ;
         n458FasCon = T01P921_n458FasCon[0] ;
         A464FasNumPas = T01P921_A464FasNumPas[0] ;
         n464FasNumPas = T01P921_n464FasNumPas[0] ;
         A472FasVelPro = T01P921_A472FasVelPro[0] ;
         n472FasVelPro = T01P921_n472FasVelPro[0] ;
         A468FasPrePie = T01P921_A468FasPrePie[0] ;
         n468FasPrePie = T01P921_n468FasPrePie[0] ;
         A469FasPreSal = T01P921_A469FasPreSal[0] ;
         n469FasPreSal = T01P921_n469FasPreSal[0] ;
         A459FasDec = T01P921_A459FasDec[0] ;
         n459FasDec = T01P921_n459FasDec[0] ;
         A9841DisFasObs = T01P921_A9841DisFasObs[0] ;
         A7744FasPreObl = T01P921_A7744FasPreObl[0] ;
         n7744FasPreObl = T01P921_n7744FasPreObl[0] ;
         A457FasCod = T01P921_A457FasCod[0] ;
         A602MaqCod = T01P921_A602MaqCod[0] ;
         n602MaqCod = T01P921_n602MaqCod[0] ;
         zm1P939( -28) ;
      }
      pr_default.close(19);
      onLoadActions1P939( ) ;
   }

   public void onLoadActions1P939( )
   {
      if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), !bGXsfl_53_Refreshing);
      }
      if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), !bGXsfl_53_Refreshing);
      }
   }

   public void checkExtendedTable1P939( )
   {
      nIsDirty_39 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1P939( ) ;
      /* Using cursor T01P94 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01P94_A460FasDsc[0] ;
      A4903FasAcab = T01P94_A4903FasAcab[0] ;
      n4903FasAcab = T01P94_n4903FasAcab[0] ;
      A4286FasForMul = T01P94_A4286FasForMul[0] ;
      n4286FasForMul = T01P94_n4286FasForMul[0] ;
      A456FasActTin = T01P94_A456FasActTin[0] ;
      n456FasActTin = T01P94_n456FasActTin[0] ;
      A458FasCon = T01P94_A458FasCon[0] ;
      n458FasCon = T01P94_n458FasCon[0] ;
      A464FasNumPas = T01P94_A464FasNumPas[0] ;
      n464FasNumPas = T01P94_n464FasNumPas[0] ;
      A472FasVelPro = T01P94_A472FasVelPro[0] ;
      n472FasVelPro = T01P94_n472FasVelPro[0] ;
      A468FasPrePie = T01P94_A468FasPrePie[0] ;
      n468FasPrePie = T01P94_n468FasPrePie[0] ;
      A469FasPreSal = T01P94_A469FasPreSal[0] ;
      n469FasPreSal = T01P94_n469FasPreSal[0] ;
      A459FasDec = T01P94_A459FasDec[0] ;
      n459FasDec = T01P94_n459FasDec[0] ;
      A7744FasPreObl = T01P94_A7744FasPreObl[0] ;
      n7744FasPreObl = T01P94_n7744FasPreObl[0] ;
      A602MaqCod = T01P94_A602MaqCod[0] ;
      n602MaqCod = T01P94_n602MaqCod[0] ;
      pr_default.close(2);
      if ( isIns( )  && (0==A368DisFasLin) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_int8[0] = A361DisCod ;
         GXv_int9[0] = A368DisFasLin ;
         new app.plinfas(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_int9) ;
         nwdpfases_impl.this.A396EmprCod = GXv_char4[0] ;
         nwdpfases_impl.this.A758ProCod = GXv_char3[0] ;
         nwdpfases_impl.this.A361DisCod = GXv_int8[0] ;
         nwdpfases_impl.this.A368DisFasLin = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( A368DisFasLin == 9999 )
      {
         GXCCtl = "DISFASLIN_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Supero el numero maximo de lineas 9999", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), !bGXsfl_53_Refreshing);
      }
      if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), !bGXsfl_53_Refreshing);
      }
   }

   public void closeExtendedTableCursors1P939( )
   {
      pr_default.close(2);
   }

   public void enableDisable1P939( )
   {
   }

   public void gxload_29( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01P922 */
      pr_default.execute(20, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_53_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01P922_A460FasDsc[0] ;
      A4903FasAcab = T01P922_A4903FasAcab[0] ;
      n4903FasAcab = T01P922_n4903FasAcab[0] ;
      A4286FasForMul = T01P922_A4286FasForMul[0] ;
      n4286FasForMul = T01P922_n4286FasForMul[0] ;
      A456FasActTin = T01P922_A456FasActTin[0] ;
      n456FasActTin = T01P922_n456FasActTin[0] ;
      A458FasCon = T01P922_A458FasCon[0] ;
      n458FasCon = T01P922_n458FasCon[0] ;
      A464FasNumPas = T01P922_A464FasNumPas[0] ;
      n464FasNumPas = T01P922_n464FasNumPas[0] ;
      A472FasVelPro = T01P922_A472FasVelPro[0] ;
      n472FasVelPro = T01P922_n472FasVelPro[0] ;
      A468FasPrePie = T01P922_A468FasPrePie[0] ;
      n468FasPrePie = T01P922_n468FasPrePie[0] ;
      A469FasPreSal = T01P922_A469FasPreSal[0] ;
      n469FasPreSal = T01P922_n469FasPreSal[0] ;
      A459FasDec = T01P922_A459FasDec[0] ;
      n459FasDec = T01P922_n459FasDec[0] ;
      A7744FasPreObl = T01P922_A7744FasPreObl[0] ;
      n7744FasPreObl = T01P922_n7744FasPreObl[0] ;
      A602MaqCod = T01P922_A602MaqCod[0] ;
      n602MaqCod = T01P922_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1P939( )
   {
      /* Using cursor T01P923 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1P939( )
   {
      /* Using cursor T01P93 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1P939( 28) ;
         RcdFound39 = (short)(1) ;
         initializeNonKey1P939( ) ;
         A368DisFasLin = T01P93_A368DisFasLin[0] ;
         A3697FasApr = T01P93_A3697FasApr[0] ;
         A9841DisFasObs = T01P93_A9841DisFasObs[0] ;
         A457FasCod = T01P93_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z758ProCod = A758ProCod ;
         Z368DisFasLin = A368DisFasLin ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1P939( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1P939( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1P939( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1P939( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1P939( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01P92 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3697FasApr, T01P92_A3697FasApr[0]) != 0 ) || ( GXutil.strcmp(Z9841DisFasObs, T01P92_A9841DisFasObs[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01P92_A457FasCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3697FasApr, T01P92_A3697FasApr[0]) != 0 )
            {
               GXutil.writeLogln("nwdpfases:[seudo value changed for attri]"+"FasApr");
               GXutil.writeLogRaw("Old: ",Z3697FasApr);
               GXutil.writeLogRaw("Current: ",T01P92_A3697FasApr[0]);
            }
            if ( GXutil.strcmp(Z9841DisFasObs, T01P92_A9841DisFasObs[0]) != 0 )
            {
               GXutil.writeLogln("nwdpfases:[seudo value changed for attri]"+"DisFasObs");
               GXutil.writeLogRaw("Old: ",Z9841DisFasObs);
               GXutil.writeLogRaw("Current: ",T01P92_A9841DisFasObs[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01P92_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("nwdpfases:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01P92_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1P939( )
   {
      beforeValidate1P939( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P939( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1P939( 0) ;
         checkOptimisticConcurrency1P939( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1P939( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1P939( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01P924 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin), A3697FasApr, A9841DisFasObs, A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
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
            load1P939( ) ;
         }
         endLevel1P939( ) ;
      }
      closeExtendedTableCursors1P939( ) ;
   }

   public void update1P939( )
   {
      beforeValidate1P939( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1P939( ) ;
      }
      if ( ( nIsMod_39 != 0 ) || ( nIsDirty_39 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1P939( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1P939( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1P939( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01P925 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n7744FasPreObl), Byte.valueOf(A7744FasPreObl), A3697FasApr, A9841DisFasObs, A457FasCod, A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISFAS");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1P939( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1P939( ) ;
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
            endLevel1P939( ) ;
         }
      }
      closeExtendedTableCursors1P939( ) ;
   }

   public void deferredUpdate1P939( )
   {
   }

   public void delete1P939( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1P939( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1P939( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1P939( ) ;
         afterConfirm1P939( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1P939( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01P926 */
               pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
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
      endLevel1P939( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1P939( )
   {
      standaloneModal1P939( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && (0==A368DisFasLin) )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A758ProCod ;
            GXv_int8[0] = A361DisCod ;
            GXv_int9[0] = A368DisFasLin ;
            new app.plinfas(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_int9) ;
            nwdpfases_impl.this.A396EmprCod = GXv_char4[0] ;
            nwdpfases_impl.this.A758ProCod = GXv_char3[0] ;
            nwdpfases_impl.this.A361DisCod = GXv_int8[0] ;
            nwdpfases_impl.this.A368DisFasLin = GXv_int9[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         }
         /* Using cursor T01P927 */
         pr_default.execute(25, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01P927_A460FasDsc[0] ;
         A4903FasAcab = T01P927_A4903FasAcab[0] ;
         n4903FasAcab = T01P927_n4903FasAcab[0] ;
         A4286FasForMul = T01P927_A4286FasForMul[0] ;
         n4286FasForMul = T01P927_n4286FasForMul[0] ;
         A456FasActTin = T01P927_A456FasActTin[0] ;
         n456FasActTin = T01P927_n456FasActTin[0] ;
         A458FasCon = T01P927_A458FasCon[0] ;
         n458FasCon = T01P927_n458FasCon[0] ;
         A464FasNumPas = T01P927_A464FasNumPas[0] ;
         n464FasNumPas = T01P927_n464FasNumPas[0] ;
         A472FasVelPro = T01P927_A472FasVelPro[0] ;
         n472FasVelPro = T01P927_n472FasVelPro[0] ;
         A468FasPrePie = T01P927_A468FasPrePie[0] ;
         n468FasPrePie = T01P927_n468FasPrePie[0] ;
         A469FasPreSal = T01P927_A469FasPreSal[0] ;
         n469FasPreSal = T01P927_n469FasPreSal[0] ;
         A459FasDec = T01P927_A459FasDec[0] ;
         n459FasDec = T01P927_n459FasDec[0] ;
         A7744FasPreObl = T01P927_A7744FasPreObl[0] ;
         n7744FasPreObl = T01P927_n7744FasPreObl[0] ;
         A602MaqCod = T01P927_A602MaqCod[0] ;
         n602MaqCod = T01P927_n602MaqCod[0] ;
         pr_default.close(25);
         if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
         {
            edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), !bGXsfl_53_Refreshing);
         }
         if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
         {
            edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), !bGXsfl_53_Refreshing);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01P928 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01P929 */
         pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisFPA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01P930 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01P931 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AGRDIS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01P932 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod, Short.valueOf(A368DisFasLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
      }
   }

   public void endLevel1P939( )
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

   public void scanStart1P939( )
   {
      /* Scan By routine */
      /* Using cursor T01P933 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A758ProCod});
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01P933_A368DisFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1P939( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A368DisFasLin = T01P933_A368DisFasLin[0] ;
      }
   }

   public void scanEnd1P939( )
   {
      pr_default.close(31);
   }

   public void afterConfirm1P939( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ && ! (0==A368DisFasLin) && true /* Level */ )
      {
         GXv_char4[0] = A457FasCod ;
         GXv_int8[0] = AV37Clicod ;
         GXv_char3[0] = AV66Disartcod ;
         GXv_char2[0] = httpContext.getMessage( "INS", "") ;
         new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         nwdpfases_impl.this.A457FasCod = GXv_char4[0] ;
         nwdpfases_impl.this.AV37Clicod = GXv_int8[0] ;
         nwdpfases_impl.this.AV66Disartcod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
      }
   }

   public void beforeInsert1P939( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1P939( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1P939( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1P939( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1P939( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1P939( )
   {
      edtDisFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasApr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_53_Refreshing);
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
      edtDisFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_53_Refreshing);
   }

   public void send_integrity_lvl_hashes1P939( )
   {
   }

   public void send_integrity_lvl_hashes1P938( )
   {
   }

   public void subsflControlProps_5339( )
   {
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_53_idx ;
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_53_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_53_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_53_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_53_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_53_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_53_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_53_idx ;
      edtFasApr_Internalname = "FASAPR_"+sGXsfl_53_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_53_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_53_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_53_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_53_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_53_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_53_idx ;
      edtDisFasObs_Internalname = "DISFASOBS_"+sGXsfl_53_idx ;
   }

   public void subsflControlProps_fel_5339( )
   {
      edtavDelete_Internalname = "vDELETE_"+sGXsfl_53_fel_idx ;
      edtDisFasLin_Internalname = "DISFASLIN_"+sGXsfl_53_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_53_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_53_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_53_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_53_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_53_fel_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_53_fel_idx ;
      edtFasApr_Internalname = "FASAPR_"+sGXsfl_53_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_53_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_53_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_53_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_53_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_53_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_53_fel_idx ;
      edtDisFasObs_Internalname = "DISFASOBS_"+sGXsfl_53_fel_idx ;
   }

   public void addRow1P939( )
   {
      nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5339( ) ;
      sendRow1P939( ) ;
   }

   public void sendRow1P939( )
   {
      Gridlevel_fasesRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_fases_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_fases_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_fases_Class, "") != 0 )
         {
            subGridlevel_fases_Linesclass = subGridlevel_fases_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_fases_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_fases_Backstyle = (byte)(0) ;
         subGridlevel_fases_Backcolor = subGridlevel_fases_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_fases_Class, "") != 0 )
         {
            subGridlevel_fases_Linesclass = subGridlevel_fases_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_fases_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_fases_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_fases_Class, "") != 0 )
         {
            subGridlevel_fases_Linesclass = subGridlevel_fases_Class+"Odd" ;
         }
         subGridlevel_fases_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_fases_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_fases_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_53_idx) % (2))) == 0 )
         {
            subGridlevel_fases_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_fases_Class, "") != 0 )
            {
               subGridlevel_fases_Linesclass = subGridlevel_fases_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_fases_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_fases_Class, "") != 0 )
            {
               subGridlevel_fases_Linesclass = subGridlevel_fases_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDelete_Internalname,GXutil.ltrim( localUtil.ntoc( AV139Delete, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDelete_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV139Delete), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV139Delete), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"EVDELETE.CLICK."+sGXsfl_53_idx+"'","","","","",edtavDelete_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDelete_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_53_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_53_idx + "',53)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A368DisFasLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisFasLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_39_" + sGXsfl_53_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_53_idx + "',53)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtFasCod_Forecolor)+";"+((edtFasCod_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtFasCod_Backcolor)+";"),ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasForMul_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasAcab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasApr_Internalname,GXutil.rtrim( A3697FasApr),GXutil.rtrim( localUtil.format( A3697FasApr, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasApr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasApr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasNumPas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasVelPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasPrePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasPreSal_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFasObs_Internalname,A9841DisFasObs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFasObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtDisFasObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_fasesRow);
      send_integrity_lvl_hashes1P939( ) ;
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
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_53_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV137TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV137TrnContext);
      }
      GXCCtl = "vFLAG_NOT_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV67Flag_not, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV71DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vPROCOD_" + sGXsfl_53_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV135ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDELETE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASLIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_53_idx+"Backcolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Backcolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_53_idx+"Forecolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Forecolor, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASAPR_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMPAS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASVELPRO_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREPIE_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPRESAL_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFASOBS_"+sGXsfl_53_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_fasesContainer.AddRow(Gridlevel_fasesRow);
   }

   public void readRow1P939( )
   {
      nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5339( ) ;
      edtavDelete_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vDELETE_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASLIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Backcolor = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Backcolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Forecolor = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Forecolor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACAB_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasApr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASAPR_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISFASOBS_"+sGXsfl_53_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      AV139Delete = (short)(localUtil.ctol( httpContext.cgiGet( edtavDelete_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      n602MaqCod = false ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
      n4286FasForMul = false ;
      A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
      n4903FasAcab = false ;
      A3697FasApr = GXutil.upper( httpContext.cgiGet( edtFasApr_Internalname)) ;
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
      defedtDisFasObs_Enabled = edtDisFasObs_Enabled ;
      defedtFasDec_Enabled = edtFasDec_Enabled ;
      defedtFasPreSal_Enabled = edtFasPreSal_Enabled ;
      defedtFasPrePie_Enabled = edtFasPrePie_Enabled ;
      defedtFasVelPro_Enabled = edtFasVelPro_Enabled ;
      defedtFasNumPas_Enabled = edtFasNumPas_Enabled ;
      defedtFasCon_Enabled = edtFasCon_Enabled ;
      defedtFasApr_Enabled = edtFasApr_Enabled ;
      defedtFasCod_Forecolor = edtFasCod_Forecolor ;
      defedtFasCod_Backcolor = edtFasCod_Backcolor ;
      defedtDisFasLin_Enabled = edtDisFasLin_Enabled ;
   }

   public void confirmValues1P90( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.nwdpfases", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV135ProCod))}, new String[] {"Gx_mode","EmprCod","DisCod","ProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"NwDPFases");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("nwdpfases:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_53", GXutil.ltrim( localUtil.ntoc( nGXsfl_53_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV137TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV137TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV137TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG_NOT", GXutil.ltrim( localUtil.ntoc( AV67Flag_not, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG_NOT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67Flag_not), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV71DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV135ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV135ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV37Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISARTCOD", GXutil.rtrim( AV66Disartcod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREOBL", GXutil.ltrim( localUtil.ntoc( A7744FasPreObl, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Objectcall", GXutil.rtrim( Dvpanel_tableattributes_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Enabled", GXutil.booltostr( Dvpanel_tableattributes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
      return formatLink("app.nwdpfases", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV71DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV135ProCod))}, new String[] {"Gx_mode","EmprCod","DisCod","ProCod"})  ;
   }

   public String getPgmname( )
   {
      return "NwDPFases" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Nw DPFases", "") ;
   }

   public void initializeNonKey1P938( )
   {
      AV37Clicod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
      AV66Disartcod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A335DisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", A335DisArtCod);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
   }

   public void initAll1P938( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKey1P938( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1P939( )
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

   public void initAll1P939( )
   {
      A368DisFasLin = (short)(0) ;
      initializeNonKey1P939( ) ;
   }

   public void standaloneModalInsert1P939( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211673893", true, true);
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
      httpContext.AddJavascriptSource("nwdpfases.js", "?20268211673893", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties39( )
   {
      edtDisFasObs_Enabled = defedtDisFasObs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasObs_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasDec_Enabled = defedtFasDec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasPreSal_Enabled = defedtFasPreSal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasPrePie_Enabled = defedtFasPrePie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasVelPro_Enabled = defedtFasVelPro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasNumPas_Enabled = defedtFasNumPas_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasCon_Enabled = defedtFasCon_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasApr_Enabled = defedtFasApr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasApr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasApr_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtFasCod_Forecolor = defedtFasCod_Forecolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), !bGXsfl_53_Refreshing);
      edtFasCod_Backcolor = defedtFasCod_Backcolor ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), !bGXsfl_53_Refreshing);
      edtDisFasLin_Enabled = defedtDisFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFasLin_Enabled), 5, 0), !bGXsfl_53_Refreshing);
   }

   public void startgridcontrol53( )
   {
      Gridlevel_fasesContainer.AddObjectProperty("GridName", "Gridlevel_fases");
      Gridlevel_fasesContainer.AddObjectProperty("Header", subGridlevel_fases_Header);
      Gridlevel_fasesContainer.AddObjectProperty("DeleteMethod", "none");
      Gridlevel_fasesContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_fasesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_fasesContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV139Delete, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDelete_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridlevel_fasesColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Backcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtFasCod_Forecolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A3697FasApr));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasApr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", A9841DisFasObs);
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavDelete_Internalname = "vDELETE" ;
      edtDisFasLin_Internalname = "DISFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtFasApr_Internalname = "FASAPR" ;
      edtFasCon_Internalname = "FASCON" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtDisFasObs_Internalname = "DISFASOBS" ;
      divTableleaflevel_fases_Internalname = "TABLELEAFLEVEL_FASES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtnfomacab_Internalname = "BTNFOMACAB" ;
      bttBtnnotas_Internalname = "BTNNOTAS" ;
      bttBtnobsfases_Internalname = "BTNOBSFASES" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_fases_Internalname = "GRIDLEVEL_FASES" ;
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
      subGridlevel_fases_Allowcollapsing = (byte)(0) ;
      subGridlevel_fases_Allowselection = (byte)(0) ;
      subGridlevel_fases_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Nw DPFases", "") );
      edtDisFasObs_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasCon_Jsonclick = "" ;
      edtFasApr_Jsonclick = "" ;
      edtFasAcab_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtDisFasLin_Jsonclick = "" ;
      edtavDelete_Jsonclick = "" ;
      subGridlevel_fases_Class = "GridNoBorder WorkWith" ;
      subGridlevel_fases_Backcolorstyle = (byte)(0) ;
      edtDisFasObs_Enabled = 0 ;
      edtFasDec_Enabled = 0 ;
      edtFasPreSal_Enabled = 0 ;
      edtFasPrePie_Enabled = 0 ;
      edtFasVelPro_Enabled = 0 ;
      edtFasNumPas_Enabled = 0 ;
      edtFasCon_Enabled = 0 ;
      edtFasApr_Enabled = 0 ;
      edtFasAcab_Enabled = 0 ;
      edtFasForMul_Enabled = 0 ;
      edtFasActTin_Enabled = 0 ;
      edtMaqCod_Enabled = 0 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtFasCod_Forecolor = (int)(0x000000) ;
      edtFasCod_Backcolor = -1 ;
      edtDisFasLin_Enabled = 1 ;
      edtavDelete_Enabled = 0 ;
      bttBtnobsfases_Visible = 1 ;
      bttBtnnotas_Visible = 1 ;
      bttBtnfomacab_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
      edtDisArtCod_Jsonclick = "" ;
      edtDisArtCod_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void xc_21_1P939( String Gx_mode ,
                            String A396EmprCod ,
                            String A758ProCod ,
                            int A361DisCod ,
                            short A368DisFasLin )
   {
      if ( isIns( )  && (0==A368DisFasLin) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_int8[0] = A361DisCod ;
         GXv_int9[0] = A368DisFasLin ;
         new app.plinfas(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_int9) ;
         A396EmprCod = GXv_char4[0] ;
         A758ProCod = GXv_char3[0] ;
         A361DisCod = GXv_int8[0] ;
         A368DisFasLin = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A758ProCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_24_1P939( )
   {
      if ( isIns( )  && true /* After */ && ! (0==A368DisFasLin) && true /* Level */ )
      {
         GXv_char4[0] = A457FasCod ;
         GXv_int8[0] = AV37Clicod ;
         GXv_char3[0] = AV66Disartcod ;
         GXv_char2[0] = httpContext.getMessage( "INS", "") ;
         new app.pmdispar(remoteHandle, context).execute( A396EmprCod, A361DisCod, A758ProCod, A368DisFasLin, GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
         A457FasCod = GXv_char4[0] ;
         AV37Clicod = GXv_int8[0] ;
         AV66Disartcod = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", AV66Disartcod);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_fases_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5339( ) ;
      while ( nGXsfl_53_idx <= nRC_GXsfl_53 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1P939( ) ;
         standaloneModal1P939( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1P939( ) ;
         nGXsfl_53_idx = (int)(nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5339( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_fasesContainer)) ;
      /* End function gxnrGridlevel_fases_newrow */
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
      /* Using cursor T01P917 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A335DisArtCod = T01P917_A335DisArtCod[0] ;
      A252CliCod = T01P917_A252CliCod[0] ;
      pr_default.close(15);
      AV66Disartcod = A335DisArtCod ;
      AV37Clicod = A252CliCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A335DisArtCod", GXutil.rtrim( A335DisArtCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV66Disartcod", GXutil.rtrim( AV66Disartcod));
      httpContext.ajax_rsp_assign_attri("", false, "AV37Clicod", GXutil.ltrim( localUtil.ntoc( AV37Clicod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Procod( )
   {
      /* Using cursor T01P918 */
      pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A759ProDsc = T01P918_A759ProDsc[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Disfaslin( )
   {
      if ( isIns( )  && (0==A368DisFasLin) )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A758ProCod ;
         GXv_int8[0] = A361DisCod ;
         GXv_int9[0] = A368DisFasLin ;
         new app.plinfas(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int8, GXv_int9) ;
         nwdpfases_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         nwdpfases_impl.this.A758ProCod = GXv_char3[0] ;
         A758ProCod = this.A758ProCod ;
         nwdpfases_impl.this.A361DisCod = GXv_int8[0] ;
         A361DisCod = this.A361DisCod ;
         nwdpfases_impl.this.A368DisFasLin = GXv_int9[0] ;
         A368DisFasLin = this.A368DisFasLin ;
      }
      if ( A368DisFasLin == 9999 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Supero el numero maximo de lineas 9999", ""), 1, "DISFASLIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisFasLin_Internalname ;
      }
      if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      if ( true /* Level */ && ! (GXutil.strcmp("", A9841DisFasObs)==0) )
      {
         edtFasCod_Backcolor = GXutil.getColor( 0, 128, 0) ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Forecolor), 9, 0), !bGXsfl_53_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Backcolor), 9, 0), !bGXsfl_53_Refreshing);
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", GXutil.rtrim( A758ProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A368DisFasLin", GXutil.ltrim( localUtil.ntoc( A368DisFasLin, (byte)(4), (byte)(0), ".", "")));
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
      /* Using cursor T01P927 */
      pr_default.execute(25, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01P927_A460FasDsc[0] ;
      A4903FasAcab = T01P927_A4903FasAcab[0] ;
      n4903FasAcab = T01P927_n4903FasAcab[0] ;
      A4286FasForMul = T01P927_A4286FasForMul[0] ;
      n4286FasForMul = T01P927_n4286FasForMul[0] ;
      A456FasActTin = T01P927_A456FasActTin[0] ;
      n456FasActTin = T01P927_n456FasActTin[0] ;
      A458FasCon = T01P927_A458FasCon[0] ;
      n458FasCon = T01P927_n458FasCon[0] ;
      A464FasNumPas = T01P927_A464FasNumPas[0] ;
      n464FasNumPas = T01P927_n464FasNumPas[0] ;
      A472FasVelPro = T01P927_A472FasVelPro[0] ;
      n472FasVelPro = T01P927_n472FasVelPro[0] ;
      A468FasPrePie = T01P927_A468FasPrePie[0] ;
      n468FasPrePie = T01P927_n468FasPrePie[0] ;
      A469FasPreSal = T01P927_A469FasPreSal[0] ;
      n469FasPreSal = T01P927_n469FasPreSal[0] ;
      A459FasDec = T01P927_A459FasDec[0] ;
      n459FasDec = T01P927_n459FasDec[0] ;
      A7744FasPreObl = T01P927_A7744FasPreObl[0] ;
      n7744FasPreObl = T01P927_n7744FasPreObl[0] ;
      A602MaqCod = T01P927_A602MaqCod[0] ;
      n602MaqCod = T01P927_n602MaqCod[0] ;
      pr_default.close(25);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV135ProCod',fld:'vPROCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV137TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV67Flag_not',fld:'vFLAG_NOT',pic:'9',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV71DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV135ProCod',fld:'vPROCOD',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121P92',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV137TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOFOMACAB'","{handler:'e131P92',iparms:[{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("'DOFOMACAB'",",oparms:[{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DONOTAS'","{handler:'e141P92',iparms:[{av:'AV67Flag_not',fld:'vFLAG_NOT',pic:'9',hsh:true},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("'DONOTAS'",",oparms:[{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOOBSFASES'","{handler:'e151P92',iparms:[{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''}]");
      setEventMetadata("'DOOBSFASES'",",oparms:[{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VDELETE.CLICK","{handler:'e161P92',iparms:[{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''}]");
      setEventMetadata("VDELETE.CLICK",",oparms:[{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV66Disartcod',fld:'vDISARTCOD',pic:''},{av:'AV37Clicod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A335DisArtCod',fld:'DISARTCOD',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV66Disartcod',fld:'vDISARTCOD',pic:''},{av:'AV37Clicod',fld:'vCLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_DISFASLIN","{handler:'valid_Disfaslin',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'},{av:'A9841DisFasObs',fld:'DISFASOBS',pic:''}]");
      setEventMetadata("VALID_DISFASLIN",",oparms:[{av:'edtFasCod_Forecolor',ctrl:'FASCOD',prop:'Forecolor'},{av:'edtFasCod_Backcolor',ctrl:'FASCOD',prop:'Backcolor'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A368DisFasLin',fld:'DISFASLIN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A7744FasPreObl',fld:'FASPREOBL',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
      setEventMetadata("VALID_DISFASOBS","{handler:'valid_Disfasobs',iparms:[]");
      setEventMetadata("VALID_DISFASOBS",",oparms:[]}");
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
      pr_default.close(25);
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV135ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z3697FasApr = "" ;
      Z9841DisFasObs = "" ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      AV32EmprCod = "" ;
      AV135ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A335DisArtCod = "" ;
      A759ProDsc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      bttBtnfomacab_Jsonclick = "" ;
      bttBtnnotas_Jsonclick = "" ;
      bttBtnobsfases_Jsonclick = "" ;
      Gridlevel_fasesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode39 = "" ;
      sStyleString = "" ;
      AV66Disartcod = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode38 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      A460FasDsc = "" ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A4903FasAcab = "" ;
      A3697FasApr = "" ;
      A458FasCon = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A459FasDec = DecimalUtil.ZERO ;
      A9841DisFasObs = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      AV136WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV137TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV138WebSession = httpContext.getWebSession();
      GXv_int7 = new byte[1] ;
      Z335DisArtCod = "" ;
      Z759ProDsc = "" ;
      T01P97_A335DisArtCod = new String[] {""} ;
      T01P97_A252CliCod = new int[1] ;
      T01P98_A759ProDsc = new String[] {""} ;
      T01P99_A335DisArtCod = new String[] {""} ;
      T01P99_A759ProDsc = new String[] {""} ;
      T01P99_A396EmprCod = new String[] {""} ;
      T01P99_A361DisCod = new int[1] ;
      T01P99_A758ProCod = new String[] {""} ;
      T01P99_A252CliCod = new int[1] ;
      T01P910_A335DisArtCod = new String[] {""} ;
      T01P910_A252CliCod = new int[1] ;
      T01P911_A759ProDsc = new String[] {""} ;
      T01P912_A396EmprCod = new String[] {""} ;
      T01P912_A361DisCod = new int[1] ;
      T01P912_A758ProCod = new String[] {""} ;
      T01P96_A396EmprCod = new String[] {""} ;
      T01P96_A361DisCod = new int[1] ;
      T01P96_A758ProCod = new String[] {""} ;
      T01P913_A396EmprCod = new String[] {""} ;
      T01P913_A361DisCod = new int[1] ;
      T01P913_A758ProCod = new String[] {""} ;
      T01P914_A396EmprCod = new String[] {""} ;
      T01P914_A361DisCod = new int[1] ;
      T01P914_A758ProCod = new String[] {""} ;
      T01P95_A396EmprCod = new String[] {""} ;
      T01P95_A361DisCod = new int[1] ;
      T01P95_A758ProCod = new String[] {""} ;
      T01P917_A335DisArtCod = new String[] {""} ;
      T01P917_A252CliCod = new int[1] ;
      T01P918_A759ProDsc = new String[] {""} ;
      T01P919_A396EmprCod = new String[] {""} ;
      T01P919_A361DisCod = new int[1] ;
      T01P919_A758ProCod = new String[] {""} ;
      T01P919_A368DisFasLin = new short[1] ;
      T01P919_A1664ParFasCod = new short[1] ;
      T01P920_A396EmprCod = new String[] {""} ;
      T01P920_A361DisCod = new int[1] ;
      T01P920_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z4903FasAcab = "" ;
      Z4286FasForMul = "" ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z602MaqCod = "" ;
      T01P921_A361DisCod = new int[1] ;
      T01P921_A758ProCod = new String[] {""} ;
      T01P921_A368DisFasLin = new short[1] ;
      T01P921_A460FasDsc = new String[] {""} ;
      T01P921_A4903FasAcab = new String[] {""} ;
      T01P921_n4903FasAcab = new boolean[] {false} ;
      T01P921_A4286FasForMul = new String[] {""} ;
      T01P921_n4286FasForMul = new boolean[] {false} ;
      T01P921_A3697FasApr = new String[] {""} ;
      T01P921_A456FasActTin = new String[] {""} ;
      T01P921_n456FasActTin = new boolean[] {false} ;
      T01P921_A458FasCon = new String[] {""} ;
      T01P921_n458FasCon = new boolean[] {false} ;
      T01P921_A464FasNumPas = new short[1] ;
      T01P921_n464FasNumPas = new boolean[] {false} ;
      T01P921_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P921_n472FasVelPro = new boolean[] {false} ;
      T01P921_A468FasPrePie = new short[1] ;
      T01P921_n468FasPrePie = new boolean[] {false} ;
      T01P921_A469FasPreSal = new short[1] ;
      T01P921_n469FasPreSal = new boolean[] {false} ;
      T01P921_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P921_n459FasDec = new boolean[] {false} ;
      T01P921_A9841DisFasObs = new String[] {""} ;
      T01P921_A7744FasPreObl = new byte[1] ;
      T01P921_n7744FasPreObl = new boolean[] {false} ;
      T01P921_A396EmprCod = new String[] {""} ;
      T01P921_A457FasCod = new String[] {""} ;
      T01P921_A602MaqCod = new String[] {""} ;
      T01P921_n602MaqCod = new boolean[] {false} ;
      T01P94_A460FasDsc = new String[] {""} ;
      T01P94_A4903FasAcab = new String[] {""} ;
      T01P94_n4903FasAcab = new boolean[] {false} ;
      T01P94_A4286FasForMul = new String[] {""} ;
      T01P94_n4286FasForMul = new boolean[] {false} ;
      T01P94_A456FasActTin = new String[] {""} ;
      T01P94_n456FasActTin = new boolean[] {false} ;
      T01P94_A458FasCon = new String[] {""} ;
      T01P94_n458FasCon = new boolean[] {false} ;
      T01P94_A464FasNumPas = new short[1] ;
      T01P94_n464FasNumPas = new boolean[] {false} ;
      T01P94_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P94_n472FasVelPro = new boolean[] {false} ;
      T01P94_A468FasPrePie = new short[1] ;
      T01P94_n468FasPrePie = new boolean[] {false} ;
      T01P94_A469FasPreSal = new short[1] ;
      T01P94_n469FasPreSal = new boolean[] {false} ;
      T01P94_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P94_n459FasDec = new boolean[] {false} ;
      T01P94_A7744FasPreObl = new byte[1] ;
      T01P94_n7744FasPreObl = new boolean[] {false} ;
      T01P94_A602MaqCod = new String[] {""} ;
      T01P94_n602MaqCod = new boolean[] {false} ;
      T01P922_A460FasDsc = new String[] {""} ;
      T01P922_A4903FasAcab = new String[] {""} ;
      T01P922_n4903FasAcab = new boolean[] {false} ;
      T01P922_A4286FasForMul = new String[] {""} ;
      T01P922_n4286FasForMul = new boolean[] {false} ;
      T01P922_A456FasActTin = new String[] {""} ;
      T01P922_n456FasActTin = new boolean[] {false} ;
      T01P922_A458FasCon = new String[] {""} ;
      T01P922_n458FasCon = new boolean[] {false} ;
      T01P922_A464FasNumPas = new short[1] ;
      T01P922_n464FasNumPas = new boolean[] {false} ;
      T01P922_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P922_n472FasVelPro = new boolean[] {false} ;
      T01P922_A468FasPrePie = new short[1] ;
      T01P922_n468FasPrePie = new boolean[] {false} ;
      T01P922_A469FasPreSal = new short[1] ;
      T01P922_n469FasPreSal = new boolean[] {false} ;
      T01P922_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P922_n459FasDec = new boolean[] {false} ;
      T01P922_A7744FasPreObl = new byte[1] ;
      T01P922_n7744FasPreObl = new boolean[] {false} ;
      T01P922_A602MaqCod = new String[] {""} ;
      T01P922_n602MaqCod = new boolean[] {false} ;
      T01P923_A396EmprCod = new String[] {""} ;
      T01P923_A361DisCod = new int[1] ;
      T01P923_A758ProCod = new String[] {""} ;
      T01P923_A368DisFasLin = new short[1] ;
      T01P93_A361DisCod = new int[1] ;
      T01P93_A758ProCod = new String[] {""} ;
      T01P93_A368DisFasLin = new short[1] ;
      T01P93_A3697FasApr = new String[] {""} ;
      T01P93_A9841DisFasObs = new String[] {""} ;
      T01P93_A396EmprCod = new String[] {""} ;
      T01P93_A457FasCod = new String[] {""} ;
      T01P93_A7744FasPreObl = new byte[1] ;
      T01P93_n7744FasPreObl = new boolean[] {false} ;
      T01P92_A361DisCod = new int[1] ;
      T01P92_A758ProCod = new String[] {""} ;
      T01P92_A368DisFasLin = new short[1] ;
      T01P92_A3697FasApr = new String[] {""} ;
      T01P92_A9841DisFasObs = new String[] {""} ;
      T01P92_A396EmprCod = new String[] {""} ;
      T01P92_A457FasCod = new String[] {""} ;
      T01P92_A7744FasPreObl = new byte[1] ;
      T01P92_n7744FasPreObl = new boolean[] {false} ;
      T01P927_A460FasDsc = new String[] {""} ;
      T01P927_A4903FasAcab = new String[] {""} ;
      T01P927_n4903FasAcab = new boolean[] {false} ;
      T01P927_A4286FasForMul = new String[] {""} ;
      T01P927_n4286FasForMul = new boolean[] {false} ;
      T01P927_A456FasActTin = new String[] {""} ;
      T01P927_n456FasActTin = new boolean[] {false} ;
      T01P927_A458FasCon = new String[] {""} ;
      T01P927_n458FasCon = new boolean[] {false} ;
      T01P927_A464FasNumPas = new short[1] ;
      T01P927_n464FasNumPas = new boolean[] {false} ;
      T01P927_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P927_n472FasVelPro = new boolean[] {false} ;
      T01P927_A468FasPrePie = new short[1] ;
      T01P927_n468FasPrePie = new boolean[] {false} ;
      T01P927_A469FasPreSal = new short[1] ;
      T01P927_n469FasPreSal = new boolean[] {false} ;
      T01P927_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01P927_n459FasDec = new boolean[] {false} ;
      T01P927_A7744FasPreObl = new byte[1] ;
      T01P927_n7744FasPreObl = new boolean[] {false} ;
      T01P927_A602MaqCod = new String[] {""} ;
      T01P927_n602MaqCod = new boolean[] {false} ;
      T01P928_A396EmprCod = new String[] {""} ;
      T01P928_A361DisCod = new int[1] ;
      T01P928_A758ProCod = new String[] {""} ;
      T01P928_A368DisFasLin = new short[1] ;
      T01P928_A7919Dta_Ordl = new short[1] ;
      T01P929_A396EmprCod = new String[] {""} ;
      T01P929_A361DisCod = new int[1] ;
      T01P929_A758ProCod = new String[] {""} ;
      T01P929_A368DisFasLin = new short[1] ;
      T01P929_A7727ArtAdiCod = new short[1] ;
      T01P930_A396EmprCod = new String[] {""} ;
      T01P930_A361DisCod = new int[1] ;
      T01P930_A758ProCod = new String[] {""} ;
      T01P930_A368DisFasLin = new short[1] ;
      T01P930_A5377DisQuiLin = new short[1] ;
      T01P931_A396EmprCod = new String[] {""} ;
      T01P931_A361DisCod = new int[1] ;
      T01P931_A758ProCod = new String[] {""} ;
      T01P931_A368DisFasLin = new short[1] ;
      T01P931_A5035A_Discod = new int[1] ;
      T01P931_A5038A_DProcod = new String[] {""} ;
      T01P931_A5039A_DOrdlin = new short[1] ;
      T01P932_A396EmprCod = new String[] {""} ;
      T01P932_A361DisCod = new int[1] ;
      T01P932_A758ProCod = new String[] {""} ;
      T01P932_A368DisFasLin = new short[1] ;
      T01P932_A1664ParFasCod = new short[1] ;
      T01P933_A396EmprCod = new String[] {""} ;
      T01P933_A361DisCod = new int[1] ;
      T01P933_A758ProCod = new String[] {""} ;
      T01P933_A368DisFasLin = new short[1] ;
      Gridlevel_fasesRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_fases_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_fasesColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_char2 = new String[1] ;
      ZV66Disartcod = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.nwdpfases__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.nwdpfases__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.nwdpfases__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.nwdpfases__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.nwdpfases__default(),
         new Object[] {
             new Object[] {
            T01P92_A361DisCod, T01P92_A758ProCod, T01P92_A368DisFasLin, T01P92_A3697FasApr, T01P92_A9841DisFasObs, T01P92_A396EmprCod, T01P92_A457FasCod, T01P92_A7744FasPreObl, T01P92_n7744FasPreObl
            }
            , new Object[] {
            T01P93_A361DisCod, T01P93_A758ProCod, T01P93_A368DisFasLin, T01P93_A3697FasApr, T01P93_A9841DisFasObs, T01P93_A396EmprCod, T01P93_A457FasCod, T01P93_A7744FasPreObl, T01P93_n7744FasPreObl
            }
            , new Object[] {
            T01P94_A460FasDsc, T01P94_A4903FasAcab, T01P94_n4903FasAcab, T01P94_A4286FasForMul, T01P94_n4286FasForMul, T01P94_A456FasActTin, T01P94_n456FasActTin, T01P94_A458FasCon, T01P94_n458FasCon, T01P94_A464FasNumPas,
            T01P94_n464FasNumPas, T01P94_A472FasVelPro, T01P94_n472FasVelPro, T01P94_A468FasPrePie, T01P94_n468FasPrePie, T01P94_A469FasPreSal, T01P94_n469FasPreSal, T01P94_A459FasDec, T01P94_n459FasDec, T01P94_A7744FasPreObl,
            T01P94_n7744FasPreObl, T01P94_A602MaqCod, T01P94_n602MaqCod
            }
            , new Object[] {
            T01P95_A396EmprCod, T01P95_A361DisCod, T01P95_A758ProCod
            }
            , new Object[] {
            T01P96_A396EmprCod, T01P96_A361DisCod, T01P96_A758ProCod
            }
            , new Object[] {
            T01P97_A335DisArtCod, T01P97_A252CliCod
            }
            , new Object[] {
            T01P98_A759ProDsc
            }
            , new Object[] {
            T01P99_A335DisArtCod, T01P99_A759ProDsc, T01P99_A396EmprCod, T01P99_A361DisCod, T01P99_A758ProCod, T01P99_A252CliCod
            }
            , new Object[] {
            T01P910_A335DisArtCod, T01P910_A252CliCod
            }
            , new Object[] {
            T01P911_A759ProDsc
            }
            , new Object[] {
            T01P912_A396EmprCod, T01P912_A361DisCod, T01P912_A758ProCod
            }
            , new Object[] {
            T01P913_A396EmprCod, T01P913_A361DisCod, T01P913_A758ProCod
            }
            , new Object[] {
            T01P914_A396EmprCod, T01P914_A361DisCod, T01P914_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P917_A335DisArtCod, T01P917_A252CliCod
            }
            , new Object[] {
            T01P918_A759ProDsc
            }
            , new Object[] {
            T01P919_A396EmprCod, T01P919_A361DisCod, T01P919_A758ProCod, T01P919_A368DisFasLin, T01P919_A1664ParFasCod
            }
            , new Object[] {
            T01P920_A396EmprCod, T01P920_A361DisCod, T01P920_A758ProCod
            }
            , new Object[] {
            T01P921_A361DisCod, T01P921_A758ProCod, T01P921_A368DisFasLin, T01P921_A460FasDsc, T01P921_A4903FasAcab, T01P921_n4903FasAcab, T01P921_A4286FasForMul, T01P921_n4286FasForMul, T01P921_A3697FasApr, T01P921_A456FasActTin,
            T01P921_n456FasActTin, T01P921_A458FasCon, T01P921_n458FasCon, T01P921_A464FasNumPas, T01P921_n464FasNumPas, T01P921_A472FasVelPro, T01P921_n472FasVelPro, T01P921_A468FasPrePie, T01P921_n468FasPrePie, T01P921_A469FasPreSal,
            T01P921_n469FasPreSal, T01P921_A459FasDec, T01P921_n459FasDec, T01P921_A9841DisFasObs, T01P921_A7744FasPreObl, T01P921_n7744FasPreObl, T01P921_A396EmprCod, T01P921_A457FasCod, T01P921_A602MaqCod, T01P921_n602MaqCod
            }
            , new Object[] {
            T01P922_A460FasDsc, T01P922_A4903FasAcab, T01P922_n4903FasAcab, T01P922_A4286FasForMul, T01P922_n4286FasForMul, T01P922_A456FasActTin, T01P922_n456FasActTin, T01P922_A458FasCon, T01P922_n458FasCon, T01P922_A464FasNumPas,
            T01P922_n464FasNumPas, T01P922_A472FasVelPro, T01P922_n472FasVelPro, T01P922_A468FasPrePie, T01P922_n468FasPrePie, T01P922_A469FasPreSal, T01P922_n469FasPreSal, T01P922_A459FasDec, T01P922_n459FasDec, T01P922_A7744FasPreObl,
            T01P922_n7744FasPreObl, T01P922_A602MaqCod, T01P922_n602MaqCod
            }
            , new Object[] {
            T01P923_A396EmprCod, T01P923_A361DisCod, T01P923_A758ProCod, T01P923_A368DisFasLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01P927_A460FasDsc, T01P927_A4903FasAcab, T01P927_n4903FasAcab, T01P927_A4286FasForMul, T01P927_n4286FasForMul, T01P927_A456FasActTin, T01P927_n456FasActTin, T01P927_A458FasCon, T01P927_n458FasCon, T01P927_A464FasNumPas,
            T01P927_n464FasNumPas, T01P927_A472FasVelPro, T01P927_n472FasVelPro, T01P927_A468FasPrePie, T01P927_n468FasPrePie, T01P927_A469FasPreSal, T01P927_n469FasPreSal, T01P927_A459FasDec, T01P927_n459FasDec, T01P927_A7744FasPreObl,
            T01P927_n7744FasPreObl, T01P927_A602MaqCod, T01P927_n602MaqCod
            }
            , new Object[] {
            T01P928_A396EmprCod, T01P928_A361DisCod, T01P928_A758ProCod, T01P928_A368DisFasLin, T01P928_A7919Dta_Ordl
            }
            , new Object[] {
            T01P929_A396EmprCod, T01P929_A361DisCod, T01P929_A758ProCod, T01P929_A368DisFasLin, T01P929_A7727ArtAdiCod
            }
            , new Object[] {
            T01P930_A396EmprCod, T01P930_A361DisCod, T01P930_A758ProCod, T01P930_A368DisFasLin, T01P930_A5377DisQuiLin
            }
            , new Object[] {
            T01P931_A396EmprCod, T01P931_A361DisCod, T01P931_A758ProCod, T01P931_A368DisFasLin, T01P931_A5035A_Discod, T01P931_A5038A_DProcod, T01P931_A5039A_DOrdlin
            }
            , new Object[] {
            T01P932_A396EmprCod, T01P932_A361DisCod, T01P932_A758ProCod, T01P932_A368DisFasLin, T01P932_A1664ParFasCod
            }
            , new Object[] {
            T01P933_A396EmprCod, T01P933_A361DisCod, T01P933_A758ProCod, T01P933_A368DisFasLin
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A7744FasPreObl ;
   private byte AV67Flag_not ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Gx_BScreen ;
   private byte Z7744FasPreObl ;
   private byte subGridlevel_fases_Backcolorstyle ;
   private byte subGridlevel_fases_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_fases_Allowselection ;
   private byte subGridlevel_fases_Allowhovering ;
   private byte subGridlevel_fases_Allowcollapsing ;
   private byte subGridlevel_fases_Collapsed ;
   private short Z368DisFasLin ;
   private short nRcdDeleted_39 ;
   private short nRcdExists_39 ;
   private short nIsMod_39 ;
   private short A368DisFasLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount39 ;
   private short RcdFound39 ;
   private short nBlankRcdUsr39 ;
   private short RcdFound38 ;
   private short AV139Delete ;
   private short A464FasNumPas ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short nIsDirty_38 ;
   private short Z464FasNumPas ;
   private short Z468FasPrePie ;
   private short Z469FasPreSal ;
   private short nIsDirty_39 ;
   private short GXv_int9[] ;
   private int wcpOAV71DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_53 ;
   private int nGXsfl_53_idx=1 ;
   private int A361DisCod ;
   private int AV71DisCod ;
   private int trnEnded ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtDisArtCod_Enabled ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtnfomacab_Visible ;
   private int bttBtnnotas_Visible ;
   private int bttBtnobsfases_Visible ;
   private int edtavDelete_Enabled ;
   private int edtDisFasLin_Enabled ;
   private int edtFasCod_Backcolor ;
   private int edtFasCod_Forecolor ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtFasForMul_Enabled ;
   private int edtFasAcab_Enabled ;
   private int edtFasApr_Enabled ;
   private int edtFasCon_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtDisFasObs_Enabled ;
   private int fRowAdded ;
   private int AV37Clicod ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int subGridlevel_fases_Backcolor ;
   private int subGridlevel_fases_Allbackcolor ;
   private int defedtDisFasObs_Enabled ;
   private int defedtFasDec_Enabled ;
   private int defedtFasPreSal_Enabled ;
   private int defedtFasPrePie_Enabled ;
   private int defedtFasVelPro_Enabled ;
   private int defedtFasNumPas_Enabled ;
   private int defedtFasCon_Enabled ;
   private int defedtFasApr_Enabled ;
   private int defedtFasCod_Forecolor ;
   private int defedtFasCod_Backcolor ;
   private int defedtDisFasLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_fases_Selectedindex ;
   private int subGridlevel_fases_Selectioncolor ;
   private int subGridlevel_fases_Hoveringcolor ;
   private int ZV37Clicod ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_FASES_nFirstRecordOnPage ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV135ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z3697FasApr ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String AV32EmprCod ;
   private String AV135ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_53_idx="0001" ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divTableleaflevel_fases_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String bttBtnfomacab_Internalname ;
   private String bttBtnfomacab_Jsonclick ;
   private String bttBtnnotas_Internalname ;
   private String bttBtnnotas_Jsonclick ;
   private String bttBtnobsfases_Internalname ;
   private String bttBtnobsfases_Jsonclick ;
   private String sMode39 ;
   private String edtavDelete_Internalname ;
   private String edtDisFasLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtFasActTin_Internalname ;
   private String edtFasForMul_Internalname ;
   private String edtFasAcab_Internalname ;
   private String edtFasApr_Internalname ;
   private String edtFasCon_Internalname ;
   private String edtFasNumPas_Internalname ;
   private String edtFasVelPro_Internalname ;
   private String edtFasPrePie_Internalname ;
   private String edtFasPreSal_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtDisFasObs_Internalname ;
   private String sStyleString ;
   private String subGridlevel_fases_Internalname ;
   private String AV66Disartcod ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode38 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A4903FasAcab ;
   private String A3697FasApr ;
   private String A458FasCon ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z335DisArtCod ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z4903FasAcab ;
   private String Z4286FasForMul ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z602MaqCod ;
   private String sGXsfl_53_fel_idx="0001" ;
   private String subGridlevel_fases_Class ;
   private String subGridlevel_fases_Linesclass ;
   private String ROClassString ;
   private String edtavDelete_Jsonclick ;
   private String edtDisFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasAcab_Jsonclick ;
   private String edtFasApr_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtDisFasObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_fases_Header ;
   private String GXv_char2[] ;
   private String ZV66Disartcod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_53_Refreshing=false ;
   private boolean n7744FasPreObl ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private boolean n4903FasAcab ;
   private boolean n458FasCon ;
   private boolean n464FasNumPas ;
   private boolean n472FasVelPro ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n459FasDec ;
   private boolean returnInSub ;
   private String Z9841DisFasObs ;
   private String A9841DisFasObs ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_fasesContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_fasesRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_fasesColumn ;
   private com.genexus.webpanels.WebSession AV138WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01P97_A335DisArtCod ;
   private int[] T01P97_A252CliCod ;
   private String[] T01P98_A759ProDsc ;
   private String[] T01P99_A335DisArtCod ;
   private String[] T01P99_A759ProDsc ;
   private String[] T01P99_A396EmprCod ;
   private int[] T01P99_A361DisCod ;
   private String[] T01P99_A758ProCod ;
   private int[] T01P99_A252CliCod ;
   private String[] T01P910_A335DisArtCod ;
   private int[] T01P910_A252CliCod ;
   private String[] T01P911_A759ProDsc ;
   private String[] T01P912_A396EmprCod ;
   private int[] T01P912_A361DisCod ;
   private String[] T01P912_A758ProCod ;
   private String[] T01P96_A396EmprCod ;
   private int[] T01P96_A361DisCod ;
   private String[] T01P96_A758ProCod ;
   private String[] T01P913_A396EmprCod ;
   private int[] T01P913_A361DisCod ;
   private String[] T01P913_A758ProCod ;
   private String[] T01P914_A396EmprCod ;
   private int[] T01P914_A361DisCod ;
   private String[] T01P914_A758ProCod ;
   private String[] T01P95_A396EmprCod ;
   private int[] T01P95_A361DisCod ;
   private String[] T01P95_A758ProCod ;
   private String[] T01P917_A335DisArtCod ;
   private int[] T01P917_A252CliCod ;
   private String[] T01P918_A759ProDsc ;
   private String[] T01P919_A396EmprCod ;
   private int[] T01P919_A361DisCod ;
   private String[] T01P919_A758ProCod ;
   private short[] T01P919_A368DisFasLin ;
   private short[] T01P919_A1664ParFasCod ;
   private String[] T01P920_A396EmprCod ;
   private int[] T01P920_A361DisCod ;
   private String[] T01P920_A758ProCod ;
   private int[] T01P921_A361DisCod ;
   private String[] T01P921_A758ProCod ;
   private short[] T01P921_A368DisFasLin ;
   private String[] T01P921_A460FasDsc ;
   private String[] T01P921_A4903FasAcab ;
   private boolean[] T01P921_n4903FasAcab ;
   private String[] T01P921_A4286FasForMul ;
   private boolean[] T01P921_n4286FasForMul ;
   private String[] T01P921_A3697FasApr ;
   private String[] T01P921_A456FasActTin ;
   private boolean[] T01P921_n456FasActTin ;
   private String[] T01P921_A458FasCon ;
   private boolean[] T01P921_n458FasCon ;
   private short[] T01P921_A464FasNumPas ;
   private boolean[] T01P921_n464FasNumPas ;
   private java.math.BigDecimal[] T01P921_A472FasVelPro ;
   private boolean[] T01P921_n472FasVelPro ;
   private short[] T01P921_A468FasPrePie ;
   private boolean[] T01P921_n468FasPrePie ;
   private short[] T01P921_A469FasPreSal ;
   private boolean[] T01P921_n469FasPreSal ;
   private java.math.BigDecimal[] T01P921_A459FasDec ;
   private boolean[] T01P921_n459FasDec ;
   private String[] T01P921_A9841DisFasObs ;
   private byte[] T01P921_A7744FasPreObl ;
   private boolean[] T01P921_n7744FasPreObl ;
   private String[] T01P921_A396EmprCod ;
   private String[] T01P921_A457FasCod ;
   private String[] T01P921_A602MaqCod ;
   private boolean[] T01P921_n602MaqCod ;
   private String[] T01P94_A460FasDsc ;
   private String[] T01P94_A4903FasAcab ;
   private boolean[] T01P94_n4903FasAcab ;
   private String[] T01P94_A4286FasForMul ;
   private boolean[] T01P94_n4286FasForMul ;
   private String[] T01P94_A456FasActTin ;
   private boolean[] T01P94_n456FasActTin ;
   private String[] T01P94_A458FasCon ;
   private boolean[] T01P94_n458FasCon ;
   private short[] T01P94_A464FasNumPas ;
   private boolean[] T01P94_n464FasNumPas ;
   private java.math.BigDecimal[] T01P94_A472FasVelPro ;
   private boolean[] T01P94_n472FasVelPro ;
   private short[] T01P94_A468FasPrePie ;
   private boolean[] T01P94_n468FasPrePie ;
   private short[] T01P94_A469FasPreSal ;
   private boolean[] T01P94_n469FasPreSal ;
   private java.math.BigDecimal[] T01P94_A459FasDec ;
   private boolean[] T01P94_n459FasDec ;
   private byte[] T01P94_A7744FasPreObl ;
   private boolean[] T01P94_n7744FasPreObl ;
   private String[] T01P94_A602MaqCod ;
   private boolean[] T01P94_n602MaqCod ;
   private String[] T01P922_A460FasDsc ;
   private String[] T01P922_A4903FasAcab ;
   private boolean[] T01P922_n4903FasAcab ;
   private String[] T01P922_A4286FasForMul ;
   private boolean[] T01P922_n4286FasForMul ;
   private String[] T01P922_A456FasActTin ;
   private boolean[] T01P922_n456FasActTin ;
   private String[] T01P922_A458FasCon ;
   private boolean[] T01P922_n458FasCon ;
   private short[] T01P922_A464FasNumPas ;
   private boolean[] T01P922_n464FasNumPas ;
   private java.math.BigDecimal[] T01P922_A472FasVelPro ;
   private boolean[] T01P922_n472FasVelPro ;
   private short[] T01P922_A468FasPrePie ;
   private boolean[] T01P922_n468FasPrePie ;
   private short[] T01P922_A469FasPreSal ;
   private boolean[] T01P922_n469FasPreSal ;
   private java.math.BigDecimal[] T01P922_A459FasDec ;
   private boolean[] T01P922_n459FasDec ;
   private byte[] T01P922_A7744FasPreObl ;
   private boolean[] T01P922_n7744FasPreObl ;
   private String[] T01P922_A602MaqCod ;
   private boolean[] T01P922_n602MaqCod ;
   private String[] T01P923_A396EmprCod ;
   private int[] T01P923_A361DisCod ;
   private String[] T01P923_A758ProCod ;
   private short[] T01P923_A368DisFasLin ;
   private int[] T01P93_A361DisCod ;
   private String[] T01P93_A758ProCod ;
   private short[] T01P93_A368DisFasLin ;
   private String[] T01P93_A3697FasApr ;
   private String[] T01P93_A9841DisFasObs ;
   private String[] T01P93_A396EmprCod ;
   private String[] T01P93_A457FasCod ;
   private byte[] T01P93_A7744FasPreObl ;
   private boolean[] T01P93_n7744FasPreObl ;
   private int[] T01P92_A361DisCod ;
   private String[] T01P92_A758ProCod ;
   private short[] T01P92_A368DisFasLin ;
   private String[] T01P92_A3697FasApr ;
   private String[] T01P92_A9841DisFasObs ;
   private String[] T01P92_A396EmprCod ;
   private String[] T01P92_A457FasCod ;
   private byte[] T01P92_A7744FasPreObl ;
   private boolean[] T01P92_n7744FasPreObl ;
   private String[] T01P927_A460FasDsc ;
   private String[] T01P927_A4903FasAcab ;
   private boolean[] T01P927_n4903FasAcab ;
   private String[] T01P927_A4286FasForMul ;
   private boolean[] T01P927_n4286FasForMul ;
   private String[] T01P927_A456FasActTin ;
   private boolean[] T01P927_n456FasActTin ;
   private String[] T01P927_A458FasCon ;
   private boolean[] T01P927_n458FasCon ;
   private short[] T01P927_A464FasNumPas ;
   private boolean[] T01P927_n464FasNumPas ;
   private java.math.BigDecimal[] T01P927_A472FasVelPro ;
   private boolean[] T01P927_n472FasVelPro ;
   private short[] T01P927_A468FasPrePie ;
   private boolean[] T01P927_n468FasPrePie ;
   private short[] T01P927_A469FasPreSal ;
   private boolean[] T01P927_n469FasPreSal ;
   private java.math.BigDecimal[] T01P927_A459FasDec ;
   private boolean[] T01P927_n459FasDec ;
   private byte[] T01P927_A7744FasPreObl ;
   private boolean[] T01P927_n7744FasPreObl ;
   private String[] T01P927_A602MaqCod ;
   private boolean[] T01P927_n602MaqCod ;
   private String[] T01P928_A396EmprCod ;
   private int[] T01P928_A361DisCod ;
   private String[] T01P928_A758ProCod ;
   private short[] T01P928_A368DisFasLin ;
   private short[] T01P928_A7919Dta_Ordl ;
   private String[] T01P929_A396EmprCod ;
   private int[] T01P929_A361DisCod ;
   private String[] T01P929_A758ProCod ;
   private short[] T01P929_A368DisFasLin ;
   private short[] T01P929_A7727ArtAdiCod ;
   private String[] T01P930_A396EmprCod ;
   private int[] T01P930_A361DisCod ;
   private String[] T01P930_A758ProCod ;
   private short[] T01P930_A368DisFasLin ;
   private short[] T01P930_A5377DisQuiLin ;
   private String[] T01P931_A396EmprCod ;
   private int[] T01P931_A361DisCod ;
   private String[] T01P931_A758ProCod ;
   private short[] T01P931_A368DisFasLin ;
   private int[] T01P931_A5035A_Discod ;
   private String[] T01P931_A5038A_DProcod ;
   private short[] T01P931_A5039A_DOrdlin ;
   private String[] T01P932_A396EmprCod ;
   private int[] T01P932_A361DisCod ;
   private String[] T01P932_A758ProCod ;
   private short[] T01P932_A368DisFasLin ;
   private short[] T01P932_A1664ParFasCod ;
   private String[] T01P933_A396EmprCod ;
   private int[] T01P933_A361DisCod ;
   private String[] T01P933_A758ProCod ;
   private short[] T01P933_A368DisFasLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV136WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV137TrnContext ;
}

final  class nwdpfases__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpfases__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpfases__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpfases__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class nwdpfases__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01P92", "SELECT DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?  FOR UPDATE OF FasApr, DisFasObs, FasCod, FasPreObl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P93", "SELECT DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, FasPreObl FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P94", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P95", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P96", "SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P97", "SELECT DisArtCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P98", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P99", "SELECT /*+ FIRST_ROWS(100) */ T2.DisArtCod, T3.ProDsc, TM1.EmprCod, TM1.DisCod, TM1.ProCod, T2.CliCod FROM ((TXPDISLIN TM1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = TM1.EmprCod AND T2.DisCod = TM1.DisCod) INNER JOIN TXPPROCES T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.DisCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P910", "SELECT DisArtCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P911", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P912", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P913", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ? or DisCod = ? and EmprCod = ? and ProCod > ?) ORDER BY EmprCod, DisCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P914", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ? or DisCod = ? and EmprCod = ? and ProCod < ?) ORDER BY EmprCod DESC, DisCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01P915", "INSERT INTO TXPDISLIN(EmprCod, DisCod, ProCod, UltFasLin, DisFasApr, ProSts, ProStsFec) VALUES(?, ?, ?, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPDISLIN")
         ,new UpdateCursor("T01P916", "DELETE FROM TXPDISLIN  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?", GX_NOMASK, "TXPDISLIN")
         ,new ForEachCursor("T01P917", "SELECT DisArtCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P918", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P919", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P920", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod, ProCod FROM TXPDISLIN ORDER BY EmprCod, DisCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P921", "SELECT T1.DisCod, T1.ProCod, T1.DisFasLin, T2.FasDsc, T2.FasAcab, T2.FasForMul, T1.FasApr, T2.FasActTin, T2.FasCon, T2.FasNumPas, T2.FasVelPro, T2.FasPrePie, T2.FasPreSal, T2.FasDec, T1.DisFasObs, T1.FasPreObl, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPDISFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.ProCod = ? and T1.DisFasLin = ? ORDER BY T1.EmprCod, T1.DisCod, T1.ProCod, T1.DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P922", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P923", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01P924", "INSERT INTO TXPDISFAS(FasPreObl, DisCod, ProCod, DisFasLin, FasApr, DisFasObs, EmprCod, FasCod, DisMaqPru, DisQuiUl, DisFasPre, DisFasUni, DisFasDto, DisFasRec, DisFasAut, Disfastpp, DisFasUpL, DisfasRb, Dta_UOrd, DisPreSal, DisPrePie, DisVelPro, DisNumPas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01P925", "UPDATE TXPDISFAS SET FasPreObl=?, FasApr=?, DisFasObs=?, FasCod=?  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new UpdateCursor("T01P926", "DELETE FROM TXPDISFAS  WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?", GX_NOMASK, "TXPDISFAS")
         ,new ForEachCursor("T01P927", "SELECT FasDsc, FasAcab, FasForMul, FasActTin, FasCon, FasNumPas, FasVelPro, FasPrePie, FasPreSal, FasDec, FasPreObl, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01P928", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, Dta_Ordl FROM TXPDT004 WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P929", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ArtAdiCod FROM TXPDisFPA WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P930", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, DisQuiLin FROM TXPDISQUI WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P931", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, A_Discod, A_DProcod, A_DOrdlin FROM TXPAGRDIS WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P932", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND DisCod = ? AND ProCod = ? AND DisFasLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01P933", "SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? and DisCod = ? and ProCod = ? ORDER BY EmprCod, DisCod, ProCod, DisFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
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
            case 20 :
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
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 25 :
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 8);
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
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 8);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setVarchar(6, (String)parms[6], 3000, false);
               stmt.setString(7, (String)parms[7], 3);
               stmt.setString(8, (String)parms[8], 8);
               return;
            case 23 :
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

