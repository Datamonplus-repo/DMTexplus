package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccaud_wc_impl extends GXWebComponent
{
   public wccaud_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccaud_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccaud_wc_impl.class ));
   }

   public wccaud_wc_impl( int remoteHandle ,
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
      chkavWccaud_sdt__seleccionar = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
               AV18emprcod = httpContext.GetPar( "emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18emprcod", AV18emprcod);
               AV6BarFin = (int)(GXutil.lval( httpContext.GetPar( "BarFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarFin), 8, 0));
               AV7BarIni = (int)(GXutil.lval( httpContext.GetPar( "BarIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarIni), 8, 0));
               AV8BarSer = httpContext.GetPar( "BarSer") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarSer", AV8BarSer);
               AV9Cctfin = (short)(GXutil.lval( httpContext.GetPar( "Cctfin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Cctfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Cctfin), 4, 0));
               AV10Cctini = (short)(GXutil.lval( httpContext.GetPar( "Cctini"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Cctini", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Cctini), 4, 0));
               AV11CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliFin), 6, 0));
               AV12CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliIni), 6, 0));
               AV17Det = httpContext.GetPar( "Det") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Det", AV17Det);
               AV22FchFin = localUtil.parseDateParm( httpContext.GetPar( "FchFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22FchFin", localUtil.format(AV22FchFin, "99/99/99"));
               AV23FchIni = localUtil.parseDateParm( httpContext.GetPar( "FchIni")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FchIni", localUtil.format(AV23FchIni, "99/99/99"));
               AV36ParFin = httpContext.GetPar( "ParFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ParFin", AV36ParFin);
               AV37ParIni = httpContext.GetPar( "ParIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ParIni", AV37ParIni);
               AV38Rea = (byte)(GXutil.lval( httpContext.GetPar( "Rea"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Rea", GXutil.str( AV38Rea, 1, 0));
               AV39ReoFin = (byte)(GXutil.lval( httpContext.GetPar( "ReoFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ReoFin", GXutil.str( AV39ReoFin, 1, 0));
               AV40ReoIni = (byte)(GXutil.lval( httpContext.GetPar( "ReoIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ReoIni", GXutil.str( AV40ReoIni, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV18emprcod,Integer.valueOf(AV6BarFin),Integer.valueOf(AV7BarIni),AV8BarSer,Short.valueOf(AV9Cctfin),Short.valueOf(AV10Cctini),Integer.valueOf(AV11CliFin),Integer.valueOf(AV12CliIni),AV17Det,AV22FchFin,AV23FchIni,AV36ParFin,AV37ParIni,Byte.valueOf(AV38Rea),Byte.valueOf(AV39ReoFin),Byte.valueOf(AV40ReoIni)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13ColumnsSelector);
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18emprcod = httpContext.GetPar( "emprcod") ;
      AV6BarFin = (int)(GXutil.lval( httpContext.GetPar( "BarFin"))) ;
      AV7BarIni = (int)(GXutil.lval( httpContext.GetPar( "BarIni"))) ;
      AV8BarSer = httpContext.GetPar( "BarSer") ;
      AV9Cctfin = (short)(GXutil.lval( httpContext.GetPar( "Cctfin"))) ;
      AV10Cctini = (short)(GXutil.lval( httpContext.GetPar( "Cctini"))) ;
      AV11CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
      AV12CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
      AV17Det = httpContext.GetPar( "Det") ;
      AV22FchFin = localUtil.parseDateParm( httpContext.GetPar( "FchFin")) ;
      AV23FchIni = localUtil.parseDateParm( httpContext.GetPar( "FchIni")) ;
      AV36ParFin = httpContext.GetPar( "ParFin") ;
      AV37ParIni = httpContext.GetPar( "ParIni") ;
      AV38Rea = (byte)(GXutil.lval( httpContext.GetPar( "Rea"))) ;
      AV39ReoFin = (byte)(GXutil.lval( httpContext.GetPar( "ReoFin"))) ;
      AV40ReoIni = (byte)(GXutil.lval( httpContext.GetPar( "ReoIni"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2BO2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
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
         httpContext.writeValue( httpContext.getMessage( "Auditoria de los CC", "")) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wccaud_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarFin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarIni,8,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarSer)),GXutil.URLEncode(GXutil.ltrimstr(AV9Cctfin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Cctini,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliIni,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17Det)),GXutil.URLEncode(GXutil.formatDateParm(AV22FchFin)),GXutil.URLEncode(GXutil.formatDateParm(AV23FchIni)),GXutil.URLEncode(GXutil.rtrim(AV36ParFin)),GXutil.URLEncode(GXutil.rtrim(AV37ParIni)),GXutil.URLEncode(GXutil.ltrimstr(AV38Rea,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV39ReoFin,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40ReoIni,1,0))}, new String[] {"emprcod","BarFin","BarIni","BarSer","Cctfin","Cctini","CliFin","CliIni","Det","FchFin","FchIni","ParFin","ParIni","Rea","ReoFin","ReoIni"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Wccaud_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wccaud_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Wccaud_sdt", AV46Wccaud_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Wccaud_sdt", AV46Wccaud_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV13ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV13ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18emprcod", GXutil.rtrim( wcpOAV18emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6BarFin", GXutil.ltrim( localUtil.ntoc( wcpOAV6BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarIni", GXutil.ltrim( localUtil.ntoc( wcpOAV7BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarSer", GXutil.rtrim( wcpOAV8BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Cctfin", GXutil.ltrim( localUtil.ntoc( wcpOAV9Cctfin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Cctini", GXutil.ltrim( localUtil.ntoc( wcpOAV10Cctini, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11CliFin", GXutil.ltrim( localUtil.ntoc( wcpOAV11CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12CliIni", GXutil.ltrim( localUtil.ntoc( wcpOAV12CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Det", GXutil.rtrim( wcpOAV17Det));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22FchFin", localUtil.dtoc( wcpOAV22FchFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23FchIni", localUtil.dtoc( wcpOAV23FchIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36ParFin", GXutil.rtrim( wcpOAV36ParFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37ParIni", GXutil.rtrim( wcpOAV37ParIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Rea", GXutil.ltrim( localUtil.ntoc( wcpOAV38Rea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39ReoFin", GXutil.ltrim( localUtil.ntoc( wcpOAV39ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40ReoIni", GXutil.ltrim( localUtil.ntoc( wcpOAV40ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV18emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFIN", GXutil.ltrim( localUtil.ntoc( AV6BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARINI", GXutil.ltrim( localUtil.ntoc( AV7BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV8BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCTFIN", GXutil.ltrim( localUtil.ntoc( AV9Cctfin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCTINI", GXutil.ltrim( localUtil.ntoc( AV10Cctini, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIFIN", GXutil.ltrim( localUtil.ntoc( AV11CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIINI", GXutil.ltrim( localUtil.ntoc( AV12CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDET", GXutil.rtrim( AV17Det));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFCHFIN", localUtil.dtoc( AV22FchFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFCHINI", localUtil.dtoc( AV23FchIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFIN", GXutil.rtrim( AV36ParFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARINI", GXutil.rtrim( AV37ParIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREA", GXutil.ltrim( localUtil.ntoc( AV38Rea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREOFIN", GXutil.ltrim( localUtil.ntoc( AV39ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREOINI", GXutil.ltrim( localUtil.ntoc( AV40ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vWCCAUD_SDT", AV46Wccaud_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vWCCAUD_SDT", AV46Wccaud_SDT);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vVAR_SELECCIONAR", AV49Var_seleccionar);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
   }

   public void renderHtmlCloseForm2BO2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
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
      return "ControlCalidadHTD.Wccaud_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Auditoria de los CC", "") ;
   }

   public void wb2BO0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.controlcalidadhtd.wccaud_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnword_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "Word", ""), bttBtnword_Jsonclick, 7, httpContext.getMessage( "Word", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e112bo1_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV59GXV1 = nGXsfl_45_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0073"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0073"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_45_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0073"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV81Pgmname), GXutil.rtrim( localUtil.format( AV81Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wccaud_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV13ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV59GXV1 = nGXsfl_45_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2BO2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Auditoria de los CC", ""), (short)(0)) ;
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
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup2BO0( ) ;
         }
      }
   }

   public void ws2BO2( )
   {
      start2BO2( ) ;
      evt2BO2( ) ;
   }

   public void evt2BO2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMarcarTodas' */
                                 e152BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoDesmarcarTodas' */
                                 e162BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e172BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e182BO2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavWccaud_sdt__seleccionar.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BO0( ) ;
                           }
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           AV59GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV46Wccaud_SDT.size() >= AV59GXV1 ) && ( AV59GXV1 > 0 ) )
                           {
                              AV46Wccaud_SDT.currentItem( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)) );
                              AV50DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV50DetailWebComponent);
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavWccaud_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e192BO2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavWccaud_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e202BO2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavWccaud_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e212BO2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VDETAILWEBCOMPONENT.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavWccaud_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e222BO2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup2BO0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavWccaud_sdt__seleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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
                     if ( nCmpId == 73 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0073") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0073", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2BO2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2BO2( ) ;
         }
      }
   }

   public void pa2BO2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelector ,
                                 String AV81Pgmname ,
                                 String AV18emprcod ,
                                 int AV6BarFin ,
                                 int AV7BarIni ,
                                 String AV8BarSer ,
                                 short AV9Cctfin ,
                                 short AV10Cctini ,
                                 int AV11CliFin ,
                                 int AV12CliIni ,
                                 String AV17Det ,
                                 java.util.Date AV22FchFin ,
                                 java.util.Date AV23FchIni ,
                                 String AV36ParFin ,
                                 String AV37ParIni ,
                                 byte AV38Rea ,
                                 byte AV39ReoFin ,
                                 byte AV40ReoIni ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e202BO2 ();
      GRID_nCurrentRecord = 0 ;
      rf2BO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Wccaud_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wccaud_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2BO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "ControlCalidadHTD.Wccaud_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavWccaud_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__procod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__prodsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barordlin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__fascod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccfch_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__cctcod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccopecod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__openom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__openom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__openom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barser_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barenccli_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__bartipart_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__bargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__bargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__bargraaca_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barancaca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barancaca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barancaca1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccfok_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccfok_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccfok_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e202BO2 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_452( ) ;
         e212BO2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_45_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e212BO2 ();
         }
         wbEnd = (short)(45) ;
         wb2BO0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BO2( )
   {
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return AV46Wccaud_SDT.size() ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "ControlCalidadHTD.Wccaud_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavWccaud_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__procod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__prodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__prodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__prodsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barordlin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__fascod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccfch_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__cctcod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccopecod_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__openom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__openom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__openom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barser_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barenccli_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__bartipart_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__bargraaca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__bargraaca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__bargraaca_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barancaca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barancaca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barancaca1_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccfok_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccfok_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccfok_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e192BO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Wccaud_sdt"), AV46Wccaud_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV13ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vWCCAUD_SDT"), AV46Wccaud_SDT);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV18emprcod = httpContext.cgiGet( sPrefix+"wcpOAV18emprcod") ;
         wcpOAV6BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7BarIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8BarSer = httpContext.cgiGet( sPrefix+"wcpOAV8BarSer") ;
         wcpOAV9Cctfin = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Cctfin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10Cctini = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10Cctini"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11CliFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12CliIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17Det = httpContext.cgiGet( sPrefix+"wcpOAV17Det") ;
         wcpOAV22FchFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV22FchFin"), 0) ;
         wcpOAV23FchIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23FchIni"), 0) ;
         wcpOAV36ParFin = httpContext.cgiGet( sPrefix+"wcpOAV36ParFin") ;
         wcpOAV37ParIni = httpContext.cgiGet( sPrefix+"wcpOAV37ParIni") ;
         wcpOAV38Rea = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38Rea"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV39ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39ReoFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV40ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40ReoIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_45_fel_idx = 0 ;
         while ( nGXsfl_45_fel_idx < nRC_GXsfl_45 )
         {
            nGXsfl_45_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_fel_idx+1) ;
            sGXsfl_45_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_452( ) ;
            AV59GXV1 = (int)(nGXsfl_45_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV46Wccaud_SDT.size() >= AV59GXV1 ) && ( AV59GXV1 > 0 ) )
            {
               AV46Wccaud_SDT.currentItem( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)) );
               AV50DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            }
         }
         if ( nGXsfl_45_fel_idx == 0 )
         {
            nGXsfl_45_idx = 1 ;
            sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_452( ) ;
         }
         nGXsfl_45_fel_idx = 1 ;
         /* Read variables values. */
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Wccaud_WC");
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV81Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\wccaud_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e192BO2 ();
      if (returnInSub) return;
   }

   public void e192BO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wccaud_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV18emprcod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV45UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      wccaud_wc_impl.this.AV18emprcod = GXv_char2[0] ;
      wccaud_wc_impl.this.AV19EmprNom = GXv_char3[0] ;
      wccaud_wc_impl.this.AV45UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18emprcod", AV18emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_objcol_SdtWccaud_SDT_Item7 = AV46Wccaud_SDT ;
      GXv_objcol_SdtWccaud_SDT_Item8[0] = GXt_objcol_SdtWccaud_SDT_Item7 ;
      new app.controlcalidadhtd.wccaud_dp(remoteHandle, context).execute( AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, GXv_objcol_SdtWccaud_SDT_Item8) ;
      GXt_objcol_SdtWccaud_SDT_Item7 = GXv_objcol_SdtWccaud_SDT_Item8[0] ;
      AV46Wccaud_SDT = GXt_objcol_SdtWccaud_SDT_Item7 ;
      gx_BV45 = true ;
   }

   public void e202BO2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV48WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV48WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV41Session.getValue("ControlCalidadHTD.Wccaud_WCColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV41Session.getValue("ControlCalidadHTD.Wccaud_WCColumnsSelector") ;
         AV13ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      chkavWccaud_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavWccaud_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavWccaud_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcodreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcodreo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcodpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcodpar_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__procod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__procod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__procod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__prodsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__prodsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__prodsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barordlin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barordlin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barordlin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__fascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__fascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__fascod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__fasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__fasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__fasdsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccfch_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__cctcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__cctcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__cctcod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__cctdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__cctdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__cctdsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccopecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccopecod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__openom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__openom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__openom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barser_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barcolnom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barenccli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__bartipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__bartipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__bartipart_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__bargraaca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__bargraaca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__bargraaca_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__barancaca1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__barancaca1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__barancaca1_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtavWccaud_sdt__ccfok_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccaud_sdt__ccfok_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccaud_sdt__ccfok_Visible), 5, 0), !bGXsfl_45_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
   }

   public void e122BO2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV35PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV35PageToGo) ;
      }
   }

   public void e132BO2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e212BO2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV46Wccaud_SDT.size() )
      {
         AV46Wccaud_SDT.currentItem( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)) );
         AV50DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV50DetailWebComponent);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(45) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_452( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
         {
            httpContext.doAjaxLoad(45, GridRow);
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e142BO2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV13ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.Wccaud_WCColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV13ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
   }

   public void e152BO2( )
   {
      AV59GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV59GXV1 > 0 ) && ( AV46Wccaud_SDT.size() >= AV59GXV1 ) )
      {
         AV46Wccaud_SDT.currentItem( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV49Var_seleccionar = true ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Var_seleccionar", AV49Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S152 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV46Wccaud_SDT", AV46Wccaud_SDT);
      nGXsfl_45_bak_idx = nGXsfl_45_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      nGXsfl_45_idx = nGXsfl_45_bak_idx ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
   }

   public void e162BO2( )
   {
      AV59GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV59GXV1 > 0 ) && ( AV46Wccaud_SDT.size() >= AV59GXV1 ) )
      {
         AV46Wccaud_SDT.currentItem( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV49Var_seleccionar = false ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Var_seleccionar", AV49Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S152 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV46Wccaud_SDT", AV46Wccaud_SDT);
      nGXsfl_45_bak_idx = nGXsfl_45_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV13ColumnsSelector, AV81Pgmname, AV18emprcod, AV6BarFin, AV7BarIni, AV8BarSer, AV9Cctfin, AV10Cctini, AV11CliFin, AV12CliIni, AV17Det, AV22FchFin, AV23FchIni, AV36ParFin, AV37ParIni, AV38Rea, AV39ReoFin, AV40ReoIni, sPrefix) ;
      nGXsfl_45_idx = nGXsfl_45_bak_idx ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV13ColumnsSelector", AV13ColumnsSelector);
   }

   public void e172BO2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV21ExcelFilename ;
      GXv_char3[0] = AV20ErrorMessage ;
      new app.controlcalidadhtd.wccaud_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wccaud_wc_impl.this.AV21ExcelFilename = GXv_char4[0] ;
      wccaud_wc_impl.this.AV20ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV21ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20ErrorMessage);
      }
   }

   public void e182BO2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.controlcalidadhtd.wccaud_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e222BO2( )
   {
      AV59GXV1 = (int)(nGXsfl_45_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV59GXV1 > 0 ) && ( AV46Wccaud_SDT.size() >= AV59GXV1 ) )
      {
         AV46Wccaud_SDT.currentItem( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)) );
      }
      /* Detailwebcomponent_Click Routine */
      returnInSub = false ;
      AV51Barcod = ((app.controlcalidadhtd.SdtWccaud_SDT_Item)(AV46Wccaud_SDT.currentItem())).getgxTv_SdtWccaud_SDT_Item_Barcod() ;
      AV52Barcodreo = ((app.controlcalidadhtd.SdtWccaud_SDT_Item)(AV46Wccaud_SDT.currentItem())).getgxTv_SdtWccaud_SDT_Item_Barcodreo() ;
      AV53barcodpar = ((app.controlcalidadhtd.SdtWccaud_SDT_Item)(AV46Wccaud_SDT.currentItem())).getgxTv_SdtWccaud_SDT_Item_Barcodpar() ;
      AV54Procod = ((app.controlcalidadhtd.SdtWccaud_SDT_Item)(AV46Wccaud_SDT.currentItem())).getgxTv_SdtWccaud_SDT_Item_Procod() ;
      AV55barordlin = ((app.controlcalidadhtd.SdtWccaud_SDT_Item)(AV46Wccaud_SDT.currentItem())).getgxTv_SdtWccaud_SDT_Item_Barordlin() ;
      AV56CCTCod = ((app.controlcalidadhtd.SdtWccaud_SDT_Item)(AV46Wccaud_SDT.currentItem())).getgxTv_SdtWccaud_SDT_Item_Cctcod() ;
      /* Object Property */
      if ( GXutil.len( sPrefix) == 0 )
      {
         bDynCreated_Grid_dwc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Grid_dwc_Component), GXutil.lower( "ControlCalidadHTD.Wccaud_Datos_WC")) != 0 )
      {
         WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app.controlcalidadhtd.wccaud_datos_wc_impl", remoteHandle, context);
         WebComp_Grid_dwc_Component = "ControlCalidadHTD.Wccaud_Datos_WC" ;
      }
      if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
      {
         WebComp_Grid_dwc.setjustcreated();
         WebComp_Grid_dwc.componentprepare(new Object[] {sPrefix+"W0073","",AV18emprcod,Integer.valueOf(AV51Barcod),Byte.valueOf(AV52Barcodreo),AV53barcodpar,AV54Procod,Short.valueOf(AV55barordlin),Integer.valueOf(AV56CCTCod)});
         WebComp_Grid_dwc.componentbind(new Object[] {"","","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Grid_dwc )
      {
         httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0073"+"");
         WebComp_Grid_dwc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S132( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV13ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Seleccionar", "", "Op", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barcod", "", "Nº Hdr", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barcodreo", "", "R", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barcodpar", "", "P", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Procod", "", "Proceso", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Prodsc", "", "Descripcion", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barordlin", "", "Orden", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Fascod", "", "Fase", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Fasdsc", "", "Descripcion", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Ccfch", "", "Fecha", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__CCtcod", "", "Código", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__CCtdsc", "", "Descripción", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__CCopecod", "", "Operario", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Openom", "", "Nombre", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barser", "", "Articulo", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barcolnom", "", "Color", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barenccli", "", "Ped. Cli.", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Bartipart", "", "Tipo Articulo", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Bargraaca", "", "Grm2", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__Barancaca1", "", "Ancho", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Wccaud_SDT__CCfOk", "", "Ok", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV44UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.Wccaud_WCColumnsSelector", GXv_char4) ;
      wccaud_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV44UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV14ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV14ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV13ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV14ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV13ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV41Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV27GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV27GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV27GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV27GridState.fromxml(AV41Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV18emprcod)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV18emprcod );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV6BarFin) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFIN" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6BarFin, 8, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV7BarIni) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARINI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7BarIni, 8, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8BarSer)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8BarSer );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV9Cctfin) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CCTFIN" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9Cctfin, 4, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV10Cctini) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CCTINI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10Cctini, 4, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV11CliFin) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLIFIN" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11CliFin, 6, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV12CliIni) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLIINI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV12CliIni, 6, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV17Det)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DET" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV17Det );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22FchFin)) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FCHFIN" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV22FchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23FchIni)) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FCHINI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV23FchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV36ParFin)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PARFIN" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36ParFin );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37ParIni)==0) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PARINI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37ParIni );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV38Rea) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&REA" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV38Rea, 1, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV39ReoFin) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&REOFIN" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV39ReoFin, 1, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      if ( ! (0==AV40ReoIni) )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&REOINI" );
         AV28GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40ReoIni, 1, 0) );
         AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV28GridStateFilterValue, 0);
      }
      AV27GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV27GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV30i = (short)(1) ;
      while ( AV30i <= AV46Wccaud_SDT.size() )
      {
         ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV30i)).setgxTv_SdtWccaud_SDT_Item_Seleccionar( AV49Var_seleccionar );
         AV30i = (short)(AV30i+1) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV18emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18emprcod", AV18emprcod);
      AV6BarFin = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarFin), 8, 0));
      AV7BarIni = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarIni), 8, 0));
      AV8BarSer = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarSer", AV8BarSer);
      AV9Cctfin = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Cctfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Cctfin), 4, 0));
      AV10Cctini = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Cctini", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Cctini), 4, 0));
      AV11CliFin = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliFin), 6, 0));
      AV12CliIni = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliIni), 6, 0));
      AV17Det = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Det", AV17Det);
      AV22FchFin = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22FchFin", localUtil.format(AV22FchFin, "99/99/99"));
      AV23FchIni = (java.util.Date)getParm(obj,10,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FchIni", localUtil.format(AV23FchIni, "99/99/99"));
      AV36ParFin = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ParFin", AV36ParFin);
      AV37ParIni = (String)getParm(obj,12,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ParIni", AV37ParIni);
      AV38Rea = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Rea", GXutil.str( AV38Rea, 1, 0));
      AV39ReoFin = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ReoFin", GXutil.str( AV39ReoFin, 1, 0));
      AV40ReoIni = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ReoIni", GXutil.str( AV40ReoIni, 1, 0));
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
      pa2BO2( ) ;
      ws2BO2( ) ;
      we2BO2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV18emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6BarFin = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7BarIni = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8BarSer = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9Cctfin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10Cctini = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11CliFin = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV12CliIni = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV17Det = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV22FchFin = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV23FchIni = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV36ParFin = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV37ParIni = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV38Rea = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV39ReoFin = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV40ReoIni = (String)getParm(obj,15,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2BO2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "controlcalidadhtd\\wccaud_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2BO2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV18emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18emprcod", AV18emprcod);
         AV6BarFin = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarFin), 8, 0));
         AV7BarIni = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarIni), 8, 0));
         AV8BarSer = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarSer", AV8BarSer);
         AV9Cctfin = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Cctfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Cctfin), 4, 0));
         AV10Cctini = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Cctini", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Cctini), 4, 0));
         AV11CliFin = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliFin), 6, 0));
         AV12CliIni = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliIni), 6, 0));
         AV17Det = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Det", AV17Det);
         AV22FchFin = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22FchFin", localUtil.format(AV22FchFin, "99/99/99"));
         AV23FchIni = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FchIni", localUtil.format(AV23FchIni, "99/99/99"));
         AV36ParFin = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ParFin", AV36ParFin);
         AV37ParIni = (String)getParm(obj,14,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ParIni", AV37ParIni);
         AV38Rea = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Rea", GXutil.str( AV38Rea, 1, 0));
         AV39ReoFin = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ReoFin", GXutil.str( AV39ReoFin, 1, 0));
         AV40ReoIni = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ReoIni", GXutil.str( AV40ReoIni, 1, 0));
      }
      wcpOAV18emprcod = httpContext.cgiGet( sPrefix+"wcpOAV18emprcod") ;
      wcpOAV6BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6BarFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV7BarIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8BarSer = httpContext.cgiGet( sPrefix+"wcpOAV8BarSer") ;
      wcpOAV9Cctfin = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Cctfin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10Cctini = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10Cctini"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11CliFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12CliIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17Det = httpContext.cgiGet( sPrefix+"wcpOAV17Det") ;
      wcpOAV22FchFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV22FchFin"), 0) ;
      wcpOAV23FchIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV23FchIni"), 0) ;
      wcpOAV36ParFin = httpContext.cgiGet( sPrefix+"wcpOAV36ParFin") ;
      wcpOAV37ParIni = httpContext.cgiGet( sPrefix+"wcpOAV37ParIni") ;
      wcpOAV38Rea = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38Rea"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV39ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV39ReoFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV40ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40ReoIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV18emprcod, wcpOAV18emprcod) != 0 ) || ( AV6BarFin != wcpOAV6BarFin ) || ( AV7BarIni != wcpOAV7BarIni ) || ( GXutil.strcmp(AV8BarSer, wcpOAV8BarSer) != 0 ) || ( AV9Cctfin != wcpOAV9Cctfin ) || ( AV10Cctini != wcpOAV10Cctini ) || ( AV11CliFin != wcpOAV11CliFin ) || ( AV12CliIni != wcpOAV12CliIni ) || ( GXutil.strcmp(AV17Det, wcpOAV17Det) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV22FchFin), GXutil.resetTime(wcpOAV22FchFin)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV23FchIni), GXutil.resetTime(wcpOAV23FchIni)) ) || ( GXutil.strcmp(AV36ParFin, wcpOAV36ParFin) != 0 ) || ( GXutil.strcmp(AV37ParIni, wcpOAV37ParIni) != 0 ) || ( AV38Rea != wcpOAV38Rea ) || ( AV39ReoFin != wcpOAV39ReoFin ) || ( AV40ReoIni != wcpOAV40ReoIni ) ) )
      {
         setjustcreated();
      }
      wcpOAV18emprcod = AV18emprcod ;
      wcpOAV6BarFin = AV6BarFin ;
      wcpOAV7BarIni = AV7BarIni ;
      wcpOAV8BarSer = AV8BarSer ;
      wcpOAV9Cctfin = AV9Cctfin ;
      wcpOAV10Cctini = AV10Cctini ;
      wcpOAV11CliFin = AV11CliFin ;
      wcpOAV12CliIni = AV12CliIni ;
      wcpOAV17Det = AV17Det ;
      wcpOAV22FchFin = AV22FchFin ;
      wcpOAV23FchIni = AV23FchIni ;
      wcpOAV36ParFin = AV36ParFin ;
      wcpOAV37ParIni = AV37ParIni ;
      wcpOAV38Rea = AV38Rea ;
      wcpOAV39ReoFin = AV39ReoFin ;
      wcpOAV40ReoIni = AV40ReoIni ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV18emprcod = httpContext.cgiGet( sPrefix+"AV18emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV18emprcod) > 0 )
      {
         AV18emprcod = httpContext.cgiGet( sCtrlAV18emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18emprcod", AV18emprcod);
      }
      else
      {
         AV18emprcod = httpContext.cgiGet( sPrefix+"AV18emprcod_PARM") ;
      }
      sCtrlAV6BarFin = httpContext.cgiGet( sPrefix+"AV6BarFin_CTRL") ;
      if ( GXutil.len( sCtrlAV6BarFin) > 0 )
      {
         AV6BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6BarFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarFin), 8, 0));
      }
      else
      {
         AV6BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6BarFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7BarIni = httpContext.cgiGet( sPrefix+"AV7BarIni_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarIni) > 0 )
      {
         AV7BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV7BarIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarIni), 8, 0));
      }
      else
      {
         AV7BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV7BarIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8BarSer = httpContext.cgiGet( sPrefix+"AV8BarSer_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarSer) > 0 )
      {
         AV8BarSer = httpContext.cgiGet( sCtrlAV8BarSer) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarSer", AV8BarSer);
      }
      else
      {
         AV8BarSer = httpContext.cgiGet( sPrefix+"AV8BarSer_PARM") ;
      }
      sCtrlAV9Cctfin = httpContext.cgiGet( sPrefix+"AV9Cctfin_CTRL") ;
      if ( GXutil.len( sCtrlAV9Cctfin) > 0 )
      {
         AV9Cctfin = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9Cctfin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Cctfin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Cctfin), 4, 0));
      }
      else
      {
         AV9Cctfin = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9Cctfin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10Cctini = httpContext.cgiGet( sPrefix+"AV10Cctini_CTRL") ;
      if ( GXutil.len( sCtrlAV10Cctini) > 0 )
      {
         AV10Cctini = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10Cctini), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Cctini", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Cctini), 4, 0));
      }
      else
      {
         AV10Cctini = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10Cctini_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11CliFin = httpContext.cgiGet( sPrefix+"AV11CliFin_CTRL") ;
      if ( GXutil.len( sCtrlAV11CliFin) > 0 )
      {
         AV11CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11CliFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliFin), 6, 0));
      }
      else
      {
         AV11CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11CliFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12CliIni = httpContext.cgiGet( sPrefix+"AV12CliIni_CTRL") ;
      if ( GXutil.len( sCtrlAV12CliIni) > 0 )
      {
         AV12CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12CliIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliIni), 6, 0));
      }
      else
      {
         AV12CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12CliIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17Det = httpContext.cgiGet( sPrefix+"AV17Det_CTRL") ;
      if ( GXutil.len( sCtrlAV17Det) > 0 )
      {
         AV17Det = httpContext.cgiGet( sCtrlAV17Det) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Det", AV17Det);
      }
      else
      {
         AV17Det = httpContext.cgiGet( sPrefix+"AV17Det_PARM") ;
      }
      sCtrlAV22FchFin = httpContext.cgiGet( sPrefix+"AV22FchFin_CTRL") ;
      if ( GXutil.len( sCtrlAV22FchFin) > 0 )
      {
         AV22FchFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV22FchFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22FchFin", localUtil.format(AV22FchFin, "99/99/99"));
      }
      else
      {
         AV22FchFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV22FchFin_PARM"), 0) ;
      }
      sCtrlAV23FchIni = httpContext.cgiGet( sPrefix+"AV23FchIni_CTRL") ;
      if ( GXutil.len( sCtrlAV23FchIni) > 0 )
      {
         AV23FchIni = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV23FchIni), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23FchIni", localUtil.format(AV23FchIni, "99/99/99"));
      }
      else
      {
         AV23FchIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV23FchIni_PARM"), 0) ;
      }
      sCtrlAV36ParFin = httpContext.cgiGet( sPrefix+"AV36ParFin_CTRL") ;
      if ( GXutil.len( sCtrlAV36ParFin) > 0 )
      {
         AV36ParFin = httpContext.cgiGet( sCtrlAV36ParFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36ParFin", AV36ParFin);
      }
      else
      {
         AV36ParFin = httpContext.cgiGet( sPrefix+"AV36ParFin_PARM") ;
      }
      sCtrlAV37ParIni = httpContext.cgiGet( sPrefix+"AV37ParIni_CTRL") ;
      if ( GXutil.len( sCtrlAV37ParIni) > 0 )
      {
         AV37ParIni = httpContext.cgiGet( sCtrlAV37ParIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37ParIni", AV37ParIni);
      }
      else
      {
         AV37ParIni = httpContext.cgiGet( sPrefix+"AV37ParIni_PARM") ;
      }
      sCtrlAV38Rea = httpContext.cgiGet( sPrefix+"AV38Rea_CTRL") ;
      if ( GXutil.len( sCtrlAV38Rea) > 0 )
      {
         AV38Rea = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV38Rea), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Rea", GXutil.str( AV38Rea, 1, 0));
      }
      else
      {
         AV38Rea = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV38Rea_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV39ReoFin = httpContext.cgiGet( sPrefix+"AV39ReoFin_CTRL") ;
      if ( GXutil.len( sCtrlAV39ReoFin) > 0 )
      {
         AV39ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV39ReoFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ReoFin", GXutil.str( AV39ReoFin, 1, 0));
      }
      else
      {
         AV39ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV39ReoFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV40ReoIni = httpContext.cgiGet( sPrefix+"AV40ReoIni_CTRL") ;
      if ( GXutil.len( sCtrlAV40ReoIni) > 0 )
      {
         AV40ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV40ReoIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ReoIni", GXutil.str( AV40ReoIni, 1, 0));
      }
      else
      {
         AV40ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV40ReoIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa2BO2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2BO2( ) ;
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
      ws2BO2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18emprcod_PARM", GXutil.rtrim( AV18emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18emprcod_CTRL", GXutil.rtrim( sCtrlAV18emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarFin_PARM", GXutil.ltrim( localUtil.ntoc( AV6BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6BarFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6BarFin_CTRL", GXutil.rtrim( sCtrlAV6BarFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarIni_PARM", GXutil.ltrim( localUtil.ntoc( AV7BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarIni_CTRL", GXutil.rtrim( sCtrlAV7BarIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarSer_PARM", GXutil.rtrim( AV8BarSer));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarSer)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarSer_CTRL", GXutil.rtrim( sCtrlAV8BarSer));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Cctfin_PARM", GXutil.ltrim( localUtil.ntoc( AV9Cctfin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Cctfin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Cctfin_CTRL", GXutil.rtrim( sCtrlAV9Cctfin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Cctini_PARM", GXutil.ltrim( localUtil.ntoc( AV10Cctini, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Cctini)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Cctini_CTRL", GXutil.rtrim( sCtrlAV10Cctini));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CliFin_PARM", GXutil.ltrim( localUtil.ntoc( AV11CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11CliFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CliFin_CTRL", GXutil.rtrim( sCtrlAV11CliFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12CliIni_PARM", GXutil.ltrim( localUtil.ntoc( AV12CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12CliIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12CliIni_CTRL", GXutil.rtrim( sCtrlAV12CliIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Det_PARM", GXutil.rtrim( AV17Det));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Det)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Det_CTRL", GXutil.rtrim( sCtrlAV17Det));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22FchFin_PARM", localUtil.dtoc( AV22FchFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22FchFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22FchFin_CTRL", GXutil.rtrim( sCtrlAV22FchFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23FchIni_PARM", localUtil.dtoc( AV23FchIni, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23FchIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23FchIni_CTRL", GXutil.rtrim( sCtrlAV23FchIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36ParFin_PARM", GXutil.rtrim( AV36ParFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36ParFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36ParFin_CTRL", GXutil.rtrim( sCtrlAV36ParFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37ParIni_PARM", GXutil.rtrim( AV37ParIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37ParIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37ParIni_CTRL", GXutil.rtrim( sCtrlAV37ParIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Rea_PARM", GXutil.ltrim( localUtil.ntoc( AV38Rea, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Rea)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Rea_CTRL", GXutil.rtrim( sCtrlAV38Rea));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39ReoFin_PARM", GXutil.ltrim( localUtil.ntoc( AV39ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39ReoFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39ReoFin_CTRL", GXutil.rtrim( sCtrlAV39ReoFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40ReoIni_PARM", GXutil.ltrim( localUtil.ntoc( AV40ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40ReoIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40ReoIni_CTRL", GXutil.rtrim( sCtrlAV40ReoIni));
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
      we2BO2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555197", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wccaud_wc.js", "?20268211555197", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      chkavWccaud_sdt__seleccionar.setInternalname( sPrefix+"WCCAUD_SDT__SELECCIONAR_"+sGXsfl_45_idx );
      edtavWccaud_sdt__barcod_Internalname = sPrefix+"WCCAUD_SDT__BARCOD_"+sGXsfl_45_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barcodreo_Internalname = sPrefix+"WCCAUD_SDT__BARCODREO_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barcodpar_Internalname = sPrefix+"WCCAUD_SDT__BARCODPAR_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__procod_Internalname = sPrefix+"WCCAUD_SDT__PROCOD_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__prodsc_Internalname = sPrefix+"WCCAUD_SDT__PRODSC_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barordlin_Internalname = sPrefix+"WCCAUD_SDT__BARORDLIN_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__fascod_Internalname = sPrefix+"WCCAUD_SDT__FASCOD_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__fasdsc_Internalname = sPrefix+"WCCAUD_SDT__FASDSC_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__ccfch_Internalname = sPrefix+"WCCAUD_SDT__CCFCH_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__cctcod_Internalname = sPrefix+"WCCAUD_SDT__CCTCOD_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__cctdsc_Internalname = sPrefix+"WCCAUD_SDT__CCTDSC_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__ccopecod_Internalname = sPrefix+"WCCAUD_SDT__CCOPECOD_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__openom_Internalname = sPrefix+"WCCAUD_SDT__OPENOM_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barser_Internalname = sPrefix+"WCCAUD_SDT__BARSER_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barcolnom_Internalname = sPrefix+"WCCAUD_SDT__BARCOLNOM_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barenccli_Internalname = sPrefix+"WCCAUD_SDT__BARENCCLI_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__bartipart_Internalname = sPrefix+"WCCAUD_SDT__BARTIPART_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__bargraaca_Internalname = sPrefix+"WCCAUD_SDT__BARGRAACA_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__barancaca1_Internalname = sPrefix+"WCCAUD_SDT__BARANCACA1_"+sGXsfl_45_idx ;
      edtavWccaud_sdt__ccfok_Internalname = sPrefix+"WCCAUD_SDT__CCFOK_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      chkavWccaud_sdt__seleccionar.setInternalname( sPrefix+"WCCAUD_SDT__SELECCIONAR_"+sGXsfl_45_fel_idx );
      edtavWccaud_sdt__barcod_Internalname = sPrefix+"WCCAUD_SDT__BARCOD_"+sGXsfl_45_fel_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barcodreo_Internalname = sPrefix+"WCCAUD_SDT__BARCODREO_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barcodpar_Internalname = sPrefix+"WCCAUD_SDT__BARCODPAR_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__procod_Internalname = sPrefix+"WCCAUD_SDT__PROCOD_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__prodsc_Internalname = sPrefix+"WCCAUD_SDT__PRODSC_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barordlin_Internalname = sPrefix+"WCCAUD_SDT__BARORDLIN_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__fascod_Internalname = sPrefix+"WCCAUD_SDT__FASCOD_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__fasdsc_Internalname = sPrefix+"WCCAUD_SDT__FASDSC_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__ccfch_Internalname = sPrefix+"WCCAUD_SDT__CCFCH_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__cctcod_Internalname = sPrefix+"WCCAUD_SDT__CCTCOD_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__cctdsc_Internalname = sPrefix+"WCCAUD_SDT__CCTDSC_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__ccopecod_Internalname = sPrefix+"WCCAUD_SDT__CCOPECOD_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__openom_Internalname = sPrefix+"WCCAUD_SDT__OPENOM_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barser_Internalname = sPrefix+"WCCAUD_SDT__BARSER_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barcolnom_Internalname = sPrefix+"WCCAUD_SDT__BARCOLNOM_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barenccli_Internalname = sPrefix+"WCCAUD_SDT__BARENCCLI_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__bartipart_Internalname = sPrefix+"WCCAUD_SDT__BARTIPART_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__bargraaca_Internalname = sPrefix+"WCCAUD_SDT__BARGRAACA_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__barancaca1_Internalname = sPrefix+"WCCAUD_SDT__BARANCACA1_"+sGXsfl_45_fel_idx ;
      edtavWccaud_sdt__ccfok_Internalname = sPrefix+"WCCAUD_SDT__CCFOK_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb2BO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavWccaud_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavWccaud_sdt__seleccionar.getEnabled()!=0)&&(chkavWccaud_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "WCCAUD_SDT__SELECCIONAR_" + sGXsfl_45_idx ;
         chkavWccaud_sdt__seleccionar.setName( GXCCtl );
         chkavWccaud_sdt__seleccionar.setWebtags( "" );
         chkavWccaud_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavWccaud_sdt__seleccionar.getInternalname(), "TitleCaption", chkavWccaud_sdt__seleccionar.getCaption(), !bGXsfl_45_Refreshing);
         chkavWccaud_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavWccaud_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavWccaud_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(46, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavWccaud_sdt__seleccionar.getEnabled()!=0)&&(chkavWccaud_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__barcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barcod_Visible),Integer.valueOf(edtavWccaud_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV50DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVDETAILWEBCOMPONENT.CLICK."+sGXsfl_45_idx+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__barcodreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barcodreo_Visible),Integer.valueOf(edtavWccaud_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__barcodpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barcodpar_Visible),Integer.valueOf(edtavWccaud_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__procod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__procod_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Procod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__procod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__procod_Visible),Integer.valueOf(edtavWccaud_sdt__procod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__prodsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__prodsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Prodsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__prodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__prodsc_Visible),Integer.valueOf(edtavWccaud_sdt__prodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__barordlin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__barordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barordlin_Visible),Integer.valueOf(edtavWccaud_sdt__barordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__fascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__fascod_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__fascod_Visible),Integer.valueOf(edtavWccaud_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__fasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__fasdsc_Visible),Integer.valueOf(edtavWccaud_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__ccfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__ccfch_Internalname,localUtil.format(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccfch(), "99/99/99"),localUtil.format( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__ccfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__ccfch_Visible),Integer.valueOf(edtavWccaud_sdt__ccfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__cctcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__cctcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Cctcod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__cctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Cctcod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Cctcod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__cctcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__cctcod_Visible),Integer.valueOf(edtavWccaud_sdt__cctcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__cctdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__cctdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Cctdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__cctdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__cctdsc_Visible),Integer.valueOf(edtavWccaud_sdt__cctdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__ccopecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__ccopecod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccopecod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__ccopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccopecod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccopecod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__ccopecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__ccopecod_Visible),Integer.valueOf(edtavWccaud_sdt__ccopecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__openom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__openom_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Openom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__openom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__openom_Visible),Integer.valueOf(edtavWccaud_sdt__openom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barser_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barser_Visible),Integer.valueOf(edtavWccaud_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barcolnom_Visible),Integer.valueOf(edtavWccaud_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccaud_sdt__barenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barenccli_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barenccli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barenccli_Visible),Integer.valueOf(edtavWccaud_sdt__barenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__bartipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__bartipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Bartipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__bartipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Bartipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Bartipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__bartipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__bartipart_Visible),Integer.valueOf(edtavWccaud_sdt__bartipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__bargraaca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__bargraaca_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Bargraaca(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__bargraaca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Bargraaca()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Bargraaca()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__bargraaca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__bargraaca_Visible),Integer.valueOf(edtavWccaud_sdt__bargraaca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__barancaca1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__barancaca1_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barancaca1(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__barancaca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barancaca1()), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Barancaca1()), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__barancaca1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__barancaca1_Visible),Integer.valueOf(edtavWccaud_sdt__barancaca1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccaud_sdt__ccfok_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccaud_sdt__ccfok_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccfok(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccaud_sdt__ccfok_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccfok()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtWccaud_SDT_Item)AV46Wccaud_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtWccaud_SDT_Item_Ccfok()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccaud_sdt__ccfok_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccaud_sdt__ccfok_Visible),Integer.valueOf(edtavWccaud_sdt__ccfok_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2BO2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavWccaud_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barcodreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barcodpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__procod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__prodsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barordlin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__fascod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__fasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__ccfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__cctcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__cctdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__ccopecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__openom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__bartipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__bargraaca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__barancaca1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccaud_sdt__ccfok_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ok", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavWccaud_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV50DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__procod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__procod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__prodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__prodsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barordlin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__fascod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__fasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__ccfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__ccfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__cctcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__cctcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__cctdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__cctdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__ccopecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__ccopecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__openom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__openom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__bartipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__bartipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__bargraaca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__bargraaca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barancaca1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__barancaca1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__ccfok_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccaud_sdt__ccfok_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      lblTbmessage_Internalname = sPrefix+"TBMESSAGE" ;
      bttBtnmarcartodas_Internalname = sPrefix+"BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = sPrefix+"BTNDESMARCARTODAS" ;
      bttBtnword_Internalname = sPrefix+"BTNWORD" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      chkavWccaud_sdt__seleccionar.setInternalname( sPrefix+"WCCAUD_SDT__SELECCIONAR" );
      edtavWccaud_sdt__barcod_Internalname = sPrefix+"WCCAUD_SDT__BARCOD" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavWccaud_sdt__barcodreo_Internalname = sPrefix+"WCCAUD_SDT__BARCODREO" ;
      edtavWccaud_sdt__barcodpar_Internalname = sPrefix+"WCCAUD_SDT__BARCODPAR" ;
      edtavWccaud_sdt__procod_Internalname = sPrefix+"WCCAUD_SDT__PROCOD" ;
      edtavWccaud_sdt__prodsc_Internalname = sPrefix+"WCCAUD_SDT__PRODSC" ;
      edtavWccaud_sdt__barordlin_Internalname = sPrefix+"WCCAUD_SDT__BARORDLIN" ;
      edtavWccaud_sdt__fascod_Internalname = sPrefix+"WCCAUD_SDT__FASCOD" ;
      edtavWccaud_sdt__fasdsc_Internalname = sPrefix+"WCCAUD_SDT__FASDSC" ;
      edtavWccaud_sdt__ccfch_Internalname = sPrefix+"WCCAUD_SDT__CCFCH" ;
      edtavWccaud_sdt__cctcod_Internalname = sPrefix+"WCCAUD_SDT__CCTCOD" ;
      edtavWccaud_sdt__cctdsc_Internalname = sPrefix+"WCCAUD_SDT__CCTDSC" ;
      edtavWccaud_sdt__ccopecod_Internalname = sPrefix+"WCCAUD_SDT__CCOPECOD" ;
      edtavWccaud_sdt__openom_Internalname = sPrefix+"WCCAUD_SDT__OPENOM" ;
      edtavWccaud_sdt__barser_Internalname = sPrefix+"WCCAUD_SDT__BARSER" ;
      edtavWccaud_sdt__barcolnom_Internalname = sPrefix+"WCCAUD_SDT__BARCOLNOM" ;
      edtavWccaud_sdt__barenccli_Internalname = sPrefix+"WCCAUD_SDT__BARENCCLI" ;
      edtavWccaud_sdt__bartipart_Internalname = sPrefix+"WCCAUD_SDT__BARTIPART" ;
      edtavWccaud_sdt__bargraaca_Internalname = sPrefix+"WCCAUD_SDT__BARGRAACA" ;
      edtavWccaud_sdt__barancaca1_Internalname = sPrefix+"WCCAUD_SDT__BARANCACA1" ;
      edtavWccaud_sdt__ccfok_Internalname = sPrefix+"WCCAUD_SDT__CCFOK" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavWccaud_sdt__ccfok_Jsonclick = "" ;
      edtavWccaud_sdt__ccfok_Enabled = 0 ;
      edtavWccaud_sdt__ccfok_Visible = -1 ;
      edtavWccaud_sdt__barancaca1_Jsonclick = "" ;
      edtavWccaud_sdt__barancaca1_Enabled = 0 ;
      edtavWccaud_sdt__barancaca1_Visible = -1 ;
      edtavWccaud_sdt__bargraaca_Jsonclick = "" ;
      edtavWccaud_sdt__bargraaca_Enabled = 0 ;
      edtavWccaud_sdt__bargraaca_Visible = -1 ;
      edtavWccaud_sdt__bartipart_Jsonclick = "" ;
      edtavWccaud_sdt__bartipart_Enabled = 0 ;
      edtavWccaud_sdt__bartipart_Visible = -1 ;
      edtavWccaud_sdt__barenccli_Jsonclick = "" ;
      edtavWccaud_sdt__barenccli_Enabled = 0 ;
      edtavWccaud_sdt__barenccli_Visible = -1 ;
      edtavWccaud_sdt__barcolnom_Jsonclick = "" ;
      edtavWccaud_sdt__barcolnom_Enabled = 0 ;
      edtavWccaud_sdt__barcolnom_Visible = -1 ;
      edtavWccaud_sdt__barser_Jsonclick = "" ;
      edtavWccaud_sdt__barser_Enabled = 0 ;
      edtavWccaud_sdt__barser_Visible = -1 ;
      edtavWccaud_sdt__openom_Jsonclick = "" ;
      edtavWccaud_sdt__openom_Enabled = 0 ;
      edtavWccaud_sdt__openom_Visible = -1 ;
      edtavWccaud_sdt__ccopecod_Jsonclick = "" ;
      edtavWccaud_sdt__ccopecod_Enabled = 0 ;
      edtavWccaud_sdt__ccopecod_Visible = -1 ;
      edtavWccaud_sdt__cctdsc_Jsonclick = "" ;
      edtavWccaud_sdt__cctdsc_Enabled = 0 ;
      edtavWccaud_sdt__cctdsc_Visible = -1 ;
      edtavWccaud_sdt__cctcod_Jsonclick = "" ;
      edtavWccaud_sdt__cctcod_Enabled = 0 ;
      edtavWccaud_sdt__cctcod_Visible = -1 ;
      edtavWccaud_sdt__ccfch_Jsonclick = "" ;
      edtavWccaud_sdt__ccfch_Enabled = 0 ;
      edtavWccaud_sdt__ccfch_Visible = -1 ;
      edtavWccaud_sdt__fasdsc_Jsonclick = "" ;
      edtavWccaud_sdt__fasdsc_Enabled = 0 ;
      edtavWccaud_sdt__fasdsc_Visible = -1 ;
      edtavWccaud_sdt__fascod_Jsonclick = "" ;
      edtavWccaud_sdt__fascod_Enabled = 0 ;
      edtavWccaud_sdt__fascod_Visible = -1 ;
      edtavWccaud_sdt__barordlin_Jsonclick = "" ;
      edtavWccaud_sdt__barordlin_Enabled = 0 ;
      edtavWccaud_sdt__barordlin_Visible = -1 ;
      edtavWccaud_sdt__prodsc_Jsonclick = "" ;
      edtavWccaud_sdt__prodsc_Enabled = 0 ;
      edtavWccaud_sdt__prodsc_Visible = -1 ;
      edtavWccaud_sdt__procod_Jsonclick = "" ;
      edtavWccaud_sdt__procod_Enabled = 0 ;
      edtavWccaud_sdt__procod_Visible = -1 ;
      edtavWccaud_sdt__barcodpar_Jsonclick = "" ;
      edtavWccaud_sdt__barcodpar_Enabled = 0 ;
      edtavWccaud_sdt__barcodpar_Visible = -1 ;
      edtavWccaud_sdt__barcodreo_Jsonclick = "" ;
      edtavWccaud_sdt__barcodreo_Enabled = 0 ;
      edtavWccaud_sdt__barcodreo_Visible = -1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavWccaud_sdt__barcod_Jsonclick = "" ;
      edtavWccaud_sdt__barcod_Enabled = 0 ;
      edtavWccaud_sdt__barcod_Visible = -1 ;
      chkavWccaud_sdt__seleccionar.setCaption( "" );
      chkavWccaud_sdt__seleccionar.setEnabled( 1 );
      chkavWccaud_sdt__seleccionar.setVisible( -1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavWccaud_sdt__ccfok_Visible = -1 ;
      edtavWccaud_sdt__barancaca1_Visible = -1 ;
      edtavWccaud_sdt__bargraaca_Visible = -1 ;
      edtavWccaud_sdt__bartipart_Visible = -1 ;
      edtavWccaud_sdt__barenccli_Visible = -1 ;
      edtavWccaud_sdt__barcolnom_Visible = -1 ;
      edtavWccaud_sdt__barser_Visible = -1 ;
      edtavWccaud_sdt__openom_Visible = -1 ;
      edtavWccaud_sdt__ccopecod_Visible = -1 ;
      edtavWccaud_sdt__cctdsc_Visible = -1 ;
      edtavWccaud_sdt__cctcod_Visible = -1 ;
      edtavWccaud_sdt__ccfch_Visible = -1 ;
      edtavWccaud_sdt__fasdsc_Visible = -1 ;
      edtavWccaud_sdt__fascod_Visible = -1 ;
      edtavWccaud_sdt__barordlin_Visible = -1 ;
      edtavWccaud_sdt__prodsc_Visible = -1 ;
      edtavWccaud_sdt__procod_Visible = -1 ;
      edtavWccaud_sdt__barcodpar_Visible = -1 ;
      edtavWccaud_sdt__barcodreo_Visible = -1 ;
      edtavWccaud_sdt__barcod_Visible = -1 ;
      chkavWccaud_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavWccaud_sdt__ccfok_Enabled = -1 ;
      edtavWccaud_sdt__barancaca1_Enabled = -1 ;
      edtavWccaud_sdt__bargraaca_Enabled = -1 ;
      edtavWccaud_sdt__bartipart_Enabled = -1 ;
      edtavWccaud_sdt__barenccli_Enabled = -1 ;
      edtavWccaud_sdt__barcolnom_Enabled = -1 ;
      edtavWccaud_sdt__barser_Enabled = -1 ;
      edtavWccaud_sdt__openom_Enabled = -1 ;
      edtavWccaud_sdt__ccopecod_Enabled = -1 ;
      edtavWccaud_sdt__cctdsc_Enabled = -1 ;
      edtavWccaud_sdt__cctcod_Enabled = -1 ;
      edtavWccaud_sdt__ccfch_Enabled = -1 ;
      edtavWccaud_sdt__fasdsc_Enabled = -1 ;
      edtavWccaud_sdt__fascod_Enabled = -1 ;
      edtavWccaud_sdt__barordlin_Enabled = -1 ;
      edtavWccaud_sdt__prodsc_Enabled = -1 ;
      edtavWccaud_sdt__procod_Enabled = -1 ;
      edtavWccaud_sdt__barcodpar_Enabled = -1 ;
      edtavWccaud_sdt__barcodreo_Enabled = -1 ;
      edtavWccaud_sdt__barcod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      lblTbmessage_Caption = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:Wccaud_SDT__Seleccionar|1:Wccaud_SDT__Barcod|3:Wccaud_SDT__Barcodreo|4:Wccaud_SDT__Barcodpar|5:Wccaud_SDT__Procod|6:Wccaud_SDT__Prodsc|7:Wccaud_SDT__Barordlin|8:Wccaud_SDT__Fascod|9:Wccaud_SDT__Fasdsc|10:Wccaud_SDT__Ccfch|11:Wccaud_SDT__CCtcod|12:Wccaud_SDT__CCtdsc|13:Wccaud_SDT__CCopecod|14:Wccaud_SDT__Openom|15:Wccaud_SDT__Barser|16:Wccaud_SDT__Barcolnom|17:Wccaud_SDT__Barenccli|18:Wccaud_SDT__Bartipart|19:Wccaud_SDT__Bargraaca|20:Wccaud_SDT__Barancaca1|21:Wccaud_SDT__CCfOk" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "WCCAUD_SDT__SELECCIONAR_" + sGXsfl_45_idx ;
      chkavWccaud_sdt__seleccionar.setName( GXCCtl );
      chkavWccaud_sdt__seleccionar.setWebtags( "" );
      chkavWccaud_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavWccaud_sdt__seleccionar.getInternalname(), "TitleCaption", chkavWccaud_sdt__seleccionar.getCaption(), !bGXsfl_45_Refreshing);
      chkavWccaud_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'sPrefix'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV7BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV8BarSer',fld:'vBARSER',pic:''},{av:'AV9Cctfin',fld:'vCCTFIN',pic:'ZZZ9'},{av:'AV10Cctini',fld:'vCCTINI',pic:'ZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV12CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV17Det',fld:'vDET',pic:''},{av:'AV22FchFin',fld:'vFCHFIN',pic:''},{av:'AV23FchIni',fld:'vFCHINI',pic:''},{av:'AV36ParFin',fld:'vPARFIN',pic:''},{av:'AV37ParIni',fld:'vPARINI',pic:''},{av:'AV38Rea',fld:'vREA',pic:'9'},{av:'AV39ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV40ReoIni',fld:'vREOINI',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'WCCAUD_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODREO',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODPAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__PROCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__PRODSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARORDLIN',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFCH',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCOPECOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__OPENOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARSER',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARENCCLI',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARTIPART',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARGRAACA',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARANCACA1',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFOK',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122BO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV7BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV8BarSer',fld:'vBARSER',pic:''},{av:'AV9Cctfin',fld:'vCCTFIN',pic:'ZZZ9'},{av:'AV10Cctini',fld:'vCCTINI',pic:'ZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV12CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV17Det',fld:'vDET',pic:''},{av:'AV22FchFin',fld:'vFCHFIN',pic:''},{av:'AV23FchIni',fld:'vFCHINI',pic:''},{av:'AV36ParFin',fld:'vPARFIN',pic:''},{av:'AV37ParIni',fld:'vPARINI',pic:''},{av:'AV38Rea',fld:'vREA',pic:'9'},{av:'AV39ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV40ReoIni',fld:'vREOINI',pic:'9'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132BO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV7BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV8BarSer',fld:'vBARSER',pic:''},{av:'AV9Cctfin',fld:'vCCTFIN',pic:'ZZZ9'},{av:'AV10Cctini',fld:'vCCTINI',pic:'ZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV12CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV17Det',fld:'vDET',pic:''},{av:'AV22FchFin',fld:'vFCHFIN',pic:''},{av:'AV23FchIni',fld:'vFCHINI',pic:''},{av:'AV36ParFin',fld:'vPARFIN',pic:''},{av:'AV37ParIni',fld:'vPARINI',pic:''},{av:'AV38Rea',fld:'vREA',pic:'9'},{av:'AV39ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV40ReoIni',fld:'vREOINI',pic:'9'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e212BO2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV50DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e142BO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV7BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV8BarSer',fld:'vBARSER',pic:''},{av:'AV9Cctfin',fld:'vCCTFIN',pic:'ZZZ9'},{av:'AV10Cctini',fld:'vCCTINI',pic:'ZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV12CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV17Det',fld:'vDET',pic:''},{av:'AV22FchFin',fld:'vFCHFIN',pic:''},{av:'AV23FchIni',fld:'vFCHINI',pic:''},{av:'AV36ParFin',fld:'vPARFIN',pic:''},{av:'AV37ParIni',fld:'vPARINI',pic:''},{av:'AV38Rea',fld:'vREA',pic:'9'},{av:'AV39ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV40ReoIni',fld:'vREOINI',pic:'9'},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'WCCAUD_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODREO',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODPAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__PROCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__PRODSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARORDLIN',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFCH',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCOPECOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__OPENOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARSER',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARENCCLI',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARTIPART',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARGRAACA',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARANCACA1',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFOK',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e152BO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV7BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV8BarSer',fld:'vBARSER',pic:''},{av:'AV9Cctfin',fld:'vCCTFIN',pic:'ZZZ9'},{av:'AV10Cctini',fld:'vCCTINI',pic:'ZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV12CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV17Det',fld:'vDET',pic:''},{av:'AV22FchFin',fld:'vFCHFIN',pic:''},{av:'AV23FchIni',fld:'vFCHINI',pic:''},{av:'AV36ParFin',fld:'vPARFIN',pic:''},{av:'AV37ParIni',fld:'vPARINI',pic:''},{av:'AV38Rea',fld:'vREA',pic:'9'},{av:'AV39ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV40ReoIni',fld:'vREOINI',pic:'9'},{av:'sPrefix'},{av:'AV49Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV49Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'WCCAUD_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODREO',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODPAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__PROCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__PRODSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARORDLIN',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFCH',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCOPECOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__OPENOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARSER',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARENCCLI',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARTIPART',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARGRAACA',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARANCACA1',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFOK',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e162BO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV7BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV8BarSer',fld:'vBARSER',pic:''},{av:'AV9Cctfin',fld:'vCCTFIN',pic:'ZZZ9'},{av:'AV10Cctini',fld:'vCCTINI',pic:'ZZZ9'},{av:'AV11CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV12CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV17Det',fld:'vDET',pic:''},{av:'AV22FchFin',fld:'vFCHFIN',pic:''},{av:'AV23FchIni',fld:'vFCHINI',pic:''},{av:'AV36ParFin',fld:'vPARFIN',pic:''},{av:'AV37ParIni',fld:'vPARINI',pic:''},{av:'AV38Rea',fld:'vREA',pic:'9'},{av:'AV39ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV40ReoIni',fld:'vREOINI',pic:'9'},{av:'sPrefix'},{av:'AV49Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV49Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'WCCAUD_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODREO',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCODPAR',prop:'Visible'},{ctrl:'WCCAUD_SDT__PROCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__PRODSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARORDLIN',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__FASDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFCH',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTCOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCTDSC',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCOPECOD',prop:'Visible'},{ctrl:'WCCAUD_SDT__OPENOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARSER',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARENCCLI',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARTIPART',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARGRAACA',prop:'Visible'},{ctrl:'WCCAUD_SDT__BARANCACA1',prop:'Visible'},{ctrl:'WCCAUD_SDT__CCFOK',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOWORD'","{handler:'e112BO1',iparms:[]");
      setEventMetadata("'DOWORD'",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e172BO2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e182BO2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e222BO2',iparms:[{av:'AV46Wccaud_SDT',fld:'vWCCAUD_SDT',grid:45,pic:''},{av:'nGXsfl_45_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:45},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_45',ctrl:'GRID',prop:'GridRC',grid:45},{av:'AV18emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
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
      wcpOAV18emprcod = "" ;
      wcpOAV8BarSer = "" ;
      wcpOAV17Det = "" ;
      wcpOAV22FchFin = GXutil.nullDate() ;
      wcpOAV23FchIni = GXutil.nullDate() ;
      wcpOAV36ParFin = "" ;
      wcpOAV37ParIni = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV18emprcod = "" ;
      AV8BarSer = "" ;
      AV17Det = "" ;
      AV22FchFin = GXutil.nullDate() ;
      AV23FchIni = GXutil.nullDate() ;
      AV36ParFin = "" ;
      AV37ParIni = "" ;
      AV13ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV81Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV46Wccaud_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>(app.controlcalidadhtd.SdtWccaud_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      bttBtnword_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV50DetailWebComponent = "" ;
      hsh = "" ;
      AV5Station = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      AV45UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtWccaud_SDT_Item7 = new GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item>(app.controlcalidadhtd.SdtWccaud_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtWccaud_SDT_Item8 = new GXBaseCollection[1] ;
      AV48WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV21ExcelFilename = "" ;
      AV20ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV53barcodpar = "" ;
      AV54Procod = "" ;
      AV44UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV14ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV18emprcod = "" ;
      sCtrlAV6BarFin = "" ;
      sCtrlAV7BarIni = "" ;
      sCtrlAV8BarSer = "" ;
      sCtrlAV9Cctfin = "" ;
      sCtrlAV10Cctini = "" ;
      sCtrlAV11CliFin = "" ;
      sCtrlAV12CliIni = "" ;
      sCtrlAV17Det = "" ;
      sCtrlAV22FchFin = "" ;
      sCtrlAV23FchIni = "" ;
      sCtrlAV36ParFin = "" ;
      sCtrlAV37ParIni = "" ;
      sCtrlAV38Rea = "" ;
      sCtrlAV39ReoFin = "" ;
      sCtrlAV40ReoIni = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV81Pgmname = "ControlCalidadHTD.Wccaud_WC" ;
      /* GeneXus formulas. */
      AV81Pgmname = "ControlCalidadHTD.Wccaud_WC" ;
      Gx_err = (short)(0) ;
      edtavWccaud_sdt__barcod_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavWccaud_sdt__barcodreo_Enabled = 0 ;
      edtavWccaud_sdt__barcodpar_Enabled = 0 ;
      edtavWccaud_sdt__procod_Enabled = 0 ;
      edtavWccaud_sdt__prodsc_Enabled = 0 ;
      edtavWccaud_sdt__barordlin_Enabled = 0 ;
      edtavWccaud_sdt__fascod_Enabled = 0 ;
      edtavWccaud_sdt__fasdsc_Enabled = 0 ;
      edtavWccaud_sdt__ccfch_Enabled = 0 ;
      edtavWccaud_sdt__cctcod_Enabled = 0 ;
      edtavWccaud_sdt__cctdsc_Enabled = 0 ;
      edtavWccaud_sdt__ccopecod_Enabled = 0 ;
      edtavWccaud_sdt__openom_Enabled = 0 ;
      edtavWccaud_sdt__barser_Enabled = 0 ;
      edtavWccaud_sdt__barcolnom_Enabled = 0 ;
      edtavWccaud_sdt__barenccli_Enabled = 0 ;
      edtavWccaud_sdt__bartipart_Enabled = 0 ;
      edtavWccaud_sdt__bargraaca_Enabled = 0 ;
      edtavWccaud_sdt__barancaca1_Enabled = 0 ;
      edtavWccaud_sdt__ccfok_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV38Rea ;
   private byte wcpOAV39ReoFin ;
   private byte wcpOAV40ReoIni ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV38Rea ;
   private byte AV39ReoFin ;
   private byte AV40ReoIni ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV52Barcodreo ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV9Cctfin ;
   private short wcpOAV10Cctini ;
   private short AV9Cctfin ;
   private short AV10Cctini ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV55barordlin ;
   private short AV30i ;
   private int wcpOAV6BarFin ;
   private int wcpOAV7BarIni ;
   private int wcpOAV11CliFin ;
   private int wcpOAV12CliIni ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int AV6BarFin ;
   private int AV7BarIni ;
   private int AV11CliFin ;
   private int AV12CliIni ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV59GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavWccaud_sdt__barcod_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavWccaud_sdt__barcodreo_Enabled ;
   private int edtavWccaud_sdt__barcodpar_Enabled ;
   private int edtavWccaud_sdt__procod_Enabled ;
   private int edtavWccaud_sdt__prodsc_Enabled ;
   private int edtavWccaud_sdt__barordlin_Enabled ;
   private int edtavWccaud_sdt__fascod_Enabled ;
   private int edtavWccaud_sdt__fasdsc_Enabled ;
   private int edtavWccaud_sdt__ccfch_Enabled ;
   private int edtavWccaud_sdt__cctcod_Enabled ;
   private int edtavWccaud_sdt__cctdsc_Enabled ;
   private int edtavWccaud_sdt__ccopecod_Enabled ;
   private int edtavWccaud_sdt__openom_Enabled ;
   private int edtavWccaud_sdt__barser_Enabled ;
   private int edtavWccaud_sdt__barcolnom_Enabled ;
   private int edtavWccaud_sdt__barenccli_Enabled ;
   private int edtavWccaud_sdt__bartipart_Enabled ;
   private int edtavWccaud_sdt__bargraaca_Enabled ;
   private int edtavWccaud_sdt__barancaca1_Enabled ;
   private int edtavWccaud_sdt__ccfok_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_45_fel_idx=1 ;
   private int edtavWccaud_sdt__barcod_Visible ;
   private int edtavWccaud_sdt__barcodreo_Visible ;
   private int edtavWccaud_sdt__barcodpar_Visible ;
   private int edtavWccaud_sdt__procod_Visible ;
   private int edtavWccaud_sdt__prodsc_Visible ;
   private int edtavWccaud_sdt__barordlin_Visible ;
   private int edtavWccaud_sdt__fascod_Visible ;
   private int edtavWccaud_sdt__fasdsc_Visible ;
   private int edtavWccaud_sdt__ccfch_Visible ;
   private int edtavWccaud_sdt__cctcod_Visible ;
   private int edtavWccaud_sdt__cctdsc_Visible ;
   private int edtavWccaud_sdt__ccopecod_Visible ;
   private int edtavWccaud_sdt__openom_Visible ;
   private int edtavWccaud_sdt__barser_Visible ;
   private int edtavWccaud_sdt__barcolnom_Visible ;
   private int edtavWccaud_sdt__barenccli_Visible ;
   private int edtavWccaud_sdt__bartipart_Visible ;
   private int edtavWccaud_sdt__bargraaca_Visible ;
   private int edtavWccaud_sdt__barancaca1_Visible ;
   private int edtavWccaud_sdt__ccfok_Visible ;
   private int AV35PageToGo ;
   private int nGXsfl_45_bak_idx=1 ;
   private int AV51Barcod ;
   private int AV56CCTCod ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV18emprcod ;
   private String wcpOAV8BarSer ;
   private String wcpOAV17Det ;
   private String wcpOAV36ParFin ;
   private String wcpOAV37ParIni ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV18emprcod ;
   private String AV8BarSer ;
   private String AV17Det ;
   private String AV36ParFin ;
   private String AV37ParIni ;
   private String sGXsfl_45_idx="0001" ;
   private String AV81Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String bttBtnword_Internalname ;
   private String bttBtnword_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV50DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtavWccaud_sdt__barcod_Internalname ;
   private String edtavWccaud_sdt__barcodreo_Internalname ;
   private String edtavWccaud_sdt__barcodpar_Internalname ;
   private String edtavWccaud_sdt__procod_Internalname ;
   private String edtavWccaud_sdt__prodsc_Internalname ;
   private String edtavWccaud_sdt__barordlin_Internalname ;
   private String edtavWccaud_sdt__fascod_Internalname ;
   private String edtavWccaud_sdt__fasdsc_Internalname ;
   private String edtavWccaud_sdt__ccfch_Internalname ;
   private String edtavWccaud_sdt__cctcod_Internalname ;
   private String edtavWccaud_sdt__cctdsc_Internalname ;
   private String edtavWccaud_sdt__ccopecod_Internalname ;
   private String edtavWccaud_sdt__openom_Internalname ;
   private String edtavWccaud_sdt__barser_Internalname ;
   private String edtavWccaud_sdt__barcolnom_Internalname ;
   private String edtavWccaud_sdt__barenccli_Internalname ;
   private String edtavWccaud_sdt__bartipart_Internalname ;
   private String edtavWccaud_sdt__bargraaca_Internalname ;
   private String edtavWccaud_sdt__barancaca1_Internalname ;
   private String edtavWccaud_sdt__ccfok_Internalname ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String hsh ;
   private String AV5Station ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String AV45UsurCod ;
   private String GXv_char3[] ;
   private String AV53barcodpar ;
   private String AV54Procod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sCtrlAV18emprcod ;
   private String sCtrlAV6BarFin ;
   private String sCtrlAV7BarIni ;
   private String sCtrlAV8BarSer ;
   private String sCtrlAV9Cctfin ;
   private String sCtrlAV10Cctini ;
   private String sCtrlAV11CliFin ;
   private String sCtrlAV12CliIni ;
   private String sCtrlAV17Det ;
   private String sCtrlAV22FchFin ;
   private String sCtrlAV23FchIni ;
   private String sCtrlAV36ParFin ;
   private String sCtrlAV37ParIni ;
   private String sCtrlAV38Rea ;
   private String sCtrlAV39ReoFin ;
   private String sCtrlAV40ReoIni ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavWccaud_sdt__barcod_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavWccaud_sdt__barcodreo_Jsonclick ;
   private String edtavWccaud_sdt__barcodpar_Jsonclick ;
   private String edtavWccaud_sdt__procod_Jsonclick ;
   private String edtavWccaud_sdt__prodsc_Jsonclick ;
   private String edtavWccaud_sdt__barordlin_Jsonclick ;
   private String edtavWccaud_sdt__fascod_Jsonclick ;
   private String edtavWccaud_sdt__fasdsc_Jsonclick ;
   private String edtavWccaud_sdt__ccfch_Jsonclick ;
   private String edtavWccaud_sdt__cctcod_Jsonclick ;
   private String edtavWccaud_sdt__cctdsc_Jsonclick ;
   private String edtavWccaud_sdt__ccopecod_Jsonclick ;
   private String edtavWccaud_sdt__openom_Jsonclick ;
   private String edtavWccaud_sdt__barser_Jsonclick ;
   private String edtavWccaud_sdt__barcolnom_Jsonclick ;
   private String edtavWccaud_sdt__barenccli_Jsonclick ;
   private String edtavWccaud_sdt__bartipart_Jsonclick ;
   private String edtavWccaud_sdt__bargraaca_Jsonclick ;
   private String edtavWccaud_sdt__barancaca1_Jsonclick ;
   private String edtavWccaud_sdt__ccfok_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV22FchFin ;
   private java.util.Date wcpOAV23FchIni ;
   private java.util.Date AV22FchFin ;
   private java.util.Date AV23FchIni ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV49Var_seleccionar ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV45 ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Grid_dwc ;
   private String AV15ColumnsSelectorXML ;
   private String AV44UserCustomValue ;
   private String AV21ExcelFilename ;
   private String AV20ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavWccaud_sdt__seleccionar ;
   private GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item> AV46Wccaud_SDT ;
   private GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item> GXt_objcol_SdtWccaud_SDT_Item7 ;
   private GXBaseCollection<app.controlcalidadhtd.SdtWccaud_SDT_Item> GXv_objcol_SdtWccaud_SDT_Item8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV14ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV48WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

