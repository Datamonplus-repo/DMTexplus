package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class calprd_wp_impl extends GXDataArea
{
   public calprd_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public calprd_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( calprd_wp_impl.class ));
   }

   public calprd_wp_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavCalprd_sdt_albpropri = new HTMLChoice();
      cmbavCalprd_sdt_albenvftp = new HTMLChoice();
      cmbavCalprd_sdt_albproat = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridobsalb_sdts") == 0 )
         {
            gxnrgridobsalb_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridobsalb_sdts") == 0 )
         {
            gxgrgridobsalb_sdts_refresh_invoke( ) ;
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               AV6AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProcod), 10, 0));
               AV9AlbProPri = httpContext.GetPar( "AlbProPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProPri", AV9AlbProPri);
               AV10AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbSec", AV10AlbSec);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
               AV15ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15ContCod", AV15ContCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ContCod, "@!"))));
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

   public void gxnrgridobsalb_sdts_newrow_invoke( )
   {
      nRC_GXsfl_157 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_157"))) ;
      nGXsfl_157_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_157_idx"))) ;
      sGXsfl_157_idx = httpContext.GetPar( "sGXsfl_157_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridobsalb_sdts_newrow( ) ;
      /* End function gxnrGridobsalb_sdts_newrow_invoke */
   }

   public void gxgrgridobsalb_sdts_refresh_invoke( )
   {
      subGridobsalb_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridobsalb_sdts_Rows"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV15ContCod = httpContext.GetPar( "ContCod") ;
      AV10AlbSec = httpContext.GetPar( "AlbSec") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridobsalb_sdts_refresh_invoke */
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
      pa19I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start19I2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.calprd_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV9AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV10AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV15ContCod))}, new String[] {"Gx_mode","EmprCod","AlbProcod","AlbProPri","AlbSec","ContCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Calprd_sdt", AV7Calprd_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Calprd_sdt", AV7Calprd_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Obsalb_sdts", AV20Obsalb_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Obsalb_sdts", AV20Obsalb_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_157", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_157, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBSALB_SDTS", AV20Obsalb_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBSALB_SDTS", AV20Obsalb_SDTs);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBSALB_TRN", AV23ObsAlb_TRN);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBSALB_TRN", AV23ObsAlb_TRN);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vOBSALB_INDEX", GXutil.ltrim( localUtil.ntoc( AV25Obsalb_Index, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV9AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vFCH", localUtil.dtoc( AV17Fch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLAST", GXutil.ltrim( localUtil.ntoc( AV18AlbLast, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_F", AV19Msg_f);
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV15ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV10AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV6AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vISVALIDAR", AV11IsValidar);
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCALPRD_SDT", AV7Calprd_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCALPRD_SDT", AV7Calprd_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Width", GXutil.rtrim( Dvpanel_panelobservaciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Autowidth", GXutil.booltostr( Dvpanel_panelobservaciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Autoheight", GXutil.booltostr( Dvpanel_panelobservaciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Cls", GXutil.rtrim( Dvpanel_panelobservaciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Title", GXutil.rtrim( Dvpanel_panelobservaciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Collapsible", GXutil.booltostr( Dvpanel_panelobservaciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Collapsed", GXutil.booltostr( Dvpanel_panelobservaciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelobservaciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Iconposition", GXutil.rtrim( Dvpanel_panelobservaciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELOBSERVACIONES_Autoscroll", GXutil.booltostr( Dvpanel_panelobservaciones_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridobsalb_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_EMPOWERER_Infinitescrolling", GXutil.rtrim( Gridobsalb_sdts_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD_SDT_Emprcod", GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Emprcod()));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD_SDT_Albprocod", GXutil.ltrim( localUtil.ntoc( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprocod(), (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_observaciones_eliminarlinea_Result));
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we19I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt19I2( ) ;
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
      return formatLink("app.calprd_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6AlbProcod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV9AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV10AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV15ContCod))}, new String[] {"Gx_mode","EmprCod","AlbProcod","AlbProPri","AlbSec","ContCod"})  ;
   }

   public String getPgmname( )
   {
      return "Calprd_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Albaran de Produccion", "") ;
   }

   public void wb19I0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         wb_table1_17_19I2( true) ;
      }
      else
      {
         wb_table1_17_19I2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_19I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableobservaciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelobservaciones.setProperty("Width", Dvpanel_panelobservaciones_Width);
         ucDvpanel_panelobservaciones.setProperty("AutoWidth", Dvpanel_panelobservaciones_Autowidth);
         ucDvpanel_panelobservaciones.setProperty("AutoHeight", Dvpanel_panelobservaciones_Autoheight);
         ucDvpanel_panelobservaciones.setProperty("Cls", Dvpanel_panelobservaciones_Cls);
         ucDvpanel_panelobservaciones.setProperty("Title", Dvpanel_panelobservaciones_Title);
         ucDvpanel_panelobservaciones.setProperty("Collapsible", Dvpanel_panelobservaciones_Collapsible);
         ucDvpanel_panelobservaciones.setProperty("Collapsed", Dvpanel_panelobservaciones_Collapsed);
         ucDvpanel_panelobservaciones.setProperty("ShowCollapseIcon", Dvpanel_panelobservaciones_Showcollapseicon);
         ucDvpanel_panelobservaciones.setProperty("IconPosition", Dvpanel_panelobservaciones_Iconposition);
         ucDvpanel_panelobservaciones.setProperty("AutoScroll", Dvpanel_panelobservaciones_Autoscroll);
         ucDvpanel_panelobservaciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelobservaciones_Internalname, "DVPANEL_PANELOBSERVACIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELOBSERVACIONESContainer"+"PanelObservaciones"+"\" style=\"display:none;\">") ;
         wb_table2_148_19I2( true) ;
      }
      else
      {
         wb_table2_148_19I2( false) ;
      }
      return  ;
   }

   public void wb_table2_148_19I2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 157, 3, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 157, 3, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_WP.htm");
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
         wb_table3_173_19I2( true) ;
      }
      else
      {
         wb_table3_173_19I2( false) ;
      }
      return  ;
   }

   public void wb_table3_173_19I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGridobsalb_sdts_empowerer.setProperty("InfiniteScrolling", Gridobsalb_sdts_empowerer_Infinitescrolling);
         ucGridobsalb_sdts_empowerer.render(context, "wwp.gridempowerer", Gridobsalb_sdts_empowerer_Internalname, "GRIDOBSALB_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 157 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Gridobsalb_sdtsContainer.AddObjectProperty("GRIDOBSALB_SDTS_nEOF", GRIDOBSALB_SDTS_nEOF);
               Gridobsalb_sdtsContainer.AddObjectProperty("GRIDOBSALB_SDTS_nFirstRecordOnPage", GRIDOBSALB_SDTS_nFirstRecordOnPage);
               AV46GXV18 = nGXsfl_157_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridobsalb_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridobsalb_sdts", Gridobsalb_sdtsContainer, subGridobsalb_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridobsalb_sdtsContainerData", Gridobsalb_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridobsalb_sdtsContainerData"+"V", Gridobsalb_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridobsalb_sdtsContainerData"+"V"+"\" value='"+Gridobsalb_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start19I2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Albaran de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup19I0( ) ;
   }

   public void ws19I2( )
   {
      start19I2( ) ;
      evt19I2( ) ;
   }

   public void evt19I2( )
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
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1119I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOOBSERVACIONES_AGREGARLINEA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoObservaciones_AgregarLinea' */
                           e1219I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "CALPRD_SDT_ALBPROFCH.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1319I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e1419I2 ();
                              }
                              dynload_actions( ) ;
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDOBSALB_SDTSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDOBSALB_SDTSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridobsalb_sdts_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridobsalb_sdts_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridobsalb_sdts_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridobsalb_sdts_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "GRIDOBSALB_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 34), "VOBSERVACIONES_ELIMINARLINEA.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 34), "VOBSERVACIONES_ELIMINARLINEA.CLICK") == 0 ) )
                        {
                           nGXsfl_157_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1572( ) ;
                           AV46GXV18 = nGXsfl_157_idx ;
                           if ( ( AV20Obsalb_SDTs.size() >= AV46GXV18 ) && ( AV46GXV18 > 0 ) )
                           {
                              AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
                              AV24Observaciones_EliminarLinea = httpContext.cgiGet( edtavObservaciones_eliminarlinea_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavObservaciones_eliminarlinea_Internalname, AV24Observaciones_EliminarLinea);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1519I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDOBSALB_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1619I2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VOBSERVACIONES_ELIMINARLINEA.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1719I2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we19I2( )
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

   public void pa19I2( )
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
            GX_FocusControl = edtavCalprd_sdt_albprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridobsalb_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1572( ) ;
      while ( nGXsfl_157_idx <= nRC_GXsfl_157 )
      {
         sendrow_1572( ) ;
         nGXsfl_157_idx = ((subGridobsalb_sdts_Islastpage==1)&&(nGXsfl_157_idx+1>subgridobsalb_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_157_idx+1) ;
         sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1572( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridobsalb_sdtsContainer)) ;
      /* End function gxnrGridobsalb_sdts_newrow */
   }

   public void gxgrgridobsalb_sdts_refresh( int subGridobsalb_sdts_Rows ,
                                            String Gx_mode ,
                                            String AV15ContCod ,
                                            String AV10AlbSec )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDOBSALB_SDTS_nCurrentRecord = 0 ;
      rf19I2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridobsalb_sdts_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      if ( cmbavCalprd_sdt_albpropri.getItemCount() > 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albpropri( cmbavCalprd_sdt_albpropri.getValidValue(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albpropri()) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCalprd_sdt_albpropri.setValue( GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albpropri()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albpropri.getInternalname(), "Values", cmbavCalprd_sdt_albpropri.ToJavascriptSource(), true);
      }
      if ( cmbavCalprd_sdt_albenvftp.getItemCount() > 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albenvftp( (byte)(GXutil.lval( cmbavCalprd_sdt_albenvftp.getValidValue(GXutil.trim( GXutil.str( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albenvftp(), 1, 0))))) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCalprd_sdt_albenvftp.setValue( GXutil.trim( GXutil.str( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albenvftp(), 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albenvftp.getInternalname(), "Values", cmbavCalprd_sdt_albenvftp.ToJavascriptSource(), true);
      }
      if ( cmbavCalprd_sdt_albproat.getItemCount() > 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albproat( cmbavCalprd_sdt_albproat.getValidValue(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albproat()) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavCalprd_sdt_albproat.setValue( GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albproat()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albproat.getInternalname(), "Values", cmbavCalprd_sdt_albproat.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      GRIDOBSALB_SDTS_nFirstRecordOnPage = 0 ;
      GRIDOBSALB_SDTS_nCurrentRecord = 0 ;
      GXCCtl = "GRIDOBSALB_SDTS_nFirstRecordOnPage_" + sGXsfl_157_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf19I2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCalprd_sdt_albusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albusu_Enabled), 5, 0), true);
      edtavCalprd_sdt_guiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_guiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_guiremcln_Enabled), 5, 0), true);
      edtavCalprd_sdt_trnnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_trnnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_trnnom_Enabled), 5, 0), true);
      edtavCalprd_sdt_albhhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albhhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albhhfm_Enabled), 5, 0), true);
      cmbavCalprd_sdt_albenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCalprd_sdt_albenvftp.getEnabled(), 5, 0), true);
      cmbavCalprd_sdt_albproat.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albproat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCalprd_sdt_albproat.getEnabled(), 5, 0), true);
      edtavCalprd_sdt_alblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_alblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_alblic_Enabled), 5, 0), true);
      edtavCalprd_sdt_albfmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albfmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albfmd_Enabled), 5, 0), true);
      edtavObservaciones_eliminarlinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_eliminarlinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_eliminarlinea_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      edtavObsalb_sdts__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsalb_sdts__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsalb_sdts__emprcod_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      edtavObsalb_sdts__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsalb_sdts__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsalb_sdts__albprocod_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      edtavObsalb_sdts__albpobslin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsalb_sdts__albpobslin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsalb_sdts__albpobslin_Enabled), 5, 0), !bGXsfl_157_Refreshing);
   }

   public void rf19I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridobsalb_sdtsContainer.ClearRows();
      }
      wbStart = (short)(157) ;
      nGXsfl_157_idx = (int)(1+GRIDOBSALB_SDTS_nFirstRecordOnPage) ;
      sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1572( ) ;
      bGXsfl_157_Refreshing = true ;
      Gridobsalb_sdtsContainer.AddObjectProperty("GridName", "Gridobsalb_sdts");
      Gridobsalb_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridobsalb_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridobsalb_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridobsalb_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridobsalb_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridobsalb_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridobsalb_sdtsContainer.setPageSize( subgridobsalb_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1572( ) ;
         e1619I2 ();
         if ( ( GRIDOBSALB_SDTS_nCurrentRecord > 0 ) && ( GRIDOBSALB_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_157_idx == 1 ) )
         {
            GRIDOBSALB_SDTS_nCurrentRecord = 0 ;
            GRIDOBSALB_SDTS_nGridOutOfScope = 1 ;
            subgridobsalb_sdts_firstpage( ) ;
            e1619I2 ();
         }
         wbEnd = (short)(157) ;
         wb19I0( ) ;
      }
      bGXsfl_157_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes19I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV15ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ContCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV10AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
   }

   public int subgridobsalb_sdts_fnc_pagecount( )
   {
      GRIDOBSALB_SDTS_nRecordCount = subgridobsalb_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDOBSALB_SDTS_nRecordCount) % (subgridobsalb_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDOBSALB_SDTS_nRecordCount/ (double) (subgridobsalb_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDOBSALB_SDTS_nRecordCount/ (double) (subgridobsalb_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridobsalb_sdts_fnc_recordcount( )
   {
      return AV20Obsalb_SDTs.size() ;
   }

   public int subgridobsalb_sdts_fnc_recordsperpage( )
   {
      if ( subGridobsalb_sdts_Rows > 0 )
      {
         return subGridobsalb_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridobsalb_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDOBSALB_SDTS_nFirstRecordOnPage/ (double) (subgridobsalb_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridobsalb_sdts_firstpage( )
   {
      GRIDOBSALB_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridobsalb_sdts_nextpage( )
   {
      GRIDOBSALB_SDTS_nRecordCount = subgridobsalb_sdts_fnc_recordcount( ) ;
      if ( ( GRIDOBSALB_SDTS_nRecordCount >= subgridobsalb_sdts_fnc_recordsperpage( ) ) && ( GRIDOBSALB_SDTS_nEOF == 0 ) )
      {
         GRIDOBSALB_SDTS_nFirstRecordOnPage = (long)(GRIDOBSALB_SDTS_nFirstRecordOnPage+subgridobsalb_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRIDOBSALB_SDTS_nEOF == 1 )
      {
         GRIDOBSALB_SDTS_nFirstRecordOnPage = GRIDOBSALB_SDTS_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridobsalb_sdtsContainer.AddObjectProperty("GRIDOBSALB_SDTS_nFirstRecordOnPage", GRIDOBSALB_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDOBSALB_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridobsalb_sdts_previouspage( )
   {
      if ( GRIDOBSALB_SDTS_nFirstRecordOnPage >= subgridobsalb_sdts_fnc_recordsperpage( ) )
      {
         GRIDOBSALB_SDTS_nFirstRecordOnPage = (long)(GRIDOBSALB_SDTS_nFirstRecordOnPage-subgridobsalb_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridobsalb_sdts_lastpage( )
   {
      GRIDOBSALB_SDTS_nRecordCount = subgridobsalb_sdts_fnc_recordcount( ) ;
      if ( GRIDOBSALB_SDTS_nRecordCount > subgridobsalb_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDOBSALB_SDTS_nRecordCount) % (subgridobsalb_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDOBSALB_SDTS_nFirstRecordOnPage = (long)(GRIDOBSALB_SDTS_nRecordCount-subgridobsalb_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDOBSALB_SDTS_nFirstRecordOnPage = (long)(GRIDOBSALB_SDTS_nRecordCount-((int)((GRIDOBSALB_SDTS_nRecordCount) % (subgridobsalb_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDOBSALB_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridobsalb_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDOBSALB_SDTS_nFirstRecordOnPage = (long)(subgridobsalb_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDOBSALB_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavCalprd_sdt_albusu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albusu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albusu_Enabled), 5, 0), true);
      edtavCalprd_sdt_guiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_guiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_guiremcln_Enabled), 5, 0), true);
      edtavCalprd_sdt_trnnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_trnnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_trnnom_Enabled), 5, 0), true);
      edtavCalprd_sdt_albhhfm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albhhfm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albhhfm_Enabled), 5, 0), true);
      cmbavCalprd_sdt_albenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCalprd_sdt_albenvftp.getEnabled(), 5, 0), true);
      cmbavCalprd_sdt_albproat.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albproat.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCalprd_sdt_albproat.getEnabled(), 5, 0), true);
      edtavCalprd_sdt_alblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_alblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_alblic_Enabled), 5, 0), true);
      edtavCalprd_sdt_albfmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albfmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albfmd_Enabled), 5, 0), true);
      edtavObservaciones_eliminarlinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObservaciones_eliminarlinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObservaciones_eliminarlinea_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      edtavObsalb_sdts__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsalb_sdts__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsalb_sdts__emprcod_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      edtavObsalb_sdts__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsalb_sdts__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsalb_sdts__albprocod_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      edtavObsalb_sdts__albpobslin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObsalb_sdts__albpobslin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObsalb_sdts__albpobslin_Enabled), 5, 0), !bGXsfl_157_Refreshing);
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtavCalprd_sdt_albprocod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albprocod_Enabled), 5, 0), true);
      }
      else
      {
         edtavCalprd_sdt_albprocod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_albprocod_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         cmbavCalprd_sdt_albpropri.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albpropri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCalprd_sdt_albpropri.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbavCalprd_sdt_albpropri.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albpropri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavCalprd_sdt_albpropri.getEnabled(), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         edtavCalprd_sdt_guiremcli_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_guiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_guiremcli_Enabled), 5, 0), true);
      }
      else
      {
         edtavCalprd_sdt_guiremcli_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavCalprd_sdt_guiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCalprd_sdt_guiremcli_Enabled), 5, 0), true);
      }
      fix_multi_value_controls( ) ;
   }

   public void strup19I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1519I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCALPRD_SDT"), AV7Calprd_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Calprd_sdt"), AV7Calprd_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Obsalb_sdts"), AV20Obsalb_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOBSALB_SDTS"), AV20Obsalb_SDTs);
         /* Read saved values. */
         nRC_GXsfl_157 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_157"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV11IsValidar = GXutil.strtobool( httpContext.cgiGet( "vISVALIDAR")) ;
         Gx_mode = httpContext.cgiGet( "vMODE") ;
         GRIDOBSALB_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDOBSALB_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDOBSALB_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDOBSALB_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridobsalb_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDOBSALB_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
         Dvpanel_panelobservaciones_Width = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Width") ;
         Dvpanel_panelobservaciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Autowidth")) ;
         Dvpanel_panelobservaciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Autoheight")) ;
         Dvpanel_panelobservaciones_Cls = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Cls") ;
         Dvpanel_panelobservaciones_Title = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Title") ;
         Dvpanel_panelobservaciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Collapsible")) ;
         Dvpanel_panelobservaciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Collapsed")) ;
         Dvpanel_panelobservaciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Showcollapseicon")) ;
         Dvpanel_panelobservaciones_Iconposition = httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Iconposition") ;
         Dvpanel_panelobservaciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELOBSERVACIONES_Autoscroll")) ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Confirmtype") ;
         Gridobsalb_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDOBSALB_SDTS_EMPOWERER_Gridinternalname") ;
         Gridobsalb_sdts_empowerer_Infinitescrolling = httpContext.cgiGet( "GRIDOBSALB_SDTS_EMPOWERER_Infinitescrolling") ;
         Dvelop_confirmpanel_observaciones_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA_Result") ;
         nRC_GXsfl_157 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_157"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_157_fel_idx = 0 ;
         while ( nGXsfl_157_fel_idx < nRC_GXsfl_157 )
         {
            nGXsfl_157_fel_idx = ((subGridobsalb_sdts_Islastpage==1)&&(nGXsfl_157_fel_idx+1>subgridobsalb_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_157_fel_idx+1) ;
            sGXsfl_157_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1572( ) ;
            AV46GXV18 = nGXsfl_157_fel_idx ;
            if ( ( AV20Obsalb_SDTs.size() >= AV46GXV18 ) && ( AV46GXV18 > 0 ) )
            {
               AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
               AV24Observaciones_EliminarLinea = httpContext.cgiGet( edtavObservaciones_eliminarlinea_Internalname) ;
            }
         }
         if ( nGXsfl_157_fel_idx == 0 )
         {
            nGXsfl_157_idx = 1 ;
            sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1572( ) ;
         }
         nGXsfl_157_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_albprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_albprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALPRD_SDT_ALBPROCOD");
            GX_FocusControl = edtavCalprd_sdt_albprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albprocod( 0 );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albprocod( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_albprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) );
         }
         cmbavCalprd_sdt_albpropri.setName( cmbavCalprd_sdt_albpropri.getInternalname() );
         cmbavCalprd_sdt_albpropri.setValue( httpContext.cgiGet( cmbavCalprd_sdt_albpropri.getInternalname()) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albpropri( httpContext.cgiGet( cmbavCalprd_sdt_albpropri.getInternalname()) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albusu( httpContext.cgiGet( edtavCalprd_sdt_albusu_Internalname) );
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCalprd_sdt_albprofch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CALPRD_SDT_ALBPROFCH");
            GX_FocusControl = edtavCalprd_sdt_albprofch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albprofch( GXutil.nullDate() );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albprofch( localUtil.ctod( httpContext.cgiGet( edtavCalprd_sdt_albprofch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) );
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCalprd_sdt_albfecsal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "CALPRD_SDT_ALBFECSAL");
            GX_FocusControl = edtavCalprd_sdt_albfecsal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albfecsal( GXutil.nullDate() );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albfecsal( localUtil.ctod( httpContext.cgiGet( edtavCalprd_sdt_albfecsal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) );
         }
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albhorsal( httpContext.cgiGet( edtavCalprd_sdt_albhorsal_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_guiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_guiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALPRD_SDT_GUIREMCLI");
            GX_FocusControl = edtavCalprd_sdt_guiremcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Guiremcli( 0 );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Guiremcli( (int)(localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_guiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
         }
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Guiremcln( httpContext.cgiGet( edtavCalprd_sdt_guiremcln_Internalname) );
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_albdomenv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_albdomenv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALPRD_SDT_ALBDOMENV");
            GX_FocusControl = edtavCalprd_sdt_albdomenv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albdomenv( (byte)(0) );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albdomenv( (byte)(localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_albdomenv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_trncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_trncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CALPRD_SDT_TRNCOD");
            GX_FocusControl = edtavCalprd_sdt_trncod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Trncod( (short)(0) );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Trncod( (short)(localUtil.ctol( httpContext.cgiGet( edtavCalprd_sdt_trncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
         }
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Trnnom( httpContext.cgiGet( edtavCalprd_sdt_trnnom_Internalname) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albmat( httpContext.cgiGet( edtavCalprd_sdt_albmat_Internalname) );
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavCalprd_sdt_albhhfm_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "CALPRD_SDT_ALBHHFM");
            GX_FocusControl = edtavCalprd_sdt_albhhfm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albhhfm( GXutil.nullDate() );
         }
         else
         {
            AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albhhfm( localUtil.ctot( httpContext.cgiGet( edtavCalprd_sdt_albhhfm_Internalname)) );
         }
         cmbavCalprd_sdt_albenvftp.setName( cmbavCalprd_sdt_albenvftp.getInternalname() );
         cmbavCalprd_sdt_albenvftp.setValue( httpContext.cgiGet( cmbavCalprd_sdt_albenvftp.getInternalname()) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albenvftp( (byte)(GXutil.lval( httpContext.cgiGet( cmbavCalprd_sdt_albenvftp.getInternalname()))) );
         cmbavCalprd_sdt_albproat.setName( cmbavCalprd_sdt_albproat.getInternalname() );
         cmbavCalprd_sdt_albproat.setValue( httpContext.cgiGet( cmbavCalprd_sdt_albproat.getInternalname()) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albproat( httpContext.cgiGet( cmbavCalprd_sdt_albproat.getInternalname()) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Alblic( httpContext.cgiGet( edtavCalprd_sdt_alblic_Internalname) );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albfmd( httpContext.cgiGet( edtavCalprd_sdt_albfmd_Internalname) );
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1519I2 ();
      if (returnInSub) return;
   }

   public void e1519I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV51Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      calprd_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV51Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV52Emprnom ;
      GXv_char4[0] = AV53Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV51Station, GXv_char2, GXv_char3, GXv_char4) ;
      calprd_wp_impl.this.AV5EmprCod = GXv_char2[0] ;
      calprd_wp_impl.this.AV52Emprnom = GXv_char3[0] ;
      calprd_wp_impl.this.AV53Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      Gridobsalb_sdts_empowerer_Gridinternalname = subGridobsalb_sdts_Internalname ;
      ucGridobsalb_sdts_empowerer.sendProperty(context, "", false, Gridobsalb_sdts_empowerer_Internalname, "GridInternalName", Gridobsalb_sdts_empowerer_Gridinternalname);
      subGridobsalb_sdts_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      /* Execute user subroutine: 'DOOBTENER_DATOS' */
      S112 ();
      if (returnInSub) return;
   }

   private void e1619I2( )
   {
      /* Gridobsalb_sdts_Load Routine */
      returnInSub = false ;
      AV46GXV18 = 1 ;
      while ( AV46GXV18 <= AV20Obsalb_SDTs.size() )
      {
         AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
         AV24Observaciones_EliminarLinea = "<i class=\"fas fa-times\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavObservaciones_eliminarlinea_Internalname, AV24Observaciones_EliminarLinea);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(157) ;
         }
         if ( ( subGridobsalb_sdts_Islastpage == 1 ) || ( subGridobsalb_sdts_Rows == 0 ) || ( ( GRIDOBSALB_SDTS_nCurrentRecord >= GRIDOBSALB_SDTS_nFirstRecordOnPage ) && ( GRIDOBSALB_SDTS_nCurrentRecord < GRIDOBSALB_SDTS_nFirstRecordOnPage + subgridobsalb_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1572( ) ;
            GRIDOBSALB_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDOBSALB_SDTS_nCurrentRecord + 1 >= subgridobsalb_sdts_fnc_recordcount( ) )
            {
               GRIDOBSALB_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDOBSALB_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDOBSALB_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDOBSALB_SDTS_nCurrentRecord = (long)(GRIDOBSALB_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_157_Refreshing )
         {
            httpContext.doAjaxLoad(157, Gridobsalb_sdtsRow);
         }
         AV46GXV18 = (int)(AV46GXV18+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e1219I2( )
   {
      AV46GXV18 = nGXsfl_157_idx ;
      if ( ( AV46GXV18 > 0 ) && ( AV20Obsalb_SDTs.size() >= AV46GXV18 ) )
      {
         AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
      }
      /* 'DoObservaciones_AgregarLinea' Routine */
      returnInSub = false ;
      if ( AV20Obsalb_SDTs.size() == 0 )
      {
         AV21ObsAlb_SDT = (app.SdtObsalb_SDT)new app.SdtObsalb_SDT(remoteHandle, context);
         AV21ObsAlb_SDT.setgxTv_SdtObsalb_SDT_Emprcod( AV23ObsAlb_TRN.getgxTv_SdtObsalb_TRN_Emprcod() );
         AV21ObsAlb_SDT.setgxTv_SdtObsalb_SDT_Albprocod( AV23ObsAlb_TRN.getgxTv_SdtObsalb_TRN_Albprocod() );
         AV21ObsAlb_SDT.setgxTv_SdtObsalb_SDT_Albpobslin( (byte)(1) );
         AV20Obsalb_SDTs.add(AV21ObsAlb_SDT, 0);
         gx_BV157 = true ;
      }
      else
      {
         if ( AV20Obsalb_SDTs.size() < 99 )
         {
            AV21ObsAlb_SDT = (app.SdtObsalb_SDT)new app.SdtObsalb_SDT(remoteHandle, context);
            AV21ObsAlb_SDT.setgxTv_SdtObsalb_SDT_Emprcod( AV23ObsAlb_TRN.getgxTv_SdtObsalb_TRN_Emprcod() );
            AV21ObsAlb_SDT.setgxTv_SdtObsalb_SDT_Albprocod( AV23ObsAlb_TRN.getgxTv_SdtObsalb_TRN_Albprocod() );
            AV20Obsalb_SDTs.sort(httpContext.getMessage( "AlbPObsLin", ""));
            gx_BV157 = true ;
            AV21ObsAlb_SDT.setgxTv_SdtObsalb_SDT_Albpobslin( (byte)(((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV20Obsalb_SDTs.size())).getgxTv_SdtObsalb_SDT_Albpobslin()+1) );
            AV20Obsalb_SDTs.add(AV21ObsAlb_SDT, 0);
            gx_BV157 = true ;
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Alcanzó el máximo de observaciones permitidas.", ""));
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20Obsalb_SDTs", AV20Obsalb_SDTs);
      nGXsfl_157_bak_idx = nGXsfl_157_idx ;
      gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      nGXsfl_157_idx = nGXsfl_157_bak_idx ;
      sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1572( ) ;
   }

   public void e1719I2( )
   {
      AV46GXV18 = nGXsfl_157_idx ;
      if ( ( AV46GXV18 > 0 ) && ( AV20Obsalb_SDTs.size() >= AV46GXV18 ) )
      {
         AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
      }
      /* Observaciones_eliminarlinea_Click Routine */
      returnInSub = false ;
      AV25Obsalb_Index = (short)(AV20Obsalb_SDTs.indexof(((app.SdtObsalb_SDT)AV20Obsalb_SDTs.currentItem()))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Obsalb_Index", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Obsalb_Index), 4, 0));
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e1119I2( )
   {
      AV46GXV18 = nGXsfl_157_idx ;
      if ( ( AV46GXV18 > 0 ) && ( AV20Obsalb_SDTs.size() >= AV46GXV18 ) )
      {
         AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
      }
      /* Dvelop_confirmpanel_observaciones_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_observaciones_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES_ELIMINARLINEA' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20Obsalb_SDTs", AV20Obsalb_SDTs);
      nGXsfl_157_bak_idx = nGXsfl_157_idx ;
      gxgrgridobsalb_sdts_refresh( subGridobsalb_sdts_Rows, Gx_mode, AV15ContCod, AV10AlbSec) ;
      nGXsfl_157_idx = nGXsfl_157_bak_idx ;
      sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1572( ) ;
   }

   public void S122( )
   {
      /* 'DO OBSERVACIONES_ELIMINARLINEA' Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem(httpContext.getMessage( "&Obsalb_index ", "")+GXutil.str( AV25Obsalb_Index, 4, 0));
      AV20Obsalb_SDTs.removeItem(AV25Obsalb_Index);
      gx_BV157 = true ;
   }

   public void e1319I2( )
   {
      /* Calprd_sdt_albprofch_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_char3[0] = AV9AlbProPri ;
      GXv_int5[0] = (byte)(1) ;
      GXv_date6[0] = AV17Fch ;
      GXv_int7[0] = AV18AlbLast ;
      GXv_date8[0] = AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprofch() ;
      GXv_char2[0] = AV19Msg_f ;
      new app.pdoc000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_date6, GXv_int7, GXv_date8, GXv_char2) ;
      calprd_wp_impl.this.AV5EmprCod = GXv_char4[0] ;
      calprd_wp_impl.this.AV9AlbProPri = GXv_char3[0] ;
      calprd_wp_impl.this.AV17Fch = GXv_date6[0] ;
      calprd_wp_impl.this.AV18AlbLast = (short)((short)(GXv_int7[0])) ;
      AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albprofch( GXv_date8[0] );
      calprd_wp_impl.this.AV19Msg_f = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProPri", AV9AlbProPri);
      httpContext.ajax_rsp_assign_attri("", false, "AV17Fch", localUtil.format(AV17Fch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbLast", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbLast), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Msg_f", AV19Msg_f);
      if ( ! (GXutil.strcmp("", AV19Msg_f)==0) )
      {
         httpContext.GX_msglist.addItem(AV19Msg_f);
         GX_FocusControl = edtavCalprd_sdt_albprofch_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV7Calprd_SDT", AV7Calprd_SDT);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1419I2 ();
      if (returnInSub) return;
   }

   public void e1419I2( )
   {
      AV46GXV18 = nGXsfl_157_idx ;
      if ( ( AV46GXV18 > 0 ) && ( AV20Obsalb_SDTs.size() >= AV46GXV18 ) )
      {
         AV20Obsalb_SDTs.currentItem( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)) );
      }
      /* Enter Routine */
      returnInSub = false ;
      AV12Messages.clear();
      /* Execute user subroutine: 'GRABAR_CALPRD' */
      S132 ();
      if (returnInSub) return;
      if ( AV12Messages.size() == 0 )
      {
         /* Execute user subroutine: 'GRABAR_OBSALB' */
         S142 ();
         if (returnInSub) return;
      }
      if ( AV12Messages.size() == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "calprd_wp");
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Datos grabados correctamente", ""));
         httpContext.setWebReturnParms(new Object[] {Gx_mode,AV5EmprCod,Long.valueOf(AV6AlbProcod),AV9AlbProPri,AV10AlbSec,AV15ContCod});
         httpContext.setWebReturnParmsMetadata(new Object[] {"Gx_mode","AV5EmprCod","AV6AlbProcod","AV9AlbProPri","AV10AlbSec","AV15ContCod"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "calprd_wp");
         AV54GXV23 = 1 ;
         while ( AV54GXV23 <= AV12Messages.size() )
         {
            AV13Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV12Messages.elementAt(-1+AV54GXV23));
            httpContext.GX_msglist.addItem(AV13Message.getgxTv_SdtMessages_Message_Description());
            AV54GXV23 = (int)(AV54GXV23+1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8Calprd_Trn", AV8Calprd_Trn);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ObsAlb_TRN", AV23ObsAlb_TRN);
   }

   public void S112( )
   {
      /* 'DOOBTENER_DATOS' Routine */
      returnInSub = false ;
      GXt_SdtCalprd_SDT9 = AV7Calprd_SDT;
      GXv_SdtCalprd_SDT10[0] = GXt_SdtCalprd_SDT9;
      new app.calprd_dp(remoteHandle, context).execute( AV5EmprCod, AV6AlbProcod, GXv_SdtCalprd_SDT10) ;
      GXt_SdtCalprd_SDT9 = GXv_SdtCalprd_SDT10[0] ;
      AV7Calprd_SDT = GXt_SdtCalprd_SDT9;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Emprcod( AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Emprcod() );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albprofch( AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Albprofch() );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albfecsal( AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Albfecsal() );
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albusu( AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Albusu() );
         GXt_char1 = "" ;
         GXv_char4[0] = AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Emprcod() ;
         GXv_char3[0] = GXt_char1 ;
         new app.phragr3(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Emprcod( GXv_char4[0] );
         calprd_wp_impl.this.GXt_char1 = GXv_char3[0] ;
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albhorsal( GXt_char1 );
      }
      GXt_objcol_SdtObsalb_SDT11 = AV20Obsalb_SDTs ;
      GXv_objcol_SdtObsalb_SDT12[0] = GXt_objcol_SdtObsalb_SDT11 ;
      new app.obsalb_dp(remoteHandle, context).execute( AV5EmprCod, AV6AlbProcod, GXv_objcol_SdtObsalb_SDT12) ;
      GXt_objcol_SdtObsalb_SDT11 = GXv_objcol_SdtObsalb_SDT12[0] ;
      AV20Obsalb_SDTs = GXt_objcol_SdtObsalb_SDT11 ;
      gx_BV157 = true ;
   }

   public void S132( )
   {
      /* 'GRABAR_CALPRD' Routine */
      returnInSub = false ;
      AV8Calprd_Trn.Load(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Emprcod(), AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprocod());
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Albprofch( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprofch() );
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Albfecsal( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albfecsal() );
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Albhorsal( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albhorsal() );
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Guiremcli( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Guiremcli() );
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Albdomenv( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albdomenv() );
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Trncod( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Trncod() );
      AV8Calprd_Trn.setgxTv_SdtCalprd_TRN_Albmat( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albmat() );
      AV8Calprd_Trn.Save();
      if ( AV8Calprd_Trn.Fail() )
      {
         AV12Messages = AV8Calprd_Trn.GetMessages() ;
      }
      AV5EmprCod = AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Emprcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6AlbProcod = AV8Calprd_Trn.getgxTv_SdtCalprd_TRN_Albprocod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProcod), 10, 0));
   }

   public void S142( )
   {
      /* 'GRABAR_OBSALB' Routine */
      returnInSub = false ;
      AV55GXV24 = 1 ;
      while ( AV55GXV24 <= AV20Obsalb_SDTs.size() )
      {
         AV21ObsAlb_SDT = (app.SdtObsalb_SDT)((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV55GXV24));
         AV23ObsAlb_TRN.Load(AV5EmprCod, AV6AlbProcod, AV21ObsAlb_SDT.getgxTv_SdtObsalb_SDT_Albpobslin());
         AV23ObsAlb_TRN.setgxTv_SdtObsalb_TRN_Albpobs( AV21ObsAlb_SDT.getgxTv_SdtObsalb_SDT_Albpobs() );
         AV23ObsAlb_TRN.Save();
         if ( AV23ObsAlb_TRN.Fail() )
         {
            AV12Messages = AV23ObsAlb_TRN.GetMessages() ;
         }
         AV55GXV24 = (int)(AV55GXV24+1) ;
      }
   }

   public void wb_table3_173_19I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_observaciones_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_observaciones_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_observaciones_eliminarlinea_Title);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmationtext);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_observaciones_eliminarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_observaciones_eliminarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmtype);
         ucDvelop_confirmpanel_observaciones_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_observaciones_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_173_19I2e( true) ;
      }
      else
      {
         wb_table3_173_19I2e( false) ;
      }
   }

   public void wb_table2_148_19I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPanelobservaciones_Internalname, tblPanelobservaciones_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableobservacionesinsupddlt_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobservaciones_agregarlinea_Internalname, "gx.evt.setGridEvt("+GXutil.str( 157, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar nueva observación", ""), bttBtnobservaciones_agregarlinea_Jsonclick, 5, httpContext.getMessage( "Agregar nueva observación", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOOBSERVACIONES_AGREGARLINEA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridobsalb_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol157( ) ;
      }
      if ( wbEnd == 157 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_157 = (int)(nGXsfl_157_idx-1) ;
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Gridobsalb_sdtsContainer.AddObjectProperty("GRIDOBSALB_SDTS_nEOF", GRIDOBSALB_SDTS_nEOF);
            Gridobsalb_sdtsContainer.AddObjectProperty("GRIDOBSALB_SDTS_nFirstRecordOnPage", GRIDOBSALB_SDTS_nFirstRecordOnPage);
            AV46GXV18 = nGXsfl_157_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridobsalb_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridobsalb_sdts", Gridobsalb_sdtsContainer, subGridobsalb_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridobsalb_sdtsContainerData", Gridobsalb_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridobsalb_sdtsContainerData"+"V", Gridobsalb_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridobsalb_sdtsContainerData"+"V"+"\" value='"+Gridobsalb_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_148_19I2e( true) ;
      }
      else
      {
         wb_table2_148_19I2e( false) ;
      }
   }

   public void wb_table1_17_19I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTableattributes_Internalname, tblTableattributes_Internalname, "", "TableData", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablealbaran_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablealbarannumero_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albprocod_Internalname, httpContext.getMessage( "Nº Albaran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprocod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprocod()), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albprocod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCalprd_sdt_albpropri.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCalprd_sdt_albpropri.getInternalname(), httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCalprd_sdt_albpropri, cmbavCalprd_sdt_albpropri.getInternalname(), GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albpropri()), 1, cmbavCalprd_sdt_albpropri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavCalprd_sdt_albpropri.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "", true, (byte)(0), "HLP_Calprd_WP.htm");
         cmbavCalprd_sdt_albpropri.setValue( GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albpropri()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albpropri.getInternalname(), "Values", cmbavCalprd_sdt_albpropri.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albusu_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albusu_Internalname, httpContext.getMessage( "Operador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albusu_Internalname, GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albusu()), GXutil.rtrim( localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albusu(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albusu_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albusu_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablafechas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albprofch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albprofch_Internalname, httpContext.getMessage( "Fecha ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCalprd_sdt_albprofch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albprofch_Internalname, localUtil.format(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprofch(), "99/99/99"), localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albprofch(), "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albprofch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albprofch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCalprd_sdt_albprofch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCalprd_sdt_albprofch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albfecsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albfecsal_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCalprd_sdt_albfecsal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albfecsal_Internalname, localUtil.format(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albfecsal(), "99/99/99"), localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albfecsal(), "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albfecsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albfecsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCalprd_sdt_albfecsal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCalprd_sdt_albfecsal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albhorsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albhorsal_Internalname, httpContext.getMessage( "Hora Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albhorsal_Internalname, GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albhorsal()), GXutil.rtrim( localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albhorsal(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albhorsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albhorsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecliente_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcalprd_sdt_guiremcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcalprd_sdt_guiremcli_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "", "", lblTextblockcalprd_sdt_guiremcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table4_63_19I2( true) ;
      }
      else
      {
         wb_table4_63_19I2( false) ;
      }
      return  ;
   }

   public void wb_table4_63_19I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_guiremcln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_guiremcln_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_guiremcln_Internalname, GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Guiremcln()), GXutil.rtrim( localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Guiremcln(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_guiremcln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_guiremcln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcalprd_sdt_albdomenv_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcalprd_sdt_albdomenv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "", "", lblTextblockcalprd_sdt_albdomenv_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table5_80_19I2( true) ;
      }
      else
      {
         wb_table5_80_19I2( false) ;
      }
      return  ;
   }

   public void wb_table5_80_19I2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divTabletransportista_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcalprd_sdt_trncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcalprd_sdt_trncod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblockcalprd_sdt_trncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table6_97_19I2( true) ;
      }
      else
      {
         wb_table6_97_19I2( false) ;
      }
      return  ;
   }

   public void wb_table6_97_19I2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_trnnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_trnnom_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_trnnom_Internalname, GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Trnnom()), GXutil.rtrim( localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Trnnom(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_trnnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_trnnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albmat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albmat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albmat_Internalname, GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albmat()), GXutil.rtrim( localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albmat(), "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albmat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albmat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableat_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup1_Internalname, httpContext.getMessage( "AT", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Calprd_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrupoat_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albhhfm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albhhfm_Internalname, httpContext.getMessage( "Start Time", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavCalprd_sdt_albhhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albhhfm_Internalname, localUtil.ttoc( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albhhfm(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albhhfm(), "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albhhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albhhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCalprd_sdt_albhhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCalprd_sdt_albhhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Calprd_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCalprd_sdt_albenvftp.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCalprd_sdt_albenvftp.getInternalname(), httpContext.getMessage( "Envio Albaran FTP", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCalprd_sdt_albenvftp, cmbavCalprd_sdt_albenvftp.getInternalname(), GXutil.trim( GXutil.str( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albenvftp(), 1, 0)), 1, cmbavCalprd_sdt_albenvftp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavCalprd_sdt_albenvftp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_WP.htm");
         cmbavCalprd_sdt_albenvftp.setValue( GXutil.trim( GXutil.str( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albenvftp(), 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albenvftp.getInternalname(), "Values", cmbavCalprd_sdt_albenvftp.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavCalprd_sdt_albproat.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavCalprd_sdt_albproat.getInternalname(), httpContext.getMessage( "Manual o Automatico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavCalprd_sdt_albproat, cmbavCalprd_sdt_albproat.getInternalname(), GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albproat()), 1, cmbavCalprd_sdt_albproat.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavCalprd_sdt_albproat.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_Calprd_WP.htm");
         cmbavCalprd_sdt_albproat.setValue( GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albproat()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavCalprd_sdt_albproat.getInternalname(), "Values", cmbavCalprd_sdt_albproat.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_alblic_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_alblic_Internalname, httpContext.getMessage( "Codigo AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_alblic_Internalname, GXutil.rtrim( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Alblic()), GXutil.rtrim( localUtil.format( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Alblic(), "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_alblic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_alblic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCalprd_sdt_albfmd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albfmd_Internalname, httpContext.getMessage( "Firma Digital", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavCalprd_sdt_albfmd_Internalname, AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albfmd(), "", "", (short)(0), 1, edtavCalprd_sdt_albfmd_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "255", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_19I2e( true) ;
      }
      else
      {
         wb_table1_17_19I2e( false) ;
      }
   }

   public void wb_table6_97_19I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcalprd_sdt_trncod_Internalname, tblTablemergedcalprd_sdt_trncod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_trncod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_trncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Trncod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCalprd_sdt_trncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Trncod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Trncod()), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCalprd_sdt_trncod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_trncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImgtransportista_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-2x\"></i>", ""), "", "", lblImgtransportista_Jsonclick, "'"+""+"'"+",false,"+"'"+"e1819i1_client"+"'", "", "TextBlock", 7, "", 1, 1, 0, (short)(1), "HLP_Calprd_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_97_19I2e( true) ;
      }
      else
      {
         wb_table6_97_19I2e( false) ;
      }
   }

   public void wb_table5_80_19I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcalprd_sdt_albdomenv_Internalname, tblTablemergedcalprd_sdt_albdomenv_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_albdomenv_Internalname, httpContext.getMessage( "Domicilio de Envio", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_albdomenv_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albdomenv(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCalprd_sdt_albdomenv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albdomenv()), "9") : localUtil.format( DecimalUtil.doubleToDec(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albdomenv()), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_albdomenv_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_albdomenv_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImgdomenvio_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-2x\"></i>", ""), "", "", lblImgdomenvio_Jsonclick, "'"+""+"'"+",false,"+"'"+"e1919i1_client"+"'", "", "TextBlock", 7, "", 1, 1, 0, (short)(1), "HLP_Calprd_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_80_19I2e( true) ;
      }
      else
      {
         wb_table5_80_19I2e( false) ;
      }
   }

   public void wb_table4_63_19I2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedcalprd_sdt_guiremcli_Internalname, tblTablemergedcalprd_sdt_guiremcli_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCalprd_sdt_guiremcli_Internalname, httpContext.getMessage( "GuiRemCli", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_157_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCalprd_sdt_guiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Guiremcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Guiremcli()), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCalprd_sdt_guiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCalprd_sdt_guiremcli_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Calprd_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImgcliente_Internalname, httpContext.getMessage( "<i class=\"fa fa-search fa-2x\"></i>", ""), "", "", lblImgcliente_Jsonclick, "'"+""+"'"+",false,"+"'"+"e2019i1_client"+"'", "", "TextBlock", 7, "", 1, 1, 0, (short)(1), "HLP_Calprd_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_63_19I2e( true) ;
      }
      else
      {
         wb_table4_63_19I2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV5EmprCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6AlbProcod), 10, 0));
      AV9AlbProPri = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProPri", AV9AlbProPri);
      AV10AlbSec = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbSec", AV10AlbSec);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10AlbSec, "@!"))));
      AV15ContCod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ContCod", AV15ContCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15ContCod, "@!"))));
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
      pa19I2( ) ;
      ws19I2( ) ;
      we19I2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643393", true, true);
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
      httpContext.AddJavascriptSource("calprd_wp.js", "?20266101643393", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1572( )
   {
      edtavObservaciones_eliminarlinea_Internalname = "vOBSERVACIONES_ELIMINARLINEA_"+sGXsfl_157_idx ;
      edtavObsalb_sdts__emprcod_Internalname = "OBSALB_SDTS__EMPRCOD_"+sGXsfl_157_idx ;
      edtavObsalb_sdts__albprocod_Internalname = "OBSALB_SDTS__ALBPROCOD_"+sGXsfl_157_idx ;
      edtavObsalb_sdts__albpobslin_Internalname = "OBSALB_SDTS__ALBPOBSLIN_"+sGXsfl_157_idx ;
      edtavObsalb_sdts__albpobs_Internalname = "OBSALB_SDTS__ALBPOBS_"+sGXsfl_157_idx ;
   }

   public void subsflControlProps_fel_1572( )
   {
      edtavObservaciones_eliminarlinea_Internalname = "vOBSERVACIONES_ELIMINARLINEA_"+sGXsfl_157_fel_idx ;
      edtavObsalb_sdts__emprcod_Internalname = "OBSALB_SDTS__EMPRCOD_"+sGXsfl_157_fel_idx ;
      edtavObsalb_sdts__albprocod_Internalname = "OBSALB_SDTS__ALBPROCOD_"+sGXsfl_157_fel_idx ;
      edtavObsalb_sdts__albpobslin_Internalname = "OBSALB_SDTS__ALBPOBSLIN_"+sGXsfl_157_fel_idx ;
      edtavObsalb_sdts__albpobs_Internalname = "OBSALB_SDTS__ALBPOBS_"+sGXsfl_157_fel_idx ;
   }

   public void sendrow_1572( )
   {
      subsflControlProps_1572( ) ;
      wb19I0( ) ;
      if ( ( subGridobsalb_sdts_Rows * 1 == 0 ) || ( nGXsfl_157_idx - GRIDOBSALB_SDTS_nFirstRecordOnPage <= subgridobsalb_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridobsalb_sdtsRow = GXWebRow.GetNew(context,Gridobsalb_sdtsContainer) ;
         if ( subGridobsalb_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridobsalb_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridobsalb_sdts_Class, "") != 0 )
            {
               subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridobsalb_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridobsalb_sdts_Backstyle = (byte)(0) ;
            subGridobsalb_sdts_Backcolor = subGridobsalb_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridobsalb_sdts_Class, "") != 0 )
            {
               subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridobsalb_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridobsalb_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridobsalb_sdts_Class, "") != 0 )
            {
               subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Odd" ;
            }
            subGridobsalb_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridobsalb_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridobsalb_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_157_idx) % (2))) == 0 )
            {
               subGridobsalb_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridobsalb_sdts_Class, "") != 0 )
               {
                  subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridobsalb_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridobsalb_sdts_Class, "") != 0 )
               {
                  subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_157_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObservaciones_eliminarlinea_Enabled!=0)&&(edtavObservaciones_eliminarlinea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 158,'',false,'"+sGXsfl_157_idx+"',157)\"" : " ") ;
         ROClassString = "Attribute" ;
         Gridobsalb_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObservaciones_eliminarlinea_Internalname,GXutil.rtrim( AV24Observaciones_EliminarLinea),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavObservaciones_eliminarlinea_Enabled!=0)&&(edtavObservaciones_eliminarlinea_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,158);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVOBSERVACIONES_ELIMINARLINEA.CLICK."+sGXsfl_157_idx+"'","","","","",edtavObservaciones_eliminarlinea_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavObservaciones_eliminarlinea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(157),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridobsalb_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObsalb_sdts__emprcod_Internalname,GXutil.rtrim( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Emprcod()),GXutil.rtrim( localUtil.format( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Emprcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObsalb_sdts__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavObsalb_sdts__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(157),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridobsalb_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObsalb_sdts__albprocod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albprocod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavObsalb_sdts__albprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albprocod()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albprocod()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObsalb_sdts__albprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavObsalb_sdts__albprocod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(157),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridobsalb_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObsalb_sdts__albpobslin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albpobslin(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavObsalb_sdts__albpobslin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albpobslin()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albpobslin()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObsalb_sdts__albpobslin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavObsalb_sdts__albpobslin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(157),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObsalb_sdts__albpobs_Enabled!=0)&&(edtavObsalb_sdts__albpobs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 162,'',false,'"+sGXsfl_157_idx+"',157)\"" : " ") ;
         ROClassString = "AttributeWidth100Porc" ;
         Gridobsalb_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObsalb_sdts__albpobs_Internalname,GXutil.rtrim( ((app.SdtObsalb_SDT)AV20Obsalb_SDTs.elementAt(-1+AV46GXV18)).getgxTv_SdtObsalb_SDT_Albpobs()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavObsalb_sdts__albpobs_Enabled!=0)&&(edtavObsalb_sdts__albpobs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,162);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObsalb_sdts__albpobs_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(157),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes19I2( ) ;
         app.GxWebStd.gx_hidden_field( httpContext, "CALPRD_SDT_ALBPROCOD_"+sGXsfl_157_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavCalprd_sdt_albprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         app.GxWebStd.gx_hidden_field( httpContext, "CALPRD_SDT_ALBPROPRI_"+sGXsfl_157_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbavCalprd_sdt_albpropri.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         app.GxWebStd.gx_hidden_field( httpContext, "CALPRD_SDT_GUIREMCLI_"+sGXsfl_157_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavCalprd_sdt_guiremcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddRow(Gridobsalb_sdtsRow);
         nGXsfl_157_idx = ((subGridobsalb_sdts_Islastpage==1)&&(nGXsfl_157_idx+1>subgridobsalb_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_157_idx+1) ;
         sGXsfl_157_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_157_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1572( ) ;
      }
      /* End function sendrow_1572 */
   }

   public void startgridcontrol157( )
   {
      if ( Gridobsalb_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridobsalb_sdtsContainer"+"DivS\" data-gxgridid=\"157\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridobsalb_sdts_Internalname, subGridobsalb_sdts_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridobsalb_sdts_Backcolorstyle == 0 )
         {
            subGridobsalb_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridobsalb_sdts_Class) > 0 )
            {
               subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridobsalb_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridobsalb_sdts_Backcolorstyle == 1 )
            {
               subGridobsalb_sdts_Titlebackcolor = subGridobsalb_sdts_Allbackcolor ;
               if ( GXutil.len( subGridobsalb_sdts_Class) > 0 )
               {
                  subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridobsalb_sdts_Class) > 0 )
               {
                  subGridobsalb_sdts_Linesclass = subGridobsalb_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Linea de la observacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeWidth100Porc"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obsevaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridobsalb_sdtsContainer.AddObjectProperty("GridName", "Gridobsalb_sdts");
      }
      else
      {
         Gridobsalb_sdtsContainer.AddObjectProperty("GridName", "Gridobsalb_sdts");
         Gridobsalb_sdtsContainer.AddObjectProperty("Header", subGridobsalb_sdts_Header);
         Gridobsalb_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Gridobsalb_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridobsalb_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridobsalb_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridobsalb_sdtsColumn.AddObjectProperty("Value", GXutil.rtrim( AV24Observaciones_EliminarLinea));
         Gridobsalb_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObservaciones_eliminarlinea_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddColumnProperties(Gridobsalb_sdtsColumn);
         Gridobsalb_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridobsalb_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObsalb_sdts__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddColumnProperties(Gridobsalb_sdtsColumn);
         Gridobsalb_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridobsalb_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObsalb_sdts__albprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddColumnProperties(Gridobsalb_sdtsColumn);
         Gridobsalb_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridobsalb_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObsalb_sdts__albpobslin_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddColumnProperties(Gridobsalb_sdtsColumn);
         Gridobsalb_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridobsalb_sdtsContainer.AddColumnProperties(Gridobsalb_sdtsColumn);
         Gridobsalb_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridobsalb_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridobsalb_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavCalprd_sdt_albprocod_Internalname = "CALPRD_SDT_ALBPROCOD" ;
      cmbavCalprd_sdt_albpropri.setInternalname( "CALPRD_SDT_ALBPROPRI" );
      edtavCalprd_sdt_albusu_Internalname = "CALPRD_SDT_ALBUSU" ;
      divTablealbarannumero_Internalname = "TABLEALBARANNUMERO" ;
      edtavCalprd_sdt_albprofch_Internalname = "CALPRD_SDT_ALBPROFCH" ;
      edtavCalprd_sdt_albfecsal_Internalname = "CALPRD_SDT_ALBFECSAL" ;
      edtavCalprd_sdt_albhorsal_Internalname = "CALPRD_SDT_ALBHORSAL" ;
      divTablafechas_Internalname = "TABLAFECHAS" ;
      lblTextblockcalprd_sdt_guiremcli_Internalname = "TEXTBLOCKCALPRD_SDT_GUIREMCLI" ;
      edtavCalprd_sdt_guiremcli_Internalname = "CALPRD_SDT_GUIREMCLI" ;
      lblImgcliente_Internalname = "IMGCLIENTE" ;
      tblTablemergedcalprd_sdt_guiremcli_Internalname = "TABLEMERGEDCALPRD_SDT_GUIREMCLI" ;
      divTablesplittedcalprd_sdt_guiremcli_Internalname = "TABLESPLITTEDCALPRD_SDT_GUIREMCLI" ;
      edtavCalprd_sdt_guiremcln_Internalname = "CALPRD_SDT_GUIREMCLN" ;
      lblTextblockcalprd_sdt_albdomenv_Internalname = "TEXTBLOCKCALPRD_SDT_ALBDOMENV" ;
      edtavCalprd_sdt_albdomenv_Internalname = "CALPRD_SDT_ALBDOMENV" ;
      lblImgdomenvio_Internalname = "IMGDOMENVIO" ;
      tblTablemergedcalprd_sdt_albdomenv_Internalname = "TABLEMERGEDCALPRD_SDT_ALBDOMENV" ;
      divTablesplittedcalprd_sdt_albdomenv_Internalname = "TABLESPLITTEDCALPRD_SDT_ALBDOMENV" ;
      divTablecliente_Internalname = "TABLECLIENTE" ;
      lblTextblockcalprd_sdt_trncod_Internalname = "TEXTBLOCKCALPRD_SDT_TRNCOD" ;
      edtavCalprd_sdt_trncod_Internalname = "CALPRD_SDT_TRNCOD" ;
      lblImgtransportista_Internalname = "IMGTRANSPORTISTA" ;
      tblTablemergedcalprd_sdt_trncod_Internalname = "TABLEMERGEDCALPRD_SDT_TRNCOD" ;
      divTablesplittedcalprd_sdt_trncod_Internalname = "TABLESPLITTEDCALPRD_SDT_TRNCOD" ;
      edtavCalprd_sdt_trnnom_Internalname = "CALPRD_SDT_TRNNOM" ;
      edtavCalprd_sdt_albmat_Internalname = "CALPRD_SDT_ALBMAT" ;
      divTabletransportista_Internalname = "TABLETRANSPORTISTA" ;
      edtavCalprd_sdt_albhhfm_Internalname = "CALPRD_SDT_ALBHHFM" ;
      cmbavCalprd_sdt_albenvftp.setInternalname( "CALPRD_SDT_ALBENVFTP" );
      cmbavCalprd_sdt_albproat.setInternalname( "CALPRD_SDT_ALBPROAT" );
      edtavCalprd_sdt_alblic_Internalname = "CALPRD_SDT_ALBLIC" ;
      edtavCalprd_sdt_albfmd_Internalname = "CALPRD_SDT_ALBFMD" ;
      divGrupoat_Internalname = "GRUPOAT" ;
      grpUnnamedgroup1_Internalname = "UNNAMEDGROUP1" ;
      divTableat_Internalname = "TABLEAT" ;
      divTablealbaran_Internalname = "TABLEALBARAN" ;
      tblTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtnobservaciones_agregarlinea_Internalname = "BTNOBSERVACIONES_AGREGARLINEA" ;
      edtavObservaciones_eliminarlinea_Internalname = "vOBSERVACIONES_ELIMINARLINEA" ;
      edtavObsalb_sdts__emprcod_Internalname = "OBSALB_SDTS__EMPRCOD" ;
      edtavObsalb_sdts__albprocod_Internalname = "OBSALB_SDTS__ALBPROCOD" ;
      edtavObsalb_sdts__albpobslin_Internalname = "OBSALB_SDTS__ALBPOBSLIN" ;
      edtavObsalb_sdts__albpobs_Internalname = "OBSALB_SDTS__ALBPOBS" ;
      divTableobservacionesinsupddlt_Internalname = "TABLEOBSERVACIONESINSUPDDLT" ;
      tblPanelobservaciones_Internalname = "PANELOBSERVACIONES" ;
      Dvpanel_panelobservaciones_Internalname = "DVPANEL_PANELOBSERVACIONES" ;
      divTableobservaciones_Internalname = "TABLEOBSERVACIONES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_observaciones_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA" ;
      Gridobsalb_sdts_empowerer_Internalname = "GRIDOBSALB_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridobsalb_sdts_Internalname = "GRIDOBSALB_SDTS" ;
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
      subGridobsalb_sdts_Allowcollapsing = (byte)(0) ;
      subGridobsalb_sdts_Allowselection = (byte)(0) ;
      subGridobsalb_sdts_Header = "" ;
      edtavObsalb_sdts__albpobs_Jsonclick = "" ;
      edtavObsalb_sdts__albpobs_Visible = -1 ;
      edtavObsalb_sdts__albpobs_Enabled = 1 ;
      edtavObsalb_sdts__albpobslin_Jsonclick = "" ;
      edtavObsalb_sdts__albpobslin_Enabled = 0 ;
      edtavObsalb_sdts__albprocod_Jsonclick = "" ;
      edtavObsalb_sdts__albprocod_Enabled = 0 ;
      edtavObsalb_sdts__emprcod_Jsonclick = "" ;
      edtavObsalb_sdts__emprcod_Enabled = 0 ;
      edtavObservaciones_eliminarlinea_Jsonclick = "" ;
      edtavObservaciones_eliminarlinea_Visible = -1 ;
      edtavObservaciones_eliminarlinea_Enabled = 1 ;
      subGridobsalb_sdts_Class = "GridNoBorder WorkWith" ;
      subGridobsalb_sdts_Backcolorstyle = (byte)(0) ;
      edtavCalprd_sdt_guiremcli_Jsonclick = "" ;
      edtavCalprd_sdt_guiremcli_Enabled = 1 ;
      edtavCalprd_sdt_albdomenv_Jsonclick = "" ;
      edtavCalprd_sdt_albdomenv_Enabled = 1 ;
      edtavCalprd_sdt_trncod_Jsonclick = "" ;
      edtavCalprd_sdt_trncod_Enabled = 1 ;
      edtavCalprd_sdt_albfmd_Enabled = 0 ;
      edtavCalprd_sdt_alblic_Jsonclick = "" ;
      edtavCalprd_sdt_alblic_Enabled = 0 ;
      cmbavCalprd_sdt_albproat.setJsonclick( "" );
      cmbavCalprd_sdt_albproat.setEnabled( 0 );
      cmbavCalprd_sdt_albenvftp.setJsonclick( "" );
      cmbavCalprd_sdt_albenvftp.setEnabled( 0 );
      edtavCalprd_sdt_albhhfm_Jsonclick = "" ;
      edtavCalprd_sdt_albhhfm_Enabled = 0 ;
      edtavCalprd_sdt_albmat_Jsonclick = "" ;
      edtavCalprd_sdt_albmat_Enabled = 1 ;
      edtavCalprd_sdt_trnnom_Jsonclick = "" ;
      edtavCalprd_sdt_trnnom_Enabled = 0 ;
      edtavCalprd_sdt_guiremcln_Jsonclick = "" ;
      edtavCalprd_sdt_guiremcln_Enabled = 0 ;
      edtavCalprd_sdt_albhorsal_Jsonclick = "" ;
      edtavCalprd_sdt_albhorsal_Enabled = 1 ;
      edtavCalprd_sdt_albfecsal_Jsonclick = "" ;
      edtavCalprd_sdt_albfecsal_Enabled = 1 ;
      edtavCalprd_sdt_albprofch_Jsonclick = "" ;
      edtavCalprd_sdt_albprofch_Enabled = 1 ;
      edtavCalprd_sdt_albusu_Jsonclick = "" ;
      edtavCalprd_sdt_albusu_Enabled = 1 ;
      cmbavCalprd_sdt_albpropri.setJsonclick( "" );
      cmbavCalprd_sdt_albpropri.setEnabled( 1 );
      edtavCalprd_sdt_albprocod_Jsonclick = "" ;
      edtavCalprd_sdt_albprocod_Enabled = 1 ;
      edtavCalprd_sdt_guiremcli_Enabled = 1 ;
      cmbavCalprd_sdt_albpropri.setEnabled( 1 );
      edtavCalprd_sdt_albprocod_Enabled = 1 ;
      edtavObsalb_sdts__albpobslin_Enabled = -1 ;
      edtavObsalb_sdts__albprocod_Enabled = -1 ;
      edtavObsalb_sdts__emprcod_Enabled = -1 ;
      edtavCalprd_sdt_albfmd_Enabled = -1 ;
      edtavCalprd_sdt_alblic_Enabled = -1 ;
      cmbavCalprd_sdt_albproat.setEnabled( -1 );
      cmbavCalprd_sdt_albenvftp.setEnabled( -1 );
      edtavCalprd_sdt_albhhfm_Enabled = -1 ;
      edtavCalprd_sdt_trnnom_Enabled = -1 ;
      edtavCalprd_sdt_guiremcln_Enabled = -1 ;
      edtavCalprd_sdt_albusu_Enabled = 1 ;
      Gridobsalb_sdts_empowerer_Infinitescrolling = "Grid" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmationtext = "¿Esta seguro?" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Title = httpContext.getMessage( "Eliminar entrada de almacén", "") ;
      Dvpanel_panelobservaciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Iconposition = "Right" ;
      Dvpanel_panelobservaciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelobservaciones_Title = httpContext.getMessage( "Observaciones", "") ;
      Dvpanel_panelobservaciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelobservaciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelobservaciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelobservaciones_Width = "100%" ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Albaran de Produccion", "") );
      subGridobsalb_sdts_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavCalprd_sdt_albpropri.setName( "CALPRD_SDT_ALBPROPRI" );
      cmbavCalprd_sdt_albpropri.setWebtags( "" );
      cmbavCalprd_sdt_albpropri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavCalprd_sdt_albpropri.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavCalprd_sdt_albpropri.getItemCount() > 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albpropri( cmbavCalprd_sdt_albpropri.getValidValue(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albpropri()) );
      }
      cmbavCalprd_sdt_albenvftp.setName( "CALPRD_SDT_ALBENVFTP" );
      cmbavCalprd_sdt_albenvftp.setWebtags( "" );
      cmbavCalprd_sdt_albenvftp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbavCalprd_sdt_albenvftp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbavCalprd_sdt_albenvftp.getItemCount() > 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albenvftp( (byte)(GXutil.lval( cmbavCalprd_sdt_albenvftp.getValidValue(GXutil.trim( GXutil.str( AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albenvftp(), 1, 0))))) );
      }
      cmbavCalprd_sdt_albproat.setName( "CALPRD_SDT_ALBPROAT" );
      cmbavCalprd_sdt_albproat.setWebtags( "" );
      cmbavCalprd_sdt_albproat.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbavCalprd_sdt_albproat.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbavCalprd_sdt_albproat.addItem("", httpContext.getMessage( "s/d", ""), (short)(0));
      if ( cmbavCalprd_sdt_albproat.getItemCount() > 0 )
      {
         AV7Calprd_SDT.setgxTv_SdtCalprd_SDT_Albproat( cmbavCalprd_sdt_albproat.getValidValue(AV7Calprd_SDT.getgxTv_SdtCalprd_SDT_Albproat()) );
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRIDOBSALB_SDTS.LOAD","{handler:'e1619I2',iparms:[]");
      setEventMetadata("GRIDOBSALB_SDTS.LOAD",",oparms:[{av:'AV24Observaciones_EliminarLinea',fld:'vOBSERVACIONES_ELIMINARLINEA',pic:''}]}");
      setEventMetadata("'DOOBSERVACIONES_AGREGARLINEA'","{handler:'e1219I2',iparms:[{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157},{av:'AV23ObsAlb_TRN',fld:'vOBSALB_TRN',pic:''},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("'DOOBSERVACIONES_AGREGARLINEA'",",oparms:[{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]}");
      setEventMetadata("VOBSERVACIONES_ELIMINARLINEA.CLICK","{handler:'e1719I2',iparms:[{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]");
      setEventMetadata("VOBSERVACIONES_ELIMINARLINEA.CLICK",",oparms:[{av:'AV25Obsalb_Index',fld:'vOBSALB_INDEX',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA.CLOSE","{handler:'e1119I2',iparms:[{av:'Dvelop_confirmpanel_observaciones_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA',prop:'Result'},{av:'AV25Obsalb_Index',fld:'vOBSALB_INDEX',pic:'ZZZ9'},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_OBSERVACIONES_ELIMINARLINEA.CLOSE",",oparms:[{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]}");
      setEventMetadata("'DOIMGTRANSPORTISTA'","{handler:'e1819I1',iparms:[{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''}]");
      setEventMetadata("'DOIMGTRANSPORTISTA'",",oparms:[{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''}]}");
      setEventMetadata("'DOIMGCLIENTE'","{handler:'e2019I1',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''}]");
      setEventMetadata("'DOIMGCLIENTE'",",oparms:[{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''}]}");
      setEventMetadata("'DOIMGDOMENVIO'","{handler:'e1919I1',iparms:[{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''}]");
      setEventMetadata("'DOIMGDOMENVIO'",",oparms:[{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''}]}");
      setEventMetadata("CALPRD_SDT_ALBPROFCH.CONTROLVALUECHANGED","{handler:'e1319I2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV17Fch',fld:'vFCH',pic:''},{av:'AV18AlbLast',fld:'vALBLAST',pic:'ZZZ9'},{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''},{av:'AV19Msg_f',fld:'vMSG_F',pic:''}]");
      setEventMetadata("CALPRD_SDT_ALBPROFCH.CONTROLVALUECHANGED",",oparms:[{av:'AV19Msg_f',fld:'vMSG_F',pic:''},{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''},{av:'AV18AlbLast',fld:'vALBLAST',pic:'ZZZ9'},{av:'AV17Fch',fld:'vFCH',pic:''},{av:'AV9AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("ENTER","{handler:'e1419I2',iparms:[{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV9AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV6AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7Calprd_SDT',fld:'vCALPRD_SDT',pic:''},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV8Calprd_Trn',fld:'vCALPRD_TRN',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV23ObsAlb_TRN',fld:'vOBSALB_TRN',pic:''}]}");
      setEventMetadata("GRIDOBSALB_SDTS_FIRSTPAGE","{handler:'subgridobsalb_sdts_firstpage',iparms:[{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]");
      setEventMetadata("GRIDOBSALB_SDTS_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRIDOBSALB_SDTS_PREVPAGE","{handler:'subgridobsalb_sdts_previouspage',iparms:[{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]");
      setEventMetadata("GRIDOBSALB_SDTS_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRIDOBSALB_SDTS_NEXTPAGE","{handler:'subgridobsalb_sdts_nextpage',iparms:[{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]");
      setEventMetadata("GRIDOBSALB_SDTS_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRIDOBSALB_SDTS_LASTPAGE","{handler:'subgridobsalb_sdts_lastpage',iparms:[{av:'GRIDOBSALB_SDTS_nFirstRecordOnPage'},{av:'GRIDOBSALB_SDTS_nEOF'},{av:'subGridobsalb_sdts_Rows',ctrl:'GRIDOBSALB_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15ContCod',fld:'vCONTCOD',pic:'@!',hsh:true},{av:'AV10AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'AV20Obsalb_SDTs',fld:'vOBSALB_SDTS',grid:157,pic:''},{av:'nGXsfl_157_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:157},{av:'nRC_GXsfl_157',ctrl:'GRIDOBSALB_SDTS',prop:'GridRC',grid:157}]");
      setEventMetadata("GRIDOBSALB_SDTS_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_GXV2","{handler:'validv_Gxv2',iparms:[]");
      setEventMetadata("VALIDV_GXV2",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv22',iparms:[]");
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
      wcpOGx_mode = "" ;
      wcpOAV5EmprCod = "" ;
      wcpOAV9AlbProPri = "" ;
      wcpOAV10AlbSec = "" ;
      wcpOAV15ContCod = "" ;
      Dvelop_confirmpanel_observaciones_eliminarlinea_Result = "" ;
      AV7Calprd_SDT = new app.SdtCalprd_SDT(remoteHandle, context);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV5EmprCod = "" ;
      AV9AlbProPri = "" ;
      AV10AlbSec = "" ;
      AV15ContCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV20Obsalb_SDTs = new GXBaseCollection<app.SdtObsalb_SDT>(app.SdtObsalb_SDT.class, "Obsalb_SDT", "TexplusNET", remoteHandle);
      AV23ObsAlb_TRN = new app.SdtObsalb_TRN(remoteHandle);
      AV17Fch = GXutil.nullDate() ;
      AV19Msg_f = "" ;
      Gridobsalb_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelobservaciones = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      ucGridobsalb_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      Gridobsalb_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV24Observaciones_EliminarLinea = "" ;
      GXCCtl = "" ;
      AV51Station = "" ;
      AV52Emprnom = "" ;
      AV53Usurcod = "" ;
      Gridobsalb_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV21ObsAlb_SDT = new app.SdtObsalb_SDT(remoteHandle, context);
      GXv_int5 = new byte[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_int7 = new int[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV13Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV8Calprd_Trn = new app.SdtCalprd_TRN(remoteHandle);
      GXt_SdtCalprd_SDT9 = new app.SdtCalprd_SDT(remoteHandle, context);
      GXv_SdtCalprd_SDT10 = new app.SdtCalprd_SDT[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXt_objcol_SdtObsalb_SDT11 = new GXBaseCollection<app.SdtObsalb_SDT>(app.SdtObsalb_SDT.class, "Obsalb_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtObsalb_SDT12 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_observaciones_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      bttBtnobservaciones_agregarlinea_Jsonclick = "" ;
      lblTextblockcalprd_sdt_guiremcli_Jsonclick = "" ;
      lblTextblockcalprd_sdt_albdomenv_Jsonclick = "" ;
      lblTextblockcalprd_sdt_trncod_Jsonclick = "" ;
      lblImgtransportista_Jsonclick = "" ;
      lblImgdomenvio_Jsonclick = "" ;
      lblImgcliente_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridobsalb_sdts_Linesclass = "" ;
      ROClassString = "" ;
      Gridobsalb_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.calprd_wp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.calprd_wp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.calprd_wp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.calprd_wp__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCalprd_sdt_albusu_Enabled = 0 ;
      edtavCalprd_sdt_guiremcln_Enabled = 0 ;
      edtavCalprd_sdt_trnnom_Enabled = 0 ;
      edtavCalprd_sdt_albhhfm_Enabled = 0 ;
      cmbavCalprd_sdt_albenvftp.setEnabled( 0 );
      cmbavCalprd_sdt_albproat.setEnabled( 0 );
      edtavCalprd_sdt_alblic_Enabled = 0 ;
      edtavCalprd_sdt_albfmd_Enabled = 0 ;
      edtavObservaciones_eliminarlinea_Enabled = 0 ;
      edtavObsalb_sdts__emprcod_Enabled = 0 ;
      edtavObsalb_sdts__albprocod_Enabled = 0 ;
      edtavObsalb_sdts__albpobslin_Enabled = 0 ;
   }

   private byte GRIDOBSALB_SDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridobsalb_sdts_Backcolorstyle ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private byte subGridobsalb_sdts_Backstyle ;
   private byte subGridobsalb_sdts_Titlebackstyle ;
   private byte subGridobsalb_sdts_Allowselection ;
   private byte subGridobsalb_sdts_Allowhovering ;
   private byte subGridobsalb_sdts_Allowcollapsing ;
   private byte subGridobsalb_sdts_Collapsed ;
   private short AV25Obsalb_Index ;
   private short AV18AlbLast ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_157 ;
   private int subGridobsalb_sdts_Rows ;
   private int nGXsfl_157_idx=1 ;
   private int AV46GXV18 ;
   private int subGridobsalb_sdts_Islastpage ;
   private int edtavCalprd_sdt_albusu_Enabled ;
   private int edtavCalprd_sdt_guiremcln_Enabled ;
   private int edtavCalprd_sdt_trnnom_Enabled ;
   private int edtavCalprd_sdt_albhhfm_Enabled ;
   private int edtavCalprd_sdt_alblic_Enabled ;
   private int edtavCalprd_sdt_albfmd_Enabled ;
   private int edtavObservaciones_eliminarlinea_Enabled ;
   private int edtavObsalb_sdts__emprcod_Enabled ;
   private int edtavObsalb_sdts__albprocod_Enabled ;
   private int edtavObsalb_sdts__albpobslin_Enabled ;
   private int GRIDOBSALB_SDTS_nGridOutOfScope ;
   private int edtavCalprd_sdt_albprocod_Enabled ;
   private int edtavCalprd_sdt_guiremcli_Enabled ;
   private int nGXsfl_157_fel_idx=1 ;
   private int nGXsfl_157_bak_idx=1 ;
   private int GXv_int7[] ;
   private int AV54GXV23 ;
   private int AV55GXV24 ;
   private int edtavCalprd_sdt_albprofch_Enabled ;
   private int edtavCalprd_sdt_albfecsal_Enabled ;
   private int edtavCalprd_sdt_albhorsal_Enabled ;
   private int edtavCalprd_sdt_albmat_Enabled ;
   private int edtavCalprd_sdt_trncod_Enabled ;
   private int edtavCalprd_sdt_albdomenv_Enabled ;
   private int idxLst ;
   private int subGridobsalb_sdts_Backcolor ;
   private int subGridobsalb_sdts_Allbackcolor ;
   private int edtavObservaciones_eliminarlinea_Visible ;
   private int edtavObsalb_sdts__albpobs_Enabled ;
   private int edtavObsalb_sdts__albpobs_Visible ;
   private int subGridobsalb_sdts_Titlebackcolor ;
   private int subGridobsalb_sdts_Selectedindex ;
   private int subGridobsalb_sdts_Selectioncolor ;
   private int subGridobsalb_sdts_Hoveringcolor ;
   private long wcpOAV6AlbProcod ;
   private long GRIDOBSALB_SDTS_nFirstRecordOnPage ;
   private long AV6AlbProcod ;
   private long GRIDOBSALB_SDTS_nCurrentRecord ;
   private long GRIDOBSALB_SDTS_nRecordCount ;
   private String wcpOGx_mode ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV9AlbProPri ;
   private String wcpOAV10AlbSec ;
   private String wcpOAV15ContCod ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV5EmprCod ;
   private String AV9AlbProPri ;
   private String AV10AlbSec ;
   private String AV15ContCod ;
   private String sGXsfl_157_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_panelobservaciones_Width ;
   private String Dvpanel_panelobservaciones_Cls ;
   private String Dvpanel_panelobservaciones_Title ;
   private String Dvpanel_panelobservaciones_Iconposition ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Confirmtype ;
   private String Gridobsalb_sdts_empowerer_Gridinternalname ;
   private String Gridobsalb_sdts_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableobservaciones_Internalname ;
   private String Dvpanel_panelobservaciones_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridobsalb_sdts_empowerer_Internalname ;
   private String sStyleString ;
   private String subGridobsalb_sdts_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV24Observaciones_EliminarLinea ;
   private String edtavObservaciones_eliminarlinea_Internalname ;
   private String edtavCalprd_sdt_albprocod_Internalname ;
   private String GXCCtl ;
   private String edtavCalprd_sdt_albusu_Internalname ;
   private String edtavCalprd_sdt_guiremcln_Internalname ;
   private String edtavCalprd_sdt_trnnom_Internalname ;
   private String edtavCalprd_sdt_albhhfm_Internalname ;
   private String edtavCalprd_sdt_alblic_Internalname ;
   private String edtavCalprd_sdt_albfmd_Internalname ;
   private String edtavObsalb_sdts__emprcod_Internalname ;
   private String edtavObsalb_sdts__albprocod_Internalname ;
   private String edtavObsalb_sdts__albpobslin_Internalname ;
   private String edtavCalprd_sdt_guiremcli_Internalname ;
   private String sGXsfl_157_fel_idx="0001" ;
   private String edtavCalprd_sdt_albprofch_Internalname ;
   private String edtavCalprd_sdt_albfecsal_Internalname ;
   private String edtavCalprd_sdt_albhorsal_Internalname ;
   private String edtavCalprd_sdt_albdomenv_Internalname ;
   private String edtavCalprd_sdt_trncod_Internalname ;
   private String edtavCalprd_sdt_albmat_Internalname ;
   private String AV51Station ;
   private String AV52Emprnom ;
   private String AV53Usurcod ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_observaciones_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_observaciones_eliminarlinea_Internalname ;
   private String tblPanelobservaciones_Internalname ;
   private String divTableobservacionesinsupddlt_Internalname ;
   private String bttBtnobservaciones_agregarlinea_Internalname ;
   private String bttBtnobservaciones_agregarlinea_Jsonclick ;
   private String tblTableattributes_Internalname ;
   private String divTablealbaran_Internalname ;
   private String divTablealbarannumero_Internalname ;
   private String edtavCalprd_sdt_albprocod_Jsonclick ;
   private String edtavCalprd_sdt_albusu_Jsonclick ;
   private String divTablafechas_Internalname ;
   private String edtavCalprd_sdt_albprofch_Jsonclick ;
   private String edtavCalprd_sdt_albfecsal_Jsonclick ;
   private String edtavCalprd_sdt_albhorsal_Jsonclick ;
   private String divTablecliente_Internalname ;
   private String divTablesplittedcalprd_sdt_guiremcli_Internalname ;
   private String lblTextblockcalprd_sdt_guiremcli_Internalname ;
   private String lblTextblockcalprd_sdt_guiremcli_Jsonclick ;
   private String edtavCalprd_sdt_guiremcln_Jsonclick ;
   private String divTablesplittedcalprd_sdt_albdomenv_Internalname ;
   private String lblTextblockcalprd_sdt_albdomenv_Internalname ;
   private String lblTextblockcalprd_sdt_albdomenv_Jsonclick ;
   private String divTabletransportista_Internalname ;
   private String divTablesplittedcalprd_sdt_trncod_Internalname ;
   private String lblTextblockcalprd_sdt_trncod_Internalname ;
   private String lblTextblockcalprd_sdt_trncod_Jsonclick ;
   private String edtavCalprd_sdt_trnnom_Jsonclick ;
   private String edtavCalprd_sdt_albmat_Jsonclick ;
   private String divTableat_Internalname ;
   private String grpUnnamedgroup1_Internalname ;
   private String divGrupoat_Internalname ;
   private String edtavCalprd_sdt_albhhfm_Jsonclick ;
   private String edtavCalprd_sdt_alblic_Jsonclick ;
   private String tblTablemergedcalprd_sdt_trncod_Internalname ;
   private String edtavCalprd_sdt_trncod_Jsonclick ;
   private String lblImgtransportista_Internalname ;
   private String lblImgtransportista_Jsonclick ;
   private String tblTablemergedcalprd_sdt_albdomenv_Internalname ;
   private String edtavCalprd_sdt_albdomenv_Jsonclick ;
   private String lblImgdomenvio_Internalname ;
   private String lblImgdomenvio_Jsonclick ;
   private String tblTablemergedcalprd_sdt_guiremcli_Internalname ;
   private String edtavCalprd_sdt_guiremcli_Jsonclick ;
   private String lblImgcliente_Internalname ;
   private String lblImgcliente_Jsonclick ;
   private String edtavObsalb_sdts__albpobs_Internalname ;
   private String subGridobsalb_sdts_Class ;
   private String subGridobsalb_sdts_Linesclass ;
   private String ROClassString ;
   private String edtavObservaciones_eliminarlinea_Jsonclick ;
   private String edtavObsalb_sdts__emprcod_Jsonclick ;
   private String edtavObsalb_sdts__albprocod_Jsonclick ;
   private String edtavObsalb_sdts__albpobslin_Jsonclick ;
   private String edtavObsalb_sdts__albpobs_Jsonclick ;
   private String subGridobsalb_sdts_Header ;
   private java.util.Date AV17Fch ;
   private java.util.Date GXv_date6[] ;
   private java.util.Date GXv_date8[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV11IsValidar ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_panelobservaciones_Autowidth ;
   private boolean Dvpanel_panelobservaciones_Autoheight ;
   private boolean Dvpanel_panelobservaciones_Collapsible ;
   private boolean Dvpanel_panelobservaciones_Collapsed ;
   private boolean Dvpanel_panelobservaciones_Showcollapseicon ;
   private boolean Dvpanel_panelobservaciones_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_157_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV157 ;
   private String AV19Msg_f ;
   private com.genexus.webpanels.GXWebGrid Gridobsalb_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridobsalb_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridobsalb_sdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelobservaciones ;
   private com.genexus.webpanels.GXUserControl ucGridobsalb_sdts_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_observaciones_eliminarlinea ;
   private app.SdtCalprd_SDT AV7Calprd_SDT ;
   private HTMLChoice cmbavCalprd_sdt_albpropri ;
   private HTMLChoice cmbavCalprd_sdt_albenvftp ;
   private HTMLChoice cmbavCalprd_sdt_albproat ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private GXBaseCollection<app.SdtObsalb_SDT> AV20Obsalb_SDTs ;
   private GXBaseCollection<app.SdtObsalb_SDT> GXt_objcol_SdtObsalb_SDT11 ;
   private GXBaseCollection<app.SdtObsalb_SDT> GXv_objcol_SdtObsalb_SDT12[] ;
   private com.genexus.SdtMessages_Message AV13Message ;
   private app.SdtCalprd_SDT GXt_SdtCalprd_SDT9 ;
   private app.SdtCalprd_SDT GXv_SdtCalprd_SDT10[] ;
   private app.SdtCalprd_TRN AV8Calprd_Trn ;
   private app.SdtObsalb_SDT AV21ObsAlb_SDT ;
   private app.SdtObsalb_TRN AV23ObsAlb_TRN ;
}

final  class calprd_wp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_wp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_wp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class calprd_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

}

