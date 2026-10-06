package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informealmacentejidocrudo_detalle_impl extends GXWebComponent
{
   public informealmacentejidocrudo_detalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informealmacentejidocrudo_detalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealmacentejidocrudo_detalle_impl.class ));
   }

   public informealmacentejidocrudo_detalle_impl( int remoteHandle ,
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
               AV25Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
               AV19AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbRFen", localUtil.format(AV19AlbRFen, "99/99/99"));
               AV20AlbRFen_to = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20AlbRFen_to", localUtil.format(AV20AlbRFen_to, "99/99/99"));
               AV23CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
               AV24CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
               AV17AlbRef = httpContext.GetPar( "AlbRef") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17AlbRef", AV17AlbRef);
               AV18AlbRef_to = httpContext.GetPar( "AlbRef_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18AlbRef_to", AV18AlbRef_to);
               AV21AlbRTartC = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21AlbRTartC), 4, 0));
               AV22AlbRTartC_to = (short)(GXutil.lval( httpContext.GetPar( "AlbRTartC_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22AlbRTartC_to), 4, 0));
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
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV25Emprcod,AV19AlbRFen,AV20AlbRFen_to,Integer.valueOf(AV23CliCod),Integer.valueOf(AV24CliCod_to),AV17AlbRef,AV18AlbRef_to,Short.valueOf(AV21AlbRTartC),Short.valueOf(AV22AlbRTartC_to),Byte.valueOf(AV28AlbrEst),AV29AlbREntfrom,AV30AlbREntto,Short.valueOf(AV31TipEntCod),AV32Tipo});
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
         pa16C2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Almacen Tejido Crudo (Detalle)", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informealmacentejidocrudo_detalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV19AlbRFen)),GXutil.URLEncode(GXutil.formatDateParm(AV20AlbRFen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV23CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24CliCod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV18AlbRef_to)),GXutil.URLEncode(GXutil.ltrimstr(AV21AlbRTartC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22AlbRTartC_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28AlbrEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29AlbREntfrom)),GXutil.URLEncode(GXutil.rtrim(AV30AlbREntto)),GXutil.URLEncode(GXutil.ltrimstr(AV31TipEntCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV32Tipo))}, new String[] {"Emprcod","AlbRFen","AlbRFen_to","CliCod","CliCod_to","AlbRef","AlbRef_to","AlbRTartC","AlbRTartC_to","AlbrEst","AlbREntfrom","AlbREntto","TipEntCod","Tipo"}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV7Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV7Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV8Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV8Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV9ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV9ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV10ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV10ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV11DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV11DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vFILTERCHANGEDDATA", AV12FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV13ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV13ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV14ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV14ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Emprcod", GXutil.rtrim( wcpOAV25Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19AlbRFen", localUtil.dtoc( wcpOAV19AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20AlbRFen_to", localUtil.dtoc( wcpOAV20AlbRFen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV23CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV24CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17AlbRef", GXutil.rtrim( wcpOAV17AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18AlbRef_to", GXutil.rtrim( wcpOAV18AlbRef_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21AlbRTartC", GXutil.ltrim( localUtil.ntoc( wcpOAV21AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV22AlbRTartC_to", GXutil.ltrim( localUtil.ntoc( wcpOAV22AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28AlbrEst", GXutil.ltrim( localUtil.ntoc( wcpOAV28AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29AlbREntfrom", GXutil.rtrim( wcpOAV29AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30AlbREntto", GXutil.rtrim( wcpOAV30AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31TipEntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV31TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32Tipo", GXutil.rtrim( wcpOAV32Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV25Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN", localUtil.dtoc( AV19AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRFEN_TO", localUtil.dtoc( AV20AlbRFen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV23CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV24CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF", GXutil.rtrim( AV17AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREF_TO", GXutil.rtrim( AV18AlbRef_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRTARTC", GXutil.ltrim( localUtil.ntoc( AV21AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRTARTC_TO", GXutil.ltrim( localUtil.ntoc( AV22AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREST", GXutil.ltrim( localUtil.ntoc( AV28AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTFROM", GXutil.rtrim( AV29AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTTO", GXutil.rtrim( AV30AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV31TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPO", GXutil.rtrim( AV32Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE_Objectcall", GXutil.rtrim( Informealmacentejidocrudodetalle_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE_Objectcall", GXutil.rtrim( Informealmacentejidocrudodetalle_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE_Type", GXutil.rtrim( Informealmacentejidocrudodetalle_Type));
   }

   public void renderHtmlCloseForm16C2( )
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
      return "InformeAlmacenTejidoCrudo_Detalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Almacen Tejido Crudo (Detalle)", "") ;
   }

   public void wb16C0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.informealmacentejidocrudo_detalle");
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
         ucInformealmacentejidocrudodetalle.setProperty("Elements", AV7Elements);
         ucInformealmacentejidocrudodetalle.setProperty("Parameters", AV8Parameters);
         ucInformealmacentejidocrudodetalle.setProperty("Type", Informealmacentejidocrudodetalle_Type);
         ucInformealmacentejidocrudodetalle.setProperty("Title", Informealmacentejidocrudodetalle_Title);
         ucInformealmacentejidocrudodetalle.setProperty("ItemClickData", AV9ItemClickData);
         ucInformealmacentejidocrudodetalle.setProperty("ItemDoubleClickData", AV10ItemDoubleClickData);
         ucInformealmacentejidocrudodetalle.setProperty("DragAndDropData", AV11DragAndDropData);
         ucInformealmacentejidocrudodetalle.setProperty("FilterChangedData", AV12FilterChangedData);
         ucInformealmacentejidocrudodetalle.setProperty("ItemExpandData", AV13ItemExpandData);
         ucInformealmacentejidocrudodetalle.setProperty("ItemCollapseData", AV14ItemCollapseData);
         ucInformealmacentejidocrudodetalle.render(context, "queryviewer", Informealmacentejidocrudodetalle_Internalname, sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLEContainer");
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

   public void start16C2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Almacen Tejido Crudo (Detalle)", ""), (short)(0)) ;
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
            strup16C0( ) ;
         }
      }
   }

   public void ws16C2( )
   {
      start16C2( ) ;
      evt16C2( ) ;
   }

   public void evt16C2( )
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
                              strup16C0( ) ;
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
                              strup16C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1116C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16C0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1216C2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16C0( ) ;
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
                              strup16C0( ) ;
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

   public void we16C2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm16C2( ) ;
         }
      }
   }

   public void pa16C2( )
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
      rf16C2( ) ;
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

   public void rf16C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1216C2 ();
         wb16C0( ) ;
      }
   }

   public void send_integrity_lvl_hashes16C2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup16C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1116C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV7Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV8Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV9ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV10ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV11DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV12FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV13ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV14ItemCollapseData);
         /* Read saved values. */
         wcpOAV25Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV25Emprcod") ;
         wcpOAV19AlbRFen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19AlbRFen"), 0) ;
         wcpOAV20AlbRFen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20AlbRFen_to"), 0) ;
         wcpOAV23CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV17AlbRef") ;
         wcpOAV18AlbRef_to = httpContext.cgiGet( sPrefix+"wcpOAV18AlbRef_to") ;
         wcpOAV21AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV22AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22AlbRTartC_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV29AlbREntfrom") ;
         wcpOAV30AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV30AlbREntto") ;
         wcpOAV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Tipo = httpContext.cgiGet( sPrefix+"wcpOAV32Tipo") ;
         Informealmacentejidocrudodetalle_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE_Objectcall") ;
         Informealmacentejidocrudodetalle_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE_Objectcall") ;
         Informealmacentejidocrudodetalle_Type = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE_Type") ;
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
      e1116C2 ();
      if (returnInSub) return;
   }

   public void e1116C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV26Albrestfrom = (byte)(((AV28AlbrEst==0) ? 0 : ((AV28AlbrEst==1) ? 1 : 0))) ;
      AV27Albrestto = (byte)(((AV28AlbrEst==0) ? 0 : ((AV28AlbrEst==1) ? 1 : 1))) ;
      Informealmacentejidocrudodetalle_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPInformeAlmacenTejidoCrudo_Detalle")+"\", \""+GXutil.encodeJSON( AV25Emprcod)+"\", \""+GXutil.encodeJSON( localUtil.format(AV19AlbRFen, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV20AlbRFen_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV23CliCod, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV24CliCod_to, 6, 0))+"\", \""+GXutil.encodeJSON( AV17AlbRef)+"\", \""+GXutil.encodeJSON( AV18AlbRef_to)+"\", \""+GXutil.encodeJSON( GXutil.str( AV21AlbRTartC, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV22AlbRTartC_to, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV26Albrestfrom, 1, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV27Albrestto, 1, 0))+"\", \""+GXutil.encodeJSON( AV29AlbREntfrom)+"\", \""+GXutil.encodeJSON( AV30AlbREntto)+"\", \""+GXutil.encodeJSON( GXutil.str( AV31TipEntCod, 4, 0))+"\", \""+GXutil.encodeJSON( AV32Tipo)+"\" ]" ;
      ucInformealmacentejidocrudodetalle.sendProperty(context, sPrefix, false, Informealmacentejidocrudodetalle_Internalname, "Object", Informealmacentejidocrudodetalle_Objectcall);
      GXt_char1 = AV35Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informealmacentejidocrudo_detalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Station = GXt_char1 ;
      GXv_char2[0] = AV25Emprcod ;
      GXv_char3[0] = AV36Emprnom ;
      GXv_char4[0] = AV37Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV35Station, GXv_char2, GXv_char3, GXv_char4) ;
      informealmacentejidocrudo_detalle_impl.this.AV25Emprcod = GXv_char2[0] ;
      informealmacentejidocrudo_detalle_impl.this.AV36Emprnom = GXv_char3[0] ;
      informealmacentejidocrudo_detalle_impl.this.AV37Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
   }

   protected void nextLoad( )
   {
   }

   protected void e1216C2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV25Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
      AV19AlbRFen = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbRFen", localUtil.format(AV19AlbRFen, "99/99/99"));
      AV20AlbRFen_to = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20AlbRFen_to", localUtil.format(AV20AlbRFen_to, "99/99/99"));
      AV23CliCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
      AV24CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
      AV17AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17AlbRef", AV17AlbRef);
      AV18AlbRef_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18AlbRef_to", AV18AlbRef_to);
      AV21AlbRTartC = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21AlbRTartC), 4, 0));
      AV22AlbRTartC_to = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22AlbRTartC_to), 4, 0));
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
      pa16C2( ) ;
      ws16C2( ) ;
      we16C2( ) ;
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
      sCtrlAV25Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV19AlbRFen = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV20AlbRFen_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV23CliCod = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV24CliCod_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV17AlbRef = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV18AlbRef_to = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV21AlbRTartC = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV22AlbRTartC_to = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV28AlbrEst = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV29AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV30AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV31TipEntCod = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV32Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa16C2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "informealmacentejidocrudo_detalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa16C2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV25Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
         AV19AlbRFen = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbRFen", localUtil.format(AV19AlbRFen, "99/99/99"));
         AV20AlbRFen_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20AlbRFen_to", localUtil.format(AV20AlbRFen_to, "99/99/99"));
         AV23CliCod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
         AV24CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
         AV17AlbRef = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17AlbRef", AV17AlbRef);
         AV18AlbRef_to = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18AlbRef_to", AV18AlbRef_to);
         AV21AlbRTartC = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21AlbRTartC), 4, 0));
         AV22AlbRTartC_to = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22AlbRTartC_to), 4, 0));
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
      }
      wcpOAV25Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV25Emprcod") ;
      wcpOAV19AlbRFen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV19AlbRFen"), 0) ;
      wcpOAV20AlbRFen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV20AlbRFen_to"), 0) ;
      wcpOAV23CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV17AlbRef = httpContext.cgiGet( sPrefix+"wcpOAV17AlbRef") ;
      wcpOAV18AlbRef_to = httpContext.cgiGet( sPrefix+"wcpOAV18AlbRef_to") ;
      wcpOAV21AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21AlbRTartC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV22AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV22AlbRTartC_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV29AlbREntfrom") ;
      wcpOAV30AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV30AlbREntto") ;
      wcpOAV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Tipo = httpContext.cgiGet( sPrefix+"wcpOAV32Tipo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV25Emprcod, wcpOAV25Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV19AlbRFen), GXutil.resetTime(wcpOAV19AlbRFen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV20AlbRFen_to), GXutil.resetTime(wcpOAV20AlbRFen_to)) ) || ( AV23CliCod != wcpOAV23CliCod ) || ( AV24CliCod_to != wcpOAV24CliCod_to ) || ( GXutil.strcmp(AV17AlbRef, wcpOAV17AlbRef) != 0 ) || ( GXutil.strcmp(AV18AlbRef_to, wcpOAV18AlbRef_to) != 0 ) || ( AV21AlbRTartC != wcpOAV21AlbRTartC ) || ( AV22AlbRTartC_to != wcpOAV22AlbRTartC_to ) || ( AV28AlbrEst != wcpOAV28AlbrEst ) || ( GXutil.strcmp(AV29AlbREntfrom, wcpOAV29AlbREntfrom) != 0 ) || ( GXutil.strcmp(AV30AlbREntto, wcpOAV30AlbREntto) != 0 ) || ( AV31TipEntCod != wcpOAV31TipEntCod ) || ( GXutil.strcmp(AV32Tipo, wcpOAV32Tipo) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV25Emprcod = AV25Emprcod ;
      wcpOAV19AlbRFen = AV19AlbRFen ;
      wcpOAV20AlbRFen_to = AV20AlbRFen_to ;
      wcpOAV23CliCod = AV23CliCod ;
      wcpOAV24CliCod_to = AV24CliCod_to ;
      wcpOAV17AlbRef = AV17AlbRef ;
      wcpOAV18AlbRef_to = AV18AlbRef_to ;
      wcpOAV21AlbRTartC = AV21AlbRTartC ;
      wcpOAV22AlbRTartC_to = AV22AlbRTartC_to ;
      wcpOAV28AlbrEst = AV28AlbrEst ;
      wcpOAV29AlbREntfrom = AV29AlbREntfrom ;
      wcpOAV30AlbREntto = AV30AlbREntto ;
      wcpOAV31TipEntCod = AV31TipEntCod ;
      wcpOAV32Tipo = AV32Tipo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV25Emprcod = httpContext.cgiGet( sPrefix+"AV25Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV25Emprcod) > 0 )
      {
         AV25Emprcod = httpContext.cgiGet( sCtrlAV25Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
      }
      else
      {
         AV25Emprcod = httpContext.cgiGet( sPrefix+"AV25Emprcod_PARM") ;
      }
      sCtrlAV19AlbRFen = httpContext.cgiGet( sPrefix+"AV19AlbRFen_CTRL") ;
      if ( GXutil.len( sCtrlAV19AlbRFen) > 0 )
      {
         AV19AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV19AlbRFen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbRFen", localUtil.format(AV19AlbRFen, "99/99/99"));
      }
      else
      {
         AV19AlbRFen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV19AlbRFen_PARM"), 0) ;
      }
      sCtrlAV20AlbRFen_to = httpContext.cgiGet( sPrefix+"AV20AlbRFen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV20AlbRFen_to) > 0 )
      {
         AV20AlbRFen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV20AlbRFen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20AlbRFen_to", localUtil.format(AV20AlbRFen_to, "99/99/99"));
      }
      else
      {
         AV20AlbRFen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV20AlbRFen_to_PARM"), 0) ;
      }
      sCtrlAV23CliCod = httpContext.cgiGet( sPrefix+"AV23CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV23CliCod) > 0 )
      {
         AV23CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV23CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
      }
      else
      {
         AV23CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV23CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24CliCod_to = httpContext.cgiGet( sPrefix+"AV24CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV24CliCod_to) > 0 )
      {
         AV24CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
      }
      else
      {
         AV24CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV17AlbRef = httpContext.cgiGet( sPrefix+"AV17AlbRef_CTRL") ;
      if ( GXutil.len( sCtrlAV17AlbRef) > 0 )
      {
         AV17AlbRef = httpContext.cgiGet( sCtrlAV17AlbRef) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17AlbRef", AV17AlbRef);
      }
      else
      {
         AV17AlbRef = httpContext.cgiGet( sPrefix+"AV17AlbRef_PARM") ;
      }
      sCtrlAV18AlbRef_to = httpContext.cgiGet( sPrefix+"AV18AlbRef_to_CTRL") ;
      if ( GXutil.len( sCtrlAV18AlbRef_to) > 0 )
      {
         AV18AlbRef_to = httpContext.cgiGet( sCtrlAV18AlbRef_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18AlbRef_to", AV18AlbRef_to);
      }
      else
      {
         AV18AlbRef_to = httpContext.cgiGet( sPrefix+"AV18AlbRef_to_PARM") ;
      }
      sCtrlAV21AlbRTartC = httpContext.cgiGet( sPrefix+"AV21AlbRTartC_CTRL") ;
      if ( GXutil.len( sCtrlAV21AlbRTartC) > 0 )
      {
         AV21AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21AlbRTartC), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21AlbRTartC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21AlbRTartC), 4, 0));
      }
      else
      {
         AV21AlbRTartC = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21AlbRTartC_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV22AlbRTartC_to = httpContext.cgiGet( sPrefix+"AV22AlbRTartC_to_CTRL") ;
      if ( GXutil.len( sCtrlAV22AlbRTartC_to) > 0 )
      {
         AV22AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV22AlbRTartC_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AlbRTartC_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22AlbRTartC_to), 4, 0));
      }
      else
      {
         AV22AlbRTartC_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV22AlbRTartC_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa16C2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws16C2( ) ;
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
      ws16C2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Emprcod_PARM", GXutil.rtrim( AV25Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Emprcod_CTRL", GXutil.rtrim( sCtrlAV25Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19AlbRFen_PARM", localUtil.dtoc( AV19AlbRFen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19AlbRFen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19AlbRFen_CTRL", GXutil.rtrim( sCtrlAV19AlbRFen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20AlbRFen_to_PARM", localUtil.dtoc( AV20AlbRFen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20AlbRFen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20AlbRFen_to_CTRL", GXutil.rtrim( sCtrlAV20AlbRFen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV23CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23CliCod_CTRL", GXutil.rtrim( sCtrlAV23CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV24CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24CliCod_to_CTRL", GXutil.rtrim( sCtrlAV24CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17AlbRef_PARM", GXutil.rtrim( AV17AlbRef));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17AlbRef)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17AlbRef_CTRL", GXutil.rtrim( sCtrlAV17AlbRef));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18AlbRef_to_PARM", GXutil.rtrim( AV18AlbRef_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18AlbRef_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18AlbRef_to_CTRL", GXutil.rtrim( sCtrlAV18AlbRef_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21AlbRTartC_PARM", GXutil.ltrim( localUtil.ntoc( AV21AlbRTartC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21AlbRTartC)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21AlbRTartC_CTRL", GXutil.rtrim( sCtrlAV21AlbRTartC));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22AlbRTartC_to_PARM", GXutil.ltrim( localUtil.ntoc( AV22AlbRTartC_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV22AlbRTartC_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV22AlbRTartC_to_CTRL", GXutil.rtrim( sCtrlAV22AlbRTartC_to));
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
      we16C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015561989", true, true);
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
         httpContext.AddJavascriptSource("informealmacentejidocrudo_detalle.js", "?202661015561989", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Informealmacentejidocrudodetalle_Internalname = sPrefix+"INFORMEALMACENTEJIDOCRUDODETALLE" ;
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
      Informealmacentejidocrudodetalle_Title = "" ;
      Informealmacentejidocrudodetalle_Type = "Table" ;
      Informealmacentejidocrudodetalle_Objectcall = "" ;
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
      wcpOAV25Emprcod = "" ;
      wcpOAV19AlbRFen = GXutil.nullDate() ;
      wcpOAV20AlbRFen_to = GXutil.nullDate() ;
      wcpOAV17AlbRef = "" ;
      wcpOAV18AlbRef_to = "" ;
      wcpOAV29AlbREntfrom = "" ;
      wcpOAV30AlbREntto = "" ;
      wcpOAV32Tipo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV25Emprcod = "" ;
      AV19AlbRFen = GXutil.nullDate() ;
      AV20AlbRFen_to = GXutil.nullDate() ;
      AV17AlbRef = "" ;
      AV18AlbRef_to = "" ;
      AV29AlbREntfrom = "" ;
      AV30AlbREntto = "" ;
      AV32Tipo = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV7Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV8Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV9ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV10ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV11DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV12FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV13ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV14ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucInformealmacentejidocrudodetalle = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV35Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV36Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV37Usurcod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV25Emprcod = "" ;
      sCtrlAV19AlbRFen = "" ;
      sCtrlAV20AlbRFen_to = "" ;
      sCtrlAV23CliCod = "" ;
      sCtrlAV24CliCod_to = "" ;
      sCtrlAV17AlbRef = "" ;
      sCtrlAV18AlbRef_to = "" ;
      sCtrlAV21AlbRTartC = "" ;
      sCtrlAV22AlbRTartC_to = "" ;
      sCtrlAV28AlbrEst = "" ;
      sCtrlAV29AlbREntfrom = "" ;
      sCtrlAV30AlbREntto = "" ;
      sCtrlAV31TipEntCod = "" ;
      sCtrlAV32Tipo = "" ;
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
   private short wcpOAV21AlbRTartC ;
   private short wcpOAV22AlbRTartC_to ;
   private short wcpOAV31TipEntCod ;
   private short AV21AlbRTartC ;
   private short AV22AlbRTartC_to ;
   private short AV31TipEntCod ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV23CliCod ;
   private int wcpOAV24CliCod_to ;
   private int AV23CliCod ;
   private int AV24CliCod_to ;
   private int idxLst ;
   private String wcpOAV25Emprcod ;
   private String wcpOAV17AlbRef ;
   private String wcpOAV18AlbRef_to ;
   private String wcpOAV29AlbREntfrom ;
   private String wcpOAV30AlbREntto ;
   private String wcpOAV32Tipo ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV25Emprcod ;
   private String AV17AlbRef ;
   private String AV18AlbRef_to ;
   private String AV29AlbREntfrom ;
   private String AV30AlbREntto ;
   private String AV32Tipo ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informealmacentejidocrudodetalle_Objectcall ;
   private String Informealmacentejidocrudodetalle_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Informealmacentejidocrudodetalle_Title ;
   private String Informealmacentejidocrudodetalle_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV35Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV36Emprnom ;
   private String GXv_char3[] ;
   private String AV37Usurcod ;
   private String GXv_char4[] ;
   private String sCtrlAV25Emprcod ;
   private String sCtrlAV19AlbRFen ;
   private String sCtrlAV20AlbRFen_to ;
   private String sCtrlAV23CliCod ;
   private String sCtrlAV24CliCod_to ;
   private String sCtrlAV17AlbRef ;
   private String sCtrlAV18AlbRef_to ;
   private String sCtrlAV21AlbRTartC ;
   private String sCtrlAV22AlbRTartC_to ;
   private String sCtrlAV28AlbrEst ;
   private String sCtrlAV29AlbREntfrom ;
   private String sCtrlAV30AlbREntto ;
   private String sCtrlAV31TipEntCod ;
   private String sCtrlAV32Tipo ;
   private java.util.Date wcpOAV19AlbRFen ;
   private java.util.Date wcpOAV20AlbRFen_to ;
   private java.util.Date AV19AlbRFen ;
   private java.util.Date AV20AlbRFen_to ;
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
   private com.genexus.webpanels.GXUserControl ucInformealmacentejidocrudodetalle ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV7Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV8Parameters ;
   private app.SdtQueryViewerDragAndDropData AV11DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV9ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV14ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV10ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV13ItemExpandData ;
}

