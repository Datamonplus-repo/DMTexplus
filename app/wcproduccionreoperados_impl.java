package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcproduccionreoperados_impl extends GXWebComponent
{
   public wcproduccionreoperados_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcproduccionreoperados_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcproduccionreoperados_impl.class ));
   }

   public wcproduccionreoperados_impl( int remoteHandle ,
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
      cmbavTipoquery = new HTMLChoice();
      cmbavQueryviewercharttype = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "NumeroOrdenamientoDatos") ;
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
               AV25NumeroOrdenamientoDatos = (short)(GXutil.lval( httpContext.GetPar( "NumeroOrdenamientoDatos"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25NumeroOrdenamientoDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NumeroOrdenamientoDatos), 4, 0));
               AV11EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
               AV21MaqCodInicial = httpContext.GetPar( "MaqCodInicial") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
               AV20MaqCodFinal = httpContext.GetPar( "MaqCodFinal") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
               AV14Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Hisprodti", localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV13HisprodtF = localUtil.parseDTimeParm( httpContext.GetPar( "HisprodtF")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisprodtF", localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV15HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15HisProReo", GXutil.str( AV15HisProReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,Short.valueOf(AV25NumeroOrdenamientoDatos),AV11EmprCod,AV21MaqCodInicial,AV20MaqCodFinal,AV14Hisprodti,AV13HisprodtF,Byte.valueOf(AV15HisProReo)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "NumeroOrdenamientoDatos") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "NumeroOrdenamientoDatos") ;
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
         pa14Z2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProduccion Reoperados", "")) ;
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
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcproduccionreoperados", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV25NumeroOrdenamientoDatos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV21MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV20MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV14Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV13HisprodtF)),GXutil.URLEncode(GXutil.ltrimstr(AV15HisProReo,1,0))}, new String[] {"NumeroOrdenamientoDatos","EmprCod","MaqCodInicial","MaqCodFinal","Hisprodti","HisprodtF","HisProReo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMAQUINASCOLLECTION", getSecureSignedToken( sPrefix, AV30SdtMaquinasCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENTIPOARTICULOCOLLECTION", getSecureSignedToken( sPrefix, AV32SDTResumenTipoArticuloCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENGRUPOOPERARIOCOLLECTION", getSecureSignedToken( sPrefix, AV5SDTResumenGrupoOperarioCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENTIPOCOLORANTECOLLECTION", getSecureSignedToken( sPrefix, AV33SDTResumenTipoColoranteCollection));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vELEMENTS", AV10Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vELEMENTS", AV10Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vPARAMETERS", AV27Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vPARAMETERS", AV27Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCLICKDATA", AV16ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCLICKDATA", AV16ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMDOUBLECLICKDATA", AV18ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMDOUBLECLICKDATA", AV18ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDRAGANDDROPDATA", AV8DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDRAGANDDROPDATA", AV8DragAndDropData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMEXPANDDATA", AV19ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMEXPANDDATA", AV19ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEMCOLLAPSEDATA", AV17ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEMCOLLAPSEDATA", AV17ItemCollapseData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25NumeroOrdenamientoDatos", GXutil.ltrim( localUtil.ntoc( wcpOAV25NumeroOrdenamientoDatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11EmprCod", GXutil.rtrim( wcpOAV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21MaqCodInicial", GXutil.rtrim( wcpOAV21MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20MaqCodFinal", GXutil.rtrim( wcpOAV20MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Hisprodti", localUtil.ttoc( wcpOAV14Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13HisprodtF", localUtil.ttoc( wcpOAV13HisprodtF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15HisProReo", GXutil.ltrim( localUtil.ntoc( wcpOAV15HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNUMEROORDENAMIENTODATOS", GXutil.ltrim( localUtil.ntoc( AV25NumeroOrdenamientoDatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMAQUINASCOLLECTION", AV30SdtMaquinasCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMAQUINASCOLLECTION", AV30SdtMaquinasCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMAQUINASCOLLECTION", getSecureSignedToken( sPrefix, AV30SdtMaquinasCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTRESUMENTIPOARTICULOCOLLECTION", AV32SDTResumenTipoArticuloCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTRESUMENTIPOARTICULOCOLLECTION", AV32SDTResumenTipoArticuloCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENTIPOARTICULOCOLLECTION", getSecureSignedToken( sPrefix, AV32SDTResumenTipoArticuloCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTRESUMENGRUPOOPERARIOCOLLECTION", AV5SDTResumenGrupoOperarioCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTRESUMENGRUPOOPERARIOCOLLECTION", AV5SDTResumenGrupoOperarioCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENGRUPOOPERARIOCOLLECTION", getSecureSignedToken( sPrefix, AV5SDTResumenGrupoOperarioCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTRESUMENTIPOCOLORANTECOLLECTION", AV33SDTResumenTipoColoranteCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTRESUMENTIPOCOLORANTECOLLECTION", AV33SDTResumenTipoColoranteCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENTIPOCOLORANTECOLLECTION", getSecureSignedToken( sPrefix, AV33SDTResumenTipoColoranteCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODINICIAL", GXutil.rtrim( AV21MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODFINAL", GXutil.rtrim( AV20MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV14Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV13HisprodtF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROREO", GXutil.ltrim( localUtil.ntoc( AV15HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Objectcall", GXutil.rtrim( Qvtabla_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Allowchangeaxesorder", GXutil.booltostr( Qvtabla_Allowchangeaxesorder));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Objectcall", GXutil.rtrim( Qvtabla_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Class", GXutil.rtrim( Qvtabla_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Height", GXutil.rtrim( Qvtabla_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Autorefreshgroup", GXutil.rtrim( Qvtabla_Autorefreshgroup));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Allowselection", GXutil.booltostr( Qvtabla_Allowselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Type", GXutil.rtrim( Qvtabla_Type));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Showdataas", GXutil.rtrim( Qvtabla_Showdataas));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Charttype", GXutil.rtrim( Qvtabla_Charttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Plotseries", GXutil.rtrim( Qvtabla_Plotseries));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Showdatalabelsin", GXutil.rtrim( Qvtabla_Showdatalabelsin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"QVTABLA_Visible", GXutil.booltostr( Qvtabla_Visible));
   }

   public void renderHtmlCloseForm14Z2( )
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
      return "WCProduccionReoperados" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProduccion Reoperados", "") ;
   }

   public void wb14Z0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcproduccionreoperados");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablaacciones_Internalname, divTablaacciones_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipoquery.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipoquery.getInternalname(), httpContext.getMessage( "Tipo Query", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipoquery, cmbavTipoquery.getInternalname(), GXutil.rtrim( AV175TipoQuery), 1, cmbavTipoquery.getJsonclick(), 5, "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVTIPOQUERY.CLICK."+"'", "svchar", "", 1, cmbavTipoquery.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "", true, (byte)(0), "HLP_WCProduccionReoperados.htm");
         cmbavTipoquery.setValue( GXutil.rtrim( AV175TipoQuery) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavTipoquery.getInternalname(), "Values", cmbavTipoquery.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavQueryviewercharttype.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavQueryviewercharttype.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavQueryviewercharttype.getInternalname(), httpContext.getMessage( "Tipo de Gráfico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'" + sPrefix + "',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavQueryviewercharttype, cmbavQueryviewercharttype.getInternalname(), GXutil.rtrim( AV28QueryViewerChartType), 1, cmbavQueryviewercharttype.getJsonclick(), 5, "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVQUERYVIEWERCHARTTYPE.CLICK."+"'", "char", "", cmbavQueryviewercharttype.getVisible(), cmbavQueryviewercharttype.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,24);\"", "", true, (byte)(0), "HLP_WCProduccionReoperados.htm");
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV28QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
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
         /* User Defined Control */
         ucQvtabla.setProperty("Elements", AV10Elements);
         ucQvtabla.setProperty("AllowElementsOrderChange", Qvtabla_Allowchangeaxesorder);
         ucQvtabla.setProperty("Parameters", AV27Parameters);
         ucQvtabla.setProperty("Class", Qvtabla_Class);
         ucQvtabla.setProperty("Height", Qvtabla_Height);
         ucQvtabla.setProperty("AutoRefreshGroup", Qvtabla_Autorefreshgroup);
         ucQvtabla.setProperty("AllowSelection", Qvtabla_Allowselection);
         ucQvtabla.setProperty("Title", Qvtabla_Title);
         ucQvtabla.setProperty("ShowDataAs", Qvtabla_Showdataas);
         ucQvtabla.setProperty("PlotSeries", Qvtabla_Plotseries);
         ucQvtabla.setProperty("ShowDataLabelsIn", Qvtabla_Showdatalabelsin);
         ucQvtabla.setProperty("ItemClickData", AV16ItemClickData);
         ucQvtabla.setProperty("ItemDoubleClickData", AV18ItemDoubleClickData);
         ucQvtabla.setProperty("DragAndDropData", AV8DragAndDropData);
         ucQvtabla.setProperty("FilterChangedData", AV12FilterChangedData);
         ucQvtabla.setProperty("ItemExpandData", AV19ItemExpandData);
         ucQvtabla.setProperty("ItemCollapseData", AV17ItemCollapseData);
         ucQvtabla.render(context, "queryviewer", Qvtabla_Internalname, sPrefix+"QVTABLAContainer");
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

   public void start14Z2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProduccion Reoperados", ""), (short)(0)) ;
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
            strup14Z0( ) ;
         }
      }
   }

   public void ws14Z2( )
   {
      start14Z2( ) ;
      evt14Z2( ) ;
   }

   public void evt14Z2( )
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
                              strup14Z0( ) ;
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
                              strup14Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1114Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1214Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: Load */
                                 e1314Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VTIPOQUERY.CLICK") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1414Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VQUERYVIEWERCHARTTYPE.CLICK") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1514Z2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup14Z0( ) ;
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
                              strup14Z0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavTipoquery.getInternalname() ;
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

   public void we14Z2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm14Z2( ) ;
         }
      }
   }

   public void pa14Z2( )
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
            GX_FocusControl = cmbavTipoquery.getInternalname() ;
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
      if ( cmbavTipoquery.getItemCount() > 0 )
      {
         AV175TipoQuery = cmbavTipoquery.getValidValue(AV175TipoQuery) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175TipoQuery", AV175TipoQuery);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipoquery.setValue( GXutil.rtrim( AV175TipoQuery) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavTipoquery.getInternalname(), "Values", cmbavTipoquery.ToJavascriptSource(), true);
      }
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
         AV28QueryViewerChartType = cmbavQueryviewercharttype.getValidValue(AV28QueryViewerChartType) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28QueryViewerChartType", AV28QueryViewerChartType);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavQueryviewercharttype.setValue( GXutil.rtrim( AV28QueryViewerChartType) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Values", cmbavQueryviewercharttype.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf14Z2( ) ;
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

   public void rf14Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1214Z2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1314Z2 ();
         wb14Z0( ) ;
      }
   }

   public void send_integrity_lvl_hashes14Z2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMAQUINASCOLLECTION", AV30SdtMaquinasCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMAQUINASCOLLECTION", AV30SdtMaquinasCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMAQUINASCOLLECTION", getSecureSignedToken( sPrefix, AV30SdtMaquinasCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTRESUMENTIPOARTICULOCOLLECTION", AV32SDTResumenTipoArticuloCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTRESUMENTIPOARTICULOCOLLECTION", AV32SDTResumenTipoArticuloCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENTIPOARTICULOCOLLECTION", getSecureSignedToken( sPrefix, AV32SDTResumenTipoArticuloCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTRESUMENGRUPOOPERARIOCOLLECTION", AV5SDTResumenGrupoOperarioCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTRESUMENGRUPOOPERARIOCOLLECTION", AV5SDTResumenGrupoOperarioCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENGRUPOOPERARIOCOLLECTION", getSecureSignedToken( sPrefix, AV5SDTResumenGrupoOperarioCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTRESUMENTIPOCOLORANTECOLLECTION", AV33SDTResumenTipoColoranteCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTRESUMENTIPOCOLORANTECOLLECTION", AV33SDTResumenTipoColoranteCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTRESUMENTIPOCOLORANTECOLLECTION", getSecureSignedToken( sPrefix, AV33SDTResumenTipoColoranteCollection));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup14Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1114Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vELEMENTS"), AV10Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vPARAMETERS"), AV27Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCLICKDATA"), AV16ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMDOUBLECLICKDATA"), AV18ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDRAGANDDROPDATA"), AV8DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vFILTERCHANGEDDATA"), AV12FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMEXPANDDATA"), AV19ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEMCOLLAPSEDATA"), AV17ItemCollapseData);
         /* Read saved values. */
         wcpOAV25NumeroOrdenamientoDatos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25NumeroOrdenamientoDatos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
         wcpOAV21MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV21MaqCodInicial") ;
         wcpOAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodFinal") ;
         wcpOAV14Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV14Hisprodti"), 0) ;
         wcpOAV13HisprodtF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV13HisprodtF"), 0) ;
         wcpOAV15HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Qvtabla_Objectcall = httpContext.cgiGet( sPrefix+"QVTABLA_Objectcall") ;
         Qvtabla_Allowchangeaxesorder = GXutil.strtobool( httpContext.cgiGet( sPrefix+"QVTABLA_Allowchangeaxesorder")) ;
         Qvtabla_Objectcall = httpContext.cgiGet( sPrefix+"QVTABLA_Objectcall") ;
         Qvtabla_Class = httpContext.cgiGet( sPrefix+"QVTABLA_Class") ;
         Qvtabla_Height = httpContext.cgiGet( sPrefix+"QVTABLA_Height") ;
         Qvtabla_Autorefreshgroup = httpContext.cgiGet( sPrefix+"QVTABLA_Autorefreshgroup") ;
         Qvtabla_Allowselection = GXutil.strtobool( httpContext.cgiGet( sPrefix+"QVTABLA_Allowselection")) ;
         Qvtabla_Type = httpContext.cgiGet( sPrefix+"QVTABLA_Type") ;
         Qvtabla_Showdataas = httpContext.cgiGet( sPrefix+"QVTABLA_Showdataas") ;
         Qvtabla_Charttype = httpContext.cgiGet( sPrefix+"QVTABLA_Charttype") ;
         Qvtabla_Plotseries = httpContext.cgiGet( sPrefix+"QVTABLA_Plotseries") ;
         Qvtabla_Showdatalabelsin = httpContext.cgiGet( sPrefix+"QVTABLA_Showdatalabelsin") ;
         Qvtabla_Visible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"QVTABLA_Visible")) ;
         /* Read variables values. */
         cmbavTipoquery.setValue( httpContext.cgiGet( cmbavTipoquery.getInternalname()) );
         AV175TipoQuery = httpContext.cgiGet( cmbavTipoquery.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175TipoQuery", AV175TipoQuery);
         cmbavQueryviewercharttype.setValue( httpContext.cgiGet( cmbavQueryviewercharttype.getInternalname()) );
         AV28QueryViewerChartType = httpContext.cgiGet( cmbavQueryviewercharttype.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28QueryViewerChartType", AV28QueryViewerChartType);
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
      e1114Z2 ();
      if (returnInSub) return;
   }

   public void e1114Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV175TipoQuery = "Table" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV175TipoQuery", AV175TipoQuery);
      AV28QueryViewerChartType = "Bar" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28QueryViewerChartType", AV28QueryViewerChartType);
      /* Execute user subroutine: 'CREATE QUERY VIEWER' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ACTUALIZAR QUERY VIEWER' */
      S122 ();
      if (returnInSub) return;
      GXt_char1 = AV143Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcproduccionreoperados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV143Station = GXt_char1 ;
      GXv_char2[0] = AV11EmprCod ;
      GXv_char3[0] = AV47EmprNom ;
      GXv_char4[0] = AV165UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV143Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcproduccionreoperados_impl.this.AV11EmprCod = GXv_char2[0] ;
      wcproduccionreoperados_impl.this.AV47EmprNom = GXv_char3[0] ;
      wcproduccionreoperados_impl.this.AV165UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
   }

   public void e1214Z2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR QUERY VIEWER' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1414Z2( )
   {
      /* Tipoquery_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR QUERY VIEWER' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1514Z2( )
   {
      /* Queryviewercharttype_Click Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'ACTUALIZAR QUERY VIEWER' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ACTUALIZAR QUERY VIEWER' Routine */
      returnInSub = false ;
      cmbavQueryviewercharttype.setVisible( (((GXutil.strcmp(AV175TipoQuery, "Chart")==0)) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavQueryviewercharttype.getInternalname(), "Visible", GXutil.ltrimstr( cmbavQueryviewercharttype.getVisible(), 5, 0), true);
      Qvtabla_Type = AV175TipoQuery ;
      ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "Type", Qvtabla_Type);
      if ( GXutil.strcmp(AV175TipoQuery, "Chart") == 0 )
      {
         Qvtabla_Charttype = AV28QueryViewerChartType ;
         ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "ChartType", Qvtabla_Charttype);
      }
      AV24MostrarResultados = false ;
      if ( (0==AV25NumeroOrdenamientoDatos) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falla en recepción de Parámetro de Ordenamiento de Datos. Por favor contactar a soporte aplicaciones", ""));
      }
      else if ( AV25NumeroOrdenamientoDatos == 1 )
      {
         AV24MostrarResultados = (boolean)(((AV30SdtMaquinasCollection.size()>0))) ;
      }
      else if ( AV25NumeroOrdenamientoDatos == 2 )
      {
         AV24MostrarResultados = (boolean)(((AV32SDTResumenTipoArticuloCollection.size()>0))) ;
      }
      else if ( AV25NumeroOrdenamientoDatos == 3 )
      {
         AV24MostrarResultados = (boolean)(((AV5SDTResumenGrupoOperarioCollection.size()>0))) ;
      }
      else if ( AV25NumeroOrdenamientoDatos == 4 )
      {
         AV24MostrarResultados = (boolean)(((AV33SDTResumenTipoColoranteCollection.size()>0))) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Falla en recepción de Parámetro de Ordenamiento de Datos, No definido para N° %1. Por favor contactar a soporte aplicaciones", ""), GXutil.trim( GXutil.str( AV25NumeroOrdenamientoDatos, 4, 0)), "", "", "", "", "", "", "", ""));
      }
      Qvtabla_Visible = AV24MostrarResultados ;
      ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "Visible", GXutil.booltostr( Qvtabla_Visible));
      divTablaacciones_Visible = (AV24MostrarResultados ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablaacciones_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablaacciones_Visible), 5, 0), true);
   }

   public void S112( )
   {
      /* 'CREATE QUERY VIEWER' Routine */
      returnInSub = false ;
      if ( AV25NumeroOrdenamientoDatos == 1 )
      {
         GXt_objcol_SdtSDTMaquinas5 = AV30SdtMaquinasCollection ;
         GXv_objcol_SdtSDTMaquinas6[0] = GXt_objcol_SdtSDTMaquinas5 ;
         new app.dpproduccionreoperadosmaquinas(remoteHandle, context).execute( AV11EmprCod, AV21MaqCodInicial, AV20MaqCodFinal, AV14Hisprodti, AV13HisprodtF, AV15HisProReo, GXv_objcol_SdtSDTMaquinas6) ;
         GXt_objcol_SdtSDTMaquinas5 = GXv_objcol_SdtSDTMaquinas6[0] ;
         AV30SdtMaquinasCollection = GXt_objcol_SdtSDTMaquinas5 ;
         if ( AV30SdtMaquinasCollection.size() > 0 )
         {
            Qvtabla_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionReoperadosMaquinas")+"\", \""+GXutil.encodeJSON( AV11EmprCod)+"\", \""+GXutil.encodeJSON( AV21MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( GXutil.str( AV15HisProReo, 1, 0))+"\" ]" ;
            ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "Object", Qvtabla_Objectcall);
         }
      }
      else if ( AV25NumeroOrdenamientoDatos == 2 )
      {
         GXt_objcol_SdtSDTResumenTipoArticulo7 = AV32SDTResumenTipoArticuloCollection ;
         GXv_objcol_SdtSDTResumenTipoArticulo8[0] = GXt_objcol_SdtSDTResumenTipoArticulo7 ;
         new app.dpproduccionreoperadostipoarticulos(remoteHandle, context).execute( AV11EmprCod, AV21MaqCodInicial, AV20MaqCodFinal, AV14Hisprodti, AV13HisprodtF, AV15HisProReo, GXv_objcol_SdtSDTResumenTipoArticulo8) ;
         GXt_objcol_SdtSDTResumenTipoArticulo7 = GXv_objcol_SdtSDTResumenTipoArticulo8[0] ;
         AV32SDTResumenTipoArticuloCollection = GXt_objcol_SdtSDTResumenTipoArticulo7 ;
         if ( AV32SDTResumenTipoArticuloCollection.size() > 0 )
         {
            Qvtabla_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionReoperadosTipoArticulos")+"\", \""+GXutil.encodeJSON( AV11EmprCod)+"\", \""+GXutil.encodeJSON( AV21MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( GXutil.str( AV15HisProReo, 1, 0))+"\" ]" ;
            ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "Object", Qvtabla_Objectcall);
         }
      }
      else if ( AV25NumeroOrdenamientoDatos == 3 )
      {
         GXt_objcol_SdtSDTResumenGrupoOperario9 = AV5SDTResumenGrupoOperarioCollection ;
         GXv_objcol_SdtSDTResumenGrupoOperario10[0] = GXt_objcol_SdtSDTResumenGrupoOperario9 ;
         new app.dpproduccionreoperadosgrupooperarios(remoteHandle, context).execute( AV11EmprCod, AV21MaqCodInicial, AV20MaqCodFinal, AV14Hisprodti, AV13HisprodtF, AV15HisProReo, GXv_objcol_SdtSDTResumenGrupoOperario10) ;
         GXt_objcol_SdtSDTResumenGrupoOperario9 = GXv_objcol_SdtSDTResumenGrupoOperario10[0] ;
         AV5SDTResumenGrupoOperarioCollection = GXt_objcol_SdtSDTResumenGrupoOperario9 ;
         if ( AV5SDTResumenGrupoOperarioCollection.size() > 0 )
         {
            Qvtabla_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionReoperadosGrupoOperarios")+"\", \""+GXutil.encodeJSON( AV11EmprCod)+"\", \""+GXutil.encodeJSON( AV21MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( GXutil.str( AV15HisProReo, 1, 0))+"\" ]" ;
            ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "Object", Qvtabla_Objectcall);
         }
      }
      else if ( AV25NumeroOrdenamientoDatos == 4 )
      {
         GXt_objcol_SdtSDTResumenTipoColorante11 = AV33SDTResumenTipoColoranteCollection ;
         GXv_objcol_SdtSDTResumenTipoColorante12[0] = GXt_objcol_SdtSDTResumenTipoColorante11 ;
         new app.dpproduccionreoperadostipocolorantes(remoteHandle, context).execute( AV11EmprCod, AV21MaqCodInicial, AV20MaqCodFinal, AV14Hisprodti, AV13HisprodtF, AV15HisProReo, GXv_objcol_SdtSDTResumenTipoColorante12) ;
         GXt_objcol_SdtSDTResumenTipoColorante11 = GXv_objcol_SdtSDTResumenTipoColorante12[0] ;
         AV33SDTResumenTipoColoranteCollection = GXt_objcol_SdtSDTResumenTipoColorante11 ;
         if ( AV33SDTResumenTipoColoranteCollection.size() > 0 )
         {
            Qvtabla_Objectcall = "[ \""+"dp"+"\", \""+GXutil.encodeJSON( "DPProduccionReoperadosTipoColorantes")+"\", \""+GXutil.encodeJSON( AV11EmprCod)+"\", \""+GXutil.encodeJSON( AV21MaqCodInicial)+"\", \""+GXutil.encodeJSON( AV20MaqCodFinal)+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\", \""+GXutil.encodeJSON( GXutil.str( AV15HisProReo, 1, 0))+"\" ]" ;
            ucQvtabla.sendProperty(context, sPrefix, false, Qvtabla_Internalname, "Object", Qvtabla_Objectcall);
         }
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e1314Z2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV25NumeroOrdenamientoDatos = ((Number) GXutil.testNumericType( getParm(obj,0,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25NumeroOrdenamientoDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NumeroOrdenamientoDatos), 4, 0));
      AV11EmprCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV21MaqCodInicial = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
      AV20MaqCodFinal = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
      AV14Hisprodti = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Hisprodti", localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV13HisprodtF = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisprodtF", localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV15HisProReo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15HisProReo", GXutil.str( AV15HisProReo, 1, 0));
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
      pa14Z2( ) ;
      ws14Z2( ) ;
      we14Z2( ) ;
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
      sCtrlAV25NumeroOrdenamientoDatos = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV11EmprCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV21MaqCodInicial = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV20MaqCodFinal = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV14Hisprodti = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV13HisprodtF = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV15HisProReo = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa14Z2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcproduccionreoperados", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa14Z2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV25NumeroOrdenamientoDatos = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25NumeroOrdenamientoDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NumeroOrdenamientoDatos), 4, 0));
         AV11EmprCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         AV21MaqCodInicial = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
         AV20MaqCodFinal = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
         AV14Hisprodti = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Hisprodti", localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV13HisprodtF = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisprodtF", localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV15HisProReo = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15HisProReo", GXutil.str( AV15HisProReo, 1, 0));
      }
      wcpOAV25NumeroOrdenamientoDatos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25NumeroOrdenamientoDatos"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
      wcpOAV21MaqCodInicial = httpContext.cgiGet( sPrefix+"wcpOAV21MaqCodInicial") ;
      wcpOAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"wcpOAV20MaqCodFinal") ;
      wcpOAV14Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV14Hisprodti"), 0) ;
      wcpOAV13HisprodtF = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV13HisprodtF"), 0) ;
      wcpOAV15HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV15HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( AV25NumeroOrdenamientoDatos != wcpOAV25NumeroOrdenamientoDatos ) || ( GXutil.strcmp(AV11EmprCod, wcpOAV11EmprCod) != 0 ) || ( GXutil.strcmp(AV21MaqCodInicial, wcpOAV21MaqCodInicial) != 0 ) || ( GXutil.strcmp(AV20MaqCodFinal, wcpOAV20MaqCodFinal) != 0 ) || !( GXutil.dateCompare(AV14Hisprodti, wcpOAV14Hisprodti) ) || !( GXutil.dateCompare(AV13HisprodtF, wcpOAV13HisprodtF) ) || ( AV15HisProReo != wcpOAV15HisProReo ) ) )
      {
         setjustcreated();
      }
      wcpOAV25NumeroOrdenamientoDatos = AV25NumeroOrdenamientoDatos ;
      wcpOAV11EmprCod = AV11EmprCod ;
      wcpOAV21MaqCodInicial = AV21MaqCodInicial ;
      wcpOAV20MaqCodFinal = AV20MaqCodFinal ;
      wcpOAV14Hisprodti = AV14Hisprodti ;
      wcpOAV13HisprodtF = AV13HisprodtF ;
      wcpOAV15HisProReo = AV15HisProReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV25NumeroOrdenamientoDatos = httpContext.cgiGet( sPrefix+"AV25NumeroOrdenamientoDatos_CTRL") ;
      if ( GXutil.len( sCtrlAV25NumeroOrdenamientoDatos) > 0 )
      {
         AV25NumeroOrdenamientoDatos = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25NumeroOrdenamientoDatos), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25NumeroOrdenamientoDatos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NumeroOrdenamientoDatos), 4, 0));
      }
      else
      {
         AV25NumeroOrdenamientoDatos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25NumeroOrdenamientoDatos_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV11EmprCod) > 0 )
      {
         AV11EmprCod = httpContext.cgiGet( sCtrlAV11EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      }
      else
      {
         AV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_PARM") ;
      }
      sCtrlAV21MaqCodInicial = httpContext.cgiGet( sPrefix+"AV21MaqCodInicial_CTRL") ;
      if ( GXutil.len( sCtrlAV21MaqCodInicial) > 0 )
      {
         AV21MaqCodInicial = httpContext.cgiGet( sCtrlAV21MaqCodInicial) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21MaqCodInicial", AV21MaqCodInicial);
      }
      else
      {
         AV21MaqCodInicial = httpContext.cgiGet( sPrefix+"AV21MaqCodInicial_PARM") ;
      }
      sCtrlAV20MaqCodFinal = httpContext.cgiGet( sPrefix+"AV20MaqCodFinal_CTRL") ;
      if ( GXutil.len( sCtrlAV20MaqCodFinal) > 0 )
      {
         AV20MaqCodFinal = httpContext.cgiGet( sCtrlAV20MaqCodFinal) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20MaqCodFinal", AV20MaqCodFinal);
      }
      else
      {
         AV20MaqCodFinal = httpContext.cgiGet( sPrefix+"AV20MaqCodFinal_PARM") ;
      }
      sCtrlAV14Hisprodti = httpContext.cgiGet( sPrefix+"AV14Hisprodti_CTRL") ;
      if ( GXutil.len( sCtrlAV14Hisprodti) > 0 )
      {
         AV14Hisprodti = localUtil.ctot( httpContext.cgiGet( sCtrlAV14Hisprodti), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Hisprodti", localUtil.ttoc( AV14Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV14Hisprodti = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV14Hisprodti_PARM"), 0) ;
      }
      sCtrlAV13HisprodtF = httpContext.cgiGet( sPrefix+"AV13HisprodtF_CTRL") ;
      if ( GXutil.len( sCtrlAV13HisprodtF) > 0 )
      {
         AV13HisprodtF = localUtil.ctot( httpContext.cgiGet( sCtrlAV13HisprodtF), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisprodtF", localUtil.ttoc( AV13HisprodtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV13HisprodtF = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV13HisprodtF_PARM"), 0) ;
      }
      sCtrlAV15HisProReo = httpContext.cgiGet( sPrefix+"AV15HisProReo_CTRL") ;
      if ( GXutil.len( sCtrlAV15HisProReo) > 0 )
      {
         AV15HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV15HisProReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15HisProReo", GXutil.str( AV15HisProReo, 1, 0));
      }
      else
      {
         AV15HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV15HisProReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa14Z2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws14Z2( ) ;
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
      ws14Z2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25NumeroOrdenamientoDatos_PARM", GXutil.ltrim( localUtil.ntoc( AV25NumeroOrdenamientoDatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25NumeroOrdenamientoDatos)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25NumeroOrdenamientoDatos_CTRL", GXutil.rtrim( sCtrlAV25NumeroOrdenamientoDatos));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_PARM", GXutil.rtrim( AV11EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_CTRL", GXutil.rtrim( sCtrlAV11EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21MaqCodInicial_PARM", GXutil.rtrim( AV21MaqCodInicial));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21MaqCodInicial)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21MaqCodInicial_CTRL", GXutil.rtrim( sCtrlAV21MaqCodInicial));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodFinal_PARM", GXutil.rtrim( AV20MaqCodFinal));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20MaqCodFinal)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20MaqCodFinal_CTRL", GXutil.rtrim( sCtrlAV20MaqCodFinal));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Hisprodti_PARM", localUtil.ttoc( AV14Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Hisprodti)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Hisprodti_CTRL", GXutil.rtrim( sCtrlAV14Hisprodti));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13HisprodtF_PARM", localUtil.ttoc( AV13HisprodtF, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13HisprodtF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13HisprodtF_CTRL", GXutil.rtrim( sCtrlAV13HisprodtF));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15HisProReo_PARM", GXutil.ltrim( localUtil.ntoc( AV15HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15HisProReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15HisProReo_CTRL", GXutil.rtrim( sCtrlAV15HisProReo));
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
      we14Z2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026519934356", true, true);
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
      httpContext.AddJavascriptSource("wcproduccionreoperados.js", "?2026519934356", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavTipoquery.setInternalname( sPrefix+"vTIPOQUERY" );
      cmbavQueryviewercharttype.setInternalname( sPrefix+"vQUERYVIEWERCHARTTYPE" );
      divTablaacciones_Internalname = sPrefix+"TABLAACCIONES" ;
      Qvtabla_Internalname = sPrefix+"QVTABLA" ;
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
      Qvtabla_Title = "" ;
      cmbavQueryviewercharttype.setJsonclick( "" );
      cmbavQueryviewercharttype.setEnabled( 1 );
      cmbavQueryviewercharttype.setVisible( 1 );
      cmbavTipoquery.setJsonclick( "" );
      cmbavTipoquery.setEnabled( 1 );
      divTablaacciones_Visible = 1 ;
      Qvtabla_Visible = GXutil.toBoolean( -1) ;
      Qvtabla_Showdatalabelsin = "" ;
      Qvtabla_Plotseries = "InTheSameChart" ;
      Qvtabla_Charttype = "Column" ;
      Qvtabla_Showdataas = "Values" ;
      Qvtabla_Type = "Default" ;
      Qvtabla_Allowselection = GXutil.toBoolean( 1) ;
      Qvtabla_Autorefreshgroup = "VistaGrupo" ;
      Qvtabla_Height = "300px" ;
      Qvtabla_Class = "" ;
      Qvtabla_Allowchangeaxesorder = GXutil.toBoolean( -1) ;
      Qvtabla_Objectcall = "" ;
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
      cmbavTipoquery.setName( "vTIPOQUERY" );
      cmbavTipoquery.setWebtags( "" );
      cmbavTipoquery.addItem("Table", httpContext.getMessage( "Tabla", ""), (short)(0));
      cmbavTipoquery.addItem("Chart", httpContext.getMessage( "Gráfico", ""), (short)(0));
      cmbavTipoquery.addItem("PivotTable", httpContext.getMessage( "Dinámica", ""), (short)(0));
      if ( cmbavTipoquery.getItemCount() > 0 )
      {
      }
      cmbavQueryviewercharttype.setName( "vQUERYVIEWERCHARTTYPE" );
      cmbavQueryviewercharttype.setWebtags( "" );
      cmbavQueryviewercharttype.addItem("Column", httpContext.getMessage( "Column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Column3D", httpContext.getMessage( "Column 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn", httpContext.getMessage( "Stacked column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn3D", httpContext.getMessage( "Stacked column 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedColumn100", httpContext.getMessage( "100% stacked column", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Bar", httpContext.getMessage( "Bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedBar", httpContext.getMessage( "Stacked bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedBar100", httpContext.getMessage( "100% stacked bar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Area", httpContext.getMessage( "Area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedArea", httpContext.getMessage( "Stacked area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedArea100", httpContext.getMessage( "100% stacked area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothArea", httpContext.getMessage( "Smooth area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepArea", httpContext.getMessage( "Step area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Line", httpContext.getMessage( "Line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedLine", httpContext.getMessage( "Stacked line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StackedLine100", httpContext.getMessage( "100% stacked line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothLine", httpContext.getMessage( "Smooth line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepLine", httpContext.getMessage( "Step line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pie", httpContext.getMessage( "Pie", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pie3D", httpContext.getMessage( "Pie 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Doughnut", httpContext.getMessage( "Doughnut", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Doughnut3D", httpContext.getMessage( "Doughnut 3D", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("LinearGauge", httpContext.getMessage( "Linear gauge", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("CircularGauge", httpContext.getMessage( "Circular gauge", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Radar", httpContext.getMessage( "Radar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("FilledRadar", httpContext.getMessage( "Filled radar", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("PolarArea", httpContext.getMessage( "Polar area", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Funnel", httpContext.getMessage( "Funnel", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Pyramid", httpContext.getMessage( "Pyramid", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("ColumnLine", httpContext.getMessage( "Column & line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Column3DLine", httpContext.getMessage( "Column 3D & line", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Timeline", httpContext.getMessage( "Timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("SmoothTimeline", httpContext.getMessage( "Smooth timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("StepTimeline", httpContext.getMessage( "Step timeline", ""), (short)(0));
      cmbavQueryviewercharttype.addItem("Sparkline", httpContext.getMessage( "Sparkline", ""), (short)(0));
      if ( cmbavQueryviewercharttype.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'cmbavTipoquery'},{av:'AV175TipoQuery',fld:'vTIPOQUERY',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV28QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV25NumeroOrdenamientoDatos',fld:'vNUMEROORDENAMIENTODATOS',pic:'ZZZ9'},{av:'AV30SdtMaquinasCollection',fld:'vSDTMAQUINASCOLLECTION',pic:'',hsh:true},{av:'AV32SDTResumenTipoArticuloCollection',fld:'vSDTRESUMENTIPOARTICULOCOLLECTION',pic:'',hsh:true},{av:'AV5SDTResumenGrupoOperarioCollection',fld:'vSDTRESUMENGRUPOOPERARIOCOLLECTION',pic:'',hsh:true},{av:'AV33SDTResumenTipoColoranteCollection',fld:'vSDTRESUMENTIPOCOLORANTECOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavQueryviewercharttype'},{av:'Qvtabla_Type',ctrl:'QVTABLA',prop:'Type'},{av:'Qvtabla_Charttype',ctrl:'QVTABLA',prop:'ChartType'},{av:'Qvtabla_Visible',ctrl:'QVTABLA',prop:'Visible'},{av:'divTablaacciones_Visible',ctrl:'TABLAACCIONES',prop:'Visible'}]}");
      setEventMetadata("VTIPOQUERY.CLICK","{handler:'e1414Z2',iparms:[{av:'cmbavTipoquery'},{av:'AV175TipoQuery',fld:'vTIPOQUERY',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV28QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV25NumeroOrdenamientoDatos',fld:'vNUMEROORDENAMIENTODATOS',pic:'ZZZ9'},{av:'AV30SdtMaquinasCollection',fld:'vSDTMAQUINASCOLLECTION',pic:'',hsh:true},{av:'AV32SDTResumenTipoArticuloCollection',fld:'vSDTRESUMENTIPOARTICULOCOLLECTION',pic:'',hsh:true},{av:'AV5SDTResumenGrupoOperarioCollection',fld:'vSDTRESUMENGRUPOOPERARIOCOLLECTION',pic:'',hsh:true},{av:'AV33SDTResumenTipoColoranteCollection',fld:'vSDTRESUMENTIPOCOLORANTECOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("VTIPOQUERY.CLICK",",oparms:[{av:'cmbavQueryviewercharttype'},{av:'Qvtabla_Type',ctrl:'QVTABLA',prop:'Type'},{av:'Qvtabla_Charttype',ctrl:'QVTABLA',prop:'ChartType'},{av:'Qvtabla_Visible',ctrl:'QVTABLA',prop:'Visible'},{av:'divTablaacciones_Visible',ctrl:'TABLAACCIONES',prop:'Visible'}]}");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CLICK","{handler:'e1514Z2',iparms:[{av:'cmbavTipoquery'},{av:'AV175TipoQuery',fld:'vTIPOQUERY',pic:''},{av:'cmbavQueryviewercharttype'},{av:'AV28QueryViewerChartType',fld:'vQUERYVIEWERCHARTTYPE',pic:''},{av:'AV25NumeroOrdenamientoDatos',fld:'vNUMEROORDENAMIENTODATOS',pic:'ZZZ9'},{av:'AV30SdtMaquinasCollection',fld:'vSDTMAQUINASCOLLECTION',pic:'',hsh:true},{av:'AV32SDTResumenTipoArticuloCollection',fld:'vSDTRESUMENTIPOARTICULOCOLLECTION',pic:'',hsh:true},{av:'AV5SDTResumenGrupoOperarioCollection',fld:'vSDTRESUMENGRUPOOPERARIOCOLLECTION',pic:'',hsh:true},{av:'AV33SDTResumenTipoColoranteCollection',fld:'vSDTRESUMENTIPOCOLORANTECOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("VQUERYVIEWERCHARTTYPE.CLICK",",oparms:[{av:'cmbavQueryviewercharttype'},{av:'Qvtabla_Type',ctrl:'QVTABLA',prop:'Type'},{av:'Qvtabla_Charttype',ctrl:'QVTABLA',prop:'ChartType'},{av:'Qvtabla_Visible',ctrl:'QVTABLA',prop:'Visible'},{av:'divTablaacciones_Visible',ctrl:'TABLAACCIONES',prop:'Visible'}]}");
      setEventMetadata("VALIDV_QUERYVIEWERCHARTTYPE","{handler:'validv_Queryviewercharttype',iparms:[]");
      setEventMetadata("VALIDV_QUERYVIEWERCHARTTYPE",",oparms:[]}");
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
      wcpOAV11EmprCod = "" ;
      wcpOAV21MaqCodInicial = "" ;
      wcpOAV20MaqCodFinal = "" ;
      wcpOAV14Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV13HisprodtF = GXutil.resetTime( GXutil.nullDate() );
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11EmprCod = "" ;
      AV21MaqCodInicial = "" ;
      AV20MaqCodFinal = "" ;
      AV14Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV13HisprodtF = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV30SdtMaquinasCollection = new GXBaseCollection<app.SdtSDTMaquinas>(app.SdtSDTMaquinas.class, "SDTMaquinas", "TexplusNET", remoteHandle);
      AV32SDTResumenTipoArticuloCollection = new GXBaseCollection<app.SdtSDTResumenTipoArticulo>(app.SdtSDTResumenTipoArticulo.class, "SDTResumenTipoArticulo", "TexplusNET", remoteHandle);
      AV5SDTResumenGrupoOperarioCollection = new GXBaseCollection<app.SdtSDTResumenGrupoOperario>(app.SdtSDTResumenGrupoOperario.class, "SDTResumenGrupoOperario", "TexplusNET", remoteHandle);
      AV33SDTResumenTipoColoranteCollection = new GXBaseCollection<app.SdtSDTResumenTipoColorante>(app.SdtSDTResumenTipoColorante.class, "SDTResumenTipoColorante", "TexplusNET", remoteHandle);
      GXKey = "" ;
      AV10Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV27Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV16ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV18ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV8DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV12FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV19ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV17ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      AV175TipoQuery = "" ;
      AV28QueryViewerChartType = "" ;
      ucQvtabla = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV143Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV47EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV165UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXt_objcol_SdtSDTMaquinas5 = new GXBaseCollection<app.SdtSDTMaquinas>(app.SdtSDTMaquinas.class, "SDTMaquinas", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquinas6 = new GXBaseCollection[1] ;
      GXt_objcol_SdtSDTResumenTipoArticulo7 = new GXBaseCollection<app.SdtSDTResumenTipoArticulo>(app.SdtSDTResumenTipoArticulo.class, "SDTResumenTipoArticulo", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTResumenTipoArticulo8 = new GXBaseCollection[1] ;
      GXt_objcol_SdtSDTResumenGrupoOperario9 = new GXBaseCollection<app.SdtSDTResumenGrupoOperario>(app.SdtSDTResumenGrupoOperario.class, "SDTResumenGrupoOperario", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTResumenGrupoOperario10 = new GXBaseCollection[1] ;
      GXt_objcol_SdtSDTResumenTipoColorante11 = new GXBaseCollection<app.SdtSDTResumenTipoColorante>(app.SdtSDTResumenTipoColorante.class, "SDTResumenTipoColorante", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTResumenTipoColorante12 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV25NumeroOrdenamientoDatos = "" ;
      sCtrlAV11EmprCod = "" ;
      sCtrlAV21MaqCodInicial = "" ;
      sCtrlAV20MaqCodFinal = "" ;
      sCtrlAV14Hisprodti = "" ;
      sCtrlAV13HisprodtF = "" ;
      sCtrlAV15HisProReo = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV15HisProReo ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV15HisProReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wcpOAV25NumeroOrdenamientoDatos ;
   private short AV25NumeroOrdenamientoDatos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int divTablaacciones_Visible ;
   private int idxLst ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV21MaqCodInicial ;
   private String wcpOAV20MaqCodFinal ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11EmprCod ;
   private String AV21MaqCodInicial ;
   private String AV20MaqCodFinal ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Qvtabla_Objectcall ;
   private String Qvtabla_Class ;
   private String Qvtabla_Height ;
   private String Qvtabla_Autorefreshgroup ;
   private String Qvtabla_Type ;
   private String Qvtabla_Showdataas ;
   private String Qvtabla_Charttype ;
   private String Qvtabla_Plotseries ;
   private String Qvtabla_Showdatalabelsin ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divTablaacciones_Internalname ;
   private String TempTags ;
   private String AV28QueryViewerChartType ;
   private String Qvtabla_Title ;
   private String Qvtabla_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV143Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV47EmprNom ;
   private String GXv_char3[] ;
   private String AV165UsurCod ;
   private String GXv_char4[] ;
   private String sCtrlAV25NumeroOrdenamientoDatos ;
   private String sCtrlAV11EmprCod ;
   private String sCtrlAV21MaqCodInicial ;
   private String sCtrlAV20MaqCodFinal ;
   private String sCtrlAV14Hisprodti ;
   private String sCtrlAV13HisprodtF ;
   private String sCtrlAV15HisProReo ;
   private java.util.Date wcpOAV14Hisprodti ;
   private java.util.Date wcpOAV13HisprodtF ;
   private java.util.Date AV14Hisprodti ;
   private java.util.Date AV13HisprodtF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Qvtabla_Allowchangeaxesorder ;
   private boolean Qvtabla_Allowselection ;
   private boolean Qvtabla_Visible ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV24MostrarResultados ;
   private String AV175TipoQuery ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucQvtabla ;
   private HTMLChoice cmbavTipoquery ;
   private HTMLChoice cmbavQueryviewercharttype ;
   private GXBaseCollection<app.SdtSDTResumenGrupoOperario> AV5SDTResumenGrupoOperarioCollection ;
   private GXBaseCollection<app.SdtSDTResumenGrupoOperario> GXt_objcol_SdtSDTResumenGrupoOperario9 ;
   private GXBaseCollection<app.SdtSDTResumenGrupoOperario> GXv_objcol_SdtSDTResumenGrupoOperario10[] ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV10Elements ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV27Parameters ;
   private GXBaseCollection<app.SdtSDTMaquinas> AV30SdtMaquinasCollection ;
   private GXBaseCollection<app.SdtSDTMaquinas> GXt_objcol_SdtSDTMaquinas5 ;
   private GXBaseCollection<app.SdtSDTMaquinas> GXv_objcol_SdtSDTMaquinas6[] ;
   private GXBaseCollection<app.SdtSDTResumenTipoArticulo> AV32SDTResumenTipoArticuloCollection ;
   private GXBaseCollection<app.SdtSDTResumenTipoArticulo> GXt_objcol_SdtSDTResumenTipoArticulo7 ;
   private GXBaseCollection<app.SdtSDTResumenTipoArticulo> GXv_objcol_SdtSDTResumenTipoArticulo8[] ;
   private GXBaseCollection<app.SdtSDTResumenTipoColorante> AV33SDTResumenTipoColoranteCollection ;
   private GXBaseCollection<app.SdtSDTResumenTipoColorante> GXt_objcol_SdtSDTResumenTipoColorante11 ;
   private GXBaseCollection<app.SdtSDTResumenTipoColorante> GXv_objcol_SdtSDTResumenTipoColorante12[] ;
   private app.SdtQueryViewerDragAndDropData AV8DragAndDropData ;
   private app.SdtQueryViewerFilterChangedData AV12FilterChangedData ;
   private app.SdtQueryViewerItemClickData AV16ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV17ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV18ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV19ItemExpandData ;
}

