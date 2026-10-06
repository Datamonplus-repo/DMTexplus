package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disobs___impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
            AV13PriCod = httpContext.GetPar( "PriCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13PriCod", AV13PriCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13PriCod, "9"))));
            AV20CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9")));
            AV21CliNom = httpContext.GetPar( "CliNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CliNom", AV21CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21CliNom, ""))));
            AV25Barser = httpContext.GetPar( "Barser") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Barser", AV25Barser);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Barser, ""))));
            AV26Barserdsc = httpContext.GetPar( "Barserdsc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Barserdsc", AV26Barserdsc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Barserdsc, ""))));
            AV27Barfecgen = localUtil.parseDateParm( httpContext.GetPar( "Barfecgen")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Barfecgen", localUtil.format(AV27Barfecgen, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV27Barfecgen));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Observaciones", ""), (short)(0)) ;
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

   public void gxnrgridlevel_level1_newrow_invoke( )
   {
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
      A378DisObsULin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsULin"))) ;
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

   public disobs___impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disobs___impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disobs___impl.class ));
   }

   public disobs___impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavPricod = UIFactory.getCheckbox(this);
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
      AV13PriCod = ((GXutil.strcmp(GXutil.rtrim( AV13PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13PriCod", AV13PriCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13PriCod, "9"))));
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell Cell CellMarginTop25", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDiscod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDiscod_Internalname, httpContext.getMessage( "Nº Disp. Int.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDiscod_Internalname, GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDiscod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiscod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiscod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV20CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV21CliNom), GXutil.rtrim( localUtil.format( AV21CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartcod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDisartcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartcod_Internalname, GXutil.rtrim( AV22DisArtCod), GXutil.rtrim( localUtil.format( AV22DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartdsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavDisartdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartdsc_Internalname, GXutil.rtrim( AV23DisArtDsc), GXutil.rtrim( localUtil.format( AV23DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtavBarfecgen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_Internalname, localUtil.format(AV27Barfecgen, "99/99/99"), localUtil.format( AV27Barfecgen, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisObs__.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial btn btn-default" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntipospresentacion_Internalname, "", httpContext.getMessage( "Tipos Presentacion", ""), bttBtntipospresentacion_Jsonclick, 5, httpContext.getMessage( "Tipos Presentacion", ""), "", StyleString, ClassString, bttBtntipospresentacion_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOTIPOSPRESENTACION\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial btn btn-default" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobservacionespedidoanterior_Internalname, "", httpContext.getMessage( "Copiar Obs. Pedido Anterior", ""), bttBtnobservacionespedidoanterior_Jsonclick, 7, httpContext.getMessage( "Copiar Obs. Pedido Anterior", ""), "", StyleString, ClassString, bttBtnobservacionespedidoanterior_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111tu34_client"+"'", TempTags, "", 2, "HLP_Pedidos\\DisObs__.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV29Pgmname), GXutil.rtrim( localUtil.format( AV29Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", edtDisCod_Visible, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisObs__.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsULin_Internalname, GXutil.ltrim( localUtil.ntoc( A378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisObsULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9") : localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsULin_Jsonclick, 0, "Attribute", "", "", "", "", edtDisObsULin_Visible, edtDisObsULin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisObs__.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPriCod_Internalname, GXutil.rtrim( A757PriCod), GXutil.rtrim( localUtil.format( A757PriCod, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPriCod_Jsonclick, 0, "Attribute", "", "", "", "", edtPriCod_Visible, edtPriCod_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisObs__.htm");
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavPricod.getInternalname(), AV13PriCod, "", "", chkavPricod.getVisible(), chkavPricod.getEnabled(), "1", "", StyleString, ClassString, "", "", "");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_observacionespedidoanterior_Internalname, tblTabledvelop_confirmpanel_observacionespedidoanterior_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("Title", Dvelop_confirmpanel_observacionespedidoanterior_Title);
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("ConfirmationText", Dvelop_confirmpanel_observacionespedidoanterior_Confirmationtext);
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("YesButtonCaption", Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttoncaption);
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("NoButtonCaption", Dvelop_confirmpanel_observacionespedidoanterior_Nobuttoncaption);
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("CancelButtonCaption", Dvelop_confirmpanel_observacionespedidoanterior_Cancelbuttoncaption);
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("YesButtonPosition", Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttonposition);
      ucDvelop_confirmpanel_observacionespedidoanterior.setProperty("ConfirmType", Dvelop_confirmpanel_observacionespedidoanterior_Confirmtype);
      ucDvelop_confirmpanel_observacionespedidoanterior.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_observacionespedidoanterior_Internalname, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIORContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIORContainer"+"Body"+"\" style=\"display:none;\">") ;
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
      startgridcontrol51( ) ;
      nGXsfl_51_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount40 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_40 = (short)(1) ;
            scanStart1TU40( ) ;
            while ( RcdFound40 != 0 )
            {
               init_level_properties40( ) ;
               getByPrimaryKey1TU40( ) ;
               addRow1TU40( ) ;
               scanNext1TU40( ) ;
            }
            scanEnd1TU40( ) ;
            nBlankRcdCount40 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B378DisObsULin = A378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         standaloneNotModal1TU40( ) ;
         standaloneModal1TU40( ) ;
         sMode40 = Gx_mode ;
         while ( nGXsfl_51_idx < nRC_GXsfl_51 )
         {
            bGXsfl_51_Refreshing = true ;
            readRow1TU40( ) ;
            edtDisObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            edtDisObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_51_Refreshing);
            if ( ( nRcdExists_40 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TU40( ) ;
            }
            sendRow1TU40( ) ;
            bGXsfl_51_Refreshing = false ;
         }
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A378DisObsULin = B378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount40 = (short)(1) ;
         nRcdExists_40 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TU40( ) ;
            while ( RcdFound40 != 0 )
            {
               sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5140( ) ;
               init_level_properties40( ) ;
               standaloneNotModal1TU40( ) ;
               getByPrimaryKey1TU40( ) ;
               standaloneModal1TU40( ) ;
               addRow1TU40( ) ;
               scanNext1TU40( ) ;
            }
            scanEnd1TU40( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode40 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_5140( ) ;
         initAll1TU40( ) ;
         init_level_properties40( ) ;
         B378DisObsULin = A378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         nRcdExists_40 = (short)(0) ;
         nIsMod_40 = (short)(0) ;
         nRcdDeleted_40 = (short)(0) ;
         nBlankRcdCount40 = (short)(nBlankRcdUsr40+nBlankRcdCount40) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount40 > 0 )
         {
            standaloneNotModal1TU40( ) ;
            standaloneModal1TU40( ) ;
            addRow1TU40( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDisObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount40 = (short)(nBlankRcdCount40-1) ;
         }
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A378DisObsULin = B378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
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
      e121TU2 ();
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
            Z378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z378DisObsULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z757PriCod = httpContext.cgiGet( "Z757PriCod") ;
            O378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( "O378DisObsULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Dvelop_confirmpanel_observacionespedidoanterior_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Objectcall") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Enabled")) ;
            Dvelop_confirmpanel_observacionespedidoanterior_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Width") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Height") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Class") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Title") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Confirmationtext") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Yesbuttoncaption") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Nobuttoncaption") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Yesbuttonposition") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Confirmtype") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Comment") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Bodytype") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Bodycontentinternalname") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Result") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Texttype") ;
            Dvelop_confirmpanel_observacionespedidoanterior_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Visible")) ;
            /* Read variables values. */
            AV8DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
            AV20CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9")));
            AV21CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21CliNom", AV21CliNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21CliNom, ""))));
            AV22DisArtCod = httpContext.cgiGet( edtavDisartcod_Internalname) ;
            AV23DisArtDsc = httpContext.cgiGet( edtavDisartdsc_Internalname) ;
            AV27Barfecgen = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Barfecgen", localUtil.format(AV27Barfecgen, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV27Barfecgen));
            AV29Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
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
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
            A757PriCod = httpContext.cgiGet( edtPriCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
            AV13PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkavPricod.getInternalname()), "1")==0) ? "1" : "0") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13PriCod", AV13PriCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13PriCod, "9"))));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DisObs__");
            AV22DisArtCod = httpContext.cgiGet( edtavDisartcod_Internalname) ;
            forbiddenHiddens.add("DisArtCod", GXutil.rtrim( localUtil.format( AV22DisArtCod, "")));
            AV23DisArtDsc = httpContext.cgiGet( edtavDisartdsc_Internalname) ;
            forbiddenHiddens.add("DisArtDsc", GXutil.rtrim( localUtil.format( AV23DisArtDsc, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("pedidos\\disobs__:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode34 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode34 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
                        confirm_1TU0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR.CLOSE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e131TU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e121TU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e141TU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOTIPOSPRESENTACION'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoTiposPresentacion' */
                        e151TU2 ();
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
         e141TU2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TU34( ) ;
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
         disableAttributes1TU34( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavDiscod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiscod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecgen_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, chkavPricod.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPricod.getEnabled(), 5, 0), true);
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

   public void confirm_1TU0( )
   {
      beforeValidate1TU34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TU34( ) ;
         }
         else
         {
            checkExtendedTable1TU34( ) ;
            closeExtendedTableCursors1TU34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1TU40( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TU40( )
   {
      s378DisObsULin = O378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow1TU40( ) ;
         if ( ( nRcdExists_40 != 0 ) || ( nIsMod_40 != 0 ) )
         {
            getKey1TU40( ) ;
            if ( ( nRcdExists_40 == 0 ) && ( nRcdDeleted_40 == 0 ) )
            {
               if ( RcdFound40 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TU40( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TU40( ) ;
                     closeExtendedTableCursors1TU40( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O378DisObsULin = A378DisObsULin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                  }
               }
               else
               {
                  GXCCtl = "DISOBSLIN_" + sGXsfl_51_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound40 != 0 )
               {
                  if ( nRcdDeleted_40 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TU40( ) ;
                     load1TU40( ) ;
                     beforeValidate1TU40( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TU40( ) ;
                        O378DisObsULin = A378DisObsULin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_40 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TU40( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TU40( ) ;
                           closeExtendedTableCursors1TU40( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O378DisObsULin = A378DisObsULin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_40 == 0 )
                  {
                     GXCCtl = "DISOBSLIN_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsTxt_Internalname, GXutil.rtrim( A377DisObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_51_idx, GXutil.rtrim( Z377DisObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_40_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_40_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_40_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_40 != 0 )
         {
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O378DisObsULin = s378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TU0( )
   {
   }

   public void e121TU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disobs___impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Station, ""))));
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      disobs___impl.this.AV7EmprCod = GXv_char2[0] ;
      disobs___impl.this.AV16EmprNom = GXv_char3[0] ;
      disobs___impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17UsurCod, "@!"))));
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtDisCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtDisObsULin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Visible), 5, 0), true);
      edtPriCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPriCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPriCod_Visible), 5, 0), true);
      chkavPricod.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavPricod.getInternalname(), "Visible", GXutil.ltrimstr( chkavPricod.getVisible(), 5, 0), true);
      GXt_int6 = (byte)(AV14moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      disobs___impl.this.GXt_int6 = GXv_int7[0] ;
      AV14moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14moda21), 4, 0));
      bttBtntipospresentacion_Visible = (((GXutil.strcmp(Gx_mode, "DSP")==0) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntipospresentacion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntipospresentacion_Visible), 5, 0), true);
      bttBtnobservacionespedidoanterior_Visible = ((((GXutil.strcmp(Gx_mode, "DSP")==0)||(0==AV14moda21)) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnobservacionespedidoanterior_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnobservacionespedidoanterior_Visible), 5, 0), true);
   }

   public void e141TU2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void e151TU2( )
   {
      /* 'DoTiposPresentacion' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.tiposdepresentacion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Emprcod","DisCod"}) , new Object[] {});
      new app.pordlinobs(remoteHandle, context).execute( AV7EmprCod, A361DisCod) ;
      callWebObject(formatLink("app.pedidos.disobs__", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV13PriCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV21CliNom)),GXutil.URLEncode(GXutil.rtrim(AV22DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV23DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV27Barfecgen))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","Barser","Barserdsc","Barfecgen"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e131TU2( )
   {
      /* Dvelop_confirmpanel_observacionespedidoanterior_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_observacionespedidoanterior_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION OBSERVACIONESPEDIDOANTERIOR' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(3);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
   }

   public void S112( )
   {
      /* 'DO ACTION OBSERVACIONESPEDIDOANTERIOR' Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message8[0] = AV18messages ;
      new app.pobscopyenc2(remoteHandle, context).execute( AV7EmprCod, AV8DisCod, AV12Var_Discod, AV17UsurCod, AV15Station, GXv_objcol_SdtMessages_Message8) ;
      AV18messages = GXv_objcol_SdtMessages_Message8[0] ;
      new app.pordlinobs(remoteHandle, context).execute( AV7EmprCod, AV8DisCod) ;
      callWebObject(formatLink("app.pedidos.disobs__", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV13PriCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV21CliNom)),GXutil.URLEncode(GXutil.rtrim(AV22DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV23DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV27Barfecgen))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","Barser","Barserdsc","Barfecgen"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1TU34( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z378DisObsULin = T01TU5_A378DisObsULin[0] ;
            Z757PriCod = T01TU5_A757PriCod[0] ;
         }
         else
         {
            Z378DisObsULin = A378DisObsULin ;
            Z757PriCod = A757PriCod ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z361DisCod = A361DisCod ;
         Z378DisObsULin = A378DisObsULin ;
         Z757PriCod = A757PriCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      AV29Pgmname = "Pedidos.DisObs__" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Pgmname", AV29Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8DisCod) )
      {
         A361DisCod = AV8DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV8DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
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
         /* Using cursor T01TU6 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T01TU6_A407EmprNom[0] ;
         n407EmprNom = T01TU6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(4);
      }
   }

   public void load1TU34( )
   {
      /* Using cursor T01TU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01TU7_A407EmprNom[0] ;
         n407EmprNom = T01TU7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A378DisObsULin = T01TU7_A378DisObsULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         A757PriCod = T01TU7_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         zm1TU34( -12) ;
      }
      pr_default.close(5);
      onLoadActions1TU34( ) ;
   }

   public void onLoadActions1TU34( )
   {
   }

   public void checkExtendedTable1TU34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01TU6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TU6_A407EmprNom[0] ;
      n407EmprNom = T01TU6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      if ( ! ( ( GXutil.strcmp(A757PriCod, "0") == 0 ) || ( GXutil.strcmp(A757PriCod, "1") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1TU34( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_13( String A396EmprCod )
   {
      /* Using cursor T01TU8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01TU8_A407EmprNom[0] ;
      n407EmprNom = T01TU8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1TU34( )
   {
      /* Using cursor T01TU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1TU34( 12) ;
         RcdFound34 = (short)(1) ;
         A361DisCod = T01TU5_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A378DisObsULin = T01TU5_A378DisObsULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         A757PriCod = T01TU5_A757PriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
         A396EmprCod = T01TU5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         O378DisObsULin = A378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TU34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1TU34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1TU34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1TU34( ) ;
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
      /* Using cursor T01TU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01TU10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TU10_A361DisCod[0] < A361DisCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01TU10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TU10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TU10_A361DisCod[0] > A361DisCod ) ) )
         {
            A396EmprCod = T01TU10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01TU10_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01TU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01TU11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TU11_A361DisCod[0] > A361DisCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01TU11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TU11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TU11_A361DisCod[0] < A361DisCod ) ) )
         {
            A396EmprCod = T01TU11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T01TU11_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TU34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A378DisObsULin = O378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TU34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               update1TU34( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               /* Insert record */
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TU34( ) ;
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
                  A378DisObsULin = O378DisObsULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TU34( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A378DisObsULin = O378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TU34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z378DisObsULin != T01TU4_A378DisObsULin[0] ) || ( GXutil.strcmp(Z757PriCod, T01TU4_A757PriCod[0]) != 0 ) )
         {
            if ( Z378DisObsULin != T01TU4_A378DisObsULin[0] )
            {
               GXutil.writeLogln("pedidos.disobs__:[seudo value changed for attri]"+"DisObsULin");
               GXutil.writeLogRaw("Old: ",Z378DisObsULin);
               GXutil.writeLogRaw("Current: ",T01TU4_A378DisObsULin[0]);
            }
            if ( GXutil.strcmp(Z757PriCod, T01TU4_A757PriCod[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disobs__:[seudo value changed for attri]"+"PriCod");
               GXutil.writeLogRaw("Old: ",Z757PriCod);
               GXutil.writeLogRaw("Current: ",T01TU4_A757PriCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TU34( )
   {
      beforeValidate1TU34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TU34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TU34( 0) ;
         checkOptimisticConcurrency1TU34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TU34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TU34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TU12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A378DisObsULin), A757PriCod, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel1TU34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TU0( ) ;
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
            load1TU34( ) ;
         }
         endLevel1TU34( ) ;
      }
      closeExtendedTableCursors1TU34( ) ;
   }

   public void update1TU34( )
   {
      beforeValidate1TU34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TU34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TU34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TU34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TU34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TU13 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A378DisObsULin), A757PriCod, A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TU34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int9[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int9) ;
                     disobs___impl.this.A396EmprCod = GXv_char4[0] ;
                     disobs___impl.this.A361DisCod = GXv_int9[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TU34( ) ;
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
         endLevel1TU34( ) ;
      }
      closeExtendedTableCursors1TU34( ) ;
   }

   public void deferredUpdate1TU34( )
   {
   }

   public void delete( )
   {
      beforeValidate1TU34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TU34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TU34( ) ;
         afterConfirm1TU34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TU34( ) ;
            if ( AnyError == 0 )
            {
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               scanStart1TU40( ) ;
               while ( RcdFound40 != 0 )
               {
                  getByPrimaryKey1TU40( ) ;
                  delete1TU40( ) ;
                  scanNext1TU40( ) ;
                  O378DisObsULin = A378DisObsULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               }
               scanEnd1TU40( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TU14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TU34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TU34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TU15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01TU15_A407EmprNom[0] ;
         n407EmprNom = T01TU15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TU16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01TU17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01TU18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01TU19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01TU20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01TU21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01TU22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01TU23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01TU24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01TU25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01TU26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevel1TU40( )
   {
      s378DisObsULin = O378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      nGXsfl_51_idx = 0 ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         readRow1TU40( ) ;
         if ( ( nRcdExists_40 != 0 ) || ( nIsMod_40 != 0 ) )
         {
            standaloneNotModal1TU40( ) ;
            getKey1TU40( ) ;
            if ( ( nRcdExists_40 == 0 ) && ( nRcdDeleted_40 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TU40( ) ;
            }
            else
            {
               if ( RcdFound40 != 0 )
               {
                  if ( ( nRcdDeleted_40 != 0 ) && ( nRcdExists_40 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TU40( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_40 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TU40( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_40 == 0 )
                  {
                     GXCCtl = "DISOBSLIN_" + sGXsfl_51_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O378DisObsULin = A378DisObsULin ;
            httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         }
         httpContext.changePostValue( edtDisObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsTxt_Internalname, GXutil.rtrim( A377DisObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_51_idx, GXutil.rtrim( Z377DisObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_40_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_40_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_40_"+sGXsfl_51_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_40 != 0 )
         {
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TU40( ) ;
      if ( AnyError != 0 )
      {
         O378DisObsULin = s378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      nRcdExists_40 = (short)(0) ;
      nIsMod_40 = (short)(0) ;
      nRcdDeleted_40 = (short)(0) ;
   }

   public void processLevel1TU34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1TU40( ) ;
      if ( AnyError != 0 )
      {
         O378DisObsULin = s378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01TU27 */
      pr_default.execute(25, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
   }

   public void endLevel1TU34( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1TU34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "pedidos.disobs__");
         if ( AnyError == 0 )
         {
            confirmValues1TU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "pedidos.disobs__");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TU34( )
   {
      /* Scan By routine */
      /* Using cursor T01TU28 */
      pr_default.execute(26);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01TU28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01TU28_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TU34( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01TU28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T01TU28_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void scanEnd1TU34( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1TU34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TU34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TU34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TU34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TU34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TU34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TU34( )
   {
      edtavDiscod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDiscod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDiscod_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarfecgen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecgen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecgen_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      edtPriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPriCod_Enabled), 5, 0), true);
      chkavPricod.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavPricod.getInternalname(), "Enabled", GXutil.ltrimstr( chkavPricod.getEnabled(), 5, 0), true);
   }

   public void zm1TU40( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z377DisObsTxt = T01TU3_A377DisObsTxt[0] ;
         }
         else
         {
            Z377DisObsTxt = A377DisObsTxt ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z361DisCod = A361DisCod ;
         Z376DisObsLin = A376DisObsLin ;
         Z377DisObsTxt = A377DisObsTxt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1TU40( )
   {
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
   }

   public void standaloneModal1TU40( )
   {
      if ( isIns( )  )
      {
         A378DisObsULin = (byte)(O378DisObsULin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A376DisObsLin = A378DisObsULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
      else
      {
         edtDisObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      }
   }

   public void load1TU40( )
   {
      /* Using cursor T01TU29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A377DisObsTxt = T01TU29_A377DisObsTxt[0] ;
         zm1TU40( -14) ;
      }
      pr_default.close(27);
      onLoadActions1TU40( ) ;
   }

   public void onLoadActions1TU40( )
   {
   }

   public void checkExtendedTable1TU40( )
   {
      nIsDirty_40 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1TU40( ) ;
   }

   public void closeExtendedTableCursors1TU40( )
   {
   }

   public void enableDisable1TU40( )
   {
   }

   public void getKey1TU40( )
   {
      /* Using cursor T01TU30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound40 = (short)(1) ;
      }
      else
      {
         RcdFound40 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey1TU40( )
   {
      /* Using cursor T01TU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TU40( 14) ;
         RcdFound40 = (short)(1) ;
         initializeNonKey1TU40( ) ;
         A376DisObsLin = T01TU3_A376DisObsLin[0] ;
         A377DisObsTxt = T01TU3_A377DisObsTxt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z376DisObsLin = A376DisObsLin ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TU40( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound40 = (short)(0) ;
         initializeNonKey1TU40( ) ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TU40( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TU40( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TU40( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSERV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z377DisObsTxt, T01TU2_A377DisObsTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z377DisObsTxt, T01TU2_A377DisObsTxt[0]) != 0 )
            {
               GXutil.writeLogln("pedidos.disobs__:[seudo value changed for attri]"+"DisObsTxt");
               GXutil.writeLogRaw("Old: ",Z377DisObsTxt);
               GXutil.writeLogRaw("Current: ",T01TU2_A377DisObsTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSERV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TU40( )
   {
      beforeValidate1TU40( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TU40( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TU40( 0) ;
         checkOptimisticConcurrency1TU40( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TU40( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TU40( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TU31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                  if ( (pr_default.getStatus(29) == 1) )
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
            load1TU40( ) ;
         }
         endLevel1TU40( ) ;
      }
      closeExtendedTableCursors1TU40( ) ;
   }

   public void update1TU40( )
   {
      beforeValidate1TU40( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TU40( ) ;
      }
      if ( ( nIsMod_40 != 0 ) || ( nIsDirty_40 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TU40( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TU40( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TU40( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TU32 */
                     pr_default.execute(30, new Object[] {A377DisObsTxt, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSERV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TU40( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int9[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int9) ;
                        disobs___impl.this.A396EmprCod = GXv_char4[0] ;
                        disobs___impl.this.A361DisCod = GXv_int9[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TU40( ) ;
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
            endLevel1TU40( ) ;
         }
      }
      closeExtendedTableCursors1TU40( ) ;
   }

   public void deferredUpdate1TU40( )
   {
   }

   public void delete1TU40( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TU40( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TU40( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TU40( ) ;
         afterConfirm1TU40( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TU40( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TU33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
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
      sMode40 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TU40( ) ;
      Gx_mode = sMode40 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TU40( )
   {
      standaloneModal1TU40( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1TU40( )
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

   public void scanStart1TU40( )
   {
      /* Scan By routine */
      /* Using cursor T01TU34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A376DisObsLin = T01TU34_A376DisObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TU40( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A376DisObsLin = T01TU34_A376DisObsLin[0] ;
      }
   }

   public void scanEnd1TU40( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1TU40( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TU40( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TU40( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TU40( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TU40( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TU40( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TU40( )
   {
      edtDisObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
      edtDisObsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void send_integrity_lvl_hashes1TU40( )
   {
   }

   public void send_integrity_lvl_hashes1TU34( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13PriCod, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV27Barfecgen));
   }

   public void subsflControlProps_5140( )
   {
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_51_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_51_idx ;
   }

   public void subsflControlProps_fel_5140( )
   {
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_51_fel_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_51_fel_idx ;
   }

   public void addRow1TU40( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5140( ) ;
      sendRow1TU40( ) ;
   }

   public void sendRow1TU40( )
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
         if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
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
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A376DisObsLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_51_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_51_idx + "',51)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsTxt_Internalname,GXutil.rtrim( A377DisObsTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisObsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1TU40( ) ;
      GXCCtl = "Z376DisObsLin_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z377DisObsTxt_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z377DisObsTxt));
      GXCCtl = "nRcdDeleted_40_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_40_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_40_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vEMPRCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vVAR_DISCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV12Var_Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vUSURCOD_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV17UsurCod));
      GXCCtl = "vSTATION_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV15Station));
      GXCCtl = "vMODE_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vBARSER_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV25Barser));
      GXCCtl = "vBARSERDSC_" + sGXsfl_51_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV26Barserdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSLIN_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSTXT_"+sGXsfl_51_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1TU40( )
   {
      nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5140( ) ;
      edtDisObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_51_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "DISOBSLIN_" + sGXsfl_51_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisObsLin_Internalname ;
         wbErr = true ;
         A376DisObsLin = (byte)(0) ;
      }
      else
      {
         A376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A377DisObsTxt = httpContext.cgiGet( edtDisObsTxt_Internalname) ;
      GXCCtl = "Z376DisObsLin_" + sGXsfl_51_idx ;
      Z376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z377DisObsTxt_" + sGXsfl_51_idx ;
      Z377DisObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_40_" + sGXsfl_51_idx ;
      nRcdDeleted_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_40_" + sGXsfl_51_idx ;
      nRcdExists_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_40_" + sGXsfl_51_idx ;
      nIsMod_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisObsLin_Enabled = edtDisObsLin_Enabled ;
   }

   public void confirmValues1TU0( )
   {
      nGXsfl_51_idx = 0 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5140( ) ;
      while ( nGXsfl_51_idx < nRC_GXsfl_51 )
      {
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5140( ) ;
         httpContext.changePostValue( "Z376DisObsLin_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z376DisObsLin_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_51_idx) ;
         httpContext.changePostValue( "Z377DisObsTxt_"+sGXsfl_51_idx, httpContext.cgiGet( "ZT_"+"Z377DisObsTxt_"+sGXsfl_51_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_51_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disobs__", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV13PriCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV21CliNom)),GXutil.URLEncode(GXutil.rtrim(AV25Barser)),GXutil.URLEncode(GXutil.rtrim(AV26Barserdsc)),GXutil.URLEncode(GXutil.formatDateParm(AV27Barfecgen))}, new String[] {"Gx_mode","EmprCod","DisCod","PriCod","CliCod","CliNom","Barser","Barserdsc","Barfecgen"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13PriCod, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFECGEN", getSecureSignedToken( "", AV27Barfecgen));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisObs__");
      forbiddenHiddens.add("DisArtCod", GXutil.rtrim( localUtil.format( AV22DisArtCod, "")));
      forbiddenHiddens.add("DisArtDsc", GXutil.rtrim( localUtil.format( AV23DisArtDsc, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disobs__:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z378DisObsULin", GXutil.ltrim( localUtil.ntoc( Z378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z757PriCod", GXutil.rtrim( Z757PriCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O378DisObsULin", GXutil.ltrim( localUtil.ntoc( O378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nGXsfl_51_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR_DISCOD", GXutil.ltrim( localUtil.ntoc( AV12Var_Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12Var_Discod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV15Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV25Barser));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25Barser, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSERDSC", GXutil.rtrim( AV26Barserdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSERDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26Barserdsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Enabled", GXutil.booltostr( Dvelop_confirmpanel_observacionespedidoanterior_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Title", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_observacionespedidoanterior_Confirmtype));
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
      return formatLink("app.pedidos.disobs__", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV13PriCod)),GXutil.URLEncode(GXutil.ltrimstr(AV20CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV21CliNom)),GXutil.URLEncode(GXutil.rtrim(AV25Barser)),GXutil.URLEncode(GXutil.rtrim(AV26Barserdsc)),GXutil.URLEncode(GXutil.formatDateParm(AV27Barfecgen))}, new String[] {"Gx_mode","EmprCod","DisCod","PriCod","CliCod","CliNom","Barser","Barserdsc","Barfecgen"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisObs__" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Observaciones", "") ;
   }

   public void initializeNonKey1TU34( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A378DisObsULin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      A757PriCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A757PriCod", A757PriCod);
      O378DisObsULin = A378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      Z378DisObsULin = (byte)(0) ;
      Z757PriCod = "" ;
   }

   public void initAll1TU34( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      initializeNonKey1TU34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TU40( )
   {
      A377DisObsTxt = "" ;
      Z377DisObsTxt = "" ;
   }

   public void initAll1TU40( )
   {
      A376DisObsLin = (byte)(0) ;
      initializeNonKey1TU40( ) ;
   }

   public void standaloneModalInsert1TU40( )
   {
      A378DisObsULin = i378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102075", true, true);
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
      httpContext.AddJavascriptSource("pedidos/disobs__.js", "?202682116102075", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties40( )
   {
      edtDisObsLin_Enabled = defedtDisObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_51_Refreshing);
   }

   public void startgridcontrol51( )
   {
      Gridlevel_level1Container.AddObjectProperty("GridName", "Gridlevel_level1");
      Gridlevel_level1Container.AddObjectProperty("Header", subGridlevel_level1_Header);
      Gridlevel_level1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_level1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_level1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddObjectProperty("CmpContext", "");
      Gridlevel_level1Container.AddObjectProperty("InMasterPage", "false");
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A377DisObsTxt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavDiscod_Internalname = "vDISCOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavDisartcod_Internalname = "vDISARTCOD" ;
      edtavDisartdsc_Internalname = "vDISARTDSC" ;
      edtavBarfecgen_Internalname = "vBARFECGEN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtDisObsLin_Internalname = "DISOBSLIN" ;
      edtDisObsTxt_Internalname = "DISOBSTXT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      bttBtntipospresentacion_Internalname = "BTNTIPOSPRESENTACION" ;
      bttBtnobservacionespedidoanterior_Internalname = "BTNOBSERVACIONESPEDIDOANTERIOR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtDisObsULin_Internalname = "DISOBSULIN" ;
      edtPriCod_Internalname = "PRICOD" ;
      chkavPricod.setInternalname( "vPRICOD" );
      Dvelop_confirmpanel_observacionespedidoanterior_Internalname = "DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR" ;
      tblTabledvelop_confirmpanel_observacionespedidoanterior_Internalname = "TABLEDVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setCaption( httpContext.getMessage( "Observaciones", "") );
      edtDisObsTxt_Jsonclick = "" ;
      edtDisObsLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtDisObsTxt_Enabled = 1 ;
      edtDisObsLin_Enabled = 1 ;
      Dvelop_confirmpanel_observacionespedidoanterior_Confirmtype = "1" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Confirmationtext = "¿Desea copiar las observaciones del Pedido Anterior?" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Title = "" ;
      chkavPricod.setEnabled( 0 );
      chkavPricod.setVisible( 1 );
      edtPriCod_Jsonclick = "" ;
      edtPriCod_Enabled = 1 ;
      edtPriCod_Visible = 1 ;
      edtDisObsULin_Jsonclick = "" ;
      edtDisObsULin_Enabled = 0 ;
      edtDisObsULin_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
      edtDisCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnobservacionespedidoanterior_Visible = 1 ;
      bttBtntipospresentacion_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtavBarfecgen_Jsonclick = "" ;
      edtavBarfecgen_Enabled = 0 ;
      edtavDisartdsc_Jsonclick = "" ;
      edtavDisartdsc_Enabled = 0 ;
      edtavDisartcod_Jsonclick = "" ;
      edtavDisartcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavDiscod_Jsonclick = "" ;
      edtavDiscod_Enabled = 0 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5140( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TU40( ) ;
         standaloneModal1TU40( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TU40( ) ;
         nGXsfl_51_idx = (int)(nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5140( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      chkavPricod.setName( "vPRICOD" );
      chkavPricod.setWebtags( "" );
      chkavPricod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavPricod.getInternalname(), "TitleCaption", chkavPricod.getCaption(), true);
      chkavPricod.setCheckedValue( "0" );
      AV13PriCod = ((GXutil.strcmp(GXutil.rtrim( AV13PriCod), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13PriCod", AV13PriCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13PriCod, "9"))));
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
      /* Using cursor T01TU15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01TU15_A407EmprNom[0] ;
      n407EmprNom = T01TU15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV21CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV25Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV26Barserdsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV27Barfecgen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV12Var_Discod',fld:'vVAR_DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV15Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV25Barser',fld:'vBARSER',pic:'',hsh:true},{av:'AV26Barserdsc',fld:'vBARSERDSC',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV21CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV27Barfecgen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV22DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV23DisArtDsc',fld:'vDISARTDSC',pic:''},{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("AFTER TRN","{handler:'e141TU2',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("'DOTIPOSPRESENTACION'","{handler:'e151TU2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV20CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV21CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV22DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV23DisArtDsc',fld:'vDISARTDSC',pic:''},{av:'AV27Barfecgen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("'DOTIPOSPRESENTACION'",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("'DOOBSERVACIONESPEDIDOANTERIOR'","{handler:'e111TU34',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("'DOOBSERVACIONESPEDIDOANTERIOR'",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR.CLOSE","{handler:'e131TU2',iparms:[{av:'Dvelop_confirmpanel_observacionespedidoanterior_Result',ctrl:'DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR',prop:'Result'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV12Var_Discod',fld:'vVAR_DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV15Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV20CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV21CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV22DisArtCod',fld:'vDISARTCOD',pic:''},{av:'AV23DisArtDsc',fld:'vDISARTDSC',pic:''},{av:'AV27Barfecgen',fld:'vBARFECGEN',pic:'',hsh:true},{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_OBSERVACIONESPEDIDOANTERIOR.CLOSE",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("VALIDV_DISCOD","{handler:'validv_Discod',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("VALIDV_DISCOD",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV13PriCod',fld:'vPRICOD',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'AV13PriCod',fld:'vPRICOD',pic:'9'}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("VALID_DISOBSULIN","{handler:'valid_Disobsulin',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("VALID_DISOBSULIN",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("VALID_PRICOD","{handler:'valid_Pricod',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("VALID_PRICOD",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("VALID_DISOBSLIN","{handler:'valid_Disobslin',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("VALID_DISOBSLIN",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
      setEventMetadata("NULL","{handler:'valid_Disobstxt',iparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]");
      setEventMetadata("NULL",",oparms:[{av:'AV13PriCod',fld:'vPRICOD',pic:'9',hsh:true}]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV13PriCod = "" ;
      wcpOAV21CliNom = "" ;
      wcpOAV25Barser = "" ;
      wcpOAV26Barserdsc = "" ;
      wcpOAV27Barfecgen = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z757PriCod = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Result = "" ;
      Z377DisObsTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV13PriCod = "" ;
      AV21CliNom = "" ;
      AV25Barser = "" ;
      AV26Barserdsc = "" ;
      AV27Barfecgen = GXutil.nullDate() ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      AV22DisArtCod = "" ;
      AV23DisArtDsc = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      bttBtntipospresentacion_Jsonclick = "" ;
      bttBtnobservacionespedidoanterior_Jsonclick = "" ;
      AV29Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A407EmprNom = "" ;
      A757PriCod = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_observacionespedidoanterior = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode40 = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Objectcall = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Width = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Height = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Class = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Comment = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Bodytype = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_observacionespedidoanterior_Texttype = "" ;
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
      A377DisObsTxt = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      GXv_int7 = new byte[1] ;
      AV18messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message8 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01TU6_A407EmprNom = new String[] {""} ;
      T01TU6_n407EmprNom = new boolean[] {false} ;
      T01TU7_A361DisCod = new int[1] ;
      T01TU7_A407EmprNom = new String[] {""} ;
      T01TU7_n407EmprNom = new boolean[] {false} ;
      T01TU7_A378DisObsULin = new byte[1] ;
      T01TU7_A757PriCod = new String[] {""} ;
      T01TU7_A396EmprCod = new String[] {""} ;
      T01TU8_A407EmprNom = new String[] {""} ;
      T01TU8_n407EmprNom = new boolean[] {false} ;
      T01TU9_A396EmprCod = new String[] {""} ;
      T01TU9_A361DisCod = new int[1] ;
      T01TU5_A361DisCod = new int[1] ;
      T01TU5_A378DisObsULin = new byte[1] ;
      T01TU5_A757PriCod = new String[] {""} ;
      T01TU5_A396EmprCod = new String[] {""} ;
      T01TU10_A396EmprCod = new String[] {""} ;
      T01TU10_A361DisCod = new int[1] ;
      T01TU11_A396EmprCod = new String[] {""} ;
      T01TU11_A361DisCod = new int[1] ;
      T01TU4_A361DisCod = new int[1] ;
      T01TU4_A378DisObsULin = new byte[1] ;
      T01TU4_A757PriCod = new String[] {""} ;
      T01TU4_A396EmprCod = new String[] {""} ;
      T01TU15_A407EmprNom = new String[] {""} ;
      T01TU15_n407EmprNom = new boolean[] {false} ;
      T01TU16_A396EmprCod = new String[] {""} ;
      T01TU16_A361DisCod = new int[1] ;
      T01TU16_A13376DisTraID = new String[] {""} ;
      T01TU17_A396EmprCod = new String[] {""} ;
      T01TU17_A361DisCod = new int[1] ;
      T01TU17_A13213DisNormID = new String[] {""} ;
      T01TU18_A396EmprCod = new String[] {""} ;
      T01TU18_A361DisCod = new int[1] ;
      T01TU18_A13081DisDGLin = new byte[1] ;
      T01TU18_A13082DisDGDibCl = new String[] {""} ;
      T01TU18_A13083DisDGDibIn = new int[1] ;
      T01TU18_A13084DisDGComb = new String[] {""} ;
      T01TU18_A13085DisDGFondo = new String[] {""} ;
      T01TU19_A396EmprCod = new String[] {""} ;
      T01TU19_A361DisCod = new int[1] ;
      T01TU19_A7068DisNotLin = new byte[1] ;
      T01TU20_A396EmprCod = new String[] {""} ;
      T01TU20_A361DisCod = new int[1] ;
      T01TU20_A10197ProEspCod = new String[] {""} ;
      T01TU21_A396EmprCod = new String[] {""} ;
      T01TU21_A361DisCod = new int[1] ;
      T01TU21_A4594AccCod = new short[1] ;
      T01TU22_A396EmprCod = new String[] {""} ;
      T01TU22_A361DisCod = new int[1] ;
      T01TU22_A2524DisComLin = new byte[1] ;
      T01TU22_A1056DisComCod = new String[] {""} ;
      T01TU22_A1032FonCod = new String[] {""} ;
      T01TU23_A396EmprCod = new String[] {""} ;
      T01TU23_A361DisCod = new int[1] ;
      T01TU23_A3398DisRefBarC = new int[1] ;
      T01TU23_A3399DisRefBCRe = new byte[1] ;
      T01TU23_A3400DisRefBCPa = new String[] {""} ;
      T01TU23_A3607DisRefBPie = new String[] {""} ;
      T01TU24_A396EmprCod = new String[] {""} ;
      T01TU24_A361DisCod = new int[1] ;
      T01TU24_A758ProCod = new String[] {""} ;
      T01TU25_A396EmprCod = new String[] {""} ;
      T01TU25_A361DisCod = new int[1] ;
      T01TU25_A833TipDefCod = new short[1] ;
      T01TU26_A396EmprCod = new String[] {""} ;
      T01TU26_A361DisCod = new int[1] ;
      T01TU26_A44AlbRecCod = new int[1] ;
      T01TU28_A396EmprCod = new String[] {""} ;
      T01TU28_A361DisCod = new int[1] ;
      T01TU29_A361DisCod = new int[1] ;
      T01TU29_A376DisObsLin = new byte[1] ;
      T01TU29_A377DisObsTxt = new String[] {""} ;
      T01TU29_A396EmprCod = new String[] {""} ;
      T01TU30_A396EmprCod = new String[] {""} ;
      T01TU30_A361DisCod = new int[1] ;
      T01TU30_A376DisObsLin = new byte[1] ;
      T01TU3_A361DisCod = new int[1] ;
      T01TU3_A376DisObsLin = new byte[1] ;
      T01TU3_A377DisObsTxt = new String[] {""} ;
      T01TU3_A396EmprCod = new String[] {""} ;
      T01TU2_A361DisCod = new int[1] ;
      T01TU2_A376DisObsLin = new byte[1] ;
      T01TU2_A377DisObsTxt = new String[] {""} ;
      T01TU2_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      T01TU34_A396EmprCod = new String[] {""} ;
      T01TU34_A361DisCod = new int[1] ;
      T01TU34_A376DisObsLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs____moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs____vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs____colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs____ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disobs____default(),
         new Object[] {
             new Object[] {
            T01TU2_A361DisCod, T01TU2_A376DisObsLin, T01TU2_A377DisObsTxt, T01TU2_A396EmprCod
            }
            , new Object[] {
            T01TU3_A361DisCod, T01TU3_A376DisObsLin, T01TU3_A377DisObsTxt, T01TU3_A396EmprCod
            }
            , new Object[] {
            T01TU4_A361DisCod, T01TU4_A378DisObsULin, T01TU4_A757PriCod, T01TU4_A396EmprCod
            }
            , new Object[] {
            T01TU5_A361DisCod, T01TU5_A378DisObsULin, T01TU5_A757PriCod, T01TU5_A396EmprCod
            }
            , new Object[] {
            T01TU6_A407EmprNom, T01TU6_n407EmprNom
            }
            , new Object[] {
            T01TU7_A361DisCod, T01TU7_A407EmprNom, T01TU7_n407EmprNom, T01TU7_A378DisObsULin, T01TU7_A757PriCod, T01TU7_A396EmprCod
            }
            , new Object[] {
            T01TU8_A407EmprNom, T01TU8_n407EmprNom
            }
            , new Object[] {
            T01TU9_A396EmprCod, T01TU9_A361DisCod
            }
            , new Object[] {
            T01TU10_A396EmprCod, T01TU10_A361DisCod
            }
            , new Object[] {
            T01TU11_A396EmprCod, T01TU11_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TU15_A407EmprNom, T01TU15_n407EmprNom
            }
            , new Object[] {
            T01TU16_A396EmprCod, T01TU16_A361DisCod, T01TU16_A13376DisTraID
            }
            , new Object[] {
            T01TU17_A396EmprCod, T01TU17_A361DisCod, T01TU17_A13213DisNormID
            }
            , new Object[] {
            T01TU18_A396EmprCod, T01TU18_A361DisCod, T01TU18_A13081DisDGLin, T01TU18_A13082DisDGDibCl, T01TU18_A13083DisDGDibIn, T01TU18_A13084DisDGComb, T01TU18_A13085DisDGFondo
            }
            , new Object[] {
            T01TU19_A396EmprCod, T01TU19_A361DisCod, T01TU19_A7068DisNotLin
            }
            , new Object[] {
            T01TU20_A396EmprCod, T01TU20_A361DisCod, T01TU20_A10197ProEspCod
            }
            , new Object[] {
            T01TU21_A396EmprCod, T01TU21_A361DisCod, T01TU21_A4594AccCod
            }
            , new Object[] {
            T01TU22_A396EmprCod, T01TU22_A361DisCod, T01TU22_A2524DisComLin, T01TU22_A1056DisComCod, T01TU22_A1032FonCod
            }
            , new Object[] {
            T01TU23_A396EmprCod, T01TU23_A361DisCod, T01TU23_A3398DisRefBarC, T01TU23_A3399DisRefBCRe, T01TU23_A3400DisRefBCPa, T01TU23_A3607DisRefBPie
            }
            , new Object[] {
            T01TU24_A396EmprCod, T01TU24_A361DisCod, T01TU24_A758ProCod
            }
            , new Object[] {
            T01TU25_A396EmprCod, T01TU25_A361DisCod, T01TU25_A833TipDefCod
            }
            , new Object[] {
            T01TU26_A396EmprCod, T01TU26_A361DisCod, T01TU26_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            T01TU28_A396EmprCod, T01TU28_A361DisCod
            }
            , new Object[] {
            T01TU29_A361DisCod, T01TU29_A376DisObsLin, T01TU29_A377DisObsTxt, T01TU29_A396EmprCod
            }
            , new Object[] {
            T01TU30_A396EmprCod, T01TU30_A361DisCod, T01TU30_A376DisObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TU34_A396EmprCod, T01TU34_A361DisCod, T01TU34_A376DisObsLin
            }
         }
      );
      AV29Pgmname = "Pedidos.DisObs__" ;
   }

   private byte Z378DisObsULin ;
   private byte O378DisObsULin ;
   private byte Z376DisObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A378DisObsULin ;
   private byte Gx_BScreen ;
   private byte B378DisObsULin ;
   private byte s378DisObsULin ;
   private byte A376DisObsLin ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i378DisObsULin ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_40 ;
   private short nRcdExists_40 ;
   private short nIsMod_40 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount40 ;
   private short RcdFound40 ;
   private short nBlankRcdUsr40 ;
   private short RcdFound34 ;
   private short AV14moda21 ;
   private short nIsDirty_34 ;
   private short nIsDirty_40 ;
   private int wcpOAV8DisCod ;
   private int wcpOAV20CliCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int AV8DisCod ;
   private int AV20CliCod ;
   private int trnEnded ;
   private int edtavDiscod_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavDisartcod_Enabled ;
   private int edtavDisartdsc_Enabled ;
   private int edtavBarfecgen_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int bttBtntipospresentacion_Visible ;
   private int bttBtnobservacionespedidoanterior_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int A361DisCod ;
   private int edtDisCod_Visible ;
   private int edtDisCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtDisObsULin_Enabled ;
   private int edtDisObsULin_Visible ;
   private int edtPriCod_Visible ;
   private int edtPriCod_Enabled ;
   private int edtDisObsLin_Enabled ;
   private int edtDisObsTxt_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int AV12Var_Discod ;
   private int GX_JID ;
   private int GXv_int9[] ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtDisObsLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV13PriCod ;
   private String wcpOAV21CliNom ;
   private String wcpOAV25Barser ;
   private String wcpOAV26Barserdsc ;
   private String Z396EmprCod ;
   private String Z757PriCod ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Result ;
   private String Z377DisObsTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV13PriCod ;
   private String AV21CliNom ;
   private String AV25Barser ;
   private String AV26Barserdsc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_51_idx="0001" ;
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
   private String edtavDiscod_Internalname ;
   private String edtavDiscod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavDisartcod_Internalname ;
   private String AV22DisArtCod ;
   private String edtavDisartcod_Jsonclick ;
   private String edtavDisartdsc_Internalname ;
   private String AV23DisArtDsc ;
   private String edtavDisartdsc_Jsonclick ;
   private String edtavBarfecgen_Internalname ;
   private String edtavBarfecgen_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String bttBtntipospresentacion_Internalname ;
   private String bttBtntipospresentacion_Jsonclick ;
   private String bttBtnobservacionespedidoanterior_Internalname ;
   private String bttBtnobservacionespedidoanterior_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV29Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtDisObsULin_Internalname ;
   private String edtDisObsULin_Jsonclick ;
   private String edtPriCod_Internalname ;
   private String A757PriCod ;
   private String edtPriCod_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_observacionespedidoanterior_Internalname ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Title ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Confirmationtext ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Nobuttoncaption ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Yesbuttonposition ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Confirmtype ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Internalname ;
   private String sMode40 ;
   private String edtDisObsLin_Internalname ;
   private String edtDisObsTxt_Internalname ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Objectcall ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Width ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Height ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Class ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Comment ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Bodytype ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_observacionespedidoanterior_Texttype ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A377DisObsTxt ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String Z407EmprNom ;
   private String GXv_char4[] ;
   private String sGXsfl_51_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtDisObsLin_Jsonclick ;
   private String edtDisObsTxt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private java.util.Date wcpOAV27Barfecgen ;
   private java.util.Date AV27Barfecgen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Dvelop_confirmpanel_observacionespedidoanterior_Enabled ;
   private boolean Dvelop_confirmpanel_observacionespedidoanterior_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_observacionespedidoanterior ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavPricod ;
   private IDataStoreProvider pr_default ;
   private String[] T01TU6_A407EmprNom ;
   private boolean[] T01TU6_n407EmprNom ;
   private int[] T01TU7_A361DisCod ;
   private String[] T01TU7_A407EmprNom ;
   private boolean[] T01TU7_n407EmprNom ;
   private byte[] T01TU7_A378DisObsULin ;
   private String[] T01TU7_A757PriCod ;
   private String[] T01TU7_A396EmprCod ;
   private String[] T01TU8_A407EmprNom ;
   private boolean[] T01TU8_n407EmprNom ;
   private String[] T01TU9_A396EmprCod ;
   private int[] T01TU9_A361DisCod ;
   private int[] T01TU5_A361DisCod ;
   private byte[] T01TU5_A378DisObsULin ;
   private String[] T01TU5_A757PriCod ;
   private String[] T01TU5_A396EmprCod ;
   private String[] T01TU10_A396EmprCod ;
   private int[] T01TU10_A361DisCod ;
   private String[] T01TU11_A396EmprCod ;
   private int[] T01TU11_A361DisCod ;
   private int[] T01TU4_A361DisCod ;
   private byte[] T01TU4_A378DisObsULin ;
   private String[] T01TU4_A757PriCod ;
   private String[] T01TU4_A396EmprCod ;
   private String[] T01TU15_A407EmprNom ;
   private boolean[] T01TU15_n407EmprNom ;
   private String[] T01TU16_A396EmprCod ;
   private int[] T01TU16_A361DisCod ;
   private String[] T01TU16_A13376DisTraID ;
   private String[] T01TU17_A396EmprCod ;
   private int[] T01TU17_A361DisCod ;
   private String[] T01TU17_A13213DisNormID ;
   private String[] T01TU18_A396EmprCod ;
   private int[] T01TU18_A361DisCod ;
   private byte[] T01TU18_A13081DisDGLin ;
   private String[] T01TU18_A13082DisDGDibCl ;
   private int[] T01TU18_A13083DisDGDibIn ;
   private String[] T01TU18_A13084DisDGComb ;
   private String[] T01TU18_A13085DisDGFondo ;
   private String[] T01TU19_A396EmprCod ;
   private int[] T01TU19_A361DisCod ;
   private byte[] T01TU19_A7068DisNotLin ;
   private String[] T01TU20_A396EmprCod ;
   private int[] T01TU20_A361DisCod ;
   private String[] T01TU20_A10197ProEspCod ;
   private String[] T01TU21_A396EmprCod ;
   private int[] T01TU21_A361DisCod ;
   private short[] T01TU21_A4594AccCod ;
   private String[] T01TU22_A396EmprCod ;
   private int[] T01TU22_A361DisCod ;
   private byte[] T01TU22_A2524DisComLin ;
   private String[] T01TU22_A1056DisComCod ;
   private String[] T01TU22_A1032FonCod ;
   private String[] T01TU23_A396EmprCod ;
   private int[] T01TU23_A361DisCod ;
   private int[] T01TU23_A3398DisRefBarC ;
   private byte[] T01TU23_A3399DisRefBCRe ;
   private String[] T01TU23_A3400DisRefBCPa ;
   private String[] T01TU23_A3607DisRefBPie ;
   private String[] T01TU24_A396EmprCod ;
   private int[] T01TU24_A361DisCod ;
   private String[] T01TU24_A758ProCod ;
   private String[] T01TU25_A396EmprCod ;
   private int[] T01TU25_A361DisCod ;
   private short[] T01TU25_A833TipDefCod ;
   private String[] T01TU26_A396EmprCod ;
   private int[] T01TU26_A361DisCod ;
   private int[] T01TU26_A44AlbRecCod ;
   private String[] T01TU28_A396EmprCod ;
   private int[] T01TU28_A361DisCod ;
   private int[] T01TU29_A361DisCod ;
   private byte[] T01TU29_A376DisObsLin ;
   private String[] T01TU29_A377DisObsTxt ;
   private String[] T01TU29_A396EmprCod ;
   private String[] T01TU30_A396EmprCod ;
   private int[] T01TU30_A361DisCod ;
   private byte[] T01TU30_A376DisObsLin ;
   private int[] T01TU3_A361DisCod ;
   private byte[] T01TU3_A376DisObsLin ;
   private String[] T01TU3_A377DisObsTxt ;
   private String[] T01TU3_A396EmprCod ;
   private int[] T01TU2_A361DisCod ;
   private byte[] T01TU2_A376DisObsLin ;
   private String[] T01TU2_A377DisObsTxt ;
   private String[] T01TU2_A396EmprCod ;
   private String[] T01TU34_A396EmprCod ;
   private int[] T01TU34_A361DisCod ;
   private byte[] T01TU34_A376DisObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV18messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class disobs____moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disobs____vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disobs____colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disobs____ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class disobs____default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TU2", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?  FOR UPDATE OF DisObsTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU3", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU4", "SELECT DisCod, DisObsULin, PriCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisObsULin, PriCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU5", "SELECT DisCod, DisObsULin, PriCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU7", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, T2.EmprNom, TM1.DisObsULin, TM1.PriCod, TM1.EmprCod FROM (TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ?) ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ?) ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TU12", "INSERT INTO TXPDISPOS(DisCod, DisObsULin, PriCod, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01TU13", "UPDATE TXPDISPOS SET DisObsULin=?, PriCod=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01TU14", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01TU15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU16", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU17", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU18", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU19", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU20", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU21", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU22", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU23", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU24", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU25", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TU26", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TU27", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01TU28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU29", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? and DisObsLin = ? ORDER BY EmprCod, DisCod, DisObsLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TU30", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TU31", "INSERT INTO TXPOBSERV(DisCod, DisObsLin, DisObsTxt, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSERV")
         ,new UpdateCursor("T01TU32", "UPDATE TXPOBSERV SET DisObsTxt=?  WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?", GX_NOMASK, "TXPOBSERV")
         ,new UpdateCursor("T01TU33", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?", GX_NOMASK, "TXPOBSERV")
         ,new ForEachCursor("T01TU34", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
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
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

