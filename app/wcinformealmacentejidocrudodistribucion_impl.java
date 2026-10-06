package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcinformealmacentejidocrudodistribucion_impl extends GXWebComponent
{
   public wcinformealmacentejidocrudodistribucion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcinformealmacentejidocrudodistribucion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcinformealmacentejidocrudodistribucion_impl.class ));
   }

   public wcinformealmacentejidocrudodistribucion_impl( int remoteHandle ,
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
               AV13Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
               AV7AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbRFen", localUtil.format(AV7AlbRFen, "99/99/99"));
               AV8AlbRFen_to = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbRFen_to", localUtil.format(AV8AlbRFen_to, "99/99/99"));
               AV11CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
               AV12CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod_to), 6, 0));
               AV5AlbRef = httpContext.GetPar( "AlbRef") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbRef", AV5AlbRef);
               AV6AlbRef_to = httpContext.GetPar( "AlbRef_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbRef_to", AV6AlbRef_to);
               AV9AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRTartC), 4, 0));
               AV10AlbRTartC_to = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRTartC_to), 4, 0));
               AV28AlbrEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbrEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28AlbrEst", GXutil.str( AV28AlbrEst, 1, 0));
               AV29AlbREntfrom = httpContext.GetPar( "AlbREntfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29AlbREntfrom", AV29AlbREntfrom);
               AV30AlbREntto = httpContext.GetPar( "AlbREntto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30AlbREntto", AV30AlbREntto);
               AV31TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipEntCod), 4, 0));
               AV32Tipo = httpContext.GetPar( "Tipo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tipo", AV32Tipo);
               AV33albreccod = (int)(GXutil.lval( httpContext.GetPar( "albreccod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33albreccod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV13Emprcod,AV7AlbRFen,AV8AlbRFen_to,Integer.valueOf(AV11CliCod),Integer.valueOf(AV12CliCod_to),AV5AlbRef,AV6AlbRef_to,Short.valueOf(AV9AlbRTartC),Short.valueOf(AV10AlbRTartC_to),Byte.valueOf(AV28AlbrEst),AV29AlbREntfrom,AV30AlbREntto,Short.valueOf(AV31TipEntCod),AV32Tipo,Integer.valueOf(AV33albreccod)});
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
         pa16D2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCInforme Almacen Tejido Crudo (Distribucion)", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcinformealmacentejidocrudodistribucion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV7AlbRFen)),GXutil.URLEncode(GXutil.formatDateParm(AV8AlbRFen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV11CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12CliCod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV5AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV6AlbRef_to)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbRTartC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10AlbRTartC_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28AlbrEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29AlbREntfrom)),GXutil.URLEncode(GXutil.rtrim(AV30AlbREntto)),GXutil.URLEncode(GXutil.ltrimstr(AV31TipEntCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV32Tipo)),GXutil.URLEncode(GXutil.ltrimstr(AV33albreccod,8,0))}, new String[] {"Emprcod","AlbRFen","AlbRFen_to","CliCod","CliCod_to","AlbRef","AlbRef_to","AlbRTartC","AlbRTartC_to","AlbrEst","AlbREntfrom","AlbREntto","TipEntCod","Tipo","albreccod"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV16Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV16Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV17Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV17Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV18ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV18ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV19ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV19ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV20DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV20DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV21FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV21FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV22ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV22ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV23ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV23ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13Emprcod", GXutil.rtrim( wcpOAV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7AlbRFen", localUtil.dtoc( wcpOAV7AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8AlbRFen_to", localUtil.dtoc( wcpOAV8AlbRFen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV11CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV12CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5AlbRef", GXutil.rtrim( wcpOAV5AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6AlbRef_to", GXutil.rtrim( wcpOAV6AlbRef_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9AlbRTartC", GXutil.ltrim( localUtil.ntoc( wcpOAV9AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10AlbRTartC_to", GXutil.ltrim( localUtil.ntoc( wcpOAV10AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28AlbrEst", GXutil.ltrim( localUtil.ntoc( wcpOAV28AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29AlbREntfrom", GXutil.rtrim( wcpOAV29AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30AlbREntto", GXutil.rtrim( wcpOAV30AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31TipEntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV31TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Tipo", GXutil.rtrim( wcpOAV32Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33albreccod", GXutil.ltrim( localUtil.ntoc( wcpOAV33albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV13Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN", localUtil.dtoc( AV7AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN_TO", localUtil.dtoc( AV8AlbRFen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV11CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV12CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF", GXutil.rtrim( AV5AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_TO", GXutil.rtrim( AV6AlbRef_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRTARTC", GXutil.ltrim( localUtil.ntoc( AV9AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRTARTC_TO", GXutil.ltrim( localUtil.ntoc( AV10AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREST", GXutil.ltrim( localUtil.ntoc( AV28AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTFROM", GXutil.rtrim( AV29AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTTO", GXutil.rtrim( AV30AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV31TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPO", GXutil.rtrim( AV32Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV33albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION_Objectcall", GXutil.rtrim( Informealmacentejidocrudodistribucion_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION_Objectcall", GXutil.rtrim( Informealmacentejidocrudodistribucion_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION_Type", GXutil.rtrim( Informealmacentejidocrudodistribucion_Type));
   }

   public void renderHtmlCloseForm16D2( )
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
      return "WCInformeAlmacenTejidoCrudoDistribucion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCInforme Almacen Tejido Crudo (Distribucion)", "") ;
   }

   public void wb16D0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcinformealmacentejidocrudodistribucion");
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
         ucInformealmacentejidocrudodistribucion.setProperty("Elements", AV16Elements);
         ucInformealmacentejidocrudodistribucion.setProperty("Parameters", AV17Parameters);
         ucInformealmacentejidocrudodistribucion.setProperty("Type", Informealmacentejidocrudodistribucion_Type);
         ucInformealmacentejidocrudodistribucion.setProperty("Title", Informealmacentejidocrudodistribucion_Title);
         ucInformealmacentejidocrudodistribucion.setProperty("ItemClickData", AV18ItemClickData);
         ucInformealmacentejidocrudodistribucion.setProperty("ItemDoubleClickData", AV19ItemDoubleClickData);
         ucInformealmacentejidocrudodistribucion.setProperty("DragAndDropData", AV20DragAndDropData);
         ucInformealmacentejidocrudodistribucion.setProperty("FilterChangedData", AV21FilterChangedData);
         ucInformealmacentejidocrudodistribucion.setProperty("ItemExpandData", AV22ItemExpandData);
         ucInformealmacentejidocrudodistribucion.setProperty("ItemCollapseData", AV23ItemCollapseData);
         ucInformealmacentejidocrudodistribucion.render(context, "queryviewer", Informealmacentejidocrudodistribucion_Internalname, sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCIONContainer");
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

   public void start16D2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCInforme Almacen Tejido Crudo (Distribucion)", ""), (short)(0)) ;
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
            strup16D0( ) ;
         }
      }
   }

   public void ws16D2( )
   {
      start16D2( ) ;
      evt16D2( ) ;
   }

   public void evt16D2( )
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
                              strup16D0( ) ;
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
                              strup16D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1116D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16D0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1216D2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16D0( ) ;
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
                              strup16D0( ) ;
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

   public void we16D2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm16D2( ) ;
         }
      }
   }

   public void pa16D2( )
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
      rf16D2( ) ;
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

   public void rf16D2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1216D2 ();
         wb16D0( ) ;
      }
   }

   public void send_integrity_lvl_hashes16D2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup16D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1116D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV16Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV17Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV18ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV19ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV20DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV21FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV22ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV23ItemCollapseData);
         /* Read saved values. */
         wcpOAV13Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV13Emprcod") ;
         wcpOAV7AlbRFen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7AlbRFen"), 0) ;
         wcpOAV8AlbRFen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8AlbRFen_to"), 0) ;
         wcpOAV11CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV12CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV5AlbRef") ;
         wcpOAV6AlbRef_to = httpContext.cgiGet( sPrefix+"wcpOAV6AlbRef_to") ;
         wcpOAV9AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10AlbRTartC_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV29AlbREntfrom") ;
         wcpOAV30AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV30AlbREntto") ;
         wcpOAV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Tipo = httpContext.cgiGet( sPrefix+"wcpOAV32Tipo") ;
         wcpOAV33albreccod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33albreccod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Informealmacentejidocrudodistribucion_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION_Objectcall") ;
         Informealmacentejidocrudodistribucion_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION_Objectcall") ;
         Informealmacentejidocrudodistribucion_Type = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION_Type") ;
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
      e1116D2 ();
      if (returnInSub) return;
   }

   public void e1116D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV26Albrestfrom = (byte)(((AV28AlbrEst==0) ? 0 : ((AV28AlbrEst==1) ? 1 : 0))) ;
      AV27Albrestto = (byte)(((AV28AlbrEst==0) ? 0 : ((AV28AlbrEst==1) ? 1 : 1))) ;
      Informealmacentejidocrudodistribucion_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPInformeAlmacenTejidoCrudoDistribucion")+"\", \""+GXutil.encodeJSON( AV13Emprcod)+"\", \""+GXutil.encodeJSON( localUtil.format(AV7AlbRFen, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV8AlbRFen_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV11CliCod, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV12CliCod_to, 6, 0))+"\", \""+GXutil.encodeJSON( AV5AlbRef)+"\", \""+GXutil.encodeJSON( AV6AlbRef_to)+"\", \""+GXutil.encodeJSON( GXutil.str( AV9AlbRTartC, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV10AlbRTartC_to, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV26Albrestfrom, 1, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV27Albrestto, 1, 0))+"\", \""+GXutil.encodeJSON( AV29AlbREntfrom)+"\", \""+GXutil.encodeJSON( AV30AlbREntto)+"\", \""+GXutil.encodeJSON( GXutil.str( AV31TipEntCod, 4, 0))+"\", \""+GXutil.encodeJSON( AV32Tipo)+"\", \""+GXutil.encodeJSON( GXutil.str( AV33albreccod, 8, 0))+"\" ]" ;
      ucInformealmacentejidocrudodistribucion.sendProperty(context, sPrefix, false, Informealmacentejidocrudodistribucion_Internalname, "Object", Informealmacentejidocrudodistribucion_Objectcall);
      GXt_char1 = AV36Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcinformealmacentejidocrudodistribucion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Station = GXt_char1 ;
      GXv_char2[0] = AV13Emprcod ;
      GXv_char3[0] = AV37Emprnom ;
      GXv_char4[0] = AV38Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcinformealmacentejidocrudodistribucion_impl.this.AV13Emprcod = GXv_char2[0] ;
      wcinformealmacentejidocrudodistribucion_impl.this.AV37Emprnom = GXv_char3[0] ;
      wcinformealmacentejidocrudodistribucion_impl.this.AV38Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
   }

   protected void nextLoad( )
   {
   }

   protected void e1216D2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
      AV7AlbRFen = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbRFen", localUtil.format(AV7AlbRFen, "99/99/99"));
      AV8AlbRFen_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbRFen_to", localUtil.format(AV8AlbRFen_to, "99/99/99"));
      AV11CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
      AV12CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod_to), 6, 0));
      AV5AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbRef", AV5AlbRef);
      AV6AlbRef_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbRef_to", AV6AlbRef_to);
      AV9AlbRTartC = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRTartC), 4, 0));
      AV10AlbRTartC_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRTartC_to), 4, 0));
      AV28AlbrEst = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28AlbrEst", GXutil.str( AV28AlbrEst, 1, 0));
      AV29AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29AlbREntfrom", AV29AlbREntfrom);
      AV30AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30AlbREntto", AV30AlbREntto);
      AV31TipEntCod = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipEntCod), 4, 0));
      AV32Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tipo", AV32Tipo);
      AV33albreccod = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33albreccod), 8, 0));
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
      pa16D2( ) ;
      ws16D2( ) ;
      we16D2( ) ;
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
      sCtrlAV13Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV7AlbRFen = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV8AlbRFen_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV11CliCod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV12CliCod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV5AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV6AlbRef_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV9AlbRTartC = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV10AlbRTartC_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV28AlbrEst = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV29AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV30AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV31TipEntCod = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV32Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV33albreccod = (String)getParm(obj,14,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa16D2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcinformealmacentejidocrudodistribucion", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa16D2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV13Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
         AV7AlbRFen = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbRFen", localUtil.format(AV7AlbRFen, "99/99/99"));
         AV8AlbRFen_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbRFen_to", localUtil.format(AV8AlbRFen_to, "99/99/99"));
         AV11CliCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
         AV12CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod_to), 6, 0));
         AV5AlbRef = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbRef", AV5AlbRef);
         AV6AlbRef_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbRef_to", AV6AlbRef_to);
         AV9AlbRTartC = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRTartC), 4, 0));
         AV10AlbRTartC_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRTartC_to), 4, 0));
         AV28AlbrEst = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28AlbrEst", GXutil.str( AV28AlbrEst, 1, 0));
         AV29AlbREntfrom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29AlbREntfrom", AV29AlbREntfrom);
         AV30AlbREntto = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30AlbREntto", AV30AlbREntto);
         AV31TipEntCod = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipEntCod), 4, 0));
         AV32Tipo = (String)getParm(obj,15,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tipo", AV32Tipo);
         AV33albreccod = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33albreccod), 8, 0));
      }
      wcpOAV13Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV13Emprcod") ;
      wcpOAV7AlbRFen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7AlbRFen"), 0) ;
      wcpOAV8AlbRFen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8AlbRFen_to"), 0) ;
      wcpOAV11CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV11CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV12CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV12CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV5AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV5AlbRef") ;
      wcpOAV6AlbRef_to = httpContext.cgiGet( sPrefix+"wcpOAV6AlbRef_to") ;
      wcpOAV9AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10AlbRTartC_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV29AlbREntfrom") ;
      wcpOAV30AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV30AlbREntto") ;
      wcpOAV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Tipo = httpContext.cgiGet( sPrefix+"wcpOAV32Tipo") ;
      wcpOAV33albreccod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33albreccod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV13Emprcod, wcpOAV13Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV7AlbRFen), GXutil.resetTime(wcpOAV7AlbRFen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV8AlbRFen_to), GXutil.resetTime(wcpOAV8AlbRFen_to)) ) || ( AV11CliCod != wcpOAV11CliCod ) || ( AV12CliCod_to != wcpOAV12CliCod_to ) || ( GXutil.strcmp(AV5AlbRef, wcpOAV5AlbRef) != 0 ) || ( GXutil.strcmp(AV6AlbRef_to, wcpOAV6AlbRef_to) != 0 ) || ( AV9AlbRTartC != wcpOAV9AlbRTartC ) || ( AV10AlbRTartC_to != wcpOAV10AlbRTartC_to ) || ( AV28AlbrEst != wcpOAV28AlbrEst ) || ( GXutil.strcmp(AV29AlbREntfrom, wcpOAV29AlbREntfrom) != 0 ) || ( GXutil.strcmp(AV30AlbREntto, wcpOAV30AlbREntto) != 0 ) || ( AV31TipEntCod != wcpOAV31TipEntCod ) || ( GXutil.strcmp(AV32Tipo, wcpOAV32Tipo) != 0 ) || ( AV33albreccod != wcpOAV33albreccod ) ) )
      {
         setjustcreated();
      }
      wcpOAV13Emprcod = AV13Emprcod ;
      wcpOAV7AlbRFen = AV7AlbRFen ;
      wcpOAV8AlbRFen_to = AV8AlbRFen_to ;
      wcpOAV11CliCod = AV11CliCod ;
      wcpOAV12CliCod_to = AV12CliCod_to ;
      wcpOAV5AlbRef = AV5AlbRef ;
      wcpOAV6AlbRef_to = AV6AlbRef_to ;
      wcpOAV9AlbRTartC = AV9AlbRTartC ;
      wcpOAV10AlbRTartC_to = AV10AlbRTartC_to ;
      wcpOAV28AlbrEst = AV28AlbrEst ;
      wcpOAV29AlbREntfrom = AV29AlbREntfrom ;
      wcpOAV30AlbREntto = AV30AlbREntto ;
      wcpOAV31TipEntCod = AV31TipEntCod ;
      wcpOAV32Tipo = AV32Tipo ;
      wcpOAV33albreccod = AV33albreccod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV13Emprcod = httpContext.cgiGet( sPrefix+"AV13Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV13Emprcod) > 0 )
      {
         AV13Emprcod = httpContext.cgiGet( sCtrlAV13Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Emprcod", AV13Emprcod);
      }
      else
      {
         AV13Emprcod = httpContext.cgiGet( sPrefix+"AV13Emprcod_PARM") ;
      }
      sCtrlAV7AlbRFen = httpContext.cgiGet( sPrefix+"AV7AlbRFen_CTRL") ;
      if ( GXutil.len( sCtrlAV7AlbRFen) > 0 )
      {
         AV7AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV7AlbRFen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7AlbRFen", localUtil.format(AV7AlbRFen, "99/99/99"));
      }
      else
      {
         AV7AlbRFen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV7AlbRFen_PARM"), 0) ;
      }
      sCtrlAV8AlbRFen_to = httpContext.cgiGet( sPrefix+"AV8AlbRFen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV8AlbRFen_to) > 0 )
      {
         AV8AlbRFen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8AlbRFen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AlbRFen_to", localUtil.format(AV8AlbRFen_to, "99/99/99"));
      }
      else
      {
         AV8AlbRFen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8AlbRFen_to_PARM"), 0) ;
      }
      sCtrlAV11CliCod = httpContext.cgiGet( sPrefix+"AV11CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV11CliCod) > 0 )
      {
         AV11CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV11CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
      }
      else
      {
         AV11CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV11CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV12CliCod_to = httpContext.cgiGet( sPrefix+"AV12CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV12CliCod_to) > 0 )
      {
         AV12CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV12CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCod_to), 6, 0));
      }
      else
      {
         AV12CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV12CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV5AlbRef = httpContext.cgiGet( sPrefix+"AV5AlbRef_CTRL") ;
      if ( GXutil.len( sCtrlAV5AlbRef) > 0 )
      {
         AV5AlbRef = httpContext.cgiGet( sCtrlAV5AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5AlbRef", AV5AlbRef);
      }
      else
      {
         AV5AlbRef = httpContext.cgiGet( sPrefix+"AV5AlbRef_PARM") ;
      }
      sCtrlAV6AlbRef_to = httpContext.cgiGet( sPrefix+"AV6AlbRef_to_CTRL") ;
      if ( GXutil.len( sCtrlAV6AlbRef_to) > 0 )
      {
         AV6AlbRef_to = httpContext.cgiGet( sCtrlAV6AlbRef_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6AlbRef_to", AV6AlbRef_to);
      }
      else
      {
         AV6AlbRef_to = httpContext.cgiGet( sPrefix+"AV6AlbRef_to_PARM") ;
      }
      sCtrlAV9AlbRTartC = httpContext.cgiGet( sPrefix+"AV9AlbRTartC_CTRL") ;
      if ( GXutil.len( sCtrlAV9AlbRTartC) > 0 )
      {
         AV9AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9AlbRTartC), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRTartC), 4, 0));
      }
      else
      {
         AV9AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9AlbRTartC_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10AlbRTartC_to = httpContext.cgiGet( sPrefix+"AV10AlbRTartC_to_CTRL") ;
      if ( GXutil.len( sCtrlAV10AlbRTartC_to) > 0 )
      {
         AV10AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10AlbRTartC_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRTartC_to), 4, 0));
      }
      else
      {
         AV10AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10AlbRTartC_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV28AlbrEst = httpContext.cgiGet( sPrefix+"AV28AlbrEst_CTRL") ;
      if ( GXutil.len( sCtrlAV28AlbrEst) > 0 )
      {
         AV28AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28AlbrEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28AlbrEst", GXutil.str( AV28AlbrEst, 1, 0));
      }
      else
      {
         AV28AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28AlbrEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29AlbREntfrom = httpContext.cgiGet( sPrefix+"AV29AlbREntfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV29AlbREntfrom) > 0 )
      {
         AV29AlbREntfrom = httpContext.cgiGet( sCtrlAV29AlbREntfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29AlbREntfrom", AV29AlbREntfrom);
      }
      else
      {
         AV29AlbREntfrom = httpContext.cgiGet( sPrefix+"AV29AlbREntfrom_PARM") ;
      }
      sCtrlAV30AlbREntto = httpContext.cgiGet( sPrefix+"AV30AlbREntto_CTRL") ;
      if ( GXutil.len( sCtrlAV30AlbREntto) > 0 )
      {
         AV30AlbREntto = httpContext.cgiGet( sCtrlAV30AlbREntto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30AlbREntto", AV30AlbREntto);
      }
      else
      {
         AV30AlbREntto = httpContext.cgiGet( sPrefix+"AV30AlbREntto_PARM") ;
      }
      sCtrlAV31TipEntCod = httpContext.cgiGet( sPrefix+"AV31TipEntCod_CTRL") ;
      if ( GXutil.len( sCtrlAV31TipEntCod) > 0 )
      {
         AV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31TipEntCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipEntCod), 4, 0));
      }
      else
      {
         AV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31TipEntCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV32Tipo = httpContext.cgiGet( sPrefix+"AV32Tipo_CTRL") ;
      if ( GXutil.len( sCtrlAV32Tipo) > 0 )
      {
         AV32Tipo = httpContext.cgiGet( sCtrlAV32Tipo) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tipo", AV32Tipo);
      }
      else
      {
         AV32Tipo = httpContext.cgiGet( sPrefix+"AV32Tipo_PARM") ;
      }
      sCtrlAV33albreccod = httpContext.cgiGet( sPrefix+"AV33albreccod_CTRL") ;
      if ( GXutil.len( sCtrlAV33albreccod) > 0 )
      {
         AV33albreccod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33albreccod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33albreccod), 8, 0));
      }
      else
      {
         AV33albreccod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33albreccod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa16D2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws16D2( ) ;
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
      ws16D2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Emprcod_PARM", GXutil.rtrim( AV13Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13Emprcod_CTRL", GXutil.rtrim( sCtrlAV13Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7AlbRFen_PARM", localUtil.dtoc( AV7AlbRFen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7AlbRFen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7AlbRFen_CTRL", GXutil.rtrim( sCtrlAV7AlbRFen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8AlbRFen_to_PARM", localUtil.dtoc( AV8AlbRFen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8AlbRFen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8AlbRFen_to_CTRL", GXutil.rtrim( sCtrlAV8AlbRFen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV11CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11CliCod_CTRL", GXutil.rtrim( sCtrlAV11CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV12CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12CliCod_to_CTRL", GXutil.rtrim( sCtrlAV12CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbRef_PARM", GXutil.rtrim( AV5AlbRef));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5AlbRef)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5AlbRef_CTRL", GXutil.rtrim( sCtrlAV5AlbRef));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6AlbRef_to_PARM", GXutil.rtrim( AV6AlbRef_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6AlbRef_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6AlbRef_to_CTRL", GXutil.rtrim( sCtrlAV6AlbRef_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AlbRTartC_PARM", GXutil.ltrim( localUtil.ntoc( AV9AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9AlbRTartC)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9AlbRTartC_CTRL", GXutil.rtrim( sCtrlAV9AlbRTartC));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10AlbRTartC_to_PARM", GXutil.ltrim( localUtil.ntoc( AV10AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10AlbRTartC_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10AlbRTartC_to_CTRL", GXutil.rtrim( sCtrlAV10AlbRTartC_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28AlbrEst_PARM", GXutil.ltrim( localUtil.ntoc( AV28AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28AlbrEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28AlbrEst_CTRL", GXutil.rtrim( sCtrlAV28AlbrEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29AlbREntfrom_PARM", GXutil.rtrim( AV29AlbREntfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29AlbREntfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29AlbREntfrom_CTRL", GXutil.rtrim( sCtrlAV29AlbREntfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30AlbREntto_PARM", GXutil.rtrim( AV30AlbREntto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30AlbREntto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30AlbREntto_CTRL", GXutil.rtrim( sCtrlAV30AlbREntto));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31TipEntCod_PARM", GXutil.ltrim( localUtil.ntoc( AV31TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31TipEntCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31TipEntCod_CTRL", GXutil.rtrim( sCtrlAV31TipEntCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Tipo_PARM", GXutil.rtrim( AV32Tipo));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32Tipo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32Tipo_CTRL", GXutil.rtrim( sCtrlAV32Tipo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33albreccod_PARM", GXutil.ltrim( localUtil.ntoc( AV33albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33albreccod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33albreccod_CTRL", GXutil.rtrim( sCtrlAV33albreccod));
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
      we16D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562021", true, true);
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
         httpContext.AddJavascriptSource("wcinformealmacentejidocrudodistribucion.js", "?202661015562022", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Informealmacentejidocrudodistribucion_Internalname = sPrefix+"INFORMEALMACENTEJIDOCRUDODISTRIBUCION" ;
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
      Informealmacentejidocrudodistribucion_Title = "" ;
      Informealmacentejidocrudodistribucion_Type = "Table" ;
      Informealmacentejidocrudodistribucion_Objectcall = "" ;
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
      wcpOAV13Emprcod = "" ;
      wcpOAV7AlbRFen = GXutil.nullDate() ;
      wcpOAV8AlbRFen_to = GXutil.nullDate() ;
      wcpOAV5AlbRef = "" ;
      wcpOAV6AlbRef_to = "" ;
      wcpOAV29AlbREntfrom = "" ;
      wcpOAV30AlbREntto = "" ;
      wcpOAV32Tipo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV13Emprcod = "" ;
      AV7AlbRFen = GXutil.nullDate() ;
      AV8AlbRFen_to = GXutil.nullDate() ;
      AV5AlbRef = "" ;
      AV6AlbRef_to = "" ;
      AV29AlbREntfrom = "" ;
      AV30AlbREntto = "" ;
      AV32Tipo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV16Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV17Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV18ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV19ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV20DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV21FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV22ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV23ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucInformealmacentejidocrudodistribucion = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV36Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV37Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV38Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV13Emprcod = "" ;
      sCtrlAV7AlbRFen = "" ;
      sCtrlAV8AlbRFen_to = "" ;
      sCtrlAV11CliCod = "" ;
      sCtrlAV12CliCod_to = "" ;
      sCtrlAV5AlbRef = "" ;
      sCtrlAV6AlbRef_to = "" ;
      sCtrlAV9AlbRTartC = "" ;
      sCtrlAV10AlbRTartC_to = "" ;
      sCtrlAV28AlbrEst = "" ;
      sCtrlAV29AlbREntfrom = "" ;
      sCtrlAV30AlbREntto = "" ;
      sCtrlAV31TipEntCod = "" ;
      sCtrlAV32Tipo = "" ;
      sCtrlAV33albreccod = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV28AlbrEst ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV28AlbrEst ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte AV26Albrestfrom ;
   private byte AV27Albrestto ;
   private short wcpOAV9AlbRTartC ;
   private short wcpOAV10AlbRTartC_to ;
   private short wcpOAV31TipEntCod ;
   private short AV9AlbRTartC ;
   private short AV10AlbRTartC_to ;
   private short AV31TipEntCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV11CliCod ;
   private int wcpOAV12CliCod_to ;
   private int wcpOAV33albreccod ;
   private int AV11CliCod ;
   private int AV12CliCod_to ;
   private int AV33albreccod ;
   private int idxLst ;
   private String wcpOAV13Emprcod ;
   private String wcpOAV5AlbRef ;
   private String wcpOAV6AlbRef_to ;
   private String wcpOAV29AlbREntfrom ;
   private String wcpOAV30AlbREntto ;
   private String wcpOAV32Tipo ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV13Emprcod ;
   private String AV5AlbRef ;
   private String AV6AlbRef_to ;
   private String AV29AlbREntfrom ;
   private String AV30AlbREntto ;
   private String AV32Tipo ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informealmacentejidocrudodistribucion_Objectcall ;
   private String Informealmacentejidocrudodistribucion_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Informealmacentejidocrudodistribucion_Title ;
   private String Informealmacentejidocrudodistribucion_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV36Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV37Emprnom ;
   private String GXv_char3[] ;
   private String AV38Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV13Emprcod ;
   private String sCtrlAV7AlbRFen ;
   private String sCtrlAV8AlbRFen_to ;
   private String sCtrlAV11CliCod ;
   private String sCtrlAV12CliCod_to ;
   private String sCtrlAV5AlbRef ;
   private String sCtrlAV6AlbRef_to ;
   private String sCtrlAV9AlbRTartC ;
   private String sCtrlAV10AlbRTartC_to ;
   private String sCtrlAV28AlbrEst ;
   private String sCtrlAV29AlbREntfrom ;
   private String sCtrlAV30AlbREntto ;
   private String sCtrlAV31TipEntCod ;
   private String sCtrlAV32Tipo ;
   private String sCtrlAV33albreccod ;
   private java.util.Date wcpOAV7AlbRFen ;
   private java.util.Date wcpOAV8AlbRFen_to ;
   private java.util.Date AV7AlbRFen ;
   private java.util.Date AV8AlbRFen_to ;
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
   private com.genexus.webpanels.GXUserControl ucInformealmacentejidocrudodistribucion ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV16Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV17Parameters ;
   private app.SdtQueryViewerItemClickData AV18ItemClickData ;
   private app.SdtQueryViewerItemDoubleClickData AV19ItemDoubleClickData ;
   private app.SdtQueryViewerDragAndDropData AV20DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV21FilterChangedData ;
   private app.SdtQueryViewerItemExpandData AV22ItemExpandData ;
   private app.SdtQueryViewerItemCollapseData AV23ItemCollapseData ;
}

