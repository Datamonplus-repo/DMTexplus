package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class precios_cliente_informe__wc_impl extends GXWebComponent
{
   public precios_cliente_informe__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public precios_cliente_informe__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( precios_cliente_informe__wc_impl.class ));
   }

   public precios_cliente_informe__wc_impl( int remoteHandle ,
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
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar = UIFactory.getCheckbox(this);
      chkavMail = UIFactory.getCheckbox(this);
      chkavVermail = UIFactory.getCheckbox(this);
      chkavPrecios_cliente_informe_sdt__seleccionar = UIFactory.getCheckbox(this);
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
               AV26EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
               AV22CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
               AV23CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliNom", AV23CliNom);
               AV34fortonalfrom = httpContext.GetPar( "fortonalfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34fortonalfrom", AV34fortonalfrom);
               AV35fortonalto = httpContext.GetPar( "fortonalto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35fortonalto", AV35fortonalto);
               AV36Forcolnumfrom = (int)(GXutil.lval( httpContext.GetPar( "Forcolnumfrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Forcolnumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Forcolnumfrom), 6, 0));
               AV37forcolnumto = (int)(GXutil.lval( httpContext.GetPar( "forcolnumto"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37forcolnumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37forcolnumto), 6, 0));
               AV42CliMailGr = httpContext.GetPar( "CliMailGr") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliMailGr", AV42CliMailGr);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV26EmprCod,Integer.valueOf(AV22CliCod),AV23CliNom,AV34fortonalfrom,AV35fortonalto,Integer.valueOf(AV36Forcolnumfrom),Integer.valueOf(AV37forcolnumto),AV42CliMailGr});
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
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridprecios_cliente_mailsclientes_sdts") == 0 )
            {
               gxnrgridprecios_cliente_mailsclientes_sdts_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridprecios_cliente_mailsclientes_sdts") == 0 )
            {
               gxgrgridprecios_cliente_mailsclientes_sdts_refresh_invoke( ) ;
               return  ;
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

   public void gxnrgridprecios_cliente_mailsclientes_sdts_newrow_invoke( )
   {
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridprecios_cliente_mailsclientes_sdts_newrow( ) ;
      /* End function gxnrGridprecios_cliente_mailsclientes_sdts_newrow_invoke */
   }

   public void gxgrgridprecios_cliente_mailsclientes_sdts_refresh_invoke( )
   {
      subGridprecios_cliente_mailsclientes_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridprecios_cliente_mailsclientes_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV94Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17Mail = (byte)(GXutil.lval( httpContext.GetPar( "Mail"))) ;
      AV18Vermail = GXutil.strtobool( httpContext.GetPar( "Vermail")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV71Precios_cliente_mailsclientes_SDT);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12Precios_cliente_Informe_SDT);
      AV40strDate = httpContext.GetPar( "strDate") ;
      AV48PATHPDF = httpContext.GetPar( "PATHPDF") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridprecios_cliente_mailsclientes_sdts_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridprecios_cliente_mailsclientes_sdts_refresh_invoke */
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_74 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_74"))) ;
      nGXsfl_74_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_74_idx"))) ;
      sGXsfl_74_idx = httpContext.GetPar( "sGXsfl_74_idx") ;
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
      subGridprecios_cliente_mailsclientes_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridprecios_cliente_mailsclientes_sdts_Rows"))) ;
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV94Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17Mail = (byte)(GXutil.lval( httpContext.GetPar( "Mail"))) ;
      AV18Vermail = GXutil.strtobool( httpContext.GetPar( "Vermail")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV71Precios_cliente_mailsclientes_SDT);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12Precios_cliente_Informe_SDT);
      AV40strDate = httpContext.GetPar( "strDate") ;
      AV48PATHPDF = httpContext.GetPar( "PATHPDF") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2432( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Precios_cliente_Informe", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.precios_cliente_informe__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV22CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV23CliNom)),GXutil.URLEncode(GXutil.rtrim(AV34fortonalfrom)),GXutil.URLEncode(GXutil.rtrim(AV35fortonalto)),GXutil.URLEncode(GXutil.ltrimstr(AV36Forcolnumfrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37forcolnumto,6,0)),GXutil.URLEncode(GXutil.rtrim(AV42CliMailGr))}, new String[] {"EmprCod","CliCod","CliNom","fortonalfrom","fortonalto","Forcolnumfrom","forcolnumto","CliMailGr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTRDATE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV40strDate, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRECIOS_CLIENTE_INFORME_SDT", getSecureSignedToken( sPrefix, AV12Precios_cliente_Informe_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", getSecureSignedToken( sPrefix, AV71Precios_cliente_mailsclientes_SDT));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_Informe__WC");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV48PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precios_cliente_informe__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Precios_cliente_mailsclientes_sdt", AV71Precios_cliente_mailsclientes_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Precios_cliente_mailsclientes_sdt", AV71Precios_cliente_mailsclientes_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Precios_cliente_mailsclientes_sdt", getSecureSignedToken( sPrefix, AV71Precios_cliente_mailsclientes_SDT));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Precios_cliente_informe_sdt", AV12Precios_cliente_Informe_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Precios_cliente_informe_sdt", AV12Precios_cliente_Informe_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Precios_cliente_informe_sdt", getSecureSignedToken( sPrefix, AV12Precios_cliente_Informe_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV78GridPrecios_cliente_mailsclientes_SDTsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26EmprCod", GXutil.rtrim( wcpOAV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23CliNom", GXutil.rtrim( wcpOAV23CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34fortonalfrom", GXutil.rtrim( wcpOAV34fortonalfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35fortonalto", GXutil.rtrim( wcpOAV35fortonalto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Forcolnumfrom", GXutil.ltrim( localUtil.ntoc( wcpOAV36Forcolnumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37forcolnumto", GXutil.ltrim( localUtil.ntoc( wcpOAV37forcolnumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42CliMailGr", GXutil.rtrim( wcpOAV42CliMailGr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vACTUALIZADACLIMAILPR", GXutil.rtrim( AV79ActualizadaClimailPr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTRDATE", AV40strDate);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTRDATE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV40strDate, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDT_MERGEPDF", AV53Sdt_MergePDF);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDT_MERGEPDF", AV53Sdt_MergePDF);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_INFORME_SDT", AV12Precios_cliente_Informe_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_INFORME_SDT", AV12Precios_cliente_Informe_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRECIOS_CLIENTE_INFORME_SDT", getSecureSignedToken( sPrefix, AV12Precios_cliente_Informe_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", AV71Precios_cliente_mailsclientes_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", AV71Precios_cliente_mailsclientes_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", getSecureSignedToken( sPrefix, AV71Precios_cliente_mailsclientes_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORTONALFROM", GXutil.rtrim( AV34fortonalfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORTONALTO", GXutil.rtrim( AV35fortonalto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUMFROM", GXutil.ltrim( localUtil.ntoc( AV36Forcolnumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV37forcolnumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLIMAILGR", GXutil.rtrim( AV42CliMailGr));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT_ITEM", AV72Precios_cliente_mailsclientes_SDT_item);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT_ITEM", AV72Precios_cliente_mailsclientes_SDT_item);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV14", GXutil.ltrim( localUtil.ntoc( AV99GXV14, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSEPARADOR", GXutil.rtrim( AV73Separador));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Class", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Previous", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Next", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Caption", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2432( )
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
      return "Facturacion.Precios_cliente_Informe__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Precios_cliente_Informe", "") ;
   }

   public void wb2430( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.precios_cliente_informe__wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nome", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV23CliNom), GXutil.rtrim( localUtil.format( AV23CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDestino_Internalname, httpContext.getMessage( "Ex.mo(s) Senhor(s)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDestino_Internalname, GXutil.rtrim( AV20Destino), GXutil.rtrim( localUtil.format( AV20Destino, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDestino_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClimailpr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClimailpr_Internalname, httpContext.getMessage( "E-mail Precios Facturacion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClimailpr_Internalname, GXutil.rtrim( AV21ClimailPr), GXutil.rtrim( localUtil.format( AV21ClimailPr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClimailpr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClimailpr_Enabled, 0, "text", "", 100, "%", 1, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridprecios_cliente_mailsclientes_sdtstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridprecios_cliente_mailsclientes_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
         if ( Gridprecios_cliente_mailsclientes_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV82GXV1 = nGXsfl_39_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridprecios_cliente_mailsclientes_sdts", Gridprecios_cliente_mailsclientes_sdtsContainer, subGridprecios_cliente_mailsclientes_sdts_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainerData", Gridprecios_cliente_mailsclientes_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainerData"+"V", Gridprecios_cliente_mailsclientes_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainerData"+"V"+"\" value='"+Gridprecios_cliente_mailsclientes_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("Class", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Class);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("ShowFirst", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showfirst);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("ShowPrevious", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showprevious);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("ShowNext", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Shownext);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("ShowLast", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showlast);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("PagesToShow", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagestoshow);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("PagingButtonsPosition", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingbuttonsposition);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("PagingCaptionPosition", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingcaptionposition);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("EmptyGridClass", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridclass);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("RowsPerPageSelector", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselector);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("RowsPerPageOptions", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageoptions);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("Previous", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Previous);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("Next", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Next);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("Caption", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Caption);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("EmptyGridCaption", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridcaption);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("RowsPerPageCaption", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpagecaption);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("CurrentPage", AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.setProperty("PageCount", AV78GridPrecios_cliente_mailsclientes_SDTsPageCount);
         ucGridprecios_cliente_mailsclientes_sdtspaginationbar.render(context, "dvelop.dvpaginationbar", Gridprecios_cliente_mailsclientes_sdtspaginationbar_Internalname, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavMail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavMail.getInternalname(), httpContext.getMessage( "Enviar e-mail?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavMail.getInternalname(), GXutil.str( AV17Mail, 1, 0), "", httpContext.getMessage( "Enviar e-mail?", ""), 1, chkavMail.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(52, this, 1, 0,"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVermail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVermail.getInternalname(), httpContext.getMessage( "Veja a ecran de envio de correio?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV18Vermail), "", httpContext.getMessage( "Veja a ecran de envio de correio?", ""), 1, chkavVermail.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(56, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,56);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV48PATHPDF), GXutil.rtrim( localUtil.format( AV48PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
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
         startgridcontrol74( ) ;
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (int)(nGXsfl_74_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV85GXV4 = nGXsfl_74_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV94Pgmname), GXutil.rtrim( localUtil.format( AV94Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Precios_cliente_Informe__WC.htm");
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
         /* User Defined Control */
         ucGridprecios_cliente_mailsclientes_sdts_empowerer.render(context, "wwp.gridempowerer", Gridprecios_cliente_mailsclientes_sdts_empowerer_Internalname, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridprecios_cliente_mailsclientes_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV82GXV1 = nGXsfl_39_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridprecios_cliente_mailsclientes_sdts", Gridprecios_cliente_mailsclientes_sdtsContainer, subGridprecios_cliente_mailsclientes_sdts_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainerData", Gridprecios_cliente_mailsclientes_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainerData"+"V", Gridprecios_cliente_mailsclientes_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainerData"+"V"+"\" value='"+Gridprecios_cliente_mailsclientes_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 74 )
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
               AV85GXV4 = nGXsfl_74_idx ;
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

   public void start2432( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Precios_cliente_Informe", ""), (short)(0)) ;
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
            strup2430( ) ;
         }
      }
   }

   public void ws2432( )
   {
      start2432( ) ;
      evt2432( ) ;
   }

   public void evt2432( )
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
                              strup2430( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112432 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122432 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132432 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142432 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoImprimir' */
                                 e152432 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDestino_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           AV82GXV1 = (int)(nGXsfl_39_idx+GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage) ;
                           if ( ( AV71Precios_cliente_mailsclientes_SDT.size() >= AV82GXV1 ) && ( AV82GXV1 > 0 ) )
                           {
                              AV71Precios_cliente_mailsclientes_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)AV71Precios_cliente_mailsclientes_SDT.elementAt(-1+AV82GXV1)) );
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
                                       GX_FocusControl = edtavDestino_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e162432 ();
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
                                       GX_FocusControl = edtavDestino_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e172432 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDestino_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e182432 ();
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
                                    strup2430( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDestino_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2430( ) ;
                           }
                           nGXsfl_74_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_745( ) ;
                           AV85GXV4 = (int)(nGXsfl_74_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12Precios_cliente_Informe_SDT.size() >= AV85GXV4 ) && ( AV85GXV4 > 0 ) )
                           {
                              AV12Precios_cliente_Informe_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)) );
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDestino_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e192435 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup2430( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDestino_Internalname ;
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

   public void we2432( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2432( ) ;
         }
      }
   }

   public void pa2432( )
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
            GX_FocusControl = edtavDestino_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridprecios_cliente_mailsclientes_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGridprecios_cliente_mailsclientes_sdts_Islastpage==1)&&(nGXsfl_39_idx+1>subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridprecios_cliente_mailsclientes_sdtsContainer)) ;
      /* End function gxnrGridprecios_cliente_mailsclientes_sdts_newrow */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_745( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_745( ) ;
         nGXsfl_74_idx = ((subGrid_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_745( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgridprecios_cliente_mailsclientes_sdts_refresh( int subGridprecios_cliente_mailsclientes_sdts_Rows ,
                                                                   int subGrid_Rows ,
                                                                   String AV94Pgmname ,
                                                                   byte AV17Mail ,
                                                                   boolean AV18Vermail ,
                                                                   GXBaseCollection<app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item> AV71Precios_cliente_mailsclientes_SDT ,
                                                                   GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> AV12Precios_cliente_Informe_SDT ,
                                                                   String AV40strDate ,
                                                                   String AV48PATHPDF ,
                                                                   String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172432 ();
      GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord = 0 ;
      rf2432( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_Informe__WC");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV48PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precios_cliente_informe__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGridprecios_cliente_mailsclientes_sdts_refresh */
   }

   public void gxgrgrid_refresh( int subGridprecios_cliente_mailsclientes_sdts_Rows ,
                                 int subGrid_Rows ,
                                 String AV94Pgmname ,
                                 byte AV17Mail ,
                                 boolean AV18Vermail ,
                                 GXBaseCollection<app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item> AV71Precios_cliente_mailsclientes_SDT ,
                                 GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> AV12Precios_cliente_Informe_SDT ,
                                 String AV40strDate ,
                                 String AV48PATHPDF ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172432 ();
      GRID_nCurrentRecord = 0 ;
      rf2435( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_Informe__WC");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV48PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\precios_cliente_informe__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      AV17Mail = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV17Mail, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Mail", GXutil.str( AV17Mail, 1, 0));
      AV18Vermail = GXutil.strtobool( GXutil.booltostr( AV18Vermail)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Vermail", AV18Vermail);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2432( ) ;
      rf2435( ) ;
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
      AV94Pgmname = "Facturacion.Precios_cliente_Informe__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavClimailpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClimailpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClimailpr_Enabled), 5, 0), true);
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavPrecios_cliente_informe_sdt__fortonal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__fortonal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__fortonal_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__artdsc_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__forprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__forprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__forprekgm_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2432( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridprecios_cliente_mailsclientes_sdtsContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e172432 ();
      nGXsfl_39_idx = 1 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("GridName", "Gridprecios_cliente_mailsclientes_sdts");
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("CmpContext", sPrefix);
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridprecios_cliente_mailsclientes_sdtsContainer.setPageSize( subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_392( ) ;
         e182432 ();
         if ( ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord > 0 ) && ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_39_idx == 1 ) )
         {
            GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord = 0 ;
            GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nGridOutOfScope = 1 ;
            subgridprecios_cliente_mailsclientes_sdts_firstpage( ) ;
            e182432 ();
         }
         wbEnd = (short)(39) ;
         wb2430( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2432( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTRDATE", AV40strDate);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTRDATE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV40strDate, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_INFORME_SDT", AV12Precios_cliente_Informe_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_INFORME_SDT", AV12Precios_cliente_Informe_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRECIOS_CLIENTE_INFORME_SDT", getSecureSignedToken( sPrefix, AV12Precios_cliente_Informe_SDT));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", AV71Precios_cliente_mailsclientes_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", AV71Precios_cliente_mailsclientes_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPRECIOS_CLIENTE_MAILSCLIENTES_SDT", getSecureSignedToken( sPrefix, AV71Precios_cliente_mailsclientes_SDT));
   }

   public void rf2435( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = 1 ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_745( ) ;
      bGXsfl_74_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_745( ) ;
         e192435 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_74_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e192435 ();
         }
         wbEnd = (short)(74) ;
         wb2430( ) ;
      }
      bGXsfl_74_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2435( )
   {
   }

   public int subgridprecios_cliente_mailsclientes_sdts_fnc_pagecount( )
   {
      GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount = subgridprecios_cliente_mailsclientes_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount) % (subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount/ (double) (subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount/ (double) (subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridprecios_cliente_mailsclientes_sdts_fnc_recordcount( )
   {
      return AV71Precios_cliente_mailsclientes_SDT.size() ;
   }

   public int subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )
   {
      if ( subGridprecios_cliente_mailsclientes_sdts_Rows > 0 )
      {
         return subGridprecios_cliente_mailsclientes_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridprecios_cliente_mailsclientes_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage/ (double) (subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridprecios_cliente_mailsclientes_sdts_firstpage( )
   {
      GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridprecios_cliente_mailsclientes_sdts_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridprecios_cliente_mailsclientes_sdts_nextpage( )
   {
      GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount = subgridprecios_cliente_mailsclientes_sdts_fnc_recordcount( ) ;
      if ( ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount >= subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ) ) && ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF == 0 ) )
      {
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = (long)(GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage+subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridprecios_cliente_mailsclientes_sdts_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridprecios_cliente_mailsclientes_sdts_previouspage( )
   {
      if ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage >= subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ) )
      {
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = (long)(GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage-subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridprecios_cliente_mailsclientes_sdts_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridprecios_cliente_mailsclientes_sdts_lastpage( )
   {
      GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount = subgridprecios_cliente_mailsclientes_sdts_fnc_recordcount( ) ;
      if ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount > subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount) % (subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = (long)(GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount-subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = (long)(GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount-((int)((GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount) % (subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridprecios_cliente_mailsclientes_sdts_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridprecios_cliente_mailsclientes_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = (long)(subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridprecios_cliente_mailsclientes_sdts_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
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
      return AV12Precios_cliente_Informe_SDT.size() ;
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
         gxgrgrid_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
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
         gxgrgrid_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
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
         gxgrgrid_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
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
         gxgrgrid_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
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
         gxgrgrid_refresh( subGridprecios_cliente_mailsclientes_sdts_Rows, subGrid_Rows, AV94Pgmname, AV17Mail, AV18Vermail, AV71Precios_cliente_mailsclientes_SDT, AV12Precios_cliente_Informe_SDT, AV40strDate, AV48PATHPDF, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "Facturacion.Precios_cliente_Informe__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Pgmname", AV94Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavClimailpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClimailpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClimailpr_Enabled), 5, 0), true);
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavPrecios_cliente_informe_sdt__fortonal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__fortonal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__fortonal_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__artdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__artdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__artdsc_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__fornomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__fornomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__fornomcli_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__forcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__forcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__forcolnom_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__forcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__forcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__forcolnum_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPrecios_cliente_informe_sdt__forprekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrecios_cliente_informe_sdt__forprekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrecios_cliente_informe_sdt__forprekgm_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2430( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162432 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Precios_cliente_mailsclientes_sdt"), AV71Precios_cliente_mailsclientes_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Precios_cliente_informe_sdt"), AV12Precios_cliente_Informe_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT"), AV71Precios_cliente_mailsclientes_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPRECIOS_CLIENTE_INFORME_SDT"), AV12Precios_cliente_Informe_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPRECIOS_CLIENTE_MAILSCLIENTES_SDT_ITEM"), AV72Precios_cliente_mailsclientes_SDT_item);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_74 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_74"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV78GridPrecios_cliente_mailsclientes_SDTsPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV26EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV26EmprCod") ;
         wcpOAV22CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV23CliNom = httpContext.cgiGet( sPrefix+"wcpOAV23CliNom") ;
         wcpOAV34fortonalfrom = httpContext.cgiGet( sPrefix+"wcpOAV34fortonalfrom") ;
         wcpOAV35fortonalto = httpContext.cgiGet( sPrefix+"wcpOAV35fortonalto") ;
         wcpOAV36Forcolnumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Forcolnumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37forcolnumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37forcolnumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42CliMailGr = httpContext.cgiGet( sPrefix+"wcpOAV42CliMailGr") ;
         AV99GXV14 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV14"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV79ActualizadaClimailPr = httpContext.cgiGet( sPrefix+"vACTUALIZADACLIMAILPR") ;
         AV73Separador = httpContext.cgiGet( sPrefix+"vSEPARADOR") ;
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridprecios_cliente_mailsclientes_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Class") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Showfirst")) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Showprevious")) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Shownext")) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Showlast")) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Emptygridclass") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Previous") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Next") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Caption") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Emptygridcaption") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpagecaption") ;
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
         Gridprecios_cliente_mailsclientes_sdts_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Selectedpage") ;
         Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_39_fel_idx = 0 ;
         while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
         {
            nGXsfl_39_fel_idx = ((subGridprecios_cliente_mailsclientes_sdts_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
            sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_392( ) ;
            AV82GXV1 = (int)(nGXsfl_39_fel_idx+GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage) ;
            if ( ( AV71Precios_cliente_mailsclientes_SDT.size() >= AV82GXV1 ) && ( AV82GXV1 > 0 ) )
            {
               AV71Precios_cliente_mailsclientes_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)AV71Precios_cliente_mailsclientes_SDT.elementAt(-1+AV82GXV1)) );
            }
         }
         if ( nGXsfl_39_fel_idx == 0 )
         {
            nGXsfl_39_idx = 1 ;
            sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_392( ) ;
         }
         nGXsfl_39_fel_idx = 1 ;
         nRC_GXsfl_74 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_74"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_74_fel_idx = 0 ;
         while ( nGXsfl_74_fel_idx < nRC_GXsfl_74 )
         {
            nGXsfl_74_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_74_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_74_fel_idx+1) ;
            sGXsfl_74_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_745( ) ;
            AV85GXV4 = (int)(nGXsfl_74_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12Precios_cliente_Informe_SDT.size() >= AV85GXV4 ) && ( AV85GXV4 > 0 ) )
            {
               AV12Precios_cliente_Informe_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)) );
            }
         }
         if ( nGXsfl_74_fel_idx == 0 )
         {
            nGXsfl_74_idx = 1 ;
            sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_745( ) ;
         }
         nGXsfl_74_fel_idx = 1 ;
         /* Read variables values. */
         AV20Destino = httpContext.cgiGet( edtavDestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Destino", AV20Destino);
         AV21ClimailPr = httpContext.cgiGet( edtavClimailpr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ClimailPr", AV21ClimailPr);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAIL");
            GX_FocusControl = chkavMail.getInternalname() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17Mail = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Mail", GXutil.str( AV17Mail, 1, 0));
         }
         else
         {
            AV17Mail = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Mail", GXutil.str( AV17Mail, 1, 0));
         }
         AV18Vermail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Vermail", AV18Vermail);
         AV48PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48PATHPDF", AV48PATHPDF);
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Pgmname", AV94Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"Precios_cliente_Informe__WC");
         AV48PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48PATHPDF", AV48PATHPDF);
         forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV48PATHPDF, "")));
         AV94Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94Pgmname", AV94Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV94Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\precios_cliente_informe__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
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
      e162432 ();
      if (returnInSub) return;
   }

   public void e162432( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV29CliTipo = "" ;
      /* Using cursor H02432 */
      pr_default.execute(0, new Object[] {AV26EmprCod, Integer.valueOf(AV22CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = H02432_A252CliCod[0] ;
         A396EmprCod = H02432_A396EmprCod[0] ;
         A5648CliTipo = H02432_A5648CliTipo[0] ;
         A279CliNom = H02432_A279CliNom[0] ;
         A11701ClimailPr = H02432_A11701ClimailPr[0] ;
         A11702CliPerPr = H02432_A11702CliPerPr[0] ;
         AV29CliTipo = A5648CliTipo ;
         AV23CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliNom", AV23CliNom);
         AV21ClimailPr = A11701ClimailPr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ClimailPr", AV21ClimailPr);
         AV24cliperpr = A11702CliPerPr ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV71Precios_cliente_mailsclientes_SDT.clear();
      gx_BV39 = true ;
      AV79ActualizadaClimailPr = AV21ClimailPr ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79ActualizadaClimailPr", AV79ActualizadaClimailPr);
      AV62aux_Climailpr = AV21ClimailPr ;
      AV68pos = (short)(1) ;
      while ( GXutil.strcmp(AV62aux_Climailpr, "") != 0 )
      {
         AV68pos = (short)(GXutil.strSearch( AV62aux_Climailpr, ";", 1)) ;
         if ( AV68pos > 0 )
         {
            AV67Mail_Climailpr = GXutil.substring( AV62aux_Climailpr, 1, AV68pos-1) ;
            AV62aux_Climailpr = GXutil.substring( AV62aux_Climailpr, AV68pos+1, -1) ;
         }
         else
         {
            AV67Mail_Climailpr = AV62aux_Climailpr ;
            AV62aux_Climailpr = "" ;
         }
         if ( ! (GXutil.strcmp("", AV67Mail_Climailpr)==0) )
         {
            AV72Precios_cliente_mailsclientes_SDT_item = (app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)new app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item(remoteHandle, context);
            AV72Precios_cliente_mailsclientes_SDT_item.setgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar( true );
            AV72Precios_cliente_mailsclientes_SDT_item.setgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente( GXutil.trim( AV67Mail_Climailpr) );
            AV71Precios_cliente_mailsclientes_SDT.add(AV72Precios_cliente_mailsclientes_SDT_item, 0);
            gx_BV39 = true ;
            AV74Tot = (short)(AV74Tot+1) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74Tot", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Tot), 4, 0));
         }
      }
      AV70Precios_cliente_mailsclientes = AV71Precios_cliente_mailsclientes_SDT.toJSonString(false) ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      precios_cliente_informe__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      precios_cliente_informe__wc_impl.this.AV26EmprCod = GXv_char2[0] ;
      precios_cliente_informe__wc_impl.this.AV27EmprNom = GXv_char3[0] ;
      precios_cliente_informe__wc_impl.this.AV28UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28UsurCod", AV28UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      Gridprecios_cliente_mailsclientes_sdts_empowerer_Gridinternalname = subGridprecios_cliente_mailsclientes_sdts_Internalname ;
      ucGridprecios_cliente_mailsclientes_sdts_empowerer.sendProperty(context, sPrefix, false, Gridprecios_cliente_mailsclientes_sdts_empowerer_Internalname, "GridInternalName", Gridprecios_cliente_mailsclientes_sdts_empowerer_Gridinternalname);
      subGridprecios_cliente_mailsclientes_sdts_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue = subGridprecios_cliente_mailsclientes_sdts_Rows ;
      ucGridprecios_cliente_mailsclientes_sdtspaginationbar.sendProperty(context, sPrefix, false, Gridprecios_cliente_mailsclientes_sdtspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV40strDate = GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( Gx_date), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( Gx_date), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( Gx_date), 10, 0)), (short)(2), "0") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40strDate", AV40strDate);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTRDATE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV40strDate, ""))));
      AV33Usumail = " " ;
      /* Using cursor H02433 */
      pr_default.execute(1, new Object[] {AV28UsurCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A850UsurCod = H02433_A850UsurCod[0] ;
         A10513UsuMail = H02433_A10513UsuMail[0] ;
         AV33Usumail = A10513UsuMail ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV18Vermail = true ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Vermail", AV18Vermail);
      GXt_char1 = AV48PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV26EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      precios_cliente_informe__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48PATHPDF", AV48PATHPDF);
      AV20Destino = AV24cliperpr ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Destino", AV20Destino);
      GXt_objcol_SdtPrecios_cliente_Informe_SDT_Item5 = AV12Precios_cliente_Informe_SDT ;
      GXv_objcol_SdtPrecios_cliente_Informe_SDT_Item6[0] = GXt_objcol_SdtPrecios_cliente_Informe_SDT_Item5 ;
      new app.facturacion.precios_cliente_informe__dp(remoteHandle, context).execute( AV26EmprCod, AV22CliCod, AV34fortonalfrom, AV35fortonalto, AV36Forcolnumfrom, AV37forcolnumto, GXv_objcol_SdtPrecios_cliente_Informe_SDT_Item6) ;
      GXt_objcol_SdtPrecios_cliente_Informe_SDT_Item5 = GXv_objcol_SdtPrecios_cliente_Informe_SDT_Item6[0] ;
      AV12Precios_cliente_Informe_SDT = GXt_objcol_SdtPrecios_cliente_Informe_SDT_Item5 ;
      gx_BV74 = true ;
   }

   public void e172432( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage = subgridprecios_cliente_mailsclientes_sdts_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage), 10, 0));
      AV78GridPrecios_cliente_mailsclientes_SDTsPageCount = subgridprecios_cliente_mailsclientes_sdts_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78GridPrecios_cliente_mailsclientes_SDTsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78GridPrecios_cliente_mailsclientes_SDTsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e132432( )
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
         AV14PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV14PageToGo) ;
      }
   }

   public void e142432( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e152432( )
   {
      AV85GXV4 = (int)(nGXsfl_74_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV85GXV4 > 0 ) && ( AV12Precios_cliente_Informe_SDT.size() >= AV85GXV4 ) )
      {
         AV12Precios_cliente_Informe_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)) );
      }
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      if ( GXutil.len( AV79ActualizadaClimailPr) > 0 )
      {
         AV57clientedia = GXutil.trim( GXutil.str( AV22CliCod, 6, 0)) + "_" + GXutil.trim( AV40strDate) ;
         AV51ReportOutPut = GXutil.format( "%1%2.pdf", AV48PATHPDF, AV57clientedia, "", "", "", "", "", "", "") ;
         AV43File.setSource( AV51ReportOutPut );
         if ( AV43File.exists() )
         {
            AV43File.delete();
         }
         AV98GXV13 = 1 ;
         while ( AV98GXV13 <= AV53Sdt_MergePDF.size() )
         {
            AV54Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)((app.SdtSdt_MergePDF_PDF)AV53Sdt_MergePDF.elementAt(-1+AV98GXV13));
            AV47PathFile = AV54Sdt_MergePDF_Item.getgxTv_SdtSdt_MergePDF_PDF_Realpath() ;
            AV43File.setSource( AV47PathFile );
            if ( AV43File.exists() )
            {
               AV43File.delete();
            }
            AV98GXV13 = (int)(AV98GXV13+1) ;
         }
         AV50ReportInPut = GXutil.trim( AV48PATHPDF) ;
         AV55x = (short)(1) ;
         AV53Sdt_MergePDF.clear();
         AV44i = (short)(1) ;
         AV47PathFile = GXutil.format( httpContext.getMessage( "%1Report_%2.pdf", ""), AV50ReportInPut, GXutil.trim( GXutil.str( AV55x, 4, 0)), "", "", "", "", "", "", "") ;
         AV38Precios_cliente_informe_Json = AV12Precios_cliente_Informe_SDT.toJSonString(false) ;
         new app.rdocprecopy1(remoteHandle, context).execute( AV47PathFile, AV26EmprCod, AV22CliCod, AV23CliNom, AV20Destino, AV38Precios_cliente_informe_Json) ;
         AV54Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
         AV54Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV47PathFile );
         AV53Sdt_MergePDF.add(AV54Sdt_MergePDF_Item, 0);
         AV46ListPdfJson = AV53Sdt_MergePDF.toJSonString(false) ;
         AV56PathPDFFull = AV39AppTool.merge(AV46ListPdfJson, AV51ReportOutPut, true) ;
         GXt_char1 = AV45Link ;
         GXv_char4[0] = GXt_char1 ;
         new app.viewfile(remoteHandle, context).execute( AV56PathPDFFull, "", GXv_char4) ;
         precios_cliente_informe__wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV45Link = GXt_char1 ;
         this.executeUsercontrolMethod(sPrefix, false, "DATAMONJSContainer", "windows", "", new Object[] {AV45Link,httpContext.getMessage( "_blank", "")});
         new app.facturacion.precios_cliente_informe_enviomail(remoteHandle, context).execute( AV26EmprCod, AV22CliCod, GXutil.today( ), AV18Vermail, AV79ActualizadaClimailPr, AV23CliNom) ;
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay mail seleccionado", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV53Sdt_MergePDF", AV53Sdt_MergePDF);
   }

   private void e182432( )
   {
      /* Gridprecios_cliente_mailsclientes_sdts_Load Routine */
      returnInSub = false ;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV71Precios_cliente_mailsclientes_SDT.size() )
      {
         AV71Precios_cliente_mailsclientes_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)AV71Precios_cliente_mailsclientes_SDT.elementAt(-1+AV82GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(39) ;
         }
         if ( ( subGridprecios_cliente_mailsclientes_sdts_Islastpage == 1 ) || ( subGridprecios_cliente_mailsclientes_sdts_Rows == 0 ) || ( ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord >= GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage ) && ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord < GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage + subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_392( ) ;
            GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord + 1 >= subgridprecios_cliente_mailsclientes_sdts_fnc_recordcount( ) )
            {
               GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord = (long)(GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
         {
            httpContext.doAjaxLoad(39, Gridprecios_cliente_mailsclientes_sdtsRow);
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
   }

   public void e112432( )
   {
      /* Gridprecios_cliente_mailsclientes_sdtspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridprecios_cliente_mailsclientes_sdts_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV14PageToGo = subgridprecios_cliente_mailsclientes_sdts_fnc_currentpage( ) ;
         AV14PageToGo = (int)(AV14PageToGo+1) ;
         subgridprecios_cliente_mailsclientes_sdts_gotopage( AV14PageToGo) ;
      }
      else
      {
         AV14PageToGo = (int)(GXutil.lval( Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage)) ;
         subgridprecios_cliente_mailsclientes_sdts_gotopage( AV14PageToGo) ;
      }
   }

   public void e122432( )
   {
      /* Gridprecios_cliente_mailsclientes_sdtspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridprecios_cliente_mailsclientes_sdts_Rows = Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridprecios_cliente_mailsclientes_sdts_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV94Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV94Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV94Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV13Session.getValue(AV94Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV94Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   private void e192435( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV85GXV4 = 1 ;
      while ( AV85GXV4 <= AV12Precios_cliente_Informe_SDT.size() )
      {
         AV12Precios_cliente_Informe_SDT.currentItem( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(74) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_745( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_74_Refreshing )
         {
            httpContext.doAjaxLoad(74, GridRow);
         }
         AV85GXV4 = (int)(AV85GXV4+1) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV26EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      AV22CliCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
      AV23CliNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliNom", AV23CliNom);
      AV34fortonalfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34fortonalfrom", AV34fortonalfrom);
      AV35fortonalto = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35fortonalto", AV35fortonalto);
      AV36Forcolnumfrom = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Forcolnumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Forcolnumfrom), 6, 0));
      AV37forcolnumto = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37forcolnumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37forcolnumto), 6, 0));
      AV42CliMailGr = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliMailGr", AV42CliMailGr);
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
      pa2432( ) ;
      ws2432( ) ;
      we2432( ) ;
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
      sCtrlAV26EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV22CliCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV23CliNom = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV34fortonalfrom = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV35fortonalto = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV36Forcolnumfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV37forcolnumto = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV42CliMailGr = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2432( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\precios_cliente_informe__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2432( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV26EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
         AV22CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
         AV23CliNom = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliNom", AV23CliNom);
         AV34fortonalfrom = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34fortonalfrom", AV34fortonalfrom);
         AV35fortonalto = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35fortonalto", AV35fortonalto);
         AV36Forcolnumfrom = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Forcolnumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Forcolnumfrom), 6, 0));
         AV37forcolnumto = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37forcolnumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37forcolnumto), 6, 0));
         AV42CliMailGr = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliMailGr", AV42CliMailGr);
      }
      wcpOAV26EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV26EmprCod") ;
      wcpOAV22CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV23CliNom = httpContext.cgiGet( sPrefix+"wcpOAV23CliNom") ;
      wcpOAV34fortonalfrom = httpContext.cgiGet( sPrefix+"wcpOAV34fortonalfrom") ;
      wcpOAV35fortonalto = httpContext.cgiGet( sPrefix+"wcpOAV35fortonalto") ;
      wcpOAV36Forcolnumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Forcolnumfrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37forcolnumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37forcolnumto"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42CliMailGr = httpContext.cgiGet( sPrefix+"wcpOAV42CliMailGr") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV26EmprCod, wcpOAV26EmprCod) != 0 ) || ( AV22CliCod != wcpOAV22CliCod ) || ( GXutil.strcmp(AV23CliNom, wcpOAV23CliNom) != 0 ) || ( GXutil.strcmp(AV34fortonalfrom, wcpOAV34fortonalfrom) != 0 ) || ( GXutil.strcmp(AV35fortonalto, wcpOAV35fortonalto) != 0 ) || ( AV36Forcolnumfrom != wcpOAV36Forcolnumfrom ) || ( AV37forcolnumto != wcpOAV37forcolnumto ) || ( GXutil.strcmp(AV42CliMailGr, wcpOAV42CliMailGr) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV26EmprCod = AV26EmprCod ;
      wcpOAV22CliCod = AV22CliCod ;
      wcpOAV23CliNom = AV23CliNom ;
      wcpOAV34fortonalfrom = AV34fortonalfrom ;
      wcpOAV35fortonalto = AV35fortonalto ;
      wcpOAV36Forcolnumfrom = AV36Forcolnumfrom ;
      wcpOAV37forcolnumto = AV37forcolnumto ;
      wcpOAV42CliMailGr = AV42CliMailGr ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV26EmprCod = httpContext.cgiGet( sPrefix+"AV26EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV26EmprCod) > 0 )
      {
         AV26EmprCod = httpContext.cgiGet( sCtrlAV26EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      }
      else
      {
         AV26EmprCod = httpContext.cgiGet( sPrefix+"AV26EmprCod_PARM") ;
      }
      sCtrlAV22CliCod = httpContext.cgiGet( sPrefix+"AV22CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV22CliCod) > 0 )
      {
         AV22CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCod), 6, 0));
      }
      else
      {
         AV22CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV23CliNom = httpContext.cgiGet( sPrefix+"AV23CliNom_CTRL") ;
      if ( GXutil.len( sCtrlAV23CliNom) > 0 )
      {
         AV23CliNom = httpContext.cgiGet( sCtrlAV23CliNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliNom", AV23CliNom);
      }
      else
      {
         AV23CliNom = httpContext.cgiGet( sPrefix+"AV23CliNom_PARM") ;
      }
      sCtrlAV34fortonalfrom = httpContext.cgiGet( sPrefix+"AV34fortonalfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34fortonalfrom) > 0 )
      {
         AV34fortonalfrom = httpContext.cgiGet( sCtrlAV34fortonalfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34fortonalfrom", AV34fortonalfrom);
      }
      else
      {
         AV34fortonalfrom = httpContext.cgiGet( sPrefix+"AV34fortonalfrom_PARM") ;
      }
      sCtrlAV35fortonalto = httpContext.cgiGet( sPrefix+"AV35fortonalto_CTRL") ;
      if ( GXutil.len( sCtrlAV35fortonalto) > 0 )
      {
         AV35fortonalto = httpContext.cgiGet( sCtrlAV35fortonalto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35fortonalto", AV35fortonalto);
      }
      else
      {
         AV35fortonalto = httpContext.cgiGet( sPrefix+"AV35fortonalto_PARM") ;
      }
      sCtrlAV36Forcolnumfrom = httpContext.cgiGet( sPrefix+"AV36Forcolnumfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV36Forcolnumfrom) > 0 )
      {
         AV36Forcolnumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36Forcolnumfrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Forcolnumfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Forcolnumfrom), 6, 0));
      }
      else
      {
         AV36Forcolnumfrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36Forcolnumfrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37forcolnumto = httpContext.cgiGet( sPrefix+"AV37forcolnumto_CTRL") ;
      if ( GXutil.len( sCtrlAV37forcolnumto) > 0 )
      {
         AV37forcolnumto = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37forcolnumto), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37forcolnumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37forcolnumto), 6, 0));
      }
      else
      {
         AV37forcolnumto = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37forcolnumto_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42CliMailGr = httpContext.cgiGet( sPrefix+"AV42CliMailGr_CTRL") ;
      if ( GXutil.len( sCtrlAV42CliMailGr) > 0 )
      {
         AV42CliMailGr = httpContext.cgiGet( sCtrlAV42CliMailGr) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42CliMailGr", AV42CliMailGr);
      }
      else
      {
         AV42CliMailGr = httpContext.cgiGet( sPrefix+"AV42CliMailGr_PARM") ;
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
      pa2432( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2432( ) ;
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
      ws2432( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26EmprCod_PARM", GXutil.rtrim( AV26EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26EmprCod_CTRL", GXutil.rtrim( sCtrlAV26EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV22CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22CliCod_CTRL", GXutil.rtrim( sCtrlAV22CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23CliNom_PARM", GXutil.rtrim( AV23CliNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23CliNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23CliNom_CTRL", GXutil.rtrim( sCtrlAV23CliNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34fortonalfrom_PARM", GXutil.rtrim( AV34fortonalfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34fortonalfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34fortonalfrom_CTRL", GXutil.rtrim( sCtrlAV34fortonalfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35fortonalto_PARM", GXutil.rtrim( AV35fortonalto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35fortonalto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35fortonalto_CTRL", GXutil.rtrim( sCtrlAV35fortonalto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Forcolnumfrom_PARM", GXutil.ltrim( localUtil.ntoc( AV36Forcolnumfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Forcolnumfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Forcolnumfrom_CTRL", GXutil.rtrim( sCtrlAV36Forcolnumfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37forcolnumto_PARM", GXutil.ltrim( localUtil.ntoc( AV37forcolnumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37forcolnumto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37forcolnumto_CTRL", GXutil.rtrim( sCtrlAV37forcolnumto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42CliMailGr_PARM", GXutil.rtrim( AV42CliMailGr));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42CliMailGr)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42CliMailGr_CTRL", GXutil.rtrim( sCtrlAV42CliMailGr));
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
      we2432( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555331", true, true);
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
      httpContext.AddJavascriptSource("facturacion/precios_cliente_informe__wc.js", "?20268211555331", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_392( )
   {
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_MAILSCLIENTES_SDT__SELECCIONAR_"+sGXsfl_39_idx );
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname = sPrefix+"PRECIOS_CLIENTE_MAILSCLIENTES_SDT__EMAILCLIENTE_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_MAILSCLIENTES_SDT__SELECCIONAR_"+sGXsfl_39_fel_idx );
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname = sPrefix+"PRECIOS_CLIENTE_MAILSCLIENTES_SDT__EMAILCLIENTE_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb2430( ) ;
      if ( ( subGridprecios_cliente_mailsclientes_sdts_Rows * 1 == 0 ) || ( nGXsfl_39_idx <= subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridprecios_cliente_mailsclientes_sdtsRow = GXWebRow.GetNew(context,Gridprecios_cliente_mailsclientes_sdtsContainer) ;
         if ( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridprecios_cliente_mailsclientes_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridprecios_cliente_mailsclientes_sdts_Class, "") != 0 )
            {
               subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridprecios_cliente_mailsclientes_sdts_Backstyle = (byte)(0) ;
            subGridprecios_cliente_mailsclientes_sdts_Backcolor = subGridprecios_cliente_mailsclientes_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridprecios_cliente_mailsclientes_sdts_Class, "") != 0 )
            {
               subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridprecios_cliente_mailsclientes_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridprecios_cliente_mailsclientes_sdts_Class, "") != 0 )
            {
               subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Odd" ;
            }
            subGridprecios_cliente_mailsclientes_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridprecios_cliente_mailsclientes_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
            {
               subGridprecios_cliente_mailsclientes_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridprecios_cliente_mailsclientes_sdts_Class, "") != 0 )
               {
                  subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridprecios_cliente_mailsclientes_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridprecios_cliente_mailsclientes_sdts_Class, "") != 0 )
               {
                  subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridprecios_cliente_mailsclientes_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridprecios_cliente_mailsclientes_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getEnabled()!=0)&&(chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'"+sPrefix+"',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRECIOS_CLIENTE_MAILSCLIENTES_SDT__SELECCIONAR_" + sGXsfl_39_idx ;
         chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setName( GXCCtl );
         chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setWebtags( "" );
         chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getCaption(), !bGXsfl_39_Refreshing);
         chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setCheckedValue( "false" );
         Gridprecios_cliente_mailsclientes_sdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)AV71Precios_cliente_mailsclientes_SDT.elementAt(-1+AV82GXV1)).getgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(40, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getEnabled()!=0)&&(chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,40);\"" : " ")});
         /* Subfile cell */
         if ( Gridprecios_cliente_mailsclientes_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridprecios_cliente_mailsclientes_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname,((app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item)AV71Precios_cliente_mailsclientes_SDT.elementAt(-1+AV82GXV1)).getgxTv_SdtPrecios_cliente_mailsclientes_SDT_Item_Emailcliente(),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2432( ) ;
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddRow(Gridprecios_cliente_mailsclientes_sdtsRow);
         nGXsfl_39_idx = ((subGridprecios_cliente_mailsclientes_sdts_Islastpage==1)&&(nGXsfl_39_idx+1>subgridprecios_cliente_mailsclientes_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void subsflControlProps_745( )
   {
      chkavPrecios_cliente_informe_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__SELECCIONAR_"+sGXsfl_74_idx );
      edtavPrecios_cliente_informe_sdt__fortonal_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORTONAL_"+sGXsfl_74_idx ;
      edtavPrecios_cliente_informe_sdt__artdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__ARTDSC_"+sGXsfl_74_idx ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__TIPARTDSC_"+sGXsfl_74_idx ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORNOMCLI_"+sGXsfl_74_idx ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORCOLNOM_"+sGXsfl_74_idx ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORCOLNUM_"+sGXsfl_74_idx ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORPREKGM_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_745( )
   {
      chkavPrecios_cliente_informe_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__SELECCIONAR_"+sGXsfl_74_fel_idx );
      edtavPrecios_cliente_informe_sdt__fortonal_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORTONAL_"+sGXsfl_74_fel_idx ;
      edtavPrecios_cliente_informe_sdt__artdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__ARTDSC_"+sGXsfl_74_fel_idx ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__TIPARTDSC_"+sGXsfl_74_fel_idx ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORNOMCLI_"+sGXsfl_74_fel_idx ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORCOLNOM_"+sGXsfl_74_fel_idx ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORCOLNUM_"+sGXsfl_74_fel_idx ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORPREKGM_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_745( )
   {
      subsflControlProps_745( ) ;
      wb2430( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavPrecios_cliente_informe_sdt__seleccionar.getEnabled()!=0)&&(chkavPrecios_cliente_informe_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 75,'"+sPrefix+"',false,'"+sGXsfl_74_idx+"',74)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRECIOS_CLIENTE_INFORME_SDT__SELECCIONAR_" + sGXsfl_74_idx ;
         chkavPrecios_cliente_informe_sdt__seleccionar.setName( GXCCtl );
         chkavPrecios_cliente_informe_sdt__seleccionar.setWebtags( "" );
         chkavPrecios_cliente_informe_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_informe_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPrecios_cliente_informe_sdt__seleccionar.getCaption(), !bGXsfl_74_Refreshing);
         chkavPrecios_cliente_informe_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavPrecios_cliente_informe_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(75, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavPrecios_cliente_informe_sdt__seleccionar.getEnabled()!=0)&&(chkavPrecios_cliente_informe_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,75);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__fortonal_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Fortonal()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__fortonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__fortonal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__artdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Artdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__artdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__artdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Tipartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__fornomcli_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Fornomcli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__fornomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__fornomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__forcolnom_Internalname,GXutil.rtrim( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__forcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__forcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__forcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_informe_sdt__forcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__forcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__forcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrecios_cliente_informe_sdt__forprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forprekgm(), (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrecios_cliente_informe_sdt__forprekgm_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forprekgm(), "ZZZZZ9.999") : localUtil.format( ((app.facturacion.SdtPrecios_cliente_Informe_SDT_Item)AV12Precios_cliente_Informe_SDT.elementAt(-1+AV85GXV4)).getgxTv_SdtPrecios_cliente_Informe_SDT_Item_Forprekgm(), "ZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrecios_cliente_informe_sdt__forprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPrecios_cliente_informe_sdt__forprekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2435( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_74_idx = ((subGrid_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_745( ) ;
      }
      /* End function sendrow_745 */
   }

   public void startgridcontrol39( )
   {
      if ( Gridprecios_cliente_mailsclientes_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"Gridprecios_cliente_mailsclientes_sdtsContainer"+"DivS\" data-gxgridid=\"39\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridprecios_cliente_mailsclientes_sdts_Internalname, subGridprecios_cliente_mailsclientes_sdts_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle == 0 )
         {
            subGridprecios_cliente_mailsclientes_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridprecios_cliente_mailsclientes_sdts_Class) > 0 )
            {
               subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridprecios_cliente_mailsclientes_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle == 1 )
            {
               subGridprecios_cliente_mailsclientes_sdts_Titlebackcolor = subGridprecios_cliente_mailsclientes_sdts_Allbackcolor ;
               if ( GXutil.len( subGridprecios_cliente_mailsclientes_sdts_Class) > 0 )
               {
                  subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridprecios_cliente_mailsclientes_sdts_Class) > 0 )
               {
                  subGridprecios_cliente_mailsclientes_sdts_Linesclass = subGridprecios_cliente_mailsclientes_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("GridName", "Gridprecios_cliente_mailsclientes_sdts");
      }
      else
      {
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("GridName", "Gridprecios_cliente_mailsclientes_sdts");
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Header", subGridprecios_cliente_mailsclientes_sdts_Header);
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("CmpContext", sPrefix);
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridprecios_cliente_mailsclientes_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddColumnProperties(Gridprecios_cliente_mailsclientes_sdtsColumn);
         Gridprecios_cliente_mailsclientes_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridprecios_cliente_mailsclientes_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddColumnProperties(Gridprecios_cliente_mailsclientes_sdtsColumn);
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridprecios_cliente_mailsclientes_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridprecios_cliente_mailsclientes_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol74( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"74\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Seleccionar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cartaz", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Malha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vª Refª", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nossa Côr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nª Refª", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__fortonal_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__artdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__fornomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__forcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__forcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrecios_cliente_informe_sdt__forprekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      edtavDestino_Internalname = sPrefix+"vDESTINO" ;
      edtavClimailpr_Internalname = sPrefix+"vCLIMAILPR" ;
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_MAILSCLIENTES_SDT__SELECCIONAR" );
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname = sPrefix+"PRECIOS_CLIENTE_MAILSCLIENTES_SDT__EMAILCLIENTE" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Internalname = sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR" ;
      divGridprecios_cliente_mailsclientes_sdtstablewithpaginationbar_Internalname = sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      chkavMail.setInternalname( sPrefix+"vMAIL" );
      chkavVermail.setInternalname( sPrefix+"vVERMAIL" );
      edtavPathpdf_Internalname = sPrefix+"vPATHPDF" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      bttBtnimprimir_Internalname = sPrefix+"BTNIMPRIMIR" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      chkavPrecios_cliente_informe_sdt__seleccionar.setInternalname( sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__SELECCIONAR" );
      edtavPrecios_cliente_informe_sdt__fortonal_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORTONAL" ;
      edtavPrecios_cliente_informe_sdt__artdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__ARTDSC" ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__TIPARTDSC" ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORNOMCLI" ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORCOLNOM" ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORCOLNUM" ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Internalname = sPrefix+"PRECIOS_CLIENTE_INFORME_SDT__FORPREKGM" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      Gridprecios_cliente_mailsclientes_sdts_empowerer_Internalname = sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridprecios_cliente_mailsclientes_sdts_Internalname = sPrefix+"GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS" ;
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
      subGridprecios_cliente_mailsclientes_sdts_Allowcollapsing = (byte)(0) ;
      subGridprecios_cliente_mailsclientes_sdts_Allowselection = (byte)(0) ;
      subGridprecios_cliente_mailsclientes_sdts_Header = "" ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__artdsc_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__artdsc_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__fortonal_Jsonclick = "" ;
      edtavPrecios_cliente_informe_sdt__fortonal_Enabled = 0 ;
      chkavPrecios_cliente_informe_sdt__seleccionar.setCaption( "" );
      chkavPrecios_cliente_informe_sdt__seleccionar.setVisible( -1 );
      chkavPrecios_cliente_informe_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Jsonclick = "" ;
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled = 0 ;
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setCaption( "" );
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setVisible( -1 );
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setEnabled( 1 );
      subGridprecios_cliente_mailsclientes_sdts_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle = (byte)(0) ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Enabled = -1 ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Enabled = -1 ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Enabled = -1 ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Enabled = -1 ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled = -1 ;
      edtavPrecios_cliente_informe_sdt__artdsc_Enabled = -1 ;
      edtavPrecios_cliente_informe_sdt__fortonal_Enabled = -1 ;
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      chkavVermail.setEnabled( 1 );
      chkavMail.setEnabled( 1 );
      edtavClimailpr_Jsonclick = "" ;
      edtavClimailpr_Enabled = 1 ;
      edtavDestino_Jsonclick = "" ;
      edtavDestino_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
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
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingcaptionposition = "Left" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagestoshow = 5 ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Class = "PaginationBar" ;
      subGrid_Rows = 0 ;
      subGridprecios_cliente_mailsclientes_sdts_Rows = 0 ;
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
      GXCCtl = "PRECIOS_CLIENTE_MAILSCLIENTES_SDT__SELECCIONAR_" + sGXsfl_39_idx ;
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setName( GXCCtl );
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setWebtags( "" );
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPrecios_cliente_mailsclientes_sdt__seleccionar.getCaption(), !bGXsfl_39_Refreshing);
      chkavPrecios_cliente_mailsclientes_sdt__seleccionar.setCheckedValue( "false" );
      chkavMail.setName( "vMAIL" );
      chkavMail.setWebtags( "" );
      chkavMail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavMail.getInternalname(), "TitleCaption", chkavMail.getCaption(), true);
      chkavMail.setCheckedValue( "0" );
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      GXCCtl = "PRECIOS_CLIENTE_INFORME_SDT__SELECCIONAR_" + sGXsfl_74_idx ;
      chkavPrecios_cliente_informe_sdt__seleccionar.setName( GXCCtl );
      chkavPrecios_cliente_informe_sdt__seleccionar.setWebtags( "" );
      chkavPrecios_cliente_informe_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavPrecios_cliente_informe_sdt__seleccionar.getInternalname(), "TitleCaption", chkavPrecios_cliente_informe_sdt__seleccionar.getCaption(), !bGXsfl_74_Refreshing);
      chkavPrecios_cliente_informe_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage'},{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridprecios_cliente_mailsclientes_sdts_Rows',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'Rows'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17Mail',fld:'vMAIL',pic:'9'},{av:'AV18Vermail',fld:'vVERMAIL',pic:''},{av:'AV71Precios_cliente_mailsclientes_SDT',fld:'vPRECIOS_CLIENTE_MAILSCLIENTES_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'GridRC',grid:39},{av:'AV12Precios_cliente_Informe_SDT',fld:'vPRECIOS_CLIENTE_INFORME_SDT',grid:74,pic:'',hsh:true},{av:'nGXsfl_74_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:74},{av:'nRC_GXsfl_74',ctrl:'GRID',prop:'GridRC',grid:74},{av:'AV40strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV48PATHPDF',fld:'vPATHPDF',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage',fld:'vGRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV78GridPrecios_cliente_mailsclientes_SDTsPageCount',fld:'vGRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e132432',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridprecios_cliente_mailsclientes_sdts_Rows',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17Mail',fld:'vMAIL',pic:'9'},{av:'AV18Vermail',fld:'vVERMAIL',pic:''},{av:'AV71Precios_cliente_mailsclientes_SDT',fld:'vPRECIOS_CLIENTE_MAILSCLIENTES_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'GridRC',grid:39},{av:'AV12Precios_cliente_Informe_SDT',fld:'vPRECIOS_CLIENTE_INFORME_SDT',grid:74,pic:'',hsh:true},{av:'nGXsfl_74_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:74},{av:'nRC_GXsfl_74',ctrl:'GRID',prop:'GridRC',grid:74},{av:'AV40strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV48PATHPDF',fld:'vPATHPDF',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e142432',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGridprecios_cliente_mailsclientes_sdts_Rows',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17Mail',fld:'vMAIL',pic:'9'},{av:'AV18Vermail',fld:'vVERMAIL',pic:''},{av:'AV71Precios_cliente_mailsclientes_SDT',fld:'vPRECIOS_CLIENTE_MAILSCLIENTES_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'GridRC',grid:39},{av:'AV12Precios_cliente_Informe_SDT',fld:'vPRECIOS_CLIENTE_INFORME_SDT',grid:74,pic:'',hsh:true},{av:'nGXsfl_74_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:74},{av:'nRC_GXsfl_74',ctrl:'GRID',prop:'GridRC',grid:74},{av:'AV40strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV48PATHPDF',fld:'vPATHPDF',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192435',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e152432',iparms:[{av:'AV79ActualizadaClimailPr',fld:'vACTUALIZADACLIMAILPR',pic:''},{av:'AV22CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV40strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV48PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV53Sdt_MergePDF',fld:'vSDT_MERGEPDF',pic:''},{av:'AV12Precios_cliente_Informe_SDT',fld:'vPRECIOS_CLIENTE_INFORME_SDT',grid:74,pic:'',hsh:true},{av:'nGXsfl_74_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:74},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_74',ctrl:'GRID',prop:'GridRC',grid:74},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23CliNom',fld:'vCLINOM',pic:''},{av:'AV20Destino',fld:'vDESTINO',pic:''},{av:'AV18Vermail',fld:'vVERMAIL',pic:''}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV53Sdt_MergePDF',fld:'vSDT_MERGEPDF',pic:''}]}");
      setEventMetadata("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS.LOAD","{handler:'e182432',iparms:[]");
      setEventMetadata("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR.CHANGEPAGE","{handler:'e112432',iparms:[{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage'},{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF'},{av:'subGridprecios_cliente_mailsclientes_sdts_Rows',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17Mail',fld:'vMAIL',pic:'9'},{av:'AV18Vermail',fld:'vVERMAIL',pic:''},{av:'AV71Precios_cliente_mailsclientes_SDT',fld:'vPRECIOS_CLIENTE_MAILSCLIENTES_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'GridRC',grid:39},{av:'AV12Precios_cliente_Informe_SDT',fld:'vPRECIOS_CLIENTE_INFORME_SDT',grid:74,pic:'',hsh:true},{av:'nGXsfl_74_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:74},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_74',ctrl:'GRID',prop:'GridRC',grid:74},{av:'AV40strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV48PATHPDF',fld:'vPATHPDF',pic:''},{av:'sPrefix'},{av:'Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122432',iparms:[{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage'},{av:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF'},{av:'subGridprecios_cliente_mailsclientes_sdts_Rows',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'Rows'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17Mail',fld:'vMAIL',pic:'9'},{av:'AV18Vermail',fld:'vVERMAIL',pic:''},{av:'AV71Precios_cliente_mailsclientes_SDT',fld:'vPRECIOS_CLIENTE_MAILSCLIENTES_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'GridRC',grid:39},{av:'AV12Precios_cliente_Informe_SDT',fld:'vPRECIOS_CLIENTE_INFORME_SDT',grid:74,pic:'',hsh:true},{av:'nGXsfl_74_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:74},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_74',ctrl:'GRID',prop:'GridRC',grid:74},{av:'AV40strDate',fld:'vSTRDATE',pic:'',hsh:true},{av:'AV48PATHPDF',fld:'vPATHPDF',pic:''},{av:'sPrefix'},{av:'Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridprecios_cliente_mailsclientes_sdts_Rows',ctrl:'GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS',prop:'Rows'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv3',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv12',iparms:[]");
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
      wcpOAV26EmprCod = "" ;
      wcpOAV23CliNom = "" ;
      wcpOAV34fortonalfrom = "" ;
      wcpOAV35fortonalto = "" ;
      wcpOAV42CliMailGr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV26EmprCod = "" ;
      AV23CliNom = "" ;
      AV34fortonalfrom = "" ;
      AV35fortonalto = "" ;
      AV42CliMailGr = "" ;
      AV94Pgmname = "" ;
      AV71Precios_cliente_mailsclientes_SDT = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item>(app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV12Precios_cliente_Informe_SDT = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>(app.facturacion.SdtPrecios_cliente_Informe_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV40strDate = "" ;
      AV48PATHPDF = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV79ActualizadaClimailPr = "" ;
      AV53Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV72Precios_cliente_mailsclientes_SDT_item = new app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item(remoteHandle, context);
      AV73Separador = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      Gridprecios_cliente_mailsclientes_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV20Destino = "" ;
      AV21ClimailPr = "" ;
      Gridprecios_cliente_mailsclientes_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridprecios_cliente_mailsclientes_sdtspaginationbar = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      ucGridprecios_cliente_mailsclientes_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      hsh = "" ;
      AV29CliTipo = "" ;
      scmdbuf = "" ;
      H02432_A252CliCod = new int[1] ;
      H02432_A396EmprCod = new String[] {""} ;
      H02432_A5648CliTipo = new String[] {""} ;
      H02432_A279CliNom = new String[] {""} ;
      H02432_A11701ClimailPr = new String[] {""} ;
      H02432_A11702CliPerPr = new String[] {""} ;
      A396EmprCod = "" ;
      A5648CliTipo = "" ;
      A279CliNom = "" ;
      A11701ClimailPr = "" ;
      A11702CliPerPr = "" ;
      AV24cliperpr = "" ;
      AV62aux_Climailpr = "" ;
      AV67Mail_Climailpr = "" ;
      AV70Precios_cliente_mailsclientes = "" ;
      AV25Station = "" ;
      GXv_char2 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV28UsurCod = "" ;
      AV33Usumail = "" ;
      H02433_A850UsurCod = new String[] {""} ;
      H02433_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      GXt_objcol_SdtPrecios_cliente_Informe_SDT_Item5 = new GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item>(app.facturacion.SdtPrecios_cliente_Informe_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtPrecios_cliente_Informe_SDT_Item6 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV57clientedia = "" ;
      AV51ReportOutPut = "" ;
      AV43File = new com.genexus.util.GXFile();
      AV54Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV47PathFile = "" ;
      AV50ReportInPut = "" ;
      AV38Precios_cliente_informe_Json = "" ;
      AV46ListPdfJson = "" ;
      AV56PathPDFFull = "" ;
      AV39AppTool = new app.SdtAppTool(remoteHandle, context);
      AV45Link = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Gridprecios_cliente_mailsclientes_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GridRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV26EmprCod = "" ;
      sCtrlAV22CliCod = "" ;
      sCtrlAV23CliNom = "" ;
      sCtrlAV34fortonalfrom = "" ;
      sCtrlAV35fortonalto = "" ;
      sCtrlAV36Forcolnumfrom = "" ;
      sCtrlAV37forcolnumto = "" ;
      sCtrlAV42CliMailGr = "" ;
      subGridprecios_cliente_mailsclientes_sdts_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      subGrid_Linesclass = "" ;
      Gridprecios_cliente_mailsclientes_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.precios_cliente_informe__wc__default(),
         new Object[] {
             new Object[] {
            H02432_A252CliCod, H02432_A396EmprCod, H02432_A5648CliTipo, H02432_A279CliNom, H02432_A11701ClimailPr, H02432_A11702CliPerPr
            }
            , new Object[] {
            H02433_A850UsurCod, H02433_A10513UsuMail
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "Facturacion.Precios_cliente_Informe__WC" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV94Pgmname = "Facturacion.Precios_cliente_Informe__WC" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavClimailpr_Enabled = 0 ;
      edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled = 0 ;
      edtavPathpdf_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__fortonal_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__artdsc_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__fornomcli_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__forcolnom_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__forcolnum_Enabled = 0 ;
      edtavPrecios_cliente_informe_sdt__forprekgm_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nEOF ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV17Mail ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Backcolorstyle ;
   private byte subGrid_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Backstyle ;
   private byte subGrid_Backstyle ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Titlebackstyle ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Allowselection ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Allowhovering ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Allowcollapsing ;
   private byte subGridprecios_cliente_mailsclientes_sdts_Collapsed ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68pos ;
   private short AV74Tot ;
   private short AV55x ;
   private short AV44i ;
   private int wcpOAV22CliCod ;
   private int wcpOAV36Forcolnumfrom ;
   private int wcpOAV37forcolnumto ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int nRC_GXsfl_74 ;
   private int AV22CliCod ;
   private int AV36Forcolnumfrom ;
   private int AV37forcolnumto ;
   private int subGridprecios_cliente_mailsclientes_sdts_Rows ;
   private int nGXsfl_39_idx=1 ;
   private int nGXsfl_74_idx=1 ;
   private int AV99GXV14 ;
   private int Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagestoshow ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavDestino_Enabled ;
   private int edtavClimailpr_Enabled ;
   private int AV82GXV1 ;
   private int edtavPathpdf_Enabled ;
   private int AV85GXV4 ;
   private int edtavPgmname_Enabled ;
   private int subGridprecios_cliente_mailsclientes_sdts_Islastpage ;
   private int subGrid_Islastpage ;
   private int edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__fortonal_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__artdsc_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__tipartdsc_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__fornomcli_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__forcolnom_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__forcolnum_Enabled ;
   private int edtavPrecios_cliente_informe_sdt__forprekgm_Enabled ;
   private int GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nGridOutOfScope ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_39_fel_idx=1 ;
   private int nGXsfl_74_fel_idx=1 ;
   private int A252CliCod ;
   private int AV14PageToGo ;
   private int AV98GXV13 ;
   private int idxLst ;
   private int subGridprecios_cliente_mailsclientes_sdts_Backcolor ;
   private int subGridprecios_cliente_mailsclientes_sdts_Allbackcolor ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGridprecios_cliente_mailsclientes_sdts_Titlebackcolor ;
   private int subGridprecios_cliente_mailsclientes_sdts_Selectedindex ;
   private int subGridprecios_cliente_mailsclientes_sdts_Selectioncolor ;
   private int subGridprecios_cliente_mailsclientes_sdts_Hoveringcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nFirstRecordOnPage ;
   private long GRID_nFirstRecordOnPage ;
   private long AV77GridPrecios_cliente_mailsclientes_SDTsCurrentPage ;
   private long AV78GridPrecios_cliente_mailsclientes_SDTsPageCount ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nCurrentRecord ;
   private long GRID_nCurrentRecord ;
   private long GRIDPRECIOS_CLIENTE_MAILSCLIENTES_SDTS_nRecordCount ;
   private long GRID_nRecordCount ;
   private String wcpOAV26EmprCod ;
   private String wcpOAV23CliNom ;
   private String wcpOAV34fortonalfrom ;
   private String wcpOAV35fortonalto ;
   private String wcpOAV42CliMailGr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV26EmprCod ;
   private String AV23CliNom ;
   private String AV34fortonalfrom ;
   private String AV35fortonalto ;
   private String AV42CliMailGr ;
   private String sGXsfl_39_idx="0001" ;
   private String AV94Pgmname ;
   private String AV48PATHPDF ;
   private String sGXsfl_74_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV79ActualizadaClimailPr ;
   private String AV73Separador ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Class ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingbuttonsposition ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Pagingcaptionposition ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridclass ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageoptions ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Previous ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Next ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Caption ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Emptygridcaption ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpagecaption ;
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
   private String Gridprecios_cliente_mailsclientes_sdts_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavDestino_Internalname ;
   private String TempTags ;
   private String AV20Destino ;
   private String edtavDestino_Jsonclick ;
   private String edtavClimailpr_Internalname ;
   private String AV21ClimailPr ;
   private String edtavClimailpr_Jsonclick ;
   private String divGridprecios_cliente_mailsclientes_sdtstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridprecios_cliente_mailsclientes_sdts_Internalname ;
   private String Gridprecios_cliente_mailsclientes_sdtspaginationbar_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String Gridprecios_cliente_mailsclientes_sdts_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__fortonal_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__artdsc_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__tipartdsc_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__fornomcli_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__forcolnom_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__forcolnum_Internalname ;
   private String edtavPrecios_cliente_informe_sdt__forprekgm_Internalname ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String sGXsfl_74_fel_idx="0001" ;
   private String hsh ;
   private String AV29CliTipo ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A5648CliTipo ;
   private String A279CliNom ;
   private String A11701ClimailPr ;
   private String A11702CliPerPr ;
   private String AV24cliperpr ;
   private String AV62aux_Climailpr ;
   private String AV67Mail_Climailpr ;
   private String AV25Station ;
   private String GXv_char2[] ;
   private String AV27EmprNom ;
   private String GXv_char3[] ;
   private String AV28UsurCod ;
   private String AV33Usumail ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sCtrlAV26EmprCod ;
   private String sCtrlAV22CliCod ;
   private String sCtrlAV23CliNom ;
   private String sCtrlAV34fortonalfrom ;
   private String sCtrlAV35fortonalto ;
   private String sCtrlAV36Forcolnumfrom ;
   private String sCtrlAV37forcolnumto ;
   private String sCtrlAV42CliMailGr ;
   private String subGridprecios_cliente_mailsclientes_sdts_Class ;
   private String subGridprecios_cliente_mailsclientes_sdts_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavPrecios_cliente_mailsclientes_sdt__emailcliente_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String edtavPrecios_cliente_informe_sdt__fortonal_Jsonclick ;
   private String edtavPrecios_cliente_informe_sdt__artdsc_Jsonclick ;
   private String edtavPrecios_cliente_informe_sdt__tipartdsc_Jsonclick ;
   private String edtavPrecios_cliente_informe_sdt__fornomcli_Jsonclick ;
   private String edtavPrecios_cliente_informe_sdt__forcolnom_Jsonclick ;
   private String edtavPrecios_cliente_informe_sdt__forcolnum_Jsonclick ;
   private String edtavPrecios_cliente_informe_sdt__forprekgm_Jsonclick ;
   private String subGridprecios_cliente_mailsclientes_sdts_Header ;
   private String subGrid_Header ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18Vermail ;
   private boolean Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showfirst ;
   private boolean Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showprevious ;
   private boolean Gridprecios_cliente_mailsclientes_sdtspaginationbar_Shownext ;
   private boolean Gridprecios_cliente_mailsclientes_sdtspaginationbar_Showlast ;
   private boolean Gridprecios_cliente_mailsclientes_sdtspaginationbar_Rowsperpageselector ;
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
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV39 ;
   private boolean gx_BV74 ;
   private boolean gx_refresh_fired ;
   private String AV70Precios_cliente_mailsclientes ;
   private String AV38Precios_cliente_informe_Json ;
   private String AV46ListPdfJson ;
   private String AV40strDate ;
   private String AV57clientedia ;
   private String AV51ReportOutPut ;
   private String AV47PathFile ;
   private String AV50ReportInPut ;
   private String AV56PathPDFFull ;
   private String AV45Link ;
   private com.genexus.webpanels.GXWebGrid Gridprecios_cliente_mailsclientes_sdtsContainer ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow Gridprecios_cliente_mailsclientes_sdtsRow ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn Gridprecios_cliente_mailsclientes_sdtsColumn ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridprecios_cliente_mailsclientes_sdtspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridprecios_cliente_mailsclientes_sdts_empowerer ;
   private com.genexus.util.GXFile AV43File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private app.SdtAppTool AV39AppTool ;
   private ICheckbox chkavPrecios_cliente_mailsclientes_sdt__seleccionar ;
   private ICheckbox chkavMail ;
   private ICheckbox chkavVermail ;
   private ICheckbox chkavPrecios_cliente_informe_sdt__seleccionar ;
   private IDataStoreProvider pr_default ;
   private int[] H02432_A252CliCod ;
   private String[] H02432_A396EmprCod ;
   private String[] H02432_A5648CliTipo ;
   private String[] H02432_A279CliNom ;
   private String[] H02432_A11701ClimailPr ;
   private String[] H02432_A11702CliPerPr ;
   private String[] H02433_A850UsurCod ;
   private String[] H02433_A10513UsuMail ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> AV12Precios_cliente_Informe_SDT ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> GXt_objcol_SdtPrecios_cliente_Informe_SDT_Item5 ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_Informe_SDT_Item> GXv_objcol_SdtPrecios_cliente_Informe_SDT_Item6[] ;
   private GXBaseCollection<app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item> AV71Precios_cliente_mailsclientes_SDT ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV53Sdt_MergePDF ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.facturacion.SdtPrecios_cliente_mailsclientes_SDT_Item AV72Precios_cliente_mailsclientes_SDT_item ;
   private app.SdtSdt_MergePDF_PDF AV54Sdt_MergePDF_Item ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class precios_cliente_informe__wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02432", "SELECT CliCod, EmprCod, CliTipo, CliNom, ClimailPr, CliPerPr FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02433", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 200);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

