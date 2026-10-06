package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rmod008_consulta_impl extends GXWebComponent
{
   public rmod008_consulta_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rmod008_consulta_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rmod008_consulta_impl.class ));
   }

   public rmod008_consulta_impl( int remoteHandle ,
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
               AV33Data_json = httpContext.GetPar( "Data_json") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Data_json", AV33Data_json);
               AV15CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodfrom), 6, 0));
               AV16CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
               AV9BarFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecClifrom")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecClifrom", localUtil.format(AV9BarFecClifrom, "99/99/99"));
               AV10BarFecClito = localUtil.parseDateParm( httpContext.GetPar( "BarFecClito")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecClito", localUtil.format(AV10BarFecClito, "99/99/99"));
               AV13BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarSitfrom), 2, 0));
               AV14BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitto), 2, 0));
               AV28TipArtCodfrom = (short)(GXutil.lval( httpContext.GetPar( "TipArtCodfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCodfrom), 4, 0));
               AV29TipArtCodto = (short)(GXutil.lval( httpContext.GetPar( "TipArtCodto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCodto), 4, 0));
               AV11BarSerfrom = httpContext.GetPar( "BarSerfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSerfrom", AV11BarSerfrom);
               AV12BarSerto = httpContext.GetPar( "BarSerto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSerto", AV12BarSerto);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,AV33Data_json,Integer.valueOf(AV15CliCodfrom),Integer.valueOf(AV16CliCodto),AV9BarFecClifrom,AV10BarFecClito,Byte.valueOf(AV13BarSitfrom),Byte.valueOf(AV14BarSitto),Short.valueOf(AV28TipArtCodfrom),Short.valueOf(AV29TipArtCodto),AV11BarSerfrom,AV12BarSerto});
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
      nRC_GXsfl_34 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_34"))) ;
      nGXsfl_34_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_34_idx"))) ;
      sGXsfl_34_idx = httpContext.GetPar( "sGXsfl_34_idx") ;
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
      AV33Data_json = httpContext.GetPar( "Data_json") ;
      AV68Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26RMOD008_SDT);
      AV36Tot_Saldo_k = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Saldo_k"), ".") ;
      AV38Tot_Tot_p = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Tot_p"), ".") ;
      AV40Tot_Tot_t = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Tot_t"), ".") ;
      AV42Tot_Tot_a = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Tot_a"), ".") ;
      AV44Tot_Tot_l = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Tot_l"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa26D2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Consulta Produccion en Curso", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.rmod008_consulta", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33Data_json)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliCodfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCodto,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV9BarFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV10BarFecClito)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarSitfrom,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14BarSitto,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28TipArtCodfrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29TipArtCodto,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11BarSerfrom)),GXutil.URLEncode(GXutil.rtrim(AV12BarSerto))}, new String[] {"EmprCod","Data_json","CliCodfrom","CliCodto","BarFecClifrom","BarFecClito","BarSitfrom","BarSitto","TipArtCodfrom","TipArtCodto","BarSerfrom","BarSerto"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRMOD008_SDT", getSecureSignedToken( sPrefix, AV26RMOD008_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDO_K", getSecureSignedToken( sPrefix, localUtil.format( AV36Tot_Saldo_k, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_P", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_Tot_p, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_T", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_Tot_t, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_A", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Tot_a, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_L", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Tot_l, "ZZZZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RMOD008_Consulta");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\rmod008_consulta:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Rmod008_sdt", AV26RMOD008_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Rmod008_sdt", AV26RMOD008_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Rmod008_sdt", getSecureSignedToken( sPrefix, AV26RMOD008_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV19GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV20GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Data_json", wcpOAV33Data_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15CliCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV15CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16CliCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV16CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9BarFecClifrom", localUtil.dtoc( wcpOAV9BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10BarFecClito", localUtil.dtoc( wcpOAV10BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13BarSitfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV13BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14BarSitto", GXutil.ltrim( localUtil.ntoc( wcpOAV14BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28TipArtCodfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV28TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29TipArtCodto", GXutil.ltrim( localUtil.ntoc( wcpOAV29TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11BarSerfrom", GXutil.rtrim( wcpOAV11BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12BarSerto", GXutil.rtrim( wcpOAV12BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDATA_JSON", AV33Data_json);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRMOD008_SDT", AV26RMOD008_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRMOD008_SDT", AV26RMOD008_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRMOD008_SDT", getSecureSignedToken( sPrefix, AV26RMOD008_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_SALDO_K", GXutil.ltrim( localUtil.ntoc( AV36Tot_Saldo_k, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDO_K", getSecureSignedToken( sPrefix, localUtil.format( AV36Tot_Saldo_k, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_P", GXutil.ltrim( localUtil.ntoc( AV38Tot_Tot_p, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_P", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_Tot_p, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_T", GXutil.ltrim( localUtil.ntoc( AV40Tot_Tot_t, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_T", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_Tot_t, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_A", GXutil.ltrim( localUtil.ntoc( AV42Tot_Tot_a, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_A", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Tot_a, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_L", GXutil.ltrim( localUtil.ntoc( AV44Tot_Tot_l, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_L", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Tot_l, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV15CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV16CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLIFROM", localUtil.dtoc( AV9BarFecClifrom, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECCLITO", localUtil.dtoc( AV10BarFecClito, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITFROM", GXutil.ltrim( localUtil.ntoc( AV13BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV14BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCODFROM", GXutil.ltrim( localUtil.ntoc( AV28TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCODTO", GXutil.ltrim( localUtil.ntoc( AV29TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERFROM", GXutil.rtrim( AV11BarSerfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSERTO", GXutil.rtrim( AV12BarSerto));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm26D2( )
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
      return "PedidosClienteSinDetalle.RMOD008_Consulta" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Produccion en Curso", "") ;
   }

   public void wb26D0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.pedidosclientesindetalle.rmod008_consulta");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_win_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF (Win)", ""), bttBtnpdf_win_Jsonclick, 7, httpContext.getMessage( "PDF (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1126d1_client"+"'", TempTags, "", 2, "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_26D2( true) ;
      }
      else
      {
         wb_table1_23_26D2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_26D2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol34( ) ;
      }
      if ( wbEnd == 34 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_34 = (int)(nGXsfl_34_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV59GXV1 = nGXsfl_34_idx ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_45_26D2( true) ;
      }
      else
      {
         wb_table2_45_26D2( false) ;
      }
      return  ;
   }

   public void wb_table2_45_26D2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV19GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV20GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV68Pgmname), GXutil.rtrim( localUtil.format( AV68Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
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
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 34 )
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
               AV59GXV1 = nGXsfl_34_idx ;
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

   public void start26D2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Produccion en Curso", ""), (short)(0)) ;
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
            strup26D0( ) ;
         }
      }
   }

   public void ws26D2( )
   {
      start26D2( ) ;
      evt26D2( ) ;
   }

   public void evt26D2( )
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
                              strup26D0( ) ;
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
                              strup26D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1226D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1326D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1426D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1526D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup26D0( ) ;
                           }
                           nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           AV59GXV1 = (int)(nGXsfl_34_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV26RMOD008_SDT.size() >= AV59GXV1 ) && ( AV59GXV1 > 0 ) )
                           {
                              AV26RMOD008_SDT.currentItem( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)) );
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
                                       GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1626D2 ();
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
                                       GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1726D2 ();
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
                                       GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1826D2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e1926D2 ();
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
                                    strup26D0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we26D2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm26D2( ) ;
         }
      }
   }

   public void pa26D2( )
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
            GX_FocusControl = edtavTotvalue_saldo_k_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_342( ) ;
      while ( nGXsfl_34_idx <= nRC_GXsfl_34 )
      {
         sendrow_342( ) ;
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV33Data_json ,
                                 String AV68Pgmname ,
                                 GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item> AV26RMOD008_SDT ,
                                 java.math.BigDecimal AV36Tot_Saldo_k ,
                                 java.math.BigDecimal AV38Tot_Tot_p ,
                                 java.math.BigDecimal AV40Tot_Tot_t ,
                                 java.math.BigDecimal AV42Tot_Tot_a ,
                                 java.math.BigDecimal AV44Tot_Tot_l ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1726D2 ();
      GRID_nCurrentRecord = 0 ;
      rf26D2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RMOD008_Consulta");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\rmod008_consulta:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf26D2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV68Pgmname = "PedidosClienteSinDetalle.RMOD008_Consulta" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavRmod008_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__clicod_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__clinom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__saldo_k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__saldo_k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__saldo_k_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__saldo_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__saldo_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__saldo_m_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_p_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_t_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_t_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_t_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_a_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_a_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_a_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_l_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_l_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavTotvalue_saldo_k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_saldo_k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_saldo_k_Enabled), 5, 0), true);
      edtavTotvalue_tot_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_p_Enabled), 5, 0), true);
      edtavTotvalue_tot_t_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_t_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_t_Enabled), 5, 0), true);
      edtavTotvalue_tot_a_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_a_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_a_Enabled), 5, 0), true);
      edtavTotvalue_tot_l_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_l_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26D2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      /* Execute user event: Refresh */
      e1726D2 ();
      nGXsfl_34_idx = 1 ;
      sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_342( ) ;
      bGXsfl_34_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_342( ) ;
         e1826D2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_34_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1826D2 ();
         }
         wbEnd = (short)(34) ;
         wb26D0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26D2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vRMOD008_SDT", AV26RMOD008_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vRMOD008_SDT", AV26RMOD008_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRMOD008_SDT", getSecureSignedToken( sPrefix, AV26RMOD008_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_SALDO_K", GXutil.ltrim( localUtil.ntoc( AV36Tot_Saldo_k, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDO_K", getSecureSignedToken( sPrefix, localUtil.format( AV36Tot_Saldo_k, "ZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_P", GXutil.ltrim( localUtil.ntoc( AV38Tot_Tot_p, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_P", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_Tot_p, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_T", GXutil.ltrim( localUtil.ntoc( AV40Tot_Tot_t, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_T", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_Tot_t, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_A", GXutil.ltrim( localUtil.ntoc( AV42Tot_Tot_a, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_A", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Tot_a, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOT_L", GXutil.ltrim( localUtil.ntoc( AV44Tot_Tot_l, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_L", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Tot_l, "ZZZZZZZZZ9.99")));
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
      return AV26RMOD008_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV68Pgmname = "PedidosClienteSinDetalle.RMOD008_Consulta" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavRmod008_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__clicod_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__clinom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__saldo_k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__saldo_k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__saldo_k_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__saldo_m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__saldo_m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__saldo_m_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_p_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_t_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_t_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_t_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_a_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_a_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_a_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavRmod008_sdt__tot_l_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRmod008_sdt__tot_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRmod008_sdt__tot_l_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavTotvalue_saldo_k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_saldo_k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_saldo_k_Enabled), 5, 0), true);
      edtavTotvalue_tot_p_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_p_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_p_Enabled), 5, 0), true);
      edtavTotvalue_tot_t_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_t_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_t_Enabled), 5, 0), true);
      edtavTotvalue_tot_a_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_a_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_a_Enabled), 5, 0), true);
      edtavTotvalue_tot_l_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_tot_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_tot_l_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1626D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Rmod008_sdt"), AV26RMOD008_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vRMOD008_SDT"), AV26RMOD008_SDT);
         /* Read saved values. */
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV20GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV33Data_json = httpContext.cgiGet( sPrefix+"wcpOAV33Data_json") ;
         wcpOAV15CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV16CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9BarFecClifrom"), 0) ;
         wcpOAV10BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10BarFecClito"), 0) ;
         wcpOAV13BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV14BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28TipArtCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29TipArtCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV11BarSerfrom") ;
         wcpOAV12BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV12BarSerto") ;
         AV29TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPARTCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vTIPARTCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV14BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV13BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARSITFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECCLITO"), 0) ;
         AV9BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"vBARFECCLIFROM"), 0) ;
         AV16CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_34_fel_idx = 0 ;
         while ( nGXsfl_34_fel_idx < nRC_GXsfl_34 )
         {
            nGXsfl_34_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_fel_idx+1) ;
            sGXsfl_34_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_342( ) ;
            AV59GXV1 = (int)(nGXsfl_34_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV26RMOD008_SDT.size() >= AV59GXV1 ) && ( AV59GXV1 > 0 ) )
            {
               AV26RMOD008_SDT.currentItem( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)) );
            }
         }
         if ( nGXsfl_34_fel_idx == 0 )
         {
            nGXsfl_34_idx = 1 ;
            sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_342( ) ;
         }
         nGXsfl_34_fel_idx = 1 ;
         /* Read variables values. */
         AV37TotValue_Saldo_k = httpContext.cgiGet( edtavTotvalue_saldo_k_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TotValue_Saldo_k", AV37TotValue_Saldo_k);
         AV39TotValue_Tot_p = httpContext.cgiGet( edtavTotvalue_tot_p_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TotValue_Tot_p", AV39TotValue_Tot_p);
         AV41TotValue_Tot_t = httpContext.cgiGet( edtavTotvalue_tot_t_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotValue_Tot_t", AV41TotValue_Tot_t);
         AV43TotValue_Tot_a = httpContext.cgiGet( edtavTotvalue_tot_a_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotValue_Tot_a", AV43TotValue_Tot_a);
         AV45TotValue_Tot_l = httpContext.cgiGet( edtavTotvalue_tot_l_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValue_Tot_l", AV45TotValue_Tot_l);
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"RMOD008_Consulta");
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\rmod008_consulta:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1626D2 ();
      if (returnInSub) return;
   }

   public void e1626D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV34WebSession.remove(httpContext.getMessage( "&Data_json", ""));
      AV34WebSession.setValue(httpContext.getMessage( "&Data_json", ""), AV33Data_json);
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      rmod008_consulta_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      rmod008_consulta_impl.this.AV5EmprCod = GXv_char2[0] ;
      rmod008_consulta_impl.this.AV6EmprNom = GXv_char3[0] ;
      rmod008_consulta_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1726D2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV26RMOD008_SDT.fromJSonString(AV33Data_json, null);
      gx_BV34 = true ;
      GXv_SdtWWPContext5[0] = AV32WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV32WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV19GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      AV20GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26RMOD008_SDT", AV26RMOD008_SDT);
   }

   public void e1226D2( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e1326D2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1826D2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV26RMOD008_SDT.size() )
      {
         AV26RMOD008_SDT.currentItem( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(34) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_342( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_34_Refreshing )
         {
            httpContext.doAjaxLoad(34, GridRow);
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void e1426D2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV34WebSession.setValue("&BarFecClifrom", localUtil.dtoc( AV9BarFecClifrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV34WebSession.setValue("&BarFecClito", localUtil.dtoc( AV10BarFecClito, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXv_char4[0] = AV18ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.pedidosclientesindetalle.rmod008_consultaexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      rmod008_consulta_impl.this.AV18ExcelFilename = GXv_char4[0] ;
      rmod008_consulta_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV18ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV18ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      if ( gx_BV34 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26RMOD008_SDT", AV26RMOD008_SDT);
         nGXsfl_34_bak_idx = nGXsfl_34_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
         nGXsfl_34_idx = nGXsfl_34_bak_idx ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
   }

   public void e1526D2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV34WebSession.setValue("&BarFecClifrom", localUtil.dtoc( AV9BarFecClifrom, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV34WebSession.setValue("&BarFecClito", localUtil.dtoc( AV10BarFecClito, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidosclientesindetalle.rmod008_consultaexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      if ( gx_BV34 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26RMOD008_SDT", AV26RMOD008_SDT);
         nGXsfl_34_bak_idx = nGXsfl_34_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
         nGXsfl_34_idx = nGXsfl_34_bak_idx ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue(AV68Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV68Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV27Session.getValue(AV68Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV21GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV21GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV21GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV27Session.getValue(AV68Pgmname+"GridState"), null, null);
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      AV21GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV21GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV68Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV36Tot_Saldo_k = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tot_Saldo_k", GXutil.ltrimstr( AV36Tot_Saldo_k, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDO_K", getSecureSignedToken( sPrefix, localUtil.format( AV36Tot_Saldo_k, "ZZZZZZZZ9.99")));
      AV38Tot_Tot_p = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Tot_Tot_p", GXutil.ltrimstr( AV38Tot_Tot_p, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_P", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_Tot_p, "ZZZZZZZZZ9.99")));
      AV40Tot_Tot_t = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Tot_Tot_t", GXutil.ltrimstr( AV40Tot_Tot_t, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_T", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_Tot_t, "ZZZZZZZZZ9.99")));
      AV42Tot_Tot_a = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tot_Tot_a", GXutil.ltrimstr( AV42Tot_Tot_a, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_A", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Tot_a, "ZZZZZZZZZ9.99")));
      AV44Tot_Tot_l = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Tot_Tot_l", GXutil.ltrimstr( AV44Tot_Tot_l, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_L", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Tot_l, "ZZZZZZZZZ9.99")));
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV69GXV10 = 1 ;
      while ( AV69GXV10 <= AV26RMOD008_SDT.size() )
      {
         AV35RMOD008_SDTItem = (app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV69GXV10));
         AV36Tot_Saldo_k = AV36Tot_Saldo_k.add((AV35RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Saldo_k())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tot_Saldo_k", GXutil.ltrimstr( AV36Tot_Saldo_k, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_SALDO_K", getSecureSignedToken( sPrefix, localUtil.format( AV36Tot_Saldo_k, "ZZZZZZZZ9.99")));
         AV38Tot_Tot_p = AV38Tot_Tot_p.add((AV35RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_p())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Tot_Tot_p", GXutil.ltrimstr( AV38Tot_Tot_p, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_P", getSecureSignedToken( sPrefix, localUtil.format( AV38Tot_Tot_p, "ZZZZZZZZZ9.99")));
         AV40Tot_Tot_t = AV40Tot_Tot_t.add((AV35RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_t())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Tot_Tot_t", GXutil.ltrimstr( AV40Tot_Tot_t, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_T", getSecureSignedToken( sPrefix, localUtil.format( AV40Tot_Tot_t, "ZZZZZZZZZ9.99")));
         AV42Tot_Tot_a = AV42Tot_Tot_a.add((AV35RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_a())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tot_Tot_a", GXutil.ltrimstr( AV42Tot_Tot_a, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_A", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Tot_a, "ZZZZZZZZZ9.99")));
         AV44Tot_Tot_l = AV44Tot_Tot_l.add((AV35RMOD008_SDTItem.getgxTv_SdtRMOD008_SDT_Item_Tot_l())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Tot_Tot_l", GXutil.ltrimstr( AV44Tot_Tot_l, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOT_L", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Tot_l, "ZZZZZZZZZ9.99")));
         AV69GXV10 = (int)(AV69GXV10+1) ;
      }
      AV37TotValue_Saldo_k = localUtil.format( AV36Tot_Saldo_k, "ZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TotValue_Saldo_k", AV37TotValue_Saldo_k);
      AV39TotValue_Tot_p = localUtil.format( AV38Tot_Tot_p, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TotValue_Tot_p", AV39TotValue_Tot_p);
      AV41TotValue_Tot_t = localUtil.format( AV40Tot_Tot_t, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotValue_Tot_t", AV41TotValue_Tot_t);
      AV43TotValue_Tot_a = localUtil.format( AV42Tot_Tot_a, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotValue_Tot_a", AV43TotValue_Tot_a);
      AV45TotValue_Tot_l = localUtil.format( AV44Tot_Tot_l, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValue_Tot_l", AV45TotValue_Tot_l);
   }

   public void e1926D2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      if ( gx_BV34 )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26RMOD008_SDT", AV26RMOD008_SDT);
         nGXsfl_34_bak_idx = nGXsfl_34_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV33Data_json, AV68Pgmname, AV26RMOD008_SDT, AV36Tot_Saldo_k, AV38Tot_Tot_p, AV40Tot_Tot_t, AV42Tot_Tot_a, AV44Tot_Tot_l, sPrefix) ;
         nGXsfl_34_idx = nGXsfl_34_bak_idx ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
   }

   public void wb_table2_45_26D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_saldo_k_Internalname, httpContext.getMessage( "Tot Value_Saldo_k", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_saldo_k_Internalname, AV37TotValue_Saldo_k, GXutil.rtrim( localUtil.format( AV37TotValue_Saldo_k, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_saldo_k_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_saldo_k_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_tot_p_Internalname, httpContext.getMessage( "Tot Value_Tot_p", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_tot_p_Internalname, AV39TotValue_Tot_p, GXutil.rtrim( localUtil.format( AV39TotValue_Tot_p, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_tot_p_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_tot_p_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_tot_t_Internalname, httpContext.getMessage( "Tot Value_Tot_t", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_tot_t_Internalname, AV41TotValue_Tot_t, GXutil.rtrim( localUtil.format( AV41TotValue_Tot_t, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_tot_t_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_tot_t_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_tot_a_Internalname, httpContext.getMessage( "Tot Value_Tot_a", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_tot_a_Internalname, AV43TotValue_Tot_a, GXutil.rtrim( localUtil.format( AV43TotValue_Tot_a, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_tot_a_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_tot_a_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_tot_l_Internalname, httpContext.getMessage( "Tot Value_Tot_l", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_tot_l_Internalname, AV45TotValue_Tot_l, GXutil.rtrim( localUtil.format( AV45TotValue_Tot_l, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_tot_l_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_tot_l_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\RMOD008_Consulta.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_45_26D2e( true) ;
      }
      else
      {
         wb_table2_45_26D2e( false) ;
      }
   }

   public void wb_table1_23_26D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_26D2e( true) ;
      }
      else
      {
         wb_table1_23_26D2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
      AV33Data_json = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Data_json", AV33Data_json);
      AV15CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodfrom), 6, 0));
      AV16CliCodto = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
      AV9BarFecClifrom = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecClifrom", localUtil.format(AV9BarFecClifrom, "99/99/99"));
      AV10BarFecClito = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecClito", localUtil.format(AV10BarFecClito, "99/99/99"));
      AV13BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarSitfrom), 2, 0));
      AV14BarSitto = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitto), 2, 0));
      AV28TipArtCodfrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCodfrom), 4, 0));
      AV29TipArtCodto = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCodto), 4, 0));
      AV11BarSerfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSerfrom", AV11BarSerfrom);
      AV12BarSerto = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSerto", AV12BarSerto);
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
      pa26D2( ) ;
      ws26D2( ) ;
      we26D2( ) ;
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
      sCtrlAV33Data_json = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV15CliCodfrom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV16CliCodto = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9BarFecClifrom = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10BarFecClito = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV13BarSitfrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV14BarSitto = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV28TipArtCodfrom = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV29TipArtCodto = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV11BarSerfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV12BarSerto = (String)getParm(obj,11,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa26D2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "pedidosclientesindetalle\\rmod008_consulta", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa26D2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5EmprCod", AV5EmprCod);
         AV33Data_json = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Data_json", AV33Data_json);
         AV15CliCodfrom = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodfrom), 6, 0));
         AV16CliCodto = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
         AV9BarFecClifrom = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecClifrom", localUtil.format(AV9BarFecClifrom, "99/99/99"));
         AV10BarFecClito = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecClito", localUtil.format(AV10BarFecClito, "99/99/99"));
         AV13BarSitfrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarSitfrom), 2, 0));
         AV14BarSitto = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitto), 2, 0));
         AV28TipArtCodfrom = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCodfrom), 4, 0));
         AV29TipArtCodto = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCodto), 4, 0));
         AV11BarSerfrom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSerfrom", AV11BarSerfrom);
         AV12BarSerto = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSerto", AV12BarSerto);
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV33Data_json = httpContext.cgiGet( sPrefix+"wcpOAV33Data_json") ;
      wcpOAV15CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15CliCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV16CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV16CliCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV9BarFecClifrom"), 0) ;
      wcpOAV10BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV10BarFecClito"), 0) ;
      wcpOAV13BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13BarSitfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV14BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV14BarSitto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28TipArtCodfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29TipArtCodto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11BarSerfrom = httpContext.cgiGet( sPrefix+"wcpOAV11BarSerfrom") ;
      wcpOAV12BarSerto = httpContext.cgiGet( sPrefix+"wcpOAV12BarSerto") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( GXutil.strcmp(AV33Data_json, wcpOAV33Data_json) != 0 ) || ( AV15CliCodfrom != wcpOAV15CliCodfrom ) || ( AV16CliCodto != wcpOAV16CliCodto ) || !( GXutil.dateCompare(GXutil.resetTime(AV9BarFecClifrom), GXutil.resetTime(wcpOAV9BarFecClifrom)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV10BarFecClito), GXutil.resetTime(wcpOAV10BarFecClito)) ) || ( AV13BarSitfrom != wcpOAV13BarSitfrom ) || ( AV14BarSitto != wcpOAV14BarSitto ) || ( AV28TipArtCodfrom != wcpOAV28TipArtCodfrom ) || ( AV29TipArtCodto != wcpOAV29TipArtCodto ) || ( GXutil.strcmp(AV11BarSerfrom, wcpOAV11BarSerfrom) != 0 ) || ( GXutil.strcmp(AV12BarSerto, wcpOAV12BarSerto) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV33Data_json = AV33Data_json ;
      wcpOAV15CliCodfrom = AV15CliCodfrom ;
      wcpOAV16CliCodto = AV16CliCodto ;
      wcpOAV9BarFecClifrom = AV9BarFecClifrom ;
      wcpOAV10BarFecClito = AV10BarFecClito ;
      wcpOAV13BarSitfrom = AV13BarSitfrom ;
      wcpOAV14BarSitto = AV14BarSitto ;
      wcpOAV28TipArtCodfrom = AV28TipArtCodfrom ;
      wcpOAV29TipArtCodto = AV29TipArtCodto ;
      wcpOAV11BarSerfrom = AV11BarSerfrom ;
      wcpOAV12BarSerto = AV12BarSerto ;
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
      sCtrlAV33Data_json = httpContext.cgiGet( sPrefix+"AV33Data_json_CTRL") ;
      if ( GXutil.len( sCtrlAV33Data_json) > 0 )
      {
         AV33Data_json = httpContext.cgiGet( sCtrlAV33Data_json) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Data_json", AV33Data_json);
      }
      else
      {
         AV33Data_json = httpContext.cgiGet( sPrefix+"AV33Data_json_PARM") ;
      }
      sCtrlAV15CliCodfrom = httpContext.cgiGet( sPrefix+"AV15CliCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV15CliCodfrom) > 0 )
      {
         AV15CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15CliCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodfrom), 6, 0));
      }
      else
      {
         AV15CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15CliCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV16CliCodto = httpContext.cgiGet( sPrefix+"AV16CliCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV16CliCodto) > 0 )
      {
         AV16CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV16CliCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCodto), 6, 0));
      }
      else
      {
         AV16CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV16CliCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9BarFecClifrom = httpContext.cgiGet( sPrefix+"AV9BarFecClifrom_CTRL") ;
      if ( GXutil.len( sCtrlAV9BarFecClifrom) > 0 )
      {
         AV9BarFecClifrom = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV9BarFecClifrom), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9BarFecClifrom", localUtil.format(AV9BarFecClifrom, "99/99/99"));
      }
      else
      {
         AV9BarFecClifrom = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV9BarFecClifrom_PARM"), 0) ;
      }
      sCtrlAV10BarFecClito = httpContext.cgiGet( sPrefix+"AV10BarFecClito_CTRL") ;
      if ( GXutil.len( sCtrlAV10BarFecClito) > 0 )
      {
         AV10BarFecClito = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV10BarFecClito), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10BarFecClito", localUtil.format(AV10BarFecClito, "99/99/99"));
      }
      else
      {
         AV10BarFecClito = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV10BarFecClito_PARM"), 0) ;
      }
      sCtrlAV13BarSitfrom = httpContext.cgiGet( sPrefix+"AV13BarSitfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV13BarSitfrom) > 0 )
      {
         AV13BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13BarSitfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13BarSitfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarSitfrom), 2, 0));
      }
      else
      {
         AV13BarSitfrom = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13BarSitfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV14BarSitto = httpContext.cgiGet( sPrefix+"AV14BarSitto_CTRL") ;
      if ( GXutil.len( sCtrlAV14BarSitto) > 0 )
      {
         AV14BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV14BarSitto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14BarSitto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarSitto), 2, 0));
      }
      else
      {
         AV14BarSitto = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV14BarSitto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV28TipArtCodfrom = httpContext.cgiGet( sPrefix+"AV28TipArtCodfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV28TipArtCodfrom) > 0 )
      {
         AV28TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28TipArtCodfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCodfrom), 4, 0));
      }
      else
      {
         AV28TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28TipArtCodfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29TipArtCodto = httpContext.cgiGet( sPrefix+"AV29TipArtCodto_CTRL") ;
      if ( GXutil.len( sCtrlAV29TipArtCodto) > 0 )
      {
         AV29TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29TipArtCodto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TipArtCodto), 4, 0));
      }
      else
      {
         AV29TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29TipArtCodto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11BarSerfrom = httpContext.cgiGet( sPrefix+"AV11BarSerfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV11BarSerfrom) > 0 )
      {
         AV11BarSerfrom = httpContext.cgiGet( sCtrlAV11BarSerfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11BarSerfrom", AV11BarSerfrom);
      }
      else
      {
         AV11BarSerfrom = httpContext.cgiGet( sPrefix+"AV11BarSerfrom_PARM") ;
      }
      sCtrlAV12BarSerto = httpContext.cgiGet( sPrefix+"AV12BarSerto_CTRL") ;
      if ( GXutil.len( sCtrlAV12BarSerto) > 0 )
      {
         AV12BarSerto = httpContext.cgiGet( sCtrlAV12BarSerto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12BarSerto", AV12BarSerto);
      }
      else
      {
         AV12BarSerto = httpContext.cgiGet( sPrefix+"AV12BarSerto_PARM") ;
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
      pa26D2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws26D2( ) ;
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
      ws26D2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Data_json_PARM", AV33Data_json);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Data_json)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Data_json_CTRL", GXutil.rtrim( sCtrlAV33Data_json));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15CliCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV15CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15CliCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15CliCodfrom_CTRL", GXutil.rtrim( sCtrlAV15CliCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16CliCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV16CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16CliCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16CliCodto_CTRL", GXutil.rtrim( sCtrlAV16CliCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarFecClifrom_PARM", localUtil.dtoc( AV9BarFecClifrom, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9BarFecClifrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9BarFecClifrom_CTRL", GXutil.rtrim( sCtrlAV9BarFecClifrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarFecClito_PARM", localUtil.dtoc( AV10BarFecClito, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10BarFecClito)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10BarFecClito_CTRL", GXutil.rtrim( sCtrlAV10BarFecClito));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarSitfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV13BarSitfrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13BarSitfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13BarSitfrom_CTRL", GXutil.rtrim( sCtrlAV13BarSitfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarSitto_PARM", GXutil.ltrim( localUtil.ntoc( AV14BarSitto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14BarSitto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14BarSitto_CTRL", GXutil.rtrim( sCtrlAV14BarSitto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28TipArtCodfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV28TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28TipArtCodfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28TipArtCodfrom_CTRL", GXutil.rtrim( sCtrlAV28TipArtCodfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29TipArtCodto_PARM", GXutil.ltrim( localUtil.ntoc( AV29TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29TipArtCodto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29TipArtCodto_CTRL", GXutil.rtrim( sCtrlAV29TipArtCodto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarSerfrom_PARM", GXutil.rtrim( AV11BarSerfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11BarSerfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11BarSerfrom_CTRL", GXutil.rtrim( sCtrlAV11BarSerfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSerto_PARM", GXutil.rtrim( AV12BarSerto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12BarSerto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12BarSerto_CTRL", GXutil.rtrim( sCtrlAV12BarSerto));
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
      we26D2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552161", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/rmod008_consulta.js", "?202682115552162", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_342( )
   {
      edtavRmod008_sdt__clicod_Internalname = sPrefix+"RMOD008_SDT__CLICOD_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__clinom_Internalname = sPrefix+"RMOD008_SDT__CLINOM_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__saldo_k_Internalname = sPrefix+"RMOD008_SDT__SALDO_K_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__saldo_m_Internalname = sPrefix+"RMOD008_SDT__SALDO_M_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__tot_p_Internalname = sPrefix+"RMOD008_SDT__TOT_P_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__tot_t_Internalname = sPrefix+"RMOD008_SDT__TOT_T_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__tot_a_Internalname = sPrefix+"RMOD008_SDT__TOT_A_"+sGXsfl_34_idx ;
      edtavRmod008_sdt__tot_l_Internalname = sPrefix+"RMOD008_SDT__TOT_L_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      edtavRmod008_sdt__clicod_Internalname = sPrefix+"RMOD008_SDT__CLICOD_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__clinom_Internalname = sPrefix+"RMOD008_SDT__CLINOM_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__saldo_k_Internalname = sPrefix+"RMOD008_SDT__SALDO_K_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__saldo_m_Internalname = sPrefix+"RMOD008_SDT__SALDO_M_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__tot_p_Internalname = sPrefix+"RMOD008_SDT__TOT_P_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__tot_t_Internalname = sPrefix+"RMOD008_SDT__TOT_T_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__tot_a_Internalname = sPrefix+"RMOD008_SDT__TOT_A_"+sGXsfl_34_fel_idx ;
      edtavRmod008_sdt__tot_l_Internalname = sPrefix+"RMOD008_SDT__TOT_L_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb26D0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_34_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_34_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_34_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__clinom_Internalname,GXutil.rtrim( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__saldo_k_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Saldo_k(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__saldo_k_Enabled!=0) ? localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Saldo_k(), "ZZZZZZZZ9.99") : localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Saldo_k(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__saldo_k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__saldo_k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__saldo_m_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Saldo_m(), (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__saldo_m_Enabled!=0) ? localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Saldo_m(), "ZZZZZZZZ9.99") : localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Saldo_m(), "ZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__saldo_m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRmod008_sdt__saldo_m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__tot_p_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_p(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__tot_p_Enabled!=0) ? localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_p(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_p(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__tot_p_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__tot_p_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__tot_t_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_t(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__tot_t_Enabled!=0) ? localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_t(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_t(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__tot_t_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__tot_t_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__tot_a_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_a(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__tot_a_Enabled!=0) ? localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_a(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_a(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__tot_a_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__tot_a_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRmod008_sdt__tot_l_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_l(), (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRmod008_sdt__tot_l_Enabled!=0) ? localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_l(), "ZZZZZZZZZ9.99") : localUtil.format( ((app.pedidosclientesindetalle.SdtRMOD008_SDT_Item)AV26RMOD008_SDT.elementAt(-1+AV59GXV1)).getgxTv_SdtRMOD008_SDT_Item_Tot_l(), "ZZZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRmod008_sdt__tot_l_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRmod008_sdt__tot_l_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes26D2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_34_idx = ((subGrid_Islastpage==1)&&(nGXsfl_34_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_34_idx+1) ;
         sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_342( ) ;
      }
      /* End function sendrow_342 */
   }

   public void startgridcontrol34( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"34\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preparado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preparado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tinte", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acabados", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__saldo_k_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__saldo_m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__tot_p_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__tot_t_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__tot_a_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRmod008_sdt__tot_l_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnpdf_win_Internalname = sPrefix+"BTNPDF_WIN" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavRmod008_sdt__clicod_Internalname = sPrefix+"RMOD008_SDT__CLICOD" ;
      edtavRmod008_sdt__clinom_Internalname = sPrefix+"RMOD008_SDT__CLINOM" ;
      edtavRmod008_sdt__saldo_k_Internalname = sPrefix+"RMOD008_SDT__SALDO_K" ;
      edtavRmod008_sdt__saldo_m_Internalname = sPrefix+"RMOD008_SDT__SALDO_M" ;
      edtavRmod008_sdt__tot_p_Internalname = sPrefix+"RMOD008_SDT__TOT_P" ;
      edtavRmod008_sdt__tot_t_Internalname = sPrefix+"RMOD008_SDT__TOT_T" ;
      edtavRmod008_sdt__tot_a_Internalname = sPrefix+"RMOD008_SDT__TOT_A" ;
      edtavRmod008_sdt__tot_l_Internalname = sPrefix+"RMOD008_SDT__TOT_L" ;
      edtavTotvalue_saldo_k_Internalname = sPrefix+"vTOTVALUE_SALDO_K" ;
      edtavTotvalue_tot_p_Internalname = sPrefix+"vTOTVALUE_TOT_P" ;
      edtavTotvalue_tot_t_Internalname = sPrefix+"vTOTVALUE_TOT_T" ;
      edtavTotvalue_tot_a_Internalname = sPrefix+"vTOTVALUE_TOT_A" ;
      edtavTotvalue_tot_l_Internalname = sPrefix+"vTOTVALUE_TOT_L" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
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
      edtavRmod008_sdt__tot_l_Jsonclick = "" ;
      edtavRmod008_sdt__tot_l_Enabled = 0 ;
      edtavRmod008_sdt__tot_a_Jsonclick = "" ;
      edtavRmod008_sdt__tot_a_Enabled = 0 ;
      edtavRmod008_sdt__tot_t_Jsonclick = "" ;
      edtavRmod008_sdt__tot_t_Enabled = 0 ;
      edtavRmod008_sdt__tot_p_Jsonclick = "" ;
      edtavRmod008_sdt__tot_p_Enabled = 0 ;
      edtavRmod008_sdt__saldo_m_Jsonclick = "" ;
      edtavRmod008_sdt__saldo_m_Enabled = 0 ;
      edtavRmod008_sdt__saldo_k_Jsonclick = "" ;
      edtavRmod008_sdt__saldo_k_Enabled = 0 ;
      edtavRmod008_sdt__clinom_Jsonclick = "" ;
      edtavRmod008_sdt__clinom_Enabled = 0 ;
      edtavRmod008_sdt__clicod_Jsonclick = "" ;
      edtavRmod008_sdt__clicod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_tot_l_Jsonclick = "" ;
      edtavTotvalue_tot_l_Enabled = 1 ;
      edtavTotvalue_tot_a_Jsonclick = "" ;
      edtavTotvalue_tot_a_Enabled = 1 ;
      edtavTotvalue_tot_t_Jsonclick = "" ;
      edtavTotvalue_tot_t_Enabled = 1 ;
      edtavTotvalue_tot_p_Jsonclick = "" ;
      edtavTotvalue_tot_p_Enabled = 1 ;
      edtavTotvalue_saldo_k_Jsonclick = "" ;
      edtavTotvalue_saldo_k_Enabled = 1 ;
      edtavRmod008_sdt__tot_l_Enabled = -1 ;
      edtavRmod008_sdt__tot_a_Enabled = -1 ;
      edtavRmod008_sdt__tot_t_Enabled = -1 ;
      edtavRmod008_sdt__tot_p_Enabled = -1 ;
      edtavRmod008_sdt__saldo_m_Enabled = -1 ;
      edtavRmod008_sdt__saldo_k_Enabled = -1 ;
      edtavRmod008_sdt__clinom_Enabled = -1 ;
      edtavRmod008_sdt__clicod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV37TotValue_Saldo_k',fld:'vTOTVALUE_SALDO_K',pic:''},{av:'AV39TotValue_Tot_p',fld:'vTOTVALUE_TOT_P',pic:''},{av:'AV41TotValue_Tot_t',fld:'vTOTVALUE_TOT_T',pic:''},{av:'AV43TotValue_Tot_a',fld:'vTOTVALUE_TOT_A',pic:''},{av:'AV45TotValue_Tot_l',fld:'vTOTVALUE_TOT_L',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1226D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1326D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1826D2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOPDF_WIN'","{handler:'e1126D1',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV16CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV9BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV10BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV13BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV14BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV28TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV29TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'}]");
      setEventMetadata("'DOPDF_WIN'",",oparms:[{av:'AV29TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV28TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV14BarSitto',fld:'vBARSITTO',pic:'Z9'},{av:'AV13BarSitfrom',fld:'vBARSITFROM',pic:'Z9'},{av:'AV10BarFecClito',fld:'vBARFECCLITO',pic:''},{av:'AV9BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV16CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV15CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1426D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'AV9BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV10BarFecClito',fld:'vBARFECCLITO',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV37TotValue_Saldo_k',fld:'vTOTVALUE_SALDO_K',pic:''},{av:'AV39TotValue_Tot_p',fld:'vTOTVALUE_TOT_P',pic:''},{av:'AV41TotValue_Tot_t',fld:'vTOTVALUE_TOT_T',pic:''},{av:'AV43TotValue_Tot_a',fld:'vTOTVALUE_TOT_A',pic:''},{av:'AV45TotValue_Tot_l',fld:'vTOTVALUE_TOT_L',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1526D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'AV9BarFecClifrom',fld:'vBARFECCLIFROM',pic:''},{av:'AV10BarFecClito',fld:'vBARFECCLITO',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV37TotValue_Saldo_k',fld:'vTOTVALUE_SALDO_K',pic:''},{av:'AV39TotValue_Tot_p',fld:'vTOTVALUE_TOT_P',pic:''},{av:'AV41TotValue_Tot_t',fld:'vTOTVALUE_TOT_T',pic:''},{av:'AV43TotValue_Tot_a',fld:'vTOTVALUE_TOT_A',pic:''},{av:'AV45TotValue_Tot_l',fld:'vTOTVALUE_TOT_L',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1926D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Data_json',fld:'vDATA_JSON',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'sPrefix'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'AV26RMOD008_SDT',fld:'vRMOD008_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36Tot_Saldo_k',fld:'vTOT_SALDO_K',pic:'ZZZZZZZZ9.99',hsh:true},{av:'AV38Tot_Tot_p',fld:'vTOT_TOT_P',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV40Tot_Tot_t',fld:'vTOT_TOT_T',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV42Tot_Tot_a',fld:'vTOT_TOT_A',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV44Tot_Tot_l',fld:'vTOT_TOT_L',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV37TotValue_Saldo_k',fld:'vTOTVALUE_SALDO_K',pic:''},{av:'AV39TotValue_Tot_p',fld:'vTOTVALUE_TOT_P',pic:''},{av:'AV41TotValue_Tot_t',fld:'vTOTVALUE_TOT_T',pic:''},{av:'AV43TotValue_Tot_a',fld:'vTOTVALUE_TOT_A',pic:''},{av:'AV45TotValue_Tot_l',fld:'vTOTVALUE_TOT_L',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv9',iparms:[]");
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
      wcpOAV33Data_json = "" ;
      wcpOAV9BarFecClifrom = GXutil.nullDate() ;
      wcpOAV10BarFecClito = GXutil.nullDate() ;
      wcpOAV11BarSerfrom = "" ;
      wcpOAV12BarSerto = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV33Data_json = "" ;
      AV9BarFecClifrom = GXutil.nullDate() ;
      AV10BarFecClito = GXutil.nullDate() ;
      AV11BarSerfrom = "" ;
      AV12BarSerto = "" ;
      AV68Pgmname = "" ;
      AV26RMOD008_SDT = new GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item>(app.pedidosclientesindetalle.SdtRMOD008_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV36Tot_Saldo_k = DecimalUtil.ZERO ;
      AV38Tot_Tot_p = DecimalUtil.ZERO ;
      AV40Tot_Tot_t = DecimalUtil.ZERO ;
      AV42Tot_Tot_a = DecimalUtil.ZERO ;
      AV44Tot_Tot_l = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnpdf_win_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV37TotValue_Saldo_k = "" ;
      AV39TotValue_Tot_p = "" ;
      AV41TotValue_Tot_t = "" ;
      AV43TotValue_Tot_a = "" ;
      AV45TotValue_Tot_l = "" ;
      hsh = "" ;
      AV34WebSession = httpContext.getWebSession();
      AV7Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV6EmprNom = "" ;
      AV8UsurCod = "" ;
      AV32WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV18ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV17ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV27Session = httpContext.getWebSession();
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35RMOD008_SDTItem = new app.pedidosclientesindetalle.SdtRMOD008_SDT_Item(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV33Data_json = "" ;
      sCtrlAV15CliCodfrom = "" ;
      sCtrlAV16CliCodto = "" ;
      sCtrlAV9BarFecClifrom = "" ;
      sCtrlAV10BarFecClito = "" ;
      sCtrlAV13BarSitfrom = "" ;
      sCtrlAV14BarSitto = "" ;
      sCtrlAV28TipArtCodfrom = "" ;
      sCtrlAV29TipArtCodto = "" ;
      sCtrlAV11BarSerfrom = "" ;
      sCtrlAV12BarSerto = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV68Pgmname = "PedidosClienteSinDetalle.RMOD008_Consulta" ;
      /* GeneXus formulas. */
      AV68Pgmname = "PedidosClienteSinDetalle.RMOD008_Consulta" ;
      Gx_err = (short)(0) ;
      edtavRmod008_sdt__clicod_Enabled = 0 ;
      edtavRmod008_sdt__clinom_Enabled = 0 ;
      edtavRmod008_sdt__saldo_k_Enabled = 0 ;
      edtavRmod008_sdt__saldo_m_Enabled = 0 ;
      edtavRmod008_sdt__tot_p_Enabled = 0 ;
      edtavRmod008_sdt__tot_t_Enabled = 0 ;
      edtavRmod008_sdt__tot_a_Enabled = 0 ;
      edtavRmod008_sdt__tot_l_Enabled = 0 ;
      edtavTotvalue_saldo_k_Enabled = 0 ;
      edtavTotvalue_tot_p_Enabled = 0 ;
      edtavTotvalue_tot_t_Enabled = 0 ;
      edtavTotvalue_tot_a_Enabled = 0 ;
      edtavTotvalue_tot_l_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV13BarSitfrom ;
   private byte wcpOAV14BarSitto ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV13BarSitfrom ;
   private byte AV14BarSitto ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV28TipArtCodfrom ;
   private short wcpOAV29TipArtCodto ;
   private short AV28TipArtCodfrom ;
   private short AV29TipArtCodto ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV15CliCodfrom ;
   private int wcpOAV16CliCodto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_34 ;
   private int AV15CliCodfrom ;
   private int AV16CliCodto ;
   private int nGXsfl_34_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV59GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavRmod008_sdt__clicod_Enabled ;
   private int edtavRmod008_sdt__clinom_Enabled ;
   private int edtavRmod008_sdt__saldo_k_Enabled ;
   private int edtavRmod008_sdt__saldo_m_Enabled ;
   private int edtavRmod008_sdt__tot_p_Enabled ;
   private int edtavRmod008_sdt__tot_t_Enabled ;
   private int edtavRmod008_sdt__tot_a_Enabled ;
   private int edtavRmod008_sdt__tot_l_Enabled ;
   private int edtavTotvalue_saldo_k_Enabled ;
   private int edtavTotvalue_tot_p_Enabled ;
   private int edtavTotvalue_tot_t_Enabled ;
   private int edtavTotvalue_tot_a_Enabled ;
   private int edtavTotvalue_tot_l_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_34_fel_idx=1 ;
   private int AV25PageToGo ;
   private int nGXsfl_34_bak_idx=1 ;
   private int AV69GXV10 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV19GridCurrentPage ;
   private long AV20GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV36Tot_Saldo_k ;
   private java.math.BigDecimal AV38Tot_Tot_p ;
   private java.math.BigDecimal AV40Tot_Tot_t ;
   private java.math.BigDecimal AV42Tot_Tot_a ;
   private java.math.BigDecimal AV44Tot_Tot_l ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV11BarSerfrom ;
   private String wcpOAV12BarSerto ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String AV11BarSerfrom ;
   private String AV12BarSerto ;
   private String sGXsfl_34_idx="0001" ;
   private String AV68Pgmname ;
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
   private String bttBtnpdf_win_Internalname ;
   private String bttBtnpdf_win_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvalue_saldo_k_Internalname ;
   private String edtavRmod008_sdt__clicod_Internalname ;
   private String edtavRmod008_sdt__clinom_Internalname ;
   private String edtavRmod008_sdt__saldo_k_Internalname ;
   private String edtavRmod008_sdt__saldo_m_Internalname ;
   private String edtavRmod008_sdt__tot_p_Internalname ;
   private String edtavRmod008_sdt__tot_t_Internalname ;
   private String edtavRmod008_sdt__tot_a_Internalname ;
   private String edtavRmod008_sdt__tot_l_Internalname ;
   private String edtavTotvalue_tot_p_Internalname ;
   private String edtavTotvalue_tot_t_Internalname ;
   private String edtavTotvalue_tot_a_Internalname ;
   private String edtavTotvalue_tot_l_Internalname ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String hsh ;
   private String AV7Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV6EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_saldo_k_Jsonclick ;
   private String edtavTotvalue_tot_p_Jsonclick ;
   private String edtavTotvalue_tot_t_Jsonclick ;
   private String edtavTotvalue_tot_a_Jsonclick ;
   private String edtavTotvalue_tot_l_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV33Data_json ;
   private String sCtrlAV15CliCodfrom ;
   private String sCtrlAV16CliCodto ;
   private String sCtrlAV9BarFecClifrom ;
   private String sCtrlAV10BarFecClito ;
   private String sCtrlAV13BarSitfrom ;
   private String sCtrlAV14BarSitto ;
   private String sCtrlAV28TipArtCodfrom ;
   private String sCtrlAV29TipArtCodto ;
   private String sCtrlAV11BarSerfrom ;
   private String sCtrlAV12BarSerto ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavRmod008_sdt__clicod_Jsonclick ;
   private String edtavRmod008_sdt__clinom_Jsonclick ;
   private String edtavRmod008_sdt__saldo_k_Jsonclick ;
   private String edtavRmod008_sdt__saldo_m_Jsonclick ;
   private String edtavRmod008_sdt__tot_p_Jsonclick ;
   private String edtavRmod008_sdt__tot_t_Jsonclick ;
   private String edtavRmod008_sdt__tot_a_Jsonclick ;
   private String edtavRmod008_sdt__tot_l_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV9BarFecClifrom ;
   private java.util.Date wcpOAV10BarFecClito ;
   private java.util.Date AV9BarFecClifrom ;
   private java.util.Date AV10BarFecClito ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_34_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV34 ;
   private String wcpOAV33Data_json ;
   private String AV33Data_json ;
   private String AV37TotValue_Saldo_k ;
   private String AV39TotValue_Tot_p ;
   private String AV41TotValue_Tot_t ;
   private String AV43TotValue_Tot_a ;
   private String AV45TotValue_Tot_l ;
   private String AV18ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV34WebSession ;
   private GXBaseCollection<app.pedidosclientesindetalle.SdtRMOD008_SDT_Item> AV26RMOD008_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.pedidosclientesindetalle.SdtRMOD008_SDT_Item AV35RMOD008_SDTItem ;
   private app.wwpbaseobjects.SdtWWPContext AV32WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

