package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_wc_impl extends GXWebComponent
{
   public analisiscosteshistoricosrecetas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public analisiscosteshistoricosrecetas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscosteshistoricosrecetas_wc_impl.class ));
   }

   public analisiscosteshistoricosrecetas_wc_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
               AV38Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Emprcod", AV38Emprcod);
               AV39HreRacab = httpContext.GetPar( "HreRacab") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreRacab", AV39HreRacab);
               AV30Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
               AV31Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
               AV23Calculo = (byte)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Calculo", GXutil.str( AV23Calculo, 1, 0));
               AV17barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17barcod), 8, 0));
               AV40barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40barcodreo", GXutil.str( AV40barcodreo, 1, 0));
               AV18barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18barcodpar", AV18barcodpar);
               AV15ARtcod1 = httpContext.GetPar( "ARtcod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ARtcod1", AV15ARtcod1);
               AV16ARtcod3 = httpContext.GetPar( "ARtcod3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ARtcod3", AV16ARtcod3);
               AV19Barcolnom1 = httpContext.GetPar( "Barcolnom1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Barcolnom1", AV19Barcolnom1);
               AV20Barcolnom3 = httpContext.GetPar( "Barcolnom3") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Barcolnom3", AV20Barcolnom3);
               AV21Barcolnum1 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Barcolnum1), 6, 0));
               AV22Barcolnum3 = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barcolnum3), 6, 0));
               AV24Clicod1 = (int)(GXutil.lval( httpContext.GetPar( "Clicod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Clicod1), 6, 0));
               AV25Clicod3 = (int)(GXutil.lval( httpContext.GetPar( "Clicod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
               AV32Intcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Intcod1), 2, 0));
               AV33Intcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Intcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Intcod3), 2, 0));
               AV34TipArtCod1 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TipArtCod1), 4, 0));
               AV35TipArtCod3 = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TipArtCod3), 4, 0));
               AV36Tipcolcod1 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod1"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Tipcolcod1), 2, 0));
               AV37Tipcolcod3 = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod3"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Tipcolcod3), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV38Emprcod,AV39HreRacab,AV30Fec1,AV31Fec2,Byte.valueOf(AV23Calculo),Integer.valueOf(AV17barcod),Byte.valueOf(AV40barcodreo),AV18barcodpar,AV15ARtcod1,AV16ARtcod3,AV19Barcolnom1,AV20Barcolnom3,Integer.valueOf(AV21Barcolnum1),Integer.valueOf(AV22Barcolnum3),Integer.valueOf(AV24Clicod1),Integer.valueOf(AV25Clicod3),Byte.valueOf(AV32Intcod1),Byte.valueOf(AV33Intcod3),Short.valueOf(AV34TipArtCod1),Short.valueOf(AV35TipArtCod3),Byte.valueOf(AV36Tipcolcod1),Byte.valueOf(AV37Tipcolcod3)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1MI2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Analisis Costes Historicos Recetas_WC", "")) ;
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
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.analisiscosteshistoricosrecetas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV38Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV39HreRacab)),GXutil.URLEncode(GXutil.formatDateParm(AV30Fec1)),GXutil.URLEncode(GXutil.formatDateParm(AV31Fec2)),GXutil.URLEncode(GXutil.ltrimstr(AV23Calculo,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV40barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV18barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV15ARtcod1)),GXutil.URLEncode(GXutil.rtrim(AV16ARtcod3)),GXutil.URLEncode(GXutil.rtrim(AV19Barcolnom1)),GXutil.URLEncode(GXutil.rtrim(AV20Barcolnom3)),GXutil.URLEncode(GXutil.ltrimstr(AV21Barcolnum1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22Barcolnum3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24Clicod1,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25Clicod3,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32Intcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33Intcod3,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34TipArtCod1,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35TipArtCod3,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV36Tipcolcod1,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37Tipcolcod3,2,0))}, new String[] {"Emprcod","HreRacab","Fec1","Fec2","Calculo","barcod","barcodreo","barcodpar","ARtcod1","ARtcod3","Barcolnom1","Barcolnom3","Barcolnum1","Barcolnum3","Clicod1","Clicod3","Intcod1","Intcod3","TipArtCod1","TipArtCod3","Tipcolcod1","Tipcolcod3"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV5Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV5Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV6Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV6Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV7ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV7ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV8ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV8ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV9DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV10FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV10FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV11ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV11ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV12ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV12ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV38Emprcod", GXutil.rtrim( wcpOAV38Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV39HreRacab", GXutil.rtrim( wcpOAV39HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Fec1", localUtil.dtoc( wcpOAV30Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31Fec2", localUtil.dtoc( wcpOAV31Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Calculo", GXutil.ltrim( localUtil.ntoc( wcpOAV23Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV17barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV40barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV40barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18barcodpar", GXutil.rtrim( wcpOAV18barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15ARtcod1", GXutil.rtrim( wcpOAV15ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16ARtcod3", GXutil.rtrim( wcpOAV16ARtcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19Barcolnom1", GXutil.rtrim( wcpOAV19Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20Barcolnom3", GXutil.rtrim( wcpOAV20Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21Barcolnum1", GXutil.ltrim( localUtil.ntoc( wcpOAV21Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22Barcolnum3", GXutil.ltrim( localUtil.ntoc( wcpOAV22Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Clicod1", GXutil.ltrim( localUtil.ntoc( wcpOAV24Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Clicod3", GXutil.ltrim( localUtil.ntoc( wcpOAV25Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Intcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV32Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Intcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV33Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34TipArtCod1", GXutil.ltrim( localUtil.ntoc( wcpOAV34TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35TipArtCod3", GXutil.ltrim( localUtil.ntoc( wcpOAV35TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV36Tipcolcod1", GXutil.ltrim( localUtil.ntoc( wcpOAV36Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV37Tipcolcod3", GXutil.ltrim( localUtil.ntoc( wcpOAV37Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV38Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRERACAB", GXutil.rtrim( AV39HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC1", localUtil.dtoc( AV30Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFEC2", localUtil.dtoc( AV31Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCALCULO", GXutil.ltrim( localUtil.ntoc( AV23Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV17barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV40barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV18barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD1", GXutil.rtrim( AV15ARtcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD3", GXutil.rtrim( AV16ARtcod3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM1", GXutil.rtrim( AV19Barcolnom1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNOM3", GXutil.rtrim( AV20Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM1", GXutil.ltrim( localUtil.ntoc( AV21Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV22Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD1", GXutil.ltrim( localUtil.ntoc( AV24Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV25Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD1", GXutil.ltrim( localUtil.ntoc( AV32Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV33Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD1", GXutil.ltrim( localUtil.ntoc( AV34TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV35TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD1", GXutil.ltrim( localUtil.ntoc( AV36Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV37Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ANALISISCOSTESHISTORICOS_Objectcall", GXutil.rtrim( Analisiscosteshistoricos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ANALISISCOSTESHISTORICOS_Objectcall", GXutil.rtrim( Analisiscosteshistoricos_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ANALISISCOSTESHISTORICOS_Type", GXutil.rtrim( Analisiscosteshistoricos_Type));
   }

   public void renderHtmlCloseForm1MI2( )
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
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
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
      return "FormulacionTinte.AnalisisCostesHistoricosRecetas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis Costes Historicos Recetas_WC", "") ;
   }

   public void wb1MI0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.analisiscosteshistoricosrecetas_wc");
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
            httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         ucAnalisiscosteshistoricos.setProperty("Elements", AV5Elements);
         ucAnalisiscosteshistoricos.setProperty("Parameters", AV6Parameters);
         ucAnalisiscosteshistoricos.setProperty("Type", Analisiscosteshistoricos_Type);
         ucAnalisiscosteshistoricos.setProperty("Title", Analisiscosteshistoricos_Title);
         ucAnalisiscosteshistoricos.setProperty("ItemClickData", AV7ItemClickData);
         ucAnalisiscosteshistoricos.setProperty("ItemDoubleClickData", AV8ItemDoubleClickData);
         ucAnalisiscosteshistoricos.setProperty("DragAndDropData", AV9DragAndDropData);
         ucAnalisiscosteshistoricos.setProperty("FilterChangedData", AV10FilterChangedData);
         ucAnalisiscosteshistoricos.setProperty("ItemExpandData", AV11ItemExpandData);
         ucAnalisiscosteshistoricos.setProperty("ItemCollapseData", AV12ItemCollapseData);
         ucAnalisiscosteshistoricos.render(context, "queryviewer", Analisiscosteshistoricos_Internalname, sPrefix+"ANALISISCOSTESHISTORICOSContainer");
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
      }
      wbLoad = true ;
   }

   public void start1MI2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Analisis Costes Historicos Recetas_WC", ""), (short)(0)) ;
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
            strup1MI0( ) ;
         }
      }
   }

   public void ws1MI2( )
   {
      start1MI2( ) ;
      evt1MI2( ) ;
   }

   public void evt1MI2( )
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
                              strup1MI0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e111MI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MI0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e121MI2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1MI0( ) ;
                           }
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
                              strup1MI0( ) ;
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1MI2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1MI2( ) ;
         }
      }
   }

   public void pa1MI2( )
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
      rf1MI2( ) ;
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
   }

   public void rf1MI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e121MI2 ();
         wb1MI0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1MI2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1MI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111MI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV5Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV6Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV7ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV8ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV9DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV10FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV11ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV12ItemCollapseData);
         /* Read saved values. */
         wcpOAV38Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV38Emprcod") ;
         wcpOAV39HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV39HreRacab") ;
         wcpOAV30Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30Fec1"), 0) ;
         wcpOAV31Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31Fec2"), 0) ;
         wcpOAV23Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV40barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV18barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV18barcodpar") ;
         wcpOAV15ARtcod1 = httpContext.cgiGet( sPrefix+"wcpOAV15ARtcod1") ;
         wcpOAV16ARtcod3 = httpContext.cgiGet( sPrefix+"wcpOAV16ARtcod3") ;
         wcpOAV19Barcolnom1 = httpContext.cgiGet( sPrefix+"wcpOAV19Barcolnom1") ;
         wcpOAV20Barcolnom3 = httpContext.cgiGet( sPrefix+"wcpOAV20Barcolnom3") ;
         wcpOAV21Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21Barcolnum1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22Barcolnum3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24Clicod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV25Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25Clicod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Intcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Intcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34TipArtCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35TipArtCod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV36Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Tipcolcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV37Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37Tipcolcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Analisiscosteshistoricos_Objectcall = httpContext.cgiGet( sPrefix+"ANALISISCOSTESHISTORICOS_Objectcall") ;
         Analisiscosteshistoricos_Objectcall = httpContext.cgiGet( sPrefix+"ANALISISCOSTESHISTORICOS_Objectcall") ;
         Analisiscosteshistoricos_Type = httpContext.cgiGet( sPrefix+"ANALISISCOSTESHISTORICOS_Type") ;
         /* Read variables values. */
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
      e111MI2 ();
      if (returnInSub) return;
   }

   public void e111MI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      Analisiscosteshistoricos_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "FormulacionTinte\\AnalisisCostesHistoricosRecetas_DP")+"\", \""+GXutil.encodeJSON( AV38Emprcod)+"\", \""+GXutil.encodeJSON( AV39HreRacab)+"\", \""+GXutil.encodeJSON( localUtil.format(AV30Fec1, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV31Fec2, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV23Calculo, 1, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV17barcod, 8, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV40barcodreo, 1, 0))+"\", \""+GXutil.encodeJSON( AV18barcodpar)+"\", \""+GXutil.encodeJSON( AV15ARtcod1)+"\", \""+GXutil.encodeJSON( AV16ARtcod3)+"\", \""+GXutil.encodeJSON( AV19Barcolnom1)+"\", \""+GXutil.encodeJSON( AV20Barcolnom3)+"\", \""+GXutil.encodeJSON( GXutil.str( AV21Barcolnum1, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV22Barcolnum3, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV24Clicod1, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV25Clicod3, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV32Intcod1, 2, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV33Intcod3, 2, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV34TipArtCod1, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV35TipArtCod3, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV36Tipcolcod1, 2, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV37Tipcolcod3, 2, 0))+"\" ]" ;
      ucAnalisiscosteshistoricos.sendProperty(context, sPrefix, false, Analisiscosteshistoricos_Internalname, "Object", Analisiscosteshistoricos_Objectcall);
      GXt_char1 = AV44Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      analisiscosteshistoricosrecetas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Station = GXt_char1 ;
      GXv_char2[0] = AV38Emprcod ;
      GXv_char3[0] = AV45Emprnom ;
      GXv_char4[0] = AV46Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV44Station, GXv_char2, GXv_char3, GXv_char4) ;
      analisiscosteshistoricosrecetas_wc_impl.this.AV38Emprcod = GXv_char2[0] ;
      analisiscosteshistoricosrecetas_wc_impl.this.AV45Emprnom = GXv_char3[0] ;
      analisiscosteshistoricosrecetas_wc_impl.this.AV46Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Emprcod", AV38Emprcod);
   }

   protected void nextLoad( )
   {
   }

   protected void e121MI2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV38Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Emprcod", AV38Emprcod);
      AV39HreRacab = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreRacab", AV39HreRacab);
      AV30Fec1 = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
      AV31Fec2 = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
      AV23Calculo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Calculo", GXutil.str( AV23Calculo, 1, 0));
      AV17barcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17barcod), 8, 0));
      AV40barcodreo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40barcodreo", GXutil.str( AV40barcodreo, 1, 0));
      AV18barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18barcodpar", AV18barcodpar);
      AV15ARtcod1 = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ARtcod1", AV15ARtcod1);
      AV16ARtcod3 = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ARtcod3", AV16ARtcod3);
      AV19Barcolnom1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Barcolnom1", AV19Barcolnom1);
      AV20Barcolnom3 = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Barcolnom3", AV20Barcolnom3);
      AV21Barcolnum1 = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Barcolnum1), 6, 0));
      AV22Barcolnum3 = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barcolnum3), 6, 0));
      AV24Clicod1 = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Clicod1), 6, 0));
      AV25Clicod3 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
      AV32Intcod1 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Intcod1), 2, 0));
      AV33Intcod3 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Intcod3), 2, 0));
      AV34TipArtCod1 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TipArtCod1), 4, 0));
      AV35TipArtCod3 = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TipArtCod3), 4, 0));
      AV36Tipcolcod1 = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Tipcolcod1), 2, 0));
      AV37Tipcolcod3 = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Tipcolcod3), 2, 0));
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
      pa1MI2( ) ;
      ws1MI2( ) ;
      we1MI2( ) ;
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
      sCtrlAV38Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV39HreRacab = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30Fec1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31Fec2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV23Calculo = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV17barcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV40barcodreo = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV18barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV15ARtcod1 = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV16ARtcod3 = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV19Barcolnom1 = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV20Barcolnom3 = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV21Barcolnum1 = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV22Barcolnum3 = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV24Clicod1 = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV25Clicod3 = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV32Intcod1 = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV33Intcod3 = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV34TipArtCod1 = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV35TipArtCod3 = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV36Tipcolcod1 = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV37Tipcolcod3 = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1MI2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\analisiscosteshistoricosrecetas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1MI2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV38Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Emprcod", AV38Emprcod);
         AV39HreRacab = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreRacab", AV39HreRacab);
         AV30Fec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
         AV31Fec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
         AV23Calculo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Calculo", GXutil.str( AV23Calculo, 1, 0));
         AV17barcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17barcod), 8, 0));
         AV40barcodreo = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40barcodreo", GXutil.str( AV40barcodreo, 1, 0));
         AV18barcodpar = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18barcodpar", AV18barcodpar);
         AV15ARtcod1 = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ARtcod1", AV15ARtcod1);
         AV16ARtcod3 = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ARtcod3", AV16ARtcod3);
         AV19Barcolnom1 = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Barcolnom1", AV19Barcolnom1);
         AV20Barcolnom3 = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Barcolnom3", AV20Barcolnom3);
         AV21Barcolnum1 = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Barcolnum1), 6, 0));
         AV22Barcolnum3 = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barcolnum3), 6, 0));
         AV24Clicod1 = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Clicod1), 6, 0));
         AV25Clicod3 = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
         AV32Intcod1 = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Intcod1), 2, 0));
         AV33Intcod3 = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Intcod3), 2, 0));
         AV34TipArtCod1 = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TipArtCod1), 4, 0));
         AV35TipArtCod3 = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TipArtCod3), 4, 0));
         AV36Tipcolcod1 = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Tipcolcod1), 2, 0));
         AV37Tipcolcod3 = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Tipcolcod3), 2, 0));
      }
      wcpOAV38Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV38Emprcod") ;
      wcpOAV39HreRacab = httpContext.cgiGet( sPrefix+"wcpOAV39HreRacab") ;
      wcpOAV30Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30Fec1"), 0) ;
      wcpOAV31Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31Fec2"), 0) ;
      wcpOAV23Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV17barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV40barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV40barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV18barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV18barcodpar") ;
      wcpOAV15ARtcod1 = httpContext.cgiGet( sPrefix+"wcpOAV15ARtcod1") ;
      wcpOAV16ARtcod3 = httpContext.cgiGet( sPrefix+"wcpOAV16ARtcod3") ;
      wcpOAV19Barcolnom1 = httpContext.cgiGet( sPrefix+"wcpOAV19Barcolnom1") ;
      wcpOAV20Barcolnom3 = httpContext.cgiGet( sPrefix+"wcpOAV20Barcolnom3") ;
      wcpOAV21Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21Barcolnum1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22Barcolnum3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24Clicod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV25Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25Clicod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32Intcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33Intcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34TipArtCod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35TipArtCod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV36Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV36Tipcolcod1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV37Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV37Tipcolcod3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV38Emprcod, wcpOAV38Emprcod) != 0 ) || ( GXutil.strcmp(AV39HreRacab, wcpOAV39HreRacab) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV30Fec1), GXutil.resetTime(wcpOAV30Fec1)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV31Fec2), GXutil.resetTime(wcpOAV31Fec2)) ) || ( AV23Calculo != wcpOAV23Calculo ) || ( AV17barcod != wcpOAV17barcod ) || ( AV40barcodreo != wcpOAV40barcodreo ) || ( GXutil.strcmp(AV18barcodpar, wcpOAV18barcodpar) != 0 ) || ( GXutil.strcmp(AV15ARtcod1, wcpOAV15ARtcod1) != 0 ) || ( GXutil.strcmp(AV16ARtcod3, wcpOAV16ARtcod3) != 0 ) || ( GXutil.strcmp(AV19Barcolnom1, wcpOAV19Barcolnom1) != 0 ) || ( GXutil.strcmp(AV20Barcolnom3, wcpOAV20Barcolnom3) != 0 ) || ( AV21Barcolnum1 != wcpOAV21Barcolnum1 ) || ( AV22Barcolnum3 != wcpOAV22Barcolnum3 ) || ( AV24Clicod1 != wcpOAV24Clicod1 ) || ( AV25Clicod3 != wcpOAV25Clicod3 ) || ( AV32Intcod1 != wcpOAV32Intcod1 ) || ( AV33Intcod3 != wcpOAV33Intcod3 ) || ( AV34TipArtCod1 != wcpOAV34TipArtCod1 ) || ( AV35TipArtCod3 != wcpOAV35TipArtCod3 ) || ( AV36Tipcolcod1 != wcpOAV36Tipcolcod1 ) || ( AV37Tipcolcod3 != wcpOAV37Tipcolcod3 ) ) )
      {
         setjustcreated();
      }
      wcpOAV38Emprcod = AV38Emprcod ;
      wcpOAV39HreRacab = AV39HreRacab ;
      wcpOAV30Fec1 = AV30Fec1 ;
      wcpOAV31Fec2 = AV31Fec2 ;
      wcpOAV23Calculo = AV23Calculo ;
      wcpOAV17barcod = AV17barcod ;
      wcpOAV40barcodreo = AV40barcodreo ;
      wcpOAV18barcodpar = AV18barcodpar ;
      wcpOAV15ARtcod1 = AV15ARtcod1 ;
      wcpOAV16ARtcod3 = AV16ARtcod3 ;
      wcpOAV19Barcolnom1 = AV19Barcolnom1 ;
      wcpOAV20Barcolnom3 = AV20Barcolnom3 ;
      wcpOAV21Barcolnum1 = AV21Barcolnum1 ;
      wcpOAV22Barcolnum3 = AV22Barcolnum3 ;
      wcpOAV24Clicod1 = AV24Clicod1 ;
      wcpOAV25Clicod3 = AV25Clicod3 ;
      wcpOAV32Intcod1 = AV32Intcod1 ;
      wcpOAV33Intcod3 = AV33Intcod3 ;
      wcpOAV34TipArtCod1 = AV34TipArtCod1 ;
      wcpOAV35TipArtCod3 = AV35TipArtCod3 ;
      wcpOAV36Tipcolcod1 = AV36Tipcolcod1 ;
      wcpOAV37Tipcolcod3 = AV37Tipcolcod3 ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV38Emprcod = httpContext.cgiGet( sPrefix+"AV38Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV38Emprcod) > 0 )
      {
         AV38Emprcod = httpContext.cgiGet( sCtrlAV38Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38Emprcod", AV38Emprcod);
      }
      else
      {
         AV38Emprcod = httpContext.cgiGet( sPrefix+"AV38Emprcod_PARM") ;
      }
      sCtrlAV39HreRacab = httpContext.cgiGet( sPrefix+"AV39HreRacab_CTRL") ;
      if ( GXutil.len( sCtrlAV39HreRacab) > 0 )
      {
         AV39HreRacab = httpContext.cgiGet( sCtrlAV39HreRacab) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39HreRacab", AV39HreRacab);
      }
      else
      {
         AV39HreRacab = httpContext.cgiGet( sPrefix+"AV39HreRacab_PARM") ;
      }
      sCtrlAV30Fec1 = httpContext.cgiGet( sPrefix+"AV30Fec1_CTRL") ;
      if ( GXutil.len( sCtrlAV30Fec1) > 0 )
      {
         AV30Fec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV30Fec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
      }
      else
      {
         AV30Fec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV30Fec1_PARM"), 0) ;
      }
      sCtrlAV31Fec2 = httpContext.cgiGet( sPrefix+"AV31Fec2_CTRL") ;
      if ( GXutil.len( sCtrlAV31Fec2) > 0 )
      {
         AV31Fec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV31Fec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
      }
      else
      {
         AV31Fec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV31Fec2_PARM"), 0) ;
      }
      sCtrlAV23Calculo = httpContext.cgiGet( sPrefix+"AV23Calculo_CTRL") ;
      if ( GXutil.len( sCtrlAV23Calculo) > 0 )
      {
         AV23Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV23Calculo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Calculo", GXutil.str( AV23Calculo, 1, 0));
      }
      else
      {
         AV23Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV23Calculo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17barcod = httpContext.cgiGet( sPrefix+"AV17barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV17barcod) > 0 )
      {
         AV17barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV17barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17barcod), 8, 0));
      }
      else
      {
         AV17barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV17barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV40barcodreo = httpContext.cgiGet( sPrefix+"AV40barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV40barcodreo) > 0 )
      {
         AV40barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV40barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40barcodreo", GXutil.str( AV40barcodreo, 1, 0));
      }
      else
      {
         AV40barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV40barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV18barcodpar = httpContext.cgiGet( sPrefix+"AV18barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV18barcodpar) > 0 )
      {
         AV18barcodpar = httpContext.cgiGet( sCtrlAV18barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18barcodpar", AV18barcodpar);
      }
      else
      {
         AV18barcodpar = httpContext.cgiGet( sPrefix+"AV18barcodpar_PARM") ;
      }
      sCtrlAV15ARtcod1 = httpContext.cgiGet( sPrefix+"AV15ARtcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV15ARtcod1) > 0 )
      {
         AV15ARtcod1 = httpContext.cgiGet( sCtrlAV15ARtcod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15ARtcod1", AV15ARtcod1);
      }
      else
      {
         AV15ARtcod1 = httpContext.cgiGet( sPrefix+"AV15ARtcod1_PARM") ;
      }
      sCtrlAV16ARtcod3 = httpContext.cgiGet( sPrefix+"AV16ARtcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV16ARtcod3) > 0 )
      {
         AV16ARtcod3 = httpContext.cgiGet( sCtrlAV16ARtcod3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16ARtcod3", AV16ARtcod3);
      }
      else
      {
         AV16ARtcod3 = httpContext.cgiGet( sPrefix+"AV16ARtcod3_PARM") ;
      }
      sCtrlAV19Barcolnom1 = httpContext.cgiGet( sPrefix+"AV19Barcolnom1_CTRL") ;
      if ( GXutil.len( sCtrlAV19Barcolnom1) > 0 )
      {
         AV19Barcolnom1 = httpContext.cgiGet( sCtrlAV19Barcolnom1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19Barcolnom1", AV19Barcolnom1);
      }
      else
      {
         AV19Barcolnom1 = httpContext.cgiGet( sPrefix+"AV19Barcolnom1_PARM") ;
      }
      sCtrlAV20Barcolnom3 = httpContext.cgiGet( sPrefix+"AV20Barcolnom3_CTRL") ;
      if ( GXutil.len( sCtrlAV20Barcolnom3) > 0 )
      {
         AV20Barcolnom3 = httpContext.cgiGet( sCtrlAV20Barcolnom3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20Barcolnom3", AV20Barcolnom3);
      }
      else
      {
         AV20Barcolnom3 = httpContext.cgiGet( sPrefix+"AV20Barcolnom3_PARM") ;
      }
      sCtrlAV21Barcolnum1 = httpContext.cgiGet( sPrefix+"AV21Barcolnum1_CTRL") ;
      if ( GXutil.len( sCtrlAV21Barcolnum1) > 0 )
      {
         AV21Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21Barcolnum1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Barcolnum1), 6, 0));
      }
      else
      {
         AV21Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21Barcolnum1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV22Barcolnum3 = httpContext.cgiGet( sPrefix+"AV22Barcolnum3_CTRL") ;
      if ( GXutil.len( sCtrlAV22Barcolnum3) > 0 )
      {
         AV22Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22Barcolnum3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Barcolnum3), 6, 0));
      }
      else
      {
         AV22Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22Barcolnum3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24Clicod1 = httpContext.cgiGet( sPrefix+"AV24Clicod1_CTRL") ;
      if ( GXutil.len( sCtrlAV24Clicod1) > 0 )
      {
         AV24Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24Clicod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Clicod1), 6, 0));
      }
      else
      {
         AV24Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24Clicod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV25Clicod3 = httpContext.cgiGet( sPrefix+"AV25Clicod3_CTRL") ;
      if ( GXutil.len( sCtrlAV25Clicod3) > 0 )
      {
         AV25Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25Clicod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Clicod3), 6, 0));
      }
      else
      {
         AV25Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25Clicod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32Intcod1 = httpContext.cgiGet( sPrefix+"AV32Intcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV32Intcod1) > 0 )
      {
         AV32Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32Intcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Intcod1), 2, 0));
      }
      else
      {
         AV32Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32Intcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33Intcod3 = httpContext.cgiGet( sPrefix+"AV33Intcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV33Intcod3) > 0 )
      {
         AV33Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33Intcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Intcod3), 2, 0));
      }
      else
      {
         AV33Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33Intcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV34TipArtCod1 = httpContext.cgiGet( sPrefix+"AV34TipArtCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV34TipArtCod1) > 0 )
      {
         AV34TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34TipArtCod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TipArtCod1), 4, 0));
      }
      else
      {
         AV34TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34TipArtCod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35TipArtCod3 = httpContext.cgiGet( sPrefix+"AV35TipArtCod3_CTRL") ;
      if ( GXutil.len( sCtrlAV35TipArtCod3) > 0 )
      {
         AV35TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35TipArtCod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TipArtCod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TipArtCod3), 4, 0));
      }
      else
      {
         AV35TipArtCod3 = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35TipArtCod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV36Tipcolcod1 = httpContext.cgiGet( sPrefix+"AV36Tipcolcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV36Tipcolcod1) > 0 )
      {
         AV36Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV36Tipcolcod1), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36Tipcolcod1), 2, 0));
      }
      else
      {
         AV36Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV36Tipcolcod1_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV37Tipcolcod3 = httpContext.cgiGet( sPrefix+"AV37Tipcolcod3_CTRL") ;
      if ( GXutil.len( sCtrlAV37Tipcolcod3) > 0 )
      {
         AV37Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV37Tipcolcod3), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37Tipcolcod3), 2, 0));
      }
      else
      {
         AV37Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV37Tipcolcod3_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1MI2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1MI2( ) ;
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
      ws1MI2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Emprcod_PARM", GXutil.rtrim( AV38Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV38Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV38Emprcod_CTRL", GXutil.rtrim( sCtrlAV38Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39HreRacab_PARM", GXutil.rtrim( AV39HreRacab));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV39HreRacab)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV39HreRacab_CTRL", GXutil.rtrim( sCtrlAV39HreRacab));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Fec1_PARM", localUtil.dtoc( AV30Fec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Fec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Fec1_CTRL", GXutil.rtrim( sCtrlAV30Fec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Fec2_PARM", localUtil.dtoc( AV31Fec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31Fec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31Fec2_CTRL", GXutil.rtrim( sCtrlAV31Fec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Calculo_PARM", GXutil.ltrim( localUtil.ntoc( AV23Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Calculo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Calculo_CTRL", GXutil.rtrim( sCtrlAV23Calculo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV17barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17barcod_CTRL", GXutil.rtrim( sCtrlAV17barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV40barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV40barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV40barcodreo_CTRL", GXutil.rtrim( sCtrlAV40barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18barcodpar_PARM", GXutil.rtrim( AV18barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18barcodpar_CTRL", GXutil.rtrim( sCtrlAV18barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15ARtcod1_PARM", GXutil.rtrim( AV15ARtcod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15ARtcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15ARtcod1_CTRL", GXutil.rtrim( sCtrlAV15ARtcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16ARtcod3_PARM", GXutil.rtrim( AV16ARtcod3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16ARtcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16ARtcod3_CTRL", GXutil.rtrim( sCtrlAV16ARtcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Barcolnom1_PARM", GXutil.rtrim( AV19Barcolnom1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19Barcolnom1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19Barcolnom1_CTRL", GXutil.rtrim( sCtrlAV19Barcolnom1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Barcolnom3_PARM", GXutil.rtrim( AV20Barcolnom3));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20Barcolnom3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20Barcolnom3_CTRL", GXutil.rtrim( sCtrlAV20Barcolnom3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Barcolnum1_PARM", GXutil.ltrim( localUtil.ntoc( AV21Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21Barcolnum1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21Barcolnum1_CTRL", GXutil.rtrim( sCtrlAV21Barcolnum1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Barcolnum3_PARM", GXutil.ltrim( localUtil.ntoc( AV22Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22Barcolnum3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22Barcolnum3_CTRL", GXutil.rtrim( sCtrlAV22Barcolnum3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Clicod1_PARM", GXutil.ltrim( localUtil.ntoc( AV24Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Clicod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Clicod1_CTRL", GXutil.rtrim( sCtrlAV24Clicod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Clicod3_PARM", GXutil.ltrim( localUtil.ntoc( AV25Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Clicod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Clicod3_CTRL", GXutil.rtrim( sCtrlAV25Clicod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Intcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV32Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Intcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Intcod1_CTRL", GXutil.rtrim( sCtrlAV32Intcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Intcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV33Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Intcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Intcod3_CTRL", GXutil.rtrim( sCtrlAV33Intcod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34TipArtCod1_PARM", GXutil.ltrim( localUtil.ntoc( AV34TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34TipArtCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34TipArtCod1_CTRL", GXutil.rtrim( sCtrlAV34TipArtCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35TipArtCod3_PARM", GXutil.ltrim( localUtil.ntoc( AV35TipArtCod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35TipArtCod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35TipArtCod3_CTRL", GXutil.rtrim( sCtrlAV35TipArtCod3));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Tipcolcod1_PARM", GXutil.ltrim( localUtil.ntoc( AV36Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV36Tipcolcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV36Tipcolcod1_CTRL", GXutil.rtrim( sCtrlAV36Tipcolcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Tipcolcod3_PARM", GXutil.ltrim( localUtil.ntoc( AV37Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV37Tipcolcod3)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV37Tipcolcod3_CTRL", GXutil.rtrim( sCtrlAV37Tipcolcod3));
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
      we1MI2( ) ;
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
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015561911", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("formulaciontinte/analisiscosteshistoricosrecetas_wc.js", "?202661015561911", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Analisiscosteshistoricos_Internalname = sPrefix+"ANALISISCOSTESHISTORICOS" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
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
      Analisiscosteshistoricos_Title = "" ;
      Analisiscosteshistoricos_Type = "Table" ;
      Analisiscosteshistoricos_Objectcall = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
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
      wcpOAV38Emprcod = "" ;
      wcpOAV39HreRacab = "" ;
      wcpOAV30Fec1 = GXutil.nullDate() ;
      wcpOAV31Fec2 = GXutil.nullDate() ;
      wcpOAV18barcodpar = "" ;
      wcpOAV15ARtcod1 = "" ;
      wcpOAV16ARtcod3 = "" ;
      wcpOAV19Barcolnom1 = "" ;
      wcpOAV20Barcolnom3 = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV38Emprcod = "" ;
      AV39HreRacab = "" ;
      AV30Fec1 = GXutil.nullDate() ;
      AV31Fec2 = GXutil.nullDate() ;
      AV18barcodpar = "" ;
      AV15ARtcod1 = "" ;
      AV16ARtcod3 = "" ;
      AV19Barcolnom1 = "" ;
      AV20Barcolnom3 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV5Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV6Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV7ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV8ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV9DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV10FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV11ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV12ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucAnalisiscosteshistoricos = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV44Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV45Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV46Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV38Emprcod = "" ;
      sCtrlAV39HreRacab = "" ;
      sCtrlAV30Fec1 = "" ;
      sCtrlAV31Fec2 = "" ;
      sCtrlAV23Calculo = "" ;
      sCtrlAV17barcod = "" ;
      sCtrlAV40barcodreo = "" ;
      sCtrlAV18barcodpar = "" ;
      sCtrlAV15ARtcod1 = "" ;
      sCtrlAV16ARtcod3 = "" ;
      sCtrlAV19Barcolnom1 = "" ;
      sCtrlAV20Barcolnom3 = "" ;
      sCtrlAV21Barcolnum1 = "" ;
      sCtrlAV22Barcolnum3 = "" ;
      sCtrlAV24Clicod1 = "" ;
      sCtrlAV25Clicod3 = "" ;
      sCtrlAV32Intcod1 = "" ;
      sCtrlAV33Intcod3 = "" ;
      sCtrlAV34TipArtCod1 = "" ;
      sCtrlAV35TipArtCod3 = "" ;
      sCtrlAV36Tipcolcod1 = "" ;
      sCtrlAV37Tipcolcod3 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV23Calculo ;
   private byte wcpOAV40barcodreo ;
   private byte wcpOAV32Intcod1 ;
   private byte wcpOAV33Intcod3 ;
   private byte wcpOAV36Tipcolcod1 ;
   private byte wcpOAV37Tipcolcod3 ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV23Calculo ;
   private byte AV40barcodreo ;
   private byte AV32Intcod1 ;
   private byte AV33Intcod3 ;
   private byte AV36Tipcolcod1 ;
   private byte AV37Tipcolcod3 ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private short wcpOAV34TipArtCod1 ;
   private short wcpOAV35TipArtCod3 ;
   private short AV34TipArtCod1 ;
   private short AV35TipArtCod3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV17barcod ;
   private int wcpOAV21Barcolnum1 ;
   private int wcpOAV22Barcolnum3 ;
   private int wcpOAV24Clicod1 ;
   private int wcpOAV25Clicod3 ;
   private int AV17barcod ;
   private int AV21Barcolnum1 ;
   private int AV22Barcolnum3 ;
   private int AV24Clicod1 ;
   private int AV25Clicod3 ;
   private int idxLst ;
   private String wcpOAV38Emprcod ;
   private String wcpOAV39HreRacab ;
   private String wcpOAV18barcodpar ;
   private String wcpOAV15ARtcod1 ;
   private String wcpOAV16ARtcod3 ;
   private String wcpOAV19Barcolnom1 ;
   private String wcpOAV20Barcolnom3 ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV38Emprcod ;
   private String AV39HreRacab ;
   private String AV18barcodpar ;
   private String AV15ARtcod1 ;
   private String AV16ARtcod3 ;
   private String AV19Barcolnom1 ;
   private String AV20Barcolnom3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Analisiscosteshistoricos_Objectcall ;
   private String Analisiscosteshistoricos_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Analisiscosteshistoricos_Title ;
   private String Analisiscosteshistoricos_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV44Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV45Emprnom ;
   private String GXv_char3[] ;
   private String AV46Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV38Emprcod ;
   private String sCtrlAV39HreRacab ;
   private String sCtrlAV30Fec1 ;
   private String sCtrlAV31Fec2 ;
   private String sCtrlAV23Calculo ;
   private String sCtrlAV17barcod ;
   private String sCtrlAV40barcodreo ;
   private String sCtrlAV18barcodpar ;
   private String sCtrlAV15ARtcod1 ;
   private String sCtrlAV16ARtcod3 ;
   private String sCtrlAV19Barcolnom1 ;
   private String sCtrlAV20Barcolnom3 ;
   private String sCtrlAV21Barcolnum1 ;
   private String sCtrlAV22Barcolnum3 ;
   private String sCtrlAV24Clicod1 ;
   private String sCtrlAV25Clicod3 ;
   private String sCtrlAV32Intcod1 ;
   private String sCtrlAV33Intcod3 ;
   private String sCtrlAV34TipArtCod1 ;
   private String sCtrlAV35TipArtCod3 ;
   private String sCtrlAV36Tipcolcod1 ;
   private String sCtrlAV37Tipcolcod3 ;
   private java.util.Date wcpOAV30Fec1 ;
   private java.util.Date wcpOAV31Fec2 ;
   private java.util.Date AV30Fec1 ;
   private java.util.Date AV31Fec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucAnalisiscosteshistoricos ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV5Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV6Parameters ;
   private app.SdtQueryViewerDragAndDropData AV9DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV10FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV7ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV12ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV8ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV11ItemExpandData ;
}

