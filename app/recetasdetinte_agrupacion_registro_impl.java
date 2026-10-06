package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdetinte_agrupacion_registro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_1RK13( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_1RK13( Gx_mode, A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action34") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_34_1RK13( Gx_mode, A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action35") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A671PieAgr = (short)(GXutil.lval( httpContext.GetPar( "PieAgr"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         A590KgmAgr = CommonUtil.decimalVal( httpContext.GetPar( "KgmAgr"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         A869MtrAgr = CommonUtil.decimalVal( httpContext.GetPar( "MtrAgr"), ".") ;
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_35_1RK13( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, A180BarMaqCod, A236BarVolMaq, A671PieAgr, A590KgmAgr, A869MtrAgr) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"PEDIDOCLIE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4812BarEncCli = httpContext.GetPar( "BarEncCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A143BarDisNum = httpContext.GetPar( "BarDisNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asapedidoclie1RK13( A396EmprCod, A4812BarEncCli, A143BarDisNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_46") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_46( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
            AV9BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodReo", GXutil.str( AV9BarCodReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
            AV10BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
            AV11BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11BarAgrCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGRCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarAgrCod), "ZZZZZZZ9")));
            AV12BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarAgrReo", GXutil.str( AV12BarAgrReo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGRREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAgrReo), "9")));
            AV13BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarAgrPar", AV13BarAgrPar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGRPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrPar, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de Tinte (Agrupacion_Registro)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public recetasdetinte_agrupacion_registro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdetinte_agrupacion_registro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdetinte_agrupacion_registro_impl.class ));
   }

   public recetasdetinte_agrupacion_registro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNHdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNHdr_Internalname, GXutil.rtrim( A13696BarNHdr), GXutil.rtrim( localUtil.format( A13696BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedidoClie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedidoClie_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedidoClie_Internalname, GXutil.rtrim( A13878PedidoClie), GXutil.rtrim( localUtil.format( A13878PedidoClie, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedidoClie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedidoClie_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMaqCod_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, GXutil.rtrim( A180BarMaqCod), GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarVolMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarVolMaq_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarVolMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarVolMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A236BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarVolMaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarVolMaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSit_Internalname, httpContext.getMessage( "Sit.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrCod_Internalname, httpContext.getMessage( "Nº HDR", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A119BarAgrCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAgrCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop40 DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", imgavPrompt_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Active Bitmap Variable */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
      StyleString = "" ;
      AV51Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV51Prompt)==0)&&(GXutil.strcmp("", AV64Prompt_GXI)==0))||!(GXutil.strcmp("", AV51Prompt)==0)) ;
      sImgUrl = ((GXutil.strcmp("", AV51Prompt)==0) ? AV64Prompt_GXI : httpContext.getResourceRelative(AV51Prompt)) ;
      app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgavPrompt_Visible, imgavPrompt_Enabled, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV51Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrReo_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A124BarAgrReo), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAgrReo_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrPar_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrPar_Internalname, GXutil.rtrim( A122BarAgrPar), GXutil.rtrim( localUtil.format( A122BarAgrPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAgrPar_Enabled, 1, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCodAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCodAgr_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCodAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCodAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1508CliCodAgr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCodAgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCodAgr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrSer_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrSer_Internalname, GXutil.rtrim( A1245BarAgrSer), GXutil.rtrim( localUtil.format( A1245BarAgrSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAgrSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAgrDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAgrDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAgrDsc_Internalname, GXutil.rtrim( A1507BarAgrDsc), GXutil.rtrim( localUtil.format( A1507BarAgrDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAgrDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarAgrDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColNomAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColNomAgr_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNomAgr_Internalname, GXutil.rtrim( A1510ColNomAgr), GXutil.rtrim( localUtil.format( A1510ColNomAgr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNomAgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtColNomAgr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtColNumAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtColNumAgr_Internalname, httpContext.getMessage( "N° Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNumAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColNumAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1512ColNumAgr), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNumAgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtColNumAgr_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtKgmAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtKgmAgr_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtKgmAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtKgmAgr_Enabled!=0) ? localUtil.format( A590KgmAgr, "ZZZZZ9.99") : localUtil.format( A590KgmAgr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtKgmAgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtKgmAgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMtrAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMtrAgr_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMtrAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMtrAgr_Enabled!=0) ? localUtil.format( A869MtrAgr, "ZZZZZ9.99") : localUtil.format( A869MtrAgr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMtrAgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMtrAgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPieAgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPieAgr_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPieAgr_Internalname, GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPieAgr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A671PieAgr), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPieAgr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPieAgr_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV63Pgmname), GXutil.rtrim( localUtil.format( AV63Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtFindBarAgr_Internalname, GXutil.rtrim( A474FindBarAgr), GXutil.rtrim( localUtil.format( A474FindBarAgr, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFindBarAgr_Jsonclick, 0, "Attribute", "", "", "", "", edtFindBarAgr_Visible, edtFindBarAgr_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeTinte_Agrupacion_Registro.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111RK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z119BarAgrCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z124BarAgrReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z122BarAgrPar = httpContext.cgiGet( "Z122BarAgrPar") ;
            Z1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1508CliCodAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1245BarAgrSer = httpContext.cgiGet( "Z1245BarAgrSer") ;
            Z1510ColNomAgr = httpContext.cgiGet( "Z1510ColNomAgr") ;
            Z1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1512ColNumAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1507BarAgrDsc = httpContext.cgiGet( "Z1507BarAgrDsc") ;
            Z590KgmAgr = localUtil.ctond( httpContext.cgiGet( "Z590KgmAgr")) ;
            Z869MtrAgr = localUtil.ctond( httpContext.cgiGet( "Z869MtrAgr")) ;
            Z671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( "Z671PieAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1513DisCodAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1509ColNoCAgr = httpContext.cgiGet( "Z1509ColNoCAgr") ;
            Z1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1511ColNuCAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1649BarAgrDNu = httpContext.cgiGet( "Z1649BarAgrDNu") ;
            A1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1513DisCodAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1509ColNoCAgr = httpContext.cgiGet( "Z1509ColNoCAgr") ;
            A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( "Z1511ColNuCAgr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1649BarAgrDNu = httpContext.cgiGet( "Z1649BarAgrDNu") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A4812BarEncCli = httpContext.cgiGet( "BARENCCLI") ;
            A143BarDisNum = httpContext.cgiGet( "BARDISNUM") ;
            A401EmprCodVi = httpContext.cgiGet( "EMPRCODVI") ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
            A13792BarAgrNhdr = httpContext.cgiGet( "BARAGRNHDR") ;
            A13695BarAGrHdr = httpContext.cgiGet( "BARAGRHDR") ;
            A1650BarAgrNDes = (short)(localUtil.ctol( httpContext.cgiGet( "BARAGRNDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1653FindDes = httpContext.cgiGet( "FINDDES") ;
            n1653FindDes = false ;
            A1651BarPNDes = (short)(localUtil.ctol( httpContext.cgiGet( "BARPNDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A123BarAgrPie = (short)(localUtil.ctol( httpContext.cgiGet( "BARAGRPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
            AV11BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARAGRCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARAGRREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13BarAgrPar = httpContext.cgiGet( "vBARAGRPAR") ;
            AV43ok_hdr = (short)(localUtil.ctol( httpContext.cgiGet( "vOK_HDR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV44Baragrest = httpContext.cgiGet( "vBARAGREST") ;
            AV48FlagRec = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGREC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1513DisCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( "DISCODAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1509ColNoCAgr = httpContext.cgiGet( "COLNOCAGR") ;
            A1511ColNuCAgr = (int)(localUtil.ctol( httpContext.cgiGet( "COLNUCAGR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1649BarAgrDNu = httpContext.cgiGet( "BARAGRDNU") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A2759BarMaqGru = httpContext.cgiGet( "BARMAQGRU") ;
            A120BarAgrEst = httpContext.cgiGet( "BARAGREST") ;
            A121BarAgrKgm = localUtil.ctond( httpContext.cgiGet( "BARAGRKGM")) ;
            A868BarAgrMtr = localUtil.ctond( httpContext.cgiGet( "BARAGRMTR")) ;
            A478FindVolMax = (int)(localUtil.ctol( httpContext.cgiGet( "FINDVOLMAX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A479FindVolMed = (int)(localUtil.ctol( httpContext.cgiGet( "FINDVOLMED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A480FindVolMin = (int)(localUtil.ctol( httpContext.cgiGet( "FINDVOLMIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13846BarAgrCant = localUtil.ctond( httpContext.cgiGet( "BARAGRCANT")) ;
            n13846BarAgrCant = false ;
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
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Dvpanel_unnamedtable1_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A13878PedidoClie = httpContext.cgiGet( edtPedidoClie_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
            A236BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtBarVolMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAGRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A119BarAgrCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            }
            else
            {
               A119BarAgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            }
            AV51Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARAGRREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAgrReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A124BarAgrReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            }
            else
            {
               A124BarAgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarAgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            }
            A122BarAgrPar = httpContext.cgiGet( edtBarAgrPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
            A1508CliCodAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCodAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
            A1245BarAgrSer = httpContext.cgiGet( edtBarAgrSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
            A1507BarAgrDsc = httpContext.cgiGet( edtBarAgrDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
            A1510ColNomAgr = httpContext.cgiGet( edtColNomAgr_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
            A1512ColNumAgr = (int)(localUtil.ctol( httpContext.cgiGet( edtColNumAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
            A590KgmAgr = localUtil.ctond( httpContext.cgiGet( edtKgmAgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
            A869MtrAgr = localUtil.ctond( httpContext.cgiGet( edtMtrAgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
            A671PieAgr = (short)(localUtil.ctol( httpContext.cgiGet( edtPieAgr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
            AV63Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
            A474FindBarAgr = GXutil.upper( httpContext.cgiGet( edtFindBarAgr_Internalname)) ;
            n474FindBarAgr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeTinte_Agrupacion_Registro");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("DisCodAgr", localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9"));
            forbiddenHiddens.add("ColNoCAgr", GXutil.rtrim( localUtil.format( A1509ColNoCAgr, "")));
            forbiddenHiddens.add("ColNuCAgr", localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9"));
            forbiddenHiddens.add("BarAgrDNu", GXutil.rtrim( localUtil.format( A1649BarAgrDNu, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("recetasdetinte_agrupacion_registro:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
               A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
               A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
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
                  sMode13 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode13 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound13 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1RK0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "BARAGRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarAgrCod_Internalname ;
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
                        e111RK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121RK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131RK2 ();
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
         e121RK2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1RK13( ) ;
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
         disableAttributes1RK13( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
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

   public void confirm_1RK0( )
   {
      beforeValidate1RK13( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1RK13( ) ;
         }
         else
         {
            checkExtendedTable1RK13( ) ;
            closeExtendedTableCursors1RK13( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1RK0( )
   {
   }

   public void e111RK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV46Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetasdetinte_agrupacion_registro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Station", AV46Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV45EmprNom ;
      GXv_char4[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetasdetinte_agrupacion_registro_impl.this.AV7EmprCod = GXv_char2[0] ;
      recetasdetinte_agrupacion_registro_impl.this.AV45EmprNom = GXv_char3[0] ;
      recetasdetinte_agrupacion_registro_impl.this.AV47UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmprNom", AV45EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV47UsurCod", AV47UsurCod);
      GXt_char1 = AV46Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetasdetinte_agrupacion_registro_impl.this.GXt_char1 = GXv_char4[0] ;
      AV46Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Station", AV46Station);
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV45EmprNom ;
      GXv_char2[0] = AV47UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetasdetinte_agrupacion_registro_impl.this.AV7EmprCod = GXv_char4[0] ;
      recetasdetinte_agrupacion_registro_impl.this.AV45EmprNom = GXv_char3[0] ;
      recetasdetinte_agrupacion_registro_impl.this.AV47UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmprNom", AV45EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV47UsurCod", AV47UsurCod);
      GXv_SdtWWPContext5[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV14WWPContext = GXv_SdtWWPContext5[0] ;
      AV15TrnContext.fromxml(AV16WebSession.getValue("TrnContext"), null, null);
      edtFindBarAgr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Visible), 5, 0), true);
      GXt_int6 = (byte)(AV27Wckgcol) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "WCHGCO", ""), GXv_int7) ;
      recetasdetinte_agrupacion_registro_impl.this.GXt_int6 = GXv_int7[0] ;
      AV27Wckgcol = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Wckgcol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Wckgcol), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27Wckgcol), "ZZZ9")));
      AV49clicodin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49clicodin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49clicodin), 6, 0));
      AV50barsitto = (byte)(6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50barsitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50barsitto), 2, 0));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV51Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV51Prompt)==0) ? AV64Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV51Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV51Prompt), true);
      AV64Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV51Prompt)==0) ? AV64Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV51Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV51Prompt), true);
   }

   public void e121RK2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         if ( AV27Wckgcol == 1 )
         {
            AV53barcodm = A119BarAgrCod ;
            AV54barcodreom = A124BarAgrReo ;
            AV55barcodparm = A122BarAgrPar ;
            new app.pminagr(remoteHandle, context).execute( AV7EmprCod, AV53barcodm, AV54barcodreom, AV55barcodparm) ;
            GXv_int8[0] = AV56clicod ;
            GXv_char4[0] = AV57barser ;
            GXv_char3[0] = AV58barcolnom ;
            GXv_int9[0] = AV59Barcolnum ;
            GXv_int7[0] = AV60bartipcol ;
            GXv_char2[0] = AV61Barnomcli ;
            GXv_int10[0] = AV62Barnumcli ;
            new app.gestionlaboratorio.obtengodatoshdr(remoteHandle, context).execute( AV7EmprCod, AV53barcodm, AV54barcodreom, AV55barcodparm, GXv_int8, GXv_char4, GXv_char3, GXv_int9, GXv_int7, GXv_char2, GXv_int10) ;
            recetasdetinte_agrupacion_registro_impl.this.AV56clicod = GXv_int8[0] ;
            recetasdetinte_agrupacion_registro_impl.this.AV57barser = GXv_char4[0] ;
            recetasdetinte_agrupacion_registro_impl.this.AV58barcolnom = GXv_char3[0] ;
            recetasdetinte_agrupacion_registro_impl.this.AV59Barcolnum = GXv_int9[0] ;
            recetasdetinte_agrupacion_registro_impl.this.AV60bartipcol = GXv_int7[0] ;
            recetasdetinte_agrupacion_registro_impl.this.AV61Barnomcli = GXv_char2[0] ;
            recetasdetinte_agrupacion_registro_impl.this.AV62Barnumcli = GXv_int10[0] ;
            httpContext.popup(formatLink("app.gestionlaboratorio.cambiocolorenhdragrupada", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV53barcodm,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV54barcodreom,1,0)),GXutil.URLEncode(GXutil.rtrim(AV55barcodparm)),GXutil.URLEncode(GXutil.ltrimstr(AV56clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57barser)),GXutil.URLEncode(GXutil.rtrim(AV58barcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV59Barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV60bartipcol,2,0)),GXutil.URLEncode(GXutil.rtrim(AV61Barnomcli)),GXutil.URLEncode(GXutil.ltrimstr(AV62Barnumcli,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","BarSer","BarColNom","BarColNum","BarTipCol","BarNomCli","BarNumCli"}) , new Object[] {"AV7EmprCod","AV53barcodm","AV54barcodreom","AV55barcodparm","AV56clicod","AV57barser","AV58barcolnom","AV59Barcolnum","AV60bartipcol","AV61Barnomcli","AV62Barnumcli"});
         }
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e131RK2( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      AV52Window.setAutoresize( 0 );
      AV52Window.setWidth( 1600 );
      AV52Window.setHeight( 900 );
      /* Window Datatype Object Property */
      AV52Window.setUrl( formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A119BarAgrCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A124BarAgrReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A122BarAgrPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(6,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"})  );
      AV52Window.setReturnParms(new Object[] {"A396EmprCod","A119BarAgrCod","A124BarAgrReo","A122BarAgrPar","","",});
      httpContext.newWindow(AV52Window);
      /*  Sending Event outputs  */
   }

   public void zm1RK13( int GX_JID )
   {
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1508CliCodAgr = T01RK3_A1508CliCodAgr[0] ;
            Z1245BarAgrSer = T01RK3_A1245BarAgrSer[0] ;
            Z1510ColNomAgr = T01RK3_A1510ColNomAgr[0] ;
            Z1512ColNumAgr = T01RK3_A1512ColNumAgr[0] ;
            Z1507BarAgrDsc = T01RK3_A1507BarAgrDsc[0] ;
            Z590KgmAgr = T01RK3_A590KgmAgr[0] ;
            Z869MtrAgr = T01RK3_A869MtrAgr[0] ;
            Z671PieAgr = T01RK3_A671PieAgr[0] ;
            Z1513DisCodAgr = T01RK3_A1513DisCodAgr[0] ;
            Z1509ColNoCAgr = T01RK3_A1509ColNoCAgr[0] ;
            Z1511ColNuCAgr = T01RK3_A1511ColNuCAgr[0] ;
            Z1649BarAgrDNu = T01RK3_A1649BarAgrDNu[0] ;
         }
         else
         {
            Z1508CliCodAgr = A1508CliCodAgr ;
            Z1245BarAgrSer = A1245BarAgrSer ;
            Z1510ColNomAgr = A1510ColNomAgr ;
            Z1512ColNumAgr = A1512ColNumAgr ;
            Z1507BarAgrDsc = A1507BarAgrDsc ;
            Z590KgmAgr = A590KgmAgr ;
            Z869MtrAgr = A869MtrAgr ;
            Z671PieAgr = A671PieAgr ;
            Z1513DisCodAgr = A1513DisCodAgr ;
            Z1509ColNoCAgr = A1509ColNoCAgr ;
            Z1511ColNuCAgr = A1511ColNuCAgr ;
            Z1649BarAgrDNu = A1649BarAgrDNu ;
         }
      }
      if ( GX_JID == -40 )
      {
         Z119BarAgrCod = A119BarAgrCod ;
         Z124BarAgrReo = A124BarAgrReo ;
         Z122BarAgrPar = A122BarAgrPar ;
         Z1508CliCodAgr = A1508CliCodAgr ;
         Z1245BarAgrSer = A1245BarAgrSer ;
         Z1510ColNomAgr = A1510ColNomAgr ;
         Z1512ColNumAgr = A1512ColNumAgr ;
         Z1507BarAgrDsc = A1507BarAgrDsc ;
         Z590KgmAgr = A590KgmAgr ;
         Z869MtrAgr = A869MtrAgr ;
         Z671PieAgr = A671PieAgr ;
         Z1513DisCodAgr = A1513DisCodAgr ;
         Z1509ColNoCAgr = A1509ColNoCAgr ;
         Z1511ColNuCAgr = A1511ColNuCAgr ;
         Z1649BarAgrDNu = A1649BarAgrDNu ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z2759BarMaqGru = A2759BarMaqGru ;
         Z143BarDisNum = A143BarDisNum ;
         Z120BarAgrEst = A120BarAgrEst ;
         Z180BarMaqCod = A180BarMaqCod ;
         Z236BarVolMaq = A236BarVolMaq ;
         Z213BarSit = A213BarSit ;
         Z212BarSer = A212BarSer ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z252CliCod = A252CliCod ;
         Z13846BarAgrCant = A13846BarAgrCant ;
         Z1653FindDes = A1653FindDes ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), true);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), true);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), true);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), true);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), true);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), true);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), true);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), true);
      AV63Pgmname = "RecetasdeTinte_Agrupacion_Registro" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Pgmname", AV63Pgmname);
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), true);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), true);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), true);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), true);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), true);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), true);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), true);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01RK4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01RK4_A407EmprNom[0] ;
      n407EmprNom = T01RK4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV8BarCod) )
      {
         A129BarCod = AV8BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      if ( ! (0==AV9BarCodReo) )
      {
         A132BarCodReo = AV9BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         A130BarCodPar = AV10BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Using cursor T01RK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A2759BarMaqGru = T01RK5_A2759BarMaqGru[0] ;
      A143BarDisNum = T01RK5_A143BarDisNum[0] ;
      A120BarAgrEst = T01RK5_A120BarAgrEst[0] ;
      A180BarMaqCod = T01RK5_A180BarMaqCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A236BarVolMaq = T01RK5_A236BarVolMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
      A213BarSit = T01RK5_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A212BarSer = T01RK5_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A135BarColNom = T01RK5_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01RK5_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A4812BarEncCli = T01RK5_A4812BarEncCli[0] ;
      A252CliCod = T01RK5_A252CliCod[0] ;
      n252CliCod = T01RK5_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(3);
      GXt_char1 = A13878PedidoClie ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A4812BarEncCli ;
      GXv_char2[0] = A143BarDisNum ;
      GXv_char11[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char11) ;
      recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char4[0] ;
      recetasdetinte_agrupacion_registro_impl.this.A4812BarEncCli = GXv_char3[0] ;
      recetasdetinte_agrupacion_registro_impl.this.A143BarDisNum = GXv_char2[0] ;
      recetasdetinte_agrupacion_registro_impl.this.GXt_char1 = GXv_char11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      /* Using cursor T01RK9 */
      pr_default.execute(5, new Object[] {A180BarMaqCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A478FindVolMax = T01RK9_A478FindVolMax[0] ;
         A479FindVolMed = T01RK9_A479FindVolMed[0] ;
         A480FindVolMin = T01RK9_A480FindVolMin[0] ;
      }
      else
      {
         A478FindVolMax = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A478FindVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(A478FindVolMax), 5, 0));
         A479FindVolMed = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A479FindVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(A479FindVolMed), 5, 0));
         A480FindVolMin = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A480FindVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A480FindVolMin), 5, 0));
      }
      pr_default.close(5);
      /* Using cursor T01RK11 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A13846BarAgrCant = T01RK11_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T01RK11_n13846BarAgrCant[0] ;
      }
      else
      {
         A13846BarAgrCant = DecimalUtil.doubleToDec(0) ;
         n13846BarAgrCant = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13846BarAgrCant", GXutil.ltrimstr( A13846BarAgrCant, 9, 2));
      }
      pr_default.close(6);
      A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13696BarNHdr", A13696BarNHdr);
      if ( ! (0==AV11BarAgrCod) )
      {
         A119BarAgrCod = AV11BarAgrCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
      }
      if ( ! (0==AV11BarAgrCod) )
      {
         edtBarAgrCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), true);
      }
      else
      {
         edtBarAgrCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11BarAgrCod) )
      {
         edtBarAgrCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12BarAgrReo) )
      {
         A124BarAgrReo = AV12BarAgrReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
      }
      if ( ! (0==AV12BarAgrReo) )
      {
         edtBarAgrReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), true);
      }
      else
      {
         edtBarAgrReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12BarAgrReo) )
      {
         edtBarAgrReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV13BarAgrPar)==0) )
      {
         A122BarAgrPar = AV13BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      }
      if ( ! (GXutil.strcmp("", AV13BarAgrPar)==0) )
      {
         edtBarAgrPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), true);
      }
      else
      {
         edtBarAgrPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV13BarAgrPar)==0) )
      {
         edtBarAgrPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), true);
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
         /* Using cursor T01RK7 */
         pr_default.execute(4, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
         if ( (pr_default.getStatus(4) != 101) )
         {
            A121BarAgrKgm = T01RK7_A121BarAgrKgm[0] ;
            A868BarAgrMtr = T01RK7_A868BarAgrMtr[0] ;
            A1650BarAgrNDes = T01RK7_A1650BarAgrNDes[0] ;
            A1651BarPNDes = T01RK7_A1651BarPNDes[0] ;
         }
         else
         {
            A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
            A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
            A1650BarAgrNDes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
            A1651BarPNDes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
         }
         pr_default.close(4);
         /* Using cursor T01RK12 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(7) != 101) )
         {
            A1653FindDes = T01RK12_A1653FindDes[0] ;
            n1653FindDes = T01RK12_n1653FindDes[0] ;
         }
         else
         {
            A1653FindDes = " " ;
            n1653FindDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         }
         pr_default.close(7);
         if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A123BarAgrPie = A1650BarAgrNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         }
         else
         {
            A123BarAgrPie = A1651BarPNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         }
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
      }
   }

   public void load1RK13( )
   {
      /* Using cursor T01RK15 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A2759BarMaqGru = T01RK15_A2759BarMaqGru[0] ;
         A1508CliCodAgr = T01RK15_A1508CliCodAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         A1245BarAgrSer = T01RK15_A1245BarAgrSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         A1510ColNomAgr = T01RK15_A1510ColNomAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         A1512ColNumAgr = T01RK15_A1512ColNumAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         A1507BarAgrDsc = T01RK15_A1507BarAgrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         A590KgmAgr = T01RK15_A590KgmAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         A869MtrAgr = T01RK15_A869MtrAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         A671PieAgr = T01RK15_A671PieAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         A407EmprNom = T01RK15_A407EmprNom[0] ;
         n407EmprNom = T01RK15_n407EmprNom[0] ;
         A143BarDisNum = T01RK15_A143BarDisNum[0] ;
         A120BarAgrEst = T01RK15_A120BarAgrEst[0] ;
         A180BarMaqCod = T01RK15_A180BarMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         A236BarVolMaq = T01RK15_A236BarVolMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         A213BarSit = T01RK15_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01RK15_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A135BarColNom = T01RK15_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01RK15_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A1513DisCodAgr = T01RK15_A1513DisCodAgr[0] ;
         A1509ColNoCAgr = T01RK15_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = T01RK15_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = T01RK15_A1649BarAgrDNu[0] ;
         A4812BarEncCli = T01RK15_A4812BarEncCli[0] ;
         A252CliCod = T01RK15_A252CliCod[0] ;
         n252CliCod = T01RK15_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A13846BarAgrCant = T01RK15_A13846BarAgrCant[0] ;
         n13846BarAgrCant = T01RK15_n13846BarAgrCant[0] ;
         A1653FindDes = T01RK15_A1653FindDes[0] ;
         n1653FindDes = T01RK15_n1653FindDes[0] ;
         zm1RK13( -40) ;
      }
      pr_default.close(9);
      onLoadActions1RK13( ) ;
   }

   public void onLoadActions1RK13( )
   {
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
      /* Using cursor T01RK7 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A121BarAgrKgm = T01RK7_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RK7_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RK7_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RK7_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      pr_default.close(4);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
   }

   public void checkExtendedTable1RK13( )
   {
      nIsDirty_13 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_13 = (short)(1) ;
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
      nIsDirty_13 = (short)(1) ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
      if ( true /* After */ )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A119BarAgrCod ;
         GXv_int7[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_int12[0] = (byte)(AV43ok_hdr) ;
         GXv_char3[0] = AV44Baragrest ;
         new app.formulaciontinte.controlhdrexisteyagrupada(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int7, GXv_char4, GXv_int12, GXv_char3) ;
         recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char11[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A119BarAgrCod = GXv_int10[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A124BarAgrReo = GXv_int7[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A122BarAgrPar = GXv_char4[0] ;
         recetasdetinte_agrupacion_registro_impl.this.AV43ok_hdr = GXv_int12[0] ;
         recetasdetinte_agrupacion_registro_impl.this.AV44Baragrest = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV43ok_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ok_hdr), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44Baragrest", AV44Baragrest);
      }
      if ( true /* Level */ && ( GXutil.strcmp(AV44Baragrest, "S") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El Nº Hdr,  ya esta agrupada", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01RK7 */
      pr_default.execute(4, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A121BarAgrKgm = T01RK7_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RK7_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RK7_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RK7_A1651BarPNDes[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         nIsDirty_13 = (short)(1) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         nIsDirty_13 = (short)(1) ;
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         nIsDirty_13 = (short)(1) ;
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      pr_default.close(4);
      /* Using cursor T01RK12 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1653FindDes = T01RK12_A1653FindDes[0] ;
         n1653FindDes = T01RK12_n1653FindDes[0] ;
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A1653FindDes = " " ;
         n1653FindDes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      }
      pr_default.close(7);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1650BarAgrNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      else
      {
         nIsDirty_13 = (short)(1) ;
         A123BarAgrPie = A1651BarPNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      }
      if ( isIns( )  )
      {
         GXv_char11[0] = A396EmprCod ;
         GXv_int10[0] = A119BarAgrCod ;
         GXv_int12[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_int9[0] = A1508CliCodAgr ;
         GXv_char3[0] = A1245BarAgrSer ;
         GXv_char2[0] = A1510ColNomAgr ;
         GXv_int8[0] = A1512ColNumAgr ;
         GXv_char13[0] = A1507BarAgrDsc ;
         GXv_decimal14[0] = A590KgmAgr ;
         GXv_decimal15[0] = A869MtrAgr ;
         GXv_int16[0] = A671PieAgr ;
         new app.datoshdragrupacion(remoteHandle, context).execute( GXv_char11, GXv_int10, GXv_int12, GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int8, GXv_char13, GXv_decimal14, GXv_decimal15, GXv_int16) ;
         recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char11[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A119BarAgrCod = GXv_int10[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A124BarAgrReo = GXv_int12[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A122BarAgrPar = GXv_char4[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A1508CliCodAgr = GXv_int9[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A1245BarAgrSer = GXv_char3[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A1510ColNomAgr = GXv_char2[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A1512ColNumAgr = GXv_int8[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A1507BarAgrDsc = GXv_char13[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A590KgmAgr = GXv_decimal14[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A869MtrAgr = GXv_decimal15[0] ;
         recetasdetinte_agrupacion_registro_impl.this.A671PieAgr = (short)((short)(GXv_int16[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
      }
   }

   public void closeExtendedTableCursors1RK13( )
   {
      pr_default.close(4);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_43( String A396EmprCod ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T01RK17 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A121BarAgrKgm = T01RK17_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RK17_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RK17_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RK17_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
         A1650BarAgrNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
         A1651BarPNDes = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_46( String A396EmprCod ,
                          int A119BarAgrCod ,
                          byte A124BarAgrReo ,
                          String A122BarAgrPar )
   {
      /* Using cursor T01RK18 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A1653FindDes = T01RK18_A1653FindDes[0] ;
         n1653FindDes = T01RK18_n1653FindDes[0] ;
      }
      else
      {
         A1653FindDes = " " ;
         n1653FindDes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1653FindDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1RK13( )
   {
      /* Using cursor T01RK19 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound13 = (short)(1) ;
      }
      else
      {
         RcdFound13 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01RK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1RK13( 40) ;
         RcdFound13 = (short)(1) ;
         A119BarAgrCod = T01RK3_A119BarAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = T01RK3_A124BarAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = T01RK3_A122BarAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         A1508CliCodAgr = T01RK3_A1508CliCodAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         A1245BarAgrSer = T01RK3_A1245BarAgrSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         A1510ColNomAgr = T01RK3_A1510ColNomAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         A1512ColNumAgr = T01RK3_A1512ColNumAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         A1507BarAgrDsc = T01RK3_A1507BarAgrDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         A590KgmAgr = T01RK3_A590KgmAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         A869MtrAgr = T01RK3_A869MtrAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         A671PieAgr = T01RK3_A671PieAgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         A1513DisCodAgr = T01RK3_A1513DisCodAgr[0] ;
         A1509ColNoCAgr = T01RK3_A1509ColNoCAgr[0] ;
         A1511ColNuCAgr = T01RK3_A1511ColNuCAgr[0] ;
         A1649BarAgrDNu = T01RK3_A1649BarAgrDNu[0] ;
         A396EmprCod = T01RK3_A396EmprCod[0] ;
         A129BarCod = T01RK3_A129BarCod[0] ;
         A132BarCodReo = T01RK3_A132BarCodReo[0] ;
         A130BarCodPar = T01RK3_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z119BarAgrCod = A119BarAgrCod ;
         Z124BarAgrReo = A124BarAgrReo ;
         Z122BarAgrPar = A122BarAgrPar ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1RK13( ) ;
         if ( AnyError == 1 )
         {
            RcdFound13 = (short)(0) ;
            initializeNonKey1RK13( ) ;
         }
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound13 = (short)(0) ;
         initializeNonKey1RK13( ) ;
         sMode13 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode13 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1RK13( ) ;
      if ( RcdFound13 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound13 = (short)(0) ;
      /* Using cursor T01RK20 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A119BarAgrCod), Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A122BarAgrPar, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A396EmprCod, A396EmprCod, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A130BarCodPar});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01RK20_A119BarAgrCod[0] < A119BarAgrCod ) || ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK20_A124BarAgrReo[0] < A124BarAgrReo ) || ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) < 0 ) || ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK20_A129BarCod[0] < A129BarCod ) || ( T01RK20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK20_A132BarCodReo[0] < A132BarCodReo ) || ( T01RK20_A132BarCodReo[0] == A132BarCodReo ) && ( T01RK20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK20_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01RK20_A119BarAgrCod[0] > A119BarAgrCod ) || ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK20_A124BarAgrReo[0] > A124BarAgrReo ) || ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) > 0 ) || ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK20_A129BarCod[0] > A129BarCod ) || ( T01RK20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK20_A132BarCodReo[0] > A132BarCodReo ) || ( T01RK20_A132BarCodReo[0] == A132BarCodReo ) && ( T01RK20_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK20_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK20_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK20_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK20_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK20_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            A119BarAgrCod = T01RK20_A119BarAgrCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            A124BarAgrReo = T01RK20_A124BarAgrReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            A122BarAgrPar = T01RK20_A122BarAgrPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
            A396EmprCod = T01RK20_A396EmprCod[0] ;
            A129BarCod = T01RK20_A129BarCod[0] ;
            A132BarCodReo = T01RK20_A132BarCodReo[0] ;
            A130BarCodPar = T01RK20_A130BarCodPar[0] ;
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound13 = (short)(0) ;
      /* Using cursor T01RK21 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A119BarAgrCod), Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A122BarAgrPar, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A396EmprCod, A396EmprCod, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A122BarAgrPar, Byte.valueOf(A124BarAgrReo), Integer.valueOf(A119BarAgrCod), A130BarCodPar});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01RK21_A119BarAgrCod[0] > A119BarAgrCod ) || ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK21_A124BarAgrReo[0] > A124BarAgrReo ) || ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) > 0 ) || ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK21_A129BarCod[0] > A129BarCod ) || ( T01RK21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK21_A132BarCodReo[0] > A132BarCodReo ) || ( T01RK21_A132BarCodReo[0] == A132BarCodReo ) && ( T01RK21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK21_A130BarCodPar[0], A130BarCodPar) > 0 ) ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01RK21_A119BarAgrCod[0] < A119BarAgrCod ) || ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK21_A124BarAgrReo[0] < A124BarAgrReo ) || ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) < 0 ) || ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK21_A129BarCod[0] < A129BarCod ) || ( T01RK21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( T01RK21_A132BarCodReo[0] < A132BarCodReo ) || ( T01RK21_A132BarCodReo[0] == A132BarCodReo ) && ( T01RK21_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01RK21_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01RK21_A122BarAgrPar[0], A122BarAgrPar) == 0 ) && ( T01RK21_A124BarAgrReo[0] == A124BarAgrReo ) && ( T01RK21_A119BarAgrCod[0] == A119BarAgrCod ) && ( GXutil.strcmp(T01RK21_A130BarCodPar[0], A130BarCodPar) < 0 ) ) )
         {
            A119BarAgrCod = T01RK21_A119BarAgrCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            A124BarAgrReo = T01RK21_A124BarAgrReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            A122BarAgrPar = T01RK21_A122BarAgrPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
            A396EmprCod = T01RK21_A396EmprCod[0] ;
            A129BarCod = T01RK21_A129BarCod[0] ;
            A132BarCodReo = T01RK21_A132BarCodReo[0] ;
            A130BarCodPar = T01RK21_A130BarCodPar[0] ;
            RcdFound13 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1RK13( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1RK13( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound13 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A119BarAgrCod = Z119BarAgrCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
               A124BarAgrReo = Z124BarAgrReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
               A122BarAgrPar = Z122BarAgrPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "BARAGRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1RK13( ) ;
               GX_FocusControl = edtBarAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtBarAgrCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1RK13( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "BARAGRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarAgrCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtBarAgrCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1RK13( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A119BarAgrCod != Z119BarAgrCod ) || ( A124BarAgrReo != Z124BarAgrReo ) || ( GXutil.strcmp(A122BarAgrPar, Z122BarAgrPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A119BarAgrCod = Z119BarAgrCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = Z124BarAgrReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = Z122BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "BARAGRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1RK13( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01RK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z1508CliCodAgr != T01RK2_A1508CliCodAgr[0] ) || ( GXutil.strcmp(Z1245BarAgrSer, T01RK2_A1245BarAgrSer[0]) != 0 ) || ( GXutil.strcmp(Z1510ColNomAgr, T01RK2_A1510ColNomAgr[0]) != 0 ) || ( Z1512ColNumAgr != T01RK2_A1512ColNumAgr[0] ) || ( GXutil.strcmp(Z1507BarAgrDsc, T01RK2_A1507BarAgrDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z590KgmAgr, T01RK2_A590KgmAgr[0]) != 0 ) || ( DecimalUtil.compareTo(Z869MtrAgr, T01RK2_A869MtrAgr[0]) != 0 ) || ( Z671PieAgr != T01RK2_A671PieAgr[0] ) || ( Z1513DisCodAgr != T01RK2_A1513DisCodAgr[0] ) || ( GXutil.strcmp(Z1509ColNoCAgr, T01RK2_A1509ColNoCAgr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1511ColNuCAgr != T01RK2_A1511ColNuCAgr[0] ) || ( GXutil.strcmp(Z1649BarAgrDNu, T01RK2_A1649BarAgrDNu[0]) != 0 ) )
         {
            if ( Z1508CliCodAgr != T01RK2_A1508CliCodAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"CliCodAgr");
               GXutil.writeLogRaw("Old: ",Z1508CliCodAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A1508CliCodAgr[0]);
            }
            if ( GXutil.strcmp(Z1245BarAgrSer, T01RK2_A1245BarAgrSer[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"BarAgrSer");
               GXutil.writeLogRaw("Old: ",Z1245BarAgrSer);
               GXutil.writeLogRaw("Current: ",T01RK2_A1245BarAgrSer[0]);
            }
            if ( GXutil.strcmp(Z1510ColNomAgr, T01RK2_A1510ColNomAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"ColNomAgr");
               GXutil.writeLogRaw("Old: ",Z1510ColNomAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A1510ColNomAgr[0]);
            }
            if ( Z1512ColNumAgr != T01RK2_A1512ColNumAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"ColNumAgr");
               GXutil.writeLogRaw("Old: ",Z1512ColNumAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A1512ColNumAgr[0]);
            }
            if ( GXutil.strcmp(Z1507BarAgrDsc, T01RK2_A1507BarAgrDsc[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"BarAgrDsc");
               GXutil.writeLogRaw("Old: ",Z1507BarAgrDsc);
               GXutil.writeLogRaw("Current: ",T01RK2_A1507BarAgrDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z590KgmAgr, T01RK2_A590KgmAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"KgmAgr");
               GXutil.writeLogRaw("Old: ",Z590KgmAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A590KgmAgr[0]);
            }
            if ( DecimalUtil.compareTo(Z869MtrAgr, T01RK2_A869MtrAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"MtrAgr");
               GXutil.writeLogRaw("Old: ",Z869MtrAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A869MtrAgr[0]);
            }
            if ( Z671PieAgr != T01RK2_A671PieAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"PieAgr");
               GXutil.writeLogRaw("Old: ",Z671PieAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A671PieAgr[0]);
            }
            if ( Z1513DisCodAgr != T01RK2_A1513DisCodAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"DisCodAgr");
               GXutil.writeLogRaw("Old: ",Z1513DisCodAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A1513DisCodAgr[0]);
            }
            if ( GXutil.strcmp(Z1509ColNoCAgr, T01RK2_A1509ColNoCAgr[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"ColNoCAgr");
               GXutil.writeLogRaw("Old: ",Z1509ColNoCAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A1509ColNoCAgr[0]);
            }
            if ( Z1511ColNuCAgr != T01RK2_A1511ColNuCAgr[0] )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"ColNuCAgr");
               GXutil.writeLogRaw("Old: ",Z1511ColNuCAgr);
               GXutil.writeLogRaw("Current: ",T01RK2_A1511ColNuCAgr[0]);
            }
            if ( GXutil.strcmp(Z1649BarAgrDNu, T01RK2_A1649BarAgrDNu[0]) != 0 )
            {
               GXutil.writeLogln("recetasdetinte_agrupacion_registro:[seudo value changed for attri]"+"BarAgrDNu");
               GXutil.writeLogRaw("Old: ",Z1649BarAgrDNu);
               GXutil.writeLogRaw("Current: ",T01RK2_A1649BarAgrDNu[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARAGR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1RK13( )
   {
      beforeValidate1RK13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RK13( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1RK13( 0) ;
         checkOptimisticConcurrency1RK13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RK13( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1RK13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RK22 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, Integer.valueOf(A1508CliCodAgr), A1245BarAgrSer, A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1507BarAgrDsc, A590KgmAgr, A869MtrAgr, Short.valueOf(A671PieAgr), Integer.valueOf(A1513DisCodAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(15) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        GXv_char13[0] = A396EmprCod ;
                        GXv_int16[0] = A129BarCod ;
                        GXv_int12[0] = A132BarCodReo ;
                        GXv_char11[0] = A130BarCodPar ;
                        GXv_int10[0] = A119BarAgrCod ;
                        GXv_int7[0] = A124BarAgrReo ;
                        GXv_char4[0] = A122BarAgrPar ;
                        GXv_char3[0] = A180BarMaqCod ;
                        GXv_int9[0] = A236BarVolMaq ;
                        GXv_int17[0] = A671PieAgr ;
                        GXv_decimal15[0] = A590KgmAgr ;
                        GXv_decimal14[0] = A869MtrAgr ;
                        new app.pcreagr(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int10, GXv_int7, GXv_char4, GXv_char3, GXv_int9, GXv_int17, GXv_decimal15, GXv_decimal14) ;
                        recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char13[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A129BarCod = GXv_int16[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A132BarCodReo = GXv_int12[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A130BarCodPar = GXv_char11[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A119BarAgrCod = GXv_int10[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A124BarAgrReo = GXv_int7[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A122BarAgrPar = GXv_char4[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A180BarMaqCod = GXv_char3[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A236BarVolMaq = GXv_int9[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A671PieAgr = GXv_int17[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A590KgmAgr = GXv_decimal15[0] ;
                        recetasdetinte_agrupacion_registro_impl.this.A869MtrAgr = GXv_decimal14[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
                        httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
                        httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1RK0( ) ;
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
            load1RK13( ) ;
         }
         endLevel1RK13( ) ;
      }
      closeExtendedTableCursors1RK13( ) ;
   }

   public void update1RK13( )
   {
      beforeValidate1RK13( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1RK13( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RK13( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1RK13( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1RK13( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01RK23 */
                  pr_default.execute(16, new Object[] {Integer.valueOf(A1508CliCodAgr), A1245BarAgrSer, A1510ColNomAgr, Integer.valueOf(A1512ColNumAgr), A1507BarAgrDsc, A590KgmAgr, A869MtrAgr, Short.valueOf(A671PieAgr), Integer.valueOf(A1513DisCodAgr), A1509ColNoCAgr, Integer.valueOf(A1511ColNuCAgr), A1649BarAgrDNu, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARAGR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1RK13( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
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
         endLevel1RK13( ) ;
      }
      closeExtendedTableCursors1RK13( ) ;
   }

   public void deferredUpdate1RK13( )
   {
   }

   public void delete( )
   {
      beforeValidate1RK13( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1RK13( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1RK13( ) ;
         afterConfirm1RK13( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1RK13( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01RK24 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARAGR");
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
      sMode13 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1RK13( ) ;
      Gx_mode = sMode13 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1RK13( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            GXv_char13[0] = A396EmprCod ;
            GXv_int16[0] = A119BarAgrCod ;
            GXv_int12[0] = A124BarAgrReo ;
            GXv_char11[0] = A122BarAgrPar ;
            GXv_int10[0] = A1508CliCodAgr ;
            GXv_char4[0] = A1245BarAgrSer ;
            GXv_char3[0] = A1510ColNomAgr ;
            GXv_int9[0] = A1512ColNumAgr ;
            GXv_char2[0] = A1507BarAgrDsc ;
            GXv_decimal15[0] = A590KgmAgr ;
            GXv_decimal14[0] = A869MtrAgr ;
            GXv_int8[0] = A671PieAgr ;
            new app.datoshdragrupacion(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int10, GXv_char4, GXv_char3, GXv_int9, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_int8) ;
            recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char13[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A119BarAgrCod = GXv_int16[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A124BarAgrReo = GXv_int12[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A122BarAgrPar = GXv_char11[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A1508CliCodAgr = GXv_int10[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A1245BarAgrSer = GXv_char4[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A1510ColNomAgr = GXv_char3[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A1512ColNumAgr = GXv_int9[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A1507BarAgrDsc = GXv_char2[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A590KgmAgr = GXv_decimal15[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A869MtrAgr = GXv_decimal14[0] ;
            recetasdetinte_agrupacion_registro_impl.this.A671PieAgr = (short)((short)(GXv_int8[0])) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
            httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
            httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
            httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
            httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         }
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
         /* Using cursor T01RK26 */
         pr_default.execute(18, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            A121BarAgrKgm = T01RK26_A121BarAgrKgm[0] ;
            A868BarAgrMtr = T01RK26_A868BarAgrMtr[0] ;
            A1650BarAgrNDes = T01RK26_A1650BarAgrNDes[0] ;
            A1651BarPNDes = T01RK26_A1651BarPNDes[0] ;
         }
         else
         {
            A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
            A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
            A1650BarAgrNDes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
            A1651BarPNDes = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
         }
         pr_default.close(18);
         /* Using cursor T01RK27 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A1653FindDes = T01RK27_A1653FindDes[0] ;
            n1653FindDes = T01RK27_n1653FindDes[0] ;
         }
         else
         {
            A1653FindDes = " " ;
            n1653FindDes = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
         }
         pr_default.close(19);
         if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A123BarAgrPie = A1650BarAgrNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         }
         else
         {
            A123BarAgrPie = A1651BarPNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
         }
      }
   }

   public void endLevel1RK13( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1RK13( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "recetasdetinte_agrupacion_registro");
         if ( AnyError == 0 )
         {
            confirmValues1RK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "recetasdetinte_agrupacion_registro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1RK13( )
   {
      /* Scan By routine */
      /* Using cursor T01RK28 */
      pr_default.execute(20);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A396EmprCod = T01RK28_A396EmprCod[0] ;
         A129BarCod = T01RK28_A129BarCod[0] ;
         A132BarCodReo = T01RK28_A132BarCodReo[0] ;
         A130BarCodPar = T01RK28_A130BarCodPar[0] ;
         A119BarAgrCod = T01RK28_A119BarAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = T01RK28_A124BarAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = T01RK28_A122BarAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1RK13( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound13 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound13 = (short)(1) ;
         A396EmprCod = T01RK28_A396EmprCod[0] ;
         A129BarCod = T01RK28_A129BarCod[0] ;
         A132BarCodReo = T01RK28_A132BarCodReo[0] ;
         A130BarCodPar = T01RK28_A130BarCodPar[0] ;
         A119BarAgrCod = T01RK28_A119BarAgrCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         A124BarAgrReo = T01RK28_A124BarAgrReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         A122BarAgrPar = T01RK28_A122BarAgrPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      }
   }

   public void scanEnd1RK13( )
   {
      pr_default.close(20);
   }

   public void afterConfirm1RK13( )
   {
      /* After Confirm Rules */
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_int12[0] = (byte)(AV48FlagRec) ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int12) ;
         recetasdetinte_agrupacion_registro_impl.this.AV48FlagRec = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48FlagRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48FlagRec), 4, 0));
      }
      if ( ( A129BarCod == A119BarAgrCod ) && ( A132BarCodReo == A124BarAgrReo ) && ( GXutil.strcmp(A130BarCodPar, A122BarAgrPar) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Misma Hdr en Cabecera que en Lineas", ""), 1, "BARAGRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (0==AV43ok_hdr) && true /* Level */ && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hoja de ruta inexistente", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( true /* Level */ && true /* After */ && ( AV48FlagRec == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Esta Hoja de Ruta tiene RECETA. Cerrar primero", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1RK13( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1RK13( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1RK13( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1RK13( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1RK13( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1RK13( )
   {
      edtBarNHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtPedidoClie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedidoClie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedidoClie_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMaqCod_Enabled), 5, 0), true);
      edtBarVolMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarVolMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarVolMaq_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtBarAgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrCod_Enabled), 5, 0), true);
      edtBarAgrReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrReo_Enabled), 5, 0), true);
      edtBarAgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrPar_Enabled), 5, 0), true);
      edtCliCodAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCodAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCodAgr_Enabled), 5, 0), true);
      edtBarAgrSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrSer_Enabled), 5, 0), true);
      edtBarAgrDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAgrDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAgrDsc_Enabled), 5, 0), true);
      edtColNomAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomAgr_Enabled), 5, 0), true);
      edtColNumAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNumAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNumAgr_Enabled), 5, 0), true);
      edtKgmAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtKgmAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtKgmAgr_Enabled), 5, 0), true);
      edtMtrAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMtrAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMtrAgr_Enabled), 5, 0), true);
      edtPieAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPieAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPieAgr_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtFindBarAgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFindBarAgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFindBarAgr_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1RK13( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1RK0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdetinte_agrupacion_registro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarAgrCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarAgrReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarAgrPar))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarAgrCod","BarAgrReo","BarAgrPar"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetasdeTinte_Agrupacion_Registro");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("DisCodAgr", localUtil.format( DecimalUtil.doubleToDec(A1513DisCodAgr), "ZZZZZZZ9"));
      forbiddenHiddens.add("ColNoCAgr", GXutil.rtrim( localUtil.format( A1509ColNoCAgr, "")));
      forbiddenHiddens.add("ColNuCAgr", localUtil.format( DecimalUtil.doubleToDec(A1511ColNuCAgr), "ZZZZZ9"));
      forbiddenHiddens.add("BarAgrDNu", GXutil.rtrim( localUtil.format( A1649BarAgrDNu, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetasdetinte_agrupacion_registro:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z119BarAgrCod", GXutil.ltrim( localUtil.ntoc( Z119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z124BarAgrReo", GXutil.ltrim( localUtil.ntoc( Z124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z122BarAgrPar", GXutil.rtrim( Z122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1508CliCodAgr", GXutil.ltrim( localUtil.ntoc( Z1508CliCodAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1245BarAgrSer", GXutil.rtrim( Z1245BarAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1510ColNomAgr", GXutil.rtrim( Z1510ColNomAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1512ColNumAgr", GXutil.ltrim( localUtil.ntoc( Z1512ColNumAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1507BarAgrDsc", GXutil.rtrim( Z1507BarAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z590KgmAgr", GXutil.ltrim( localUtil.ntoc( Z590KgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z869MtrAgr", GXutil.ltrim( localUtil.ntoc( Z869MtrAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z671PieAgr", GXutil.ltrim( localUtil.ntoc( Z671PieAgr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1513DisCodAgr", GXutil.ltrim( localUtil.ntoc( Z1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1509ColNoCAgr", GXutil.rtrim( Z1509ColNoCAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1511ColNuCAgr", GXutil.ltrim( localUtil.ntoc( Z1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1649BarAgrDNu", GXutil.rtrim( Z1649BarAgrDNu));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vWCKGCOL", GXutil.ltrim( localUtil.ntoc( AV27Wckgcol, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWCKGCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV27Wckgcol), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCODVI", GXutil.rtrim( A401EmprCodVi));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRNHDR", GXutil.rtrim( A13792BarAgrNhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRHDR", GXutil.rtrim( A13695BarAGrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRNDES", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDDES", GXutil.rtrim( A1653FindDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPNDES", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPIE", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGRCOD", GXutil.ltrim( localUtil.ntoc( AV11BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGRCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11BarAgrCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGRREO", GXutil.ltrim( localUtil.ntoc( AV12BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGRREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarAgrReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGRPAR", GXutil.rtrim( AV13BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARAGRPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13BarAgrPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK_HDR", GXutil.ltrim( localUtil.ntoc( AV43ok_hdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARAGREST", GXutil.rtrim( AV44Baragrest));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGREC", GXutil.ltrim( localUtil.ntoc( AV48FlagRec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCODAGR", GXutil.ltrim( localUtil.ntoc( A1513DisCodAgr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNOCAGR", GXutil.rtrim( A1509ColNoCAgr));
      app.GxWebStd.gx_hidden_field( httpContext, "COLNUCAGR", GXutil.ltrim( localUtil.ntoc( A1511ColNuCAgr, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRDNU", GXutil.rtrim( A1649BarAgrDNu));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQGRU", GXutil.rtrim( A2759BarMaqGru));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRKGM", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRMTR", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDVOLMAX", GXutil.ltrim( localUtil.ntoc( A478FindVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDVOLMED", GXutil.ltrim( localUtil.ntoc( A479FindVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FINDVOLMIN", GXutil.ltrim( localUtil.ntoc( A480FindVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCANT", GXutil.ltrim( localUtil.ntoc( A13846BarAgrCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      return formatLink("app.recetasdetinte_agrupacion_registro", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarAgrCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarAgrReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV13BarAgrPar))}, new String[] {"Gx_mode","EmprCod","BarCod","BarCodReo","BarCodPar","BarAgrCod","BarAgrReo","BarAgrPar"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeTinte_Agrupacion_Registro" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de Tinte (Agrupacion_Registro)", "") ;
   }

   public void initializeNonKey1RK13( )
   {
      AV43ok_hdr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ok_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ok_hdr), 4, 0));
      AV44Baragrest = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Baragrest", AV44Baragrest);
      AV48FlagRec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48FlagRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48FlagRec), 4, 0));
      A1508CliCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
      A1245BarAgrSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
      A1510ColNomAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
      A1512ColNumAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
      A1507BarAgrDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
      A590KgmAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
      A869MtrAgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
      A671PieAgr = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
      A123BarAgrPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A123BarAgrPie), 4, 0));
      A13695BarAGrHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
      A13792BarAgrNhdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", A13792BarAgrNhdr);
      A121BarAgrKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrimstr( A121BarAgrKgm, 9, 2));
      A868BarAgrMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrimstr( A868BarAgrMtr, 9, 2));
      A1650BarAgrNDes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1650BarAgrNDes), 4, 0));
      A1651BarPNDes = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1651BarPNDes), 4, 0));
      A1653FindDes = "" ;
      n1653FindDes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", A1653FindDes);
      A401EmprCodVi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A401EmprCodVi", A401EmprCodVi);
      A474FindBarAgr = "" ;
      n474FindBarAgr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A474FindBarAgr", A474FindBarAgr);
      A1513DisCodAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1513DisCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1513DisCodAgr), 8, 0));
      A1509ColNoCAgr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1509ColNoCAgr", A1509ColNoCAgr);
      A1511ColNuCAgr = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1511ColNuCAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1511ColNuCAgr), 6, 0));
      A1649BarAgrDNu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1649BarAgrDNu", A1649BarAgrDNu);
      Z1508CliCodAgr = 0 ;
      Z1245BarAgrSer = "" ;
      Z1510ColNomAgr = "" ;
      Z1512ColNumAgr = 0 ;
      Z1507BarAgrDsc = "" ;
      Z590KgmAgr = DecimalUtil.ZERO ;
      Z869MtrAgr = DecimalUtil.ZERO ;
      Z671PieAgr = (short)(0) ;
      Z1513DisCodAgr = 0 ;
      Z1509ColNoCAgr = "" ;
      Z1511ColNuCAgr = 0 ;
      Z1649BarAgrDNu = "" ;
   }

   public void initAll1RK13( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A119BarAgrCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
      A124BarAgrReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
      A122BarAgrPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      initializeNonKey1RK13( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415113550", true, true);
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
      httpContext.AddJavascriptSource("recetasdetinte_agrupacion_registro.js", "?202682415113550", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtPedidoClie_Internalname = "PEDIDOCLIE" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      edtBarVolMaq_Internalname = "BARVOLMAQ" ;
      edtBarSit_Internalname = "BARSIT" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtBarAgrCod_Internalname = "BARAGRCOD" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtBarAgrReo_Internalname = "BARAGRREO" ;
      edtBarAgrPar_Internalname = "BARAGRPAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtCliCodAgr_Internalname = "CLICODAGR" ;
      edtBarAgrSer_Internalname = "BARAGRSER" ;
      edtBarAgrDsc_Internalname = "BARAGRDSC" ;
      edtColNomAgr_Internalname = "COLNOMAGR" ;
      edtColNumAgr_Internalname = "COLNUMAGR" ;
      edtKgmAgr_Internalname = "KGMAGR" ;
      edtMtrAgr_Internalname = "MTRAGR" ;
      edtPieAgr_Internalname = "PIEAGR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtFindBarAgr_Internalname = "FINDBARAGR" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
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
      Form.setCaption( httpContext.getMessage( "Recetas de Tinte (Agrupacion_Registro)", "") );
      edtFindBarAgr_Jsonclick = "" ;
      edtFindBarAgr_Enabled = 0 ;
      edtFindBarAgr_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPieAgr_Jsonclick = "" ;
      edtPieAgr_Enabled = 0 ;
      edtMtrAgr_Jsonclick = "" ;
      edtMtrAgr_Enabled = 0 ;
      edtKgmAgr_Jsonclick = "" ;
      edtKgmAgr_Enabled = 0 ;
      edtColNumAgr_Jsonclick = "" ;
      edtColNumAgr_Enabled = 0 ;
      edtColNomAgr_Jsonclick = "" ;
      edtColNomAgr_Enabled = 0 ;
      edtBarAgrDsc_Jsonclick = "" ;
      edtBarAgrDsc_Enabled = 0 ;
      edtBarAgrSer_Jsonclick = "" ;
      edtBarAgrSer_Enabled = 0 ;
      edtCliCodAgr_Jsonclick = "" ;
      edtCliCodAgr_Enabled = 0 ;
      edtBarAgrPar_Jsonclick = "" ;
      edtBarAgrPar_Enabled = 1 ;
      edtBarAgrReo_Jsonclick = "" ;
      edtBarAgrReo_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      imgavPrompt_Enabled = 1 ;
      imgavPrompt_Visible = 1 ;
      edtBarAgrCod_Jsonclick = "" ;
      edtBarAgrCod_Enabled = 1 ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 0 ;
      edtBarVolMaq_Jsonclick = "" ;
      edtBarVolMaq_Enabled = 0 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtPedidoClie_Jsonclick = "" ;
      edtPedidoClie_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNHdr_Enabled = 0 ;
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

   public void gx1asapedidoclie1RK13( String A396EmprCod ,
                                      String A4812BarEncCli ,
                                      String A143BarDisNum )
   {
      GXt_char1 = A13878PedidoClie ;
      GXv_char13[0] = A396EmprCod ;
      GXv_char11[0] = A4812BarEncCli ;
      GXv_char4[0] = A143BarDisNum ;
      GXv_char3[0] = GXt_char1 ;
      new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char13, GXv_char11, GXv_char4, GXv_char3) ;
      recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char13[0] ;
      recetasdetinte_agrupacion_registro_impl.this.A4812BarEncCli = GXv_char11[0] ;
      recetasdetinte_agrupacion_registro_impl.this.A143BarDisNum = GXv_char4[0] ;
      recetasdetinte_agrupacion_registro_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A13878PedidoClie = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13878PedidoClie", A13878PedidoClie);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13878PedidoClie))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_1RK13( String A396EmprCod ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar )
   {
      if ( true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int16[0] = A119BarAgrCod ;
         GXv_int12[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int7[0] = (byte)(AV43ok_hdr) ;
         GXv_char4[0] = AV44Baragrest ;
         new app.formulaciontinte.controlhdrexisteyagrupada(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int7, GXv_char4) ;
         A396EmprCod = GXv_char13[0] ;
         A119BarAgrCod = GXv_int16[0] ;
         A124BarAgrReo = GXv_int12[0] ;
         A122BarAgrPar = GXv_char11[0] ;
         AV43ok_hdr = GXv_int7[0] ;
         AV44Baragrest = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV43ok_hdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43ok_hdr), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV44Baragrest", AV44Baragrest);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A122BarAgrPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV43ok_hdr, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV44Baragrest))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_33_1RK13( String Gx_mode ,
                            String A396EmprCod ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar )
   {
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_int12[0] = (byte)(AV48FlagRec) ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, GXv_int12) ;
         AV48FlagRec = GXv_int12[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48FlagRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48FlagRec), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV48FlagRec, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_34_1RK13( String Gx_mode ,
                            String A396EmprCod ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar )
   {
      if ( isIns( )  )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int16[0] = A119BarAgrCod ;
         GXv_int12[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int10[0] = A1508CliCodAgr ;
         GXv_char4[0] = A1245BarAgrSer ;
         GXv_char3[0] = A1510ColNomAgr ;
         GXv_int9[0] = A1512ColNumAgr ;
         GXv_char2[0] = A1507BarAgrDsc ;
         GXv_decimal15[0] = A590KgmAgr ;
         GXv_decimal14[0] = A869MtrAgr ;
         GXv_int8[0] = A671PieAgr ;
         new app.datoshdragrupacion(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int10, GXv_char4, GXv_char3, GXv_int9, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_int8) ;
         A396EmprCod = GXv_char13[0] ;
         A119BarAgrCod = GXv_int16[0] ;
         A124BarAgrReo = GXv_int12[0] ;
         A122BarAgrPar = GXv_char11[0] ;
         A1508CliCodAgr = GXv_int10[0] ;
         A1245BarAgrSer = GXv_char4[0] ;
         A1510ColNomAgr = GXv_char3[0] ;
         A1512ColNumAgr = GXv_int9[0] ;
         A1507BarAgrDsc = GXv_char2[0] ;
         A590KgmAgr = GXv_decimal15[0] ;
         A869MtrAgr = GXv_decimal14[0] ;
         A671PieAgr = (short)((short)(GXv_int8[0])) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1508CliCodAgr), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", A1245BarAgrSer);
         httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", A1510ColNomAgr);
         httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1512ColNumAgr), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", A1507BarAgrDsc);
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A122BarAgrPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1245BarAgrSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1510ColNomAgr))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1507BarAgrDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_35_1RK13( String A396EmprCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            int A119BarAgrCod ,
                            byte A124BarAgrReo ,
                            String A122BarAgrPar ,
                            String A180BarMaqCod ,
                            int A236BarVolMaq ,
                            short A671PieAgr ,
                            java.math.BigDecimal A590KgmAgr ,
                            java.math.BigDecimal A869MtrAgr )
   {
      if ( true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int16[0] = A129BarCod ;
         GXv_int12[0] = A132BarCodReo ;
         GXv_char11[0] = A130BarCodPar ;
         GXv_int10[0] = A119BarAgrCod ;
         GXv_int7[0] = A124BarAgrReo ;
         GXv_char4[0] = A122BarAgrPar ;
         GXv_char3[0] = A180BarMaqCod ;
         GXv_int9[0] = A236BarVolMaq ;
         GXv_int17[0] = A671PieAgr ;
         GXv_decimal15[0] = A590KgmAgr ;
         GXv_decimal14[0] = A869MtrAgr ;
         new app.pcreagr(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int10, GXv_int7, GXv_char4, GXv_char3, GXv_int9, GXv_int17, GXv_decimal15, GXv_decimal14) ;
         A396EmprCod = GXv_char13[0] ;
         A129BarCod = GXv_int16[0] ;
         A132BarCodReo = GXv_int12[0] ;
         A130BarCodPar = GXv_char11[0] ;
         A119BarAgrCod = GXv_int10[0] ;
         A124BarAgrReo = GXv_int7[0] ;
         A122BarAgrPar = GXv_char4[0] ;
         A180BarMaqCod = GXv_char3[0] ;
         A236BarVolMaq = GXv_int9[0] ;
         A671PieAgr = GXv_int17[0] ;
         A590KgmAgr = GXv_decimal15[0] ;
         A869MtrAgr = GXv_decimal14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         httpContext.ajax_rsp_assign_attri("", false, "A236BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A236BarVolMaq), 5, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrimstr( DecimalUtil.doubleToDec(A671PieAgr), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrimstr( A590KgmAgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrimstr( A869MtrAgr, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A122BarAgrPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A180BarMaqCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A236BarVolMaq, (byte)(5), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
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

   public void valid_Baragrpar( )
   {
      n1653FindDes = false ;
      /* Using cursor T01RK26 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar, A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A121BarAgrKgm = T01RK26_A121BarAgrKgm[0] ;
         A868BarAgrMtr = T01RK26_A868BarAgrMtr[0] ;
         A1650BarAgrNDes = T01RK26_A1650BarAgrNDes[0] ;
         A1651BarPNDes = T01RK26_A1651BarPNDes[0] ;
      }
      else
      {
         A121BarAgrKgm = DecimalUtil.doubleToDec(0) ;
         A868BarAgrMtr = DecimalUtil.doubleToDec(0) ;
         A1650BarAgrNDes = (short)(0) ;
         A1651BarPNDes = (short)(0) ;
      }
      pr_default.close(18);
      /* Using cursor T01RK27 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A119BarAgrCod), Byte.valueOf(A124BarAgrReo), A122BarAgrPar});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A1653FindDes = T01RK27_A1653FindDes[0] ;
         n1653FindDes = T01RK27_n1653FindDes[0] ;
      }
      else
      {
         A1653FindDes = " " ;
         n1653FindDes = false ;
      }
      pr_default.close(19);
      if ( GXutil.strcmp(A1653FindDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A123BarAgrPie = A1650BarAgrNDes ;
      }
      else
      {
         A123BarAgrPie = A1651BarPNDes ;
      }
      A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
      A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
      if ( true /* After */ )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int16[0] = A119BarAgrCod ;
         GXv_int12[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int7[0] = (byte)(AV43ok_hdr) ;
         GXv_char4[0] = AV44Baragrest ;
         new app.formulaciontinte.controlhdrexisteyagrupada(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int7, GXv_char4) ;
         recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char13[0] ;
         A396EmprCod = this.A396EmprCod ;
         recetasdetinte_agrupacion_registro_impl.this.A119BarAgrCod = GXv_int16[0] ;
         A119BarAgrCod = this.A119BarAgrCod ;
         recetasdetinte_agrupacion_registro_impl.this.A124BarAgrReo = GXv_int12[0] ;
         A124BarAgrReo = this.A124BarAgrReo ;
         recetasdetinte_agrupacion_registro_impl.this.A122BarAgrPar = GXv_char11[0] ;
         A122BarAgrPar = this.A122BarAgrPar ;
         recetasdetinte_agrupacion_registro_impl.this.AV43ok_hdr = GXv_int7[0] ;
         AV43ok_hdr = this.AV43ok_hdr ;
         recetasdetinte_agrupacion_registro_impl.this.AV44Baragrest = GXv_char4[0] ;
         AV44Baragrest = this.AV44Baragrest ;
      }
      if ( true /* Level */ && ( GXutil.strcmp(AV44Baragrest, "S") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El Nº Hdr,  ya esta agrupada", ""), 1, "BARAGRPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarAgrPar_Internalname ;
      }
      if ( isIns( )  )
      {
         GXv_char13[0] = A396EmprCod ;
         GXv_int16[0] = A119BarAgrCod ;
         GXv_int12[0] = A124BarAgrReo ;
         GXv_char11[0] = A122BarAgrPar ;
         GXv_int10[0] = A1508CliCodAgr ;
         GXv_char4[0] = A1245BarAgrSer ;
         GXv_char3[0] = A1510ColNomAgr ;
         GXv_int9[0] = A1512ColNumAgr ;
         GXv_char2[0] = A1507BarAgrDsc ;
         GXv_decimal15[0] = A590KgmAgr ;
         GXv_decimal14[0] = A869MtrAgr ;
         GXv_int8[0] = A671PieAgr ;
         new app.datoshdragrupacion(remoteHandle, context).execute( GXv_char13, GXv_int16, GXv_int12, GXv_char11, GXv_int10, GXv_char4, GXv_char3, GXv_int9, GXv_char2, GXv_decimal15, GXv_decimal14, GXv_int8) ;
         recetasdetinte_agrupacion_registro_impl.this.A396EmprCod = GXv_char13[0] ;
         A396EmprCod = this.A396EmprCod ;
         recetasdetinte_agrupacion_registro_impl.this.A119BarAgrCod = GXv_int16[0] ;
         A119BarAgrCod = this.A119BarAgrCod ;
         recetasdetinte_agrupacion_registro_impl.this.A124BarAgrReo = GXv_int12[0] ;
         A124BarAgrReo = this.A124BarAgrReo ;
         recetasdetinte_agrupacion_registro_impl.this.A122BarAgrPar = GXv_char11[0] ;
         A122BarAgrPar = this.A122BarAgrPar ;
         recetasdetinte_agrupacion_registro_impl.this.A1508CliCodAgr = GXv_int10[0] ;
         A1508CliCodAgr = this.A1508CliCodAgr ;
         recetasdetinte_agrupacion_registro_impl.this.A1245BarAgrSer = GXv_char4[0] ;
         A1245BarAgrSer = this.A1245BarAgrSer ;
         recetasdetinte_agrupacion_registro_impl.this.A1510ColNomAgr = GXv_char3[0] ;
         A1510ColNomAgr = this.A1510ColNomAgr ;
         recetasdetinte_agrupacion_registro_impl.this.A1512ColNumAgr = GXv_int9[0] ;
         A1512ColNumAgr = this.A1512ColNumAgr ;
         recetasdetinte_agrupacion_registro_impl.this.A1507BarAgrDsc = GXv_char2[0] ;
         A1507BarAgrDsc = this.A1507BarAgrDsc ;
         recetasdetinte_agrupacion_registro_impl.this.A590KgmAgr = GXv_decimal15[0] ;
         A590KgmAgr = this.A590KgmAgr ;
         recetasdetinte_agrupacion_registro_impl.this.A869MtrAgr = GXv_decimal14[0] ;
         A869MtrAgr = this.A869MtrAgr ;
         recetasdetinte_agrupacion_registro_impl.this.A671PieAgr = (short)((short)(GXv_int8[0])) ;
         A671PieAgr = this.A671PieAgr ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A121BarAgrKgm", GXutil.ltrim( localUtil.ntoc( A121BarAgrKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A868BarAgrMtr", GXutil.ltrim( localUtil.ntoc( A868BarAgrMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1650BarAgrNDes", GXutil.ltrim( localUtil.ntoc( A1650BarAgrNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1651BarPNDes", GXutil.ltrim( localUtil.ntoc( A1651BarPNDes, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1653FindDes", GXutil.rtrim( A1653FindDes));
      httpContext.ajax_rsp_assign_attri("", false, "A123BarAgrPie", GXutil.ltrim( localUtil.ntoc( A123BarAgrPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13792BarAgrNhdr", GXutil.rtrim( A13792BarAgrNhdr));
      httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", GXutil.rtrim( A13695BarAGrHdr));
      httpContext.ajax_rsp_assign_attri("", false, "AV43ok_hdr", GXutil.ltrim( localUtil.ntoc( AV43ok_hdr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV44Baragrest", GXutil.rtrim( AV44Baragrest));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", GXutil.rtrim( A122BarAgrPar));
      httpContext.ajax_rsp_assign_attri("", false, "A1508CliCodAgr", GXutil.ltrim( localUtil.ntoc( A1508CliCodAgr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1245BarAgrSer", GXutil.rtrim( A1245BarAgrSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1510ColNomAgr", GXutil.rtrim( A1510ColNomAgr));
      httpContext.ajax_rsp_assign_attri("", false, "A1512ColNumAgr", GXutil.ltrim( localUtil.ntoc( A1512ColNumAgr, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1507BarAgrDsc", GXutil.rtrim( A1507BarAgrDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A590KgmAgr", GXutil.ltrim( localUtil.ntoc( A590KgmAgr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A869MtrAgr", GXutil.ltrim( localUtil.ntoc( A869MtrAgr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A671PieAgr", GXutil.ltrim( localUtil.ntoc( A671PieAgr, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV11BarAgrCod',fld:'vBARAGRCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV12BarAgrReo',fld:'vBARAGRREO',pic:'9',hsh:true},{av:'AV13BarAgrPar',fld:'vBARAGRPAR',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27Wckgcol',fld:'vWCKGCOL',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV11BarAgrCod',fld:'vBARAGRCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV12BarAgrReo',fld:'vBARAGRREO',pic:'9',hsh:true},{av:'AV13BarAgrPar',fld:'vBARAGRPAR',pic:'',hsh:true},{av:'A1513DisCodAgr',fld:'DISCODAGR',pic:'ZZZZZZZ9'},{av:'A1509ColNoCAgr',fld:'COLNOCAGR',pic:''},{av:'A1511ColNuCAgr',fld:'COLNUCAGR',pic:'ZZZZZ9'},{av:'A1649BarAgrDNu',fld:'BARAGRDNU',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121RK2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27Wckgcol',fld:'vWCKGCOL',pic:'ZZZ9',hsh:true},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e131RK2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_BARMAQCOD","{handler:'valid_Barmaqcod',iparms:[]");
      setEventMetadata("VALID_BARMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_BARVOLMAQ","{handler:'valid_Barvolmaq',iparms:[]");
      setEventMetadata("VALID_BARVOLMAQ",",oparms:[]}");
      setEventMetadata("VALID_BARAGRCOD","{handler:'valid_Baragrcod',iparms:[]");
      setEventMetadata("VALID_BARAGRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARAGRREO","{handler:'valid_Baragrreo',iparms:[]");
      setEventMetadata("VALID_BARAGRREO",",oparms:[]}");
      setEventMetadata("VALID_BARAGRPAR","{handler:'valid_Baragrpar',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'AV44Baragrest',fld:'vBARAGREST',pic:'@!'},{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'AV43ok_hdr',fld:'vOK_HDR',pic:'ZZZ9'},{av:'A1508CliCodAgr',fld:'CLICODAGR',pic:'ZZZZZ9'},{av:'A1245BarAgrSer',fld:'BARAGRSER',pic:''},{av:'A1510ColNomAgr',fld:'COLNOMAGR',pic:''},{av:'A1512ColNumAgr',fld:'COLNUMAGR',pic:'ZZZZZ9'},{av:'A1507BarAgrDsc',fld:'BARAGRDSC',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARAGRPAR",",oparms:[{av:'A121BarAgrKgm',fld:'BARAGRKGM',pic:'ZZZZZ9.99'},{av:'A868BarAgrMtr',fld:'BARAGRMTR',pic:'ZZZZZ9.99'},{av:'A1650BarAgrNDes',fld:'BARAGRNDES',pic:'ZZZ9'},{av:'A1651BarPNDes',fld:'BARPNDES',pic:'ZZZ9'},{av:'A1653FindDes',fld:'FINDDES',pic:'@!'},{av:'A123BarAgrPie',fld:'BARAGRPIE',pic:'ZZZ9'},{av:'A13792BarAgrNhdr',fld:'BARAGRNHDR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'AV43ok_hdr',fld:'vOK_HDR',pic:'ZZZ9'},{av:'AV44Baragrest',fld:'vBARAGREST',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A1508CliCodAgr',fld:'CLICODAGR',pic:'ZZZZZ9'},{av:'A1245BarAgrSer',fld:'BARAGRSER',pic:''},{av:'A1510ColNomAgr',fld:'COLNOMAGR',pic:''},{av:'A1512ColNumAgr',fld:'COLNUMAGR',pic:'ZZZZZ9'},{av:'A1507BarAgrDsc',fld:'BARAGRDSC',pic:''},{av:'A590KgmAgr',fld:'KGMAGR',pic:'ZZZZZ9.99'},{av:'A869MtrAgr',fld:'MTRAGR',pic:'ZZZZZ9.99'},{av:'A671PieAgr',fld:'PIEAGR',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_KGMAGR","{handler:'valid_Kgmagr',iparms:[]");
      setEventMetadata("VALID_KGMAGR",",oparms:[]}");
      setEventMetadata("VALID_MTRAGR","{handler:'valid_Mtragr',iparms:[]");
      setEventMetadata("VALID_MTRAGR",",oparms:[]}");
      setEventMetadata("VALID_PIEAGR","{handler:'valid_Pieagr',iparms:[]");
      setEventMetadata("VALID_PIEAGR",",oparms:[]}");
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
      pr_default.close(18);
      pr_default.close(19);
      pr_default.close(8);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV10BarCodPar = "" ;
      wcpOAV13BarAgrPar = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z122BarAgrPar = "" ;
      Z1245BarAgrSer = "" ;
      Z1510ColNomAgr = "" ;
      Z1507BarAgrDsc = "" ;
      Z590KgmAgr = DecimalUtil.ZERO ;
      Z869MtrAgr = DecimalUtil.ZERO ;
      Z1509ColNoCAgr = "" ;
      Z1649BarAgrDNu = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A122BarAgrPar = "" ;
      Gx_mode = "" ;
      A130BarCodPar = "" ;
      A180BarMaqCod = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      AV7EmprCod = "" ;
      AV10BarCodPar = "" ;
      AV13BarAgrPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A13696BarNHdr = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV51Prompt = "" ;
      AV64Prompt_GXI = "" ;
      sImgUrl = "" ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      AV63Pgmname = "" ;
      A474FindBarAgr = "" ;
      A1509ColNoCAgr = "" ;
      A1649BarAgrDNu = "" ;
      A401EmprCodVi = "" ;
      A13792BarAgrNhdr = "" ;
      A13695BarAGrHdr = "" ;
      A1653FindDes = "" ;
      AV44Baragrest = "" ;
      A407EmprNom = "" ;
      A2759BarMaqGru = "" ;
      A120BarAgrEst = "" ;
      A121BarAgrKgm = DecimalUtil.ZERO ;
      A868BarAgrMtr = DecimalUtil.ZERO ;
      A13846BarAgrCant = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode13 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV46Station = "" ;
      AV45EmprNom = "" ;
      AV47UsurCod = "" ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16WebSession = httpContext.getWebSession();
      AV55barcodparm = "" ;
      AV57barser = "" ;
      AV58barcolnom = "" ;
      AV61Barnomcli = "" ;
      AV52Window = new com.genexus.webpanels.GXWindow();
      Z407EmprNom = "" ;
      Z2759BarMaqGru = "" ;
      Z143BarDisNum = "" ;
      Z120BarAgrEst = "" ;
      Z180BarMaqCod = "" ;
      Z212BarSer = "" ;
      Z135BarColNom = "" ;
      Z4812BarEncCli = "" ;
      Z13846BarAgrCant = DecimalUtil.ZERO ;
      Z1653FindDes = "" ;
      T01RK4_A407EmprNom = new String[] {""} ;
      T01RK4_n407EmprNom = new boolean[] {false} ;
      T01RK5_A2759BarMaqGru = new String[] {""} ;
      T01RK5_A143BarDisNum = new String[] {""} ;
      T01RK5_A120BarAgrEst = new String[] {""} ;
      T01RK5_A180BarMaqCod = new String[] {""} ;
      T01RK5_A236BarVolMaq = new int[1] ;
      T01RK5_A213BarSit = new byte[1] ;
      T01RK5_A212BarSer = new String[] {""} ;
      T01RK5_A135BarColNom = new String[] {""} ;
      T01RK5_A136BarColNum = new int[1] ;
      T01RK5_A4812BarEncCli = new String[] {""} ;
      T01RK5_A252CliCod = new int[1] ;
      T01RK5_n252CliCod = new boolean[] {false} ;
      T01RK9_A478FindVolMax = new int[1] ;
      T01RK9_A479FindVolMed = new int[1] ;
      T01RK9_A480FindVolMin = new int[1] ;
      T01RK11_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK11_n13846BarAgrCant = new boolean[] {false} ;
      T01RK7_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK7_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK7_A1650BarAgrNDes = new short[1] ;
      T01RK7_A1651BarPNDes = new short[1] ;
      T01RK12_A1653FindDes = new String[] {""} ;
      T01RK12_n1653FindDes = new boolean[] {false} ;
      T01RK15_A2759BarMaqGru = new String[] {""} ;
      T01RK15_A119BarAgrCod = new int[1] ;
      T01RK15_A124BarAgrReo = new byte[1] ;
      T01RK15_A122BarAgrPar = new String[] {""} ;
      T01RK15_A1508CliCodAgr = new int[1] ;
      T01RK15_A1245BarAgrSer = new String[] {""} ;
      T01RK15_A1510ColNomAgr = new String[] {""} ;
      T01RK15_A1512ColNumAgr = new int[1] ;
      T01RK15_A1507BarAgrDsc = new String[] {""} ;
      T01RK15_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK15_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK15_A671PieAgr = new short[1] ;
      T01RK15_A407EmprNom = new String[] {""} ;
      T01RK15_n407EmprNom = new boolean[] {false} ;
      T01RK15_A143BarDisNum = new String[] {""} ;
      T01RK15_A120BarAgrEst = new String[] {""} ;
      T01RK15_A180BarMaqCod = new String[] {""} ;
      T01RK15_A236BarVolMaq = new int[1] ;
      T01RK15_A213BarSit = new byte[1] ;
      T01RK15_A212BarSer = new String[] {""} ;
      T01RK15_A135BarColNom = new String[] {""} ;
      T01RK15_A136BarColNum = new int[1] ;
      T01RK15_A1513DisCodAgr = new int[1] ;
      T01RK15_A1509ColNoCAgr = new String[] {""} ;
      T01RK15_A1511ColNuCAgr = new int[1] ;
      T01RK15_A1649BarAgrDNu = new String[] {""} ;
      T01RK15_A4812BarEncCli = new String[] {""} ;
      T01RK15_A396EmprCod = new String[] {""} ;
      T01RK15_A129BarCod = new int[1] ;
      T01RK15_A132BarCodReo = new byte[1] ;
      T01RK15_A130BarCodPar = new String[] {""} ;
      T01RK15_A252CliCod = new int[1] ;
      T01RK15_n252CliCod = new boolean[] {false} ;
      T01RK15_A13846BarAgrCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK15_n13846BarAgrCant = new boolean[] {false} ;
      T01RK15_A1653FindDes = new String[] {""} ;
      T01RK15_n1653FindDes = new boolean[] {false} ;
      T01RK17_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK17_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK17_A1650BarAgrNDes = new short[1] ;
      T01RK17_A1651BarPNDes = new short[1] ;
      T01RK18_A1653FindDes = new String[] {""} ;
      T01RK18_n1653FindDes = new boolean[] {false} ;
      T01RK19_A396EmprCod = new String[] {""} ;
      T01RK19_A129BarCod = new int[1] ;
      T01RK19_A132BarCodReo = new byte[1] ;
      T01RK19_A130BarCodPar = new String[] {""} ;
      T01RK19_A119BarAgrCod = new int[1] ;
      T01RK19_A124BarAgrReo = new byte[1] ;
      T01RK19_A122BarAgrPar = new String[] {""} ;
      T01RK3_A119BarAgrCod = new int[1] ;
      T01RK3_A124BarAgrReo = new byte[1] ;
      T01RK3_A122BarAgrPar = new String[] {""} ;
      T01RK3_A1508CliCodAgr = new int[1] ;
      T01RK3_A1245BarAgrSer = new String[] {""} ;
      T01RK3_A1510ColNomAgr = new String[] {""} ;
      T01RK3_A1512ColNumAgr = new int[1] ;
      T01RK3_A1507BarAgrDsc = new String[] {""} ;
      T01RK3_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK3_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK3_A671PieAgr = new short[1] ;
      T01RK3_A1513DisCodAgr = new int[1] ;
      T01RK3_A1509ColNoCAgr = new String[] {""} ;
      T01RK3_A1511ColNuCAgr = new int[1] ;
      T01RK3_A1649BarAgrDNu = new String[] {""} ;
      T01RK3_A396EmprCod = new String[] {""} ;
      T01RK3_A129BarCod = new int[1] ;
      T01RK3_A132BarCodReo = new byte[1] ;
      T01RK3_A130BarCodPar = new String[] {""} ;
      T01RK20_A119BarAgrCod = new int[1] ;
      T01RK20_A124BarAgrReo = new byte[1] ;
      T01RK20_A122BarAgrPar = new String[] {""} ;
      T01RK20_A396EmprCod = new String[] {""} ;
      T01RK20_A129BarCod = new int[1] ;
      T01RK20_A132BarCodReo = new byte[1] ;
      T01RK20_A130BarCodPar = new String[] {""} ;
      T01RK21_A119BarAgrCod = new int[1] ;
      T01RK21_A124BarAgrReo = new byte[1] ;
      T01RK21_A122BarAgrPar = new String[] {""} ;
      T01RK21_A396EmprCod = new String[] {""} ;
      T01RK21_A129BarCod = new int[1] ;
      T01RK21_A132BarCodReo = new byte[1] ;
      T01RK21_A130BarCodPar = new String[] {""} ;
      T01RK2_A119BarAgrCod = new int[1] ;
      T01RK2_A124BarAgrReo = new byte[1] ;
      T01RK2_A122BarAgrPar = new String[] {""} ;
      T01RK2_A1508CliCodAgr = new int[1] ;
      T01RK2_A1245BarAgrSer = new String[] {""} ;
      T01RK2_A1510ColNomAgr = new String[] {""} ;
      T01RK2_A1512ColNumAgr = new int[1] ;
      T01RK2_A1507BarAgrDsc = new String[] {""} ;
      T01RK2_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK2_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK2_A671PieAgr = new short[1] ;
      T01RK2_A1513DisCodAgr = new int[1] ;
      T01RK2_A1509ColNoCAgr = new String[] {""} ;
      T01RK2_A1511ColNuCAgr = new int[1] ;
      T01RK2_A1649BarAgrDNu = new String[] {""} ;
      T01RK2_A396EmprCod = new String[] {""} ;
      T01RK2_A129BarCod = new int[1] ;
      T01RK2_A132BarCodReo = new byte[1] ;
      T01RK2_A130BarCodPar = new String[] {""} ;
      T01RK26_A121BarAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK26_A868BarAgrMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01RK26_A1650BarAgrNDes = new short[1] ;
      T01RK26_A1651BarPNDes = new short[1] ;
      T01RK27_A1653FindDes = new String[] {""} ;
      T01RK27_n1653FindDes = new boolean[] {false} ;
      T01RK28_A396EmprCod = new String[] {""} ;
      T01RK28_A129BarCod = new int[1] ;
      T01RK28_A132BarCodReo = new byte[1] ;
      T01RK28_A130BarCodPar = new String[] {""} ;
      T01RK28_A119BarAgrCod = new int[1] ;
      T01RK28_A124BarAgrReo = new byte[1] ;
      T01RK28_A122BarAgrPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_int17 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char13 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      Z121BarAgrKgm = DecimalUtil.ZERO ;
      Z868BarAgrMtr = DecimalUtil.ZERO ;
      Z13792BarAgrNhdr = "" ;
      Z13695BarAGrHdr = "" ;
      ZV44Baragrest = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_registro__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_registro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_registro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_registro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdetinte_agrupacion_registro__default(),
         new Object[] {
             new Object[] {
            T01RK2_A119BarAgrCod, T01RK2_A124BarAgrReo, T01RK2_A122BarAgrPar, T01RK2_A1508CliCodAgr, T01RK2_A1245BarAgrSer, T01RK2_A1510ColNomAgr, T01RK2_A1512ColNumAgr, T01RK2_A1507BarAgrDsc, T01RK2_A590KgmAgr, T01RK2_A869MtrAgr,
            T01RK2_A671PieAgr, T01RK2_A1513DisCodAgr, T01RK2_A1509ColNoCAgr, T01RK2_A1511ColNuCAgr, T01RK2_A1649BarAgrDNu, T01RK2_A396EmprCod, T01RK2_A129BarCod, T01RK2_A132BarCodReo, T01RK2_A130BarCodPar
            }
            , new Object[] {
            T01RK3_A119BarAgrCod, T01RK3_A124BarAgrReo, T01RK3_A122BarAgrPar, T01RK3_A1508CliCodAgr, T01RK3_A1245BarAgrSer, T01RK3_A1510ColNomAgr, T01RK3_A1512ColNumAgr, T01RK3_A1507BarAgrDsc, T01RK3_A590KgmAgr, T01RK3_A869MtrAgr,
            T01RK3_A671PieAgr, T01RK3_A1513DisCodAgr, T01RK3_A1509ColNoCAgr, T01RK3_A1511ColNuCAgr, T01RK3_A1649BarAgrDNu, T01RK3_A396EmprCod, T01RK3_A129BarCod, T01RK3_A132BarCodReo, T01RK3_A130BarCodPar
            }
            , new Object[] {
            T01RK4_A407EmprNom, T01RK4_n407EmprNom
            }
            , new Object[] {
            T01RK5_A2759BarMaqGru, T01RK5_A143BarDisNum, T01RK5_A120BarAgrEst, T01RK5_A180BarMaqCod, T01RK5_A236BarVolMaq, T01RK5_A213BarSit, T01RK5_A212BarSer, T01RK5_A135BarColNom, T01RK5_A136BarColNum, T01RK5_A4812BarEncCli,
            T01RK5_A252CliCod, T01RK5_n252CliCod
            }
            , new Object[] {
            T01RK7_A121BarAgrKgm, T01RK7_A868BarAgrMtr, T01RK7_A1650BarAgrNDes, T01RK7_A1651BarPNDes
            }
            , new Object[] {
            T01RK9_A478FindVolMax, T01RK9_A479FindVolMed, T01RK9_A480FindVolMin
            }
            , new Object[] {
            T01RK11_A13846BarAgrCant, T01RK11_n13846BarAgrCant
            }
            , new Object[] {
            T01RK12_A1653FindDes, T01RK12_n1653FindDes
            }
            , new Object[] {
            T01RK13_A474FindBarAgr, T01RK13_n474FindBarAgr
            }
            , new Object[] {
            T01RK15_A2759BarMaqGru, T01RK15_A119BarAgrCod, T01RK15_A124BarAgrReo, T01RK15_A122BarAgrPar, T01RK15_A1508CliCodAgr, T01RK15_A1245BarAgrSer, T01RK15_A1510ColNomAgr, T01RK15_A1512ColNumAgr, T01RK15_A1507BarAgrDsc, T01RK15_A590KgmAgr,
            T01RK15_A869MtrAgr, T01RK15_A671PieAgr, T01RK15_A407EmprNom, T01RK15_n407EmprNom, T01RK15_A143BarDisNum, T01RK15_A120BarAgrEst, T01RK15_A180BarMaqCod, T01RK15_A236BarVolMaq, T01RK15_A213BarSit, T01RK15_A212BarSer,
            T01RK15_A135BarColNom, T01RK15_A136BarColNum, T01RK15_A1513DisCodAgr, T01RK15_A1509ColNoCAgr, T01RK15_A1511ColNuCAgr, T01RK15_A1649BarAgrDNu, T01RK15_A4812BarEncCli, T01RK15_A396EmprCod, T01RK15_A129BarCod, T01RK15_A132BarCodReo,
            T01RK15_A130BarCodPar, T01RK15_A252CliCod, T01RK15_n252CliCod, T01RK15_A13846BarAgrCant, T01RK15_n13846BarAgrCant, T01RK15_A1653FindDes, T01RK15_n1653FindDes
            }
            , new Object[] {
            T01RK17_A121BarAgrKgm, T01RK17_A868BarAgrMtr, T01RK17_A1650BarAgrNDes, T01RK17_A1651BarPNDes
            }
            , new Object[] {
            T01RK18_A1653FindDes, T01RK18_n1653FindDes
            }
            , new Object[] {
            T01RK19_A396EmprCod, T01RK19_A129BarCod, T01RK19_A132BarCodReo, T01RK19_A130BarCodPar, T01RK19_A119BarAgrCod, T01RK19_A124BarAgrReo, T01RK19_A122BarAgrPar
            }
            , new Object[] {
            T01RK20_A119BarAgrCod, T01RK20_A124BarAgrReo, T01RK20_A122BarAgrPar, T01RK20_A396EmprCod, T01RK20_A129BarCod, T01RK20_A132BarCodReo, T01RK20_A130BarCodPar
            }
            , new Object[] {
            T01RK21_A119BarAgrCod, T01RK21_A124BarAgrReo, T01RK21_A122BarAgrPar, T01RK21_A396EmprCod, T01RK21_A129BarCod, T01RK21_A132BarCodReo, T01RK21_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01RK26_A121BarAgrKgm, T01RK26_A868BarAgrMtr, T01RK26_A1650BarAgrNDes, T01RK26_A1651BarPNDes
            }
            , new Object[] {
            T01RK27_A1653FindDes, T01RK27_n1653FindDes
            }
            , new Object[] {
            T01RK28_A396EmprCod, T01RK28_A129BarCod, T01RK28_A132BarCodReo, T01RK28_A130BarCodPar, T01RK28_A119BarAgrCod, T01RK28_A124BarAgrReo, T01RK28_A122BarAgrPar
            }
         }
      );
      AV63Pgmname = "RecetasdeTinte_Agrupacion_Registro" ;
   }

   private byte wcpOAV9BarCodReo ;
   private byte wcpOAV12BarAgrReo ;
   private byte Z132BarCodReo ;
   private byte Z124BarAgrReo ;
   private byte GxWebError ;
   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private byte AV9BarCodReo ;
   private byte AV12BarAgrReo ;
   private byte nKeyPressed ;
   private byte A213BarSit ;
   private byte GXt_int6 ;
   private byte AV50barsitto ;
   private byte AV54barcodreom ;
   private byte AV60bartipcol ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int7[] ;
   private byte GXv_int12[] ;
   private short Z671PieAgr ;
   private short A671PieAgr ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1650BarAgrNDes ;
   private short A1651BarPNDes ;
   private short A123BarAgrPie ;
   private short AV43ok_hdr ;
   private short AV48FlagRec ;
   private short RcdFound13 ;
   private short AV27Wckgcol ;
   private short nIsDirty_13 ;
   private short GXv_int17[] ;
   private short Z1650BarAgrNDes ;
   private short Z1651BarPNDes ;
   private short Z123BarAgrPie ;
   private short ZV43ok_hdr ;
   private int wcpOAV8BarCod ;
   private int wcpOAV11BarAgrCod ;
   private int Z129BarCod ;
   private int Z119BarAgrCod ;
   private int Z1508CliCodAgr ;
   private int Z1512ColNumAgr ;
   private int Z1513DisCodAgr ;
   private int Z1511ColNuCAgr ;
   private int A119BarAgrCod ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private int AV8BarCod ;
   private int AV11BarAgrCod ;
   private int trnEnded ;
   private int edtBarNHdr_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtPedidoClie_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int edtBarVolMaq_Enabled ;
   private int edtBarSit_Enabled ;
   private int edtBarAgrCod_Enabled ;
   private int imgavPrompt_Visible ;
   private int imgavPrompt_Enabled ;
   private int edtBarAgrReo_Enabled ;
   private int edtBarAgrPar_Enabled ;
   private int A1508CliCodAgr ;
   private int edtCliCodAgr_Enabled ;
   private int edtBarAgrSer_Enabled ;
   private int edtBarAgrDsc_Enabled ;
   private int edtColNomAgr_Enabled ;
   private int A1512ColNumAgr ;
   private int edtColNumAgr_Enabled ;
   private int edtKgmAgr_Enabled ;
   private int edtMtrAgr_Enabled ;
   private int edtPieAgr_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtFindBarAgr_Visible ;
   private int edtFindBarAgr_Enabled ;
   private int A1513DisCodAgr ;
   private int A1511ColNuCAgr ;
   private int A478FindVolMax ;
   private int A479FindVolMed ;
   private int A480FindVolMin ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Dvpanel_unnamedtable1_Gxcontroltype ;
   private int AV49clicodin ;
   private int AV53barcodm ;
   private int AV56clicod ;
   private int AV59Barcolnum ;
   private int AV62Barnumcli ;
   private int GX_JID ;
   private int Z236BarVolMaq ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int idxLst ;
   private int GXv_int16[] ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int GXv_int8[] ;
   private java.math.BigDecimal Z590KgmAgr ;
   private java.math.BigDecimal Z869MtrAgr ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal A121BarAgrKgm ;
   private java.math.BigDecimal A868BarAgrMtr ;
   private java.math.BigDecimal A13846BarAgrCant ;
   private java.math.BigDecimal Z13846BarAgrCant ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal Z121BarAgrKgm ;
   private java.math.BigDecimal Z868BarAgrMtr ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV10BarCodPar ;
   private String wcpOAV13BarAgrPar ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z122BarAgrPar ;
   private String Z1245BarAgrSer ;
   private String Z1510ColNomAgr ;
   private String Z1507BarAgrDsc ;
   private String Z1509ColNoCAgr ;
   private String Z1649BarAgrDNu ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A122BarAgrPar ;
   private String Gx_mode ;
   private String A130BarCodPar ;
   private String A180BarMaqCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String AV7EmprCod ;
   private String AV10BarCodPar ;
   private String AV13BarAgrPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarAgrCod_Internalname ;
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
   private String divUnnamedtable4_Internalname ;
   private String edtBarNHdr_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtPedidoClie_Internalname ;
   private String A13878PedidoClie ;
   private String edtPedidoClie_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarMaqCod_Internalname ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtBarVolMaq_Internalname ;
   private String edtBarVolMaq_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String TempTags ;
   private String edtBarAgrCod_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String edtBarAgrReo_Internalname ;
   private String edtBarAgrReo_Jsonclick ;
   private String edtBarAgrPar_Internalname ;
   private String edtBarAgrPar_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtCliCodAgr_Internalname ;
   private String edtCliCodAgr_Jsonclick ;
   private String edtBarAgrSer_Internalname ;
   private String A1245BarAgrSer ;
   private String edtBarAgrSer_Jsonclick ;
   private String edtBarAgrDsc_Internalname ;
   private String A1507BarAgrDsc ;
   private String edtBarAgrDsc_Jsonclick ;
   private String edtColNomAgr_Internalname ;
   private String A1510ColNomAgr ;
   private String edtColNomAgr_Jsonclick ;
   private String edtColNumAgr_Internalname ;
   private String edtColNumAgr_Jsonclick ;
   private String edtKgmAgr_Internalname ;
   private String edtKgmAgr_Jsonclick ;
   private String edtMtrAgr_Internalname ;
   private String edtMtrAgr_Jsonclick ;
   private String edtPieAgr_Internalname ;
   private String edtPieAgr_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV63Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtFindBarAgr_Internalname ;
   private String A474FindBarAgr ;
   private String edtFindBarAgr_Jsonclick ;
   private String A1509ColNoCAgr ;
   private String A1649BarAgrDNu ;
   private String A401EmprCodVi ;
   private String A13792BarAgrNhdr ;
   private String A13695BarAGrHdr ;
   private String A1653FindDes ;
   private String AV44Baragrest ;
   private String A407EmprNom ;
   private String A2759BarMaqGru ;
   private String A120BarAgrEst ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String hsh ;
   private String sMode13 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV46Station ;
   private String AV45EmprNom ;
   private String AV47UsurCod ;
   private String AV55barcodparm ;
   private String AV57barser ;
   private String AV58barcolnom ;
   private String AV61Barnomcli ;
   private String Z407EmprNom ;
   private String Z2759BarMaqGru ;
   private String Z143BarDisNum ;
   private String Z120BarAgrEst ;
   private String Z180BarMaqCod ;
   private String Z212BarSer ;
   private String Z135BarColNom ;
   private String Z4812BarEncCli ;
   private String Z1653FindDes ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char13[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z13792BarAgrNhdr ;
   private String Z13695BarAGrHdr ;
   private String ZV44Baragrest ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean AV51Prompt_IsBlob ;
   private boolean n1653FindDes ;
   private boolean n407EmprNom ;
   private boolean n13846BarAgrCant ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean n252CliCod ;
   private boolean n474FindBarAgr ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV64Prompt_GXI ;
   private String AV51Prompt ;
   private com.genexus.webpanels.GXWindow AV52Window ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01RK4_A407EmprNom ;
   private boolean[] T01RK4_n407EmprNom ;
   private String[] T01RK5_A2759BarMaqGru ;
   private String[] T01RK5_A143BarDisNum ;
   private String[] T01RK5_A120BarAgrEst ;
   private String[] T01RK5_A180BarMaqCod ;
   private int[] T01RK5_A236BarVolMaq ;
   private byte[] T01RK5_A213BarSit ;
   private String[] T01RK5_A212BarSer ;
   private String[] T01RK5_A135BarColNom ;
   private int[] T01RK5_A136BarColNum ;
   private String[] T01RK5_A4812BarEncCli ;
   private int[] T01RK5_A252CliCod ;
   private boolean[] T01RK5_n252CliCod ;
   private int[] T01RK9_A478FindVolMax ;
   private int[] T01RK9_A479FindVolMed ;
   private int[] T01RK9_A480FindVolMin ;
   private java.math.BigDecimal[] T01RK11_A13846BarAgrCant ;
   private boolean[] T01RK11_n13846BarAgrCant ;
   private java.math.BigDecimal[] T01RK7_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01RK7_A868BarAgrMtr ;
   private short[] T01RK7_A1650BarAgrNDes ;
   private short[] T01RK7_A1651BarPNDes ;
   private String[] T01RK12_A1653FindDes ;
   private boolean[] T01RK12_n1653FindDes ;
   private String[] T01RK15_A2759BarMaqGru ;
   private int[] T01RK15_A119BarAgrCod ;
   private byte[] T01RK15_A124BarAgrReo ;
   private String[] T01RK15_A122BarAgrPar ;
   private int[] T01RK15_A1508CliCodAgr ;
   private String[] T01RK15_A1245BarAgrSer ;
   private String[] T01RK15_A1510ColNomAgr ;
   private int[] T01RK15_A1512ColNumAgr ;
   private String[] T01RK15_A1507BarAgrDsc ;
   private java.math.BigDecimal[] T01RK15_A590KgmAgr ;
   private java.math.BigDecimal[] T01RK15_A869MtrAgr ;
   private short[] T01RK15_A671PieAgr ;
   private String[] T01RK15_A407EmprNom ;
   private boolean[] T01RK15_n407EmprNom ;
   private String[] T01RK15_A143BarDisNum ;
   private String[] T01RK15_A120BarAgrEst ;
   private String[] T01RK15_A180BarMaqCod ;
   private int[] T01RK15_A236BarVolMaq ;
   private byte[] T01RK15_A213BarSit ;
   private String[] T01RK15_A212BarSer ;
   private String[] T01RK15_A135BarColNom ;
   private int[] T01RK15_A136BarColNum ;
   private int[] T01RK15_A1513DisCodAgr ;
   private String[] T01RK15_A1509ColNoCAgr ;
   private int[] T01RK15_A1511ColNuCAgr ;
   private String[] T01RK15_A1649BarAgrDNu ;
   private String[] T01RK15_A4812BarEncCli ;
   private String[] T01RK15_A396EmprCod ;
   private int[] T01RK15_A129BarCod ;
   private byte[] T01RK15_A132BarCodReo ;
   private String[] T01RK15_A130BarCodPar ;
   private int[] T01RK15_A252CliCod ;
   private boolean[] T01RK15_n252CliCod ;
   private java.math.BigDecimal[] T01RK15_A13846BarAgrCant ;
   private boolean[] T01RK15_n13846BarAgrCant ;
   private String[] T01RK15_A1653FindDes ;
   private boolean[] T01RK15_n1653FindDes ;
   private java.math.BigDecimal[] T01RK17_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01RK17_A868BarAgrMtr ;
   private short[] T01RK17_A1650BarAgrNDes ;
   private short[] T01RK17_A1651BarPNDes ;
   private String[] T01RK18_A1653FindDes ;
   private boolean[] T01RK18_n1653FindDes ;
   private String[] T01RK19_A396EmprCod ;
   private int[] T01RK19_A129BarCod ;
   private byte[] T01RK19_A132BarCodReo ;
   private String[] T01RK19_A130BarCodPar ;
   private int[] T01RK19_A119BarAgrCod ;
   private byte[] T01RK19_A124BarAgrReo ;
   private String[] T01RK19_A122BarAgrPar ;
   private int[] T01RK3_A119BarAgrCod ;
   private byte[] T01RK3_A124BarAgrReo ;
   private String[] T01RK3_A122BarAgrPar ;
   private int[] T01RK3_A1508CliCodAgr ;
   private String[] T01RK3_A1245BarAgrSer ;
   private String[] T01RK3_A1510ColNomAgr ;
   private int[] T01RK3_A1512ColNumAgr ;
   private String[] T01RK3_A1507BarAgrDsc ;
   private java.math.BigDecimal[] T01RK3_A590KgmAgr ;
   private java.math.BigDecimal[] T01RK3_A869MtrAgr ;
   private short[] T01RK3_A671PieAgr ;
   private int[] T01RK3_A1513DisCodAgr ;
   private String[] T01RK3_A1509ColNoCAgr ;
   private int[] T01RK3_A1511ColNuCAgr ;
   private String[] T01RK3_A1649BarAgrDNu ;
   private String[] T01RK3_A396EmprCod ;
   private int[] T01RK3_A129BarCod ;
   private byte[] T01RK3_A132BarCodReo ;
   private String[] T01RK3_A130BarCodPar ;
   private int[] T01RK20_A119BarAgrCod ;
   private byte[] T01RK20_A124BarAgrReo ;
   private String[] T01RK20_A122BarAgrPar ;
   private String[] T01RK20_A396EmprCod ;
   private int[] T01RK20_A129BarCod ;
   private byte[] T01RK20_A132BarCodReo ;
   private String[] T01RK20_A130BarCodPar ;
   private int[] T01RK21_A119BarAgrCod ;
   private byte[] T01RK21_A124BarAgrReo ;
   private String[] T01RK21_A122BarAgrPar ;
   private String[] T01RK21_A396EmprCod ;
   private int[] T01RK21_A129BarCod ;
   private byte[] T01RK21_A132BarCodReo ;
   private String[] T01RK21_A130BarCodPar ;
   private int[] T01RK2_A119BarAgrCod ;
   private byte[] T01RK2_A124BarAgrReo ;
   private String[] T01RK2_A122BarAgrPar ;
   private int[] T01RK2_A1508CliCodAgr ;
   private String[] T01RK2_A1245BarAgrSer ;
   private String[] T01RK2_A1510ColNomAgr ;
   private int[] T01RK2_A1512ColNumAgr ;
   private String[] T01RK2_A1507BarAgrDsc ;
   private java.math.BigDecimal[] T01RK2_A590KgmAgr ;
   private java.math.BigDecimal[] T01RK2_A869MtrAgr ;
   private short[] T01RK2_A671PieAgr ;
   private int[] T01RK2_A1513DisCodAgr ;
   private String[] T01RK2_A1509ColNoCAgr ;
   private int[] T01RK2_A1511ColNuCAgr ;
   private String[] T01RK2_A1649BarAgrDNu ;
   private String[] T01RK2_A396EmprCod ;
   private int[] T01RK2_A129BarCod ;
   private byte[] T01RK2_A132BarCodReo ;
   private String[] T01RK2_A130BarCodPar ;
   private java.math.BigDecimal[] T01RK26_A121BarAgrKgm ;
   private java.math.BigDecimal[] T01RK26_A868BarAgrMtr ;
   private short[] T01RK26_A1650BarAgrNDes ;
   private short[] T01RK26_A1651BarPNDes ;
   private String[] T01RK27_A1653FindDes ;
   private boolean[] T01RK27_n1653FindDes ;
   private String[] T01RK28_A396EmprCod ;
   private int[] T01RK28_A129BarCod ;
   private byte[] T01RK28_A132BarCodReo ;
   private String[] T01RK28_A130BarCodPar ;
   private int[] T01RK28_A119BarAgrCod ;
   private byte[] T01RK28_A124BarAgrReo ;
   private String[] T01RK28_A122BarAgrPar ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01RK13_A474FindBarAgr ;
   private boolean[] T01RK13_n474FindBarAgr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class recetasdetinte_agrupacion_registro__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion_registro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion_registro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion_registro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class recetasdetinte_agrupacion_registro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01RK2", "SELECT BarAgrCod, BarAgrReo, BarAgrPar, CliCodAgr, BarAgrSer, ColNomAgr, ColNumAgr, BarAgrDsc, KgmAgr, MtrAgr, PieAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?  FOR UPDATE OF CliCodAgr, BarAgrSer, ColNomAgr, ColNumAgr, BarAgrDsc, KgmAgr, MtrAgr, PieAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK3", "SELECT BarAgrCod, BarAgrReo, BarAgrPar, CliCodAgr, BarAgrSer, ColNomAgr, ColNumAgr, BarAgrDsc, KgmAgr, MtrAgr, PieAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK5", "SELECT BarMaqGru, BarDisNum, BarAgrEst, BarMaqCod, BarVolMaq, BarSit, BarSer, BarColNom, BarColNum, BarEncCli, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK7", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK9", "SELECT COALESCE( T1.FindVolMax, 0) AS FindVolMax, COALESCE( T1.FindVolMed, 0) AS FindVolMed, COALESCE( T1.FindVolMin, 0) AS FindVolMin FROM (SELECT MIN(T2.MaqVolMax) AS FindVolMax, T3.BarCod, T3.BarCodReo, T3.BarCodPar, MIN(T2.MaqVolMed) AS FindVolMed, MIN(T2.MaqVolMin) AS FindVolMin FROM TXPMAQUIN T2,  TXPBARCAD T3 WHERE (T2.EmprCod = T3.EmprCod) AND (T2.MaqCod = ?) GROUP BY T3.BarCod, T3.BarCodReo, T3.BarCodPar ) T1 WHERE T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK11", "SELECT COALESCE( T1.BarAgrCant, 0) AS BarAgrCant FROM (SELECT COUNT(*) AS BarAgrCant, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK12", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK13", "SELECT COALESCE( BarAgrEst, '') AS FindBarAgr FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK15", "SELECT /*+ FIRST_ROWS(100) */ T3.BarMaqGru, TM1.BarAgrCod, TM1.BarAgrReo, TM1.BarAgrPar, TM1.CliCodAgr, TM1.BarAgrSer, TM1.ColNomAgr, TM1.ColNumAgr, TM1.BarAgrDsc, TM1.KgmAgr, TM1.MtrAgr, TM1.PieAgr, T2.EmprNom, T3.BarDisNum, T3.BarAgrEst, T3.BarMaqCod, T3.BarVolMaq, T3.BarSit, T3.BarSer, T3.BarColNom, T3.BarColNum, TM1.DisCodAgr, TM1.ColNoCAgr, TM1.ColNuCAgr, TM1.BarAgrDNu, T3.BarEncCli, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.CliCod, COALESCE( T4.BarAgrCant, 0) AS BarAgrCant, COALESCE( T5.DisDes, ' ') AS FindDes FROM ((((TXPBARAGR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT COUNT(*) AS BarAgrCant, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM TXPBARAGR TM1 GROUP BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPBARCAD T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarAgrCod AND T5.BarCodReo = TM1.BarAgrReo AND T5.BarCodPar = TM1.BarAgrPar) WHERE TM1.BarAgrCod = ? and TM1.BarAgrReo = ? and TM1.BarAgrPar = ? and TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarAgrCod, TM1.BarAgrReo, TM1.BarAgrPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK17", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK18", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK19", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK20", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BarAgrCod, BarAgrReo, BarAgrPar, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE ( BarAgrCod > ? or BarAgrCod = ? and BarAgrReo > ? or BarAgrReo = ? and BarAgrCod = ? and BarAgrPar > ? or BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and EmprCod > ? or EmprCod = ? and BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and BarCodPar > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01RK21", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ BarAgrCod, BarAgrReo, BarAgrPar, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR WHERE ( BarAgrCod < ? or BarAgrCod = ? and BarAgrReo < ? or BarAgrReo = ? and BarAgrCod = ? and BarAgrPar < ? or BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and EmprCod < ? or EmprCod = ? and BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarAgrPar = ? and BarAgrReo = ? and BarAgrCod = ? and BarCodPar < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarAgrCod DESC, BarAgrReo DESC, BarAgrPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01RK22", "INSERT INTO TXPBARAGR(BarAgrCod, BarAgrReo, BarAgrPar, CliCodAgr, BarAgrSer, ColNomAgr, ColNumAgr, BarAgrDsc, KgmAgr, MtrAgr, PieAgr, DisCodAgr, ColNoCAgr, ColNuCAgr, BarAgrDNu, EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrMac) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T01RK23", "UPDATE TXPBARAGR SET CliCodAgr=?, BarAgrSer=?, ColNomAgr=?, ColNumAgr=?, BarAgrDsc=?, KgmAgr=?, MtrAgr=?, PieAgr=?, DisCodAgr=?, ColNoCAgr=?, ColNuCAgr=?, BarAgrDNu=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new UpdateCursor("T01RK24", "DELETE FROM TXPBARAGR  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarAgrCod = ? AND BarAgrReo = ? AND BarAgrPar = ?", GX_NOMASK, "TXPBARAGR")
         ,new ForEachCursor("T01RK26", "SELECT COALESCE( T1.BarAgrKgm, 0) AS BarAgrKgm, COALESCE( T1.BarAgrMtr, 0) AS BarAgrMtr, COALESCE( T1.BarAgrNDes, 0) AS BarAgrNDes, COALESCE( T1.BarPNDes, 0) AS BarPNDes FROM (SELECT SUM(BarPieKil) AS BarAgrKgm, EmprCod, SUM(BarPieMet) AS BarAgrMtr, SUM(BarPiePie) AS BarAgrNDes, COUNT(*) AS BarPNDes FROM TXPBARPIE WHERE (BarCod = ?) AND (BarCodReo = ?) AND (BarCodPar = ?) GROUP BY EmprCod ) T1 WHERE T1.EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK27", "SELECT COALESCE( DisDes, ' ') AS FindDes FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01RK28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar FROM TXPBARAGR ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 8);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((String[]) buf[15])[0] = rslt.getString(15, 1);
               ((String[]) buf[16])[0] = rslt.getString(16, 6);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 16);
               ((String[]) buf[20])[0] = rslt.getString(20, 13);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 13);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 8);
               ((String[]) buf[26])[0] = rslt.getString(26, 20);
               ((String[]) buf[27])[0] = rslt.getString(27, 3);
               ((int[]) buf[28])[0] = rslt.getInt(28);
               ((byte[]) buf[29])[0] = rslt.getByte(29);
               ((String[]) buf[30])[0] = rslt.getString(30, 1);
               ((int[]) buf[31])[0] = rslt.getInt(31);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 3);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 3);
               stmt.setString(25, (String)parms[24], 1);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setString(28, (String)parms[27], 1);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setString(11, (String)parms[10], 3);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 3);
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 3);
               stmt.setString(25, (String)parms[24], 1);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setString(28, (String)parms[27], 1);
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 26);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 13);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 3);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 26);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 8);
               stmt.setString(13, (String)parms[12], 3);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 1);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setString(19, (String)parms[18], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

