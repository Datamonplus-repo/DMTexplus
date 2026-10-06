package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcprogramarhdrdrop_impl extends GXWebComponent
{
   public wcprogramarhdrdrop_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcprogramarhdrdrop_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcprogramarhdrdrop_impl.class ));
   }

   public wcprogramarhdrdrop_impl( int remoteHandle ,
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
      chkBarAgrEst = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix});
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
               gxfirstwebparm = httpContext.GetNextPar( ) ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetNextPar( ) ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmaquina") == 0 )
            {
               gxnrgridmaquina_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmaquina") == 0 )
            {
               gxgrgridmaquina_refresh_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhdr") == 0 )
            {
               gxnrgridhdr_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridhdr") == 0 )
            {
               gxgrgridhdr_refresh_invoke( ) ;
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

   public void gxnrgridmaquina_newrow_invoke( )
   {
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmaquina_newrow( ) ;
      /* End function gxnrGridmaquina_newrow_invoke */
   }

   public void gxgrgridmaquina_refresh_invoke( )
   {
      subGridmaquina_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmaquina_Rows"))) ;
      subGridhdr_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridhdr_Rows"))) ;
      AV48BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
      AV49BarcodreoIn = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIn"))) ;
      AV50BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
      AV51BarEnccliIn = httpContext.GetPar( "BarEnccliIn") ;
      AV52BarColNomIn = httpContext.GetPar( "BarColNomIn") ;
      AV46FiltroCliCod = (int)(GXutil.lval( httpContext.GetPar( "FiltroCliCod"))) ;
      AV45DesdeBarFecFPr = localUtil.parseDateParm( httpContext.GetPar( "DesdeBarFecFPr")) ;
      AV47HastaBarFecFPr = localUtil.parseDateParm( httpContext.GetPar( "HastaBarFecFPr")) ;
      AV10EmprCod = httpContext.GetPar( "EmprCod") ;
      AV13PrefijoMaqCod = httpContext.GetPar( "PrefijoMaqCod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmaquina_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV13PrefijoMaqCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmaquina_refresh_invoke */
   }

   public void gxnrgridhdr_newrow_invoke( )
   {
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridhdr_newrow( ) ;
      /* End function gxnrGridhdr_newrow_invoke */
   }

   public void gxgrgridhdr_refresh_invoke( )
   {
      subGridmaquina_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridmaquina_Rows"))) ;
      subGridhdr_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridhdr_Rows"))) ;
      AV48BarcodIN = (int)(GXutil.lval( httpContext.GetPar( "BarcodIN"))) ;
      AV49BarcodreoIn = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIn"))) ;
      AV50BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
      AV51BarEnccliIn = httpContext.GetPar( "BarEnccliIn") ;
      AV52BarColNomIn = httpContext.GetPar( "BarColNomIn") ;
      AV46FiltroCliCod = (int)(GXutil.lval( httpContext.GetPar( "FiltroCliCod"))) ;
      AV45DesdeBarFecFPr = localUtil.parseDateParm( httpContext.GetPar( "DesdeBarFecFPr")) ;
      AV47HastaBarFecFPr = localUtil.parseDateParm( httpContext.GetPar( "HastaBarFecFPr")) ;
      AV10EmprCod = httpContext.GetPar( "EmprCod") ;
      AV29BarOrdlin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdlin"))) ;
      AV31BarFasEstSig = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEstSig"))) ;
      AV30EstadoFaseHdr = (byte)(GXutil.lval( httpContext.GetPar( "EstadoFaseHdr"))) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV5BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV6BArCodPar = httpContext.GetPar( "BArCodPar") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridhdr_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV29BarOrdlin, AV31BarFasEstSig, AV30EstadoFaseHdr, A194BarOrdLin, AV5BarCod, AV7BarCodReo, AV6BArCodPar, A153BarFasEst, A150BarFacTin, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridhdr_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paMY2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProgramar Hdr Drop", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcprogramarhdrdrop", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCODIN", GXutil.ltrim( localUtil.ntoc( AV48BarcodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCODREOIN", GXutil.ltrim( localUtil.ntoc( AV49BarcodreoIn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCODPARIN", GXutil.rtrim( AV50BarcodparIN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARENCCLIIN", GXutil.rtrim( AV51BarEnccliIn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vBARCOLNOMIN", GXutil.rtrim( AV52BarColNomIn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTROCLICOD", GXutil.ltrim( localUtil.ntoc( AV46FiltroCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vDESDEBARFECFPR", localUtil.format(AV45DesdeBarFecFPr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vHASTABARFECFPR", localUtil.format(AV47HastaBarFecFPr, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_65, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_73, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vAPLICARMAQCDSC", AV22AplicarMaqCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vAPLICARMAQCOD", GXutil.rtrim( AV8AplicarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV41UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV16Station));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vOBJETO", AV44Objeto);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vOBJETO", AV44Objeto);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV6BArCodPar));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vPROCESAR", AV14Procesar);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEVENTMAQCOD", GXutil.rtrim( AV12EventMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vREFRESCAR", AV43Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vOBJETOREFRESCAR", AV42ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vOBJETOREFRESCAR", AV42ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPREFIJOMAQCOD", GXutil.rtrim( AV13PrefijoMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TEXTOPROCESAMIENTO_Caption", GXutil.rtrim( lblTextoprocesamiento_Caption));
   }

   public void renderHtmlCloseFormMY2( )
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
      return "WCProgramarHdrDrop" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProgramar Hdr Drop", "") ;
   }

   public void wbMY0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcprogramarhdrdrop");
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", divMaintable_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable1_Internalname, 1, 0, "px", 0, "px", "FreeStyleGridCell", "left", "top", "", "", "div");
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
         wb_table1_12_MY2( true) ;
      }
      else
      {
         wb_table1_12_MY2( false) ;
      }
      return  ;
   }

   public void wb_table1_12_MY2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table2_20_MY2( true) ;
      }
      else
      {
         wb_table2_20_MY2( false) ;
      }
      return  ;
   }

   public void wb_table2_20_MY2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
      if ( wbEnd == 65 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridmaquinaContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridmaquinaContainer.AddObjectProperty("GRIDMAQUINA_nEOF", GRIDMAQUINA_nEOF);
               GridmaquinaContainer.AddObjectProperty("GRIDMAQUINA_nFirstRecordOnPage", GRIDMAQUINA_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridmaquinaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmaquina", GridmaquinaContainer, subGridmaquina_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinaContainerData", GridmaquinaContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinaContainerData"+"V", GridmaquinaContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridmaquinaContainerData"+"V"+"\" value='"+GridmaquinaContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 73 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridhdrContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridhdrContainer.AddObjectProperty("GRIDHDR_nEOF", GRIDHDR_nEOF);
               GridhdrContainer.AddObjectProperty("GRIDHDR_nFirstRecordOnPage", GRIDHDR_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridhdrContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridhdr", GridhdrContainer, subGridhdr_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrContainerData", GridhdrContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrContainerData"+"V", GridhdrContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridhdrContainerData"+"V"+"\" value='"+GridhdrContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startMY2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProgramar Hdr Drop", ""), (short)(0)) ;
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
            strupMY0( ) ;
         }
      }
   }

   public void wsMY2( )
   {
      startMY2( ) ;
      evtMY2( ) ;
   }

   public void evtMY2( )
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
                              strupMY0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.MAQUINAASIGNARHDR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11MY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12MY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavBarcodin_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "TEXTOPROCESAMIENTO.DROP") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13MY2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDMAQUINAPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDMAQUINAPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridmaquina_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridmaquina_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridmaquina_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridmaquina_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDHDRPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDHDRPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridhdr_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridhdr_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridhdr_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridhdr_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "GRIDMAQUINA.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "GRIDMAQUINA.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           nGXsfl_65_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_652( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A13734MaqCDsc = httpContext.cgiGet( edtMaqCDsc_Internalname) ;
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
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e14MY2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMAQUINA.REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e15MY2 ();
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
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e16MY2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMAQUINA.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e17MY2 ();
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
                                          /* Set Refresh If Barcodin Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV48BarcodIN )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcodreoin Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCODREOIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV49BarcodreoIn )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcodparin Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCODPARIN"), AV50BarcodparIN) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barenccliin Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARENCCLIIN"), AV51BarEnccliIn) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Barcolnomin Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCOLNOMIN"), AV52BarColNomIn) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Filtroclicod Changed */
                                          if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vFILTROCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV46FiltroCliCod )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Desdebarfecfpr Changed */
                                          if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( sPrefix+"GXH_vDESDEBARFECFPR"), 0), AV45DesdeBarFecFPr) ) )
                                          {
                                             Rfr0gs = true ;
                                          }
                                          /* Set Refresh If Hastabarfecfpr Changed */
                                          if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( sPrefix+"GXH_vHASTABARFECFPR"), 0), AV47HastaBarFecFPr) ) )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strupMY0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "TEXTOPROCESAMIENTO.DROP") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e13MY2 ();
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 23), "TEXTOPROCESAMIENTO.DROP") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "GRIDHDR.LOAD") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupMY0( ) ;
                           }
                           nGXsfl_73_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_733( ) ;
                           AV37Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV37Hdr);
                           A120BarAgrEst = ((GXutil.strcmp(httpContext.cgiGet( chkBarAgrEst.getInternalname()), "S")==0) ? "S" : "N") ;
                           AV57Op = GXutil.upper( httpContext.cgiGet( edtavOp_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp_Internalname, AV57Op);
                           AV23Maccod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Maccod), 8, 0));
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           n166BarKgm = false ;
                           A812RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtRecTotKgm_Internalname)) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV29BarOrdlin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarOrdlin), 4, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
                           AV30EstadoFaseHdr = (byte)(localUtil.ctol( httpContext.cgiGet( edtavEstadofasehdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstadofasehdr_Internalname, GXutil.str( AV30EstadoFaseHdr, 1, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTADOFASEHDR"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")));
                           AV32BarFacTingrid = httpContext.cgiGet( edtavBarfactingrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfactingrid_Internalname, AV32BarFacTingrid);
                           AV34BarFasEstgrid = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasestgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasestgrid_Internalname, GXutil.str( AV34BarFasEstgrid, 1, 0));
                           AV31BarFasEstSig = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasestsig_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasestsig_Internalname, GXutil.str( AV31BarFasEstSig, 1, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASESTSIG"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9")));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "TEXTOPROCESAMIENTO.DROP") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e13MY2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDHDR.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e18MY3 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strupMY0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "TEXTOPROCESAMIENTO.DROP") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavBarcodin_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e13MY2 ();
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

   public void weMY2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormMY2( ) ;
         }
      }
   }

   public void paMY2( )
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
            GX_FocusControl = edtavBarcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridmaquina_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_652( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         sendrow_652( ) ;
         nGXsfl_65_idx = ((subGridmaquina_Islastpage==1)&&(nGXsfl_65_idx+1>subgridmaquina_fnc_recordsperpage( )) ? 1 : nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridmaquinaContainer)) ;
      /* End function gxnrGridmaquina_newrow */
   }

   public void gxnrgridhdr_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_733( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         sendrow_733( ) ;
         nGXsfl_73_idx = ((subGridhdr_Islastpage==1)&&(nGXsfl_73_idx+1>subgridhdr_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_733( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridhdrContainer)) ;
      /* End function gxnrGridhdr_newrow */
   }

   public void gxgrgridmaquina_refresh( int subGridmaquina_Rows ,
                                        int subGridhdr_Rows ,
                                        int AV48BarcodIN ,
                                        byte AV49BarcodreoIn ,
                                        String AV50BarcodparIN ,
                                        String AV51BarEnccliIn ,
                                        String AV52BarColNomIn ,
                                        int AV46FiltroCliCod ,
                                        java.util.Date AV45DesdeBarFecFPr ,
                                        java.util.Date AV47HastaBarFecFPr ,
                                        String AV10EmprCod ,
                                        String AV13PrefijoMaqCod ,
                                        String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e16MY2 ();
      GRIDMAQUINA_nCurrentRecord = 0 ;
      rfMY2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridmaquina_refresh */
   }

   public void gxgrgridhdr_refresh( int subGridmaquina_Rows ,
                                    int subGridhdr_Rows ,
                                    int AV48BarcodIN ,
                                    byte AV49BarcodreoIn ,
                                    String AV50BarcodparIN ,
                                    String AV51BarEnccliIn ,
                                    String AV52BarColNomIn ,
                                    int AV46FiltroCliCod ,
                                    java.util.Date AV45DesdeBarFecFPr ,
                                    java.util.Date AV47HastaBarFecFPr ,
                                    String AV10EmprCod ,
                                    short AV29BarOrdlin ,
                                    byte AV31BarFasEstSig ,
                                    byte AV30EstadoFaseHdr ,
                                    short A194BarOrdLin ,
                                    int AV5BarCod ,
                                    byte AV7BarCodReo ,
                                    String AV6BArCodPar ,
                                    byte A153BarFasEst ,
                                    String A150BarFacTin ,
                                    String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e16MY2 ();
      GRIDHDR_nCurrentRecord = 0 ;
      rfMY3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridhdr_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MAQCDSC", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13734MaqCDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCDSC", A13734MaqCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV29BarOrdlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASESTSIG", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFASESTSIG", GXutil.ltrim( localUtil.ntoc( AV31BarFasEstSig, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTADOFASEHDR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vESTADOFASEHDR", GXutil.ltrim( localUtil.ntoc( AV30EstadoFaseHdr, (byte)(1), (byte)(0), ".", "")));
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
      /* Execute user event: Refresh */
      e16MY2 ();
      rfMY2( ) ;
      rfMY3( ) ;
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
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOp_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavEstadofasehdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEstadofasehdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEstadofasehdr_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarfactingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfactingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfactingrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarfasestgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasestgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasestgrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarfasestsig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasestsig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasestsig_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public int subgridmaquinaclient_rec_count_fnc( )
   {
      GRIDMAQUINA_nRecordCount = 0 ;
      lV13PrefijoMaqCod = GXutil.padr( GXutil.rtrim( AV13PrefijoMaqCod), 6, "%") ;
      /* Using cursor H00MY2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, lV13PrefijoMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A620MaqTip = H00MY2_A620MaqTip[0] ;
         n620MaqTip = H00MY2_n620MaqTip[0] ;
         A6432MaqPln = H00MY2_A6432MaqPln[0] ;
         n6432MaqPln = H00MY2_n6432MaqPln[0] ;
         A607MaqEst = H00MY2_A607MaqEst[0] ;
         n607MaqEst = H00MY2_n607MaqEst[0] ;
         A396EmprCod = H00MY2_A396EmprCod[0] ;
         A606MaqDsc = H00MY2_A606MaqDsc[0] ;
         n606MaqDsc = H00MY2_n606MaqDsc[0] ;
         A602MaqCod = H00MY2_A602MaqCod[0] ;
         if ( ! new app.maquinaconhdr(remoteHandle, context).executeUdp( A396EmprCod, A602MaqCod) )
         {
            A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
            GRIDMAQUINA_nRecordCount = (long)(GRIDMAQUINA_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRIDMAQUINA_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRIDMAQUINA_nRecordCount) ;
   }

   public void rfMY2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridmaquinaContainer.ClearRows();
      }
      wbStart = (short)(65) ;
      e15MY2 ();
      nGXsfl_65_idx = 1 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_652( ) ;
      bGXsfl_65_Refreshing = true ;
      GridmaquinaContainer.AddObjectProperty("GridName", "Gridmaquina");
      GridmaquinaContainer.AddObjectProperty("CmpContext", sPrefix);
      GridmaquinaContainer.AddObjectProperty("InMasterPage", "false");
      GridmaquinaContainer.AddObjectProperty("Class", "GridWithPaginationBar GridWithBorderColor WorkWith");
      GridmaquinaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridmaquinaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridmaquinaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridmaquinaContainer.setPageSize( subgridmaquina_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_652( ) ;
         lV13PrefijoMaqCod = GXutil.padr( GXutil.rtrim( AV13PrefijoMaqCod), 6, "%") ;
         /* Using cursor H00MY3 */
         pr_default.execute(1, new Object[] {AV10EmprCod, lV13PrefijoMaqCod});
         nGXsfl_65_idx = 1 ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
         GRIDMAQUINA_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( 5 == 0 ) || ( GRIDMAQUINA_nCurrentRecord < GRIDMAQUINA_nFirstRecordOnPage + subgridmaquina_fnc_recordsperpage( ) ) ) ) )
         {
            A620MaqTip = H00MY3_A620MaqTip[0] ;
            n620MaqTip = H00MY3_n620MaqTip[0] ;
            A6432MaqPln = H00MY3_A6432MaqPln[0] ;
            n6432MaqPln = H00MY3_n6432MaqPln[0] ;
            A607MaqEst = H00MY3_A607MaqEst[0] ;
            n607MaqEst = H00MY3_n607MaqEst[0] ;
            A396EmprCod = H00MY3_A396EmprCod[0] ;
            A606MaqDsc = H00MY3_A606MaqDsc[0] ;
            n606MaqDsc = H00MY3_n606MaqDsc[0] ;
            A602MaqCod = H00MY3_A602MaqCod[0] ;
            if ( ! new app.maquinaconhdr(remoteHandle, context).executeUdp( A396EmprCod, A602MaqCod) )
            {
               A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
               e17MY2 ();
            }
            pr_default.readNext(1);
         }
         GRIDMAQUINA_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(65) ;
         wbMY0( ) ;
      }
      bGXsfl_65_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesMY2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MAQCOD"+"_"+sGXsfl_65_idx, getSecureSignedToken( sPrefix+sGXsfl_65_idx, GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_MAQCDSC"+"_"+sGXsfl_65_idx, getSecureSignedToken( sPrefix+sGXsfl_65_idx, GXutil.rtrim( localUtil.format( A13734MaqCDsc, ""))));
   }

   public void rfMY3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhdrContainer.ClearRows();
      }
      wbStart = (short)(73) ;
      nGXsfl_73_idx = 1 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_733( ) ;
      bGXsfl_73_Refreshing = true ;
      GridhdrContainer.AddObjectProperty("GridName", "Gridhdr");
      GridhdrContainer.AddObjectProperty("CmpContext", sPrefix);
      GridhdrContainer.AddObjectProperty("InMasterPage", "false");
      GridhdrContainer.AddObjectProperty("Class", "GridWithPaginationBar GridWithBorderColor WorkWith");
      GridhdrContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridhdrContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridhdrContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdr_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhdrContainer.setPageSize( subgridhdr_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_733( ) ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              Integer.valueOf(AV46FiltroCliCod) ,
                                              AV47HastaBarFecFPr ,
                                              AV45DesdeBarFecFPr ,
                                              Integer.valueOf(A252CliCod) ,
                                              A159BarFecGen ,
                                              Byte.valueOf(A213BarSit) ,
                                              A180BarMaqCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV48BarcodIN) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV49BarcodreoIn) ,
                                              A130BarCodPar ,
                                              AV50BarcodparIN ,
                                              A4812BarEncCli ,
                                              AV51BarEnccliIn ,
                                              A135BarColNom ,
                                              AV52BarColNomIn ,
                                              AV10EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV51BarEnccliIn = GXutil.padr( GXutil.rtrim( AV51BarEnccliIn), 20, "%") ;
         lV52BarColNomIn = GXutil.padr( GXutil.rtrim( AV52BarColNomIn), 13, "%") ;
         /* Using cursor H00MY6 */
         pr_default.execute(2, new Object[] {AV10EmprCod, AV45DesdeBarFecFPr, Integer.valueOf(AV48BarcodIN), Integer.valueOf(AV48BarcodIN), Byte.valueOf(AV49BarcodreoIn), Byte.valueOf(AV49BarcodreoIn), AV50BarcodparIN, AV50BarcodparIN, lV51BarEnccliIn, AV51BarEnccliIn, lV52BarColNomIn, AV52BarColNomIn, Integer.valueOf(AV46FiltroCliCod), AV47HastaBarFecFPr});
         nGXsfl_73_idx = 1 ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_733( ) ;
         GRIDHDR_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( 5 == 0 ) || ( GRIDHDR_nCurrentRecord < GRIDHDR_nFirstRecordOnPage + subgridhdr_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00MY6_A396EmprCod[0] ;
            A4812BarEncCli = H00MY6_A4812BarEncCli[0] ;
            A252CliCod = H00MY6_A252CliCod[0] ;
            n252CliCod = H00MY6_n252CliCod[0] ;
            A180BarMaqCod = H00MY6_A180BarMaqCod[0] ;
            A130BarCodPar = H00MY6_A130BarCodPar[0] ;
            A132BarCodReo = H00MY6_A132BarCodReo[0] ;
            A129BarCod = H00MY6_A129BarCod[0] ;
            A213BarSit = H00MY6_A213BarSit[0] ;
            A158BarFecFpr = H00MY6_A158BarFecFpr[0] ;
            A159BarFecGen = H00MY6_A159BarFecGen[0] ;
            A1234BarNomCli = H00MY6_A1234BarNomCli[0] ;
            A135BarColNom = H00MY6_A135BarColNom[0] ;
            A1652BarSerDsc = H00MY6_A1652BarSerDsc[0] ;
            A212BarSer = H00MY6_A212BarSer[0] ;
            A279CliNom = H00MY6_A279CliNom[0] ;
            A120BarAgrEst = H00MY6_A120BarAgrEst[0] ;
            A166BarKgm = H00MY6_A166BarKgm[0] ;
            n166BarKgm = H00MY6_n166BarKgm[0] ;
            A219BarTotAgr = H00MY6_A219BarTotAgr[0] ;
            n219BarTotAgr = H00MY6_n219BarTotAgr[0] ;
            A279CliNom = H00MY6_A279CliNom[0] ;
            A219BarTotAgr = H00MY6_A219BarTotAgr[0] ;
            n219BarTotAgr = H00MY6_n219BarTotAgr[0] ;
            A166BarKgm = H00MY6_A166BarKgm[0] ;
            n166BarKgm = H00MY6_n166BarKgm[0] ;
            if ( A219BarTotAgr.doubleValue() != 0 )
            {
               A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            }
            else
            {
               A812RecTotKgm = A166BarKgm ;
            }
            e18MY3 ();
            pr_default.readNext(2);
         }
         GRIDHDR_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(2);
         wbEnd = (short)(73) ;
         wbMY0( ) ;
      }
      bGXsfl_73_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesMY3( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASESTSIG"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTADOFASEHDR"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")));
   }

   public int subgridmaquina_fnc_pagecount( )
   {
      GRIDMAQUINA_nRecordCount = subgridmaquina_fnc_recordcount( ) ;
      if ( ((int)((GRIDMAQUINA_nRecordCount) % (subgridmaquina_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDMAQUINA_nRecordCount/ (double) (subgridmaquina_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDMAQUINA_nRecordCount/ (double) (subgridmaquina_fnc_recordsperpage( )))+1) ;
   }

   public int subgridmaquina_fnc_recordcount( )
   {
      return (int)(subgridmaquinaclient_rec_count_fnc()) ;
   }

   public int subgridmaquina_fnc_recordsperpage( )
   {
      return 5*1 ;
   }

   public int subgridmaquina_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDMAQUINA_nFirstRecordOnPage/ (double) (subgridmaquina_fnc_recordsperpage( )))+1) ;
   }

   public short subgridmaquina_firstpage( )
   {
      GRIDMAQUINA_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmaquina_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV13PrefijoMaqCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmaquina_nextpage( )
   {
      if ( GRIDMAQUINA_nEOF == 0 )
      {
         GRIDMAQUINA_nFirstRecordOnPage = (long)(GRIDMAQUINA_nFirstRecordOnPage+subgridmaquina_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridmaquinaContainer.AddObjectProperty("GRIDMAQUINA_nFirstRecordOnPage", GRIDMAQUINA_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmaquina_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV13PrefijoMaqCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDMAQUINA_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridmaquina_previouspage( )
   {
      if ( GRIDMAQUINA_nFirstRecordOnPage >= subgridmaquina_fnc_recordsperpage( ) )
      {
         GRIDMAQUINA_nFirstRecordOnPage = (long)(GRIDMAQUINA_nFirstRecordOnPage-subgridmaquina_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmaquina_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV13PrefijoMaqCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridmaquina_lastpage( )
   {
      GRIDMAQUINA_nRecordCount = subgridmaquina_fnc_recordcount( ) ;
      if ( GRIDMAQUINA_nRecordCount > subgridmaquina_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDMAQUINA_nRecordCount) % (subgridmaquina_fnc_recordsperpage( )))) == 0 )
         {
            GRIDMAQUINA_nFirstRecordOnPage = (long)(GRIDMAQUINA_nRecordCount-subgridmaquina_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDMAQUINA_nFirstRecordOnPage = (long)(GRIDMAQUINA_nRecordCount-((int)((GRIDMAQUINA_nRecordCount) % (subgridmaquina_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDMAQUINA_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmaquina_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV13PrefijoMaqCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridmaquina_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDMAQUINA_nFirstRecordOnPage = (long)(subgridmaquina_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDMAQUINA_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridmaquina_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV13PrefijoMaqCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgridhdr_fnc_pagecount( )
   {
      GRIDHDR_nRecordCount = subgridhdr_fnc_recordcount( ) ;
      if ( ((int)((GRIDHDR_nRecordCount) % (subgridhdr_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDHDR_nRecordCount/ (double) (subgridhdr_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDHDR_nRecordCount/ (double) (subgridhdr_fnc_recordsperpage( )))+1) ;
   }

   public int subgridhdr_fnc_recordcount( )
   {
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV46FiltroCliCod) ,
                                           AV47HastaBarFecFPr ,
                                           AV45DesdeBarFecFPr ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           A180BarMaqCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV48BarcodIN) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV49BarcodreoIn) ,
                                           A130BarCodPar ,
                                           AV50BarcodparIN ,
                                           A4812BarEncCli ,
                                           AV51BarEnccliIn ,
                                           A135BarColNom ,
                                           AV52BarColNomIn ,
                                           AV10EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV51BarEnccliIn = GXutil.padr( GXutil.rtrim( AV51BarEnccliIn), 20, "%") ;
      lV52BarColNomIn = GXutil.padr( GXutil.rtrim( AV52BarColNomIn), 13, "%") ;
      /* Using cursor H00MY9 */
      pr_default.execute(3, new Object[] {AV10EmprCod, AV45DesdeBarFecFPr, Integer.valueOf(AV48BarcodIN), Integer.valueOf(AV48BarcodIN), Byte.valueOf(AV49BarcodreoIn), Byte.valueOf(AV49BarcodreoIn), AV50BarcodparIN, AV50BarcodparIN, lV51BarEnccliIn, AV51BarEnccliIn, lV52BarColNomIn, AV52BarColNomIn, Integer.valueOf(AV46FiltroCliCod), AV47HastaBarFecFPr});
      GRIDHDR_nRecordCount = H00MY9_AGRIDHDR_nRecordCount[0] ;
      pr_default.close(3);
      return (int)(GRIDHDR_nRecordCount) ;
   }

   public int subgridhdr_fnc_recordsperpage( )
   {
      return 5*1 ;
   }

   public int subgridhdr_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDHDR_nFirstRecordOnPage/ (double) (subgridhdr_fnc_recordsperpage( )))+1) ;
   }

   public short subgridhdr_firstpage( )
   {
      GRIDHDR_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdr_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV29BarOrdlin, AV31BarFasEstSig, AV30EstadoFaseHdr, A194BarOrdLin, AV5BarCod, AV7BarCodReo, AV6BArCodPar, A153BarFasEst, A150BarFacTin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridhdr_nextpage( )
   {
      GRIDHDR_nRecordCount = subgridhdr_fnc_recordcount( ) ;
      if ( ( GRIDHDR_nRecordCount >= subgridhdr_fnc_recordsperpage( ) ) && ( GRIDHDR_nEOF == 0 ) )
      {
         GRIDHDR_nFirstRecordOnPage = (long)(GRIDHDR_nFirstRecordOnPage+subgridhdr_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridhdrContainer.AddObjectProperty("GRIDHDR_nFirstRecordOnPage", GRIDHDR_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdr_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV29BarOrdlin, AV31BarFasEstSig, AV30EstadoFaseHdr, A194BarOrdLin, AV5BarCod, AV7BarCodReo, AV6BArCodPar, A153BarFasEst, A150BarFacTin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDHDR_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridhdr_previouspage( )
   {
      if ( GRIDHDR_nFirstRecordOnPage >= subgridhdr_fnc_recordsperpage( ) )
      {
         GRIDHDR_nFirstRecordOnPage = (long)(GRIDHDR_nFirstRecordOnPage-subgridhdr_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdr_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV29BarOrdlin, AV31BarFasEstSig, AV30EstadoFaseHdr, A194BarOrdLin, AV5BarCod, AV7BarCodReo, AV6BArCodPar, A153BarFasEst, A150BarFacTin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridhdr_lastpage( )
   {
      GRIDHDR_nRecordCount = subgridhdr_fnc_recordcount( ) ;
      if ( GRIDHDR_nRecordCount > subgridhdr_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDHDR_nRecordCount) % (subgridhdr_fnc_recordsperpage( )))) == 0 )
         {
            GRIDHDR_nFirstRecordOnPage = (long)(GRIDHDR_nRecordCount-subgridhdr_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDHDR_nFirstRecordOnPage = (long)(GRIDHDR_nRecordCount-((int)((GRIDHDR_nRecordCount) % (subgridhdr_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDHDR_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdr_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV29BarOrdlin, AV31BarFasEstSig, AV30EstadoFaseHdr, A194BarOrdLin, AV5BarCod, AV7BarCodReo, AV6BArCodPar, A153BarFasEst, A150BarFacTin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridhdr_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDHDR_nFirstRecordOnPage = (long)(subgridhdr_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDHDR_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDR_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDR_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdr_refresh( subGridmaquina_Rows, subGridhdr_Rows, AV48BarcodIN, AV49BarcodreoIn, AV50BarcodparIN, AV51BarEnccliIn, AV52BarColNomIn, AV46FiltroCliCod, AV45DesdeBarFecFPr, AV47HastaBarFecFPr, AV10EmprCod, AV29BarOrdlin, AV31BarFasEstSig, AV30EstadoFaseHdr, A194BarOrdLin, AV5BarCod, AV7BarCodReo, AV6BArCodPar, A153BarFasEst, A150BarFacTin, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOp_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavMaccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaccod_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarordlin_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavEstadofasehdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEstadofasehdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEstadofasehdr_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarfactingrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfactingrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfactingrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarfasestgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasestgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasestgrid_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      edtavBarfasestsig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasestsig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasestsig_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupMY0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e14MY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         AV22AplicarMaqCDsc = httpContext.cgiGet( sPrefix+"vAPLICARMAQCDSC") ;
         AV8AplicarMaqCod = httpContext.cgiGet( sPrefix+"vAPLICARMAQCOD") ;
         GRIDMAQUINA_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMAQUINA_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDHDR_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDHDR_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDMAQUINA_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDMAQUINA_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDHDR_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDHDR_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         lblTextoprocesamiento_Caption = httpContext.cgiGet( sPrefix+"TEXTOPROCESAMIENTO_Caption") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODIN");
            GX_FocusControl = edtavBarcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48BarcodIN = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarcodIN), 8, 0));
         }
         else
         {
            AV48BarcodIN = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48BarcodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48BarcodIN), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOIN");
            GX_FocusControl = edtavBarcodreoin_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49BarcodreoIn = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarcodreoIn", GXutil.str( AV49BarcodreoIn, 1, 0));
         }
         else
         {
            AV49BarcodreoIn = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49BarcodreoIn", GXutil.str( AV49BarcodreoIn, 1, 0));
         }
         AV50BarcodparIN = httpContext.cgiGet( edtavBarcodparin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50BarcodparIN", AV50BarcodparIN);
         AV51BarEnccliIn = httpContext.cgiGet( edtavBarenccliin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51BarEnccliIn", AV51BarEnccliIn);
         AV52BarColNomIn = httpContext.cgiGet( edtavBarcolnomin_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52BarColNomIn", AV52BarColNomIn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFiltroclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFiltroclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFILTROCLICOD");
            GX_FocusControl = edtavFiltroclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46FiltroCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46FiltroCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46FiltroCliCod), 6, 0));
         }
         else
         {
            AV46FiltroCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavFiltroclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46FiltroCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46FiltroCliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDesdebarfecfpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDESDEBARFECFPR");
            GX_FocusControl = edtavDesdebarfecfpr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45DesdeBarFecFPr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45DesdeBarFecFPr", localUtil.format(AV45DesdeBarFecFPr, "99/99/99"));
         }
         else
         {
            AV45DesdeBarFecFPr = localUtil.ctod( httpContext.cgiGet( edtavDesdebarfecfpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45DesdeBarFecFPr", localUtil.format(AV45DesdeBarFecFPr, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHastabarfecfpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHASTABARFECFPR");
            GX_FocusControl = edtavHastabarfecfpr_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47HastaBarFecFPr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47HastaBarFecFPr", localUtil.format(AV47HastaBarFecFPr, "99/99/99"));
         }
         else
         {
            AV47HastaBarFecFPr = localUtil.ctod( httpContext.cgiGet( edtavHastabarfecfpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47HastaBarFecFPr", localUtil.format(AV47HastaBarFecFPr, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_65_idx = (int)(localUtil.cton( httpContext.cgiGet( subGridmaquina_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
         if ( nGXsfl_65_idx > 0 )
         {
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            A13734MaqCDsc = httpContext.cgiGet( edtMaqCDsc_Internalname) ;
         }
         nGXsfl_73_idx = (int)(localUtil.cton( httpContext.cgiGet( subGridhdr_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_733( ) ;
         if ( nGXsfl_73_idx > 0 )
         {
            AV37Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV37Hdr);
            A120BarAgrEst = ((GXutil.strcmp(httpContext.cgiGet( chkBarAgrEst.getInternalname()), "S")==0) ? "S" : "N") ;
            AV57Op = GXutil.upper( httpContext.cgiGet( edtavOp_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp_Internalname, AV57Op);
            AV23Maccod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Maccod), 8, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            n166BarKgm = false ;
            A812RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtRecTotKgm_Internalname)) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A158BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtBarFecFpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29BarOrdlin = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarOrdlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
            AV30EstadoFaseHdr = (byte)(localUtil.ctol( httpContext.cgiGet( edtavEstadofasehdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstadofasehdr_Internalname, GXutil.str( AV30EstadoFaseHdr, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTADOFASEHDR"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")));
            AV32BarFacTingrid = httpContext.cgiGet( edtavBarfactingrid_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfactingrid_Internalname, AV32BarFacTingrid);
            AV34BarFasEstgrid = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasestgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasestgrid_Internalname, GXutil.str( AV34BarFasEstgrid, 1, 0));
            AV31BarFasEstSig = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarfasestsig_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasestsig_Internalname, GXutil.str( AV31BarFasEstSig, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASESTSIG"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9")));
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCODIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV48BarcodIN )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vBARCODREOIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV49BarcodreoIn )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCODPARIN"), AV50BarcodparIN) != 0 )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARENCCLIIN"), AV51BarEnccliIn) != 0 )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vBARCOLNOMIN"), AV52BarColNomIn) != 0 )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( sPrefix+"GXH_vFILTROCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV46FiltroCliCod )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( sPrefix+"GXH_vDESDEBARFECFPR"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV45DesdeBarFecFPr)) ) )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( sPrefix+"GXH_vHASTABARFECFPR"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV47HastaBarFecFPr)) ) )
         {
            GRIDHDR_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e14MY2 ();
      if (returnInSub) return;
   }

   public void e14MY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV47HastaBarFecFPr = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47HastaBarFecFPr", localUtil.format(AV47HastaBarFecFPr, "99/99/99"));
      AV45DesdeBarFecFPr = GXutil.dadd( AV47HastaBarFecFPr, (-365)) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45DesdeBarFecFPr", localUtil.format(AV45DesdeBarFecFPr, "99/99/99"));
      divMaintable_Class = "TableContent" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divMaintable_Internalname, "Class", divMaintable_Class, true);
      lblTextoprocesamiento_Caption = "<H1>Se requiere seleccionar Máquina"+"</H1>" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTextoprocesamiento_Internalname, "Caption", lblTextoprocesamiento_Caption, true);
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcprogramarhdrdrop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Station", AV16Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV17UsuCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcprogramarhdrdrop_impl.this.AV10EmprCod = GXv_char2[0] ;
      wcprogramarhdrdrop_impl.this.AV11EmprNom = GXv_char3[0] ;
      wcprogramarhdrdrop_impl.this.AV17UsuCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
      AV16Station = GXutil.substring( AV16Station, 1, 10) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Station", AV16Station);
      GXt_char1 = AV13PrefijoMaqCod ;
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = "MQPLTI" ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      wcprogramarhdrdrop_impl.this.AV10EmprCod = GXv_char4[0] ;
      wcprogramarhdrdrop_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
      AV13PrefijoMaqCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13PrefijoMaqCod", AV13PrefijoMaqCod);
      AV13PrefijoMaqCod = ((GXutil.strcmp("", AV13PrefijoMaqCod)==0) ? "TN" : AV13PrefijoMaqCod) + "%" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13PrefijoMaqCod", AV13PrefijoMaqCod);
      subGridmaquina_Allowselection = (byte)(1) ;
   }

   public void e13MY2( )
   {
      /* Textoprocesamiento_Drop Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV8AplicarMaqCod)==0) )
      {
         AV38BarcodInout = (int)(GXutil.lval( GXutil.substring( AV37Hdr, 1, 8))) ;
         AV39BarcodreoInout = (byte)(GXutil.lval( GXutil.substring( AV37Hdr, 10, 1))) ;
         AV40BarcodparInout = GXutil.substring( AV37Hdr, 11, 1) ;
         lblTextoprocesamiento_Caption = "<H1>Procesamiento para Máquina:"+AV8AplicarMaqCod+" - "+GXutil.str( AV38BarcodInout, 8, 0)+" - "+GXutil.str( AV39BarcodreoInout, 1, 0)+AV40BarcodparInout+", Generar CALL PMaqAsignar"+"</H1>" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTextoprocesamiento_Internalname, "Caption", lblTextoprocesamiento_Caption, true);
         GXv_char4[0] = AV10EmprCod ;
         GXv_int5[0] = AV38BarcodInout ;
         GXv_int6[0] = AV39BarcodreoInout ;
         GXv_char3[0] = AV40BarcodparInout ;
         GXv_char2[0] = AV8AplicarMaqCod ;
         GXv_char7[0] = AV41UsurCod ;
         GXv_char8[0] = AV16Station ;
         new app.pmaqasignar(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_char2, GXv_char7, GXv_char8) ;
         wcprogramarhdrdrop_impl.this.AV10EmprCod = GXv_char4[0] ;
         wcprogramarhdrdrop_impl.this.AV38BarcodInout = GXv_int5[0] ;
         wcprogramarhdrdrop_impl.this.AV39BarcodreoInout = GXv_int6[0] ;
         wcprogramarhdrdrop_impl.this.AV40BarcodparInout = GXv_char3[0] ;
         wcprogramarhdrdrop_impl.this.AV8AplicarMaqCod = GXv_char2[0] ;
         wcprogramarhdrdrop_impl.this.AV41UsurCod = GXv_char7[0] ;
         wcprogramarhdrdrop_impl.this.AV16Station = GXv_char8[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AplicarMaqCod", AV8AplicarMaqCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41UsurCod", AV41UsurCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16Station", AV16Station);
         AV44Objeto.add("WCProgramacionMaquinas", 0);
         this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV44Objeto,Boolean.valueOf(true)}, true);
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         lblTextoprocesamiento_Caption = "<H1>Sin Seleccionar Máquina, no se logra procesar HDR: "+GXutil.str( AV5BarCod, 8, 0)+" - "+GXutil.str( AV7BarCodReo, 1, 0)+" - "+AV6BArCodPar+"</H1>" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTextoprocesamiento_Internalname, "Caption", lblTextoprocesamiento_Caption, true);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV44Objeto", AV44Objeto);
   }

   public void S112( )
   {
      /* 'ACTUALIZAR TEXTO PROCESAMIENTO' Routine */
      returnInSub = false ;
      lblTextoprocesamiento_Caption = "<H1>Realizar procesamiento Máquina: "+AV22AplicarMaqCDsc+"</H1>" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTextoprocesamiento_Internalname, "Caption", lblTextoprocesamiento_Caption, true);
   }

   public void e15MY2( )
   {
      /* Gridmaquina_Refresh Routine */
      returnInSub = false ;
      AV8AplicarMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AplicarMaqCod", AV8AplicarMaqCod);
      AV22AplicarMaqCDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AplicarMaqCDsc", AV22AplicarMaqCDsc);
      /*  Sending Event outputs  */
   }

   public void e11MY2( )
   {
      /* GlobalEvents_Maquinaasignarhdr Routine */
      returnInSub = false ;
      if ( AV14Procesar && ! (GXutil.strcmp("", AV12EventMaqCod)==0) )
      {
         AV8AplicarMaqCod = AV12EventMaqCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AplicarMaqCod", AV8AplicarMaqCod);
         GXt_char1 = AV22AplicarMaqCDsc ;
         GXv_char8[0] = AV10EmprCod ;
         GXv_char7[0] = AV8AplicarMaqCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.pmaqdsc(remoteHandle, context).execute( GXv_char8, GXv_char7, GXv_char4) ;
         wcprogramarhdrdrop_impl.this.AV10EmprCod = GXv_char8[0] ;
         wcprogramarhdrdrop_impl.this.AV8AplicarMaqCod = GXv_char7[0] ;
         wcprogramarhdrdrop_impl.this.GXt_char1 = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AplicarMaqCod", AV8AplicarMaqCod);
         AV22AplicarMaqCDsc = GXutil.trim( AV8AplicarMaqCod) + " - " + GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AplicarMaqCDsc", AV22AplicarMaqCDsc);
         /* Execute user subroutine: 'ACTUALIZAR TEXTO PROCESAMIENTO' */
         S112 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S123( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV29BarOrdlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarOrdlin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
      AV30EstadoFaseHdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstadofasehdr_Internalname, GXutil.str( AV30EstadoFaseHdr, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTADOFASEHDR"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")));
      /* Using cursor H00MY10 */
      pr_default.execute(4, new Object[] {AV10EmprCod, Integer.valueOf(AV5BarCod), Byte.valueOf(AV7BarCodReo), AV6BArCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A150BarFacTin = H00MY10_A150BarFacTin[0] ;
         A153BarFasEst = H00MY10_A153BarFasEst[0] ;
         A130BarCodPar = H00MY10_A130BarCodPar[0] ;
         A132BarCodReo = H00MY10_A132BarCodReo[0] ;
         A129BarCod = H00MY10_A129BarCod[0] ;
         A396EmprCod = H00MY10_A396EmprCod[0] ;
         A194BarOrdLin = H00MY10_A194BarOrdLin[0] ;
         AV29BarOrdlin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarOrdlin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
         AV30EstadoFaseHdr = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEstadofasehdr_Internalname, GXutil.str( AV30EstadoFaseHdr, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vESTADOFASEHDR"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void e16MY2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV22AplicarMaqCDsc = " " ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22AplicarMaqCDsc", AV22AplicarMaqCDsc);
      AV8AplicarMaqCod = " " ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8AplicarMaqCod", AV8AplicarMaqCod);
      lblTextoprocesamiento_Caption = "<H1>Se requiere seleccionar Máquina"+"</H1>" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTextoprocesamiento_Internalname, "Caption", lblTextoprocesamiento_Caption, true);
      /*  Sending Event outputs  */
   }

   public void e12MY2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV42ObjetoRefrescar.indexof("WCProgramarHdrDrop") > 0 ) && AV43Refrescar )
      {
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
   }

   private void e17MY2( )
   {
      if ( ( subGridmaquina_Islastpage == 1 ) || ( 5 == 0 ) || ( ( GRIDMAQUINA_nCurrentRecord >= GRIDMAQUINA_nFirstRecordOnPage ) && ( GRIDMAQUINA_nCurrentRecord < GRIDMAQUINA_nFirstRecordOnPage + subgridmaquina_fnc_recordsperpage( ) ) ) )
      {
         /* Gridmaquina_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(65) ;
         }
         sendrow_652( ) ;
         GRIDMAQUINA_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGridmaquina_Islastpage == 1 ) && ( ((int)((GRIDMAQUINA_nCurrentRecord) % (subgridmaquina_fnc_recordsperpage( )))) == 0 ) )
         {
            GRIDMAQUINA_nFirstRecordOnPage = GRIDMAQUINA_nCurrentRecord ;
         }
      }
      if ( GRIDMAQUINA_nCurrentRecord >= GRIDMAQUINA_nFirstRecordOnPage + subgridmaquina_fnc_recordsperpage( ) )
      {
         GRIDMAQUINA_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINA_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDMAQUINA_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRIDMAQUINA_nCurrentRecord = (long)(GRIDMAQUINA_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_65_Refreshing )
      {
         httpContext.doAjaxLoad(65, GridmaquinaRow);
      }
   }

   private void e18MY3( )
   {
      /* Gridhdr_Load Routine */
      returnInSub = false ;
      GXv_int5[0] = AV23Maccod ;
      new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
      wcprogramarhdrdrop_impl.this.AV23Maccod = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Maccod), 8, 0));
      AV24Barcodm = A129BarCod ;
      AV25Barcodreom = A132BarCodReo ;
      AV26Barcodparm = A130BarCodPar ;
      AV57Op = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp_Internalname, AV57Op);
      if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV24Barcodm, AV25Barcodreom, AV26Barcodparm) ;
         if ( ( A129BarCod == AV24Barcodm ) && ( A132BarCodReo == AV25Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV26Barcodparm) == 0 ) )
         {
            AV57Op = "*" ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp_Internalname, AV57Op);
         }
      }
      else
      {
         AV57Op = "*" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavOp_Internalname, AV57Op);
      }
      AV5BarCod = A129BarCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      AV7BarCodReo = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV6BArCodPar = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BArCodPar", AV6BArCodPar);
      /* Execute user subroutine: 'BARFAS' */
      S123 ();
      if (returnInSub) return;
      GXv_char8[0] = A396EmprCod ;
      GXv_int5[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char7[0] = A130BarCodPar ;
      GXv_int9[0] = AV34BarFasEstgrid ;
      GXv_date10[0] = AV33fecha ;
      GXv_char4[0] = " " ;
      GXv_char3[0] = AV32BarFacTingrid ;
      new app.ptintefase(remoteHandle, context).execute( GXv_char8, GXv_int5, GXv_int6, GXv_char7, GXv_int9, GXv_date10, GXv_char4, GXv_char3) ;
      wcprogramarhdrdrop_impl.this.A396EmprCod = GXv_char8[0] ;
      wcprogramarhdrdrop_impl.this.A129BarCod = GXv_int5[0] ;
      wcprogramarhdrdrop_impl.this.A132BarCodReo = GXv_int6[0] ;
      wcprogramarhdrdrop_impl.this.A130BarCodPar = GXv_char7[0] ;
      wcprogramarhdrdrop_impl.this.AV34BarFasEstgrid = GXv_int9[0] ;
      wcprogramarhdrdrop_impl.this.AV33fecha = GXv_date10[0] ;
      wcprogramarhdrdrop_impl.this.AV32BarFacTingrid = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasestgrid_Internalname, GXutil.str( AV34BarFasEstgrid, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfactingrid_Internalname, AV32BarFacTingrid);
      GXv_char8[0] = AV10EmprCod ;
      GXv_int5[0] = AV5BarCod ;
      GXv_int9[0] = AV7BarCodReo ;
      GXv_char7[0] = AV6BArCodPar ;
      GXv_int11[0] = AV29BarOrdlin ;
      GXv_char4[0] = " " ;
      GXv_int6[0] = (byte)(0) ;
      GXv_char3[0] = " " ;
      GXv_int12[0] = (short)(0) ;
      GXv_char2[0] = " " ;
      GXv_int13[0] = AV31BarFasEstSig ;
      GXv_char14[0] = " " ;
      GXv_int15[0] = (short)(0) ;
      new app.pprc39(remoteHandle, context).execute( GXv_char8, GXv_int5, GXv_int9, GXv_char7, GXv_int11, GXv_char4, GXv_int6, GXv_char3, GXv_int12, GXv_char2, GXv_int13, GXv_char14, GXv_int15) ;
      wcprogramarhdrdrop_impl.this.AV10EmprCod = GXv_char8[0] ;
      wcprogramarhdrdrop_impl.this.AV5BarCod = GXv_int5[0] ;
      wcprogramarhdrdrop_impl.this.AV7BarCodReo = GXv_int9[0] ;
      wcprogramarhdrdrop_impl.this.AV6BArCodPar = GXv_char7[0] ;
      wcprogramarhdrdrop_impl.this.AV29BarOrdlin = GXv_int11[0] ;
      wcprogramarhdrdrop_impl.this.AV31BarFasEstSig = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6BArCodPar", AV6BArCodPar);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29BarOrdlin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARORDLIN"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarfasestsig_Internalname, GXutil.str( AV31BarFasEstSig, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARFASESTSIG"+"_"+sGXsfl_73_idx, getSecureSignedToken( sPrefix+sGXsfl_73_idx, localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9")));
      if ( GXutil.strcmp(AV57Op, "*") == 0 )
      {
         if ( ( AV29BarOrdlin > 0 ) && ( AV30EstadoFaseHdr == 0 ) )
         {
            if ( GXutil.strcmp(AV32BarFacTingrid, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( AV34BarFasEstgrid == 0 )
               {
                  if ( AV31BarFasEstSig == 0 )
                  {
                     AV37Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV37Hdr);
                     /* Load Method */
                     if ( wbStart != -1 )
                     {
                        wbStart = (short)(73) ;
                     }
                     if ( ( subGridhdr_Islastpage == 1 ) || ( 5 == 0 ) || ( ( GRIDHDR_nCurrentRecord >= GRIDHDR_nFirstRecordOnPage ) && ( GRIDHDR_nCurrentRecord < GRIDHDR_nFirstRecordOnPage + subgridhdr_fnc_recordsperpage( ) ) ) )
                     {
                        sendrow_733( ) ;
                     }
                     GRIDHDR_nCurrentRecord = (long)(GRIDHDR_nCurrentRecord+1) ;
                     if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
                     {
                        httpContext.doAjaxLoad(73, GridhdrRow);
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_20_MY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable5_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodin_Internalname, httpContext.getMessage( "Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodin_Internalname, GXutil.ltrim( localUtil.ntoc( AV48BarcodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV48BarcodIN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV48BarcodIN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoin_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoin_Internalname, GXutil.ltrim( localUtil.ntoc( AV49BarcodreoIn, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49BarcodreoIn), "9") : localUtil.format( DecimalUtil.doubleToDec(AV49BarcodreoIn), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodreoin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparin_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparin_Internalname, GXutil.rtrim( AV50BarcodparIN), GXutil.rtrim( localUtil.format( AV50BarcodparIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcodparin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable4_Internalname, 1, 100, "%", 100, "%", "Table", "left", "top", " "+"data-gx-canvas"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarenccliin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarenccliin_Internalname, httpContext.getMessage( "Pedido Cli", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccliin_Internalname, GXutil.rtrim( AV51BarEnccliIn), GXutil.rtrim( localUtil.format( AV51BarEnccliIn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarenccliin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarenccliin_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomin_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomin_Internalname, GXutil.rtrim( AV52BarColNomIn), GXutil.rtrim( localUtil.format( AV52BarColNomIn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavBarcolnomin_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFiltroclicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFiltroclicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFiltroclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV46FiltroCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFiltroclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV46FiltroCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV46FiltroCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFiltroclicod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFiltroclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDesdebarfecfpr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDesdebarfecfpr_Internalname, httpContext.getMessage( "F Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDesdebarfecfpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesdebarfecfpr_Internalname, localUtil.format(AV45DesdeBarFecFPr, "99/99/99"), localUtil.format( AV45DesdeBarFecFPr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesdebarfecfpr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavDesdebarfecfpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDesdebarfecfpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDesdebarfecfpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCProgramarHdrDrop.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHastabarfecfpr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHastabarfecfpr_Internalname, "-", "col-sm-3 AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_65_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHastabarfecfpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHastabarfecfpr_Internalname, localUtil.format(AV47HastaBarFecFPr, "99/99/99"), localUtil.format( AV47HastaBarFecFPr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHastabarfecfpr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHastabarfecfpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHastabarfecfpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHastabarfecfpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WCProgramarHdrDrop.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "BtnExportReport" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttInforme_Internalname, "gx.evt.setGridEvt("+GXutil.str( 65, 2, 0)+","+"null"+");", "", bttInforme_Jsonclick, 7, "", "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e19my1_client"+"'", TempTags, "", 2, "HLP_WCProgramarHdrDrop.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:Top")+"\">") ;
         /*  Grid Control  */
         GridmaquinaContainer.SetWrapped(nGXWrapped);
         startgridcontrol65( ) ;
      }
      if ( wbEnd == 65 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_65 = (int)(nGXsfl_65_idx-1) ;
         if ( GridmaquinaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridmaquinaContainer.AddObjectProperty("GRIDMAQUINA_nEOF", GRIDMAQUINA_nEOF);
            GridmaquinaContainer.AddObjectProperty("GRIDMAQUINA_nFirstRecordOnPage", GRIDMAQUINA_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridmaquinaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmaquina", GridmaquinaContainer, subGridmaquina_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinaContainerData", GridmaquinaContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinaContainerData"+"V", GridmaquinaContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridmaquinaContainerData"+"V"+"\" value='"+GridmaquinaContainer.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable3_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:Top")+"\">") ;
         /*  Grid Control  */
         GridhdrContainer.SetWrapped(nGXWrapped);
         startgridcontrol73( ) ;
      }
      if ( wbEnd == 73 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_73 = (int)(nGXsfl_73_idx-1) ;
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridhdrContainer.AddObjectProperty("GRIDHDR_nEOF", GRIDHDR_nEOF);
            GridhdrContainer.AddObjectProperty("GRIDHDR_nFirstRecordOnPage", GRIDHDR_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridhdrContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridhdr", GridhdrContainer, subGridhdr_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrContainerData", GridhdrContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrContainerData"+"V", GridhdrContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridhdrContainerData"+"V"+"\" value='"+GridhdrContainer.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_20_MY2e( true) ;
      }
      else
      {
         wb_table2_20_MY2e( false) ;
      }
   }

   public void wb_table1_12_MY2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextoprocesamiento_Internalname, lblTextoprocesamiento_Caption, "", "", lblTextoprocesamiento_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlockAcceptDrag", 0, "", 1, 1, 0, (short)(1), "HLP_WCProgramarHdrDrop.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_12_MY2e( true) ;
      }
      else
      {
         wb_table1_12_MY2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paMY2( ) ;
      wsMY2( ) ;
      weMY2( ) ;
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
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paMY2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcprogramarhdrdrop", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paMY2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
      }
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
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
      paMY2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsMY2( ) ;
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
      wsMY2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
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
      weMY2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202679905755", true, true);
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
      httpContext.AddJavascriptSource("wcprogramarhdrdrop.js", "?202679905755", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_652( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_65_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_65_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_65_idx ;
      edtMaqCDsc_Internalname = sPrefix+"MAQCDSC_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_652( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_65_fel_idx ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD_"+sGXsfl_65_fel_idx ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC_"+sGXsfl_65_fel_idx ;
      edtMaqCDsc_Internalname = sPrefix+"MAQCDSC_"+sGXsfl_65_fel_idx ;
   }

   public void sendrow_652( )
   {
      subsflControlProps_652( ) ;
      wbMY0( ) ;
      if ( ( 5 * 1 == 0 ) || ( nGXsfl_65_idx <= subgridmaquina_fnc_recordsperpage( ) * 1 ) )
      {
         GridmaquinaRow = GXWebRow.GetNew(context,GridmaquinaContainer) ;
         if ( subGridmaquina_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridmaquina_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridmaquina_Class, "") != 0 )
            {
               subGridmaquina_Linesclass = subGridmaquina_Class+"Odd" ;
            }
         }
         else if ( subGridmaquina_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridmaquina_Backstyle = (byte)(0) ;
            subGridmaquina_Backcolor = subGridmaquina_Allbackcolor ;
            if ( GXutil.strcmp(subGridmaquina_Class, "") != 0 )
            {
               subGridmaquina_Linesclass = subGridmaquina_Class+"Uniform" ;
            }
         }
         else if ( subGridmaquina_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridmaquina_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridmaquina_Class, "") != 0 )
            {
               subGridmaquina_Linesclass = subGridmaquina_Class+"Odd" ;
            }
            subGridmaquina_Backcolor = (int)(0x0) ;
         }
         else if ( subGridmaquina_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridmaquina_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
            {
               subGridmaquina_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmaquina_Class, "") != 0 )
               {
                  subGridmaquina_Linesclass = subGridmaquina_Class+"Even" ;
               }
            }
            else
            {
               subGridmaquina_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridmaquina_Class, "") != 0 )
               {
                  subGridmaquina_Linesclass = subGridmaquina_Class+"Odd" ;
               }
            }
         }
         if ( GridmaquinaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridWithBorderColor WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_65_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridmaquinaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridmaquinaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(48),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridmaquinaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridmaquinaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridmaquinaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridmaquinaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridmaquinaContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridmaquinaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCDsc_Internalname,A13734MaqCDsc,"","","'"+sPrefix+"'"+",false,"+"'"+"e20my2_client"+"'","","","","",edtMaqCDsc_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesMY2( ) ;
         GridmaquinaContainer.AddRow(GridmaquinaRow);
         nGXsfl_65_idx = ((subGridmaquina_Islastpage==1)&&(nGXsfl_65_idx+1>subgridmaquina_fnc_recordsperpage( )) ? 1 : nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_652( ) ;
      }
      /* End function sendrow_652 */
   }

   public void subsflControlProps_733( )
   {
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_73_idx ;
      chkBarAgrEst.setInternalname( sPrefix+"BARAGREST_"+sGXsfl_73_idx );
      edtavOp_Internalname = sPrefix+"vOP_"+sGXsfl_73_idx ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD_"+sGXsfl_73_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_73_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_73_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_73_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_73_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_73_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_73_idx ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM_"+sGXsfl_73_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_73_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_73_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_73_idx ;
      edtavBarordlin_Internalname = sPrefix+"vBARORDLIN_"+sGXsfl_73_idx ;
      edtavEstadofasehdr_Internalname = sPrefix+"vESTADOFASEHDR_"+sGXsfl_73_idx ;
      edtavBarfactingrid_Internalname = sPrefix+"vBARFACTINGRID_"+sGXsfl_73_idx ;
      edtavBarfasestgrid_Internalname = sPrefix+"vBARFASESTGRID_"+sGXsfl_73_idx ;
      edtavBarfasestsig_Internalname = sPrefix+"vBARFASESTSIG_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_733( )
   {
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_73_fel_idx ;
      chkBarAgrEst.setInternalname( sPrefix+"BARAGREST_"+sGXsfl_73_fel_idx );
      edtavOp_Internalname = sPrefix+"vOP_"+sGXsfl_73_fel_idx ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD_"+sGXsfl_73_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_73_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_73_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_73_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_73_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_73_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_73_fel_idx ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM_"+sGXsfl_73_fel_idx ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN_"+sGXsfl_73_fel_idx ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR_"+sGXsfl_73_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_73_fel_idx ;
      edtavBarordlin_Internalname = sPrefix+"vBARORDLIN_"+sGXsfl_73_fel_idx ;
      edtavEstadofasehdr_Internalname = sPrefix+"vESTADOFASEHDR_"+sGXsfl_73_fel_idx ;
      edtavBarfactingrid_Internalname = sPrefix+"vBARFACTINGRID_"+sGXsfl_73_fel_idx ;
      edtavBarfasestgrid_Internalname = sPrefix+"vBARFASESTGRID_"+sGXsfl_73_fel_idx ;
      edtavBarfasestsig_Internalname = sPrefix+"vBARFASESTSIG_"+sGXsfl_73_fel_idx ;
   }

   public void sendrow_733( )
   {
      subsflControlProps_733( ) ;
      wbMY0( ) ;
      if ( ( 5 * 1 == 0 ) || ( nGXsfl_73_idx <= subgridhdr_fnc_recordsperpage( ) * 1 ) )
      {
         GridhdrRow = GXWebRow.GetNew(context,GridhdrContainer) ;
         if ( subGridhdr_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridhdr_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridhdr_Class, "") != 0 )
            {
               subGridhdr_Linesclass = subGridhdr_Class+"Odd" ;
            }
         }
         else if ( subGridhdr_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridhdr_Backstyle = (byte)(0) ;
            subGridhdr_Backcolor = subGridhdr_Allbackcolor ;
            if ( GXutil.strcmp(subGridhdr_Class, "") != 0 )
            {
               subGridhdr_Linesclass = subGridhdr_Class+"Uniform" ;
            }
         }
         else if ( subGridhdr_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridhdr_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridhdr_Class, "") != 0 )
            {
               subGridhdr_Linesclass = subGridhdr_Class+"Odd" ;
            }
            subGridhdr_Backcolor = (int)(0x0) ;
         }
         else if ( subGridhdr_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridhdr_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
            {
               subGridhdr_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridhdr_Class, "") != 0 )
               {
                  subGridhdr_Linesclass = subGridhdr_Class+"Even" ;
               }
            }
            else
            {
               subGridhdr_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridhdr_Class, "") != 0 )
               {
                  subGridhdr_Linesclass = subGridhdr_Class+"Odd" ;
               }
            }
         }
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridWithBorderColor WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_73_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV37Hdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "BARAGREST_" + sGXsfl_73_idx ;
         chkBarAgrEst.setName( GXCCtl );
         chkBarAgrEst.setWebtags( "" );
         chkBarAgrEst.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAgrEst.getInternalname(), "TitleCaption", chkBarAgrEst.getCaption(), !bGXsfl_73_Refreshing);
         chkBarAgrEst.setCheckedValue( "N" );
         GridhdrRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkBarAgrEst.getInternalname(),A120BarAgrEst,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"","",""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavOp_Internalname,GXutil.rtrim( AV57Op),GXutil.rtrim( localUtil.format( AV57Op, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavOp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavOp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaccod_Internalname,GXutil.ltrim( localUtil.ntoc( AV23Maccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Maccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Maccod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavMaccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecTotKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A812RecTotKgm, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecTotKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV29BarOrdlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV29BarOrdlin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavBarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEstadofasehdr_Internalname,GXutil.ltrim( localUtil.ntoc( AV30EstadoFaseHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEstadofasehdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9") : localUtil.format( DecimalUtil.doubleToDec(AV30EstadoFaseHdr), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEstadofasehdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavEstadofasehdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfactingrid_Internalname,GXutil.rtrim( AV32BarFacTingrid),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfactingrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavBarfactingrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasestgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV34BarFasEstgrid, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfasestgrid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34BarFasEstgrid), "9") : localUtil.format( DecimalUtil.doubleToDec(AV34BarFasEstgrid), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasestgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavBarfasestgrid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfasestsig_Internalname,GXutil.ltrim( localUtil.ntoc( AV31BarFasEstSig, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarfasestsig_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9") : localUtil.format( DecimalUtil.doubleToDec(AV31BarFasEstSig), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarfasestsig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavBarfasestsig_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesMY3( ) ;
         GridhdrContainer.AddRow(GridhdrRow);
         nGXsfl_73_idx = ((subGridhdr_Islastpage==1)&&(nGXsfl_73_idx+1>subgridhdr_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_733( ) ;
      }
      /* End function sendrow_733 */
   }

   public void startgridcontrol65( )
   {
      if ( GridmaquinaContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridmaquinaContainer"+"DivS\" data-gxgridid=\"65\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmaquina_Internalname, subGridmaquina_Internalname, "", "GridWithPaginationBar GridWithBorderColor WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridmaquina_Backcolorstyle == 0 )
         {
            subGridmaquina_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridmaquina_Class) > 0 )
            {
               subGridmaquina_Linesclass = subGridmaquina_Class+"Title" ;
            }
         }
         else
         {
            subGridmaquina_Titlebackstyle = (byte)(1) ;
            if ( subGridmaquina_Backcolorstyle == 1 )
            {
               subGridmaquina_Titlebackcolor = subGridmaquina_Allbackcolor ;
               if ( GXutil.len( subGridmaquina_Class) > 0 )
               {
                  subGridmaquina_Linesclass = subGridmaquina_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridmaquina_Class) > 0 )
               {
                  subGridmaquina_Linesclass = subGridmaquina_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(48), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina por Programar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridmaquinaContainer.AddObjectProperty("GridName", "Gridmaquina");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridmaquinaContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridmaquinaContainer.Clear();
         }
         GridmaquinaContainer.SetWrapped(nGXWrapped);
         GridmaquinaContainer.AddObjectProperty("GridName", "Gridmaquina");
         GridmaquinaContainer.AddObjectProperty("Header", subGridmaquina_Header);
         GridmaquinaContainer.AddObjectProperty("Class", "GridWithPaginationBar GridWithBorderColor WorkWith");
         GridmaquinaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("CmpContext", sPrefix);
         GridmaquinaContainer.AddObjectProperty("InMasterPage", "false");
         GridmaquinaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinaColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridmaquinaContainer.AddColumnProperties(GridmaquinaColumn);
         GridmaquinaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinaColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridmaquinaContainer.AddColumnProperties(GridmaquinaColumn);
         GridmaquinaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinaColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridmaquinaContainer.AddColumnProperties(GridmaquinaColumn);
         GridmaquinaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinaColumn.AddObjectProperty("Value", A13734MaqCDsc);
         GridmaquinaContainer.AddColumnProperties(GridmaquinaColumn);
         GridmaquinaContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridmaquinaContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmaquina_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol73( )
   {
      if ( GridhdrContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridhdrContainer"+"DivS\" data-gxgridid=\"73\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridhdr_Internalname, subGridhdr_Internalname, "", "GridWithPaginationBar GridWithBorderColor WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridhdr_Backcolorstyle == 0 )
         {
            subGridhdr_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridhdr_Class) > 0 )
            {
               subGridhdr_Linesclass = subGridhdr_Class+"Title" ;
            }
         }
         else
         {
            subGridhdr_Titlebackstyle = (byte)(1) ;
            if ( subGridhdr_Backcolorstyle == 1 )
            {
               subGridhdr_Titlebackcolor = subGridhdr_Allbackcolor ;
               if ( GXutil.len( subGridhdr_Class) > 0 )
               {
                  subGridhdr_Linesclass = subGridhdr_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridhdr_Class) > 0 )
               {
                  subGridhdr_Linesclass = subGridhdr_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agrp?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Acc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "K Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Est. F Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fac Tin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fas Est", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fas Est Sig", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridhdrContainer.AddObjectProperty("GridName", "Gridhdr");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridhdrContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridhdrContainer.Clear();
         }
         GridhdrContainer.SetWrapped(nGXWrapped);
         GridhdrContainer.AddObjectProperty("GridName", "Gridhdr");
         GridhdrContainer.AddObjectProperty("Header", subGridhdr_Header);
         GridhdrContainer.AddObjectProperty("Class", "GridWithPaginationBar GridWithBorderColor WorkWith");
         GridhdrContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdr_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("CmpContext", sPrefix);
         GridhdrContainer.AddObjectProperty("InMasterPage", "false");
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( AV37Hdr));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( AV57Op));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavOp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23Maccod, (byte)(8), (byte)(0), ".", "")));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV29BarOrdlin, (byte)(4), (byte)(0), ".", "")));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV30EstadoFaseHdr, (byte)(1), (byte)(0), ".", "")));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEstadofasehdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.rtrim( AV32BarFacTingrid));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfactingrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34BarFasEstgrid, (byte)(1), (byte)(0), ".", "")));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasestgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31BarFasEstSig, (byte)(1), (byte)(0), ".", "")));
         GridhdrColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfasestsig_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrContainer.AddColumnProperties(GridhdrColumn);
         GridhdrContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridhdr_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhdr_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhdr_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhdr_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhdr_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhdr_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridhdrContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhdr_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      lblTextoprocesamiento_Internalname = sPrefix+"TEXTOPROCESAMIENTO" ;
      tblTable2_Internalname = sPrefix+"TABLE2" ;
      edtavBarcodin_Internalname = sPrefix+"vBARCODIN" ;
      edtavBarcodreoin_Internalname = sPrefix+"vBARCODREOIN" ;
      edtavBarcodparin_Internalname = sPrefix+"vBARCODPARIN" ;
      divTable4_Internalname = sPrefix+"TABLE4" ;
      edtavBarenccliin_Internalname = sPrefix+"vBARENCCLIIN" ;
      edtavBarcolnomin_Internalname = sPrefix+"vBARCOLNOMIN" ;
      edtavFiltroclicod_Internalname = sPrefix+"vFILTROCLICOD" ;
      edtavDesdebarfecfpr_Internalname = sPrefix+"vDESDEBARFECFPR" ;
      edtavHastabarfecfpr_Internalname = sPrefix+"vHASTABARFECFPR" ;
      bttInforme_Internalname = sPrefix+"INFORME" ;
      divTable5_Internalname = sPrefix+"TABLE5" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtMaqCod_Internalname = sPrefix+"MAQCOD" ;
      edtMaqDsc_Internalname = sPrefix+"MAQDSC" ;
      edtMaqCDsc_Internalname = sPrefix+"MAQCDSC" ;
      divTable3_Internalname = sPrefix+"TABLE3" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      chkBarAgrEst.setInternalname( sPrefix+"BARAGREST" );
      edtavOp_Internalname = sPrefix+"vOP" ;
      edtavMaccod_Internalname = sPrefix+"vMACCOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM" ;
      edtBarFecGen_Internalname = sPrefix+"BARFECGEN" ;
      edtBarFecFpr_Internalname = sPrefix+"BARFECFPR" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtavBarordlin_Internalname = sPrefix+"vBARORDLIN" ;
      edtavEstadofasehdr_Internalname = sPrefix+"vESTADOFASEHDR" ;
      edtavBarfactingrid_Internalname = sPrefix+"vBARFACTINGRID" ;
      edtavBarfasestgrid_Internalname = sPrefix+"vBARFASESTGRID" ;
      edtavBarfasestsig_Internalname = sPrefix+"vBARFASESTSIG" ;
      tblTable10_Internalname = sPrefix+"TABLE10" ;
      divTable7_Internalname = sPrefix+"TABLE7" ;
      divTable1_Internalname = sPrefix+"TABLE1" ;
      divMaintable_Internalname = sPrefix+"MAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridmaquina_Internalname = sPrefix+"GRIDMAQUINA" ;
      subGridhdr_Internalname = sPrefix+"GRIDHDR" ;
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
      subGridhdr_Allowcollapsing = (byte)(0) ;
      subGridhdr_Allowhovering = (byte)(-1) ;
      subGridhdr_Allowselection = (byte)(1) ;
      subGridhdr_Header = "" ;
      subGridmaquina_Allowcollapsing = (byte)(0) ;
      subGridmaquina_Allowhovering = (byte)(-1) ;
      subGridmaquina_Header = "" ;
      edtavBarfasestsig_Jsonclick = "" ;
      edtavBarfasestsig_Enabled = 0 ;
      edtavBarfasestgrid_Jsonclick = "" ;
      edtavBarfasestgrid_Enabled = 0 ;
      edtavBarfactingrid_Jsonclick = "" ;
      edtavBarfactingrid_Enabled = 0 ;
      edtavEstadofasehdr_Jsonclick = "" ;
      edtavEstadofasehdr_Enabled = 0 ;
      edtavBarordlin_Jsonclick = "" ;
      edtavBarordlin_Enabled = 0 ;
      edtBarSit_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtRecTotKgm_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtavMaccod_Jsonclick = "" ;
      edtavMaccod_Enabled = 0 ;
      edtavOp_Jsonclick = "" ;
      edtavOp_Enabled = 0 ;
      chkBarAgrEst.setCaption( "" );
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Enabled = 0 ;
      subGridhdr_Class = "GridWithPaginationBar GridWithBorderColor WorkWith" ;
      subGridhdr_Backcolorstyle = (byte)(0) ;
      edtMaqCDsc_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGridmaquina_Class = "GridWithPaginationBar GridWithBorderColor WorkWith" ;
      subGridmaquina_Backcolorstyle = (byte)(0) ;
      edtavHastabarfecfpr_Jsonclick = "" ;
      edtavHastabarfecfpr_Enabled = 1 ;
      edtavDesdebarfecfpr_Jsonclick = "" ;
      edtavDesdebarfecfpr_Enabled = 1 ;
      edtavFiltroclicod_Jsonclick = "" ;
      edtavFiltroclicod_Enabled = 1 ;
      edtavBarcolnomin_Jsonclick = "" ;
      edtavBarcolnomin_Enabled = 1 ;
      edtavBarenccliin_Jsonclick = "" ;
      edtavBarenccliin_Enabled = 1 ;
      edtavBarcodparin_Jsonclick = "" ;
      edtavBarcodparin_Enabled = 1 ;
      edtavBarcodreoin_Jsonclick = "" ;
      edtavBarcodreoin_Enabled = 1 ;
      edtavBarcodin_Jsonclick = "" ;
      edtavBarcodin_Enabled = 1 ;
      subGridmaquina_Allowselection = (byte)(1) ;
      divMaintable_Class = "Table" ;
      lblTextoprocesamiento_Caption = httpContext.getMessage( "Texto Procesamiento", "") ;
      subGridhdr_Rows = 5 ;
      subGridmaquina_Rows = 5 ;
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
      GXCCtl = "BARAGREST_" + sGXsfl_73_idx ;
      chkBarAgrEst.setName( GXCCtl );
      chkBarAgrEst.setWebtags( "" );
      chkBarAgrEst.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkBarAgrEst.getInternalname(), "TitleCaption", chkBarAgrEst.getCaption(), !bGXsfl_73_Refreshing);
      chkBarAgrEst.setCheckedValue( "N" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'sPrefix'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("TEXTOPROCESAMIENTO.DROP","{handler:'e13MY2',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'sPrefix'},{av:'AV37Hdr',fld:'vHDR',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'AV41UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV16Station',fld:'vSTATION',pic:''},{av:'AV44Objeto',fld:'vOBJETO',pic:''},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'}]");
      setEventMetadata("TEXTOPROCESAMIENTO.DROP",",oparms:[{av:'AV16Station',fld:'vSTATION',pic:''},{av:'AV41UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44Objeto',fld:'vOBJETO',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'},{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''}]}");
      setEventMetadata("MAQCDSC.CLICK","{handler:'e20MY2',iparms:[{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true},{av:'A13734MaqCDsc',fld:'MAQCDSC',pic:'',hsh:true},{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''}]");
      setEventMetadata("MAQCDSC.CLICK",",oparms:[{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDMAQUINA.REFRESH","{handler:'e15MY2',iparms:[]");
      setEventMetadata("GRIDMAQUINA.REFRESH",",oparms:[{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''}]}");
      setEventMetadata("GLOBALEVENTS.MAQUINAASIGNARHDR","{handler:'e11MY2',iparms:[{av:'AV14Procesar',fld:'vPROCESAR',pic:''},{av:'AV12EventMaqCod',fld:'vEVENTMAQCOD',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''}]");
      setEventMetadata("GLOBALEVENTS.MAQUINAASIGNARHDR",",oparms:[{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDHDR.LOAD","{handler:'e18MY3',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'}]");
      setEventMetadata("GRIDHDR.LOAD",",oparms:[{av:'AV23Maccod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV57Op',fld:'vOP',pic:'@!'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'AV32BarFacTingrid',fld:'vBARFACTINGRID',pic:''},{av:'AV34BarFasEstgrid',fld:'vBARFASESTGRID',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37Hdr',fld:'vHDR',pic:''},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e12MY2',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'sPrefix'},{av:'AV43Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV42ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("'INFORME'","{handler:'e19MY1',iparms:[{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''}]");
      setEventMetadata("'INFORME'",",oparms:[]}");
      setEventMetadata("GRIDMAQUINA_FIRSTPAGE","{handler:'subgridmaquina_firstpage',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRIDMAQUINA_FIRSTPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDMAQUINA_PREVPAGE","{handler:'subgridmaquina_previouspage',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRIDMAQUINA_PREVPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDMAQUINA_NEXTPAGE","{handler:'subgridmaquina_nextpage',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRIDMAQUINA_NEXTPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDMAQUINA_LASTPAGE","{handler:'subgridmaquina_lastpage',iparms:[{av:'GRIDMAQUINA_nFirstRecordOnPage'},{av:'GRIDMAQUINA_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV13PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:''},{av:'sPrefix'}]");
      setEventMetadata("GRIDMAQUINA_LASTPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDHDR_FIRSTPAGE","{handler:'subgridhdr_firstpage',iparms:[{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'sPrefix'}]");
      setEventMetadata("GRIDHDR_FIRSTPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDHDR_PREVPAGE","{handler:'subgridhdr_previouspage',iparms:[{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'sPrefix'}]");
      setEventMetadata("GRIDHDR_PREVPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDHDR_NEXTPAGE","{handler:'subgridhdr_nextpage',iparms:[{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'sPrefix'}]");
      setEventMetadata("GRIDHDR_NEXTPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("GRIDHDR_LASTPAGE","{handler:'subgridhdr_lastpage',iparms:[{av:'GRIDHDR_nFirstRecordOnPage'},{av:'GRIDHDR_nEOF'},{av:'subGridmaquina_Rows',ctrl:'GRIDMAQUINA',prop:'Rows'},{av:'subGridhdr_Rows',ctrl:'GRIDHDR',prop:'Rows'},{av:'AV48BarcodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV49BarcodreoIn',fld:'vBARCODREOIN',pic:'9'},{av:'AV50BarcodparIN',fld:'vBARCODPARIN',pic:''},{av:'AV51BarEnccliIn',fld:'vBARENCCLIIN',pic:''},{av:'AV52BarColNomIn',fld:'vBARCOLNOMIN',pic:''},{av:'AV46FiltroCliCod',fld:'vFILTROCLICOD',pic:'ZZZZZ9'},{av:'AV45DesdeBarFecFPr',fld:'vDESDEBARFECFPR',pic:''},{av:'AV47HastaBarFecFPr',fld:'vHASTABARFECFPR',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV31BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV30EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV5BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BArCodPar',fld:'vBARCODPAR',pic:''},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'sPrefix'}]");
      setEventMetadata("GRIDHDR_LASTPAGE",",oparms:[{av:'AV22AplicarMaqCDsc',fld:'vAPLICARMAQCDSC',pic:''},{av:'AV8AplicarMaqCod',fld:'vAPLICARMAQCOD',pic:''},{av:'lblTextoprocesamiento_Caption',ctrl:'TEXTOPROCESAMIENTO',prop:'Caption'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQDSC","{handler:'valid_Maqdsc',iparms:[]");
      setEventMetadata("VALID_MAQDSC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqcdsc',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALIDV_ESTADOFASEHDR","{handler:'validv_Estadofasehdr',iparms:[]");
      setEventMetadata("VALIDV_ESTADOFASEHDR",",oparms:[]}");
      setEventMetadata("VALIDV_BARFACTINGRID","{handler:'validv_Barfactingrid',iparms:[]");
      setEventMetadata("VALIDV_BARFACTINGRID",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASESTGRID","{handler:'validv_Barfasestgrid',iparms:[]");
      setEventMetadata("VALIDV_BARFASESTGRID",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASESTSIG","{handler:'validv_Barfasestsig',iparms:[]");
      setEventMetadata("VALIDV_BARFASESTSIG",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV50BarcodparIN = "" ;
      AV51BarEnccliIn = "" ;
      AV52BarColNomIn = "" ;
      AV45DesdeBarFecFPr = GXutil.nullDate() ;
      AV47HastaBarFecFPr = GXutil.nullDate() ;
      AV10EmprCod = "" ;
      AV13PrefijoMaqCod = "" ;
      AV6BArCodPar = "" ;
      A150BarFacTin = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22AplicarMaqCDsc = "" ;
      AV8AplicarMaqCod = "" ;
      AV41UsurCod = "" ;
      AV16Station = "" ;
      AV44Objeto = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12EventMaqCod = "" ;
      A130BarCodPar = "" ;
      AV42ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridmaquinaContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      GridhdrContainer = new com.genexus.webpanels.GXWebGrid(context);
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A13734MaqCDsc = "" ;
      AV37Hdr = "" ;
      A120BarAgrEst = "" ;
      AV57Op = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      AV32BarFacTingrid = "" ;
      scmdbuf = "" ;
      lV13PrefijoMaqCod = "" ;
      H00MY2_A620MaqTip = new String[] {""} ;
      H00MY2_n620MaqTip = new boolean[] {false} ;
      H00MY2_A6432MaqPln = new byte[1] ;
      H00MY2_n6432MaqPln = new boolean[] {false} ;
      H00MY2_A607MaqEst = new String[] {""} ;
      H00MY2_n607MaqEst = new boolean[] {false} ;
      H00MY2_A396EmprCod = new String[] {""} ;
      H00MY2_A606MaqDsc = new String[] {""} ;
      H00MY2_n606MaqDsc = new boolean[] {false} ;
      H00MY2_A602MaqCod = new String[] {""} ;
      A620MaqTip = "" ;
      A607MaqEst = "" ;
      H00MY3_A620MaqTip = new String[] {""} ;
      H00MY3_n620MaqTip = new boolean[] {false} ;
      H00MY3_A6432MaqPln = new byte[1] ;
      H00MY3_n6432MaqPln = new boolean[] {false} ;
      H00MY3_A607MaqEst = new String[] {""} ;
      H00MY3_n607MaqEst = new boolean[] {false} ;
      H00MY3_A396EmprCod = new String[] {""} ;
      H00MY3_A606MaqDsc = new String[] {""} ;
      H00MY3_n606MaqDsc = new boolean[] {false} ;
      H00MY3_A602MaqCod = new String[] {""} ;
      lV51BarEnccliIn = "" ;
      lV52BarColNomIn = "" ;
      A180BarMaqCod = "" ;
      A4812BarEncCli = "" ;
      H00MY6_A396EmprCod = new String[] {""} ;
      H00MY6_A4812BarEncCli = new String[] {""} ;
      H00MY6_A252CliCod = new int[1] ;
      H00MY6_n252CliCod = new boolean[] {false} ;
      H00MY6_A180BarMaqCod = new String[] {""} ;
      H00MY6_A130BarCodPar = new String[] {""} ;
      H00MY6_A132BarCodReo = new byte[1] ;
      H00MY6_A129BarCod = new int[1] ;
      H00MY6_A213BarSit = new byte[1] ;
      H00MY6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H00MY6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00MY6_A1234BarNomCli = new String[] {""} ;
      H00MY6_A135BarColNom = new String[] {""} ;
      H00MY6_A1652BarSerDsc = new String[] {""} ;
      H00MY6_A212BarSer = new String[] {""} ;
      H00MY6_A279CliNom = new String[] {""} ;
      H00MY6_A120BarAgrEst = new String[] {""} ;
      H00MY6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MY6_n166BarKgm = new boolean[] {false} ;
      H00MY6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00MY6_n219BarTotAgr = new boolean[] {false} ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      H00MY9_AGRIDHDR_nRecordCount = new long[1] ;
      AV11EmprNom = "" ;
      AV17UsuCod = "" ;
      AV40BarcodparInout = "" ;
      GXt_char1 = "" ;
      H00MY10_A758ProCod = new String[] {""} ;
      H00MY10_A150BarFacTin = new String[] {""} ;
      H00MY10_A153BarFasEst = new byte[1] ;
      H00MY10_A130BarCodPar = new String[] {""} ;
      H00MY10_A132BarCodReo = new byte[1] ;
      H00MY10_A129BarCod = new int[1] ;
      H00MY10_A396EmprCod = new String[] {""} ;
      H00MY10_A194BarOrdLin = new short[1] ;
      GridmaquinaRow = new com.genexus.webpanels.GXWebRow();
      AV26Barcodparm = "" ;
      AV33fecha = GXutil.nullDate() ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char8 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_int15 = new short[1] ;
      GridhdrRow = new com.genexus.webpanels.GXWebRow();
      TempTags = "" ;
      bttInforme_Jsonclick = "" ;
      lblTextoprocesamiento_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridmaquina_Linesclass = "" ;
      ROClassString = "" ;
      subGridhdr_Linesclass = "" ;
      GXCCtl = "" ;
      GridmaquinaColumn = new com.genexus.webpanels.GXWebColumn();
      GridhdrColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcprogramarhdrdrop__default(),
         new Object[] {
             new Object[] {
            H00MY2_A620MaqTip, H00MY2_n620MaqTip, H00MY2_A6432MaqPln, H00MY2_n6432MaqPln, H00MY2_A607MaqEst, H00MY2_n607MaqEst, H00MY2_A396EmprCod, H00MY2_A606MaqDsc, H00MY2_n606MaqDsc, H00MY2_A602MaqCod
            }
            , new Object[] {
            H00MY3_A620MaqTip, H00MY3_n620MaqTip, H00MY3_A6432MaqPln, H00MY3_n6432MaqPln, H00MY3_A607MaqEst, H00MY3_n607MaqEst, H00MY3_A396EmprCod, H00MY3_A606MaqDsc, H00MY3_n606MaqDsc, H00MY3_A602MaqCod
            }
            , new Object[] {
            H00MY6_A396EmprCod, H00MY6_A4812BarEncCli, H00MY6_A252CliCod, H00MY6_n252CliCod, H00MY6_A180BarMaqCod, H00MY6_A130BarCodPar, H00MY6_A132BarCodReo, H00MY6_A129BarCod, H00MY6_A213BarSit, H00MY6_A158BarFecFpr,
            H00MY6_A159BarFecGen, H00MY6_A1234BarNomCli, H00MY6_A135BarColNom, H00MY6_A1652BarSerDsc, H00MY6_A212BarSer, H00MY6_A279CliNom, H00MY6_A120BarAgrEst, H00MY6_A166BarKgm, H00MY6_n166BarKgm, H00MY6_A219BarTotAgr,
            H00MY6_n219BarTotAgr
            }
            , new Object[] {
            H00MY9_AGRIDHDR_nRecordCount
            }
            , new Object[] {
            H00MY10_A758ProCod, H00MY10_A150BarFacTin, H00MY10_A153BarFasEst, H00MY10_A130BarCodPar, H00MY10_A132BarCodReo, H00MY10_A129BarCod, H00MY10_A396EmprCod, H00MY10_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavHdr_Enabled = 0 ;
      edtavOp_Enabled = 0 ;
      edtavMaccod_Enabled = 0 ;
      edtavBarordlin_Enabled = 0 ;
      edtavEstadofasehdr_Enabled = 0 ;
      edtavBarfactingrid_Enabled = 0 ;
      edtavBarfasestgrid_Enabled = 0 ;
      edtavBarfasestsig_Enabled = 0 ;
   }

   private byte GRIDMAQUINA_nEOF ;
   private byte GRIDHDR_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV49BarcodreoIn ;
   private byte AV31BarFasEstSig ;
   private byte AV30EstadoFaseHdr ;
   private byte AV7BarCodReo ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A213BarSit ;
   private byte AV34BarFasEstgrid ;
   private byte nDonePA ;
   private byte A6432MaqPln ;
   private byte subGridmaquina_Backcolorstyle ;
   private byte subGridhdr_Backcolorstyle ;
   private byte subGridmaquina_Allowselection ;
   private byte AV39BarcodreoInout ;
   private byte AV25Barcodreom ;
   private byte GXv_int9[] ;
   private byte GXv_int6[] ;
   private byte GXv_int13[] ;
   private byte nGXWrapped ;
   private byte subGridmaquina_Backstyle ;
   private byte subGridhdr_Backstyle ;
   private byte subGridmaquina_Titlebackstyle ;
   private byte subGridmaquina_Allowhovering ;
   private byte subGridmaquina_Allowcollapsing ;
   private byte subGridmaquina_Collapsed ;
   private byte subGridhdr_Titlebackstyle ;
   private byte subGridhdr_Allowselection ;
   private byte subGridhdr_Allowhovering ;
   private byte subGridhdr_Allowcollapsing ;
   private byte subGridhdr_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV29BarOrdlin ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int15[] ;
   private int nRC_GXsfl_65 ;
   private int nRC_GXsfl_73 ;
   private int subGridmaquina_Rows ;
   private int subGridhdr_Rows ;
   private int nGXsfl_65_idx=1 ;
   private int AV48BarcodIN ;
   private int AV46FiltroCliCod ;
   private int nGXsfl_73_idx=1 ;
   private int AV5BarCod ;
   private int A129BarCod ;
   private int AV23Maccod ;
   private int subGridmaquina_Islastpage ;
   private int subGridhdr_Islastpage ;
   private int edtavHdr_Enabled ;
   private int edtavOp_Enabled ;
   private int edtavMaccod_Enabled ;
   private int edtavBarordlin_Enabled ;
   private int edtavEstadofasehdr_Enabled ;
   private int edtavBarfactingrid_Enabled ;
   private int edtavBarfasestgrid_Enabled ;
   private int edtavBarfasestsig_Enabled ;
   private int A252CliCod ;
   private int AV38BarcodInout ;
   private int AV24Barcodm ;
   private int GXv_int5[] ;
   private int edtavBarcodin_Enabled ;
   private int edtavBarcodreoin_Enabled ;
   private int edtavBarcodparin_Enabled ;
   private int edtavBarenccliin_Enabled ;
   private int edtavBarcolnomin_Enabled ;
   private int edtavFiltroclicod_Enabled ;
   private int edtavDesdebarfecfpr_Enabled ;
   private int edtavHastabarfecfpr_Enabled ;
   private int idxLst ;
   private int subGridmaquina_Backcolor ;
   private int subGridmaquina_Allbackcolor ;
   private int subGridhdr_Backcolor ;
   private int subGridhdr_Allbackcolor ;
   private int subGridmaquina_Titlebackcolor ;
   private int subGridmaquina_Selectedindex ;
   private int subGridmaquina_Selectioncolor ;
   private int subGridmaquina_Hoveringcolor ;
   private int subGridhdr_Titlebackcolor ;
   private int subGridhdr_Selectedindex ;
   private int subGridhdr_Selectioncolor ;
   private int subGridhdr_Hoveringcolor ;
   private long GRIDMAQUINA_nFirstRecordOnPage ;
   private long GRIDHDR_nFirstRecordOnPage ;
   private long GRIDMAQUINA_nCurrentRecord ;
   private long GRIDHDR_nCurrentRecord ;
   private long GRIDMAQUINA_nRecordCount ;
   private long GRIDHDR_nRecordCount ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_65_idx="0001" ;
   private String AV50BarcodparIN ;
   private String AV51BarEnccliIn ;
   private String AV52BarColNomIn ;
   private String AV10EmprCod ;
   private String AV13PrefijoMaqCod ;
   private String sGXsfl_73_idx="0001" ;
   private String AV6BArCodPar ;
   private String A150BarFacTin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV8AplicarMaqCod ;
   private String AV41UsurCod ;
   private String AV16Station ;
   private String AV12EventMaqCod ;
   private String A130BarCodPar ;
   private String lblTextoprocesamiento_Caption ;
   private String GX_FocusControl ;
   private String divMaintable_Internalname ;
   private String divMaintable_Class ;
   private String divTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTable7_Internalname ;
   private String sStyleString ;
   private String subGridmaquina_Internalname ;
   private String subGridhdr_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavBarcodin_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String edtMaqCDsc_Internalname ;
   private String AV37Hdr ;
   private String edtavHdr_Internalname ;
   private String A120BarAgrEst ;
   private String AV57Op ;
   private String edtavOp_Internalname ;
   private String edtavMaccod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtRecTotKgm_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtavBarordlin_Internalname ;
   private String edtavEstadofasehdr_Internalname ;
   private String AV32BarFacTingrid ;
   private String edtavBarfactingrid_Internalname ;
   private String edtavBarfasestgrid_Internalname ;
   private String edtavBarfasestsig_Internalname ;
   private String scmdbuf ;
   private String lV13PrefijoMaqCod ;
   private String A620MaqTip ;
   private String A607MaqEst ;
   private String lV51BarEnccliIn ;
   private String lV52BarColNomIn ;
   private String A180BarMaqCod ;
   private String A4812BarEncCli ;
   private String edtavBarcodreoin_Internalname ;
   private String edtavBarcodparin_Internalname ;
   private String edtavBarenccliin_Internalname ;
   private String edtavBarcolnomin_Internalname ;
   private String edtavFiltroclicod_Internalname ;
   private String edtavDesdebarfecfpr_Internalname ;
   private String edtavHastabarfecfpr_Internalname ;
   private String lblTextoprocesamiento_Internalname ;
   private String AV11EmprNom ;
   private String AV17UsuCod ;
   private String AV40BarcodparInout ;
   private String GXt_char1 ;
   private String AV26Barcodparm ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char14[] ;
   private String tblTable10_Internalname ;
   private String divTable5_Internalname ;
   private String TempTags ;
   private String edtavBarcodin_Jsonclick ;
   private String edtavBarcodreoin_Jsonclick ;
   private String edtavBarcodparin_Jsonclick ;
   private String divTable4_Internalname ;
   private String edtavBarenccliin_Jsonclick ;
   private String edtavBarcolnomin_Jsonclick ;
   private String edtavFiltroclicod_Jsonclick ;
   private String edtavDesdebarfecfpr_Jsonclick ;
   private String edtavHastabarfecfpr_Jsonclick ;
   private String bttInforme_Internalname ;
   private String bttInforme_Jsonclick ;
   private String divTable3_Internalname ;
   private String tblTable2_Internalname ;
   private String lblTextoprocesamiento_Jsonclick ;
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGridmaquina_Class ;
   private String subGridmaquina_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqCDsc_Jsonclick ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String subGridhdr_Class ;
   private String subGridhdr_Linesclass ;
   private String edtavHdr_Jsonclick ;
   private String GXCCtl ;
   private String edtavOp_Jsonclick ;
   private String edtavMaccod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtRecTotKgm_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtavBarordlin_Jsonclick ;
   private String edtavEstadofasehdr_Jsonclick ;
   private String edtavBarfactingrid_Jsonclick ;
   private String edtavBarfasestgrid_Jsonclick ;
   private String edtavBarfasestsig_Jsonclick ;
   private String subGridmaquina_Header ;
   private String subGridhdr_Header ;
   private java.util.Date AV45DesdeBarFecFPr ;
   private java.util.Date AV47HastaBarFecFPr ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV33fecha ;
   private java.util.Date GXv_date10[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14Procesar ;
   private boolean AV43Refrescar ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n606MaqDsc ;
   private boolean n166BarKgm ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean n620MaqTip ;
   private boolean n6432MaqPln ;
   private boolean n607MaqEst ;
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n252CliCod ;
   private boolean n219BarTotAgr ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV22AplicarMaqCDsc ;
   private String A13734MaqCDsc ;
   private com.genexus.webpanels.GXWebGrid GridmaquinaContainer ;
   private com.genexus.webpanels.GXWebGrid GridhdrContainer ;
   private com.genexus.webpanels.GXWebRow GridmaquinaRow ;
   private com.genexus.webpanels.GXWebRow GridhdrRow ;
   private com.genexus.webpanels.GXWebColumn GridmaquinaColumn ;
   private com.genexus.webpanels.GXWebColumn GridhdrColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private ICheckbox chkBarAgrEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00MY2_A620MaqTip ;
   private boolean[] H00MY2_n620MaqTip ;
   private byte[] H00MY2_A6432MaqPln ;
   private boolean[] H00MY2_n6432MaqPln ;
   private String[] H00MY2_A607MaqEst ;
   private boolean[] H00MY2_n607MaqEst ;
   private String[] H00MY2_A396EmprCod ;
   private String[] H00MY2_A606MaqDsc ;
   private boolean[] H00MY2_n606MaqDsc ;
   private String[] H00MY2_A602MaqCod ;
   private String[] H00MY3_A620MaqTip ;
   private boolean[] H00MY3_n620MaqTip ;
   private byte[] H00MY3_A6432MaqPln ;
   private boolean[] H00MY3_n6432MaqPln ;
   private String[] H00MY3_A607MaqEst ;
   private boolean[] H00MY3_n607MaqEst ;
   private String[] H00MY3_A396EmprCod ;
   private String[] H00MY3_A606MaqDsc ;
   private boolean[] H00MY3_n606MaqDsc ;
   private String[] H00MY3_A602MaqCod ;
   private String[] H00MY6_A396EmprCod ;
   private String[] H00MY6_A4812BarEncCli ;
   private int[] H00MY6_A252CliCod ;
   private boolean[] H00MY6_n252CliCod ;
   private String[] H00MY6_A180BarMaqCod ;
   private String[] H00MY6_A130BarCodPar ;
   private byte[] H00MY6_A132BarCodReo ;
   private int[] H00MY6_A129BarCod ;
   private byte[] H00MY6_A213BarSit ;
   private java.util.Date[] H00MY6_A158BarFecFpr ;
   private java.util.Date[] H00MY6_A159BarFecGen ;
   private String[] H00MY6_A1234BarNomCli ;
   private String[] H00MY6_A135BarColNom ;
   private String[] H00MY6_A1652BarSerDsc ;
   private String[] H00MY6_A212BarSer ;
   private String[] H00MY6_A279CliNom ;
   private String[] H00MY6_A120BarAgrEst ;
   private java.math.BigDecimal[] H00MY6_A166BarKgm ;
   private boolean[] H00MY6_n166BarKgm ;
   private java.math.BigDecimal[] H00MY6_A219BarTotAgr ;
   private boolean[] H00MY6_n219BarTotAgr ;
   private long[] H00MY9_AGRIDHDR_nRecordCount ;
   private String[] H00MY10_A758ProCod ;
   private String[] H00MY10_A150BarFacTin ;
   private byte[] H00MY10_A153BarFasEst ;
   private String[] H00MY10_A130BarCodPar ;
   private byte[] H00MY10_A132BarCodReo ;
   private int[] H00MY10_A129BarCod ;
   private String[] H00MY10_A396EmprCod ;
   private short[] H00MY10_A194BarOrdLin ;
   private GXSimpleCollection<String> AV44Objeto ;
   private GXSimpleCollection<String> AV42ObjetoRefrescar ;
}

final  class wcprogramarhdrdrop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00MY6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV46FiltroCliCod ,
                                          java.util.Date AV47HastaBarFecFPr ,
                                          java.util.Date AV45DesdeBarFecFPr ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A180BarMaqCod ,
                                          int A129BarCod ,
                                          int AV48BarcodIN ,
                                          byte A132BarCodReo ,
                                          byte AV49BarcodreoIn ,
                                          String A130BarCodPar ,
                                          String AV50BarcodparIN ,
                                          String A4812BarEncCli ,
                                          String AV51BarEnccliIn ,
                                          String A135BarColNom ,
                                          String AV52BarColNomIn ,
                                          String AV10EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[14];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarEncCli, T1.CliCod, T1.BarMaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, T1.BarFecFpr, T1.BarFecGen, T1.BarNomCli, T1.BarColNom," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarAgrEst, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP" ;
      scmdbuf += " BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(( T1.BarSit < 4 and (rtrim(T1.BarMaqCod) IS NULL AND NOT(T1.BarMaqCod IS NULL))) or ( ( T1.BarSit > 4 and T1.BarSit < 6)))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarEncCli like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarColNom like ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV46FiltroCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47HastaBarFecFPr)) && (( GXutil.resetTime(AV47HastaBarFecFPr).after( GXutil.resetTime( AV45DesdeBarFecFPr )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV47HastaBarFecFPr), GXutil.resetTime(AV45DesdeBarFecFPr)) )) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarFecGen, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H00MY9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV46FiltroCliCod ,
                                          java.util.Date AV47HastaBarFecFPr ,
                                          java.util.Date AV45DesdeBarFecFPr ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          String A180BarMaqCod ,
                                          int A129BarCod ,
                                          int AV48BarcodIN ,
                                          byte A132BarCodReo ,
                                          byte AV49BarcodreoIn ,
                                          String A130BarCodPar ,
                                          String AV50BarcodparIN ,
                                          String A4812BarEncCli ,
                                          String AV51BarEnccliIn ,
                                          String A135BarColNom ,
                                          String AV52BarColNomIn ,
                                          String AV10EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[14];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(( T1.BarSit < 4 and (rtrim(T1.BarMaqCod) IS NULL AND NOT(T1.BarMaqCod IS NULL))) or ( ( T1.BarSit > 4 and T1.BarSit < 6)))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarEncCli like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarColNom like ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV46FiltroCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV47HastaBarFecFPr)) && (( GXutil.resetTime(AV47HastaBarFecFPr).after( GXutil.resetTime( AV45DesdeBarFecFPr )) ) || ( GXutil.dateCompare(GXutil.resetTime(AV47HastaBarFecFPr), GXutil.resetTime(AV45DesdeBarFecFPr)) )) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_H00MY6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
            case 3 :
                  return conditional_H00MY9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00MY2", "SELECT /*+ FIRST_ROWS(6) */ MaqTip, MaqPln, MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod like ?) AND (MaqEst = 'A') AND (MaqPln = 1) AND (MaqTip = 'E') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MY3", "SELECT /*+ FIRST_ROWS(6) */ MaqTip, MaqPln, MaqEst, EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod like ?) AND (MaqEst = 'A') AND (MaqPln = 1) AND (MaqTip = 'E') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MY6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,6, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MY9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00MY10", "SELECT * FROM (SELECT ProCod, BarFacTin, BarFasEst, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst < 2) AND (BarFacTin = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((String[]) buf[7])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((String[]) buf[15])[0] = rslt.getString(15, 30);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[19]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

