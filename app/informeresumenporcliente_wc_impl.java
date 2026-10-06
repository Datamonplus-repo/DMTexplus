package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeresumenporcliente_wc_impl extends GXWebComponent
{
   public informeresumenporcliente_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeresumenporcliente_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeresumenporcliente_wc_impl.class ));
   }

   public informeresumenporcliente_wc_impl( int remoteHandle ,
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
               AV43EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
               AV63Prio = httpContext.GetPar( "Prio") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Prio", AV63Prio);
               AV13Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Clicod), 6, 0));
               AV38Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod_to), 6, 0));
               AV6ALbProfch = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbProfch", localUtil.format(AV6ALbProfch, "99/99/99"));
               AV24ALbProfch_to = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ALbProfch_to", localUtil.format(AV24ALbProfch_to, "99/99/99"));
               AV11Barser = httpContext.GetPar( "Barser") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Barser", AV11Barser);
               AV37Barser_to = httpContext.GetPar( "Barser_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barser_to", AV37Barser_to);
               AV5AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEncCli", AV5AlbEncCli);
               AV23AlbEncCli_to = httpContext.GetPar( "AlbEncCli_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23AlbEncCli_to", AV23AlbEncCli_to);
               AV7BarColNom = httpContext.GetPar( "BarColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom", AV7BarColNom);
               AV30BarColNom_to = httpContext.GetPar( "BarColNom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarColNom_to", AV30BarColNom_to);
               AV8BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
               AV31BarColNum_to = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarColNum_to), 6, 0));
               AV9Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Barestreo", GXutil.str( AV9Barestreo, 1, 0));
               AV33Barestreoi = (byte)(GXutil.lval( httpContext.GetPar( "Barestreoi"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barestreoi", GXutil.str( AV33Barestreoi, 1, 0));
               AV32barestreof = (byte)(GXutil.lval( httpContext.GetPar( "barestreof"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barestreof", GXutil.str( AV32barestreof, 1, 0));
               AV19TipDisCod = httpContext.GetPar( "TipDisCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipDisCod", AV19TipDisCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV43EmprCod,AV63Prio,Integer.valueOf(AV13Clicod),Integer.valueOf(AV38Clicod_to),AV6ALbProfch,AV24ALbProfch_to,AV11Barser,AV37Barser_to,AV5AlbEncCli,AV23AlbEncCli_to,AV7BarColNom,AV30BarColNom_to,Integer.valueOf(AV8BarColNum),Integer.valueOf(AV31BarColNum_to),Byte.valueOf(AV9Barestreo),Byte.valueOf(AV33Barestreoi),Byte.valueOf(AV32barestreof),AV19TipDisCod});
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
      AV91Pgmname = httpContext.GetPar( "Pgmname") ;
      AV43EmprCod = httpContext.GetPar( "EmprCod") ;
      AV63Prio = httpContext.GetPar( "Prio") ;
      AV13Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV38Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV6ALbProfch = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch")) ;
      AV24ALbProfch_to = localUtil.parseDateParm( httpContext.GetPar( "ALbProfch_to")) ;
      AV11Barser = httpContext.GetPar( "Barser") ;
      AV37Barser_to = httpContext.GetPar( "Barser_to") ;
      AV5AlbEncCli = httpContext.GetPar( "AlbEncCli") ;
      AV23AlbEncCli_to = httpContext.GetPar( "AlbEncCli_to") ;
      AV7BarColNom = httpContext.GetPar( "BarColNom") ;
      AV30BarColNom_to = httpContext.GetPar( "BarColNom_to") ;
      AV8BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV31BarColNum_to = (int)(GXutil.lval( httpContext.GetPar( "BarColNum_to"))) ;
      AV9Barestreo = (byte)(GXutil.lval( httpContext.GetPar( "Barestreo"))) ;
      AV33Barestreoi = (byte)(GXutil.lval( httpContext.GetPar( "Barestreoi"))) ;
      AV32barestreof = (byte)(GXutil.lval( httpContext.GetPar( "barestreof"))) ;
      AV19TipDisCod = httpContext.GetPar( "TipDisCod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV53InformeResumenporCliente_SDT);
      AV68Tot_TotKilC = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotKilC"), ".") ;
      AV69Tot_TotMetC = CommonUtil.decimalVal( httpContext.GetPar( "Tot_TotMetC"), ".") ;
      AV70Tot_TotPieC = GXutil.lval( httpContext.GetPar( "Tot_TotPieC")) ;
      AV54InformeResumenporCliente_SDT_json = httpContext.GetPar( "InformeResumenporCliente_SDT_json") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV91Pgmname, AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV9Barestreo, AV33Barestreoi, AV32barestreof, AV19TipDisCod, AV53InformeResumenporCliente_SDT, AV68Tot_TotKilC, AV69Tot_TotMetC, AV70Tot_TotPieC, AV54InformeResumenporCliente_SDT_json, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa28Q2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Resumen por Cliente", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informeresumenporcliente_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV43EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV63Prio)),GXutil.URLEncode(GXutil.ltrimstr(AV13Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV6ALbProfch)),GXutil.URLEncode(GXutil.formatDateParm(AV24ALbProfch_to)),GXutil.URLEncode(GXutil.rtrim(AV11Barser)),GXutil.URLEncode(GXutil.rtrim(AV37Barser_to)),GXutil.URLEncode(GXutil.rtrim(AV5AlbEncCli)),GXutil.URLEncode(GXutil.rtrim(AV23AlbEncCli_to)),GXutil.URLEncode(GXutil.rtrim(AV7BarColNom)),GXutil.URLEncode(GXutil.rtrim(AV30BarColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31BarColNum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barestreo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Barestreoi,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32barestreof,1,0)),GXutil.URLEncode(GXutil.rtrim(AV19TipDisCod))}, new String[] {"EmprCod","Prio","Clicod","Clicod_to","ALbProfch","ALbProfch_to","Barser","Barser_to","AlbEncCli","AlbEncCli_to","BarColNom","BarColNom_to","BarColNum","BarColNum_to","Barestreo","Barestreoi","barestreof","TipDisCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT", getSecureSignedToken( sPrefix, AV53InformeResumenporCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTKILC", getSecureSignedToken( sPrefix, localUtil.format( AV68Tot_TotKilC, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTMETC", getSecureSignedToken( sPrefix, localUtil.format( AV69Tot_TotMetC, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPIEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV70Tot_TotPieC), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT_JSON", getSecureSignedToken( sPrefix, AV54InformeResumenporCliente_SDT_json));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeResumenporCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV91Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("informeresumenporcliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Informeresumenporcliente_sdt", AV53InformeResumenporCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Informeresumenporcliente_sdt", AV53InformeResumenporCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Informeresumenporcliente_sdt", getSecureSignedToken( sPrefix, AV53InformeResumenporCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_34", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_34, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV48GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV43EmprCod", GXutil.rtrim( wcpOAV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63Prio", GXutil.rtrim( wcpOAV63Prio));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV13Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV38Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6ALbProfch", localUtil.dtoc( wcpOAV6ALbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24ALbProfch_to", localUtil.dtoc( wcpOAV24ALbProfch_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11Barser", GXutil.rtrim( wcpOAV11Barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Barser_to", GXutil.rtrim( wcpOAV37Barser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5AlbEncCli", GXutil.rtrim( wcpOAV5AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23AlbEncCli_to", GXutil.rtrim( wcpOAV23AlbEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7BarColNom", GXutil.rtrim( wcpOAV7BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarColNom_to", GXutil.rtrim( wcpOAV30BarColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8BarColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV8BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31BarColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV31BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Barestreo", GXutil.ltrim( localUtil.ntoc( wcpOAV9Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Barestreoi", GXutil.ltrim( localUtil.ntoc( wcpOAV33Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32barestreof", GXutil.ltrim( localUtil.ntoc( wcpOAV32barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19TipDisCod", GXutil.rtrim( wcpOAV19TipDisCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV43EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRIO", GXutil.rtrim( AV63Prio));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV13Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV38Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH", localUtil.dtoc( AV6ALbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROFCH_TO", localUtil.dtoc( AV24ALbProfch_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER", GXutil.rtrim( AV11Barser));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSER_TO", GXutil.rtrim( AV37Barser_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENCCLI", GXutil.rtrim( AV5AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENCCLI_TO", GXutil.rtrim( AV23AlbEncCli_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM", GXutil.rtrim( AV7BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM_TO", GXutil.rtrim( AV30BarColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV8BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV31BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREO", GXutil.ltrim( localUtil.ntoc( AV9Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREOI", GXutil.ltrim( localUtil.ntoc( AV33Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARESTREOF", GXutil.ltrim( localUtil.ntoc( AV32barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPDISCOD", GXutil.rtrim( AV19TipDisCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vINFORMERESUMENPORCLIENTE_SDT", AV53InformeResumenporCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vINFORMERESUMENPORCLIENTE_SDT", AV53InformeResumenporCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT", getSecureSignedToken( sPrefix, AV53InformeResumenporCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTKILC", GXutil.ltrim( localUtil.ntoc( AV68Tot_TotKilC, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTKILC", getSecureSignedToken( sPrefix, localUtil.format( AV68Tot_TotKilC, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTMETC", GXutil.ltrim( localUtil.ntoc( AV69Tot_TotMetC, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTMETC", getSecureSignedToken( sPrefix, localUtil.format( AV69Tot_TotMetC, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPIEC", GXutil.ltrim( localUtil.ntoc( AV70Tot_TotPieC, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPIEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV70Tot_TotPieC), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vIMPCOD", GXutil.rtrim( AV14ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFUENTE", GXutil.ltrim( localUtil.ntoc( AV81Fuente, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODI", GXutil.ltrim( localUtil.ntoc( AV27Barcodi, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREOF", GXutil.ltrim( localUtil.ntoc( AV29Barcodreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPARF", GXutil.rtrim( AV28Barcodparf));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMAQEST1", GXutil.rtrim( AV35BarMaqEst1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARMAQEST2", GXutil.rtrim( AV36BarMaqEst2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSERIE", GXutil.rtrim( AV18Serie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNFI", GXutil.ltrim( localUtil.ntoc( AV61Nfi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNFF", GXutil.ltrim( localUtil.ntoc( AV60Nff, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARLAR", GXutil.rtrim( AV10Barlar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDETALLEROLLOS", GXutil.ltrim( localUtil.ntoc( AV82DetalleRollos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFORMERESUMENPORCLIENTE_SDT_JSON", AV54InformeResumenporCliente_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT_JSON", getSecureSignedToken( sPrefix, AV54InformeResumenporCliente_SDT_json));
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

   public void renderHtmlCloseForm28Q2( )
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
      return "InformeResumenporCliente_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Resumen por Cliente", "") ;
   }

   public void wb28Q0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.informeresumenporcliente_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdfwin_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF (win)", ""), bttBtnpdfwin_Jsonclick, 7, httpContext.getMessage( "PDF (win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1128q1_client"+"'", TempTags, "", 2, "HLP_InformeResumenporCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeResumenporCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 34, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_InformeResumenporCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_28Q2( true) ;
      }
      else
      {
         wb_table1_23_28Q2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_28Q2e( boolean wbgen )
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
            AV85GXV1 = nGXsfl_34_idx ;
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
         wb_table2_42_28Q2( true) ;
      }
      else
      {
         wb_table2_42_28Q2( false) ;
      }
      return  ;
   }

   public void wb_table2_42_28Q2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV48GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV49GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV91Pgmname), GXutil.rtrim( localUtil.format( AV91Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeResumenporCliente_WC.htm");
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
               AV85GXV1 = nGXsfl_34_idx ;
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

   public void start28Q2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Resumen por Cliente", ""), (short)(0)) ;
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
            strup28Q0( ) ;
         }
      }
   }

   public void ws28Q2( )
   {
      start28Q2( ) ;
      evt28Q2( ) ;
   }

   public void evt28Q2( )
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
                              strup28Q0( ) ;
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
                              strup28Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1228Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1328Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1428Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1528Q2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup28Q0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
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
                              strup28Q0( ) ;
                           }
                           nGXsfl_34_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_34_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_34_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_342( ) ;
                           AV85GXV1 = (int)(nGXsfl_34_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV53InformeResumenporCliente_SDT.size() >= AV85GXV1 ) && ( AV85GXV1 > 0 ) )
                           {
                              AV53InformeResumenporCliente_SDT.currentItem( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)) );
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
                                       GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1628Q2 ();
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
                                       GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1728Q2 ();
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
                                       GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1828Q2 ();
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
                                       GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e1928Q2 ();
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
                                    strup28Q0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
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

   public void we28Q2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm28Q2( ) ;
         }
      }
   }

   public void pa28Q2( )
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
            GX_FocusControl = edtavTotvalue_totkilc_Internalname ;
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
                                 String AV91Pgmname ,
                                 String AV43EmprCod ,
                                 String AV63Prio ,
                                 int AV13Clicod ,
                                 int AV38Clicod_to ,
                                 java.util.Date AV6ALbProfch ,
                                 java.util.Date AV24ALbProfch_to ,
                                 String AV11Barser ,
                                 String AV37Barser_to ,
                                 String AV5AlbEncCli ,
                                 String AV23AlbEncCli_to ,
                                 String AV7BarColNom ,
                                 String AV30BarColNom_to ,
                                 int AV8BarColNum ,
                                 int AV31BarColNum_to ,
                                 byte AV9Barestreo ,
                                 byte AV33Barestreoi ,
                                 byte AV32barestreof ,
                                 String AV19TipDisCod ,
                                 GXBaseCollection<app.SdtInformeResumenporCliente_SDT_Item> AV53InformeResumenporCliente_SDT ,
                                 java.math.BigDecimal AV68Tot_TotKilC ,
                                 java.math.BigDecimal AV69Tot_TotMetC ,
                                 long AV70Tot_TotPieC ,
                                 String AV54InformeResumenporCliente_SDT_json ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1728Q2 ();
      GRID_nCurrentRecord = 0 ;
      rf28Q2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeResumenporCliente_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV91Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("informeresumenporcliente_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf28Q2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV91Pgmname = "InformeResumenporCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91Pgmname", AV91Pgmname);
      Gx_err = (short)(0) ;
      edtavInformeresumenporcliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__totkilc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__totkilc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__totkilc_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__totmetc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__totmetc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__totmetc_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__totpiec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__totpiec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__totpiec_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavTotvalue_totkilc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totkilc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totkilc_Enabled), 5, 0), true);
      edtavTotvalue_totmetc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totmetc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totmetc_Enabled), 5, 0), true);
      edtavTotvalue_totpiec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpiec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpiec_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf28Q2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(34) ;
      /* Execute user event: Refresh */
      e1728Q2 ();
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
         e1828Q2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_34_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1828Q2 ();
         }
         wbEnd = (short)(34) ;
         wb28Q0( ) ;
      }
      bGXsfl_34_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28Q2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vINFORMERESUMENPORCLIENTE_SDT", AV53InformeResumenporCliente_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vINFORMERESUMENPORCLIENTE_SDT", AV53InformeResumenporCliente_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT", getSecureSignedToken( sPrefix, AV53InformeResumenporCliente_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTKILC", GXutil.ltrim( localUtil.ntoc( AV68Tot_TotKilC, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTKILC", getSecureSignedToken( sPrefix, localUtil.format( AV68Tot_TotKilC, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTMETC", GXutil.ltrim( localUtil.ntoc( AV69Tot_TotMetC, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTMETC", getSecureSignedToken( sPrefix, localUtil.format( AV69Tot_TotMetC, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_TOTPIEC", GXutil.ltrim( localUtil.ntoc( AV70Tot_TotPieC, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPIEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV70Tot_TotPieC), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFORMERESUMENPORCLIENTE_SDT_JSON", AV54InformeResumenporCliente_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT_JSON", getSecureSignedToken( sPrefix, AV54InformeResumenporCliente_SDT_json));
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
      return AV53InformeResumenporCliente_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91Pgmname, AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV9Barestreo, AV33Barestreoi, AV32barestreof, AV19TipDisCod, AV53InformeResumenporCliente_SDT, AV68Tot_TotKilC, AV69Tot_TotMetC, AV70Tot_TotPieC, AV54InformeResumenporCliente_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91Pgmname, AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV9Barestreo, AV33Barestreoi, AV32barestreof, AV19TipDisCod, AV53InformeResumenporCliente_SDT, AV68Tot_TotKilC, AV69Tot_TotMetC, AV70Tot_TotPieC, AV54InformeResumenporCliente_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91Pgmname, AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV9Barestreo, AV33Barestreoi, AV32barestreof, AV19TipDisCod, AV53InformeResumenporCliente_SDT, AV68Tot_TotKilC, AV69Tot_TotMetC, AV70Tot_TotPieC, AV54InformeResumenporCliente_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91Pgmname, AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV9Barestreo, AV33Barestreoi, AV32barestreof, AV19TipDisCod, AV53InformeResumenporCliente_SDT, AV68Tot_TotKilC, AV69Tot_TotMetC, AV70Tot_TotPieC, AV54InformeResumenporCliente_SDT_json, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91Pgmname, AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV9Barestreo, AV33Barestreoi, AV32barestreof, AV19TipDisCod, AV53InformeResumenporCliente_SDT, AV68Tot_TotKilC, AV69Tot_TotMetC, AV70Tot_TotPieC, AV54InformeResumenporCliente_SDT_json, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV91Pgmname = "InformeResumenporCliente_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91Pgmname", AV91Pgmname);
      Gx_err = (short)(0) ;
      edtavInformeresumenporcliente_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__clicod_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__clinom_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__totkilc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__totkilc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__totkilc_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__totmetc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__totmetc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__totmetc_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavInformeresumenporcliente_sdt__totpiec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeresumenporcliente_sdt__totpiec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeresumenporcliente_sdt__totpiec_Enabled), 5, 0), !bGXsfl_34_Refreshing);
      edtavTotvalue_totkilc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totkilc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totkilc_Enabled), 5, 0), true);
      edtavTotvalue_totmetc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totmetc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totmetc_Enabled), 5, 0), true);
      edtavTotvalue_totpiec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_totpiec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_totpiec_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup28Q0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1628Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Informeresumenporcliente_sdt"), AV53InformeResumenporCliente_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vINFORMERESUMENPORCLIENTE_SDT"), AV53InformeResumenporCliente_SDT);
         /* Read saved values. */
         nRC_GXsfl_34 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_34"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV43EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV43EmprCod") ;
         wcpOAV63Prio = httpContext.cgiGet( sPrefix+"wcpOAV63Prio") ;
         wcpOAV13Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV38Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV6ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6ALbProfch"), 0) ;
         wcpOAV24ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24ALbProfch_to"), 0) ;
         wcpOAV11Barser = httpContext.cgiGet( sPrefix+"wcpOAV11Barser") ;
         wcpOAV37Barser_to = httpContext.cgiGet( sPrefix+"wcpOAV37Barser_to") ;
         wcpOAV5AlbEncCli = httpContext.cgiGet( sPrefix+"wcpOAV5AlbEncCli") ;
         wcpOAV23AlbEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV23AlbEncCli_to") ;
         wcpOAV7BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV7BarColNom") ;
         wcpOAV30BarColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV30BarColNom_to") ;
         wcpOAV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31BarColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Barestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Barestreoi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32barestreof"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV19TipDisCod = httpContext.cgiGet( sPrefix+"wcpOAV19TipDisCod") ;
         AV82DetalleRollos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vDETALLEROLLOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV9Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARESTREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19TipDisCod = httpContext.cgiGet( sPrefix+"vTIPDISCOD") ;
         AV10Barlar = httpContext.cgiGet( sPrefix+"vBARLAR") ;
         AV60Nff = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vNFF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV61Nfi = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vNFI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18Serie = httpContext.cgiGet( sPrefix+"vSERIE") ;
         AV36BarMaqEst2 = httpContext.cgiGet( sPrefix+"vBARMAQEST2") ;
         AV35BarMaqEst1 = httpContext.cgiGet( sPrefix+"vBARMAQEST1") ;
         AV31BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOLNUM_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV30BarColNom_to = httpContext.cgiGet( sPrefix+"vBARCOLNOM_TO") ;
         AV7BarColNom = httpContext.cgiGet( sPrefix+"vBARCOLNOM") ;
         AV28Barcodparf = httpContext.cgiGet( sPrefix+"vBARCODPARF") ;
         AV29Barcodreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODREOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV27Barcodi = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV81Fuente = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vFUENTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV23AlbEncCli_to = httpContext.cgiGet( sPrefix+"vALBENCCLI_TO") ;
         AV5AlbEncCli = httpContext.cgiGet( sPrefix+"vALBENCCLI") ;
         AV37Barser_to = httpContext.cgiGet( sPrefix+"vBARSER_TO") ;
         AV11Barser = httpContext.cgiGet( sPrefix+"vBARSER") ;
         AV24ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"vALBPROFCH_TO"), 0) ;
         AV6ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"vALBPROFCH"), 0) ;
         AV38Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICOD_TO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV13Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV63Prio = httpContext.cgiGet( sPrefix+"vPRIO") ;
         AV14ImpCod = httpContext.cgiGet( sPrefix+"vIMPCOD") ;
         AV43EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
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
            AV85GXV1 = (int)(nGXsfl_34_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV53InformeResumenporCliente_SDT.size() >= AV85GXV1 ) && ( AV85GXV1 > 0 ) )
            {
               AV53InformeResumenporCliente_SDT.currentItem( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)) );
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
         AV71TotValue_TotKilC = httpContext.cgiGet( edtavTotvalue_totkilc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotValue_TotKilC", AV71TotValue_TotKilC);
         AV72TotValue_TotMetC = httpContext.cgiGet( edtavTotvalue_totmetc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotValue_TotMetC", AV72TotValue_TotMetC);
         AV73TotValue_TotPieC = httpContext.cgiGet( edtavTotvalue_totpiec_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotValue_TotPieC", AV73TotValue_TotPieC);
         AV91Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91Pgmname", AV91Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeResumenporCliente_WC");
         AV91Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91Pgmname", AV91Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV91Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("informeresumenporcliente_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1628Q2 ();
      if (returnInSub) return;
   }

   public void e1628Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV67Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeresumenporcliente_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Station = GXt_char1 ;
      GXv_char2[0] = AV43EmprCod ;
      GXv_char3[0] = AV44EmprNom ;
      GXv_char4[0] = AV77UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV67Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeresumenporcliente_wc_impl.this.AV43EmprCod = GXv_char2[0] ;
      informeresumenporcliente_wc_impl.this.AV44EmprNom = GXv_char3[0] ;
      informeresumenporcliente_wc_impl.this.AV77UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXv_char4[0] = AV54InformeResumenporCliente_SDT_json ;
      new app.informeresumenporcliente_prc(remoteHandle, context).execute( AV43EmprCod, AV63Prio, AV13Clicod, AV38Clicod_to, AV6ALbProfch, AV24ALbProfch_to, AV11Barser, AV37Barser_to, AV5AlbEncCli, AV23AlbEncCli_to, AV7BarColNom, AV30BarColNom_to, AV8BarColNum, AV31BarColNum_to, AV19TipDisCod, AV9Barestreo, GXv_char4) ;
      informeresumenporcliente_wc_impl.this.AV54InformeResumenporCliente_SDT_json = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54InformeResumenporCliente_SDT_json", AV54InformeResumenporCliente_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMERESUMENPORCLIENTE_SDT_JSON", getSecureSignedToken( sPrefix, AV54InformeResumenporCliente_SDT_json));
      AV53InformeResumenporCliente_SDT.fromJSonString(AV54InformeResumenporCliente_SDT_json, null);
      gx_BV34 = true ;
   }

   public void e1728Q2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV78WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV78WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1228Q2( )
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
         AV62PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV62PageToGo) ;
      }
   }

   public void e1328Q2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1828Q2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV53InformeResumenporCliente_SDT.size() )
      {
         AV53InformeResumenporCliente_SDT.currentItem( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)) );
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
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
   }

   public void e1428Q2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV46ExcelFilename ;
      GXv_char3[0] = AV45ErrorMessage ;
      new app.informeresumenporcliente_wcexport(remoteHandle, context).execute( AV54InformeResumenporCliente_SDT_json, GXv_char4, GXv_char3) ;
      informeresumenporcliente_wc_impl.this.AV46ExcelFilename = GXv_char4[0] ;
      informeresumenporcliente_wc_impl.this.AV45ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV46ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV46ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV45ErrorMessage);
      }
   }

   public void e1528Q2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV79Websession.setValue(httpContext.getMessage( "&InformeResumenporCliente_SDT_json", ""), AV54InformeResumenporCliente_SDT_json);
      callWebObject(formatLink("app.informeresumenporcliente_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      if ( GXutil.strcmp(AV66Session.getValue(AV91Pgmname+"GridState"), "") == 0 )
      {
         AV50GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV91Pgmname+"GridState"), null, null);
      }
      else
      {
         AV50GridState.fromxml(AV66Session.getValue(AV91Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV50GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV50GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV50GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV50GridState.fromxml(AV66Session.getValue(AV91Pgmname+"GridState"), null, null);
      AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV43EmprCod)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV43EmprCod );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63Prio)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRIO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63Prio );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV13Clicod) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV13Clicod, 6, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV38Clicod_to) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV38Clicod_to, 6, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV6ALbProfch)) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCH" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV6ALbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24ALbProfch_to)) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROFCH_TO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV24ALbProfch_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV11Barser)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV11Barser );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37Barser_to)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARSER_TO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37Barser_to );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV5AlbEncCli)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENCCLI" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5AlbEncCli );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV23AlbEncCli_to)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBENCCLI_TO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV23AlbEncCli_to );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7BarColNom)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7BarColNom );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV30BarColNom_to)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNOM_TO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV30BarColNom_to );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV8BarColNum) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8BarColNum, 6, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV31BarColNum_to) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOLNUM_TO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV31BarColNum_to, 6, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV9Barestreo) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARESTREO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9Barestreo, 1, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV33Barestreoi) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARESTREOI" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV33Barestreoi, 1, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV32barestreof) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARESTREOF" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV32barestreof, 1, 0) );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV19TipDisCod)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPDISCOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV19TipDisCod );
         AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      AV50GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV50GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV91Pgmname+"GridState", AV50GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV68Tot_TotKilC = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Tot_TotKilC", GXutil.ltrimstr( AV68Tot_TotKilC, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTKILC", getSecureSignedToken( sPrefix, localUtil.format( AV68Tot_TotKilC, "ZZZZZZ9.99")));
      AV69Tot_TotMetC = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Tot_TotMetC", GXutil.ltrimstr( AV69Tot_TotMetC, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTMETC", getSecureSignedToken( sPrefix, localUtil.format( AV69Tot_TotMetC, "ZZZZZZ9.99")));
      AV70Tot_TotPieC = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Tot_TotPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Tot_TotPieC), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPIEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV70Tot_TotPieC), "ZZZZZZZZZ9")));
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV92GXV7 = 1 ;
      while ( AV92GXV7 <= AV53InformeResumenporCliente_SDT.size() )
      {
         AV55InformeResumenporCliente_SDTItem = (app.SdtInformeResumenporCliente_SDT_Item)((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV92GXV7));
         AV68Tot_TotKilC = AV68Tot_TotKilC.add((AV55InformeResumenporCliente_SDTItem.getgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Tot_TotKilC", GXutil.ltrimstr( AV68Tot_TotKilC, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTKILC", getSecureSignedToken( sPrefix, localUtil.format( AV68Tot_TotKilC, "ZZZZZZ9.99")));
         AV69Tot_TotMetC = AV69Tot_TotMetC.add((AV55InformeResumenporCliente_SDTItem.getgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69Tot_TotMetC", GXutil.ltrimstr( AV69Tot_TotMetC, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTMETC", getSecureSignedToken( sPrefix, localUtil.format( AV69Tot_TotMetC, "ZZZZZZ9.99")));
         AV70Tot_TotPieC = (long)(AV70Tot_TotPieC+(AV55InformeResumenporCliente_SDTItem.getgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Tot_TotPieC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Tot_TotPieC), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_TOTPIEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV70Tot_TotPieC), "ZZZZZZZZZ9")));
         AV92GXV7 = (int)(AV92GXV7+1) ;
      }
      AV71TotValue_TotKilC = localUtil.format( AV68Tot_TotKilC, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotValue_TotKilC", AV71TotValue_TotKilC);
      AV72TotValue_TotMetC = localUtil.format( AV69Tot_TotMetC, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotValue_TotMetC", AV72TotValue_TotMetC);
      AV73TotValue_TotPieC = localUtil.format( DecimalUtil.doubleToDec(AV70Tot_TotPieC), "ZZZZZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotValue_TotPieC", AV73TotValue_TotPieC);
   }

   public void e1928Q2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      AV79Websession.setValue(httpContext.getMessage( "&InformeResumenporCliente_SDT_json", ""), AV54InformeResumenporCliente_SDT_json);
      System.out.println( httpContext.getMessage( "&InformeResumenporCliente_SDT_json=", "")+AV54InformeResumenporCliente_SDT_json );
   }

   public void wb_table2_42_28Q2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totkilc_Internalname, httpContext.getMessage( "Tot Value_Tot Kil C", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totkilc_Internalname, AV71TotValue_TotKilC, GXutil.rtrim( localUtil.format( AV71TotValue_TotKilC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totkilc_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totkilc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeResumenporCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totmetc_Internalname, httpContext.getMessage( "Tot Value_Tot Met C", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totmetc_Internalname, AV72TotValue_TotMetC, GXutil.rtrim( localUtil.format( AV72TotValue_TotMetC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totmetc_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totmetc_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeResumenporCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_totpiec_Internalname, httpContext.getMessage( "Tot Value_Tot Pie C", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'" + sGXsfl_34_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_totpiec_Internalname, AV73TotValue_TotPieC, GXutil.rtrim( localUtil.format( AV73TotValue_TotPieC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_totpiec_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_totpiec_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_InformeResumenporCliente_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_42_28Q2e( true) ;
      }
      else
      {
         wb_table2_42_28Q2e( false) ;
      }
   }

   public void wb_table1_23_28Q2( boolean wbgen )
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
         wb_table1_23_28Q2e( true) ;
      }
      else
      {
         wb_table1_23_28Q2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV43EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
      AV63Prio = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Prio", AV63Prio);
      AV13Clicod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Clicod), 6, 0));
      AV38Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod_to), 6, 0));
      AV6ALbProfch = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbProfch", localUtil.format(AV6ALbProfch, "99/99/99"));
      AV24ALbProfch_to = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ALbProfch_to", localUtil.format(AV24ALbProfch_to, "99/99/99"));
      AV11Barser = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Barser", AV11Barser);
      AV37Barser_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barser_to", AV37Barser_to);
      AV5AlbEncCli = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEncCli", AV5AlbEncCli);
      AV23AlbEncCli_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23AlbEncCli_to", AV23AlbEncCli_to);
      AV7BarColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom", AV7BarColNom);
      AV30BarColNom_to = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarColNom_to", AV30BarColNom_to);
      AV8BarColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
      AV31BarColNum_to = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarColNum_to), 6, 0));
      AV9Barestreo = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Barestreo", GXutil.str( AV9Barestreo, 1, 0));
      AV33Barestreoi = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barestreoi", GXutil.str( AV33Barestreoi, 1, 0));
      AV32barestreof = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barestreof", GXutil.str( AV32barestreof, 1, 0));
      AV19TipDisCod = (String)getParm(obj,17,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipDisCod", AV19TipDisCod);
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
      pa28Q2( ) ;
      ws28Q2( ) ;
      we28Q2( ) ;
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
      sCtrlAV43EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV63Prio = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV13Clicod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV38Clicod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV6ALbProfch = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV24ALbProfch_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV11Barser = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV37Barser_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV5AlbEncCli = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV23AlbEncCli_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV7BarColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV30BarColNom_to = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV8BarColNum = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV31BarColNum_to = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV9Barestreo = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV33Barestreoi = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV32barestreof = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV19TipDisCod = (String)getParm(obj,17,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa28Q2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "informeresumenporcliente_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa28Q2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV43EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
         AV63Prio = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Prio", AV63Prio);
         AV13Clicod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Clicod), 6, 0));
         AV38Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod_to), 6, 0));
         AV6ALbProfch = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbProfch", localUtil.format(AV6ALbProfch, "99/99/99"));
         AV24ALbProfch_to = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ALbProfch_to", localUtil.format(AV24ALbProfch_to, "99/99/99"));
         AV11Barser = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Barser", AV11Barser);
         AV37Barser_to = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barser_to", AV37Barser_to);
         AV5AlbEncCli = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEncCli", AV5AlbEncCli);
         AV23AlbEncCli_to = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23AlbEncCli_to", AV23AlbEncCli_to);
         AV7BarColNom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom", AV7BarColNom);
         AV30BarColNom_to = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarColNom_to", AV30BarColNom_to);
         AV8BarColNum = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
         AV31BarColNum_to = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarColNum_to), 6, 0));
         AV9Barestreo = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Barestreo", GXutil.str( AV9Barestreo, 1, 0));
         AV33Barestreoi = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barestreoi", GXutil.str( AV33Barestreoi, 1, 0));
         AV32barestreof = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barestreof", GXutil.str( AV32barestreof, 1, 0));
         AV19TipDisCod = (String)getParm(obj,19,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipDisCod", AV19TipDisCod);
      }
      wcpOAV43EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV43EmprCod") ;
      wcpOAV63Prio = httpContext.cgiGet( sPrefix+"wcpOAV63Prio") ;
      wcpOAV13Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV38Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV38Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV6ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV6ALbProfch"), 0) ;
      wcpOAV24ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV24ALbProfch_to"), 0) ;
      wcpOAV11Barser = httpContext.cgiGet( sPrefix+"wcpOAV11Barser") ;
      wcpOAV37Barser_to = httpContext.cgiGet( sPrefix+"wcpOAV37Barser_to") ;
      wcpOAV5AlbEncCli = httpContext.cgiGet( sPrefix+"wcpOAV5AlbEncCli") ;
      wcpOAV23AlbEncCli_to = httpContext.cgiGet( sPrefix+"wcpOAV23AlbEncCli_to") ;
      wcpOAV7BarColNom = httpContext.cgiGet( sPrefix+"wcpOAV7BarColNom") ;
      wcpOAV30BarColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV30BarColNom_to") ;
      wcpOAV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8BarColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31BarColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Barestreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Barestreoi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32barestreof"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV19TipDisCod = httpContext.cgiGet( sPrefix+"wcpOAV19TipDisCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV43EmprCod, wcpOAV43EmprCod) != 0 ) || ( GXutil.strcmp(AV63Prio, wcpOAV63Prio) != 0 ) || ( AV13Clicod != wcpOAV13Clicod ) || ( AV38Clicod_to != wcpOAV38Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV6ALbProfch), GXutil.resetTime(wcpOAV6ALbProfch)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV24ALbProfch_to), GXutil.resetTime(wcpOAV24ALbProfch_to)) ) || ( GXutil.strcmp(AV11Barser, wcpOAV11Barser) != 0 ) || ( GXutil.strcmp(AV37Barser_to, wcpOAV37Barser_to) != 0 ) || ( GXutil.strcmp(AV5AlbEncCli, wcpOAV5AlbEncCli) != 0 ) || ( GXutil.strcmp(AV23AlbEncCli_to, wcpOAV23AlbEncCli_to) != 0 ) || ( GXutil.strcmp(AV7BarColNom, wcpOAV7BarColNom) != 0 ) || ( GXutil.strcmp(AV30BarColNom_to, wcpOAV30BarColNom_to) != 0 ) || ( AV8BarColNum != wcpOAV8BarColNum ) || ( AV31BarColNum_to != wcpOAV31BarColNum_to ) || ( AV9Barestreo != wcpOAV9Barestreo ) || ( AV33Barestreoi != wcpOAV33Barestreoi ) || ( AV32barestreof != wcpOAV32barestreof ) || ( GXutil.strcmp(AV19TipDisCod, wcpOAV19TipDisCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV43EmprCod = AV43EmprCod ;
      wcpOAV63Prio = AV63Prio ;
      wcpOAV13Clicod = AV13Clicod ;
      wcpOAV38Clicod_to = AV38Clicod_to ;
      wcpOAV6ALbProfch = AV6ALbProfch ;
      wcpOAV24ALbProfch_to = AV24ALbProfch_to ;
      wcpOAV11Barser = AV11Barser ;
      wcpOAV37Barser_to = AV37Barser_to ;
      wcpOAV5AlbEncCli = AV5AlbEncCli ;
      wcpOAV23AlbEncCli_to = AV23AlbEncCli_to ;
      wcpOAV7BarColNom = AV7BarColNom ;
      wcpOAV30BarColNom_to = AV30BarColNom_to ;
      wcpOAV8BarColNum = AV8BarColNum ;
      wcpOAV31BarColNum_to = AV31BarColNum_to ;
      wcpOAV9Barestreo = AV9Barestreo ;
      wcpOAV33Barestreoi = AV33Barestreoi ;
      wcpOAV32barestreof = AV32barestreof ;
      wcpOAV19TipDisCod = AV19TipDisCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV43EmprCod = httpContext.cgiGet( sPrefix+"AV43EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV43EmprCod) > 0 )
      {
         AV43EmprCod = httpContext.cgiGet( sCtrlAV43EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43EmprCod", AV43EmprCod);
      }
      else
      {
         AV43EmprCod = httpContext.cgiGet( sPrefix+"AV43EmprCod_PARM") ;
      }
      sCtrlAV63Prio = httpContext.cgiGet( sPrefix+"AV63Prio_CTRL") ;
      if ( GXutil.len( sCtrlAV63Prio) > 0 )
      {
         AV63Prio = httpContext.cgiGet( sCtrlAV63Prio) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Prio", AV63Prio);
      }
      else
      {
         AV63Prio = httpContext.cgiGet( sPrefix+"AV63Prio_PARM") ;
      }
      sCtrlAV13Clicod = httpContext.cgiGet( sPrefix+"AV13Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV13Clicod) > 0 )
      {
         AV13Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Clicod), 6, 0));
      }
      else
      {
         AV13Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV38Clicod_to = httpContext.cgiGet( sPrefix+"AV38Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV38Clicod_to) > 0 )
      {
         AV38Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV38Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38Clicod_to), 6, 0));
      }
      else
      {
         AV38Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV38Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV6ALbProfch = httpContext.cgiGet( sPrefix+"AV6ALbProfch_CTRL") ;
      if ( GXutil.len( sCtrlAV6ALbProfch) > 0 )
      {
         AV6ALbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV6ALbProfch), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ALbProfch", localUtil.format(AV6ALbProfch, "99/99/99"));
      }
      else
      {
         AV6ALbProfch = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV6ALbProfch_PARM"), 0) ;
      }
      sCtrlAV24ALbProfch_to = httpContext.cgiGet( sPrefix+"AV24ALbProfch_to_CTRL") ;
      if ( GXutil.len( sCtrlAV24ALbProfch_to) > 0 )
      {
         AV24ALbProfch_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV24ALbProfch_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24ALbProfch_to", localUtil.format(AV24ALbProfch_to, "99/99/99"));
      }
      else
      {
         AV24ALbProfch_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV24ALbProfch_to_PARM"), 0) ;
      }
      sCtrlAV11Barser = httpContext.cgiGet( sPrefix+"AV11Barser_CTRL") ;
      if ( GXutil.len( sCtrlAV11Barser) > 0 )
      {
         AV11Barser = httpContext.cgiGet( sCtrlAV11Barser) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Barser", AV11Barser);
      }
      else
      {
         AV11Barser = httpContext.cgiGet( sPrefix+"AV11Barser_PARM") ;
      }
      sCtrlAV37Barser_to = httpContext.cgiGet( sPrefix+"AV37Barser_to_CTRL") ;
      if ( GXutil.len( sCtrlAV37Barser_to) > 0 )
      {
         AV37Barser_to = httpContext.cgiGet( sCtrlAV37Barser_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Barser_to", AV37Barser_to);
      }
      else
      {
         AV37Barser_to = httpContext.cgiGet( sPrefix+"AV37Barser_to_PARM") ;
      }
      sCtrlAV5AlbEncCli = httpContext.cgiGet( sPrefix+"AV5AlbEncCli_CTRL") ;
      if ( GXutil.len( sCtrlAV5AlbEncCli) > 0 )
      {
         AV5AlbEncCli = httpContext.cgiGet( sCtrlAV5AlbEncCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbEncCli", AV5AlbEncCli);
      }
      else
      {
         AV5AlbEncCli = httpContext.cgiGet( sPrefix+"AV5AlbEncCli_PARM") ;
      }
      sCtrlAV23AlbEncCli_to = httpContext.cgiGet( sPrefix+"AV23AlbEncCli_to_CTRL") ;
      if ( GXutil.len( sCtrlAV23AlbEncCli_to) > 0 )
      {
         AV23AlbEncCli_to = httpContext.cgiGet( sCtrlAV23AlbEncCli_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23AlbEncCli_to", AV23AlbEncCli_to);
      }
      else
      {
         AV23AlbEncCli_to = httpContext.cgiGet( sPrefix+"AV23AlbEncCli_to_PARM") ;
      }
      sCtrlAV7BarColNom = httpContext.cgiGet( sPrefix+"AV7BarColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV7BarColNom) > 0 )
      {
         AV7BarColNom = httpContext.cgiGet( sCtrlAV7BarColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarColNom", AV7BarColNom);
      }
      else
      {
         AV7BarColNom = httpContext.cgiGet( sPrefix+"AV7BarColNom_PARM") ;
      }
      sCtrlAV30BarColNom_to = httpContext.cgiGet( sPrefix+"AV30BarColNom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarColNom_to) > 0 )
      {
         AV30BarColNom_to = httpContext.cgiGet( sCtrlAV30BarColNom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarColNom_to", AV30BarColNom_to);
      }
      else
      {
         AV30BarColNom_to = httpContext.cgiGet( sPrefix+"AV30BarColNom_to_PARM") ;
      }
      sCtrlAV8BarColNum = httpContext.cgiGet( sPrefix+"AV8BarColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV8BarColNum) > 0 )
      {
         AV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8BarColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8BarColNum), 6, 0));
      }
      else
      {
         AV8BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8BarColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31BarColNum_to = httpContext.cgiGet( sPrefix+"AV31BarColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV31BarColNum_to) > 0 )
      {
         AV31BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31BarColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarColNum_to), 6, 0));
      }
      else
      {
         AV31BarColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31BarColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9Barestreo = httpContext.cgiGet( sPrefix+"AV9Barestreo_CTRL") ;
      if ( GXutil.len( sCtrlAV9Barestreo) > 0 )
      {
         AV9Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9Barestreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Barestreo", GXutil.str( AV9Barestreo, 1, 0));
      }
      else
      {
         AV9Barestreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9Barestreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33Barestreoi = httpContext.cgiGet( sPrefix+"AV33Barestreoi_CTRL") ;
      if ( GXutil.len( sCtrlAV33Barestreoi) > 0 )
      {
         AV33Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33Barestreoi), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Barestreoi", GXutil.str( AV33Barestreoi, 1, 0));
      }
      else
      {
         AV33Barestreoi = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33Barestreoi_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32barestreof = httpContext.cgiGet( sPrefix+"AV32barestreof_CTRL") ;
      if ( GXutil.len( sCtrlAV32barestreof) > 0 )
      {
         AV32barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32barestreof), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32barestreof", GXutil.str( AV32barestreof, 1, 0));
      }
      else
      {
         AV32barestreof = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32barestreof_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV19TipDisCod = httpContext.cgiGet( sPrefix+"AV19TipDisCod_CTRL") ;
      if ( GXutil.len( sCtrlAV19TipDisCod) > 0 )
      {
         AV19TipDisCod = httpContext.cgiGet( sCtrlAV19TipDisCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TipDisCod", AV19TipDisCod);
      }
      else
      {
         AV19TipDisCod = httpContext.cgiGet( sPrefix+"AV19TipDisCod_PARM") ;
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
      pa28Q2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws28Q2( ) ;
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
      ws28Q2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43EmprCod_PARM", GXutil.rtrim( AV43EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV43EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV43EmprCod_CTRL", GXutil.rtrim( sCtrlAV43EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Prio_PARM", GXutil.rtrim( AV63Prio));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63Prio)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Prio_CTRL", GXutil.rtrim( sCtrlAV63Prio));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV13Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Clicod_CTRL", GXutil.rtrim( sCtrlAV13Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV38Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Clicod_to_CTRL", GXutil.rtrim( sCtrlAV38Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ALbProfch_PARM", localUtil.dtoc( AV6ALbProfch, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ALbProfch)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ALbProfch_CTRL", GXutil.rtrim( sCtrlAV6ALbProfch));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24ALbProfch_to_PARM", localUtil.dtoc( AV24ALbProfch_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24ALbProfch_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24ALbProfch_to_CTRL", GXutil.rtrim( sCtrlAV24ALbProfch_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Barser_PARM", GXutil.rtrim( AV11Barser));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11Barser)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Barser_CTRL", GXutil.rtrim( sCtrlAV11Barser));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barser_to_PARM", GXutil.rtrim( AV37Barser_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Barser_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Barser_to_CTRL", GXutil.rtrim( sCtrlAV37Barser_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbEncCli_PARM", GXutil.rtrim( AV5AlbEncCli));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5AlbEncCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbEncCli_CTRL", GXutil.rtrim( sCtrlAV5AlbEncCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23AlbEncCli_to_PARM", GXutil.rtrim( AV23AlbEncCli_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23AlbEncCli_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23AlbEncCli_to_CTRL", GXutil.rtrim( sCtrlAV23AlbEncCli_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarColNom_PARM", GXutil.rtrim( AV7BarColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7BarColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7BarColNom_CTRL", GXutil.rtrim( sCtrlAV7BarColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarColNom_to_PARM", GXutil.rtrim( AV30BarColNom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarColNom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarColNom_to_CTRL", GXutil.rtrim( sCtrlAV30BarColNom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV8BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8BarColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8BarColNum_CTRL", GXutil.rtrim( sCtrlAV8BarColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV31BarColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31BarColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarColNum_to_CTRL", GXutil.rtrim( sCtrlAV31BarColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Barestreo_PARM", GXutil.ltrim( localUtil.ntoc( AV9Barestreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Barestreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Barestreo_CTRL", GXutil.rtrim( sCtrlAV9Barestreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Barestreoi_PARM", GXutil.ltrim( localUtil.ntoc( AV33Barestreoi, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Barestreoi)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Barestreoi_CTRL", GXutil.rtrim( sCtrlAV33Barestreoi));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32barestreof_PARM", GXutil.ltrim( localUtil.ntoc( AV32barestreof, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32barestreof)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32barestreof_CTRL", GXutil.rtrim( sCtrlAV32barestreof));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19TipDisCod_PARM", GXutil.rtrim( AV19TipDisCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19TipDisCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19TipDisCod_CTRL", GXutil.rtrim( sCtrlAV19TipDisCod));
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
      we28Q2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555942", true, true);
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
      httpContext.AddJavascriptSource("informeresumenporcliente_wc.js", "?20268211555943", false, true);
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
      edtavInformeresumenporcliente_sdt__clicod_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__CLICOD_"+sGXsfl_34_idx ;
      edtavInformeresumenporcliente_sdt__clinom_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__CLINOM_"+sGXsfl_34_idx ;
      edtavInformeresumenporcliente_sdt__totkilc_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTKILC_"+sGXsfl_34_idx ;
      edtavInformeresumenporcliente_sdt__totmetc_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTMETC_"+sGXsfl_34_idx ;
      edtavInformeresumenporcliente_sdt__totpiec_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTPIEC_"+sGXsfl_34_idx ;
   }

   public void subsflControlProps_fel_342( )
   {
      edtavInformeresumenporcliente_sdt__clicod_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__CLICOD_"+sGXsfl_34_fel_idx ;
      edtavInformeresumenporcliente_sdt__clinom_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__CLINOM_"+sGXsfl_34_fel_idx ;
      edtavInformeresumenporcliente_sdt__totkilc_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTKILC_"+sGXsfl_34_fel_idx ;
      edtavInformeresumenporcliente_sdt__totmetc_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTMETC_"+sGXsfl_34_fel_idx ;
      edtavInformeresumenporcliente_sdt__totpiec_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTPIEC_"+sGXsfl_34_fel_idx ;
   }

   public void sendrow_342( )
   {
      subsflControlProps_342( ) ;
      wb28Q0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeresumenporcliente_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeresumenporcliente_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeresumenporcliente_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavInformeresumenporcliente_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeresumenporcliente_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeresumenporcliente_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavInformeresumenporcliente_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeresumenporcliente_sdt__totkilc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeresumenporcliente_sdt__totkilc_Enabled!=0) ? localUtil.format( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totkilc(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeresumenporcliente_sdt__totkilc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavInformeresumenporcliente_sdt__totkilc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeresumenporcliente_sdt__totmetc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeresumenporcliente_sdt__totmetc_Enabled!=0) ? localUtil.format( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totmetc(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeresumenporcliente_sdt__totmetc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavInformeresumenporcliente_sdt__totmetc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeresumenporcliente_sdt__totpiec_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeresumenporcliente_sdt__totpiec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtInformeResumenporCliente_SDT_Item)AV53InformeResumenporCliente_SDT.elementAt(-1+AV85GXV1)).getgxTv_SdtInformeResumenporCliente_SDT_Item_Totpiec()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeresumenporcliente_sdt__totpiec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavInformeresumenporcliente_sdt__totpiec_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes28Q2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Tot. Kgs. Entregues.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Mts. Entregues.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot. Pzs. Entregues.", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeresumenporcliente_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeresumenporcliente_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeresumenporcliente_sdt__totkilc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeresumenporcliente_sdt__totmetc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeresumenporcliente_sdt__totpiec_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnpdfwin_Internalname = sPrefix+"BTNPDFWIN" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavInformeresumenporcliente_sdt__clicod_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__CLICOD" ;
      edtavInformeresumenporcliente_sdt__clinom_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__CLINOM" ;
      edtavInformeresumenporcliente_sdt__totkilc_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTKILC" ;
      edtavInformeresumenporcliente_sdt__totmetc_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTMETC" ;
      edtavInformeresumenporcliente_sdt__totpiec_Internalname = sPrefix+"INFORMERESUMENPORCLIENTE_SDT__TOTPIEC" ;
      edtavTotvalue_totkilc_Internalname = sPrefix+"vTOTVALUE_TOTKILC" ;
      edtavTotvalue_totmetc_Internalname = sPrefix+"vTOTVALUE_TOTMETC" ;
      edtavTotvalue_totpiec_Internalname = sPrefix+"vTOTVALUE_TOTPIEC" ;
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
      edtavInformeresumenporcliente_sdt__totpiec_Jsonclick = "" ;
      edtavInformeresumenporcliente_sdt__totpiec_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__totmetc_Jsonclick = "" ;
      edtavInformeresumenporcliente_sdt__totmetc_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__totkilc_Jsonclick = "" ;
      edtavInformeresumenporcliente_sdt__totkilc_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__clinom_Jsonclick = "" ;
      edtavInformeresumenporcliente_sdt__clinom_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__clicod_Jsonclick = "" ;
      edtavInformeresumenporcliente_sdt__clicod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_totpiec_Jsonclick = "" ;
      edtavTotvalue_totpiec_Enabled = 1 ;
      edtavTotvalue_totmetc_Jsonclick = "" ;
      edtavTotvalue_totmetc_Enabled = 1 ;
      edtavTotvalue_totkilc_Jsonclick = "" ;
      edtavTotvalue_totkilc_Enabled = 1 ;
      edtavInformeresumenporcliente_sdt__totpiec_Enabled = -1 ;
      edtavInformeresumenporcliente_sdt__totmetc_Enabled = -1 ;
      edtavInformeresumenporcliente_sdt__totkilc_Enabled = -1 ;
      edtavInformeresumenporcliente_sdt__clinom_Enabled = -1 ;
      edtavInformeresumenporcliente_sdt__clicod_Enabled = -1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63Prio',fld:'vPRIO',pic:'9'},{av:'AV13Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV38Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV6ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV24ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV11Barser',fld:'vBARSER',pic:''},{av:'AV37Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV5AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV23AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV7BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV30BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV8BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV31BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV9Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV33Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV32barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV19TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV53InformeResumenporCliente_SDT',fld:'vINFORMERESUMENPORCLIENTE_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV68Tot_TotKilC',fld:'vTOT_TOTKILC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV69Tot_TotMetC',fld:'vTOT_TOTMETC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV70Tot_TotPieC',fld:'vTOT_TOTPIEC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54InformeResumenporCliente_SDT_json',fld:'vINFORMERESUMENPORCLIENTE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV68Tot_TotKilC',fld:'vTOT_TOTKILC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV69Tot_TotMetC',fld:'vTOT_TOTMETC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV70Tot_TotPieC',fld:'vTOT_TOTPIEC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV71TotValue_TotKilC',fld:'vTOTVALUE_TOTKILC',pic:''},{av:'AV72TotValue_TotMetC',fld:'vTOTVALUE_TOTMETC',pic:''},{av:'AV73TotValue_TotPieC',fld:'vTOTVALUE_TOTPIEC',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1228Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63Prio',fld:'vPRIO',pic:'9'},{av:'AV13Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV38Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV6ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV24ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV11Barser',fld:'vBARSER',pic:''},{av:'AV37Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV5AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV23AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV7BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV30BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV8BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV31BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV9Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV33Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV32barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV19TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV53InformeResumenporCliente_SDT',fld:'vINFORMERESUMENPORCLIENTE_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV68Tot_TotKilC',fld:'vTOT_TOTKILC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV69Tot_TotMetC',fld:'vTOT_TOTMETC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV70Tot_TotPieC',fld:'vTOT_TOTPIEC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54InformeResumenporCliente_SDT_json',fld:'vINFORMERESUMENPORCLIENTE_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1328Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63Prio',fld:'vPRIO',pic:'9'},{av:'AV13Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV38Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV6ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV24ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV11Barser',fld:'vBARSER',pic:''},{av:'AV37Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV5AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV23AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV7BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV30BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV8BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV31BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV9Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV33Barestreoi',fld:'vBARESTREOI',pic:'9'},{av:'AV32barestreof',fld:'vBARESTREOF',pic:'9'},{av:'AV19TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV53InformeResumenporCliente_SDT',fld:'vINFORMERESUMENPORCLIENTE_SDT',grid:34,pic:'',hsh:true},{av:'nGXsfl_34_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:34},{av:'nRC_GXsfl_34',ctrl:'GRID',prop:'GridRC',grid:34},{av:'AV68Tot_TotKilC',fld:'vTOT_TOTKILC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV69Tot_TotMetC',fld:'vTOT_TOTMETC',pic:'ZZZZZZ9.99',hsh:true},{av:'AV70Tot_TotPieC',fld:'vTOT_TOTPIEC',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV54InformeResumenporCliente_SDT_json',fld:'vINFORMERESUMENPORCLIENTE_SDT_JSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1828Q2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOPDFWIN'","{handler:'e1128Q1',iparms:[{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ImpCod',fld:'vIMPCOD',pic:''},{av:'AV63Prio',fld:'vPRIO',pic:'9'},{av:'AV13Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV38Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV6ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV24ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV11Barser',fld:'vBARSER',pic:''},{av:'AV37Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV5AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV23AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV81Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV27Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV29Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV28Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV7BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV30BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV8BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV31BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV36BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV18Serie',fld:'vSERIE',pic:''},{av:'AV61Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV60Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV10Barlar',fld:'vBARLAR',pic:''},{av:'AV19TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV9Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV82DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'}]");
      setEventMetadata("'DOPDFWIN'",",oparms:[{av:'AV82DetalleRollos',fld:'vDETALLEROLLOS',pic:'ZZZ9'},{av:'AV9Barestreo',fld:'vBARESTREO',pic:'9'},{av:'AV19TipDisCod',fld:'vTIPDISCOD',pic:''},{av:'AV10Barlar',fld:'vBARLAR',pic:''},{av:'AV60Nff',fld:'vNFF',pic:'ZZZZZ9'},{av:'AV61Nfi',fld:'vNFI',pic:'ZZZZZ9'},{av:'AV18Serie',fld:'vSERIE',pic:''},{av:'AV36BarMaqEst2',fld:'vBARMAQEST2',pic:''},{av:'AV35BarMaqEst1',fld:'vBARMAQEST1',pic:''},{av:'AV31BarColNum_to',fld:'vBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV8BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV30BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV7BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV28Barcodparf',fld:'vBARCODPARF',pic:''},{av:'AV29Barcodreof',fld:'vBARCODREOF',pic:'9'},{av:'AV27Barcodi',fld:'vBARCODI',pic:'ZZZZZZZ9'},{av:'AV81Fuente',fld:'vFUENTE',pic:'ZZZ9'},{av:'AV23AlbEncCli_to',fld:'vALBENCCLI_TO',pic:''},{av:'AV5AlbEncCli',fld:'vALBENCCLI',pic:''},{av:'AV37Barser_to',fld:'vBARSER_TO',pic:''},{av:'AV11Barser',fld:'vBARSER',pic:''},{av:'AV24ALbProfch_to',fld:'vALBPROFCH_TO',pic:''},{av:'AV6ALbProfch',fld:'vALBPROFCH',pic:''},{av:'AV38Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV13Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV63Prio',fld:'vPRIO',pic:'9'},{av:'AV14ImpCod',fld:'vIMPCOD',pic:''},{av:'AV43EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1428Q2',iparms:[{av:'AV54InformeResumenporCliente_SDT_json',fld:'vINFORMERESUMENPORCLIENTE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1528Q2',iparms:[{av:'AV54InformeResumenporCliente_SDT_json',fld:'vINFORMERESUMENPORCLIENTE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1928Q2',iparms:[{av:'AV54InformeResumenporCliente_SDT_json',fld:'vINFORMERESUMENPORCLIENTE_SDT_JSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv6',iparms:[]");
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
      wcpOAV43EmprCod = "" ;
      wcpOAV63Prio = "" ;
      wcpOAV6ALbProfch = GXutil.nullDate() ;
      wcpOAV24ALbProfch_to = GXutil.nullDate() ;
      wcpOAV11Barser = "" ;
      wcpOAV37Barser_to = "" ;
      wcpOAV5AlbEncCli = "" ;
      wcpOAV23AlbEncCli_to = "" ;
      wcpOAV7BarColNom = "" ;
      wcpOAV30BarColNom_to = "" ;
      wcpOAV19TipDisCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV43EmprCod = "" ;
      AV63Prio = "" ;
      AV6ALbProfch = GXutil.nullDate() ;
      AV24ALbProfch_to = GXutil.nullDate() ;
      AV11Barser = "" ;
      AV37Barser_to = "" ;
      AV5AlbEncCli = "" ;
      AV23AlbEncCli_to = "" ;
      AV7BarColNom = "" ;
      AV30BarColNom_to = "" ;
      AV19TipDisCod = "" ;
      AV91Pgmname = "" ;
      AV53InformeResumenporCliente_SDT = new GXBaseCollection<app.SdtInformeResumenporCliente_SDT_Item>(app.SdtInformeResumenporCliente_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV68Tot_TotKilC = DecimalUtil.ZERO ;
      AV69Tot_TotMetC = DecimalUtil.ZERO ;
      AV54InformeResumenporCliente_SDT_json = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV14ImpCod = "" ;
      AV28Barcodparf = "" ;
      AV35BarMaqEst1 = "" ;
      AV36BarMaqEst2 = "" ;
      AV18Serie = "" ;
      AV10Barlar = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnpdfwin_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
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
      AV71TotValue_TotKilC = "" ;
      AV72TotValue_TotMetC = "" ;
      AV73TotValue_TotPieC = "" ;
      hsh = "" ;
      AV67Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV44EmprNom = "" ;
      AV77UsurCod = "" ;
      AV78WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV46ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV45ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV79Websession = httpContext.getWebSession();
      AV66Session = httpContext.getWebSession();
      AV50GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV55InformeResumenporCliente_SDTItem = new app.SdtInformeResumenporCliente_SDT_Item(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV43EmprCod = "" ;
      sCtrlAV63Prio = "" ;
      sCtrlAV13Clicod = "" ;
      sCtrlAV38Clicod_to = "" ;
      sCtrlAV6ALbProfch = "" ;
      sCtrlAV24ALbProfch_to = "" ;
      sCtrlAV11Barser = "" ;
      sCtrlAV37Barser_to = "" ;
      sCtrlAV5AlbEncCli = "" ;
      sCtrlAV23AlbEncCli_to = "" ;
      sCtrlAV7BarColNom = "" ;
      sCtrlAV30BarColNom_to = "" ;
      sCtrlAV8BarColNum = "" ;
      sCtrlAV31BarColNum_to = "" ;
      sCtrlAV9Barestreo = "" ;
      sCtrlAV33Barestreoi = "" ;
      sCtrlAV32barestreof = "" ;
      sCtrlAV19TipDisCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV91Pgmname = "InformeResumenporCliente_WC" ;
      /* GeneXus formulas. */
      AV91Pgmname = "InformeResumenporCliente_WC" ;
      Gx_err = (short)(0) ;
      edtavInformeresumenporcliente_sdt__clicod_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__clinom_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__totkilc_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__totmetc_Enabled = 0 ;
      edtavInformeresumenporcliente_sdt__totpiec_Enabled = 0 ;
      edtavTotvalue_totkilc_Enabled = 0 ;
      edtavTotvalue_totmetc_Enabled = 0 ;
      edtavTotvalue_totpiec_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV9Barestreo ;
   private byte wcpOAV33Barestreoi ;
   private byte wcpOAV32barestreof ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV9Barestreo ;
   private byte AV33Barestreoi ;
   private byte AV32barestreof ;
   private byte AV29Barcodreof ;
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
   private short AV81Fuente ;
   private short AV82DetalleRollos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV13Clicod ;
   private int wcpOAV38Clicod_to ;
   private int wcpOAV8BarColNum ;
   private int wcpOAV31BarColNum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_34 ;
   private int AV13Clicod ;
   private int AV38Clicod_to ;
   private int AV8BarColNum ;
   private int AV31BarColNum_to ;
   private int nGXsfl_34_idx=1 ;
   private int AV27Barcodi ;
   private int AV61Nfi ;
   private int AV60Nff ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV85GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavInformeresumenporcliente_sdt__clicod_Enabled ;
   private int edtavInformeresumenporcliente_sdt__clinom_Enabled ;
   private int edtavInformeresumenporcliente_sdt__totkilc_Enabled ;
   private int edtavInformeresumenporcliente_sdt__totmetc_Enabled ;
   private int edtavInformeresumenporcliente_sdt__totpiec_Enabled ;
   private int edtavTotvalue_totkilc_Enabled ;
   private int edtavTotvalue_totmetc_Enabled ;
   private int edtavTotvalue_totpiec_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_34_fel_idx=1 ;
   private int AV62PageToGo ;
   private int AV92GXV7 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV70Tot_TotPieC ;
   private long AV48GridCurrentPage ;
   private long AV49GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV68Tot_TotKilC ;
   private java.math.BigDecimal AV69Tot_TotMetC ;
   private String wcpOAV43EmprCod ;
   private String wcpOAV63Prio ;
   private String wcpOAV11Barser ;
   private String wcpOAV37Barser_to ;
   private String wcpOAV5AlbEncCli ;
   private String wcpOAV23AlbEncCli_to ;
   private String wcpOAV7BarColNom ;
   private String wcpOAV30BarColNom_to ;
   private String wcpOAV19TipDisCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV43EmprCod ;
   private String AV63Prio ;
   private String AV11Barser ;
   private String AV37Barser_to ;
   private String AV5AlbEncCli ;
   private String AV23AlbEncCli_to ;
   private String AV7BarColNom ;
   private String AV30BarColNom_to ;
   private String AV19TipDisCod ;
   private String sGXsfl_34_idx="0001" ;
   private String AV91Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV14ImpCod ;
   private String AV28Barcodparf ;
   private String AV35BarMaqEst1 ;
   private String AV36BarMaqEst2 ;
   private String AV18Serie ;
   private String AV10Barlar ;
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
   private String bttBtnpdfwin_Internalname ;
   private String bttBtnpdfwin_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
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
   private String edtavTotvalue_totkilc_Internalname ;
   private String edtavInformeresumenporcliente_sdt__clicod_Internalname ;
   private String edtavInformeresumenporcliente_sdt__clinom_Internalname ;
   private String edtavInformeresumenporcliente_sdt__totkilc_Internalname ;
   private String edtavInformeresumenporcliente_sdt__totmetc_Internalname ;
   private String edtavInformeresumenporcliente_sdt__totpiec_Internalname ;
   private String edtavTotvalue_totmetc_Internalname ;
   private String edtavTotvalue_totpiec_Internalname ;
   private String sGXsfl_34_fel_idx="0001" ;
   private String hsh ;
   private String AV67Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV44EmprNom ;
   private String AV77UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_totkilc_Jsonclick ;
   private String edtavTotvalue_totmetc_Jsonclick ;
   private String edtavTotvalue_totpiec_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV43EmprCod ;
   private String sCtrlAV63Prio ;
   private String sCtrlAV13Clicod ;
   private String sCtrlAV38Clicod_to ;
   private String sCtrlAV6ALbProfch ;
   private String sCtrlAV24ALbProfch_to ;
   private String sCtrlAV11Barser ;
   private String sCtrlAV37Barser_to ;
   private String sCtrlAV5AlbEncCli ;
   private String sCtrlAV23AlbEncCli_to ;
   private String sCtrlAV7BarColNom ;
   private String sCtrlAV30BarColNom_to ;
   private String sCtrlAV8BarColNum ;
   private String sCtrlAV31BarColNum_to ;
   private String sCtrlAV9Barestreo ;
   private String sCtrlAV33Barestreoi ;
   private String sCtrlAV32barestreof ;
   private String sCtrlAV19TipDisCod ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavInformeresumenporcliente_sdt__clicod_Jsonclick ;
   private String edtavInformeresumenporcliente_sdt__clinom_Jsonclick ;
   private String edtavInformeresumenporcliente_sdt__totkilc_Jsonclick ;
   private String edtavInformeresumenporcliente_sdt__totmetc_Jsonclick ;
   private String edtavInformeresumenporcliente_sdt__totpiec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV6ALbProfch ;
   private java.util.Date wcpOAV24ALbProfch_to ;
   private java.util.Date AV6ALbProfch ;
   private java.util.Date AV24ALbProfch_to ;
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
   private boolean gx_BV34 ;
   private boolean gx_refresh_fired ;
   private String AV54InformeResumenporCliente_SDT_json ;
   private String AV71TotValue_TotKilC ;
   private String AV72TotValue_TotMetC ;
   private String AV73TotValue_TotPieC ;
   private String AV46ExcelFilename ;
   private String AV45ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV66Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV79Websession ;
   private GXBaseCollection<app.SdtInformeResumenporCliente_SDT_Item> AV53InformeResumenporCliente_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV50GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV51GridStateFilterValue ;
   private app.SdtInformeResumenporCliente_SDT_Item AV55InformeResumenporCliente_SDTItem ;
   private app.wwpbaseobjects.SdtWWPContext AV78WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

