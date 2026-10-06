package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webdeflmetpiingdef_impl extends GXDataArea
{
   public webdeflmetpiingdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webdeflmetpiingdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdeflmetpiingdef_impl.class ));
   }

   public webdeflmetpiingdef_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Griddefectos") == 0 )
         {
            gxnrgriddefectos_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Griddefectos") == 0 )
         {
            gxgrgriddefectos_refresh_invoke( ) ;
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
            AV7EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV24WebSessionKey = httpContext.GetPar( "WebSessionKey") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24WebSessionKey", AV24WebSessionKey);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24WebSessionKey, ""))));
               AV27BarUnimed = httpContext.GetPar( "BarUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27BarUnimed", AV27BarUnimed);
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgriddefectos_newrow_invoke( )
   {
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
      edtTipDefCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefDs2_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDs2_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipdefDscI_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipdefDscI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipdefDscI_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtCatDefCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDefCod_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtMaqDef_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDef_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefTp_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefTp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefTp_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefAb_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefAb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefAb_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefAct_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefAct_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefMedH_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefMedH_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefMedH_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefLong_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefLong_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefLong_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefPtos_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefPtos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefPtos_Visible), 5, 0), !bGXsfl_52_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgriddefectos_newrow( ) ;
      /* End function gxnrGriddefectos_newrow_invoke */
   }

   public void gxgrgriddefectos_refresh_invoke( )
   {
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV27BarUnimed = httpContext.GetPar( "BarUnimed") ;
      edtTipDefCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefDs2_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDs2_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipdefDscI_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipdefDscI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipdefDscI_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtCatDefCod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDefCod_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtMaqDef_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDef_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefTp_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefTp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefTp_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefAb_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefAb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefAb_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefAct_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefAct_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefMedH_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefMedH_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefMedH_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefLong_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefLong_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefLong_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefPtos_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefPtos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefPtos_Visible), 5, 0), !bGXsfl_52_Refreshing);
      AV24WebSessionKey = httpContext.GetPar( "WebSessionKey") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgriddefectos_refresh( AV7EmprCod, AV27BarUnimed, AV24WebSessionKey) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGriddefectos_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
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

   public byte executeStartEvent( )
   {
      pa1FC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FC2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webdeflmetpiingdef", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV24WebSessionKey)),GXutil.URLEncode(GXutil.rtrim(AV27BarUnimed))}, new String[] {"EmprCod","WebSessionKey","BarUnimed"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24WebSessionKey, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR1", GXutil.ltrim( localUtil.ntoc( AV22var1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOUNT", GXutil.ltrim( localUtil.ntoc( AV6count, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY", GXutil.rtrim( AV24WebSessionKey));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24WebSessionKey, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV27BarUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "VAR1_Enabled", GXutil.booltostr( Var1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "VAR1_Maxvalue", GXutil.ltrim( localUtil.ntoc( Var1_Maxvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VAR1_Captionclass", GXutil.rtrim( Var1_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "VAR1_Captionstyle", GXutil.rtrim( Var1_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "VAR1_Captionposition", GXutil.rtrim( Var1_Captionposition));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Width", GXutil.rtrim( Dvpanel_freegrid_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Autowidth", GXutil.booltostr( Dvpanel_freegrid_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Autoheight", GXutil.booltostr( Dvpanel_freegrid_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Cls", GXutil.rtrim( Dvpanel_freegrid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Title", GXutil.rtrim( Dvpanel_freegrid_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Collapsible", GXutil.booltostr( Dvpanel_freegrid_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Collapsed", GXutil.booltostr( Dvpanel_freegrid_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Showcollapseicon", GXutil.booltostr( Dvpanel_freegrid_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Iconposition", GXutil.rtrim( Dvpanel_freegrid_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_FREEGRID_Autoscroll", GXutil.booltostr( Dvpanel_freegrid_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDS2_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefDs2_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDSCI_Visible", GXutil.ltrim( localUtil.ntoc( edtTipdefDscI_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CATDEFCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtCatDefCod_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDEF_Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDef_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFTP_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefTp_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFAB_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefAb_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFACT_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefAct_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFMEDH_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefMedH_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFLONG_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefLong_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFPTOS_Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefPtos_Visible, (byte)(5), (byte)(0), ".", "")));
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
      if ( ! ( WebComp_Wcwc_defectos == null ) )
      {
         WebComp_Wcwc_defectos.componentjscripts();
      }
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1FC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FC2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.expedicionesautomatizadas.webdeflmetpiingdef", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV24WebSessionKey)),GXutil.URLEncode(GXutil.rtrim(AV27BarUnimed))}, new String[] {"EmprCod","WebSessionKey","BarUnimed"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebDefLMETPIIngdef" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " TIPOS DEFECTOS", "") ;
   }

   public void wb1FC0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Retornar", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavToday_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavToday_Internalname, httpContext.getMessage( "Today", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavToday_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavToday_Internalname, localUtil.format(Gx_date, "99/99/99"), localUtil.format( Gx_date, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavToday_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavToday_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavToday_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavToday_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavUsurcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUsurcod_Internalname, httpContext.getMessage( "Nombre", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUsurcod_Internalname, GXutil.rtrim( AV21UsurCod), GXutil.rtrim( localUtil.format( AV21UsurCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsurcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUsurcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavEmprcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprcod_Internalname, httpContext.getMessage( "Codigo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV7EmprCod), GXutil.rtrim( localUtil.format( AV7EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavEmprcod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetros_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetros_Internalname, httpContext.getMessage( "Metros", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetros_Internalname, GXutil.ltrim( localUtil.ntoc( AV12Metros, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetros_Enabled!=0) ? localUtil.format( AV12Metros, "ZZZ9.99") : localUtil.format( AV12Metros, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetros_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", -1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+Var1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, Var1_Internalname, httpContext.getMessage( "var1", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucVar1.setProperty("Attribute", AV22var1);
         ucVar1.setProperty("CaptionClass", Var1_Captionclass);
         ucVar1.setProperty("CaptionStyle", Var1_Captionstyle);
         ucVar1.setProperty("CaptionPosition", Var1_Captionposition);
         ucVar1.render(context, "sdchronometer", Var1_Internalname, "VAR1Container");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablegriddefectos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_freegrid.setProperty("Width", Dvpanel_freegrid_Width);
         ucDvpanel_freegrid.setProperty("AutoWidth", Dvpanel_freegrid_Autowidth);
         ucDvpanel_freegrid.setProperty("AutoHeight", Dvpanel_freegrid_Autoheight);
         ucDvpanel_freegrid.setProperty("Cls", Dvpanel_freegrid_Cls);
         ucDvpanel_freegrid.setProperty("Title", Dvpanel_freegrid_Title);
         ucDvpanel_freegrid.setProperty("Collapsible", Dvpanel_freegrid_Collapsible);
         ucDvpanel_freegrid.setProperty("Collapsed", Dvpanel_freegrid_Collapsed);
         ucDvpanel_freegrid.setProperty("ShowCollapseIcon", Dvpanel_freegrid_Showcollapseicon);
         ucDvpanel_freegrid.setProperty("IconPosition", Dvpanel_freegrid_Iconposition);
         ucDvpanel_freegrid.setProperty("AutoScroll", Dvpanel_freegrid_Autoscroll);
         ucDvpanel_freegrid.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_freegrid_Internalname, "DVPANEL_FREEGRIDContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_FREEGRIDContainer"+"FreeGrid"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divFreegrid_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /*  Grid Control  */
         GriddefectosContainer.SetIsFreestyle(true);
         GriddefectosContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
         if ( GriddefectosContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GriddefectosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Griddefectos", GriddefectosContainer, subGriddefectos_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GriddefectosContainerData", GriddefectosContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GriddefectosContainerData"+"V", GriddefectosContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GriddefectosContainerData"+"V"+"\" value='"+GriddefectosContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesubgrid_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0099"+"", GXutil.rtrim( WebComp_Wcwc_defectos_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0099"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_52_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwc_defectos_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwc_defectos), GXutil.lower( WebComp_Wcwc_defectos_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0099"+"");
                  }
                  WebComp_Wcwc_defectos.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwc_defectos), GXutil.lower( WebComp_Wcwc_defectos_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom_Internalname, GXutil.rtrim( AV8EmprNom), GXutil.rtrim( localUtil.format( AV8EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprnom_Visible, 1, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebDefLMETPIIngdef.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GriddefectosContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GriddefectosContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Griddefectos", GriddefectosContainer, subGriddefectos_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GriddefectosContainerData", GriddefectosContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GriddefectosContainerData"+"V", GriddefectosContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GriddefectosContainerData"+"V"+"\" value='"+GriddefectosContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1FC2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( " TIPOS DEFECTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FC0( ) ;
   }

   public void ws1FC2( )
   {
      start1FC2( ) ;
      evt1FC2( ) ;
   }

   public void evt1FC2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "GRIDDEFECTOS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "TIPDEFDSC.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "TIPDEFDSC.CLICK") == 0 ) )
                        {
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
                           n834TipDefDsc = false ;
                           A833TipDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6870TipDefDs2 = httpContext.cgiGet( edtTipDefDs2_Internalname) ;
                           n6870TipDefDs2 = false ;
                           A13819TipdefDscI = httpContext.cgiGet( edtTipdefDscI_Internalname) ;
                           A4413CatDefCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCatDefCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4413CatDefCod = false ;
                           A12346MaqDef = httpContext.cgiGet( edtMaqDef_Internalname) ;
                           n12346MaqDef = false ;
                           A13001TipDefTp = httpContext.cgiGet( edtTipDefTp_Internalname) ;
                           n13001TipDefTp = false ;
                           A13002TipDefAb = httpContext.cgiGet( edtTipDefAb_Internalname) ;
                           n13002TipDefAb = false ;
                           A13003TipDefAct = httpContext.cgiGet( edtTipDefAct_Internalname) ;
                           n13003TipDefAct = false ;
                           A13520TipDefMedH = httpContext.cgiGet( edtTipDefMedH_Internalname) ;
                           n13520TipDefMedH = false ;
                           A13570TipDefLong = localUtil.ctond( httpContext.cgiGet( edtTipDefLong_Internalname)) ;
                           n13570TipDefLong = false ;
                           A13571TipDefPtos = (short)(localUtil.ctol( httpContext.cgiGet( edtTipDefPtos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13571TipDefPtos = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111FC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDDEFECTOS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e121FC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "TIPDEFDSC.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e131FC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 99 )
                     {
                        OldWcwc_defectos = httpContext.cgiGet( "W0099") ;
                        if ( ( GXutil.len( OldWcwc_defectos) == 0 ) || ( GXutil.strcmp(OldWcwc_defectos, WebComp_Wcwc_defectos_Component) != 0 ) )
                        {
                           WebComp_Wcwc_defectos = WebUtils.getWebComponent(getClass(), "app." + OldWcwc_defectos + "_impl", remoteHandle, context);
                           WebComp_Wcwc_defectos_Component = OldWcwc_defectos ;
                        }
                        if ( GXutil.len( WebComp_Wcwc_defectos_Component) != 0 )
                        {
                           WebComp_Wcwc_defectos.componentprocess("W0099", "", sEvt);
                        }
                        WebComp_Wcwc_defectos_Component = OldWcwc_defectos ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1FC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1FC2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavUsurcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgriddefectos_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGriddefectos_Islastpage==1)&&(nGXsfl_52_idx+1>subgriddefectos_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GriddefectosContainer)) ;
      /* End function gxnrGriddefectos_newrow */
   }

   public void gxgrgriddefectos_refresh( String AV7EmprCod ,
                                         String AV27BarUnimed ,
                                         String AV24WebSessionKey )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDDEFECTOS_nCurrentRecord = 0 ;
      rf1FC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGriddefectos_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPDEFCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPDEFDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A834TipDefDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFDSC", GXutil.rtrim( A834TipDefDsc));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1FC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToday_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetros_Enabled), 5, 0), true);
   }

   public int subgriddefectosclient_rec_count_fnc( )
   {
      GRIDDEFECTOS_nRecordCount = 0 ;
      /* Using cursor H01FC2 */
      pr_default.execute(0, new Object[] {AV7EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01FC2_A396EmprCod[0] ;
         A13571TipDefPtos = H01FC2_A13571TipDefPtos[0] ;
         n13571TipDefPtos = H01FC2_n13571TipDefPtos[0] ;
         A13570TipDefLong = H01FC2_A13570TipDefLong[0] ;
         n13570TipDefLong = H01FC2_n13570TipDefLong[0] ;
         A13520TipDefMedH = H01FC2_A13520TipDefMedH[0] ;
         n13520TipDefMedH = H01FC2_n13520TipDefMedH[0] ;
         A13003TipDefAct = H01FC2_A13003TipDefAct[0] ;
         n13003TipDefAct = H01FC2_n13003TipDefAct[0] ;
         A13002TipDefAb = H01FC2_A13002TipDefAb[0] ;
         n13002TipDefAb = H01FC2_n13002TipDefAb[0] ;
         A13001TipDefTp = H01FC2_A13001TipDefTp[0] ;
         n13001TipDefTp = H01FC2_n13001TipDefTp[0] ;
         A12346MaqDef = H01FC2_A12346MaqDef[0] ;
         n12346MaqDef = H01FC2_n12346MaqDef[0] ;
         A4413CatDefCod = H01FC2_A4413CatDefCod[0] ;
         n4413CatDefCod = H01FC2_n4413CatDefCod[0] ;
         A6870TipDefDs2 = H01FC2_A6870TipDefDs2[0] ;
         n6870TipDefDs2 = H01FC2_n6870TipDefDs2[0] ;
         A834TipDefDsc = H01FC2_A834TipDefDsc[0] ;
         n834TipDefDsc = H01FC2_n834TipDefDsc[0] ;
         A833TipDefCod = H01FC2_A833TipDefCod[0] ;
         if ( GXutil.strcmp(A13003TipDefAct, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( ( GXutil.strcmp(A13001TipDefTp, AV27BarUnimed) == 0 ) || ( GXutil.strcmp(A13001TipDefTp, httpContext.getMessage( "Z", "")) == 0 ) )
            {
               A13819TipdefDscI = GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) + "-" + GXutil.trim( A834TipDefDsc) ;
               GRIDDEFECTOS_nRecordCount = (long)(GRIDDEFECTOS_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      return (int)(GRIDDEFECTOS_nRecordCount) ;
   }

   public void rf1FC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GriddefectosContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      nGXsfl_52_idx = 1 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      GriddefectosContainer.AddObjectProperty("GridName", "Griddefectos");
      GriddefectosContainer.AddObjectProperty("CmpContext", "");
      GriddefectosContainer.AddObjectProperty("InMasterPage", "false");
      GriddefectosContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GriddefectosContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GriddefectosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GriddefectosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GriddefectosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GriddefectosContainer.setPageSize( subgriddefectos_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwc_defectos_Component) != 0 )
            {
               WebComp_Wcwc_defectos.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_522( ) ;
         /* Using cursor H01FC3 */
         pr_default.execute(1, new Object[] {AV7EmprCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A396EmprCod = H01FC3_A396EmprCod[0] ;
            A13571TipDefPtos = H01FC3_A13571TipDefPtos[0] ;
            n13571TipDefPtos = H01FC3_n13571TipDefPtos[0] ;
            A13570TipDefLong = H01FC3_A13570TipDefLong[0] ;
            n13570TipDefLong = H01FC3_n13570TipDefLong[0] ;
            A13520TipDefMedH = H01FC3_A13520TipDefMedH[0] ;
            n13520TipDefMedH = H01FC3_n13520TipDefMedH[0] ;
            A13003TipDefAct = H01FC3_A13003TipDefAct[0] ;
            n13003TipDefAct = H01FC3_n13003TipDefAct[0] ;
            A13002TipDefAb = H01FC3_A13002TipDefAb[0] ;
            n13002TipDefAb = H01FC3_n13002TipDefAb[0] ;
            A13001TipDefTp = H01FC3_A13001TipDefTp[0] ;
            n13001TipDefTp = H01FC3_n13001TipDefTp[0] ;
            A12346MaqDef = H01FC3_A12346MaqDef[0] ;
            n12346MaqDef = H01FC3_n12346MaqDef[0] ;
            A4413CatDefCod = H01FC3_A4413CatDefCod[0] ;
            n4413CatDefCod = H01FC3_n4413CatDefCod[0] ;
            A6870TipDefDs2 = H01FC3_A6870TipDefDs2[0] ;
            n6870TipDefDs2 = H01FC3_n6870TipDefDs2[0] ;
            A834TipDefDsc = H01FC3_A834TipDefDsc[0] ;
            n834TipDefDsc = H01FC3_n834TipDefDsc[0] ;
            A833TipDefCod = H01FC3_A833TipDefCod[0] ;
            if ( GXutil.strcmp(A13003TipDefAct, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( ( GXutil.strcmp(A13001TipDefTp, AV27BarUnimed) == 0 ) || ( GXutil.strcmp(A13001TipDefTp, httpContext.getMessage( "Z", "")) == 0 ) )
               {
                  A13819TipdefDscI = GXutil.trim( GXutil.str( A833TipDefCod, 4, 0)) + "-" + GXutil.trim( A834TipDefDsc) ;
                  e121FC2 ();
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         wbEnd = (short)(52) ;
         wb1FC0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY", GXutil.rtrim( AV24WebSessionKey));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24WebSessionKey, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPDEFCOD"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPDEFDSC"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, GXutil.rtrim( localUtil.format( A834TipDefDsc, ""))));
   }

   public int subgriddefectos_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgriddefectos_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgriddefectos_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgriddefectos_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToday_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), true);
      edtavMetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetros_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1FC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111FC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV22var1 = (short)(localUtil.ctol( httpContext.cgiGet( "vVAR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV6count = (short)(localUtil.ctol( httpContext.cgiGet( "vCOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Var1_Enabled = GXutil.strtobool( httpContext.cgiGet( "VAR1_Enabled")) ;
         Var1_Maxvalue = (int)(localUtil.ctol( httpContext.cgiGet( "VAR1_Maxvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Var1_Captionclass = httpContext.cgiGet( "VAR1_Captionclass") ;
         Var1_Captionstyle = httpContext.cgiGet( "VAR1_Captionstyle") ;
         Var1_Captionposition = httpContext.cgiGet( "VAR1_Captionposition") ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_freegrid_Width = httpContext.cgiGet( "DVPANEL_FREEGRID_Width") ;
         Dvpanel_freegrid_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FREEGRID_Autowidth")) ;
         Dvpanel_freegrid_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FREEGRID_Autoheight")) ;
         Dvpanel_freegrid_Cls = httpContext.cgiGet( "DVPANEL_FREEGRID_Cls") ;
         Dvpanel_freegrid_Title = httpContext.cgiGet( "DVPANEL_FREEGRID_Title") ;
         Dvpanel_freegrid_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FREEGRID_Collapsible")) ;
         Dvpanel_freegrid_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FREEGRID_Collapsed")) ;
         Dvpanel_freegrid_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FREEGRID_Showcollapseicon")) ;
         Dvpanel_freegrid_Iconposition = httpContext.cgiGet( "DVPANEL_FREEGRID_Iconposition") ;
         Dvpanel_freegrid_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_FREEGRID_Autoscroll")) ;
         /* Read variables values. */
         Gx_date = localUtil.ctod( httpContext.cgiGet( edtavToday_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
         AV21UsurCod = GXutil.upper( httpContext.cgiGet( edtavUsurcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
         AV7EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETROS");
            GX_FocusControl = edtavMetros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12Metros = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Metros", GXutil.ltrimstr( AV12Metros, 7, 2));
         }
         else
         {
            AV12Metros = localUtil.ctond( httpContext.cgiGet( edtavMetros_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Metros", GXutil.ltrimstr( AV12Metros, 7, 2));
         }
         AV8EmprNom = httpContext.cgiGet( edtavEmprnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e111FC2 ();
      if (returnInSub) return;
   }

   public void e111FC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webdeflmetpiingdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      webdeflmetpiingdef_impl.this.AV7EmprCod = GXv_char2[0] ;
      webdeflmetpiingdef_impl.this.AV8EmprNom = GXv_char3[0] ;
      webdeflmetpiingdef_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      AV16SDT_PiezaDefectos.clear();
      AV12Metros = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Metros", GXutil.ltrimstr( AV12Metros, 7, 2));
      AV6count = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6count", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6count), 4, 0));
      AV22var1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22var1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22var1), 4, 0));
      Var1_Maxvalue = 400 ;
      httpContext.ajax_rsp_assign_prop("", false, Var1_Internalname, "MaxValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Var1_Maxvalue), 9, 0), true);
      this.executeUsercontrolMethod("", false, "VAR1Container", "Start", "", new Object[] {});
      GXt_char1 = AV5Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webdeflmetpiingdef_impl.this.GXt_char1 = GXv_char4[0] ;
      AV5Station = GXt_char1 ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char4, GXv_char3, GXv_char2) ;
      webdeflmetpiingdef_impl.this.AV7EmprCod = GXv_char4[0] ;
      webdeflmetpiingdef_impl.this.AV8EmprNom = GXv_char3[0] ;
      webdeflmetpiingdef_impl.this.AV21UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprNom", AV8EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      edtavEmprnom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Visible), 5, 0), true);
      edtTipDefCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefCod_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefDs2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDs2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDs2_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipdefDscI_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipdefDscI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipdefDscI_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtCatDefCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCatDefCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCatDefCod_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtMaqDef_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDef_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefTp_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefTp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefTp_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefAb_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefAb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefAb_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefAct_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefAct_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefMedH_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefMedH_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefMedH_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefLong_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefLong_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefLong_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtTipDefPtos_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefPtos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefPtos_Visible), 5, 0), !bGXsfl_52_Refreshing);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwc_defectos = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwc_defectos_Component), GXutil.lower( "ExpedicionesAutomatizadas.WC_Defectos")) != 0 )
      {
         WebComp_Wcwc_defectos = WebUtils.getWebComponent(getClass(), "app.expedicionesautomatizadas.wc_defectos_impl", remoteHandle, context);
         WebComp_Wcwc_defectos_Component = "ExpedicionesAutomatizadas.WC_Defectos" ;
      }
      if ( GXutil.len( WebComp_Wcwc_defectos_Component) != 0 )
      {
         WebComp_Wcwc_defectos.setjustcreated();
         WebComp_Wcwc_defectos.componentprepare(new Object[] {"W0099","",AV24WebSessionKey});
         WebComp_Wcwc_defectos.componentbind(new Object[] {""});
      }
   }

   private void e121FC2( )
   {
      /* Griddefectos_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(52) ;
      }
      sendrow_522( ) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GriddefectosRow);
      }
   }

   public void e131FC2( )
   {
      /* TipDefDsc_Click Routine */
      returnInSub = false ;
      AV16SDT_PiezaDefectos.fromJSonString(AV23WebSession.getValue(AV24WebSessionKey), null);
      AV15SDT_PiezaDefecto = (app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto)new app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto(remoteHandle, context);
      AV15SDT_PiezaDefecto.setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefcod( A833TipDefCod );
      AV15SDT_PiezaDefecto.setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Tipdefdsc( A834TipDefDsc );
      AV15SDT_PiezaDefecto.setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetini( AV12Metros );
      AV15SDT_PiezaDefecto.setgxTv_SdtSDT_PiezaDefectos_SDT_PiezaDefecto_Metpiemetfin( AV12Metros );
      AV16SDT_PiezaDefectos.add(AV15SDT_PiezaDefecto, 0);
      AV23WebSession.setValue(AV24WebSessionKey, AV16SDT_PiezaDefectos.toJSonString(false));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwc_defectos = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwc_defectos_Component), GXutil.lower( "ExpedicionesAutomatizadas.WC_Defectos")) != 0 )
      {
         WebComp_Wcwc_defectos = WebUtils.getWebComponent(getClass(), "app.expedicionesautomatizadas.wc_defectos_impl", remoteHandle, context);
         WebComp_Wcwc_defectos_Component = "ExpedicionesAutomatizadas.WC_Defectos" ;
      }
      if ( GXutil.len( WebComp_Wcwc_defectos_Component) != 0 )
      {
         WebComp_Wcwc_defectos.setjustcreated();
         WebComp_Wcwc_defectos.componentprepare(new Object[] {"W0099","",AV24WebSessionKey});
         WebComp_Wcwc_defectos.componentbind(new Object[] {""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwc_defectos )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0099"+"");
         WebComp_Wcwc_defectos.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      AV24WebSessionKey = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24WebSessionKey", AV24WebSessionKey);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24WebSessionKey, ""))));
      AV27BarUnimed = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27BarUnimed", AV27BarUnimed);
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1FC2( ) ;
      ws1FC2( ) ;
      we1FC2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwc_defectos == null ) )
      {
         if ( GXutil.len( WebComp_Wcwc_defectos_Component) != 0 )
         {
            WebComp_Wcwc_defectos.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643121", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webdeflmetpiingdef.js", "?20266101643121", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/timer.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/timerjs/moment-duration-format.js", "", false, true);
      httpContext.AddJavascriptSource("SDChronometer/ChronometerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_52_idx ;
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_52_idx ;
      edtTipDefDs2_Internalname = "TIPDEFDS2_"+sGXsfl_52_idx ;
      edtTipdefDscI_Internalname = "TIPDEFDSCI_"+sGXsfl_52_idx ;
      edtCatDefCod_Internalname = "CATDEFCOD_"+sGXsfl_52_idx ;
      edtMaqDef_Internalname = "MAQDEF_"+sGXsfl_52_idx ;
      edtTipDefTp_Internalname = "TIPDEFTP_"+sGXsfl_52_idx ;
      edtTipDefAb_Internalname = "TIPDEFAB_"+sGXsfl_52_idx ;
      edtTipDefAct_Internalname = "TIPDEFACT_"+sGXsfl_52_idx ;
      edtTipDefMedH_Internalname = "TIPDEFMEDH_"+sGXsfl_52_idx ;
      edtTipDefLong_Internalname = "TIPDEFLONG_"+sGXsfl_52_idx ;
      edtTipDefPtos_Internalname = "TIPDEFPTOS_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_52_fel_idx ;
      edtTipDefCod_Internalname = "TIPDEFCOD_"+sGXsfl_52_fel_idx ;
      edtTipDefDs2_Internalname = "TIPDEFDS2_"+sGXsfl_52_fel_idx ;
      edtTipdefDscI_Internalname = "TIPDEFDSCI_"+sGXsfl_52_fel_idx ;
      edtCatDefCod_Internalname = "CATDEFCOD_"+sGXsfl_52_fel_idx ;
      edtMaqDef_Internalname = "MAQDEF_"+sGXsfl_52_fel_idx ;
      edtTipDefTp_Internalname = "TIPDEFTP_"+sGXsfl_52_fel_idx ;
      edtTipDefAb_Internalname = "TIPDEFAB_"+sGXsfl_52_fel_idx ;
      edtTipDefAct_Internalname = "TIPDEFACT_"+sGXsfl_52_fel_idx ;
      edtTipDefMedH_Internalname = "TIPDEFMEDH_"+sGXsfl_52_fel_idx ;
      edtTipDefLong_Internalname = "TIPDEFLONG_"+sGXsfl_52_fel_idx ;
      edtTipDefPtos_Internalname = "TIPDEFPTOS_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb1FC0( ) ;
      GriddefectosRow = GXWebRow.GetNew(context,GriddefectosContainer) ;
      if ( subGriddefectos_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGriddefectos_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGriddefectos_Class, "") != 0 )
         {
            subGriddefectos_Linesclass = subGriddefectos_Class+"Odd" ;
         }
      }
      else if ( subGriddefectos_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGriddefectos_Backstyle = (byte)(0) ;
         subGriddefectos_Backcolor = subGriddefectos_Allbackcolor ;
         if ( GXutil.strcmp(subGriddefectos_Class, "") != 0 )
         {
            subGriddefectos_Linesclass = subGriddefectos_Class+"Uniform" ;
         }
      }
      else if ( subGriddefectos_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGriddefectos_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGriddefectos_Class, "") != 0 )
         {
            subGriddefectos_Linesclass = subGriddefectos_Class+"Odd" ;
         }
         subGriddefectos_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGriddefectos_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGriddefectos_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
         {
            subGriddefectos_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGriddefectos_Class, "") != 0 )
            {
               subGriddefectos_Linesclass = subGriddefectos_Class+"Even" ;
            }
         }
         else
         {
            subGriddefectos_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGriddefectos_Class, "") != 0 )
            {
               subGriddefectos_Linesclass = subGriddefectos_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGriddefectos_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_52_idx+"\">") ;
      }
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablefsgriddefectos_Internalname+"_"+sGXsfl_52_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Table","left","top","","","div"});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12","left","top","","","div"});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefDsc_Internalname,httpContext.getMessage( "Descripcion", ""),"col-sm-3 BlobContentActionAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),""});
      /* Single line edit */
      ROClassString = "BlobContentActionAttribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefDsc_Internalname,GXutil.rtrim( A834TipDefDsc),"","","'"+""+"'"+",false,"+"'"+"ETIPDEFDSC.CLICK."+sGXsfl_52_idx+"'","","","","",edtTipDefDsc_Jsonclick,Integer.valueOf(5),"BlobContentActionAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","row","left","top","","","div"});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","col-xs-12 Invisible","left","top","","","div"});
      /* Table start */
      GriddefectosRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablecontentfsgriddefectos_Internalname+"_"+sGXsfl_52_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GriddefectosRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefCod_Internalname,httpContext.getMessage( "Defecto", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefCod_Internalname,GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A833TipDefCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefDs2_Internalname,httpContext.getMessage( "Descripcion II", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefDs2_Internalname,GXutil.rtrim( A6870TipDefDs2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefDs2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefDs2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(30),"chr",Integer.valueOf(1),"row",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipdefDscI_Internalname,httpContext.getMessage( "Codigo-Descripcion", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipdefDscI_Internalname,A13819TipdefDscI,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipdefDscI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipdefDscI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(40),"chr",Integer.valueOf(1),"row",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtCatDefCod_Internalname,httpContext.getMessage( "Categoria", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCatDefCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4413CatDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4413CatDefCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCatDefCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtCatDefCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtMaqDef_Internalname,httpContext.getMessage( "Maquina (Seccion)", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDef_Internalname,GXutil.rtrim( A12346MaqDef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtMaqDef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefTp_Internalname,httpContext.getMessage( "Tipo Tejido", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefTp_Internalname,GXutil.rtrim( A13001TipDefTp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefTp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefTp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefAb_Internalname,httpContext.getMessage( "Abreviatura", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefAb_Internalname,GXutil.rtrim( A13002TipDefAb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefAb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefAb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      sendrow_52230( ) ;
   }

   public void sendrow_52230( )
   {
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefAct_Internalname,httpContext.getMessage( "Activo? ", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefAct_Internalname,GXutil.rtrim( A13003TipDefAct),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefMedH_Internalname,httpContext.getMessage( "Medida Horizontal?", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefMedH_Internalname,GXutil.rtrim( A13520TipDefMedH),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefMedH_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefMedH_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefLong_Internalname,httpContext.getMessage( "Longitud", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefLong_Internalname,GXutil.ltrim( localUtil.ntoc( A13570TipDefLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13570TipDefLong, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefLong_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefLong_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      GriddefectosRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GriddefectosRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GriddefectosRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtTipDefPtos_Internalname,httpContext.getMessage( "Puntos", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GriddefectosRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefPtos_Internalname,GXutil.ltrim( localUtil.ntoc( A13571TipDefPtos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13571TipDefPtos), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefPtos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtTipDefPtos_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("cell");
      }
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("row");
      }
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         GriddefectosContainer.CloseTag("table");
      }
      /* End of table */
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GriddefectosRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      send_integrity_lvl_hashes1FC2( ) ;
      /* End of Columns property logic. */
      GriddefectosContainer.AddRow(GriddefectosRow);
      nGXsfl_52_idx = ((subGriddefectos_Islastpage==1)&&(nGXsfl_52_idx+1>subgriddefectos_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GriddefectosContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GriddefectosContainer"+"DivS\" data-gxgridid=\"52\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGriddefectos_Internalname, subGriddefectos_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GriddefectosContainer.AddObjectProperty("GridName", "Griddefectos");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GriddefectosContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GriddefectosContainer.Clear();
         }
         GriddefectosContainer.SetIsFreestyle(true);
         GriddefectosContainer.SetWrapped(nGXWrapped);
         GriddefectosContainer.AddObjectProperty("GridName", "Griddefectos");
         GriddefectosContainer.AddObjectProperty("Header", subGriddefectos_Header);
         GriddefectosContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         GriddefectosContainer.AddObjectProperty("Class", "FreeStyleGrid");
         GriddefectosContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("CmpContext", "");
         GriddefectosContainer.AddObjectProperty("InMasterPage", "false");
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A834TipDefDsc));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A6870TipDefDs2));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefDs2_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", A13819TipdefDscI);
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipdefDscI_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4413CatDefCod, (byte)(4), (byte)(0), ".", "")));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCatDefCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A12346MaqDef));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDef_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A13001TipDefTp));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefTp_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A13002TipDefAb));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefAb_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A13003TipDefAct));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.rtrim( A13520TipDefMedH));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefMedH_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13570TipDefLong, (byte)(9), (byte)(2), ".", "")));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefLong_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GriddefectosColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13571TipDefPtos, (byte)(4), (byte)(0), ".", "")));
         GriddefectosColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefPtos_Visible, (byte)(5), (byte)(0), ".", "")));
         GriddefectosContainer.AddColumnProperties(GriddefectosColumn);
         GriddefectosContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GriddefectosContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGriddefectos_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtncancel_Internalname = "BTNCANCEL" ;
      edtavToday_Internalname = "vTODAY" ;
      edtavUsurcod_Internalname = "vUSURCOD" ;
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      edtavMetros_Internalname = "vMETROS" ;
      Var1_Internalname = "VAR1" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
      edtTipDefCod_Internalname = "TIPDEFCOD" ;
      edtTipDefDs2_Internalname = "TIPDEFDS2" ;
      edtTipdefDscI_Internalname = "TIPDEFDSCI" ;
      edtCatDefCod_Internalname = "CATDEFCOD" ;
      edtMaqDef_Internalname = "MAQDEF" ;
      edtTipDefTp_Internalname = "TIPDEFTP" ;
      edtTipDefAb_Internalname = "TIPDEFAB" ;
      edtTipDefAct_Internalname = "TIPDEFACT" ;
      edtTipDefMedH_Internalname = "TIPDEFMEDH" ;
      edtTipDefLong_Internalname = "TIPDEFLONG" ;
      edtTipDefPtos_Internalname = "TIPDEFPTOS" ;
      tblUnnamedtablecontentfsgriddefectos_Internalname = "UNNAMEDTABLECONTENTFSGRIDDEFECTOS" ;
      divUnnamedtablefsgriddefectos_Internalname = "UNNAMEDTABLEFSGRIDDEFECTOS" ;
      divFreegrid_Internalname = "FREEGRID" ;
      Dvpanel_freegrid_Internalname = "DVPANEL_FREEGRID" ;
      divTablegriddefectos_Internalname = "TABLEGRIDDEFECTOS" ;
      divTablesubgrid_Internalname = "TABLESUBGRID" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavEmprnom_Internalname = "vEMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGriddefectos_Internalname = "GRIDDEFECTOS" ;
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
      subGriddefectos_Allowcollapsing = (byte)(0) ;
      edtTipDefPtos_Jsonclick = "" ;
      edtTipDefLong_Jsonclick = "" ;
      edtTipDefMedH_Jsonclick = "" ;
      edtTipDefAct_Jsonclick = "" ;
      edtTipDefAb_Jsonclick = "" ;
      edtTipDefTp_Jsonclick = "" ;
      edtMaqDef_Jsonclick = "" ;
      edtCatDefCod_Jsonclick = "" ;
      edtTipdefDscI_Jsonclick = "" ;
      edtTipDefDs2_Jsonclick = "" ;
      edtTipDefCod_Jsonclick = "" ;
      edtTipDefDsc_Jsonclick = "" ;
      subGriddefectos_Class = "FreeStyleGrid" ;
      subGriddefectos_Backcolorstyle = (byte)(0) ;
      edtavEmprnom_Jsonclick = "" ;
      edtavEmprnom_Visible = 1 ;
      Var1_Enabled = GXutil.toBoolean( 1) ;
      edtavMetros_Jsonclick = "" ;
      edtavMetros_Enabled = 1 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      edtavUsurcod_Jsonclick = "" ;
      edtavUsurcod_Enabled = 1 ;
      edtavToday_Jsonclick = "" ;
      edtavToday_Enabled = 0 ;
      Dvpanel_freegrid_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_freegrid_Iconposition = "Right" ;
      Dvpanel_freegrid_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_freegrid_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_freegrid_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_freegrid_Title = "" ;
      Dvpanel_freegrid_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_freegrid_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_freegrid_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_freegrid_Width = "100%" ;
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
      Var1_Captionposition = "Left" ;
      Var1_Captionstyle = "width: 25%;" ;
      Var1_Captionclass = "gx-form-item AttributeFLLabel" ;
      Var1_Maxvalue = 0 ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " TIPOS DEFECTOS", "") );
      edtTipDefPtos_Visible = 1 ;
      edtTipDefLong_Visible = 1 ;
      edtTipDefMedH_Visible = 1 ;
      edtTipDefAct_Visible = 1 ;
      edtTipDefAb_Visible = 1 ;
      edtTipDefTp_Visible = 1 ;
      edtMaqDef_Visible = 1 ;
      edtCatDefCod_Visible = 1 ;
      edtTipdefDscI_Visible = 1 ;
      edtTipDefDs2_Visible = 1 ;
      edtTipDefCod_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDDEFECTOS_nFirstRecordOnPage'},{av:'GRIDDEFECTOS_nEOF'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27BarUnimed',fld:'vBARUNIMED',pic:'@!'},{av:'edtTipDefCod_Visible',ctrl:'TIPDEFCOD',prop:'Visible'},{av:'edtTipDefDs2_Visible',ctrl:'TIPDEFDS2',prop:'Visible'},{av:'edtTipdefDscI_Visible',ctrl:'TIPDEFDSCI',prop:'Visible'},{av:'edtCatDefCod_Visible',ctrl:'CATDEFCOD',prop:'Visible'},{av:'edtMaqDef_Visible',ctrl:'MAQDEF',prop:'Visible'},{av:'edtTipDefTp_Visible',ctrl:'TIPDEFTP',prop:'Visible'},{av:'edtTipDefAb_Visible',ctrl:'TIPDEFAB',prop:'Visible'},{av:'edtTipDefAct_Visible',ctrl:'TIPDEFACT',prop:'Visible'},{av:'edtTipDefMedH_Visible',ctrl:'TIPDEFMEDH',prop:'Visible'},{av:'edtTipDefLong_Visible',ctrl:'TIPDEFLONG',prop:'Visible'},{av:'edtTipDefPtos_Visible',ctrl:'TIPDEFPTOS',prop:'Visible'},{av:'AV24WebSessionKey',fld:'vWEBSESSIONKEY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRIDDEFECTOS.LOAD","{handler:'e121FC2',iparms:[]");
      setEventMetadata("GRIDDEFECTOS.LOAD",",oparms:[]}");
      setEventMetadata("TIPDEFDSC.CLICK","{handler:'e131FC2',iparms:[{av:'AV24WebSessionKey',fld:'vWEBSESSIONKEY',pic:'',hsh:true},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9',hsh:true},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:'',hsh:true},{av:'AV12Metros',fld:'vMETROS',pic:'ZZZ9.99'}]");
      setEventMetadata("TIPDEFDSC.CLICK",",oparms:[{ctrl:'WCWC_DEFECTOS'}]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFDSC","{handler:'valid_Tipdefdsc',iparms:[]");
      setEventMetadata("VALID_TIPDEFDSC",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFCOD","{handler:'valid_Tipdefcod',iparms:[]");
      setEventMetadata("VALID_TIPDEFCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFTP","{handler:'valid_Tipdeftp',iparms:[]");
      setEventMetadata("VALID_TIPDEFTP",",oparms:[]}");
      setEventMetadata("VALID_TIPDEFACT","{handler:'valid_Tipdefact',iparms:[]");
      setEventMetadata("VALID_TIPDEFACT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Tipdefptos',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV7EmprCod = "" ;
      wcpOAV24WebSessionKey = "" ;
      wcpOAV27BarUnimed = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7EmprCod = "" ;
      AV24WebSessionKey = "" ;
      AV27BarUnimed = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtncancel_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      Gx_date = GXutil.nullDate() ;
      AV21UsurCod = "" ;
      AV12Metros = DecimalUtil.ZERO ;
      ucVar1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_freegrid = new com.genexus.webpanels.GXUserControl();
      GriddefectosContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      WebComp_Wcwc_defectos_Component = "" ;
      OldWcwc_defectos = "" ;
      AV8EmprNom = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A834TipDefDsc = "" ;
      A6870TipDefDs2 = "" ;
      A13819TipdefDscI = "" ;
      A12346MaqDef = "" ;
      A13001TipDefTp = "" ;
      A13002TipDefAb = "" ;
      A13003TipDefAct = "" ;
      A13520TipDefMedH = "" ;
      A13570TipDefLong = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H01FC2_A396EmprCod = new String[] {""} ;
      H01FC2_A13571TipDefPtos = new short[1] ;
      H01FC2_n13571TipDefPtos = new boolean[] {false} ;
      H01FC2_A13570TipDefLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FC2_n13570TipDefLong = new boolean[] {false} ;
      H01FC2_A13520TipDefMedH = new String[] {""} ;
      H01FC2_n13520TipDefMedH = new boolean[] {false} ;
      H01FC2_A13003TipDefAct = new String[] {""} ;
      H01FC2_n13003TipDefAct = new boolean[] {false} ;
      H01FC2_A13002TipDefAb = new String[] {""} ;
      H01FC2_n13002TipDefAb = new boolean[] {false} ;
      H01FC2_A13001TipDefTp = new String[] {""} ;
      H01FC2_n13001TipDefTp = new boolean[] {false} ;
      H01FC2_A12346MaqDef = new String[] {""} ;
      H01FC2_n12346MaqDef = new boolean[] {false} ;
      H01FC2_A4413CatDefCod = new short[1] ;
      H01FC2_n4413CatDefCod = new boolean[] {false} ;
      H01FC2_A6870TipDefDs2 = new String[] {""} ;
      H01FC2_n6870TipDefDs2 = new boolean[] {false} ;
      H01FC2_A834TipDefDsc = new String[] {""} ;
      H01FC2_n834TipDefDsc = new boolean[] {false} ;
      H01FC2_A833TipDefCod = new short[1] ;
      A396EmprCod = "" ;
      H01FC3_A396EmprCod = new String[] {""} ;
      H01FC3_A13571TipDefPtos = new short[1] ;
      H01FC3_n13571TipDefPtos = new boolean[] {false} ;
      H01FC3_A13570TipDefLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FC3_n13570TipDefLong = new boolean[] {false} ;
      H01FC3_A13520TipDefMedH = new String[] {""} ;
      H01FC3_n13520TipDefMedH = new boolean[] {false} ;
      H01FC3_A13003TipDefAct = new String[] {""} ;
      H01FC3_n13003TipDefAct = new boolean[] {false} ;
      H01FC3_A13002TipDefAb = new String[] {""} ;
      H01FC3_n13002TipDefAb = new boolean[] {false} ;
      H01FC3_A13001TipDefTp = new String[] {""} ;
      H01FC3_n13001TipDefTp = new boolean[] {false} ;
      H01FC3_A12346MaqDef = new String[] {""} ;
      H01FC3_n12346MaqDef = new boolean[] {false} ;
      H01FC3_A4413CatDefCod = new short[1] ;
      H01FC3_n4413CatDefCod = new boolean[] {false} ;
      H01FC3_A6870TipDefDs2 = new String[] {""} ;
      H01FC3_n6870TipDefDs2 = new boolean[] {false} ;
      H01FC3_A834TipDefDsc = new String[] {""} ;
      H01FC3_n834TipDefDsc = new boolean[] {false} ;
      H01FC3_A833TipDefCod = new short[1] ;
      AV5Station = "" ;
      AV16SDT_PiezaDefectos = new GXBaseCollection<app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto>(app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto.class, "SDT_PiezaDefecto", "TexplusNET", remoteHandle);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GriddefectosRow = new com.genexus.webpanels.GXWebRow();
      AV23WebSession = httpContext.getWebSession();
      AV15SDT_PiezaDefecto = new app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGriddefectos_Linesclass = "" ;
      ROClassString = "" ;
      subGriddefectos_Header = "" ;
      GriddefectosColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webdeflmetpiingdef__default(),
         new Object[] {
             new Object[] {
            H01FC2_A396EmprCod, H01FC2_A13571TipDefPtos, H01FC2_n13571TipDefPtos, H01FC2_A13570TipDefLong, H01FC2_n13570TipDefLong, H01FC2_A13520TipDefMedH, H01FC2_n13520TipDefMedH, H01FC2_A13003TipDefAct, H01FC2_n13003TipDefAct, H01FC2_A13002TipDefAb,
            H01FC2_n13002TipDefAb, H01FC2_A13001TipDefTp, H01FC2_n13001TipDefTp, H01FC2_A12346MaqDef, H01FC2_n12346MaqDef, H01FC2_A4413CatDefCod, H01FC2_n4413CatDefCod, H01FC2_A6870TipDefDs2, H01FC2_n6870TipDefDs2, H01FC2_A834TipDefDsc,
            H01FC2_n834TipDefDsc, H01FC2_A833TipDefCod
            }
            , new Object[] {
            H01FC3_A396EmprCod, H01FC3_A13571TipDefPtos, H01FC3_n13571TipDefPtos, H01FC3_A13570TipDefLong, H01FC3_n13570TipDefLong, H01FC3_A13520TipDefMedH, H01FC3_n13520TipDefMedH, H01FC3_A13003TipDefAct, H01FC3_n13003TipDefAct, H01FC3_A13002TipDefAb,
            H01FC3_n13002TipDefAb, H01FC3_A13001TipDefTp, H01FC3_n13001TipDefTp, H01FC3_A12346MaqDef, H01FC3_n12346MaqDef, H01FC3_A4413CatDefCod, H01FC3_n4413CatDefCod, H01FC3_A6870TipDefDs2, H01FC3_n6870TipDefDs2, H01FC3_A834TipDefDsc,
            H01FC3_n834TipDefDsc, H01FC3_A833TipDefCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      edtavUsurcod_Enabled = 0 ;
      edtavEmprcod_Enabled = 0 ;
      edtavMetros_Enabled = 0 ;
      WebComp_Wcwc_defectos = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGriddefectos_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGriddefectos_Backstyle ;
   private byte subGriddefectos_Allowselection ;
   private byte subGriddefectos_Allowhovering ;
   private byte subGriddefectos_Allowcollapsing ;
   private byte subGriddefectos_Collapsed ;
   private byte GRIDDEFECTOS_nEOF ;
   private short AV22var1 ;
   private short AV6count ;
   private short wbEnd ;
   private short wbStart ;
   private short A833TipDefCod ;
   private short A4413CatDefCod ;
   private short A13571TipDefPtos ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtTipDefCod_Visible ;
   private int edtTipDefDs2_Visible ;
   private int edtTipdefDscI_Visible ;
   private int edtCatDefCod_Visible ;
   private int edtMaqDef_Visible ;
   private int edtTipDefTp_Visible ;
   private int edtTipDefAb_Visible ;
   private int edtTipDefAct_Visible ;
   private int edtTipDefMedH_Visible ;
   private int edtTipDefLong_Visible ;
   private int edtTipDefPtos_Visible ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int Var1_Maxvalue ;
   private int edtavToday_Enabled ;
   private int edtavUsurcod_Enabled ;
   private int edtavEmprcod_Enabled ;
   private int edtavMetros_Enabled ;
   private int edtavEmprnom_Visible ;
   private int subGriddefectos_Islastpage ;
   private int idxLst ;
   private int subGriddefectos_Backcolor ;
   private int subGriddefectos_Allbackcolor ;
   private int subGriddefectos_Selectedindex ;
   private int subGriddefectos_Selectioncolor ;
   private int subGriddefectos_Hoveringcolor ;
   private long GRIDDEFECTOS_nCurrentRecord ;
   private long GRIDDEFECTOS_nRecordCount ;
   private long GRIDDEFECTOS_nFirstRecordOnPage ;
   private java.math.BigDecimal AV12Metros ;
   private java.math.BigDecimal A13570TipDefLong ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV24WebSessionKey ;
   private String wcpOAV27BarUnimed ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV7EmprCod ;
   private String AV24WebSessionKey ;
   private String AV27BarUnimed ;
   private String sGXsfl_52_idx="0001" ;
   private String edtTipDefCod_Internalname ;
   private String edtTipDefDs2_Internalname ;
   private String edtTipdefDscI_Internalname ;
   private String edtCatDefCod_Internalname ;
   private String edtMaqDef_Internalname ;
   private String edtTipDefTp_Internalname ;
   private String edtTipDefAb_Internalname ;
   private String edtTipDefAct_Internalname ;
   private String edtTipDefMedH_Internalname ;
   private String edtTipDefLong_Internalname ;
   private String edtTipDefPtos_Internalname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Var1_Captionclass ;
   private String Var1_Captionstyle ;
   private String Var1_Captionposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_freegrid_Width ;
   private String Dvpanel_freegrid_Cls ;
   private String Dvpanel_freegrid_Title ;
   private String Dvpanel_freegrid_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String TempTags ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavToday_Internalname ;
   private String edtavToday_Jsonclick ;
   private String edtavUsurcod_Internalname ;
   private String AV21UsurCod ;
   private String edtavUsurcod_Jsonclick ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavMetros_Internalname ;
   private String edtavMetros_Jsonclick ;
   private String Var1_Internalname ;
   private String divTablecontent_Internalname ;
   private String divTablegriddefectos_Internalname ;
   private String Dvpanel_freegrid_Internalname ;
   private String divFreegrid_Internalname ;
   private String sStyleString ;
   private String subGriddefectos_Internalname ;
   private String divTablesubgrid_Internalname ;
   private String WebComp_Wcwc_defectos_Component ;
   private String OldWcwc_defectos ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavEmprnom_Internalname ;
   private String AV8EmprNom ;
   private String edtavEmprnom_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A834TipDefDsc ;
   private String edtTipDefDsc_Internalname ;
   private String A6870TipDefDs2 ;
   private String A12346MaqDef ;
   private String A13001TipDefTp ;
   private String A13002TipDefAb ;
   private String A13003TipDefAct ;
   private String A13520TipDefMedH ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV5Station ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGriddefectos_Class ;
   private String subGriddefectos_Linesclass ;
   private String divUnnamedtablefsgriddefectos_Internalname ;
   private String ROClassString ;
   private String edtTipDefDsc_Jsonclick ;
   private String tblUnnamedtablecontentfsgriddefectos_Internalname ;
   private String edtTipDefCod_Jsonclick ;
   private String edtTipDefDs2_Jsonclick ;
   private String edtTipdefDscI_Jsonclick ;
   private String edtCatDefCod_Jsonclick ;
   private String edtMaqDef_Jsonclick ;
   private String edtTipDefTp_Jsonclick ;
   private String edtTipDefAb_Jsonclick ;
   private String edtTipDefAct_Jsonclick ;
   private String edtTipDefMedH_Jsonclick ;
   private String edtTipDefLong_Jsonclick ;
   private String edtTipDefPtos_Jsonclick ;
   private String subGriddefectos_Header ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean Var1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_freegrid_Autowidth ;
   private boolean Dvpanel_freegrid_Autoheight ;
   private boolean Dvpanel_freegrid_Collapsible ;
   private boolean Dvpanel_freegrid_Collapsed ;
   private boolean Dvpanel_freegrid_Showcollapseicon ;
   private boolean Dvpanel_freegrid_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n834TipDefDsc ;
   private boolean n6870TipDefDs2 ;
   private boolean n4413CatDefCod ;
   private boolean n12346MaqDef ;
   private boolean n13001TipDefTp ;
   private boolean n13002TipDefAb ;
   private boolean n13003TipDefAct ;
   private boolean n13520TipDefMedH ;
   private boolean n13570TipDefLong ;
   private boolean n13571TipDefPtos ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwc_defectos ;
   private String A13819TipdefDscI ;
   private com.genexus.webpanels.GXWebGrid GriddefectosContainer ;
   private com.genexus.webpanels.GXWebRow GriddefectosRow ;
   private com.genexus.webpanels.GXWebColumn GriddefectosColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwc_defectos ;
   private com.genexus.webpanels.WebSession AV23WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucVar1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_freegrid ;
   private IDataStoreProvider pr_default ;
   private String[] H01FC2_A396EmprCod ;
   private short[] H01FC2_A13571TipDefPtos ;
   private boolean[] H01FC2_n13571TipDefPtos ;
   private java.math.BigDecimal[] H01FC2_A13570TipDefLong ;
   private boolean[] H01FC2_n13570TipDefLong ;
   private String[] H01FC2_A13520TipDefMedH ;
   private boolean[] H01FC2_n13520TipDefMedH ;
   private String[] H01FC2_A13003TipDefAct ;
   private boolean[] H01FC2_n13003TipDefAct ;
   private String[] H01FC2_A13002TipDefAb ;
   private boolean[] H01FC2_n13002TipDefAb ;
   private String[] H01FC2_A13001TipDefTp ;
   private boolean[] H01FC2_n13001TipDefTp ;
   private String[] H01FC2_A12346MaqDef ;
   private boolean[] H01FC2_n12346MaqDef ;
   private short[] H01FC2_A4413CatDefCod ;
   private boolean[] H01FC2_n4413CatDefCod ;
   private String[] H01FC2_A6870TipDefDs2 ;
   private boolean[] H01FC2_n6870TipDefDs2 ;
   private String[] H01FC2_A834TipDefDsc ;
   private boolean[] H01FC2_n834TipDefDsc ;
   private short[] H01FC2_A833TipDefCod ;
   private String[] H01FC3_A396EmprCod ;
   private short[] H01FC3_A13571TipDefPtos ;
   private boolean[] H01FC3_n13571TipDefPtos ;
   private java.math.BigDecimal[] H01FC3_A13570TipDefLong ;
   private boolean[] H01FC3_n13570TipDefLong ;
   private String[] H01FC3_A13520TipDefMedH ;
   private boolean[] H01FC3_n13520TipDefMedH ;
   private String[] H01FC3_A13003TipDefAct ;
   private boolean[] H01FC3_n13003TipDefAct ;
   private String[] H01FC3_A13002TipDefAb ;
   private boolean[] H01FC3_n13002TipDefAb ;
   private String[] H01FC3_A13001TipDefTp ;
   private boolean[] H01FC3_n13001TipDefTp ;
   private String[] H01FC3_A12346MaqDef ;
   private boolean[] H01FC3_n12346MaqDef ;
   private short[] H01FC3_A4413CatDefCod ;
   private boolean[] H01FC3_n4413CatDefCod ;
   private String[] H01FC3_A6870TipDefDs2 ;
   private boolean[] H01FC3_n6870TipDefDs2 ;
   private String[] H01FC3_A834TipDefDsc ;
   private boolean[] H01FC3_n834TipDefDsc ;
   private short[] H01FC3_A833TipDefCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto> AV16SDT_PiezaDefectos ;
   private app.expedicionesautomatizadas.SdtSDT_PiezaDefectos_SDT_PiezaDefecto AV15SDT_PiezaDefecto ;
}

final  class webdeflmetpiingdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FC2", "SELECT EmprCod, TipDefPtos, TipDefLong, TipDefMedH, TipDefAct, TipDefAb, TipDefTp, MaqDef, CatDefCod, TipDefDs2, TipDefDsc, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FC3", "SELECT EmprCod, TipDefPtos, TipDefLong, TipDefMedH, TipDefAct, TipDefAb, TipDefTp, MaqDef, CatDefCod, TipDefDs2, TipDefDsc, TipDefCod FROM TXPTIPDEF WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

