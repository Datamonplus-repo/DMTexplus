package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class defectos_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV24Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
         AV16Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
         AV17Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
         AV15Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Inc_obs", AV15Inc_obs);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_1UY37( Gx_mode, A396EmprCod, AV24Pgmname, AV16Usurcod, AV17Station, AV15Inc_obs, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV24Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
         AV16Usurcod = httpContext.GetPar( "Usurcod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
         AV17Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
         AV15Inc_obs = httpContext.GetPar( "Inc_obs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Inc_obs", AV15Inc_obs);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_1UY37( Gx_mode, A396EmprCod, AV24Pgmname, AV16Usurcod, AV17Station, AV15Inc_obs, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
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
         gxload_18( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A833TipDefCod = (short)(GXutil.lval( httpContext.GetPar( "TipDefCod"))) ;
         n833TipDefCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A833TipDefCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_tipdef") == 0 )
      {
         gxnrgridlevel_tipdef_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Defectos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_tipdef_newrow_invoke( )
   {
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      edtDefResp_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefResp_Internalname, "Horizontalalignment", edtDefResp_Horizontalalignment, !bGXsfl_35_Refreshing);
      edtDefCausa_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefCausa_Internalname, "Horizontalalignment", edtDefCausa_Horizontalalignment, !bGXsfl_35_Refreshing);
      edtTipDefCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Horizontalalignment", edtTipDefCod_Horizontalalignment, !bGXsfl_35_Refreshing);
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_tipdef_newrow( ) ;
      /* End function gxnrGridlevel_tipdef_newrow_invoke */
   }

   public defectos_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public defectos_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( defectos_trn_impl.class ));
   }

   public defectos_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Nº Disp. Int.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Defectos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSumPor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSumPor_Internalname, httpContext.getMessage( "Total %", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSumPor_Internalname, GXutil.ltrim( localUtil.ntoc( A828SumPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSumPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A828SumPor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A828SumPor), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSumPor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSumPor_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Defectos_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_tipdef_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_tipdef( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Defectos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Defectos_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Defectos_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV24Pgmname), GXutil.rtrim( localUtil.format( AV24Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Defectos_TRN.htm");
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
      ucCombo_tipdefcod.setProperty("Caption", Combo_tipdefcod_Caption);
      ucCombo_tipdefcod.setProperty("Cls", Combo_tipdefcod_Cls);
      ucCombo_tipdefcod.setProperty("IsGridItem", Combo_tipdefcod_Isgriditem);
      ucCombo_tipdefcod.setProperty("EmptyItem", Combo_tipdefcod_Emptyitem);
      ucCombo_tipdefcod.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
      ucCombo_tipdefcod.setProperty("DropDownOptionsData", AV12TipDefCod_Data);
      ucCombo_tipdefcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipdefcod_Internalname, "COMBO_TIPDEFCODContainer");
      /* User Defined Control */
      ucCombo_defmaqcod.setProperty("Caption", Combo_defmaqcod_Caption);
      ucCombo_defmaqcod.setProperty("Cls", Combo_defmaqcod_Cls);
      ucCombo_defmaqcod.setProperty("IsGridItem", Combo_defmaqcod_Isgriditem);
      ucCombo_defmaqcod.setProperty("EmptyItemText", Combo_defmaqcod_Emptyitemtext);
      ucCombo_defmaqcod.setProperty("DropDownOptionsData", AV18DefMaqcod_Data);
      ucCombo_defmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_defmaqcod_Internalname, "COMBO_DEFMAQCODContainer");
      /* User Defined Control */
      ucCombo_defcausa.setProperty("Caption", Combo_defcausa_Caption);
      ucCombo_defcausa.setProperty("Cls", Combo_defcausa_Cls);
      ucCombo_defcausa.setProperty("IsGridItem", Combo_defcausa_Isgriditem);
      ucCombo_defcausa.setProperty("EmptyItemText", Combo_defcausa_Emptyitemtext);
      ucCombo_defcausa.setProperty("DropDownOptionsData", AV19DefCausa_Data);
      ucCombo_defcausa.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_defcausa_Internalname, "COMBO_DEFCAUSAContainer");
      /* User Defined Control */
      ucCombo_defresp.setProperty("Caption", Combo_defresp_Caption);
      ucCombo_defresp.setProperty("Cls", Combo_defresp_Cls);
      ucCombo_defresp.setProperty("IsGridItem", Combo_defresp_Isgriditem);
      ucCombo_defresp.setProperty("EmptyItemText", Combo_defresp_Emptyitemtext);
      ucCombo_defresp.setProperty("DropDownOptionsData", AV20DefResp_Data);
      ucCombo_defresp.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_defresp_Internalname, "COMBO_DEFRESPContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_tipdef( )
   {
      /*  Grid Control  */
      startgridcontrol35( ) ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount37 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_37 = (short)(1) ;
            scanStart1UY37( ) ;
            while ( RcdFound37 != 0 )
            {
               init_level_properties37( ) ;
               getByPrimaryKey1UY37( ) ;
               addRow1UY37( ) ;
               scanNext1UY37( ) ;
            }
            scanEnd1UY37( ) ;
            nBlankRcdCount37 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B828SumPor = A828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         standaloneNotModal1UY37( ) ;
         standaloneModal1UY37( ) ;
         sMode37 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRow1UY37( ) ;
            edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtTipDefCod_Horizontalalignment = httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_35_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Horizontalalignment", edtTipDefCod_Horizontalalignment, !bGXsfl_35_Refreshing);
            edtDefPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFPOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefPor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtDefMaqcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFMAQCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefMaqcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtDefCausa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFCAUSA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefCausa_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtDefCausa_Horizontalalignment = httpContext.cgiGet( "DEFCAUSA_"+sGXsfl_35_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefCausa_Internalname, "Horizontalalignment", edtDefCausa_Horizontalalignment, !bGXsfl_35_Refreshing);
            edtDefResp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFRESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefResp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefResp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtDefResp_Horizontalalignment = httpContext.cgiGet( "DEFRESP_"+sGXsfl_35_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDefResp_Internalname, "Horizontalalignment", edtDefResp_Horizontalalignment, !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_37 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UY37( ) ;
            }
            sendRow1UY37( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A828SumPor = B828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount37 = (short)(2) ;
         nRcdExists_37 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UY37( ) ;
            while ( RcdFound37 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3537( ) ;
               init_level_properties37( ) ;
               standaloneNotModal1UY37( ) ;
               getByPrimaryKey1UY37( ) ;
               standaloneModal1UY37( ) ;
               addRow1UY37( ) ;
               scanNext1UY37( ) ;
            }
            scanEnd1UY37( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode37 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3537( ) ;
         initAll1UY37( ) ;
         init_level_properties37( ) ;
         B828SumPor = A828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         nRcdExists_37 = (short)(0) ;
         nIsMod_37 = (short)(0) ;
         nRcdDeleted_37 = (short)(0) ;
         nBlankRcdCount37 = (short)(nBlankRcdUsr37+nBlankRcdCount37) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount37 > 0 )
         {
            standaloneNotModal1UY37( ) ;
            standaloneModal1UY37( ) ;
            addRow1UY37( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTipDefCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount37 = (short)(nBlankRcdCount37-1) ;
         }
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A828SumPor = B828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_tipdefContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_tipdef", Gridlevel_tipdefContainer, subGridlevel_tipdef_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_tipdefContainerData", Gridlevel_tipdefContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_tipdefContainerData"+"V", Gridlevel_tipdefContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_tipdefContainerData"+"V"+"\" value='"+Gridlevel_tipdefContainer.GridValuesHidden()+"'/>") ;
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
      e111UY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV22DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPDEFCOD_DATA"), AV12TipDefCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDEFMAQCOD_DATA"), AV18DefMaqcod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDEFCAUSA_DATA"), AV19DefCausa_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDEFRESP_DATA"), AV20DefResp_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O828SumPor = (short)(localUtil.ctol( httpContext.cgiGet( "O828SumPor"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14Olddef = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDDEF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A834TipDefDsc = httpContext.cgiGet( "TIPDEFDSC") ;
            n834TipDefDsc = false ;
            AV15Inc_obs = httpContext.cgiGet( "vINC_OBS") ;
            AV16Usurcod = httpContext.cgiGet( "vUSURCOD") ;
            AV17Station = httpContext.cgiGet( "vSTATION") ;
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
            Combo_tipdefcod_Objectcall = httpContext.cgiGet( "COMBO_TIPDEFCOD_Objectcall") ;
            Combo_tipdefcod_Class = httpContext.cgiGet( "COMBO_TIPDEFCOD_Class") ;
            Combo_tipdefcod_Icontype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Icontype") ;
            Combo_tipdefcod_Icon = httpContext.cgiGet( "COMBO_TIPDEFCOD_Icon") ;
            Combo_tipdefcod_Caption = httpContext.cgiGet( "COMBO_TIPDEFCOD_Caption") ;
            Combo_tipdefcod_Tooltip = httpContext.cgiGet( "COMBO_TIPDEFCOD_Tooltip") ;
            Combo_tipdefcod_Cls = httpContext.cgiGet( "COMBO_TIPDEFCOD_Cls") ;
            Combo_tipdefcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedvalue_set") ;
            Combo_tipdefcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedvalue_get") ;
            Combo_tipdefcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedtext_set") ;
            Combo_tipdefcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectedtext_get") ;
            Combo_tipdefcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TIPDEFCOD_Gamoauthtoken") ;
            Combo_tipdefcod_Ddointernalname = httpContext.cgiGet( "COMBO_TIPDEFCOD_Ddointernalname") ;
            Combo_tipdefcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TIPDEFCOD_Titlecontrolalign") ;
            Combo_tipdefcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Dropdownoptionstype") ;
            Combo_tipdefcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Enabled")) ;
            Combo_tipdefcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Visible")) ;
            Combo_tipdefcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TIPDEFCOD_Titlecontrolidtoreplace") ;
            Combo_tipdefcod_Datalisttype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalisttype") ;
            Combo_tipdefcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Allowmultipleselection")) ;
            Combo_tipdefcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistfixedvalues") ;
            Combo_tipdefcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Isgriditem")) ;
            Combo_tipdefcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Hasdescription")) ;
            Combo_tipdefcod_Datalistproc = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistproc") ;
            Combo_tipdefcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistprocparametersprefix") ;
            Combo_tipdefcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TIPDEFCOD_Remoteservicesparameters") ;
            Combo_tipdefcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPDEFCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tipdefcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Includeonlyselectedoption")) ;
            Combo_tipdefcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Includeselectalloption")) ;
            Combo_tipdefcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Emptyitem")) ;
            Combo_tipdefcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPDEFCOD_Includeaddnewoption")) ;
            Combo_tipdefcod_Htmltemplate = httpContext.cgiGet( "COMBO_TIPDEFCOD_Htmltemplate") ;
            Combo_tipdefcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPDEFCOD_Multiplevaluestype") ;
            Combo_tipdefcod_Loadingdata = httpContext.cgiGet( "COMBO_TIPDEFCOD_Loadingdata") ;
            Combo_tipdefcod_Noresultsfound = httpContext.cgiGet( "COMBO_TIPDEFCOD_Noresultsfound") ;
            Combo_tipdefcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPDEFCOD_Emptyitemtext") ;
            Combo_tipdefcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TIPDEFCOD_Onlyselectedvalues") ;
            Combo_tipdefcod_Selectalltext = httpContext.cgiGet( "COMBO_TIPDEFCOD_Selectalltext") ;
            Combo_tipdefcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TIPDEFCOD_Multiplevaluesseparator") ;
            Combo_tipdefcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TIPDEFCOD_Addnewoptiontext") ;
            Combo_defmaqcod_Objectcall = httpContext.cgiGet( "COMBO_DEFMAQCOD_Objectcall") ;
            Combo_defmaqcod_Class = httpContext.cgiGet( "COMBO_DEFMAQCOD_Class") ;
            Combo_defmaqcod_Icontype = httpContext.cgiGet( "COMBO_DEFMAQCOD_Icontype") ;
            Combo_defmaqcod_Icon = httpContext.cgiGet( "COMBO_DEFMAQCOD_Icon") ;
            Combo_defmaqcod_Caption = httpContext.cgiGet( "COMBO_DEFMAQCOD_Caption") ;
            Combo_defmaqcod_Tooltip = httpContext.cgiGet( "COMBO_DEFMAQCOD_Tooltip") ;
            Combo_defmaqcod_Cls = httpContext.cgiGet( "COMBO_DEFMAQCOD_Cls") ;
            Combo_defmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_DEFMAQCOD_Selectedvalue_set") ;
            Combo_defmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_DEFMAQCOD_Selectedvalue_get") ;
            Combo_defmaqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_DEFMAQCOD_Selectedtext_set") ;
            Combo_defmaqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_DEFMAQCOD_Selectedtext_get") ;
            Combo_defmaqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_DEFMAQCOD_Gamoauthtoken") ;
            Combo_defmaqcod_Ddointernalname = httpContext.cgiGet( "COMBO_DEFMAQCOD_Ddointernalname") ;
            Combo_defmaqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_DEFMAQCOD_Titlecontrolalign") ;
            Combo_defmaqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_DEFMAQCOD_Dropdownoptionstype") ;
            Combo_defmaqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Enabled")) ;
            Combo_defmaqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Visible")) ;
            Combo_defmaqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_DEFMAQCOD_Titlecontrolidtoreplace") ;
            Combo_defmaqcod_Datalisttype = httpContext.cgiGet( "COMBO_DEFMAQCOD_Datalisttype") ;
            Combo_defmaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Allowmultipleselection")) ;
            Combo_defmaqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_DEFMAQCOD_Datalistfixedvalues") ;
            Combo_defmaqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Isgriditem")) ;
            Combo_defmaqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Hasdescription")) ;
            Combo_defmaqcod_Datalistproc = httpContext.cgiGet( "COMBO_DEFMAQCOD_Datalistproc") ;
            Combo_defmaqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_DEFMAQCOD_Datalistprocparametersprefix") ;
            Combo_defmaqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_DEFMAQCOD_Remoteservicesparameters") ;
            Combo_defmaqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_DEFMAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_defmaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Includeonlyselectedoption")) ;
            Combo_defmaqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Includeselectalloption")) ;
            Combo_defmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Emptyitem")) ;
            Combo_defmaqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFMAQCOD_Includeaddnewoption")) ;
            Combo_defmaqcod_Htmltemplate = httpContext.cgiGet( "COMBO_DEFMAQCOD_Htmltemplate") ;
            Combo_defmaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_DEFMAQCOD_Multiplevaluestype") ;
            Combo_defmaqcod_Loadingdata = httpContext.cgiGet( "COMBO_DEFMAQCOD_Loadingdata") ;
            Combo_defmaqcod_Noresultsfound = httpContext.cgiGet( "COMBO_DEFMAQCOD_Noresultsfound") ;
            Combo_defmaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_DEFMAQCOD_Emptyitemtext") ;
            Combo_defmaqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_DEFMAQCOD_Onlyselectedvalues") ;
            Combo_defmaqcod_Selectalltext = httpContext.cgiGet( "COMBO_DEFMAQCOD_Selectalltext") ;
            Combo_defmaqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_DEFMAQCOD_Multiplevaluesseparator") ;
            Combo_defmaqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_DEFMAQCOD_Addnewoptiontext") ;
            Combo_defcausa_Objectcall = httpContext.cgiGet( "COMBO_DEFCAUSA_Objectcall") ;
            Combo_defcausa_Class = httpContext.cgiGet( "COMBO_DEFCAUSA_Class") ;
            Combo_defcausa_Icontype = httpContext.cgiGet( "COMBO_DEFCAUSA_Icontype") ;
            Combo_defcausa_Icon = httpContext.cgiGet( "COMBO_DEFCAUSA_Icon") ;
            Combo_defcausa_Caption = httpContext.cgiGet( "COMBO_DEFCAUSA_Caption") ;
            Combo_defcausa_Tooltip = httpContext.cgiGet( "COMBO_DEFCAUSA_Tooltip") ;
            Combo_defcausa_Cls = httpContext.cgiGet( "COMBO_DEFCAUSA_Cls") ;
            Combo_defcausa_Selectedvalue_set = httpContext.cgiGet( "COMBO_DEFCAUSA_Selectedvalue_set") ;
            Combo_defcausa_Selectedvalue_get = httpContext.cgiGet( "COMBO_DEFCAUSA_Selectedvalue_get") ;
            Combo_defcausa_Selectedtext_set = httpContext.cgiGet( "COMBO_DEFCAUSA_Selectedtext_set") ;
            Combo_defcausa_Selectedtext_get = httpContext.cgiGet( "COMBO_DEFCAUSA_Selectedtext_get") ;
            Combo_defcausa_Gamoauthtoken = httpContext.cgiGet( "COMBO_DEFCAUSA_Gamoauthtoken") ;
            Combo_defcausa_Ddointernalname = httpContext.cgiGet( "COMBO_DEFCAUSA_Ddointernalname") ;
            Combo_defcausa_Titlecontrolalign = httpContext.cgiGet( "COMBO_DEFCAUSA_Titlecontrolalign") ;
            Combo_defcausa_Dropdownoptionstype = httpContext.cgiGet( "COMBO_DEFCAUSA_Dropdownoptionstype") ;
            Combo_defcausa_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Enabled")) ;
            Combo_defcausa_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Visible")) ;
            Combo_defcausa_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_DEFCAUSA_Titlecontrolidtoreplace") ;
            Combo_defcausa_Datalisttype = httpContext.cgiGet( "COMBO_DEFCAUSA_Datalisttype") ;
            Combo_defcausa_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Allowmultipleselection")) ;
            Combo_defcausa_Datalistfixedvalues = httpContext.cgiGet( "COMBO_DEFCAUSA_Datalistfixedvalues") ;
            Combo_defcausa_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Isgriditem")) ;
            Combo_defcausa_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Hasdescription")) ;
            Combo_defcausa_Datalistproc = httpContext.cgiGet( "COMBO_DEFCAUSA_Datalistproc") ;
            Combo_defcausa_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_DEFCAUSA_Datalistprocparametersprefix") ;
            Combo_defcausa_Remoteservicesparameters = httpContext.cgiGet( "COMBO_DEFCAUSA_Remoteservicesparameters") ;
            Combo_defcausa_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_DEFCAUSA_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_defcausa_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Includeonlyselectedoption")) ;
            Combo_defcausa_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Includeselectalloption")) ;
            Combo_defcausa_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Emptyitem")) ;
            Combo_defcausa_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFCAUSA_Includeaddnewoption")) ;
            Combo_defcausa_Htmltemplate = httpContext.cgiGet( "COMBO_DEFCAUSA_Htmltemplate") ;
            Combo_defcausa_Multiplevaluestype = httpContext.cgiGet( "COMBO_DEFCAUSA_Multiplevaluestype") ;
            Combo_defcausa_Loadingdata = httpContext.cgiGet( "COMBO_DEFCAUSA_Loadingdata") ;
            Combo_defcausa_Noresultsfound = httpContext.cgiGet( "COMBO_DEFCAUSA_Noresultsfound") ;
            Combo_defcausa_Emptyitemtext = httpContext.cgiGet( "COMBO_DEFCAUSA_Emptyitemtext") ;
            Combo_defcausa_Onlyselectedvalues = httpContext.cgiGet( "COMBO_DEFCAUSA_Onlyselectedvalues") ;
            Combo_defcausa_Selectalltext = httpContext.cgiGet( "COMBO_DEFCAUSA_Selectalltext") ;
            Combo_defcausa_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_DEFCAUSA_Multiplevaluesseparator") ;
            Combo_defcausa_Addnewoptiontext = httpContext.cgiGet( "COMBO_DEFCAUSA_Addnewoptiontext") ;
            Combo_defresp_Objectcall = httpContext.cgiGet( "COMBO_DEFRESP_Objectcall") ;
            Combo_defresp_Class = httpContext.cgiGet( "COMBO_DEFRESP_Class") ;
            Combo_defresp_Icontype = httpContext.cgiGet( "COMBO_DEFRESP_Icontype") ;
            Combo_defresp_Icon = httpContext.cgiGet( "COMBO_DEFRESP_Icon") ;
            Combo_defresp_Caption = httpContext.cgiGet( "COMBO_DEFRESP_Caption") ;
            Combo_defresp_Tooltip = httpContext.cgiGet( "COMBO_DEFRESP_Tooltip") ;
            Combo_defresp_Cls = httpContext.cgiGet( "COMBO_DEFRESP_Cls") ;
            Combo_defresp_Selectedvalue_set = httpContext.cgiGet( "COMBO_DEFRESP_Selectedvalue_set") ;
            Combo_defresp_Selectedvalue_get = httpContext.cgiGet( "COMBO_DEFRESP_Selectedvalue_get") ;
            Combo_defresp_Selectedtext_set = httpContext.cgiGet( "COMBO_DEFRESP_Selectedtext_set") ;
            Combo_defresp_Selectedtext_get = httpContext.cgiGet( "COMBO_DEFRESP_Selectedtext_get") ;
            Combo_defresp_Gamoauthtoken = httpContext.cgiGet( "COMBO_DEFRESP_Gamoauthtoken") ;
            Combo_defresp_Ddointernalname = httpContext.cgiGet( "COMBO_DEFRESP_Ddointernalname") ;
            Combo_defresp_Titlecontrolalign = httpContext.cgiGet( "COMBO_DEFRESP_Titlecontrolalign") ;
            Combo_defresp_Dropdownoptionstype = httpContext.cgiGet( "COMBO_DEFRESP_Dropdownoptionstype") ;
            Combo_defresp_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Enabled")) ;
            Combo_defresp_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Visible")) ;
            Combo_defresp_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_DEFRESP_Titlecontrolidtoreplace") ;
            Combo_defresp_Datalisttype = httpContext.cgiGet( "COMBO_DEFRESP_Datalisttype") ;
            Combo_defresp_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Allowmultipleselection")) ;
            Combo_defresp_Datalistfixedvalues = httpContext.cgiGet( "COMBO_DEFRESP_Datalistfixedvalues") ;
            Combo_defresp_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Isgriditem")) ;
            Combo_defresp_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Hasdescription")) ;
            Combo_defresp_Datalistproc = httpContext.cgiGet( "COMBO_DEFRESP_Datalistproc") ;
            Combo_defresp_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_DEFRESP_Datalistprocparametersprefix") ;
            Combo_defresp_Remoteservicesparameters = httpContext.cgiGet( "COMBO_DEFRESP_Remoteservicesparameters") ;
            Combo_defresp_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_DEFRESP_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_defresp_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Includeonlyselectedoption")) ;
            Combo_defresp_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Includeselectalloption")) ;
            Combo_defresp_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Emptyitem")) ;
            Combo_defresp_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_DEFRESP_Includeaddnewoption")) ;
            Combo_defresp_Htmltemplate = httpContext.cgiGet( "COMBO_DEFRESP_Htmltemplate") ;
            Combo_defresp_Multiplevaluestype = httpContext.cgiGet( "COMBO_DEFRESP_Multiplevaluestype") ;
            Combo_defresp_Loadingdata = httpContext.cgiGet( "COMBO_DEFRESP_Loadingdata") ;
            Combo_defresp_Noresultsfound = httpContext.cgiGet( "COMBO_DEFRESP_Noresultsfound") ;
            Combo_defresp_Emptyitemtext = httpContext.cgiGet( "COMBO_DEFRESP_Emptyitemtext") ;
            Combo_defresp_Onlyselectedvalues = httpContext.cgiGet( "COMBO_DEFRESP_Onlyselectedvalues") ;
            Combo_defresp_Selectalltext = httpContext.cgiGet( "COMBO_DEFRESP_Selectalltext") ;
            Combo_defresp_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_DEFRESP_Multiplevaluesseparator") ;
            Combo_defresp_Addnewoptiontext = httpContext.cgiGet( "COMBO_DEFRESP_Addnewoptiontext") ;
            /* Read variables values. */
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            A828SumPor = (short)(localUtil.ctol( httpContext.cgiGet( edtSumPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            AV24Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Defectos_TRN");
            A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A361DisCod != Z361DisCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("defectos_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1UY0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DISCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisCod_Internalname ;
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
                        e111UY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UY2 ();
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
         e121UY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UY34( ) ;
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
         disableAttributes1UY34( ) ;
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

   public void confirm_1UY0( )
   {
      beforeValidate1UY34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UY34( ) ;
         }
         else
         {
            checkExtendedTable1UY34( ) ;
            closeExtendedTableCursors1UY34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_1UY37( ) ;
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

   public void confirm_1UY37( )
   {
      s828SumPor = O828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1UY37( ) ;
         if ( ( nRcdExists_37 != 0 ) || ( nIsMod_37 != 0 ) )
         {
            getKey1UY37( ) ;
            if ( ( nRcdExists_37 == 0 ) && ( nRcdDeleted_37 == 0 ) )
            {
               if ( RcdFound37 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UY37( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UY37( ) ;
                     closeExtendedTableCursors1UY37( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O828SumPor = A828SumPor ;
                     n828SumPor = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                  }
               }
               else
               {
                  GXCCtl = "TIPDEFCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipDefCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound37 != 0 )
               {
                  if ( nRcdDeleted_37 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UY37( ) ;
                     load1UY37( ) ;
                     beforeValidate1UY37( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UY37( ) ;
                        O828SumPor = A828SumPor ;
                        n828SumPor = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_37 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UY37( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UY37( ) ;
                           closeExtendedTableCursors1UY37( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O828SumPor = A828SumPor ;
                           n828SumPor = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_37 == 0 )
                  {
                     GXCCtl = "TIPDEFCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefPor_Internalname, GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefMaqcod_Internalname, GXutil.rtrim( A14357DefMaqcod)) ;
         httpContext.changePostValue( edtDefCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A14358DefCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefResp_Internalname, GXutil.ltrim( localUtil.ntoc( A14359DefResp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z319DefPor_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14357DefMaqcod_"+sGXsfl_35_idx, GXutil.rtrim( Z14357DefMaqcod)) ;
         httpContext.changePostValue( "ZT_"+"Z14358DefCausa_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z14358DefCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14359DefResp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z14359DefResp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T833TipDefCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T319DefPor_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_37_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_37_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_37_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_37 != 0 )
         {
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtTipDefCod_Horizontalalignment)) ;
            httpContext.changePostValue( "DEFPOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFMAQCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefMaqcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFCAUSA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefCausa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFCAUSA_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtDefCausa_Horizontalalignment)) ;
            httpContext.changePostValue( "DEFRESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefResp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFRESP_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtDefResp_Horizontalalignment)) ;
         }
      }
      O828SumPor = s828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UY0( )
   {
   }

   public void e111UY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      defectos_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Station", AV17Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char3, GXv_char4) ;
      defectos_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      defectos_trn_impl.this.AV21EmprNom = GXv_char3[0] ;
      defectos_trn_impl.this.AV16Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_defresp_Titlecontrolidtoreplace = edtDefResp_Internalname ;
      ucCombo_defresp.sendProperty(context, "", false, Combo_defresp_Internalname, "TitleControlIdToReplace", Combo_defresp_Titlecontrolidtoreplace);
      edtDefResp_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefResp_Internalname, "Horizontalalignment", edtDefResp_Horizontalalignment, !bGXsfl_35_Refreshing);
      Combo_defcausa_Titlecontrolidtoreplace = edtDefCausa_Internalname ;
      ucCombo_defcausa.sendProperty(context, "", false, Combo_defcausa_Internalname, "TitleControlIdToReplace", Combo_defcausa_Titlecontrolidtoreplace);
      edtDefCausa_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefCausa_Internalname, "Horizontalalignment", edtDefCausa_Horizontalalignment, !bGXsfl_35_Refreshing);
      Combo_defmaqcod_Titlecontrolidtoreplace = edtDefMaqcod_Internalname ;
      ucCombo_defmaqcod.sendProperty(context, "", false, Combo_defmaqcod_Internalname, "TitleControlIdToReplace", Combo_defmaqcod_Titlecontrolidtoreplace);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV22DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV22DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_tipdefcod_Titlecontrolidtoreplace = edtTipDefCod_Internalname ;
      ucCombo_tipdefcod.sendProperty(context, "", false, Combo_tipdefcod_Internalname, "TitleControlIdToReplace", Combo_tipdefcod_Titlecontrolidtoreplace);
      edtTipDefCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Horizontalalignment", edtTipDefCod_Horizontalalignment, !bGXsfl_35_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOTIPDEFCOD' */
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
      /* Execute user subroutine: 'LOADCOMBODEFMAQCOD' */
      S122 ();
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
      /* Execute user subroutine: 'LOADCOMBODEFCAUSA' */
      S132 ();
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
      /* Execute user subroutine: 'LOADCOMBODEFRESP' */
      S142 ();
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
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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

   public void S142( )
   {
      /* 'LOADCOMBODEFRESP' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV20DefResp_Data ;
      GXv_char4[0] = AV13ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.defectos_trnloaddvcombo(remoteHandle, context).execute( "DefResp", Gx_mode, AV7EmprCod, AV8DisCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      defectos_trn_impl.this.AV13ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV20DefResp_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S132( )
   {
      /* 'LOADCOMBODEFCAUSA' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV19DefCausa_Data ;
      GXv_char4[0] = AV13ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.defectos_trnloaddvcombo(remoteHandle, context).execute( "DefCausa", Gx_mode, AV7EmprCod, AV8DisCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      defectos_trn_impl.this.AV13ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV19DefCausa_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S122( )
   {
      /* 'LOADCOMBODEFMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV18DefMaqcod_Data ;
      GXv_char4[0] = AV13ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.defectos_trnloaddvcombo(remoteHandle, context).execute( "DefMaqcod", Gx_mode, AV7EmprCod, AV8DisCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      defectos_trn_impl.this.AV13ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV18DefMaqcod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOTIPDEFCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV12TipDefCod_Data ;
      GXv_char4[0] = AV13ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.defectos_trnloaddvcombo(remoteHandle, context).execute( "TipDefCod", Gx_mode, AV7EmprCod, AV8DisCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      defectos_trn_impl.this.AV13ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV12TipDefCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void zm1UY34( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -16 )
      {
         Z361DisCod = A361DisCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z828SumPor = A828SumPor ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtSumPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPor_Enabled), 5, 0), true);
      AV24Pgmname = "Defectos_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Pgmname", AV24Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtSumPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPor_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UY7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UY7_A407EmprNom[0] ;
      n407EmprNom = T01UY7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV8DisCod) )
      {
         A361DisCod = AV8DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
         /* Using cursor T01UY9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(6) != 101) )
         {
            A828SumPor = T01UY9_A828SumPor[0] ;
            n828SumPor = T01UY9_n828SumPor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            A828SumPor = (short)(0) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         O828SumPor = A828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         pr_default.close(6);
      }
   }

   public void load1UY34( )
   {
      /* Using cursor T01UY11 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A407EmprNom = T01UY11_A407EmprNom[0] ;
         n407EmprNom = T01UY11_n407EmprNom[0] ;
         A828SumPor = T01UY11_A828SumPor[0] ;
         n828SumPor = T01UY11_n828SumPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         zm1UY34( -16) ;
      }
      pr_default.close(7);
      onLoadActions1UY34( ) ;
   }

   public void onLoadActions1UY34( )
   {
      O828SumPor = A828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
   }

   public void checkExtendedTable1UY34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01UY9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A828SumPor = T01UY9_A828SumPor[0] ;
         n828SumPor = T01UY9_n828SumPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         nIsDirty_34 = (short)(1) ;
         A828SumPor = (short)(0) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      pr_default.close(6);
      if ( A828SumPor > 100 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La suma de porcentajes no puede ser superior a 100", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1UY34( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01UY13 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A828SumPor = T01UY13_A828SumPor[0] ;
         n828SumPor = T01UY13_n828SumPor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         A828SumPor = (short)(0) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A828SumPor, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1UY34( )
   {
      /* Using cursor T01UY14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1UY34( 16) ;
         RcdFound34 = (short)(1) ;
         A361DisCod = T01UY6_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A396EmprCod = T01UY6_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UY34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey1UY34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey1UY34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1UY34( ) ;
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
      /* Using cursor T01UY15 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UY15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UY15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UY15_A361DisCod[0] < A361DisCod ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UY15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UY15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UY15_A361DisCod[0] > A361DisCod ) ) )
         {
            A396EmprCod = T01UY15_A396EmprCod[0] ;
            A361DisCod = T01UY15_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T01UY16 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UY16_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UY16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UY16_A361DisCod[0] > A361DisCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01UY16_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UY16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UY16_A361DisCod[0] < A361DisCod ) ) )
         {
            A396EmprCod = T01UY16_A396EmprCod[0] ;
            A361DisCod = T01UY16_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UY34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A828SumPor = O828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         insert1UY34( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               update1UY34( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               /* Insert record */
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               insert1UY34( ) ;
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
                  A828SumPor = O828SumPor ;
                  n828SumPor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
                  insert1UY34( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A828SumPor = O828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UY34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UY5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UY34( )
   {
      beforeValidate1UY34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UY34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UY34( 0) ;
         checkOptimisticConcurrency1UY34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UY34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UY34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UY17 */
                  pr_default.execute(12, new Object[] {Integer.valueOf(A361DisCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel1UY34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UY0( ) ;
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
            load1UY34( ) ;
         }
         endLevel1UY34( ) ;
      }
      closeExtendedTableCursors1UY34( ) ;
   }

   public void update1UY34( )
   {
      beforeValidate1UY34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UY34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UY34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UY34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UY34( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPDISPOS */
                  deferredUpdate1UY34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int10[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
                     defectos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                     defectos_trn_impl.this.A361DisCod = GXv_int10[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UY34( ) ;
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
         endLevel1UY34( ) ;
      }
      closeExtendedTableCursors1UY34( ) ;
   }

   public void deferredUpdate1UY34( )
   {
   }

   public void delete( )
   {
      beforeValidate1UY34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UY34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UY34( ) ;
         afterConfirm1UY34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UY34( ) ;
            if ( AnyError == 0 )
            {
               A828SumPor = O828SumPor ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               scanStart1UY37( ) ;
               while ( RcdFound37 != 0 )
               {
                  getByPrimaryKey1UY37( ) ;
                  delete1UY37( ) ;
                  scanNext1UY37( ) ;
                  O828SumPor = A828SumPor ;
                  n828SumPor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               }
               scanEnd1UY37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UY18 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
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
      endLevel1UY34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UY34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UY20 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            A828SumPor = T01UY20_A828SumPor[0] ;
            n828SumPor = T01UY20_n828SumPor[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            A828SumPor = (short)(0) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UY21 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01UY22 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01UY23 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01UY24 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01UY25 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01UY26 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01UY27 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01UY28 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01UY29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSERV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01UY30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01UY31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01UY32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel1UY37( )
   {
      s828SumPor = O828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRow1UY37( ) ;
         if ( ( nRcdExists_37 != 0 ) || ( nIsMod_37 != 0 ) )
         {
            standaloneNotModal1UY37( ) ;
            getKey1UY37( ) ;
            if ( ( nRcdExists_37 == 0 ) && ( nRcdDeleted_37 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UY37( ) ;
            }
            else
            {
               if ( RcdFound37 != 0 )
               {
                  if ( ( nRcdDeleted_37 != 0 ) && ( nRcdExists_37 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UY37( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_37 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UY37( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_37 == 0 )
                  {
                     GXCCtl = "TIPDEFCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipDefCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O828SumPor = A828SumPor ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         httpContext.changePostValue( edtTipDefCod_Internalname, GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefPor_Internalname, GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefMaqcod_Internalname, GXutil.rtrim( A14357DefMaqcod)) ;
         httpContext.changePostValue( edtDefCausa_Internalname, GXutil.ltrim( localUtil.ntoc( A14358DefCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDefResp_Internalname, GXutil.ltrim( localUtil.ntoc( A14359DefResp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z319DefPor_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14357DefMaqcod_"+sGXsfl_35_idx, GXutil.rtrim( Z14357DefMaqcod)) ;
         httpContext.changePostValue( "ZT_"+"Z14358DefCausa_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z14358DefCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14359DefResp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z14359DefResp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T833TipDefCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T319DefPor_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_37_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_37_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_37_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_37 != 0 )
         {
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPDEFCOD_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtTipDefCod_Horizontalalignment)) ;
            httpContext.changePostValue( "DEFPOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFMAQCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefMaqcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFCAUSA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefCausa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFCAUSA_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtDefCausa_Horizontalalignment)) ;
            httpContext.changePostValue( "DEFRESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefResp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEFRESP_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtDefResp_Horizontalalignment)) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UY37( ) ;
      if ( AnyError != 0 )
      {
         O828SumPor = s828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      nRcdExists_37 = (short)(0) ;
      nIsMod_37 = (short)(0) ;
      nRcdDeleted_37 = (short)(0) ;
   }

   public void processLevel1UY34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel1UY37( ) ;
      if ( AnyError != 0 )
      {
         O828SumPor = s828SumPor ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1UY34( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UY34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "defectos_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "defectos_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UY34( )
   {
      /* Scan By routine */
      /* Using cursor T01UY33 */
      pr_default.execute(27);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01UY33_A396EmprCod[0] ;
         A361DisCod = T01UY33_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UY34( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T01UY33_A396EmprCod[0] ;
         A361DisCod = T01UY33_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void scanEnd1UY34( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1UY34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UY34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UY34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UY34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UY34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UY34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UY34( )
   {
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtSumPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPor_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1UY37( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z319DefPor = T01UY3_A319DefPor[0] ;
            Z14357DefMaqcod = T01UY3_A14357DefMaqcod[0] ;
            Z14358DefCausa = T01UY3_A14358DefCausa[0] ;
            Z14359DefResp = T01UY3_A14359DefResp[0] ;
         }
         else
         {
            Z319DefPor = A319DefPor ;
            Z14357DefMaqcod = A14357DefMaqcod ;
            Z14358DefCausa = A14358DefCausa ;
            Z14359DefResp = A14359DefResp ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z361DisCod = A361DisCod ;
         Z319DefPor = A319DefPor ;
         Z14357DefMaqcod = A14357DefMaqcod ;
         Z14358DefCausa = A14358DefCausa ;
         Z14359DefResp = A14359DefResp ;
         Z396EmprCod = A396EmprCod ;
         Z833TipDefCod = A833TipDefCod ;
         Z834TipDefDsc = A834TipDefDsc ;
      }
   }

   public void standaloneNotModal1UY37( )
   {
      edtSumPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPor_Enabled), 5, 0), true);
      edtSumPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSumPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSumPor_Enabled), 5, 0), true);
   }

   public void standaloneModal1UY37( )
   {
      if ( isIns( )  && (0==A319DefPor) && ( Gx_BScreen == 0 ) )
      {
         A319DefPor = (short)(100) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTipDefCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtTipDefCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1UY37( )
   {
      /* Using cursor T01UY34 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A319DefPor = T01UY34_A319DefPor[0] ;
         A834TipDefDsc = T01UY34_A834TipDefDsc[0] ;
         n834TipDefDsc = T01UY34_n834TipDefDsc[0] ;
         A14357DefMaqcod = T01UY34_A14357DefMaqcod[0] ;
         n14357DefMaqcod = T01UY34_n14357DefMaqcod[0] ;
         A14358DefCausa = T01UY34_A14358DefCausa[0] ;
         n14358DefCausa = T01UY34_n14358DefCausa[0] ;
         A14359DefResp = T01UY34_A14359DefResp[0] ;
         n14359DefResp = T01UY34_n14359DefResp[0] ;
         zm1UY37( -19) ;
      }
      pr_default.close(28);
      onLoadActions1UY37( ) ;
   }

   public void onLoadActions1UY37( )
   {
      AV14Olddef = O833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Olddef), 4, 0));
      if ( isIns( )  )
      {
         A828SumPor = (short)(O828SumPor+A319DefPor) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A828SumPor = (short)(O828SumPor+A319DefPor-O319DefPor) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A828SumPor = (short)(O828SumPor-O319DefPor) ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            }
         }
      }
   }

   public void checkExtendedTable1UY37( )
   {
      nIsDirty_37 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1UY37( ) ;
      /* Using cursor T01UY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T01UY4_A834TipDefDsc[0] ;
      n834TipDefDsc = T01UY4_n834TipDefDsc[0] ;
      pr_default.close(2);
      AV14Olddef = O833TipDefCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Olddef), 4, 0));
      if ( isIns( )  )
      {
         nIsDirty_37 = (short)(1) ;
         A828SumPor = (short)(O828SumPor+A319DefPor) ;
         n828SumPor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_37 = (short)(1) ;
            A828SumPor = (short)(O828SumPor+A319DefPor-O319DefPor) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_37 = (short)(1) ;
               A828SumPor = (short)(O828SumPor-O319DefPor) ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            }
         }
      }
      if ( A828SumPor > 100 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La suma de porcentajes no puede ser superior a 100", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( A319DefPor > 100 )
      {
         GXCCtl = "DEFPOR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. El porcentaje no puede ser superior a 100", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDefPor_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1UY37( )
   {
      pr_default.close(2);
   }

   public void enableDisable1UY37( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          short A833TipDefCod )
   {
      /* Using cursor T01UY35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A834TipDefDsc = T01UY35_A834TipDefDsc[0] ;
      n834TipDefDsc = T01UY35_n834TipDefDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A834TipDefDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(29) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(29);
   }

   public void getKey1UY37( )
   {
      /* Using cursor T01UY36 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(30) != 101) )
      {
         RcdFound37 = (short)(1) ;
      }
      else
      {
         RcdFound37 = (short)(0) ;
      }
      pr_default.close(30);
   }

   public void getByPrimaryKey1UY37( )
   {
      /* Using cursor T01UY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UY37( 19) ;
         RcdFound37 = (short)(1) ;
         initializeNonKey1UY37( ) ;
         A319DefPor = T01UY3_A319DefPor[0] ;
         A14357DefMaqcod = T01UY3_A14357DefMaqcod[0] ;
         n14357DefMaqcod = T01UY3_n14357DefMaqcod[0] ;
         A14358DefCausa = T01UY3_A14358DefCausa[0] ;
         n14358DefCausa = T01UY3_n14358DefCausa[0] ;
         A14359DefResp = T01UY3_A14359DefResp[0] ;
         n14359DefResp = T01UY3_n14359DefResp[0] ;
         A833TipDefCod = T01UY3_A833TipDefCod[0] ;
         n833TipDefCod = T01UY3_n833TipDefCod[0] ;
         O833TipDefCod = A833TipDefCod ;
         n833TipDefCod = false ;
         O319DefPor = A319DefPor ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z833TipDefCod = A833TipDefCod ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UY37( ) ;
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound37 = (short)(0) ;
         initializeNonKey1UY37( ) ;
         sMode37 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UY37( ) ;
         Gx_mode = sMode37 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UY37( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UY37( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z319DefPor != T01UY2_A319DefPor[0] ) || ( GXutil.strcmp(Z14357DefMaqcod, T01UY2_A14357DefMaqcod[0]) != 0 ) || ( Z14358DefCausa != T01UY2_A14358DefCausa[0] ) || ( Z14359DefResp != T01UY2_A14359DefResp[0] ) )
         {
            if ( Z319DefPor != T01UY2_A319DefPor[0] )
            {
               GXutil.writeLogln("defectos_trn:[seudo value changed for attri]"+"DefPor");
               GXutil.writeLogRaw("Old: ",Z319DefPor);
               GXutil.writeLogRaw("Current: ",T01UY2_A319DefPor[0]);
            }
            if ( GXutil.strcmp(Z14357DefMaqcod, T01UY2_A14357DefMaqcod[0]) != 0 )
            {
               GXutil.writeLogln("defectos_trn:[seudo value changed for attri]"+"DefMaqcod");
               GXutil.writeLogRaw("Old: ",Z14357DefMaqcod);
               GXutil.writeLogRaw("Current: ",T01UY2_A14357DefMaqcod[0]);
            }
            if ( Z14358DefCausa != T01UY2_A14358DefCausa[0] )
            {
               GXutil.writeLogln("defectos_trn:[seudo value changed for attri]"+"DefCausa");
               GXutil.writeLogRaw("Old: ",Z14358DefCausa);
               GXutil.writeLogRaw("Current: ",T01UY2_A14358DefCausa[0]);
            }
            if ( Z14359DefResp != T01UY2_A14359DefResp[0] )
            {
               GXutil.writeLogln("defectos_trn:[seudo value changed for attri]"+"DefResp");
               GXutil.writeLogRaw("Old: ",Z14359DefResp);
               GXutil.writeLogRaw("Current: ",T01UY2_A14359DefResp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISDEF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UY37( )
   {
      beforeValidate1UY37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UY37( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UY37( 0) ;
         checkOptimisticConcurrency1UY37( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UY37( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UY37( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UY37 */
                  pr_default.execute(31, new Object[] {Integer.valueOf(A361DisCod), Short.valueOf(A319DefPor), Boolean.valueOf(n14357DefMaqcod), A14357DefMaqcod, Boolean.valueOf(n14358DefCausa), Short.valueOf(A14358DefCausa), Boolean.valueOf(n14359DefResp), Short.valueOf(A14359DefResp), A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                  if ( (pr_default.getStatus(31) == 1) )
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
            load1UY37( ) ;
         }
         endLevel1UY37( ) ;
      }
      closeExtendedTableCursors1UY37( ) ;
   }

   public void update1UY37( )
   {
      beforeValidate1UY37( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UY37( ) ;
      }
      if ( ( nIsMod_37 != 0 ) || ( nIsDirty_37 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UY37( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UY37( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UY37( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UY38 */
                     pr_default.execute(32, new Object[] {Short.valueOf(A319DefPor), Boolean.valueOf(n14357DefMaqcod), A14357DefMaqcod, Boolean.valueOf(n14358DefCausa), Short.valueOf(A14358DefCausa), Boolean.valueOf(n14359DefResp), Short.valueOf(A14359DefResp), A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
                     if ( (pr_default.getStatus(32) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISDEF"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UY37( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int10[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
                        defectos_trn_impl.this.A396EmprCod = GXv_char4[0] ;
                        defectos_trn_impl.this.A361DisCod = GXv_int10[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UY37( ) ;
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
            endLevel1UY37( ) ;
         }
      }
      closeExtendedTableCursors1UY37( ) ;
   }

   public void deferredUpdate1UY37( )
   {
   }

   public void delete1UY37( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UY37( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UY37( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UY37( ) ;
         afterConfirm1UY37( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UY37( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UY39 */
               pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISDEF");
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
      sMode37 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UY37( ) ;
      Gx_mode = sMode37 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UY37( )
   {
      standaloneModal1UY37( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UY40 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         A834TipDefDsc = T01UY40_A834TipDefDsc[0] ;
         n834TipDefDsc = T01UY40_n834TipDefDsc[0] ;
         pr_default.close(34);
         AV14Olddef = O833TipDefCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Olddef), 4, 0));
         if ( isIns( )  )
         {
            A828SumPor = (short)(O828SumPor+A319DefPor) ;
            n828SumPor = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A828SumPor = (short)(O828SumPor+A319DefPor-O319DefPor) ;
               n828SumPor = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A828SumPor = (short)(O828SumPor-O319DefPor) ;
                  n828SumPor = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UY41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPBARCAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void endLevel1UY37( )
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

   public void scanStart1UY37( )
   {
      /* Scan By routine */
      /* Using cursor T01UY42 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A833TipDefCod = T01UY42_A833TipDefCod[0] ;
         n833TipDefCod = T01UY42_n833TipDefCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UY37( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound37 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound37 = (short)(1) ;
         A833TipDefCod = T01UY42_A833TipDefCod[0] ;
         n833TipDefCod = T01UY42_n833TipDefCod[0] ;
      }
   }

   public void scanEnd1UY37( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1UY37( )
   {
      /* After Confirm Rules */
      if ( true /* After */ && isDlt( )  )
      {
         AV15Inc_obs = httpContext.getMessage( httpContext.getMessage( "Delete #", ""), "") + GXutil.str( AV14Olddef, 4, 0) + " " + A834TipDefDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Inc_obs", AV15Inc_obs);
      }
      else
      {
         if ( true /* After */ && isIns( )  )
         {
            AV15Inc_obs = httpContext.getMessage( httpContext.getMessage( "Insert #", ""), "") + GXutil.str( A833TipDefCod, 4, 0) + " " + A834TipDefDsc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Inc_obs", AV15Inc_obs);
         }
      }
      if ( true /* After */ && isDlt( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV16Usurcod, AV17Station, AV15Inc_obs, A361DisCod, (byte)(0), " ") ;
      }
      if ( true /* After */ && isIns( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV16Usurcod, AV17Station, AV15Inc_obs, A361DisCod, (byte)(0), " ") ;
      }
   }

   public void beforeInsert1UY37( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UY37( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UY37( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UY37( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UY37( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UY37( )
   {
      edtTipDefCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtDefPor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefPor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefPor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtDefMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefMaqcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtDefCausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefCausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefCausa_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtDefResp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDefResp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDefResp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void send_integrity_lvl_hashes1UY37( )
   {
   }

   public void send_integrity_lvl_hashes1UY34( )
   {
   }

   public void subsflControlProps_3537( )
   {
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_35_idx ;
      edtDefPor_Internalname = "DEFPOR_"+sGXsfl_35_idx ;
      edtDefMaqcod_Internalname = "DEFMAQCOD_"+sGXsfl_35_idx ;
      edtDefCausa_Internalname = "DEFCAUSA_"+sGXsfl_35_idx ;
      edtDefResp_Internalname = "DEFRESP_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_3537( )
   {
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_35_fel_idx ;
      edtDefPor_Internalname = "DEFPOR_"+sGXsfl_35_fel_idx ;
      edtDefMaqcod_Internalname = "DEFMAQCOD_"+sGXsfl_35_fel_idx ;
      edtDefCausa_Internalname = "DEFCAUSA_"+sGXsfl_35_fel_idx ;
      edtDefResp_Internalname = "DEFRESP_"+sGXsfl_35_fel_idx ;
   }

   public void addRow1UY37( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3537( ) ;
      sendRow1UY37( ) ;
   }

   public void sendRow1UY37( )
   {
      Gridlevel_tipdefRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_tipdef_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_tipdef_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_tipdef_Class, "") != 0 )
         {
            subGridlevel_tipdef_Linesclass = subGridlevel_tipdef_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_tipdef_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_tipdef_Backstyle = (byte)(0) ;
         subGridlevel_tipdef_Backcolor = subGridlevel_tipdef_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_tipdef_Class, "") != 0 )
         {
            subGridlevel_tipdef_Linesclass = subGridlevel_tipdef_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_tipdef_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_tipdef_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_tipdef_Class, "") != 0 )
         {
            subGridlevel_tipdef_Linesclass = subGridlevel_tipdef_Class+"Odd" ;
         }
         subGridlevel_tipdef_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_tipdef_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_tipdef_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
         {
            subGridlevel_tipdef_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_tipdef_Class, "") != 0 )
            {
               subGridlevel_tipdef_Linesclass = subGridlevel_tipdef_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_tipdef_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_tipdef_Class, "") != 0 )
            {
               subGridlevel_tipdef_Linesclass = subGridlevel_tipdef_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tipdefRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefCod_Internalname,GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTipDefCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtTipDefCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tipdefRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDefPor_Internalname,GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDefPor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A319DefPor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A319DefPor), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDefPor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDefPor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tipdefRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDefMaqcod_Internalname,GXutil.rtrim( A14357DefMaqcod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDefMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDefMaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tipdefRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDefCausa_Internalname,GXutil.ltrim( localUtil.ntoc( A14358DefCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDefCausa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14358DefCausa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14358DefCausa), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDefCausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDefCausa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtDefCausa_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_37_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tipdefRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDefResp_Internalname,GXutil.ltrim( localUtil.ntoc( A14359DefResp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDefResp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14359DefResp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14359DefResp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDefResp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDefResp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtDefResp_Horizontalalignment,Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_tipdefRow);
      send_integrity_lvl_hashes1UY37( ) ;
      GXCCtl = "Z833TipDefCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z319DefPor_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14357DefMaqcod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14357DefMaqcod));
      GXCCtl = "Z14358DefCausa_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14358DefCausa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14359DefResp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14359DefResp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O833TipDefCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O319DefPor_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O319DefPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_37_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_37_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_37_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_37, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtTipDefCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFPOR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFMAQCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFCAUSA_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefCausa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFCAUSA_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtDefCausa_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFRESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDefResp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEFRESP_"+sGXsfl_35_idx+"Horizontalalignment", GXutil.rtrim( edtDefResp_Horizontalalignment));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_tipdefContainer.AddRow(Gridlevel_tipdefRow);
   }

   public void readRow1UY37( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3537( ) ;
      edtTipDefCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipDefCod_Horizontalalignment = httpContext.cgiGet( "TIPDEFCOD_"+sGXsfl_35_idx+"Horizontalalignment") ;
      edtDefPor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFPOR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDefMaqcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFMAQCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDefCausa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFCAUSA_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDefCausa_Horizontalalignment = httpContext.cgiGet( "DEFCAUSA_"+sGXsfl_35_idx+"Horizontalalignment") ;
      edtDefResp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEFRESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDefResp_Horizontalalignment = httpContext.cgiGet( "DEFRESP_"+sGXsfl_35_idx+"Horizontalalignment") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TIPDEFCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
         wbErr = true ;
         A833TipDefCod = (short)(0) ;
         n833TipDefCod = false ;
      }
      else
      {
         A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n833TipDefCod = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "DEFPOR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDefPor_Internalname ;
         wbErr = true ;
         A319DefPor = (short)(0) ;
      }
      else
      {
         A319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( edtDefPor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A14357DefMaqcod = httpContext.cgiGet( edtDefMaqcod_Internalname) ;
      n14357DefMaqcod = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDefCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDefCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DEFCAUSA_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDefCausa_Internalname ;
         wbErr = true ;
         A14358DefCausa = (short)(0) ;
         n14358DefCausa = false ;
      }
      else
      {
         A14358DefCausa = (short)(localUtil.ctol( httpContext.cgiGet( edtDefCausa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14358DefCausa = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDefResp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDefResp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DEFRESP_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDefResp_Internalname ;
         wbErr = true ;
         A14359DefResp = (short)(0) ;
         n14359DefResp = false ;
      }
      else
      {
         A14359DefResp = (short)(localUtil.ctol( httpContext.cgiGet( edtDefResp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14359DefResp = false ;
      }
      GXCCtl = "Z833TipDefCod_" + sGXsfl_35_idx ;
      Z833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z319DefPor_" + sGXsfl_35_idx ;
      Z319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14357DefMaqcod_" + sGXsfl_35_idx ;
      Z14357DefMaqcod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14358DefCausa_" + sGXsfl_35_idx ;
      Z14358DefCausa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14359DefResp_" + sGXsfl_35_idx ;
      Z14359DefResp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O833TipDefCod_" + sGXsfl_35_idx ;
      O833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O319DefPor_" + sGXsfl_35_idx ;
      O319DefPor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_37_" + sGXsfl_35_idx ;
      nRcdDeleted_37 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_37_" + sGXsfl_35_idx ;
      nRcdExists_37 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_37_" + sGXsfl_35_idx ;
      nIsMod_37 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTipDefCod_Enabled = edtTipDefCod_Enabled ;
   }

   public void confirmValues1UY0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3537( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3537( ) ;
         httpContext.changePostValue( "Z833TipDefCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z833TipDefCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z833TipDefCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z319DefPor_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z319DefPor_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z319DefPor_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z14357DefMaqcod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z14357DefMaqcod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14357DefMaqcod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z14358DefCausa_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z14358DefCausa_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14358DefCausa_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z14359DefResp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z14359DefResp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14359DefResp_"+sGXsfl_35_idx) ;
      }
      httpContext.changePostValue( "O833TipDefCod", httpContext.cgiGet( "T833TipDefCod")) ;
      httpContext.deletePostValue( "T833TipDefCod") ;
      httpContext.changePostValue( "O319DefPor", httpContext.cgiGet( "T319DefPor")) ;
      httpContext.deletePostValue( "T319DefPor") ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.defectos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Defectos_TRN");
      forbiddenHiddens.add("DisCod", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("defectos_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O828SumPor", GXutil.ltrim( localUtil.ntoc( O828SumPor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPDEFCOD_DATA", AV12TipDefCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPDEFCOD_DATA", AV12TipDefCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDEFMAQCOD_DATA", AV18DefMaqcod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDEFMAQCOD_DATA", AV18DefMaqcod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDEFCAUSA_DATA", AV19DefCausa_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDEFCAUSA_DATA", AV19DefCausa_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDEFRESP_DATA", AV20DefResp_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDEFRESP_DATA", AV20DefResp_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV8DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDDEF", GXutil.ltrim( localUtil.ntoc( AV14Olddef, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDSC", GXutil.rtrim( A834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_OBS", AV15Inc_obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV16Usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV17Station));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Objectcall", GXutil.rtrim( Combo_tipdefcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Cls", GXutil.rtrim( Combo_tipdefcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Enabled", GXutil.booltostr( Combo_tipdefcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_tipdefcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Isgriditem", GXutil.booltostr( Combo_tipdefcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPDEFCOD_Emptyitem", GXutil.booltostr( Combo_tipdefcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFMAQCOD_Objectcall", GXutil.rtrim( Combo_defmaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFMAQCOD_Cls", GXutil.rtrim( Combo_defmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFMAQCOD_Enabled", GXutil.booltostr( Combo_defmaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFMAQCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_defmaqcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFMAQCOD_Isgriditem", GXutil.booltostr( Combo_defmaqcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFMAQCOD_Emptyitemtext", GXutil.rtrim( Combo_defmaqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFCAUSA_Objectcall", GXutil.rtrim( Combo_defcausa_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFCAUSA_Cls", GXutil.rtrim( Combo_defcausa_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFCAUSA_Enabled", GXutil.booltostr( Combo_defcausa_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFCAUSA_Titlecontrolidtoreplace", GXutil.rtrim( Combo_defcausa_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFCAUSA_Isgriditem", GXutil.booltostr( Combo_defcausa_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFCAUSA_Emptyitemtext", GXutil.rtrim( Combo_defcausa_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFRESP_Objectcall", GXutil.rtrim( Combo_defresp_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFRESP_Cls", GXutil.rtrim( Combo_defresp_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFRESP_Enabled", GXutil.booltostr( Combo_defresp_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFRESP_Titlecontrolidtoreplace", GXutil.rtrim( Combo_defresp_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFRESP_Isgriditem", GXutil.booltostr( Combo_defresp_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_DEFRESP_Emptyitemtext", GXutil.rtrim( Combo_defresp_Emptyitemtext));
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
      return formatLink("app.defectos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "Defectos_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Defectos", "") ;
   }

   public void initializeNonKey1UY34( )
   {
      A828SumPor = (short)(0) ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
      O828SumPor = A828SumPor ;
      n828SumPor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrimstr( DecimalUtil.doubleToDec(A828SumPor), 3, 0));
   }

   public void initAll1UY34( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      initializeNonKey1UY34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UY37( )
   {
      AV14Olddef = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Olddef", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Olddef), 4, 0));
      AV15Inc_obs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Inc_obs", AV15Inc_obs);
      A834TipDefDsc = "" ;
      n834TipDefDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", A834TipDefDsc);
      A14357DefMaqcod = "" ;
      n14357DefMaqcod = false ;
      A14358DefCausa = (short)(0) ;
      n14358DefCausa = false ;
      A14359DefResp = (short)(0) ;
      n14359DefResp = false ;
      A319DefPor = (short)(100) ;
      O319DefPor = A319DefPor ;
      Z319DefPor = (short)(0) ;
      Z14357DefMaqcod = "" ;
      Z14358DefCausa = (short)(0) ;
      Z14359DefResp = (short)(0) ;
   }

   public void initAll1UY37( )
   {
      A833TipDefCod = (short)(0) ;
      n833TipDefCod = false ;
      initializeNonKey1UY37( ) ;
   }

   public void standaloneModalInsert1UY37( )
   {
      A319DefPor = i319DefPor ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211611277", true, true);
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
      httpContext.AddJavascriptSource("defectos_trn.js", "?20268211611278", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties37( )
   {
      edtTipDefCod_Enabled = defedtTipDefCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void startgridcontrol35( )
   {
      Gridlevel_tipdefContainer.AddObjectProperty("GridName", "Gridlevel_tipdef");
      Gridlevel_tipdefContainer.AddObjectProperty("Header", subGridlevel_tipdef_Header);
      Gridlevel_tipdefContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_tipdefContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_tipdefContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_tipdefColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tipdefColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtTipDefCod_Horizontalalignment));
      Gridlevel_tipdefContainer.AddColumnProperties(Gridlevel_tipdefColumn);
      Gridlevel_tipdefColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tipdefColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A319DefPor, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDefPor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddColumnProperties(Gridlevel_tipdefColumn);
      Gridlevel_tipdefColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tipdefColumn.AddObjectProperty("Value", GXutil.rtrim( A14357DefMaqcod));
      Gridlevel_tipdefColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDefMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddColumnProperties(Gridlevel_tipdefColumn);
      Gridlevel_tipdefColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tipdefColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14358DefCausa, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDefCausa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtDefCausa_Horizontalalignment));
      Gridlevel_tipdefContainer.AddColumnProperties(Gridlevel_tipdefColumn);
      Gridlevel_tipdefColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tipdefColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14359DefResp, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDefResp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tipdefColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtDefResp_Horizontalalignment));
      Gridlevel_tipdefContainer.AddColumnProperties(Gridlevel_tipdefColumn);
      Gridlevel_tipdefContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipdefContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipdef_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtDisCod_Internalname = "DISCOD" ;
      edtSumPor_Internalname = "SUMPOR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      edtDefPor_Internalname = "DEFPOR" ;
      edtDefMaqcod_Internalname = "DEFMAQCOD" ;
      edtDefCausa_Internalname = "DEFCAUSA" ;
      edtDefResp_Internalname = "DEFRESP" ;
      divTableleaflevel_tipdef_Internalname = "TABLELEAFLEVEL_TIPDEF" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_tipdefcod_Internalname = "COMBO_TIPDEFCOD" ;
      Combo_defmaqcod_Internalname = "COMBO_DEFMAQCOD" ;
      Combo_defcausa_Internalname = "COMBO_DEFCAUSA" ;
      Combo_defresp_Internalname = "COMBO_DEFRESP" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_tipdef_Internalname = "GRIDLEVEL_TIPDEF" ;
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
      subGridlevel_tipdef_Allowcollapsing = (byte)(0) ;
      subGridlevel_tipdef_Allowselection = (byte)(0) ;
      subGridlevel_tipdef_Header = "" ;
      Combo_defresp_Enabled = GXutil.toBoolean( -1) ;
      Combo_defcausa_Enabled = GXutil.toBoolean( -1) ;
      Combo_defmaqcod_Enabled = GXutil.toBoolean( -1) ;
      Combo_tipdefcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Defectos", "") );
      edtDefResp_Jsonclick = "" ;
      edtDefCausa_Jsonclick = "" ;
      edtDefMaqcod_Jsonclick = "" ;
      edtDefPor_Jsonclick = "" ;
      edtTipDefCod_Jsonclick = "" ;
      subGridlevel_tipdef_Class = "GridNoBorder WorkWith" ;
      subGridlevel_tipdef_Backcolorstyle = (byte)(0) ;
      Combo_tipdefcod_Titlecontrolidtoreplace = "" ;
      Combo_defmaqcod_Titlecontrolidtoreplace = "" ;
      Combo_defcausa_Titlecontrolidtoreplace = "" ;
      Combo_defresp_Titlecontrolidtoreplace = "" ;
      edtDefResp_Enabled = 1 ;
      edtDefCausa_Enabled = 1 ;
      edtDefMaqcod_Enabled = 1 ;
      edtDefPor_Enabled = 1 ;
      edtTipDefCod_Enabled = 1 ;
      Combo_defresp_Emptyitemtext = "" ;
      Combo_defresp_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_defresp_Cls = "ExtendedCombo" ;
      Combo_defcausa_Emptyitemtext = "" ;
      Combo_defcausa_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_defcausa_Cls = "ExtendedCombo" ;
      Combo_defmaqcod_Emptyitemtext = "" ;
      Combo_defmaqcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_defmaqcod_Cls = "ExtendedCombo" ;
      Combo_tipdefcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipdefcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_tipdefcod_Cls = "ExtendedCombo" ;
      Combo_tipdefcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtSumPor_Jsonclick = "" ;
      edtSumPor_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
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
      edtTipDefCod_Horizontalalignment = "right" ;
      edtDefCausa_Horizontalalignment = "right" ;
      edtDefResp_Horizontalalignment = "right" ;
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

   public void xc_14_1UY37( String Gx_mode ,
                            String A396EmprCod ,
                            String AV24Pgmname ,
                            String AV16Usurcod ,
                            String AV17Station ,
                            String AV15Inc_obs ,
                            int A361DisCod )
   {
      if ( true /* After */ && isDlt( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV16Usurcod, AV17Station, AV15Inc_obs, A361DisCod, (byte)(0), " ") ;
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

   public void xc_15_1UY37( String Gx_mode ,
                            String A396EmprCod ,
                            String AV24Pgmname ,
                            String AV16Usurcod ,
                            String AV17Station ,
                            String AV15Inc_obs ,
                            int A361DisCod )
   {
      if ( true /* After */ && isIns( )  )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV24Pgmname, AV16Usurcod, AV17Station, AV15Inc_obs, A361DisCod, (byte)(0), " ") ;
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

   public void gxnrgridlevel_tipdef_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_3537( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UY37( ) ;
         standaloneModal1UY37( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UY37( ) ;
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3537( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_tipdefContainer)) ;
      /* End function gxnrGridlevel_tipdef_newrow */
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
      n828SumPor = false ;
      /* Using cursor T01UY20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A828SumPor = T01UY20_A828SumPor[0] ;
         n828SumPor = T01UY20_n828SumPor[0] ;
      }
      else
      {
         A828SumPor = (short)(0) ;
         n828SumPor = false ;
      }
      pr_default.close(14);
      if ( A828SumPor > 100 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. La suma de porcentajes no puede ser superior a 100", ""), 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A828SumPor", GXutil.ltrim( localUtil.ntoc( A828SumPor, (byte)(3), (byte)(0), ".", "")));
   }

   public void valid_Tipdefcod( )
   {
      n833TipDefCod = false ;
      n834TipDefDsc = false ;
      /* Using cursor T01UY40 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n833TipDefCod), Short.valueOf(A833TipDefCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDEF", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDEFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipDefCod_Internalname ;
      }
      A834TipDefDsc = T01UY40_A834TipDefDsc[0] ;
      n834TipDefDsc = T01UY40_n834TipDefDsc[0] ;
      pr_default.close(34);
      AV14Olddef = O833TipDefCod ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A834TipDefDsc", GXutil.rtrim( A834TipDefDsc));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Olddef", GXutil.ltrim( localUtil.ntoc( AV14Olddef, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UY2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A828SumPor',fld:'SUMPOR',pic:'ZZ9'}]");
      setEventMetadata("VALID_DISCOD",",oparms:[{av:'A828SumPor',fld:'SUMPOR',pic:'ZZ9'}]}");
      setEventMetadata("VALID_SUMPOR","{handler:'valid_Sumpor',iparms:[]");
      setEventMetadata("VALID_SUMPOR",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[{av:'O833TipDefCod'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'AV14Olddef',fld:'vOLDDEF',pic:'ZZZ9'}]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'AV14Olddef',fld:'vOLDDEF',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEFPOR","{handler:'valid_Defpor',iparms:[]");
      setEventMetadata("VALID_DEFPOR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Defresp',iparms:[]");
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
      pr_default.close(34);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z14357DefMaqcod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      AV24Pgmname = "" ;
      AV16Usurcod = "" ;
      AV17Station = "" ;
      AV15Inc_obs = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_tipdefcod = new com.genexus.webpanels.GXUserControl();
      AV22DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV12TipDefCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_defmaqcod = new com.genexus.webpanels.GXUserControl();
      Combo_defmaqcod_Caption = "" ;
      AV18DefMaqcod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_defcausa = new com.genexus.webpanels.GXUserControl();
      Combo_defcausa_Caption = "" ;
      AV19DefCausa_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_defresp = new com.genexus.webpanels.GXUserControl();
      Combo_defresp_Caption = "" ;
      AV20DefResp_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_tipdefContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode37 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A834TipDefDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_tipdefcod_Objectcall = "" ;
      Combo_tipdefcod_Class = "" ;
      Combo_tipdefcod_Icontype = "" ;
      Combo_tipdefcod_Icon = "" ;
      Combo_tipdefcod_Tooltip = "" ;
      Combo_tipdefcod_Selectedvalue_set = "" ;
      Combo_tipdefcod_Selectedvalue_get = "" ;
      Combo_tipdefcod_Selectedtext_set = "" ;
      Combo_tipdefcod_Selectedtext_get = "" ;
      Combo_tipdefcod_Gamoauthtoken = "" ;
      Combo_tipdefcod_Ddointernalname = "" ;
      Combo_tipdefcod_Titlecontrolalign = "" ;
      Combo_tipdefcod_Dropdownoptionstype = "" ;
      Combo_tipdefcod_Datalisttype = "" ;
      Combo_tipdefcod_Datalistfixedvalues = "" ;
      Combo_tipdefcod_Datalistproc = "" ;
      Combo_tipdefcod_Datalistprocparametersprefix = "" ;
      Combo_tipdefcod_Remoteservicesparameters = "" ;
      Combo_tipdefcod_Htmltemplate = "" ;
      Combo_tipdefcod_Multiplevaluestype = "" ;
      Combo_tipdefcod_Loadingdata = "" ;
      Combo_tipdefcod_Noresultsfound = "" ;
      Combo_tipdefcod_Emptyitemtext = "" ;
      Combo_tipdefcod_Onlyselectedvalues = "" ;
      Combo_tipdefcod_Selectalltext = "" ;
      Combo_tipdefcod_Multiplevaluesseparator = "" ;
      Combo_tipdefcod_Addnewoptiontext = "" ;
      Combo_defmaqcod_Objectcall = "" ;
      Combo_defmaqcod_Class = "" ;
      Combo_defmaqcod_Icontype = "" ;
      Combo_defmaqcod_Icon = "" ;
      Combo_defmaqcod_Tooltip = "" ;
      Combo_defmaqcod_Selectedvalue_set = "" ;
      Combo_defmaqcod_Selectedvalue_get = "" ;
      Combo_defmaqcod_Selectedtext_set = "" ;
      Combo_defmaqcod_Selectedtext_get = "" ;
      Combo_defmaqcod_Gamoauthtoken = "" ;
      Combo_defmaqcod_Ddointernalname = "" ;
      Combo_defmaqcod_Titlecontrolalign = "" ;
      Combo_defmaqcod_Dropdownoptionstype = "" ;
      Combo_defmaqcod_Datalisttype = "" ;
      Combo_defmaqcod_Datalistfixedvalues = "" ;
      Combo_defmaqcod_Datalistproc = "" ;
      Combo_defmaqcod_Datalistprocparametersprefix = "" ;
      Combo_defmaqcod_Remoteservicesparameters = "" ;
      Combo_defmaqcod_Htmltemplate = "" ;
      Combo_defmaqcod_Multiplevaluestype = "" ;
      Combo_defmaqcod_Loadingdata = "" ;
      Combo_defmaqcod_Noresultsfound = "" ;
      Combo_defmaqcod_Onlyselectedvalues = "" ;
      Combo_defmaqcod_Selectalltext = "" ;
      Combo_defmaqcod_Multiplevaluesseparator = "" ;
      Combo_defmaqcod_Addnewoptiontext = "" ;
      Combo_defcausa_Objectcall = "" ;
      Combo_defcausa_Class = "" ;
      Combo_defcausa_Icontype = "" ;
      Combo_defcausa_Icon = "" ;
      Combo_defcausa_Tooltip = "" ;
      Combo_defcausa_Selectedvalue_set = "" ;
      Combo_defcausa_Selectedvalue_get = "" ;
      Combo_defcausa_Selectedtext_set = "" ;
      Combo_defcausa_Selectedtext_get = "" ;
      Combo_defcausa_Gamoauthtoken = "" ;
      Combo_defcausa_Ddointernalname = "" ;
      Combo_defcausa_Titlecontrolalign = "" ;
      Combo_defcausa_Dropdownoptionstype = "" ;
      Combo_defcausa_Datalisttype = "" ;
      Combo_defcausa_Datalistfixedvalues = "" ;
      Combo_defcausa_Datalistproc = "" ;
      Combo_defcausa_Datalistprocparametersprefix = "" ;
      Combo_defcausa_Remoteservicesparameters = "" ;
      Combo_defcausa_Htmltemplate = "" ;
      Combo_defcausa_Multiplevaluestype = "" ;
      Combo_defcausa_Loadingdata = "" ;
      Combo_defcausa_Noresultsfound = "" ;
      Combo_defcausa_Onlyselectedvalues = "" ;
      Combo_defcausa_Selectalltext = "" ;
      Combo_defcausa_Multiplevaluesseparator = "" ;
      Combo_defcausa_Addnewoptiontext = "" ;
      Combo_defresp_Objectcall = "" ;
      Combo_defresp_Class = "" ;
      Combo_defresp_Icontype = "" ;
      Combo_defresp_Icon = "" ;
      Combo_defresp_Tooltip = "" ;
      Combo_defresp_Selectedvalue_set = "" ;
      Combo_defresp_Selectedvalue_get = "" ;
      Combo_defresp_Selectedtext_set = "" ;
      Combo_defresp_Selectedtext_get = "" ;
      Combo_defresp_Gamoauthtoken = "" ;
      Combo_defresp_Ddointernalname = "" ;
      Combo_defresp_Titlecontrolalign = "" ;
      Combo_defresp_Dropdownoptionstype = "" ;
      Combo_defresp_Datalisttype = "" ;
      Combo_defresp_Datalistfixedvalues = "" ;
      Combo_defresp_Datalistproc = "" ;
      Combo_defresp_Datalistprocparametersprefix = "" ;
      Combo_defresp_Remoteservicesparameters = "" ;
      Combo_defresp_Htmltemplate = "" ;
      Combo_defresp_Multiplevaluestype = "" ;
      Combo_defresp_Loadingdata = "" ;
      Combo_defresp_Noresultsfound = "" ;
      Combo_defresp_Onlyselectedvalues = "" ;
      Combo_defresp_Selectalltext = "" ;
      Combo_defresp_Multiplevaluesseparator = "" ;
      Combo_defresp_Addnewoptiontext = "" ;
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
      A14357DefMaqcod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      AV13ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01UY7_A407EmprNom = new String[] {""} ;
      T01UY7_n407EmprNom = new boolean[] {false} ;
      T01UY9_A828SumPor = new short[1] ;
      T01UY9_n828SumPor = new boolean[] {false} ;
      T01UY11_A361DisCod = new int[1] ;
      T01UY11_A407EmprNom = new String[] {""} ;
      T01UY11_n407EmprNom = new boolean[] {false} ;
      T01UY11_A396EmprCod = new String[] {""} ;
      T01UY11_A828SumPor = new short[1] ;
      T01UY11_n828SumPor = new boolean[] {false} ;
      T01UY13_A828SumPor = new short[1] ;
      T01UY13_n828SumPor = new boolean[] {false} ;
      T01UY14_A396EmprCod = new String[] {""} ;
      T01UY14_A361DisCod = new int[1] ;
      T01UY6_A361DisCod = new int[1] ;
      T01UY6_A396EmprCod = new String[] {""} ;
      T01UY15_A396EmprCod = new String[] {""} ;
      T01UY15_A361DisCod = new int[1] ;
      T01UY16_A396EmprCod = new String[] {""} ;
      T01UY16_A361DisCod = new int[1] ;
      T01UY5_A361DisCod = new int[1] ;
      T01UY5_A396EmprCod = new String[] {""} ;
      T01UY20_A828SumPor = new short[1] ;
      T01UY20_n828SumPor = new boolean[] {false} ;
      T01UY21_A396EmprCod = new String[] {""} ;
      T01UY21_A361DisCod = new int[1] ;
      T01UY21_A13376DisTraID = new String[] {""} ;
      T01UY22_A396EmprCod = new String[] {""} ;
      T01UY22_A361DisCod = new int[1] ;
      T01UY22_A13213DisNormID = new String[] {""} ;
      T01UY23_A396EmprCod = new String[] {""} ;
      T01UY23_A361DisCod = new int[1] ;
      T01UY23_A13081DisDGLin = new byte[1] ;
      T01UY23_A13082DisDGDibCl = new String[] {""} ;
      T01UY23_A13083DisDGDibIn = new int[1] ;
      T01UY23_A13084DisDGComb = new String[] {""} ;
      T01UY23_A13085DisDGFondo = new String[] {""} ;
      T01UY24_A396EmprCod = new String[] {""} ;
      T01UY24_A361DisCod = new int[1] ;
      T01UY24_A7068DisNotLin = new byte[1] ;
      T01UY25_A396EmprCod = new String[] {""} ;
      T01UY25_A361DisCod = new int[1] ;
      T01UY25_A10197ProEspCod = new String[] {""} ;
      T01UY26_A396EmprCod = new String[] {""} ;
      T01UY26_A361DisCod = new int[1] ;
      T01UY26_A4594AccCod = new short[1] ;
      T01UY27_A396EmprCod = new String[] {""} ;
      T01UY27_A361DisCod = new int[1] ;
      T01UY27_A2524DisComLin = new byte[1] ;
      T01UY27_A1056DisComCod = new String[] {""} ;
      T01UY27_A1032FonCod = new String[] {""} ;
      T01UY28_A396EmprCod = new String[] {""} ;
      T01UY28_A361DisCod = new int[1] ;
      T01UY28_A3398DisRefBarC = new int[1] ;
      T01UY28_A3399DisRefBCRe = new byte[1] ;
      T01UY28_A3400DisRefBCPa = new String[] {""} ;
      T01UY28_A3607DisRefBPie = new String[] {""} ;
      T01UY29_A396EmprCod = new String[] {""} ;
      T01UY29_A361DisCod = new int[1] ;
      T01UY29_A376DisObsLin = new byte[1] ;
      T01UY30_A396EmprCod = new String[] {""} ;
      T01UY30_A361DisCod = new int[1] ;
      T01UY30_A758ProCod = new String[] {""} ;
      T01UY31_A396EmprCod = new String[] {""} ;
      T01UY31_A129BarCod = new int[1] ;
      T01UY31_A132BarCodReo = new byte[1] ;
      T01UY31_A130BarCodPar = new String[] {""} ;
      T01UY32_A396EmprCod = new String[] {""} ;
      T01UY32_A361DisCod = new int[1] ;
      T01UY32_A44AlbRecCod = new int[1] ;
      T01UY33_A396EmprCod = new String[] {""} ;
      T01UY33_A361DisCod = new int[1] ;
      Z834TipDefDsc = "" ;
      T01UY34_A361DisCod = new int[1] ;
      T01UY34_A319DefPor = new short[1] ;
      T01UY34_A834TipDefDsc = new String[] {""} ;
      T01UY34_n834TipDefDsc = new boolean[] {false} ;
      T01UY34_A14357DefMaqcod = new String[] {""} ;
      T01UY34_n14357DefMaqcod = new boolean[] {false} ;
      T01UY34_A14358DefCausa = new short[1] ;
      T01UY34_n14358DefCausa = new boolean[] {false} ;
      T01UY34_A14359DefResp = new short[1] ;
      T01UY34_n14359DefResp = new boolean[] {false} ;
      T01UY34_A396EmprCod = new String[] {""} ;
      T01UY34_A833TipDefCod = new short[1] ;
      T01UY34_n833TipDefCod = new boolean[] {false} ;
      T01UY4_A834TipDefDsc = new String[] {""} ;
      T01UY4_n834TipDefDsc = new boolean[] {false} ;
      T01UY35_A834TipDefDsc = new String[] {""} ;
      T01UY35_n834TipDefDsc = new boolean[] {false} ;
      T01UY36_A396EmprCod = new String[] {""} ;
      T01UY36_A361DisCod = new int[1] ;
      T01UY36_A833TipDefCod = new short[1] ;
      T01UY36_n833TipDefCod = new boolean[] {false} ;
      T01UY3_A361DisCod = new int[1] ;
      T01UY3_A319DefPor = new short[1] ;
      T01UY3_A14357DefMaqcod = new String[] {""} ;
      T01UY3_n14357DefMaqcod = new boolean[] {false} ;
      T01UY3_A14358DefCausa = new short[1] ;
      T01UY3_n14358DefCausa = new boolean[] {false} ;
      T01UY3_A14359DefResp = new short[1] ;
      T01UY3_n14359DefResp = new boolean[] {false} ;
      T01UY3_A396EmprCod = new String[] {""} ;
      T01UY3_A833TipDefCod = new short[1] ;
      T01UY3_n833TipDefCod = new boolean[] {false} ;
      T01UY2_A361DisCod = new int[1] ;
      T01UY2_A319DefPor = new short[1] ;
      T01UY2_A14357DefMaqcod = new String[] {""} ;
      T01UY2_n14357DefMaqcod = new boolean[] {false} ;
      T01UY2_A14358DefCausa = new short[1] ;
      T01UY2_n14358DefCausa = new boolean[] {false} ;
      T01UY2_A14359DefResp = new short[1] ;
      T01UY2_n14359DefResp = new boolean[] {false} ;
      T01UY2_A396EmprCod = new String[] {""} ;
      T01UY2_A833TipDefCod = new short[1] ;
      T01UY2_n833TipDefCod = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      T01UY40_A834TipDefDsc = new String[] {""} ;
      T01UY40_n834TipDefDsc = new boolean[] {false} ;
      T01UY41_A396EmprCod = new String[] {""} ;
      T01UY41_A129BarCod = new int[1] ;
      T01UY41_A132BarCodReo = new byte[1] ;
      T01UY41_A130BarCodPar = new String[] {""} ;
      T01UY42_A396EmprCod = new String[] {""} ;
      T01UY42_A361DisCod = new int[1] ;
      T01UY42_A833TipDefCod = new short[1] ;
      T01UY42_n833TipDefCod = new boolean[] {false} ;
      Gridlevel_tipdefRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_tipdef_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_tipdefColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.defectos_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.defectos_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.defectos_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.defectos_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.defectos_trn__default(),
         new Object[] {
             new Object[] {
            T01UY2_A361DisCod, T01UY2_A319DefPor, T01UY2_A14357DefMaqcod, T01UY2_n14357DefMaqcod, T01UY2_A14358DefCausa, T01UY2_n14358DefCausa, T01UY2_A14359DefResp, T01UY2_n14359DefResp, T01UY2_A396EmprCod, T01UY2_A833TipDefCod
            }
            , new Object[] {
            T01UY3_A361DisCod, T01UY3_A319DefPor, T01UY3_A14357DefMaqcod, T01UY3_n14357DefMaqcod, T01UY3_A14358DefCausa, T01UY3_n14358DefCausa, T01UY3_A14359DefResp, T01UY3_n14359DefResp, T01UY3_A396EmprCod, T01UY3_A833TipDefCod
            }
            , new Object[] {
            T01UY4_A834TipDefDsc, T01UY4_n834TipDefDsc
            }
            , new Object[] {
            T01UY5_A361DisCod, T01UY5_A396EmprCod
            }
            , new Object[] {
            T01UY6_A361DisCod, T01UY6_A396EmprCod
            }
            , new Object[] {
            T01UY7_A407EmprNom, T01UY7_n407EmprNom
            }
            , new Object[] {
            T01UY9_A828SumPor, T01UY9_n828SumPor
            }
            , new Object[] {
            T01UY11_A361DisCod, T01UY11_A407EmprNom, T01UY11_n407EmprNom, T01UY11_A396EmprCod, T01UY11_A828SumPor, T01UY11_n828SumPor
            }
            , new Object[] {
            T01UY13_A828SumPor, T01UY13_n828SumPor
            }
            , new Object[] {
            T01UY14_A396EmprCod, T01UY14_A361DisCod
            }
            , new Object[] {
            T01UY15_A396EmprCod, T01UY15_A361DisCod
            }
            , new Object[] {
            T01UY16_A396EmprCod, T01UY16_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UY20_A828SumPor, T01UY20_n828SumPor
            }
            , new Object[] {
            T01UY21_A396EmprCod, T01UY21_A361DisCod, T01UY21_A13376DisTraID
            }
            , new Object[] {
            T01UY22_A396EmprCod, T01UY22_A361DisCod, T01UY22_A13213DisNormID
            }
            , new Object[] {
            T01UY23_A396EmprCod, T01UY23_A361DisCod, T01UY23_A13081DisDGLin, T01UY23_A13082DisDGDibCl, T01UY23_A13083DisDGDibIn, T01UY23_A13084DisDGComb, T01UY23_A13085DisDGFondo
            }
            , new Object[] {
            T01UY24_A396EmprCod, T01UY24_A361DisCod, T01UY24_A7068DisNotLin
            }
            , new Object[] {
            T01UY25_A396EmprCod, T01UY25_A361DisCod, T01UY25_A10197ProEspCod
            }
            , new Object[] {
            T01UY26_A396EmprCod, T01UY26_A361DisCod, T01UY26_A4594AccCod
            }
            , new Object[] {
            T01UY27_A396EmprCod, T01UY27_A361DisCod, T01UY27_A2524DisComLin, T01UY27_A1056DisComCod, T01UY27_A1032FonCod
            }
            , new Object[] {
            T01UY28_A396EmprCod, T01UY28_A361DisCod, T01UY28_A3398DisRefBarC, T01UY28_A3399DisRefBCRe, T01UY28_A3400DisRefBCPa, T01UY28_A3607DisRefBPie
            }
            , new Object[] {
            T01UY29_A396EmprCod, T01UY29_A361DisCod, T01UY29_A376DisObsLin
            }
            , new Object[] {
            T01UY30_A396EmprCod, T01UY30_A361DisCod, T01UY30_A758ProCod
            }
            , new Object[] {
            T01UY31_A396EmprCod, T01UY31_A129BarCod, T01UY31_A132BarCodReo, T01UY31_A130BarCodPar
            }
            , new Object[] {
            T01UY32_A396EmprCod, T01UY32_A361DisCod, T01UY32_A44AlbRecCod
            }
            , new Object[] {
            T01UY33_A396EmprCod, T01UY33_A361DisCod
            }
            , new Object[] {
            T01UY34_A361DisCod, T01UY34_A319DefPor, T01UY34_A834TipDefDsc, T01UY34_n834TipDefDsc, T01UY34_A14357DefMaqcod, T01UY34_n14357DefMaqcod, T01UY34_A14358DefCausa, T01UY34_n14358DefCausa, T01UY34_A14359DefResp, T01UY34_n14359DefResp,
            T01UY34_A396EmprCod, T01UY34_A833TipDefCod
            }
            , new Object[] {
            T01UY35_A834TipDefDsc, T01UY35_n834TipDefDsc
            }
            , new Object[] {
            T01UY36_A396EmprCod, T01UY36_A361DisCod, T01UY36_A833TipDefCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UY40_A834TipDefDsc, T01UY40_n834TipDefDsc
            }
            , new Object[] {
            T01UY41_A396EmprCod, T01UY41_A129BarCod, T01UY41_A132BarCodReo, T01UY41_A130BarCodPar
            }
            , new Object[] {
            T01UY42_A396EmprCod, T01UY42_A361DisCod, T01UY42_A833TipDefCod
            }
         }
      );
      AV24Pgmname = "Defectos_TRN" ;
      Z319DefPor = (short)(100) ;
      O319DefPor = (short)(100) ;
      A319DefPor = (short)(100) ;
      T319DefPor = (short)(100) ;
      i319DefPor = (short)(100) ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_tipdef_Backcolorstyle ;
   private byte subGridlevel_tipdef_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_tipdef_Allowselection ;
   private byte subGridlevel_tipdef_Allowhovering ;
   private byte subGridlevel_tipdef_Allowcollapsing ;
   private byte subGridlevel_tipdef_Collapsed ;
   private short O828SumPor ;
   private short Z833TipDefCod ;
   private short Z319DefPor ;
   private short Z14358DefCausa ;
   private short Z14359DefResp ;
   private short O833TipDefCod ;
   private short O319DefPor ;
   private short nRcdDeleted_37 ;
   private short nRcdExists_37 ;
   private short nIsMod_37 ;
   private short A833TipDefCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A828SumPor ;
   private short nBlankRcdCount37 ;
   private short RcdFound37 ;
   private short B828SumPor ;
   private short nBlankRcdUsr37 ;
   private short AV14Olddef ;
   private short RcdFound34 ;
   private short s828SumPor ;
   private short A319DefPor ;
   private short A14358DefCausa ;
   private short A14359DefResp ;
   private short T833TipDefCod ;
   private short T319DefPor ;
   private short Z828SumPor ;
   private short nIsDirty_34 ;
   private short nIsDirty_37 ;
   private short i319DefPor ;
   private short ZV14Olddef ;
   private int wcpOAV8DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int A361DisCod ;
   private int AV8DisCod ;
   private int trnEnded ;
   private int edtDisCod_Enabled ;
   private int edtSumPor_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtTipDefCod_Enabled ;
   private int edtDefPor_Enabled ;
   private int edtDefMaqcod_Enabled ;
   private int edtDefCausa_Enabled ;
   private int edtDefResp_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_tipdefcod_Datalistupdateminimumcharacters ;
   private int Combo_defmaqcod_Datalistupdateminimumcharacters ;
   private int Combo_defcausa_Datalistupdateminimumcharacters ;
   private int Combo_defresp_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int GXv_int10[] ;
   private int subGridlevel_tipdef_Backcolor ;
   private int subGridlevel_tipdef_Allbackcolor ;
   private int defedtTipDefCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_tipdef_Selectedindex ;
   private int subGridlevel_tipdef_Selectioncolor ;
   private int subGridlevel_tipdef_Hoveringcolor ;
   private long GRIDLEVEL_TIPDEF_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z14357DefMaqcod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String AV24Pgmname ;
   private String AV16Usurcod ;
   private String AV17Station ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_35_idx="0001" ;
   private String edtDefResp_Horizontalalignment ;
   private String edtDefResp_Internalname ;
   private String edtDefCausa_Horizontalalignment ;
   private String edtDefCausa_Internalname ;
   private String edtTipDefCod_Horizontalalignment ;
   private String edtTipDefCod_Internalname ;
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
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtSumPor_Internalname ;
   private String edtSumPor_Jsonclick ;
   private String divTableleaflevel_tipdef_Internalname ;
   private String TempTags ;
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
   private String Combo_tipdefcod_Caption ;
   private String Combo_tipdefcod_Cls ;
   private String Combo_tipdefcod_Internalname ;
   private String Combo_defmaqcod_Caption ;
   private String Combo_defmaqcod_Cls ;
   private String Combo_defmaqcod_Emptyitemtext ;
   private String Combo_defmaqcod_Internalname ;
   private String Combo_defcausa_Caption ;
   private String Combo_defcausa_Cls ;
   private String Combo_defcausa_Emptyitemtext ;
   private String Combo_defcausa_Internalname ;
   private String Combo_defresp_Caption ;
   private String Combo_defresp_Cls ;
   private String Combo_defresp_Emptyitemtext ;
   private String Combo_defresp_Internalname ;
   private String sMode37 ;
   private String edtDefPor_Internalname ;
   private String edtDefMaqcod_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_tipdef_Internalname ;
   private String A407EmprNom ;
   private String A834TipDefDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_tipdefcod_Objectcall ;
   private String Combo_tipdefcod_Class ;
   private String Combo_tipdefcod_Icontype ;
   private String Combo_tipdefcod_Icon ;
   private String Combo_tipdefcod_Tooltip ;
   private String Combo_tipdefcod_Selectedvalue_set ;
   private String Combo_tipdefcod_Selectedvalue_get ;
   private String Combo_tipdefcod_Selectedtext_set ;
   private String Combo_tipdefcod_Selectedtext_get ;
   private String Combo_tipdefcod_Gamoauthtoken ;
   private String Combo_tipdefcod_Ddointernalname ;
   private String Combo_tipdefcod_Titlecontrolalign ;
   private String Combo_tipdefcod_Dropdownoptionstype ;
   private String Combo_tipdefcod_Titlecontrolidtoreplace ;
   private String Combo_tipdefcod_Datalisttype ;
   private String Combo_tipdefcod_Datalistfixedvalues ;
   private String Combo_tipdefcod_Datalistproc ;
   private String Combo_tipdefcod_Datalistprocparametersprefix ;
   private String Combo_tipdefcod_Remoteservicesparameters ;
   private String Combo_tipdefcod_Htmltemplate ;
   private String Combo_tipdefcod_Multiplevaluestype ;
   private String Combo_tipdefcod_Loadingdata ;
   private String Combo_tipdefcod_Noresultsfound ;
   private String Combo_tipdefcod_Emptyitemtext ;
   private String Combo_tipdefcod_Onlyselectedvalues ;
   private String Combo_tipdefcod_Selectalltext ;
   private String Combo_tipdefcod_Multiplevaluesseparator ;
   private String Combo_tipdefcod_Addnewoptiontext ;
   private String Combo_defmaqcod_Objectcall ;
   private String Combo_defmaqcod_Class ;
   private String Combo_defmaqcod_Icontype ;
   private String Combo_defmaqcod_Icon ;
   private String Combo_defmaqcod_Tooltip ;
   private String Combo_defmaqcod_Selectedvalue_set ;
   private String Combo_defmaqcod_Selectedvalue_get ;
   private String Combo_defmaqcod_Selectedtext_set ;
   private String Combo_defmaqcod_Selectedtext_get ;
   private String Combo_defmaqcod_Gamoauthtoken ;
   private String Combo_defmaqcod_Ddointernalname ;
   private String Combo_defmaqcod_Titlecontrolalign ;
   private String Combo_defmaqcod_Dropdownoptionstype ;
   private String Combo_defmaqcod_Titlecontrolidtoreplace ;
   private String Combo_defmaqcod_Datalisttype ;
   private String Combo_defmaqcod_Datalistfixedvalues ;
   private String Combo_defmaqcod_Datalistproc ;
   private String Combo_defmaqcod_Datalistprocparametersprefix ;
   private String Combo_defmaqcod_Remoteservicesparameters ;
   private String Combo_defmaqcod_Htmltemplate ;
   private String Combo_defmaqcod_Multiplevaluestype ;
   private String Combo_defmaqcod_Loadingdata ;
   private String Combo_defmaqcod_Noresultsfound ;
   private String Combo_defmaqcod_Onlyselectedvalues ;
   private String Combo_defmaqcod_Selectalltext ;
   private String Combo_defmaqcod_Multiplevaluesseparator ;
   private String Combo_defmaqcod_Addnewoptiontext ;
   private String Combo_defcausa_Objectcall ;
   private String Combo_defcausa_Class ;
   private String Combo_defcausa_Icontype ;
   private String Combo_defcausa_Icon ;
   private String Combo_defcausa_Tooltip ;
   private String Combo_defcausa_Selectedvalue_set ;
   private String Combo_defcausa_Selectedvalue_get ;
   private String Combo_defcausa_Selectedtext_set ;
   private String Combo_defcausa_Selectedtext_get ;
   private String Combo_defcausa_Gamoauthtoken ;
   private String Combo_defcausa_Ddointernalname ;
   private String Combo_defcausa_Titlecontrolalign ;
   private String Combo_defcausa_Dropdownoptionstype ;
   private String Combo_defcausa_Titlecontrolidtoreplace ;
   private String Combo_defcausa_Datalisttype ;
   private String Combo_defcausa_Datalistfixedvalues ;
   private String Combo_defcausa_Datalistproc ;
   private String Combo_defcausa_Datalistprocparametersprefix ;
   private String Combo_defcausa_Remoteservicesparameters ;
   private String Combo_defcausa_Htmltemplate ;
   private String Combo_defcausa_Multiplevaluestype ;
   private String Combo_defcausa_Loadingdata ;
   private String Combo_defcausa_Noresultsfound ;
   private String Combo_defcausa_Onlyselectedvalues ;
   private String Combo_defcausa_Selectalltext ;
   private String Combo_defcausa_Multiplevaluesseparator ;
   private String Combo_defcausa_Addnewoptiontext ;
   private String Combo_defresp_Objectcall ;
   private String Combo_defresp_Class ;
   private String Combo_defresp_Icontype ;
   private String Combo_defresp_Icon ;
   private String Combo_defresp_Tooltip ;
   private String Combo_defresp_Selectedvalue_set ;
   private String Combo_defresp_Selectedvalue_get ;
   private String Combo_defresp_Selectedtext_set ;
   private String Combo_defresp_Selectedtext_get ;
   private String Combo_defresp_Gamoauthtoken ;
   private String Combo_defresp_Ddointernalname ;
   private String Combo_defresp_Titlecontrolalign ;
   private String Combo_defresp_Dropdownoptionstype ;
   private String Combo_defresp_Titlecontrolidtoreplace ;
   private String Combo_defresp_Datalisttype ;
   private String Combo_defresp_Datalistfixedvalues ;
   private String Combo_defresp_Datalistproc ;
   private String Combo_defresp_Datalistprocparametersprefix ;
   private String Combo_defresp_Remoteservicesparameters ;
   private String Combo_defresp_Htmltemplate ;
   private String Combo_defresp_Multiplevaluestype ;
   private String Combo_defresp_Loadingdata ;
   private String Combo_defresp_Noresultsfound ;
   private String Combo_defresp_Onlyselectedvalues ;
   private String Combo_defresp_Selectalltext ;
   private String Combo_defresp_Multiplevaluesseparator ;
   private String Combo_defresp_Addnewoptiontext ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A14357DefMaqcod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z834TipDefDsc ;
   private String GXv_char4[] ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGridlevel_tipdef_Class ;
   private String subGridlevel_tipdef_Linesclass ;
   private String ROClassString ;
   private String edtTipDefCod_Jsonclick ;
   private String edtDefPor_Jsonclick ;
   private String edtDefMaqcod_Jsonclick ;
   private String edtDefCausa_Jsonclick ;
   private String edtDefResp_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_tipdef_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n833TipDefCod ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_tipdefcod_Isgriditem ;
   private boolean Combo_tipdefcod_Emptyitem ;
   private boolean Combo_defmaqcod_Isgriditem ;
   private boolean Combo_defcausa_Isgriditem ;
   private boolean Combo_defresp_Isgriditem ;
   private boolean n828SumPor ;
   private boolean n407EmprNom ;
   private boolean n834TipDefDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_tipdefcod_Enabled ;
   private boolean Combo_tipdefcod_Visible ;
   private boolean Combo_tipdefcod_Allowmultipleselection ;
   private boolean Combo_tipdefcod_Hasdescription ;
   private boolean Combo_tipdefcod_Includeonlyselectedoption ;
   private boolean Combo_tipdefcod_Includeselectalloption ;
   private boolean Combo_tipdefcod_Includeaddnewoption ;
   private boolean Combo_defmaqcod_Enabled ;
   private boolean Combo_defmaqcod_Visible ;
   private boolean Combo_defmaqcod_Allowmultipleselection ;
   private boolean Combo_defmaqcod_Hasdescription ;
   private boolean Combo_defmaqcod_Includeonlyselectedoption ;
   private boolean Combo_defmaqcod_Includeselectalloption ;
   private boolean Combo_defmaqcod_Emptyitem ;
   private boolean Combo_defmaqcod_Includeaddnewoption ;
   private boolean Combo_defcausa_Enabled ;
   private boolean Combo_defcausa_Visible ;
   private boolean Combo_defcausa_Allowmultipleselection ;
   private boolean Combo_defcausa_Hasdescription ;
   private boolean Combo_defcausa_Includeonlyselectedoption ;
   private boolean Combo_defcausa_Includeselectalloption ;
   private boolean Combo_defcausa_Emptyitem ;
   private boolean Combo_defcausa_Includeaddnewoption ;
   private boolean Combo_defresp_Enabled ;
   private boolean Combo_defresp_Visible ;
   private boolean Combo_defresp_Allowmultipleselection ;
   private boolean Combo_defresp_Hasdescription ;
   private boolean Combo_defresp_Includeonlyselectedoption ;
   private boolean Combo_defresp_Includeselectalloption ;
   private boolean Combo_defresp_Emptyitem ;
   private boolean Combo_defresp_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean n14357DefMaqcod ;
   private boolean n14358DefCausa ;
   private boolean n14359DefResp ;
   private String AV15Inc_obs ;
   private String AV13ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_tipdefContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_tipdefRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_tipdefColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipdefcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_defmaqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_defcausa ;
   private com.genexus.webpanels.GXUserControl ucCombo_defresp ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UY7_A407EmprNom ;
   private boolean[] T01UY7_n407EmprNom ;
   private short[] T01UY9_A828SumPor ;
   private boolean[] T01UY9_n828SumPor ;
   private int[] T01UY11_A361DisCod ;
   private String[] T01UY11_A407EmprNom ;
   private boolean[] T01UY11_n407EmprNom ;
   private String[] T01UY11_A396EmprCod ;
   private short[] T01UY11_A828SumPor ;
   private boolean[] T01UY11_n828SumPor ;
   private short[] T01UY13_A828SumPor ;
   private boolean[] T01UY13_n828SumPor ;
   private String[] T01UY14_A396EmprCod ;
   private int[] T01UY14_A361DisCod ;
   private int[] T01UY6_A361DisCod ;
   private String[] T01UY6_A396EmprCod ;
   private String[] T01UY15_A396EmprCod ;
   private int[] T01UY15_A361DisCod ;
   private String[] T01UY16_A396EmprCod ;
   private int[] T01UY16_A361DisCod ;
   private int[] T01UY5_A361DisCod ;
   private String[] T01UY5_A396EmprCod ;
   private short[] T01UY20_A828SumPor ;
   private boolean[] T01UY20_n828SumPor ;
   private String[] T01UY21_A396EmprCod ;
   private int[] T01UY21_A361DisCod ;
   private String[] T01UY21_A13376DisTraID ;
   private String[] T01UY22_A396EmprCod ;
   private int[] T01UY22_A361DisCod ;
   private String[] T01UY22_A13213DisNormID ;
   private String[] T01UY23_A396EmprCod ;
   private int[] T01UY23_A361DisCod ;
   private byte[] T01UY23_A13081DisDGLin ;
   private String[] T01UY23_A13082DisDGDibCl ;
   private int[] T01UY23_A13083DisDGDibIn ;
   private String[] T01UY23_A13084DisDGComb ;
   private String[] T01UY23_A13085DisDGFondo ;
   private String[] T01UY24_A396EmprCod ;
   private int[] T01UY24_A361DisCod ;
   private byte[] T01UY24_A7068DisNotLin ;
   private String[] T01UY25_A396EmprCod ;
   private int[] T01UY25_A361DisCod ;
   private String[] T01UY25_A10197ProEspCod ;
   private String[] T01UY26_A396EmprCod ;
   private int[] T01UY26_A361DisCod ;
   private short[] T01UY26_A4594AccCod ;
   private String[] T01UY27_A396EmprCod ;
   private int[] T01UY27_A361DisCod ;
   private byte[] T01UY27_A2524DisComLin ;
   private String[] T01UY27_A1056DisComCod ;
   private String[] T01UY27_A1032FonCod ;
   private String[] T01UY28_A396EmprCod ;
   private int[] T01UY28_A361DisCod ;
   private int[] T01UY28_A3398DisRefBarC ;
   private byte[] T01UY28_A3399DisRefBCRe ;
   private String[] T01UY28_A3400DisRefBCPa ;
   private String[] T01UY28_A3607DisRefBPie ;
   private String[] T01UY29_A396EmprCod ;
   private int[] T01UY29_A361DisCod ;
   private byte[] T01UY29_A376DisObsLin ;
   private String[] T01UY30_A396EmprCod ;
   private int[] T01UY30_A361DisCod ;
   private String[] T01UY30_A758ProCod ;
   private String[] T01UY31_A396EmprCod ;
   private int[] T01UY31_A129BarCod ;
   private byte[] T01UY31_A132BarCodReo ;
   private String[] T01UY31_A130BarCodPar ;
   private String[] T01UY32_A396EmprCod ;
   private int[] T01UY32_A361DisCod ;
   private int[] T01UY32_A44AlbRecCod ;
   private String[] T01UY33_A396EmprCod ;
   private int[] T01UY33_A361DisCod ;
   private int[] T01UY34_A361DisCod ;
   private short[] T01UY34_A319DefPor ;
   private String[] T01UY34_A834TipDefDsc ;
   private boolean[] T01UY34_n834TipDefDsc ;
   private String[] T01UY34_A14357DefMaqcod ;
   private boolean[] T01UY34_n14357DefMaqcod ;
   private short[] T01UY34_A14358DefCausa ;
   private boolean[] T01UY34_n14358DefCausa ;
   private short[] T01UY34_A14359DefResp ;
   private boolean[] T01UY34_n14359DefResp ;
   private String[] T01UY34_A396EmprCod ;
   private short[] T01UY34_A833TipDefCod ;
   private boolean[] T01UY34_n833TipDefCod ;
   private String[] T01UY4_A834TipDefDsc ;
   private boolean[] T01UY4_n834TipDefDsc ;
   private String[] T01UY35_A834TipDefDsc ;
   private boolean[] T01UY35_n834TipDefDsc ;
   private String[] T01UY36_A396EmprCod ;
   private int[] T01UY36_A361DisCod ;
   private short[] T01UY36_A833TipDefCod ;
   private boolean[] T01UY36_n833TipDefCod ;
   private int[] T01UY3_A361DisCod ;
   private short[] T01UY3_A319DefPor ;
   private String[] T01UY3_A14357DefMaqcod ;
   private boolean[] T01UY3_n14357DefMaqcod ;
   private short[] T01UY3_A14358DefCausa ;
   private boolean[] T01UY3_n14358DefCausa ;
   private short[] T01UY3_A14359DefResp ;
   private boolean[] T01UY3_n14359DefResp ;
   private String[] T01UY3_A396EmprCod ;
   private short[] T01UY3_A833TipDefCod ;
   private boolean[] T01UY3_n833TipDefCod ;
   private int[] T01UY2_A361DisCod ;
   private short[] T01UY2_A319DefPor ;
   private String[] T01UY2_A14357DefMaqcod ;
   private boolean[] T01UY2_n14357DefMaqcod ;
   private short[] T01UY2_A14358DefCausa ;
   private boolean[] T01UY2_n14358DefCausa ;
   private short[] T01UY2_A14359DefResp ;
   private boolean[] T01UY2_n14359DefResp ;
   private String[] T01UY2_A396EmprCod ;
   private short[] T01UY2_A833TipDefCod ;
   private boolean[] T01UY2_n833TipDefCod ;
   private String[] T01UY40_A834TipDefDsc ;
   private boolean[] T01UY40_n834TipDefDsc ;
   private String[] T01UY41_A396EmprCod ;
   private int[] T01UY41_A129BarCod ;
   private byte[] T01UY41_A132BarCodReo ;
   private String[] T01UY41_A130BarCodPar ;
   private String[] T01UY42_A396EmprCod ;
   private int[] T01UY42_A361DisCod ;
   private short[] T01UY42_A833TipDefCod ;
   private boolean[] T01UY42_n833TipDefCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12TipDefCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18DefMaqcod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19DefCausa_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20DefResp_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV22DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class defectos_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class defectos_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class defectos_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class defectos_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class defectos_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UY2", "SELECT DisCod, DefPor, DefMaqcod, DefCausa, DefResp, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?  FOR UPDATE OF DefPor, DefMaqcod, DefCausa, DefResp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY3", "SELECT DisCod, DefPor, DefMaqcod, DefCausa, DefResp, EmprCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY4", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY5", "SELECT DisCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY6", "SELECT DisCod, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY9", "SELECT COALESCE( T1.SumPor, 0) AS SumPor FROM (SELECT SUM(DefPor) AS SumPor, EmprCod, DisCod FROM TXPDISDEF GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY11", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, T2.EmprNom, TM1.EmprCod, COALESCE( T3.SumPor, 0) AS SumPor FROM ((TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DefPor) AS SumPor, EmprCod, DisCod FROM TXPDISDEF GROUP BY EmprCod, DisCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = TM1.DisCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY13", "SELECT COALESCE( T1.SumPor, 0) AS SumPor FROM (SELECT SUM(DefPor) AS SumPor, EmprCod, DisCod FROM TXPDISDEF GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ?) ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ?) ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UY17", "INSERT INTO TXPDISPOS(DisCod, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisEnt, DisObsULin, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPreKgm, DisPreMtr, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisDto, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T01UY18", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T01UY20", "SELECT COALESCE( T1.SumPor, 0) AS SumPor FROM (SELECT SUM(DefPor) AS SumPor, EmprCod, DisCod FROM TXPDISDEF GROUP BY EmprCod, DisCod ) T1 WHERE T1.EmprCod = ? AND T1.DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY21", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY22", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY23", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY24", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY25", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY26", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY27", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY28", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY29", "SELECT * FROM (SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY30", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY31", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY32", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY33", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY34", "SELECT T1.DisCod, T1.DefPor, T2.TipDefDsc, T1.DefMaqcod, T1.DefCausa, T1.DefResp, T1.EmprCod, T1.TipDefCod FROM (TXPDISDEF T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) WHERE T1.EmprCod = ? and T1.DisCod = ? and T1.TipDefCod = ? ORDER BY T1.EmprCod, T1.DisCod, T1.TipDefCod ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY35", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY36", "SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UY37", "INSERT INTO TXPDISDEF(DisCod, DefPor, DefMaqcod, DefCausa, DefResp, EmprCod, TipDefCod) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("T01UY38", "UPDATE TXPDISDEF SET DefPor=?, DefMaqcod=?, DefCausa=?, DefResp=?  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new UpdateCursor("T01UY39", "DELETE FROM TXPDISDEF  WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?", GX_NOMASK, "TXPDISDEF")
         ,new ForEachCursor("T01UY40", "SELECT TipDefDsc FROM TXPTIPDEF WHERE EmprCod = ? AND TipDefCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UY41", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARCAD WHERE EmprCod = ? AND DisCod = ? AND TipDefCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UY42", "SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, TipDefCod ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((short[]) buf[9])[0] = rslt.getShort(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
            case 14 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 28 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 3);
               ((short[]) buf[11])[0] = rslt.getShort(8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 36 :
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
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
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 31 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
               }
               stmt.setString(6, (String)parms[8], 3);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               return;
            case 32 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               stmt.setString(5, (String)parms[7], 3);
               stmt.setInt(6, ((Number) parms[8]).intValue());
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

