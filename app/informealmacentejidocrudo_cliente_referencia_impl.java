package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informealmacentejidocrudo_cliente_referencia_impl extends GXWebComponent
{
   public informealmacentejidocrudo_cliente_referencia_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informealmacentejidocrudo_cliente_referencia_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informealmacentejidocrudo_cliente_referencia_impl.class ));
   }

   public informealmacentejidocrudo_cliente_referencia_impl( int remoteHandle ,
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
               AV26AlbrEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbrEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26AlbrEst", GXutil.str( AV26AlbrEst, 1, 0));
               AV33AlbREntfrom = httpContext.GetPar( "AlbREntfrom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbREntfrom", AV33AlbREntfrom);
               AV34AlbREntto = httpContext.GetPar( "AlbREntto") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbREntto", AV34AlbREntto);
               AV31TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipEntCod), 4, 0));
               AV32Tipo = httpContext.GetPar( "Tipo") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32Tipo", AV32Tipo);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV25Emprcod,AV19AlbRFen,AV20AlbRFen_to,Integer.valueOf(AV23CliCod),Integer.valueOf(AV24CliCod_to),AV17AlbRef,AV18AlbRef_to,Short.valueOf(AV21AlbRTartC),Short.valueOf(AV22AlbRTartC_to),Byte.valueOf(AV26AlbrEst),AV33AlbREntfrom,AV34AlbREntto,Short.valueOf(AV31TipEntCod),AV32Tipo});
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
         pa16A2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Almacen Tejido Crudo (Cliente/Referencia)", "")) ;
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
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.informealmacentejidocrudo_cliente_referencia", new String[] {GXutil.URLEncode(GXutil.rtrim(AV25Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV19AlbRFen)),GXutil.URLEncode(GXutil.formatDateParm(AV20AlbRFen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV23CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24CliCod_to,6,0)),GXutil.URLEncode(GXutil.rtrim(AV17AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV18AlbRef_to)),GXutil.URLEncode(GXutil.ltrimstr(AV21AlbRTartC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV22AlbRTartC_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26AlbrEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV33AlbREntfrom)),GXutil.URLEncode(GXutil.rtrim(AV34AlbREntto)),GXutil.URLEncode(GXutil.ltrimstr(AV31TipEntCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV32Tipo))}, new String[] {"Emprcod","AlbRFen","AlbRFen_to","CliCod","CliCod_to","AlbRef","AlbRef_to","AlbRTartC","AlbRTartC_to","AlbrEst","AlbREntfrom","AlbREntto","TipEntCod","Tipo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26AlbrEst", GXutil.ltrim( localUtil.ntoc( wcpOAV26AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33AlbREntfrom", GXutil.rtrim( wcpOAV33AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34AlbREntto", GXutil.rtrim( wcpOAV34AlbREntto));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBREST", GXutil.ltrim( localUtil.ntoc( AV26AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTFROM", GXutil.rtrim( AV33AlbREntfrom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBRENTTO", GXutil.rtrim( AV34AlbREntto));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV31TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPO", GXutil.rtrim( AV32Tipo));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA_Objectcall", GXutil.rtrim( Informealmacentejidocrudoclientereferencia_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA_Objectcall", GXutil.rtrim( Informealmacentejidocrudoclientereferencia_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA_Type", GXutil.rtrim( Informealmacentejidocrudoclientereferencia_Type));
   }

   public void renderHtmlCloseForm16A2( )
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
      return "InformeAlmacenTejidoCrudo_Cliente_Referencia" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Almacen Tejido Crudo (Cliente/Referencia)", "") ;
   }

   public void wb16A0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.informealmacentejidocrudo_cliente_referencia");
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
         ucInformealmacentejidocrudoclientereferencia.setProperty("Elements", AV7Elements);
         ucInformealmacentejidocrudoclientereferencia.setProperty("Parameters", AV8Parameters);
         ucInformealmacentejidocrudoclientereferencia.setProperty("Type", Informealmacentejidocrudoclientereferencia_Type);
         ucInformealmacentejidocrudoclientereferencia.setProperty("Title", Informealmacentejidocrudoclientereferencia_Title);
         ucInformealmacentejidocrudoclientereferencia.setProperty("ItemClickData", AV9ItemClickData);
         ucInformealmacentejidocrudoclientereferencia.setProperty("ItemDoubleClickData", AV10ItemDoubleClickData);
         ucInformealmacentejidocrudoclientereferencia.setProperty("DragAndDropData", AV11DragAndDropData);
         ucInformealmacentejidocrudoclientereferencia.setProperty("FilterChangedData", AV12FilterChangedData);
         ucInformealmacentejidocrudoclientereferencia.setProperty("ItemExpandData", AV13ItemExpandData);
         ucInformealmacentejidocrudoclientereferencia.setProperty("ItemCollapseData", AV14ItemCollapseData);
         ucInformealmacentejidocrudoclientereferencia.render(context, "queryviewer", Informealmacentejidocrudoclientereferencia_Internalname, sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIAContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV37Pgmname), GXutil.rtrim( localUtil.format( AV37Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), false, "", "left", true, "", "HLP_InformeAlmacenTejidoCrudo_Cliente_Referencia.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavLongvarchar_Internalname, AV29Longvarchar, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", (short)(0), edtavLongvarchar_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), false, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_InformeAlmacenTejidoCrudo_Cliente_Referencia.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start16A2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Almacen Tejido Crudo (Cliente/Referencia)", ""), (short)(0)) ;
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
            strup16A0( ) ;
         }
      }
   }

   public void ws16A2( )
   {
      start16A2( ) ;
      evt16A2( ) ;
   }

   public void evt16A2( )
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
                              strup16A0( ) ;
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
                              strup16A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1116A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1216A2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16A0( ) ;
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
                              strup16A0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavLongvarchar_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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

   public void we16A2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm16A2( ) ;
         }
      }
   }

   public void pa16A2( )
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
            GX_FocusControl = edtavLongvarchar_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      rf16A2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV37Pgmname = "InformeAlmacenTejidoCrudo_Cliente_Referencia" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Pgmname", AV37Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf16A2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1216A2 ();
         wb16A0( ) ;
      }
   }

   public void send_integrity_lvl_hashes16A2( )
   {
   }

   public void before_start_formulas( )
   {
      AV37Pgmname = "InformeAlmacenTejidoCrudo_Cliente_Referencia" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37Pgmname", AV37Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup16A0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1116A2 ();
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
         wcpOAV26AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV33AlbREntfrom") ;
         wcpOAV34AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV34AlbREntto") ;
         wcpOAV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV32Tipo = httpContext.cgiGet( sPrefix+"wcpOAV32Tipo") ;
         Informealmacentejidocrudoclientereferencia_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA_Objectcall") ;
         Informealmacentejidocrudoclientereferencia_Objectcall = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA_Objectcall") ;
         Informealmacentejidocrudoclientereferencia_Type = httpContext.cgiGet( sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA_Type") ;
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
      e1116A2 ();
      if (returnInSub) return;
   }

   public void e1116A2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informealmacentejidocrudo_cliente_referencia_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = AV25Emprcod ;
      GXv_char3[0] = AV39Emprnom ;
      GXv_char4[0] = AV40Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      informealmacentejidocrudo_cliente_referencia_impl.this.AV25Emprcod = GXv_char2[0] ;
      informealmacentejidocrudo_cliente_referencia_impl.this.AV39Emprnom = GXv_char3[0] ;
      informealmacentejidocrudo_cliente_referencia_impl.this.AV40Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Emprcod", AV25Emprcod);
      edtavLongvarchar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavLongvarchar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLongvarchar_Visible), 5, 0), true);
      AV27Albrestfrom = (byte)(((AV26AlbrEst==0) ? 0 : ((AV26AlbrEst==1) ? 1 : 0))) ;
      AV28Albrestto = (byte)(((AV26AlbrEst==0) ? 0 : ((AV26AlbrEst==1) ? 1 : 1))) ;
      GXt_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia5 = AV30SDTInformeAlmacenTejidoCrudo_Cliente_Referencia ;
      GXv_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia6[0] = GXt_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia5 ;
      new app.dpinformealmacentejidocrudo_cliente_referencia(remoteHandle, context).execute( AV25Emprcod, AV19AlbRFen, AV20AlbRFen_to, AV23CliCod, AV24CliCod_to, AV17AlbRef, AV18AlbRef_to, AV21AlbRTartC, AV22AlbRTartC_to, AV27Albrestfrom, AV28Albrestto, AV33AlbREntfrom, AV34AlbREntto, AV31TipEntCod, AV32Tipo, GXv_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia6) ;
      GXt_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia5 = GXv_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia6[0] ;
      AV30SDTInformeAlmacenTejidoCrudo_Cliente_Referencia = GXt_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia5 ;
      AV29Longvarchar = AV30SDTInformeAlmacenTejidoCrudo_Cliente_Referencia.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Longvarchar", AV29Longvarchar);
      Informealmacentejidocrudoclientereferencia_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPInformeAlmacenTejidoCrudo_Cliente_Referencia")+"\", \""+GXutil.encodeJSON( AV25Emprcod)+"\", \""+GXutil.encodeJSON( localUtil.format(AV19AlbRFen, "99/99/99"))+"\", \""+GXutil.encodeJSON( localUtil.format(AV20AlbRFen_to, "99/99/99"))+"\", \""+GXutil.encodeJSON( GXutil.str( AV23CliCod, 6, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV24CliCod_to, 6, 0))+"\", \""+GXutil.encodeJSON( AV17AlbRef)+"\", \""+GXutil.encodeJSON( AV18AlbRef_to)+"\", \""+GXutil.encodeJSON( GXutil.str( AV21AlbRTartC, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV22AlbRTartC_to, 4, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV27Albrestfrom, 1, 0))+"\", \""+GXutil.encodeJSON( GXutil.str( AV28Albrestto, 1, 0))+"\", \""+GXutil.encodeJSON( AV33AlbREntfrom)+"\", \""+GXutil.encodeJSON( AV34AlbREntto)+"\", \""+GXutil.encodeJSON( GXutil.str( AV31TipEntCod, 4, 0))+"\", \""+GXutil.encodeJSON( AV32Tipo)+"\" ]" ;
      ucInformealmacentejidocrudoclientereferencia.sendProperty(context, sPrefix, false, Informealmacentejidocrudoclientereferencia_Internalname, "Object", Informealmacentejidocrudoclientereferencia_Objectcall);
   }

   protected void nextLoad( )
   {
   }

   protected void e1216A2( )
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
      AV26AlbrEst = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26AlbrEst", GXutil.str( AV26AlbrEst, 1, 0));
      AV33AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbREntfrom", AV33AlbREntfrom);
      AV34AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbREntto", AV34AlbREntto);
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
      pa16A2( ) ;
      ws16A2( ) ;
      we16A2( ) ;
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
      sCtrlAV26AlbrEst = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV33AlbREntfrom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV34AlbREntto = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV31TipEntCod = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV32Tipo = (String)getParm(obj,13,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa16A2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "informealmacentejidocrudo_cliente_referencia", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa16A2( ) ;
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
         AV26AlbrEst = ((Number) GXutil.testNumericType( getParm(obj,11,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26AlbrEst", GXutil.str( AV26AlbrEst, 1, 0));
         AV33AlbREntfrom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbREntfrom", AV33AlbREntfrom);
         AV34AlbREntto = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbREntto", AV34AlbREntto);
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
      wcpOAV26AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26AlbrEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33AlbREntfrom = httpContext.cgiGet( sPrefix+"wcpOAV33AlbREntfrom") ;
      wcpOAV34AlbREntto = httpContext.cgiGet( sPrefix+"wcpOAV34AlbREntto") ;
      wcpOAV31TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV32Tipo = httpContext.cgiGet( sPrefix+"wcpOAV32Tipo") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV25Emprcod, wcpOAV25Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV19AlbRFen), GXutil.resetTime(wcpOAV19AlbRFen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV20AlbRFen_to), GXutil.resetTime(wcpOAV20AlbRFen_to)) ) || ( AV23CliCod != wcpOAV23CliCod ) || ( AV24CliCod_to != wcpOAV24CliCod_to ) || ( GXutil.strcmp(AV17AlbRef, wcpOAV17AlbRef) != 0 ) || ( GXutil.strcmp(AV18AlbRef_to, wcpOAV18AlbRef_to) != 0 ) || ( AV21AlbRTartC != wcpOAV21AlbRTartC ) || ( AV22AlbRTartC_to != wcpOAV22AlbRTartC_to ) || ( AV26AlbrEst != wcpOAV26AlbrEst ) || ( GXutil.strcmp(AV33AlbREntfrom, wcpOAV33AlbREntfrom) != 0 ) || ( GXutil.strcmp(AV34AlbREntto, wcpOAV34AlbREntto) != 0 ) || ( AV31TipEntCod != wcpOAV31TipEntCod ) || ( GXutil.strcmp(AV32Tipo, wcpOAV32Tipo) != 0 ) ) )
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
      wcpOAV26AlbrEst = AV26AlbrEst ;
      wcpOAV33AlbREntfrom = AV33AlbREntfrom ;
      wcpOAV34AlbREntto = AV34AlbREntto ;
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
      sCtrlAV26AlbrEst = httpContext.cgiGet( sPrefix+"AV26AlbrEst_CTRL") ;
      if ( GXutil.len( sCtrlAV26AlbrEst) > 0 )
      {
         AV26AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV26AlbrEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26AlbrEst", GXutil.str( AV26AlbrEst, 1, 0));
      }
      else
      {
         AV26AlbrEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV26AlbrEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33AlbREntfrom = httpContext.cgiGet( sPrefix+"AV33AlbREntfrom_CTRL") ;
      if ( GXutil.len( sCtrlAV33AlbREntfrom) > 0 )
      {
         AV33AlbREntfrom = httpContext.cgiGet( sCtrlAV33AlbREntfrom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33AlbREntfrom", AV33AlbREntfrom);
      }
      else
      {
         AV33AlbREntfrom = httpContext.cgiGet( sPrefix+"AV33AlbREntfrom_PARM") ;
      }
      sCtrlAV34AlbREntto = httpContext.cgiGet( sPrefix+"AV34AlbREntto_CTRL") ;
      if ( GXutil.len( sCtrlAV34AlbREntto) > 0 )
      {
         AV34AlbREntto = httpContext.cgiGet( sCtrlAV34AlbREntto) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34AlbREntto", AV34AlbREntto);
      }
      else
      {
         AV34AlbREntto = httpContext.cgiGet( sPrefix+"AV34AlbREntto_PARM") ;
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
      pa16A2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws16A2( ) ;
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
      ws16A2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26AlbrEst_PARM", GXutil.ltrim( localUtil.ntoc( AV26AlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26AlbrEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26AlbrEst_CTRL", GXutil.rtrim( sCtrlAV26AlbrEst));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33AlbREntfrom_PARM", GXutil.rtrim( AV33AlbREntfrom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33AlbREntfrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33AlbREntfrom_CTRL", GXutil.rtrim( sCtrlAV33AlbREntfrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34AlbREntto_PARM", GXutil.rtrim( AV34AlbREntto));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34AlbREntto)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34AlbREntto_CTRL", GXutil.rtrim( sCtrlAV34AlbREntto));
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
      we16A2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661015562063", true, true);
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
         httpContext.AddJavascriptSource("informealmacentejidocrudo_cliente_referencia.js", "?202661015562063", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
         httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      Informealmacentejidocrudoclientereferencia_Internalname = sPrefix+"INFORMEALMACENTEJIDOCRUDOCLIENTEREFERENCIA" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavLongvarchar_Internalname = sPrefix+"vLONGVARCHAR" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
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
      edtavLongvarchar_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Informealmacentejidocrudoclientereferencia_Title = "" ;
      Informealmacentejidocrudoclientereferencia_Type = "Table" ;
      Informealmacentejidocrudoclientereferencia_Objectcall = "" ;
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
      wcpOAV33AlbREntfrom = "" ;
      wcpOAV34AlbREntto = "" ;
      wcpOAV32Tipo = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV25Emprcod = "" ;
      AV19AlbRFen = GXutil.nullDate() ;
      AV20AlbRFen_to = GXutil.nullDate() ;
      AV17AlbRef = "" ;
      AV18AlbRef_to = "" ;
      AV33AlbREntfrom = "" ;
      AV34AlbREntto = "" ;
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
      ucInformealmacentejidocrudoclientereferencia = new com.genexus.webpanels.GXUserControl();
      AV37Pgmname = "" ;
      TempTags = "" ;
      AV29Longvarchar = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV38Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV39Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV40Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV30SDTInformeAlmacenTejidoCrudo_Cliente_Referencia = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia.class, "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia5 = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia.class, "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia6 = new GXBaseCollection[1] ;
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
      sCtrlAV26AlbrEst = "" ;
      sCtrlAV33AlbREntfrom = "" ;
      sCtrlAV34AlbREntto = "" ;
      sCtrlAV31TipEntCod = "" ;
      sCtrlAV32Tipo = "" ;
      AV37Pgmname = "InformeAlmacenTejidoCrudo_Cliente_Referencia" ;
      /* GeneXus formulas. */
      AV37Pgmname = "InformeAlmacenTejidoCrudo_Cliente_Referencia" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV26AlbrEst ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV26AlbrEst ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte AV27Albrestfrom ;
   private byte AV28Albrestto ;
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
   private int edtavPgmname_Enabled ;
   private int edtavLongvarchar_Visible ;
   private int idxLst ;
   private String wcpOAV25Emprcod ;
   private String wcpOAV17AlbRef ;
   private String wcpOAV18AlbRef_to ;
   private String wcpOAV33AlbREntfrom ;
   private String wcpOAV34AlbREntto ;
   private String wcpOAV32Tipo ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV25Emprcod ;
   private String AV17AlbRef ;
   private String AV18AlbRef_to ;
   private String AV33AlbREntfrom ;
   private String AV34AlbREntto ;
   private String AV32Tipo ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Informealmacentejidocrudoclientereferencia_Objectcall ;
   private String Informealmacentejidocrudoclientereferencia_Type ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Informealmacentejidocrudoclientereferencia_Title ;
   private String Informealmacentejidocrudoclientereferencia_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV37Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavLongvarchar_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV38Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV39Emprnom ;
   private String GXv_char3[] ;
   private String AV40Usurcod ;
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
   private String sCtrlAV26AlbrEst ;
   private String sCtrlAV33AlbREntfrom ;
   private String sCtrlAV34AlbREntto ;
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
   private String AV29Longvarchar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucInformealmacentejidocrudoclientereferencia ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV7Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV8Parameters ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> AV30SDTInformeAlmacenTejidoCrudo_Cliente_Referencia ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> GXt_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia5 ;
   private GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia> GXv_objcol_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia6[] ;
   private app.SdtQueryViewerDragAndDropData AV11DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV9ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV14ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV10ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV13ItemExpandData ;
}

