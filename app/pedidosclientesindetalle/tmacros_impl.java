package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmacros_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         A1204MacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "MacBarReo"))) ;
         A1205MacBarPar = httpContext.GetPar( "MacBarPar") ;
         A1202MacDisCod = (int)(GXutil.lval( httpContext.GetPar( "MacDisCod"))) ;
         AV30Err_hdr = (byte)(GXutil.lval( httpContext.GetPar( "Err_hdr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_18_47168( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, A1202MacDisCod, AV30Err_hdr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         AV37NOAgrM = (byte)(GXutil.lval( httpContext.GetPar( "NOAgrM"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37NOAgrM", GXutil.str( AV37NOAgrM, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_19_47168( A396EmprCod, A1199MacCod, A1203MacBarCod, AV37NOAgrM) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action20") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         A1204MacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "MacBarReo"))) ;
         A1205MacBarPar = httpContext.GetPar( "MacBarPar") ;
         AV33Err_l = (byte)(GXutil.lval( httpContext.GetPar( "Err_l"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
         AV34Msgl = httpContext.GetPar( "Msgl") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
         A1201MacLin = (short)(GXutil.lval( httpContext.GetPar( "MacLin"))) ;
         AV36NoBaragr = (byte)(GXutil.lval( httpContext.GetPar( "NoBaragr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36NoBaragr", GXutil.str( AV36NoBaragr, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_20_47168( Gx_mode, A396EmprCod, A1199MacCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, AV33Err_l, AV34Msgl, A1201MacLin, AV36NoBaragr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         A1204MacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "MacBarReo"))) ;
         A1205MacBarPar = httpContext.GetPar( "MacBarPar") ;
         AV35Err_le = (byte)(GXutil.lval( httpContext.GetPar( "Err_le"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_21_47168( Gx_mode, A396EmprCod, A1199MacCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, AV35Err_le) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         A1204MacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "MacBarReo"))) ;
         A1205MacBarPar = httpContext.GetPar( "MacBarPar") ;
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         AV39Indutexma = (byte)(GXutil.lval( httpContext.GetPar( "Indutexma"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39Indutexma", GXutil.str( AV39Indutexma, 1, 0));
         AV44biarprint = (byte)(GXutil.lval( httpContext.GetPar( "biarprint"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44biarprint", GXutil.str( AV44biarprint, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_22_47168( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar, A1199MacCod, AV39Indutexma, AV44biarprint) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action23") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         AV40Msg_control1 = httpContext.GetPar( "Msg_control1") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_control1", AV40Msg_control1);
         AV42Recmaq = (byte)(GXutil.lval( httpContext.GetPar( "Recmaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42Recmaq", GXutil.str( AV42Recmaq, 1, 0));
         AV43Lhipro = (byte)(GXutil.lval( httpContext.GetPar( "Lhipro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43Lhipro", GXutil.str( AV43Lhipro, 1, 0));
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         A1205MacBarPar = httpContext.GetPar( "MacBarPar") ;
         AV41ctrlhdrsproceso = (byte)(GXutil.lval( httpContext.GetPar( "ctrlhdrsproceso"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ctrlhdrsproceso", GXutil.str( AV41ctrlhdrsproceso, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_23_47168( Gx_mode, A396EmprCod, A1199MacCod, AV40Msg_control1, AV42Recmaq, AV43Lhipro, A1203MacBarCod, A1205MacBarPar, AV41ctrlhdrsproceso) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_36") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_36( A396EmprCod, A1199MacCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_38") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1203MacBarCod = (int)(GXutil.lval( httpContext.GetPar( "MacBarCod"))) ;
         A1204MacBarReo = (byte)(GXutil.lval( httpContext.GetPar( "MacBarReo"))) ;
         A1205MacBarPar = httpContext.GetPar( "MacBarPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_38( A396EmprCod, A1203MacBarCod, A1204MacBarReo, A1205MacBarPar) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_level1") == 0 )
      {
         gxnrgridlevel_level1_newrow_invoke( ) ;
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
            AV28EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
            AV29MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29MacCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29MacCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Accesorios", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_28 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_28"))) ;
      nGXsfl_28_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_28_idx"))) ;
      sGXsfl_28_idx = httpContext.GetPar( "sGXsfl_28_idx") ;
      A1200MacUltLin = (short)(GXutil.lval( httpContext.GetPar( "MacUltLin"))) ;
      n1200MacUltLin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tmacros_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmacros_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmacros_impl.class ));
   }

   public tmacros_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMacCod_Internalname, httpContext.getMessage( "Nº Macro", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1199MacCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMacCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_level1( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarlinea_Internalname, "", httpContext.getMessage( "Eliminar Linea", ""), bttBtneliminarlinea_Jsonclick, 7, httpContext.getMessage( "Eliminar Linea", ""), "", StyleString, ClassString, bttBtneliminarlinea_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1147167_client"+"'", TempTags, "", 2, "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMacUltLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1200MacUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMacUltLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1200MacUltLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1200MacUltLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMacUltLin_Jsonclick, 0, "Attribute", "", "", "", "", edtMacUltLin_Visible, edtMacUltLin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\TMACROS.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
      ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
      ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol28( ) ;
      nGXsfl_28_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount168 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_168 = (short)(1) ;
            scanStart47168( ) ;
            while ( RcdFound168 != 0 )
            {
               init_level_properties168( ) ;
               getByPrimaryKey47168( ) ;
               addRow47168( ) ;
               scanNext47168( ) ;
            }
            scanEnd47168( ) ;
            nBlankRcdCount168 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1200MacUltLin = A1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         B14266MacDatos = A14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         standaloneNotModal47168( ) ;
         standaloneModal47168( ) ;
         sMode168 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRow47168( ) ;
            edtMacLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtMacBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACBARCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtMacBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACBARREO_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtMacBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACBARPAR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtMacDisCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACDISCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacDisCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtMacSitHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACSITHDR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMacSitHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacSitHdr_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            imgprompt_1203_1204_1205_Link = httpContext.cgiGet( "PROMPT_1203_1204_1205_"+sGXsfl_28_idx+"Link") ;
            if ( ( nRcdExists_168 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal47168( ) ;
            }
            sendRow47168( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode168 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1200MacUltLin = B1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         A14266MacDatos = B14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount168 = (short)(5) ;
         nRcdExists_168 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart47168( ) ;
            while ( RcdFound168 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_28168( ) ;
               init_level_properties168( ) ;
               standaloneNotModal47168( ) ;
               getByPrimaryKey47168( ) ;
               standaloneModal47168( ) ;
               addRow47168( ) ;
               scanNext47168( ) ;
            }
            scanEnd47168( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode168 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_28168( ) ;
         initAll47168( ) ;
         init_level_properties168( ) ;
         B1200MacUltLin = A1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         B14266MacDatos = A14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         nRcdExists_168 = (short)(0) ;
         nIsMod_168 = (short)(0) ;
         nRcdDeleted_168 = (short)(0) ;
         nBlankRcdCount168 = (short)(nBlankRcdUsr168+nBlankRcdCount168) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount168 > 0 )
         {
            standaloneNotModal47168( ) ;
            standaloneModal47168( ) ;
            addRow47168( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMacLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount168 = (short)(nBlankRcdCount168-1) ;
         }
         Gx_mode = sMode168 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1200MacUltLin = B1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         A14266MacDatos = B14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_level1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_level1", Gridlevel_level1Container, subGridlevel_level1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData", Gridlevel_level1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_level1ContainerData"+"V", Gridlevel_level1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_level1ContainerData"+"V"+"\" value='"+Gridlevel_level1Container.GridValuesHidden()+"'/>") ;
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
      e12472 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1199MacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1199MacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1200MacUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1200MacUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O1200MacUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O1200MacUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O14266MacDatos = (short)(localUtil.ctol( httpContext.cgiGet( "O14266MacDatos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV28EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV29MacCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14266MacDatos = (short)(localUtil.ctol( httpContext.cgiGet( "MACDATOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13714MacHdr = httpContext.cgiGet( "MACHDR") ;
            AV30Err_hdr = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_HDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37NOAgrM = (byte)(localUtil.ctol( httpContext.cgiGet( "vNOAGRM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Msgl = httpContext.cgiGet( "vMSGL") ;
            AV33Err_l = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_L"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Err_le = (byte)(localUtil.ctol( httpContext.cgiGet( "vERR_LE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV39Indutexma = (byte)(localUtil.ctol( httpContext.cgiGet( "vINDUTEXMA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV44biarprint = (byte)(localUtil.ctol( httpContext.cgiGet( "vBIARPRINT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43Lhipro = (byte)(localUtil.ctol( httpContext.cgiGet( "vLHIPRO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42Recmaq = (byte)(localUtil.ctol( httpContext.cgiGet( "vRECMAQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV40Msg_control1 = httpContext.cgiGet( "vMSG_CONTROL1") ;
            AV41ctrlhdrsproceso = (byte)(localUtil.ctol( httpContext.cgiGet( "vCTRLHDRSPROCESO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3366MacKgs = localUtil.ctond( httpContext.cgiGet( "MACKGS")) ;
            A3367MacMts = localUtil.ctond( httpContext.cgiGet( "MACMTS")) ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvelop_confirmpanel_eliminarlinea_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Objectcall") ;
            Dvelop_confirmpanel_eliminarlinea_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Enabled")) ;
            Dvelop_confirmpanel_eliminarlinea_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Width") ;
            Dvelop_confirmpanel_eliminarlinea_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Height") ;
            Dvelop_confirmpanel_eliminarlinea_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Class") ;
            Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
            Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
            Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
            Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
            Dvelop_confirmpanel_eliminarlinea_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Comment") ;
            Dvelop_confirmpanel_eliminarlinea_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Bodytype") ;
            Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Bodycontentinternalname") ;
            Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
            Dvelop_confirmpanel_eliminarlinea_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Texttype") ;
            Dvelop_confirmpanel_eliminarlinea_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1199MacCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            }
            else
            {
               A1199MacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            }
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1200MacUltLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMacUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1200MacUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMACROS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A1199MacCod != Z1199MacCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidosclientesindetalle\\tmacros:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1199MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
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
                  sMode167 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode167 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound167 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_470( ) ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e13472 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e12472 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e14472 ();
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
         e14472 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll47167( ) ;
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
            httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
         }
         disableAttributes47167( ) ;
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

   public void confirm_470( )
   {
      beforeValidate47167( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls47167( ) ;
         }
         else
         {
            checkExtendedTable47167( ) ;
            closeExtendedTableCursors47167( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode167 = Gx_mode ;
         confirm_47168( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode167 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode167 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_47168( )
   {
      s1200MacUltLin = O1200MacUltLin ;
      n1200MacUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      s14266MacDatos = O14266MacDatos ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow47168( ) ;
         if ( ( nRcdExists_168 != 0 ) || ( nIsMod_168 != 0 ) )
         {
            getKey47168( ) ;
            if ( ( nRcdExists_168 == 0 ) && ( nRcdDeleted_168 == 0 ) )
            {
               if ( RcdFound168 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate47168( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable47168( ) ;
                     closeExtendedTableCursors47168( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1200MacUltLin = A1200MacUltLin ;
                     n1200MacUltLin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
                     O14266MacDatos = A14266MacDatos ;
                     n14266MacDatos = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "MACLIN_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMacLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound168 != 0 )
               {
                  if ( nRcdDeleted_168 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey47168( ) ;
                     load47168( ) ;
                     beforeValidate47168( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls47168( ) ;
                        O1200MacUltLin = A1200MacUltLin ;
                        n1200MacUltLin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
                        O14266MacDatos = A14266MacDatos ;
                        n14266MacDatos = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_168 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate47168( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable47168( ) ;
                           closeExtendedTableCursors47168( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1200MacUltLin = A1200MacUltLin ;
                           n1200MacUltLin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
                           O14266MacDatos = A14266MacDatos ;
                           n14266MacDatos = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_168 == 0 )
                  {
                     GXCCtl = "MACLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacBarPar_Internalname, GXutil.rtrim( A1205MacBarPar)) ;
         httpContext.changePostValue( edtMacDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacSitHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A14290MacSitHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1201MacLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1203MacBarCod_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1204MacBarReo_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1205MacBarPar_"+sGXsfl_28_idx, GXutil.rtrim( Z1205MacBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z1202MacDisCod_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3366MacKgs_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z3366MacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3367MacMts_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z3367MacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_168_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_168_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_168_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_168 != 0 )
         {
            httpContext.changePostValue( "MACLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACBARCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACBARREO_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACBARPAR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACDISCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacDisCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACSITHDR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacSitHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1200MacUltLin = s1200MacUltLin ;
      n1200MacUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      O14266MacDatos = s14266MacDatos ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      /* Start of After( level) rules */
      if ( ( A1199MacCod > 0 ) && true /* After */ && ( AV37NOAgrM == 0 ) )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A1199MacCod ;
         new app.pjl0000(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         tmacros_impl.this.A396EmprCod = GXv_char1[0] ;
         tmacros_impl.this.A1199MacCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption470( )
   {
   }

   public void e12472( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char3 = AV19Station ;
      GXv_char1[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
      tmacros_impl.this.GXt_char3 = GXv_char1[0] ;
      AV19Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Station, ""))));
      GXv_char1[0] = A396EmprCod ;
      GXv_char4[0] = AV18EmprNom ;
      GXv_char5[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char1, GXv_char4, GXv_char5) ;
      tmacros_impl.this.A396EmprCod = GXv_char1[0] ;
      tmacros_impl.this.AV18EmprNom = GXv_char4[0] ;
      tmacros_impl.this.AV16UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprNom", AV18EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16UsurCod, "@!"))));
      GXt_int6 = AV36NoBaragr ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOBARG", ""), GXv_int7) ;
      tmacros_impl.this.GXt_int6 = GXv_int7[0] ;
      AV36NoBaragr = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36NoBaragr", GXutil.str( AV36NoBaragr, 1, 0));
      GXt_int6 = AV37NOAgrM ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOAGRM", ""), GXv_int7) ;
      tmacros_impl.this.GXt_int6 = GXv_int7[0] ;
      AV37NOAgrM = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37NOAgrM", GXutil.str( AV37NOAgrM, 1, 0));
      GXt_int6 = AV39Indutexma ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int7) ;
      tmacros_impl.this.GXt_int6 = GXv_int7[0] ;
      AV39Indutexma = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Indutexma", GXutil.str( AV39Indutexma, 1, 0));
      GXt_int6 = AV41ctrlhdrsproceso ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CTHDPR", ""), GXv_int7) ;
      tmacros_impl.this.GXt_int6 = GXv_int7[0] ;
      AV41ctrlhdrsproceso = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41ctrlhdrsproceso", GXutil.str( AV41ctrlhdrsproceso, 1, 0));
      GXt_int6 = AV44biarprint ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BIARPR", ""), GXv_int7) ;
      tmacros_impl.this.GXt_int6 = GXv_int7[0] ;
      AV44biarprint = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44biarprint", GXutil.str( AV44biarprint, 1, 0));
      GXt_char3 = AV19Station ;
      GXv_char5[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      tmacros_impl.this.GXt_char3 = GXv_char5[0] ;
      AV19Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Station, ""))));
      GXv_char5[0] = AV28EmprCod ;
      GXv_char4[0] = AV18EmprNom ;
      GXv_char1[0] = AV16UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char5, GXv_char4, GXv_char1) ;
      tmacros_impl.this.AV28EmprCod = GXv_char5[0] ;
      tmacros_impl.this.AV18EmprNom = GXv_char4[0] ;
      tmacros_impl.this.AV16UsurCod = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV18EmprNom", AV18EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16UsurCod", AV16UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16UsurCod, "@!"))));
      GXv_SdtWWPContext8[0] = AV46WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV46WWPContext = GXv_SdtWWPContext8[0] ;
      AV47TrnContext.fromxml(AV48WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtMacUltLin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacUltLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacUltLin_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e14472( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      new app.pedidosclientesindetalle.controltablalmacro(remoteHandle, context).execute( AV28EmprCod, AV29MacCod, AV16UsurCod, AV19Station) ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV47TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.pedidosclientesindetalle.tmacrosww", new String[] {}, new String[] {}) );
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

   public void e13472( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(6);
            pr_default.close(5);
            pr_default.close(4);
            pr_default.close(2);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char5[0] = A396EmprCod ;
      GXv_int2[0] = A1199MacCod ;
      GXv_int9[0] = A1201MacLin ;
      GXv_int10[0] = A1203MacBarCod ;
      GXv_int7[0] = A1204MacBarReo ;
      GXv_char4[0] = A1205MacBarPar ;
      new app.pkilmacl(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_int9, GXv_int10, GXv_int7, GXv_char4) ;
      tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
      tmacros_impl.this.A1199MacCod = GXv_int2[0] ;
      tmacros_impl.this.A1201MacLin = GXv_int9[0] ;
      tmacros_impl.this.A1203MacBarCod = GXv_int10[0] ;
      tmacros_impl.this.A1204MacBarReo = GXv_int7[0] ;
      tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      callWebObject(formatLink("app.pedidosclientesindetalle.tmacros", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A1199MacCod,8,0))}, new String[] {"Mode","EmprCod","MacCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm47167( int GX_JID )
   {
      if ( ( GX_JID == 34 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1200MacUltLin = T00476_A1200MacUltLin[0] ;
         }
         else
         {
            Z1200MacUltLin = A1200MacUltLin ;
         }
      }
      if ( GX_JID == -34 )
      {
         Z1199MacCod = A1199MacCod ;
         Z1200MacUltLin = A1200MacUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z14266MacDatos = A14266MacDatos ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMacUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacUltLin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtMacUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacUltLin_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         A396EmprCod = AV28EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00477 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00477_A407EmprNom[0] ;
      n407EmprNom = T00477_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV28EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV29MacCod) )
      {
         A1199MacCod = AV29MacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
      if ( ! (0==AV29MacCod) )
      {
         edtMacCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMacCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV29MacCod) )
      {
         edtMacCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
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
         /* Using cursor T00479 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A14266MacDatos = T00479_A14266MacDatos[0] ;
            n14266MacDatos = T00479_n14266MacDatos[0] ;
         }
         else
         {
            A14266MacDatos = (short)(0) ;
            n14266MacDatos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         }
         O14266MacDatos = A14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         pr_default.close(6);
      }
   }

   public void load47167( )
   {
      /* Using cursor T004711 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound167 = (short)(1) ;
         A1200MacUltLin = T004711_A1200MacUltLin[0] ;
         n1200MacUltLin = T004711_n1200MacUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         A407EmprNom = T004711_A407EmprNom[0] ;
         n407EmprNom = T004711_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A14266MacDatos = T004711_A14266MacDatos[0] ;
         n14266MacDatos = T004711_n14266MacDatos[0] ;
         zm47167( -34) ;
      }
      pr_default.close(7);
      onLoadActions47167( ) ;
   }

   public void onLoadActions47167( )
   {
      O14266MacDatos = A14266MacDatos ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
   }

   public void checkExtendedTable47167( )
   {
      nIsDirty_167 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00479 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A14266MacDatos = T00479_A14266MacDatos[0] ;
         n14266MacDatos = T00479_n14266MacDatos[0] ;
      }
      else
      {
         nIsDirty_167 = (short)(1) ;
         A14266MacDatos = (short)(0) ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      pr_default.close(6);
   }

   public void closeExtendedTableCursors47167( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_36( String A396EmprCod ,
                          int A1199MacCod )
   {
      /* Using cursor T004713 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A14266MacDatos = T004713_A14266MacDatos[0] ;
         n14266MacDatos = T004713_n14266MacDatos[0] ;
      }
      else
      {
         A14266MacDatos = (short)(0) ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14266MacDatos, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey47167( )
   {
      /* Using cursor T004714 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound167 = (short)(1) ;
      }
      else
      {
         RcdFound167 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00476 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00476_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm47167( 34) ;
         RcdFound167 = (short)(1) ;
         A1199MacCod = T00476_A1199MacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         A1200MacUltLin = T00476_A1200MacUltLin[0] ;
         n1200MacUltLin = T00476_n1200MacUltLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         O1200MacUltLin = A1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z1199MacCod = A1199MacCod ;
         sMode167 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load47167( ) ;
         if ( AnyError == 1 )
         {
            RcdFound167 = (short)(0) ;
            initializeNonKey47167( ) ;
         }
         Gx_mode = sMode167 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound167 = (short)(0) ;
         initializeNonKey47167( ) ;
         sMode167 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode167 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey47167( ) ;
      if ( RcdFound167 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound167 = (short)(0) ;
      /* Using cursor T004715 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A1199MacCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T004715_A1199MacCod[0] < A1199MacCod ) ) && ( GXutil.strcmp(T004715_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T004715_A1199MacCod[0] > A1199MacCod ) ) && ( GXutil.strcmp(T004715_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1199MacCod = T004715_A1199MacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            RcdFound167 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound167 = (short)(0) ;
      /* Using cursor T004716 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A1199MacCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T004716_A1199MacCod[0] > A1199MacCod ) ) && ( GXutil.strcmp(T004716_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T004716_A1199MacCod[0] < A1199MacCod ) ) && ( GXutil.strcmp(T004716_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1199MacCod = T004716_A1199MacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            RcdFound167 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey47167( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1200MacUltLin = O1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         A14266MacDatos = O14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         GX_FocusControl = edtMacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert47167( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound167 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1199MacCod != Z1199MacCod ) )
            {
               A1199MacCod = Z1199MacCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A1200MacUltLin = O1200MacUltLin ;
               n1200MacUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
               A14266MacDatos = O14266MacDatos ;
               n14266MacDatos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A1200MacUltLin = O1200MacUltLin ;
               n1200MacUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
               A14266MacDatos = O14266MacDatos ;
               n14266MacDatos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
               update47167( ) ;
               GX_FocusControl = edtMacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1199MacCod != Z1199MacCod ) )
            {
               /* Insert record */
               A1200MacUltLin = O1200MacUltLin ;
               n1200MacUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
               A14266MacDatos = O14266MacDatos ;
               n14266MacDatos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
               GX_FocusControl = edtMacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert47167( ) ;
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
                  A1200MacUltLin = O1200MacUltLin ;
                  n1200MacUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
                  A14266MacDatos = O14266MacDatos ;
                  n14266MacDatos = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
                  GX_FocusControl = edtMacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert47167( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1199MacCod != Z1199MacCod ) )
      {
         A1199MacCod = Z1199MacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A1200MacUltLin = O1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         A14266MacDatos = O14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency47167( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00475 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMACRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z1200MacUltLin != T00475_A1200MacUltLin[0] ) )
         {
            if ( Z1200MacUltLin != T00475_A1200MacUltLin[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacUltLin");
               GXutil.writeLogRaw("Old: ",Z1200MacUltLin);
               GXutil.writeLogRaw("Current: ",T00475_A1200MacUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCMACRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert47167( )
   {
      beforeValidate47167( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable47167( ) ;
      }
      if ( AnyError == 0 )
      {
         zm47167( 0) ;
         checkOptimisticConcurrency47167( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm47167( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert47167( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004717 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A1199MacCod), Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
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
                        processLevel47167( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption470( ) ;
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
            load47167( ) ;
         }
         endLevel47167( ) ;
      }
      closeExtendedTableCursors47167( ) ;
   }

   public void update47167( )
   {
      beforeValidate47167( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable47167( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency47167( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm47167( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate47167( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004718 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin), A396EmprCod, Integer.valueOf(A1199MacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCMACRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate47167( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel47167( ) ;
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
         endLevel47167( ) ;
      }
      closeExtendedTableCursors47167( ) ;
   }

   public void deferredUpdate47167( )
   {
   }

   public void delete( )
   {
      beforeValidate47167( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency47167( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls47167( ) ;
         afterConfirm47167( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete47167( ) ;
            if ( AnyError == 0 )
            {
               A1200MacUltLin = O1200MacUltLin ;
               n1200MacUltLin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
               A14266MacDatos = O14266MacDatos ;
               n14266MacDatos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
               scanStart47168( ) ;
               while ( RcdFound168 != 0 )
               {
                  getByPrimaryKey47168( ) ;
                  delete47168( ) ;
                  scanNext47168( ) ;
                  O1200MacUltLin = A1200MacUltLin ;
                  n1200MacUltLin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
                  O14266MacDatos = A14266MacDatos ;
                  n14266MacDatos = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
               }
               scanEnd47168( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004719 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
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
      sMode167 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel47167( ) ;
      Gx_mode = sMode167 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls47167( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T004721 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A14266MacDatos = T004721_A14266MacDatos[0] ;
            n14266MacDatos = T004721_n14266MacDatos[0] ;
         }
         else
         {
            A14266MacDatos = (short)(0) ;
            n14266MacDatos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel47168( )
   {
      s1200MacUltLin = O1200MacUltLin ;
      n1200MacUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      s14266MacDatos = O14266MacDatos ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow47168( ) ;
         if ( ( nRcdExists_168 != 0 ) || ( nIsMod_168 != 0 ) )
         {
            standaloneNotModal47168( ) ;
            getKey47168( ) ;
            if ( ( nRcdExists_168 == 0 ) && ( nRcdDeleted_168 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert47168( ) ;
            }
            else
            {
               if ( RcdFound168 != 0 )
               {
                  if ( ( nRcdDeleted_168 != 0 ) && ( nRcdExists_168 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete47168( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_168 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update47168( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_168 == 0 )
                  {
                     GXCCtl = "MACLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMacLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1200MacUltLin = A1200MacUltLin ;
            n1200MacUltLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
            O14266MacDatos = A14266MacDatos ;
            n14266MacDatos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         }
         httpContext.changePostValue( edtMacLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacBarPar_Internalname, GXutil.rtrim( A1205MacBarPar)) ;
         httpContext.changePostValue( edtMacDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMacSitHdr_Internalname, GXutil.ltrim( localUtil.ntoc( A14290MacSitHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1201MacLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1203MacBarCod_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1204MacBarReo_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1205MacBarPar_"+sGXsfl_28_idx, GXutil.rtrim( Z1205MacBarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z1202MacDisCod_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3366MacKgs_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z3366MacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3367MacMts_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z3367MacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_168_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_168_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_168_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_168 != 0 )
         {
            httpContext.changePostValue( "MACLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACBARCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACBARREO_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACBARPAR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACDISCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacDisCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MACSITHDR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacSitHdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      if ( ( A1199MacCod > 0 ) && true /* After */ && ( AV37NOAgrM == 0 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         new app.pjl0000(remoteHandle, context).execute( GXv_char5, GXv_int10) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
      /* End of After( level) rules */
      initAll47168( ) ;
      if ( AnyError != 0 )
      {
         O1200MacUltLin = s1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         O14266MacDatos = s14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      nRcdExists_168 = (short)(0) ;
      nIsMod_168 = (short)(0) ;
      nRcdDeleted_168 = (short)(0) ;
   }

   public void processLevel47167( )
   {
      /* Save parent mode. */
      sMode167 = Gx_mode ;
      processNestedLevel47168( ) ;
      if ( AnyError != 0 )
      {
         O1200MacUltLin = s1200MacUltLin ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
         O14266MacDatos = s14266MacDatos ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode167 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T004722 */
      pr_default.execute(16, new Object[] {Boolean.valueOf(n1200MacUltLin), Short.valueOf(A1200MacUltLin), A396EmprCod, Integer.valueOf(A1199MacCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACRO");
   }

   public void endLevel47167( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete47167( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.tmacros");
         if ( AnyError == 0 )
         {
            confirmValues470( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidosclientesindetalle.tmacros");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart47167( )
   {
      /* Scan By routine */
      /* Using cursor T004723 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound167 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound167 = (short)(1) ;
         A1199MacCod = T004723_A1199MacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext47167( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound167 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound167 = (short)(1) ;
         A1199MacCod = T004723_A1199MacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
   }

   public void scanEnd47167( )
   {
      pr_default.close(17);
   }

   public void afterConfirm47167( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert47167( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate47167( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete47167( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete47167( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate47167( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes47167( )
   {
      edtMacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMacUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacUltLin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm47168( int GX_JID )
   {
      if ( ( GX_JID == 37 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1203MacBarCod = T00473_A1203MacBarCod[0] ;
            Z1204MacBarReo = T00473_A1204MacBarReo[0] ;
            Z1205MacBarPar = T00473_A1205MacBarPar[0] ;
            Z1202MacDisCod = T00473_A1202MacDisCod[0] ;
            Z3366MacKgs = T00473_A3366MacKgs[0] ;
            Z3367MacMts = T00473_A3367MacMts[0] ;
         }
         else
         {
            Z1203MacBarCod = A1203MacBarCod ;
            Z1204MacBarReo = A1204MacBarReo ;
            Z1205MacBarPar = A1205MacBarPar ;
            Z1202MacDisCod = A1202MacDisCod ;
            Z3366MacKgs = A3366MacKgs ;
            Z3367MacMts = A3367MacMts ;
         }
      }
      if ( GX_JID == -37 )
      {
         Z396EmprCod = A396EmprCod ;
         Z1199MacCod = A1199MacCod ;
         Z1201MacLin = A1201MacLin ;
         Z1203MacBarCod = A1203MacBarCod ;
         Z1204MacBarReo = A1204MacBarReo ;
         Z1205MacBarPar = A1205MacBarPar ;
         Z1202MacDisCod = A1202MacDisCod ;
         Z3366MacKgs = A3366MacKgs ;
         Z3367MacMts = A3367MacMts ;
         Z14290MacSitHdr = A14290MacSitHdr ;
      }
   }

   public void standaloneNotModal47168( )
   {
      edtMacDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacDisCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtMacBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtMacBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtMacBarPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtMacBarPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtMacBarReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtMacBarReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      edtMacUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacUltLin_Enabled), 5, 0), true);
      edtMacUltLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacUltLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacUltLin_Enabled), 5, 0), true);
   }

   public void standaloneModal47168( )
   {
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isIns( )  )
      {
         A1200MacUltLin = (short)(O1200MacUltLin+1) ;
         n1200MacUltLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1201MacLin = A1200MacUltLin ;
      }
      if ( isIns( )  )
      {
         A14266MacDatos = (short)(O14266MacDatos+1) ;
         n14266MacDatos = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A14266MacDatos = O14266MacDatos ;
            n14266MacDatos = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A14266MacDatos = (short)(O14266MacDatos-1) ;
               n14266MacDatos = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMacLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtMacLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void load47168( )
   {
      /* Using cursor T004724 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound168 = (short)(1) ;
         A1203MacBarCod = T004724_A1203MacBarCod[0] ;
         A1204MacBarReo = T004724_A1204MacBarReo[0] ;
         A1205MacBarPar = T004724_A1205MacBarPar[0] ;
         A1202MacDisCod = T004724_A1202MacDisCod[0] ;
         A3366MacKgs = T004724_A3366MacKgs[0] ;
         A3367MacMts = T004724_A3367MacMts[0] ;
         A14290MacSitHdr = T004724_A14290MacSitHdr[0] ;
         n14290MacSitHdr = T004724_n14290MacSitHdr[0] ;
         zm47168( -37) ;
      }
      pr_default.close(18);
      onLoadActions47168( ) ;
   }

   public void onLoadActions47168( )
   {
      A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
   }

   public void checkExtendedTable47168( )
   {
      nIsDirty_168 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal47168( ) ;
      /* Using cursor T00474 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A14290MacSitHdr = T00474_A14290MacSitHdr[0] ;
         n14290MacSitHdr = T00474_n14290MacSitHdr[0] ;
      }
      else
      {
         nIsDirty_168 = (short)(1) ;
         A14290MacSitHdr = (short)(0) ;
         n14290MacSitHdr = false ;
      }
      pr_default.close(2);
      nIsDirty_168 = (short)(1) ;
      A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1203MacBarCod ;
         GXv_int7[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int2[0] = A1202MacDisCod ;
         GXv_int11[0] = AV30Err_hdr ;
         new app.putil24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int7, GXv_char4, GXv_int2, GXv_int11) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         tmacros_impl.this.A1203MacBarCod = GXv_int10[0] ;
         tmacros_impl.this.A1204MacBarReo = GXv_int7[0] ;
         tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
         tmacros_impl.this.A1202MacDisCod = GXv_int2[0] ;
         tmacros_impl.this.AV30Err_hdr = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV36NoBaragr == 0 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_int2[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int7[0] = AV33Err_l ;
         GXv_char1[0] = AV34Msgl ;
         new app.pmacagr(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7, GXv_char1) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         tmacros_impl.this.A1203MacBarCod = GXv_int2[0] ;
         tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
         tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
         tmacros_impl.this.AV33Err_l = GXv_int7[0] ;
         tmacros_impl.this.AV34Msgl = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_int2[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int7[0] = AV35Err_le ;
         new app.pmachde(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         tmacros_impl.this.A1203MacBarCod = GXv_int2[0] ;
         tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
         tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
         tmacros_impl.this.AV35Err_le = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41ctrlhdrsproceso == 1 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_char4[0] = AV40Msg_control1 ;
         GXv_int11[0] = AV42Recmaq ;
         GXv_int7[0] = AV43Lhipro ;
         new app.pprc24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_char4, GXv_int11, GXv_int7) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         tmacros_impl.this.AV40Msg_control1 = GXv_char4[0] ;
         tmacros_impl.this.AV42Recmaq = GXv_int11[0] ;
         tmacros_impl.this.AV43Lhipro = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_control1", AV40Msg_control1);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Recmaq", GXutil.str( AV42Recmaq, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43Lhipro", GXutil.str( AV43Lhipro, 1, 0));
      }
      if ( true /* Level */ && true /* After */ && ( AV33Err_l == 1 ) )
      {
         GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(AV34Msgl, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( AV30Err_hdr == 0 ) )
      {
         GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº HDR", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && true /* After */ && ( AV35Err_le == 1 ) )
      {
         GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ya existe esa linea", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 1 ) )
      {
         GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(AV40Msg_control1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 0 ) && ( AV43Lhipro == 1 ) && ( AV41ctrlhdrsproceso == 1 ) )
      {
         GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(AV40Msg_control1, 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 0 ) && ( AV43Lhipro == 1 ) && ( AV41ctrlhdrsproceso == 0 ) )
      {
         GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(AV40Msg_control1, 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursors47168( )
   {
      pr_default.close(2);
   }

   public void enableDisable47168( )
   {
   }

   public void gxload_38( String A396EmprCod ,
                          int A1203MacBarCod ,
                          byte A1204MacBarReo ,
                          String A1205MacBarPar )
   {
      /* Using cursor T004725 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A14290MacSitHdr = T004725_A14290MacSitHdr[0] ;
         n14290MacSitHdr = T004725_n14290MacSitHdr[0] ;
      }
      else
      {
         A14290MacSitHdr = (short)(0) ;
         n14290MacSitHdr = false ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14290MacSitHdr, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey47168( )
   {
      /* Using cursor T004726 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound168 = (short)(1) ;
      }
      else
      {
         RcdFound168 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey47168( )
   {
      /* Using cursor T00473 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00473_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm47168( 37) ;
         RcdFound168 = (short)(1) ;
         initializeNonKey47168( ) ;
         A1201MacLin = T00473_A1201MacLin[0] ;
         A1203MacBarCod = T00473_A1203MacBarCod[0] ;
         A1204MacBarReo = T00473_A1204MacBarReo[0] ;
         A1205MacBarPar = T00473_A1205MacBarPar[0] ;
         A1202MacDisCod = T00473_A1202MacDisCod[0] ;
         A3366MacKgs = T00473_A3366MacKgs[0] ;
         A3367MacMts = T00473_A3367MacMts[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1199MacCod = A1199MacCod ;
         Z1201MacLin = A1201MacLin ;
         sMode168 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load47168( ) ;
         Gx_mode = sMode168 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound168 = (short)(0) ;
         initializeNonKey47168( ) ;
         sMode168 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal47168( ) ;
         Gx_mode = sMode168 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes47168( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency47168( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00472 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1203MacBarCod != T00472_A1203MacBarCod[0] ) || ( Z1204MacBarReo != T00472_A1204MacBarReo[0] ) || ( GXutil.strcmp(Z1205MacBarPar, T00472_A1205MacBarPar[0]) != 0 ) || ( Z1202MacDisCod != T00472_A1202MacDisCod[0] ) || ( DecimalUtil.compareTo(Z3366MacKgs, T00472_A3366MacKgs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3367MacMts, T00472_A3367MacMts[0]) != 0 ) )
         {
            if ( Z1203MacBarCod != T00472_A1203MacBarCod[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacBarCod");
               GXutil.writeLogRaw("Old: ",Z1203MacBarCod);
               GXutil.writeLogRaw("Current: ",T00472_A1203MacBarCod[0]);
            }
            if ( Z1204MacBarReo != T00472_A1204MacBarReo[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacBarReo");
               GXutil.writeLogRaw("Old: ",Z1204MacBarReo);
               GXutil.writeLogRaw("Current: ",T00472_A1204MacBarReo[0]);
            }
            if ( GXutil.strcmp(Z1205MacBarPar, T00472_A1205MacBarPar[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacBarPar");
               GXutil.writeLogRaw("Old: ",Z1205MacBarPar);
               GXutil.writeLogRaw("Current: ",T00472_A1205MacBarPar[0]);
            }
            if ( Z1202MacDisCod != T00472_A1202MacDisCod[0] )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacDisCod");
               GXutil.writeLogRaw("Old: ",Z1202MacDisCod);
               GXutil.writeLogRaw("Current: ",T00472_A1202MacDisCod[0]);
            }
            if ( DecimalUtil.compareTo(Z3366MacKgs, T00472_A3366MacKgs[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacKgs");
               GXutil.writeLogRaw("Old: ",Z3366MacKgs);
               GXutil.writeLogRaw("Current: ",T00472_A3366MacKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z3367MacMts, T00472_A3367MacMts[0]) != 0 )
            {
               GXutil.writeLogln("pedidosclientesindetalle.tmacros:[seudo value changed for attri]"+"MacMts");
               GXutil.writeLogRaw("Old: ",Z3367MacMts);
               GXutil.writeLogRaw("Current: ",T00472_A3367MacMts[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMACRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert47168( )
   {
      beforeValidate47168( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable47168( ) ;
      }
      if ( AnyError == 0 )
      {
         zm47168( 0) ;
         checkOptimisticConcurrency47168( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm47168( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert47168( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T004727 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin), Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar, Integer.valueOf(A1202MacDisCod), A3366MacKgs, A3367MacMts});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
                  if ( (pr_default.getStatus(21) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( ( ( AV39Indutexma == 1 ) || ( AV44biarprint == 1 ) ) && true /* After */ )
                     {
                        GXv_char5[0] = A396EmprCod ;
                        GXv_int10[0] = A1203MacBarCod ;
                        GXv_int11[0] = A1204MacBarReo ;
                        GXv_char4[0] = A1205MacBarPar ;
                        GXv_int2[0] = A1199MacCod ;
                        new app.ppdahdrv(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int2) ;
                        tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
                        tmacros_impl.this.A1203MacBarCod = GXv_int10[0] ;
                        tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
                        tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
                        tmacros_impl.this.A1199MacCod = GXv_int2[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
                     }
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
            load47168( ) ;
         }
         endLevel47168( ) ;
      }
      closeExtendedTableCursors47168( ) ;
   }

   public void update47168( )
   {
      beforeValidate47168( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable47168( ) ;
      }
      if ( ( nIsMod_168 != 0 ) || ( nIsDirty_168 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency47168( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm47168( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate47168( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T004728 */
                     pr_default.execute(22, new Object[] {Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar, Integer.valueOf(A1202MacDisCod), A3366MacKgs, A3367MacMts, A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
                     if ( (pr_default.getStatus(22) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMACRO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate47168( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey47168( ) ;
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
            endLevel47168( ) ;
         }
      }
      closeExtendedTableCursors47168( ) ;
   }

   public void deferredUpdate47168( )
   {
   }

   public void delete47168( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate47168( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency47168( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls47168( ) ;
         afterConfirm47168( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete47168( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T004729 */
               pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod), Short.valueOf(A1201MacLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACRO");
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
      sMode168 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel47168( ) ;
      Gx_mode = sMode168 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls47168( )
   {
      standaloneModal47168( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && true /* After */ && isIns( )  && ( AV36NoBaragr == 0 ) )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int10[0] = A1199MacCod ;
            GXv_int2[0] = A1203MacBarCod ;
            GXv_int11[0] = A1204MacBarReo ;
            GXv_char4[0] = A1205MacBarPar ;
            GXv_int7[0] = AV33Err_l ;
            GXv_char1[0] = AV34Msgl ;
            new app.pmacagr(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7, GXv_char1) ;
            tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
            tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
            tmacros_impl.this.A1203MacBarCod = GXv_int2[0] ;
            tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
            tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
            tmacros_impl.this.AV33Err_l = GXv_int7[0] ;
            tmacros_impl.this.AV34Msgl = GXv_char1[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
         }
         if ( true /* Level */ && true /* After */ && isIns( )  )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int10[0] = A1199MacCod ;
            GXv_int2[0] = A1203MacBarCod ;
            GXv_int11[0] = A1204MacBarReo ;
            GXv_char4[0] = A1205MacBarPar ;
            GXv_int7[0] = AV35Err_le ;
            new app.pmachde(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7) ;
            tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
            tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
            tmacros_impl.this.A1203MacBarCod = GXv_int2[0] ;
            tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
            tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
            tmacros_impl.this.AV35Err_le = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
         }
         if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41ctrlhdrsproceso == 1 ) )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_int10[0] = A1199MacCod ;
            GXv_char4[0] = AV40Msg_control1 ;
            GXv_int11[0] = AV42Recmaq ;
            GXv_int7[0] = AV43Lhipro ;
            new app.pprc24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_char4, GXv_int11, GXv_int7) ;
            tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
            tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
            tmacros_impl.this.AV40Msg_control1 = GXv_char4[0] ;
            tmacros_impl.this.AV42Recmaq = GXv_int11[0] ;
            tmacros_impl.this.AV43Lhipro = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_control1", AV40Msg_control1);
            httpContext.ajax_rsp_assign_attri("", false, "AV42Recmaq", GXutil.str( AV42Recmaq, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV43Lhipro", GXutil.str( AV43Lhipro, 1, 0));
         }
         if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 1 ) )
         {
            GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
            httpContext.GX_msglist.addItem(AV40Msg_control1, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacBarPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 0 ) && ( AV43Lhipro == 1 ) && ( AV41ctrlhdrsproceso == 1 ) )
         {
            GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
            httpContext.GX_msglist.addItem(AV40Msg_control1, 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtMacBarPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 0 ) && ( AV43Lhipro == 1 ) && ( AV41ctrlhdrsproceso == 0 ) )
         {
            GXCCtl = "MACBARPAR_" + sGXsfl_28_idx ;
            httpContext.GX_msglist.addItem(AV40Msg_control1, 0, GXCCtl);
         }
         /* Using cursor T004730 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            A14290MacSitHdr = T004730_A14290MacSitHdr[0] ;
            n14290MacSitHdr = T004730_n14290MacSitHdr[0] ;
         }
         else
         {
            A14290MacSitHdr = (short)(0) ;
            n14290MacSitHdr = false ;
         }
         pr_default.close(24);
         A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
      }
   }

   public void endLevel47168( )
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

   public void scanStart47168( )
   {
      /* Scan By routine */
      /* Using cursor T004731 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      RcdFound168 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound168 = (short)(1) ;
         A1201MacLin = T004731_A1201MacLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext47168( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound168 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound168 = (short)(1) ;
         A1201MacLin = T004731_A1201MacLin[0] ;
      }
   }

   public void scanEnd47168( )
   {
      pr_default.close(25);
   }

   public void afterConfirm47168( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert47168( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate47168( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete47168( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete47168( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate47168( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes47168( )
   {
      edtMacLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacDisCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacSitHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacSitHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacSitHdr_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashes47168( )
   {
   }

   public void send_integrity_lvl_hashes47167( )
   {
   }

   public void subsflControlProps_28168( )
   {
      edtMacLin_Internalname = "MACLIN_"+sGXsfl_28_idx ;
      edtMacBarCod_Internalname = "MACBARCOD_"+sGXsfl_28_idx ;
      edtMacBarReo_Internalname = "MACBARREO_"+sGXsfl_28_idx ;
      edtMacBarPar_Internalname = "MACBARPAR_"+sGXsfl_28_idx ;
      imgprompt_1203_1204_1205_Internalname = "PROMPT_1203_1204_1205_"+sGXsfl_28_idx ;
      edtMacDisCod_Internalname = "MACDISCOD_"+sGXsfl_28_idx ;
      edtMacSitHdr_Internalname = "MACSITHDR_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_28168( )
   {
      edtMacLin_Internalname = "MACLIN_"+sGXsfl_28_fel_idx ;
      edtMacBarCod_Internalname = "MACBARCOD_"+sGXsfl_28_fel_idx ;
      edtMacBarReo_Internalname = "MACBARREO_"+sGXsfl_28_fel_idx ;
      edtMacBarPar_Internalname = "MACBARPAR_"+sGXsfl_28_fel_idx ;
      imgprompt_1203_1204_1205_Internalname = "PROMPT_1203_1204_1205_"+sGXsfl_28_fel_idx ;
      edtMacDisCod_Internalname = "MACDISCOD_"+sGXsfl_28_fel_idx ;
      edtMacSitHdr_Internalname = "MACSITHDR_"+sGXsfl_28_fel_idx ;
   }

   public void addRow47168( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28168( ) ;
      sendRow47168( ) ;
   }

   public void sendRow47168( )
   {
      Gridlevel_level1Row = GXWebRow.GetNew(context) ;
      if ( subGridlevel_level1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(0) ;
         subGridlevel_level1_Backcolor = subGridlevel_level1_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_level1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
         {
            subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
         }
         subGridlevel_level1_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_level1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_level1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_level1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_level1_Class, "") != 0 )
            {
               subGridlevel_level1_Linesclass = subGridlevel_level1_Class+"Odd" ;
            }
         }
      }
      imgprompt_1203_1204_1205_Link = ((GXutil.strcmp(Gx_mode, "DSP")==0) ? "" : "javascript:"+"gx.popup.openPrompt('"+"app.seleccionhdrprompt"+"',["+"{Ctrl:gx.dom.el('"+"EMPRCOD"+"'), id:'"+"EMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"MACBARCOD_"+sGXsfl_28_idx+"'), id:'"+"MACBARCOD_"+sGXsfl_28_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"MACBARREO_"+sGXsfl_28_idx+"'), id:'"+"MACBARREO_"+sGXsfl_28_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"MACBARPAR_"+sGXsfl_28_idx+"'), id:'"+"MACBARPAR_"+sGXsfl_28_idx+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"0"+"'), id:'"+"0"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"6"+"'), id:'"+"6"+"'"+",IOType:'inout'}"+"],"+"gx.dom.form()."+"nIsMod_168_"+sGXsfl_28_idx+","+"'', false"+","+"false"+");") ;
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_168_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1201MacLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn ColumnAlignCenter ColumnAlignCenter","",Integer.valueOf(-1),Integer.valueOf(edtMacLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_168_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1203MacBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn ColumnAlignCenter ColumnAlignCenter","",Integer.valueOf(-1),Integer.valueOf(edtMacBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_168_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1204MacBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMacBarReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_168_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacBarPar_Internalname,GXutil.rtrim( A1205MacBarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMacBarPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Static images/pictures */
      ClassString = "gx-prompt Image" + " " + ((GXutil.strcmp(imgprompt_1203_1204_1205_gximage, "")==0) ? "" : "GX_Image_"+imgprompt_1203_1204_1205_gximage+"_Class") ;
      StyleString = "" ;
      sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      Gridlevel_level1Row.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {imgprompt_1203_1204_1205_Internalname,sImgUrl,imgprompt_1203_1204_1205_Link,"","",context.getHttpContext().getTheme( ),Integer.valueOf(imgprompt_1203_1204_1205_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(0),"",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"","",StyleString,ClassString,"","","","","","","",Integer.valueOf(1),Boolean.valueOf(false),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1202MacDisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1202MacDisCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMacDisCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMacSitHdr_Internalname,GXutil.ltrim( localUtil.ntoc( A14290MacSitHdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMacSitHdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14290MacSitHdr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14290MacSitHdr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMacSitHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMacSitHdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes47168( ) ;
      GXCCtl = "Z1201MacLin_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1201MacLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1203MacBarCod_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1203MacBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1204MacBarReo_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1204MacBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1205MacBarPar_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1205MacBarPar));
      GXCCtl = "Z1202MacDisCod_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3366MacKgs_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3366MacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3367MacMts_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3367MacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_168_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_168_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_168_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_168, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV28EmprCod));
      GXCCtl = "vMACCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV29MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV16UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV19Station));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_28_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV47TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV47TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "MACLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACBARCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACBARREO_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACBARPAR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACDISCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacDisCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACSITHDR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMacSitHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMPT_1203_1204_1205_"+sGXsfl_28_idx+"Link", GXutil.rtrim( imgprompt_1203_1204_1205_Link));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow47168( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28168( ) ;
      edtMacLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACBARCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacBarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACBARREO_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacBarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACBARPAR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacDisCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACDISCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMacSitHdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MACSITHDR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      imgprompt_1203_1204_1205_Link = httpContext.cgiGet( "PROMPT_1203_1204_1205_"+sGXsfl_28_idx+"Link") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MACLIN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacLin_Internalname ;
         wbErr = true ;
         A1201MacLin = (short)(0) ;
      }
      else
      {
         A1201MacLin = (short)(localUtil.ctol( httpContext.cgiGet( edtMacLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MACBARCOD_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarCod_Internalname ;
         wbErr = true ;
         A1203MacBarCod = 0 ;
      }
      else
      {
         A1203MacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMacBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "MACBARREO_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarReo_Internalname ;
         wbErr = true ;
         A1204MacBarReo = (byte)(0) ;
      }
      else
      {
         A1204MacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtMacBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1205MacBarPar = httpContext.cgiGet( edtMacBarPar_Internalname) ;
      A1202MacDisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMacDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A14290MacSitHdr = (short)(localUtil.ctol( httpContext.cgiGet( edtMacSitHdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n14290MacSitHdr = false ;
      GXCCtl = "Z1201MacLin_" + sGXsfl_28_idx ;
      Z1201MacLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1203MacBarCod_" + sGXsfl_28_idx ;
      Z1203MacBarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1204MacBarReo_" + sGXsfl_28_idx ;
      Z1204MacBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1205MacBarPar_" + sGXsfl_28_idx ;
      Z1205MacBarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1202MacDisCod_" + sGXsfl_28_idx ;
      Z1202MacDisCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3366MacKgs_" + sGXsfl_28_idx ;
      Z3366MacKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3367MacMts_" + sGXsfl_28_idx ;
      Z3367MacMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3366MacKgs_" + sGXsfl_28_idx ;
      A3366MacKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3367MacMts_" + sGXsfl_28_idx ;
      A3367MacMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_168_" + sGXsfl_28_idx ;
      nRcdDeleted_168 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_168_" + sGXsfl_28_idx ;
      nRcdExists_168 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_168_" + sGXsfl_28_idx ;
      nIsMod_168 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMacDisCod_Enabled = edtMacDisCod_Enabled ;
      defedtMacBarPar_Enabled = edtMacBarPar_Enabled ;
      defedtMacBarReo_Enabled = edtMacBarReo_Enabled ;
      defedtMacBarCod_Enabled = edtMacBarCod_Enabled ;
      defedtMacLin_Enabled = edtMacLin_Enabled ;
   }

   public void confirmValues470( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28168( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28168( ) ;
         httpContext.changePostValue( "Z1201MacLin_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z1201MacLin_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1201MacLin_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z1203MacBarCod_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z1203MacBarCod_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1203MacBarCod_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z1204MacBarReo_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z1204MacBarReo_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1204MacBarReo_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z1205MacBarPar_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z1205MacBarPar_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1205MacBarPar_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z1202MacDisCod_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z1202MacDisCod_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1202MacDisCod_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z3366MacKgs_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z3366MacKgs_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3366MacKgs_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z3367MacMts_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z3367MacMts_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3367MacMts_"+sGXsfl_28_idx) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.tmacros", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29MacCod,8,0))}, new String[] {"Gx_mode","EmprCod","MacCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMACROS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\tmacros:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1199MacCod", GXutil.ltrim( localUtil.ntoc( Z1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1200MacUltLin", GXutil.ltrim( localUtil.ntoc( Z1200MacUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1200MacUltLin", GXutil.ltrim( localUtil.ntoc( O1200MacUltLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O14266MacDatos", GXutil.ltrim( localUtil.ntoc( O14266MacDatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV16UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV19Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV47TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV47TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV47TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV28EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACCOD", GXutil.ltrim( localUtil.ntoc( AV29MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29MacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACDATOS", GXutil.ltrim( localUtil.ntoc( A14266MacDatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACHDR", GXutil.rtrim( A13714MacHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_HDR", GXutil.ltrim( localUtil.ntoc( AV30Err_hdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOAGRM", GXutil.ltrim( localUtil.ntoc( AV37NOAgrM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGL", GXutil.rtrim( AV34Msgl));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_L", GXutil.ltrim( localUtil.ntoc( AV33Err_l, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_LE", GXutil.ltrim( localUtil.ntoc( AV35Err_le, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINDUTEXMA", GXutil.ltrim( localUtil.ntoc( AV39Indutexma, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBIARPRINT", GXutil.ltrim( localUtil.ntoc( AV44biarprint, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLHIPRO", GXutil.ltrim( localUtil.ntoc( AV43Lhipro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECMAQ", GXutil.ltrim( localUtil.ntoc( AV42Recmaq, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CONTROL1", GXutil.rtrim( AV40Msg_control1));
      app.GxWebStd.gx_hidden_field( httpContext, "vCTRLHDRSPROCESO", GXutil.ltrim( localUtil.ntoc( AV41ctrlhdrsproceso, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACKGS", GXutil.ltrim( localUtil.ntoc( A3366MacKgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACMTS", GXutil.ltrim( localUtil.ntoc( A3367MacMts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Enabled", GXutil.booltostr( Dvelop_confirmpanel_eliminarlinea_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
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
      return formatLink("app.pedidosclientesindetalle.tmacros", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29MacCod,8,0))}, new String[] {"Gx_mode","EmprCod","MacCod"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.TMACROS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Accesorios", "") ;
   }

   public void initializeNonKey47167( )
   {
      A1200MacUltLin = (short)(0) ;
      n1200MacUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      A14266MacDatos = (short)(0) ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      O1200MacUltLin = A1200MacUltLin ;
      n1200MacUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      O14266MacDatos = A14266MacDatos ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
      Z1200MacUltLin = (short)(0) ;
   }

   public void initAll47167( )
   {
      A1199MacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      initializeNonKey47167( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey47168( )
   {
      AV30Err_hdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
      AV34Msgl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
      AV33Err_l = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
      AV35Err_le = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
      AV43Lhipro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lhipro", GXutil.str( AV43Lhipro, 1, 0));
      AV42Recmaq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Recmaq", GXutil.str( AV42Recmaq, 1, 0));
      AV40Msg_control1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_control1", AV40Msg_control1);
      A13714MacHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", A13714MacHdr);
      A14290MacSitHdr = (short)(0) ;
      n14290MacSitHdr = false ;
      A1203MacBarCod = 0 ;
      A1204MacBarReo = (byte)(0) ;
      A1205MacBarPar = "" ;
      A1202MacDisCod = 0 ;
      A3366MacKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3366MacKgs", GXutil.ltrimstr( A3366MacKgs, 9, 2));
      A3367MacMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3367MacMts", GXutil.ltrimstr( A3367MacMts, 9, 2));
      Z1203MacBarCod = 0 ;
      Z1204MacBarReo = (byte)(0) ;
      Z1205MacBarPar = "" ;
      Z1202MacDisCod = 0 ;
      Z3366MacKgs = DecimalUtil.ZERO ;
      Z3367MacMts = DecimalUtil.ZERO ;
   }

   public void initAll47168( )
   {
      A1201MacLin = (short)(0) ;
      initializeNonKey47168( ) ;
   }

   public void standaloneModalInsert47168( )
   {
      A1200MacUltLin = i1200MacUltLin ;
      n1200MacUltLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1200MacUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1200MacUltLin), 3, 0));
      A14266MacDatos = i14266MacDatos ;
      n14266MacDatos = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14266MacDatos), 4, 0));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241504974", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/tmacros.js", "?20268241504974", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties168( )
   {
      edtMacDisCod_Enabled = defedtMacDisCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacDisCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacBarPar_Enabled = defedtMacBarPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacBarReo_Enabled = defedtMacBarReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacBarCod_Enabled = defedtMacBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacBarCod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMacLin_Enabled = defedtMacLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMacLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMacLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void startgridcontrol28( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("DeleteMethod", "none");
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1201MacLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1205MacBarPar));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacBarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacDisCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14290MacSitHdr, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMacSitHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtMacCod_Internalname = "MACCOD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMacLin_Internalname = "MACLIN" ;
      edtMacBarCod_Internalname = "MACBARCOD" ;
      edtMacBarReo_Internalname = "MACBARREO" ;
      edtMacBarPar_Internalname = "MACBARPAR" ;
      edtMacDisCod_Internalname = "MACDISCOD" ;
      edtMacSitHdr_Internalname = "MACSITHDR" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtneliminarlinea_Internalname = "BTNELIMINARLINEA" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtMacUltLin_Internalname = "MACULTLIN" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      imgprompt_1203_1204_1205_Internalname = "PROMPT_1203_1204_1205" ;
      subGridlevel_level1_Internalname = "GRIDLEVEL_LEVEL1" ;
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
      subGridlevel_level1_Allowcollapsing = (byte)(0) ;
      subGridlevel_level1_Allowselection = (byte)(0) ;
      subGridlevel_level1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Accesorios", "") );
      edtMacSitHdr_Jsonclick = "" ;
      edtMacDisCod_Jsonclick = "" ;
      imgprompt_1203_1204_1205_Visible = 1 ;
      imgprompt_1203_1204_1205_Link = "" ;
      imgprompt_1203_1204_1205_Visible = 1 ;
      edtMacBarPar_Jsonclick = "" ;
      edtMacBarReo_Jsonclick = "" ;
      edtMacBarCod_Jsonclick = "" ;
      edtMacLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtMacSitHdr_Enabled = 0 ;
      edtMacDisCod_Enabled = 0 ;
      edtMacBarPar_Enabled = 1 ;
      edtMacBarReo_Enabled = 1 ;
      edtMacBarCod_Enabled = 1 ;
      edtMacLin_Enabled = 1 ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea Eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtMacUltLin_Jsonclick = "" ;
      edtMacUltLin_Enabled = 0 ;
      edtMacUltLin_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtneliminarlinea_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtMacCod_Jsonclick = "" ;
      edtMacCod_Enabled = 1 ;
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

   public void xc_18_47168( String A396EmprCod ,
                            int A1203MacBarCod ,
                            byte A1204MacBarReo ,
                            String A1205MacBarPar ,
                            int A1202MacDisCod ,
                            byte AV30Err_hdr )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int2[0] = A1202MacDisCod ;
         GXv_int7[0] = AV30Err_hdr ;
         new app.putil24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int2, GXv_int7) ;
         A396EmprCod = GXv_char5[0] ;
         A1203MacBarCod = GXv_int10[0] ;
         A1204MacBarReo = GXv_int11[0] ;
         A1205MacBarPar = GXv_char4[0] ;
         A1202MacDisCod = GXv_int2[0] ;
         AV30Err_hdr = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.str( AV30Err_hdr, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1205MacBarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV30Err_hdr, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_19_47168( String A396EmprCod ,
                            int A1199MacCod ,
                            int A1203MacBarCod ,
                            byte AV37NOAgrM )
   {
      if ( ( A1199MacCod > 0 ) && true /* After */ && ( AV37NOAgrM == 0 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         new app.pjl0000(remoteHandle, context).execute( GXv_char5, GXv_int10) ;
         A396EmprCod = GXv_char5[0] ;
         A1199MacCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_20_47168( String Gx_mode ,
                            String A396EmprCod ,
                            int A1199MacCod ,
                            int A1203MacBarCod ,
                            byte A1204MacBarReo ,
                            String A1205MacBarPar ,
                            byte AV33Err_l ,
                            String AV34Msgl ,
                            short A1201MacLin ,
                            byte AV36NoBaragr )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV36NoBaragr == 0 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_int2[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int7[0] = AV33Err_l ;
         GXv_char1[0] = AV34Msgl ;
         new app.pmacagr(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7, GXv_char1) ;
         A396EmprCod = GXv_char5[0] ;
         A1199MacCod = GXv_int10[0] ;
         A1203MacBarCod = GXv_int2[0] ;
         A1204MacBarReo = GXv_int11[0] ;
         A1205MacBarPar = GXv_char4[0] ;
         AV33Err_l = GXv_int7[0] ;
         AV34Msgl = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.str( AV33Err_l, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", AV34Msgl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1205MacBarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV33Err_l, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV34Msgl))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_21_47168( String Gx_mode ,
                            String A396EmprCod ,
                            int A1199MacCod ,
                            int A1203MacBarCod ,
                            byte A1204MacBarReo ,
                            String A1205MacBarPar ,
                            byte AV35Err_le )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_int2[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int7[0] = AV35Err_le ;
         new app.pmachde(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7) ;
         A396EmprCod = GXv_char5[0] ;
         A1199MacCod = GXv_int10[0] ;
         A1203MacBarCod = GXv_int2[0] ;
         A1204MacBarReo = GXv_int11[0] ;
         A1205MacBarPar = GXv_char4[0] ;
         AV35Err_le = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.str( AV35Err_le, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1205MacBarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV35Err_le, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_22_47168( String A396EmprCod ,
                            int A1203MacBarCod ,
                            byte A1204MacBarReo ,
                            String A1205MacBarPar ,
                            int A1199MacCod ,
                            byte AV39Indutexma ,
                            byte AV44biarprint )
   {
      if ( ( ( AV39Indutexma == 1 ) || ( AV44biarprint == 1 ) ) && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int2[0] = A1199MacCod ;
         new app.ppdahdrv(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int2) ;
         A396EmprCod = GXv_char5[0] ;
         A1203MacBarCod = GXv_int10[0] ;
         A1204MacBarReo = GXv_int11[0] ;
         A1205MacBarPar = GXv_char4[0] ;
         A1199MacCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1205MacBarPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_23_47168( String Gx_mode ,
                            String A396EmprCod ,
                            int A1199MacCod ,
                            String AV40Msg_control1 ,
                            byte AV42Recmaq ,
                            byte AV43Lhipro ,
                            int A1203MacBarCod ,
                            String A1205MacBarPar ,
                            byte AV41ctrlhdrsproceso )
   {
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41ctrlhdrsproceso == 1 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_char4[0] = AV40Msg_control1 ;
         GXv_int11[0] = AV42Recmaq ;
         GXv_int7[0] = AV43Lhipro ;
         new app.pprc24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_char4, GXv_int11, GXv_int7) ;
         A396EmprCod = GXv_char5[0] ;
         A1199MacCod = GXv_int10[0] ;
         AV40Msg_control1 = GXv_char4[0] ;
         AV42Recmaq = GXv_int11[0] ;
         AV43Lhipro = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1199MacCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_control1", AV40Msg_control1);
         httpContext.ajax_rsp_assign_attri("", false, "AV42Recmaq", GXutil.str( AV42Recmaq, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV43Lhipro", GXutil.str( AV43Lhipro, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV40Msg_control1))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV42Recmaq, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV43Lhipro, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_28168( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal47168( ) ;
         standaloneModal47168( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow47168( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28168( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
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

   public void valid_Maccod( )
   {
      n14266MacDatos = false ;
      /* Using cursor T004721 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A1199MacCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A14266MacDatos = T004721_A14266MacDatos[0] ;
         n14266MacDatos = T004721_n14266MacDatos[0] ;
      }
      else
      {
         A14266MacDatos = (short)(0) ;
         n14266MacDatos = false ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14266MacDatos", GXutil.ltrim( localUtil.ntoc( A14266MacDatos, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Macbarpar( )
   {
      n14290MacSitHdr = false ;
      /* Using cursor T004730 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A1203MacBarCod), Byte.valueOf(A1204MacBarReo), A1205MacBarPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         A14290MacSitHdr = T004730_A14290MacSitHdr[0] ;
         n14290MacSitHdr = T004730_n14290MacSitHdr[0] ;
      }
      else
      {
         A14290MacSitHdr = (short)(0) ;
         n14290MacSitHdr = false ;
      }
      pr_default.close(24);
      A13714MacHdr = GXutil.trim( GXutil.str( A1203MacBarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A1204MacBarReo, 1, 0)) + A1205MacBarPar ;
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int2[0] = A1202MacDisCod ;
         GXv_int7[0] = AV30Err_hdr ;
         new app.putil24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int11, GXv_char4, GXv_int2, GXv_int7) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacros_impl.this.A1203MacBarCod = GXv_int10[0] ;
         A1203MacBarCod = this.A1203MacBarCod ;
         tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
         A1204MacBarReo = this.A1204MacBarReo ;
         tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
         A1205MacBarPar = this.A1205MacBarPar ;
         tmacros_impl.this.A1202MacDisCod = GXv_int2[0] ;
         A1202MacDisCod = this.A1202MacDisCod ;
         tmacros_impl.this.AV30Err_hdr = GXv_int7[0] ;
         AV30Err_hdr = this.AV30Err_hdr ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV36NoBaragr == 0 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_int2[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int7[0] = AV33Err_l ;
         GXv_char1[0] = AV34Msgl ;
         new app.pmacagr(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7, GXv_char1) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         A1199MacCod = this.A1199MacCod ;
         tmacros_impl.this.A1203MacBarCod = GXv_int2[0] ;
         A1203MacBarCod = this.A1203MacBarCod ;
         tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
         A1204MacBarReo = this.A1204MacBarReo ;
         tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
         A1205MacBarPar = this.A1205MacBarPar ;
         tmacros_impl.this.AV33Err_l = GXv_int7[0] ;
         AV33Err_l = this.AV33Err_l ;
         tmacros_impl.this.AV34Msgl = GXv_char1[0] ;
         AV34Msgl = this.AV34Msgl ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_int2[0] = A1203MacBarCod ;
         GXv_int11[0] = A1204MacBarReo ;
         GXv_char4[0] = A1205MacBarPar ;
         GXv_int7[0] = AV35Err_le ;
         new app.pmachde(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_int2, GXv_int11, GXv_char4, GXv_int7) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         A1199MacCod = this.A1199MacCod ;
         tmacros_impl.this.A1203MacBarCod = GXv_int2[0] ;
         A1203MacBarCod = this.A1203MacBarCod ;
         tmacros_impl.this.A1204MacBarReo = GXv_int11[0] ;
         A1204MacBarReo = this.A1204MacBarReo ;
         tmacros_impl.this.A1205MacBarPar = GXv_char4[0] ;
         A1205MacBarPar = this.A1205MacBarPar ;
         tmacros_impl.this.AV35Err_le = GXv_int7[0] ;
         AV35Err_le = this.AV35Err_le ;
      }
      if ( true /* Level */ && true /* After */ && isIns( )  && ( AV41ctrlhdrsproceso == 1 ) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int10[0] = A1199MacCod ;
         GXv_char4[0] = AV40Msg_control1 ;
         GXv_int11[0] = AV42Recmaq ;
         GXv_int7[0] = AV43Lhipro ;
         new app.pprc24(remoteHandle, context).execute( GXv_char5, GXv_int10, GXv_char4, GXv_int11, GXv_int7) ;
         tmacros_impl.this.A396EmprCod = GXv_char5[0] ;
         A396EmprCod = this.A396EmprCod ;
         tmacros_impl.this.A1199MacCod = GXv_int10[0] ;
         A1199MacCod = this.A1199MacCod ;
         tmacros_impl.this.AV40Msg_control1 = GXv_char4[0] ;
         AV40Msg_control1 = this.AV40Msg_control1 ;
         tmacros_impl.this.AV42Recmaq = GXv_int11[0] ;
         AV42Recmaq = this.AV42Recmaq ;
         tmacros_impl.this.AV43Lhipro = GXv_int7[0] ;
         AV43Lhipro = this.AV43Lhipro ;
      }
      if ( true /* Level */ && true /* After */ && ( AV33Err_l == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV34Msgl, 1, "MACBARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ( AV30Err_hdr == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº HDR", ""), 1, "MACBARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
      }
      if ( true /* Level */ && true /* After */ && ( AV35Err_le == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Ya existe esa linea", ""), 1, "MACBARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV40Msg_control1, 1, "MACBARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 0 ) && ( AV43Lhipro == 1 ) && ( AV41ctrlhdrsproceso == 1 ) )
      {
         httpContext.GX_msglist.addItem(AV40Msg_control1, 1, "MACBARPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMacBarPar_Internalname ;
      }
      if ( ! (GXutil.strcmp("", AV40Msg_control1)==0) && true /* Level */ && true /* After */ && isIns( )  && ( AV42Recmaq == 0 ) && ( AV43Lhipro == 1 ) && ( AV41ctrlhdrsproceso == 0 ) )
      {
         httpContext.GX_msglist.addItem(AV40Msg_control1, 0, "MACBARPAR");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14290MacSitHdr", GXutil.ltrim( localUtil.ntoc( A14290MacSitHdr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13714MacHdr", GXutil.rtrim( A13714MacHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A1202MacDisCod", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Err_hdr", GXutil.ltrim( localUtil.ntoc( AV30Err_hdr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV33Err_l", GXutil.ltrim( localUtil.ntoc( AV33Err_l, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV34Msgl", GXutil.rtrim( AV34Msgl));
      httpContext.ajax_rsp_assign_attri("", false, "A1203MacBarCod", GXutil.ltrim( localUtil.ntoc( A1203MacBarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1204MacBarReo", GXutil.ltrim( localUtil.ntoc( A1204MacBarReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1205MacBarPar", GXutil.rtrim( A1205MacBarPar));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Err_le", GXutil.ltrim( localUtil.ntoc( AV35Err_le, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1199MacCod", GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV40Msg_control1", GXutil.rtrim( AV40Msg_control1));
      httpContext.ajax_rsp_assign_attri("", false, "AV42Recmaq", GXutil.ltrim( localUtil.ntoc( AV42Recmaq, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lhipro", GXutil.ltrim( localUtil.ntoc( AV43Lhipro, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV19Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV47TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e14472',iparms:[{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV29MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV16UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV19Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV47TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("'DOELIMINARLINEA'","{handler:'e1147167',iparms:[{av:'A14290MacSitHdr',fld:'MACSITHDR',pic:'ZZZ9'},{av:'A1201MacLin',fld:'MACLIN',pic:'ZZZ9'}]");
      setEventMetadata("'DOELIMINARLINEA'",",oparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e13472',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A1201MacLin',fld:'MACLIN',pic:'ZZZ9'},{av:'A1203MacBarCod',fld:'MACBARCOD',pic:'ZZZZZZZ9'},{av:'A1204MacBarReo',fld:'MACBARREO',pic:'9'},{av:'A1205MacBarPar',fld:'MACBARPAR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A1205MacBarPar',fld:'MACBARPAR',pic:''},{av:'A1204MacBarReo',fld:'MACBARREO',pic:'9'},{av:'A1203MacBarCod',fld:'MACBARCOD',pic:'ZZZZZZZ9'},{av:'A1201MacLin',fld:'MACLIN',pic:'ZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_MACCOD","{handler:'valid_Maccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A14266MacDatos',fld:'MACDATOS',pic:'ZZZ9'}]");
      setEventMetadata("VALID_MACCOD",",oparms:[{av:'A14266MacDatos',fld:'MACDATOS',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MACULTLIN","{handler:'valid_Macultlin',iparms:[]");
      setEventMetadata("VALID_MACULTLIN",",oparms:[]}");
      setEventMetadata("VALID_MACLIN","{handler:'valid_Maclin',iparms:[]");
      setEventMetadata("VALID_MACLIN",",oparms:[]}");
      setEventMetadata("VALID_MACBARCOD","{handler:'valid_Macbarcod',iparms:[]");
      setEventMetadata("VALID_MACBARCOD",",oparms:[]}");
      setEventMetadata("VALID_MACBARREO","{handler:'valid_Macbarreo',iparms:[]");
      setEventMetadata("VALID_MACBARREO",",oparms:[]}");
      setEventMetadata("VALID_MACBARPAR","{handler:'valid_Macbarpar',iparms:[{av:'AV41ctrlhdrsproceso',fld:'vCTRLHDRSPROCESO',pic:'9'},{av:'AV36NoBaragr',fld:'vNOBARAGR',pic:'9'},{av:'A1201MacLin',fld:'MACLIN',pic:'ZZZ9'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1203MacBarCod',fld:'MACBARCOD',pic:'ZZZZZZZ9'},{av:'A1204MacBarReo',fld:'MACBARREO',pic:'9'},{av:'A1205MacBarPar',fld:'MACBARPAR',pic:''},{av:'A14290MacSitHdr',fld:'MACSITHDR',pic:'ZZZ9'},{av:'A13714MacHdr',fld:'MACHDR',pic:''},{av:'AV30Err_hdr',fld:'vERR_HDR',pic:'9'},{av:'AV34Msgl',fld:'vMSGL',pic:''},{av:'AV33Err_l',fld:'vERR_L',pic:'9'},{av:'AV35Err_le',fld:'vERR_LE',pic:'9'},{av:'AV43Lhipro',fld:'vLHIPRO',pic:'9'},{av:'AV42Recmaq',fld:'vRECMAQ',pic:'9'},{av:'AV40Msg_control1',fld:'vMSG_CONTROL1',pic:''}]");
      setEventMetadata("VALID_MACBARPAR",",oparms:[{av:'A14290MacSitHdr',fld:'MACSITHDR',pic:'ZZZ9'},{av:'A13714MacHdr',fld:'MACHDR',pic:''},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'},{av:'AV30Err_hdr',fld:'vERR_HDR',pic:'9'},{av:'AV33Err_l',fld:'vERR_L',pic:'9'},{av:'AV34Msgl',fld:'vMSGL',pic:''},{av:'A1203MacBarCod',fld:'MACBARCOD',pic:'ZZZZZZZ9'},{av:'A1204MacBarReo',fld:'MACBARREO',pic:'9'},{av:'A1205MacBarPar',fld:'MACBARPAR',pic:''},{av:'AV35Err_le',fld:'vERR_LE',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV40Msg_control1',fld:'vMSG_CONTROL1',pic:''},{av:'AV42Recmaq',fld:'vRECMAQ',pic:'9'},{av:'AV43Lhipro',fld:'vLHIPRO',pic:'9'}]}");
      setEventMetadata("VALID_MACDISCOD","{handler:'valid_Macdiscod',iparms:[]");
      setEventMetadata("VALID_MACDISCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Macsithdr',iparms:[]");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV28EmprCod = "" ;
      Z396EmprCod = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      Z1205MacBarPar = "" ;
      Z3366MacKgs = DecimalUtil.ZERO ;
      Z3367MacMts = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1205MacBarPar = "" ;
      Gx_mode = "" ;
      AV34Msgl = "" ;
      AV40Msg_control1 = "" ;
      AV28EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtneliminarlinea_Jsonclick = "" ;
      A407EmprNom = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode168 = "" ;
      A13714MacHdr = "" ;
      A3366MacKgs = DecimalUtil.ZERO ;
      A3367MacMts = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvelop_confirmpanel_eliminarlinea_Objectcall = "" ;
      Dvelop_confirmpanel_eliminarlinea_Width = "" ;
      Dvelop_confirmpanel_eliminarlinea_Height = "" ;
      Dvelop_confirmpanel_eliminarlinea_Class = "" ;
      Dvelop_confirmpanel_eliminarlinea_Comment = "" ;
      Dvelop_confirmpanel_eliminarlinea_Bodytype = "" ;
      Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_eliminarlinea_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode167 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      AV19Station = "" ;
      AV18EmprNom = "" ;
      AV16UsurCod = "" ;
      GXt_char3 = "" ;
      AV46WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV48WebSession = httpContext.getWebSession();
      GXv_int9 = new short[1] ;
      Z407EmprNom = "" ;
      T00477_A407EmprNom = new String[] {""} ;
      T00477_n407EmprNom = new boolean[] {false} ;
      T00479_A14266MacDatos = new short[1] ;
      T00479_n14266MacDatos = new boolean[] {false} ;
      T004711_A1199MacCod = new int[1] ;
      T004711_A1200MacUltLin = new short[1] ;
      T004711_n1200MacUltLin = new boolean[] {false} ;
      T004711_A407EmprNom = new String[] {""} ;
      T004711_n407EmprNom = new boolean[] {false} ;
      T004711_A396EmprCod = new String[] {""} ;
      T004711_A14266MacDatos = new short[1] ;
      T004711_n14266MacDatos = new boolean[] {false} ;
      T004713_A14266MacDatos = new short[1] ;
      T004713_n14266MacDatos = new boolean[] {false} ;
      T004714_A396EmprCod = new String[] {""} ;
      T004714_A1199MacCod = new int[1] ;
      T00476_A1199MacCod = new int[1] ;
      T00476_A1200MacUltLin = new short[1] ;
      T00476_n1200MacUltLin = new boolean[] {false} ;
      T00476_A396EmprCod = new String[] {""} ;
      T004715_A396EmprCod = new String[] {""} ;
      T004715_A1199MacCod = new int[1] ;
      T004716_A396EmprCod = new String[] {""} ;
      T004716_A1199MacCod = new int[1] ;
      T00475_A1199MacCod = new int[1] ;
      T00475_A1200MacUltLin = new short[1] ;
      T00475_n1200MacUltLin = new boolean[] {false} ;
      T00475_A396EmprCod = new String[] {""} ;
      T004721_A14266MacDatos = new short[1] ;
      T004721_n14266MacDatos = new boolean[] {false} ;
      T004723_A396EmprCod = new String[] {""} ;
      T004723_A1199MacCod = new int[1] ;
      T004724_A129BarCod = new int[1] ;
      T004724_A132BarCodReo = new byte[1] ;
      T004724_A130BarCodPar = new String[] {""} ;
      T004724_A396EmprCod = new String[] {""} ;
      T004724_A1199MacCod = new int[1] ;
      T004724_A1201MacLin = new short[1] ;
      T004724_A1203MacBarCod = new int[1] ;
      T004724_A1204MacBarReo = new byte[1] ;
      T004724_A1205MacBarPar = new String[] {""} ;
      T004724_A1202MacDisCod = new int[1] ;
      T004724_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004724_A3367MacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004724_A14290MacSitHdr = new short[1] ;
      T004724_n14290MacSitHdr = new boolean[] {false} ;
      T00474_A14290MacSitHdr = new short[1] ;
      T00474_n14290MacSitHdr = new boolean[] {false} ;
      T004725_A14290MacSitHdr = new short[1] ;
      T004725_n14290MacSitHdr = new boolean[] {false} ;
      T004726_A396EmprCod = new String[] {""} ;
      T004726_A1199MacCod = new int[1] ;
      T004726_A1201MacLin = new short[1] ;
      T00473_A396EmprCod = new String[] {""} ;
      T00473_A1199MacCod = new int[1] ;
      T00473_A1201MacLin = new short[1] ;
      T00473_A1203MacBarCod = new int[1] ;
      T00473_A1204MacBarReo = new byte[1] ;
      T00473_A1205MacBarPar = new String[] {""} ;
      T00473_A1202MacDisCod = new int[1] ;
      T00473_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00473_A3367MacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00472_A396EmprCod = new String[] {""} ;
      T00472_A1199MacCod = new int[1] ;
      T00472_A1201MacLin = new short[1] ;
      T00472_A1203MacBarCod = new int[1] ;
      T00472_A1204MacBarReo = new byte[1] ;
      T00472_A1205MacBarPar = new String[] {""} ;
      T00472_A1202MacDisCod = new int[1] ;
      T00472_A3366MacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00472_A3367MacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T004730_A14290MacSitHdr = new short[1] ;
      T004730_n14290MacSitHdr = new boolean[] {false} ;
      T004731_A396EmprCod = new String[] {""} ;
      T004731_A1199MacCod = new int[1] ;
      T004731_A1201MacLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      imgprompt_1203_1204_1205_gximage = "" ;
      sImgUrl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new byte[1] ;
      GXv_int7 = new byte[1] ;
      Z13714MacHdr = "" ;
      ZV34Msgl = "" ;
      ZV40Msg_control1 = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.tmacros__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.tmacros__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.tmacros__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.tmacros__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.tmacros__default(),
         new Object[] {
             new Object[] {
            T00472_A396EmprCod, T00472_A1199MacCod, T00472_A1201MacLin, T00472_A1203MacBarCod, T00472_A1204MacBarReo, T00472_A1205MacBarPar, T00472_A1202MacDisCod, T00472_A3366MacKgs, T00472_A3367MacMts
            }
            , new Object[] {
            T00473_A396EmprCod, T00473_A1199MacCod, T00473_A1201MacLin, T00473_A1203MacBarCod, T00473_A1204MacBarReo, T00473_A1205MacBarPar, T00473_A1202MacDisCod, T00473_A3366MacKgs, T00473_A3367MacMts
            }
            , new Object[] {
            T00474_A14290MacSitHdr, T00474_n14290MacSitHdr
            }
            , new Object[] {
            T00475_A1199MacCod, T00475_A1200MacUltLin, T00475_n1200MacUltLin, T00475_A396EmprCod
            }
            , new Object[] {
            T00476_A1199MacCod, T00476_A1200MacUltLin, T00476_n1200MacUltLin, T00476_A396EmprCod
            }
            , new Object[] {
            T00477_A407EmprNom, T00477_n407EmprNom
            }
            , new Object[] {
            T00479_A14266MacDatos, T00479_n14266MacDatos
            }
            , new Object[] {
            T004711_A1199MacCod, T004711_A1200MacUltLin, T004711_n1200MacUltLin, T004711_A407EmprNom, T004711_n407EmprNom, T004711_A396EmprCod, T004711_A14266MacDatos, T004711_n14266MacDatos
            }
            , new Object[] {
            T004713_A14266MacDatos, T004713_n14266MacDatos
            }
            , new Object[] {
            T004714_A396EmprCod, T004714_A1199MacCod
            }
            , new Object[] {
            T004715_A396EmprCod, T004715_A1199MacCod
            }
            , new Object[] {
            T004716_A396EmprCod, T004716_A1199MacCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004721_A14266MacDatos, T004721_n14266MacDatos
            }
            , new Object[] {
            }
            , new Object[] {
            T004723_A396EmprCod, T004723_A1199MacCod
            }
            , new Object[] {
            T004724_A129BarCod, T004724_A132BarCodReo, T004724_A130BarCodPar, T004724_A396EmprCod, T004724_A1199MacCod, T004724_A1201MacLin, T004724_A1203MacBarCod, T004724_A1204MacBarReo, T004724_A1205MacBarPar, T004724_A1202MacDisCod,
            T004724_A3366MacKgs, T004724_A3367MacMts, T004724_A14290MacSitHdr, T004724_n14290MacSitHdr
            }
            , new Object[] {
            T004725_A14290MacSitHdr, T004725_n14290MacSitHdr
            }
            , new Object[] {
            T004726_A396EmprCod, T004726_A1199MacCod, T004726_A1201MacLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T004730_A14290MacSitHdr, T004730_n14290MacSitHdr
            }
            , new Object[] {
            T004731_A396EmprCod, T004731_A1199MacCod, T004731_A1201MacLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z1204MacBarReo ;
   private byte GxWebError ;
   private byte A1204MacBarReo ;
   private byte AV30Err_hdr ;
   private byte AV37NOAgrM ;
   private byte AV33Err_l ;
   private byte AV36NoBaragr ;
   private byte AV35Err_le ;
   private byte AV39Indutexma ;
   private byte AV44biarprint ;
   private byte AV42Recmaq ;
   private byte AV43Lhipro ;
   private byte AV41ctrlhdrsproceso ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte GXt_int6 ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int11[] ;
   private byte GXv_int7[] ;
   private byte ZV30Err_hdr ;
   private byte ZV33Err_l ;
   private byte ZV35Err_le ;
   private byte ZV42Recmaq ;
   private byte ZV43Lhipro ;
   private short nIsMod_168 ;
   private short Z1200MacUltLin ;
   private short O1200MacUltLin ;
   private short O14266MacDatos ;
   private short Z1201MacLin ;
   private short nRcdDeleted_168 ;
   private short nRcdExists_168 ;
   private short A1201MacLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1200MacUltLin ;
   private short nBlankRcdCount168 ;
   private short RcdFound168 ;
   private short B1200MacUltLin ;
   private short B14266MacDatos ;
   private short A14266MacDatos ;
   private short nBlankRcdUsr168 ;
   private short RcdFound167 ;
   private short s1200MacUltLin ;
   private short s14266MacDatos ;
   private short A14290MacSitHdr ;
   private short GXv_int9[] ;
   private short Z14266MacDatos ;
   private short nIsDirty_167 ;
   private short Z14290MacSitHdr ;
   private short nIsDirty_168 ;
   private short i1200MacUltLin ;
   private short i14266MacDatos ;
   private int wcpOAV29MacCod ;
   private int Z1199MacCod ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int Z1203MacBarCod ;
   private int Z1202MacDisCod ;
   private int A1203MacBarCod ;
   private int A1202MacDisCod ;
   private int A1199MacCod ;
   private int AV29MacCod ;
   private int trnEnded ;
   private int edtMacCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtneliminarlinea_Visible ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMacUltLin_Enabled ;
   private int edtMacUltLin_Visible ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtMacLin_Enabled ;
   private int edtMacBarCod_Enabled ;
   private int edtMacBarReo_Enabled ;
   private int edtMacBarPar_Enabled ;
   private int edtMacDisCod_Enabled ;
   private int edtMacSitHdr_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int imgprompt_1203_1204_1205_Visible ;
   private int defedtMacDisCod_Enabled ;
   private int defedtMacBarPar_Enabled ;
   private int defedtMacBarReo_Enabled ;
   private int defedtMacBarCod_Enabled ;
   private int defedtMacLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int2[] ;
   private int GXv_int10[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3366MacKgs ;
   private java.math.BigDecimal Z3367MacMts ;
   private java.math.BigDecimal A3366MacKgs ;
   private java.math.BigDecimal A3367MacMts ;
   private String sPrefix ;
   private String sGXsfl_28_idx="0001" ;
   private String wcpOGx_mode ;
   private String wcpOAV28EmprCod ;
   private String Z396EmprCod ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Z1205MacBarPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1205MacBarPar ;
   private String Gx_mode ;
   private String AV34Msgl ;
   private String AV40Msg_control1 ;
   private String AV28EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMacCod_Internalname ;
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
   private String edtMacCod_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtneliminarlinea_Internalname ;
   private String bttBtneliminarlinea_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtMacUltLin_Internalname ;
   private String edtMacUltLin_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sMode168 ;
   private String edtMacLin_Internalname ;
   private String edtMacBarCod_Internalname ;
   private String edtMacBarReo_Internalname ;
   private String edtMacBarPar_Internalname ;
   private String edtMacDisCod_Internalname ;
   private String edtMacSitHdr_Internalname ;
   private String imgprompt_1203_1204_1205_Link ;
   private String subGridlevel_level1_Internalname ;
   private String A13714MacHdr ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvelop_confirmpanel_eliminarlinea_Objectcall ;
   private String Dvelop_confirmpanel_eliminarlinea_Width ;
   private String Dvelop_confirmpanel_eliminarlinea_Height ;
   private String Dvelop_confirmpanel_eliminarlinea_Class ;
   private String Dvelop_confirmpanel_eliminarlinea_Comment ;
   private String Dvelop_confirmpanel_eliminarlinea_Bodytype ;
   private String Dvelop_confirmpanel_eliminarlinea_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Texttype ;
   private String hsh ;
   private String sMode167 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV19Station ;
   private String AV18EmprNom ;
   private String AV16UsurCod ;
   private String GXt_char3 ;
   private String Z407EmprNom ;
   private String imgprompt_1203_1204_1205_Internalname ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtMacLin_Jsonclick ;
   private String edtMacBarCod_Jsonclick ;
   private String edtMacBarReo_Jsonclick ;
   private String edtMacBarPar_Jsonclick ;
   private String imgprompt_1203_1204_1205_gximage ;
   private String sImgUrl ;
   private String edtMacDisCod_Jsonclick ;
   private String edtMacSitHdr_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String Z13714MacHdr ;
   private String ZV34Msgl ;
   private String ZV40Msg_control1 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1200MacUltLin ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n14266MacDatos ;
   private boolean bGXsfl_28_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Enabled ;
   private boolean Dvelop_confirmpanel_eliminarlinea_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n14290MacSitHdr ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV48WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00477_A407EmprNom ;
   private boolean[] T00477_n407EmprNom ;
   private short[] T00479_A14266MacDatos ;
   private boolean[] T00479_n14266MacDatos ;
   private int[] T004711_A1199MacCod ;
   private short[] T004711_A1200MacUltLin ;
   private boolean[] T004711_n1200MacUltLin ;
   private String[] T004711_A407EmprNom ;
   private boolean[] T004711_n407EmprNom ;
   private String[] T004711_A396EmprCod ;
   private short[] T004711_A14266MacDatos ;
   private boolean[] T004711_n14266MacDatos ;
   private short[] T004713_A14266MacDatos ;
   private boolean[] T004713_n14266MacDatos ;
   private String[] T004714_A396EmprCod ;
   private int[] T004714_A1199MacCod ;
   private int[] T00476_A1199MacCod ;
   private short[] T00476_A1200MacUltLin ;
   private boolean[] T00476_n1200MacUltLin ;
   private String[] T00476_A396EmprCod ;
   private String[] T004715_A396EmprCod ;
   private int[] T004715_A1199MacCod ;
   private String[] T004716_A396EmprCod ;
   private int[] T004716_A1199MacCod ;
   private int[] T00475_A1199MacCod ;
   private short[] T00475_A1200MacUltLin ;
   private boolean[] T00475_n1200MacUltLin ;
   private String[] T00475_A396EmprCod ;
   private short[] T004721_A14266MacDatos ;
   private boolean[] T004721_n14266MacDatos ;
   private String[] T004723_A396EmprCod ;
   private int[] T004723_A1199MacCod ;
   private int[] T004724_A129BarCod ;
   private byte[] T004724_A132BarCodReo ;
   private String[] T004724_A130BarCodPar ;
   private String[] T004724_A396EmprCod ;
   private int[] T004724_A1199MacCod ;
   private short[] T004724_A1201MacLin ;
   private int[] T004724_A1203MacBarCod ;
   private byte[] T004724_A1204MacBarReo ;
   private String[] T004724_A1205MacBarPar ;
   private int[] T004724_A1202MacDisCod ;
   private java.math.BigDecimal[] T004724_A3366MacKgs ;
   private java.math.BigDecimal[] T004724_A3367MacMts ;
   private short[] T004724_A14290MacSitHdr ;
   private boolean[] T004724_n14290MacSitHdr ;
   private short[] T00474_A14290MacSitHdr ;
   private boolean[] T00474_n14290MacSitHdr ;
   private short[] T004725_A14290MacSitHdr ;
   private boolean[] T004725_n14290MacSitHdr ;
   private String[] T004726_A396EmprCod ;
   private int[] T004726_A1199MacCod ;
   private short[] T004726_A1201MacLin ;
   private String[] T00473_A396EmprCod ;
   private int[] T00473_A1199MacCod ;
   private short[] T00473_A1201MacLin ;
   private int[] T00473_A1203MacBarCod ;
   private byte[] T00473_A1204MacBarReo ;
   private String[] T00473_A1205MacBarPar ;
   private int[] T00473_A1202MacDisCod ;
   private java.math.BigDecimal[] T00473_A3366MacKgs ;
   private java.math.BigDecimal[] T00473_A3367MacMts ;
   private String[] T00472_A396EmprCod ;
   private int[] T00472_A1199MacCod ;
   private short[] T00472_A1201MacLin ;
   private int[] T00472_A1203MacBarCod ;
   private byte[] T00472_A1204MacBarReo ;
   private String[] T00472_A1205MacBarPar ;
   private int[] T00472_A1202MacDisCod ;
   private java.math.BigDecimal[] T00472_A3366MacKgs ;
   private java.math.BigDecimal[] T00472_A3367MacMts ;
   private short[] T004730_A14290MacSitHdr ;
   private boolean[] T004730_n14290MacSitHdr ;
   private String[] T004731_A396EmprCod ;
   private int[] T004731_A1199MacCod ;
   private short[] T004731_A1201MacLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV46WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV47TrnContext ;
}

final  class tmacros__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacros__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacros__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacros__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmacros__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00472", "SELECT EmprCod, MacCod, MacLin, MacBarCod, MacBarReo, MacBarPar, MacDisCod, MacKgs, MacMts FROM TXPLMACRO WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?  FOR UPDATE OF MacBarCod, MacBarReo, MacBarPar, MacDisCod, MacKgs, MacMts NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00473", "SELECT EmprCod, MacCod, MacLin, MacBarCod, MacBarReo, MacBarPar, MacDisCod, MacKgs, MacMts FROM TXPLMACRO WHERE EmprCod = ? AND MacCod = ? AND MacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00474", "SELECT COALESCE( BarSit, 0) AS MacSitHdr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00475", "SELECT MacCod, MacUltLin, EmprCod FROM TXPCMACRO WHERE EmprCod = ? AND MacCod = ?  FOR UPDATE OF MacUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00476", "SELECT MacCod, MacUltLin, EmprCod FROM TXPCMACRO WHERE EmprCod = ? AND MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00477", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00479", "SELECT COALESCE( T1.MacDatos, 0) AS MacDatos FROM (SELECT COUNT(*) AS MacDatos, EmprCod, MacCod FROM TXPLMACRO GROUP BY EmprCod, MacCod ) T1 WHERE T1.EmprCod = ? AND T1.MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004711", "SELECT /*+ FIRST_ROWS(100) */ TM1.MacCod, TM1.MacUltLin, T2.EmprNom, TM1.EmprCod, COALESCE( T3.MacDatos, 0) AS MacDatos FROM ((TXPCMACRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT COUNT(*) AS MacDatos, EmprCod, MacCod FROM TXPLMACRO GROUP BY EmprCod, MacCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.MacCod = TM1.MacCod) WHERE TM1.EmprCod = ? and TM1.MacCod = ? ORDER BY TM1.EmprCod, TM1.MacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004713", "SELECT COALESCE( T1.MacDatos, 0) AS MacDatos FROM (SELECT COUNT(*) AS MacDatos, EmprCod, MacCod FROM TXPLMACRO GROUP BY EmprCod, MacCod ) T1 WHERE T1.EmprCod = ? AND T1.MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004714", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ? AND MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004715", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCod FROM TXPCMACRO WHERE ( MacCod > ?) and EmprCod = ? ORDER BY EmprCod, MacCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T004716", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MacCod FROM TXPCMACRO WHERE ( MacCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, MacCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T004717", "INSERT INTO TXPCMACRO(MacCod, MacUltLin, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPCMACRO")
         ,new UpdateCursor("T004718", "UPDATE TXPCMACRO SET MacUltLin=?  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK, "TXPCMACRO")
         ,new UpdateCursor("T004719", "DELETE FROM TXPCMACRO  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK, "TXPCMACRO")
         ,new ForEachCursor("T004721", "SELECT COALESCE( T1.MacDatos, 0) AS MacDatos FROM (SELECT COUNT(*) AS MacDatos, EmprCod, MacCod FROM TXPLMACRO GROUP BY EmprCod, MacCod ) T1 WHERE T1.EmprCod = ? AND T1.MacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T004722", "UPDATE TXPCMACRO SET MacUltLin=?  WHERE EmprCod = ? AND MacCod = ?", GX_NOMASK, "TXPCMACRO")
         ,new ForEachCursor("T004723", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MacCod FROM TXPCMACRO WHERE EmprCod = ? ORDER BY EmprCod, MacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004724", "SELECT T2.BarCod, T2.BarCodReo, T2.BarCodPar, T1.EmprCod, T1.MacCod, T1.MacLin, T1.MacBarCod, T1.MacBarReo, T1.MacBarPar, T1.MacDisCod, T1.MacKgs, T1.MacMts, COALESCE( T2.BarSit, 0) AS MacSitHdr FROM (TXPLMACRO T1 LEFT JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.MacBarCod AND T2.BarCodReo = T1.MacBarReo AND T2.BarCodPar = T1.MacBarPar) WHERE T1.EmprCod = ? and T1.MacCod = ? and T1.MacLin = ? ORDER BY T1.EmprCod, T1.MacCod, T1.MacLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004725", "SELECT COALESCE( BarSit, 0) AS MacSitHdr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004726", "SELECT EmprCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? AND MacCod = ? AND MacLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T004727", "INSERT INTO TXPLMACRO(EmprCod, MacCod, MacLin, MacBarCod, MacBarReo, MacBarPar, MacDisCod, MacKgs, MacMts) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLMACRO")
         ,new UpdateCursor("T004728", "UPDATE TXPLMACRO SET MacBarCod=?, MacBarReo=?, MacBarPar=?, MacDisCod=?, MacKgs=?, MacMts=?  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK, "TXPLMACRO")
         ,new UpdateCursor("T004729", "DELETE FROM TXPLMACRO  WHERE EmprCod = ? AND MacCod = ? AND MacLin = ?", GX_NOMASK, "TXPLMACRO")
         ,new ForEachCursor("T004730", "SELECT COALESCE( BarSit, 0) AS MacSitHdr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T004731", "SELECT EmprCod, MacCod, MacLin FROM TXPLMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod, MacLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 19 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

