package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccest_wc_impl extends GXWebComponent
{
   public wccest_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccest_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccest_wc_impl.class ));
   }

   public wccest_wc_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
               AV30BarIni = (int)(GXutil.lval( httpContext.GetPar( "BarIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarIni), 8, 0));
               AV29BarFin = (int)(GXutil.lval( httpContext.GetPar( "BarFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarFin), 8, 0));
               AV46ReoIni = (byte)(GXutil.lval( httpContext.GetPar( "ReoIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ReoIni", GXutil.str( AV46ReoIni, 1, 0));
               AV45ReoFin = (byte)(GXutil.lval( httpContext.GetPar( "ReoFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45ReoFin", GXutil.str( AV45ReoFin, 1, 0));
               AV44ParIni = httpContext.GetPar( "ParIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44ParIni", AV44ParIni);
               AV43ParFin = httpContext.GetPar( "ParFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ParFin", AV43ParFin);
               AV37CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliIni), 6, 0));
               AV36CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliFin), 6, 0));
               AV35CCTIni = (int)(GXutil.lval( httpContext.GetPar( "CCTIni"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35CCTIni), 6, 0));
               AV34CCTFin = (int)(GXutil.lval( httpContext.GetPar( "CCTFin"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTFin), 6, 0));
               AV39FchIni = localUtil.parseDateParm( httpContext.GetPar( "FchIni")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FchIni", localUtil.format(AV39FchIni, "99/99/99"));
               AV38FchFin = localUtil.parseDateParm( httpContext.GetPar( "FchFin")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38FchFin", localUtil.format(AV38FchFin, "99/99/99"));
               AV41NivIni = httpContext.GetPar( "NivIni") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41NivIni", AV41NivIni);
               AV40NivFin = httpContext.GetPar( "NivFin") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40NivFin", AV40NivFin);
               AV47TipoCtr = httpContext.GetPar( "TipoCtr") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TipoCtr", AV47TipoCtr);
               AV32Barseri = httpContext.GetPar( "Barseri") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barseri", AV32Barseri);
               AV31barserf = httpContext.GetPar( "barserf") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barserf", AV31barserf);
               AV25Barcolnom = httpContext.GetPar( "Barcolnom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Barcolnom", AV25Barcolnom);
               AV26Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Barcolnomf", AV26Barcolnomf);
               AV27Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Barcolnum), 6, 0));
               AV28Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnumf), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Integer.valueOf(AV30BarIni),Integer.valueOf(AV29BarFin),Byte.valueOf(AV46ReoIni),Byte.valueOf(AV45ReoFin),AV44ParIni,AV43ParFin,Integer.valueOf(AV37CliIni),Integer.valueOf(AV36CliFin),Integer.valueOf(AV35CCTIni),Integer.valueOf(AV34CCTFin),AV39FchIni,AV38FchFin,AV41NivIni,AV40NivFin,AV47TipoCtr,AV32Barseri,AV31barserf,AV25Barcolnom,AV26Barcolnomf,Integer.valueOf(AV27Barcolnum),Integer.valueOf(AV28Barcolnumf)});
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
      nRC_GXsfl_30 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_30"))) ;
      nGXsfl_30_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_30_idx"))) ;
      sGXsfl_30_idx = httpContext.GetPar( "sGXsfl_30_idx") ;
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
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6ColumnsSelector);
      AV74Pgmname = httpContext.GetPar( "Pgmname") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV30BarIni = (int)(GXutil.lval( httpContext.GetPar( "BarIni"))) ;
      AV29BarFin = (int)(GXutil.lval( httpContext.GetPar( "BarFin"))) ;
      AV46ReoIni = (byte)(GXutil.lval( httpContext.GetPar( "ReoIni"))) ;
      AV45ReoFin = (byte)(GXutil.lval( httpContext.GetPar( "ReoFin"))) ;
      AV44ParIni = httpContext.GetPar( "ParIni") ;
      AV43ParFin = httpContext.GetPar( "ParFin") ;
      AV37CliIni = (int)(GXutil.lval( httpContext.GetPar( "CliIni"))) ;
      AV36CliFin = (int)(GXutil.lval( httpContext.GetPar( "CliFin"))) ;
      AV35CCTIni = (int)(GXutil.lval( httpContext.GetPar( "CCTIni"))) ;
      AV34CCTFin = (int)(GXutil.lval( httpContext.GetPar( "CCTFin"))) ;
      AV39FchIni = localUtil.parseDateParm( httpContext.GetPar( "FchIni")) ;
      AV38FchFin = localUtil.parseDateParm( httpContext.GetPar( "FchFin")) ;
      AV41NivIni = httpContext.GetPar( "NivIni") ;
      AV40NivFin = httpContext.GetPar( "NivFin") ;
      AV47TipoCtr = httpContext.GetPar( "TipoCtr") ;
      AV32Barseri = httpContext.GetPar( "Barseri") ;
      AV31barserf = httpContext.GetPar( "barserf") ;
      AV25Barcolnom = httpContext.GetPar( "Barcolnom") ;
      AV26Barcolnomf = httpContext.GetPar( "Barcolnomf") ;
      AV27Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
      AV28Barcolnumf = (int)(GXutil.lval( httpContext.GetPar( "Barcolnumf"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23wCCEst_SDT);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV6ColumnsSelector, AV74Pgmname, AV5EmprCod, AV30BarIni, AV29BarFin, AV46ReoIni, AV45ReoFin, AV44ParIni, AV43ParFin, AV37CliIni, AV36CliFin, AV35CCTIni, AV34CCTFin, AV39FchIni, AV38FchFin, AV41NivIni, AV40NivFin, AV47TipoCtr, AV32Barseri, AV31barserf, AV25Barcolnom, AV26Barcolnomf, AV27Barcolnum, AV28Barcolnumf, AV23wCCEst_SDT, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2BM2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Estadisticas", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wccest_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV30BarIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29BarFin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV46ReoIni,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV45ReoFin,1,0)),GXutil.URLEncode(GXutil.rtrim(AV44ParIni)),GXutil.URLEncode(GXutil.rtrim(AV43ParFin)),GXutil.URLEncode(GXutil.ltrimstr(AV37CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35CCTIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34CCTFin,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV39FchIni)),GXutil.URLEncode(GXutil.formatDateParm(AV38FchFin)),GXutil.URLEncode(GXutil.rtrim(AV41NivIni)),GXutil.URLEncode(GXutil.rtrim(AV40NivFin)),GXutil.URLEncode(GXutil.rtrim(AV47TipoCtr)),GXutil.URLEncode(GXutil.rtrim(AV32Barseri)),GXutil.URLEncode(GXutil.rtrim(AV31barserf)),GXutil.URLEncode(GXutil.rtrim(AV25Barcolnom)),GXutil.URLEncode(GXutil.rtrim(AV26Barcolnomf)),GXutil.URLEncode(GXutil.ltrimstr(AV27Barcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28Barcolnumf,6,0))}, new String[] {"EmprCod","BarIni","BarFin","ReoIni","ReoFin","ParIni","ParFin","CliIni","CliFin","CCTIni","CCTFin","FchIni","FchFin","NivIni","NivFin","TipoCtr","Barseri","barserf","Barcolnom","Barcolnomf","Barcolnum","Barcolnumf"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWCCEST_SDT", getSecureSignedToken( sPrefix, AV23wCCEst_SDT));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Wccest_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV74Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wccest_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Wccest_sdt", AV23wCCEst_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Wccest_sdt", AV23wCCEst_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Wccest_sdt", getSecureSignedToken( sPrefix, AV23wCCEst_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_30", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_30, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV12GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV13GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV9DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV9DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV6ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarIni", GXutil.ltrim( localUtil.ntoc( wcpOAV30BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29BarFin", GXutil.ltrim( localUtil.ntoc( wcpOAV29BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46ReoIni", GXutil.ltrim( localUtil.ntoc( wcpOAV46ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45ReoFin", GXutil.ltrim( localUtil.ntoc( wcpOAV45ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV44ParIni", GXutil.rtrim( wcpOAV44ParIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43ParFin", GXutil.rtrim( wcpOAV43ParFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37CliIni", GXutil.ltrim( localUtil.ntoc( wcpOAV37CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36CliFin", GXutil.ltrim( localUtil.ntoc( wcpOAV36CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35CCTIni", GXutil.ltrim( localUtil.ntoc( wcpOAV35CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34CCTFin", GXutil.ltrim( localUtil.ntoc( wcpOAV34CCTFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39FchIni", localUtil.dtoc( wcpOAV39FchIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38FchFin", localUtil.dtoc( wcpOAV38FchFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41NivIni", GXutil.rtrim( wcpOAV41NivIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40NivFin", GXutil.rtrim( wcpOAV40NivFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47TipoCtr", GXutil.rtrim( wcpOAV47TipoCtr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Barseri", GXutil.rtrim( wcpOAV32Barseri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31barserf", GXutil.rtrim( wcpOAV31barserf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Barcolnom", GXutil.rtrim( wcpOAV25Barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Barcolnomf", GXutil.rtrim( wcpOAV26Barcolnomf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27Barcolnum", GXutil.ltrim( localUtil.ntoc( wcpOAV27Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Barcolnumf", GXutil.ltrim( localUtil.ntoc( wcpOAV28Barcolnumf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARINI", GXutil.ltrim( localUtil.ntoc( AV30BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFIN", GXutil.ltrim( localUtil.ntoc( AV29BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREOINI", GXutil.ltrim( localUtil.ntoc( AV46ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vREOFIN", GXutil.ltrim( localUtil.ntoc( AV45ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARINI", GXutil.rtrim( AV44ParIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPARFIN", GXutil.rtrim( AV43ParFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIINI", GXutil.ltrim( localUtil.ntoc( AV37CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIFIN", GXutil.ltrim( localUtil.ntoc( AV36CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCTINI", GXutil.ltrim( localUtil.ntoc( AV35CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCTFIN", GXutil.ltrim( localUtil.ntoc( AV34CCTFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFCHINI", localUtil.dtoc( AV39FchIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFCHFIN", localUtil.dtoc( AV38FchFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNIVINI", GXutil.rtrim( AV41NivIni));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNIVFIN", GXutil.rtrim( AV40NivFin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPOCTR", GXutil.rtrim( AV47TipoCtr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERI", GXutil.rtrim( AV32Barseri));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERF", GXutil.rtrim( AV31barserf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV25Barcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOMF", GXutil.rtrim( AV26Barcolnomf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV27Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUMF", GXutil.ltrim( localUtil.ntoc( AV28Barcolnumf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vWCCEST_SDT", AV23wCCEst_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vWCCEST_SDT", AV23wCCEst_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWCCEST_SDT", getSecureSignedToken( sPrefix, AV23wCCEst_SDT));
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

   public void renderHtmlCloseForm2BM2( )
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
      return "ControlCalidadHTD.Wccest_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Estadisticas", "") ;
   }

   public void wb2BM0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.controlcalidadhtd.wccest_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccest_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccest_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 30, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccest_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol30( ) ;
      }
      if ( wbEnd == 30 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_30 = (int)(nGXsfl_30_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV55GXV1 = nGXsfl_30_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV12GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV13GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV74Pgmname), GXutil.rtrim( localUtil.format( AV74Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wccest_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV9DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV9DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV6ColumnsSelector);
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
      if ( wbEnd == 30 )
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
               AV55GXV1 = nGXsfl_30_idx ;
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

   public void start2BM2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Estadisticas", ""), (short)(0)) ;
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
            strup2BM0( ) ;
         }
      }
   }

   public void ws2BM2( )
   {
      start2BM2( ) ;
      evt2BM2( ) ;
   }

   public void evt2BM2( )
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
                              strup2BM0( ) ;
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
                              strup2BM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112BM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122BM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132BM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e142BM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e152BM2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BM0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2BM0( ) ;
                           }
                           nGXsfl_30_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_302( ) ;
                           AV55GXV1 = (int)(nGXsfl_30_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV23wCCEst_SDT.size() >= AV55GXV1 ) && ( AV55GXV1 > 0 ) )
                           {
                              AV23wCCEst_SDT.currentItem( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)) );
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
                                       /* Execute user event: Start */
                                       e162BM2 ();
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
                                       /* Execute user event: Refresh */
                                       e172BM2 ();
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
                                       e182BM2 ();
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
                                    strup2BM0( ) ;
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

   public void we2BM2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2BM2( ) ;
         }
      }
   }

   public void pa2BM2( )
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
      subsflControlProps_302( ) ;
      while ( nGXsfl_30_idx <= nRC_GXsfl_30 )
      {
         sendrow_302( ) ;
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ,
                                 String AV74Pgmname ,
                                 String AV5EmprCod ,
                                 int AV30BarIni ,
                                 int AV29BarFin ,
                                 byte AV46ReoIni ,
                                 byte AV45ReoFin ,
                                 String AV44ParIni ,
                                 String AV43ParFin ,
                                 int AV37CliIni ,
                                 int AV36CliFin ,
                                 int AV35CCTIni ,
                                 int AV34CCTFin ,
                                 java.util.Date AV39FchIni ,
                                 java.util.Date AV38FchFin ,
                                 String AV41NivIni ,
                                 String AV40NivFin ,
                                 String AV47TipoCtr ,
                                 String AV32Barseri ,
                                 String AV31barserf ,
                                 String AV25Barcolnom ,
                                 String AV26Barcolnomf ,
                                 int AV27Barcolnum ,
                                 int AV28Barcolnumf ,
                                 GXBaseCollection<app.controlcalidadhtd.SdtwCCEst_SDT_Item> AV23wCCEst_SDT ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172BM2 ();
      GRID_nCurrentRecord = 0 ;
      rf2BM2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Wccest_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV74Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wccest_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2BM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV74Pgmname = "ControlCalidadHTD.Wccest_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavWccest_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__clinom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barser_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__procod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__fascod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctcod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__ccopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__ccopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__ccopecod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__openom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__openom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__openom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__ccfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__ccfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__ccfch_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctlin_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctlindsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctval_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__obs_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(30) ;
      /* Execute user event: Refresh */
      e172BM2 ();
      nGXsfl_30_idx = 1 ;
      sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_302( ) ;
      bGXsfl_30_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_302( ) ;
         e182BM2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_30_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e182BM2 ();
         }
         wbEnd = (short)(30) ;
         wb2BM0( ) ;
      }
      bGXsfl_30_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2BM2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vWCCEST_SDT", AV23wCCEst_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vWCCEST_SDT", AV23wCCEst_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vWCCEST_SDT", getSecureSignedToken( sPrefix, AV23wCCEst_SDT));
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
      return AV23wCCEst_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6ColumnsSelector, AV74Pgmname, AV5EmprCod, AV30BarIni, AV29BarFin, AV46ReoIni, AV45ReoFin, AV44ParIni, AV43ParFin, AV37CliIni, AV36CliFin, AV35CCTIni, AV34CCTFin, AV39FchIni, AV38FchFin, AV41NivIni, AV40NivFin, AV47TipoCtr, AV32Barseri, AV31barserf, AV25Barcolnom, AV26Barcolnomf, AV27Barcolnum, AV28Barcolnumf, AV23wCCEst_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6ColumnsSelector, AV74Pgmname, AV5EmprCod, AV30BarIni, AV29BarFin, AV46ReoIni, AV45ReoFin, AV44ParIni, AV43ParFin, AV37CliIni, AV36CliFin, AV35CCTIni, AV34CCTFin, AV39FchIni, AV38FchFin, AV41NivIni, AV40NivFin, AV47TipoCtr, AV32Barseri, AV31barserf, AV25Barcolnom, AV26Barcolnomf, AV27Barcolnum, AV28Barcolnumf, AV23wCCEst_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6ColumnsSelector, AV74Pgmname, AV5EmprCod, AV30BarIni, AV29BarFin, AV46ReoIni, AV45ReoFin, AV44ParIni, AV43ParFin, AV37CliIni, AV36CliFin, AV35CCTIni, AV34CCTFin, AV39FchIni, AV38FchFin, AV41NivIni, AV40NivFin, AV47TipoCtr, AV32Barseri, AV31barserf, AV25Barcolnom, AV26Barcolnomf, AV27Barcolnum, AV28Barcolnumf, AV23wCCEst_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6ColumnsSelector, AV74Pgmname, AV5EmprCod, AV30BarIni, AV29BarFin, AV46ReoIni, AV45ReoFin, AV44ParIni, AV43ParFin, AV37CliIni, AV36CliFin, AV35CCTIni, AV34CCTFin, AV39FchIni, AV38FchFin, AV41NivIni, AV40NivFin, AV47TipoCtr, AV32Barseri, AV31barserf, AV25Barcolnom, AV26Barcolnomf, AV27Barcolnum, AV28Barcolnumf, AV23wCCEst_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV6ColumnsSelector, AV74Pgmname, AV5EmprCod, AV30BarIni, AV29BarFin, AV46ReoIni, AV45ReoFin, AV44ParIni, AV43ParFin, AV37CliIni, AV36CliFin, AV35CCTIni, AV34CCTFin, AV39FchIni, AV38FchFin, AV41NivIni, AV40NivFin, AV47TipoCtr, AV32Barseri, AV31barserf, AV25Barcolnom, AV26Barcolnomf, AV27Barcolnum, AV28Barcolnumf, AV23wCCEst_SDT, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV74Pgmname = "ControlCalidadHTD.Wccest_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavWccest_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__clinom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barser_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__procod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__fascod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctcod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctdsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__ccopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__ccopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__ccopecod_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__openom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__openom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__openom_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__ccfch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__ccfch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__ccfch_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctlin_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctlindsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctlindsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctlindsc_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctval_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctval_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctval_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__obs_Enabled), 5, 0), !bGXsfl_30_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162BM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Wccest_sdt"), AV23wCCEst_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV9DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV6ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vWCCEST_SDT"), AV23wCCEst_SDT);
         /* Read saved values. */
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV12GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV13GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV30BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30BarIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29BarFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46ReoIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV45ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45ReoFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV44ParIni = httpContext.cgiGet( sPrefix+"wcpOAV44ParIni") ;
         wcpOAV43ParFin = httpContext.cgiGet( sPrefix+"wcpOAV43ParFin") ;
         wcpOAV37CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37CliIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36CliFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35CCTIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34CCTFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV39FchIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39FchIni"), 0) ;
         wcpOAV38FchFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV38FchFin"), 0) ;
         wcpOAV41NivIni = httpContext.cgiGet( sPrefix+"wcpOAV41NivIni") ;
         wcpOAV40NivFin = httpContext.cgiGet( sPrefix+"wcpOAV40NivFin") ;
         wcpOAV47TipoCtr = httpContext.cgiGet( sPrefix+"wcpOAV47TipoCtr") ;
         wcpOAV32Barseri = httpContext.cgiGet( sPrefix+"wcpOAV32Barseri") ;
         wcpOAV31barserf = httpContext.cgiGet( sPrefix+"wcpOAV31barserf") ;
         wcpOAV25Barcolnom = httpContext.cgiGet( sPrefix+"wcpOAV25Barcolnom") ;
         wcpOAV26Barcolnomf = httpContext.cgiGet( sPrefix+"wcpOAV26Barcolnomf") ;
         wcpOAV27Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27Barcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28Barcolnumf = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28Barcolnumf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         nRC_GXsfl_30 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_30"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_30_fel_idx = 0 ;
         while ( nGXsfl_30_fel_idx < nRC_GXsfl_30 )
         {
            nGXsfl_30_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_fel_idx+1) ;
            sGXsfl_30_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_302( ) ;
            AV55GXV1 = (int)(nGXsfl_30_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV23wCCEst_SDT.size() >= AV55GXV1 ) && ( AV55GXV1 > 0 ) )
            {
               AV23wCCEst_SDT.currentItem( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)) );
            }
         }
         if ( nGXsfl_30_fel_idx == 0 )
         {
            nGXsfl_30_idx = 1 ;
            sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_302( ) ;
         }
         nGXsfl_30_fel_idx = 1 ;
         /* Read variables values. */
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Pgmname", AV74Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Wccest_WC");
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Pgmname", AV74Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV74Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\wccest_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e162BM2 ();
      if (returnInSub) return;
   }

   public void e162BM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV49Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wccest_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV50EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV49Station, GXv_char2, GXv_char3, GXv_char4) ;
      wccest_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      wccest_wc_impl.this.AV50EmprNom = GXv_char3[0] ;
      wccest_wc_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV9DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV9DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV48wCCEst_Json ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_int7[0] = AV30BarIni ;
      GXv_int8[0] = AV29BarFin ;
      GXv_int9[0] = AV46ReoIni ;
      GXv_int10[0] = AV45ReoFin ;
      GXv_char3[0] = AV44ParIni ;
      GXv_char2[0] = AV43ParFin ;
      GXv_int11[0] = AV37CliIni ;
      GXv_int12[0] = AV36CliFin ;
      GXv_int13[0] = AV35CCTIni ;
      GXv_int14[0] = AV34CCTFin ;
      GXv_date15[0] = AV39FchIni ;
      GXv_date16[0] = AV38FchFin ;
      GXv_char17[0] = AV41NivIni ;
      GXv_char18[0] = AV40NivFin ;
      GXv_char19[0] = AV47TipoCtr ;
      GXv_char20[0] = AV32Barseri ;
      GXv_char21[0] = AV31barserf ;
      GXv_char22[0] = AV25Barcolnom ;
      GXv_char23[0] = AV26Barcolnomf ;
      GXv_int24[0] = AV27Barcolnum ;
      GXv_int25[0] = AV28Barcolnumf ;
      GXv_char26[0] = GXt_char1 ;
      new app.controlcalidadhtd.wccest_prc(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int9, GXv_int10, GXv_char3, GXv_char2, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_date15, GXv_date16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_char21, GXv_char22, GXv_char23, GXv_int24, GXv_int25, GXv_char26) ;
      wccest_wc_impl.this.AV5EmprCod = GXv_char4[0] ;
      wccest_wc_impl.this.AV30BarIni = GXv_int7[0] ;
      wccest_wc_impl.this.AV29BarFin = GXv_int8[0] ;
      wccest_wc_impl.this.AV46ReoIni = GXv_int9[0] ;
      wccest_wc_impl.this.AV45ReoFin = GXv_int10[0] ;
      wccest_wc_impl.this.AV44ParIni = GXv_char3[0] ;
      wccest_wc_impl.this.AV43ParFin = GXv_char2[0] ;
      wccest_wc_impl.this.AV37CliIni = GXv_int11[0] ;
      wccest_wc_impl.this.AV36CliFin = GXv_int12[0] ;
      wccest_wc_impl.this.AV35CCTIni = GXv_int13[0] ;
      wccest_wc_impl.this.AV34CCTFin = GXv_int14[0] ;
      wccest_wc_impl.this.AV39FchIni = GXv_date15[0] ;
      wccest_wc_impl.this.AV38FchFin = GXv_date16[0] ;
      wccest_wc_impl.this.AV41NivIni = GXv_char17[0] ;
      wccest_wc_impl.this.AV40NivFin = GXv_char18[0] ;
      wccest_wc_impl.this.AV47TipoCtr = GXv_char19[0] ;
      wccest_wc_impl.this.AV32Barseri = GXv_char20[0] ;
      wccest_wc_impl.this.AV31barserf = GXv_char21[0] ;
      wccest_wc_impl.this.AV25Barcolnom = GXv_char22[0] ;
      wccest_wc_impl.this.AV26Barcolnomf = GXv_char23[0] ;
      wccest_wc_impl.this.AV27Barcolnum = GXv_int24[0] ;
      wccest_wc_impl.this.AV28Barcolnumf = GXv_int25[0] ;
      wccest_wc_impl.this.GXt_char1 = GXv_char26[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarIni), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarFin), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ReoIni", GXutil.str( AV46ReoIni, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45ReoFin", GXutil.str( AV45ReoFin, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44ParIni", AV44ParIni);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ParFin", AV43ParFin);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliIni), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliFin), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35CCTIni), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTFin), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FchIni", localUtil.format(AV39FchIni, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38FchFin", localUtil.format(AV38FchFin, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41NivIni", AV41NivIni);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40NivFin", AV40NivFin);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TipoCtr", AV47TipoCtr);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barseri", AV32Barseri);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barserf", AV31barserf);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Barcolnom", AV25Barcolnom);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Barcolnomf", AV26Barcolnomf);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Barcolnum), 6, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnumf), 6, 0));
      AV48wCCEst_Json = GXt_char1 ;
      AV23wCCEst_SDT.fromJSonString(AV48wCCEst_Json, null);
      gx_BV30 = true ;
   }

   public void e172BM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext27[0] = AV24WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext27) ;
      AV24WWPContext = GXv_SdtWWPContext27[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV19Session.getValue("ControlCalidadHTD.Wccest_WCColumnsSelector"), "") != 0 )
      {
         AV8ColumnsSelectorXML = AV19Session.getValue("ControlCalidadHTD.Wccest_WCColumnsSelector") ;
         AV6ColumnsSelector.fromxml(AV8ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S132 ();
         if (returnInSub) return;
      }
      edtavWccest_sdt__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barnhdr_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__clinom_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barser_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barserdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barcolnom_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__barcolnum_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__procod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__procod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__procod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__fascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__fascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__fascod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__fasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__fasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__fasdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctcod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctdsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__ccopecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__ccopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__ccopecod_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__openom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__openom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__openom_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__ccfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__ccfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__ccfch_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctlin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctlin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctlin_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctlindsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctlindsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctlindsc_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__cctval_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__cctval_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__cctval_Visible), 5, 0), !bGXsfl_30_Refreshing);
      edtavWccest_sdt__obs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV6ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavWccest_sdt__obs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavWccest_sdt__obs_Visible), 5, 0), !bGXsfl_30_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV12GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12GridCurrentPage), 10, 0));
      AV13GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
   }

   public void e112BM2( )
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
         AV18PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV18PageToGo) ;
      }
   }

   public void e122BM2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e182BM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV23wCCEst_SDT.size() )
      {
         AV23wCCEst_SDT.currentItem( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(30) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_302( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_30_Refreshing )
         {
            httpContext.doAjaxLoad(30, GridRow);
         }
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void e132BM2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV8ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV6ColumnsSelector.fromJSonString(AV8ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.Wccest_WCColumnsSelector", ((GXutil.strcmp("", AV8ColumnsSelectorXML)==0) ? "" : AV6ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6ColumnsSelector", AV6ColumnsSelector);
   }

   public void e142BM2( )
   {
      AV55GXV1 = (int)(nGXsfl_30_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV23wCCEst_SDT.size() >= AV55GXV1 ) )
      {
         AV23wCCEst_SDT.currentItem( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV48wCCEst_Json = AV23wCCEst_SDT.toJSonString(false) ;
      AV52WebSession.setValue(httpContext.getMessage( "&wCCEst_Json", ""), AV48wCCEst_Json);
      GXv_char26[0] = AV11ExcelFilename ;
      GXv_char23[0] = AV10ErrorMessage ;
      new app.controlcalidadhtd.wccest_wcexport(remoteHandle, context).execute( GXv_char26, GXv_char23) ;
      wccest_wc_impl.this.AV11ExcelFilename = GXv_char26[0] ;
      wccest_wc_impl.this.AV10ErrorMessage = GXv_char23[0] ;
      if ( GXutil.strcmp(AV11ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV11ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV10ErrorMessage);
      }
   }

   public void e152BM2( )
   {
      AV55GXV1 = (int)(nGXsfl_30_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV55GXV1 > 0 ) && ( AV23wCCEst_SDT.size() >= AV55GXV1 ) )
      {
         AV23wCCEst_SDT.currentItem( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV48wCCEst_Json = AV23wCCEst_SDT.toJSonString(false) ;
      AV52WebSession.setValue(httpContext.getMessage( "&wCCEst_Json", ""), AV48wCCEst_Json);
      callWebObject(formatLink("app.controlcalidadhtd.wccest_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      AV6ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Barnhdr", "", "N Hdr", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Clinom", "", "Cliente", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Barser", "", "Articulo", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Barserdsc", "", "Descripcion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Barcolnom", "", "Color", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Barcolnum", "", "Numero", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Procod", "", "Proceso", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Fascod", "", "Fase", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Fasdsc", "", "Descripcion", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Cctcod", "", "Código", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Cctdsc", "", "Descripción", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Ccopecod", "", "Operario", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Openom", "", "Nombre", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Ccfch", "", "Fecha", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Cctlin", "", "# Lín", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Cctlindsc", "", "Descripción", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Cctval", "", "Valor", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV6ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "wCCEst_SDT__Obs", "", "Obs", true, "") ;
      AV6ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXt_char1 = AV22UserCustomValue ;
      GXv_char26[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlCalidadHTD.Wccest_WCColumnsSelector", GXv_char26) ;
      wccest_wc_impl.this.GXt_char1 = GXv_char26[0] ;
      AV22UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV22UserCustomValue)==0) ) )
      {
         AV7ColumnsSelectorAux.fromxml(AV22UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector28[0] = AV7ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector29[0] = AV6ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, GXv_SdtWWPColumnsSelector29) ;
         AV7ColumnsSelectorAux = GXv_SdtWWPColumnsSelector28[0] ;
         AV6ColumnsSelector = GXv_SdtWWPColumnsSelector29[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV74Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV74Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV19Session.getValue(AV74Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV14GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV14GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV14GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV19Session.getValue(AV74Pgmname+"GridState"), null, null);
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV30BarIni) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30BarIni, 8, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV29BarFin) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29BarFin, 8, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV46ReoIni) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&REOINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV46ReoIni, 1, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV45ReoFin) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&REOFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV45ReoFin, 1, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV44ParIni)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PARINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV44ParIni );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV43ParFin)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PARFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV43ParFin );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV37CliIni) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLIINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV37CliIni, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV36CliFin) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLIFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV36CliFin, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV35CCTIni) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CCTINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35CCTIni, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV34CCTFin) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CCTFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV34CCTFin, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39FchIni)) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FCHINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV39FchIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV38FchFin)) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FCHFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV38FchFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV41NivIni)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&NIVINI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV41NivIni );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV40NivFin)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&NIVFIN" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV40NivFin );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47TipoCtr)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPOCTR" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47TipoCtr );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV32Barseri)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERI" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV32Barseri );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV31barserf)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSERF" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV31barserf );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV25Barcolnom)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV25Barcolnom );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV26Barcolnomf)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOMF" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV26Barcolnomf );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV27Barcolnum) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV27Barcolnum, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV28Barcolnumf) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUMF" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV28Barcolnumf, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      AV14GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV14GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV74Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV30BarIni = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarIni), 8, 0));
      AV29BarFin = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarFin), 8, 0));
      AV46ReoIni = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ReoIni", GXutil.str( AV46ReoIni, 1, 0));
      AV45ReoFin = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45ReoFin", GXutil.str( AV45ReoFin, 1, 0));
      AV44ParIni = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44ParIni", AV44ParIni);
      AV43ParFin = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ParFin", AV43ParFin);
      AV37CliIni = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliIni), 6, 0));
      AV36CliFin = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliFin), 6, 0));
      AV35CCTIni = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35CCTIni), 6, 0));
      AV34CCTFin = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTFin), 6, 0));
      AV39FchIni = (java.util.Date)getParm(obj,11,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FchIni", localUtil.format(AV39FchIni, "99/99/99"));
      AV38FchFin = (java.util.Date)getParm(obj,12,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38FchFin", localUtil.format(AV38FchFin, "99/99/99"));
      AV41NivIni = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41NivIni", AV41NivIni);
      AV40NivFin = (String)getParm(obj,14,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40NivFin", AV40NivFin);
      AV47TipoCtr = (String)getParm(obj,15,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TipoCtr", AV47TipoCtr);
      AV32Barseri = (String)getParm(obj,16,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barseri", AV32Barseri);
      AV31barserf = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barserf", AV31barserf);
      AV25Barcolnom = (String)getParm(obj,18,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Barcolnom", AV25Barcolnom);
      AV26Barcolnomf = (String)getParm(obj,19,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Barcolnomf", AV26Barcolnomf);
      AV27Barcolnum = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Barcolnum), 6, 0));
      AV28Barcolnumf = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnumf), 6, 0));
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
      pa2BM2( ) ;
      ws2BM2( ) ;
      we2BM2( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV30BarIni = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV29BarFin = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV46ReoIni = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV45ReoFin = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV44ParIni = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV43ParFin = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV37CliIni = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV36CliFin = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV35CCTIni = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV34CCTFin = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV39FchIni = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV38FchFin = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV41NivIni = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV40NivFin = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV47TipoCtr = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV32Barseri = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV31barserf = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV25Barcolnom = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV26Barcolnomf = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV27Barcolnum = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV28Barcolnumf = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2BM2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "controlcalidadhtd\\wccest_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2BM2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV30BarIni = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarIni), 8, 0));
         AV29BarFin = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarFin), 8, 0));
         AV46ReoIni = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ReoIni", GXutil.str( AV46ReoIni, 1, 0));
         AV45ReoFin = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45ReoFin", GXutil.str( AV45ReoFin, 1, 0));
         AV44ParIni = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44ParIni", AV44ParIni);
         AV43ParFin = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ParFin", AV43ParFin);
         AV37CliIni = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliIni), 6, 0));
         AV36CliFin = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliFin), 6, 0));
         AV35CCTIni = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35CCTIni), 6, 0));
         AV34CCTFin = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTFin), 6, 0));
         AV39FchIni = (java.util.Date)getParm(obj,13,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FchIni", localUtil.format(AV39FchIni, "99/99/99"));
         AV38FchFin = (java.util.Date)getParm(obj,14,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38FchFin", localUtil.format(AV38FchFin, "99/99/99"));
         AV41NivIni = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41NivIni", AV41NivIni);
         AV40NivFin = (String)getParm(obj,16,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40NivFin", AV40NivFin);
         AV47TipoCtr = (String)getParm(obj,17,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TipoCtr", AV47TipoCtr);
         AV32Barseri = (String)getParm(obj,18,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barseri", AV32Barseri);
         AV31barserf = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barserf", AV31barserf);
         AV25Barcolnom = (String)getParm(obj,20,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Barcolnom", AV25Barcolnom);
         AV26Barcolnomf = (String)getParm(obj,21,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Barcolnomf", AV26Barcolnomf);
         AV27Barcolnum = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Barcolnum), 6, 0));
         AV28Barcolnumf = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnumf), 6, 0));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV30BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30BarIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29BarFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV46ReoIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV45ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45ReoFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV44ParIni = httpContext.cgiGet( sPrefix+"wcpOAV44ParIni") ;
      wcpOAV43ParFin = httpContext.cgiGet( sPrefix+"wcpOAV43ParFin") ;
      wcpOAV37CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37CliIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36CliFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35CCTIni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34CCTFin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV39FchIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV39FchIni"), 0) ;
      wcpOAV38FchFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV38FchFin"), 0) ;
      wcpOAV41NivIni = httpContext.cgiGet( sPrefix+"wcpOAV41NivIni") ;
      wcpOAV40NivFin = httpContext.cgiGet( sPrefix+"wcpOAV40NivFin") ;
      wcpOAV47TipoCtr = httpContext.cgiGet( sPrefix+"wcpOAV47TipoCtr") ;
      wcpOAV32Barseri = httpContext.cgiGet( sPrefix+"wcpOAV32Barseri") ;
      wcpOAV31barserf = httpContext.cgiGet( sPrefix+"wcpOAV31barserf") ;
      wcpOAV25Barcolnom = httpContext.cgiGet( sPrefix+"wcpOAV25Barcolnom") ;
      wcpOAV26Barcolnomf = httpContext.cgiGet( sPrefix+"wcpOAV26Barcolnomf") ;
      wcpOAV27Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27Barcolnum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28Barcolnumf = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28Barcolnumf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV30BarIni != wcpOAV30BarIni ) || ( AV29BarFin != wcpOAV29BarFin ) || ( AV46ReoIni != wcpOAV46ReoIni ) || ( AV45ReoFin != wcpOAV45ReoFin ) || ( GXutil.strcmp(AV44ParIni, wcpOAV44ParIni) != 0 ) || ( GXutil.strcmp(AV43ParFin, wcpOAV43ParFin) != 0 ) || ( AV37CliIni != wcpOAV37CliIni ) || ( AV36CliFin != wcpOAV36CliFin ) || ( AV35CCTIni != wcpOAV35CCTIni ) || ( AV34CCTFin != wcpOAV34CCTFin ) || !( GXutil.dateCompare(GXutil.resetTime(AV39FchIni), GXutil.resetTime(wcpOAV39FchIni)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV38FchFin), GXutil.resetTime(wcpOAV38FchFin)) ) || ( GXutil.strcmp(AV41NivIni, wcpOAV41NivIni) != 0 ) || ( GXutil.strcmp(AV40NivFin, wcpOAV40NivFin) != 0 ) || ( GXutil.strcmp(AV47TipoCtr, wcpOAV47TipoCtr) != 0 ) || ( GXutil.strcmp(AV32Barseri, wcpOAV32Barseri) != 0 ) || ( GXutil.strcmp(AV31barserf, wcpOAV31barserf) != 0 ) || ( GXutil.strcmp(AV25Barcolnom, wcpOAV25Barcolnom) != 0 ) || ( GXutil.strcmp(AV26Barcolnomf, wcpOAV26Barcolnomf) != 0 ) || ( AV27Barcolnum != wcpOAV27Barcolnum ) || ( AV28Barcolnumf != wcpOAV28Barcolnumf ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV30BarIni = AV30BarIni ;
      wcpOAV29BarFin = AV29BarFin ;
      wcpOAV46ReoIni = AV46ReoIni ;
      wcpOAV45ReoFin = AV45ReoFin ;
      wcpOAV44ParIni = AV44ParIni ;
      wcpOAV43ParFin = AV43ParFin ;
      wcpOAV37CliIni = AV37CliIni ;
      wcpOAV36CliFin = AV36CliFin ;
      wcpOAV35CCTIni = AV35CCTIni ;
      wcpOAV34CCTFin = AV34CCTFin ;
      wcpOAV39FchIni = AV39FchIni ;
      wcpOAV38FchFin = AV38FchFin ;
      wcpOAV41NivIni = AV41NivIni ;
      wcpOAV40NivFin = AV40NivFin ;
      wcpOAV47TipoCtr = AV47TipoCtr ;
      wcpOAV32Barseri = AV32Barseri ;
      wcpOAV31barserf = AV31barserf ;
      wcpOAV25Barcolnom = AV25Barcolnom ;
      wcpOAV26Barcolnomf = AV26Barcolnomf ;
      wcpOAV27Barcolnum = AV27Barcolnum ;
      wcpOAV28Barcolnumf = AV28Barcolnumf ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV30BarIni = httpContext.cgiGet( sPrefix+"AV30BarIni_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarIni) > 0 )
      {
         AV30BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30BarIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30BarIni), 8, 0));
      }
      else
      {
         AV30BarIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30BarIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29BarFin = httpContext.cgiGet( sPrefix+"AV29BarFin_CTRL") ;
      if ( GXutil.len( sCtrlAV29BarFin) > 0 )
      {
         AV29BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29BarFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarFin), 8, 0));
      }
      else
      {
         AV29BarFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29BarFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV46ReoIni = httpContext.cgiGet( sPrefix+"AV46ReoIni_CTRL") ;
      if ( GXutil.len( sCtrlAV46ReoIni) > 0 )
      {
         AV46ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV46ReoIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ReoIni", GXutil.str( AV46ReoIni, 1, 0));
      }
      else
      {
         AV46ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV46ReoIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV45ReoFin = httpContext.cgiGet( sPrefix+"AV45ReoFin_CTRL") ;
      if ( GXutil.len( sCtrlAV45ReoFin) > 0 )
      {
         AV45ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV45ReoFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45ReoFin", GXutil.str( AV45ReoFin, 1, 0));
      }
      else
      {
         AV45ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV45ReoFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV44ParIni = httpContext.cgiGet( sPrefix+"AV44ParIni_CTRL") ;
      if ( GXutil.len( sCtrlAV44ParIni) > 0 )
      {
         AV44ParIni = httpContext.cgiGet( sCtrlAV44ParIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44ParIni", AV44ParIni);
      }
      else
      {
         AV44ParIni = httpContext.cgiGet( sPrefix+"AV44ParIni_PARM") ;
      }
      sCtrlAV43ParFin = httpContext.cgiGet( sPrefix+"AV43ParFin_CTRL") ;
      if ( GXutil.len( sCtrlAV43ParFin) > 0 )
      {
         AV43ParFin = httpContext.cgiGet( sCtrlAV43ParFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43ParFin", AV43ParFin);
      }
      else
      {
         AV43ParFin = httpContext.cgiGet( sPrefix+"AV43ParFin_PARM") ;
      }
      sCtrlAV37CliIni = httpContext.cgiGet( sPrefix+"AV37CliIni_CTRL") ;
      if ( GXutil.len( sCtrlAV37CliIni) > 0 )
      {
         AV37CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37CliIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37CliIni), 6, 0));
      }
      else
      {
         AV37CliIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37CliIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36CliFin = httpContext.cgiGet( sPrefix+"AV36CliFin_CTRL") ;
      if ( GXutil.len( sCtrlAV36CliFin) > 0 )
      {
         AV36CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36CliFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliFin), 6, 0));
      }
      else
      {
         AV36CliFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36CliFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35CCTIni = httpContext.cgiGet( sPrefix+"AV35CCTIni_CTRL") ;
      if ( GXutil.len( sCtrlAV35CCTIni) > 0 )
      {
         AV35CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35CCTIni), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35CCTIni), 6, 0));
      }
      else
      {
         AV35CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35CCTIni_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34CCTFin = httpContext.cgiGet( sPrefix+"AV34CCTFin_CTRL") ;
      if ( GXutil.len( sCtrlAV34CCTFin) > 0 )
      {
         AV34CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34CCTFin), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34CCTFin), 6, 0));
      }
      else
      {
         AV34CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34CCTFin_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV39FchIni = httpContext.cgiGet( sPrefix+"AV39FchIni_CTRL") ;
      if ( GXutil.len( sCtrlAV39FchIni) > 0 )
      {
         AV39FchIni = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV39FchIni), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39FchIni", localUtil.format(AV39FchIni, "99/99/99"));
      }
      else
      {
         AV39FchIni = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV39FchIni_PARM"), 0) ;
      }
      sCtrlAV38FchFin = httpContext.cgiGet( sPrefix+"AV38FchFin_CTRL") ;
      if ( GXutil.len( sCtrlAV38FchFin) > 0 )
      {
         AV38FchFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV38FchFin), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38FchFin", localUtil.format(AV38FchFin, "99/99/99"));
      }
      else
      {
         AV38FchFin = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV38FchFin_PARM"), 0) ;
      }
      sCtrlAV41NivIni = httpContext.cgiGet( sPrefix+"AV41NivIni_CTRL") ;
      if ( GXutil.len( sCtrlAV41NivIni) > 0 )
      {
         AV41NivIni = httpContext.cgiGet( sCtrlAV41NivIni) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41NivIni", AV41NivIni);
      }
      else
      {
         AV41NivIni = httpContext.cgiGet( sPrefix+"AV41NivIni_PARM") ;
      }
      sCtrlAV40NivFin = httpContext.cgiGet( sPrefix+"AV40NivFin_CTRL") ;
      if ( GXutil.len( sCtrlAV40NivFin) > 0 )
      {
         AV40NivFin = httpContext.cgiGet( sCtrlAV40NivFin) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40NivFin", AV40NivFin);
      }
      else
      {
         AV40NivFin = httpContext.cgiGet( sPrefix+"AV40NivFin_PARM") ;
      }
      sCtrlAV47TipoCtr = httpContext.cgiGet( sPrefix+"AV47TipoCtr_CTRL") ;
      if ( GXutil.len( sCtrlAV47TipoCtr) > 0 )
      {
         AV47TipoCtr = httpContext.cgiGet( sCtrlAV47TipoCtr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TipoCtr", AV47TipoCtr);
      }
      else
      {
         AV47TipoCtr = httpContext.cgiGet( sPrefix+"AV47TipoCtr_PARM") ;
      }
      sCtrlAV32Barseri = httpContext.cgiGet( sPrefix+"AV32Barseri_CTRL") ;
      if ( GXutil.len( sCtrlAV32Barseri) > 0 )
      {
         AV32Barseri = httpContext.cgiGet( sCtrlAV32Barseri) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Barseri", AV32Barseri);
      }
      else
      {
         AV32Barseri = httpContext.cgiGet( sPrefix+"AV32Barseri_PARM") ;
      }
      sCtrlAV31barserf = httpContext.cgiGet( sPrefix+"AV31barserf_CTRL") ;
      if ( GXutil.len( sCtrlAV31barserf) > 0 )
      {
         AV31barserf = httpContext.cgiGet( sCtrlAV31barserf) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31barserf", AV31barserf);
      }
      else
      {
         AV31barserf = httpContext.cgiGet( sPrefix+"AV31barserf_PARM") ;
      }
      sCtrlAV25Barcolnom = httpContext.cgiGet( sPrefix+"AV25Barcolnom_CTRL") ;
      if ( GXutil.len( sCtrlAV25Barcolnom) > 0 )
      {
         AV25Barcolnom = httpContext.cgiGet( sCtrlAV25Barcolnom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Barcolnom", AV25Barcolnom);
      }
      else
      {
         AV25Barcolnom = httpContext.cgiGet( sPrefix+"AV25Barcolnom_PARM") ;
      }
      sCtrlAV26Barcolnomf = httpContext.cgiGet( sPrefix+"AV26Barcolnomf_CTRL") ;
      if ( GXutil.len( sCtrlAV26Barcolnomf) > 0 )
      {
         AV26Barcolnomf = httpContext.cgiGet( sCtrlAV26Barcolnomf) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Barcolnomf", AV26Barcolnomf);
      }
      else
      {
         AV26Barcolnomf = httpContext.cgiGet( sPrefix+"AV26Barcolnomf_PARM") ;
      }
      sCtrlAV27Barcolnum = httpContext.cgiGet( sPrefix+"AV27Barcolnum_CTRL") ;
      if ( GXutil.len( sCtrlAV27Barcolnum) > 0 )
      {
         AV27Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV27Barcolnum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Barcolnum), 6, 0));
      }
      else
      {
         AV27Barcolnum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV27Barcolnum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV28Barcolnumf = httpContext.cgiGet( sPrefix+"AV28Barcolnumf_CTRL") ;
      if ( GXutil.len( sCtrlAV28Barcolnumf) > 0 )
      {
         AV28Barcolnumf = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28Barcolnumf), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnumf), 6, 0));
      }
      else
      {
         AV28Barcolnumf = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28Barcolnumf_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa2BM2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2BM2( ) ;
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
      ws2BM2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarIni_PARM", GXutil.ltrim( localUtil.ntoc( AV30BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarIni_CTRL", GXutil.rtrim( sCtrlAV30BarIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarFin_PARM", GXutil.ltrim( localUtil.ntoc( AV29BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29BarFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29BarFin_CTRL", GXutil.rtrim( sCtrlAV29BarFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46ReoIni_PARM", GXutil.ltrim( localUtil.ntoc( AV46ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46ReoIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46ReoIni_CTRL", GXutil.rtrim( sCtrlAV46ReoIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45ReoFin_PARM", GXutil.ltrim( localUtil.ntoc( AV45ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45ReoFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45ReoFin_CTRL", GXutil.rtrim( sCtrlAV45ReoFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44ParIni_PARM", GXutil.rtrim( AV44ParIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV44ParIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV44ParIni_CTRL", GXutil.rtrim( sCtrlAV44ParIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43ParFin_PARM", GXutil.rtrim( AV43ParFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43ParFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43ParFin_CTRL", GXutil.rtrim( sCtrlAV43ParFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37CliIni_PARM", GXutil.ltrim( localUtil.ntoc( AV37CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37CliIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37CliIni_CTRL", GXutil.rtrim( sCtrlAV37CliIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36CliFin_PARM", GXutil.ltrim( localUtil.ntoc( AV36CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36CliFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36CliFin_CTRL", GXutil.rtrim( sCtrlAV36CliFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35CCTIni_PARM", GXutil.ltrim( localUtil.ntoc( AV35CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35CCTIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35CCTIni_CTRL", GXutil.rtrim( sCtrlAV35CCTIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34CCTFin_PARM", GXutil.ltrim( localUtil.ntoc( AV34CCTFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34CCTFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34CCTFin_CTRL", GXutil.rtrim( sCtrlAV34CCTFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39FchIni_PARM", localUtil.dtoc( AV39FchIni, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39FchIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39FchIni_CTRL", GXutil.rtrim( sCtrlAV39FchIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38FchFin_PARM", localUtil.dtoc( AV38FchFin, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38FchFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38FchFin_CTRL", GXutil.rtrim( sCtrlAV38FchFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41NivIni_PARM", GXutil.rtrim( AV41NivIni));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41NivIni)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41NivIni_CTRL", GXutil.rtrim( sCtrlAV41NivIni));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40NivFin_PARM", GXutil.rtrim( AV40NivFin));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40NivFin)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40NivFin_CTRL", GXutil.rtrim( sCtrlAV40NivFin));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47TipoCtr_PARM", GXutil.rtrim( AV47TipoCtr));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47TipoCtr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47TipoCtr_CTRL", GXutil.rtrim( sCtrlAV47TipoCtr));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Barseri_PARM", GXutil.rtrim( AV32Barseri));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Barseri)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Barseri_CTRL", GXutil.rtrim( sCtrlAV32Barseri));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31barserf_PARM", GXutil.rtrim( AV31barserf));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31barserf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31barserf_CTRL", GXutil.rtrim( sCtrlAV31barserf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Barcolnom_PARM", GXutil.rtrim( AV25Barcolnom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Barcolnom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Barcolnom_CTRL", GXutil.rtrim( sCtrlAV25Barcolnom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Barcolnomf_PARM", GXutil.rtrim( AV26Barcolnomf));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Barcolnomf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Barcolnomf_CTRL", GXutil.rtrim( sCtrlAV26Barcolnomf));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Barcolnum_PARM", GXutil.ltrim( localUtil.ntoc( AV27Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27Barcolnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27Barcolnum_CTRL", GXutil.rtrim( sCtrlAV27Barcolnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Barcolnumf_PARM", GXutil.ltrim( localUtil.ntoc( AV28Barcolnumf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Barcolnumf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Barcolnumf_CTRL", GXutil.rtrim( sCtrlAV28Barcolnumf));
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
      we2BM2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555798", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wccest_wc.js", "?20268211555799", false, true);
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

   public void subsflControlProps_302( )
   {
      edtavWccest_sdt__barnhdr_Internalname = sPrefix+"WCCEST_SDT__BARNHDR_"+sGXsfl_30_idx ;
      edtavWccest_sdt__clinom_Internalname = sPrefix+"WCCEST_SDT__CLINOM_"+sGXsfl_30_idx ;
      edtavWccest_sdt__barser_Internalname = sPrefix+"WCCEST_SDT__BARSER_"+sGXsfl_30_idx ;
      edtavWccest_sdt__barserdsc_Internalname = sPrefix+"WCCEST_SDT__BARSERDSC_"+sGXsfl_30_idx ;
      edtavWccest_sdt__barcolnom_Internalname = sPrefix+"WCCEST_SDT__BARCOLNOM_"+sGXsfl_30_idx ;
      edtavWccest_sdt__barcolnum_Internalname = sPrefix+"WCCEST_SDT__BARCOLNUM_"+sGXsfl_30_idx ;
      edtavWccest_sdt__procod_Internalname = sPrefix+"WCCEST_SDT__PROCOD_"+sGXsfl_30_idx ;
      edtavWccest_sdt__fascod_Internalname = sPrefix+"WCCEST_SDT__FASCOD_"+sGXsfl_30_idx ;
      edtavWccest_sdt__fasdsc_Internalname = sPrefix+"WCCEST_SDT__FASDSC_"+sGXsfl_30_idx ;
      edtavWccest_sdt__cctcod_Internalname = sPrefix+"WCCEST_SDT__CCTCOD_"+sGXsfl_30_idx ;
      edtavWccest_sdt__cctdsc_Internalname = sPrefix+"WCCEST_SDT__CCTDSC_"+sGXsfl_30_idx ;
      edtavWccest_sdt__ccopecod_Internalname = sPrefix+"WCCEST_SDT__CCOPECOD_"+sGXsfl_30_idx ;
      edtavWccest_sdt__openom_Internalname = sPrefix+"WCCEST_SDT__OPENOM_"+sGXsfl_30_idx ;
      edtavWccest_sdt__ccfch_Internalname = sPrefix+"WCCEST_SDT__CCFCH_"+sGXsfl_30_idx ;
      edtavWccest_sdt__cctlin_Internalname = sPrefix+"WCCEST_SDT__CCTLIN_"+sGXsfl_30_idx ;
      edtavWccest_sdt__cctlindsc_Internalname = sPrefix+"WCCEST_SDT__CCTLINDSC_"+sGXsfl_30_idx ;
      edtavWccest_sdt__cctval_Internalname = sPrefix+"WCCEST_SDT__CCTVAL_"+sGXsfl_30_idx ;
      edtavWccest_sdt__obs_Internalname = sPrefix+"WCCEST_SDT__OBS_"+sGXsfl_30_idx ;
   }

   public void subsflControlProps_fel_302( )
   {
      edtavWccest_sdt__barnhdr_Internalname = sPrefix+"WCCEST_SDT__BARNHDR_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__clinom_Internalname = sPrefix+"WCCEST_SDT__CLINOM_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__barser_Internalname = sPrefix+"WCCEST_SDT__BARSER_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__barserdsc_Internalname = sPrefix+"WCCEST_SDT__BARSERDSC_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__barcolnom_Internalname = sPrefix+"WCCEST_SDT__BARCOLNOM_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__barcolnum_Internalname = sPrefix+"WCCEST_SDT__BARCOLNUM_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__procod_Internalname = sPrefix+"WCCEST_SDT__PROCOD_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__fascod_Internalname = sPrefix+"WCCEST_SDT__FASCOD_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__fasdsc_Internalname = sPrefix+"WCCEST_SDT__FASDSC_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__cctcod_Internalname = sPrefix+"WCCEST_SDT__CCTCOD_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__cctdsc_Internalname = sPrefix+"WCCEST_SDT__CCTDSC_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__ccopecod_Internalname = sPrefix+"WCCEST_SDT__CCOPECOD_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__openom_Internalname = sPrefix+"WCCEST_SDT__OPENOM_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__ccfch_Internalname = sPrefix+"WCCEST_SDT__CCFCH_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__cctlin_Internalname = sPrefix+"WCCEST_SDT__CCTLIN_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__cctlindsc_Internalname = sPrefix+"WCCEST_SDT__CCTLINDSC_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__cctval_Internalname = sPrefix+"WCCEST_SDT__CCTVAL_"+sGXsfl_30_fel_idx ;
      edtavWccest_sdt__obs_Internalname = sPrefix+"WCCEST_SDT__OBS_"+sGXsfl_30_fel_idx ;
   }

   public void sendrow_302( )
   {
      subsflControlProps_302( ) ;
      wb2BM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_30_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_30_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_30_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__barnhdr_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barnhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__barnhdr_Visible),Integer.valueOf(edtavWccest_sdt__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__clinom_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__clinom_Visible),Integer.valueOf(edtavWccest_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__barser_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__barser_Visible),Integer.valueOf(edtavWccest_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__barserdsc_Visible),Integer.valueOf(edtavWccest_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__barcolnom_Visible),Integer.valueOf(edtavWccest_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccest_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccest_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__barcolnum_Visible),Integer.valueOf(edtavWccest_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__procod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__procod_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Procod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__procod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__procod_Visible),Integer.valueOf(edtavWccest_sdt__procod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__fascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__fascod_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__fascod_Visible),Integer.valueOf(edtavWccest_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__fasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__fasdsc_Visible),Integer.valueOf(edtavWccest_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccest_sdt__cctcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__cctcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctcod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccest_sdt__cctcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctcod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctcod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__cctcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__cctcod_Visible),Integer.valueOf(edtavWccest_sdt__cctcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__cctdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__cctdsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__cctdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__cctdsc_Visible),Integer.valueOf(edtavWccest_sdt__cctdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccest_sdt__ccopecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__ccopecod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Ccopecod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccest_sdt__ccopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Ccopecod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Ccopecod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__ccopecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__ccopecod_Visible),Integer.valueOf(edtavWccest_sdt__ccopecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__openom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__openom_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Openom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__openom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__openom_Visible),Integer.valueOf(edtavWccest_sdt__openom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccest_sdt__ccfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__ccfch_Internalname,localUtil.format(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Ccfch(), "99/99/99"),localUtil.format( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Ccfch(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__ccfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__ccfch_Visible),Integer.valueOf(edtavWccest_sdt__ccfch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavWccest_sdt__cctlin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__cctlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavWccest_sdt__cctlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__cctlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__cctlin_Visible),Integer.valueOf(edtavWccest_sdt__cctlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__cctlindsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__cctlindsc_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctlindsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__cctlindsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__cctlindsc_Visible),Integer.valueOf(edtavWccest_sdt__cctlindsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__cctval_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__cctval_Internalname,GXutil.rtrim( ((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Cctval()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__cctval_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__cctval_Visible),Integer.valueOf(edtavWccest_sdt__cctval_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavWccest_sdt__obs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavWccest_sdt__obs_Internalname,((app.controlcalidadhtd.SdtwCCEst_SDT_Item)AV23wCCEst_SDT.elementAt(-1+AV55GXV1)).getgxTv_SdtwCCEst_SDT_Item_Obs(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavWccest_sdt__obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavWccest_sdt__obs_Visible),Integer.valueOf(edtavWccest_sdt__obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2BM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_30_idx = ((subGrid_Islastpage==1)&&(nGXsfl_30_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_30_idx+1) ;
         sGXsfl_30_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_30_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_302( ) ;
      }
      /* End function sendrow_302 */
   }

   public void startgridcontrol30( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"30\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__procod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__fascod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__fasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__cctcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__cctdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__ccopecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__openom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__ccfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__cctlin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Lín", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__cctlindsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__cctval_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavWccest_sdt__obs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Obs", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__procod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__procod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__fascod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__fasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__ccopecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__ccopecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__openom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__openom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__ccfch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__ccfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctlin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctlindsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctlindsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctval_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__cctval_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__obs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavWccest_sdt__obs_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavWccest_sdt__barnhdr_Internalname = sPrefix+"WCCEST_SDT__BARNHDR" ;
      edtavWccest_sdt__clinom_Internalname = sPrefix+"WCCEST_SDT__CLINOM" ;
      edtavWccest_sdt__barser_Internalname = sPrefix+"WCCEST_SDT__BARSER" ;
      edtavWccest_sdt__barserdsc_Internalname = sPrefix+"WCCEST_SDT__BARSERDSC" ;
      edtavWccest_sdt__barcolnom_Internalname = sPrefix+"WCCEST_SDT__BARCOLNOM" ;
      edtavWccest_sdt__barcolnum_Internalname = sPrefix+"WCCEST_SDT__BARCOLNUM" ;
      edtavWccest_sdt__procod_Internalname = sPrefix+"WCCEST_SDT__PROCOD" ;
      edtavWccest_sdt__fascod_Internalname = sPrefix+"WCCEST_SDT__FASCOD" ;
      edtavWccest_sdt__fasdsc_Internalname = sPrefix+"WCCEST_SDT__FASDSC" ;
      edtavWccest_sdt__cctcod_Internalname = sPrefix+"WCCEST_SDT__CCTCOD" ;
      edtavWccest_sdt__cctdsc_Internalname = sPrefix+"WCCEST_SDT__CCTDSC" ;
      edtavWccest_sdt__ccopecod_Internalname = sPrefix+"WCCEST_SDT__CCOPECOD" ;
      edtavWccest_sdt__openom_Internalname = sPrefix+"WCCEST_SDT__OPENOM" ;
      edtavWccest_sdt__ccfch_Internalname = sPrefix+"WCCEST_SDT__CCFCH" ;
      edtavWccest_sdt__cctlin_Internalname = sPrefix+"WCCEST_SDT__CCTLIN" ;
      edtavWccest_sdt__cctlindsc_Internalname = sPrefix+"WCCEST_SDT__CCTLINDSC" ;
      edtavWccest_sdt__cctval_Internalname = sPrefix+"WCCEST_SDT__CCTVAL" ;
      edtavWccest_sdt__obs_Internalname = sPrefix+"WCCEST_SDT__OBS" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
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
      edtavWccest_sdt__obs_Jsonclick = "" ;
      edtavWccest_sdt__obs_Enabled = 0 ;
      edtavWccest_sdt__obs_Visible = -1 ;
      edtavWccest_sdt__cctval_Jsonclick = "" ;
      edtavWccest_sdt__cctval_Enabled = 0 ;
      edtavWccest_sdt__cctval_Visible = -1 ;
      edtavWccest_sdt__cctlindsc_Jsonclick = "" ;
      edtavWccest_sdt__cctlindsc_Enabled = 0 ;
      edtavWccest_sdt__cctlindsc_Visible = -1 ;
      edtavWccest_sdt__cctlin_Jsonclick = "" ;
      edtavWccest_sdt__cctlin_Enabled = 0 ;
      edtavWccest_sdt__cctlin_Visible = -1 ;
      edtavWccest_sdt__ccfch_Jsonclick = "" ;
      edtavWccest_sdt__ccfch_Enabled = 0 ;
      edtavWccest_sdt__ccfch_Visible = -1 ;
      edtavWccest_sdt__openom_Jsonclick = "" ;
      edtavWccest_sdt__openom_Enabled = 0 ;
      edtavWccest_sdt__openom_Visible = -1 ;
      edtavWccest_sdt__ccopecod_Jsonclick = "" ;
      edtavWccest_sdt__ccopecod_Enabled = 0 ;
      edtavWccest_sdt__ccopecod_Visible = -1 ;
      edtavWccest_sdt__cctdsc_Jsonclick = "" ;
      edtavWccest_sdt__cctdsc_Enabled = 0 ;
      edtavWccest_sdt__cctdsc_Visible = -1 ;
      edtavWccest_sdt__cctcod_Jsonclick = "" ;
      edtavWccest_sdt__cctcod_Enabled = 0 ;
      edtavWccest_sdt__cctcod_Visible = -1 ;
      edtavWccest_sdt__fasdsc_Jsonclick = "" ;
      edtavWccest_sdt__fasdsc_Enabled = 0 ;
      edtavWccest_sdt__fasdsc_Visible = -1 ;
      edtavWccest_sdt__fascod_Jsonclick = "" ;
      edtavWccest_sdt__fascod_Enabled = 0 ;
      edtavWccest_sdt__fascod_Visible = -1 ;
      edtavWccest_sdt__procod_Jsonclick = "" ;
      edtavWccest_sdt__procod_Enabled = 0 ;
      edtavWccest_sdt__procod_Visible = -1 ;
      edtavWccest_sdt__barcolnum_Jsonclick = "" ;
      edtavWccest_sdt__barcolnum_Enabled = 0 ;
      edtavWccest_sdt__barcolnum_Visible = -1 ;
      edtavWccest_sdt__barcolnom_Jsonclick = "" ;
      edtavWccest_sdt__barcolnom_Enabled = 0 ;
      edtavWccest_sdt__barcolnom_Visible = -1 ;
      edtavWccest_sdt__barserdsc_Jsonclick = "" ;
      edtavWccest_sdt__barserdsc_Enabled = 0 ;
      edtavWccest_sdt__barserdsc_Visible = -1 ;
      edtavWccest_sdt__barser_Jsonclick = "" ;
      edtavWccest_sdt__barser_Enabled = 0 ;
      edtavWccest_sdt__barser_Visible = -1 ;
      edtavWccest_sdt__clinom_Jsonclick = "" ;
      edtavWccest_sdt__clinom_Enabled = 0 ;
      edtavWccest_sdt__clinom_Visible = -1 ;
      edtavWccest_sdt__barnhdr_Jsonclick = "" ;
      edtavWccest_sdt__barnhdr_Enabled = 0 ;
      edtavWccest_sdt__barnhdr_Visible = -1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavWccest_sdt__obs_Visible = -1 ;
      edtavWccest_sdt__cctval_Visible = -1 ;
      edtavWccest_sdt__cctlindsc_Visible = -1 ;
      edtavWccest_sdt__cctlin_Visible = -1 ;
      edtavWccest_sdt__ccfch_Visible = -1 ;
      edtavWccest_sdt__openom_Visible = -1 ;
      edtavWccest_sdt__ccopecod_Visible = -1 ;
      edtavWccest_sdt__cctdsc_Visible = -1 ;
      edtavWccest_sdt__cctcod_Visible = -1 ;
      edtavWccest_sdt__fasdsc_Visible = -1 ;
      edtavWccest_sdt__fascod_Visible = -1 ;
      edtavWccest_sdt__procod_Visible = -1 ;
      edtavWccest_sdt__barcolnum_Visible = -1 ;
      edtavWccest_sdt__barcolnom_Visible = -1 ;
      edtavWccest_sdt__barserdsc_Visible = -1 ;
      edtavWccest_sdt__barser_Visible = -1 ;
      edtavWccest_sdt__clinom_Visible = -1 ;
      edtavWccest_sdt__barnhdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavWccest_sdt__obs_Enabled = -1 ;
      edtavWccest_sdt__cctval_Enabled = -1 ;
      edtavWccest_sdt__cctlindsc_Enabled = -1 ;
      edtavWccest_sdt__cctlin_Enabled = -1 ;
      edtavWccest_sdt__ccfch_Enabled = -1 ;
      edtavWccest_sdt__openom_Enabled = -1 ;
      edtavWccest_sdt__ccopecod_Enabled = -1 ;
      edtavWccest_sdt__cctdsc_Enabled = -1 ;
      edtavWccest_sdt__cctcod_Enabled = -1 ;
      edtavWccest_sdt__fasdsc_Enabled = -1 ;
      edtavWccest_sdt__fascod_Enabled = -1 ;
      edtavWccest_sdt__procod_Enabled = -1 ;
      edtavWccest_sdt__barcolnum_Enabled = -1 ;
      edtavWccest_sdt__barcolnom_Enabled = -1 ;
      edtavWccest_sdt__barserdsc_Enabled = -1 ;
      edtavWccest_sdt__barser_Enabled = -1 ;
      edtavWccest_sdt__clinom_Enabled = -1 ;
      edtavWccest_sdt__barnhdr_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||||" ;
      Ddo_grid_Columnids = "0:wCCEst_SDT__Barnhdr|1:wCCEst_SDT__Clinom|2:wCCEst_SDT__Barser|3:wCCEst_SDT__Barserdsc|4:wCCEst_SDT__Barcolnom|5:wCCEst_SDT__Barcolnum|6:wCCEst_SDT__Procod|7:wCCEst_SDT__Fascod|8:wCCEst_SDT__Fasdsc|9:wCCEst_SDT__Cctcod|10:wCCEst_SDT__Cctdsc|11:wCCEst_SDT__Ccopecod|12:wCCEst_SDT__Openom|13:wCCEst_SDT__Ccfch|14:wCCEst_SDT__Cctlin|15:wCCEst_SDT__Cctlindsc|16:wCCEst_SDT__Cctval|17:wCCEst_SDT__Obs" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV29BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV46ReoIni',fld:'vREOINI',pic:'9'},{av:'AV45ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV44ParIni',fld:'vPARINI',pic:''},{av:'AV43ParFin',fld:'vPARFIN',pic:''},{av:'AV37CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV36CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV35CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV34CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV39FchIni',fld:'vFCHINI',pic:''},{av:'AV38FchFin',fld:'vFCHFIN',pic:''},{av:'AV41NivIni',fld:'vNIVINI',pic:''},{av:'AV40NivFin',fld:'vNIVFIN',pic:''},{av:'AV47TipoCtr',fld:'vTIPOCTR',pic:''},{av:'AV32Barseri',fld:'vBARSERI',pic:''},{av:'AV31barserf',fld:'vBARSERF',pic:''},{av:'AV25Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV26Barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV27Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV28Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV23wCCEst_SDT',fld:'vWCCEST_SDT',grid:30,pic:'',hsh:true},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'WCCEST_SDT__BARNHDR',prop:'Visible'},{ctrl:'WCCEST_SDT__CLINOM',prop:'Visible'},{ctrl:'WCCEST_SDT__BARSER',prop:'Visible'},{ctrl:'WCCEST_SDT__BARSERDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'WCCEST_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'WCCEST_SDT__PROCOD',prop:'Visible'},{ctrl:'WCCEST_SDT__FASCOD',prop:'Visible'},{ctrl:'WCCEST_SDT__FASDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTCOD',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__CCOPECOD',prop:'Visible'},{ctrl:'WCCEST_SDT__OPENOM',prop:'Visible'},{ctrl:'WCCEST_SDT__CCFCH',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTLIN',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTLINDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTVAL',prop:'Visible'},{ctrl:'WCCEST_SDT__OBS',prop:'Visible'},{av:'AV12GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV13GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112BM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV29BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV46ReoIni',fld:'vREOINI',pic:'9'},{av:'AV45ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV44ParIni',fld:'vPARINI',pic:''},{av:'AV43ParFin',fld:'vPARFIN',pic:''},{av:'AV37CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV36CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV35CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV34CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV39FchIni',fld:'vFCHINI',pic:''},{av:'AV38FchFin',fld:'vFCHFIN',pic:''},{av:'AV41NivIni',fld:'vNIVINI',pic:''},{av:'AV40NivFin',fld:'vNIVFIN',pic:''},{av:'AV47TipoCtr',fld:'vTIPOCTR',pic:''},{av:'AV32Barseri',fld:'vBARSERI',pic:''},{av:'AV31barserf',fld:'vBARSERF',pic:''},{av:'AV25Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV26Barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV27Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV28Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV23wCCEst_SDT',fld:'vWCCEST_SDT',grid:30,pic:'',hsh:true},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122BM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV29BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV46ReoIni',fld:'vREOINI',pic:'9'},{av:'AV45ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV44ParIni',fld:'vPARINI',pic:''},{av:'AV43ParFin',fld:'vPARFIN',pic:''},{av:'AV37CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV36CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV35CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV34CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV39FchIni',fld:'vFCHINI',pic:''},{av:'AV38FchFin',fld:'vFCHFIN',pic:''},{av:'AV41NivIni',fld:'vNIVINI',pic:''},{av:'AV40NivFin',fld:'vNIVFIN',pic:''},{av:'AV47TipoCtr',fld:'vTIPOCTR',pic:''},{av:'AV32Barseri',fld:'vBARSERI',pic:''},{av:'AV31barserf',fld:'vBARSERF',pic:''},{av:'AV25Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV26Barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV27Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV28Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV23wCCEst_SDT',fld:'vWCCEST_SDT',grid:30,pic:'',hsh:true},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182BM2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e132BM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV74Pgmname',fld:'vPGMNAME',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV29BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV46ReoIni',fld:'vREOINI',pic:'9'},{av:'AV45ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV44ParIni',fld:'vPARINI',pic:''},{av:'AV43ParFin',fld:'vPARFIN',pic:''},{av:'AV37CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV36CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV35CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV34CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV39FchIni',fld:'vFCHINI',pic:''},{av:'AV38FchFin',fld:'vFCHFIN',pic:''},{av:'AV41NivIni',fld:'vNIVINI',pic:''},{av:'AV40NivFin',fld:'vNIVFIN',pic:''},{av:'AV47TipoCtr',fld:'vTIPOCTR',pic:''},{av:'AV32Barseri',fld:'vBARSERI',pic:''},{av:'AV31barserf',fld:'vBARSERF',pic:''},{av:'AV25Barcolnom',fld:'vBARCOLNOM',pic:''},{av:'AV26Barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV27Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV28Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV23wCCEst_SDT',fld:'vWCCEST_SDT',grid:30,pic:'',hsh:true},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV6ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'WCCEST_SDT__BARNHDR',prop:'Visible'},{ctrl:'WCCEST_SDT__CLINOM',prop:'Visible'},{ctrl:'WCCEST_SDT__BARSER',prop:'Visible'},{ctrl:'WCCEST_SDT__BARSERDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'WCCEST_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'WCCEST_SDT__PROCOD',prop:'Visible'},{ctrl:'WCCEST_SDT__FASCOD',prop:'Visible'},{ctrl:'WCCEST_SDT__FASDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTCOD',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__CCOPECOD',prop:'Visible'},{ctrl:'WCCEST_SDT__OPENOM',prop:'Visible'},{ctrl:'WCCEST_SDT__CCFCH',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTLIN',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTLINDSC',prop:'Visible'},{ctrl:'WCCEST_SDT__CCTVAL',prop:'Visible'},{ctrl:'WCCEST_SDT__OBS',prop:'Visible'},{av:'AV12GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV13GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e142BM2',iparms:[{av:'AV23wCCEst_SDT',fld:'vWCCEST_SDT',grid:30,pic:'',hsh:true},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e152BM2',iparms:[{av:'AV23wCCEst_SDT',fld:'vWCCEST_SDT',grid:30,pic:'',hsh:true},{av:'nGXsfl_30_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:30},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_30',ctrl:'GRID',prop:'GridRC',grid:30}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv19',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV44ParIni = "" ;
      wcpOAV43ParFin = "" ;
      wcpOAV39FchIni = GXutil.nullDate() ;
      wcpOAV38FchFin = GXutil.nullDate() ;
      wcpOAV41NivIni = "" ;
      wcpOAV40NivFin = "" ;
      wcpOAV47TipoCtr = "" ;
      wcpOAV32Barseri = "" ;
      wcpOAV31barserf = "" ;
      wcpOAV25Barcolnom = "" ;
      wcpOAV26Barcolnomf = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV44ParIni = "" ;
      AV43ParFin = "" ;
      AV39FchIni = GXutil.nullDate() ;
      AV38FchFin = GXutil.nullDate() ;
      AV41NivIni = "" ;
      AV40NivFin = "" ;
      AV47TipoCtr = "" ;
      AV32Barseri = "" ;
      AV31barserf = "" ;
      AV25Barcolnom = "" ;
      AV26Barcolnomf = "" ;
      AV6ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV74Pgmname = "" ;
      AV23wCCEst_SDT = new GXBaseCollection<app.controlcalidadhtd.SdtwCCEst_SDT_Item>(app.controlcalidadhtd.SdtwCCEst_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV9DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV49Station = "" ;
      AV50EmprNom = "" ;
      AV51UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV48wCCEst_Json = "" ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new int[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_int25 = new int[1] ;
      AV24WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext27 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV8ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV52WebSession = httpContext.getWebSession();
      AV11ExcelFilename = "" ;
      AV10ErrorMessage = "" ;
      GXv_char23 = new String[1] ;
      AV22UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char26 = new String[1] ;
      AV7ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector28 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector29 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV30BarIni = "" ;
      sCtrlAV29BarFin = "" ;
      sCtrlAV46ReoIni = "" ;
      sCtrlAV45ReoFin = "" ;
      sCtrlAV44ParIni = "" ;
      sCtrlAV43ParFin = "" ;
      sCtrlAV37CliIni = "" ;
      sCtrlAV36CliFin = "" ;
      sCtrlAV35CCTIni = "" ;
      sCtrlAV34CCTFin = "" ;
      sCtrlAV39FchIni = "" ;
      sCtrlAV38FchFin = "" ;
      sCtrlAV41NivIni = "" ;
      sCtrlAV40NivFin = "" ;
      sCtrlAV47TipoCtr = "" ;
      sCtrlAV32Barseri = "" ;
      sCtrlAV31barserf = "" ;
      sCtrlAV25Barcolnom = "" ;
      sCtrlAV26Barcolnomf = "" ;
      sCtrlAV27Barcolnum = "" ;
      sCtrlAV28Barcolnumf = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV74Pgmname = "ControlCalidadHTD.Wccest_WC" ;
      /* GeneXus formulas. */
      AV74Pgmname = "ControlCalidadHTD.Wccest_WC" ;
      Gx_err = (short)(0) ;
      edtavWccest_sdt__barnhdr_Enabled = 0 ;
      edtavWccest_sdt__clinom_Enabled = 0 ;
      edtavWccest_sdt__barser_Enabled = 0 ;
      edtavWccest_sdt__barserdsc_Enabled = 0 ;
      edtavWccest_sdt__barcolnom_Enabled = 0 ;
      edtavWccest_sdt__barcolnum_Enabled = 0 ;
      edtavWccest_sdt__procod_Enabled = 0 ;
      edtavWccest_sdt__fascod_Enabled = 0 ;
      edtavWccest_sdt__fasdsc_Enabled = 0 ;
      edtavWccest_sdt__cctcod_Enabled = 0 ;
      edtavWccest_sdt__cctdsc_Enabled = 0 ;
      edtavWccest_sdt__ccopecod_Enabled = 0 ;
      edtavWccest_sdt__openom_Enabled = 0 ;
      edtavWccest_sdt__ccfch_Enabled = 0 ;
      edtavWccest_sdt__cctlin_Enabled = 0 ;
      edtavWccest_sdt__cctlindsc_Enabled = 0 ;
      edtavWccest_sdt__cctval_Enabled = 0 ;
      edtavWccest_sdt__obs_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV46ReoIni ;
   private byte wcpOAV45ReoFin ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV46ReoIni ;
   private byte AV45ReoFin ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int9[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV30BarIni ;
   private int wcpOAV29BarFin ;
   private int wcpOAV37CliIni ;
   private int wcpOAV36CliFin ;
   private int wcpOAV35CCTIni ;
   private int wcpOAV34CCTFin ;
   private int wcpOAV27Barcolnum ;
   private int wcpOAV28Barcolnumf ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_30 ;
   private int AV30BarIni ;
   private int AV29BarFin ;
   private int AV37CliIni ;
   private int AV36CliFin ;
   private int AV35CCTIni ;
   private int AV34CCTFin ;
   private int AV27Barcolnum ;
   private int AV28Barcolnumf ;
   private int nGXsfl_30_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV55GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavWccest_sdt__barnhdr_Enabled ;
   private int edtavWccest_sdt__clinom_Enabled ;
   private int edtavWccest_sdt__barser_Enabled ;
   private int edtavWccest_sdt__barserdsc_Enabled ;
   private int edtavWccest_sdt__barcolnom_Enabled ;
   private int edtavWccest_sdt__barcolnum_Enabled ;
   private int edtavWccest_sdt__procod_Enabled ;
   private int edtavWccest_sdt__fascod_Enabled ;
   private int edtavWccest_sdt__fasdsc_Enabled ;
   private int edtavWccest_sdt__cctcod_Enabled ;
   private int edtavWccest_sdt__cctdsc_Enabled ;
   private int edtavWccest_sdt__ccopecod_Enabled ;
   private int edtavWccest_sdt__openom_Enabled ;
   private int edtavWccest_sdt__ccfch_Enabled ;
   private int edtavWccest_sdt__cctlin_Enabled ;
   private int edtavWccest_sdt__cctlindsc_Enabled ;
   private int edtavWccest_sdt__cctval_Enabled ;
   private int edtavWccest_sdt__obs_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_30_fel_idx=1 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int GXv_int14[] ;
   private int GXv_int24[] ;
   private int GXv_int25[] ;
   private int edtavWccest_sdt__barnhdr_Visible ;
   private int edtavWccest_sdt__clinom_Visible ;
   private int edtavWccest_sdt__barser_Visible ;
   private int edtavWccest_sdt__barserdsc_Visible ;
   private int edtavWccest_sdt__barcolnom_Visible ;
   private int edtavWccest_sdt__barcolnum_Visible ;
   private int edtavWccest_sdt__procod_Visible ;
   private int edtavWccest_sdt__fascod_Visible ;
   private int edtavWccest_sdt__fasdsc_Visible ;
   private int edtavWccest_sdt__cctcod_Visible ;
   private int edtavWccest_sdt__cctdsc_Visible ;
   private int edtavWccest_sdt__ccopecod_Visible ;
   private int edtavWccest_sdt__openom_Visible ;
   private int edtavWccest_sdt__ccfch_Visible ;
   private int edtavWccest_sdt__cctlin_Visible ;
   private int edtavWccest_sdt__cctlindsc_Visible ;
   private int edtavWccest_sdt__cctval_Visible ;
   private int edtavWccest_sdt__obs_Visible ;
   private int AV18PageToGo ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV12GridCurrentPage ;
   private long AV13GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV44ParIni ;
   private String wcpOAV43ParFin ;
   private String wcpOAV41NivIni ;
   private String wcpOAV40NivFin ;
   private String wcpOAV47TipoCtr ;
   private String wcpOAV32Barseri ;
   private String wcpOAV31barserf ;
   private String wcpOAV25Barcolnom ;
   private String wcpOAV26Barcolnomf ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV44ParIni ;
   private String AV43ParFin ;
   private String AV41NivIni ;
   private String AV40NivFin ;
   private String AV47TipoCtr ;
   private String AV32Barseri ;
   private String AV31barserf ;
   private String AV25Barcolnom ;
   private String AV26Barcolnomf ;
   private String sGXsfl_30_idx="0001" ;
   private String AV74Pgmname ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
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
   private String edtavWccest_sdt__barnhdr_Internalname ;
   private String edtavWccest_sdt__clinom_Internalname ;
   private String edtavWccest_sdt__barser_Internalname ;
   private String edtavWccest_sdt__barserdsc_Internalname ;
   private String edtavWccest_sdt__barcolnom_Internalname ;
   private String edtavWccest_sdt__barcolnum_Internalname ;
   private String edtavWccest_sdt__procod_Internalname ;
   private String edtavWccest_sdt__fascod_Internalname ;
   private String edtavWccest_sdt__fasdsc_Internalname ;
   private String edtavWccest_sdt__cctcod_Internalname ;
   private String edtavWccest_sdt__cctdsc_Internalname ;
   private String edtavWccest_sdt__ccopecod_Internalname ;
   private String edtavWccest_sdt__openom_Internalname ;
   private String edtavWccest_sdt__ccfch_Internalname ;
   private String edtavWccest_sdt__cctlin_Internalname ;
   private String edtavWccest_sdt__cctlindsc_Internalname ;
   private String edtavWccest_sdt__cctval_Internalname ;
   private String edtavWccest_sdt__obs_Internalname ;
   private String sGXsfl_30_fel_idx="0001" ;
   private String hsh ;
   private String AV49Station ;
   private String AV50EmprNom ;
   private String AV51UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXt_char1 ;
   private String GXv_char26[] ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV30BarIni ;
   private String sCtrlAV29BarFin ;
   private String sCtrlAV46ReoIni ;
   private String sCtrlAV45ReoFin ;
   private String sCtrlAV44ParIni ;
   private String sCtrlAV43ParFin ;
   private String sCtrlAV37CliIni ;
   private String sCtrlAV36CliFin ;
   private String sCtrlAV35CCTIni ;
   private String sCtrlAV34CCTFin ;
   private String sCtrlAV39FchIni ;
   private String sCtrlAV38FchFin ;
   private String sCtrlAV41NivIni ;
   private String sCtrlAV40NivFin ;
   private String sCtrlAV47TipoCtr ;
   private String sCtrlAV32Barseri ;
   private String sCtrlAV31barserf ;
   private String sCtrlAV25Barcolnom ;
   private String sCtrlAV26Barcolnomf ;
   private String sCtrlAV27Barcolnum ;
   private String sCtrlAV28Barcolnumf ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavWccest_sdt__barnhdr_Jsonclick ;
   private String edtavWccest_sdt__clinom_Jsonclick ;
   private String edtavWccest_sdt__barser_Jsonclick ;
   private String edtavWccest_sdt__barserdsc_Jsonclick ;
   private String edtavWccest_sdt__barcolnom_Jsonclick ;
   private String edtavWccest_sdt__barcolnum_Jsonclick ;
   private String edtavWccest_sdt__procod_Jsonclick ;
   private String edtavWccest_sdt__fascod_Jsonclick ;
   private String edtavWccest_sdt__fasdsc_Jsonclick ;
   private String edtavWccest_sdt__cctcod_Jsonclick ;
   private String edtavWccest_sdt__cctdsc_Jsonclick ;
   private String edtavWccest_sdt__ccopecod_Jsonclick ;
   private String edtavWccest_sdt__openom_Jsonclick ;
   private String edtavWccest_sdt__ccfch_Jsonclick ;
   private String edtavWccest_sdt__cctlin_Jsonclick ;
   private String edtavWccest_sdt__cctlindsc_Jsonclick ;
   private String edtavWccest_sdt__cctval_Jsonclick ;
   private String edtavWccest_sdt__obs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV39FchIni ;
   private java.util.Date wcpOAV38FchFin ;
   private java.util.Date AV39FchIni ;
   private java.util.Date AV38FchFin ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date16[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_30_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV30 ;
   private boolean gx_refresh_fired ;
   private String AV48wCCEst_Json ;
   private String AV8ColumnsSelectorXML ;
   private String AV22UserCustomValue ;
   private String AV11ExcelFilename ;
   private String AV10ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV52WebSession ;
   private GXBaseCollection<app.controlcalidadhtd.SdtwCCEst_SDT_Item> AV23wCCEst_SDT ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV7ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector28[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector29[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV9DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV24WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext27[] ;
}

