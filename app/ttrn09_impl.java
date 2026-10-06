package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn09_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action29") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_29_1L7194( Gx_mode, A396EmprCod, A252CliCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FASCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgafascod1L70( A396EmprCod, A13781FasCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FASCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgafascod1L70( A396EmprCod, A13781FasCDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"FASCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h457FasCod = httpContext.GetPar( "h457FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcafascod1L7194( A396EmprCod, h457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_33( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_35( A396EmprCod, A30AlbProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_34") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_34( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
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
         gxload_38( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_40") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_40( A396EmprCod, A252CliCod, A457FasCod) ;
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
            AV42AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42AlbProCod), "ZZZZZZZZZ9")));
            AV180BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV180BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV180BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180BarCod), "ZZZZZZZ9")));
            AV181BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV181BarCodReo", GXutil.str( AV181BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV181BarCodReo), "9")));
            AV182BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV182BarCodPar", AV182BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182BarCodPar, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guias (Fases)", ""), (short)(0)) ;
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
      A13786GuiFasMaxL = (short)(GXutil.lval( httpContext.GetPar( "GuiFasMaxL"))) ;
      n13786GuiFasMaxL = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A1261BarAlbKgmE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbKgmE"), ".") ;
      A1263BarAlbMtrE = CommonUtil.decimalVal( httpContext.GetPar( "BarAlbMtrE"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_fases_newrow( ) ;
      /* End function gxnrGridlevel_fases_newrow_invoke */
   }

   public ttrn09_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn09_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn09_impl.class ));
   }

   public ttrn09_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "N Guia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "OS", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DataContentCell", "left", "top", "", "flex-grow:1;", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasMaxL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasMaxL_Internalname, httpContext.getMessage( "Línea Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasMaxL_Internalname, GXutil.ltrim( localUtil.ntoc( A13786GuiFasMaxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasMaxL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13786GuiFasMaxL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13786GuiFasMaxL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasMaxL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGuiFasMaxL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn09.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn09.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn09.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasULin_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiFasULin_Visible, edtGuiFasULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbKgmE_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAlbKgmE_Visible, edtBarAlbKgmE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbMtrE_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAlbMtrE_Visible, edtBarAlbMtrE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrEst_Internalname, GXutil.rtrim( A120BarAgrEst), GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrEst_Jsonclick, 0, "Attribute", "", "", "", "", edtBarAgrEst_Visible, edtBarAgrEst_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn09.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiRemCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiRemCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiRemCli_Jsonclick, 0, "Attribute", "", "", "", "", edtGuiRemCli_Visible, edtGuiRemCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn09.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_fases( )
   {
      /*  Grid Control  */
      startgridcontrol47( ) ;
      nGXsfl_47_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount194 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_194 = (short)(1) ;
            scanStart1L7194( ) ;
            while ( RcdFound194 != 0 )
            {
               init_level_properties194( ) ;
               getByPrimaryKey1L7194( ) ;
               addRow1L7194( ) ;
               scanNext1L7194( ) ;
            }
            scanEnd1L7194( ) ;
            nBlankRcdCount194 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B13786GuiFasMaxL = A13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         standaloneNotModal1L7194( ) ;
         standaloneModal1L7194( ) ;
         sMode194 = Gx_mode ;
         while ( nGXsfl_47_idx < nRC_GXsfl_47 )
         {
            bGXsfl_47_Refreshing = true ;
            readRow1L7194( ) ;
            edtGuiFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASLIN_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASKGM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtGuiFasPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPKG_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASMTR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtGuiFasPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPMT_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMTR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASIMP_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasImp_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASUND_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            edtFasPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREUND_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
            if ( ( nRcdExists_194 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1L7194( ) ;
            }
            sendRow1L7194( ) ;
            bGXsfl_47_Refreshing = false ;
         }
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13786GuiFasMaxL = B13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount194 = (short)(5) ;
         nRcdExists_194 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1L7194( ) ;
            while ( RcdFound194 != 0 )
            {
               sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_47194( ) ;
               init_level_properties194( ) ;
               standaloneNotModal1L7194( ) ;
               getByPrimaryKey1L7194( ) ;
               standaloneModal1L7194( ) ;
               addRow1L7194( ) ;
               scanNext1L7194( ) ;
            }
            scanEnd1L7194( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode194 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_47194( ) ;
         initAll1L7194( ) ;
         init_level_properties194( ) ;
         B13786GuiFasMaxL = A13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         nRcdExists_194 = (short)(0) ;
         nIsMod_194 = (short)(0) ;
         nRcdDeleted_194 = (short)(0) ;
         nBlankRcdCount194 = (short)(nBlankRcdUsr194+nBlankRcdCount194) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount194 > 0 )
         {
            standaloneNotModal1L7194( ) ;
            standaloneModal1L7194( ) ;
            addRow1L7194( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount194 = (short)(nBlankRcdCount194-1) ;
         }
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13786GuiFasMaxL = B13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
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
      e111L72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            O13786GuiFasMaxL = (short)(localUtil.ctol( httpContext.cgiGet( "O13786GuiFasMaxL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV42AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            AV180BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV181BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV182BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = httpContext.cgiGet( "GXHCFASCOD") ;
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
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A13786GuiFasMaxL = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasMaxL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13786GuiFasMaxL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASULIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGuiFasULin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1248GuiFasULin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
            }
            else
            {
               A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBKGME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbKgmE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1261BarAlbKgmE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
            }
            else
            {
               A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBMTRE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbMtrE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1263BarAlbMtrE = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
            }
            else
            {
               A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
            }
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn09");
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn09:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
                  sMode195 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode195 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound195 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1L70( ) ;
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
                        e111L72 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121L72 ();
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
         e121L72 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1L7195( ) ;
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
         disableAttributes1L7195( ) ;
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

   public void confirm_1L70( )
   {
      beforeValidate1L7195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1L7195( ) ;
         }
         else
         {
            checkExtendedTable1L7195( ) ;
            closeExtendedTableCursors1L7195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_1L7194( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode195 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1L7194( )
   {
      s13786GuiFasMaxL = O13786GuiFasMaxL ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRow1L7194( ) ;
         if ( ( nRcdExists_194 != 0 ) || ( nIsMod_194 != 0 ) )
         {
            getKey1L7194( ) ;
            if ( ( nRcdExists_194 == 0 ) && ( nRcdDeleted_194 == 0 ) )
            {
               if ( RcdFound194 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1L7194( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1L7194( ) ;
                     closeExtendedTableCursors1L7194( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O13786GuiFasMaxL = A13786GuiFasMaxL ;
                     n13786GuiFasMaxL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound194 != 0 )
               {
                  if ( nRcdDeleted_194 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1L7194( ) ;
                     load1L7194( ) ;
                     beforeValidate1L7194( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1L7194( ) ;
                        O13786GuiFasMaxL = A13786GuiFasMaxL ;
                        n13786GuiFasMaxL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_194 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1L7194( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1L7194( ) ;
                           closeExtendedTableCursors1L7194( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O13786GuiFasMaxL = A13786GuiFasMaxL ;
                           n13786GuiFasMaxL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_194 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtGuiFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, h457FasCod) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasImp_Internalname, GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1275FasKgm_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1276FasMtr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12193FasUnd_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12194FasPreUnd_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_47_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_194_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_194_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_194_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_194 != 0 )
         {
            httpContext.changePostValue( "GUIFASLIN_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPKG_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPMT_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASIMP_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASUND_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREUND_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O13786GuiFasMaxL = s13786GuiFasMaxL ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      /* Start of After( level) rules */
      /* Using cursor T01L78 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13786GuiFasMaxL = T01L78_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = T01L78_n13786GuiFasMaxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      else
      {
         A13786GuiFasMaxL = (short)(0) ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1L70( )
   {
   }

   public void e111L72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV48carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV32EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      ttrn09_impl.this.GXt_int1 = GXv_int2[0] ;
      AV48carvema = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48carvema", GXutil.str( AV48carvema, 1, 0));
      GXt_char3 = AV12Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttrn09_impl.this.GXt_char3 = GXv_char4[0] ;
      AV12Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char5[0] = AV11EmprNom ;
      GXv_char6[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char5, GXv_char6) ;
      ttrn09_impl.this.AV32EmprCod = GXv_char4[0] ;
      ttrn09_impl.this.AV11EmprNom = GXv_char5[0] ;
      ttrn09_impl.this.AV8UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext7[0] = AV183WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV183WWPContext = GXv_SdtWWPContext7[0] ;
      AV184TrnContext.fromxml(AV185WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtGuiFasULin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Visible), 5, 0), true);
      edtBarAlbKgmE_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Visible), 5, 0), true);
      edtBarAlbMtrE_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Visible), 5, 0), true);
      edtBarAgrEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      edtGuiRemCli_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), true);
   }

   public void e121L72( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ! ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         AV186ObjetoRefrescar.add("TTrn07", 0);
         this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV186ObjetoRefrescar,Boolean.valueOf(true)}, true);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV184TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ttrn09ww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV186ObjetoRefrescar", AV186ObjetoRefrescar);
   }

   public void zm1L7195( int GX_JID )
   {
      if ( ( GX_JID == 32 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1248GuiFasULin = T01L710_A1248GuiFasULin[0] ;
            Z1261BarAlbKgmE = T01L710_A1261BarAlbKgmE[0] ;
            Z1263BarAlbMtrE = T01L710_A1263BarAlbMtrE[0] ;
         }
         else
         {
            Z1248GuiFasULin = A1248GuiFasULin ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         }
      }
      if ( GX_JID == -32 )
      {
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z1243GuiRemCli = A1243GuiRemCli ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z252CliCod = A252CliCod ;
         Z13786GuiFasMaxL = A13786GuiFasMaxL ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtGuiFasMaxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasMaxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasMaxL_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtGuiFasMaxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasMaxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasMaxL_Enabled), 5, 0), true);
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
      if ( ! (0==AV42AlbProCod) )
      {
         A30AlbProCod = AV42AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      if ( ! (0==AV180BarCod) )
      {
         A129BarCod = AV180BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV181BarCodReo) )
      {
         A132BarCodReo = AV181BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV182BarCodPar)==0) )
      {
         A130BarCodPar = AV182BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
         /* Using cursor T01L711 */
         pr_default.execute(8, new Object[] {A396EmprCod});
         A407EmprNom = T01L711_A407EmprNom[0] ;
         n407EmprNom = T01L711_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(8);
         /* Using cursor T01L712 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1243GuiRemCli = T01L712_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(9);
         /* Using cursor T01L75 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A252CliCod = T01L75_A252CliCod[0] ;
         n252CliCod = T01L75_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A120BarAgrEst = T01L75_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         pr_default.close(3);
         /* Using cursor T01L78 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(5) != 101) )
         {
            A13786GuiFasMaxL = T01L78_A13786GuiFasMaxL[0] ;
            n13786GuiFasMaxL = T01L78_n13786GuiFasMaxL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         }
         else
         {
            A13786GuiFasMaxL = (short)(0) ;
            n13786GuiFasMaxL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         }
         O13786GuiFasMaxL = A13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         pr_default.close(5);
      }
   }

   public void load1L7195( )
   {
      /* Using cursor T01L714 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A1248GuiFasULin = T01L714_A1248GuiFasULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A407EmprNom = T01L714_A407EmprNom[0] ;
         n407EmprNom = T01L714_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1261BarAlbKgmE = T01L714_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T01L714_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A120BarAgrEst = T01L714_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A1243GuiRemCli = T01L714_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         A252CliCod = T01L714_A252CliCod[0] ;
         n252CliCod = T01L714_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A13786GuiFasMaxL = T01L714_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = T01L714_n13786GuiFasMaxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         zm1L7195( -32) ;
      }
      pr_default.close(10);
      onLoadActions1L7195( ) ;
   }

   public void onLoadActions1L7195( )
   {
      O13786GuiFasMaxL = A13786GuiFasMaxL ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
   }

   public void checkExtendedTable1L7195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01L711 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01L711_A407EmprNom[0] ;
      n407EmprNom = T01L711_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      /* Using cursor T01L712 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1243GuiRemCli = T01L712_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      pr_default.close(9);
      /* Using cursor T01L75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01L75_A252CliCod[0] ;
      n252CliCod = T01L75_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A120BarAgrEst = T01L75_A120BarAgrEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      pr_default.close(3);
      /* Using cursor T01L78 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13786GuiFasMaxL = T01L78_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = T01L78_n13786GuiFasMaxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A13786GuiFasMaxL = (short)(0) ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1L7195( )
   {
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(3);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_33( String A396EmprCod )
   {
      /* Using cursor T01L715 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01L715_A407EmprNom[0] ;
      n407EmprNom = T01L715_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_35( String A396EmprCod ,
                          long A30AlbProCod )
   {
      /* Using cursor T01L716 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1243GuiRemCli = T01L716_A1243GuiRemCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_34( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01L717 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A120BarAgrEst = T01L717_A120BarAgrEst[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A252CliCod = T01L717_A252CliCod[0] ;
      n252CliCod = T01L717_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A120BarAgrEst))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_36( String A396EmprCod ,
                          long A30AlbProCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01L719 */
      pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A13786GuiFasMaxL = T01L719_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = T01L719_n13786GuiFasMaxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      else
      {
         A13786GuiFasMaxL = (short)(0) ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13786GuiFasMaxL, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1L7195( )
   {
      /* Using cursor T01L720 */
      pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01L710 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         zm1L7195( 32) ;
         RcdFound195 = (short)(1) ;
         A1248GuiFasULin = T01L710_A1248GuiFasULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A1261BarAlbKgmE = T01L710_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T01L710_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A396EmprCod = T01L710_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01L710_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01L710_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01L710_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A30AlbProCod = T01L710_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L7195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1L7195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1L7195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1L7195( ) ;
      if ( RcdFound195 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01L721 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod), Long.valueOf(A30AlbProCod), A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Long.valueOf(A30AlbProCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Long.valueOf(A30AlbProCod), A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L721_A30AlbProCod[0] < A30AlbProCod ) || ( T01L721_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L721_A129BarCod[0] < A129BarCod ) || ( T01L721_A129BarCod[0] == A129BarCod ) && ( T01L721_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L721_A132BarCodReo[0] < A132BarCodReo ) || ( T01L721_A132BarCodReo[0] == A132BarCodReo ) && ( T01L721_A129BarCod[0] == A129BarCod ) && ( T01L721_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01L721_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L721_A30AlbProCod[0] > A30AlbProCod ) || ( T01L721_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L721_A129BarCod[0] > A129BarCod ) || ( T01L721_A129BarCod[0] == A129BarCod ) && ( T01L721_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L721_A132BarCodReo[0] > A132BarCodReo ) || ( T01L721_A132BarCodReo[0] == A132BarCodReo ) && ( T01L721_A129BarCod[0] == A129BarCod ) && ( T01L721_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L721_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01L721_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A396EmprCod = T01L721_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = T01L721_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = T01L721_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01L721_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01L721_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01L722 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod), Long.valueOf(A30AlbProCod), A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Long.valueOf(A30AlbProCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Long.valueOf(A30AlbProCod), A396EmprCod, A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L722_A30AlbProCod[0] > A30AlbProCod ) || ( T01L722_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L722_A129BarCod[0] > A129BarCod ) || ( T01L722_A129BarCod[0] == A129BarCod ) && ( T01L722_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L722_A132BarCodReo[0] > A132BarCodReo ) || ( T01L722_A132BarCodReo[0] == A132BarCodReo ) && ( T01L722_A129BarCod[0] == A129BarCod ) && ( T01L722_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01L722_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L722_A30AlbProCod[0] < A30AlbProCod ) || ( T01L722_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L722_A129BarCod[0] < A129BarCod ) || ( T01L722_A129BarCod[0] == A129BarCod ) && ( T01L722_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01L722_A132BarCodReo[0] < A132BarCodReo ) || ( T01L722_A132BarCodReo[0] == A132BarCodReo ) && ( T01L722_A129BarCod[0] == A129BarCod ) && ( T01L722_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01L722_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01L722_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A396EmprCod = T01L722_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = T01L722_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = T01L722_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01L722_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01L722_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1L7195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A13786GuiFasMaxL = O13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1L7195( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound195 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A13786GuiFasMaxL = O13786GuiFasMaxL ;
               n13786GuiFasMaxL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A13786GuiFasMaxL = O13786GuiFasMaxL ;
               n13786GuiFasMaxL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
               update1L7195( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A13786GuiFasMaxL = O13786GuiFasMaxL ;
               n13786GuiFasMaxL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1L7195( ) ;
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
                  A13786GuiFasMaxL = O13786GuiFasMaxL ;
                  n13786GuiFasMaxL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1L7195( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A13786GuiFasMaxL = O13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1L7195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01L79 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) || ( Z1248GuiFasULin != T01L79_A1248GuiFasULin[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01L79_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01L79_A1263BarAlbMtrE[0]) != 0 ) )
         {
            if ( Z1248GuiFasULin != T01L79_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T01L79_A1248GuiFasULin[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01L79_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01L79_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01L79_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01L79_A1263BarAlbMtrE[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L7195( )
   {
      beforeValidate1L7195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L7195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L7195( 0) ;
         checkOptimisticConcurrency1L7195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L7195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L7195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L723 */
                  pr_default.execute(18, new Object[] {Short.valueOf(A1248GuiFasULin), A1261BarAlbKgmE, A1263BarAlbMtrE, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
                        processLevel1L7195( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1L70( ) ;
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
            load1L7195( ) ;
         }
         endLevel1L7195( ) ;
      }
      closeExtendedTableCursors1L7195( ) ;
   }

   public void update1L7195( )
   {
      beforeValidate1L7195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L7195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L7195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L7195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1L7195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L724 */
                  pr_default.execute(19, new Object[] {Short.valueOf(A1248GuiFasULin), A1261BarAlbKgmE, A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1L7195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1L7195( ) ;
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
         endLevel1L7195( ) ;
      }
      closeExtendedTableCursors1L7195( ) ;
   }

   public void deferredUpdate1L7195( )
   {
   }

   public void delete( )
   {
      beforeValidate1L7195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L7195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L7195( ) ;
         afterConfirm1L7195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L7195( ) ;
            if ( AnyError == 0 )
            {
               A13786GuiFasMaxL = O13786GuiFasMaxL ;
               n13786GuiFasMaxL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
               scanStart1L7194( ) ;
               while ( RcdFound194 != 0 )
               {
                  getByPrimaryKey1L7194( ) ;
                  delete1L7194( ) ;
                  scanNext1L7194( ) ;
                  O13786GuiFasMaxL = A13786GuiFasMaxL ;
                  n13786GuiFasMaxL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
               }
               scanEnd1L7194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L725 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L7195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L7195( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01L726 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T01L726_A407EmprNom[0] ;
         n407EmprNom = T01L726_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(21);
         /* Using cursor T01L727 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         A1243GuiRemCli = T01L727_A1243GuiRemCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
         pr_default.close(22);
         /* Using cursor T01L728 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A120BarAgrEst = T01L728_A120BarAgrEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
         A252CliCod = T01L728_A252CliCod[0] ;
         n252CliCod = T01L728_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(23);
         /* Using cursor T01L730 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A13786GuiFasMaxL = T01L730_A13786GuiFasMaxL[0] ;
            n13786GuiFasMaxL = T01L730_n13786GuiFasMaxL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         }
         else
         {
            A13786GuiFasMaxL = (short)(0) ;
            n13786GuiFasMaxL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         }
         pr_default.close(24);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01L731 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01L732 */
         pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01L733 */
         pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01L734 */
         pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01L735 */
         pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01L736 */
         pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01L737 */
         pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01L738 */
         pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01L739 */
         pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01L740 */
         pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
      }
   }

   public void processNestedLevel1L7194( )
   {
      s13786GuiFasMaxL = O13786GuiFasMaxL ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      nGXsfl_47_idx = 0 ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         readRow1L7194( ) ;
         if ( ( nRcdExists_194 != 0 ) || ( nIsMod_194 != 0 ) )
         {
            standaloneNotModal1L7194( ) ;
            getKey1L7194( ) ;
            if ( ( nRcdExists_194 == 0 ) && ( nRcdDeleted_194 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1L7194( ) ;
            }
            else
            {
               if ( RcdFound194 != 0 )
               {
                  if ( ( nRcdDeleted_194 != 0 ) && ( nRcdExists_194 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1L7194( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_194 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1L7194( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_194 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O13786GuiFasMaxL = A13786GuiFasMaxL ;
            n13786GuiFasMaxL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
         }
         httpContext.changePostValue( edtGuiFasLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, h457FasCod) ;
         httpContext.changePostValue( edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc)) ;
         httpContext.changePostValue( edtFasKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPKg_Internalname, GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtGuiFasPMt_Internalname, GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasImp_Internalname, GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1275FasKgm_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1276FasMtr_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12193FasUnd_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12194FasPreUnd_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( Z12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_47_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_194_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_194_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_194_"+sGXsfl_47_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_194 != 0 )
         {
            httpContext.changePostValue( "GUIFASLIN_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDSC_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPKG_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GUIFASPMT_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASIMP_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASUND_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREUND_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreUnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T01L730 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A13786GuiFasMaxL = T01L730_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = T01L730_n13786GuiFasMaxL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      else
      {
         A13786GuiFasMaxL = (short)(0) ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      /* End of After( level) rules */
      initAll1L7194( ) ;
      if ( AnyError != 0 )
      {
         O13786GuiFasMaxL = s13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      nRcdExists_194 = (short)(0) ;
      nIsMod_194 = (short)(0) ;
      nRcdDeleted_194 = (short)(0) ;
   }

   public void processLevel1L7195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevel1L7194( ) ;
      if ( AnyError != 0 )
      {
         O13786GuiFasMaxL = s13786GuiFasMaxL ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01L741 */
      pr_default.execute(35, new Object[] {Short.valueOf(A1248GuiFasULin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
   }

   public void endLevel1L7195( )
   {
      pr_default.close(6);
      if ( AnyError == 0 )
      {
         beforeComplete1L7195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn09");
         if ( AnyError == 0 )
         {
            confirmValues1L70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn09");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1L7195( )
   {
      /* Scan By routine */
      /* Using cursor T01L742 */
      pr_default.execute(36);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A396EmprCod = T01L742_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01L742_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01L742_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01L742_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01L742_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L7195( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A396EmprCod = T01L742_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01L742_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01L742_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01L742_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01L742_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1L7195( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1L7195( )
   {
      /* After Confirm Rules */
      if ( ! ( A1248GuiFasULin == A13786GuiFasMaxL ) && isIns( )  || isUpd( )  )
      {
         A1248GuiFasULin = A13786GuiFasMaxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      }
   }

   public void beforeInsert1L7195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L7195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L7195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L7195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L7195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L7195( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtGuiFasMaxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasMaxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasMaxL_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), true);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), true);
      edtBarAgrEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrEst_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtGuiRemCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Enabled), 5, 0), true);
   }

   public void zm1L7194( int GX_JID )
   {
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1242GuiFasPMt = T01L73_A1242GuiFasPMt[0] ;
            Z1241GuiFasPKg = T01L73_A1241GuiFasPKg[0] ;
            Z1275FasKgm = T01L73_A1275FasKgm[0] ;
            Z1276FasMtr = T01L73_A1276FasMtr[0] ;
            Z12193FasUnd = T01L73_A12193FasUnd[0] ;
            Z12194FasPreUnd = T01L73_A12194FasPreUnd[0] ;
            Z457FasCod = T01L73_A457FasCod[0] ;
         }
         else
         {
            Z1242GuiFasPMt = A1242GuiFasPMt ;
            Z1241GuiFasPKg = A1241GuiFasPKg ;
            Z1275FasKgm = A1275FasKgm ;
            Z1276FasMtr = A1276FasMtr ;
            Z12193FasUnd = A12193FasUnd ;
            Z12194FasPreUnd = A12194FasPreUnd ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -37 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1240GuiFasLin = A1240GuiFasLin ;
         Z1242GuiFasPMt = A1242GuiFasPMt ;
         Z1241GuiFasPKg = A1241GuiFasPKg ;
         Z1275FasKgm = A1275FasKgm ;
         Z1276FasMtr = A1276FasMtr ;
         Z12193FasUnd = A12193FasUnd ;
         Z12194FasPreUnd = A12194FasPreUnd ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z252CliCod = A252CliCod ;
         Z460FasDsc = A460FasDsc ;
         Z466FasPreKgm = A466FasPreKgm ;
         Z467FasPreMtr = A467FasPreMtr ;
      }
   }

   public void standaloneNotModal1L7194( )
   {
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasImp_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtGuiFasMaxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasMaxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasMaxL_Enabled), 5, 0), true);
      edtGuiFasMaxL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasMaxL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasMaxL_Enabled), 5, 0), true);
      /* Using cursor T01L728 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A252CliCod = T01L728_A252CliCod[0] ;
      n252CliCod = T01L728_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A252CliCod = T01L728_A252CliCod[0] ;
      n252CliCod = T01L728_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(23);
   }

   public void standaloneModal1L7194( )
   {
      if ( isIns( )  )
      {
         A13786GuiFasMaxL = (short)(O13786GuiFasMaxL+10) ;
         n13786GuiFasMaxL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1240GuiFasLin = A13786GuiFasMaxL ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) && ( Gx_BScreen == 0 ) )
      {
         A1275FasKgm = A1261BarAlbKgmE ;
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) && ( Gx_BScreen == 0 ) )
      {
         A1276FasMtr = A1263BarAlbMtrE ;
      }
   }

   public void load1L7194( )
   {
      /* Using cursor T01L743 */
      pr_default.execute(37, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A1240GuiFasLin), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A252CliCod = T01L743_A252CliCod[0] ;
         n252CliCod = T01L743_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1242GuiFasPMt = T01L743_A1242GuiFasPMt[0] ;
         A1241GuiFasPKg = T01L743_A1241GuiFasPKg[0] ;
         A1275FasKgm = T01L743_A1275FasKgm[0] ;
         A1276FasMtr = T01L743_A1276FasMtr[0] ;
         A460FasDsc = T01L743_A460FasDsc[0] ;
         A466FasPreKgm = T01L743_A466FasPreKgm[0] ;
         n466FasPreKgm = T01L743_n466FasPreKgm[0] ;
         A467FasPreMtr = T01L743_A467FasPreMtr[0] ;
         n467FasPreMtr = T01L743_n467FasPreMtr[0] ;
         A12193FasUnd = T01L743_A12193FasUnd[0] ;
         A12194FasPreUnd = T01L743_A12194FasPreUnd[0] ;
         A457FasCod = T01L743_A457FasCod[0] ;
         zm1L7194( -37) ;
      }
      pr_default.close(37);
      onLoadActions1L7194( ) ;
   }

   public void onLoadActions1L7194( )
   {
      A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
      /* Using cursor T01L744 */
      pr_default.execute(38, new Object[] {A396EmprCod, A457FasCod});
      h457FasCod = "" ;
      while ( (pr_default.getStatus(38) != 101) )
      {
         h457FasCod = T01L744_A13781FasCDsc[0] ;
         if (true) break;
      }
      pr_default.close(38);
      httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
   }

   public void checkExtendedTable1L7194( )
   {
      nIsDirty_194 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1L7194( ) ;
      if ( (GXutil.strcmp("", h457FasCod)==0) )
      {
         nIsDirty_194 = (short)(1) ;
         A457FasCod = "" ;
      }
      else
      {
         A13781FasCDsc = h457FasCod ;
         /* Using cursor T01L745 */
         pr_default.execute(39, new Object[] {A13781FasCDsc, A396EmprCod});
         A396EmprCod = T01L745_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = T01L745_A457FasCod[0] ;
         A457FasCod = T01L745_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(39) == 101) ) )
         {
            pr_default.readNext(39);
            if ( ! ( (pr_default.getStatus(39) == 101) ) )
            {
               GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(39);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
      if ( (GXutil.strcmp("", h457FasCod)==0) )
      {
         nIsDirty_194 = (short)(1) ;
         A457FasCod = "" ;
      }
      else
      {
         A13781FasCDsc = h457FasCod ;
         /* Using cursor T01L746 */
         pr_default.execute(40, new Object[] {A13781FasCDsc, A396EmprCod});
         A457FasCod = T01L746_A457FasCod[0] ;
         A457FasCod = T01L746_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(40) == 101) ) )
         {
            pr_default.readNext(40);
            if ( ! ( (pr_default.getStatus(40) == 101) ) )
            {
               GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(40);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
      /* Using cursor T01L74 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01L74_A460FasDsc[0] ;
      pr_default.close(2);
      if ( isIns( )  && true /* After */ )
      {
         GXv_decimal8[0] = A1242GuiFasPMt ;
         GXv_decimal9[0] = A1241GuiFasPKg ;
         new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal8, GXv_decimal9) ;
         ttrn09_impl.this.A1242GuiFasPMt = GXv_decimal8[0] ;
         ttrn09_impl.this.A1241GuiFasPKg = GXv_decimal9[0] ;
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1241GuiFasPKg)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1275FasKgm)==0) )
      {
         GXCCtl = "FASKGM_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.La fase no tiene precio Kilo", ""), 0, GXCCtl);
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1242GuiFasPMt)==0) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A1276FasMtr)==0) )
      {
         GXCCtl = "FASMTR_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "AVISO.La fase no tiene precio Metro", ""), 0, GXCCtl);
      }
      /* Using cursor T01L76 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A457FasCod)==0) && (GXutil.strcmp("", A13781FasCDsc)==0) || (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A466FasPreKgm = T01L76_A466FasPreKgm[0] ;
      n466FasPreKgm = T01L76_n466FasPreKgm[0] ;
      A467FasPreMtr = T01L76_A467FasPreMtr[0] ;
      n467FasPreMtr = T01L76_n467FasPreMtr[0] ;
      pr_default.close(4);
      nIsDirty_194 = (short)(1) ;
      A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
   }

   public void closeExtendedTableCursors1L7194( )
   {
      pr_default.close(2);
      pr_default.close(4);
   }

   public void enableDisable1L7194( )
   {
   }

   public void gxload_38( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01L747 */
      pr_default.execute(41, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(41) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01L747_A460FasDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(41) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(41);
   }

   public void gxload_40( String A396EmprCod ,
                          int A252CliCod ,
                          String A457FasCod )
   {
      /* Using cursor T01L748 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(42) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A457FasCod)==0) && (GXutil.strcmp("", A13781FasCDsc)==0) || (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A466FasPreKgm = T01L748_A466FasPreKgm[0] ;
      n466FasPreKgm = T01L748_n466FasPreKgm[0] ;
      A467FasPreMtr = T01L748_A467FasPreMtr[0] ;
      n467FasPreMtr = T01L748_n467FasPreMtr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(42) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(42);
   }

   public void getKey1L7194( )
   {
      if ( (GXutil.strcmp("", h457FasCod)==0) )
      {
         A457FasCod = "" ;
      }
      else
      {
         A13781FasCDsc = h457FasCod ;
         /* Using cursor T01L749 */
         pr_default.execute(43, new Object[] {A13781FasCDsc, A396EmprCod});
         A396EmprCod = T01L749_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = T01L749_A457FasCod[0] ;
         A457FasCod = T01L749_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(43) == 101) ) )
         {
            pr_default.readNext(43);
            if ( ! ( (pr_default.getStatus(43) == 101) ) )
            {
               GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(43);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
      /* Using cursor T01L750 */
      pr_default.execute(44, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound194 = (short)(1) ;
      }
      else
      {
         RcdFound194 = (short)(0) ;
      }
      pr_default.close(44);
   }

   public void getByPrimaryKey1L7194( )
   {
      /* Using cursor T01L73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1L7194( 37) ;
         RcdFound194 = (short)(1) ;
         initializeNonKey1L7194( ) ;
         A1240GuiFasLin = T01L73_A1240GuiFasLin[0] ;
         A1242GuiFasPMt = T01L73_A1242GuiFasPMt[0] ;
         A1241GuiFasPKg = T01L73_A1241GuiFasPKg[0] ;
         A1275FasKgm = T01L73_A1275FasKgm[0] ;
         A1276FasMtr = T01L73_A1276FasMtr[0] ;
         A12193FasUnd = T01L73_A12193FasUnd[0] ;
         A12194FasPreUnd = T01L73_A12194FasPreUnd[0] ;
         A457FasCod = T01L73_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1240GuiFasLin = A1240GuiFasLin ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1L7194( ) ;
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound194 = (short)(0) ;
         initializeNonKey1L7194( ) ;
         sMode194 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1L7194( ) ;
         Gx_mode = sMode194 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1L7194( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1L7194( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h457FasCod)==0) )
         {
            A457FasCod = "" ;
         }
         else
         {
            A13781FasCDsc = h457FasCod ;
            /* Using cursor T01L751 */
            pr_default.execute(45, new Object[] {A13781FasCDsc, A396EmprCod});
            A396EmprCod = T01L751_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A457FasCod = T01L751_A457FasCod[0] ;
            A457FasCod = T01L751_A457FasCod[0] ;
            if ( ! ( (pr_default.getStatus(45) == 101) ) )
            {
               pr_default.readNext(45);
               if ( ! ( (pr_default.getStatus(45) == 101) ) )
               {
                  GXCCtl = "FASCOD_" + sGXsfl_47_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(45);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01L72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1242GuiFasPMt, T01L72_A1242GuiFasPMt[0]) != 0 ) || ( DecimalUtil.compareTo(Z1241GuiFasPKg, T01L72_A1241GuiFasPKg[0]) != 0 ) || ( DecimalUtil.compareTo(Z1275FasKgm, T01L72_A1275FasKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z1276FasMtr, T01L72_A1276FasMtr[0]) != 0 ) || ( Z12193FasUnd != T01L72_A12193FasUnd[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z12194FasPreUnd, T01L72_A12194FasPreUnd[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01L72_A457FasCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1242GuiFasPMt, T01L72_A1242GuiFasPMt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"GuiFasPMt");
               GXutil.writeLogRaw("Old: ",Z1242GuiFasPMt);
               GXutil.writeLogRaw("Current: ",T01L72_A1242GuiFasPMt[0]);
            }
            if ( DecimalUtil.compareTo(Z1241GuiFasPKg, T01L72_A1241GuiFasPKg[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"GuiFasPKg");
               GXutil.writeLogRaw("Old: ",Z1241GuiFasPKg);
               GXutil.writeLogRaw("Current: ",T01L72_A1241GuiFasPKg[0]);
            }
            if ( DecimalUtil.compareTo(Z1275FasKgm, T01L72_A1275FasKgm[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"FasKgm");
               GXutil.writeLogRaw("Old: ",Z1275FasKgm);
               GXutil.writeLogRaw("Current: ",T01L72_A1275FasKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z1276FasMtr, T01L72_A1276FasMtr[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"FasMtr");
               GXutil.writeLogRaw("Old: ",Z1276FasMtr);
               GXutil.writeLogRaw("Current: ",T01L72_A1276FasMtr[0]);
            }
            if ( Z12193FasUnd != T01L72_A12193FasUnd[0] )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"FasUnd");
               GXutil.writeLogRaw("Old: ",Z12193FasUnd);
               GXutil.writeLogRaw("Current: ",T01L72_A12193FasUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12194FasPreUnd, T01L72_A12194FasPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"FasPreUnd");
               GXutil.writeLogRaw("Old: ",Z12194FasPreUnd);
               GXutil.writeLogRaw("Current: ",T01L72_A12194FasPreUnd[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01L72_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn09:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01L72_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1L7194( )
   {
      beforeValidate1L7194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L7194( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1L7194( 0) ;
         checkOptimisticConcurrency1L7194( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1L7194( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1L7194( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01L752 */
                  pr_default.execute(46, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A1240GuiFasLin), A1242GuiFasPMt, A1241GuiFasPKg, A1275FasKgm, A1276FasMtr, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A396EmprCod, A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                  if ( (pr_default.getStatus(46) == 1) )
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
            load1L7194( ) ;
         }
         endLevel1L7194( ) ;
      }
      closeExtendedTableCursors1L7194( ) ;
   }

   public void update1L7194( )
   {
      beforeValidate1L7194( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1L7194( ) ;
      }
      if ( ( nIsMod_194 != 0 ) || ( nIsDirty_194 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1L7194( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1L7194( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1L7194( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01L753 */
                     pr_default.execute(47, new Object[] {A1242GuiFasPMt, A1241GuiFasPKg, A1275FasKgm, A1276FasMtr, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A457FasCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
                     if ( (pr_default.getStatus(47) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1L7194( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1L7194( ) ;
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
            endLevel1L7194( ) ;
         }
      }
      closeExtendedTableCursors1L7194( ) ;
   }

   public void deferredUpdate1L7194( )
   {
   }

   public void delete1L7194( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1L7194( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1L7194( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1L7194( ) ;
         afterConfirm1L7194( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1L7194( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01L754 */
               pr_default.execute(48, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
      sMode194 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1L7194( ) ;
      Gx_mode = sMode194 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1L7194( )
   {
      standaloneModal1L7194( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            GXv_decimal9[0] = A1242GuiFasPMt ;
            GXv_decimal8[0] = A1241GuiFasPKg ;
            new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal9, GXv_decimal8) ;
            ttrn09_impl.this.A1242GuiFasPMt = GXv_decimal9[0] ;
            ttrn09_impl.this.A1241GuiFasPKg = GXv_decimal8[0] ;
         }
         /* Using cursor T01L755 */
         pr_default.execute(49, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01L755_A460FasDsc[0] ;
         pr_default.close(49);
         /* Using cursor T01L756 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
         A466FasPreKgm = T01L756_A466FasPreKgm[0] ;
         n466FasPreKgm = T01L756_n466FasPreKgm[0] ;
         A467FasPreMtr = T01L756_A467FasPreMtr[0] ;
         n467FasPreMtr = T01L756_n467FasPreMtr[0] ;
         pr_default.close(50);
         A1277FasImp = (A466FasPreKgm.multiply(A1275FasKgm)).add((A467FasPreMtr.multiply(A1276FasMtr))) ;
      }
   }

   public void endLevel1L7194( )
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

   public void scanStart1L7194( )
   {
      /* Scan By routine */
      /* Using cursor T01L757 */
      pr_default.execute(51, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A1240GuiFasLin = T01L757_A1240GuiFasLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1L7194( )
   {
      /* Scan next routine */
      pr_default.readNext(51);
      RcdFound194 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound194 = (short)(1) ;
         A1240GuiFasLin = T01L757_A1240GuiFasLin[0] ;
      }
   }

   public void scanEnd1L7194( )
   {
      pr_default.close(51);
   }

   public void afterConfirm1L7194( )
   {
      /* After Confirm Rules */
      if ( ! ( A1248GuiFasULin == A13786GuiFasMaxL ) && isIns( )  || isUpd( )  )
      {
         A1248GuiFasULin = A13786GuiFasMaxL ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      }
   }

   public void beforeInsert1L7194( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1L7194( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1L7194( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1L7194( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1L7194( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1L7194( )
   {
      edtGuiFasLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtGuiFasPKg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPKg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPKg_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtGuiFasPMt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasPMt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasPMt_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasImp_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void send_integrity_lvl_hashes1L7194( )
   {
   }

   public void send_integrity_lvl_hashes1L7195( )
   {
   }

   public void subsflControlProps_47194( )
   {
      edtGuiFasLin_Internalname = "GUIFASLIN_"+sGXsfl_47_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_47_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_47_idx ;
      edtFasKgm_Internalname = "FASKGM_"+sGXsfl_47_idx ;
      edtGuiFasPKg_Internalname = "GUIFASPKG_"+sGXsfl_47_idx ;
      edtFasMtr_Internalname = "FASMTR_"+sGXsfl_47_idx ;
      edtGuiFasPMt_Internalname = "GUIFASPMT_"+sGXsfl_47_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_47_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_47_idx ;
      edtFasImp_Internalname = "FASIMP_"+sGXsfl_47_idx ;
      edtFasUnd_Internalname = "FASUND_"+sGXsfl_47_idx ;
      edtFasPreUnd_Internalname = "FASPREUND_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_47194( )
   {
      edtGuiFasLin_Internalname = "GUIFASLIN_"+sGXsfl_47_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_47_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_47_fel_idx ;
      edtFasKgm_Internalname = "FASKGM_"+sGXsfl_47_fel_idx ;
      edtGuiFasPKg_Internalname = "GUIFASPKG_"+sGXsfl_47_fel_idx ;
      edtFasMtr_Internalname = "FASMTR_"+sGXsfl_47_fel_idx ;
      edtGuiFasPMt_Internalname = "GUIFASPMT_"+sGXsfl_47_fel_idx ;
      edtFasPreKgm_Internalname = "FASPREKGM_"+sGXsfl_47_fel_idx ;
      edtFasPreMtr_Internalname = "FASPREMTR_"+sGXsfl_47_fel_idx ;
      edtFasImp_Internalname = "FASIMP_"+sGXsfl_47_fel_idx ;
      edtFasUnd_Internalname = "FASUND_"+sGXsfl_47_fel_idx ;
      edtFasPreUnd_Internalname = "FASPREUND_"+sGXsfl_47_fel_idx ;
   }

   public void addRow1L7194( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_47194( ) ;
      sendRow1L7194( ) ;
   }

   public void sendRow1L7194( )
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
         if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1240GuiFasLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,h457FasCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasKgm_Enabled!=0) ? localUtil.format( A1275FasKgm, "ZZZZZ9.99") : localUtil.format( A1275FasKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPKg_Internalname,GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPKg_Enabled!=0) ? localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999") : localUtil.format( A1241GuiFasPKg, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPKg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPKg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasMtr_Enabled!=0) ? localUtil.format( A1276FasMtr, "ZZZZZ9.99") : localUtil.format( A1276FasMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_194_" + sGXsfl_47_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_47_idx + "',47)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiFasPMt_Internalname,GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtGuiFasPMt_Enabled!=0) ? localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999") : localUtil.format( A1242GuiFasPMt, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiFasPMt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtGuiFasPMt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreKgm_Enabled!=0) ? localUtil.format( A466FasPreKgm, "ZZZZZZ9.999") : localUtil.format( A466FasPreKgm, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasPreKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreMtr_Enabled!=0) ? localUtil.format( A467FasPreMtr, "ZZZZZZ9.999") : localUtil.format( A467FasPreMtr, "ZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasImp_Internalname,GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasImp_Enabled!=0) ? localUtil.format( A1277FasImp, "ZZZZZZ9.99") : localUtil.format( A1277FasImp, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasImp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasUnd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12193FasUnd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12193FasUnd), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasUnd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreUnd_Enabled!=0) ? localUtil.format( A12194FasPreUnd, "ZZZZZZ9.99999") : localUtil.format( A12194FasPreUnd, "ZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtFasPreUnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_fasesRow);
      send_integrity_lvl_hashes1L7194( ) ;
      GXCCtl = "GXHCFASCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A457FasCod));
      GXCCtl = "Z1240GuiFasLin_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1240GuiFasLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1242GuiFasPMt_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1242GuiFasPMt, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1241GuiFasPKg_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1241GuiFasPKg, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1275FasKgm_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1275FasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1276FasMtr_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1276FasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12193FasUnd_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12193FasUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12194FasPreUnd_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12194FasPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_194_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_194_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_194_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_194, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vOBJETOREFRESCAR_" + sGXsfl_47_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV186ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV186ObjetoRefrescar);
      }
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_47_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV184TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV184TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vALBPROCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV42AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV180BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV181BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_47_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV182BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASLIN_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPKG_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIFASPMT_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREKGM_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREMTR_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASIMP_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASUND_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREUND_"+sGXsfl_47_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_fasesContainer.AddRow(Gridlevel_fasesRow);
   }

   public void readRow1L7194( )
   {
      nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_47194( ) ;
      edtGuiFasLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASLIN_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDSC_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASKGM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPKg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPKG_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASMTR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGuiFasPMt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GUIFASPMT_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREKGM_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREMTR_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASIMP_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASUND_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreUnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREUND_"+sGXsfl_47_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
      A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FASKGM_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasKgm_Internalname ;
         wbErr = true ;
         A1275FasKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A1275FasKgm = localUtil.ctond( httpContext.cgiGet( edtFasKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPKG_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPKg_Internalname ;
         wbErr = true ;
         A1241GuiFasPKg = DecimalUtil.ZERO ;
      }
      else
      {
         A1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( edtGuiFasPKg_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "FASMTR_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasMtr_Internalname ;
         wbErr = true ;
         A1276FasMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A1276FasMtr = localUtil.ctond( httpContext.cgiGet( edtFasMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "GUIFASPMT_" + sGXsfl_47_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGuiFasPMt_Internalname ;
         wbErr = true ;
         A1242GuiFasPMt = DecimalUtil.ZERO ;
      }
      else
      {
         A1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( edtGuiFasPMt_Internalname)) ;
      }
      A466FasPreKgm = localUtil.ctond( httpContext.cgiGet( edtFasPreKgm_Internalname)) ;
      n466FasPreKgm = false ;
      A467FasPreMtr = localUtil.ctond( httpContext.cgiGet( edtFasPreMtr_Internalname)) ;
      n467FasPreMtr = false ;
      A1277FasImp = localUtil.ctond( httpContext.cgiGet( edtFasImp_Internalname)) ;
      A12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( edtFasUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( edtFasPreUnd_Internalname)) ;
      GXCCtl = "GXHCFASCOD_" + sGXsfl_47_idx ;
      A457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1240GuiFasLin_" + sGXsfl_47_idx ;
      Z1240GuiFasLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1242GuiFasPMt_" + sGXsfl_47_idx ;
      Z1242GuiFasPMt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1241GuiFasPKg_" + sGXsfl_47_idx ;
      Z1241GuiFasPKg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1275FasKgm_" + sGXsfl_47_idx ;
      Z1275FasKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1276FasMtr_" + sGXsfl_47_idx ;
      Z1276FasMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12193FasUnd_" + sGXsfl_47_idx ;
      Z12193FasUnd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12194FasPreUnd_" + sGXsfl_47_idx ;
      Z12194FasPreUnd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_47_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_194_" + sGXsfl_47_idx ;
      nRcdDeleted_194 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_194_" + sGXsfl_47_idx ;
      nRcdExists_194 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_194_" + sGXsfl_47_idx ;
      nIsMod_194 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFasPreUnd_Enabled = edtFasPreUnd_Enabled ;
      defedtFasUnd_Enabled = edtFasUnd_Enabled ;
      defedtFasImp_Enabled = edtFasImp_Enabled ;
      defedtFasPreMtr_Enabled = edtFasPreMtr_Enabled ;
      defedtFasPreKgm_Enabled = edtFasPreKgm_Enabled ;
      defedtFasDsc_Enabled = edtFasDsc_Enabled ;
      defedtGuiFasLin_Enabled = edtGuiFasLin_Enabled ;
   }

   public void confirmValues1L70( )
   {
      nGXsfl_47_idx = 0 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_47194( ) ;
      while ( nGXsfl_47_idx < nRC_GXsfl_47 )
      {
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_47194( ) ;
         httpContext.changePostValue( "Z1240GuiFasLin_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1240GuiFasLin_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1242GuiFasPMt_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1242GuiFasPMt_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1241GuiFasPKg_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1241GuiFasPKg_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1275FasKgm_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1275FasKgm_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1275FasKgm_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z1276FasMtr_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z1276FasMtr_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1276FasMtr_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z12193FasUnd_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z12193FasUnd_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12193FasUnd_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z12194FasPreUnd_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z12194FasPreUnd_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12194FasPreUnd_"+sGXsfl_47_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_47_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_47_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_47_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn09", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV42AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV180BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV181BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV182BarCodPar))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn09");
      forbiddenHiddens.add("AlbProCod", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn09:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O13786GuiFasMaxL", GXutil.ltrim( localUtil.ntoc( O13786GuiFasMaxL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nGXsfl_47_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV186ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV186ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBJETOREFRESCAR", getSecureSignedToken( "", AV186ObjetoRefrescar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV184TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV184TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV184TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV42AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV180BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV180BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV181BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV181BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV182BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCFASCOD", GXutil.rtrim( A457FasCod));
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
      return formatLink("app.ttrn09", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV42AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV180BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV181BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV182BarCodPar))}, new String[] {"Gx_mode","EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn09" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guias (Fases)", "") ;
   }

   public void initializeNonKey1L7195( )
   {
      A1248GuiFasULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A120BarAgrEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", A120BarAgrEst);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A1243GuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1243GuiRemCli), 6, 0));
      A13786GuiFasMaxL = (short)(0) ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      O13786GuiFasMaxL = A13786GuiFasMaxL ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      Z1248GuiFasULin = (short)(0) ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
   }

   public void initAll1L7195( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1L7195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1L7194( )
   {
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1277FasImp = DecimalUtil.ZERO ;
      h457FasCod = "" ;
      A460FasDsc = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      n466FasPreKgm = false ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      n467FasPreMtr = false ;
      A12193FasUnd = 0 ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      A1275FasKgm = A1261BarAlbKgmE ;
      A1276FasMtr = A1263BarAlbMtrE ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z12193FasUnd = 0 ;
      Z12194FasPreUnd = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
   }

   public void initAll1L7194( )
   {
      A1240GuiFasLin = (short)(0) ;
      initializeNonKey1L7194( ) ;
   }

   public void standaloneModalInsert1L7194( )
   {
      A13786GuiFasMaxL = i13786GuiFasMaxL ;
      n13786GuiFasMaxL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13786GuiFasMaxL), 4, 0));
      A1275FasKgm = i1275FasKgm ;
      A1276FasMtr = i1276FasMtr ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211664932", true, true);
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
      httpContext.AddJavascriptSource("ttrn09.js", "?20268211664932", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties194( )
   {
      edtFasPreUnd_Enabled = defedtFasPreUnd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasUnd_Enabled = defedtFasUnd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasUnd_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasImp_Enabled = defedtFasImp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasImp_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreMtr_Enabled = defedtFasPreMtr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreMtr_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasPreKgm_Enabled = defedtFasPreKgm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreKgm_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtFasDsc_Enabled = defedtFasDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtGuiFasLin_Enabled = defedtGuiFasLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasLin_Enabled), 5, 0), !bGXsfl_47_Refreshing);
   }

   public void startgridcontrol47( )
   {
      Gridlevel_fasesContainer.AddObjectProperty("GridName", "Gridlevel_fases");
      Gridlevel_fasesContainer.AddObjectProperty("Header", subGridlevel_fases_Header);
      Gridlevel_fasesContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_fasesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_fases_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_fasesContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1240GuiFasLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", h457FasCod);
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1275FasKgm, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPKg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1276FasMtr, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGuiFasPMt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1277FasImp, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12193FasUnd, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasesContainer.AddColumnProperties(Gridlevel_fasesColumn);
      Gridlevel_fasesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12194FasPreUnd, (byte)(13), (byte)(5), ".", "")));
      Gridlevel_fasesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreUnd_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtGuiFasMaxL_Internalname = "GUIFASMAXL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtGuiFasLin_Internalname = "GUIFASLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasKgm_Internalname = "FASKGM" ;
      edtGuiFasPKg_Internalname = "GUIFASPKG" ;
      edtFasMtr_Internalname = "FASMTR" ;
      edtGuiFasPMt_Internalname = "GUIFASPMT" ;
      edtFasPreKgm_Internalname = "FASPREKGM" ;
      edtFasPreMtr_Internalname = "FASPREMTR" ;
      edtFasImp_Internalname = "FASIMP" ;
      edtFasUnd_Internalname = "FASUND" ;
      edtFasPreUnd_Internalname = "FASPREUND" ;
      divTableleaflevel_fases_Internalname = "TABLELEAFLEVEL_FASES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtGuiFasULin_Internalname = "GUIFASULIN" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      Form.setCaption( httpContext.getMessage( "Guias (Fases)", "") );
      edtFasPreUnd_Jsonclick = "" ;
      edtFasUnd_Jsonclick = "" ;
      edtFasImp_Jsonclick = "" ;
      edtFasPreMtr_Jsonclick = "" ;
      edtFasPreKgm_Jsonclick = "" ;
      edtGuiFasPMt_Jsonclick = "" ;
      edtFasMtr_Jsonclick = "" ;
      edtGuiFasPKg_Jsonclick = "" ;
      edtFasKgm_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtGuiFasLin_Jsonclick = "" ;
      subGridlevel_fases_Class = "GridNoBorder WorkWith" ;
      subGridlevel_fases_Backcolorstyle = (byte)(0) ;
      edtFasPreUnd_Enabled = 0 ;
      edtFasUnd_Enabled = 0 ;
      edtFasImp_Enabled = 0 ;
      edtFasPreMtr_Enabled = 0 ;
      edtFasPreKgm_Enabled = 0 ;
      edtGuiFasPMt_Enabled = 1 ;
      edtFasMtr_Enabled = 1 ;
      edtGuiFasPKg_Enabled = 1 ;
      edtFasKgm_Enabled = 1 ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtGuiFasLin_Enabled = 0 ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Enabled = 0 ;
      edtGuiRemCli_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtCliCod_Visible = 1 ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarAgrEst_Enabled = 0 ;
      edtBarAgrEst_Visible = 1 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtBarAlbMtrE_Visible = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtBarAlbKgmE_Visible = 1 ;
      edtGuiFasULin_Jsonclick = "" ;
      edtGuiFasULin_Enabled = 1 ;
      edtGuiFasULin_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtGuiFasMaxL_Jsonclick = "" ;
      edtGuiFasMaxL_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
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

   public void gxsgafascod1L70( String A396EmprCod ,
                                String A13781FasCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgafascod_data1L70( A396EmprCod, A13781FasCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgafascod_data1L70( String A396EmprCod ,
                                        String A13781FasCDsc )
   {
      l13781FasCDsc = GXutil.concat( GXutil.rtrim( A13781FasCDsc), "%", "") ;
      /* Using cursor T01L758 */
      pr_default.execute(52, new Object[] {A396EmprCod, l13781FasCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(52) != 101) )
      {
         gxdynajaxctrlcodr.add(T01L758_A13781FasCDsc[0]);
         gxdynajaxctrldescr.add(T01L758_A13781FasCDsc[0]);
         pr_default.readNext(52);
      }
      pr_default.close(52);
   }

   public void gxhcafascod1L7194( String A396EmprCod ,
                                  String A13781FasCDsc )
   {
      /* Using cursor T01L759 */
      pr_default.execute(53, new Object[] {A13781FasCDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(53) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13781FasCDsc = T01L759_A13781FasCDsc[0] ;
         A396EmprCod = T01L759_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = T01L759_A457FasCod[0] ;
         pr_default.readNext(53);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(53);
   }

   public void xc_29_1L7194( String Gx_mode ,
                             String A396EmprCod ,
                             int A252CliCod ,
                             String A457FasCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXv_decimal9[0] = A1242GuiFasPMt ;
         GXv_decimal8[0] = A1241GuiFasPKg ;
         new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal9, GXv_decimal8) ;
         A1242GuiFasPMt = GXv_decimal9[0] ;
         A1241GuiFasPKg = GXv_decimal8[0] ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")))+"\"") ;
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
      subsflControlProps_47194( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1L7194( ) ;
         standaloneModal1L7194( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1L7194( ) ;
         nGXsfl_47_idx = (int)(nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_47194( ) ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      n252CliCod = false ;
      n13786GuiFasMaxL = false ;
      /* Using cursor T01L726 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01L726_A407EmprNom[0] ;
      n407EmprNom = T01L726_n407EmprNom[0] ;
      pr_default.close(21);
      /* Using cursor T01L760 */
      pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(54) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A120BarAgrEst = T01L760_A120BarAgrEst[0] ;
      A252CliCod = T01L760_A252CliCod[0] ;
      n252CliCod = T01L760_n252CliCod[0] ;
      pr_default.close(54);
      /* Using cursor T01L727 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1243GuiRemCli = T01L727_A1243GuiRemCli[0] ;
      pr_default.close(22);
      /* Using cursor T01L730 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A13786GuiFasMaxL = T01L730_A13786GuiFasMaxL[0] ;
         n13786GuiFasMaxL = T01L730_n13786GuiFasMaxL[0] ;
      }
      else
      {
         A13786GuiFasMaxL = (short)(0) ;
         n13786GuiFasMaxL = false ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A120BarAgrEst", GXutil.rtrim( A120BarAgrEst));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1243GuiRemCli", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13786GuiFasMaxL", GXutil.ltrim( localUtil.ntoc( A13786GuiFasMaxL, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Fascod( )
   {
      n252CliCod = false ;
      n466FasPreKgm = false ;
      n467FasPreMtr = false ;
      if ( (GXutil.strcmp("", h457FasCod)==0) )
      {
         A457FasCod = "" ;
      }
      else
      {
         A13781FasCDsc = h457FasCod ;
         /* Using cursor T01L761 */
         pr_default.execute(55, new Object[] {A13781FasCDsc, A396EmprCod});
         A457FasCod = T01L761_A457FasCod[0] ;
         A457FasCod = T01L761_A457FasCod[0] ;
         if ( ! ( (pr_default.getStatus(55) == 101) ) )
         {
            pr_default.readNext(55);
            if ( ! ( (pr_default.getStatus(55) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "FASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(55);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
      /* Using cursor T01L762 */
      pr_default.execute(56, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(56) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01L762_A460FasDsc[0] ;
      pr_default.close(56);
      /* Using cursor T01L763 */
      pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
      if ( (pr_default.getStatus(57) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A457FasCod)==0) && (GXutil.strcmp("", A13781FasCDsc)==0) || (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PREFAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFasCod_Internalname ;
         }
      }
      A466FasPreKgm = T01L763_A466FasPreKgm[0] ;
      n466FasPreKgm = T01L763_n466FasPreKgm[0] ;
      A467FasPreMtr = T01L763_A467FasPreMtr[0] ;
      n467FasPreMtr = T01L763_n467FasPreMtr[0] ;
      pr_default.close(57);
      if ( isIns( )  && true /* After */ )
      {
         GXv_decimal9[0] = A1242GuiFasPMt ;
         GXv_decimal8[0] = A1241GuiFasPKg ;
         new app.ppreciofases(remoteHandle, context).execute( A396EmprCod, A252CliCod, A457FasCod, GXv_decimal9, GXv_decimal8) ;
         ttrn09_impl.this.A1242GuiFasPMt = GXv_decimal9[0] ;
         A1242GuiFasPMt = this.A1242GuiFasPMt ;
         ttrn09_impl.this.A1241GuiFasPKg = GXv_decimal8[0] ;
         A1241GuiFasPKg = this.A1241GuiFasPKg ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A466FasPreKgm", GXutil.ltrim( localUtil.ntoc( A466FasPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A467FasPreMtr", GXutil.ltrim( localUtil.ntoc( A467FasPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1242GuiFasPMt", GXutil.ltrim( localUtil.ntoc( A1242GuiFasPMt, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1241GuiFasPKg", GXutil.ltrim( localUtil.ntoc( A1241GuiFasPKg, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h457FasCod", h457FasCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV42AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV180BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV181BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV182BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV186ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:'',hsh:true},{av:'AV184TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV42AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV180BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV181BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV182BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121L72',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV186ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:'',hsh:true},{av:'AV184TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV186ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:'',hsh:true}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_GUIFASMAXL","{handler:'valid_Guifasmaxl',iparms:[]");
      setEventMetadata("VALID_GUIFASMAXL",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A13786GuiFasMaxL',fld:'GUIFASMAXL',pic:'ZZZ9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A13786GuiFasMaxL',fld:'GUIFASMAXL',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_GUIFASULIN","{handler:'valid_Guifasulin',iparms:[]");
      setEventMetadata("VALID_GUIFASULIN",",oparms:[]}");
      setEventMetadata("VALID_BARALBKGME","{handler:'valid_Baralbkgme',iparms:[]");
      setEventMetadata("VALID_BARALBKGME",",oparms:[]}");
      setEventMetadata("VALID_BARALBMTRE","{handler:'valid_Baralbmtre',iparms:[]");
      setEventMetadata("VALID_BARALBMTRE",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_GUIFASLIN","{handler:'valid_Guifaslin',iparms:[]");
      setEventMetadata("VALID_GUIFASLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'h457FasCod'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A466FasPreKgm',fld:'FASPREKGM',pic:'ZZZZZZ9.999'},{av:'A467FasPreMtr',fld:'FASPREMTR',pic:'ZZZZZZ9.999'},{av:'A1242GuiFasPMt',fld:'GUIFASPMT',pic:'ZZZZZZ9.999'},{av:'A1241GuiFasPKg',fld:'GUIFASPKG',pic:'ZZZZZZ9.999'},{av:'h457FasCod'}]}");
      setEventMetadata("VALID_FASKGM","{handler:'valid_Faskgm',iparms:[]");
      setEventMetadata("VALID_FASKGM",",oparms:[]}");
      setEventMetadata("VALID_GUIFASPKG","{handler:'valid_Guifaspkg',iparms:[]");
      setEventMetadata("VALID_GUIFASPKG",",oparms:[]}");
      setEventMetadata("VALID_FASMTR","{handler:'valid_Fasmtr',iparms:[]");
      setEventMetadata("VALID_FASMTR",",oparms:[]}");
      setEventMetadata("VALID_GUIFASPMT","{handler:'valid_Guifaspmt',iparms:[]");
      setEventMetadata("VALID_GUIFASPMT",",oparms:[]}");
      setEventMetadata("VALID_FASPREKGM","{handler:'valid_Fasprekgm',iparms:[]");
      setEventMetadata("VALID_FASPREKGM",",oparms:[]}");
      setEventMetadata("VALID_FASPREMTR","{handler:'valid_Faspremtr',iparms:[]");
      setEventMetadata("VALID_FASPREMTR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Faspreund',iparms:[]");
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
      pr_default.close(56);
      pr_default.close(49);
      pr_default.close(57);
      pr_default.close(50);
      pr_default.close(54);
      pr_default.close(21);
      pr_default.close(22);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV182BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1242GuiFasPMt = DecimalUtil.ZERO ;
      Z1241GuiFasPKg = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      Z1276FasMtr = DecimalUtil.ZERO ;
      Z12194FasPreUnd = DecimalUtil.ZERO ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A13781FasCDsc = "" ;
      h457FasCod = "" ;
      A130BarCodPar = "" ;
      AV32EmprCod = "" ;
      AV182BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A120BarAgrEst = "" ;
      Gridlevel_fasesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode194 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode195 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A460FasDsc = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A1277FasImp = DecimalUtil.ZERO ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      T01L78_A13786GuiFasMaxL = new short[1] ;
      T01L78_n13786GuiFasMaxL = new boolean[] {false} ;
      GXv_int2 = new byte[1] ;
      AV12Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char6 = new String[1] ;
      AV183WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV184TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV185WebSession = httpContext.getWebSession();
      AV186ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      Z407EmprNom = "" ;
      Z120BarAgrEst = "" ;
      T01L711_A407EmprNom = new String[] {""} ;
      T01L711_n407EmprNom = new boolean[] {false} ;
      T01L712_A1243GuiRemCli = new int[1] ;
      T01L75_A252CliCod = new int[1] ;
      T01L75_n252CliCod = new boolean[] {false} ;
      T01L75_A120BarAgrEst = new String[] {""} ;
      T01L714_A1248GuiFasULin = new short[1] ;
      T01L714_A407EmprNom = new String[] {""} ;
      T01L714_n407EmprNom = new boolean[] {false} ;
      T01L714_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L714_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L714_A120BarAgrEst = new String[] {""} ;
      T01L714_A396EmprCod = new String[] {""} ;
      T01L714_A129BarCod = new int[1] ;
      T01L714_A132BarCodReo = new byte[1] ;
      T01L714_A130BarCodPar = new String[] {""} ;
      T01L714_A30AlbProCod = new long[1] ;
      T01L714_A1243GuiRemCli = new int[1] ;
      T01L714_A252CliCod = new int[1] ;
      T01L714_n252CliCod = new boolean[] {false} ;
      T01L714_A13786GuiFasMaxL = new short[1] ;
      T01L714_n13786GuiFasMaxL = new boolean[] {false} ;
      T01L715_A407EmprNom = new String[] {""} ;
      T01L715_n407EmprNom = new boolean[] {false} ;
      T01L716_A1243GuiRemCli = new int[1] ;
      T01L717_A120BarAgrEst = new String[] {""} ;
      T01L717_A252CliCod = new int[1] ;
      T01L717_n252CliCod = new boolean[] {false} ;
      T01L719_A13786GuiFasMaxL = new short[1] ;
      T01L719_n13786GuiFasMaxL = new boolean[] {false} ;
      T01L720_A396EmprCod = new String[] {""} ;
      T01L720_A30AlbProCod = new long[1] ;
      T01L720_A129BarCod = new int[1] ;
      T01L720_A132BarCodReo = new byte[1] ;
      T01L720_A130BarCodPar = new String[] {""} ;
      T01L710_A1248GuiFasULin = new short[1] ;
      T01L710_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L710_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L710_A396EmprCod = new String[] {""} ;
      T01L710_A129BarCod = new int[1] ;
      T01L710_A132BarCodReo = new byte[1] ;
      T01L710_A130BarCodPar = new String[] {""} ;
      T01L710_A30AlbProCod = new long[1] ;
      T01L721_A396EmprCod = new String[] {""} ;
      T01L721_A30AlbProCod = new long[1] ;
      T01L721_A129BarCod = new int[1] ;
      T01L721_A132BarCodReo = new byte[1] ;
      T01L721_A130BarCodPar = new String[] {""} ;
      T01L722_A396EmprCod = new String[] {""} ;
      T01L722_A30AlbProCod = new long[1] ;
      T01L722_A129BarCod = new int[1] ;
      T01L722_A132BarCodReo = new byte[1] ;
      T01L722_A130BarCodPar = new String[] {""} ;
      T01L79_A1248GuiFasULin = new short[1] ;
      T01L79_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L79_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L79_A396EmprCod = new String[] {""} ;
      T01L79_A129BarCod = new int[1] ;
      T01L79_A132BarCodReo = new byte[1] ;
      T01L79_A130BarCodPar = new String[] {""} ;
      T01L79_A30AlbProCod = new long[1] ;
      T01L726_A407EmprNom = new String[] {""} ;
      T01L726_n407EmprNom = new boolean[] {false} ;
      T01L727_A1243GuiRemCli = new int[1] ;
      T01L728_A120BarAgrEst = new String[] {""} ;
      T01L728_A252CliCod = new int[1] ;
      T01L728_n252CliCod = new boolean[] {false} ;
      T01L730_A13786GuiFasMaxL = new short[1] ;
      T01L730_n13786GuiFasMaxL = new boolean[] {false} ;
      T01L731_A396EmprCod = new String[] {""} ;
      T01L731_A30AlbProCod = new long[1] ;
      T01L731_A129BarCod = new int[1] ;
      T01L731_A132BarCodReo = new byte[1] ;
      T01L731_A130BarCodPar = new String[] {""} ;
      T01L731_A6648AlbMetLin = new short[1] ;
      T01L732_A396EmprCod = new String[] {""} ;
      T01L732_A30AlbProCod = new long[1] ;
      T01L732_A129BarCod = new int[1] ;
      T01L732_A132BarCodReo = new byte[1] ;
      T01L732_A130BarCodPar = new String[] {""} ;
      T01L732_A9639Et_Numero = new short[1] ;
      T01L733_A396EmprCod = new String[] {""} ;
      T01L733_A30AlbProCod = new long[1] ;
      T01L733_A129BarCod = new int[1] ;
      T01L733_A132BarCodReo = new byte[1] ;
      T01L733_A130BarCodPar = new String[] {""} ;
      T01L733_A6622AlbHdRLn = new short[1] ;
      T01L734_A396EmprCod = new String[] {""} ;
      T01L734_A30AlbProCod = new long[1] ;
      T01L734_A129BarCod = new int[1] ;
      T01L734_A132BarCodReo = new byte[1] ;
      T01L734_A130BarCodPar = new String[] {""} ;
      T01L734_A5456P_ForLin = new short[1] ;
      T01L735_A396EmprCod = new String[] {""} ;
      T01L735_A30AlbProCod = new long[1] ;
      T01L735_A129BarCod = new int[1] ;
      T01L735_A132BarCodReo = new byte[1] ;
      T01L735_A130BarCodPar = new String[] {""} ;
      T01L735_A2524DisComLin = new byte[1] ;
      T01L735_A1056DisComCod = new String[] {""} ;
      T01L735_A1032FonCod = new String[] {""} ;
      T01L736_A396EmprCod = new String[] {""} ;
      T01L736_A3617AlbTrnCod = new long[1] ;
      T01L736_A30AlbProCod = new long[1] ;
      T01L736_A129BarCod = new int[1] ;
      T01L736_A132BarCodReo = new byte[1] ;
      T01L736_A130BarCodPar = new String[] {""} ;
      T01L737_A396EmprCod = new String[] {""} ;
      T01L737_A30AlbProCod = new long[1] ;
      T01L737_A129BarCod = new int[1] ;
      T01L737_A132BarCodReo = new byte[1] ;
      T01L737_A130BarCodPar = new String[] {""} ;
      T01L737_A3621AlbPckLin = new short[1] ;
      T01L738_A396EmprCod = new String[] {""} ;
      T01L738_A30AlbProCod = new long[1] ;
      T01L738_A129BarCod = new int[1] ;
      T01L738_A132BarCodReo = new byte[1] ;
      T01L738_A130BarCodPar = new String[] {""} ;
      T01L738_A2764AlbHdrLin = new short[1] ;
      T01L739_A396EmprCod = new String[] {""} ;
      T01L739_A30AlbProCod = new long[1] ;
      T01L739_A129BarCod = new int[1] ;
      T01L739_A132BarCodReo = new byte[1] ;
      T01L739_A130BarCodPar = new String[] {""} ;
      T01L739_A1468AlbPrdLin = new short[1] ;
      T01L740_A396EmprCod = new String[] {""} ;
      T01L740_A30AlbProCod = new long[1] ;
      T01L740_A129BarCod = new int[1] ;
      T01L740_A132BarCodReo = new byte[1] ;
      T01L740_A130BarCodPar = new String[] {""} ;
      T01L740_A200BarPieCod = new String[] {""} ;
      T01L742_A396EmprCod = new String[] {""} ;
      T01L742_A30AlbProCod = new long[1] ;
      T01L742_A129BarCod = new int[1] ;
      T01L742_A132BarCodReo = new byte[1] ;
      T01L742_A130BarCodPar = new String[] {""} ;
      Z460FasDsc = "" ;
      Z466FasPreKgm = DecimalUtil.ZERO ;
      Z467FasPreMtr = DecimalUtil.ZERO ;
      T01L743_A252CliCod = new int[1] ;
      T01L743_n252CliCod = new boolean[] {false} ;
      T01L743_A30AlbProCod = new long[1] ;
      T01L743_A1240GuiFasLin = new short[1] ;
      T01L743_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_A460FasDsc = new String[] {""} ;
      T01L743_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_n466FasPreKgm = new boolean[] {false} ;
      T01L743_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_n467FasPreMtr = new boolean[] {false} ;
      T01L743_A12193FasUnd = new int[1] ;
      T01L743_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L743_A396EmprCod = new String[] {""} ;
      T01L743_A457FasCod = new String[] {""} ;
      T01L743_A129BarCod = new int[1] ;
      T01L743_A132BarCodReo = new byte[1] ;
      T01L743_A130BarCodPar = new String[] {""} ;
      T01L744_A13781FasCDsc = new String[] {""} ;
      T01L744_A396EmprCod = new String[] {""} ;
      T01L744_A457FasCod = new String[] {""} ;
      T01L745_A13781FasCDsc = new String[] {""} ;
      T01L745_A396EmprCod = new String[] {""} ;
      T01L745_A457FasCod = new String[] {""} ;
      GXCCtl = "" ;
      T01L746_A13781FasCDsc = new String[] {""} ;
      T01L746_A396EmprCod = new String[] {""} ;
      T01L746_A457FasCod = new String[] {""} ;
      T01L74_A460FasDsc = new String[] {""} ;
      T01L76_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L76_n466FasPreKgm = new boolean[] {false} ;
      T01L76_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L76_n467FasPreMtr = new boolean[] {false} ;
      T01L747_A460FasDsc = new String[] {""} ;
      T01L748_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L748_n466FasPreKgm = new boolean[] {false} ;
      T01L748_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L748_n467FasPreMtr = new boolean[] {false} ;
      T01L749_A13781FasCDsc = new String[] {""} ;
      T01L749_A396EmprCod = new String[] {""} ;
      T01L749_A457FasCod = new String[] {""} ;
      T01L750_A396EmprCod = new String[] {""} ;
      T01L750_A30AlbProCod = new long[1] ;
      T01L750_A129BarCod = new int[1] ;
      T01L750_A132BarCodReo = new byte[1] ;
      T01L750_A130BarCodPar = new String[] {""} ;
      T01L750_A1240GuiFasLin = new short[1] ;
      T01L73_A30AlbProCod = new long[1] ;
      T01L73_A1240GuiFasLin = new short[1] ;
      T01L73_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L73_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L73_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L73_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L73_A12193FasUnd = new int[1] ;
      T01L73_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L73_A396EmprCod = new String[] {""} ;
      T01L73_A457FasCod = new String[] {""} ;
      T01L73_A129BarCod = new int[1] ;
      T01L73_A132BarCodReo = new byte[1] ;
      T01L73_A130BarCodPar = new String[] {""} ;
      T01L751_A13781FasCDsc = new String[] {""} ;
      T01L751_A396EmprCod = new String[] {""} ;
      T01L751_A457FasCod = new String[] {""} ;
      T01L72_A30AlbProCod = new long[1] ;
      T01L72_A1240GuiFasLin = new short[1] ;
      T01L72_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L72_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L72_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L72_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L72_A12193FasUnd = new int[1] ;
      T01L72_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L72_A396EmprCod = new String[] {""} ;
      T01L72_A457FasCod = new String[] {""} ;
      T01L72_A129BarCod = new int[1] ;
      T01L72_A132BarCodReo = new byte[1] ;
      T01L72_A130BarCodPar = new String[] {""} ;
      T01L755_A460FasDsc = new String[] {""} ;
      T01L756_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L756_n466FasPreKgm = new boolean[] {false} ;
      T01L756_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L756_n467FasPreMtr = new boolean[] {false} ;
      T01L757_A396EmprCod = new String[] {""} ;
      T01L757_A30AlbProCod = new long[1] ;
      T01L757_A129BarCod = new int[1] ;
      T01L757_A132BarCodReo = new byte[1] ;
      T01L757_A130BarCodPar = new String[] {""} ;
      T01L757_A1240GuiFasLin = new short[1] ;
      Gridlevel_fasesRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_fases_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i1275FasKgm = DecimalUtil.ZERO ;
      i1276FasMtr = DecimalUtil.ZERO ;
      Gridlevel_fasesColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13781FasCDsc = "" ;
      T01L758_A13781FasCDsc = new String[] {""} ;
      T01L759_A13781FasCDsc = new String[] {""} ;
      T01L759_A396EmprCod = new String[] {""} ;
      T01L759_A457FasCod = new String[] {""} ;
      T01L760_A120BarAgrEst = new String[] {""} ;
      T01L760_A252CliCod = new int[1] ;
      T01L760_n252CliCod = new boolean[] {false} ;
      T01L761_A13781FasCDsc = new String[] {""} ;
      T01L761_A396EmprCod = new String[] {""} ;
      T01L761_A457FasCod = new String[] {""} ;
      T01L762_A460FasDsc = new String[] {""} ;
      T01L763_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L763_n466FasPreKgm = new boolean[] {false} ;
      T01L763_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01L763_n467FasPreMtr = new boolean[] {false} ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      Zh457FasCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn09__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn09__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn09__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn09__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn09__default(),
         new Object[] {
             new Object[] {
            T01L72_A30AlbProCod, T01L72_A1240GuiFasLin, T01L72_A1242GuiFasPMt, T01L72_A1241GuiFasPKg, T01L72_A1275FasKgm, T01L72_A1276FasMtr, T01L72_A12193FasUnd, T01L72_A12194FasPreUnd, T01L72_A396EmprCod, T01L72_A457FasCod,
            T01L72_A129BarCod, T01L72_A132BarCodReo, T01L72_A130BarCodPar
            }
            , new Object[] {
            T01L73_A30AlbProCod, T01L73_A1240GuiFasLin, T01L73_A1242GuiFasPMt, T01L73_A1241GuiFasPKg, T01L73_A1275FasKgm, T01L73_A1276FasMtr, T01L73_A12193FasUnd, T01L73_A12194FasPreUnd, T01L73_A396EmprCod, T01L73_A457FasCod,
            T01L73_A129BarCod, T01L73_A132BarCodReo, T01L73_A130BarCodPar
            }
            , new Object[] {
            T01L74_A460FasDsc
            }
            , new Object[] {
            T01L75_A252CliCod, T01L75_n252CliCod, T01L75_A120BarAgrEst
            }
            , new Object[] {
            T01L76_A466FasPreKgm, T01L76_n466FasPreKgm, T01L76_A467FasPreMtr, T01L76_n467FasPreMtr
            }
            , new Object[] {
            T01L78_A13786GuiFasMaxL, T01L78_n13786GuiFasMaxL
            }
            , new Object[] {
            T01L79_A1248GuiFasULin, T01L79_A1261BarAlbKgmE, T01L79_A1263BarAlbMtrE, T01L79_A396EmprCod, T01L79_A129BarCod, T01L79_A132BarCodReo, T01L79_A130BarCodPar, T01L79_A30AlbProCod
            }
            , new Object[] {
            T01L710_A1248GuiFasULin, T01L710_A1261BarAlbKgmE, T01L710_A1263BarAlbMtrE, T01L710_A396EmprCod, T01L710_A129BarCod, T01L710_A132BarCodReo, T01L710_A130BarCodPar, T01L710_A30AlbProCod
            }
            , new Object[] {
            T01L711_A407EmprNom, T01L711_n407EmprNom
            }
            , new Object[] {
            T01L712_A1243GuiRemCli
            }
            , new Object[] {
            T01L714_A1248GuiFasULin, T01L714_A407EmprNom, T01L714_n407EmprNom, T01L714_A1261BarAlbKgmE, T01L714_A1263BarAlbMtrE, T01L714_A120BarAgrEst, T01L714_A396EmprCod, T01L714_A129BarCod, T01L714_A132BarCodReo, T01L714_A130BarCodPar,
            T01L714_A30AlbProCod, T01L714_A1243GuiRemCli, T01L714_A252CliCod, T01L714_n252CliCod, T01L714_A13786GuiFasMaxL, T01L714_n13786GuiFasMaxL
            }
            , new Object[] {
            T01L715_A407EmprNom, T01L715_n407EmprNom
            }
            , new Object[] {
            T01L716_A1243GuiRemCli
            }
            , new Object[] {
            T01L717_A120BarAgrEst, T01L717_A252CliCod, T01L717_n252CliCod
            }
            , new Object[] {
            T01L719_A13786GuiFasMaxL, T01L719_n13786GuiFasMaxL
            }
            , new Object[] {
            T01L720_A396EmprCod, T01L720_A30AlbProCod, T01L720_A129BarCod, T01L720_A132BarCodReo, T01L720_A130BarCodPar
            }
            , new Object[] {
            T01L721_A396EmprCod, T01L721_A30AlbProCod, T01L721_A129BarCod, T01L721_A132BarCodReo, T01L721_A130BarCodPar
            }
            , new Object[] {
            T01L722_A396EmprCod, T01L722_A30AlbProCod, T01L722_A129BarCod, T01L722_A132BarCodReo, T01L722_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L726_A407EmprNom, T01L726_n407EmprNom
            }
            , new Object[] {
            T01L727_A1243GuiRemCli
            }
            , new Object[] {
            T01L728_A120BarAgrEst, T01L728_A252CliCod, T01L728_n252CliCod
            }
            , new Object[] {
            T01L730_A13786GuiFasMaxL, T01L730_n13786GuiFasMaxL
            }
            , new Object[] {
            T01L731_A396EmprCod, T01L731_A30AlbProCod, T01L731_A129BarCod, T01L731_A132BarCodReo, T01L731_A130BarCodPar, T01L731_A6648AlbMetLin
            }
            , new Object[] {
            T01L732_A396EmprCod, T01L732_A30AlbProCod, T01L732_A129BarCod, T01L732_A132BarCodReo, T01L732_A130BarCodPar, T01L732_A9639Et_Numero
            }
            , new Object[] {
            T01L733_A396EmprCod, T01L733_A30AlbProCod, T01L733_A129BarCod, T01L733_A132BarCodReo, T01L733_A130BarCodPar, T01L733_A6622AlbHdRLn
            }
            , new Object[] {
            T01L734_A396EmprCod, T01L734_A30AlbProCod, T01L734_A129BarCod, T01L734_A132BarCodReo, T01L734_A130BarCodPar, T01L734_A5456P_ForLin
            }
            , new Object[] {
            T01L735_A396EmprCod, T01L735_A30AlbProCod, T01L735_A129BarCod, T01L735_A132BarCodReo, T01L735_A130BarCodPar, T01L735_A2524DisComLin, T01L735_A1056DisComCod, T01L735_A1032FonCod
            }
            , new Object[] {
            T01L736_A396EmprCod, T01L736_A3617AlbTrnCod, T01L736_A30AlbProCod, T01L736_A129BarCod, T01L736_A132BarCodReo, T01L736_A130BarCodPar
            }
            , new Object[] {
            T01L737_A396EmprCod, T01L737_A30AlbProCod, T01L737_A129BarCod, T01L737_A132BarCodReo, T01L737_A130BarCodPar, T01L737_A3621AlbPckLin
            }
            , new Object[] {
            T01L738_A396EmprCod, T01L738_A30AlbProCod, T01L738_A129BarCod, T01L738_A132BarCodReo, T01L738_A130BarCodPar, T01L738_A2764AlbHdrLin
            }
            , new Object[] {
            T01L739_A396EmprCod, T01L739_A30AlbProCod, T01L739_A129BarCod, T01L739_A132BarCodReo, T01L739_A130BarCodPar, T01L739_A1468AlbPrdLin
            }
            , new Object[] {
            T01L740_A396EmprCod, T01L740_A30AlbProCod, T01L740_A129BarCod, T01L740_A132BarCodReo, T01L740_A130BarCodPar, T01L740_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01L742_A396EmprCod, T01L742_A30AlbProCod, T01L742_A129BarCod, T01L742_A132BarCodReo, T01L742_A130BarCodPar
            }
            , new Object[] {
            T01L743_A252CliCod, T01L743_n252CliCod, T01L743_A30AlbProCod, T01L743_A1240GuiFasLin, T01L743_A1242GuiFasPMt, T01L743_A1241GuiFasPKg, T01L743_A1275FasKgm, T01L743_A1276FasMtr, T01L743_A460FasDsc, T01L743_A466FasPreKgm,
            T01L743_n466FasPreKgm, T01L743_A467FasPreMtr, T01L743_n467FasPreMtr, T01L743_A12193FasUnd, T01L743_A12194FasPreUnd, T01L743_A396EmprCod, T01L743_A457FasCod, T01L743_A129BarCod, T01L743_A132BarCodReo, T01L743_A130BarCodPar
            }
            , new Object[] {
            T01L744_A13781FasCDsc, T01L744_A396EmprCod, T01L744_A457FasCod
            }
            , new Object[] {
            T01L745_A13781FasCDsc, T01L745_A396EmprCod, T01L745_A457FasCod
            }
            , new Object[] {
            T01L746_A13781FasCDsc, T01L746_A396EmprCod, T01L746_A457FasCod
            }
            , new Object[] {
            T01L747_A460FasDsc
            }
            , new Object[] {
            T01L748_A466FasPreKgm, T01L748_n466FasPreKgm, T01L748_A467FasPreMtr, T01L748_n467FasPreMtr
            }
            , new Object[] {
            T01L749_A13781FasCDsc, T01L749_A396EmprCod, T01L749_A457FasCod
            }
            , new Object[] {
            T01L750_A396EmprCod, T01L750_A30AlbProCod, T01L750_A129BarCod, T01L750_A132BarCodReo, T01L750_A130BarCodPar, T01L750_A1240GuiFasLin
            }
            , new Object[] {
            T01L751_A13781FasCDsc, T01L751_A396EmprCod, T01L751_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01L755_A460FasDsc
            }
            , new Object[] {
            T01L756_A466FasPreKgm, T01L756_n466FasPreKgm, T01L756_A467FasPreMtr, T01L756_n467FasPreMtr
            }
            , new Object[] {
            T01L757_A396EmprCod, T01L757_A30AlbProCod, T01L757_A129BarCod, T01L757_A132BarCodReo, T01L757_A130BarCodPar, T01L757_A1240GuiFasLin
            }
            , new Object[] {
            T01L758_A13781FasCDsc
            }
            , new Object[] {
            T01L759_A13781FasCDsc, T01L759_A396EmprCod, T01L759_A457FasCod
            }
            , new Object[] {
            T01L760_A120BarAgrEst, T01L760_A252CliCod, T01L760_n252CliCod
            }
            , new Object[] {
            T01L761_A13781FasCDsc, T01L761_A396EmprCod, T01L761_A457FasCod
            }
            , new Object[] {
            T01L762_A460FasDsc
            }
            , new Object[] {
            T01L763_A466FasPreKgm, T01L763_n466FasPreKgm, T01L763_A467FasPreMtr, T01L763_n467FasPreMtr
            }
         }
      );
      Z1276FasMtr = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      i1276FasMtr = DecimalUtil.ZERO ;
      Z1275FasKgm = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      i1275FasKgm = DecimalUtil.ZERO ;
   }

   private byte wcpOAV181BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV181BarCodReo ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte AV48carvema ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte subGridlevel_fases_Backcolorstyle ;
   private byte subGridlevel_fases_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_fases_Allowselection ;
   private byte subGridlevel_fases_Allowhovering ;
   private byte subGridlevel_fases_Allowcollapsing ;
   private byte subGridlevel_fases_Collapsed ;
   private short Z1248GuiFasULin ;
   private short O13786GuiFasMaxL ;
   private short Z1240GuiFasLin ;
   private short nRcdDeleted_194 ;
   private short nRcdExists_194 ;
   private short nIsMod_194 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13786GuiFasMaxL ;
   private short A1248GuiFasULin ;
   private short nBlankRcdCount194 ;
   private short RcdFound194 ;
   private short B13786GuiFasMaxL ;
   private short nBlankRcdUsr194 ;
   private short RcdFound195 ;
   private short s13786GuiFasMaxL ;
   private short A1240GuiFasLin ;
   private short Z13786GuiFasMaxL ;
   private short nIsDirty_195 ;
   private short nIsDirty_194 ;
   private short i13786GuiFasMaxL ;
   private short gxhchits ;
   private int wcpOAV180BarCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_47 ;
   private int nGXsfl_47_idx=1 ;
   private int Z12193FasUnd ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV180BarCod ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtGuiFasMaxL_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtGuiFasULin_Enabled ;
   private int edtGuiFasULin_Visible ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarAlbKgmE_Visible ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtBarAlbMtrE_Visible ;
   private int edtBarAgrEst_Visible ;
   private int edtBarAgrEst_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliCod_Visible ;
   private int A1243GuiRemCli ;
   private int edtGuiRemCli_Enabled ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiFasLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtFasKgm_Enabled ;
   private int edtGuiFasPKg_Enabled ;
   private int edtFasMtr_Enabled ;
   private int edtGuiFasPMt_Enabled ;
   private int edtFasPreKgm_Enabled ;
   private int edtFasPreMtr_Enabled ;
   private int edtFasImp_Enabled ;
   private int edtFasUnd_Enabled ;
   private int edtFasPreUnd_Enabled ;
   private int fRowAdded ;
   private int A12193FasUnd ;
   private int GX_JID ;
   private int Z1243GuiRemCli ;
   private int Z252CliCod ;
   private int subGridlevel_fases_Backcolor ;
   private int subGridlevel_fases_Allbackcolor ;
   private int defedtFasPreUnd_Enabled ;
   private int defedtFasUnd_Enabled ;
   private int defedtFasImp_Enabled ;
   private int defedtFasPreMtr_Enabled ;
   private int defedtFasPreKgm_Enabled ;
   private int defedtFasDsc_Enabled ;
   private int defedtGuiFasLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_fases_Selectedindex ;
   private int subGridlevel_fases_Selectioncolor ;
   private int subGridlevel_fases_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long wcpOAV42AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long AV42AlbProCod ;
   private long GRIDLEVEL_FASES_nFirstRecordOnPage ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1242GuiFasPMt ;
   private java.math.BigDecimal Z1241GuiFasPKg ;
   private java.math.BigDecimal Z1275FasKgm ;
   private java.math.BigDecimal Z1276FasMtr ;
   private java.math.BigDecimal Z12194FasPreUnd ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A1277FasImp ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal Z466FasPreKgm ;
   private java.math.BigDecimal Z467FasPreMtr ;
   private java.math.BigDecimal i1275FasKgm ;
   private java.math.BigDecimal i1276FasMtr ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV182BarCodPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A130BarCodPar ;
   private String AV32EmprCod ;
   private String AV182BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_47_idx="0001" ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtGuiFasMaxL_Internalname ;
   private String edtGuiFasMaxL_Jsonclick ;
   private String divTableleaflevel_fases_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtGuiFasULin_Internalname ;
   private String edtGuiFasULin_Jsonclick ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarAgrEst_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtGuiRemCli_Internalname ;
   private String edtGuiRemCli_Jsonclick ;
   private String sMode194 ;
   private String edtGuiFasLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDsc_Internalname ;
   private String edtFasKgm_Internalname ;
   private String edtGuiFasPKg_Internalname ;
   private String edtFasMtr_Internalname ;
   private String edtGuiFasPMt_Internalname ;
   private String edtFasPreKgm_Internalname ;
   private String edtFasPreMtr_Internalname ;
   private String edtFasImp_Internalname ;
   private String edtFasUnd_Internalname ;
   private String edtFasPreUnd_Internalname ;
   private String sStyleString ;
   private String subGridlevel_fases_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode195 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A460FasDsc ;
   private String AV12Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV11EmprNom ;
   private String GXv_char5[] ;
   private String AV8UsurCod ;
   private String GXv_char6[] ;
   private String Z407EmprNom ;
   private String Z120BarAgrEst ;
   private String Z460FasDsc ;
   private String GXCCtl ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String subGridlevel_fases_Class ;
   private String subGridlevel_fases_Linesclass ;
   private String ROClassString ;
   private String edtGuiFasLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasKgm_Jsonclick ;
   private String edtGuiFasPKg_Jsonclick ;
   private String edtFasMtr_Jsonclick ;
   private String edtGuiFasPMt_Jsonclick ;
   private String edtFasPreKgm_Jsonclick ;
   private String edtFasPreMtr_Jsonclick ;
   private String edtFasImp_Jsonclick ;
   private String edtFasUnd_Jsonclick ;
   private String edtFasPreUnd_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_fases_Header ;
   private String gxwrpcisep ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean n13786GuiFasMaxL ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean Gx_longc ;
   private String A13781FasCDsc ;
   private String h457FasCod ;
   private String l13781FasCDsc ;
   private String Zh457FasCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_fasesContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_fasesRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_fasesColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV185WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T01L78_A13786GuiFasMaxL ;
   private boolean[] T01L78_n13786GuiFasMaxL ;
   private String[] T01L711_A407EmprNom ;
   private boolean[] T01L711_n407EmprNom ;
   private int[] T01L712_A1243GuiRemCli ;
   private int[] T01L75_A252CliCod ;
   private boolean[] T01L75_n252CliCod ;
   private String[] T01L75_A120BarAgrEst ;
   private short[] T01L714_A1248GuiFasULin ;
   private String[] T01L714_A407EmprNom ;
   private boolean[] T01L714_n407EmprNom ;
   private java.math.BigDecimal[] T01L714_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01L714_A1263BarAlbMtrE ;
   private String[] T01L714_A120BarAgrEst ;
   private String[] T01L714_A396EmprCod ;
   private int[] T01L714_A129BarCod ;
   private byte[] T01L714_A132BarCodReo ;
   private String[] T01L714_A130BarCodPar ;
   private long[] T01L714_A30AlbProCod ;
   private int[] T01L714_A1243GuiRemCli ;
   private int[] T01L714_A252CliCod ;
   private boolean[] T01L714_n252CliCod ;
   private short[] T01L714_A13786GuiFasMaxL ;
   private boolean[] T01L714_n13786GuiFasMaxL ;
   private String[] T01L715_A407EmprNom ;
   private boolean[] T01L715_n407EmprNom ;
   private int[] T01L716_A1243GuiRemCli ;
   private String[] T01L717_A120BarAgrEst ;
   private int[] T01L717_A252CliCod ;
   private boolean[] T01L717_n252CliCod ;
   private short[] T01L719_A13786GuiFasMaxL ;
   private boolean[] T01L719_n13786GuiFasMaxL ;
   private String[] T01L720_A396EmprCod ;
   private long[] T01L720_A30AlbProCod ;
   private int[] T01L720_A129BarCod ;
   private byte[] T01L720_A132BarCodReo ;
   private String[] T01L720_A130BarCodPar ;
   private short[] T01L710_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01L710_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01L710_A1263BarAlbMtrE ;
   private String[] T01L710_A396EmprCod ;
   private int[] T01L710_A129BarCod ;
   private byte[] T01L710_A132BarCodReo ;
   private String[] T01L710_A130BarCodPar ;
   private long[] T01L710_A30AlbProCod ;
   private String[] T01L721_A396EmprCod ;
   private long[] T01L721_A30AlbProCod ;
   private int[] T01L721_A129BarCod ;
   private byte[] T01L721_A132BarCodReo ;
   private String[] T01L721_A130BarCodPar ;
   private String[] T01L722_A396EmprCod ;
   private long[] T01L722_A30AlbProCod ;
   private int[] T01L722_A129BarCod ;
   private byte[] T01L722_A132BarCodReo ;
   private String[] T01L722_A130BarCodPar ;
   private short[] T01L79_A1248GuiFasULin ;
   private java.math.BigDecimal[] T01L79_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01L79_A1263BarAlbMtrE ;
   private String[] T01L79_A396EmprCod ;
   private int[] T01L79_A129BarCod ;
   private byte[] T01L79_A132BarCodReo ;
   private String[] T01L79_A130BarCodPar ;
   private long[] T01L79_A30AlbProCod ;
   private String[] T01L726_A407EmprNom ;
   private boolean[] T01L726_n407EmprNom ;
   private int[] T01L727_A1243GuiRemCli ;
   private String[] T01L728_A120BarAgrEst ;
   private int[] T01L728_A252CliCod ;
   private boolean[] T01L728_n252CliCod ;
   private short[] T01L730_A13786GuiFasMaxL ;
   private boolean[] T01L730_n13786GuiFasMaxL ;
   private String[] T01L731_A396EmprCod ;
   private long[] T01L731_A30AlbProCod ;
   private int[] T01L731_A129BarCod ;
   private byte[] T01L731_A132BarCodReo ;
   private String[] T01L731_A130BarCodPar ;
   private short[] T01L731_A6648AlbMetLin ;
   private String[] T01L732_A396EmprCod ;
   private long[] T01L732_A30AlbProCod ;
   private int[] T01L732_A129BarCod ;
   private byte[] T01L732_A132BarCodReo ;
   private String[] T01L732_A130BarCodPar ;
   private short[] T01L732_A9639Et_Numero ;
   private String[] T01L733_A396EmprCod ;
   private long[] T01L733_A30AlbProCod ;
   private int[] T01L733_A129BarCod ;
   private byte[] T01L733_A132BarCodReo ;
   private String[] T01L733_A130BarCodPar ;
   private short[] T01L733_A6622AlbHdRLn ;
   private String[] T01L734_A396EmprCod ;
   private long[] T01L734_A30AlbProCod ;
   private int[] T01L734_A129BarCod ;
   private byte[] T01L734_A132BarCodReo ;
   private String[] T01L734_A130BarCodPar ;
   private short[] T01L734_A5456P_ForLin ;
   private String[] T01L735_A396EmprCod ;
   private long[] T01L735_A30AlbProCod ;
   private int[] T01L735_A129BarCod ;
   private byte[] T01L735_A132BarCodReo ;
   private String[] T01L735_A130BarCodPar ;
   private byte[] T01L735_A2524DisComLin ;
   private String[] T01L735_A1056DisComCod ;
   private String[] T01L735_A1032FonCod ;
   private String[] T01L736_A396EmprCod ;
   private long[] T01L736_A3617AlbTrnCod ;
   private long[] T01L736_A30AlbProCod ;
   private int[] T01L736_A129BarCod ;
   private byte[] T01L736_A132BarCodReo ;
   private String[] T01L736_A130BarCodPar ;
   private String[] T01L737_A396EmprCod ;
   private long[] T01L737_A30AlbProCod ;
   private int[] T01L737_A129BarCod ;
   private byte[] T01L737_A132BarCodReo ;
   private String[] T01L737_A130BarCodPar ;
   private short[] T01L737_A3621AlbPckLin ;
   private String[] T01L738_A396EmprCod ;
   private long[] T01L738_A30AlbProCod ;
   private int[] T01L738_A129BarCod ;
   private byte[] T01L738_A132BarCodReo ;
   private String[] T01L738_A130BarCodPar ;
   private short[] T01L738_A2764AlbHdrLin ;
   private String[] T01L739_A396EmprCod ;
   private long[] T01L739_A30AlbProCod ;
   private int[] T01L739_A129BarCod ;
   private byte[] T01L739_A132BarCodReo ;
   private String[] T01L739_A130BarCodPar ;
   private short[] T01L739_A1468AlbPrdLin ;
   private String[] T01L740_A396EmprCod ;
   private long[] T01L740_A30AlbProCod ;
   private int[] T01L740_A129BarCod ;
   private byte[] T01L740_A132BarCodReo ;
   private String[] T01L740_A130BarCodPar ;
   private String[] T01L740_A200BarPieCod ;
   private String[] T01L742_A396EmprCod ;
   private long[] T01L742_A30AlbProCod ;
   private int[] T01L742_A129BarCod ;
   private byte[] T01L742_A132BarCodReo ;
   private String[] T01L742_A130BarCodPar ;
   private int[] T01L743_A252CliCod ;
   private boolean[] T01L743_n252CliCod ;
   private long[] T01L743_A30AlbProCod ;
   private short[] T01L743_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01L743_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01L743_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01L743_A1275FasKgm ;
   private java.math.BigDecimal[] T01L743_A1276FasMtr ;
   private String[] T01L743_A460FasDsc ;
   private java.math.BigDecimal[] T01L743_A466FasPreKgm ;
   private boolean[] T01L743_n466FasPreKgm ;
   private java.math.BigDecimal[] T01L743_A467FasPreMtr ;
   private boolean[] T01L743_n467FasPreMtr ;
   private int[] T01L743_A12193FasUnd ;
   private java.math.BigDecimal[] T01L743_A12194FasPreUnd ;
   private String[] T01L743_A396EmprCod ;
   private String[] T01L743_A457FasCod ;
   private int[] T01L743_A129BarCod ;
   private byte[] T01L743_A132BarCodReo ;
   private String[] T01L743_A130BarCodPar ;
   private String[] T01L744_A13781FasCDsc ;
   private String[] T01L744_A396EmprCod ;
   private String[] T01L744_A457FasCod ;
   private String[] T01L745_A13781FasCDsc ;
   private String[] T01L745_A396EmprCod ;
   private String[] T01L745_A457FasCod ;
   private String[] T01L746_A13781FasCDsc ;
   private String[] T01L746_A396EmprCod ;
   private String[] T01L746_A457FasCod ;
   private String[] T01L74_A460FasDsc ;
   private java.math.BigDecimal[] T01L76_A466FasPreKgm ;
   private boolean[] T01L76_n466FasPreKgm ;
   private java.math.BigDecimal[] T01L76_A467FasPreMtr ;
   private boolean[] T01L76_n467FasPreMtr ;
   private String[] T01L747_A460FasDsc ;
   private java.math.BigDecimal[] T01L748_A466FasPreKgm ;
   private boolean[] T01L748_n466FasPreKgm ;
   private java.math.BigDecimal[] T01L748_A467FasPreMtr ;
   private boolean[] T01L748_n467FasPreMtr ;
   private String[] T01L749_A13781FasCDsc ;
   private String[] T01L749_A396EmprCod ;
   private String[] T01L749_A457FasCod ;
   private String[] T01L750_A396EmprCod ;
   private long[] T01L750_A30AlbProCod ;
   private int[] T01L750_A129BarCod ;
   private byte[] T01L750_A132BarCodReo ;
   private String[] T01L750_A130BarCodPar ;
   private short[] T01L750_A1240GuiFasLin ;
   private long[] T01L73_A30AlbProCod ;
   private short[] T01L73_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01L73_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01L73_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01L73_A1275FasKgm ;
   private java.math.BigDecimal[] T01L73_A1276FasMtr ;
   private int[] T01L73_A12193FasUnd ;
   private java.math.BigDecimal[] T01L73_A12194FasPreUnd ;
   private String[] T01L73_A396EmprCod ;
   private String[] T01L73_A457FasCod ;
   private int[] T01L73_A129BarCod ;
   private byte[] T01L73_A132BarCodReo ;
   private String[] T01L73_A130BarCodPar ;
   private String[] T01L751_A13781FasCDsc ;
   private String[] T01L751_A396EmprCod ;
   private String[] T01L751_A457FasCod ;
   private long[] T01L72_A30AlbProCod ;
   private short[] T01L72_A1240GuiFasLin ;
   private java.math.BigDecimal[] T01L72_A1242GuiFasPMt ;
   private java.math.BigDecimal[] T01L72_A1241GuiFasPKg ;
   private java.math.BigDecimal[] T01L72_A1275FasKgm ;
   private java.math.BigDecimal[] T01L72_A1276FasMtr ;
   private int[] T01L72_A12193FasUnd ;
   private java.math.BigDecimal[] T01L72_A12194FasPreUnd ;
   private String[] T01L72_A396EmprCod ;
   private String[] T01L72_A457FasCod ;
   private int[] T01L72_A129BarCod ;
   private byte[] T01L72_A132BarCodReo ;
   private String[] T01L72_A130BarCodPar ;
   private String[] T01L755_A460FasDsc ;
   private java.math.BigDecimal[] T01L756_A466FasPreKgm ;
   private boolean[] T01L756_n466FasPreKgm ;
   private java.math.BigDecimal[] T01L756_A467FasPreMtr ;
   private boolean[] T01L756_n467FasPreMtr ;
   private String[] T01L757_A396EmprCod ;
   private long[] T01L757_A30AlbProCod ;
   private int[] T01L757_A129BarCod ;
   private byte[] T01L757_A132BarCodReo ;
   private String[] T01L757_A130BarCodPar ;
   private short[] T01L757_A1240GuiFasLin ;
   private String[] T01L758_A13781FasCDsc ;
   private String[] T01L759_A13781FasCDsc ;
   private String[] T01L759_A396EmprCod ;
   private String[] T01L759_A457FasCod ;
   private String[] T01L760_A120BarAgrEst ;
   private int[] T01L760_A252CliCod ;
   private boolean[] T01L760_n252CliCod ;
   private String[] T01L761_A13781FasCDsc ;
   private String[] T01L761_A396EmprCod ;
   private String[] T01L761_A457FasCod ;
   private String[] T01L762_A460FasDsc ;
   private java.math.BigDecimal[] T01L763_A466FasPreKgm ;
   private boolean[] T01L763_n466FasPreKgm ;
   private java.math.BigDecimal[] T01L763_A467FasPreMtr ;
   private boolean[] T01L763_n467FasPreMtr ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV186ObjetoRefrescar ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV184TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV183WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class ttrn09__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn09__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn09__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn09__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn09__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01L72", "SELECT AlbProCod, GuiFasLin, GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?  FOR UPDATE OF GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L73", "SELECT AlbProCod, GuiFasLin, GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L74", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L75", "SELECT CliCod, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L76", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L78", "SELECT COALESCE( T1.GuiFasMaxL, 0) AS GuiFasMaxL FROM (SELECT MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L79", "SELECT GuiFasULin, BarAlbKgmE, BarAlbMtrE, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF GuiFasULin, BarAlbKgmE, BarAlbMtrE NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L710", "SELECT GuiFasULin, BarAlbKgmE, BarAlbMtrE, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L711", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L712", "SELECT GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L714", "SELECT /*+ FIRST_ROWS(100) */ TM1.GuiFasULin, T2.EmprNom, TM1.BarAlbKgmE, TM1.BarAlbMtrE, T4.BarAgrEst, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod, T3.GuiRemCli, T4.CliCod, COALESCE( T5.GuiFasMaxL, 0) AS GuiFasMaxL FROM ((((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbProCod = TM1.AlbProCod) INNER JOIN TXPBARCAD T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.AlbProCod = TM1.AlbProCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L715", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L716", "SELECT GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L717", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L719", "SELECT COALESCE( T1.GuiFasMaxL, 0) AS GuiFasMaxL FROM (SELECT MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L720", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L721", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE ( EmprCod > ? or EmprCod = ? and AlbProCod > ? or AlbProCod = ? and EmprCod = ? and BarCod > ? or BarCod = ? and AlbProCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and AlbProCod = ? and EmprCod = ? and BarCodPar > ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L722", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE ( EmprCod < ? or EmprCod = ? and AlbProCod < ? or AlbProCod = ? and EmprCod = ? and BarCod < ? or BarCod = ? and AlbProCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and AlbProCod = ? and EmprCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01L723", "INSERT INTO TXPALBBAR(GuiFasULin, BarAlbKgmE, BarAlbMtrE, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbPie, BarAlbTub, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01L724", "UPDATE TXPALBBAR SET GuiFasULin=?, BarAlbKgmE=?, BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01L725", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01L726", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L727", "SELECT GuiRemCli FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L728", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L730", "SELECT COALESCE( T1.GuiFasMaxL, 0) AS GuiFasMaxL FROM (SELECT MAX(GuiFasLin) AS GuiFasMaxL, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBFAS GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L731", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L732", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L733", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L734", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L735", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L736", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L737", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L738", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L739", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01L740", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01L741", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01L742", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L743", "SELECT T2.CliCod, T1.AlbProCod, T1.GuiFasLin, T1.GuiFasPMt, T1.GuiFasPKg, T1.FasKgm, T1.FasMtr, T3.FasDsc, T4.FasPreKgm, T4.FasPreMtr, T1.FasUnd, T1.FasPreUnd, T1.EmprCod, T1.FasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (((TXPALBFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPPREFAS T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T2.CliCod AND T4.FasCod = T1.FasCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE T1.AlbProCod = ? and T1.GuiFasLin = ? and T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GuiFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L744", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (EmprCod = ?) AND (FasCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L745", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L746", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L747", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L748", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L749", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L750", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L751", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01L752", "INSERT INTO TXPALBFAS(AlbProCod, GuiFasLin, GuiFasPMt, GuiFasPKg, FasKgm, FasMtr, FasUnd, FasPreUnd, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T01L753", "UPDATE TXPALBFAS SET GuiFasPMt=?, GuiFasPKg=?, FasKgm=?, FasMtr=?, FasUnd=?, FasPreUnd=?, FasCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new UpdateCursor("T01L754", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK, "TXPALBFAS")
         ,new ForEachCursor("T01L755", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L756", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L757", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE AlbProCod = ? and EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L758", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc FROM TXPFASPRO WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc))) like '%' || UPPER(?))) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L759", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L760", "SELECT BarAgrEst, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L761", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE (RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L762", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01L763", "SELECT FasPreKgm, FasPreMtr FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 10 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((long[]) buf[10])[0] = rslt.getLong(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 37 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 28);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               ((String[]) buf[15])[0] = rslt.getString(13, 3);
               ((String[]) buf[16])[0] = rslt.getString(14, 8);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 42 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 50 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 57 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setLong(13, ((Number) parms[12]).longValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setLong(8, ((Number) parms[7]).longValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setLong(13, ((Number) parms[12]).longValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setString(15, (String)parms[14], 1);
               return;
            case 18 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setLong(8, ((Number) parms[7]).longValue());
               return;
            case 19 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 35 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 37 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 39 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 40 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 43 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 45 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 46 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 5);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               return;
            case 47 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 5);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 51 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 100);
               return;
            case 53 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 55 :
               stmt.setVarchar(1, (String)parms[0], 100);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
      }
   }

}

