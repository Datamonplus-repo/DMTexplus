package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpedido_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         AV46FlagExi = (byte)(GXutil.lval( httpContext.GetPar( "FlagExi"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExi", GXutil.str( AV46FlagExi, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_1TN77( Gx_mode, A396EmprCod, A719PrdNum, A795PrvNum, AV46FlagExi) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action54") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         AV25OldPedCum = httpContext.GetPar( "OldPedCum") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_54_1TN77( A396EmprCod, A658PedCod, A719PrdNum, AV25OldPedCum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A657PedCanEnt = CommonUtil.decimalVal( httpContext.GetPar( "PedCanEnt"), ".") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_57_1TN77( A396EmprCod, A658PedCod, A719PrdNum, A657PedCanEnt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action58") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV84Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
         AV10UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
         AV8Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
         AV81Texto_i = httpContext.GetPar( "Texto_i") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81Texto_i", AV81Texto_i);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_58_1TN77( A396EmprCod, AV84Pgmname, AV10UsurCod, AV8Station, AV81Texto_i, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"PEDNUMLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx15asapednumlin1TN76( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel33"+"_"+"PEDNUMLIN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx33asapednumlin1TN77( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel37"+"_"+"PEDPRE") == 0 )
      {
         Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx37asapedpre1TN77( Gx_BScreen, Gx_mode, A396EmprCod, A719PrdNum, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_61( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A3143PrvDivCo = (byte)(GXutil.lval( httpContext.GetPar( "PrvDivCo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A3143PrvDivCo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_62") == 0 )
      {
         A3113PedCDivCod = (byte)(GXutil.lval( httpContext.GetPar( "PedCDivCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3113PedCDivCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_62( A3113PedCDivCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_64") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_64( A396EmprCod, A658PedCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_66") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_66( A396EmprCod, A719PrdNum) ;
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
            AV12EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12EmprCod, "@!"))));
            AV13PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13PedCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13PedCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Orden de compra de Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPedCod_Internalname ;
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
      nRC_GXsfl_96 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_96"))) ;
      nGXsfl_96_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_96_idx"))) ;
      sGXsfl_96_idx = httpContext.GetPar( "sGXsfl_96_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
      n658PedCod = false ;
      AV60Noprecio = (byte)(GXutil.lval( httpContext.GetPar( "Noprecio"))) ;
      AV79SiCantidadentregada = (byte)(GXutil.lval( httpContext.GetPar( "SiCantidadentregada"))) ;
      AV80SiPrecio = (byte)(GXutil.lval( httpContext.GetPar( "SiPrecio"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tpedido_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpedido_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpedido_trn_impl.class ));
   }

   public tpedido_trn_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbPedCum = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedCod_Internalname, httpContext.getMessage( "Nº Pedido", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedCod_Internalname, GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPedFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFec_Internalname, localUtil.format(A661PedFec, "99/99/99"), localUtil.format( A661PedFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDIDO_Trn.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedFecEnt_Internalname, httpContext.getMessage( "Fecha Ent. Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPedFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedFecEnt_Internalname, localUtil.format(A662PedFecEnt, "99/99/99"), localUtil.format( A662PedFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedFecEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPedFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPedFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPEDIDO_Trn.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPrvDPP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPrvDPP_Internalname, httpContext.getMessage( "Dto P.P.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPrvDPP_Internalname, GXutil.ltrim( localUtil.ntoc( A8153PedPrvDPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedPrvDPP_Enabled!=0) ? localUtil.format( A8153PedPrvDPP, "ZZ9.99") : localUtil.format( A8153PedPrvDPP, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPrvDPP_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedPrvDPP_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divDvpanel_datosproveedor_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_datosproveedor_cell_Class, "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_datosproveedor.setProperty("Width", Dvpanel_datosproveedor_Width);
      ucDvpanel_datosproveedor.setProperty("AutoWidth", Dvpanel_datosproveedor_Autowidth);
      ucDvpanel_datosproveedor.setProperty("AutoHeight", Dvpanel_datosproveedor_Autoheight);
      ucDvpanel_datosproveedor.setProperty("Cls", Dvpanel_datosproveedor_Cls);
      ucDvpanel_datosproveedor.setProperty("Title", Dvpanel_datosproveedor_Title);
      ucDvpanel_datosproveedor.setProperty("Collapsible", Dvpanel_datosproveedor_Collapsible);
      ucDvpanel_datosproveedor.setProperty("Collapsed", Dvpanel_datosproveedor_Collapsed);
      ucDvpanel_datosproveedor.setProperty("ShowCollapseIcon", Dvpanel_datosproveedor_Showcollapseicon);
      ucDvpanel_datosproveedor.setProperty("IconPosition", Dvpanel_datosproveedor_Iconposition);
      ucDvpanel_datosproveedor.setProperty("AutoScroll", Dvpanel_datosproveedor_Autoscroll);
      ucDvpanel_datosproveedor.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_datosproveedor_Internalname, "DVPANEL_DATOSPROVEEDORContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_DATOSPROVEEDORContainer"+"DatosProveedor"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divDatosproveedor_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNom_Internalname, httpContext.getMessage( "Proveedor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvDir_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvDir_Internalname, httpContext.getMessage( "Direccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvDir_Internalname, GXutil.rtrim( A786PrvDir), GXutil.rtrim( localUtil.format( A786PrvDir, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvDir_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvDir_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvPob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvPob_Internalname, httpContext.getMessage( "Poblacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvPob_Internalname, GXutil.rtrim( A799PrvPob), GXutil.rtrim( localUtil.format( A799PrvPob, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvPob_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvPob_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvTlf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvTlf_Internalname, httpContext.getMessage( "Telefonos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlf_Internalname, GXutil.rtrim( A803PrvTlf), GXutil.rtrim( localUtil.format( A803PrvTlf, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvTlf_Enabled, 0, "text", "", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvTlx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvTlx_Internalname, httpContext.getMessage( "Telex", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvTlx_Internalname, GXutil.rtrim( A804PrvTlx), GXutil.rtrim( localUtil.format( A804PrvTlx, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvTlx_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrvTlx_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, divUnnamedtable9_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPerDes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPerDes_Internalname, httpContext.getMessage( "Destinatario Pedido Compras", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPerDes_Internalname, GXutil.rtrim( A8154PedPerDes), GXutil.rtrim( localUtil.format( A8154PedPerDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPerDes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedPerDes_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPedPerPet_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPedPerPet_Internalname, httpContext.getMessage( "Peticionario Pedido Compras", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedPerPet_Internalname, GXutil.rtrim( A8155PedPerPet), GXutil.rtrim( localUtil.format( A8155PedPerPet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedPerPet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPedPerPet_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTotal1_Internalname, "0.00", "", "", lblTotal1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_TPEDIDO_Trn.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTotal2_Internalname, "0.00", "", "", lblTotal2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_Trn.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPEDIDO_Trn.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV84Pgmname), GXutil.rtrim( localUtil.format( AV84Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPEDIDO_Trn.htm");
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
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItemText", Combo_prdnum_Emptyitemtext);
      ucCombo_prdnum.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV21PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedTot_Internalname, GXutil.ltrim( localUtil.ntoc( A668PedTot, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedTot_Enabled!=0) ? localUtil.format( A668PedTot, "ZZZ,ZZZ,ZZ9.99") : localUtil.format( A668PedTot, "ZZZ,ZZZ,ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedTot_Jsonclick, 0, "Attribute", "", "", "", "", edtPedTot_Visible, edtPedTot_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPedTotsind_Internalname, GXutil.ltrim( localUtil.ntoc( A14202PedTotsind, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPedTotsind_Enabled!=0) ? localUtil.format( A14202PedTotsind, "ZZZZZZZZ9.99") : localUtil.format( A14202PedTotsind, "ZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPedTotsind_Jsonclick, 0, "Attribute", "", "", "", "", edtPedTotsind_Visible, edtPedTotsind_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV20PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrvnum_Visible, edtavPrvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPEDIDO_Trn.htm");
      /* User Defined Control */
      ucGridlevel_level1_titlescategories.setProperty("GridTitlesCategories", Gridlevel_level1_titlescategories_Gridtitlescategories);
      ucGridlevel_level1_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_level1_titlescategories_Internalname, "GRIDLEVEL_LEVEL1_TITLESCATEGORIESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol96( ) ;
      nGXsfl_96_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount77 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_77 = (short)(1) ;
            scanStart1TN77( ) ;
            while ( RcdFound77 != 0 )
            {
               init_level_properties77( ) ;
               getByPrimaryKey1TN77( ) ;
               addRow1TN77( ) ;
               scanNext1TN77( ) ;
            }
            scanEnd1TN77( ) ;
            nBlankRcdCount77 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B14202PedTotsind = A14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         B668PedTot = A668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         B14115PedCantEn = A14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         B14114PedCant = A14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         B661PedFec = A661PedFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         standaloneNotModal1TN77( ) ;
         standaloneModal1TN77( ) ;
         sMode77 = Gx_mode ;
         while ( nGXsfl_96_idx < nRC_GXsfl_96 )
         {
            bGXsfl_96_Refreshing = true ;
            readRow1TN77( ) ;
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDUNI_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedUni_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedCanEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCANENT_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtCantPdte_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANTPDTE_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCantPdte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantPdte_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDPRE_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDDTO_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDto_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDVAL_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedVal_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedValForm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDVALFORM_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedValForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedValForm_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            cmbPedCum.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PEDCUM_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPedCum.getEnabled(), 5, 0), !bGXsfl_96_Refreshing);
            edtPedFecPEn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDFECPEN_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedFecPEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecPEn_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            edtPedLinObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDLINOBS_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedLinObs_Enabled), 5, 0), !bGXsfl_96_Refreshing);
            if ( ( nRcdExists_77 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TN77( ) ;
            }
            sendRow1TN77( ) ;
            bGXsfl_96_Refreshing = false ;
         }
         Gx_mode = sMode77 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A14202PedTotsind = B14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         A668PedTot = B668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14115PedCantEn = B14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         A14114PedCant = B14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         A661PedFec = B661PedFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount77 = (short)(5) ;
         nRcdExists_77 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TN77( ) ;
            while ( RcdFound77 != 0 )
            {
               sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_9677( ) ;
               init_level_properties77( ) ;
               standaloneNotModal1TN77( ) ;
               getByPrimaryKey1TN77( ) ;
               standaloneModal1TN77( ) ;
               addRow1TN77( ) ;
               scanNext1TN77( ) ;
            }
            scanEnd1TN77( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode77 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_9677( ) ;
         initAll1TN77( ) ;
         init_level_properties77( ) ;
         B14202PedTotsind = A14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         B668PedTot = A668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         B14115PedCantEn = A14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         B14114PedCant = A14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         B661PedFec = A661PedFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         nRcdExists_77 = (short)(0) ;
         nIsMod_77 = (short)(0) ;
         nRcdDeleted_77 = (short)(0) ;
         nBlankRcdCount77 = (short)(nBlankRcdUsr77+nBlankRcdCount77) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount77 > 0 )
         {
            standaloneNotModal1TN77( ) ;
            standaloneModal1TN77( ) ;
            addRow1TN77( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount77 = (short)(nBlankRcdCount77-1) ;
         }
         Gx_mode = sMode77 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A14202PedTotsind = B14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         A668PedTot = B668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14115PedCantEn = B14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         A14114PedCant = B14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         A661PedFec = B661PedFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
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
      e111TN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV22DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV21PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z658PedCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z661PedFec = localUtil.ctod( httpContext.cgiGet( "Z661PedFec"), 0) ;
            Z662PedFecEnt = localUtil.ctod( httpContext.cgiGet( "Z662PedFecEnt"), 0) ;
            Z667PedSit = httpContext.cgiGet( "Z667PedSit") ;
            Z666PedPri = httpContext.cgiGet( "Z666PedPri") ;
            Z6160PedCodExt = httpContext.cgiGet( "Z6160PedCodExt") ;
            Z6712PedEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6712PedEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8153PedPrvDPP = localUtil.ctond( httpContext.cgiGet( "Z8153PedPrvDPP")) ;
            Z8154PedPerDes = httpContext.cgiGet( "Z8154PedPerDes") ;
            Z8155PedPerPet = httpContext.cgiGet( "Z8155PedPerPet") ;
            Z12580PedAlmc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12580PedAlmc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z3113PedCDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3113PedCDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A667PedSit = httpContext.cgiGet( "Z667PedSit") ;
            A666PedPri = httpContext.cgiGet( "Z666PedPri") ;
            A6160PedCodExt = httpContext.cgiGet( "Z6160PedCodExt") ;
            A6712PedEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6712PedEnv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12580PedAlmc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12580PedAlmc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3113PedCDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3113PedCDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O14202PedTotsind = localUtil.ctond( httpContext.cgiGet( "O14202PedTotsind")) ;
            O668PedTot = localUtil.ctond( httpContext.cgiGet( "O668PedTot")) ;
            O14115PedCantEn = localUtil.ctond( httpContext.cgiGet( "O14115PedCantEn")) ;
            O14114PedCant = localUtil.ctond( httpContext.cgiGet( "O14114PedCant")) ;
            O661PedFec = localUtil.ctod( httpContext.cgiGet( "O661PedFec"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_96 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_96"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N3113PedCDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "N3113PedCDivCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8156PedImpDPP = localUtil.ctond( httpContext.cgiGet( "PEDIMPDPP")) ;
            A8157PedTotGen = localUtil.ctond( httpContext.cgiGet( "PEDTOTGEN")) ;
            AV12EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV13PedCod = (int)(localUtil.ctol( httpContext.cgiGet( "vPEDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Insert_PedCDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PEDCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3143PrvDivCo = (byte)(localUtil.ctol( httpContext.cgiGet( "PRVDIVCO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3113PedCDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDCDIVCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV26OldPedFec = localUtil.ctod( httpContext.cgiGet( "vOLDPEDFEC"), 0) ;
            A664PedNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A667PedSit = httpContext.cgiGet( "PEDSIT") ;
            A666PedPri = httpContext.cgiGet( "PEDPRI") ;
            A6160PedCodExt = httpContext.cgiGet( "PEDCODEXT") ;
            A6712PedEnv = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDENV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12580PedAlmc = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDALMC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( "EMPNUMDEC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            A3314PrvCar = httpContext.cgiGet( "PRVCAR") ;
            n3314PrvCar = false ;
            A3114PedCDivAbr = httpContext.cgiGet( "PEDCDIVABR") ;
            n3114PedCDivAbr = false ;
            A3144PrvDivAbr = httpContext.cgiGet( "PRVDIVABR") ;
            n3144PrvDivAbr = false ;
            A14114PedCant = localUtil.ctond( httpContext.cgiGet( "PEDCANT")) ;
            A14115PedCantEn = localUtil.ctond( httpContext.cgiGet( "PEDCANTEN")) ;
            A14203PedValsinD = localUtil.ctond( httpContext.cgiGet( "PEDVALSIND")) ;
            AV60Noprecio = (byte)(localUtil.ctol( httpContext.cgiGet( "vNOPRECIO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV80SiPrecio = (byte)(localUtil.ctol( httpContext.cgiGet( "vSIPRECIO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "PRDCANPEN")) ;
            AV62OldPedEnt = localUtil.ctond( httpContext.cgiGet( "vOLDPEDENT")) ;
            AV24OldPedUni = localUtil.ctond( httpContext.cgiGet( "vOLDPEDUNI")) ;
            AV25OldPedCum = httpContext.cgiGet( "vOLDPEDCUM") ;
            AV81Texto_i = httpContext.cgiGet( "vTEXTO_I") ;
            AV79SiCantidadentregada = (byte)(localUtil.ctol( httpContext.cgiGet( "vSICANTIDADENTREGADA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV46FlagExi = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGEXI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV8Station = httpContext.cgiGet( "vSTATION") ;
            A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( "PEDFULENT"), 0) ;
            A3372PedNumCoP = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMCOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3373PedConInP = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCONINP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3374PedConFiP = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCONFIP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3375PedNumCoE = (short)(localUtil.ctol( httpContext.cgiGet( "PEDNUMCOE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3376PedConInE = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCONINE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3377PedConFiE = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCONFIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3378PedEtiPrd = (byte)(localUtil.ctol( httpContext.cgiGet( "PEDETIPRD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6289PedNumRq = (int)(localUtil.ctol( httpContext.cgiGet( "PEDNUMRQ"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "PRDPREACT")) ;
            Dvpanel_datosproveedor_Objectcall = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Objectcall") ;
            Dvpanel_datosproveedor_Class = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Class") ;
            Dvpanel_datosproveedor_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Enabled")) ;
            Dvpanel_datosproveedor_Width = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Width") ;
            Dvpanel_datosproveedor_Height = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Height") ;
            Dvpanel_datosproveedor_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Autowidth")) ;
            Dvpanel_datosproveedor_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Autoheight")) ;
            Dvpanel_datosproveedor_Cls = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Cls") ;
            Dvpanel_datosproveedor_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Showheader")) ;
            Dvpanel_datosproveedor_Title = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Title") ;
            Dvpanel_datosproveedor_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Collapsible")) ;
            Dvpanel_datosproveedor_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Collapsed")) ;
            Dvpanel_datosproveedor_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Showcollapseicon")) ;
            Dvpanel_datosproveedor_Iconposition = httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Iconposition") ;
            Dvpanel_datosproveedor_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Autoscroll")) ;
            Dvpanel_datosproveedor_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DATOSPROVEEDOR_Visible")) ;
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
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            Gridlevel_level1_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_level1_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Class") ;
            Gridlevel_level1_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_level1_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_level1_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_level1_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Visible")) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A658PedCod = 0 ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            else
            {
               A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPedFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A661PedFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
            }
            else
            {
               A661PedFec = localUtil.ctod( httpContext.cgiGet( edtPedFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtPedFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PEDFECENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedFecEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A662PedFecEnt = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
            }
            else
            {
               A662PedFecEnt = localUtil.ctod( httpContext.cgiGet( edtPedFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedPrvDPP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedPrvDPP_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PEDPRVDPP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedPrvDPP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8153PedPrvDPP = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8153PedPrvDPP", GXutil.ltrimstr( A8153PedPrvDPP, 6, 2));
            }
            else
            {
               A8153PedPrvDPP = localUtil.ctond( httpContext.cgiGet( edtPedPrvDPP_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8153PedPrvDPP", GXutil.ltrimstr( A8153PedPrvDPP, 6, 2));
            }
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
            n794PrvNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
            A786PrvDir = httpContext.cgiGet( edtPrvDir_Internalname) ;
            n786PrvDir = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
            A799PrvPob = httpContext.cgiGet( edtPrvPob_Internalname) ;
            n799PrvPob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
            A803PrvTlf = httpContext.cgiGet( edtPrvTlf_Internalname) ;
            n803PrvTlf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
            A804PrvTlx = httpContext.cgiGet( edtPrvTlx_Internalname) ;
            n804PrvTlx = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
            A8154PedPerDes = httpContext.cgiGet( edtPedPerDes_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
            A8155PedPerPet = httpContext.cgiGet( edtPedPerPet_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
            AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
            A668PedTot = localUtil.ctond( httpContext.cgiGet( edtPedTot_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            A14202PedTotsind = localUtil.ctond( httpContext.cgiGet( edtPedTotsind_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
            AV20PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavPrvnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPEDIDO_Trn");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
            forbiddenHiddens.add("PedSit", GXutil.rtrim( localUtil.format( A667PedSit, "@!")));
            forbiddenHiddens.add("PedPri", GXutil.rtrim( localUtil.format( A666PedPri, "9")));
            forbiddenHiddens.add("PedCodExt", GXutil.rtrim( localUtil.format( A6160PedCodExt, "")));
            forbiddenHiddens.add("PedEnv", localUtil.format( DecimalUtil.doubleToDec(A6712PedEnv), "9"));
            forbiddenHiddens.add("PedAlmc", localUtil.format( DecimalUtil.doubleToDec(A12580PedAlmc), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A658PedCod != Z658PedCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tpedido_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A658PedCod = (int)(GXutil.lval( httpContext.GetPar( "PedCod"))) ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
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
                  sMode76 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode76 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound76 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TN0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PEDCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPedCod_Internalname ;
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
                        e111TN2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TN2 ();
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
         e121TN2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TN76( ) ;
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
         disableAttributes1TN76( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavPrvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Enabled), 5, 0), true);
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

   public void confirm_1TN0( )
   {
      beforeValidate1TN76( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TN76( ) ;
         }
         else
         {
            checkExtendedTable1TN76( ) ;
            closeExtendedTableCursors1TN76( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode76 = Gx_mode ;
         confirm_1TN77( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode76 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode76 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1TN77( )
   {
      s14202PedTotsind = O14202PedTotsind ;
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      s668PedTot = O668PedTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      s14115PedCantEn = O14115PedCantEn ;
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      s14114PedCant = O14114PedCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      s664PedNumLin = O664PedNumLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      s8156PedImpDPP = O8156PedImpDPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      s8157PedTotGen = O8157PedTotGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      nGXsfl_96_idx = 0 ;
      while ( nGXsfl_96_idx < nRC_GXsfl_96 )
      {
         readRow1TN77( ) ;
         if ( ( nRcdExists_77 != 0 ) || ( nIsMod_77 != 0 ) )
         {
            getKey1TN77( ) ;
            if ( ( nRcdExists_77 == 0 ) && ( nRcdDeleted_77 == 0 ) )
            {
               if ( RcdFound77 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TN77( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TN77( ) ;
                     closeExtendedTableCursors1TN77( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O14202PedTotsind = A14202PedTotsind ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
                     O668PedTot = A668PedTot ;
                     httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
                     O14115PedCantEn = A14115PedCantEn ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
                     O14114PedCant = A14114PedCant ;
                     httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
                     O664PedNumLin = A664PedNumLin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
                     O8156PedImpDPP = A8156PedImpDPP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
                     O8157PedTotGen = A8157PedTotGen ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
                  }
               }
               else
               {
                  GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound77 != 0 )
               {
                  if ( nRcdDeleted_77 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TN77( ) ;
                     load1TN77( ) ;
                     beforeValidate1TN77( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TN77( ) ;
                        O14202PedTotsind = A14202PedTotsind ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
                        O668PedTot = A668PedTot ;
                        httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
                        O14115PedCantEn = A14115PedCantEn ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
                        O14114PedCant = A14114PedCant ;
                        httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
                        O664PedNumLin = A664PedNumLin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
                        O8156PedImpDPP = A8156PedImpDPP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
                        O8157PedTotGen = A8157PedTotGen ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_77 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TN77( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TN77( ) ;
                           closeExtendedTableCursors1TN77( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O14202PedTotsind = A14202PedTotsind ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
                           O668PedTot = A668PedTot ;
                           httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
                           O14115PedCantEn = A14115PedCantEn ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
                           O14114PedCant = A14114PedCant ;
                           httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
                           O664PedNumLin = A664PedNumLin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
                           O8156PedImpDPP = A8156PedImpDPP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
                           O8157PedTotGen = A8157PedTotGen ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_77 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPedUni_Internalname, GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedCanEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCantPdte_Internalname, GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedPre_Internalname, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedDto_Internalname, GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedVal_Internalname, GXutil.ltrim( localUtil.ntoc( A670PedVal, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedValForm_Internalname, GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbPedCum.getInternalname(), GXutil.rtrim( A659PedCum)) ;
         httpContext.changePostValue( edtPedFecPEn_Internalname, localUtil.format(A8158PedFecPEn, "99/99/99")) ;
         httpContext.changePostValue( edtPedLinObs_Internalname, GXutil.rtrim( A8159PedLinObs)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_96_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z659PedCum_"+sGXsfl_96_idx, GXutil.rtrim( Z659PedCum)) ;
         httpContext.changePostValue( "ZT_"+"Z665PedPre_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z670PedVal_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z669PedUni_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z657PedCanEnt_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z660PedDto_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z663PedFulEnt_"+sGXsfl_96_idx, localUtil.dtoc( Z663PedFulEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3372PedNumCoP_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3372PedNumCoP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3373PedConInP_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3373PedConInP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3374PedConFiP_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3374PedConFiP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3375PedNumCoE_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3375PedNumCoE, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3376PedConInE_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3376PedConInE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3377PedConFiE_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3377PedConFiE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3378PedEtiPrd_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3378PedEtiPrd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6289PedNumRq_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z6289PedNumRq, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8158PedFecPEn_"+sGXsfl_96_idx, localUtil.dtoc( Z8158PedFecPEn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8159PedLinObs_"+sGXsfl_96_idx, GXutil.rtrim( Z8159PedLinObs)) ;
         httpContext.changePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_96_idx, GXutil.rtrim( Z718PrdNom)) ;
         httpContext.changePostValue( "ZT_"+"Z724PrdPreAct_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T659PedCum_"+sGXsfl_96_idx, GXutil.rtrim( O659PedCum)) ;
         httpContext.changePostValue( "T669PedUni_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T657PedCanEnt_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T684PrdCanPen_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T14203PedValsinD_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O14203PedValsinD, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T670PedVal_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T665PedPre_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_77_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_77_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_77_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N657PedCanEnt_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N665PedPre_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_77 != 0 )
         {
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDUNI_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCANENT_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCanEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANTPDTE_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantPdte_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDPRE_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDDTO_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDVAL_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDVALFORM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedValForm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCUM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbPedCum.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDFECPEN_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedFecPEn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDLINOBS_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedLinObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O14202PedTotsind = s14202PedTotsind ;
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      O668PedTot = s668PedTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      O14115PedCantEn = s14115PedCantEn ;
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      O14114PedCant = s14114PedCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      O664PedNumLin = s664PedNumLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      O8156PedImpDPP = s8156PedImpDPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      O8157PedTotGen = s8157PedTotGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      /* Start of After( level) rules */
      if ( true /* After */ && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A658PedCod ;
         GXv_char3[0] = A719PrdNum ;
         new app.pelilpe(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3) ;
         tpedido_trn_impl.this.A396EmprCod = GXv_char1[0] ;
         tpedido_trn_impl.this.A658PedCod = GXv_int2[0] ;
         tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption1TN0( )
   {
   }

   public void e111TN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV7PedSit = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PedSit", AV7PedSit);
      GXt_char4 = AV57msg0 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG103_", ""), (byte)(99), GXv_char3) ;
      tpedido_trn_impl.this.GXt_char4 = GXv_char3[0] ;
      AV57msg0 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57msg0", AV57msg0);
      GXt_char4 = AV58msg1 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG102_", ""), (byte)(99), GXv_char3) ;
      tpedido_trn_impl.this.GXt_char4 = GXv_char3[0] ;
      AV58msg1 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58msg1", AV58msg1);
      GXt_char4 = AV59msg2 ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG169_", ""), (byte)(99), GXv_char3) ;
      tpedido_trn_impl.this.GXt_char4 = GXv_char3[0] ;
      AV59msg2 = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59msg2", AV59msg2);
      GXt_char4 = AV8Station ;
      GXv_char3[0] = GXt_char4 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      tpedido_trn_impl.this.GXt_char4 = GXv_char3[0] ;
      AV8Station = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char3[0] = A396EmprCod ;
      GXv_char1[0] = AV9EmprNom ;
      GXv_char5[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char3, GXv_char1, GXv_char5) ;
      tpedido_trn_impl.this.A396EmprCod = GXv_char3[0] ;
      tpedido_trn_impl.this.AV9EmprNom = GXv_char1[0] ;
      tpedido_trn_impl.this.AV10UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_char5[0] = AV8Station ;
      GXv_char3[0] = AV11ImpCod ;
      GXv_char1[0] = AV75Puerto ;
      new app.pbuimpu(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_char1) ;
      tpedido_trn_impl.this.AV8Station = GXv_char5[0] ;
      tpedido_trn_impl.this.AV11ImpCod = GXv_char3[0] ;
      tpedido_trn_impl.this.AV75Puerto = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV11ImpCod", AV11ImpCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV75Puerto", AV75Puerto);
      GXt_int6 = AV60Noprecio ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOPVCP", ""), GXv_int7) ;
      tpedido_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV60Noprecio = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Noprecio", GXutil.str( AV60Noprecio, 1, 0));
      GXt_int6 = AV79SiCantidadentregada ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SICPD", ""), GXv_int7) ;
      tpedido_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV79SiCantidadentregada = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79SiCantidadentregada", GXutil.str( AV79SiCantidadentregada, 1, 0));
      GXt_int6 = AV80SiPrecio ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIPVP", ""), GXv_int7) ;
      tpedido_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV80SiPrecio = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80SiPrecio", GXutil.str( AV80SiPrecio, 1, 0));
      GXt_int6 = (byte)(AV73Proprv) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "PROPRV", ""), GXv_int7) ;
      tpedido_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV73Proprv = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Proprv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Proprv), 4, 0));
      GXt_int6 = (byte)(AV82Moda21) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV12EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int7) ;
      tpedido_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      AV82Moda21 = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82Moda21), 4, 0));
      GXv_int2[0] = AV32Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COPCAR", ""), GXv_int2) ;
      tpedido_trn_impl.this.AV32Copias = (byte)((byte)(GXv_int2[0])) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Copias), 2, 0));
      if ( AV32Copias == 0 )
      {
         AV33Copias2 = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Copias2), 2, 0));
      }
      AV33Copias2 = AV32Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Copias2), 2, 0));
      Gx_out = httpContext.getMessage( "SCR", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_out", Gx_out);
      GXt_char4 = AV8Station ;
      GXv_char5[0] = GXt_char4 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      tpedido_trn_impl.this.GXt_char4 = GXv_char5[0] ;
      AV8Station = GXt_char4 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Station", AV8Station);
      GXv_char5[0] = AV12EmprCod ;
      GXv_char3[0] = AV9EmprNom ;
      GXv_char1[0] = AV10UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV8Station, GXv_char5, GXv_char3, GXv_char1) ;
      tpedido_trn_impl.this.AV12EmprCod = GXv_char5[0] ;
      tpedido_trn_impl.this.AV9EmprNom = GXv_char3[0] ;
      tpedido_trn_impl.this.AV10UsurCod = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprNom", AV9EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10UsurCod", AV10UsurCod);
      GXv_SdtWWPContext8[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV14WWPContext = GXv_SdtWWPContext8[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV22DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV22DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(10);
         pr_default.close(9);
         pr_default.close(8);
         pr_default.close(7);
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV15TrnContext.fromxml(AV16WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV15TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV84Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV86GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86GXV1), 8, 0));
         while ( AV86GXV1 <= AV15TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV15TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV86GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PrvNum") == 0 )
            {
               AV17Insert_PrvNum = (int)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Insert_PrvNum), 6, 0));
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "PedCDivCod") == 0 )
            {
               AV18Insert_PedCDivCod = (byte)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Insert_PedCDivCod), 2, 0));
            }
            AV86GXV1 = (int)(AV86GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86GXV1), 8, 0));
         }
      }
      edtPedTot_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedTot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedTot_Visible), 5, 0), true);
      edtPedTotsind_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedTotsind_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedTotsind_Visible), 5, 0), true);
      edtavPrvnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrvnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Visible), 5, 0), true);
      Gridlevel_level1_titlescategories_Gridinternalname = subGridlevel_level1_Internalname ;
      ucGridlevel_level1_titlescategories.sendProperty(context, "", false, Gridlevel_level1_titlescategories_Internalname, "GridInternalName", Gridlevel_level1_titlescategories_Gridinternalname);
   }

   public void e121TN2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV15TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tpedido_trnww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(10);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divDvpanel_datosproveedor_cell_Class = "col-xs-12 CellMarginTop" ;
      httpContext.ajax_rsp_assign_prop("", false, divDvpanel_datosproveedor_cell_Internalname, "Class", divDvpanel_datosproveedor_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = AV21PrdNum_Data ;
      GXv_char5[0] = AV23ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item12[0] = GXt_objcol_SdtDVB_SDTComboData_Item11 ;
      new app.tpedido_trnloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV12EmprCod, AV13PedCod, GXv_char5, GXv_objcol_SdtDVB_SDTComboData_Item12) ;
      tpedido_trn_impl.this.AV23ComboSelectedValue = GXv_char5[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item11 = GXv_objcol_SdtDVB_SDTComboData_Item12[0] ;
      AV21PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item11 ;
   }

   public void zm1TN76( int GX_JID )
   {
      if ( ( GX_JID == 59 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z661PedFec = T01TN7_A661PedFec[0] ;
            Z662PedFecEnt = T01TN7_A662PedFecEnt[0] ;
            Z667PedSit = T01TN7_A667PedSit[0] ;
            Z666PedPri = T01TN7_A666PedPri[0] ;
            Z6160PedCodExt = T01TN7_A6160PedCodExt[0] ;
            Z6712PedEnv = T01TN7_A6712PedEnv[0] ;
            Z8153PedPrvDPP = T01TN7_A8153PedPrvDPP[0] ;
            Z8154PedPerDes = T01TN7_A8154PedPerDes[0] ;
            Z8155PedPerPet = T01TN7_A8155PedPerPet[0] ;
            Z12580PedAlmc = T01TN7_A12580PedAlmc[0] ;
            Z795PrvNum = T01TN7_A795PrvNum[0] ;
            Z3113PedCDivCod = T01TN7_A3113PedCDivCod[0] ;
         }
         else
         {
            Z661PedFec = A661PedFec ;
            Z662PedFecEnt = A662PedFecEnt ;
            Z667PedSit = A667PedSit ;
            Z666PedPri = A666PedPri ;
            Z6160PedCodExt = A6160PedCodExt ;
            Z6712PedEnv = A6712PedEnv ;
            Z8153PedPrvDPP = A8153PedPrvDPP ;
            Z8154PedPerDes = A8154PedPerDes ;
            Z8155PedPerPet = A8155PedPerPet ;
            Z12580PedAlmc = A12580PedAlmc ;
            Z795PrvNum = A795PrvNum ;
            Z3113PedCDivCod = A3113PedCDivCod ;
         }
      }
      if ( GX_JID == -59 )
      {
         Z658PedCod = A658PedCod ;
         Z661PedFec = A661PedFec ;
         Z662PedFecEnt = A662PedFecEnt ;
         Z667PedSit = A667PedSit ;
         Z666PedPri = A666PedPri ;
         Z6160PedCodExt = A6160PedCodExt ;
         Z6712PedEnv = A6712PedEnv ;
         Z8153PedPrvDPP = A8153PedPrvDPP ;
         Z8154PedPerDes = A8154PedPerDes ;
         Z8155PedPerPet = A8155PedPerPet ;
         Z12580PedAlmc = A12580PedAlmc ;
         Z396EmprCod = A396EmprCod ;
         Z795PrvNum = A795PrvNum ;
         Z3113PedCDivCod = A3113PedCDivCod ;
         Z3114PedCDivAbr = A3114PedCDivAbr ;
         Z407EmprNom = A407EmprNom ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z794PrvNom = A794PrvNom ;
         Z803PrvTlf = A803PrvTlf ;
         Z786PrvDir = A786PrvDir ;
         Z799PrvPob = A799PrvPob ;
         Z3314PrvCar = A3314PrvCar ;
         Z804PrvTlx = A804PrvTlx ;
         Z3143PrvDivCo = A3143PrvDivCo ;
         Z3144PrvDivAbr = A3144PrvDivAbr ;
         Z668PedTot = A668PedTot ;
         Z14114PedCant = A14114PedCant ;
         Z14115PedCantEn = A14115PedCantEn ;
         Z14202PedTotsind = A14202PedTotsind ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_datosproveedor_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_datosproveedor_cell_Internalname, "Class", divDvpanel_datosproveedor_cell_Class, true);
      }
      else
      {
         if ( 1 == 0 )
         {
            divDvpanel_datosproveedor_cell_Class = httpContext.getMessage( "col-xs-12 CellMarginTop", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divDvpanel_datosproveedor_cell_Internalname, "Class", divDvpanel_datosproveedor_cell_Class, true);
         }
      }
      AV84Pgmname = "TPEDIDO_Trn" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         A396EmprCod = AV12EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TN8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TN8_A407EmprNom[0] ;
      n407EmprNom = T01TN8_n407EmprNom[0] ;
      A3915EmpNumDec = T01TN8_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01TN8_n3915EmpNumDec[0] ;
      pr_default.close(6);
      GXt_int6 = (byte)(0) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "PERTEX", ""), ""), GXv_int7) ;
      tpedido_trn_impl.this.GXt_int6 = GXv_int7[0] ;
      divUnnamedtable9_Visible = (((GXt_int6==1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable9_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable9_Visible), 5, 0), true);
      if ( ! (0==AV13PedCod) )
      {
         A658PedCod = AV13PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      if ( ! (0==AV13PedCod) )
      {
         edtPedCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      else
      {
         edtPedCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13PedCod) )
      {
         edtPedCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_PrvNum) )
      {
         A795PrvNum = AV17Insert_PrvNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
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
         /* Using cursor T01TN13 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            A668PedTot = T01TN13_A668PedTot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            A14114PedCant = T01TN13_A14114PedCant[0] ;
            A14115PedCantEn = T01TN13_A14115PedCantEn[0] ;
            A14202PedTotsind = T01TN13_A14202PedTotsind[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         else
         {
            A668PedTot = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            A14114PedCant = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
            A14115PedCantEn = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
            A14202PedTotsind = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         O668PedTot = A668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         O14114PedCant = A14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         O14115PedCantEn = A14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         O14202PedTotsind = A14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         pr_default.close(10);
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         /* Using cursor T01TN9 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01TN9_A794PrvNom[0] ;
         n794PrvNom = T01TN9_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A803PrvTlf = T01TN9_A803PrvTlf[0] ;
         n803PrvTlf = T01TN9_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A786PrvDir = T01TN9_A786PrvDir[0] ;
         n786PrvDir = T01TN9_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A799PrvPob = T01TN9_A799PrvPob[0] ;
         n799PrvPob = T01TN9_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A3314PrvCar = T01TN9_A3314PrvCar[0] ;
         n3314PrvCar = T01TN9_n3314PrvCar[0] ;
         A804PrvTlx = T01TN9_A804PrvTlx[0] ;
         n804PrvTlx = T01TN9_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A3143PrvDivCo = T01TN9_A3143PrvDivCo[0] ;
         pr_default.close(7);
         /* Using cursor T01TN11 */
         pr_default.execute(9, new Object[] {Byte.valueOf(A3143PrvDivCo)});
         A3144PrvDivAbr = T01TN11_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T01TN11_n3144PrvDivAbr[0] ;
         pr_default.close(9);
      }
   }

   public void load1TN76( )
   {
      /* Using cursor T01TN15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound76 = (short)(1) ;
         A794PrvNom = T01TN15_A794PrvNom[0] ;
         n794PrvNom = T01TN15_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A803PrvTlf = T01TN15_A803PrvTlf[0] ;
         n803PrvTlf = T01TN15_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A786PrvDir = T01TN15_A786PrvDir[0] ;
         n786PrvDir = T01TN15_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A799PrvPob = T01TN15_A799PrvPob[0] ;
         n799PrvPob = T01TN15_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A661PedFec = T01TN15_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A662PedFecEnt = T01TN15_A662PedFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A667PedSit = T01TN15_A667PedSit[0] ;
         A666PedPri = T01TN15_A666PedPri[0] ;
         A407EmprNom = T01TN15_A407EmprNom[0] ;
         n407EmprNom = T01TN15_n407EmprNom[0] ;
         A3144PrvDivAbr = T01TN15_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T01TN15_n3144PrvDivAbr[0] ;
         A3114PedCDivAbr = T01TN15_A3114PedCDivAbr[0] ;
         n3114PedCDivAbr = T01TN15_n3114PedCDivAbr[0] ;
         A3314PrvCar = T01TN15_A3314PrvCar[0] ;
         n3314PrvCar = T01TN15_n3314PrvCar[0] ;
         A3915EmpNumDec = T01TN15_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01TN15_n3915EmpNumDec[0] ;
         A804PrvTlx = T01TN15_A804PrvTlx[0] ;
         n804PrvTlx = T01TN15_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A6160PedCodExt = T01TN15_A6160PedCodExt[0] ;
         A6712PedEnv = T01TN15_A6712PedEnv[0] ;
         A8153PedPrvDPP = T01TN15_A8153PedPrvDPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8153PedPrvDPP", GXutil.ltrimstr( A8153PedPrvDPP, 6, 2));
         A8154PedPerDes = T01TN15_A8154PedPerDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
         A8155PedPerPet = T01TN15_A8155PedPerPet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
         A12580PedAlmc = T01TN15_A12580PedAlmc[0] ;
         A795PrvNum = T01TN15_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A3113PedCDivCod = T01TN15_A3113PedCDivCod[0] ;
         A3143PrvDivCo = T01TN15_A3143PrvDivCo[0] ;
         A668PedTot = T01TN15_A668PedTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14114PedCant = T01TN15_A14114PedCant[0] ;
         A14115PedCantEn = T01TN15_A14115PedCantEn[0] ;
         A14202PedTotsind = T01TN15_A14202PedTotsind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         zm1TN76( -59) ;
      }
      pr_default.close(11);
      onLoadActions1TN76( ) ;
   }

   public void onLoadActions1TN76( )
   {
      O14202PedTotsind = A14202PedTotsind ;
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      O668PedTot = A668PedTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      O14115PedCantEn = A14115PedCantEn ;
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      O14114PedCant = A14114PedCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      AV26OldPedFec = O661PedFec ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OldPedFec", localUtil.format(AV26OldPedFec, "99/99/99"));
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_PedCDivCod) )
      {
         A3113PedCDivCod = AV18Insert_PedCDivCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3113PedCDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3113PedCDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3113PedCDivCod = A3143PrvDivCo ;
            httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3113PedCDivCod), 2, 0));
         }
      }
      A8156PedImpDPP = GXutil.roundDecimal( A668PedTot.multiply(A8153PedPrvDPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      A8157PedTotGen = A668PedTot.subtract(A8156PedImpDPP) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
   }

   public void checkExtendedTable1TN76( )
   {
      nIsDirty_76 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( isIns( )  && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido inexistente", ""), 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      AV26OldPedFec = O661PedFec ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OldPedFec", localUtil.format(AV26OldPedFec, "99/99/99"));
      if ( true /* Level */ && GXutil.resetTime(A661PedFec).after( GXutil.resetTime( GXutil.today( ) )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Fecha Pedido Incorrecta", ""), 1, "PEDFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && GXutil.resetTime(A661PedFec).before( GXutil.resetTime( GXutil.today( ) )) && true /* After */ && !( GXutil.dateCompare(GXutil.resetTime(A661PedFec), GXutil.resetTime(AV26OldPedFec)) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Fecha Pedido Incorrecta", ""), 1, "PEDFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* Level */ && GXutil.resetTime(A661PedFec).after( GXutil.resetTime( A662PedFecEnt )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Fecha Entrega Incorrecta", ""), 1, "PEDFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFecEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A667PedSit, httpContext.getMessage( "S", "")) == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido totalmente cumplimentado", ""), 1, "");
         AnyError = (short)(1) ;
      }
      /* Using cursor T01TN9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01TN9_A794PrvNom[0] ;
      n794PrvNom = T01TN9_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A803PrvTlf = T01TN9_A803PrvTlf[0] ;
      n803PrvTlf = T01TN9_n803PrvTlf[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
      A786PrvDir = T01TN9_A786PrvDir[0] ;
      n786PrvDir = T01TN9_n786PrvDir[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
      A799PrvPob = T01TN9_A799PrvPob[0] ;
      n799PrvPob = T01TN9_n799PrvPob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
      A3314PrvCar = T01TN9_A3314PrvCar[0] ;
      n3314PrvCar = T01TN9_n3314PrvCar[0] ;
      A804PrvTlx = T01TN9_A804PrvTlx[0] ;
      n804PrvTlx = T01TN9_n804PrvTlx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
      A3143PrvDivCo = T01TN9_A3143PrvDivCo[0] ;
      pr_default.close(7);
      /* Using cursor T01TN11 */
      pr_default.execute(9, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
      }
      A3144PrvDivAbr = T01TN11_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T01TN11_n3144PrvDivAbr[0] ;
      pr_default.close(9);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_PedCDivCod) )
      {
         nIsDirty_76 = (short)(1) ;
         A3113PedCDivCod = AV18Insert_PedCDivCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3113PedCDivCod), 2, 0));
      }
      else
      {
         if ( isIns( )  && (0==A3113PedCDivCod) && ( Gx_BScreen == 0 ) )
         {
            nIsDirty_76 = (short)(1) ;
            A3113PedCDivCod = A3143PrvDivCo ;
            httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3113PedCDivCod), 2, 0));
         }
      }
      /* Using cursor T01TN10 */
      pr_default.execute(8, new Object[] {Byte.valueOf(A3113PedCDivCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivPeC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3114PedCDivAbr = T01TN10_A3114PedCDivAbr[0] ;
      n3114PedCDivAbr = T01TN10_n3114PedCDivAbr[0] ;
      pr_default.close(8);
      /* Using cursor T01TN13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A668PedTot = T01TN13_A668PedTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14114PedCant = T01TN13_A14114PedCant[0] ;
         A14115PedCantEn = T01TN13_A14115PedCantEn[0] ;
         A14202PedTotsind = T01TN13_A14202PedTotsind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      }
      else
      {
         nIsDirty_76 = (short)(1) ;
         A668PedTot = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         nIsDirty_76 = (short)(1) ;
         A14114PedCant = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         nIsDirty_76 = (short)(1) ;
         A14115PedCantEn = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         nIsDirty_76 = (short)(1) ;
         A14202PedTotsind = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      }
      pr_default.close(10);
      nIsDirty_76 = (short)(1) ;
      A8156PedImpDPP = GXutil.roundDecimal( A668PedTot.multiply(A8153PedPrvDPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      nIsDirty_76 = (short)(1) ;
      A8157PedTotGen = A668PedTot.subtract(A8156PedImpDPP) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      nIsDirty_76 = (short)(1) ;
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
   }

   public void closeExtendedTableCursors1TN76( )
   {
      pr_default.close(7);
      pr_default.close(9);
      pr_default.close(8);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_61( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T01TN16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01TN16_A794PrvNom[0] ;
      n794PrvNom = T01TN16_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A803PrvTlf = T01TN16_A803PrvTlf[0] ;
      n803PrvTlf = T01TN16_n803PrvTlf[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
      A786PrvDir = T01TN16_A786PrvDir[0] ;
      n786PrvDir = T01TN16_n786PrvDir[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
      A799PrvPob = T01TN16_A799PrvPob[0] ;
      n799PrvPob = T01TN16_n799PrvPob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
      A3314PrvCar = T01TN16_A3314PrvCar[0] ;
      n3314PrvCar = T01TN16_n3314PrvCar[0] ;
      A804PrvTlx = T01TN16_A804PrvTlx[0] ;
      n804PrvTlx = T01TN16_n804PrvTlx[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
      A3143PrvDivCo = T01TN16_A3143PrvDivCo[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A803PrvTlf))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A786PrvDir))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A799PrvPob))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3314PrvCar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A804PrvTlx))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_63( byte A3143PrvDivCo )
   {
      /* Using cursor T01TN17 */
      pr_default.execute(13, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
      }
      A3144PrvDivAbr = T01TN17_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T01TN17_n3144PrvDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3144PrvDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_62( byte A3113PedCDivCod )
   {
      /* Using cursor T01TN18 */
      pr_default.execute(14, new Object[] {Byte.valueOf(A3113PedCDivCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivPeC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3114PedCDivAbr = T01TN18_A3114PedCDivAbr[0] ;
      n3114PedCDivAbr = T01TN18_n3114PedCDivAbr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3114PedCDivAbr))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_64( String A396EmprCod ,
                          int A658PedCod )
   {
      /* Using cursor T01TN20 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A668PedTot = T01TN20_A668PedTot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14114PedCant = T01TN20_A14114PedCant[0] ;
         A14115PedCantEn = T01TN20_A14115PedCantEn[0] ;
         A14202PedTotsind = T01TN20_A14202PedTotsind[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      }
      else
      {
         A668PedTot = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14114PedCant = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         A14115PedCantEn = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         A14202PedTotsind = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A668PedTot, (byte)(12), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14114PedCant, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14115PedCantEn, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14202PedTotsind, (byte)(12), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void getKey1TN76( )
   {
      /* Using cursor T01TN21 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound76 = (short)(1) ;
      }
      else
      {
         RcdFound76 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TN7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01TN7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1TN76( 59) ;
         RcdFound76 = (short)(1) ;
         A658PedCod = T01TN7_A658PedCod[0] ;
         n658PedCod = T01TN7_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         A661PedFec = T01TN7_A661PedFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         A662PedFecEnt = T01TN7_A662PedFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
         A667PedSit = T01TN7_A667PedSit[0] ;
         A666PedPri = T01TN7_A666PedPri[0] ;
         A6160PedCodExt = T01TN7_A6160PedCodExt[0] ;
         A6712PedEnv = T01TN7_A6712PedEnv[0] ;
         A8153PedPrvDPP = T01TN7_A8153PedPrvDPP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8153PedPrvDPP", GXutil.ltrimstr( A8153PedPrvDPP, 6, 2));
         A8154PedPerDes = T01TN7_A8154PedPerDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
         A8155PedPerPet = T01TN7_A8155PedPerPet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
         A12580PedAlmc = T01TN7_A12580PedAlmc[0] ;
         A795PrvNum = T01TN7_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A3113PedCDivCod = T01TN7_A3113PedCDivCod[0] ;
         O661PedFec = A661PedFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         sMode76 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TN76( ) ;
         if ( AnyError == 1 )
         {
            RcdFound76 = (short)(0) ;
            initializeNonKey1TN76( ) ;
         }
         Gx_mode = sMode76 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound76 = (short)(0) ;
         initializeNonKey1TN76( ) ;
         sMode76 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode76 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey1TN76( ) ;
      if ( RcdFound76 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound76 = (short)(0) ;
      /* Using cursor T01TN22 */
      pr_default.execute(17, new Object[] {Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T01TN22_A658PedCod[0] < A658PedCod ) ) && ( GXutil.strcmp(T01TN22_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T01TN22_A658PedCod[0] > A658PedCod ) ) && ( GXutil.strcmp(T01TN22_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A658PedCod = T01TN22_A658PedCod[0] ;
            n658PedCod = T01TN22_n658PedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            RcdFound76 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void move_previous( )
   {
      RcdFound76 = (short)(0) ;
      /* Using cursor T01TN23 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A396EmprCod});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( T01TN23_A658PedCod[0] > A658PedCod ) ) && ( GXutil.strcmp(T01TN23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( T01TN23_A658PedCod[0] < A658PedCod ) ) && ( GXutil.strcmp(T01TN23_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A658PedCod = T01TN23_A658PedCod[0] ;
            n658PedCod = T01TN23_n658PedCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
            RcdFound76 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TN76( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A14202PedTotsind = O14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         A668PedTot = O668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14115PedCantEn = O14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         A14114PedCant = O14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         A664PedNumLin = O664PedNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         A8156PedImpDPP = O8156PedImpDPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
         A8157PedTotGen = O8157PedTotGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TN76( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound76 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) )
            {
               A658PedCod = Z658PedCod ;
               n658PedCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PEDCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A14202PedTotsind = O14202PedTotsind ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
               A668PedTot = O668PedTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
               A14115PedCantEn = O14115PedCantEn ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
               A14114PedCant = O14114PedCant ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
               A664PedNumLin = O664PedNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
               A8156PedImpDPP = O8156PedImpDPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
               A8157PedTotGen = O8157PedTotGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A14202PedTotsind = O14202PedTotsind ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
               A668PedTot = O668PedTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
               A14115PedCantEn = O14115PedCantEn ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
               A14114PedCant = O14114PedCant ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
               A664PedNumLin = O664PedNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
               A8156PedImpDPP = O8156PedImpDPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
               A8157PedTotGen = O8157PedTotGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
               update1TN76( ) ;
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) )
            {
               /* Insert record */
               A14202PedTotsind = O14202PedTotsind ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
               A668PedTot = O668PedTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
               A14115PedCantEn = O14115PedCantEn ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
               A14114PedCant = O14114PedCant ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
               A664PedNumLin = O664PedNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
               A8156PedImpDPP = O8156PedImpDPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
               A8157PedTotGen = O8157PedTotGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
               GX_FocusControl = edtPedCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TN76( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PEDCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPedCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A14202PedTotsind = O14202PedTotsind ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
                  A668PedTot = O668PedTot ;
                  httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
                  A14115PedCantEn = O14115PedCantEn ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
                  A14114PedCant = O14114PedCant ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
                  A664PedNumLin = O664PedNumLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
                  A8156PedImpDPP = O8156PedImpDPP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
                  A8157PedTotGen = O8157PedTotGen ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
                  GX_FocusControl = edtPedCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TN76( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A658PedCod != Z658PedCod ) )
      {
         A658PedCod = Z658PedCod ;
         n658PedCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A14202PedTotsind = O14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         A668PedTot = O668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         A14115PedCantEn = O14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         A14114PedCant = O14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         A664PedNumLin = O664PedNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         A8156PedImpDPP = O8156PedImpDPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
         A8157PedTotGen = O8157PedTotGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPedCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TN76( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TN6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z661PedFec), GXutil.resetTime(T01TN6_A661PedFec[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z662PedFecEnt), GXutil.resetTime(T01TN6_A662PedFecEnt[0])) ) || ( GXutil.strcmp(Z667PedSit, T01TN6_A667PedSit[0]) != 0 ) || ( GXutil.strcmp(Z666PedPri, T01TN6_A666PedPri[0]) != 0 ) || ( GXutil.strcmp(Z6160PedCodExt, T01TN6_A6160PedCodExt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6712PedEnv != T01TN6_A6712PedEnv[0] ) || ( DecimalUtil.compareTo(Z8153PedPrvDPP, T01TN6_A8153PedPrvDPP[0]) != 0 ) || ( GXutil.strcmp(Z8154PedPerDes, T01TN6_A8154PedPerDes[0]) != 0 ) || ( GXutil.strcmp(Z8155PedPerPet, T01TN6_A8155PedPerPet[0]) != 0 ) || ( Z12580PedAlmc != T01TN6_A12580PedAlmc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z795PrvNum != T01TN6_A795PrvNum[0] ) || ( Z3113PedCDivCod != T01TN6_A3113PedCDivCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z661PedFec), GXutil.resetTime(T01TN6_A661PedFec[0])) ) )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedFec");
               GXutil.writeLogRaw("Old: ",Z661PedFec);
               GXutil.writeLogRaw("Current: ",T01TN6_A661PedFec[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z662PedFecEnt), GXutil.resetTime(T01TN6_A662PedFecEnt[0])) ) )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedFecEnt");
               GXutil.writeLogRaw("Old: ",Z662PedFecEnt);
               GXutil.writeLogRaw("Current: ",T01TN6_A662PedFecEnt[0]);
            }
            if ( GXutil.strcmp(Z667PedSit, T01TN6_A667PedSit[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedSit");
               GXutil.writeLogRaw("Old: ",Z667PedSit);
               GXutil.writeLogRaw("Current: ",T01TN6_A667PedSit[0]);
            }
            if ( GXutil.strcmp(Z666PedPri, T01TN6_A666PedPri[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedPri");
               GXutil.writeLogRaw("Old: ",Z666PedPri);
               GXutil.writeLogRaw("Current: ",T01TN6_A666PedPri[0]);
            }
            if ( GXutil.strcmp(Z6160PedCodExt, T01TN6_A6160PedCodExt[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedCodExt");
               GXutil.writeLogRaw("Old: ",Z6160PedCodExt);
               GXutil.writeLogRaw("Current: ",T01TN6_A6160PedCodExt[0]);
            }
            if ( Z6712PedEnv != T01TN6_A6712PedEnv[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedEnv");
               GXutil.writeLogRaw("Old: ",Z6712PedEnv);
               GXutil.writeLogRaw("Current: ",T01TN6_A6712PedEnv[0]);
            }
            if ( DecimalUtil.compareTo(Z8153PedPrvDPP, T01TN6_A8153PedPrvDPP[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedPrvDPP");
               GXutil.writeLogRaw("Old: ",Z8153PedPrvDPP);
               GXutil.writeLogRaw("Current: ",T01TN6_A8153PedPrvDPP[0]);
            }
            if ( GXutil.strcmp(Z8154PedPerDes, T01TN6_A8154PedPerDes[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedPerDes");
               GXutil.writeLogRaw("Old: ",Z8154PedPerDes);
               GXutil.writeLogRaw("Current: ",T01TN6_A8154PedPerDes[0]);
            }
            if ( GXutil.strcmp(Z8155PedPerPet, T01TN6_A8155PedPerPet[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedPerPet");
               GXutil.writeLogRaw("Old: ",Z8155PedPerPet);
               GXutil.writeLogRaw("Current: ",T01TN6_A8155PedPerPet[0]);
            }
            if ( Z12580PedAlmc != T01TN6_A12580PedAlmc[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedAlmc");
               GXutil.writeLogRaw("Old: ",Z12580PedAlmc);
               GXutil.writeLogRaw("Current: ",T01TN6_A12580PedAlmc[0]);
            }
            if ( Z795PrvNum != T01TN6_A795PrvNum[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T01TN6_A795PrvNum[0]);
            }
            if ( Z3113PedCDivCod != T01TN6_A3113PedCDivCod[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedCDivCod");
               GXutil.writeLogRaw("Old: ",Z3113PedCDivCod);
               GXutil.writeLogRaw("Current: ",T01TN6_A3113PedCDivCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TN76( )
   {
      beforeValidate1TN76( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TN76( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TN76( 0) ;
         checkOptimisticConcurrency1TN76( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TN76( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TN76( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TN24 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A661PedFec, A662PedFecEnt, A667PedSit, A666PedPri, A6160PedCodExt, Byte.valueOf(A6712PedEnv), A8153PedPrvDPP, A8154PedPerDes, A8155PedPerPet, Byte.valueOf(A12580PedAlmc), A396EmprCod, Integer.valueOf(A795PrvNum), Byte.valueOf(A3113PedCDivCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
                  if ( (pr_default.getStatus(19) == 1) )
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
                        processLevel1TN76( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TN0( ) ;
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
            load1TN76( ) ;
         }
         endLevel1TN76( ) ;
      }
      closeExtendedTableCursors1TN76( ) ;
   }

   public void update1TN76( )
   {
      beforeValidate1TN76( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TN76( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TN76( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TN76( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TN76( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TN25 */
                  pr_default.execute(20, new Object[] {A661PedFec, A662PedFecEnt, A667PedSit, A666PedPri, A6160PedCodExt, Byte.valueOf(A6712PedEnv), A8153PedPrvDPP, A8154PedPerDes, A8155PedPerPet, Byte.valueOf(A12580PedAlmc), Integer.valueOf(A795PrvNum), Byte.valueOf(A3113PedCDivCod), A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
                  if ( (pr_default.getStatus(20) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCPEDID"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TN76( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TN76( ) ;
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
         endLevel1TN76( ) ;
      }
      closeExtendedTableCursors1TN76( ) ;
   }

   public void deferredUpdate1TN76( )
   {
   }

   public void delete( )
   {
      beforeValidate1TN76( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TN76( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TN76( ) ;
         afterConfirm1TN76( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TN76( ) ;
            if ( AnyError == 0 )
            {
               A14202PedTotsind = O14202PedTotsind ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
               A668PedTot = O668PedTot ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
               A14115PedCantEn = O14115PedCantEn ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
               A14114PedCant = O14114PedCant ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
               A664PedNumLin = O664PedNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
               A8156PedImpDPP = O8156PedImpDPP ;
               httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
               A8157PedTotGen = O8157PedTotGen ;
               httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
               scanStart1TN77( ) ;
               while ( RcdFound77 != 0 )
               {
                  getByPrimaryKey1TN77( ) ;
                  delete1TN77( ) ;
                  scanNext1TN77( ) ;
                  O14202PedTotsind = A14202PedTotsind ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
                  O668PedTot = A668PedTot ;
                  httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
                  O14115PedCantEn = A14115PedCantEn ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
                  O14114PedCant = A14114PedCant ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
                  O664PedNumLin = A664PedNumLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
                  O8156PedImpDPP = A8156PedImpDPP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
                  O8157PedTotGen = A8157PedTotGen ;
                  httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
               }
               scanEnd1TN77( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TN26 */
                  pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPEDID");
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
      sMode76 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TN76( ) ;
      Gx_mode = sMode76 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TN76( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  && true /* After */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido inexistente", ""), 1, "PEDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPedCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         AV26OldPedFec = O661PedFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26OldPedFec", localUtil.format(AV26OldPedFec, "99/99/99"));
         /* Using cursor T01TN27 */
         pr_default.execute(22, new Object[] {Byte.valueOf(A3113PedCDivCod)});
         A3114PedCDivAbr = T01TN27_A3114PedCDivAbr[0] ;
         n3114PedCDivAbr = T01TN27_n3114PedCDivAbr[0] ;
         pr_default.close(22);
         /* Using cursor T01TN28 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T01TN28_A794PrvNom[0] ;
         n794PrvNom = T01TN28_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A803PrvTlf = T01TN28_A803PrvTlf[0] ;
         n803PrvTlf = T01TN28_n803PrvTlf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
         A786PrvDir = T01TN28_A786PrvDir[0] ;
         n786PrvDir = T01TN28_n786PrvDir[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
         A799PrvPob = T01TN28_A799PrvPob[0] ;
         n799PrvPob = T01TN28_n799PrvPob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
         A3314PrvCar = T01TN28_A3314PrvCar[0] ;
         n3314PrvCar = T01TN28_n3314PrvCar[0] ;
         A804PrvTlx = T01TN28_A804PrvTlx[0] ;
         n804PrvTlx = T01TN28_n804PrvTlx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
         A3143PrvDivCo = T01TN28_A3143PrvDivCo[0] ;
         pr_default.close(23);
         /* Using cursor T01TN29 */
         pr_default.execute(24, new Object[] {Byte.valueOf(A3143PrvDivCo)});
         A3144PrvDivAbr = T01TN29_A3144PrvDivAbr[0] ;
         n3144PrvDivAbr = T01TN29_n3144PrvDivAbr[0] ;
         pr_default.close(24);
         /* Using cursor T01TN31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A668PedTot = T01TN31_A668PedTot[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            A14114PedCant = T01TN31_A14114PedCant[0] ;
            A14115PedCantEn = T01TN31_A14115PedCantEn[0] ;
            A14202PedTotsind = T01TN31_A14202PedTotsind[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         else
         {
            A668PedTot = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            A14114PedCant = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
            A14115PedCantEn = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
            A14202PedTotsind = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         pr_default.close(25);
         A8156PedImpDPP = GXutil.roundDecimal( A668PedTot.multiply(A8153PedPrvDPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
         A8157PedTotGen = A668PedTot.subtract(A8156PedImpDPP) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
         A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TN32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Cabecera)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01TN33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01TN34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
      }
   }

   public void processNestedLevel1TN77( )
   {
      s14202PedTotsind = O14202PedTotsind ;
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      s668PedTot = O668PedTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      s14115PedCantEn = O14115PedCantEn ;
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      s14114PedCant = O14114PedCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      s664PedNumLin = O664PedNumLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      s8156PedImpDPP = O8156PedImpDPP ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      s8157PedTotGen = O8157PedTotGen ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      nGXsfl_96_idx = 0 ;
      while ( nGXsfl_96_idx < nRC_GXsfl_96 )
      {
         readRow1TN77( ) ;
         if ( ( nRcdExists_77 != 0 ) || ( nIsMod_77 != 0 ) )
         {
            standaloneNotModal1TN77( ) ;
            getKey1TN77( ) ;
            if ( ( nRcdExists_77 == 0 ) && ( nRcdDeleted_77 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TN77( ) ;
            }
            else
            {
               if ( RcdFound77 != 0 )
               {
                  if ( ( nRcdDeleted_77 != 0 ) && ( nRcdExists_77 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TN77( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_77 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TN77( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_77 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O14202PedTotsind = A14202PedTotsind ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
            O668PedTot = A668PedTot ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            O14115PedCantEn = A14115PedCantEn ;
            httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
            O14114PedCant = A14114PedCant ;
            httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
            O664PedNumLin = A664PedNumLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
            O8156PedImpDPP = A8156PedImpDPP ;
            httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
            O8157PedTotGen = A8157PedTotGen ;
            httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
         }
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPedUni_Internalname, GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedCanEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCantPdte_Internalname, GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedPre_Internalname, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedDto_Internalname, GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedVal_Internalname, GXutil.ltrim( localUtil.ntoc( A670PedVal, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPedValForm_Internalname, GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbPedCum.getInternalname(), GXutil.rtrim( A659PedCum)) ;
         httpContext.changePostValue( edtPedFecPEn_Internalname, localUtil.format(A8158PedFecPEn, "99/99/99")) ;
         httpContext.changePostValue( edtPedLinObs_Internalname, GXutil.rtrim( A8159PedLinObs)) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_96_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z659PedCum_"+sGXsfl_96_idx, GXutil.rtrim( Z659PedCum)) ;
         httpContext.changePostValue( "ZT_"+"Z665PedPre_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z670PedVal_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z669PedUni_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z657PedCanEnt_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z660PedDto_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z663PedFulEnt_"+sGXsfl_96_idx, localUtil.dtoc( Z663PedFulEnt, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z3372PedNumCoP_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3372PedNumCoP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3373PedConInP_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3373PedConInP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3374PedConFiP_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3374PedConFiP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3375PedNumCoE_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3375PedNumCoE, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3376PedConInE_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3376PedConInE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3377PedConFiE_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3377PedConFiE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3378PedEtiPrd_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z3378PedEtiPrd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6289PedNumRq_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z6289PedNumRq, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8158PedFecPEn_"+sGXsfl_96_idx, localUtil.dtoc( Z8158PedFecPEn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z8159PedLinObs_"+sGXsfl_96_idx, GXutil.rtrim( Z8159PedLinObs)) ;
         httpContext.changePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_96_idx, GXutil.rtrim( Z718PrdNom)) ;
         httpContext.changePostValue( "ZT_"+"Z724PrdPreAct_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T659PedCum_"+sGXsfl_96_idx, GXutil.rtrim( O659PedCum)) ;
         httpContext.changePostValue( "T669PedUni_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T657PedCanEnt_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T684PrdCanPen_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T14203PedValsinD_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O14203PedValsinD, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T670PedVal_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T665PedPre_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_77_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_77_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_77_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N657PedCanEnt_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N665PedPre_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_77 != 0 )
         {
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDUNI_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCANENT_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCanEnt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CANTPDTE_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantPdte_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDPRE_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDDTO_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDVAL_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDVALFORM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedValForm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDCUM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbPedCum.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDFECPEN_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedFecPEn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PEDLINOBS_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedLinObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      if ( true /* After */ && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A658PedCod ;
         GXv_char3[0] = A719PrdNum ;
         new app.pelilpe(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char3) ;
         tpedido_trn_impl.this.A396EmprCod = GXv_char5[0] ;
         tpedido_trn_impl.this.A658PedCod = GXv_int2[0] ;
         tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      /* End of After( level) rules */
      initAll1TN77( ) ;
      if ( AnyError != 0 )
      {
         O14202PedTotsind = s14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         O668PedTot = s668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         O14115PedCantEn = s14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         O14114PedCant = s14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         O664PedNumLin = s664PedNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         O8156PedImpDPP = s8156PedImpDPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
         O8157PedTotGen = s8157PedTotGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      }
      nRcdExists_77 = (short)(0) ;
      nIsMod_77 = (short)(0) ;
      nRcdDeleted_77 = (short)(0) ;
   }

   public void processLevel1TN76( )
   {
      /* Save parent mode. */
      sMode76 = Gx_mode ;
      processNestedLevel1TN77( ) ;
      if ( AnyError != 0 )
      {
         O14202PedTotsind = s14202PedTotsind ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         O668PedTot = s668PedTot ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         O14115PedCantEn = s14115PedCantEn ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         O14114PedCant = s14114PedCant ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         O664PedNumLin = s664PedNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
         O8156PedImpDPP = s8156PedImpDPP ;
         httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
         O8157PedTotGen = s8157PedTotGen ;
         httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode76 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1TN76( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TN76( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpedido_trn");
         if ( AnyError == 0 )
         {
            confirmValues1TN0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpedido_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TN76( )
   {
      /* Scan By routine */
      /* Using cursor T01TN35 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      RcdFound76 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound76 = (short)(1) ;
         A658PedCod = T01TN35_A658PedCod[0] ;
         n658PedCod = T01TN35_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TN76( )
   {
      /* Scan next routine */
      pr_default.readNext(29);
      RcdFound76 = (short)(0) ;
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound76 = (short)(1) ;
         A658PedCod = T01TN35_A658PedCod[0] ;
         n658PedCod = T01TN35_n658PedCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
   }

   public void scanEnd1TN76( )
   {
      pr_default.close(29);
   }

   public void afterConfirm1TN76( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TN76( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TN76( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TN76( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TN76( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TN76( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TN76( )
   {
      edtPedCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Enabled), 5, 0), true);
      edtPedFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFec_Enabled), 5, 0), true);
      edtPedFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecEnt_Enabled), 5, 0), true);
      edtPedPrvDPP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPrvDPP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPrvDPP_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrvDir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDir_Enabled), 5, 0), true);
      edtPrvPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvPob_Enabled), 5, 0), true);
      edtPrvTlf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlf_Enabled), 5, 0), true);
      edtPrvTlx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvTlx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvTlx_Enabled), 5, 0), true);
      edtPedPerDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPerDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPerDes_Enabled), 5, 0), true);
      edtPedPerPet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPerPet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPerPet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtPedTot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedTot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedTot_Enabled), 5, 0), true);
      edtPedTotsind_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedTotsind_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedTotsind_Enabled), 5, 0), true);
   }

   public void zm1TN77( int GX_JID )
   {
      if ( ( GX_JID == 65 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z659PedCum = T01TN3_A659PedCum[0] ;
            Z665PedPre = T01TN3_A665PedPre[0] ;
            Z670PedVal = T01TN3_A670PedVal[0] ;
            Z669PedUni = T01TN3_A669PedUni[0] ;
            Z657PedCanEnt = T01TN3_A657PedCanEnt[0] ;
            Z660PedDto = T01TN3_A660PedDto[0] ;
            Z663PedFulEnt = T01TN3_A663PedFulEnt[0] ;
            Z3372PedNumCoP = T01TN3_A3372PedNumCoP[0] ;
            Z3373PedConInP = T01TN3_A3373PedConInP[0] ;
            Z3374PedConFiP = T01TN3_A3374PedConFiP[0] ;
            Z3375PedNumCoE = T01TN3_A3375PedNumCoE[0] ;
            Z3376PedConInE = T01TN3_A3376PedConInE[0] ;
            Z3377PedConFiE = T01TN3_A3377PedConFiE[0] ;
            Z3378PedEtiPrd = T01TN3_A3378PedEtiPrd[0] ;
            Z6289PedNumRq = T01TN3_A6289PedNumRq[0] ;
            Z8158PedFecPEn = T01TN3_A8158PedFecPEn[0] ;
            Z8159PedLinObs = T01TN3_A8159PedLinObs[0] ;
         }
         else
         {
            Z659PedCum = A659PedCum ;
            Z665PedPre = A665PedPre ;
            Z670PedVal = A670PedVal ;
            Z669PedUni = A669PedUni ;
            Z657PedCanEnt = A657PedCanEnt ;
            Z660PedDto = A660PedDto ;
            Z663PedFulEnt = A663PedFulEnt ;
            Z3372PedNumCoP = A3372PedNumCoP ;
            Z3373PedConInP = A3373PedConInP ;
            Z3374PedConFiP = A3374PedConFiP ;
            Z3375PedNumCoE = A3375PedNumCoE ;
            Z3376PedConInE = A3376PedConInE ;
            Z3377PedConFiE = A3377PedConFiE ;
            Z3378PedEtiPrd = A3378PedEtiPrd ;
            Z6289PedNumRq = A6289PedNumRq ;
            Z8158PedFecPEn = A8158PedFecPEn ;
            Z8159PedLinObs = A8159PedLinObs ;
         }
      }
      if ( ( GX_JID == 66 ) || ( GX_JID == 0 ) )
      {
         Z718PrdNom = T01TN5_A718PrdNom[0] ;
         Z724PrdPreAct = T01TN5_A724PrdPreAct[0] ;
      }
      if ( GX_JID == -65 )
      {
         Z658PedCod = A658PedCod ;
         Z659PedCum = A659PedCum ;
         Z665PedPre = A665PedPre ;
         Z670PedVal = A670PedVal ;
         Z669PedUni = A669PedUni ;
         Z657PedCanEnt = A657PedCanEnt ;
         Z660PedDto = A660PedDto ;
         Z663PedFulEnt = A663PedFulEnt ;
         Z3372PedNumCoP = A3372PedNumCoP ;
         Z3373PedConInP = A3373PedConInP ;
         Z3374PedConFiP = A3374PedConFiP ;
         Z3375PedNumCoE = A3375PedNumCoE ;
         Z3376PedConInE = A3376PedConInE ;
         Z3377PedConFiE = A3377PedConFiE ;
         Z3378PedEtiPrd = A3378PedEtiPrd ;
         Z6289PedNumRq = A6289PedNumRq ;
         Z8158PedFecPEn = A8158PedFecPEn ;
         Z8159PedLinObs = A8159PedLinObs ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
      }
   }

   public void standaloneNotModal1TN77( )
   {
      edtPedVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedVal_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedValForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedValForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedValForm_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      O664PedNumLin = A664PedNumLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      if ( AV60Noprecio == 1 )
      {
         edtPedPre_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      }
      else
      {
         if ( AV80SiPrecio == 1 )
         {
            edtPedPre_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), !bGXsfl_96_Refreshing);
         }
         else
         {
            edtPedPre_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), !bGXsfl_96_Refreshing);
         }
      }
   }

   public void standaloneModal1TN77( )
   {
      if ( isDsp( )  || ( AV79SiCantidadentregada == 1 ) )
      {
         edtPedCanEnt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      }
      else
      {
         if ( true /* Level */ && isIns( )  )
         {
            edtPedCanEnt_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), !bGXsfl_96_Refreshing);
         }
         else
         {
            edtPedCanEnt_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), !bGXsfl_96_Refreshing);
         }
      }
      if ( isIns( )  && (GXutil.strcmp("", A659PedCum)==0) && ( Gx_BScreen == 0 ) )
      {
         A659PedCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1TN77( )
   {
      /* Using cursor T01TN36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound77 = (short)(1) ;
         A659PedCum = T01TN36_A659PedCum[0] ;
         A665PedPre = T01TN36_A665PedPre[0] ;
         A684PrdCanPen = T01TN36_A684PrdCanPen[0] ;
         A670PedVal = T01TN36_A670PedVal[0] ;
         A718PrdNom = T01TN36_A718PrdNom[0] ;
         A669PedUni = T01TN36_A669PedUni[0] ;
         A657PedCanEnt = T01TN36_A657PedCanEnt[0] ;
         A660PedDto = T01TN36_A660PedDto[0] ;
         A663PedFulEnt = T01TN36_A663PedFulEnt[0] ;
         A3372PedNumCoP = T01TN36_A3372PedNumCoP[0] ;
         A3373PedConInP = T01TN36_A3373PedConInP[0] ;
         A3374PedConFiP = T01TN36_A3374PedConFiP[0] ;
         A3375PedNumCoE = T01TN36_A3375PedNumCoE[0] ;
         A3376PedConInE = T01TN36_A3376PedConInE[0] ;
         A3377PedConFiE = T01TN36_A3377PedConFiE[0] ;
         A3378PedEtiPrd = T01TN36_A3378PedEtiPrd[0] ;
         A724PrdPreAct = T01TN36_A724PrdPreAct[0] ;
         A6289PedNumRq = T01TN36_A6289PedNumRq[0] ;
         A8158PedFecPEn = T01TN36_A8158PedFecPEn[0] ;
         A8159PedLinObs = T01TN36_A8159PedLinObs[0] ;
         zm1TN77( -65) ;
      }
      pr_default.close(30);
      onLoadActions1TN77( ) ;
   }

   public void onLoadActions1TN77( )
   {
      if ( isDlt( )  )
      {
         A684PrdCanPen = O684PrdCanPen.subtract(O669PedUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A684PrdCanPen = O684PrdCanPen.add(A669PedUni).subtract(O669PedUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A665PedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         GXt_decimal13 = A665PedPre ;
         GXv_decimal14[0] = GXt_decimal13 ;
         new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_decimal14) ;
         tpedido_trn_impl.this.GXt_decimal13 = GXv_decimal14[0] ;
         A665PedPre = GXt_decimal13 ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV25OldPedCum = O659PedCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
      }
      A14203PedValsinD = GXutil.roundDecimal( A669PedUni.multiply(A665PedPre), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14203PedValsinD", GXutil.ltrimstr( A14203PedValsinD, 12, 2));
      O14203PedValsinD = A14203PedValsinD ;
      httpContext.ajax_rsp_assign_attri("", false, "A14203PedValsinD", GXutil.ltrimstr( A14203PedValsinD, 12, 2));
      if ( isIns( )  )
      {
         A14202PedTotsind = O14202PedTotsind.add(A14203PedValsinD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A14202PedTotsind = O14202PedTotsind.add(A14203PedValsinD).subtract(O14203PedValsinD) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A14202PedTotsind = O14202PedTotsind.subtract(O14203PedValsinD) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A14114PedCant = O14114PedCant.add(A669PedUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A14114PedCant = O14114PedCant.add(A669PedUni).subtract(O669PedUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A14114PedCant = O14114PedCant.subtract(O669PedUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
            }
         }
      }
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      A670PedVal = A13787PedValForm ;
      AV24OldPedUni = O669PedUni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24OldPedUni", GXutil.ltrimstr( AV24OldPedUni, 9, 2));
      if ( isIns( )  )
      {
         A14115PedCantEn = O14115PedCantEn.add(A657PedCanEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A14115PedCantEn = O14115PedCantEn.add(A657PedCanEnt).subtract(O657PedCanEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A14115PedCantEn = O14115PedCantEn.subtract(O657PedCanEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
            }
         }
      }
      AV62OldPedEnt = O657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldPedEnt", GXutil.ltrimstr( AV62OldPedEnt, 9, 2));
      if ( isIns( )  )
      {
         A668PedTot = O668PedTot.add(A670PedVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A668PedTot = O668PedTot.add(A670PedVal).subtract(O670PedVal) ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A668PedTot = O668PedTot.subtract(O670PedVal) ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            }
         }
      }
      A8156PedImpDPP = GXutil.roundDecimal( A668PedTot.multiply(A8153PedPrvDPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      A8157PedTotGen = A668PedTot.subtract(A8156PedImpDPP) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
   }

   public void checkExtendedTable1TN77( )
   {
      nIsDirty_77 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1TN77( ) ;
      /* Using cursor T01TN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A684PrdCanPen = T01TN5_A684PrdCanPen[0] ;
      A718PrdNom = T01TN5_A718PrdNom[0] ;
      A724PrdPreAct = T01TN5_A724PrdPreAct[0] ;
      nIsDirty_77 = (short)(1) ;
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      pr_default.close(3);
      if ( isDlt( )  )
      {
         nIsDirty_77 = (short)(1) ;
         A684PrdCanPen = O684PrdCanPen.subtract(O669PedUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_77 = (short)(1) ;
            A684PrdCanPen = O684PrdCanPen.add(A669PedUni).subtract(O669PedUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
      }
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A665PedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_77 = (short)(1) ;
         GXt_decimal13 = A665PedPre ;
         GXv_decimal14[0] = GXt_decimal13 ;
         new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_decimal14) ;
         tpedido_trn_impl.this.GXt_decimal13 = GXv_decimal14[0] ;
         A665PedPre = GXt_decimal13 ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV25OldPedCum = O659PedCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
      }
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int2[0] = A795PrvNum ;
         GXv_int7[0] = AV46FlagExi ;
         new app.pexiprd(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_int2, GXv_int7) ;
         tpedido_trn_impl.this.A396EmprCod = GXv_char5[0] ;
         tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         tpedido_trn_impl.this.A795PrvNum = GXv_int2[0] ;
         tpedido_trn_impl.this.AV46FlagExi = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExi", GXutil.str( AV46FlagExi, 1, 0));
      }
      if ( true /* Level */ && isIns( )  && true /* After */ && ( AV46FlagExi == 1 ) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Proveedor Diferente", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_77 = (short)(1) ;
      A14203PedValsinD = GXutil.roundDecimal( A669PedUni.multiply(A665PedPre), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14203PedValsinD", GXutil.ltrimstr( A14203PedValsinD, 12, 2));
      if ( isIns( )  )
      {
         nIsDirty_77 = (short)(1) ;
         A14202PedTotsind = O14202PedTotsind.add(A14203PedValsinD) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_77 = (short)(1) ;
            A14202PedTotsind = O14202PedTotsind.add(A14203PedValsinD).subtract(O14203PedValsinD) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_77 = (short)(1) ;
               A14202PedTotsind = O14202PedTotsind.subtract(O14203PedValsinD) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_77 = (short)(1) ;
         A14114PedCant = O14114PedCant.add(A669PedUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_77 = (short)(1) ;
            A14114PedCant = O14114PedCant.add(A669PedUni).subtract(O669PedUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_77 = (short)(1) ;
               A14114PedCant = O14114PedCant.subtract(O669PedUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
            }
         }
      }
      nIsDirty_77 = (short)(1) ;
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      nIsDirty_77 = (short)(1) ;
      A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
      nIsDirty_77 = (short)(1) ;
      A670PedVal = A13787PedValForm ;
      AV24OldPedUni = O669PedUni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24OldPedUni", GXutil.ltrimstr( AV24OldPedUni, 9, 2));
      if ( true /* Level */ && true /* After */ && ( DecimalUtil.compareTo(A669PedUni, A657PedCanEnt) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) )
      {
         GXCCtl = "PEDUNI_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Cantidad Pedida menor a Cantidad Entregada", ""), 0, GXCCtl);
      }
      if ( isIns( )  )
      {
         nIsDirty_77 = (short)(1) ;
         A14115PedCantEn = O14115PedCantEn.add(A657PedCanEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_77 = (short)(1) ;
            A14115PedCantEn = O14115PedCantEn.add(A657PedCanEnt).subtract(O657PedCanEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_77 = (short)(1) ;
               A14115PedCantEn = O14115PedCantEn.subtract(O657PedCanEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
            }
         }
      }
      AV62OldPedEnt = O657PedCanEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldPedEnt", GXutil.ltrimstr( AV62OldPedEnt, 9, 2));
      if ( ( A657PedCanEnt.doubleValue() > 0 ) && ( DecimalUtil.compareTo(A665PedPre, O665PedPre) != 0 ) && true /* After */ )
      {
         GXCCtl = "PEDPRE_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. No se permite cambiar PRECIO", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedPre_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A659PedCum, "S") == 0 ) || ( GXutil.strcmp(A659PedCum, "N") == 0 ) ) )
      {
         GXCCtl = "PEDCUM_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Cumplimentado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbPedCum.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  )
      {
         nIsDirty_77 = (short)(1) ;
         A668PedTot = O668PedTot.add(A670PedVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_77 = (short)(1) ;
            A668PedTot = O668PedTot.add(A670PedVal).subtract(O670PedVal) ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_77 = (short)(1) ;
               A668PedTot = O668PedTot.subtract(O670PedVal) ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            }
         }
      }
      nIsDirty_77 = (short)(1) ;
      A8156PedImpDPP = GXutil.roundDecimal( A668PedTot.multiply(A8153PedPrvDPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      nIsDirty_77 = (short)(1) ;
      A8157PedTotGen = A668PedTot.subtract(A8156PedImpDPP) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
   }

   public void closeExtendedTableCursors1TN77( )
   {
      pr_default.close(2);
   }

   public void enableDisable1TN77( )
   {
   }

   public void gxload_66( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01TN5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A684PrdCanPen = T01TN5_A684PrdCanPen[0] ;
      A718PrdNom = T01TN5_A718PrdNom[0] ;
      A724PrdPreAct = T01TN5_A724PrdPreAct[0] ;
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(3) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(3);
   }

   public void getKey1TN77( )
   {
      /* Using cursor T01TN37 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound77 = (short)(1) ;
      }
      else
      {
         RcdFound77 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey1TN77( )
   {
      /* Using cursor T01TN3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01TN3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1TN77( 65) ;
         RcdFound77 = (short)(1) ;
         initializeNonKey1TN77( ) ;
         A659PedCum = T01TN3_A659PedCum[0] ;
         A665PedPre = T01TN3_A665PedPre[0] ;
         A670PedVal = T01TN3_A670PedVal[0] ;
         A669PedUni = T01TN3_A669PedUni[0] ;
         A657PedCanEnt = T01TN3_A657PedCanEnt[0] ;
         A660PedDto = T01TN3_A660PedDto[0] ;
         A663PedFulEnt = T01TN3_A663PedFulEnt[0] ;
         A3372PedNumCoP = T01TN3_A3372PedNumCoP[0] ;
         A3373PedConInP = T01TN3_A3373PedConInP[0] ;
         A3374PedConFiP = T01TN3_A3374PedConFiP[0] ;
         A3375PedNumCoE = T01TN3_A3375PedNumCoE[0] ;
         A3376PedConInE = T01TN3_A3376PedConInE[0] ;
         A3377PedConFiE = T01TN3_A3377PedConFiE[0] ;
         A3378PedEtiPrd = T01TN3_A3378PedEtiPrd[0] ;
         A6289PedNumRq = T01TN3_A6289PedNumRq[0] ;
         A8158PedFecPEn = T01TN3_A8158PedFecPEn[0] ;
         A8159PedLinObs = T01TN3_A8159PedLinObs[0] ;
         A719PrdNum = T01TN3_A719PrdNum[0] ;
         O659PedCum = A659PedCum ;
         O669PedUni = A669PedUni ;
         O657PedCanEnt = A657PedCanEnt ;
         O670PedVal = A670PedVal ;
         O665PedPre = A665PedPre ;
         Z396EmprCod = A396EmprCod ;
         Z658PedCod = A658PedCod ;
         Z719PrdNum = A719PrdNum ;
         sMode77 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TN77( ) ;
         Gx_mode = sMode77 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound77 = (short)(0) ;
         initializeNonKey1TN77( ) ;
         sMode77 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TN77( ) ;
         Gx_mode = sMode77 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TN77( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TN77( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TN2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z659PedCum, T01TN2_A659PedCum[0]) != 0 ) || ( DecimalUtil.compareTo(Z665PedPre, T01TN2_A665PedPre[0]) != 0 ) || ( DecimalUtil.compareTo(Z670PedVal, T01TN2_A670PedVal[0]) != 0 ) || ( DecimalUtil.compareTo(Z669PedUni, T01TN2_A669PedUni[0]) != 0 ) || ( DecimalUtil.compareTo(Z657PedCanEnt, T01TN2_A657PedCanEnt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z660PedDto, T01TN2_A660PedDto[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01TN2_A663PedFulEnt[0])) ) || ( Z3372PedNumCoP != T01TN2_A3372PedNumCoP[0] ) || ( Z3373PedConInP != T01TN2_A3373PedConInP[0] ) || ( Z3374PedConFiP != T01TN2_A3374PedConFiP[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3375PedNumCoE != T01TN2_A3375PedNumCoE[0] ) || ( Z3376PedConInE != T01TN2_A3376PedConInE[0] ) || ( Z3377PedConFiE != T01TN2_A3377PedConFiE[0] ) || ( Z3378PedEtiPrd != T01TN2_A3378PedEtiPrd[0] ) || ( Z6289PedNumRq != T01TN2_A6289PedNumRq[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z8158PedFecPEn), GXutil.resetTime(T01TN2_A8158PedFecPEn[0])) ) || ( GXutil.strcmp(Z8159PedLinObs, T01TN2_A8159PedLinObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z659PedCum, T01TN2_A659PedCum[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedCum");
               GXutil.writeLogRaw("Old: ",Z659PedCum);
               GXutil.writeLogRaw("Current: ",T01TN2_A659PedCum[0]);
            }
            if ( DecimalUtil.compareTo(Z665PedPre, T01TN2_A665PedPre[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedPre");
               GXutil.writeLogRaw("Old: ",Z665PedPre);
               GXutil.writeLogRaw("Current: ",T01TN2_A665PedPre[0]);
            }
            if ( DecimalUtil.compareTo(Z670PedVal, T01TN2_A670PedVal[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedVal");
               GXutil.writeLogRaw("Old: ",Z670PedVal);
               GXutil.writeLogRaw("Current: ",T01TN2_A670PedVal[0]);
            }
            if ( DecimalUtil.compareTo(Z669PedUni, T01TN2_A669PedUni[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedUni");
               GXutil.writeLogRaw("Old: ",Z669PedUni);
               GXutil.writeLogRaw("Current: ",T01TN2_A669PedUni[0]);
            }
            if ( DecimalUtil.compareTo(Z657PedCanEnt, T01TN2_A657PedCanEnt[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedCanEnt");
               GXutil.writeLogRaw("Old: ",Z657PedCanEnt);
               GXutil.writeLogRaw("Current: ",T01TN2_A657PedCanEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z660PedDto, T01TN2_A660PedDto[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedDto");
               GXutil.writeLogRaw("Old: ",Z660PedDto);
               GXutil.writeLogRaw("Current: ",T01TN2_A660PedDto[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z663PedFulEnt), GXutil.resetTime(T01TN2_A663PedFulEnt[0])) ) )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedFulEnt");
               GXutil.writeLogRaw("Old: ",Z663PedFulEnt);
               GXutil.writeLogRaw("Current: ",T01TN2_A663PedFulEnt[0]);
            }
            if ( Z3372PedNumCoP != T01TN2_A3372PedNumCoP[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedNumCoP");
               GXutil.writeLogRaw("Old: ",Z3372PedNumCoP);
               GXutil.writeLogRaw("Current: ",T01TN2_A3372PedNumCoP[0]);
            }
            if ( Z3373PedConInP != T01TN2_A3373PedConInP[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedConInP");
               GXutil.writeLogRaw("Old: ",Z3373PedConInP);
               GXutil.writeLogRaw("Current: ",T01TN2_A3373PedConInP[0]);
            }
            if ( Z3374PedConFiP != T01TN2_A3374PedConFiP[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedConFiP");
               GXutil.writeLogRaw("Old: ",Z3374PedConFiP);
               GXutil.writeLogRaw("Current: ",T01TN2_A3374PedConFiP[0]);
            }
            if ( Z3375PedNumCoE != T01TN2_A3375PedNumCoE[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedNumCoE");
               GXutil.writeLogRaw("Old: ",Z3375PedNumCoE);
               GXutil.writeLogRaw("Current: ",T01TN2_A3375PedNumCoE[0]);
            }
            if ( Z3376PedConInE != T01TN2_A3376PedConInE[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedConInE");
               GXutil.writeLogRaw("Old: ",Z3376PedConInE);
               GXutil.writeLogRaw("Current: ",T01TN2_A3376PedConInE[0]);
            }
            if ( Z3377PedConFiE != T01TN2_A3377PedConFiE[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedConFiE");
               GXutil.writeLogRaw("Old: ",Z3377PedConFiE);
               GXutil.writeLogRaw("Current: ",T01TN2_A3377PedConFiE[0]);
            }
            if ( Z3378PedEtiPrd != T01TN2_A3378PedEtiPrd[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedEtiPrd");
               GXutil.writeLogRaw("Old: ",Z3378PedEtiPrd);
               GXutil.writeLogRaw("Current: ",T01TN2_A3378PedEtiPrd[0]);
            }
            if ( Z6289PedNumRq != T01TN2_A6289PedNumRq[0] )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedNumRq");
               GXutil.writeLogRaw("Old: ",Z6289PedNumRq);
               GXutil.writeLogRaw("Current: ",T01TN2_A6289PedNumRq[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8158PedFecPEn), GXutil.resetTime(T01TN2_A8158PedFecPEn[0])) ) )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedFecPEn");
               GXutil.writeLogRaw("Old: ",Z8158PedFecPEn);
               GXutil.writeLogRaw("Current: ",T01TN2_A8158PedFecPEn[0]);
            }
            if ( GXutil.strcmp(Z8159PedLinObs, T01TN2_A8159PedLinObs[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PedLinObs");
               GXutil.writeLogRaw("Old: ",Z8159PedLinObs);
               GXutil.writeLogRaw("Current: ",T01TN2_A8159PedLinObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLPEDID"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01TN38 */
      pr_default.execute(32, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(32) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z718PrdNom, T01TN38_A718PrdNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z724PrdPreAct, T01TN38_A724PrdPreAct[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01TN38_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01TN38_A718PrdNom[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T01TN38_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("tpedido_trn:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T01TN38_A724PrdPreAct[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TN77( )
   {
      beforeValidate1TN77( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TN77( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TN77( 0) ;
         checkOptimisticConcurrency1TN77( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TN77( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TN77( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TN39 */
                  pr_default.execute(33, new Object[] {Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A659PedCum, A665PedPre, A670PedVal, A669PedUni, A657PedCanEnt, A660PedDto, A663PedFulEnt, Short.valueOf(A3372PedNumCoP), Integer.valueOf(A3373PedConInP), Integer.valueOf(A3374PedConFiP), Short.valueOf(A3375PedNumCoE), Integer.valueOf(A3376PedConInE), Integer.valueOf(A3377PedConFiE), Byte.valueOf(A3378PedEtiPrd), Integer.valueOf(A6289PedNumRq), A8158PedFecPEn, A8159PedLinObs, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
                  if ( (pr_default.getStatus(33) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11TN77( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        AV81Texto_i = httpContext.getMessage( httpContext.getMessage( "COMPRAS INS-PEDIDO: ", ""), "") + GXutil.str( A658PedCod, 8, 0) + httpContext.getMessage( httpContext.getMessage( " Prd. ", ""), "") + A719PrdNum + httpContext.getMessage( httpContext.getMessage( " U.Ped. ", ""), "") + GXutil.str( A669PedUni, 9, 2) + httpContext.getMessage( httpContext.getMessage( " U.Ent. ", ""), "") + GXutil.str( A657PedCanEnt, 9, 2) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV81Texto_i", AV81Texto_i);
                     }
                     if ( true /* After */ || true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV84Pgmname, AV10UsurCod, AV8Station, AV81Texto_i, A658PedCod, (byte)(0), " ") ;
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
            load1TN77( ) ;
         }
         endLevel1TN77( ) ;
      }
      closeExtendedTableCursors1TN77( ) ;
   }

   public void update1TN77( )
   {
      beforeValidate1TN77( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TN77( ) ;
      }
      if ( ( nIsMod_77 != 0 ) || ( nIsDirty_77 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TN77( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TN77( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TN77( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TN40 */
                     pr_default.execute(34, new Object[] {A659PedCum, A665PedPre, A670PedVal, A669PedUni, A657PedCanEnt, A660PedDto, A663PedFulEnt, Short.valueOf(A3372PedNumCoP), Integer.valueOf(A3373PedConInP), Integer.valueOf(A3374PedConFiP), Short.valueOf(A3375PedNumCoE), Integer.valueOf(A3376PedConInE), Integer.valueOf(A3377PedConFiE), Byte.valueOf(A3378PedEtiPrd), Integer.valueOf(A6289PedNumRq), A8158PedFecPEn, A8159PedLinObs, A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
                     if ( (pr_default.getStatus(34) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLPEDID"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TN77( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* After */ && true /* Level */ )
                        {
                           GXv_char5[0] = A396EmprCod ;
                           GXv_int2[0] = A658PedCod ;
                           GXv_char3[0] = A719PrdNum ;
                           GXv_char1[0] = AV25OldPedCum ;
                           new app.pclospe1(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char3, GXv_char1) ;
                           tpedido_trn_impl.this.A396EmprCod = GXv_char5[0] ;
                           tpedido_trn_impl.this.A658PedCod = GXv_int2[0] ;
                           tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                           tpedido_trn_impl.this.AV25OldPedCum = GXv_char1[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
                        }
                        if ( true /* After */ )
                        {
                           AV81Texto_i = httpContext.getMessage( httpContext.getMessage( "COMPRAS UPD-PEDIDO: ", ""), "") + GXutil.str( A658PedCod, 8, 0) + httpContext.getMessage( httpContext.getMessage( " Prd. ", ""), "") + A719PrdNum + httpContext.getMessage( httpContext.getMessage( " U.Ped. ", ""), "") + GXutil.str( A669PedUni, 9, 2) + httpContext.getMessage( httpContext.getMessage( " U.Ent. ", ""), "") + GXutil.str( A657PedCanEnt, 9, 2) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV81Texto_i", AV81Texto_i);
                        }
                        if ( true /* After */ || true /* After */ )
                        {
                           new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV84Pgmname, AV10UsurCod, AV8Station, AV81Texto_i, A658PedCod, (byte)(0), " ") ;
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11TN77( ) ;
                           getByPrimaryKey1TN77( ) ;
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
            endLevel1TN77( ) ;
         }
      }
      closeExtendedTableCursors1TN77( ) ;
   }

   public void deferredUpdate1TN77( )
   {
   }

   public void delete1TN77( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TN77( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TN77( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TN77( ) ;
         afterConfirm1TN77( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TN77( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TN41 */
               pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPEDID");
               if ( AnyError == 0 )
               {
                  updateTablesN11TN77( ) ;
                  /* Start of After( delete) rules */
                  if ( true /* After */ && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) )
                  {
                     GXv_char5[0] = A396EmprCod ;
                     GXv_int2[0] = A658PedCod ;
                     GXv_char3[0] = A719PrdNum ;
                     new app.pelilpe(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char3) ;
                     tpedido_trn_impl.this.A396EmprCod = GXv_char5[0] ;
                     tpedido_trn_impl.this.A658PedCod = GXv_int2[0] ;
                     tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
                  }
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
      sMode77 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TN77( ) ;
      Gx_mode = sMode77 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TN77( )
   {
      standaloneModal1TN77( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true /* Level */ && isIns( )  && true /* After */ )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_int2[0] = A795PrvNum ;
            GXv_int7[0] = AV46FlagExi ;
            new app.pexiprd(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_int2, GXv_int7) ;
            tpedido_trn_impl.this.A396EmprCod = GXv_char5[0] ;
            tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
            tpedido_trn_impl.this.A795PrvNum = GXv_int2[0] ;
            tpedido_trn_impl.this.AV46FlagExi = GXv_int7[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExi", GXutil.str( AV46FlagExi, 1, 0));
         }
         if ( true /* Level */ && isIns( )  && true /* After */ && ( AV46FlagExi == 1 ) )
         {
            GXCCtl = "PRDNUM_" + sGXsfl_96_idx ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Proveedor Diferente", ""), 1, GXCCtl);
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         /* Using cursor T01TN42 */
         pr_default.execute(36, new Object[] {A396EmprCod, A719PrdNum});
         Z718PrdNom = T01TN42_A718PrdNom[0] ;
         Z724PrdPreAct = T01TN42_A724PrdPreAct[0] ;
         A684PrdCanPen = T01TN42_A684PrdCanPen[0] ;
         A718PrdNom = T01TN42_A718PrdNom[0] ;
         A724PrdPreAct = T01TN42_A724PrdPreAct[0] ;
         O684PrdCanPen = A684PrdCanPen ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         pr_default.close(36);
         if ( true /* Level */ && true /* After */ )
         {
            AV25OldPedCum = O659PedCum ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
         }
         if ( isIns( )  )
         {
            A14114PedCant = O14114PedCant.add(A669PedUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A14114PedCant = O14114PedCant.add(A669PedUni).subtract(O669PedUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A14114PedCant = O14114PedCant.subtract(O669PedUni) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
               }
            }
         }
         if ( isDlt( )  )
         {
            A684PrdCanPen = O684PrdCanPen.subtract(O669PedUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A684PrdCanPen = O684PrdCanPen.add(A669PedUni).subtract(O669PedUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
            }
         }
         AV24OldPedUni = O669PedUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OldPedUni", GXutil.ltrimstr( AV24OldPedUni, 9, 2));
         A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
         if ( isIns( )  )
         {
            A14115PedCantEn = O14115PedCantEn.add(A657PedCanEnt) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A14115PedCantEn = O14115PedCantEn.add(A657PedCanEnt).subtract(O657PedCanEnt) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A14115PedCantEn = O14115PedCantEn.subtract(O657PedCanEnt) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
               }
            }
         }
         AV62OldPedEnt = O657PedCanEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62OldPedEnt", GXutil.ltrimstr( AV62OldPedEnt, 9, 2));
         A14203PedValsinD = GXutil.roundDecimal( A669PedUni.multiply(A665PedPre), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14203PedValsinD", GXutil.ltrimstr( A14203PedValsinD, 12, 2));
         if ( isIns( )  )
         {
            A14202PedTotsind = O14202PedTotsind.add(A14203PedValsinD) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A14202PedTotsind = O14202PedTotsind.add(A14203PedValsinD).subtract(O14203PedValsinD) ;
               httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A14202PedTotsind = O14202PedTotsind.subtract(O14203PedValsinD) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
               }
            }
         }
         A13787PedValForm = GXutil.roundDecimal( (A669PedUni.multiply(A665PedPre)).multiply((DecimalUtil.doubleToDec(1).subtract((A660PedDto.divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))))), 2) ;
         if ( isIns( )  )
         {
            A668PedTot = O668PedTot.add(A670PedVal) ;
            httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A668PedTot = O668PedTot.add(A670PedVal).subtract(O670PedVal) ;
               httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A668PedTot = O668PedTot.subtract(O670PedVal) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
               }
            }
         }
         A8156PedImpDPP = GXutil.roundDecimal( A668PedTot.multiply(A8153PedPrvDPP).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
         A8157PedTotGen = A668PedTot.subtract(A8156PedImpDPP) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TN43 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREPED", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01TN44 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENTALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void updateTablesN11TN77( )
   {
      /* Using cursor T01TN45 */
      pr_default.execute(39, new Object[] {A684PrdCanPen, A396EmprCod, A719PrdNum});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
   }

   public void endLevel1TN77( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      pr_default.close(32);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TN77( )
   {
      /* Scan By routine */
      /* Using cursor T01TN46 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      RcdFound77 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound77 = (short)(1) ;
         A719PrdNum = T01TN46_A719PrdNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TN77( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound77 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound77 = (short)(1) ;
         A719PrdNum = T01TN46_A719PrdNum[0] ;
      }
   }

   public void scanEnd1TN77( )
   {
      pr_default.close(40);
   }

   public void afterConfirm1TN77( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TN77( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TN77( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TN77( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TN77( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TN77( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TN77( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedUni_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedCanEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtCantPdte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCantPdte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCantPdte_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedDto_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedVal_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedValForm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedValForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedValForm_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      cmbPedCum.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPedCum.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPedCum.getEnabled(), 5, 0), !bGXsfl_96_Refreshing);
      edtPedFecPEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedFecPEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedFecPEn_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedLinObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedLinObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedLinObs_Enabled), 5, 0), !bGXsfl_96_Refreshing);
   }

   public void send_integrity_lvl_hashes1TN77( )
   {
   }

   public void send_integrity_lvl_hashes1TN76( )
   {
   }

   public void subsflControlProps_9677( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_96_idx ;
      edtPedUni_Internalname = "PEDUNI_"+sGXsfl_96_idx ;
      edtPedCanEnt_Internalname = "PEDCANENT_"+sGXsfl_96_idx ;
      edtCantPdte_Internalname = "CANTPDTE_"+sGXsfl_96_idx ;
      edtPedPre_Internalname = "PEDPRE_"+sGXsfl_96_idx ;
      edtPedDto_Internalname = "PEDDTO_"+sGXsfl_96_idx ;
      edtPedVal_Internalname = "PEDVAL_"+sGXsfl_96_idx ;
      edtPedValForm_Internalname = "PEDVALFORM_"+sGXsfl_96_idx ;
      cmbPedCum.setInternalname( "PEDCUM_"+sGXsfl_96_idx );
      edtPedFecPEn_Internalname = "PEDFECPEN_"+sGXsfl_96_idx ;
      edtPedLinObs_Internalname = "PEDLINOBS_"+sGXsfl_96_idx ;
   }

   public void subsflControlProps_fel_9677( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_96_fel_idx ;
      edtPedUni_Internalname = "PEDUNI_"+sGXsfl_96_fel_idx ;
      edtPedCanEnt_Internalname = "PEDCANENT_"+sGXsfl_96_fel_idx ;
      edtCantPdte_Internalname = "CANTPDTE_"+sGXsfl_96_fel_idx ;
      edtPedPre_Internalname = "PEDPRE_"+sGXsfl_96_fel_idx ;
      edtPedDto_Internalname = "PEDDTO_"+sGXsfl_96_fel_idx ;
      edtPedVal_Internalname = "PEDVAL_"+sGXsfl_96_fel_idx ;
      edtPedValForm_Internalname = "PEDVALFORM_"+sGXsfl_96_fel_idx ;
      cmbPedCum.setInternalname( "PEDCUM_"+sGXsfl_96_fel_idx );
      edtPedFecPEn_Internalname = "PEDFECPEN_"+sGXsfl_96_fel_idx ;
      edtPedLinObs_Internalname = "PEDLINOBS_"+sGXsfl_96_fel_idx ;
   }

   public void addRow1TN77( )
   {
      nGXsfl_96_idx = (int)(nGXsfl_96_idx+1) ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_9677( ) ;
      sendRow1TN77( ) ;
   }

   public void sendRow1TN77( )
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
         if ( ((int)((nGXsfl_96_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedUni_Internalname,GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPedUni_Enabled!=0) ? localUtil.format( A669PedUni, "ZZZZZ9.99") : localUtil.format( A669PedUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCanEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A657PedCanEnt, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedCanEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedCanEnt_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCantPdte_Internalname,GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCantPdte_Enabled!=0) ? localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99") : localUtil.format( A13833CantPdte, "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCantPdte_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCantPdte_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedPre_Internalname,GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A665PedPre, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedPre_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedDto_Internalname,GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPedDto_Enabled!=0) ? localUtil.format( A660PedDto, "Z9.99") : localUtil.format( A660PedDto, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedVal_Internalname,GXutil.ltrim( localUtil.ntoc( A670PedVal, (byte)(14), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPedVal_Enabled!=0) ? localUtil.format( A670PedVal, "ZZZ,ZZZ,ZZ9.99") : localUtil.format( A670PedVal, "ZZZ,ZZZ,ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedValForm_Internalname,GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPedValForm_Enabled!=0) ? localUtil.format( A13787PedValForm, "ZZZZZZZZ9.99") : localUtil.format( A13787PedValForm, "ZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedValForm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtPedValForm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      GXCCtl = "PEDCUM_" + sGXsfl_96_idx ;
      cmbPedCum.setName( GXCCtl );
      cmbPedCum.setWebtags( "" );
      cmbPedCum.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPedCum.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPedCum.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A659PedCum)==0) )
         {
            A659PedCum = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPedCum,cmbPedCum.getInternalname(),GXutil.rtrim( A659PedCum),Integer.valueOf(1),cmbPedCum.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbPedCum.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbPedCum.setValue( GXutil.rtrim( A659PedCum) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPedCum.getInternalname(), "Values", cmbPedCum.ToJavascriptSource(), !bGXsfl_96_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedFecPEn_Internalname,localUtil.format(A8158PedFecPEn, "99/99/99"),localUtil.format( A8158PedFecPEn, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedFecPEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedFecPEn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_77_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedLinObs_Internalname,GXutil.rtrim( A8159PedLinObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedLinObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPedLinObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(96),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1TN77( ) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z659PedCum_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z659PedCum));
      GXCCtl = "Z665PedPre_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z670PedVal_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z669PedUni_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z657PedCanEnt_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z660PedDto_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z660PedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z663PedFulEnt_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z663PedFulEnt, 0, "/"));
      GXCCtl = "Z3372PedNumCoP_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3372PedNumCoP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3373PedConInP_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3373PedConInP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3374PedConFiP_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3374PedConFiP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3375PedNumCoE_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3375PedNumCoE, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3376PedConInE_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3376PedConInE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3377PedConFiE_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3377PedConFiE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3378PedEtiPrd_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3378PedEtiPrd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6289PedNumRq_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6289PedNumRq, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8158PedFecPEn_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z8158PedFecPEn, 0, "/"));
      GXCCtl = "Z8159PedLinObs_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8159PedLinObs));
      GXCCtl = "Z718PrdNom_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z718PrdNom));
      GXCCtl = "Z724PrdPreAct_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O659PedCum_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O659PedCum));
      GXCCtl = "O669PedUni_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O657PedCanEnt_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O684PrdCanPen_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O14203PedValsinD_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O14203PedValsinD, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O670PedVal_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O670PedVal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O665PedPre_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PEDVALSIND_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A14203PedValsinD, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "PRDCANPEN_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_77_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_77_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_77_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_77, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N657PedCanEnt_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N665PedPre_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_96_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV15TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV15TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV12EmprCod));
      GXCCtl = "vPEDCOD_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV13PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_96_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDUNI_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANENT_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCanEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CANTPDTE_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCantPdte_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRE_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDDTO_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDVAL_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDVALFORM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedValForm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCUM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbPedCum.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFECPEN_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedFecPEn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDLINOBS_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPedLinObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1TN77( )
   {
      nGXsfl_96_idx = (int)(nGXsfl_96_idx+1) ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_9677( ) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDUNI_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedCanEnt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDCANENT_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCantPdte_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CANTPDTE_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDPRE_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDDTO_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDVAL_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedValForm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDVALFORM_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbPedCum.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "PEDCUM_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtPedFecPEn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDFECPEN_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPedLinObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PEDLINOBS_"+sGXsfl_96_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PEDUNI_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedUni_Internalname ;
         wbErr = true ;
         A669PedUni = DecimalUtil.ZERO ;
      }
      else
      {
         A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "PEDCANENT_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCanEnt_Internalname ;
         wbErr = true ;
         A657PedCanEnt = DecimalUtil.ZERO ;
      }
      else
      {
         A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
      }
      A13833CantPdte = localUtil.ctond( httpContext.cgiGet( edtCantPdte_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PEDPRE_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedPre_Internalname ;
         wbErr = true ;
         A665PedPre = DecimalUtil.ZERO ;
      }
      else
      {
         A665PedPre = localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "PEDDTO_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedDto_Internalname ;
         wbErr = true ;
         A660PedDto = DecimalUtil.ZERO ;
      }
      else
      {
         A660PedDto = localUtil.ctond( httpContext.cgiGet( edtPedDto_Internalname)) ;
      }
      A670PedVal = localUtil.ctond( httpContext.cgiGet( edtPedVal_Internalname)) ;
      A13787PedValForm = localUtil.ctond( httpContext.cgiGet( edtPedValForm_Internalname)) ;
      cmbPedCum.setName( cmbPedCum.getInternalname() );
      cmbPedCum.setValue( httpContext.cgiGet( cmbPedCum.getInternalname()) );
      A659PedCum = httpContext.cgiGet( cmbPedCum.getInternalname()) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtPedFecPEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "PEDFECPEN_" + sGXsfl_96_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFecPEn_Internalname ;
         wbErr = true ;
         A8158PedFecPEn = GXutil.nullDate() ;
      }
      else
      {
         A8158PedFecPEn = localUtil.ctod( httpContext.cgiGet( edtPedFecPEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      A8159PedLinObs = httpContext.cgiGet( edtPedLinObs_Internalname) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_96_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z659PedCum_" + sGXsfl_96_idx ;
      Z659PedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z665PedPre_" + sGXsfl_96_idx ;
      Z665PedPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z670PedVal_" + sGXsfl_96_idx ;
      Z670PedVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z669PedUni_" + sGXsfl_96_idx ;
      Z669PedUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z657PedCanEnt_" + sGXsfl_96_idx ;
      Z657PedCanEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z660PedDto_" + sGXsfl_96_idx ;
      Z660PedDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z663PedFulEnt_" + sGXsfl_96_idx ;
      Z663PedFulEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3372PedNumCoP_" + sGXsfl_96_idx ;
      Z3372PedNumCoP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3373PedConInP_" + sGXsfl_96_idx ;
      Z3373PedConInP = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3374PedConFiP_" + sGXsfl_96_idx ;
      Z3374PedConFiP = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3375PedNumCoE_" + sGXsfl_96_idx ;
      Z3375PedNumCoE = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3376PedConInE_" + sGXsfl_96_idx ;
      Z3376PedConInE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3377PedConFiE_" + sGXsfl_96_idx ;
      Z3377PedConFiE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3378PedEtiPrd_" + sGXsfl_96_idx ;
      Z3378PedEtiPrd = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6289PedNumRq_" + sGXsfl_96_idx ;
      Z6289PedNumRq = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8158PedFecPEn_" + sGXsfl_96_idx ;
      Z8158PedFecPEn = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8159PedLinObs_" + sGXsfl_96_idx ;
      Z8159PedLinObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z718PrdNom_" + sGXsfl_96_idx ;
      Z718PrdNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z724PrdPreAct_" + sGXsfl_96_idx ;
      Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z663PedFulEnt_" + sGXsfl_96_idx ;
      A663PedFulEnt = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z3372PedNumCoP_" + sGXsfl_96_idx ;
      A3372PedNumCoP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3373PedConInP_" + sGXsfl_96_idx ;
      A3373PedConInP = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3374PedConFiP_" + sGXsfl_96_idx ;
      A3374PedConFiP = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3375PedNumCoE_" + sGXsfl_96_idx ;
      A3375PedNumCoE = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3376PedConInE_" + sGXsfl_96_idx ;
      A3376PedConInE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3377PedConFiE_" + sGXsfl_96_idx ;
      A3377PedConFiE = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3378PedEtiPrd_" + sGXsfl_96_idx ;
      A3378PedEtiPrd = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6289PedNumRq_" + sGXsfl_96_idx ;
      A6289PedNumRq = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z718PrdNom_" + sGXsfl_96_idx ;
      A718PrdNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z724PrdPreAct_" + sGXsfl_96_idx ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O659PedCum_" + sGXsfl_96_idx ;
      O659PedCum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O669PedUni_" + sGXsfl_96_idx ;
      O669PedUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O657PedCanEnt_" + sGXsfl_96_idx ;
      O657PedCanEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O684PrdCanPen_" + sGXsfl_96_idx ;
      O684PrdCanPen = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O14203PedValsinD_" + sGXsfl_96_idx ;
      O14203PedValsinD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O670PedVal_" + sGXsfl_96_idx ;
      O670PedVal = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O665PedPre_" + sGXsfl_96_idx ;
      O665PedPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "PEDVALSIND_" + sGXsfl_96_idx ;
      A14203PedValsinD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "PRDCANPEN_" + sGXsfl_96_idx ;
      A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_77_" + sGXsfl_96_idx ;
      nRcdDeleted_77 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_77_" + sGXsfl_96_idx ;
      nRcdExists_77 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_77_" + sGXsfl_96_idx ;
      nIsMod_77 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N657PedCanEnt_" + sGXsfl_96_idx ;
      N657PedCanEnt = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "N665PedPre_" + sGXsfl_96_idx ;
      N665PedPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
   }

   public void assign_properties_default( )
   {
      defedtPedValForm_Enabled = edtPedValForm_Enabled ;
      defedtPedVal_Enabled = edtPedVal_Enabled ;
      defedtPedPre_Enabled = edtPedPre_Enabled ;
      defedtPedCanEnt_Enabled = edtPedCanEnt_Enabled ;
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
   }

   public void confirmValues1TN0( )
   {
      nGXsfl_96_idx = 0 ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_9677( ) ;
      while ( nGXsfl_96_idx < nRC_GXsfl_96 )
      {
         nGXsfl_96_idx = (int)(nGXsfl_96_idx+1) ;
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_9677( ) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z659PedCum_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z659PedCum_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z659PedCum_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z665PedPre_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z665PedPre_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z665PedPre_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z670PedVal_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z670PedVal_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z670PedVal_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z669PedUni_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z669PedUni_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z669PedUni_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z657PedCanEnt_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z657PedCanEnt_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z657PedCanEnt_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z660PedDto_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z660PedDto_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z660PedDto_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z663PedFulEnt_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z663PedFulEnt_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z663PedFulEnt_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3372PedNumCoP_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3372PedNumCoP_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3372PedNumCoP_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3373PedConInP_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3373PedConInP_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3373PedConInP_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3374PedConFiP_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3374PedConFiP_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3374PedConFiP_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3375PedNumCoE_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3375PedNumCoE_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3375PedNumCoE_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3376PedConInE_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3376PedConInE_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3376PedConInE_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3377PedConFiE_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3377PedConFiE_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3377PedConFiE_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z3378PedEtiPrd_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z3378PedEtiPrd_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3378PedEtiPrd_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z6289PedNumRq_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z6289PedNumRq_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6289PedNumRq_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z8158PedFecPEn_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z8158PedFecPEn_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8158PedFecPEn_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z8159PedLinObs_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z8159PedLinObs_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8159PedLinObs_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z718PrdNom_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z718PrdNom_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z718PrdNom_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z724PrdPreAct_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z724PrdPreAct_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z724PrdPreAct_"+sGXsfl_96_idx) ;
      }
      httpContext.changePostValue( "O659PedCum", httpContext.cgiGet( "T659PedCum")) ;
      httpContext.deletePostValue( "T659PedCum") ;
      httpContext.changePostValue( "O669PedUni", httpContext.cgiGet( "T669PedUni")) ;
      httpContext.deletePostValue( "T669PedUni") ;
      httpContext.changePostValue( "O657PedCanEnt", httpContext.cgiGet( "T657PedCanEnt")) ;
      httpContext.deletePostValue( "T657PedCanEnt") ;
      httpContext.changePostValue( "O684PrdCanPen", httpContext.cgiGet( "T684PrdCanPen")) ;
      httpContext.deletePostValue( "T684PrdCanPen") ;
      httpContext.changePostValue( "O14203PedValsinD", httpContext.cgiGet( "T14203PedValsinD")) ;
      httpContext.deletePostValue( "T14203PedValsinD") ;
      httpContext.changePostValue( "O670PedVal", httpContext.cgiGet( "T670PedVal")) ;
      httpContext.deletePostValue( "T670PedVal") ;
      httpContext.changePostValue( "O665PedPre", httpContext.cgiGet( "T665PedPre")) ;
      httpContext.deletePostValue( "T665PedPre") ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tpedido_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13PedCod,8,0))}, new String[] {"Gx_mode","EmprCod","PedCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPEDIDO_Trn");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV84Pgmname, "")));
      forbiddenHiddens.add("PedSit", GXutil.rtrim( localUtil.format( A667PedSit, "@!")));
      forbiddenHiddens.add("PedPri", GXutil.rtrim( localUtil.format( A666PedPri, "9")));
      forbiddenHiddens.add("PedCodExt", GXutil.rtrim( localUtil.format( A6160PedCodExt, "")));
      forbiddenHiddens.add("PedEnv", localUtil.format( DecimalUtil.doubleToDec(A6712PedEnv), "9"));
      forbiddenHiddens.add("PedAlmc", localUtil.format( DecimalUtil.doubleToDec(A12580PedAlmc), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tpedido_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z658PedCod", GXutil.ltrim( localUtil.ntoc( Z658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z661PedFec", localUtil.dtoc( Z661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z662PedFecEnt", localUtil.dtoc( Z662PedFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z667PedSit", GXutil.rtrim( Z667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "Z666PedPri", GXutil.rtrim( Z666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6160PedCodExt", Z6160PedCodExt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z6712PedEnv", GXutil.ltrim( localUtil.ntoc( Z6712PedEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8153PedPrvDPP", GXutil.ltrim( localUtil.ntoc( Z8153PedPrvDPP, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8154PedPerDes", GXutil.rtrim( Z8154PedPerDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8155PedPerPet", GXutil.rtrim( Z8155PedPerPet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12580PedAlmc", GXutil.ltrim( localUtil.ntoc( Z12580PedAlmc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3113PedCDivCod", GXutil.ltrim( localUtil.ntoc( Z3113PedCDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O14202PedTotsind", GXutil.ltrim( localUtil.ntoc( O14202PedTotsind, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O668PedTot", GXutil.ltrim( localUtil.ntoc( O668PedTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O14115PedCantEn", GXutil.ltrim( localUtil.ntoc( O14115PedCantEn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O14114PedCant", GXutil.ltrim( localUtil.ntoc( O14114PedCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O661PedFec", localUtil.dtoc( O661PedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_96", GXutil.ltrim( localUtil.ntoc( nGXsfl_96_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N3113PedCDivCod", GXutil.ltrim( localUtil.ntoc( A3113PedCDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV21PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV21PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV15TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV15TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV15TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDIMPDPP", GXutil.ltrim( localUtil.ntoc( A8156PedImpDPP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDTOTGEN", GXutil.ltrim( localUtil.ntoc( A8157PedTotGen, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV13PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPEDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13PedCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PRVNUM", GXutil.ltrim( localUtil.ntoc( AV17Insert_PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PEDCDIVCOD", GXutil.ltrim( localUtil.ntoc( AV18Insert_PedCDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVDIVCO", GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCDIVCOD", GXutil.ltrim( localUtil.ntoc( A3113PedCDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPEDFEC", localUtil.dtoc( AV26OldPedFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMLIN", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDSIT", GXutil.rtrim( A667PedSit));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDPRI", GXutil.rtrim( A666PedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCODEXT", A6160PedCodExt);
      app.GxWebStd.gx_hidden_field( httpContext, "PEDENV", GXutil.ltrim( localUtil.ntoc( A6712PedEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDALMC", GXutil.ltrim( localUtil.ntoc( A12580PedAlmc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPNUMDEC", GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVCAR", GXutil.rtrim( A3314PrvCar));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCDIVABR", GXutil.rtrim( A3114PedCDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVDIVABR", GXutil.rtrim( A3144PrvDivAbr));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANT", GXutil.ltrim( localUtil.ntoc( A14114PedCant, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCANTEN", GXutil.ltrim( localUtil.ntoc( A14115PedCantEn, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDVALSIND", GXutil.ltrim( localUtil.ntoc( A14203PedValsinD, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOPRECIO", GXutil.ltrim( localUtil.ntoc( AV60Noprecio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIPRECIO", GXutil.ltrim( localUtil.ntoc( AV80SiPrecio, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANPEN", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPEDENT", GXutil.ltrim( localUtil.ntoc( AV62OldPedEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPEDUNI", GXutil.ltrim( localUtil.ntoc( AV24OldPedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPEDCUM", GXutil.rtrim( AV25OldPedCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_I", AV81Texto_i);
      app.GxWebStd.gx_hidden_field( httpContext, "vSICANTIDADENTREGADA", GXutil.ltrim( localUtil.ntoc( AV79SiCantidadentregada, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGEXI", GXutil.ltrim( localUtil.ntoc( AV46FlagExi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV10UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV8Station));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDFULENT", localUtil.dtoc( A663PedFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMCOP", GXutil.ltrim( localUtil.ntoc( A3372PedNumCoP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCONINP", GXutil.ltrim( localUtil.ntoc( A3373PedConInP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCONFIP", GXutil.ltrim( localUtil.ntoc( A3374PedConFiP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMCOE", GXutil.ltrim( localUtil.ntoc( A3375PedNumCoE, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCONINE", GXutil.ltrim( localUtil.ntoc( A3376PedConInE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDCONFIE", GXutil.ltrim( localUtil.ntoc( A3377PedConFiE, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDETIPRD", GXutil.ltrim( localUtil.ntoc( A3378PedEtiPrd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PEDNUMRQ", GXutil.ltrim( localUtil.ntoc( A6289PedNumRq, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Objectcall", GXutil.rtrim( Dvpanel_datosproveedor_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Enabled", GXutil.booltostr( Dvpanel_datosproveedor_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Width", GXutil.rtrim( Dvpanel_datosproveedor_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Autowidth", GXutil.booltostr( Dvpanel_datosproveedor_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Autoheight", GXutil.booltostr( Dvpanel_datosproveedor_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Cls", GXutil.rtrim( Dvpanel_datosproveedor_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Title", GXutil.rtrim( Dvpanel_datosproveedor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Collapsible", GXutil.booltostr( Dvpanel_datosproveedor_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Collapsed", GXutil.booltostr( Dvpanel_datosproveedor_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Showcollapseicon", GXutil.booltostr( Dvpanel_datosproveedor_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Iconposition", GXutil.rtrim( Dvpanel_datosproveedor_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DATOSPROVEEDOR_Autoscroll", GXutil.booltostr( Dvpanel_datosproveedor_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitemtext", GXutil.rtrim( Combo_prdnum_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_level1_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_level1_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LEVEL1_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_level1_titlescategories_Gridtitlescategories));
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
      return formatLink("app.tpedido_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13PedCod,8,0))}, new String[] {"Gx_mode","EmprCod","PedCod"})  ;
   }

   public String getPgmname( )
   {
      return "TPEDIDO_Trn" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Orden de compra de Quimicos", "") ;
   }

   public void initializeNonKey1TN76( )
   {
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      AV26OldPedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26OldPedFec", localUtil.format(AV26OldPedFec, "99/99/99"));
      A8157PedTotGen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8157PedTotGen", GXutil.ltrimstr( A8157PedTotGen, 12, 2));
      A8156PedImpDPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8156PedImpDPP", GXutil.ltrimstr( A8156PedImpDPP, 8, 2));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A803PrvTlf = "" ;
      n803PrvTlf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", A803PrvTlf);
      A786PrvDir = "" ;
      n786PrvDir = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", A786PrvDir);
      A799PrvPob = "" ;
      n799PrvPob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", A799PrvPob);
      A661PedFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      A662PedFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A662PedFecEnt", localUtil.format(A662PedFecEnt, "99/99/99"));
      A667PedSit = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A667PedSit", A667PedSit);
      A666PedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A666PedPri", A666PedPri);
      A664PedNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      A3143PrvDivCo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3143PrvDivCo), 2, 0));
      A3144PrvDivAbr = "" ;
      n3144PrvDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", A3144PrvDivAbr);
      A3114PedCDivAbr = "" ;
      n3114PedCDivAbr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3114PedCDivAbr", A3114PedCDivAbr);
      A3314PrvCar = "" ;
      n3314PrvCar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", A3314PrvCar);
      A804PrvTlx = "" ;
      n804PrvTlx = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", A804PrvTlx);
      A6160PedCodExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6160PedCodExt", A6160PedCodExt);
      A6712PedEnv = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6712PedEnv", GXutil.str( A6712PedEnv, 1, 0));
      A8153PedPrvDPP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8153PedPrvDPP", GXutil.ltrimstr( A8153PedPrvDPP, 6, 2));
      A8154PedPerDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8154PedPerDes", A8154PedPerDes);
      A8155PedPerPet = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8155PedPerPet", A8155PedPerPet);
      A668PedTot = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      A12580PedAlmc = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12580PedAlmc", GXutil.str( A12580PedAlmc, 1, 0));
      A14114PedCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      A14115PedCantEn = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      A14202PedTotsind = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      A3113PedCDivCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3113PedCDivCod), 2, 0));
      O14202PedTotsind = A14202PedTotsind ;
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrimstr( A14202PedTotsind, 12, 2));
      O668PedTot = A668PedTot ;
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrimstr( A668PedTot, 12, 2));
      O14115PedCantEn = A14115PedCantEn ;
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrimstr( A14115PedCantEn, 9, 2));
      O14114PedCant = A14114PedCant ;
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrimstr( A14114PedCant, 9, 2));
      O661PedFec = A661PedFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A661PedFec", localUtil.format(A661PedFec, "99/99/99"));
      Z661PedFec = GXutil.nullDate() ;
      Z662PedFecEnt = GXutil.nullDate() ;
      Z667PedSit = "" ;
      Z666PedPri = "" ;
      Z6160PedCodExt = "" ;
      Z6712PedEnv = (byte)(0) ;
      Z8153PedPrvDPP = DecimalUtil.ZERO ;
      Z8154PedPerDes = "" ;
      Z8155PedPerPet = "" ;
      Z12580PedAlmc = (byte)(0) ;
      Z795PrvNum = 0 ;
      Z3113PedCDivCod = (byte)(0) ;
   }

   public void initAll1TN76( )
   {
      A658PedCod = 0 ;
      n658PedCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      initializeNonKey1TN76( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TN77( )
   {
      AV46FlagExi = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExi", GXutil.str( AV46FlagExi, 1, 0));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A670PedVal = DecimalUtil.ZERO ;
      AV62OldPedEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldPedEnt", GXutil.ltrimstr( AV62OldPedEnt, 9, 2));
      AV24OldPedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24OldPedUni", GXutil.ltrimstr( AV24OldPedUni, 9, 2));
      AV25OldPedCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
      AV81Texto_i = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Texto_i", AV81Texto_i);
      A13787PedValForm = DecimalUtil.ZERO ;
      A13833CantPdte = DecimalUtil.ZERO ;
      A14203PedValsinD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14203PedValsinD", GXutil.ltrimstr( A14203PedValsinD, 12, 2));
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A663PedFulEnt", localUtil.format(A663PedFulEnt, "99/99/99"));
      A3372PedNumCoP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3372PedNumCoP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3372PedNumCoP), 3, 0));
      A3373PedConInP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3373PedConInP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3373PedConInP), 8, 0));
      A3374PedConFiP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3374PedConFiP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3374PedConFiP), 8, 0));
      A3375PedNumCoE = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3375PedNumCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3375PedNumCoE), 3, 0));
      A3376PedConInE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3376PedConInE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3376PedConInE), 8, 0));
      A3377PedConFiE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3377PedConFiE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3377PedConFiE), 8, 0));
      A3378PedEtiPrd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3378PedEtiPrd", GXutil.str( A3378PedEtiPrd, 1, 0));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A6289PedNumRq = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6289PedNumRq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6289PedNumRq), 8, 0));
      A8158PedFecPEn = GXutil.nullDate() ;
      A8159PedLinObs = "" ;
      A659PedCum = httpContext.getMessage( "N", "") ;
      A665PedPre = new app.comprasquimicos.precioproveedor(remoteHandle, context).executeUdp( A396EmprCod, A719PrdNum, A795PrvNum) ;
      O659PedCum = A659PedCum ;
      O669PedUni = A669PedUni ;
      O657PedCanEnt = A657PedCanEnt ;
      O684PrdCanPen = A684PrdCanPen ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      O14203PedValsinD = A14203PedValsinD ;
      httpContext.ajax_rsp_assign_attri("", false, "A14203PedValsinD", GXutil.ltrimstr( A14203PedValsinD, 12, 2));
      O670PedVal = A670PedVal ;
      O665PedPre = A665PedPre ;
      Z659PedCum = "" ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z670PedVal = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      Z660PedDto = DecimalUtil.ZERO ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z3372PedNumCoP = (short)(0) ;
      Z3373PedConInP = 0 ;
      Z3374PedConFiP = 0 ;
      Z3375PedNumCoE = (short)(0) ;
      Z3376PedConInE = 0 ;
      Z3377PedConFiE = 0 ;
      Z3378PedEtiPrd = (byte)(0) ;
      Z6289PedNumRq = 0 ;
      Z8158PedFecPEn = GXutil.nullDate() ;
      Z8159PedLinObs = "" ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
   }

   public void initAll1TN77( )
   {
      A719PrdNum = "" ;
      initializeNonKey1TN77( ) ;
   }

   public void standaloneModalInsert1TN77( )
   {
      A659PedCum = i659PedCum ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102577", true, true);
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
      httpContext.AddJavascriptSource("tpedido_trn.js", "?202682116102578", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties77( )
   {
      edtPedValForm_Enabled = defedtPedValForm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedValForm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedValForm_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedVal_Enabled = defedtPedVal_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedVal_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedPre_Enabled = defedtPedPre_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedPre_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPedCanEnt_Enabled = defedtPedCanEnt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCanEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCanEnt_Enabled), 5, 0), !bGXsfl_96_Refreshing);
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_96_Refreshing);
   }

   public void startgridcontrol96( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedCanEnt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCantPdte_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A660PedDto, (byte)(5), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A670PedVal, (byte)(14), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13787PedValForm, (byte)(12), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedValForm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A659PedCum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbPedCum.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.format(A8158PedFecPEn, "99/99/99"));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedFecPEn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A8159PedLinObs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPedLinObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPedCod_Internalname = "PEDCOD" ;
      edtPedFec_Internalname = "PEDFEC" ;
      edtPedFecEnt_Internalname = "PEDFECENT" ;
      edtPedPrvDPP_Internalname = "PEDPRVDPP" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtPrvDir_Internalname = "PRVDIR" ;
      edtPrvPob_Internalname = "PRVPOB" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtPrvTlf_Internalname = "PRVTLF" ;
      edtPrvTlx_Internalname = "PRVTLX" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtPedPerDes_Internalname = "PEDPERDES" ;
      edtPedPerPet_Internalname = "PEDPERPET" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divDatosproveedor_Internalname = "DATOSPROVEEDOR" ;
      Dvpanel_datosproveedor_Internalname = "DVPANEL_DATOSPROVEEDOR" ;
      divDvpanel_datosproveedor_cell_Internalname = "DVPANEL_DATOSPROVEEDOR_CELL" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPedUni_Internalname = "PEDUNI" ;
      edtPedCanEnt_Internalname = "PEDCANENT" ;
      edtCantPdte_Internalname = "CANTPDTE" ;
      edtPedPre_Internalname = "PEDPRE" ;
      edtPedDto_Internalname = "PEDDTO" ;
      edtPedVal_Internalname = "PEDVAL" ;
      edtPedValForm_Internalname = "PEDVALFORM" ;
      cmbPedCum.setInternalname( "PEDCUM" );
      edtPedFecPEn_Internalname = "PEDFECPEN" ;
      edtPedLinObs_Internalname = "PEDLINOBS" ;
      lblTotal1_Internalname = "TOTAL1" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTotal2_Internalname = "TOTAL2" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtPedTot_Internalname = "PEDTOT" ;
      edtPedTotsind_Internalname = "PEDTOTSIND" ;
      edtavPrvnum_Internalname = "vPRVNUM" ;
      Gridlevel_level1_titlescategories_Internalname = "GRIDLEVEL_LEVEL1_TITLESCATEGORIES" ;
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
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Orden de compra de Quimicos", "") );
      edtPedLinObs_Jsonclick = "" ;
      edtPedFecPEn_Jsonclick = "" ;
      cmbPedCum.setJsonclick( "" );
      edtPedValForm_Jsonclick = "" ;
      edtPedVal_Jsonclick = "" ;
      edtPedDto_Jsonclick = "" ;
      edtPedPre_Jsonclick = "" ;
      edtCantPdte_Jsonclick = "" ;
      edtPedCanEnt_Jsonclick = "" ;
      edtPedUni_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      edtPedLinObs_Enabled = 1 ;
      edtPedFecPEn_Enabled = 1 ;
      cmbPedCum.setEnabled( 1 );
      edtPedValForm_Enabled = 0 ;
      edtPedVal_Enabled = 0 ;
      edtPedDto_Enabled = 1 ;
      edtPedPre_Enabled = 1 ;
      edtCantPdte_Enabled = 0 ;
      edtPedCanEnt_Enabled = 1 ;
      edtPedUni_Enabled = 1 ;
      edtPrdNum_Enabled = 1 ;
      Gridlevel_level1_titlescategories_Gridtitlescategories = ";;Cantidad;Cantidad;Cantidad;;;;;;;" ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Enabled = 0 ;
      edtavPrvnum_Visible = 1 ;
      edtPedTotsind_Jsonclick = "" ;
      edtPedTotsind_Enabled = 0 ;
      edtPedTotsind_Visible = 1 ;
      edtPedTot_Jsonclick = "" ;
      edtPedTot_Enabled = 0 ;
      edtPedTot_Visible = 1 ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      Combo_prdnum_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPedPerPet_Jsonclick = "" ;
      edtPedPerPet_Enabled = 1 ;
      edtPedPerDes_Jsonclick = "" ;
      edtPedPerDes_Enabled = 1 ;
      divUnnamedtable9_Visible = 1 ;
      edtPrvTlx_Jsonclick = "" ;
      edtPrvTlx_Enabled = 0 ;
      edtPrvTlf_Jsonclick = "" ;
      edtPrvTlf_Enabled = 0 ;
      edtPrvPob_Jsonclick = "" ;
      edtPrvPob_Enabled = 0 ;
      edtPrvDir_Jsonclick = "" ;
      edtPrvDir_Enabled = 0 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 0 ;
      Dvpanel_datosproveedor_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_datosproveedor_Iconposition = "Right" ;
      Dvpanel_datosproveedor_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_datosproveedor_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_datosproveedor_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_datosproveedor_Title = httpContext.getMessage( "Datos Proveedor", "") ;
      Dvpanel_datosproveedor_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_datosproveedor_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_datosproveedor_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_datosproveedor_Width = "100%" ;
      divDvpanel_datosproveedor_cell_Class = "col-xs-12" ;
      edtPedPrvDPP_Jsonclick = "" ;
      edtPedPrvDPP_Enabled = 1 ;
      edtPedFecEnt_Jsonclick = "" ;
      edtPedFecEnt_Enabled = 1 ;
      edtPedFec_Jsonclick = "" ;
      edtPedFec_Enabled = 1 ;
      edtPedCod_Jsonclick = "" ;
      edtPedCod_Enabled = 1 ;
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

   public void gx15asapednumlin1TN76( String A396EmprCod ,
                                      int A658PedCod )
   {
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx33asapednumlin1TN77( String A396EmprCod ,
                                      int A658PedCod )
   {
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A664PedNumLin), 3, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx37asapedpre1TN77( byte Gx_BScreen ,
                                   String Gx_mode ,
                                   String A396EmprCod ,
                                   String A719PrdNum ,
                                   int A795PrvNum )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A665PedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         GXt_decimal13 = A665PedPre ;
         GXv_decimal14[0] = GXt_decimal13 ;
         new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_decimal14) ;
         tpedido_trn_impl.this.GXt_decimal13 = GXv_decimal14[0] ;
         A665PedPre = GXt_decimal13 ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_52_1TN77( String Gx_mode ,
                            String A396EmprCod ,
                            String A719PrdNum ,
                            int A795PrvNum ,
                            byte AV46FlagExi )
   {
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int2[0] = A795PrvNum ;
         GXv_int7[0] = AV46FlagExi ;
         new app.pexiprd(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_int2, GXv_int7) ;
         A396EmprCod = GXv_char5[0] ;
         A719PrdNum = GXv_char3[0] ;
         A795PrvNum = GXv_int2[0] ;
         AV46FlagExi = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExi", GXutil.str( AV46FlagExi, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV46FlagExi, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_54_1TN77( String A396EmprCod ,
                            int A658PedCod ,
                            String A719PrdNum ,
                            String AV25OldPedCum )
   {
      if ( true /* After */ && true /* Level */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A658PedCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_char1[0] = AV25OldPedCum ;
         new app.pclospe1(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char3, GXv_char1) ;
         A396EmprCod = GXv_char5[0] ;
         A658PedCod = GXv_int2[0] ;
         A719PrdNum = GXv_char3[0] ;
         AV25OldPedCum = GXv_char1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", AV25OldPedCum);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV25OldPedCum))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_57_1TN77( String A396EmprCod ,
                            int A658PedCod ,
                            String A719PrdNum ,
                            java.math.BigDecimal A657PedCanEnt )
   {
      if ( true /* After */ && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_int2[0] = A658PedCod ;
         GXv_char3[0] = A719PrdNum ;
         new app.pelilpe(remoteHandle, context).execute( GXv_char5, GXv_int2, GXv_char3) ;
         A396EmprCod = GXv_char5[0] ;
         A658PedCod = GXv_int2[0] ;
         A719PrdNum = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A658PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A658PedCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_58_1TN77( String A396EmprCod ,
                            String AV84Pgmname ,
                            String AV10UsurCod ,
                            String AV8Station ,
                            String AV81Texto_i ,
                            int A658PedCod )
   {
      if ( true /* After */ || true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV84Pgmname, AV10UsurCod, AV8Station, AV81Texto_i, A658PedCod, (byte)(0), " ") ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_9677( ) ;
      while ( nGXsfl_96_idx <= nRC_GXsfl_96 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TN77( ) ;
         standaloneModal1TN77( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TN77( ) ;
         nGXsfl_96_idx = (int)(nGXsfl_96_idx+1) ;
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_96_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_9677( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "PEDCUM_" + sGXsfl_96_idx ;
      cmbPedCum.setName( GXCCtl );
      cmbPedCum.setWebtags( "" );
      cmbPedCum.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPedCum.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPedCum.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A659PedCum)==0) )
         {
            A659PedCum = httpContext.getMessage( "N", "") ;
         }
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

   public void valid_Pedcod( )
   {
      n658PedCod = false ;
      /* Using cursor T01TN31 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n658PedCod), Integer.valueOf(A658PedCod)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A668PedTot = T01TN31_A668PedTot[0] ;
         A14114PedCant = T01TN31_A14114PedCant[0] ;
         A14115PedCantEn = T01TN31_A14115PedCantEn[0] ;
         A14202PedTotsind = T01TN31_A14202PedTotsind[0] ;
      }
      else
      {
         A668PedTot = DecimalUtil.doubleToDec(0) ;
         A14114PedCant = DecimalUtil.doubleToDec(0) ;
         A14115PedCantEn = DecimalUtil.doubleToDec(0) ;
         A14202PedTotsind = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(25);
      A664PedNumLin = (short)(getPedNumLin0( A396EmprCod, A658PedCod)) ;
      if ( isIns( )  && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido inexistente", ""), 1, "PEDCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A668PedTot", GXutil.ltrim( localUtil.ntoc( A668PedTot, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14114PedCant", GXutil.ltrim( localUtil.ntoc( A14114PedCant, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14115PedCantEn", GXutil.ltrim( localUtil.ntoc( A14115PedCantEn, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14202PedTotsind", GXutil.ltrim( localUtil.ntoc( A14202PedTotsind, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A664PedNumLin", GXutil.ltrim( localUtil.ntoc( A664PedNumLin, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Pedfec( )
   {
      AV26OldPedFec = O661PedFec ;
      if ( true /* Level */ && GXutil.resetTime(A661PedFec).after( GXutil.resetTime( GXutil.today( ) )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Fecha Pedido Incorrecta", ""), 1, "PEDFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFec_Internalname ;
      }
      if ( true /* Level */ && GXutil.resetTime(A661PedFec).before( GXutil.resetTime( GXutil.today( ) )) && true /* After */ && !( GXutil.dateCompare(GXutil.resetTime(A661PedFec), GXutil.resetTime(AV26OldPedFec)) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Fecha Pedido Incorrecta", ""), 1, "PEDFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFec_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV26OldPedFec", localUtil.format(AV26OldPedFec, "99/99/99"));
   }

   public void valid_Pedfecent( )
   {
      if ( true /* Level */ && GXutil.resetTime(A661PedFec).after( GXutil.resetTime( A662PedFecEnt )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR. Fecha Entrega Incorrecta", ""), 1, "PEDFECENT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPedFecEnt_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Prvnum( )
   {
      n794PrvNom = false ;
      n803PrvTlf = false ;
      n786PrvDir = false ;
      n799PrvPob = false ;
      n3314PrvCar = false ;
      n804PrvTlx = false ;
      n3144PrvDivAbr = false ;
      n3114PedCDivAbr = false ;
      /* Using cursor T01TN28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
      }
      A794PrvNom = T01TN28_A794PrvNom[0] ;
      n794PrvNom = T01TN28_n794PrvNom[0] ;
      A803PrvTlf = T01TN28_A803PrvTlf[0] ;
      n803PrvTlf = T01TN28_n803PrvTlf[0] ;
      A786PrvDir = T01TN28_A786PrvDir[0] ;
      n786PrvDir = T01TN28_n786PrvDir[0] ;
      A799PrvPob = T01TN28_A799PrvPob[0] ;
      n799PrvPob = T01TN28_n799PrvPob[0] ;
      A3314PrvCar = T01TN28_A3314PrvCar[0] ;
      n3314PrvCar = T01TN28_n3314PrvCar[0] ;
      A804PrvTlx = T01TN28_A804PrvTlx[0] ;
      n804PrvTlx = T01TN28_n804PrvTlx[0] ;
      A3143PrvDivCo = T01TN28_A3143PrvDivCo[0] ;
      pr_default.close(23);
      /* Using cursor T01TN29 */
      pr_default.execute(24, new Object[] {Byte.valueOf(A3143PrvDivCo)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PrvDiv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVDIVCO");
         AnyError = (short)(1) ;
      }
      A3144PrvDivAbr = T01TN29_A3144PrvDivAbr[0] ;
      n3144PrvDivAbr = T01TN29_n3144PrvDivAbr[0] ;
      pr_default.close(24);
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_PedCDivCod) )
      {
         A3113PedCDivCod = AV18Insert_PedCDivCod ;
      }
      else
      {
         if ( isIns( )  && (0==A3113PedCDivCod) && ( Gx_BScreen == 0 ) )
         {
            A3113PedCDivCod = A3143PrvDivCo ;
         }
      }
      /* Using cursor T01TN27 */
      pr_default.execute(22, new Object[] {Byte.valueOf(A3113PedCDivCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DivPeC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PEDCDIVCOD");
         AnyError = (short)(1) ;
      }
      A3114PedCDivAbr = T01TN27_A3114PedCDivAbr[0] ;
      n3114PedCDivAbr = T01TN27_n3114PedCDivAbr[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A803PrvTlf", GXutil.rtrim( A803PrvTlf));
      httpContext.ajax_rsp_assign_attri("", false, "A786PrvDir", GXutil.rtrim( A786PrvDir));
      httpContext.ajax_rsp_assign_attri("", false, "A799PrvPob", GXutil.rtrim( A799PrvPob));
      httpContext.ajax_rsp_assign_attri("", false, "A3314PrvCar", GXutil.rtrim( A3314PrvCar));
      httpContext.ajax_rsp_assign_attri("", false, "A804PrvTlx", GXutil.rtrim( A804PrvTlx));
      httpContext.ajax_rsp_assign_attri("", false, "A3143PrvDivCo", GXutil.ltrim( localUtil.ntoc( A3143PrvDivCo, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3144PrvDivAbr", GXutil.rtrim( A3144PrvDivAbr));
      httpContext.ajax_rsp_assign_attri("", false, "A3113PedCDivCod", GXutil.ltrim( localUtil.ntoc( A3113PedCDivCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3114PedCDivAbr", GXutil.rtrim( A3114PedCDivAbr));
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01TN42 */
      pr_default.execute(36, new Object[] {A396EmprCod, A719PrdNum});
      Z718PrdNom = T01TN42_A718PrdNom[0] ;
      Z724PrdPreAct = T01TN42_A724PrdPreAct[0] ;
      if ( (pr_default.getStatus(36) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A684PrdCanPen = T01TN42_A684PrdCanPen[0] ;
      A718PrdNom = T01TN42_A718PrdNom[0] ;
      A724PrdPreAct = T01TN42_A724PrdPreAct[0] ;
      O684PrdCanPen = A684PrdCanPen ;
      pr_default.close(36);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A665PedPre)==0) && ( Gx_BScreen == 0 ) )
      {
         GXt_decimal13 = A665PedPre ;
         GXv_decimal14[0] = GXt_decimal13 ;
         new app.comprasquimicos.precioproveedor(remoteHandle, context).execute( A396EmprCod, A719PrdNum, A795PrvNum, GXv_decimal14) ;
         tpedido_trn_impl.this.GXt_decimal13 = GXv_decimal14[0] ;
         A665PedPre = GXt_decimal13 ;
      }
      if ( true /* Level */ && true /* After */ )
      {
         AV25OldPedCum = O659PedCum ;
      }
      if ( true /* Level */ && isIns( )  && true /* After */ )
      {
         GXv_char5[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int2[0] = A795PrvNum ;
         GXv_int7[0] = AV46FlagExi ;
         new app.pexiprd(remoteHandle, context).execute( GXv_char5, GXv_char3, GXv_int2, GXv_int7) ;
         tpedido_trn_impl.this.A396EmprCod = GXv_char5[0] ;
         A396EmprCod = this.A396EmprCod ;
         tpedido_trn_impl.this.A719PrdNum = GXv_char3[0] ;
         A719PrdNum = this.A719PrdNum ;
         tpedido_trn_impl.this.A795PrvNum = GXv_int2[0] ;
         A795PrvNum = this.A795PrvNum ;
         tpedido_trn_impl.this.AV46FlagExi = GXv_int7[0] ;
         AV46FlagExi = this.AV46FlagExi ;
      }
      if ( true /* Level */ && isIns( )  && true /* After */ && ( AV46FlagExi == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "ERROR.Proveedor Diferente", ""), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O684PrdCanPen", GXutil.ltrim( localUtil.ntoc( O684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A665PedPre", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV25OldPedCum", GXutil.rtrim( AV25OldPedCum));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV46FlagExi", GXutil.ltrim( localUtil.ntoc( AV46FlagExi, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Peduni( )
   {
      if ( isDlt( )  )
      {
         A684PrdCanPen = O684PrdCanPen.subtract(O669PedUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A684PrdCanPen = O684PrdCanPen.add(A669PedUni).subtract(O669PedUni) ;
         }
      }
      AV24OldPedUni = O669PedUni ;
      if ( true /* Level */ && true /* After */ && ( DecimalUtil.compareTo(A669PedUni, A657PedCanEnt) < 0 ) && ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A657PedCanEnt)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Cantidad Pedida menor a Cantidad Entregada", ""), 0, "PEDUNI");
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24OldPedUni", GXutil.ltrim( localUtil.ntoc( AV24OldPedUni, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Pedcanent( )
   {
      A13833CantPdte = (A669PedUni.subtract(A657PedCanEnt)) ;
      AV62OldPedEnt = O657PedCanEnt ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13833CantPdte", GXutil.ltrim( localUtil.ntoc( A13833CantPdte, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV62OldPedEnt", GXutil.ltrim( localUtil.ntoc( AV62OldPedEnt, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV84Pgmname',fld:'vPGMNAME',pic:''},{av:'A667PedSit',fld:'PEDSIT',pic:'@!'},{av:'A666PedPri',fld:'PEDPRI',pic:'9'},{av:'A6160PedCodExt',fld:'PEDCODEXT',pic:''},{av:'A6712PedEnv',fld:'PEDENV',pic:'9'},{av:'A12580PedAlmc',fld:'PEDALMC',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TN2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PEDCOD","{handler:'valid_Pedcod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A658PedCod',fld:'PEDCOD',pic:'ZZZZZZZ9'},{av:'A668PedTot',fld:'PEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'A14114PedCant',fld:'PEDCANT',pic:'ZZZZZ9.99'},{av:'A14115PedCantEn',fld:'PEDCANTEN',pic:'ZZZZZ9.99'},{av:'A14202PedTotsind',fld:'PEDTOTSIND',pic:'ZZZZZZZZ9.99'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]");
      setEventMetadata("VALID_PEDCOD",",oparms:[{av:'A668PedTot',fld:'PEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'A14114PedCant',fld:'PEDCANT',pic:'ZZZZZ9.99'},{av:'A14115PedCantEn',fld:'PEDCANTEN',pic:'ZZZZZ9.99'},{av:'A14202PedTotsind',fld:'PEDTOTSIND',pic:'ZZZZZZZZ9.99'},{av:'A664PedNumLin',fld:'PEDNUMLIN',pic:'ZZ9'}]}");
      setEventMetadata("VALID_PEDFEC","{handler:'valid_Pedfec',iparms:[{av:'O661PedFec'},{av:'A661PedFec',fld:'PEDFEC',pic:''},{av:'AV26OldPedFec',fld:'vOLDPEDFEC',pic:''}]");
      setEventMetadata("VALID_PEDFEC",",oparms:[{av:'AV26OldPedFec',fld:'vOLDPEDFEC',pic:''}]}");
      setEventMetadata("VALID_PEDFECENT","{handler:'valid_Pedfecent',iparms:[{av:'A662PedFecEnt',fld:'PEDFECENT',pic:''}]");
      setEventMetadata("VALID_PEDFECENT",",oparms:[]}");
      setEventMetadata("VALID_PEDPRVDPP","{handler:'valid_Pedprvdpp',iparms:[]");
      setEventMetadata("VALID_PEDPRVDPP",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'AV18Insert_PedCDivCod',fld:'vINSERT_PEDCDIVCOD',pic:'Z9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A3113PedCDivCod',fld:'PEDCDIVCOD',pic:'Z9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A803PrvTlf',fld:'PRVTLF',pic:''},{av:'A786PrvDir',fld:'PRVDIR',pic:''},{av:'A799PrvPob',fld:'PRVPOB',pic:''},{av:'A3314PrvCar',fld:'PRVCAR',pic:''},{av:'A804PrvTlx',fld:'PRVTLX',pic:''},{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'A3114PedCDivAbr',fld:'PEDCDIVABR',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A803PrvTlf',fld:'PRVTLF',pic:''},{av:'A786PrvDir',fld:'PRVDIR',pic:''},{av:'A799PrvPob',fld:'PRVPOB',pic:''},{av:'A3314PrvCar',fld:'PRVCAR',pic:''},{av:'A804PrvTlx',fld:'PRVTLX',pic:''},{av:'A3143PrvDivCo',fld:'PRVDIVCO',pic:'Z9'},{av:'A3144PrvDivAbr',fld:'PRVDIVABR',pic:''},{av:'A3113PedCDivCod',fld:'PEDCDIVCOD',pic:'Z9'},{av:'A3114PedCDivAbr',fld:'PEDCDIVABR',pic:''}]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_PEDTOT","{handler:'valid_Pedtot',iparms:[]");
      setEventMetadata("VALID_PEDTOT",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O659PedCum'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV25OldPedCum',fld:'vOLDPEDCUM',pic:'@!'},{av:'AV46FlagExi',fld:'vFLAGEXI',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'O684PrdCanPen'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV25OldPedCum',fld:'vOLDPEDCUM',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV46FlagExi',fld:'vFLAGEXI',pic:'9'}]}");
      setEventMetadata("VALID_PEDUNI","{handler:'valid_Peduni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O684PrdCanPen'},{av:'O669PedUni'},{av:'O14114PedCant'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV24OldPedUni',fld:'vOLDPEDUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_PEDUNI",",oparms:[{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV24OldPedUni',fld:'vOLDPEDUNI',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_PEDCANENT","{handler:'valid_Pedcanent',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O657PedCanEnt'},{av:'O14115PedCantEn'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99'},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99'},{av:'A13833CantPdte',fld:'CANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV62OldPedEnt',fld:'vOLDPEDENT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_PEDCANENT",",oparms:[{av:'A13833CantPdte',fld:'CANTPDTE',pic:'ZZZZZZZZ9.99'},{av:'AV62OldPedEnt',fld:'vOLDPEDENT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_PEDPRE","{handler:'valid_Pedpre',iparms:[]");
      setEventMetadata("VALID_PEDPRE",",oparms:[]}");
      setEventMetadata("VALID_PEDDTO","{handler:'valid_Peddto',iparms:[]");
      setEventMetadata("VALID_PEDDTO",",oparms:[]}");
      setEventMetadata("VALID_PEDVAL","{handler:'valid_Pedval',iparms:[]");
      setEventMetadata("VALID_PEDVAL",",oparms:[]}");
      setEventMetadata("VALID_PEDVALFORM","{handler:'valid_Pedvalform',iparms:[]");
      setEventMetadata("VALID_PEDVALFORM",",oparms:[]}");
      setEventMetadata("VALID_PEDCUM","{handler:'valid_Pedcum',iparms:[]");
      setEventMetadata("VALID_PEDCUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pedlinobs',iparms:[]");
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
      pr_default.close(36);
      pr_default.close(23);
      pr_default.close(22);
      pr_default.close(24);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public int getPedNumLin0( String E396EmprCod ,
                             int E658PedCod )
   {
      Gx_cnt = 0 ;
      Gx_first = true ;
      /* Using cursor T01TN47 */
      pr_default.execute(41, new Object[] {E396EmprCod, Boolean.valueOf(nA658PedCod), Integer.valueOf(E658PedCod)});
      while ( (pr_default.getStatus(41) != 101) )
      {
         if ( ( ( GXutil.strcmp(T01TN47_A659PedCum[0], httpContext.getMessage( httpContext.getMessage( "N", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( E658PedCod == E658PedCod ) ) )
         {
            if ( Gx_first )
            {
               Gx_cnt = 1 ;
               Gx_first = false ;
            }
            else
            {
               Gx_cnt = (int)(Gx_cnt+1) ;
            }
         }
         pr_default.readNext(41);
      }
      pr_default.close(41);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV12EmprCod = "" ;
      Z396EmprCod = "" ;
      Z661PedFec = GXutil.nullDate() ;
      Z662PedFecEnt = GXutil.nullDate() ;
      Z667PedSit = "" ;
      Z666PedPri = "" ;
      Z6160PedCodExt = "" ;
      Z8153PedPrvDPP = DecimalUtil.ZERO ;
      Z8154PedPerDes = "" ;
      Z8155PedPerPet = "" ;
      O14202PedTotsind = DecimalUtil.ZERO ;
      O668PedTot = DecimalUtil.ZERO ;
      O14115PedCantEn = DecimalUtil.ZERO ;
      O14114PedCant = DecimalUtil.ZERO ;
      O661PedFec = GXutil.nullDate() ;
      Z719PrdNum = "" ;
      Z659PedCum = "" ;
      Z665PedPre = DecimalUtil.ZERO ;
      Z670PedVal = DecimalUtil.ZERO ;
      Z669PedUni = DecimalUtil.ZERO ;
      Z657PedCanEnt = DecimalUtil.ZERO ;
      Z660PedDto = DecimalUtil.ZERO ;
      Z663PedFulEnt = GXutil.nullDate() ;
      Z8158PedFecPEn = GXutil.nullDate() ;
      Z8159PedLinObs = "" ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      O659PedCum = "" ;
      O669PedUni = DecimalUtil.ZERO ;
      O657PedCanEnt = DecimalUtil.ZERO ;
      O684PrdCanPen = DecimalUtil.ZERO ;
      O14203PedValsinD = DecimalUtil.ZERO ;
      O670PedVal = DecimalUtil.ZERO ;
      O665PedPre = DecimalUtil.ZERO ;
      N657PedCanEnt = DecimalUtil.ZERO ;
      N665PedPre = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV25OldPedCum = "" ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      AV84Pgmname = "" ;
      AV10UsurCod = "" ;
      AV8Station = "" ;
      AV81Texto_i = "" ;
      AV12EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A661PedFec = GXutil.nullDate() ;
      A662PedFecEnt = GXutil.nullDate() ;
      A8153PedPrvDPP = DecimalUtil.ZERO ;
      ucDvpanel_datosproveedor = new com.genexus.webpanels.GXUserControl();
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A8154PedPerDes = "" ;
      A8155PedPerPet = "" ;
      lblTotal1_Jsonclick = "" ;
      lblTotal2_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      AV22DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV21PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A668PedTot = DecimalUtil.ZERO ;
      A14202PedTotsind = DecimalUtil.ZERO ;
      ucGridlevel_level1_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      B14202PedTotsind = DecimalUtil.ZERO ;
      B668PedTot = DecimalUtil.ZERO ;
      B14115PedCantEn = DecimalUtil.ZERO ;
      A14115PedCantEn = DecimalUtil.ZERO ;
      B14114PedCant = DecimalUtil.ZERO ;
      A14114PedCant = DecimalUtil.ZERO ;
      B661PedFec = GXutil.nullDate() ;
      sMode77 = "" ;
      sStyleString = "" ;
      A667PedSit = "" ;
      A666PedPri = "" ;
      A6160PedCodExt = "" ;
      A8156PedImpDPP = DecimalUtil.ZERO ;
      A8157PedTotGen = DecimalUtil.ZERO ;
      AV26OldPedFec = GXutil.nullDate() ;
      A407EmprNom = "" ;
      A3314PrvCar = "" ;
      A3114PedCDivAbr = "" ;
      A3144PrvDivAbr = "" ;
      A14203PedValsinD = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV62OldPedEnt = DecimalUtil.ZERO ;
      AV24OldPedUni = DecimalUtil.ZERO ;
      A663PedFulEnt = GXutil.nullDate() ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      Dvpanel_datosproveedor_Objectcall = "" ;
      Dvpanel_datosproveedor_Class = "" ;
      Dvpanel_datosproveedor_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      Gridlevel_level1_titlescategories_Objectcall = "" ;
      Gridlevel_level1_titlescategories_Class = "" ;
      Gridlevel_level1_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode76 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s14202PedTotsind = DecimalUtil.ZERO ;
      s668PedTot = DecimalUtil.ZERO ;
      s14115PedCantEn = DecimalUtil.ZERO ;
      s14114PedCant = DecimalUtil.ZERO ;
      s8156PedImpDPP = DecimalUtil.ZERO ;
      O8156PedImpDPP = DecimalUtil.ZERO ;
      s8157PedTotGen = DecimalUtil.ZERO ;
      O8157PedTotGen = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A13833CantPdte = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      A660PedDto = DecimalUtil.ZERO ;
      A670PedVal = DecimalUtil.ZERO ;
      A13787PedValForm = DecimalUtil.ZERO ;
      A659PedCum = "" ;
      A8158PedFecPEn = GXutil.nullDate() ;
      A8159PedLinObs = "" ;
      T659PedCum = "" ;
      T669PedUni = DecimalUtil.ZERO ;
      T657PedCanEnt = DecimalUtil.ZERO ;
      T684PrdCanPen = DecimalUtil.ZERO ;
      T14203PedValsinD = DecimalUtil.ZERO ;
      T670PedVal = DecimalUtil.ZERO ;
      T665PedPre = DecimalUtil.ZERO ;
      AV7PedSit = "" ;
      AV57msg0 = "" ;
      AV58msg1 = "" ;
      AV59msg2 = "" ;
      AV9EmprNom = "" ;
      AV11ImpCod = "" ;
      AV75Puerto = "" ;
      Gx_out = "" ;
      GXt_char4 = "" ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16WebSession = httpContext.getWebSession();
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV23ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item12 = new GXBaseCollection[1] ;
      Z3114PedCDivAbr = "" ;
      Z407EmprNom = "" ;
      Z794PrvNom = "" ;
      Z803PrvTlf = "" ;
      Z786PrvDir = "" ;
      Z799PrvPob = "" ;
      Z3314PrvCar = "" ;
      Z804PrvTlx = "" ;
      Z3144PrvDivAbr = "" ;
      Z668PedTot = DecimalUtil.ZERO ;
      Z14114PedCant = DecimalUtil.ZERO ;
      Z14115PedCantEn = DecimalUtil.ZERO ;
      Z14202PedTotsind = DecimalUtil.ZERO ;
      T01TN8_A407EmprNom = new String[] {""} ;
      T01TN8_n407EmprNom = new boolean[] {false} ;
      T01TN8_A3915EmpNumDec = new byte[1] ;
      T01TN8_n3915EmpNumDec = new boolean[] {false} ;
      T01TN13_A668PedTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN13_A14114PedCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN13_A14115PedCantEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN13_A14202PedTotsind = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN9_A794PrvNom = new String[] {""} ;
      T01TN9_n794PrvNom = new boolean[] {false} ;
      T01TN9_A803PrvTlf = new String[] {""} ;
      T01TN9_n803PrvTlf = new boolean[] {false} ;
      T01TN9_A786PrvDir = new String[] {""} ;
      T01TN9_n786PrvDir = new boolean[] {false} ;
      T01TN9_A799PrvPob = new String[] {""} ;
      T01TN9_n799PrvPob = new boolean[] {false} ;
      T01TN9_A3314PrvCar = new String[] {""} ;
      T01TN9_n3314PrvCar = new boolean[] {false} ;
      T01TN9_A804PrvTlx = new String[] {""} ;
      T01TN9_n804PrvTlx = new boolean[] {false} ;
      T01TN9_A3143PrvDivCo = new byte[1] ;
      T01TN11_A3144PrvDivAbr = new String[] {""} ;
      T01TN11_n3144PrvDivAbr = new boolean[] {false} ;
      T01TN15_A658PedCod = new int[1] ;
      T01TN15_n658PedCod = new boolean[] {false} ;
      T01TN15_A794PrvNom = new String[] {""} ;
      T01TN15_n794PrvNom = new boolean[] {false} ;
      T01TN15_A803PrvTlf = new String[] {""} ;
      T01TN15_n803PrvTlf = new boolean[] {false} ;
      T01TN15_A786PrvDir = new String[] {""} ;
      T01TN15_n786PrvDir = new boolean[] {false} ;
      T01TN15_A799PrvPob = new String[] {""} ;
      T01TN15_n799PrvPob = new boolean[] {false} ;
      T01TN15_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN15_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN15_A667PedSit = new String[] {""} ;
      T01TN15_A666PedPri = new String[] {""} ;
      T01TN15_A407EmprNom = new String[] {""} ;
      T01TN15_n407EmprNom = new boolean[] {false} ;
      T01TN15_A3144PrvDivAbr = new String[] {""} ;
      T01TN15_n3144PrvDivAbr = new boolean[] {false} ;
      T01TN15_A3114PedCDivAbr = new String[] {""} ;
      T01TN15_n3114PedCDivAbr = new boolean[] {false} ;
      T01TN15_A3314PrvCar = new String[] {""} ;
      T01TN15_n3314PrvCar = new boolean[] {false} ;
      T01TN15_A3915EmpNumDec = new byte[1] ;
      T01TN15_n3915EmpNumDec = new boolean[] {false} ;
      T01TN15_A804PrvTlx = new String[] {""} ;
      T01TN15_n804PrvTlx = new boolean[] {false} ;
      T01TN15_A6160PedCodExt = new String[] {""} ;
      T01TN15_A6712PedEnv = new byte[1] ;
      T01TN15_A8153PedPrvDPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN15_A8154PedPerDes = new String[] {""} ;
      T01TN15_A8155PedPerPet = new String[] {""} ;
      T01TN15_A12580PedAlmc = new byte[1] ;
      T01TN15_A396EmprCod = new String[] {""} ;
      T01TN15_A795PrvNum = new int[1] ;
      T01TN15_A3113PedCDivCod = new byte[1] ;
      T01TN15_A3143PrvDivCo = new byte[1] ;
      T01TN15_A668PedTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN15_A14114PedCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN15_A14115PedCantEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN15_A14202PedTotsind = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN10_A3114PedCDivAbr = new String[] {""} ;
      T01TN10_n3114PedCDivAbr = new boolean[] {false} ;
      T01TN16_A794PrvNom = new String[] {""} ;
      T01TN16_n794PrvNom = new boolean[] {false} ;
      T01TN16_A803PrvTlf = new String[] {""} ;
      T01TN16_n803PrvTlf = new boolean[] {false} ;
      T01TN16_A786PrvDir = new String[] {""} ;
      T01TN16_n786PrvDir = new boolean[] {false} ;
      T01TN16_A799PrvPob = new String[] {""} ;
      T01TN16_n799PrvPob = new boolean[] {false} ;
      T01TN16_A3314PrvCar = new String[] {""} ;
      T01TN16_n3314PrvCar = new boolean[] {false} ;
      T01TN16_A804PrvTlx = new String[] {""} ;
      T01TN16_n804PrvTlx = new boolean[] {false} ;
      T01TN16_A3143PrvDivCo = new byte[1] ;
      T01TN17_A3144PrvDivAbr = new String[] {""} ;
      T01TN17_n3144PrvDivAbr = new boolean[] {false} ;
      T01TN18_A3114PedCDivAbr = new String[] {""} ;
      T01TN18_n3114PedCDivAbr = new boolean[] {false} ;
      T01TN20_A668PedTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN20_A14114PedCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN20_A14115PedCantEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN20_A14202PedTotsind = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN21_A396EmprCod = new String[] {""} ;
      T01TN21_A658PedCod = new int[1] ;
      T01TN21_n658PedCod = new boolean[] {false} ;
      T01TN7_A658PedCod = new int[1] ;
      T01TN7_n658PedCod = new boolean[] {false} ;
      T01TN7_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN7_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN7_A667PedSit = new String[] {""} ;
      T01TN7_A666PedPri = new String[] {""} ;
      T01TN7_A6160PedCodExt = new String[] {""} ;
      T01TN7_A6712PedEnv = new byte[1] ;
      T01TN7_A8153PedPrvDPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN7_A8154PedPerDes = new String[] {""} ;
      T01TN7_A8155PedPerPet = new String[] {""} ;
      T01TN7_A12580PedAlmc = new byte[1] ;
      T01TN7_A396EmprCod = new String[] {""} ;
      T01TN7_A795PrvNum = new int[1] ;
      T01TN7_A3113PedCDivCod = new byte[1] ;
      T01TN22_A396EmprCod = new String[] {""} ;
      T01TN22_A658PedCod = new int[1] ;
      T01TN22_n658PedCod = new boolean[] {false} ;
      T01TN23_A396EmprCod = new String[] {""} ;
      T01TN23_A658PedCod = new int[1] ;
      T01TN23_n658PedCod = new boolean[] {false} ;
      T01TN6_A658PedCod = new int[1] ;
      T01TN6_n658PedCod = new boolean[] {false} ;
      T01TN6_A661PedFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN6_A662PedFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN6_A667PedSit = new String[] {""} ;
      T01TN6_A666PedPri = new String[] {""} ;
      T01TN6_A6160PedCodExt = new String[] {""} ;
      T01TN6_A6712PedEnv = new byte[1] ;
      T01TN6_A8153PedPrvDPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN6_A8154PedPerDes = new String[] {""} ;
      T01TN6_A8155PedPerPet = new String[] {""} ;
      T01TN6_A12580PedAlmc = new byte[1] ;
      T01TN6_A396EmprCod = new String[] {""} ;
      T01TN6_A795PrvNum = new int[1] ;
      T01TN6_A3113PedCDivCod = new byte[1] ;
      T01TN27_A3114PedCDivAbr = new String[] {""} ;
      T01TN27_n3114PedCDivAbr = new boolean[] {false} ;
      T01TN28_A794PrvNom = new String[] {""} ;
      T01TN28_n794PrvNom = new boolean[] {false} ;
      T01TN28_A803PrvTlf = new String[] {""} ;
      T01TN28_n803PrvTlf = new boolean[] {false} ;
      T01TN28_A786PrvDir = new String[] {""} ;
      T01TN28_n786PrvDir = new boolean[] {false} ;
      T01TN28_A799PrvPob = new String[] {""} ;
      T01TN28_n799PrvPob = new boolean[] {false} ;
      T01TN28_A3314PrvCar = new String[] {""} ;
      T01TN28_n3314PrvCar = new boolean[] {false} ;
      T01TN28_A804PrvTlx = new String[] {""} ;
      T01TN28_n804PrvTlx = new boolean[] {false} ;
      T01TN28_A3143PrvDivCo = new byte[1] ;
      T01TN29_A3144PrvDivAbr = new String[] {""} ;
      T01TN29_n3144PrvDivAbr = new boolean[] {false} ;
      T01TN31_A668PedTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN31_A14114PedCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN31_A14115PedCantEn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN31_A14202PedTotsind = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN32_A396EmprCod = new String[] {""} ;
      T01TN32_A4850DevComCod = new int[1] ;
      T01TN33_A396EmprCod = new String[] {""} ;
      T01TN33_A658PedCod = new int[1] ;
      T01TN33_n658PedCod = new boolean[] {false} ;
      T01TN33_A2501PedObsLin = new byte[1] ;
      T01TN34_A396EmprCod = new String[] {""} ;
      T01TN34_A719PrdNum = new String[] {""} ;
      T01TN34_A597LinEnt = new short[1] ;
      T01TN35_A396EmprCod = new String[] {""} ;
      T01TN35_A658PedCod = new int[1] ;
      T01TN35_n658PedCod = new boolean[] {false} ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      T01TN36_A658PedCod = new int[1] ;
      T01TN36_n658PedCod = new boolean[] {false} ;
      T01TN36_A659PedCum = new String[] {""} ;
      T01TN36_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A718PrdNom = new String[] {""} ;
      T01TN36_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN36_A3372PedNumCoP = new short[1] ;
      T01TN36_A3373PedConInP = new int[1] ;
      T01TN36_A3374PedConFiP = new int[1] ;
      T01TN36_A3375PedNumCoE = new short[1] ;
      T01TN36_A3376PedConInE = new int[1] ;
      T01TN36_A3377PedConFiE = new int[1] ;
      T01TN36_A3378PedEtiPrd = new byte[1] ;
      T01TN36_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN36_A6289PedNumRq = new int[1] ;
      T01TN36_A8158PedFecPEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN36_A8159PedLinObs = new String[] {""} ;
      T01TN36_A396EmprCod = new String[] {""} ;
      T01TN36_A719PrdNum = new String[] {""} ;
      T01TN5_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN5_A718PrdNom = new String[] {""} ;
      T01TN5_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN37_A396EmprCod = new String[] {""} ;
      T01TN37_A658PedCod = new int[1] ;
      T01TN37_n658PedCod = new boolean[] {false} ;
      T01TN37_A719PrdNum = new String[] {""} ;
      T01TN3_A658PedCod = new int[1] ;
      T01TN3_n658PedCod = new boolean[] {false} ;
      T01TN3_A659PedCum = new String[] {""} ;
      T01TN3_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN3_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN3_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN3_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN3_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN3_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN3_A3372PedNumCoP = new short[1] ;
      T01TN3_A3373PedConInP = new int[1] ;
      T01TN3_A3374PedConFiP = new int[1] ;
      T01TN3_A3375PedNumCoE = new short[1] ;
      T01TN3_A3376PedConInE = new int[1] ;
      T01TN3_A3377PedConFiE = new int[1] ;
      T01TN3_A3378PedEtiPrd = new byte[1] ;
      T01TN3_A6289PedNumRq = new int[1] ;
      T01TN3_A8158PedFecPEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN3_A8159PedLinObs = new String[] {""} ;
      T01TN3_A396EmprCod = new String[] {""} ;
      T01TN3_A719PrdNum = new String[] {""} ;
      T01TN2_A658PedCod = new int[1] ;
      T01TN2_n658PedCod = new boolean[] {false} ;
      T01TN2_A659PedCum = new String[] {""} ;
      T01TN2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN2_A670PedVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN2_A660PedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN2_A663PedFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN2_A3372PedNumCoP = new short[1] ;
      T01TN2_A3373PedConInP = new int[1] ;
      T01TN2_A3374PedConFiP = new int[1] ;
      T01TN2_A3375PedNumCoE = new short[1] ;
      T01TN2_A3376PedConInE = new int[1] ;
      T01TN2_A3377PedConFiE = new int[1] ;
      T01TN2_A3378PedEtiPrd = new byte[1] ;
      T01TN2_A6289PedNumRq = new int[1] ;
      T01TN2_A8158PedFecPEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01TN2_A8159PedLinObs = new String[] {""} ;
      T01TN2_A396EmprCod = new String[] {""} ;
      T01TN2_A719PrdNum = new String[] {""} ;
      T01TN38_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN38_A718PrdNom = new String[] {""} ;
      T01TN38_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN42_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN42_A718PrdNom = new String[] {""} ;
      T01TN42_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TN43_A396EmprCod = new String[] {""} ;
      T01TN43_A756PrePrvNum = new int[1] ;
      T01TN43_A719PrdNum = new String[] {""} ;
      T01TN44_A396EmprCod = new String[] {""} ;
      T01TN44_A719PrdNum = new String[] {""} ;
      T01TN44_A597LinEnt = new short[1] ;
      T01TN46_A396EmprCod = new String[] {""} ;
      T01TN46_A658PedCod = new int[1] ;
      T01TN46_n658PedCod = new boolean[] {false} ;
      T01TN46_A719PrdNum = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i659PedCum = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char1 = new String[1] ;
      ZV26OldPedFec = GXutil.nullDate() ;
      GXt_decimal13 = DecimalUtil.ZERO ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int7 = new byte[1] ;
      ZO684PrdCanPen = DecimalUtil.ZERO ;
      ZV25OldPedCum = "" ;
      ZV24OldPedUni = DecimalUtil.ZERO ;
      Z13833CantPdte = DecimalUtil.ZERO ;
      ZV62OldPedEnt = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      T01TN47_A396EmprCod = new String[] {""} ;
      T01TN47_A658PedCod = new int[1] ;
      T01TN47_n658PedCod = new boolean[] {false} ;
      T01TN47_A719PrdNum = new String[] {""} ;
      T01TN47_A659PedCum = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpedido_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpedido_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpedido_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpedido_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpedido_trn__default(),
         new Object[] {
             new Object[] {
            T01TN2_A658PedCod, T01TN2_A659PedCum, T01TN2_A665PedPre, T01TN2_A670PedVal, T01TN2_A669PedUni, T01TN2_A657PedCanEnt, T01TN2_A660PedDto, T01TN2_A663PedFulEnt, T01TN2_A3372PedNumCoP, T01TN2_A3373PedConInP,
            T01TN2_A3374PedConFiP, T01TN2_A3375PedNumCoE, T01TN2_A3376PedConInE, T01TN2_A3377PedConFiE, T01TN2_A3378PedEtiPrd, T01TN2_A6289PedNumRq, T01TN2_A8158PedFecPEn, T01TN2_A8159PedLinObs, T01TN2_A396EmprCod, T01TN2_A719PrdNum
            }
            , new Object[] {
            T01TN3_A658PedCod, T01TN3_A659PedCum, T01TN3_A665PedPre, T01TN3_A670PedVal, T01TN3_A669PedUni, T01TN3_A657PedCanEnt, T01TN3_A660PedDto, T01TN3_A663PedFulEnt, T01TN3_A3372PedNumCoP, T01TN3_A3373PedConInP,
            T01TN3_A3374PedConFiP, T01TN3_A3375PedNumCoE, T01TN3_A3376PedConInE, T01TN3_A3377PedConFiE, T01TN3_A3378PedEtiPrd, T01TN3_A6289PedNumRq, T01TN3_A8158PedFecPEn, T01TN3_A8159PedLinObs, T01TN3_A396EmprCod, T01TN3_A719PrdNum
            }
            , new Object[] {
            T01TN4_A684PrdCanPen, T01TN4_A718PrdNom, T01TN4_A724PrdPreAct
            }
            , new Object[] {
            T01TN5_A684PrdCanPen, T01TN5_A718PrdNom, T01TN5_A724PrdPreAct
            }
            , new Object[] {
            T01TN6_A658PedCod, T01TN6_A661PedFec, T01TN6_A662PedFecEnt, T01TN6_A667PedSit, T01TN6_A666PedPri, T01TN6_A6160PedCodExt, T01TN6_A6712PedEnv, T01TN6_A8153PedPrvDPP, T01TN6_A8154PedPerDes, T01TN6_A8155PedPerPet,
            T01TN6_A12580PedAlmc, T01TN6_A396EmprCod, T01TN6_A795PrvNum, T01TN6_A3113PedCDivCod
            }
            , new Object[] {
            T01TN7_A658PedCod, T01TN7_A661PedFec, T01TN7_A662PedFecEnt, T01TN7_A667PedSit, T01TN7_A666PedPri, T01TN7_A6160PedCodExt, T01TN7_A6712PedEnv, T01TN7_A8153PedPrvDPP, T01TN7_A8154PedPerDes, T01TN7_A8155PedPerPet,
            T01TN7_A12580PedAlmc, T01TN7_A396EmprCod, T01TN7_A795PrvNum, T01TN7_A3113PedCDivCod
            }
            , new Object[] {
            T01TN8_A407EmprNom, T01TN8_n407EmprNom, T01TN8_A3915EmpNumDec, T01TN8_n3915EmpNumDec
            }
            , new Object[] {
            T01TN9_A794PrvNom, T01TN9_n794PrvNom, T01TN9_A803PrvTlf, T01TN9_n803PrvTlf, T01TN9_A786PrvDir, T01TN9_n786PrvDir, T01TN9_A799PrvPob, T01TN9_n799PrvPob, T01TN9_A3314PrvCar, T01TN9_n3314PrvCar,
            T01TN9_A804PrvTlx, T01TN9_n804PrvTlx, T01TN9_A3143PrvDivCo
            }
            , new Object[] {
            T01TN10_A3114PedCDivAbr, T01TN10_n3114PedCDivAbr
            }
            , new Object[] {
            T01TN11_A3144PrvDivAbr, T01TN11_n3144PrvDivAbr
            }
            , new Object[] {
            T01TN13_A668PedTot, T01TN13_A14114PedCant, T01TN13_A14115PedCantEn, T01TN13_A14202PedTotsind
            }
            , new Object[] {
            T01TN15_A658PedCod, T01TN15_A794PrvNom, T01TN15_n794PrvNom, T01TN15_A803PrvTlf, T01TN15_n803PrvTlf, T01TN15_A786PrvDir, T01TN15_n786PrvDir, T01TN15_A799PrvPob, T01TN15_n799PrvPob, T01TN15_A661PedFec,
            T01TN15_A662PedFecEnt, T01TN15_A667PedSit, T01TN15_A666PedPri, T01TN15_A407EmprNom, T01TN15_n407EmprNom, T01TN15_A3144PrvDivAbr, T01TN15_n3144PrvDivAbr, T01TN15_A3114PedCDivAbr, T01TN15_n3114PedCDivAbr, T01TN15_A3314PrvCar,
            T01TN15_n3314PrvCar, T01TN15_A3915EmpNumDec, T01TN15_n3915EmpNumDec, T01TN15_A804PrvTlx, T01TN15_n804PrvTlx, T01TN15_A6160PedCodExt, T01TN15_A6712PedEnv, T01TN15_A8153PedPrvDPP, T01TN15_A8154PedPerDes, T01TN15_A8155PedPerPet,
            T01TN15_A12580PedAlmc, T01TN15_A396EmprCod, T01TN15_A795PrvNum, T01TN15_A3113PedCDivCod, T01TN15_A3143PrvDivCo, T01TN15_A668PedTot, T01TN15_A14114PedCant, T01TN15_A14115PedCantEn, T01TN15_A14202PedTotsind
            }
            , new Object[] {
            T01TN16_A794PrvNom, T01TN16_n794PrvNom, T01TN16_A803PrvTlf, T01TN16_n803PrvTlf, T01TN16_A786PrvDir, T01TN16_n786PrvDir, T01TN16_A799PrvPob, T01TN16_n799PrvPob, T01TN16_A3314PrvCar, T01TN16_n3314PrvCar,
            T01TN16_A804PrvTlx, T01TN16_n804PrvTlx, T01TN16_A3143PrvDivCo
            }
            , new Object[] {
            T01TN17_A3144PrvDivAbr, T01TN17_n3144PrvDivAbr
            }
            , new Object[] {
            T01TN18_A3114PedCDivAbr, T01TN18_n3114PedCDivAbr
            }
            , new Object[] {
            T01TN20_A668PedTot, T01TN20_A14114PedCant, T01TN20_A14115PedCantEn, T01TN20_A14202PedTotsind
            }
            , new Object[] {
            T01TN21_A396EmprCod, T01TN21_A658PedCod
            }
            , new Object[] {
            T01TN22_A396EmprCod, T01TN22_A658PedCod
            }
            , new Object[] {
            T01TN23_A396EmprCod, T01TN23_A658PedCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TN27_A3114PedCDivAbr, T01TN27_n3114PedCDivAbr
            }
            , new Object[] {
            T01TN28_A794PrvNom, T01TN28_n794PrvNom, T01TN28_A803PrvTlf, T01TN28_n803PrvTlf, T01TN28_A786PrvDir, T01TN28_n786PrvDir, T01TN28_A799PrvPob, T01TN28_n799PrvPob, T01TN28_A3314PrvCar, T01TN28_n3314PrvCar,
            T01TN28_A804PrvTlx, T01TN28_n804PrvTlx, T01TN28_A3143PrvDivCo
            }
            , new Object[] {
            T01TN29_A3144PrvDivAbr, T01TN29_n3144PrvDivAbr
            }
            , new Object[] {
            T01TN31_A668PedTot, T01TN31_A14114PedCant, T01TN31_A14115PedCantEn, T01TN31_A14202PedTotsind
            }
            , new Object[] {
            T01TN32_A396EmprCod, T01TN32_A4850DevComCod
            }
            , new Object[] {
            T01TN33_A396EmprCod, T01TN33_A658PedCod, T01TN33_A2501PedObsLin
            }
            , new Object[] {
            T01TN34_A396EmprCod, T01TN34_A719PrdNum, T01TN34_A597LinEnt
            }
            , new Object[] {
            T01TN35_A396EmprCod, T01TN35_A658PedCod
            }
            , new Object[] {
            T01TN36_A658PedCod, T01TN36_A659PedCum, T01TN36_A665PedPre, T01TN36_A684PrdCanPen, T01TN36_A670PedVal, T01TN36_A718PrdNom, T01TN36_A669PedUni, T01TN36_A657PedCanEnt, T01TN36_A660PedDto, T01TN36_A663PedFulEnt,
            T01TN36_A3372PedNumCoP, T01TN36_A3373PedConInP, T01TN36_A3374PedConFiP, T01TN36_A3375PedNumCoE, T01TN36_A3376PedConInE, T01TN36_A3377PedConFiE, T01TN36_A3378PedEtiPrd, T01TN36_A724PrdPreAct, T01TN36_A6289PedNumRq, T01TN36_A8158PedFecPEn,
            T01TN36_A8159PedLinObs, T01TN36_A396EmprCod, T01TN36_A719PrdNum
            }
            , new Object[] {
            T01TN37_A396EmprCod, T01TN37_A658PedCod, T01TN37_A719PrdNum
            }
            , new Object[] {
            T01TN38_A684PrdCanPen, T01TN38_A718PrdNom, T01TN38_A724PrdPreAct
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TN42_A684PrdCanPen, T01TN42_A718PrdNom, T01TN42_A724PrdPreAct
            }
            , new Object[] {
            T01TN43_A396EmprCod, T01TN43_A756PrePrvNum, T01TN43_A719PrdNum
            }
            , new Object[] {
            T01TN44_A396EmprCod, T01TN44_A719PrdNum, T01TN44_A597LinEnt
            }
            , new Object[] {
            }
            , new Object[] {
            T01TN46_A396EmprCod, T01TN46_A658PedCod, T01TN46_A719PrdNum
            }
            , new Object[] {
            T01TN47_A396EmprCod, T01TN47_A658PedCod, T01TN47_A719PrdNum, T01TN47_A659PedCum
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV84Pgmname = "TPEDIDO_Trn" ;
      Z665PedPre = DecimalUtil.ZERO ;
      O665PedPre = DecimalUtil.ZERO ;
      N665PedPre = DecimalUtil.ZERO ;
      A665PedPre = DecimalUtil.ZERO ;
      T665PedPre = DecimalUtil.ZERO ;
      Z3113PedCDivCod = (byte)(0) ;
      N3113PedCDivCod = (byte)(0) ;
      A3113PedCDivCod = (byte)(0) ;
      Z659PedCum = httpContext.getMessage( "N", "") ;
      O659PedCum = httpContext.getMessage( "N", "") ;
      A659PedCum = httpContext.getMessage( "N", "") ;
      T659PedCum = httpContext.getMessage( "N", "") ;
      i659PedCum = httpContext.getMessage( "N", "") ;
   }

   private byte Z6712PedEnv ;
   private byte Z12580PedAlmc ;
   private byte Z3113PedCDivCod ;
   private byte N3113PedCDivCod ;
   private byte Z3378PedEtiPrd ;
   private byte GxWebError ;
   private byte AV46FlagExi ;
   private byte Gx_BScreen ;
   private byte A3143PrvDivCo ;
   private byte A3113PedCDivCod ;
   private byte nKeyPressed ;
   private byte AV60Noprecio ;
   private byte AV79SiCantidadentregada ;
   private byte AV80SiPrecio ;
   private byte A6712PedEnv ;
   private byte A12580PedAlmc ;
   private byte AV18Insert_PedCDivCod ;
   private byte A3915EmpNumDec ;
   private byte A3378PedEtiPrd ;
   private byte AV32Copias ;
   private byte AV33Copias2 ;
   private byte Z3915EmpNumDec ;
   private byte Z3143PrvDivCo ;
   private byte GXt_int6 ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int7[] ;
   private byte ZV46FlagExi ;
   private short Z3372PedNumCoP ;
   private short Z3375PedNumCoE ;
   private short nRcdDeleted_77 ;
   private short nRcdExists_77 ;
   private short nIsMod_77 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount77 ;
   private short RcdFound77 ;
   private short nBlankRcdUsr77 ;
   private short A664PedNumLin ;
   private short A3372PedNumCoP ;
   private short A3375PedNumCoE ;
   private short RcdFound76 ;
   private short s664PedNumLin ;
   private short O664PedNumLin ;
   private short AV73Proprv ;
   private short AV82Moda21 ;
   private short nIsDirty_76 ;
   private short nIsDirty_77 ;
   private short Z664PedNumLin ;
   private int wcpOAV13PedCod ;
   private int Z658PedCod ;
   private int Z795PrvNum ;
   private int nRC_GXsfl_96 ;
   private int nGXsfl_96_idx=1 ;
   private int Z3373PedConInP ;
   private int Z3374PedConFiP ;
   private int Z3376PedConInE ;
   private int Z3377PedConFiE ;
   private int Z6289PedNumRq ;
   private int A795PrvNum ;
   private int A658PedCod ;
   private int AV13PedCod ;
   private int trnEnded ;
   private int edtPedCod_Enabled ;
   private int edtPedFec_Enabled ;
   private int edtPedFecEnt_Enabled ;
   private int edtPedPrvDPP_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrvDir_Enabled ;
   private int edtPrvPob_Enabled ;
   private int edtPrvTlf_Enabled ;
   private int edtPrvTlx_Enabled ;
   private int divUnnamedtable9_Visible ;
   private int edtPedPerDes_Enabled ;
   private int edtPedPerPet_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtPedTot_Enabled ;
   private int edtPedTot_Visible ;
   private int edtPedTotsind_Enabled ;
   private int edtPedTotsind_Visible ;
   private int AV20PrvNum ;
   private int edtavPrvnum_Enabled ;
   private int edtavPrvnum_Visible ;
   private int edtPrdNum_Enabled ;
   private int edtPedUni_Enabled ;
   private int edtPedCanEnt_Enabled ;
   private int edtCantPdte_Enabled ;
   private int edtPedPre_Enabled ;
   private int edtPedDto_Enabled ;
   private int edtPedVal_Enabled ;
   private int edtPedValForm_Enabled ;
   private int edtPedFecPEn_Enabled ;
   private int edtPedLinObs_Enabled ;
   private int fRowAdded ;
   private int AV17Insert_PrvNum ;
   private int A3373PedConInP ;
   private int A3374PedConFiP ;
   private int A3376PedConInE ;
   private int A3377PedConFiE ;
   private int A6289PedNumRq ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int AV86GXV1 ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtPedValForm_Enabled ;
   private int defedtPedVal_Enabled ;
   private int defedtPedPre_Enabled ;
   private int defedtPedCanEnt_Enabled ;
   private int defedtPrdNum_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int2[] ;
   private int Gx_cnt ;
   private int E658PedCod ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z8153PedPrvDPP ;
   private java.math.BigDecimal O14202PedTotsind ;
   private java.math.BigDecimal O668PedTot ;
   private java.math.BigDecimal O14115PedCantEn ;
   private java.math.BigDecimal O14114PedCant ;
   private java.math.BigDecimal Z665PedPre ;
   private java.math.BigDecimal Z670PedVal ;
   private java.math.BigDecimal Z669PedUni ;
   private java.math.BigDecimal Z657PedCanEnt ;
   private java.math.BigDecimal Z660PedDto ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal O669PedUni ;
   private java.math.BigDecimal O657PedCanEnt ;
   private java.math.BigDecimal O684PrdCanPen ;
   private java.math.BigDecimal O14203PedValsinD ;
   private java.math.BigDecimal O670PedVal ;
   private java.math.BigDecimal O665PedPre ;
   private java.math.BigDecimal N657PedCanEnt ;
   private java.math.BigDecimal N665PedPre ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal A8153PedPrvDPP ;
   private java.math.BigDecimal A668PedTot ;
   private java.math.BigDecimal A14202PedTotsind ;
   private java.math.BigDecimal B14202PedTotsind ;
   private java.math.BigDecimal B668PedTot ;
   private java.math.BigDecimal B14115PedCantEn ;
   private java.math.BigDecimal A14115PedCantEn ;
   private java.math.BigDecimal B14114PedCant ;
   private java.math.BigDecimal A14114PedCant ;
   private java.math.BigDecimal A8156PedImpDPP ;
   private java.math.BigDecimal A8157PedTotGen ;
   private java.math.BigDecimal A14203PedValsinD ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal AV62OldPedEnt ;
   private java.math.BigDecimal AV24OldPedUni ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal s14202PedTotsind ;
   private java.math.BigDecimal s668PedTot ;
   private java.math.BigDecimal s14115PedCantEn ;
   private java.math.BigDecimal s14114PedCant ;
   private java.math.BigDecimal s8156PedImpDPP ;
   private java.math.BigDecimal O8156PedImpDPP ;
   private java.math.BigDecimal s8157PedTotGen ;
   private java.math.BigDecimal O8157PedTotGen ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A13833CantPdte ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal A660PedDto ;
   private java.math.BigDecimal A670PedVal ;
   private java.math.BigDecimal A13787PedValForm ;
   private java.math.BigDecimal T669PedUni ;
   private java.math.BigDecimal T657PedCanEnt ;
   private java.math.BigDecimal T684PrdCanPen ;
   private java.math.BigDecimal T14203PedValsinD ;
   private java.math.BigDecimal T670PedVal ;
   private java.math.BigDecimal T665PedPre ;
   private java.math.BigDecimal Z668PedTot ;
   private java.math.BigDecimal Z14114PedCant ;
   private java.math.BigDecimal Z14115PedCantEn ;
   private java.math.BigDecimal Z14202PedTotsind ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal GXt_decimal13 ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal ZO684PrdCanPen ;
   private java.math.BigDecimal ZV24OldPedUni ;
   private java.math.BigDecimal Z13833CantPdte ;
   private java.math.BigDecimal ZV62OldPedEnt ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV12EmprCod ;
   private String Z396EmprCod ;
   private String Z667PedSit ;
   private String Z666PedPri ;
   private String Z8154PedPerDes ;
   private String Z8155PedPerPet ;
   private String Z719PrdNum ;
   private String Z659PedCum ;
   private String Z8159PedLinObs ;
   private String Z718PrdNom ;
   private String O659PedCum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV25OldPedCum ;
   private String AV84Pgmname ;
   private String AV10UsurCod ;
   private String AV8Station ;
   private String AV12EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPedCod_Internalname ;
   private String sGXsfl_96_idx="0001" ;
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
   private String divUnnamedtable5_Internalname ;
   private String TempTags ;
   private String edtPedCod_Jsonclick ;
   private String edtPedFec_Internalname ;
   private String edtPedFec_Jsonclick ;
   private String edtPedFecEnt_Internalname ;
   private String edtPedFecEnt_Jsonclick ;
   private String edtPedPrvDPP_Internalname ;
   private String edtPedPrvDPP_Jsonclick ;
   private String divDvpanel_datosproveedor_cell_Internalname ;
   private String divDvpanel_datosproveedor_cell_Class ;
   private String Dvpanel_datosproveedor_Width ;
   private String Dvpanel_datosproveedor_Cls ;
   private String Dvpanel_datosproveedor_Title ;
   private String Dvpanel_datosproveedor_Iconposition ;
   private String Dvpanel_datosproveedor_Internalname ;
   private String divDatosproveedor_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtPrvDir_Internalname ;
   private String A786PrvDir ;
   private String edtPrvDir_Jsonclick ;
   private String edtPrvPob_Internalname ;
   private String A799PrvPob ;
   private String edtPrvPob_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtPrvTlf_Internalname ;
   private String A803PrvTlf ;
   private String edtPrvTlf_Jsonclick ;
   private String edtPrvTlx_Internalname ;
   private String A804PrvTlx ;
   private String edtPrvTlx_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtPedPerDes_Internalname ;
   private String A8154PedPerDes ;
   private String edtPedPerDes_Jsonclick ;
   private String edtPedPerPet_Internalname ;
   private String A8155PedPerPet ;
   private String edtPedPerPet_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String lblTotal1_Internalname ;
   private String lblTotal1_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String lblTotal2_Internalname ;
   private String lblTotal2_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Internalname ;
   private String edtPedTot_Internalname ;
   private String edtPedTot_Jsonclick ;
   private String edtPedTotsind_Internalname ;
   private String edtPedTotsind_Jsonclick ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String Gridlevel_level1_titlescategories_Gridtitlescategories ;
   private String Gridlevel_level1_titlescategories_Internalname ;
   private String sMode77 ;
   private String edtPrdNum_Internalname ;
   private String edtPedUni_Internalname ;
   private String edtPedCanEnt_Internalname ;
   private String edtCantPdte_Internalname ;
   private String edtPedPre_Internalname ;
   private String edtPedDto_Internalname ;
   private String edtPedVal_Internalname ;
   private String edtPedValForm_Internalname ;
   private String edtPedFecPEn_Internalname ;
   private String edtPedLinObs_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A667PedSit ;
   private String A666PedPri ;
   private String A407EmprNom ;
   private String A3314PrvCar ;
   private String A3114PedCDivAbr ;
   private String A3144PrvDivAbr ;
   private String A718PrdNom ;
   private String Dvpanel_datosproveedor_Objectcall ;
   private String Dvpanel_datosproveedor_Class ;
   private String Dvpanel_datosproveedor_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String Gridlevel_level1_titlescategories_Objectcall ;
   private String Gridlevel_level1_titlescategories_Class ;
   private String Gridlevel_level1_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode76 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A659PedCum ;
   private String A8159PedLinObs ;
   private String T659PedCum ;
   private String AV7PedSit ;
   private String AV57msg0 ;
   private String AV58msg1 ;
   private String AV59msg2 ;
   private String AV9EmprNom ;
   private String AV11ImpCod ;
   private String AV75Puerto ;
   private String Gx_out ;
   private String GXt_char4 ;
   private String Z3114PedCDivAbr ;
   private String Z407EmprNom ;
   private String Z794PrvNom ;
   private String Z803PrvTlf ;
   private String Z786PrvDir ;
   private String Z799PrvPob ;
   private String Z3314PrvCar ;
   private String Z804PrvTlx ;
   private String Z3144PrvDivAbr ;
   private String sGXsfl_96_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPedUni_Jsonclick ;
   private String edtPedCanEnt_Jsonclick ;
   private String edtCantPdte_Jsonclick ;
   private String edtPedPre_Jsonclick ;
   private String edtPedDto_Jsonclick ;
   private String edtPedVal_Jsonclick ;
   private String edtPedValForm_Jsonclick ;
   private String edtPedFecPEn_Jsonclick ;
   private String edtPedLinObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i659PedCum ;
   private String subGridlevel_level1_Header ;
   private String GXv_char1[] ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String ZV25OldPedCum ;
   private String E396EmprCod ;
   private java.util.Date Z661PedFec ;
   private java.util.Date Z662PedFecEnt ;
   private java.util.Date O661PedFec ;
   private java.util.Date Z663PedFulEnt ;
   private java.util.Date Z8158PedFecPEn ;
   private java.util.Date A661PedFec ;
   private java.util.Date A662PedFecEnt ;
   private java.util.Date B661PedFec ;
   private java.util.Date AV26OldPedFec ;
   private java.util.Date A663PedFulEnt ;
   private java.util.Date A8158PedFecPEn ;
   private java.util.Date ZV26OldPedFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n658PedCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_datosproveedor_Autowidth ;
   private boolean Dvpanel_datosproveedor_Autoheight ;
   private boolean Dvpanel_datosproveedor_Collapsible ;
   private boolean Dvpanel_datosproveedor_Collapsed ;
   private boolean Dvpanel_datosproveedor_Showcollapseicon ;
   private boolean Dvpanel_datosproveedor_Autoscroll ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean bGXsfl_96_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3915EmpNumDec ;
   private boolean n3314PrvCar ;
   private boolean n3114PedCDivAbr ;
   private boolean n3144PrvDivAbr ;
   private boolean Dvpanel_datosproveedor_Enabled ;
   private boolean Dvpanel_datosproveedor_Showheader ;
   private boolean Dvpanel_datosproveedor_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean Gridlevel_level1_titlescategories_Enabled ;
   private boolean Gridlevel_level1_titlescategories_Visible ;
   private boolean n794PrvNom ;
   private boolean n786PrvDir ;
   private boolean n799PrvPob ;
   private boolean n803PrvTlf ;
   private boolean n804PrvTlx ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean Gx_first ;
   private boolean nA658PedCod ;
   private String AV81Texto_i ;
   private String Z6160PedCodExt ;
   private String A6160PedCodExt ;
   private String AV23ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_datosproveedor ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_level1_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbPedCum ;
   private IDataStoreProvider pr_default ;
   private String[] T01TN8_A407EmprNom ;
   private boolean[] T01TN8_n407EmprNom ;
   private byte[] T01TN8_A3915EmpNumDec ;
   private boolean[] T01TN8_n3915EmpNumDec ;
   private java.math.BigDecimal[] T01TN13_A668PedTot ;
   private java.math.BigDecimal[] T01TN13_A14114PedCant ;
   private java.math.BigDecimal[] T01TN13_A14115PedCantEn ;
   private java.math.BigDecimal[] T01TN13_A14202PedTotsind ;
   private String[] T01TN9_A794PrvNom ;
   private boolean[] T01TN9_n794PrvNom ;
   private String[] T01TN9_A803PrvTlf ;
   private boolean[] T01TN9_n803PrvTlf ;
   private String[] T01TN9_A786PrvDir ;
   private boolean[] T01TN9_n786PrvDir ;
   private String[] T01TN9_A799PrvPob ;
   private boolean[] T01TN9_n799PrvPob ;
   private String[] T01TN9_A3314PrvCar ;
   private boolean[] T01TN9_n3314PrvCar ;
   private String[] T01TN9_A804PrvTlx ;
   private boolean[] T01TN9_n804PrvTlx ;
   private byte[] T01TN9_A3143PrvDivCo ;
   private String[] T01TN11_A3144PrvDivAbr ;
   private boolean[] T01TN11_n3144PrvDivAbr ;
   private int[] T01TN15_A658PedCod ;
   private boolean[] T01TN15_n658PedCod ;
   private String[] T01TN15_A794PrvNom ;
   private boolean[] T01TN15_n794PrvNom ;
   private String[] T01TN15_A803PrvTlf ;
   private boolean[] T01TN15_n803PrvTlf ;
   private String[] T01TN15_A786PrvDir ;
   private boolean[] T01TN15_n786PrvDir ;
   private String[] T01TN15_A799PrvPob ;
   private boolean[] T01TN15_n799PrvPob ;
   private java.util.Date[] T01TN15_A661PedFec ;
   private java.util.Date[] T01TN15_A662PedFecEnt ;
   private String[] T01TN15_A667PedSit ;
   private String[] T01TN15_A666PedPri ;
   private String[] T01TN15_A407EmprNom ;
   private boolean[] T01TN15_n407EmprNom ;
   private String[] T01TN15_A3144PrvDivAbr ;
   private boolean[] T01TN15_n3144PrvDivAbr ;
   private String[] T01TN15_A3114PedCDivAbr ;
   private boolean[] T01TN15_n3114PedCDivAbr ;
   private String[] T01TN15_A3314PrvCar ;
   private boolean[] T01TN15_n3314PrvCar ;
   private byte[] T01TN15_A3915EmpNumDec ;
   private boolean[] T01TN15_n3915EmpNumDec ;
   private String[] T01TN15_A804PrvTlx ;
   private boolean[] T01TN15_n804PrvTlx ;
   private String[] T01TN15_A6160PedCodExt ;
   private byte[] T01TN15_A6712PedEnv ;
   private java.math.BigDecimal[] T01TN15_A8153PedPrvDPP ;
   private String[] T01TN15_A8154PedPerDes ;
   private String[] T01TN15_A8155PedPerPet ;
   private byte[] T01TN15_A12580PedAlmc ;
   private String[] T01TN15_A396EmprCod ;
   private int[] T01TN15_A795PrvNum ;
   private byte[] T01TN15_A3113PedCDivCod ;
   private byte[] T01TN15_A3143PrvDivCo ;
   private java.math.BigDecimal[] T01TN15_A668PedTot ;
   private java.math.BigDecimal[] T01TN15_A14114PedCant ;
   private java.math.BigDecimal[] T01TN15_A14115PedCantEn ;
   private java.math.BigDecimal[] T01TN15_A14202PedTotsind ;
   private String[] T01TN10_A3114PedCDivAbr ;
   private boolean[] T01TN10_n3114PedCDivAbr ;
   private String[] T01TN16_A794PrvNom ;
   private boolean[] T01TN16_n794PrvNom ;
   private String[] T01TN16_A803PrvTlf ;
   private boolean[] T01TN16_n803PrvTlf ;
   private String[] T01TN16_A786PrvDir ;
   private boolean[] T01TN16_n786PrvDir ;
   private String[] T01TN16_A799PrvPob ;
   private boolean[] T01TN16_n799PrvPob ;
   private String[] T01TN16_A3314PrvCar ;
   private boolean[] T01TN16_n3314PrvCar ;
   private String[] T01TN16_A804PrvTlx ;
   private boolean[] T01TN16_n804PrvTlx ;
   private byte[] T01TN16_A3143PrvDivCo ;
   private String[] T01TN17_A3144PrvDivAbr ;
   private boolean[] T01TN17_n3144PrvDivAbr ;
   private String[] T01TN18_A3114PedCDivAbr ;
   private boolean[] T01TN18_n3114PedCDivAbr ;
   private java.math.BigDecimal[] T01TN20_A668PedTot ;
   private java.math.BigDecimal[] T01TN20_A14114PedCant ;
   private java.math.BigDecimal[] T01TN20_A14115PedCantEn ;
   private java.math.BigDecimal[] T01TN20_A14202PedTotsind ;
   private String[] T01TN21_A396EmprCod ;
   private int[] T01TN21_A658PedCod ;
   private boolean[] T01TN21_n658PedCod ;
   private int[] T01TN7_A658PedCod ;
   private boolean[] T01TN7_n658PedCod ;
   private java.util.Date[] T01TN7_A661PedFec ;
   private java.util.Date[] T01TN7_A662PedFecEnt ;
   private String[] T01TN7_A667PedSit ;
   private String[] T01TN7_A666PedPri ;
   private String[] T01TN7_A6160PedCodExt ;
   private byte[] T01TN7_A6712PedEnv ;
   private java.math.BigDecimal[] T01TN7_A8153PedPrvDPP ;
   private String[] T01TN7_A8154PedPerDes ;
   private String[] T01TN7_A8155PedPerPet ;
   private byte[] T01TN7_A12580PedAlmc ;
   private String[] T01TN7_A396EmprCod ;
   private int[] T01TN7_A795PrvNum ;
   private byte[] T01TN7_A3113PedCDivCod ;
   private String[] T01TN22_A396EmprCod ;
   private int[] T01TN22_A658PedCod ;
   private boolean[] T01TN22_n658PedCod ;
   private String[] T01TN23_A396EmprCod ;
   private int[] T01TN23_A658PedCod ;
   private boolean[] T01TN23_n658PedCod ;
   private int[] T01TN6_A658PedCod ;
   private boolean[] T01TN6_n658PedCod ;
   private java.util.Date[] T01TN6_A661PedFec ;
   private java.util.Date[] T01TN6_A662PedFecEnt ;
   private String[] T01TN6_A667PedSit ;
   private String[] T01TN6_A666PedPri ;
   private String[] T01TN6_A6160PedCodExt ;
   private byte[] T01TN6_A6712PedEnv ;
   private java.math.BigDecimal[] T01TN6_A8153PedPrvDPP ;
   private String[] T01TN6_A8154PedPerDes ;
   private String[] T01TN6_A8155PedPerPet ;
   private byte[] T01TN6_A12580PedAlmc ;
   private String[] T01TN6_A396EmprCod ;
   private int[] T01TN6_A795PrvNum ;
   private byte[] T01TN6_A3113PedCDivCod ;
   private String[] T01TN27_A3114PedCDivAbr ;
   private boolean[] T01TN27_n3114PedCDivAbr ;
   private String[] T01TN28_A794PrvNom ;
   private boolean[] T01TN28_n794PrvNom ;
   private String[] T01TN28_A803PrvTlf ;
   private boolean[] T01TN28_n803PrvTlf ;
   private String[] T01TN28_A786PrvDir ;
   private boolean[] T01TN28_n786PrvDir ;
   private String[] T01TN28_A799PrvPob ;
   private boolean[] T01TN28_n799PrvPob ;
   private String[] T01TN28_A3314PrvCar ;
   private boolean[] T01TN28_n3314PrvCar ;
   private String[] T01TN28_A804PrvTlx ;
   private boolean[] T01TN28_n804PrvTlx ;
   private byte[] T01TN28_A3143PrvDivCo ;
   private String[] T01TN29_A3144PrvDivAbr ;
   private boolean[] T01TN29_n3144PrvDivAbr ;
   private java.math.BigDecimal[] T01TN31_A668PedTot ;
   private java.math.BigDecimal[] T01TN31_A14114PedCant ;
   private java.math.BigDecimal[] T01TN31_A14115PedCantEn ;
   private java.math.BigDecimal[] T01TN31_A14202PedTotsind ;
   private String[] T01TN32_A396EmprCod ;
   private int[] T01TN32_A4850DevComCod ;
   private String[] T01TN33_A396EmprCod ;
   private int[] T01TN33_A658PedCod ;
   private boolean[] T01TN33_n658PedCod ;
   private byte[] T01TN33_A2501PedObsLin ;
   private String[] T01TN34_A396EmprCod ;
   private String[] T01TN34_A719PrdNum ;
   private short[] T01TN34_A597LinEnt ;
   private String[] T01TN35_A396EmprCod ;
   private int[] T01TN35_A658PedCod ;
   private boolean[] T01TN35_n658PedCod ;
   private int[] T01TN36_A658PedCod ;
   private boolean[] T01TN36_n658PedCod ;
   private String[] T01TN36_A659PedCum ;
   private java.math.BigDecimal[] T01TN36_A665PedPre ;
   private java.math.BigDecimal[] T01TN36_A684PrdCanPen ;
   private java.math.BigDecimal[] T01TN36_A670PedVal ;
   private String[] T01TN36_A718PrdNom ;
   private java.math.BigDecimal[] T01TN36_A669PedUni ;
   private java.math.BigDecimal[] T01TN36_A657PedCanEnt ;
   private java.math.BigDecimal[] T01TN36_A660PedDto ;
   private java.util.Date[] T01TN36_A663PedFulEnt ;
   private short[] T01TN36_A3372PedNumCoP ;
   private int[] T01TN36_A3373PedConInP ;
   private int[] T01TN36_A3374PedConFiP ;
   private short[] T01TN36_A3375PedNumCoE ;
   private int[] T01TN36_A3376PedConInE ;
   private int[] T01TN36_A3377PedConFiE ;
   private byte[] T01TN36_A3378PedEtiPrd ;
   private java.math.BigDecimal[] T01TN36_A724PrdPreAct ;
   private int[] T01TN36_A6289PedNumRq ;
   private java.util.Date[] T01TN36_A8158PedFecPEn ;
   private String[] T01TN36_A8159PedLinObs ;
   private String[] T01TN36_A396EmprCod ;
   private String[] T01TN36_A719PrdNum ;
   private java.math.BigDecimal[] T01TN5_A684PrdCanPen ;
   private String[] T01TN5_A718PrdNom ;
   private java.math.BigDecimal[] T01TN5_A724PrdPreAct ;
   private String[] T01TN37_A396EmprCod ;
   private int[] T01TN37_A658PedCod ;
   private boolean[] T01TN37_n658PedCod ;
   private String[] T01TN37_A719PrdNum ;
   private int[] T01TN3_A658PedCod ;
   private boolean[] T01TN3_n658PedCod ;
   private String[] T01TN3_A659PedCum ;
   private java.math.BigDecimal[] T01TN3_A665PedPre ;
   private java.math.BigDecimal[] T01TN3_A670PedVal ;
   private java.math.BigDecimal[] T01TN3_A669PedUni ;
   private java.math.BigDecimal[] T01TN3_A657PedCanEnt ;
   private java.math.BigDecimal[] T01TN3_A660PedDto ;
   private java.util.Date[] T01TN3_A663PedFulEnt ;
   private short[] T01TN3_A3372PedNumCoP ;
   private int[] T01TN3_A3373PedConInP ;
   private int[] T01TN3_A3374PedConFiP ;
   private short[] T01TN3_A3375PedNumCoE ;
   private int[] T01TN3_A3376PedConInE ;
   private int[] T01TN3_A3377PedConFiE ;
   private byte[] T01TN3_A3378PedEtiPrd ;
   private int[] T01TN3_A6289PedNumRq ;
   private java.util.Date[] T01TN3_A8158PedFecPEn ;
   private String[] T01TN3_A8159PedLinObs ;
   private String[] T01TN3_A396EmprCod ;
   private String[] T01TN3_A719PrdNum ;
   private int[] T01TN2_A658PedCod ;
   private boolean[] T01TN2_n658PedCod ;
   private String[] T01TN2_A659PedCum ;
   private java.math.BigDecimal[] T01TN2_A665PedPre ;
   private java.math.BigDecimal[] T01TN2_A670PedVal ;
   private java.math.BigDecimal[] T01TN2_A669PedUni ;
   private java.math.BigDecimal[] T01TN2_A657PedCanEnt ;
   private java.math.BigDecimal[] T01TN2_A660PedDto ;
   private java.util.Date[] T01TN2_A663PedFulEnt ;
   private short[] T01TN2_A3372PedNumCoP ;
   private int[] T01TN2_A3373PedConInP ;
   private int[] T01TN2_A3374PedConFiP ;
   private short[] T01TN2_A3375PedNumCoE ;
   private int[] T01TN2_A3376PedConInE ;
   private int[] T01TN2_A3377PedConFiE ;
   private byte[] T01TN2_A3378PedEtiPrd ;
   private int[] T01TN2_A6289PedNumRq ;
   private java.util.Date[] T01TN2_A8158PedFecPEn ;
   private String[] T01TN2_A8159PedLinObs ;
   private String[] T01TN2_A396EmprCod ;
   private String[] T01TN2_A719PrdNum ;
   private java.math.BigDecimal[] T01TN38_A684PrdCanPen ;
   private String[] T01TN38_A718PrdNom ;
   private java.math.BigDecimal[] T01TN38_A724PrdPreAct ;
   private java.math.BigDecimal[] T01TN42_A684PrdCanPen ;
   private String[] T01TN42_A718PrdNom ;
   private java.math.BigDecimal[] T01TN42_A724PrdPreAct ;
   private String[] T01TN43_A396EmprCod ;
   private int[] T01TN43_A756PrePrvNum ;
   private String[] T01TN43_A719PrdNum ;
   private String[] T01TN44_A396EmprCod ;
   private String[] T01TN44_A719PrdNum ;
   private short[] T01TN44_A597LinEnt ;
   private String[] T01TN46_A396EmprCod ;
   private int[] T01TN46_A658PedCod ;
   private boolean[] T01TN46_n658PedCod ;
   private String[] T01TN46_A719PrdNum ;
   private String[] T01TN47_A396EmprCod ;
   private int[] T01TN47_A658PedCod ;
   private boolean[] T01TN47_n658PedCod ;
   private String[] T01TN47_A719PrdNum ;
   private String[] T01TN47_A659PedCum ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private java.math.BigDecimal[] T01TN4_A684PrdCanPen ;
   private String[] T01TN4_A718PrdNom ;
   private java.math.BigDecimal[] T01TN4_A724PrdPreAct ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV21PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item12[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV22DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class tpedido_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedido_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedido_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedido_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpedido_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TN2", "SELECT PedCod, PedCum, PedPre, PedVal, PedUni, PedCanEnt, PedDto, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs, EmprCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?  FOR UPDATE OF PedCum, PedPre, PedVal, PedUni, PedCanEnt, PedDto, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN3", "SELECT PedCod, PedCum, PedPre, PedVal, PedUni, PedCanEnt, PedDto, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs, EmprCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN4", "SELECT PrdCanPen, PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdCanPen NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN5", "SELECT PrdCanPen, PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN6", "SELECT PedCod, PedFec, PedFecEnt, PedSit, PedPri, PedCodExt, PedEnv, PedPrvDPP, PedPerDes, PedPerPet, PedAlmc, EmprCod, PrvNum, PedCDivCod FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ?  FOR UPDATE OF PedFec, PedFecEnt, PedSit, PedPri, PedCodExt, PedEnv, PedPrvDPP, PedPerDes, PedPerPet, PedAlmc, PrvNum, PedCDivCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN7", "SELECT PedCod, PedFec, PedFecEnt, PedSit, PedPri, PedCodExt, PedEnv, PedPrvDPP, PedPerDes, PedPerPet, PedAlmc, EmprCod, PrvNum, PedCDivCod FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN8", "SELECT EmprNom, EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN9", "SELECT PrvNom, PrvTlf, PrvDir, PrvPob, PrvCar, PrvTlx, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN10", "SELECT DivAbr AS PedCDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN11", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN13", "SELECT COALESCE( T1.PedTot, 0) AS PedTot, COALESCE( T1.PedCant, 0) AS PedCant, COALESCE( T1.PedCantEn, 0) AS PedCantEn, COALESCE( T1.PedTotsind, 0) AS PedTotsind FROM (SELECT SUM(PedVal) AS PedTot, EmprCod, PedCod, SUM(PedUni) AS PedCant, SUM(PedCanEnt) AS PedCantEn, SUM(ROUND(PedUni * CAST(PedPre AS NUMERIC(24,10)), 2)) AS PedTotsind FROM TXPLPEDID GROUP BY EmprCod, PedCod ) T1 WHERE T1.EmprCod = ? AND T1.PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN15", "SELECT /*+ FIRST_ROWS(100) */ TM1.PedCod, T4.PrvNom, T4.PrvTlf, T4.PrvDir, T4.PrvPob, TM1.PedFec, TM1.PedFecEnt, TM1.PedSit, TM1.PedPri, T3.EmprNom, T5.DivAbr AS PrvDivAbr, T2.DivAbr AS PedCDivAbr, T4.PrvCar, T3.EmpNumDec, T4.PrvTlx, TM1.PedCodExt, TM1.PedEnv, TM1.PedPrvDPP, TM1.PedPerDes, TM1.PedPerPet, TM1.PedAlmc, TM1.EmprCod, TM1.PrvNum, TM1.PedCDivCod AS PedCDivCod, T4.PrvDivCo AS PrvDivCo, COALESCE( T6.PedTot, 0) AS PedTot, COALESCE( T6.PedCant, 0) AS PedCant, COALESCE( T6.PedCantEn, 0) AS PedCantEn, COALESCE( T6.PedTotsind, 0) AS PedTotsind FROM (((((TXPCPEDID TM1 INNER JOIN TXPDIVISA T2 ON T2.DivCod = TM1.PedCDivCod) INNER JOIN TXPEMPRES T3 ON T3.EmprCod = TM1.EmprCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrvNum = TM1.PrvNum) INNER JOIN TXPDIVISA T5 ON T5.DivCod = T4.PrvDivCo) LEFT JOIN (SELECT SUM(PedVal) AS PedTot, EmprCod, PedCod, SUM(PedUni) AS PedCant, SUM(PedCanEnt) AS PedCantEn, SUM(ROUND(PedUni * CAST(PedPre AS NUMERIC(24,10)), 2)) AS PedTotsind FROM TXPLPEDID GROUP BY EmprCod, PedCod ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.PedCod = TM1.PedCod) WHERE TM1.EmprCod = ? and TM1.PedCod = ? ORDER BY TM1.EmprCod, TM1.PedCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN16", "SELECT PrvNom, PrvTlf, PrvDir, PrvPob, PrvCar, PrvTlx, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN17", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN18", "SELECT DivAbr AS PedCDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN20", "SELECT COALESCE( T1.PedTot, 0) AS PedTot, COALESCE( T1.PedCant, 0) AS PedCant, COALESCE( T1.PedCantEn, 0) AS PedCantEn, COALESCE( T1.PedTotsind, 0) AS PedTotsind FROM (SELECT SUM(PedVal) AS PedTot, EmprCod, PedCod, SUM(PedUni) AS PedCant, SUM(PedCanEnt) AS PedCantEn, SUM(ROUND(PedUni * CAST(PedPre AS NUMERIC(24,10)), 2)) AS PedTotsind FROM TXPLPEDID GROUP BY EmprCod, PedCod ) T1 WHERE T1.EmprCod = ? AND T1.PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? AND PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod FROM TXPCPEDID WHERE ( PedCod > ?) and EmprCod = ? ORDER BY EmprCod, PedCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TN23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PedCod FROM TXPCPEDID WHERE ( PedCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, PedCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TN24", "INSERT INTO TXPCPEDID(PedCod, PedFec, PedFecEnt, PedSit, PedPri, PedCodExt, PedEnv, PedPrvDPP, PedPerDes, PedPerPet, PedAlmc, EmprCod, PrvNum, PedCDivCod, PedObsUL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPCPEDID")
         ,new UpdateCursor("T01TN25", "UPDATE TXPCPEDID SET PedFec=?, PedFecEnt=?, PedSit=?, PedPri=?, PedCodExt=?, PedEnv=?, PedPrvDPP=?, PedPerDes=?, PedPerPet=?, PedAlmc=?, PrvNum=?, PedCDivCod=?  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK, "TXPCPEDID")
         ,new UpdateCursor("T01TN26", "DELETE FROM TXPCPEDID  WHERE EmprCod = ? AND PedCod = ?", GX_NOMASK, "TXPCPEDID")
         ,new ForEachCursor("T01TN27", "SELECT DivAbr AS PedCDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN28", "SELECT PrvNom, PrvTlf, PrvDir, PrvPob, PrvCar, PrvTlx, PrvDivCo FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN29", "SELECT DivAbr AS PrvDivAbr FROM TXPDIVISA WHERE DivCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN31", "SELECT COALESCE( T1.PedTot, 0) AS PedTot, COALESCE( T1.PedCant, 0) AS PedCant, COALESCE( T1.PedCantEn, 0) AS PedCantEn, COALESCE( T1.PedTotsind, 0) AS PedTotsind FROM (SELECT SUM(PedVal) AS PedTot, EmprCod, PedCod, SUM(PedUni) AS PedCant, SUM(PedCanEnt) AS PedCantEn, SUM(ROUND(PedUni * CAST(PedPre AS NUMERIC(24,10)), 2)) AS PedTotsind FROM TXPLPEDID GROUP BY EmprCod, PedCod ) T1 WHERE T1.EmprCod = ? AND T1.PedCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN32", "SELECT * FROM (SELECT EmprCod, DevComCod FROM TXPDEVCCO WHERE EmprCod = ? AND PedCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TN33", "SELECT * FROM (SELECT EmprCod, PedCod, PedObsLin FROM TXPOBSPED WHERE EmprCod = ? AND PedCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TN34", "SELECT * FROM (SELECT EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PedCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TN35", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PedCod FROM TXPCPEDID WHERE EmprCod = ? ORDER BY EmprCod, PedCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN36", "SELECT T1.PedCod, T1.PedCum, T1.PedPre, T2.PrdCanPen, T1.PedVal, T2.PrdNom, T1.PedUni, T1.PedCanEnt, T1.PedDto, T1.PedFulEnt, T1.PedNumCoP, T1.PedConInP, T1.PedConFiP, T1.PedNumCoE, T1.PedConInE, T1.PedConFiE, T1.PedEtiPrd, T2.PrdPreAct, T1.PedNumRq, T1.PedFecPEn, T1.PedLinObs, T1.EmprCod, T1.PrdNum FROM (TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PedCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN37", "SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN38", "SELECT PrdCanPen, PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdCanPen NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TN39", "INSERT INTO TXPLPEDID(PedCod, PedCum, PedPre, PedVal, PedUni, PedCanEnt, PedDto, PedFulEnt, PedNumCoP, PedConInP, PedConFiP, PedNumCoE, PedConInE, PedConFiE, PedEtiPrd, PedNumRq, PedFecPEn, PedLinObs, EmprCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLPEDID")
         ,new UpdateCursor("T01TN40", "UPDATE TXPLPEDID SET PedCum=?, PedPre=?, PedVal=?, PedUni=?, PedCanEnt=?, PedDto=?, PedFulEnt=?, PedNumCoP=?, PedConInP=?, PedConFiP=?, PedNumCoE=?, PedConInE=?, PedConFiE=?, PedEtiPrd=?, PedNumRq=?, PedFecPEn=?, PedLinObs=?  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new UpdateCursor("T01TN41", "DELETE FROM TXPLPEDID  WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?", GX_NOMASK, "TXPLPEDID")
         ,new ForEachCursor("T01TN42", "SELECT PrdCanPen, PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN43", "SELECT * FROM (SELECT EmprCod, PrePrvNum, PrdNum FROM TXPPREPED WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TN44", "SELECT * FROM (SELECT EmprCod, PrdNum, LinEnt FROM TXPENTALM WHERE EmprCod = ? AND PedCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TN45", "UPDATE TXPPRODUC SET PrdCanPen=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01TN46", "SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? and PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TN47", "SELECT EmprCod, PedCod, PrdNum, PedCum FROM TXPLPEDID WHERE EmprCod = ? AND PedCod = ? ORDER BY EmprCod, PedCod, PrdNum ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 60);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((byte[]) buf[14])[0] = rslt.getByte(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 60);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((String[]) buf[19])[0] = rslt.getString(20, 6);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 18);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 18);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 1);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((String[]) buf[13])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(16);
               ((byte[]) buf[26])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[28])[0] = rslt.getString(19, 30);
               ((String[]) buf[29])[0] = rslt.getString(20, 30);
               ((byte[]) buf[30])[0] = rslt.getByte(21);
               ((String[]) buf[31])[0] = rslt.getString(22, 3);
               ((int[]) buf[32])[0] = rslt.getInt(23);
               ((byte[]) buf[33])[0] = rslt.getByte(24);
               ((byte[]) buf[34])[0] = rslt.getByte(25);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(28,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(29,2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 18);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 18);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(7);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 60);
               ((String[]) buf[21])[0] = rslt.getString(22, 3);
               ((String[]) buf[22])[0] = rslt.getString(23, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 32 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 36 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 9 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 14 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setDate(2, (java.util.Date)parms[2]);
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setString(4, (String)parms[4], 1);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setVarchar(6, (String)parms[6], 20, false);
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(9, (String)parms[9], 30);
               stmt.setString(10, (String)parms[10], 30);
               stmt.setByte(11, ((Number) parms[11]).byteValue());
               stmt.setString(12, (String)parms[12], 3);
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setByte(14, ((Number) parms[14]).byteValue());
               return;
            case 20 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setVarchar(5, (String)parms[4], 20, false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 2);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setString(9, (String)parms[8], 30);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[14]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 22 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 5);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setDate(8, (java.util.Date)parms[8]);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               stmt.setInt(10, ((Number) parms[10]).intValue());
               stmt.setInt(11, ((Number) parms[11]).intValue());
               stmt.setShort(12, ((Number) parms[12]).shortValue());
               stmt.setInt(13, ((Number) parms[13]).intValue());
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               stmt.setInt(16, ((Number) parms[16]).intValue());
               stmt.setDate(17, (java.util.Date)parms[17]);
               stmt.setString(18, (String)parms[18], 60);
               stmt.setString(19, (String)parms[19], 3);
               stmt.setString(20, (String)parms[20], 6);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setString(17, (String)parms[16], 60);
               stmt.setString(18, (String)parms[17], 3);
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[19]).intValue());
               }
               stmt.setString(20, (String)parms[20], 6);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 39 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

